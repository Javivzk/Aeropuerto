package domain;

public class Aeropuerto {
    private String nombre;
    private String ciudad;
    private String pais;
    private Compañia listaComapañias[] = new Compañia[10];
    private int numCompañia;

    public Aeropuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numCompañia = 0;
    }

    public Aeropuerto(String nombre, String ciudad, String pais, Compañia c[]) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        listaComapañias = c;
        this.numCompañia = c.length;
    }

    public void insertarCompañia(Compañia compañia) {
        listaComapañias[numCompañia] = compañia;
        numCompañia++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Compañia[] getListaComapañias() {
        return listaComapañias;
    }

    public void setListaComapañias(Compañia[] listaComapañias) {
        this.listaComapañias = listaComapañias;
    }

    public int getNumCompañia() {
        return numCompañia;
    }

    public void setNumCompañia(int numCompañia) {
        this.numCompañia = numCompañia;
    }

    public Compañia getCompañia(int i) {
        return listaComapañias[i];
    }

    public Compañia getCompañia(String nombre) {
        boolean encontrado = false;
        int i = 0;
        Compañia c = null;
        while ((!encontrado)&&(i<listaComapañias.length)) {
            if (nombre.equals(listaComapañias[i].getNombre())) {
                encontrado = true;
                c = listaComapañias[i];
            }
            i++;
        }
        return c;
    }
}
