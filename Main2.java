public class Main2 {
    public static void main (String[] args){
        int countdown = 3;
        while(countdown > 0){
            System.out.println(countdown);
            countdown--;
        }
        countdown = 5;
        do {
            System.out.println(countdown);
            countdown--;
        } while(countdown > 0);
    }
}