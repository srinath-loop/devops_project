pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Run') {
            steps {
                bat 'java -jar target/devops-project-1.0-SNAPSHOT.jar'
            }
        }
    }
}
