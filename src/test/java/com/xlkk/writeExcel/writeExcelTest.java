package com.xlkk.writeExcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.util.ListUtils;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.xlkk.pojo.DemoData;
import com.xlkk.utils.TestFileUtil;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

/**
 * @author xlkk
 * @date 2022/8/2 0002 16:28
 * @Description:
 */
public class writeExcelTest {
    private List<DemoData> data() {
        List<DemoData> list = ListUtils.newArrayList();
        for (int i = 0; i < 10; i++) {
            DemoData data = new DemoData();
            data.setString("字符串" + i);
            data.setDate(new Date());
            data.setDoubleData(0.56);
            list.add(data);
        }
        return list;
    }
    /**
     * 最简单的写
     * <p>
     * 1. 创建excel对应的实体对象 参照{@link DemoData}
     * <p>
     * 2. 直接写即可
     */
    @Test
    public void simpleWrite() {
        // 实现excel写操作
        //1.设置写入文件夹地址和excel文件名称
        String fileName = "E://desktop//test.xlsx";
        //调用easyExcel里面的方法实现写操作
        //2个参数，第一个参数是文件名称，第二个参数是实体类
        EasyExcel.write(fileName, DemoData.class).sheet("学生信息表").doWrite(data());
    }
}
