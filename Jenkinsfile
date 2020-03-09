pipeline {
  agent any
  stages {
    stage('Compile') {
      steps {
        git(url: 'https://github.com/veeraprasad512/spring-practice', branch: 'master', changelog: true, poll: true)
      }
    }

  }
}