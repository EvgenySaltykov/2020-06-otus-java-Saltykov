package otus.home_work.hw04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        DIYarrayList<Integer> nums = new DIYarrayList<>();
        //создать коллекцию из 25 случайных неповторяющихся чисел
        int i = 1;
        while (i < 25) {
            int n = (int) (Math.random()*100);
            if (nums.isEmpty()) nums.add(n);
            for (int j = 0; j < nums.size(); j++) {
                if (n == nums.get(j)) {
                    n = -1;
                    break;
                }
            }
            if (n != -1) {
                nums.add(n);
                i++;
            }
        }
        //вывести элементы коллекции в консоль
        System.out.println("nums");
        for (int k = 0; k < nums.size(); k++) System.out.print(nums.get(k) + "; ");

        //копировать объекты коллекции в новую коллекцию
        DIYarrayList<Integer> copyNums = new DIYarrayList<>();
        DIYarrayList.copy(copyNums, nums);
        nums.add(999);
        copyNums.add(888);
        System.out.println("\n" + "nums.add");
        for (int k = 0; k < nums.size(); k++) System.out.print(nums.get(k) + "; ");
        System.out.println("\n" + "nums.copy");
        for (int l = 0; l < copyNums.size(); l++) System.out.print(copyNums.get(l) + "; ");

        //добавить все элеметы из другой коллекции
        List<Integer> addList = new ArrayList<>(Arrays.asList(234, 456, 678, 987, 453, 859, 221));
        nums.addAll(addList);
        System.out.println("\n" + "nums.addAll");
        for (int m = 0; m < nums.size(); m++) System.out.print(nums.get(m) + "; ");

        //Отсортировать List с помощью компаратора
        System.out.println("\n" + "nums.sort");
        DIYarrayList.sort(nums, new IntegerComparator());
//        nums.sort(new IntegerComparator());
        for (int m = 0; m < nums.size(); m++) System.out.print(nums.get(m) + "; ");

    }
}
