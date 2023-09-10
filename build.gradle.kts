plugins {
    id("java")
}

group = "com.infinity"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.testng:testng:7.8.0")


}


tasks.test {
    useTestNG()
}