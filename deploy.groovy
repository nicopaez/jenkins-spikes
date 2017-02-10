job('Deploy') {
  logRotator {
    numToKeep(20)
  }
  steps {
    shell('echo "hola mundo"')
  }
}