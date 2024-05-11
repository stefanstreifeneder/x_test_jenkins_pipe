pipeline {
    agent any
    stages {
        
        tools { 
            maven 'maven 3.9.6'
        }
        
        stage('Build') { 

            withMaven {
                steps {
                      sh '$M2_HOME/bin/mvn clean install' 
                      sh '$JAVA_HOME/bin/java -version'
                }
            }
        }
    }
}
