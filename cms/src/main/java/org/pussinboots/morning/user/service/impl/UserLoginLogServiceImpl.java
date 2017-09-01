package org.pussinboots.morning.user.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.pussinboots.morning.user.entity.WebUserLoginLog;
import org.pussinboots.morning.user.mapper.WebUserLoginLogMapper;
import org.pussinboots.morning.user.service.IUserLoginLogService;
import org.springframework.stereotype.Service;

/**
 * 
* 项目名称：morning-user-service   
* 类名称：UserLoginLogServiceImpl   
* 类描述：WebUserLoginLog / 用户登录表 业务逻辑层接口实现
* 创建人：陈星星   
* 创建时间：2017年4月8日 下午2:16:47   
*
 */
@Service("webUserLoginLogService")
public class UserLoginLogServiceImpl extends ServiceImpl<WebUserLoginLogMapper, WebUserLoginLog> implements IUserLoginLogService {
	
}
