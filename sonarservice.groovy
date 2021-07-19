@Library('jenkins-shared-library') _


stage('Sonar Code Analysis'){
  sonarCodeAnalysisTesting(
    service: "$SERVICE",
    sonarprojectkey: "$SONARPROJECTKEY",
    sonarhosturl: "$SONARHOSTURL",
    sonarlogin: "$SONARLOGIN",
    giturl: "$GITURL",
    branch: "$GITBRANCH"
  )
}
