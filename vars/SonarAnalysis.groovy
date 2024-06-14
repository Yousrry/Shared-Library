#!/usr/bin/env groovy

def call(){ 
	withSonarQubeEnv(credentialsId: 'Sonarqube',installationName: 'Sonarqube' ) { 
	
		sh"./gradlew sonarqube  -Dsonar.projectKey=SpringApp  -Dsonar.host.url=http://http://44.192.105.71:9000"
	 
	}
}
