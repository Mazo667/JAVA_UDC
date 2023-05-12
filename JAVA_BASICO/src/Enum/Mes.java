package Enum;

public enum Mes {
	ENERO("Ene", 31),
    FEBRERO("Feb", 28),
    MARZO("Mar", 31),
    ABRIL("Abr", 30),
    MAYO("May", 31),
    JUNIO("Jun", 30),
    JULIO("Jul", 31),
    AGOSTO("Ago", 31),
    SEPTIEMBRE("Sep", 30),
    OCTUBRE("Oct", 31),
    NOVIEMBRE("Nov", 30),
    DICIEMBRE("Dic", 31);
    
    private String nombreAbreviado;
    private int dias;

    private Mes(String nombreAbreviado, int dias) {
        this.nombreAbreviado = nombreAbreviado;
        this.dias = dias;
    }

    public String getNombreAbreviado() {
        return nombreAbreviado;
    }

    public int getDias() {
        return dias; 
        }
}
