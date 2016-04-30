package tr.com.prolms.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.com.prolms.base.entity.Role;
import tr.com.prolms.base.exception.RoleNotFoundExc;
import tr.com.prolms.base.repository.RoleRepository;

import java.util.List;

@Service
public class RoleManagementServiceImpl implements RoleManagementService {

  private final RoleRepository roleRepository;

  @Autowired
  public RoleManagementServiceImpl(RoleRepository roleRepository) {
    this.roleRepository = roleRepository;
  }

  (readOnly = true)
  @Override
  public List<Role> findAll() {
    return roleRepository.findAll();
  }


  @Override
  public Role create(Role role) {
    return roleRepository.save(role);
  }

  (readOnly = true, rollbackFor = {RoleNotFoundExc.class})
  @Override
  public Role findRoleById(long id) {
    return roleRepository.findOne(id);
  }

  (rollbackFor = {RoleNotFoundExc.class})
  @Override
  public Role update(Role role) {
    return roleRepository.save(role);
  }

  (rollbackFor = {RoleNotFoundExc.class})
  @Override
  public void deleteRole(long id) {
    roleRepository.delete(id);
  }

}
