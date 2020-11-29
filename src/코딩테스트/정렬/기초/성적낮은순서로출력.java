package 코딩테스트.정렬.기초;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class 성적낮은순서로출력 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        List<Person> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            String name = sc.next();
            int age = sc.nextInt();
            list.add(new Person(name,age));
        }

        Collections.sort(list,(s1,s2) -> {
            if(s1.getAge()== s2.getAge()) {
                return s1.getName().compareTo(s2.getName());
            }else {
                return s1.getAge()-s2.getAge();
            }

        });

        for (Person person : list) {
            System.out.println(person.getName());
        }


    }
}
