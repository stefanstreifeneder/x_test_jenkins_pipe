pipeline {
    agent any
    
    tools { 
        maven 'maven 3.9.6'
    }
    stages {
        
        
        stage('Build') { 

            def mvnTool = tool 'Maven_3_9_6'
            steps {
                withMaven {
                  sh "$M2_HOME/bin/mvn clean install" 
                  sh '$JAVA_HOME/bin/java -version'
                } 
            }
        }
    }
}
