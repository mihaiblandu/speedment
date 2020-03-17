pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvnw clean install'
        archiveArtifacts(artifacts: '**/target/*.jar', fingerprint: true)
      }
    }

    stage('Deploy') {
      steps {
        sh 'ls target/*.jar'
        echo 'Deploying...'
      }
    }

  }
  triggers {
    pollSCM('* * * * *')
  }
}