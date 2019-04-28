package crud.test.demo.service.impl;

import crud.test.demo.dao.practiceDao;
import crud.test.demo.pojo.loginPojo;
import crud.test.demo.pojo.practicePojo;
import crud.test.demo.pojo.userPojo;
import crud.test.demo.service.practiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: ${Lime}
 * @Date: 2019/3/19 11:19
 * @Description:
 */
@Service
public class servicePractice implements practiceService {

  @Autowired
  private practiceDao practicedao;

  @Override
  //查询
  public List<practicePojo> selectpractice(){

    return practicedao.selectpractice();
  }

  //增加
  @Override
  public void insertpractice(practicePojo pojo) {

    practicedao.insertpractice(pojo);
  }

  //删除
  @Override
  public void deletepractice(int id) {

    practicedao.deletepractice(id);
  }

  //查询id
  @Override
  public practicePojo findbyid(int id) {
    return practicedao.findbyid(id);
  }

  //修改
  @Override
  public void updatepractice(practicePojo pojo) {
    practicedao.updatepractice(pojo);
  }

  //注册
  @Override
  public void registered(loginPojo pojo) {
    practicedao.registered(pojo);
  }

  //登陆
  @Override
  public List<loginPojo> login() {
    return practicedao.login();
  }

  //查询所有用户
  public List<loginPojo> user(){
    return practicedao.user();
  }

  //新增用户
  @Override
  public void userinsert(loginPojo pojo) {
    practicedao.userinsert(pojo);
  }

  @Override
  public void userdelete(int id) {
    practicedao.userdelete(id);
  }

  @Override
  public loginPojo userid(Integer id) {
    return practicedao.userid(id);
  }

  @Override
  public void userupdate(loginPojo pojo) {
    practicedao.userupdate(pojo);

  }


}
