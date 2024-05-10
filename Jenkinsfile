pipeline {
    agent{
        docker{
            image "maven:3.9.6-jdk-17"
            label "docker"
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

    post{
        always{
            cleanWs()}
    }
    
}

