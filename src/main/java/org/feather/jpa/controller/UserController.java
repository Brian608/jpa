package org.feather.jpa.controller;

import lombok.RequiredArgsConstructor;
import org.feather.jpa.constants.CoreConstant;
import org.feather.jpa.entity.User;
import org.feather.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @projectName: jpa
 * @package: org.feather.jpa.controller
 * @className: UserController
 * @author: feather
 * @description:
 * @since: 12-Nov-23 4:22 PM
 * @version: 1.0
 */
@RestController
@RequestMapping(CoreConstant.API+CoreConstant.V1+"/user")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    private final UserRepository userRepository;


    /**
     * 保存用户
     * @param user
     * @return
     */
    @PostMapping(value = "/add",consumes = {MediaType.APPLICATION_JSON_VALUE})
    public User addNewUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    /**
     * 根据分页信息查询用户
     * @param request
     * @return
     */
    @GetMapping(value= "/page")
       public Page<User> getAllUsers(Pageable request) {
            return userRepository.findAll(request);
        }


}
