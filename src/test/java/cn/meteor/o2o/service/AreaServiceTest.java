package cn.meteor.o2o.service;

import cn.meteor.o2o.BaseTest;
import cn.meteor.o2o.entity.Area;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class AreaServiceTest extends BaseTest {

    @Autowired
    private AreaService areaService;

    @Test
    public void getAreaList() {
        List<Area> areas = areaService.getAreaList();
        Assert.assertEquals(4, areas.size());
    }
}