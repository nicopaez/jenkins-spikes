job('Build') {
  logRotator {
    numToKeep(20)
  }
  steps {
    sh('echo "hola mundo"')
  }
}