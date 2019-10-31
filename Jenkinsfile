pipeline{
  agent any
  stages {
    stage('RUN') {
      steps {
        echo 'This stage will be executed first run.'
      }
    }
    stage('Parallel Run') {
      when {
        branch 'master'
      }
      parallel {
        stage('Test 1') {
          steps {
            echo 'Test 1 Executing'
          }
        }
        stage('Test 2') {
          steps {
            echo 'Test 2 Executing'
          }
        }
        stage('Test 3') {
          steps {
            echo 'Test 3 Executing'
          }
        }
      }
    }
  }
}
