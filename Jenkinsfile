pipeline {
    agent{
        tools{
            maven "maven:3.9.6-jdk-17"
        }
    }

    stages{
        stage("Build"){
            steps{
                sh "mvn -version"
                sh "mvn clean install"
            }
        }
    }
    
}

