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
                
                // Run and capture output
                bat 'mvn exec:java -Dexec.mainClass="com.example.App" > output.txt'
                
                // Print output clearly
                bat 'type output.txt'
            }
        }
    }
}
