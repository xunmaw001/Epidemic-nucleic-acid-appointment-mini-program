package com.dao;

import com.entity.XiangmuleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmuleixingVO;
import com.entity.view.XiangmuleixingView;


/**
 * 项目类型
 * 
 * @author 
 * @email 
 * @date 2022-03-04 19:59:21
 */
public interface XiangmuleixingDao extends BaseMapper<XiangmuleixingEntity> {
	
	List<XiangmuleixingVO> selectListVO(@Param("ew") Wrapper<XiangmuleixingEntity> wrapper);
	
	XiangmuleixingVO selectVO(@Param("ew") Wrapper<XiangmuleixingEntity> wrapper);
	
	List<XiangmuleixingView> selectListView(@Param("ew") Wrapper<XiangmuleixingEntity> wrapper);

	List<XiangmuleixingView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmuleixingEntity> wrapper);
	
	XiangmuleixingView selectView(@Param("ew") Wrapper<XiangmuleixingEntity> wrapper);
	

}
