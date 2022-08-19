public class Application {

    public static void main(String[] args) {

        //intiallize state
        GumballMachine gumballMachine = new GumballMachine();
        boolean success = true;
        System.out.println(
                "Gumball count: " + gumballMachine.gumballContainer.getGumballCounter() +
                        "\nNumber of coins: " + gumballMachine.coinBox.getCoinCounter()
        );
        // CLI get coin
        while (success) {
             success = getUserInput();
             if(!success){
                 continue;
             }

        }
        dispenseGumball(gumballMachine);
    }

    public static boolean getUserInput(){
//        Insert coin -> CLI: "Enter coin amount; "
//        Coin validation
        // if secret owner code then call  generate report and reset gumball machine
//        Invalid coin -> CLI :"Incorrect coin. Please use .25"  return false
       //valid return true

        return true;
    }

    public static boolean dispenseGumball( GumballMachine gumballMachine){
        if (gumballMachine.gumballContainer.dispenseGumball()){
            gumballMachine.coinBox.acceptCoin();
            return true;
        }
        return false;
    }
}
