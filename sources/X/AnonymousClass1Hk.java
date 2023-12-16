package X;

import android.text.TextUtils;

/* renamed from: X.1Hk  reason: invalid class name */
public class AnonymousClass1Hk extends C66513Ls {
    public AnonymousClass2U8 A00;
    public boolean A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1Hk(X.C56492s4 r2, X.C106685Zz r3, X.AnonymousClass2U8 r4) {
        /*
            r1 = this;
            java.lang.String r0 = r4.A08
            r1.<init>(r2, r3, r0)
            r1.A0D = r0
            r1.A0K(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Hk.<init>(X.2s4, X.5Zz, X.2U8):void");
    }

    public void A0K(AnonymousClass2U8 r4) {
        this.A00 = r4;
        this.A0J = r4.A0A;
        this.A0G = r4.A02;
        this.A0D = r4.A08;
        this.A0V = r4.A0F;
        byte[] bArr = r4.A00;
        if (bArr == null || bArr.length <= 0) {
            String str = r4.A09;
            if (str != null) {
                this.A0O.add(str);
            }
        } else {
            this.A0V = bArr;
        }
        String str2 = r4.A04;
        if (!TextUtils.isEmpty(str2)) {
            this.A0A = new C135286kQ(str2, -1, -1);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1Hk(X.C56492s4 r2, X.C149747Ns r3, X.C106685Zz r4) {
        /*
            r1 = this;
            java.lang.String r0 = r3.A02
            r1.<init>(r2, r4, r0)
            r1.A0D = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Hk.<init>(X.2s4, X.7Ns, X.5Zz):void");
    }
}
