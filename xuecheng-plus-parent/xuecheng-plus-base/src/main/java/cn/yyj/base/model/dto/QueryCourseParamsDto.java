package cn.yyj.base.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class QueryCourseParamsDto {

    @ApiModelProperty("审核状态")
    //审核状态
    private String auditStatus;

    @ApiModelProperty("课程名称")
    //课程名称
    private String courseName;

    //发布状态
    private String publishStatus;

}
