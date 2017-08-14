public class Test {
    private static int res;
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
//        System.out.println(getCount(35L));//1132436852 1951
        System.out.println(count(35L));//1132436852  122280
        long l2 = System.currentTimeMillis()-l;
        System.out.println("耗时："+l2);
        System.out.println("1");

    }

    private static int getCount(Long i) {
        if (i==1){
            return 1;
        }
        if (i==2){
            return 2;
        }
        if (i==3){
            return 4;
        }
        if (i<=0){
            return 0;
        }
       return getCount(i - 1)+getCount(i-2)+getCount(i-3);
    }

    private static Long count(Long n) {
        if(n<0){
            return Long.valueOf(0);
        }else if (n==0){
            return Long.valueOf(1);
        }else {
            return count(n-1)+count(n-2)+count(n - 3);
        }
    }
}