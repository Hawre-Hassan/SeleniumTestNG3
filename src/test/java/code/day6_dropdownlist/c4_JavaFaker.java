package code.day6_dropdownlist;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class c4_JavaFaker {
    @Test
    public void JavaFaker (){
        Faker faker=new Faker();
        System.out.println("name="+faker.name().fullName());
        System.out.println("first name=" +faker.name().firstName());
        System.out.println(faker.address().cityName());
        System.out.println(faker.gameOfThrones().dragon());
        System.out.println(faker.animal().name());
        System.out.println(faker.aquaTeenHungerForce().character());
        System.out.println(faker.artist().name());
        System.out.println(faker.avatar().image());

    }
}
