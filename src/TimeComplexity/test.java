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

    public int fun2(int [] arr, int N){
        for(int i = 0; i < N; i++){
            for(int j = i + 1; j < N; i++){
                if(i+j <= 100){
                    return 1;
                }
            }
        }
        return 0;
    }

    public int fun3(int N) {
        for(int i = 0; i < N+1; i++){
            if(i*i == N){
                return 1;
            }
        }return 0;
    }

    public int fun4(int N){
        int val1 = 1;
        while(2*val1 <= N)
            val1 *= 2;
            System.out.println("asd");

        return val1;
    }

}