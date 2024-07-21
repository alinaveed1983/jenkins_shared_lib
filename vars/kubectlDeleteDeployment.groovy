def kubectlDeleteDeployment(String file) {
    sh "kubectl delete -f ${file}"
}
