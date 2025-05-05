plugins {
    id("java")
    id("maven-publish")
}

group = "dev.lone64.NMSLib.common"
version = "1.0.0"

dependencies {
    compileOnly(project(":modules:bukkit:nms:common"))

    compileOnly(project(":modules:bukkit:nms:version:v1_12_R1"))

    compileOnly(project(":modules:bukkit:nms:version:v1_13_R1"))
    compileOnly(project(":modules:bukkit:nms:version:v1_13_R2"))

    compileOnly(project(":modules:bukkit:nms:version:v1_14_R1"))
    compileOnly(project(":modules:bukkit:nms:version:v1_15_R1"))

    compileOnly(project(":modules:bukkit:nms:version:v1_16_R1"))
    compileOnly(project(":modules:bukkit:nms:version:v1_16_R2"))
    compileOnly(project(":modules:bukkit:nms:version:v1_16_R3"))

    compileOnly(project(":modules:bukkit:nms:version:v1_17_R1"))

    compileOnly(project(":modules:bukkit:nms:version:v1_18_R1"))
    compileOnly(project(":modules:bukkit:nms:version:v1_18_R2"))

    compileOnly(project(":modules:bukkit:nms:version:v1_19_R1"))
    compileOnly(project(":modules:bukkit:nms:version:v1_19_R2"))
    compileOnly(project(":modules:bukkit:nms:version:v1_19_R3"))

    compileOnly(project(":modules:bukkit:nms:version:v1_20_R1"))
    compileOnly(project(":modules:bukkit:nms:version:v1_20_R2"))
    compileOnly(project(":modules:bukkit:nms:version:v1_20_R3"))
    compileOnly(project(":modules:bukkit:nms:version:v1_20_R4"))

    compileOnly(project(":modules:bukkit:nms:version:v1_21_R1"))
    compileOnly(project(":modules:bukkit:nms:version:v1_21_R2"))
    compileOnly(project(":modules:bukkit:nms:version:v1_21_R3"))
    compileOnly(project(":modules:bukkit:nms:version:v1_21_R4"))

    compileOnly("org.spigotmc:spigot-api:1.21.5-R0.1-SNAPSHOT")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "dev.lone64"
            artifactId = "NMSLib"
            from(components["java"])
        }
    }

    repositories {
        maven("https://repo.repsy.io/mvn/lone64/everything/") {
            credentials {
                username = properties["mavenUsername"] as String
                password = properties["mavenPassword"] as String
            }
        }
    }
}