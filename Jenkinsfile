pipeline {
    agent any
    environment {
        // Adjust this to your installed Java/Maven paths if needed
        JAVA_HOME = 'C:\\Program Files\\Java\\jdk-17'
        PATH = "${env.JAVA_HOME}\\bin;${env.PATH}"
    }
    tools {
        maven 'maven-1' // Define Maven in Jenkins Global Tools
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/sakshivirhajobsearch/springboot-gym-html-app.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Run Spring Boot App') {
            steps {
                bat 'java -jar target\\springboot-gym-html-app-1.0.0.jar'
            }
        }
    }
    post {
        failure {
            echo '❌ Build failed!'
        }
        success {
            echo '✅ Spring Boot app is running locally!'
        }
    }
}
