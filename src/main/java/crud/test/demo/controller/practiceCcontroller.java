package crud.test.demo.controller;

import crud.test.demo.pojo.loginPojo;
import crud.test.demo.pojo.practicePojo;
import crud.test.demo.pojo.userPojo;
import crud.test.demo.service.practiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Auther: ${Lime}
 * @Date: 2019/3/19 11:04
 * @Description:
 */
@Controller

public class practiceCcontroller {

  @Autowired
  practiceService practiceservice;

  //查询
  @GetMapping(value = "/heard")
  public String heard(Model model){
    List<practicePojo> dao = practiceservice.selectpractice();
    model.addAttribute("dao", dao);
    return "heard";
  }

  //增加页面跳转
  @GetMapping(value = "/toadd")
  public String toadd(){
    return "insert";
  }

  //增加
  @PostMapping(value = "/add")
  public String add(practicePojo pojo){
    practiceservice.insertpractice(pojo);
    return "redirect:heard";
  }

  //自定义删除页面跳转
  @GetMapping(value = "/fdelete")
  public String fdelete(){
    return "fdelete";
  }

  //删除
  @GetMapping (value = "/delete")
  public String delete(practicePojo id){
    practiceservice.deletepractice(id.getId());
    return "redirect:heard";
  }

  //修改跳转
  @GetMapping(value = "/update")
  public String toupdate(Integer id,Model model){
    practicePojo pojo = practiceservice.findbyid(id);
    model.addAttribute("pojo", pojo);
    return "update";
  }

  //修改
  @PostMapping(value = "/supdate")
  public String supdate(practicePojo pojo){
    practiceservice.updatepractice(pojo);
    return "redirect:heard";
  }

  //注册跳转
  @GetMapping(value = "/registered")
  public String registered(){
  return "registered";
  }

  //注册
  @PostMapping(value = "/sregistered")
  public String sregistered(loginPojo pojo){
    practiceservice.registered(pojo);
    return "redirect:login";
  }
  //登陆跳转
  @GetMapping(value = "/login")
  public String login(){
    return "login";
  }
  //登陆
  @RequestMapping(value = "/slogin")
  public String slogin(HttpServletRequest request,HttpSession session){
    String name = request.getParameter("name");
    String pwd = request.getParameter("pwd");
    List<loginPojo> pojo = practiceservice.login();
    for (loginPojo p :pojo){
      if (name.equals(p.getUsername()) && pwd.equals(p.getPassword())){
        session.setAttribute(name, pwd);
        return "redirect:usermain";
      }else {
        return "redirect:login";
      }
    }
    return name+pwd;
  }

//查询所有用户
  @GetMapping("/usermain")
  public String user(Model model){
    List<loginPojo> pojos = practiceservice.user();
    model.addAttribute("pojos", pojos);
    return "usermain";
  }

  //增加页面跳转
  @GetMapping(value = "/usertoadd")
  public String touseradd(){
    return "insert";
  }

  //增加用户
  @PostMapping(value = "/useradd")
  public String useradd(loginPojo pojo){
    practiceservice.userinsert(pojo);
    return "redirect:usermain";
  }

  //删除用户
  @GetMapping("/userdelete")
  public String delete(loginPojo id){
    practiceservice.userdelete(id.getId());
    return "redirect:usermain";
  }

  //修改跳转
  @GetMapping(value = "/userupdate")
  public String userupdate(Integer id,Model model){
    loginPojo pojo = practiceservice.userid(id);
    model.addAttribute("pojo", pojo);
    return "userupdate";
  }

  //修改
  @PostMapping(value = "/suserupdate")
  public String update(loginPojo pojo){
    practiceservice.userupdate(pojo);
    return "redirect:usermain";
  }



}
