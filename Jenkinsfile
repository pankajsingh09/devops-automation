pipeline{
    agent any
    tools{
        maven 'maven'
    }
    stages{
        stage('build'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/pankajsingh09/devops-automation']]])
                bat 'mvn clean install'
            }
        }
        stage('test'){
            steps{
                echo 'testing'
                bat 'mvn test'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t pankajsingh09/devops-integration .'
                }
            }
        }
        stage('push image to Docker Hub'){
            steps{
                script{
                    bat 'docker login -u pankajsingh09 -p Pankaj@263660'
                    bat 'docker push pankajsingh09/devops-integration'
                }
            }
        }
    }
}