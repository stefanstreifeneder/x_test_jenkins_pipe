pipeline {
    agent any
    
    tools { 
            maven 'maven 3.9.6'
    }
    
    stages {
        stage('Build') { 

            withMaven {
                steps {
                      sh '$JAVA_HOME/bin/java -version'
                }
            }
        }
    }
}
