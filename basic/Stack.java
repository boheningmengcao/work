Stack<Integer> Sort(Stack<Integer> s){
  Stack<Integer> s2=new Stack<Integer>();
  while(!s.isEmpty()){
    int top=s.pop;
    while(!s2.isEmpty()&&s2.peek()>top){
      s.push(s2.pop());
    }
    s2.push(top);
  }
  return s2;
}
