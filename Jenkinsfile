pipeline {
    agent any
    tools { 
        maven 'maven 3.9.6'
    }
    stages {
        stage('Build') { 
            steps {
                git url: 'https://github.com/cyrille-leclerc/multi-module-maven-project'
                withMaven {
                  sh "mvn clean verify"
                } 
            }
        }
    }
}

