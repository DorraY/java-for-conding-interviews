package test;

import java.util.stream.Stream;

public class DataProviders {

    public  static Stream<Object[]> dataProviderForAdd() {
        return Stream.of(
                new Object[]{1,2,3},
                new Object[]{2,4,6},
                new Object[]{-1,1,0},
                new Object[]{3,3,6},
                new Object[]{13,2,15},
                new Object[]{1,14,15}
        );
    }

}
