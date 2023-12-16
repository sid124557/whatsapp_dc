package X;

import java.util.List;

/* renamed from: X.2xx  reason: invalid class name and case insensitive filesystem */
public class C60072xx {
    public List A00;
    public final int A01;
    public final byte[] A02;

    public List A00() {
        byte[] bArr = this.A02;
        if (bArr == null) {
            return null;
        }
        List list = this.A00;
        if (list != null) {
            return list;
        }
        this.A00 = AnonymousClass002.A0I(r4);
        for (byte b : bArr) {
            this.A00.add(Float.valueOf(((float) b) / 100.0f));
        }
        return this.A00;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return new C60072xx(this.A02, this.A01);
    }

    public C60072xx(byte[] bArr, int i) {
        this.A02 = bArr;
        this.A01 = i;
    }

    public C60072xx() {
        this((byte[]) null, 0);
    }
}
