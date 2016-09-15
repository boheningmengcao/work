1
boolean soduku(int[][]a){
  for(int i=0;i<a.length;i++){
    if(!isValid(a[i])
      return false;
  }
  for(int i=0;i<a.length;i++){
    int[] c=new int[4];
    for(int j=0;j<a.length;j++){
      c[j]=a[j][i];
    }
    if(!isValid(c)
      return false;
    }
    for(int i=0;i<a.length;i++){
      int m=i/2;
      int n=i%2;
      int[]c=new int[4];
      c[0]=a[m][n];c[1]=a[m][n+1];c[2]=a[m+1][n];c[3]=a[m+1][n+1];
      if(!isValid(c))
        return false;
    }
    return true;
}

2
boolean isValid(int[] a){
  boolean[] b=new boolean[4];
  for(int i=0;i<a.length;i++){
    if(!b[a[i]-1])
      b[a[i]-1]=true;
      else return false;
  }
  return true;
}
      }
}
