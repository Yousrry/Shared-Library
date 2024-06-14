#!/usr/bin/env groovy

def call(){ 
	withSonarQubeEnv(credentialsId: 'Sonarqube',installationName: 'Sonarqube' ) { 
	
		sh"./gradlew sonarqube  -Dsonar.projectKey=SpringApp  -Dsonar.host.url=http://18.209.212.44:9000"
	 
	}
}
