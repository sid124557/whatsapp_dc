package X;

/* renamed from: X.3e8  reason: invalid class name and case insensitive filesystem */
public final class C72693e8 implements AnonymousClass4C7 {
    public long A00;
    public final Object A01;
    public final C84814Du A02;
    public final C832146o A03;

    public void dispose() {
        C832146o r6 = this.A03;
        synchronized (r6) {
            long j = this.A00;
            if (j >= Math.min(r6.A02, r6.A03)) {
                Object[] objArr = r6.A04;
                C162457s7.A0H(objArr);
                int length = (objArr.length - 1) & ((int) j);
                if (objArr[length] == this) {
                    objArr[length] = C39222Bd.A00;
                    r6.A05();
                }
            }
        }
    }

    public C72693e8(Object obj, C84814Du r2, C832146o r3, long j) {
        this.A03 = r3;
        this.A00 = j;
        this.A01 = obj;
        this.A02 = r2;
    }
}
