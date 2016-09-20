//method reverse an array using one pointer

void reverse(int[] a){  
  for(int i=0;i<a.length/2;i++){
    int temp=a[i];
    a[i]=a[a.length-1-i];
    a[a.length-1-i];
  }
}  

//method 2: reverse an array using 2 pointers

void reverse(int[]a){
  for(int i=0;j<a.length-1;i<j;i++,j--){
    int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
  }
}
  
