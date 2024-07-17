//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
    //task1
    int age = 48;
    if (age < 18) {
        System.out.println("Если возраст человека равен " + age +", то он не достиг совершеннолетия, нужно немного подождать");
    } else {
        System.out.println("Если возраст человека равен " + age +", то он совершеннолетний");
    }
    //task2
    float teperature = 4;
    if (teperature < 5) {
        System.out.println("На улице холодно, нужно надеть шапку");
    } else { if (teperature > 5)
        {System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }
    //task3
    float speed = 60;
    if (speed > 60) {
        System.out.println("Если скорость " + speed + " км/ч, то придется платить штраф");
    } else { System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
    }
    }
}