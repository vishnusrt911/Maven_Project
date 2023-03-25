pipeline {
    agent any
    tools {
        maven "MAVEN3"
    }
    environment{
        DOCKEHUB=credentials('dockerhub')
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
                        bat '''
                        echo %dockerpassword% &
                        echo %dockerpassword% &
                        docker login -u %DOCKEHUB_USR% -p %DOCKEHUB_PSW%
                        '''
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
