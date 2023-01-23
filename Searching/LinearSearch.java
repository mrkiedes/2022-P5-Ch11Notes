import java.util.Random;
public class LinearSearch{
    static int numList[] = new int[1000];
    public static void main(String args[]){
        setupList();
        displayList();
        System.out.println();

        int location = linearSearch(22);
        if(location != -1) {
            System.out.println("Your desired value is stored at:" + location);
        }else{
            System.out.println("You made an oopsie... The number you entered is not in the list");
        }

    }
    public static int linearSearch(int lookup){
        for(int k = 0; k < numList.length; k++){
            if(numList[k] == lookup){
                return k;
            }
        }
        return -1;
    }

    public static void setupList() {
        Random rand = new Random(1234);
        for(int l = 0; l < numList.length; l++)
            numList[l] = rand.nextInt(1000);
    }

    public static void displayList(){
        for(int k = 0; k < numList.length; k++)
            System.out.print(numList[k] + " ");
    }
}