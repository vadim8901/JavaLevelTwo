package lesson3;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> map;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook = (PhoneBook) o;
        return Objects.equals(map, phoneBook.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }

    public PhoneBook(Map<String, List<String>> map) {
        this.map = map;
    }

    PhoneBook add(String name, List<String> number){
        map.put(name, number);
        return new PhoneBook(map);
    }

    List<String> getNumber(String name){
        return map.get(name);
    }
}
