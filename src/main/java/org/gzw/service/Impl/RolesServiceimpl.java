package org.gzw.service.Impl;

import org.gzw.dao.RolesDao;
import org.gzw.entity.Roles;
import org.gzw.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("rolesService")
public class RolesServiceimpl implements RolesService {

    @Autowired
    private RolesDao rolesDao;
    @Override
    public void insertroles(Roles roles) {
        rolesDao.insertroles(roles);
    }

    @Override
    public void updateroles(Roles roles) {
        rolesDao.updateroles(roles);
    }

    @Override
    public List<Roles> rolesfinall() {
        return rolesDao.rolesfinall();
    }

    @Override
    public Roles rolesbyid(int id) {
        return rolesDao.rolesbyid(id);
    }

    @Override
    public void delectbyid(int id) {
    rolesDao.delectbyid(id);
    }
}
