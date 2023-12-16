package X;

import android.util.Base64;
import com.whatsapp.util.Log;

/* renamed from: X.32P  reason: invalid class name */
public class AnonymousClass32P {
    public C47932e4 A00;
    public AnonymousClass239 A01;
    public Integer A02;
    public String A03;
    public String A04;
    public byte[] A05;
    public byte[] A06;

    public static Integer A01(String str) {
        String str2 = str;
        if (str != null) {
            switch (str2.hashCode()) {
                case 48:
                    if (str2.equals("0")) {
                        return 1;
                    }
                    break;
                case 49:
                    if (str2.equals("1")) {
                        return 2;
                    }
                    break;
                case 50:
                    if (str2.equals("2")) {
                        return 3;
                    }
                    break;
                case 51:
                    if (str2.equals("3")) {
                        return 4;
                    }
                    break;
                case AnonymousClass1ES.REVOKE_MESSAGE_TIMESTAMP_FIELD_NUMBER:
                    if (str2.equals("4")) {
                        return 5;
                    }
                    break;
                case 53:
                    if (str2.equals("5")) {
                        return 6;
                    }
                    break;
                case 54:
                    if (str2.equals("6")) {
                        return 7;
                    }
                    break;
                case 55:
                    if (str2.equals("7")) {
                        return 8;
                    }
                    break;
                case 56:
                    if (str2.equals("8")) {
                        return 9;
                    }
                    break;
                case AnonymousClass1ES.IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER:
                    if (str2.equals("9")) {
                        return 10;
                    }
                    break;
                case 97:
                    if (str2.equals("a")) {
                        return 11;
                    }
                    break;
                case 98:
                    if (str2.equals("b")) {
                        return 12;
                    }
                    break;
                case 99:
                    if (str2.equals("c")) {
                        return 13;
                    }
                    break;
                case 100:
                    if (str2.equals("d")) {
                        return 14;
                    }
                    break;
                case 101:
                    if (str2.equals("e")) {
                        return 15;
                    }
                    break;
                case 102:
                    if (str2.equals("f")) {
                        return 16;
                    }
                    break;
                case 103:
                    if (str2.equals("g")) {
                        return 17;
                    }
                    break;
                case 104:
                    if (str2.equals("h")) {
                        return 18;
                    }
                    break;
                case 105:
                    if (str2.equals("i")) {
                        return 19;
                    }
                    break;
                case 106:
                    if (str2.equals("j")) {
                        return 20;
                    }
                    break;
                case 107:
                    if (str2.equals("k")) {
                        return 21;
                    }
                    break;
            }
        }
        return null;
    }

    public AnonymousClass32P(C47932e4 r1, AnonymousClass239 r2, Integer num, String str, String str2, byte[] bArr, byte[] bArr2) {
        this.A04 = str;
        this.A05 = bArr;
        this.A03 = str2;
        this.A00 = r1;
        this.A06 = bArr2;
        this.A02 = num;
        this.A01 = r2;
    }

    public static AnonymousClass32P A00(String str) {
        byte[] bArr;
        Integer num;
        C47932e4 r11;
        String[] A1b = C18320x8.A1b(str);
        int length = A1b.length;
        String str2 = null;
        if (length < 3) {
            Log.e("qrData/processQR/error/invalid_code parts");
            return null;
        }
        String str3 = A1b[0];
        if (str3.startsWith("CAPI_")) {
            Log.e("qrData/processQR/error/invalid ref");
            return null;
        }
        boolean A1U = C18280x3.A1U(length, 4);
        if (A1U) {
            try {
                String str4 = A1b[2];
                byte[][] bArr2 = new byte[2][];
                bArr2[0] = new byte[]{5};
                r11 = new C47932e4(AnonymousClass36G.A01(AnonymousClass36A.A04(Base64.decode(str4, 0), bArr2, 1)));
                bArr = Base64.decode(A1b[3], 0);
                if (length <= 4) {
                    num = null;
                } else {
                    num = A01(A1b[4]);
                }
            } catch (AnonymousClass23X unused) {
                Log.e("qrData/processQR/error/invalid identity key");
                return null;
            } catch (Exception e) {
                C18260x0.A1Q(AnonymousClass001.A0o(), "qrData/processQR/error/", e);
                return null;
            }
        } else {
            r11 = null;
            bArr = null;
            num = null;
        }
        try {
            byte[] decode = Base64.decode(A1b[1], 0);
            if (!A1U) {
                str2 = A1b[2];
            }
            return new AnonymousClass32P(r11, AnonymousClass239.E2EE, num, str3, str2, decode, bArr);
        } catch (IllegalArgumentException unused2) {
            Log.e("qrData/processQR/error/invalid public key");
            return null;
        }
    }
}
