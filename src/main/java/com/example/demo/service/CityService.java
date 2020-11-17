package com.example.demo.service;

import java.util.List;

import com.example.demo.vo.CityVo;

/**
 * @author 作者 zuoruibo:
 * @date 创建时间：2020年11月17日 上午10:19:59
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public interface CityService {
	public List<CityVo> listCities();

	public CityVo getCityById(Long id);
}
