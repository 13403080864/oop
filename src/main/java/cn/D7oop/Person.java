package cn.D7oop;

/**
 * @author wq
 * @since 2022-03-03 下午8:50
 */

public class Person {

    private String name;
    private  int age;
    private String sex;

    public void study(){
        System.out.println("studying");
    }

    public int showAge(int age){
        return age;
    }

    public int addAge(int i){
        age = age + i;
        return age ;
    }



    public static void main(String[] args) {

        Person person = new Person();

        person.name = "小西";
        person.age = 18;

        person.study();
        int i = person.showAge(18);
        System.out.println(i);

        int addAge = person.addAge(2);
        System.out.println(addAge);

    }
}
