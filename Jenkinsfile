pipeline {
    agent any
    tools { 
        maven 'maven 3.9.6'
    }
    stages {
        stage('Build') { 
            steps {
                withMaven {
                  sh '/opt/apache-maven-3.9.6/bin/mvn'
                  sh '$JAVA_HOME/bin/java -version'
                } 
            }
        }
    }
}
