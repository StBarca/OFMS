package org.classsix.ofms.domin;

import org.classsix.ofms.domin.common.BasePerson;

import javax.persistence.*;

/**
 * Created by Jiang on 2017/3/15.
 *
 * @author Jiang
 */
@Entity
@Table(name = "USER")
public class User extends BasePerson{
    private static final long serialVersionUID = 5783613723738241740L;
    /** 用户主键 */
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "PK_USER_ID")
    private Integer id;

    /** 账号 */
    @Column(name = "USER_NAME", length = 50, nullable = false)
    private String userName;

    /** 手机号码 */
    @Column(name = "TEL", length = 20, nullable = false)
    private String tel;

    /** 密码 */
    @Column(name = "PASSWORD", length = 20, nullable = false)
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}