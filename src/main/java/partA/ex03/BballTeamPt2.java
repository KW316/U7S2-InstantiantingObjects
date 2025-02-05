package partA.ex03;

import partA.ex01.Player;

public class BballTeamPt2 {
    public static String BballTeam() {
        String response = "";

        /**
         * Your code goes here
         */
        Player player1 = new Player("Stephn Curry","Stephn Curry","6'2",13 );
        Player player2 = new Player("Stephn Curry","Micheal Jordan","6'6",15 );
        System.out.println(player1.name == player2.name);
        player1.name = "Stephn Curry";
        player2.name = "Stephn Curry";
        System.out.println(player1.name == player2.name);
        return response;
    }

    public static void main(String[] args) {
        String teamOutput = BballTeam();
        System.out.print(teamOutput);
    }
}
