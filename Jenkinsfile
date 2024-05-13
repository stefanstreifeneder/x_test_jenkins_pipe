pipeline {
    agent any
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
