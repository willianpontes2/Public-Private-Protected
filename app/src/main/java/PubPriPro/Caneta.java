package PubPriPro;

public class Caneta {

    public String modelo;
   public String cor;
    public float ponta;
   protected int carga;
    private boolean tampada;
    
   public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println(" Esta tampada? " + this.tampada);
    }
    
    public void rabiscar() {
        if(this.tampada == true){
            System.out.println("Nao consigo rabiscar!");
        } else {
            System.out.println("Rabiscando!");
            
        }
}
           public void tampar(){
                this.tampada = true;
            }
                   public void destampar(){
                        this.tampada = false;
                    }

}
