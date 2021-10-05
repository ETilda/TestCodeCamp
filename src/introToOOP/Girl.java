package introToOOP;

public class Girl {

    public static void main(String[] args) {
        Human_being lola =new Human_being();
//        lola.setThroat("long throat");
        String lolaThroat=lola.wantThroat();
        System.out.println(lolaThroat);
        int lolaLegs= lola.getLegs();
        System.out.println("lola legs are: "+ lolaLegs);

    }

}
