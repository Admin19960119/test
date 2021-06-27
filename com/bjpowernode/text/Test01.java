package com.bjpowernode.text;

import com.bjpowernode.domain.Emps;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Test01 {

    public static void main(String[] args) {
        String resource = "mabatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession session=sqlSessionFactory.openSession();
        List<Emps> emps=new ArrayList<>();
    emps=session.selectList("t.id");
       for (Emps e:emps){
           System.out.println(e);
       }
    }
}
