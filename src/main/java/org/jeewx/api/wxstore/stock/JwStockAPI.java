package org.jeewx.api.wxstore.stock;

import org.jeewx.api.core.common.WxstoreUtils;
import org.jeewx.api.wxstore.stock.model.StockInfo;
import org.jeewx.api.wxstore.stock.model.StockRtnInfo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * 微信小店 - 库存
 * @author zhangdaihao
 *
 */
public class JwStockAPI {
	// 增加库存
	private static String add_stock_url = "https://api.weixin.qq.com/merchant/stock/add?access_token=ACCESS_TOKEN";
	// 减少库存
	private static String sub_stock_url = "https://api.weixin.qq.com/merchant/stock/reduce?access_token=ACCESS_TOKEN";
		
	/**
	 * 增加库存
	 */
	public static StockRtnInfo doAddStock(String newAccessToken, StockInfo stockInfo) {
		if (newAccessToken != null) {
			String requestUrl = add_stock_url.replace("ACCESS_TOKEN", newAccessToken);
			JSONObject result = WxstoreUtils.httpRequest(requestUrl, "POST", JSON.toJSONString(stockInfo));
			StockRtnInfo stockRtnInfo = JSON.parseObject(result.toJSONString(), StockRtnInfo.class);
			return stockRtnInfo;
		}
		return null;
	}

	/**
	 * 减少库存
	 */
	public static StockRtnInfo doSubStock(String newAccessToken, StockInfo stockInfo) {
		if (newAccessToken != null) {
			String requestUrl = sub_stock_url.replace("ACCESS_TOKEN", newAccessToken);
			JSONObject result = WxstoreUtils.httpRequest(requestUrl, "POST", JSON.toJSONString(stockInfo));
			StockRtnInfo stockRtnInfo = JSON.parseObject(result.toJSONString(), StockRtnInfo.class);
			return stockRtnInfo;
		}
		return null;
	}

}
 