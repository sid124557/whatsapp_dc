package X;

/* renamed from: X.3al  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70603al implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass3MD A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public final void run() {
        String str;
        AnonymousClass3MD r6 = this.A01;
        String str2 = this.A02;
        boolean z = this.A03;
        boolean z2 = this.A04;
        int i = this.A00;
        String str3 = r6.A05;
        String str4 = r6.A04;
        if (z) {
            AnonymousClass1Uc r1 = r6.A01;
            if (z2) {
                str = "forward_network_1_start";
            } else {
                str = "forward_network_start";
            }
            C56672sN.A01(r1, str, i);
        }
        r6.A00.A01(str3, (String) null, str4, str2).Bh4(r6.A02);
    }

    public /* synthetic */ C70603al(AnonymousClass3MD r1, String str, int i, boolean z, boolean z2) {
        this.A01 = r1;
        this.A02 = str;
        this.A03 = z;
        this.A04 = z2;
        this.A00 = i;
    }
}
