#!/usr/bin/env groovy

//OpenShiftCredentialsID can be credentials of service account token or KubeConfig file 
def call(String OpenShiftCredentialsID, String openshiftClusterurl, String openshiftProject, String imageName) {
    
    // Update deployment.yaml with new Docker Hub image
    sh "sed -i 's|image:.*|image: ${imageName}:${BUILD_NUMBER}|g' deployment.yml"

    // login to OpenShift Cluster via cluster url & service account token
    withCredentials([string(credentialsId: "${OpenShiftCredentialsID}", usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
            sh "oc login --server=${openshiftClusterurl} --username=${USERNAME} --password=${PASSWORD}"
            sh "oc apply -f ."
    }

}

