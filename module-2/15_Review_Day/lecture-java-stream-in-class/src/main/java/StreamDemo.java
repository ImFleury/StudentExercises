import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        //infintieElements();

        //create a list of integers
        List<Integer> number = Arrays.asList(2,3,4,5,6,7,8,9);

        //mapMethod(number);
        List<String> names = Arrays.asList("Reflection", "Collections", "Stream", "South", "North", "Silly", "Sam");
       // filterMethod(names);

       // sortMethod(names);
        List<Integer> numbers2 = Arrays.asList(5,4,3,6,7,8,1,2);
        //collectMethod(numbers2);

        // forEachMethod(numbers2);
        
        reduceMethod(numbers2);

    }

    private static void reduceMethod(List<Integer> numbers2) {

        int even = numbers2.stream().filter(x -> x % 2 == 0).reduce(0, (total, item) -> total + item);
        System.out.println("Reduce total: " + even);
    }

    private static void forEachMethod(List<Integer> numbers2) {

        numbers2.stream()
                .filter(z -> z % 2 == 0 && z >= 6)
                .forEach(y -> {
                            y *= y;
                            y *= 10;
                            System.out.println(y);
                        }
                );
    }

    private static void collectMethod(List<Integer> y) {

        Set<Integer> squareSet = y.stream().map(x -> x * x).collect(Collectors.toSet());

        System.out.println(squareSet);
    }

    private static void sortMethod(List<String> names) {
        List<String> showSort = names.stream().sorted().collect(Collectors.toList());

        System.out.println(showSort);
    }

    private static void filterMethod(List<String> names) {
         List<String> result = names.stream().filter(x -> x.toUpperCase(Locale.ROOT).trim().startsWith("S")).collect(Collectors.toList());

        System.out.println(result);
    }

    private static void mapMethod(List<Integer> number) {
        List<Integer> squares = number.stream().map( x ->  x * x).collect(Collectors.toList());
        for(Integer item : squares){
            System.out.println(item);
        }
    }

    private static void infintieElements() {

        Stream<Integer> infiniteStream = Stream.iterate(1, item -> item  * 2);

        List<Integer> collect = infiniteStream
                .skip(3)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("collection size: " + collect.size());
        for(Integer item : collect){
            System.out.println(item);
        }
    }


}
