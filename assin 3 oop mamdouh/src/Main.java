import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(10);
        Scanner inn= new Scanner(System.in);
        int num = inn.nextInt();
        for (int i = 0; i < num; i++) {
            list.add(inn.nextInt());
        }
        Integer i1 = 0;
        i1 = Max(list);
        if ( i1!= null || i1!= 0) {
            System.out.println(i1);
        }
        for (int i2 = 0; i2 < num; i2++) {
            System.out.print(" " + list.get(i2));
        }
    }
        public static Integer Max (ArrayList<Integer> List){
            if (List.isEmpty())
                return null;
            int Max = List.get(0);
            for (int x: List) {
                if (x > Max )
                    Max = x;
            }
            return Max;
        }
    public static void sort(ArrayList<Integer> list){
        list.sort(null);
    }
}