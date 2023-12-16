package X;

/* renamed from: X.3X1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3X1 implements C84134Bd {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass3XA A01;
    public final /* synthetic */ C48622fC A02;

    public final void AwB(Object obj) {
        Boolean bool;
        C48622fC r1 = this.A02;
        int i = this.A00;
        AnonymousClass3XA r3 = this.A01;
        AnonymousClass3Z6 r6 = (AnonymousClass3Z6) obj;
        C162457s7.A0J(r6, 3);
        C23641Ub r2 = r1.A00;
        r2.A05(i, "psl_cache_hit", AnonymousClass001.A1Z(r6.first));
        r2.A09(Integer.valueOf(i), "psl_cache_fetch_end");
        String str = null;
        if (AnonymousClass001.A1Z(r6.first)) {
            byte[] bArr = (byte[]) r6.second;
            if (bArr != null) {
                str = new String(bArr, AnonymousClass79X.A05);
            }
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        r3.A05(AnonymousClass3Z6.A02(bool, str));
    }

    public /* synthetic */ AnonymousClass3X1(AnonymousClass3XA r1, C48622fC r2, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = r1;
    }
}
