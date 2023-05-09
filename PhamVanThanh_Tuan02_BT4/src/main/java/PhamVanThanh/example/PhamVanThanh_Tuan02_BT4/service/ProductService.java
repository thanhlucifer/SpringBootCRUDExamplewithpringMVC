package PhamVanThanh.example.PhamVanThanh_Tuan02_BT4.service;

import java.util.List;

import PhamVanThanh.example.PhamVanThanh_Tuan02_BT4.model.Product;
import PhamVanThanh.example.PhamVanThanh_Tuan02_BT4.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<Product> listAll() {
        return repo.findAll();
    }

    public void save(Product product) {
        repo.save(product);
    }

    public Product get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}
