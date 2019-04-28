package crud.test.demo.pojo;

/**
 * @Auther: ${Lime}
 * @Date: 2019/3/19 11:05
 * @Description:
 */
public class practicePojo {
  int id;
  String name;
  Integer age;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "practicePojo{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
