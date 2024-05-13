pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                withMaven {
                  sh '$JAVA_HOME/bin/java -version'
                    sh '$MAVEN_HOME/bin/mvn -install'
                } 
            }
        }
    }
}
