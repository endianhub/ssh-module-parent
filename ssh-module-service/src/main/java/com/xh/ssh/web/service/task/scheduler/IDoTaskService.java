package com.xh.ssh.web.service.task.scheduler;

import com.xh.ssh.web.mapper.model.WebTask;

/**
 * <b>Title: </b>
 * <p>Description: </p>
 * 
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2018年9月12日
 */
public interface IDoTaskService {

	public void execute(WebTask task);
}
