pipeline {
  agent any
  tools { 
        maven 'mvn' 
    }

  stages
  {
    stage('Build')
    {
      steps
      {
        //checkout source code from repository
        echo 'hello world'

        //build application using maven
        bat 'mvn clean'
      }
    }

    stage('Test')
    {
      steps
      {
        //execute demo test cases
        bat 'mvn test'

        //check if any test failed
        
      }
    }
    stage('Cleanup')
    {
      steps
      {
        cleanWs()
  }
}
      
