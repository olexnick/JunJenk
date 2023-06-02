

 {

    agent any
    stages {

        stage('Checkout Codebase'){
            steps{
                cleanWs()
                checkout scm: [$class: 'GitSCM', branches: [[name: '*/main']],userRemoteConfigs:
                [[credentialsId: 'mac_pro_16', url: 'https://github.com/olexnick/JunJenk.git']]]
            }
        }
        stage('Build'){
            steps{
                sh 'mkdir lib'
                sh 'cd lib/ ; wget https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.7.0/junit-platform-console-standalone-1.7.0-all.jar'
                sh 'cd src ; javac -cp "../lib/junit-platform-console-standalone-1.7.0-all.jar" Suite.General.GeneralSuiteTest.java'
            }
        }
        не срабатывает на последнем шаг
        1. sh 'mkdir -p build'
        2. sh 'javac -d build_directory src/*.java'
        3. sh 'java -cp path/to/junit-platform-engine.jar:build org.junit.platform.console.ConsoleLauncher \
                    --scan-classpath --details-tree'
                    3. sh 'java -cp build/junit-platform-engine-1.9.3.jar:build_directory org.junit.platform.console.ConsoleLauncher --scan-classpath --details-tree'



//         java -jar junit-platform-console-standalone-1.10.0-M1.jar -cp build/classes/java/test --scan-classpath работает
java -jar junit-platform-console-standalone-1.5.2.jar -cp target/test-classes --scan-classpath работает тесты видит

java -jar junit-platform-console-standalone-1.10.0-M1.jar -cp build/classes/java/test --scan-classpath
java -jar junit-platform-console-standalone-1.10.0-M1.jar --classpath build/classes/java/test --scan-classpath
javac -cp "../lib/junit-platform-console-standalone-1.10.0-M1.jar" Suite.General.GeneralSuiteTest.java

java -jar junit-platform-console-standalone-1.9.3.jar -cp build/classes/java/test --scan-classpath
java -jar junit-platform-console-standalone-1.7.0.jar -cp build/classes/java/test --scan-classpath

javac -cp "../lib/junit-platform-console-standalone-1.7.0.jar" Suite.General.GeneralSuiteTest.java
javac -cp "../lib/junit-platform-console-standalone-1.7.0.jar" Suite.Page2Test.java
java -jar junit-platform-console-standalone-1.10.0-M1.jar -cp 'build/classes/java/test' --select-class Suite.General.GeneralSuiteTest

java -jar junit-platform-console-standalone-1.9.3.jar -cp 'build/classes/java/test' --select-class java.Suite.Page2Test.java



java -jar junit-platform-console-standalone-1.10.0-M1.jar -cp 'build/classes/java/test' --select-class Suite.Page2Test.java
java -jar junit-platform-engine-1.9.3.jar -cp 'build/classes/java/test' --select-class Suite.Page2Test.java

javac -cp "../lib/junit-platform-console-standalone-1.7.0.jar" Suite.OldTestRunner_newTest.java
java -cp junit-platform-engine-1.9.3.jar -cp 'build/classes/java/test' --select-class Suite.OldTestRunner_newTest.java






java -jar junit-platform-suite-commons-1.10.0-M1.jar;junit-platform-suite-api-1.10.0-M1.jar -cp target/test-classes --scan-classpath

 java  --class-path .; ../JunJenk/junit-platform-console-standalone-1.10.0-M1.jar;junit-platform-suite-api-1.10.0-M1.jar;junit-platform-suite-engine-1.10.0-M1.jar;target/test-classes/;junit-platform-console-standalone-1.10.0-M1.jar org.junit.platform.console.ConsoleLauncher --select-class Suite.General.GeneralSuiteTest
bash java  --class-path .;junit-platform-suite-commons-1.10.0-M1.jar;target/test-classes/;target/lib/junit-platform-console-standalone-1.10.0-M1.jar org.junit.platform.console.ConsoleLauncher --select-class Suite.General.GeneralSuiteTest

java -cp "junit-platform-console-standalone-1.10.0-M1.jar;lib/*" my.package.MainClass

bash java --cp \
      "junit-platform-console-standalone-1.10.0-M1.jar;lib/*;" src.lib\
      "junit-platform-suite-api-1.10.0-M1.jar;lib/*;" src.lib\
      "junit-platform-suite-commons-1.10.0-M1.jar;lib/*;" src.lib\
      "junit-platform-suite-engine-1.10.0-M1.jar;lib/*" src.lib\
      target/test-classes; \
      target/classes # main classes?
      . # current directory?
 org.junit.platform.console.ConsoleLauncher
 --select-class Suite.General.GeneralSuiteTest



java
 --class-path target/junit-platform-console-standalone-1.8.2.jar;target/lib/junit-platform-suite-engine-1.8.2.jar;target/test-classes;.
 org.junit.platform.console.ConsoleLauncher
 --select-class demo.TestSuite


java  --class-path junit-platform-suite-commons-1.10.0-M1.jar; junit-platform-suite-api-1.10.0-M1.jar;
junit-platform-suite-engine-1.10.0-M1.jar;
junit-platform-console-standalone-1.10.0-M1.jar;
org.junit.platform.console.ConsoleLauncher --select-class Suite.General.GeneralSuiteTest

bush java --class-path .; junit-platform-suite-commons-1.10.0-M1.jar;junit-platform-suite-api-1.8.2.jar;junit-platform-suite-engine-1.8.2.jar;junit-platform-console-standalone-1.8.2.jar org.junit.platform.console.ConsoleLauncher --select-class demo.TestSuite

javac -cp junit-platform-suite-engine-1.10.0-M1.jar Suite.OldTestRunner_newTest.java
javac -cp src/lib/junit-platform-suite-engine-1.10.0-M1.jar Suite.OldTestRunner_newTest.java



java -cp build/junit-platform-engine-1.9.3.jar:build_directory org.junit.platform.console.ConsoleLauncher --scan-classpath --details-tree



        stage('MyTest'){
            steps{
                sh 'cd src/ ; java -jar ../lib/junit-platform-console-standalone-1.7.0-all.jar -cp "." --select-class CarTest --reports-dir="reports"'
                junit 'src/reports/*-jupiter.xml'
            }
        }
        stage('Deploy'){
            steps{
                sh 'cd src/ ; java App' 
            }
        }
    }
}