job('Build') {
  logRotator {
    numToKeep(20)
  }
  steps {
    shell('echo "hola mundo"')
  }
  publishers {
    downstream('Release')
  }
}