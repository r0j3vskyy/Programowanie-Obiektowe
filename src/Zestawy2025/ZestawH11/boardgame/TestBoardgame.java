package Zestawy2025.ZestawH11.boardgame;

public class TestBoardgame {
    public static void main(String[] args) {
        try {
            double[] scores = {5.5, 3.7, 2.1, 4.4, 1.5, 
                            9.1, 3.3, 7.2, 3.7, 4.1};
            GameMaster gm1 = new GameMaster("Orzel", scores);
            GameMaster gm2 = gm1.clone();
            gm1.setScore(9, 99.1);
            System.out.println(gm1);
            System.out.println(gm2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
