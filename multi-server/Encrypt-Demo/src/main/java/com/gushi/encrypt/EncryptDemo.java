package com.gushi.encrypt;

import com.sheca.cryptoDevice.shecaCryptoDevice;
import com.sheca.cryptoDevice.shecaCryptoDeviceFactory;
import com.sheca.safeengine.javasafeengine;
import com.sheca.safeengine.shecaUtils;
import org.apache.commons.codec.binary.Base64;

import java.nio.charset.Charset;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/4/19
 */
public class EncryptDemo {
    public static void main(String[] args) {
        String cert = "MIID2DCCA3ugAwIBAgIQdyMF43+pSuG9DaRbiQZVRTAMBggqgRzPVQGDdQUAMDkxCzAJBgNVBAYTAkNOMREwDwYDVQQKDAhVbmlUcnVzdDEXMBUGA1UEAwwOU0hFQ0EgU00yIFRlc3QwHhcNMjEwNTMxMTA1NzE5WhcNMjIwNTMxMTU1OTU5WjBFMQswCQYDVQQGEwJDTjE2MDQGA1UEAwwt5LiK5rW35oKm6L6+5aGe5aSr57qz6IqC6IO956eR5oqA5pyJ6ZmQ5YWs5Y+4MFkwEwYHKoZIzj0CAQYIKoEcz1UBgi0DQgAEaQa5pk9m+8YvgH55CH+w1x96UnPRiHRBG5XjvCbCO/95SOVQEVC1FGwzH691L2tstI6s7KaxaKjAC9VWrwIqOaOCAlUwggJRMB8GA1UdIwQYMBaAFJ7qBFLhUbiuTbeFk2YVKSU6ZZ7SMB0GA1UdDgQWBBQR2M8Tvw2Dp9w/JYrL5N7zdcoSMDAOBgNVHQ8BAf8EBAMCBDAwEwYDVR0lBAwwCgYIKwYBBQUHAwIwQgYDVR0gBDswOTA3BgkqgRwBhu86gRUwKjAoBggrBgEFBQcCARYcaHR0cDovL3d3dy5zaGVjYS5jb20vcG9saWN5LzAJBgNVHRMEAjAAMIHWBgNVHR8Egc4wgcswgZSggZGggY6GgYtsZGFwOi8vMTcyLjE3LjEuMTc2OjM4OS9jbj1DUkw0LmNybCxvdT1SQTIwMjAwODIxLG91PUNBMTEsb3U9Y3JsLG89dW5pdHJ1c3Q/Y2VydGlmaWNhdGVSZXZvY2F0aW9uTGlzdD9iYXNlP29iamVjdENsYXNzPWNSTERpc3RyaWJ1dGlvblBvaW50MDKgMKAuhixodHRwOi8vMTcyLjE3LjEuMTU0L0NBMTEvUkEyMDIwMDgyMS9DUkw0LmNybDB2BggrBgEFBQcBAQRqMGgwMAYIKwYBBQUHMAGGJGh0dHA6Ly8xNzIuMTcuMS4xNzEvU2hlY2Evc2hlY2Eub2NzcDA0BggrBgEFBQcwAoYoaHR0cDovL2xkYXAyLnNoZWNhLmNvbS9yb290L3NoZWNhc3ViLmRlcjAnBgkqgRyG7zoLgU0EGhMYMTA0QFhZOTEzMTAxMDY2Njk0MzM4MjhGMCEGCSqBHIbvOguBUgQUExI5MTMxMDEwNjY2OTQzMzgyOEYwDAYIKoEcz1UBg3UFAANJADBGAiEA2aZj0ygZJjUAWpDVVUhDwWw6GBIFlMx7jWI8NjLhUJwCIQCFiX8Wyff583D2hqIY7Q8mqmVrsRKCWT4BDsHIeKW+Xw==";
        String plain = "qwerty";
        System.out.println(encode(cert,plain));



    }

    public static String encode(String cert,String plain) {
        shecaCryptoDevice cryptoDevice = shecaCryptoDeviceFactory.getInstance(shecaCryptoDeviceFactory.K_DA_PROVIDER_NAME);
        byte[] bytes = cryptoDevice.encodePKCS7EnveloperByDevice(
                javasafeengine.b64tohex(cert), plain.getBytes(Charset.forName("UTF-8")), shecaUtils.K_SHECA_SYM_SM4
        );

        return Base64.encodeBase64String(bytes);
    }

}
