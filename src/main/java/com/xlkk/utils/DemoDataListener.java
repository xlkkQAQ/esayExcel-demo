package com.xlkk.utils;

/**
 * @author xlkk
 * @date 2022/8/2 0002 11:22
 * @Description:
 */

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.metadata.data.DataFormatData;
import com.alibaba.excel.metadata.data.ReadCellData;
import com.alibaba.excel.read.listener.ReadListener;
import com.xlkk.pojo.DemoData;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;


@Slf4j
public class DemoDataListener implements ReadListener<DemoData> {


    @Override
    public void invoke(DemoData demoData, AnalysisContext analysisContext) {
        System.out.println("****" + demoData);

    }

    @Override
    public void invokeHead(Map<Integer, ReadCellData<?>> headMap, AnalysisContext context) {
        Map<Integer, String> map = ConverterUtils.convertToStringMap(headMap, context);
        System.out.println("表头" + map);
    }

    /**
     * 读取表头内容
     */


    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        System.out.println("读取Excel完毕");
    }
}
