package com.github.houbb.opencc4j.support.data;

import com.github.houbb.opencc4j.model.data.DataInfo;
import com.github.houbb.opencc4j.support.data.impl.TSCharData;
import com.github.houbb.opencc4j.support.instance.impl.InstanceFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
public class TSCharDataTest {

    @Test
    public void singletonTest() {
        DataInfo dataInfo = InstanceFactory.getInstance().singleton(TSCharData.class).data();
        Assert.assertEquals(4189, dataInfo.getDataMap().size());
    }

}
