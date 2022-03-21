package com.study.arch;

import com.study.arch.application.ApplicationConfiguration;
import com.study.arch.domain.DomainConfiguration;
import com.study.arch.infrastructure.InfrastructureConfiguration;
import com.study.arch.interfaces.InterfacesConfiguration;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.core.importer.ImportOption.Predefined.*;
import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

public class LayeredArchitectureTest {
    @Test
    void layeredTest() {
        final var imported = new ClassFileImporter()
                .withImportOption(DO_NOT_INCLUDE_TESTS)
                .importPackages("com.study.arch");

        final var rules =
                layeredArchitecture()
                        .layer("Interfaces").definedBy("..interfaces..")
                        .layer("Application").definedBy("..application..")
                        .layer("Domain").definedBy("..domain..")
                        .layer("Infrastructure").definedBy("..infrastructure..")

                        .whereLayer("Interfaces").mayNotBeAccessedByAnyLayer()
                        .ignoreDependency(ArchApplication.class, InterfacesConfiguration.class)

                        .whereLayer("Application").mayOnlyBeAccessedByLayers("Interfaces")
                        .ignoreDependency(ArchApplication.class, ApplicationConfiguration.class)

                        .whereLayer("Domain").mayOnlyBeAccessedByLayers("Application", "Infrastructure", "Interfaces")
                        .ignoreDependency(ArchApplication.class, DomainConfiguration.class)

                        .whereLayer("Infrastructure").mayNotBeAccessedByAnyLayer()
                        .ignoreDependency(ArchApplication.class, InfrastructureConfiguration.class)
                ;

        rules.check(imported);
    }
}
