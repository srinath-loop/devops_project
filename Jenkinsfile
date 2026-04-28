pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                bat 'echo Building project...'
                bat 'mvn clean install'
            }
        }

        stage('Run') {
            steps {
                bat 'echo ========================'
                bat 'echo Running Calculator App'
                bat 'echo ========================'
                
                // Direct execution (guaranteed output)
                bat 'javac -d . src\\main\\java\\com\\example\\App.java'
                bat 'java com.example.App'
            }
        }
    }
}
