package X;

/* renamed from: X.1qG  reason: invalid class name and case insensitive filesystem */
public final class C32351qG extends C34021u6 {
    public final boolean A00;
    public final /* synthetic */ C32381qJ A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r5 != false) goto L_0x0007;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C32351qG(X.C32381qJ r2, boolean r3, boolean r4, boolean r5) {
        /*
            r1 = this;
            r1.A01 = r2
            if (r4 == 0) goto L_0x0007
            r0 = 0
            if (r5 == 0) goto L_0x0008
        L_0x0007:
            r0 = 1
        L_0x0008:
            r1.<init>(r2, r3, r4, r0)
            r1.A00 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32351qG.<init>(X.1qJ, boolean, boolean, boolean):void");
    }

    public /* bridge */ /* synthetic */ void A0E(Object[] objArr) {
        int intValue;
        Integer[] numArr = (Integer[]) objArr;
        C32381qJ r2 = this.A01;
        r2.A03.A00.A76(numArr[0].intValue());
        C18390xG r0 = C32381qJ.A0G;
        if (r0 != null && r0.getProgress() != (intValue = numArr[0].intValue())) {
            C32381qJ.A0G.setProgress(intValue);
        }
    }
}
