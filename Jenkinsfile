pipeline {
    agent any
    tools { 
        maven 'maven 3.9.6'
    }
    stages {
        stage('Build') { 
            steps {
                sh "mvn org.apache.maven.plugins:maven-compiler-plugin:3.9.6:compile"
            }
        }
    }
}

