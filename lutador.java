public class lutador{
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public lutador(String no,String na,int id,float al,float pe,int vi,int de,int em){
     this.nome = no;
     this.nacionalidade = na;
     this.idade = id;
     this.altura = al;
     this.setPeso(pe);
     this.vitorias = vi;
     this.derrotas = de;
     this.empates = em;
    }
    public String getNome(){
        return nome;

    }
    public void setNome(String no){
      this.nome = no;
    }
    public float getPeso(){
        return peso;
    }
    public void setPeso(float pe){
       this.peso = pe;
       this.setCategoria();
    }
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(){
        if(this.peso < 52.2){
            this.categoria = "invalido";
        }else if(this.peso <= 70.3){
            this.categoria = "leve";
        }else if(this.peso <= 83.9){
            this.categoria = "medio";
        }else if(this.peso<=120.2){
            this.categoria = "pesado";
        }else{
            this.categoria = "invalido";
        }

    }
    public void apresentar(){
        System.out.println("------------------------------------------");
     System.out.println("lutador:" +this.getNome());
     System.out.println("origem:"+this.getNacionalidade());
     System.out.println(this.getIdade()+"anos");
     System.out.println(this.getAltura()+"m de altuta");
     System.out.println("pesando:"+this.getPeso()+"kg");
     System.out.println("ganhou:" + this.getVitoria());
     System.out.println("perdeu:"+this.getDerrota());
     System.out.println("empatou:"+this.getEmpate());
     System.out.println("----------------------------------------------");
    }
    public void status(){
        System.out.println("-----------------------------------------------");
       System.out.println(this.getNome());
       System.out.println("e um peso"+this.getCategoria());
       System.out.println(this.getVitoria()+"vitorias");
       System.out.println(this.getDerrota()+"derrotas");
       System.out.println(this.getEmpate()+"empates");
       System.out.println("------------------------------------------------");
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }
    public float getAltura(){
        return altura;
    }
    public void setAltura(float al){
        this.altura = al;
    }
    public int getIdade(){
        return idade;
    }
    public void setidade(int id){
        this.idade = id;
    }
    public int getDerrota(){
        return derrotas;
    }
    public void setDerrota(int de){
        this.derrotas = de;
    }
    public int getVitoria(){
        return vitorias;
    }
    public void setVitoria(int vi){
        this.vitorias=vi;
    }
    public int getEmpate(){
        return empates;
    }
    public void setEmpate(int em){
        this.empates = em;
    }
    public void ganharLuta(){
         this.setVitoria(this.getVitoria()+1);
    }
    public void perderLuta(){
        this.setDerrota(this.getDerrota() + 1);
    }
    public void empatarLuta(){
      this.setEmpate(this.getEmpate() + 1);
    }
}