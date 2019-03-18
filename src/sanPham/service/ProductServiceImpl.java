package sanPham.service;

import sanPham.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ProductServiceImpl implements ProductService{
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Banh","Banh Bao",15000));
        products.put(2,new Product(2,"Keo","Keo Deo",2000));
        products.put(3,new Product(3,"Kem","Kem Thu Do",5000));
        products.put(4,new Product(4,"Sua","Sua Oc Cho",10000));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product customer) {
        products.put(customer.getId(), customer);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product customer) {
        products.put(id, customer);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
