package pe.edu.cibertec.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.web.model.Role;
import pe.edu.cibertec.web.repository.IRoleRepository;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private IRoleRepository IRoleRepository;

    public List<Role> findAll() {
        return IRoleRepository.findAll();
    }

    public Role findById(Integer id) {
        return IRoleRepository.findById(id).orElse(null); 
    }

    public Role save(Role role) {
        return IRoleRepository.save(role); 
    }

    public void deleteById(Integer id) {
    	IRoleRepository.deleteById(id); 
    }

    public Role findByName(String name) {
        return IRoleRepository.findByName(name);
    }
}
