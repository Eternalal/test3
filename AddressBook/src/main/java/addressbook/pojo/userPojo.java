package addressbook.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "p_user")
public class userPojo {
    @Id
    Integer id;
    String name;
    String phone;
    String address;
}
