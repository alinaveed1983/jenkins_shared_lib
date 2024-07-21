def kubectlApply(String file) {
    sh "kubectl apply -f ${file}"
}
