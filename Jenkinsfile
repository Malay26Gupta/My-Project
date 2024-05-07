pipeline {
  agent any

  stages
  {
    stage('Build')
    {
      steps
      {
        //checkout source code from repository
        echo 'hello'

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
        script
        {
          def testResult = junit testResults: ''
          if(testResult.failed > 0)
          {
            error "Tests failed"
          }
        }
      }
    }

    stage('Cleanup')
    {
      steps
      {
        //clean up temporary files or directories
        sh 'rm -rf target'
      }
    }
  }
}
      
