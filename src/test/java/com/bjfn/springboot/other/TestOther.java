package com.bjfn.springboot.other;

import com.bjfn.springboot.SpringbootApplication;
import com.bjfn.springboot.entity.SysRole;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootApplication.class)
public class TestOther {


    @Autowired
    public PasswordEncoder passwordEncoder;

    @Test
    public void testBry(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encode = encoder.encode("123");
        System.out.println(encode.toString() + "========");
        System.out.println(passwordEncoder.encode("123").toString() + "========");

    }
}
