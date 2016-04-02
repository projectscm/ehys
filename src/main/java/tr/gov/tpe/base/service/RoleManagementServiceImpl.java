package tr.gov.tpe.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tr.gov.tpe.base.entity.Role;
import tr.gov.tpe.base.exception.RoleNotFoundExc;
import tr.gov.tpe.base.repository.RoleRepository;

import java.util.List;

@Service
public class RoleManagementServiceImpl implements RoleManagementService {

  private final RoleRepository roleRepository;

  @Autowired
  public RoleManagementServiceImpl(RoleRepository roleRepository) {
    this.roleRepository = roleRepository;
  }

  @Transactional(readOnly = true)
  @Override
  public List<Role> findAll() {
    return roleRepository.findAll();
  }

  @Transactional
  @Override
  public Role create(Role role) {
    return roleRepository.save(role);
  }

  @Transactional(readOnly = true, rollbackFor = {RoleNotFoundExc.class})
  @Override
  public Role findRoleById(long id) {
    return roleRepository.findOne(id);
  }

  @Transactional(rollbackFor = {RoleNotFoundExc.class})
  @Override
  public Role update(Role role) {
    return roleRepository.save(role);
  }

  @Transactional(rollbackFor = {RoleNotFoundExc.class})
  @Override
  public void deleteRole(long id) {
    roleRepository.delete(id);
  }

}
