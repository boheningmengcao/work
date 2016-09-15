Stack<Integer> Sort(Stack<Integer> S){
  Stack<Integer> S2=new Stack<Integer>();
  while(!S.isEmpty()){
    Int top=s.pop;
    while(!S2.isEmpty()&&S2.peek()>top){
      S.push(S2.pop());
    }
    S2.push(top);
  }
  return S2;
}
