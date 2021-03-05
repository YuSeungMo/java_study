package week11.enumSet;

import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        EnumSet<Fruit> fruitEnumSet1 = EnumSet.allOf(Fruit.class);  //모든 요소를 포함한 enum셋트
        System.out.println("fruitEnumSet1: " + fruitEnumSet1);

        EnumSet<Fruit> fruitEnumSet2 = EnumSet.of(Fruit.Mango); // 지정된 요를 포함한 enum셋트
        System.out.println("fruitEnumSet2: " + fruitEnumSet2);

        fruitEnumSet2.add(Fruit.Apple);                         // 지정한 요소를 추가
        System.out.println("fruitEnumSet2: " + fruitEnumSet2);

        fruitEnumSet2.remove(Fruit.Mango);                      // 지정한 요소를 삭제
        System.out.println("fruitEnumSet2: " + fruitEnumSet2);


        EnumSet<Fruit> fruitEnumSet3 = fruitEnumSet2.clone();   // 지정된 enum셋트와 같은 요소의 enum셋트 복체
        System.out.println("fruitEnumSet3: " + fruitEnumSet3);

        EnumSet<Fruit> fruitEnumSet4 = EnumSet.complementOf(fruitEnumSet2); //지정된 enum셋트외의 enum셋트
        System.out.println("fruitEnumSet4: " + fruitEnumSet4);

        EnumSet<Fruit> fruitEnumSet5 = EnumSet.noneOf(Fruit.class); //빈 상의 enum셋트
        System.out.println("fruitEnumSet5: " + fruitEnumSet5);

        EnumSet<Fruit> fruitEnumSet6 = EnumSet.range(Fruit.Strawberry, Fruit.Apple);    // 지정된 2개의 enum셋트의 범위의 enum셋트
        System.out.println("fruitEnumSet6: " + fruitEnumSet6);
    }
}
