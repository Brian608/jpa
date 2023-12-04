package org.feather.jpa;

import org.feather.jpa.entity.*;
import org.feather.jpa.repository.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class JpaApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AccountRepository accountRepository;


    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private AuthorityRepository authorityRepository;

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


    @Test
    public  void  testFindAllUser(){
        userRepository.findAllUser().forEach(System.out::println);
    }

    @Test
    public  void  testFindAllUserByName(){
        userRepository.findAllUserByName().forEach(System.out::println);
    }


    @Test
    public  void  testFindAllUser2(){
        userRepository.findAllUser2().forEach(System.out::println);
    }

    @Test
    public  void  testFindAllUser3(){
        userRepository.findAllUser3().forEach(System.out::println);
    }


    @Test
    public  void  testUpdateNameById(){
        userRepository.updateNameById("feather6666",1L);
    }

    @Test
    public  void  testUpdateNameById2(){
        userRepository.updateNameById2("feather6666568675",3L);
    }


    @Test
    public  void  testSaveAccount(){
        Account account=new Account();
        account.setName("lisi");
        account.setPassword("123123");
        AccountDetail accountDetail=new AccountDetail();
        accountDetail.setAddress("成都");
        accountDetail.setPhone("1983248u3289");
        accountDetail.setRealName("里斯");
        accountDetail.setEmail("1312412@qq.com");
        account.setDetail(accountDetail);
        Account save = accountRepository.save(account);
        System.out.println(save);

    }

    @Test
    public  void  testDelAccount(){
     accountRepository.deleteById(2L);

    }

    @Test
    @Transactional
    public  void  testQueryAccount(){
        accountRepository.findById(1L).ifPresent(System.out::println);

    }


    @Test
    public  void testAuthor(){
        Author author=new Author();
        author.setName("feather");
        Author save = authorRepository.save(author);
        List<Article> articles=new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
            Article article=new Article();
            article.setTitle("文章"+i);
            article.setContent("内容"+i);
            article.setAuthor(save);
            articles.add(article);
        }
        articleRepository.saveAll(articles);
    }


    @Test
    public  void testDelArticle(){
        articleRepository.deleteById(1L);
    }


    @Test
    public  void testQueryAuthor(){
        authorRepository.findById(1L).ifPresent(System.out::println);
    }


    @Test
    public  void testSaveAuthority(){
        Authority authority=new Authority();
        authority.setName("ROLE_ADMIN");
        authorityRepository.save(authority);
    }


    @Test
    public  void testSaveUsers(){
      Users users=new Users();
      users.setUsername("feather");
      users.setPassword("12312");
        Authority authority = authorityRepository.findById(1L).get();
        List<Authority> authorityList=new ArrayList<>();
        authorityList.add(authority);
        users.setAuthorityList(authorityList);
        usersRepository.save(users);

    }


    /**
     * users 表中删除一条记录，同时user_authority 能够级联删除一条记录
     */
    @Test
    public  void testDelUsers(){
       usersRepository.deleteById(1L);
    }












}
