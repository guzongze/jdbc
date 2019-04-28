package crud.test.demo.pojo;

/**
 * @Auther: ${Lime}
 * @Date: 2019/3/21 20:17
 * @Description:
 */
public class loginPojo {
  int id;
  String username;
  String password;
  Integer age;
  String iphone;
  String sex;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getIphone() {
    return iphone;
  }

  public void setIphone(String iphone) {
    this.iphone = iphone;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  @Override
  public String toString() {
    return "loginPojo{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", age=" + age +
            ", iphone='" + iphone + '\'' +
            ", sex='" + sex + '\'' +
            '}';
  }
}
