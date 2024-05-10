pipeline {
    agent any
    tools { 
        maven 'maven 3.9.6'
    }
    stages {
        stage('Build') { 
            steps {
                withMaven {
                  sh '$M2_HOME=/opt/apache-maven-3.9.6/bin/ mvn -v'
                  sh '$JAVA_HOME/bin/java -version'
                } 
            }
        }
    }
}
