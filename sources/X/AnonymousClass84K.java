package X;

/* renamed from: X.84K  reason: invalid class name */
public class AnonymousClass84K implements C186448vK {
    public final C186448vK A00;
    public final boolean A01;
    public final float[] A02;

    public C186448vK B5R(int i) {
        return this.A00.B5R(i);
    }

    public int B5V() {
        return this.A00.B5V();
    }

    public Object B93() {
        return this.A00.B93();
    }

    public int BAM() {
        return this.A00.BAM();
    }

    public int BAO() {
        return this.A00.BAO();
    }

    public int BAP() {
        return this.A00.BAP();
    }

    public int BAR() {
        return this.A00.BAR();
    }

    public C161797qU BC6() {
        return this.A00.BC6();
    }

    public int BEd(int i) {
        return this.A00.BEd(i);
    }

    public int BEe(int i) {
        return this.A00.BEe(i);
    }

    public int getHeight() {
        int height = this.A00.getHeight();
        float[] fArr = this.A02;
        return height + Math.round(AnonymousClass6C8.A02(fArr, 0)) + Math.round(AnonymousClass6C8.A02(fArr, 3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (java.lang.Float.isNaN(r1) == false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (java.lang.Float.isNaN(r1) == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getWidth() {
        /*
            r5 = this;
            X.8vK r0 = r5.A00
            int r4 = r0.getWidth()
            float[] r3 = r5.A02
            boolean r2 = r5.A01
            if (r2 != 0) goto L_0x0031
            r0 = 5
            r1 = r3[r0]
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x0031
        L_0x0015:
            int r0 = java.lang.Math.round(r1)
            int r4 = r4 + r0
            if (r2 == 0) goto L_0x002b
            r0 = 5
            r1 = r3[r0]
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x002b
        L_0x0025:
            int r0 = java.lang.Math.round(r1)
            int r4 = r4 + r0
            return r4
        L_0x002b:
            r0 = 2
            float r1 = X.AnonymousClass6C8.A02(r3, r0)
            goto L_0x0025
        L_0x0031:
            r0 = 1
            float r1 = X.AnonymousClass6C8.A02(r3, r0)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass84K.getWidth():int");
    }

    public AnonymousClass84K(C186448vK r1, float[] fArr, boolean z) {
        this.A00 = r1;
        this.A02 = fArr;
        this.A01 = z;
    }
}
