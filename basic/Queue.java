class Animal{
  int order;
  String name;
}
class Dog extends Animal[]
class Cat extends Animal[]
Animal clequeueAny(){
  Queue<Dog> dogs=new LinkedList<Dog>();
  Queue<Cat> cats=new LinkedList<Cat>();
  Animal dog=dogs.element();
  Animal cat=cats.element();
  if(dog.order<cat.order){
    dogs.remove();
    return dog;
  }
  else{
    cats.remove();
    return cat;
  }
}
