/*
 * @Author: jack ning github@bytedesk.com
 * @Date: 2024-01-29 11:48:06
 * @LastEditors: jack ning github@bytedesk.com
 * @LastEditTime: 2024-01-29 11:57:50
 * @FilePath: /spring-boot-spring-security-jwt-authentication/src/main/java/com/bezkoder/springjwt/models/Role.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package com.bezkoder.springjwt.models;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Enumerated(EnumType.STRING)
  @Column(length = 20)
  private ERole name;

  public Role() {

  }

  public Role(ERole name) {
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ERole getName() {
    return name;
  }

  public void setName(ERole name) {
    this.name = name;
  }
}