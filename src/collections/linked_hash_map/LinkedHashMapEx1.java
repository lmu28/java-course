package collections.linked_hash_map;

import java.util.LinkedHashMap;

public class LinkedHashMapEx1 {
    public static void main(String[] args) {
        // Как и обычный HashMap, но хранит информацию об использовании, последний использованный элемент в конце
        // get(), put() - считаются использованием
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>(16,0.75f,true); // true - сохранять информацию об использовании, остальные по умолчанию
        map.put(1,"eaddad");
        map.put(2,"efsdfaddad");
        map.put(5,"eaddfghad");
        map.put(3,"eaddahgd");
        map.put(10,"adsaeaddad");
        map.put(0,"adedadaddad");

        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println(map.get(5));
        System.out.println(map.get(10));
        System.out.println(map);





    }
}
