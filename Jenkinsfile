pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh './mvnw clean install'
        archiveArtifacts(artifacts: '**/target/*.jar', fingerprint: true)
      }
    }

    stage('Deploy') {
      parallel {
        stage('Deploy') {
          steps {
            sh 'ls target/*.jar'
            echo 'Deploying...'
          }
        }

        stage('Docker') {
          steps {
            sh '''docker-compose up -d
'''
          }
        }

      }
    }

  }
  triggers {
    pollSCM('* * * * *')
  }
}