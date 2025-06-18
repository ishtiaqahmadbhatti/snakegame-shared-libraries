def call(String image, String tag){
   echo 'This is pushing the image.'
                withCredentials([usernamePassword
                (
                    credentialsId: 'dockerHubCred',
                    usernameVariable: 'dockerHubUser',
                    passwordVariable: 'dockerHubPass'
                    )
                    ]) {
                sh "docker login -u $dockerHubUser -p $dockerHubPass"
                sh "docker push $dockerHubUser/$image:$tag"
                }
}
