package com.cow.config;


import com.alipay.api.request.AlipayTradePagePayRequest;

import com.cow.util.general.PropertiesUtil;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 *
 */
@Data
@Component
public class AlipayConfig {
    /**
     * 沙箱appId
     */
    public static final String APPID = "9021000133636705";

    /**
     * 请求网关  固定
     */
    public static final String URL = "https://openapi-sandbox.dl.alipaydev.com/gateway.do";

    /**
     * 编码
     */
    public static final String CHARSET = "UTF-8";

    /**
     * 返回格式
     */
    public static final String FORMAT = "json";

    /**
     * RSA2
     */
    public static final String SIGNTYPE = "RSA2";

    /**
     * 异步通知地址
     */
    public static final String NOTIFY_URL = "http://" + PropertiesUtil.getDomain() + "/alipay/notify";

    /**
     * 同步地址
     */
    public static final String RETURN_URL = "http://" + PropertiesUtil.getDomain() + "/alipay" +
            "/success";

    /**
     * 应用私钥 pkcs8格式
     */
    public static final String RSA_PRIVATE_KEY =
           "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCZKPXQoN0/GYb2SIDI2DMtFPYqFGTucYS1d61I4xRIfuVabJI4L3zU5qWFoOLRbYKfayef95P7DgkF+cZPZjyi3JQMQmug7Et1gXFj4V1gznBskbpaHGpw/TT7V9SfyiuC5HvFQF9TTCsXB4dspLFgqnRKAAN8vWmIcDUa9V7+VQFVZKKfNIBlznCf8wjYgdamuFeuYGQxoTqeDSWukodW3OevuMjX3XfuT4rrVXkGWhHLCcaIJbMN3LuzzHewpuEcJzpLSsBKsHp64F8WWQqU7pGrZ0Jnz8uTfEH5yw28Ujy72HS5lqNQO6vccZASCfQr88+O+dgLLK2s1uB0bN29AgMBAAECggEADHABFkIZ9WfTR+i3XJgB/+U14FDrqVlal4nybnrSSNjVMzSh4yIoFvnr8yAPi0ZDV0LSYvEt+TM4lF2mNwhsYCVdeGlkaBsIPbCXTq8ccCITix2CbpLkKezGAqstPxSh1+1KB8ikdRU4YpRf8Pim1tzAuMmrftO64DOMfHX0kt6ffymlDwiDwDcAGdwu0tzOcYQ2WN7nJDhtQZ1QqFnu/0mi3TNWBgTB49lpl9BaWd4XQOxwoyVqiG92fom+D/lAFOeQnrRYXFLOlLjEahv7IzDRKKBmIx2J9WYhdzdlnJVRnFFl2Rcttc/oVkaPr8hMKTHaYbnaoP+H6dCj2510QQKBgQDyGzIP5IvBW+go0QXL2HVH5iv8B9PAGxrtMPQqh9BAW18A9Xp3tYf3RsilXJQeGbZWlCLpuaRTaIKSbpNi/Jdhsl06OjkhbC6+NCSFwTzOomoepNBwXFpWqBVj1kY3t2fzMGl7NpiGH/3nyJtmV9Gugb3xMfkv/ZPBK7arZcNlSQKBgQCh8wwtTAtqDhitKpiLpSdV+drFbGG7s0MtSrmhHr7YYn8MZj9Q+QZUqOhITPQ9SGW4wrObT7SR3yvXl8FHCC0gQnVc/LkoUCoMudNdSGRseWXvioG3COB7CBEDBDYBN0gTyKrOStsnPgRTH+pFg5OSpyGW//YnMcM1v1fs5ETY1QKBgEXbbwCC84hhWoWcek2tMXoDgiGAqKq/p29VNr6m3YIUWz9NlX7BFHBXLkH4iox84s3shH5oIHAosbRKz6A6PfvkmV3Zuu5X5szfAsLNVRxSZMheyf4Bx9dFPJbIFw6wjv/usiDpSe05gevFSIGpSUlPCl10C/C6/E06rcSa4lxxAoGAbKUe4CyJ48Y9K77Nw7EyKG2MJLHHByMFyBa/XaXApm29idX2WB4X7ye5XPezSoGNLFwCHglkvA+Z2/KEyWBk1aWAErfAh5jv/MWVVJlCNbtjdUXYK7Ca2C7bKsjiagJqKkuOuwJg73ydbh6VDbltgQ76a9CflD/AFAiftd6ViVkCgYEA4qRnQpY/+hHtC8VUk9mY4cRerm6IfobdSXzZZ4olykQNepx6wHj/04ljhlHdJ1X1uwzd6hq2l3uhccnKw2xkMm3MJeZNZo5i6Y6XouIS1G2tfW2e/cnFGGctNuzjNdE+RydKI/mHdtZktRBerJCT5HyhGACq1Bcxh6td6B5uHlo=";

    /**
     * 沙箱支付宝公钥z'z'z
     */
    public static final String ALIPAY_PUBLIC_KEY =
           "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAluCfPqZJlQZqDeFxlqN9kDd4wLq0ApmCiSjkSeXctbUU53vNPcplexjTfLccsjEhVPHChwRGiKsbjDbLdVB3gYJ9Z0+RcmhGAoWnDWy3QHHdIxvFponZG5eISkMqQa02xp+xB9IIoiJDLUoSn9bHksLcDSNPNZupBLzYKdycBMbT2gxcmTU3g0JAoee8Ba6PKY+x/xv+ysl4M4oYQWLR5H7YXtFgp3rqUH07zIkq5FX76KpZf5pEGFJisjEEX4s0jLdT6PxJ3W+I6lrOyBABtByHIAJvYlXzPIkgYhgCK71wrNaqO/IHrXGsm5jGyuAjvjv1McBr8bvLl0syKJpX2QIDAQAB";
    private AlipayConfig() {
    }


    //多列模式的 aliPayRequest
    @Bean
    public AlipayTradePagePayRequest alipayTradePagePayRequest(){
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        return alipayRequest;
    }
}
