package crud.test.demo.service;

import crud.test.demo.pojo.loginPojo;
import crud.test.demo.pojo.practicePojo;
import crud.test.demo.pojo.userPojo;

import java.util.List;

/**
 * @Auther: ${Lime}
 * @Date: 2019/3/19 11:15
 * @Description:
 */
public interface practiceService {
   //主页查询
   List<practicePojo> selectpractice();

   //插入
   void insertpractice(practicePojo pojo);

   //删除
   void deletepractice(int id);

   //查询id
   practicePojo findbyid(int id);

   //修改
   void updatepractice(practicePojo pojo);

   //注册
   void registered (loginPojo pojo);

   //登陆
   List<loginPojo> login();

   //所有用户查询
   List<loginPojo> user();

   //新增用户
   void userinsert(loginPojo pojo);

   //删除用户
   void userdelete(int id);

   //查用户id
   loginPojo userid(Integer id);

   //修改用户
   void userupdate(loginPojo pojo);
}
