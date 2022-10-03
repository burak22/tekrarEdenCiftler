public class Pratik {

    public static void main(String[] args) {
        //Tekrar eden çift sayılar
        int[] mainArray = {3,5,7,7,8,8,6,5,4,6,8,8,4};
        int[] repeaters = new int[mainArray.length];
        int timer = 0;
        for (int i = 0; i < mainArray.length; i++) {
            if(mainArray[i]%2 == 0 && !isInArray(mainArray[i], repeaters)){
                for (int h = 0; h < mainArray.length; h++) {
                    if(mainArray[i] == mainArray[h] && i !=h){
                        repeaters[timer] = mainArray[i];
                        timer++;
                        break;
                    }
                }
            }
        }
        for (int k : repeaters) {
            System.out.print(k + " ");
        }
    }
    public static boolean isInArray(int i, int[] array){
        for (int j : array) {
            if(i==j){
                return true;
            }
        }
        return false;
    }
}
