import java.util.ArrayList;

public class Team {
    public static ArrayList<teams> tags = new ArrayList<>();
    public static void newMember(String name, String p){
        teams now=new teams(name,p);
        tags.add(now);
    }
    public static String getMembers(){
        String ki=new String();
        for(teams I:tags){
            ki+=I.getName()+" "+I.getPosition()+"\r\n";
        }
        return ki;
    }
    public static void leaveTeam(String Name){
        int i=0;
        for(teams I:tags){
            if(I.getName()==Name){
                tags.remove(i);
            }
            i++;
        }
    }
}
