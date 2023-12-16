package X;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import org.apache.xml.security.Init;

/* renamed from: X.7Wj  reason: invalid class name and case insensitive filesystem */
public class C151807Wj {
    public static List A04;
    public AnonymousClass7VO A00;
    public C161257pJ A01;
    public C177538g2 A02;
    public String A03 = "";

    public C172378Kt A00(Boolean bool, String str, String str2, String str3, String str4, String str5) {
        String str6;
        SecretKey secretKey;
        if (str == null || !str.isEmpty()) {
            ArrayList A0s = AnonymousClass001.A0s();
            for (AnonymousClass7LR r1 : A04) {
                if (r1.A01.equals(str)) {
                    A0s.add(r1);
                }
            }
            if (A0s.size() != 0) {
                AnonymousClass7LR r3 = (AnonymousClass7LR) A0s.get(new SecureRandom().nextInt(A0s.size()));
                this.A03 = r3.A02;
                StringBuilder A0Y = AnonymousClass6CA.A0Y(500);
                try {
                    byte[] A1U = AnonymousClass6C9.A1U("AES/CBC/PKCS5Padding", new SecureRandom());
                    String A002 = C154487dF.A00(A1U, 2);
                    byte[] A003 = C161257pJ.A00(str4, A002);
                    String str7 = str5;
                    int length = str7.length() / 2;
                    byte[] bArr = new byte[length];
                    for (int i = 0; i < length; i++) {
                        AnonymousClass6C9.A16(str7, bArr, i);
                    }
                    String A004 = C154487dF.A00(C161257pJ.A01(A003, bArr, A1U), 2);
                    AnonymousClass001.A1K(str3, "|", str2, A0Y);
                    A0Y.append("|");
                    AnonymousClass001.A1K(A004, "|", A002, A0Y);
                    String obj = A0Y.toString();
                    if (bool.booleanValue()) {
                        try {
                            secretKey = AnonymousClass6C8.A0n();
                        } catch (NoSuchAlgorithmException unused) {
                            secretKey = null;
                        }
                        byte[] encoded = secretKey.getEncoded();
                        byte[] A1U2 = AnonymousClass6C9.A1U("AES/CBC/PKCS5Padding", new SecureRandom());
                        String A005 = C154487dF.A00(A1U2, 2);
                        byte[] A012 = C161257pJ.A01(obj.getBytes(), encoded, A1U2);
                        byte[] A013 = A01(C154487dF.A00(encoded, 0));
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("eyJhbGciOiJSU0EtT0FFUCIsImVuYyI6IkEyNTZHQ00ifQ.");
                        A0o.append(C154487dF.A00(A013, 2));
                        A0o.append(".");
                        A0o.append(A005);
                        A0o.append(".");
                        str6 = AnonymousClass000.A0X(C154487dF.A00(A012, 2), A0o).replace("+", "-").replace("/", "_");
                    } else {
                        str6 = C154487dF.A00(A01(obj), 2);
                    }
                    return new C172378Kt(new C172398Kv(r3.A00, r3.A01, str6));
                } catch (Exception unused2) {
                    throw new C143866zb(C140936ul.A04);
                }
            } else {
                throw new C143866zb(C140936ul.A01);
            }
        } else {
            throw new C143866zb(C140936ul.A00);
        }
    }

    public C151807Wj(String str) {
        Init.b();
        try {
            AnonymousClass7VO r0 = new AnonymousClass7VO();
            this.A00 = r0;
            if (r0.A01(str)) {
                this.A02 = new C177538g2(str);
                A04 = C177538g2.A03;
                try {
                    this.A01 = new C161257pJ();
                } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
                    throw new C143866zb(C140936ul.A04);
                }
            } else {
                throw new C143866zb(C140936ul.A03);
            }
        } catch (C143866zb e) {
            throw e;
        } catch (Exception unused2) {
            throw new C143866zb(C140936ul.A04);
        }
    }

    public byte[] A01(String str) {
        try {
            return AnonymousClass6C8.A1V(KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(C154487dF.A01(this.A03.getBytes("utf-8")))), str.getBytes());
        } catch (Exception unused) {
            return null;
        }
    }
}
