pipeline {
    agent any
    tools { 
        maven 'maven 3.9.6'
    }
    stages {
        stage('Build') { 
            steps {
                withMaven(maven:'mvn',
            options: [artifactsPublisher(disabled: true), openTasksPublisher(disabled: true), junitPublisher(disabled: true)]) {
        sh "export PATH=/opt/jdk1.8.0_152/bin:$MVN_CMD_DIR:$PATH " +
            "&& mvn -s settings.xml -B install -Drevision=${params.CURRENT_VERSION}"
    }
            }
        }
    }
}
