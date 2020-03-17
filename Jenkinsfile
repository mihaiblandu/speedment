pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn install'
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