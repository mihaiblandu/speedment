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
            sh 'ls -la'
            sh 'sh ./shell.sh'
            sh 'sh ./remove.sh'
          }
        }

      }
    }

    stage('Final stage') {
      steps {
        echo 'All tests are done.'
      }
    }

  }
  triggers {
    pollSCM('* * * * *')
  }
}