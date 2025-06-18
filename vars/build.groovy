def call(string image, string tag){
   echo 'This is building the image.'
   sh 'docker build -t "${image}":"${tag}" .'
   echo 'Image Build And Tagged Successfully.'
}
