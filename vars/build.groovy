def call(String image, String tag, String DockerHubUser){
   echo 'This is building the image.'
   sh "docker build -t ${DockerHubUser}/${image}:${tag} ."
   echo 'Image Build And Tagged Successfully.'
}
