import Exercise1.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .firstName("ivan")
                .lastName("ivanov")
                .age(30)
                .country("russia")
                .address("moscow")
                .phone("123467")
                .build();

    }
}
