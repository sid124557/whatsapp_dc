package X;

import java.io.Serializable;

/* renamed from: X.8Kv  reason: invalid class name and case insensitive filesystem */
public class C172398Kv implements Serializable {
    public static final long serialVersionUID = 5218660121564017090L;
    public String code;
    public String encryptedBase64String;
    public String hmac;
    public String ki;
    public String oda;
    public String pid;
    public String skey;
    public String type;

    public C172398Kv(String str, String str2, String str3) {
        this.ki = str;
        this.code = str2;
        this.encryptedBase64String = str3;
    }
}
