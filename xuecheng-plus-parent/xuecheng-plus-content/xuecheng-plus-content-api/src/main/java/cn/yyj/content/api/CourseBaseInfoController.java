package cn.yyj.content.api;

import cn.yyj.base.model.PageParams;
import cn.yyj.base.model.PageResult;
import cn.yyj.base.model.dto.QueryCourseParamsDto;
import cn.yyj.content.po.CourseBase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseBaseInfoController {
    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody(required = false) QueryCourseParamsDto queryCourseParams){

        return null;

    }
}
