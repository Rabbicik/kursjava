import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<pojazdy> pojazdyList = new ArrayList<>();
        pojazdyList.add(new auta());
        pojazdyList.add(new motory());

        for (pojazdy pojazdy : pojazdyList) {
            pojazdy.activaceBreake();
        }
    }
}
