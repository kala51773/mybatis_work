package client;
import dao.companyMapper;
import org.apache.ibatis.session.SqlSession;
import pojo.company;
import tool.MybatisUtils;
import java.math.BigDecimal;
import java.util.List;

public class func {


    public static company selectuserbtid(BigDecimal num){
        SqlSession sqlSessionFactory = MybatisUtils.getSqlSessionFactory();
        companyMapper mapper = sqlSessionFactory.getMapper(companyMapper.class);
        company getuserbyid = mapper.getuserbyid(num);
        sqlSessionFactory.close();
        return  getuserbyid;

    }

    public static int adduser(company user){
        SqlSession sqlSessionFactory = MybatisUtils.getSqlSessionFactory();
        companyMapper mapper = sqlSessionFactory.getMapper(companyMapper.class);
        int res =mapper.adduser(user);
        sqlSessionFactory.commit();
        return  res;
//        test();
    }
    public static List<company> showall(){
        SqlSession sqlSessionFactory = MybatisUtils.getSqlSessionFactory();
        companyMapper mapper = sqlSessionFactory.getMapper(companyMapper.class);
        List<company> companies = mapper.getcompanyList();
        sqlSessionFactory.commit();
        sqlSessionFactory.close();
        return companies;
    }

    public static int updateuser(company user){
        SqlSession sqlSessionFactory = MybatisUtils.getSqlSessionFactory();
        companyMapper mapper = sqlSessionFactory.getMapper(companyMapper.class);
        int res = mapper.updateuser(user);
        sqlSessionFactory.commit();
        sqlSessionFactory.close();
        return res;
    }

    public static int deleteuser(BigDecimal num){
        SqlSession sqlSessionFactory = MybatisUtils.getSqlSessionFactory();
        companyMapper mapper = sqlSessionFactory.getMapper(companyMapper.class);
        int res=mapper.deleteuser(num);
        sqlSessionFactory.commit();
        sqlSessionFactory.close();
        return  res;

    }
}
