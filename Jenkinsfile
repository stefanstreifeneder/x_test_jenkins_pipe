pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                
        git url: 'https://github.com/cyrille-leclerc/multi-module-maven-project'
                withMaven {
                  sh '$JAVA_HOME/bin/java -version'
                    sh './mvnw -v'
                } 
            }
        }
    }
}
