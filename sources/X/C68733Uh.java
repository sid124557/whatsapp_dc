package X;

/* renamed from: X.3Uh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68733Uh implements AnonymousClass4BN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C47572dT A01;
    public final /* synthetic */ AnonymousClass4GQ A02;
    public final /* synthetic */ boolean A03;

    public final void BcZ(C387328x r10) {
        C47572dT r4 = this.A01;
        int i = this.A00;
        AnonymousClass4GQ r6 = this.A02;
        boolean z = this.A03;
        C162457s7.A0J(r10, 4);
        if (r10 instanceof C32621rL) {
            r4.A0F.BkP(new C71433c6(r4, ((C32621rL) r10).A00, r6, i, 3));
        } else if (r10 instanceof C32611rK) {
            boolean z2 = r4.A0G.get();
            C55782qu r1 = r4.A08;
            if (z2) {
                r1.A01(i, "download_stickerpack_canceled");
                r1.A02(C372621o.CANCEL, i);
            } else {
                r1.A01(i, "download_stickerpack_failed");
                r1.A02(C372621o.FAIL, i);
                if (z) {
                    r4.A02.A00(6, "retry", false);
                }
            }
            r6.invoke(Boolean.FALSE);
        }
        r4.A00.set((Object) null);
    }

    public /* synthetic */ C68733Uh(C47572dT r1, AnonymousClass4GQ r2, int i, boolean z) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = r2;
        this.A03 = z;
    }
}
