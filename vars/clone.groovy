def clone(String url, String branchName) {
    git url: "${url}", branch: "${branchName}"
}