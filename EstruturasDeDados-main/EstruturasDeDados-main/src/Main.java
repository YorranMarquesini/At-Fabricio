

public class Main {
    public static void main(String[] args) {
        UniBHList<Integer> myList = new UniBHList<>();
        

        for (int i = 0; i < 10; i++) {
            myList.insertAtBeginning(i + 1);
            if (i + 1 == 1) {
                myList.insertAfter(1, 0);
            }

            System.out.println(myList);
        }
        
        System.out.println(myList);
        
        myList.removeAtBeginning();

        System.out.println(myList);

        System.out.println();
    }
}