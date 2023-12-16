package X;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: X.8dR  reason: invalid class name and case insensitive filesystem */
public class C176708dR extends C177088e3 {
    public byte[] A00;

    public String A0U() {
        StringBuilder A0p;
        String substring;
        String A02 = C162077rB.A02(this.A00);
        int indexOf = A02.indexOf(45);
        if (indexOf >= 0 || (indexOf = A02.indexOf(43)) >= 0) {
            if (indexOf == A02.length() - 3) {
                A02 = AnonymousClass000.A0X("00", AnonymousClass000.A0l(A02));
            }
            if (indexOf == 10) {
                A0p = AnonymousClass6C7.A0p(10, A02);
                A0p.append("00GMT");
                A0p.append(A02.substring(10, 13));
                A0p.append(":");
                substring = A02.substring(13, 15);
            } else {
                A0p = AnonymousClass6C7.A0p(12, A02);
                A0p.append("GMT");
                A0p.append(A02.substring(12, 15));
                A0p.append(":");
                substring = A02.substring(15, 17);
            }
        } else if (A02.length() == 11) {
            A0p = AnonymousClass6C7.A0p(10, A02);
            substring = "00GMT+00:00";
        } else {
            A0p = AnonymousClass6C7.A0p(12, A02);
            substring = "GMT+00:00";
        }
        return AnonymousClass000.A0X(substring, A0p);
    }

    public int hashCode() {
        return C161007oo.A00(this.A00);
    }

    public String toString() {
        return C162077rB.A02(this.A00);
    }

    public C176708dR(byte[] bArr) {
        byte b;
        if (bArr.length >= 2) {
            this.A00 = bArr;
            byte b2 = bArr[0];
            if (b2 < 48 || b2 > 57 || (b = bArr[1]) < 48 || b > 57) {
                throw AnonymousClass001.A0c("illegal characters in UTCTime string");
            }
            return;
        }
        throw AnonymousClass001.A0c("UTCTime string too short");
    }

    public C176708dR(String str) {
        this.A00 = C162077rB.A03(str);
        try {
            C155497f0.A00(new SimpleDateFormat("yyMMddHHmmssz").parse(A0U()));
        } catch (ParseException e) {
            throw AnonymousClass001.A0c(AnonymousClass000.A0a("invalid date string: ", AnonymousClass001.A0o(), e));
        }
    }
}
