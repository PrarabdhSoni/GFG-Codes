public class EvenOrOdd {
        static boolean isEven(int n) {

            if(1<= n && n<= 10000){
                if((n & 1) == 0){
                    return true;
                }else{
                    return false;
                }
            }

            return false;
        }

    public static void main(String[] args) {
        System.out.println(isEven(244));
        System.out.println(isEven(583));
    }
}
