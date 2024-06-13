#!/usr/bin/env groovy

def call(){ 
	withSonarQubeEnv(credentialsId: 'Sonarqube',installationName: 'Sonarqube' ) { 
        	echo "Starting SonarQube Analysis..."
		sh 'chmod +x gradlew'
        	sh "./gradlew sonarqube --info" 
	}
}
