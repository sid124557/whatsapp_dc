package X;

/* renamed from: X.6bF  reason: invalid class name and case insensitive filesystem */
public final class C130016bF extends C130026bG {
    public final char[] A00 = new char[512];

    public C130016bF(C152607Zn r6) {
        super(r6, (Character) null);
        char[] cArr = r6.A06;
        int i = 0;
        C162187rP.A06(AnonymousClass000.A1U(cArr.length, 16));
        do {
            char[] cArr2 = this.A00;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
            i++;
        } while (i < 256);
    }
}
