def call(String image, String tag, String DockerHubUser){
   echo 'This is building the image.'
   sh 'docker build -t ishtiaqhmad913/snakegame:latest .'
   echo 'Image Build And Tagged Successfully.'
}
