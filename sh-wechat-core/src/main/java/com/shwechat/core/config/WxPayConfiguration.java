package com.shwechat.core.config;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.binarywang.wxpay.config.WxPayConfig;
import com.github.binarywang.wxpay.service.WxPayService;
import com.github.binarywang.wxpay.service.impl.WxPayServiceImpl;
import com.shwechat.core.properties.WxMaProperties;

import lombok.AllArgsConstructor;

/**
 * @author Binary Wang
 */
@Configuration
@ConditionalOnClass(WxPayService.class)
@EnableConfigurationProperties(WxMaProperties.class)
@AllArgsConstructor
public class WxPayConfiguration {
  private WxMaProperties wxMaProperties;

  @Bean
  @ConditionalOnMissingBean
  public WxPayService wxService() {
    WxPayConfig payConfig = new WxPayConfig();
    payConfig.setAppId(wxMaProperties.getConfigs().get(0).getAppId());
	payConfig.setMchId(wxMaProperties.getConfigs().get(0).getMchId());
	payConfig.setMchKey(wxMaProperties.getConfigs().get(0).getMchKey());
	payConfig.setKeyPath(wxMaProperties.getConfigs().get(0).getKeyPath());

    // 可以指定是否使用沙箱环境
    payConfig.setUseSandboxEnv(false);

    WxPayService wxPayService = new WxPayServiceImpl();
    wxPayService.setConfig(payConfig);
    return wxPayService;
  }

}
