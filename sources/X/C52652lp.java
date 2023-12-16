package X;

import java.util.Arrays;

/* renamed from: X.2lp  reason: invalid class name and case insensitive filesystem */
public final class C52652lp {
    public final Integer A00;
    public final byte[] A01;
    public final byte[] A02;

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<C52652lp> cls2 = C52652lp.class;
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (cls2.equals(cls)) {
                C162457s7.A0K(obj, "null cannot be cast to non-null type com.whatsapp.protocol.FMessageReportingInfo");
                C52652lp r5 = (C52652lp) obj;
                if (Arrays.equals(this.A01, r5.A01) && C162457s7.A0P(this.A00, r5.A00)) {
                    byte[] bArr = this.A02;
                    byte[] bArr2 = r5.A02;
                    if (bArr != null) {
                        if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                            return false;
                        }
                    } else if (bArr2 != null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((Arrays.hashCode(this.A01) * 31) + C18310x6.A06(this.A00)) * 31;
        byte[] bArr = this.A02;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        }
        return hashCode + i;
    }

    public C52652lp(Integer num, byte[] bArr, byte[] bArr2) {
        this.A01 = bArr;
        this.A02 = bArr2;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FMessageReportingInfo(reportingTag=");
        C18280x3.A1J(A0o, this.A01);
        A0o.append(", reportingTokenContent=");
        C18280x3.A1J(A0o, this.A02);
        A0o.append(", reportingTokenVersion=");
        return C18260x0.A04(this.A00, A0o);
    }
}
