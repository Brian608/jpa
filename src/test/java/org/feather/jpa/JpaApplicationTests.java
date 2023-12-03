package org.feather.jpa;

import org.feather.jpa.entity.User;
import org.feather.jpa.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

@SpringBootTest
class JpaApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public  void  testQuery(){
        userRepository.findById(1L).ifPresent(System.out::println);
    }

    @Test
    public  void testSave(){
        User user=new User();
        user.setName("zhangsan");
        user.setPassword("123456");
        User user1 = userRepository.save(user);
        System.out.println(user1);
    }

    @Test
    public  void  testDel(){
        userRepository.deleteById(2L);
    }

    @Test
    public  void  testQueryPage(){
        userRepository.findAll(PageRequest.of(0,3)).forEach(System.out::println);
    }

    @Test
    public  void  testFindAllByName(){
        userRepository.findAllByName("zhangsan").forEach(System.out::println);
    }

    @Test
    public  void  testFindAllByNameLikeAndPasswordLike(){
        userRepository.findAllByNameLikeAndPasswordLike("%zhang%","%123%").forEach(System.out::println);
    }








}
