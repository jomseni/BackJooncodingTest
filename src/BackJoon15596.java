class Test{


    long sum(int[] a){      //return 타입은 long 타입이다 메서드의 이름은 sum

        long sum=0;

        for(int i =0; i<a.length; i++){

            sum+=a[i];
        }
        return sum;
    }
}