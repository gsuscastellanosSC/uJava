def info_jenkins = "Job: ${env.JOB_NAME} with BuildNumber ${env.BUILD_NUMBER} \n${env.BUILD_URL}console";
pipeline {
    agent any
    triggers {
        githubPush();
      }
    environment {
        DISABLE_AUTH = 'true';
    }
     stages {
        stage('Cleaning Previous Build'){
            steps{
                slackSend color: '#FF5E33', message: "1. Cleaning Previous Build...\n${info_jenkins}";
                sh "ssh root@gsuscastelsc.com 'cd /github/guscastelsc/Frontend && mkdir dist && rm -rf dist && cd /github/guscastelsc && git pull' ";
            }    
        }
         stage('Build'){
            steps{
                slackSend color: '#FFD433', message: "2. Build...\n${info_jenkins}"
                sh "ssh root@gsuscastelsc.com 'docker exec gsuscastelsc.com bash -c \"cd /github/gsuscastelsc.com && ng build --prod\" ' ";
            }    
        }
        stage('Deploy'){
            steps{
                slackSend color: '#90FF33', message: "3. Deploy... \n${info_jenkins}";
                sh "ssh root@gsuscastelsc.com 'docker exec gsuscastelsc.com bash -c \"cd /var/www/html/ && rm -rf * && ls /var/www/html && cp -r ag*  /var/www/html\"' ";
            }    
        }
       
    }
     post("Slack") {
          always{
               slackSend color: '#33B5FF', message: "${info_jenkins}";
            }
            success{
               slackSend color: '#90FF33', message: "success \n${info_jenkins}";
            }
            failure{
                slackSend color: '#FF4233', message: "failure \n${info_jenkins}";
            }          
        }
}