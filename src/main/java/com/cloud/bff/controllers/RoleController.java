package com.cloud.bff.controllers;

import com.cloud.bff.models.ResponseModel;
import com.cloud.bff.models.RoleModel;
import com.cloud.bff.services.RoleService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    private final RoleService roleService;

    public RoleController(final RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/getRoles")
    public ResponseModel getRoles() {
        return roleService.getRoles();
    }

    @GetMapping("/getRole/{id}")
    public ResponseModel getRoleById(@PathVariable Long id) {
        return roleService.getRoleById(id);
    }

    @PostMapping("/createRole")
    public ResponseModel createRole(@RequestBody RoleModel role) {
        return roleService.createRole(role);
    }

    @PutMapping("/updateRole")
    public ResponseModel updateRole(@RequestBody RoleModel role) {
        return roleService.updateRole(role);
    }

    @DeleteMapping("/deleteRole/{id}")
    public ResponseModel deleteRole(@PathVariable Long id) {
        return roleService.deleteRole(id);
    }
} 