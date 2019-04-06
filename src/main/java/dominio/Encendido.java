package dominio;

public  class Encendido extends Estado {

    @Override
    public void encender(Auto auto) {
        throw new YaEncendioException();
    }

    @Override
    public void apagar(Auto auto) {

    }

    @Override
    public void arrancar(Auto auto) {

    }

    @Override
    public void detener(Auto auto) {

    }
}
