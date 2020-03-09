pipeline {
  agent any
  stages {
    stage('Initialize') {
      steps {
        git(url: 'https://github.com/veeraprasad512/spring-practice', branch: 'master', changelog: true, poll: true)
        echo 'Pull latest changes from GITHUB'
      }
    }

  }
}