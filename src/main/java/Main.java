import cuenta.CCuenta;
/**
 * @author Ruben Rodriguez Martinez
 * */
public class Main {
    /**
    * Método principal que crea una cuenta bancaria y muestra su saldo.
    */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );
    }
      /**
     * Realiza operaciones de retiro e ingreso en una cuenta bancaria.
     * @param cuenta1 La cuenta bancaria en la que se realizarán las operaciones.
     */
    public void operativa_cuenta(CCuenta cuenta1){
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
