package otus.home_work.hw04;

import java.util.ArrayList;
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
        for (int k = 0; k < nums.size(); k++) System.out.print(nums.get(k) + "; ");
        //копировать объекты коллекции в новую коллекцию
        DIYarrayList<Integer> copyNums = new DIYarrayList<>();
        DIYarrayList.copy(copyNums, nums);
        nums.add(999);
        copyNums.add(888);
        System.out.println("");
        for (int k = 0; k < nums.size(); k++) System.out.print(nums.get(k) + "; ");
        System.out.println("");
        for (int l = 0; l < nums.size(); l++) System.out.print(copyNums.get(l) + "; ");


    }

}
