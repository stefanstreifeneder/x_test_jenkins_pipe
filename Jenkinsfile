pipeline {
    agent any
    stages {
        
        tools { 
            maven 'maven 3.9.6'
        }
        
        stage('Build') { 

            withMaven {
                steps {
                      sh '$JAVA_HOME/bin/java -version'
                }
            }
        }
    }
}
