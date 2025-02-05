package partA.ex02;

import partA.ex01.Player;

public class BballTeamPt1 {
    public static String BballTeam() {
        String response = "";

        /**
         * Your code goes here
         */
        Player player1 = new Player("Stephn Curry","Stephn Curry","6'2",13 );
        Player player2 = new Player("Stephn Curry","Micheal Jordan","6'6",15 );

        System.out.println(player1.equals(player2));
        System.out.println(player1 == player2);
        player2 = new Player("Stephn Curry","Stephn Curry","6'2",13 );

        System.out.println(player1 == player2);
        player2 = player1;
        System.out.println(player1.equals(player2));

        return response;
    }

    public static void main(String[] args) {
        String teamOutput = BballTeam();
        System.out.print(teamOutput);
    }
}
