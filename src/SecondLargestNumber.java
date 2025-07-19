public class SecondLargestNumber {

        public int getSecondLargest(int[] arr) {
            // code here

            if (!(arr.length >= 2 && arr.length <= 100000)){
                return -1;
            }


            int maxNumber = 0;
            int secondMaxNumber = 0;

            for (int i : arr){

                if(!( i >=1 && i <= 100000)){
                    return -1;
                }

                if( i > maxNumber){
                    secondMaxNumber = maxNumber;
                    maxNumber = i;
                } else if (i > secondMaxNumber && i != maxNumber){
                    secondMaxNumber = i;
                }
            }

            if (secondMaxNumber == 0 || secondMaxNumber == maxNumber){
                return -1;
            }

            return secondMaxNumber;
        }

}
