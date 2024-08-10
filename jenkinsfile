pipeline {
    agent any

    stages {
        stage('Checkout') {
	    steps {
		git branch: 'main', url: 'https://github.com/DevandMlOps/proyecto_demo_simple.git'
	    }
	}

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('SonarQube Analysis') {
	    steps {
		withSonarQubeEnv('sonarqube') {
		    sh '''
		        mvn sonar:sonar \
		          -Dsonar.projectKey=proyecto_demo_simple \
		          -Dsonar.projectName='proyecto_demo_simple' \
		          -Dsonar.projectVersion=1.0 \
		          -Dsonar.sources=src/main/java/ \
		          -Dsonar.java.binaries=target/classes \
		          -Dsonar.host.url=http://sonarqube:9000
		    '''
		}
	    }
	}

        stage('Quality Gate') {
            steps {
                timeout(time: 2, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
    }
}
