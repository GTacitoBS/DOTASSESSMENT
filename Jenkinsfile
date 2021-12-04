pipeline {
    agent any
    stages {
       stage ('Build') {
	     steps {
	        echo 'Building...'
            }
        }
        stage('Compile')  {
          steps {
            echo 'Compiling...'
	    javac StringUtil.java
            javac StringUtilTest.java
            }
        }
        stage('Test')  {
          steps {
            echo 'Testing...'
	    java StringUtilTest
            }
        }
        stage('Deploy') {
          steps {
            echo 'Deploying...'
            
            }
        }
    }
}
