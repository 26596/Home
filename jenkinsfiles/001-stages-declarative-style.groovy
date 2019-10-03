T##########################This script is managed by CBRE DevOps Team##########################
pipeline {
  agent any
  stages {

    stage('Stage 1') {
      steps {
        script {
          echo 'Stage 1'
        }
      }
    }

    stage('Stage 2') {
      steps {
        script {
          echo 'Stage 2'
        }
      }
    }

  }
}
