public class PositionChanges extends Team {
    public static void promote(String N,String P){
        for(teams I:tags){
            if(I.getName()==N){
                I.setPosition(P);
            }

        }

    }
}
