package X;

/* renamed from: X.9ik  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200699ik implements Runnable {
    public final /* synthetic */ C191509Fe A00;
    public final /* synthetic */ AnonymousClass94y A01;

    public final void run() {
        AnonymousClass94y r6 = this.A01;
        C191509Fe r5 = this.A00;
        String A0H = r6.A0H();
        C202959mt BAl = r6.A0D().BAl();
        if (BAl != null && r5.A02 != 0) {
            r5.A01 = 4;
            r5.A02 = 0;
            AnonymousClass08M r1 = r6.A02;
            r1.A0H(r1.A07());
            BAl.BsF(C1899693i.A0F(AnonymousClass3QD.A00(), String.class, A0H, "paymentHandle"), new C204779pu(r5, r6, A0H, 1));
        }
    }

    public /* synthetic */ C200699ik(C191509Fe r1, AnonymousClass94y r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
