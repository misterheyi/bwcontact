package com.bw.contact.timer;

import org.jeewx.api.wxbase.wxtoken.JwTokenAPI;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.bw.contact.util.WeiChatToken;
import com.bw.contact.util.WeiChatTokenStore;

/**
 * 定时任务刷新微信TOKEN
 * 
 * @ClassName: WeiChatInitTimer
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author heyi
 * @date 2015年12月8日 下午3:21:33
 *
 */
@Component
public class WeiChatInitTimer {

	@Scheduled(cron="0/20 * *  * * ? ")   //每5秒执行一次  
	public void doit() {
		try {
			String reStr = JwTokenAPI.getAccessToken("wxb31aae2e04c21151","687c449eebc3a8b4f198153371a55a47");
			WeiChatTokenStore.TOKEN = JSON.parseObject(reStr,WeiChatToken.class);
		} catch (Exception e) {
			System.out.println("获取微信TOKEN失败,请检查网络");
		}
	}
}
