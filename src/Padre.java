public class Padre {
    protected int var1;
    protected int var2;


    protected void metodopadre(){
        System.out.println("Soy el metodo que esta en la clase padre");
    }

    public Padre(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
    }
}
