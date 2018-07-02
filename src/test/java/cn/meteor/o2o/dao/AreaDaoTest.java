package cn.meteor.o2o.dao;

import cn.meteor.o2o.BaseTest;
import cn.meteor.o2o.entity.Area;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class AreaDaoTest extends BaseTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void queryArea() {
        List<Area> areas = areaDao.queryArea();
        Assert.assertEquals(4, areas.size());
    }
}