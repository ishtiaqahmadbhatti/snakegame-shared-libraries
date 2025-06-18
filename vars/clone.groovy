def call(String url, String branch){
  echo 'This is cloing the code.'
  git url: url, branch: branch
  echo 'Code Cloned Successfully.'
}
