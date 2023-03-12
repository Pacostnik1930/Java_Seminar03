import java.util.ArrayList;
import java.util.List;
import java.util.Random;


// Заполнить список названием планет Солнечной системы 
// в произвольном порядке с повторениями.Вывести название каждой планеты
// и количество его повторений в списке

public class Task02 {
    public static void main(String[] args) {
        List<String> name = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun",
                "Pluton");
        ArrayList<String> multiName = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            multiName.add(name.get(random.nextInt(name.size())));
        }
        System.out.println(multiName);

        for (int i = 0; i < name.size(); i++) {
            int count = 0;
            for (int j = 0; j < multiName.size(); j++) {
                if (name.get(i).equals(multiName.get(j))) {
                    count++;
                }

            }
            System.out.println(name.get(i) + "=" + count);
        }
    }
}