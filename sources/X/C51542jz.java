package X;

import java.util.Arrays;

/* renamed from: X.2jz  reason: invalid class name and case insensitive filesystem */
public final class C51542jz {
    public final byte[] A00;
    public final byte[] A01;

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<C51542jz> cls2 = C51542jz.class;
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (cls2.equals(cls)) {
                C162457s7.A0K(obj, "null cannot be cast to non-null type com.whatsapp.data.MessageStanzaReportingInfo");
                C51542jz r5 = (C51542jz) obj;
                if (Arrays.equals(this.A00, r5.A00)) {
                    byte[] bArr = this.A01;
                    byte[] bArr2 = r5.A01;
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
        int i;
        int hashCode = Arrays.hashCode(this.A00) * 31;
        byte[] bArr = this.A01;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public C51542jz(byte[] bArr, byte[] bArr2) {
        this.A00 = bArr;
        this.A01 = bArr2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MessageStanzaReportingInfo(reportingTag=");
        C18280x3.A1J(A0o, this.A00);
        A0o.append(", reportingToken=");
        return C18260x0.A07(Arrays.toString(this.A01), A0o);
    }
}
