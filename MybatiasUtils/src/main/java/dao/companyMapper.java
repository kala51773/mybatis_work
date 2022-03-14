package dao;
import pojo.company;
import java.math.BigDecimal;
import java.util.List;

public interface companyMapper {
     List<company> getcompanyList();
     company getuserbyid(BigDecimal id);
     int adduser(company user);
     int updateuser(company user);
     int deleteuser(BigDecimal id);

}
