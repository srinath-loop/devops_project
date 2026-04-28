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
                bat 'mvn exec:java -Dexec.mainClass="com.example.App"'
            }
        }
    }
}
