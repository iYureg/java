/**
 * Stringer
 */
public class Stringer {
    public static void main(String[] args) {
    
        getString("",100_000); // 846ms
        getStrBuilder("",100_000); // 4ms!
    }
    
    static void getStrBuilder(String str, int size){
        var s = System.currentTimeMillis();
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < size; i++) {
            sb.append("+");
            
        }
        str = sb.toString();
        System.out.println(System.currentTimeMillis()-s);
        
    }
    
    static void getString(String str,int size){
        var s = System.currentTimeMillis();
        
        
        
        for(int i = 0;i < size; i++){
            str += "+";    
        }
        System.out.println(System.currentTimeMillis()-s);
        
    }
}
