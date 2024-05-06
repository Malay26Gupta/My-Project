pipeline {
  agent any

  stages
  {
    stage('Build')
    {
      steps
      {
        //checkout source code from repository
        checkout scm

        //build application using maven
        sh 'mvn clean package'
      }
    }

    stage('Test')
    {
      steps
      {
        //execute demo test cases
        sh 'mvn test'

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
      
