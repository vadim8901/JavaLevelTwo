package lesson3;

import org.testng.annotations.Test;

import java.util.*;

import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

public class PhoneBookTest {
    @Test
    public void add(){
        Map<String, List<String>> map = new HashMap<>();
        map.put("Ivan", Arrays.asList("8900", "98789"));
        map.put("Alexey", Arrays.asList("74832", "426439"));
        PhoneBook phoneBook = new PhoneBook(new HashMap<>());
        phoneBook.add("Ivan", Arrays.asList("8900", "98789"));
        assertEquals(new PhoneBook(map), phoneBook.add("Ivan", Arrays.asList("8900", "98789")).add("Alexey", Arrays.asList("74832", "426439")));
    }

    @Test
    public void getNumber(){
        Map<String, List<String>> map = new HashMap<>();
        map.put("Ivan", Arrays.asList("8900", "98789"));
        map.put("Alexey", Arrays.asList("74832", "426439"));
        PhoneBook phoneBook = new PhoneBook(new HashMap<>());
        phoneBook.add("Ivan", Arrays.asList("8900", "98789"));
        phoneBook.add("Alexey", Arrays.asList("74832", "426439"));
        assertEquals(map.get("Ivan"), phoneBook.getNumber("Ivan"));
        assertEquals(map.get("Alexey"), phoneBook.getNumber("Alexey"));
    }
}
