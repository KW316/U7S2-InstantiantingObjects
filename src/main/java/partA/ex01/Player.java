package partA.ex01;

public class Player {
    public String name;
    String height;
    int years;
    public Player(String variable, String names, String a, int year){
            name = names;
            height = a;
            years = year;
    }
    public static String player() {
        String response = "";
        String a = "6'2";
        String b = "6'6";
        /**
         * Your code goes here
         */
        Player player1 = new Player("Stephn Curry","Stephn Curry",a,13 );
        Player player2 = new Player("Stephn Curry","Micheal Jordan",b,15 );


        System.out.println(player1.name);
        System.out.println(player1.height);
        System.out.println(player1.years);
        System.out.println(player2.name);
        System.out.println(player2.height);
        System.out.println(player2.years);
        return response;
    }

    public static void main(String[] args) {
        String playerOutput = player();
        System.out.print(playerOutput);
    }
}
