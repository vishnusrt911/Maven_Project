pipeline {
    agent any

    tools{
        maven "MAVEN3"
    }
    stages {
        stage('Clone Git Repository') {
            steps {
                git 'https://github.com/vishnusrt911/Maven_Project.git'
            }
        }
        stage('Build Spring Maven Project') {
            steps {
                sh 'pwd'
                sh 'ls'
                sh 'mvn clean compile'
            }
        }
    }
}
