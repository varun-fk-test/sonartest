@Library('jenkins-shared-library') _


stage('Sonar Code Analysis'){
  sonarCodeAnalysisMaven(
    service: "$SERVICE",
    sonarprojectkey: "$SONARPROJECTKEY",
    sonarhosturl: "$SONARHOSTURL",
    sonarlogin: "$SONARLOGIN",
    giturl: "$GITURL",
    branch: "$GITBRANCH"
  )
}
