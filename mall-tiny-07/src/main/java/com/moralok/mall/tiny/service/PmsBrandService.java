package com.moralok.mall.tiny.service;

import com.moralok.mall.tiny.mbg.model.PmsBrand;

import java.util.List;

/**
 * PmsBrandService
 *
 * @author moralok
 * @date 2019/7/31
 */
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
