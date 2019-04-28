package crud.test.demo.dao;

import crud.test.demo.pojo.loginPojo;
import crud.test.demo.pojo.practicePojo;
import crud.test.demo.pojo.userPojo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Auther: ${Lime}
 * @Date: 2019/3/19 11:05
 * @Description:
 */
public interface practiceDao {

  //查
  @Select("select * from name1")
   List<practicePojo> selectpractice();

  //增加
  @Insert("insert into name1(name,age) value(#{name},#{age})")
   void insertpractice(practicePojo pojo);

  //删除
  @Delete("delete from name1 where id = #{id}")
   void deletepractice(int id);

  //查id
  @Select("select * from name1 where id = #{id}")
  practicePojo findbyid(Integer id);

  //修改
  @Update("update name1 set name = #{name},age = #{age} where id = #{id}")
   void updatepractice(practicePojo pojo);

  //用户注册
  @Insert("insert into user(username,password) value(#{username},#{password})")
  void registered (loginPojo pojo);

  //用户登陆
  @Select("select * from user")
  List<loginPojo> login();

  //查询所有用户
  @Select("select * from user")
  List<loginPojo> user();

  //增加用户
  @Insert("insert into user(username,password,age,sex,iphone) value(#{username},#{password},#{age},#{sex},#{iphone})")
  void userinsert(loginPojo pojo);

  //删除用户
  @Delete("delete from user where id=#{id}")
  void userdelete(int id);

  //查询用户id
  @Select("select * from user where id = #{id}")
  loginPojo userid(Integer id);

  //修改用户
  @Update("update user set username = #{username},password = #{password},age=#{age},sex=#{sex},iphone=#{iphone} where id= #{id}")
  void userupdate(loginPojo pojo);
}
