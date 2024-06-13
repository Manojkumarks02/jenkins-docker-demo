pipeline {
    agent any

    tools {
        maven 'maven'
    }

    stages {
        stage('Build') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Manojkumarks02/jenkins-docker-demo']])
                bat 'mvn clean install'
                }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat ' docker build -t manojkumarks02/jenkins-devops-integration .'
                }
            }
        }
        stage('push docker image to docker hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhubpwdmanoj', variable: 'dockerhubpwdmanoj')]){
                    bat 'docker login -u manojkumarks02 -p ${dockerhubpwdmanoj}'
}
                    bat 'docker push manojkumarks02/jenkins-devops-integration'

                }
            }
        }
    }
}