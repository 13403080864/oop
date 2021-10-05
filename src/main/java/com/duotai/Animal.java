package com.duotai;


 class Animal {
    public void show(){
        System.out.println("show");
    }
    public void eat(){
        System.out.println("eat");
    }
}

class Cat extends Animal {

}

class Dog extends Animal {
    public void show(){
        System.out.println("show");
    }
    public void eat(){
        System.out.println("eat 骨头");
    }
}

class TestAnimal{
   public static void main(String[] args) {
       Animal a = new Dog();
       a.eat();


   }

}
