def kubectlDeleteService(String file) {
    sh "kubectl delete -f ${file}"
}
