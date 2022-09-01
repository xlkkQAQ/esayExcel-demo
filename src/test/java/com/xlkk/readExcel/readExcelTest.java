package com.xlkk.readExcel;

import com.alibaba.excel.EasyExcel;
import com.xlkk.pojo.DemoData;
import com.xlkk.utils.DemoDataListener;
import com.xlkk.utils.TestFileUtil;
import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author xlkk
 * @date 2022/8/2 0002 11:19
 * @Description:
 */
public class readExcelTest {
    /**
     * 最简单的读
     * <p>1. 创建excel对应的实体对象 参照{@link DemoData}
     * <p>2. 由于默认一行行的读取excel，所以需要创建excel一行一行的回调监听器，参照{@link DemoDataListener}
     * <p>3. 直接读即可
     */
    @Test
    public void simpleRead() {
        // 实现excel写操作
        //1.设置写入文件夹地址和excel文件名称
        String fileName = "E://desktop//test.xlsx";
        //调用easyExcel里面的方法实现写操作
        //2个参数，第一个参数是文件名称，第二个参数是实体类
        EasyExcel.read(fileName, DemoData.class, new DemoDataListener()).sheet().doRead();

    }
}
