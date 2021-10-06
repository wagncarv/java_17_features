package stream.api;

import java.util.Map;
import java.util.Optional;

public class OptionalInterface {
    private static final Map<String, Integer> PEOPLE = Map.of("Pedro", 15, "Maria", 20, "Jorge", 10);

    public static void main(String[] args) {
        Optional<Integer> opt = get("sen");
//        int idade = opt.orElse(0);
//        int idade = opt.orElseThrow(IllegalArgumentException::new);

//        opt.ifPresent(i -> System.out.println("A idade foi encontrada"));


        opt.ifPresentOrElse(i -> System.out.println("Encontrada"), () -> System.out.println("A idade não foi encontrada"));
//        System.out.println(idade);
    }

    private static Optional<Integer> get(String name){
        return Optional.ofNullable(PEOPLE.get(name));
    }
}
