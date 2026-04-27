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
                bat 'java -cp target/devops-project-1.0-SNAPSHOT.jar com.example.App'
            }
        }
    }
}
