package com.gushi.unitrust;

import com.sheca.cryptoDevice.shecaCryptoDevice;
import com.sheca.cryptoDevice.shecaCryptoDeviceFactory;
import com.sheca.cryptoDevice.shecaDatechStd;
import com.sheca.cryptoDevice.shecaLocalStd;
import com.sheca.safeengine.shecaUtils;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.util.Map;
import java.util.Random;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/6/7
 */
@SpringBootTest
public class UniTrustApplicationTests {

    private static shecaCryptoDevice datechCryptoDevice = shecaCryptoDeviceFactory.getInstance(shecaCryptoDeviceFactory.K_DA_PROVIDER_NAME);
    private static shecaCryptoDevice swxaCryptoDevice = shecaCryptoDeviceFactory.getInstance(shecaCryptoDeviceFactory.K_SWXA_PROVIDER_NAME);
    private static shecaCryptoDevice local = shecaCryptoDeviceFactory.getInstance(shecaCryptoDeviceFactory.K_LOCAL_PROVIDER_NAME);

    @Test
    public void testKeyPiar() {
        //生成RSA算法密钥对
        //不适用加密机第一个参数keyIdx必须是0,只有本地加密可以生成
        KeyPair keyPair = datechCryptoDevice.genRSAKeyPairFromCryptoDevice(0, 1024);
//        ((shecaDatechStd)cryptoDevice).export
        Map map = ((shecaLocalStd) local).exportRSAKeyPair(keyPair);

//        KeyPair keyPair = datechCryptoDevice.genRSAKeyPairFromCryptoDevice(0, 2048);
//        ((shecaDatechStd)datechCryptoDevice).exportRSAKeyPair(keyPair);
        System.out.println("prikey: " + map.get(shecaLocalStd.K_NAME_PRIKEY));
        System.out.println("pubkey: " + map.get(shecaLocalStd.K_NAME_PUBKEY));
    }

    @Test
    public void testRandom() throws UnsupportedEncodingException {
        byte[] bytes = datechCryptoDevice.genRandomBytesByDevice(0, 12);
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.setSeed(bytes);
        int i = secureRandom.nextInt(32);
        System.out.println(i);
    }

    @Test
    public void testRSASign() throws UnsupportedEncodingException {
        KeyPair keyPair = swxaCryptoDevice.genRSAKeyPairFromCryptoDevice(1, 2048);
        String plain = "12345566788";
        byte[] bytes = swxaCryptoDevice.doRSASignWithDeviceKeyPair(keyPair, plain.getBytes("utf-8"), shecaUtils.K_SGD_SHA256_RSA);
        System.out.println(new String(bytes,"utf-8"));
    }
}
