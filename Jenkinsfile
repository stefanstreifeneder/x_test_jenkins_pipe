pipeline {
    agent any
    tools { 
        maven 'maven 3.9.6'
        java 'jdk_1.8.0_152'
    }
    stages {
        stage('Build') { 
            steps {
                withMaven {
                  sh "mvn clean verify"
                } 
            }
        }
    }
}
