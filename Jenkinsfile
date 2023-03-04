pipeline {
    agent any

    tools{
        maven "MAVEN3"
        jdk "JDK"
    }
    stages {
        stage('Clone Git Repository') {
            steps {
                git 'https://github.com/vishnusrt911/Maven_Project.git'
            }
        }
        stage('Build Spring Maven Project') {
            steps {
                sh 'mvn clean compile'
            }
        }
    }
}
