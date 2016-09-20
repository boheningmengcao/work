//1, count of nodes

int count(Node head){
  int i=0;Node n=head;
  While(n!==null){
    n=n.next;
    i++
  }
  return i;
}

//2. calculate sum
int sum(Node head){
  int s=0;Node n=head;
  while(n!==null){
    s+=n.val;
    n=n.next;
  }
  return s;
}

class Node{
  int val;
  Node next;
} 

