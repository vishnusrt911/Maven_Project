pipeline {
    agent any

    tools{
        maven "MAVEN3"
    }
    stages {
        stage('Clone Git Repository') {
            steps {
                git branch: 'main' , url : 'https://github.com/vishnusrt911/Maven_Project.git' 
            }
        }
        stage('Build Spring Maven Project') {
            steps {
                sh 'mvn clean'
            }
        }
    }
}
