def call(string image, string tag, string DockerHubUser){
   echo 'This is building the image.'
   sh 'docker build -t ${DockerHubUser}/${image}:${tag} .'
   echo 'Image Build And Tagged Successfully.'
}
