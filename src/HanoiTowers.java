import java.util.Scanner;

public class HanoiTowers {

    private void solvePuzzle(int numberOfDisks, String firstStage, String secondStage, String thirdStage) {

        if(numberOfDisks == 1) {
            System.out.println(firstStage + " -> " + thirdStage);
        }

//        solvePuzzle(numberOfDisks - 1);

//        solvePuzzle(numberOfDisks - 1);
    }


    public static void main(String[] args) {
        HanoiTowers hanoiTowers = new HanoiTowers();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int numberOfDisks = input.nextInt();
        hanoiTowers.solvePuzzle(numberOfDisks, "A", "B", "C");
    }
}
