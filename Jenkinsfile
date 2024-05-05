pipeline {
    agent any
    tools { 
        maven 'Maven 3.9.6' 
        jdk 'jdk17' 
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn package' 
            }
        }
    }
}

