node {
    def WORKSPACE = "/var/lib/jenkins/workspace/springboot"
    def dockerImageTag = "springboot${env.BUILD_NUMBER}"

    try{
//          notifyBuild('STARTED')
         stage('Clone Repo') {
            // for display purposes
            // Get some code from a GitHub repository
            git url: 'https://github.com/Sonigupta12/Java_Assignment.git',
                credentialsId: 'Sonigupta12',
                branch: 'main'
         }
          stage('Build docker') {
                 dockerImage = docker.build("springboot:${env.BUILD_NUMBER}")
          }

          stage('Deploy docker'){
                  echo "Docker Image Tag Name: ${dockerImageTag}"
                  sh "docker stop springboot || true && docker rm springboot || true"
                  sh "docker run --name springboot -d -p 8083:8080 springboot:${env.BUILD_NUMBER}"
          }
    }catch(e){
//         currentBuild.result = "FAILED"
        throw e
    }finally{
//         notifyBuild(currentBuild.result)
    }
}

def notifyBuild(String buildStatus = 'STARTED'){

// build status of null means successful
  buildStatus =  buildStatus ?: 'SUCCESSFUL'
  // Default values
  def colorName = 'RED'
  def colorCode = '#FF0000'
  def now = new Date()
  // message
  def subject = "${buildStatus}, Job: ${env.JOB_NAME} FRONTEND - Deployment Sequence: [${env.BUILD_NUMBER}] "
  def summary = "${subject} - Check On: (${env.BUILD_URL}) - Time: ${now}"
  def subject_email = "Spring boot Deployment"
  def details = """<p>${buildStatus} JOB </p>
    <p>Job: ${env.JOB_NAME} - Deployment Sequence: [${env.BUILD_NUMBER}] - Time: ${now}</p>
    <p>Check console output at "<a href="${env.BUILD_URL}">${env.JOB_NAME}</a>"</p>"""


  // Email notification
    emailext (

       )
}
