#!/usr/bin/env groovy

def call(){ 
	withSonarQubeEnv(credentialsId: 'Sonarqube',installationName: 'Sonarqube' ) { 
	
		sh"./gradlew sonarqube  -Dsonar.projectKey=SpringApp  -Dsonar.host.url=http://35.174.205.184:9000 -Dsonar.login=ab357f8cf0bcafdec79fbdb02743c5a7cd1ffa2c "
	 
	}
}
