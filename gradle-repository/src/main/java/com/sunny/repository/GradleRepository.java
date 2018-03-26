package com.sunny.repository;

import com.sunny.model.GradleUser;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunny
 * @className GradleRepository
 * @date 2018-03-26 17:34
 * @description:
 */
public class GradleRepository {
    List<GradleUser> users = new ArrayList<>();

    public void addUser(GradleUser user) {
        users.add(user);
    }
}
