package part2.collections.traversing.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import part2.collections.model.Person;

public class Sample1_Predicate_NoLambda {

    public static void main(String args[]) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("A Dude", 21));
        people.add(new Person("Jose", 30));
        people.add(new Person("Mario", 73));
        people.add(new Person("Angel", 33));
        people.add(new Person("Liusbetty", 19));

        Predicate<Person> filterAge = new Predicate<Person>(){
        	  
        	public boolean test(Person person){
        		return person.getAge() < 30;
        	}
        };

        System.out.println("----- Apply filterAge");
        for (Person p : people) {
            if (filterAge.test(p)) {
                System.out.println(p);
            }
        }
        
        Predicate<Person> filterSize = new Predicate<Person>(){
      	  
        	public boolean test(Person person){
        		return person.getName().length() < 7;
        	}
        };

        
        System.out.println("----- Apply both filters");
        for (Person p : people) {
            if (filterAge.test(p) && filterSize.test(p)) {
                System.out.println(p);
            }
        }
        
    }
}