import java.util.Random;

/**
 * @author Artash-PC on 5/16/2021
 * @product IntelliJ IDEA
 * @project sortingalgorithms
 */
public class RandIntGenerator {
    public static int generate () {
        Random random = new Random();
        return random.nextInt();
    }

    public static int [] fillArrayWithRandomNumbers(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generate();
        }
        return arr;
    }
}
