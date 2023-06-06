package cn.itcast.user.mapper;

import cn.itcast.user.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    /**
     * @description:增加一条记录---增加
     */
    @Insert("insert into tb_user values (#{username},#{address})")
    User addUser(User user);




    /**
     * @description:删除一条记录---删除
     */
    @Delete("delete from tb_user where id = #{id}")
    int deleteById(@Param("id") int id);


    /**
     * @description:根据id查询---查询
     */
    @Select("select * from tb_user where id = #{id}")
    User findById(@Param("id") Long id);
}