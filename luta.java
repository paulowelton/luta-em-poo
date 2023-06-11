import java.util.Random;
public class luta {
   private lutador desafiado;
   private lutador desafiando; 
   private boolean aprovada ;

   public void marcarLuta(lutador l1,lutador l2){
    if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
          this.aprovada = true;
          this.desafiado = l1;
          this.desafiando = l2;
    }else{
        this.aprovada = false;
        this.desafiado = null;
        this.desafiando = null;
    }
   }
   public void lutar(){
    if(this.aprovada){
     this.desafiado.apresentar();
     this.desafiando.apresentar();
     Random aleatorio = new Random();
     int vencedor = aleatorio.nextInt(3);
     switch(vencedor){
        case 0:
        System.out.println("EMPATOU");
        this.desafiando.empatarLuta();
        this.desafiado.empatarLuta();
        break;
        case 1:
        System.out.println("DESAFIANTE GANHOU");
        this.desafiando.ganharLuta();
        this.desafiado.perderLuta();
        break;
        case 2:
        System.out.println("DESAFIADO GANHOU");
        this.desafiado.perderLuta();
        this.desafiado.ganharLuta();
        break;
        
     }
     
    }else{
        System.out.println("a luta  nao pode acontecer! ");
    }
   }

   public void setDesafiado(lutador dd){
    this.desafiado = dd;
   }
   public lutador getDesafiado(){
    return desafiado;
   }   
   public void setDesafiando(lutador dn){
    this.desafiando = dn;
   }
   public lutador getDesafiando(){
    return desafiando;
   }

}
