pipeline {
    agent any
    tools{
        maven 'maven_3_10_0'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/anilshetty11408/Docker-Devops-Integration-Jenkins']])
                bat 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t anil1408/docker-devops-integration-jenkins .'
                }
            }
        }
        stage('Push image to Hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'anil1408', variable: 'dockerhubpwd')]) {
                    bat 'echo %dockerhubpwd%| docker login -u anil1408 --password-stdin'
                    }
                    bat 'docker push anil1408/docker-devops-integration-jenkins'
                }
            }
        }
    }
}