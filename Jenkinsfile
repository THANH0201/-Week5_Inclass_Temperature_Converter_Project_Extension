pipeline {
    agent any

    // stages {
    //     stage('Checkout') {
    //         steps {
    //             git 'https://github.com/THANH0201/-Week5_Inclass_Temperature_Converter_Project_Extension.git'

    //         }
    //     }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Code Coverage') {
            steps {
                bat 'mvn jacoco:report'
            }
        }

        stage('Publish Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }

        stage('Publish Coverage Report') {
            steps {
                jacoco()
            }
        }
    }
}
