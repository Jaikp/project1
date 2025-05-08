pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git credentialsId: 'e0dc8e3c-8fc1-42d6-a910-847633447d6d', branch: 'develop', url: 'https://github.com/Jaikp/project1.git'
            }
        }
        stage('Build') {
            steps {
                sh './gradlew clean build'
            }
        }
        stage('Archive Artifact') {
            steps {
                archiveArtifacts artifacts: '**/build/libs/*.jar', fingerprint: true
            }
        }
    }
}
