package pojo;
import java.math.BigDecimal;
public class company {
    private BigDecimal id;
    private String name;
    private String sex;
    private String job;
    private BigDecimal sal;

    @Override
    public String toString() {
        return "company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    public company(BigDecimal id, String name, String sex, String job, BigDecimal sal) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.job = job;
        this.sal = sal;
    }
}
