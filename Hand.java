package lec05.cardgames;
//import

public class Hand extends CardCollection {
    private String label;

    public Hand (String label){
        super(label);

    }
   public void showHand(){
       System.out.println(getLabel()+" :");
       System.out.println( toString() );
   }



}
