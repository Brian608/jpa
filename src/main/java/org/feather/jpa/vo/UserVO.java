package org.feather.jpa.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

/**
 * @projectName: jpa
 * @package: org.feather.jpa.vo
 * @className: UserVO
 * @author: feather
 * @description:
 * @since: 03-Dec-23 8:53 PM
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {

    private Long id;


    private String name;
}
