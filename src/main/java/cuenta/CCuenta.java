package cuenta;
/**
 * Clase que representa una cuenta bancaria.
 * @author Ruben Rodriguez Martinez
 */
public class CCuenta {

    /** Nombre del titular de la cuenta */
    private String nombre;
    /** Número de cuenta */
    private String cuenta;
    /** Saldo actual de la cuenta */
    private double saldo;
    /** Tipo de interés de la cuenta */
    private double tipoInterés;
    
    /**
     * Constructor por defecto.
     */
    public CCuenta()
    {
    }
    /**
     * Constructor con parámetros.
     * @param nom Nombre del titular de la cuenta
     * @param cue Número de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Devuelve el saldo actual de la cuenta.
     * @return El saldo actual
     */
    public double estado()
    {
        return saldo;
    }
    
    /**
     * Ingresa una cantidad en la cuenta.
     * @param cantidad Cantidad a ingresar
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
     * Retira una cantidad de la cuenta.
     * @param cantidad Cantidad a retirar
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
