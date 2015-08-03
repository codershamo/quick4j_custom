package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.Menus;
import com.eliteams.quick4j.web.model.MenusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenusMapper {
    int countByExample(MenusExample example);

    int deleteByExample(MenusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Menus record);

    int insertSelective(Menus record);

    List<Menus> selectByExample(MenusExample example);

    Menus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Menus record, @Param("example") MenusExample example);

    int updateByExample(@Param("record") Menus record, @Param("example") MenusExample example);

    int updateByPrimaryKeySelective(Menus record);

    int updateByPrimaryKey(Menus record);
}