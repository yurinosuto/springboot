package com.source.yakisoba;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)//Spring BootでJUnitテストするときはコレをつける
@SpringBootTest
public class YakisobaApplicationTests {

    @Autowired
    HelloYakisoba helloyakisoba;//インスタンス化

    @Test
    public void testHello() throws Exception {
        assertEquals("helloyakisoba", helloyakisoba.hello());
               //(expected:確かめたい値、インスタンス名.メソッド名（値.javaファイルにある）)
    }


}





