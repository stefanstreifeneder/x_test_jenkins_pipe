pipeline {
    agent any
    tools { 
        maven 'maven 3.9.6'
        jdk 'jdk-17'
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
