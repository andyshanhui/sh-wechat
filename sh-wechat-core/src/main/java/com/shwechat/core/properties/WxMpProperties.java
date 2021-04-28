package com.shwechat.core.properties;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * 
 * @ClassName: WxMpProperties
 * @Description: 微信公众号接入相关配置属性.
 * @date 2021-04-20 10:12:19
 */
@Data
@ConfigurationProperties(prefix = "wx.mp")
public class WxMpProperties {
	
	/**
     * 多个公众号配置信息
     */
    private List<MpConfig> configs;

    @Data
    public static class MpConfig {
        /**
         * 设置微信公众号的appid
         */
        private String appId;

        /**
         * 设置微信公众号的app secret
         */
        private String secret;

        /**
         * 设置微信公众号的token
         */
        private String token;

        /**
         * 设置微信公众号的EncodingAESKey
         */
        private String aesKey;
    }

}
