package X;

import android.app.Activity;

/* renamed from: X.9a0  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C195919a0 implements C835448v {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C194619Tt A01;
    public final /* synthetic */ C202479m5 A02;
    public final /* synthetic */ AnonymousClass9U5 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public final void Ay5() {
        String str;
        C41032Ir r0;
        C194619Tt r14 = this.A01;
        AnonymousClass9U5 r3 = this.A03;
        String str2 = this.A04;
        boolean z = this.A05;
        Activity activity = this.A00;
        C202479m5 r1 = this.A02;
        AnonymousClass9A7 r10 = new AnonymousClass9A7(r14.A04.A00, r14.A02, r14.A05, r14, r14.A06, r14.A08, r3);
        AnonymousClass9RG r32 = new AnonymousClass9RG(activity, r14, r1);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PAY: blockNonWaVpa called vpa: ");
        A0o.append(C195009Vm.A02(str2));
        C18260x0.A1E(" block: ", A0o, z);
        if (z) {
            str = "upi-block-vpa";
        } else {
            str = "upi-unblock-vpa";
        }
        C153607bd A022 = AnonymousClass9OC.A02(r10, str);
        AnonymousClass31C r102 = r10.A02;
        String A032 = r102.A03();
        AnonymousClass9IP r12 = new AnonymousClass9IP(A032);
        if (z) {
            r0 = new AnonymousClass9IY(r12, str2);
        } else {
            r0 = new C192059Ia(r12, str2);
        }
        r102.A0D(new AnonymousClass9AV(r10.A00, r10.A01, r32, r10.A04, A022, r10, str, str2, z), r0.A00, A032, 204, 0);
    }

    public /* synthetic */ C195919a0(Activity activity, C194619Tt r2, C202479m5 r3, AnonymousClass9U5 r4, String str, boolean z) {
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = str;
        this.A05 = z;
        this.A00 = activity;
        this.A02 = r3;
    }
}
