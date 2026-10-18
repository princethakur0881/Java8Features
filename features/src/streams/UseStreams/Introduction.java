package streams.UseStreams;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Introduction {
    static void main() {
      List<Integer> list = Arrays.asList(1,1,2,11,3,4,5,6,7,9,5,3,21);
        List<Integer> filterList = list.stream().filter(x -> x % 2 == 0 ).collect(Collectors.toList());
        IO.println(filterList);


        List<String>  names = Arrays.asList("prince","mahi","anurag","rimpal","nikhil","Radha","prince");
        List<String> stringStream = names.stream()
                .filter(x->x.length()%2==0)
                .map(x->x.toUpperCase())
                .sorted()
                .distinct()
                .collect(Collectors
                        .toList());
        IO.println(stringStream);
        String[] name = {"abc","bcd","cde","def","efg"};
        List<String> s  = Arrays.stream(name).map(x -> x.toUpperCase()).distinct().collect(Collectors.toList());
            IO.println(s);

int arr[] = {1,2,4,90,5,6,7,7,9,9,85,3,2,1,333,4,7,8,11,9,-65};
        Integer maxvalue  = Arrays.stream(arr).distinct().max().getAsInt();
        Integer minvalue  = Arrays.stream(arr).distinct().min().getAsInt();
        System.out.println(maxvalue);
        IO.println(minvalue);

    }
}
