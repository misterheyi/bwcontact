package org.jeewx.api.coupon.qrcode;


import org.jeewx.api.core.exception.WexinReqException;
import org.jeewx.api.core.req.WeiXinReqService;
import org.jeewx.api.coupon.qrcode.model.Getticket;
import org.jeewx.api.coupon.qrcode.model.GetticketRtn;
import org.jeewx.api.coupon.qrcode.model.QrcodeInfo;
import org.jeewx.api.coupon.qrcode.model.QrcodeRtnInfo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;


/**
 * 微信卡券 - 卡券投放
 * @author lihongxuan
 *
 */
public class JwQrcodeAPI {

	/**
	 * 创建二维码
	 * @throws WexinReqException 
	 */
	public static QrcodeRtnInfo doAddQrcode(String accesstoken,QrcodeInfo qrcodeInfo) throws WexinReqException {
		if (accesstoken != null) {
			qrcodeInfo.setAccess_token(accesstoken);
			JSONObject result = WeiXinReqService.getInstance().doWeinxinReqJson(qrcodeInfo);
			QrcodeRtnInfo qrcodeRtnInfo = JSON.parseObject(result.toJSONString(), QrcodeRtnInfo.class);
			return qrcodeRtnInfo;
		}
		return null;
	}

	/**
	 * 获取api_ticket
	 */
	public static GetticketRtn doGetticket(String accesstoken)throws WexinReqException {
		if (accesstoken != null) {
			Getticket gk = new Getticket();
			gk.setAccess_token(accesstoken);
			JSONObject result = WeiXinReqService.getInstance().doWeinxinReqJson(gk);
			GetticketRtn getticketRtn = JSON.parseObject(result.toJSONString(), GetticketRtn.class);
			return getticketRtn;
		}
		return null;
	}

}
 