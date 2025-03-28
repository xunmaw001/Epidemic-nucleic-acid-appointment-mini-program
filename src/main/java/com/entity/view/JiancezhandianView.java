package com.entity.view;

import com.entity.JiancezhandianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 检测站点
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-04 19:59:21
 */
@TableName("jiancezhandian")
public class JiancezhandianView  extends JiancezhandianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiancezhandianView(){
	}
 
 	public JiancezhandianView(JiancezhandianEntity jiancezhandianEntity){
 	try {
			BeanUtils.copyProperties(this, jiancezhandianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
