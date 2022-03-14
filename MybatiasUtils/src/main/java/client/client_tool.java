package client;

import pojo.company;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;
import client.func;
public class client_tool {

    Scanner input = null;
    private company user;

    client_tool(){
        input=new Scanner(System.in);
    }
    public void run(){
        while (true){
        print();
        int key =input.nextInt();
        switch (key){
            case 0:
                insertuser();
                break;
            case 1:
                showAll();
                break;
            case 2:
                search();
                break;
            case 3:
                updateuser();
                break;
            case 4:
               deletebyid();
               break;
            case 5:
                return;
            default:
                break;
        }
    }
    }
    public void print(){
        System.out.println("输入0新增员工");
        System.out.println("输入1查询全部数据");
        System.out.println("输入2通过id号查询数据");
        System.out.println("输入3通过id号修改数据");
        System.out.println("输入4通过id号删除数据");
        System.out.println("输入5退出程序");
    }
    public void showAll(){
        List<company> showall = func.showall();
        if(showall.isEmpty())
            System.out.println("表空了");
        for (company i:showall
             ) {
            System.out.println(i);
        }

    }
    public void search(){
        System.out.println("请输入需要查询员工的id号");
        BigDecimal num = new BigDecimal(input.nextInt());
        company selectuserbtid = func.selectuserbtid(num);
        if(selectuserbtid!=null)
        System.out.println(selectuserbtid);
        else
            System.out.println("查无此人");
    }
    public void updateuser(){
        System.out.println("请输入需要修改员工的id号");
        BigDecimal num = new BigDecimal(input.nextInt());
        System.out.println("请输入修改后姓名");
        String name = input.next();
        System.out.println("请输入修改后性别");
        String sex = input.next();
        System.out.println("请输入修改后岗位");
        String job = input.next();
        System.out.println("请输入修改后薪资");
        BigDecimal sal = new BigDecimal(input.nextInt());
        int res = func.updateuser(new company(num,name,sex,job,sal));
        if(res==1)
            System.out.println("修改成功");
        else
            System.out.println("修改失败");
    }
    public void insertuser(){
        System.out.println("请输入需要新员工的id号");
        BigDecimal num = new BigDecimal(input.nextInt());
        System.out.println("请输入新员工姓名");
        String name = input.next();
        System.out.println("请输入新员工性别");
        String sex = input.next();
        System.out.println("请输入新员工岗位");
        String job = input.next();
        System.out.println("请输入新员工薪资");
        BigDecimal sal = new BigDecimal(input.nextInt());
        int res = func.adduser(new company(num,name,sex,job,sal));
        if(res==1)
            System.out.println("添加成功");
        else
            System.out.println("添加失败");
    }

    public void deletebyid(){
        System.out.println("请输出需要删除员工的id");
        BigDecimal num = new BigDecimal(input.nextInt());
        int res =func.deleteuser(num);
        if(res==1)
            System.out.println("删除成功");
        else
            System.out.println("删除失败");
    }




}
