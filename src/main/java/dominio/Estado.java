package dominio;

public abstract class Estado {
    public abstract void encender (Auto auto);
    public abstract void apagar (Auto auto);
    public abstract void arrancar (Auto auto);
    public abstract void detener (Auto auto);
}
