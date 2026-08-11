plugins {
    application
}

group = "ads.poo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.run.configure {
    standardInput = System.`in`
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass = "ads.poo.App"
}