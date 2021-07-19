@Library('jenkins-shared-library') _


stage('Sonar Code Analysis'){
  sonarCodeAnalysisTesting(
    service: "$SERVICE",
    giturl: "$GITURL",
    branch: "$GITBRANCH"
  )
}
