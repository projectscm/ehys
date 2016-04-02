package tr.gov.tpe.base.dto;

import tr.gov.tpe.base.entity.Role;

public class RoleMapper {

  /**
   * Convert Dto to Entity.
   * @param role Role
   * @param dto  Role Dto
   * @return Role Entity
   */
  public static Role getRole(Role role, RoleDto dto) {
    role.setName(dto.getName());
    return role;
  }

  /**
   * Convert Entity to Dto.
   * @param role Role Entity
   * @return Role Dto
   */
  public static RoleDto getDto(Role role) {
    RoleDto dto = new RoleDto();
    dto.setId(role.getRoleId());
    dto.setName(role.getName());
    return dto;
  }
}