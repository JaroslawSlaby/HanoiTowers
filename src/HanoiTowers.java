import java.util.Scanner;

public class HanoiTowers {

    private void solvePuzzle(int numberOfDisks, String startStage, String auxiliaryStage, String endStage) {

        if(numberOfDisks == 1) {
            System.out.println(startStage + " -> " + endStage);
        }
        else {
            solvePuzzle(numberOfDisks - 1, startStage, endStage, auxiliaryStage);
            System.out.println(startStage + " -> " + auxiliaryStage);
            solvePuzzle(numberOfDisks - 1, startStage, endStage, auxiliaryStage);
        }
    }


    public static void main(String[] args) {
        HanoiTowers hanoiTowers = new HanoiTowers();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int numberOfDisks = input.nextInt();
        hanoiTowers.solvePuzzle(numberOfDisks, "A", "B", "C");
    }
}
