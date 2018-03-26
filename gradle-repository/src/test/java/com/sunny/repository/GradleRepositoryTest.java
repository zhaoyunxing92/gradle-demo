package com.sunny.repository;

import com.sunny.model.GradleUser;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author sunny
 * @className GradleRepositoryTest
 * @date 2018-03-26 18:26
 * @description:
 */
public class GradleRepositoryTest {
    private GradleRepository gradleRepository = new GradleRepository();

    @Test
    public void addUser() {
        GradleUser user = new GradleUser("张三");
        gradleRepository.addUser(user);
        Assert.assertNotNull(user);
        Assert.assertNotNull(null);


    }
}
