pipeline {
    agent any
    tools {
        maven "MAVEN3"
    }
    environment{
        DOCKEHUB_PWD=credentials('dockerpassword')
    }
 stages {
          stage("Check out") {
               steps {
                    echo "current build_id is ${env.BUILD_ID}"
                    git branch: 'main', url: 'https://github.com/vishnusrt911/Maven_Project.git'
               }
          }
          
          stage("Build maven project") {
               steps {
                    bat "mvn compile"
               }
          }
     
         stage ("Unit test") {
             steps{
                 bat "mvn test"
             }
         }
          
          stage("Docker build") {
               steps {
                        script {
                                 bat "docker build -t vishnursrt/mavenproject4docker:${env.BUILD_ID} ."
                               }
                       }
          }
          
          stage("Docker login") {
               steps {
                    script {
                        bat 'docker login -u %dockerhub_USR% -p %dockerhub_PSW%'
                    }
               }
               }
               
          
          stage("Docker push") {
               steps {
                   script {
                            bat "docker push vishnursrt/mavenproject4docker:${env.BUILD_ID}"
                         }
               }
          }
        }
}
