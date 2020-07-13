package com.zj.utils;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author 张建 119855181@qq.com
 * @version V1.0
 * @Package com.zj.utils
 * @date 2020/4/28 23:47
 * @Copyright © 安徽华泓信息技术有限公司
 * @description: 设置分页返回PagedGridResult对象的工具类
 */

public class PagedUtil {
    /**
     * @Description: 设置分页返回PagedGridResult对象
     * @param list:
     * @param page:
     * @return: null
     * @Author: 张建 (119855181@qq.com)
     * @date: 2020/4/28
     */
    public static PagedGridResult setPagedGridResult(List<?> list, Integer page){
        PageInfo<?> pageList = new PageInfo<>(list);
        PagedGridResult grid =new PagedGridResult();
        grid.setPage(page);
        grid.setTotal(pageList.getPages());
        grid.setRecords(pageList.getTotal());
        grid.setRows(list);
        return grid;
    }
}
