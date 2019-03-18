package sanPham.model;

public class Product {
    private int id;
    private String name;
    private String nhasanxuat;
    private float giaca;

    public Product(int id, String name, String nhasanxuat) {
    }
    public Product(int id, String name, String nhasanxuat, float giaca){
        this.setId(id);
        this.setName(name);
        this.setNhaSanXuat(nhasanxuat);
        this.setGiaCa(giaca);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNhasanxuat() {
        return nhasanxuat;
    }

    public void setNhaSanXuat(String nhasanxuat) {
        this.nhasanxuat = nhasanxuat;
    }

    public float getGiaca() {
        return giaca;
    }

    public void setGiaCa(float giaca) {
        this.giaca = giaca;
    }
}
