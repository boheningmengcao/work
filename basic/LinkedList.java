1

int count(Node head){
  int i=0;Node n=head;
  While(n!==null){
    n=n.nest;
    i++
  }
  return i;
}

2.
int sum(Node head){
  int s=0;Node n=head;
  while(n!==null){
    s+=n.val;
    n=n.next;
  }
  return s;
}



