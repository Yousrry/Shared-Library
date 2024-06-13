#!/usr/bin/env groovy

def call(){ 
	withSonarQubeEnv(credentialsId: 'Sonarqube',installationName: 'Sonarqube' ) { 
	
		sh" ./gradlew sonarqube ${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=SpringApp -Dsonar.host.url=http://35.174.205.184:9000  -Dsonar.login=sos"
	 
	}
}
