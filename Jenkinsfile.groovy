#!/usr/bin/env groovy

pipeline{
  agent any
  stages {
    stage('RUN') {
      echo 'This stage will be executed first.'
    }
  }
}
