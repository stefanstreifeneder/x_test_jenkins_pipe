pipeline {
    agent any
    
    tools { 
        maven 'maven 3.9.6'
        def mvnTool = tool 'Maven_3_9_6'
    }
    stages {
        stage('Build') { 
            steps {
                withMaven {
                  sh "$M2_HOME/bin/mvn clean install" 
                  sh '$JAVA_HOME/bin/java -version'
                } 
            }
        }
    }
}
