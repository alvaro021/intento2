
public class Polera {
    
    String material ;
    String talla;
    boolean estampado;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setEstampado(boolean estampado) {
        this.estampado = estampado;
    }

    public String getMaterial() {
        return material;
    }

    public String getTalla() {
        return talla;
    }

    public boolean isEstampado() {
        return estampado;
    }
    
    public Polera(String material, String talla, boolean estampado) {
        this.estampado = estampado;
        this.material = material;
        this.talla = talla;
    }
    
    
    
}
