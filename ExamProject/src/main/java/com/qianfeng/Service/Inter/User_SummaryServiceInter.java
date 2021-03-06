package com.qianfeng.Service.Inter;

import com.qianfeng.domain.*;

import java.io.IOException;
import java.util.List;

public interface User_SummaryServiceInter {
    List<ExamineeInfo> findIdByName();
    List<User_Summary> findAll(String examinee_name);

    Ability findAbilityByNum(String examinee_name);

    List<Error_Rate> findErrorByCategory(String category_name);
    // hbase中详情信息查询
    List<Xiangqing> findAllByExaminee_Num2Hbase(String startRow, String endRow) throws IOException, Exception;
    // hbase中汇总信息查询
    List<Huizong> findAllByClass_name2Hbase(String startRow,String endRow) throws IOException;

}
