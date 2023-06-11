public class mainl {
    public static void main(String[] args){
    lutador l[] = new lutador[6];
    l[0]= new lutador("paulin","fortaleza",16,1.85f,90f,11,2,5);
    l[1]= new lutador("vetzin","cumbuco",17,1.70f,99f,10,4,1);
    l[2]= new lutador("vapoxz","paraiba",15,1.68f,62f,5,6,7);
    
    luta ueoc1 = new luta();
    ueoc1.marcarLuta(l[0],l[1]);
     ueoc1.lutar();
   } 
}