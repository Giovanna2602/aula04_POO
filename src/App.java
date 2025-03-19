public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Veiculo gol = new Veiculo(); //criar um objeto
        Veiculo palio = new Veiculo();
        //separar os objetos ou distinguir cada um: misturar valores

        System.out.println(gol.buzinar());

        gol.acelerar(10);
        System.out.println(gol.velocidade);

        gol.acelerar(15);
        System.out.println(gol.velocidade);

        System.out.println(palio.velocidade);
    }
}
