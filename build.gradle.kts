plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    implementation("net.dv8tion:JDA:4.2.0_214")
    testCompile("junit", "junit", "4.12")
}
