package base64;

import RSA.Base64Utils;

import java.util.Base64;

/**
 * @author zonzie
 * @date 2018/4/12 15:29
 */
public class Base64Test {
    public static void main(String[] args) throws Exception {
        Base64.Decoder decoder = Base64.getDecoder();
        Base64.Encoder encoder = Base64.getEncoder();
        final String text = "文字";
        byte[] bytes = text.getBytes();
        // 编码
        String s = encoder.encodeToString(bytes);
        System.out.println(s);
        byte[] decode = decoder.decode(s);
        Base64Utils.decodeToFile("F:/123/",s);
        // 解码
        System.out.println(new String(decoder.decode(s),"UTF-8"));

        String abc = "zonzie123";
    }
}
