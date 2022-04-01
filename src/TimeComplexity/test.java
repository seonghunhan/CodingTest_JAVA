package TimeComplexity;

import java.util.ArrayList;

public class test {

    public test() {
        System.out.println("testclass constructor");
    };

    public int func1(int N) {
        //ArrayList<Integer> list = new ArrayList<Integer>();
        int sum=0;
        for (int i = 0; i < N ; i++){
            if (i % 3 == 0 || i % 5 == 0){
                //list.add(i);
                sum = sum + i;
            }
        }
        return sum;
    };
}
