package refactor_32;

public class Refactor_32 {

    public static void main(String[] args) {
        // Normal constructor
        SelectTransport select = new SelectTransport();
        
        System.out.println(select.selectRandom());   
        
        // Factory pattern
        SelectTransportF selectF = new SelectTransportF();
        
        System.out.println(selectF.selectRandom());   
    }
    
}
