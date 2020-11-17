package com.example.demo.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.CityDao;
import com.example.demo.vo.CityVo;

/**
 * @author 作者 zuoruibo:
 * @date 创建时间：2020年11月17日 上午10:17:34
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Component
public class CityDaoImpl implements CityDao {

	@Autowired
	public SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<CityVo> listCities() {
		return this.sqlSessionTemplate.selectList("listCities");
	}

	@Override
	public CityVo getCityById(Long id) {
		return this.sqlSessionTemplate.selectOne("getCityById", id);
	}
}
