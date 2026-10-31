package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DishService {
    /**
     * 新增菜品和对应的口味
     * @param dishDTO 菜品DTO
     */
    public void saveWithFlavor(DishDTO dishDTO);

    /**
     * 分页查询菜品
     * @param dishPageQueryDTO 菜品分页查询DTO
     * @return
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 批量删除菜品
     * @param ids 菜品id列表
     */
    void deleteBatch(List<Long> ids);

    /**
     * 根据id查询菜品和对应的口味
     * @param id 菜品id
     * @return
     */
    DishVO getByIdWithFlavor(Long id);

    /**
     * 修改菜品和对应的口味
     * @param dishDTO 菜品DTO
     */
    void updateWithFlavor(DishDTO dishDTO);
}
