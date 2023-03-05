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
                echo 'Test script'
                sh 'pwd'
                sh 'ls'
                cd 'Vishnu_Rajendran_Pillai'
                sh 'mvn clean compile'
            }
        }
    }
}
