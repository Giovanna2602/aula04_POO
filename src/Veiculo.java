public class Veiculo {
    public String modelo;
    String cor; //sem modificador de acesso- automaticamente é public
    // Não permite declarar atributos com o nome repetido
    public int velocidade = 0; //inicializando uma variável. Não é comum inicializar valores
    protected String marca;
    private Float capacidadeTanque;
    private Float potenciaMotor;

    //String é uma melhoria do char
    //Boolean é verdadeiro ou falso

    public String buzinar(){
        String buzina = "bi-bi";
        return buzina;
    }

    public void acelerar(int valor){
        velocidade = velocidade + valor;
    }
}
