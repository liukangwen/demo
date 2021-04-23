package com.example.demo;

import com.example.demo.entity.SysUser;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@SpringBootTest
@RunWith(SpringRunner.class)
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	private static Logger log = LoggerFactory.getLogger(DemoApplicationTests.class);

//	@Autowired
//	private SysUserService mpUserService;
//
//    @Test
//    public void test1() {
//        // 插入新记录
//        SysUser mpUser = new SysUser();
//        mpUser.setId(1L);
//        mpUser.setUserEmail("test66@baomidou.com");
//        mpUser.setUserName("David Hong");
//        mpUserService.save(mpUser);
//        // 或者
//        mpUser.insertOrUpdate();
//        // 更新完成后，mpUser对象的id会被补全
//        log.info("mpUser={}", mpUser.toString());
//
//    }
//
//    @Test
//    public void test2() {
//        // 通过主键id查询
//        MpUser mpUser = mpUserService.getById(1);
//        log.info("mpUser={}", mpUser.toString());
//    }
//
//    @Test
//    public void test3() {
//        // 条件查询，下面相当于xml中的 select * from mp_user where name = 'Tom' and age = '28' limit 1
//        MpUser mpUser = mpUserService.getOne(new QueryWrapper<MpUser>().eq("name", "Tom").eq("age", "28").last("limit 1"));
//        log.info("mpUser={}", mpUser.toString());
//        // 批量查询
//        List<MpUser> mpUserList = mpUserService.list();
//        System.out.println("------------------------------all");
//        mpUserList.forEach(System.out::println);
//        // 分页查询
//        int pageNum = 1;
//        int pageSize = 10;
//        IPage<MpUser> mpUserIPage = mpUserService.page(new Page<>(pageNum, pageSize), new QueryWrapper<MpUser>().gt("age", "20"));
//        // IPage to List
//        List<MpUser> mpUserList1 = mpUserIPage.getRecords();
//        System.out.println("------------------------------page");
//        mpUserList1.forEach(System.out::println);
//        // 总页数
//        long allPageNum = mpUserIPage.getPages();
//        System.out.println("------------------------------allPageNum");
//        System.out.println(allPageNum);
//    }
//
//    @Test
//    public void test4() {
//        MpUser mpUser = mpUserService.getById(2);
//        // 修改更新
//        mpUser.setName("广东广州");
//        //mpUserService.updateById(mpUser);
//        // 或者
//        mpUser.insertOrUpdate();
//        // 通过主键id删除
//        mpUserService.removeById(1);
//        // 或者
//        //mpUser.deleteById();
//    }
}
