pipeline {
    agent any
    tools { 
        maven 'maven 3.9.6'
    }
    stages {
        stage('Build') { 
            steps {
                withMaven {
                  sh '$JAVA_HOME/bin/java -version'
                    sh 'mvn -v'
                } 
            }
        }
    }
}
