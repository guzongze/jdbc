package crud.test.demo.pojo;

/**
 * @Auther: ${Lime}
 * @Date: 2019/4/2 11:36
 * @Description:
 */
public class userPojo {
  int id;
  String username;
  Integer age;
  String sex;
  String iphone;

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

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getIphone() {
    return iphone;
  }

  public void setIphone(String iphone) {
    this.iphone = iphone;
  }

  @Override
  public String toString() {
    return "userPojo{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", age=" + age +
            ", sex='" + sex + '\'' +
            ", iphone='" + iphone + '\'' +
            '}';
  }
}

