package com.hjxxlearn.gulimall.member.dao;

import com.hjxxlearn.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hjxx
 * @email 1332530191@qq.com
 * @date 2024-05-31 16:38:28
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
