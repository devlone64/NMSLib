@file:Suppress("SpellCheckingInspection")

import org.apache.tools.ant.filters.ReplaceTokens

plugins {
    id("java")
    id("com.github.johnrengelman.shadow").version("7.1.2")
}

group = "dev.lone64.NMSLib"
version = "1.0.0"

dependencies {
    implementation(project(":modules:bukkit:common"))
    implementation(project(":modules:bukkit:nms:common"))

    implementation(project(":modules:bukkit:nms:version:v1_12_R1"))

    implementation(project(":modules:bukkit:nms:version:v1_13_R1"))
    implementation(project(":modules:bukkit:nms:version:v1_13_R2"))

    implementation(project(":modules:bukkit:nms:version:v1_14_R1"))
    implementation(project(":modules:bukkit:nms:version:v1_15_R1"))

    implementation(project(":modules:bukkit:nms:version:v1_16_R1"))
    implementation(project(":modules:bukkit:nms:version:v1_16_R2"))
    implementation(project(":modules:bukkit:nms:version:v1_16_R3"))

    implementation(project(":modules:bukkit:nms:version:v1_17_R1"))

    implementation(project(":modules:bukkit:nms:version:v1_18_R1"))
    implementation(project(":modules:bukkit:nms:version:v1_18_R2"))

    implementation(project(":modules:bukkit:nms:version:v1_19_R1"))
    implementation(project(":modules:bukkit:nms:version:v1_19_R2"))
    implementation(project(":modules:bukkit:nms:version:v1_19_R3"))

    implementation(project(":modules:bukkit:nms:version:v1_20_R1"))
    implementation(project(":modules:bukkit:nms:version:v1_20_R2"))
    implementation(project(":modules:bukkit:nms:version:v1_20_R3"))
    implementation(project(":modules:bukkit:nms:version:v1_20_R4"))

    implementation(project(":modules:bukkit:nms:version:v1_21_R1"))
    implementation(project(":modules:bukkit:nms:version:v1_21_R2"))
    implementation(project(":modules:bukkit:nms:version:v1_21_R3"))
    implementation(project(":modules:bukkit:nms:version:v1_21_R4"))

    compileOnly("org.spigotmc:spigot-api:1.21.5-R0.1-SNAPSHOT")
}

tasks {
    shadowJar {
        archiveFileName.set("NMSLib-${version}.jar")
    }

    withType<ProcessResources> {
        from("src/main/resources") {
            include("plugin.yml")
            filter<ReplaceTokens>("tokens" to mapOf("version" to project.version))
            duplicatesStrategy = DuplicatesStrategy.INCLUDE
        }
    }
}