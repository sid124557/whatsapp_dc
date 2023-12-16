package X;

import com.whatsapp.countrygating.viewmodel.CountryGatingViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5s6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117545s6 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass4VF A02;
    public final /* synthetic */ C95814uZ A03;
    public final /* synthetic */ C27991fJ A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public final void run() {
        C27991fJ r4;
        AnonymousClass3ZH r18;
        int i;
        int i2;
        C95804uY r7;
        AnonymousClass4VF r6 = this.A02;
        C27991fJ r2 = this.A04;
        boolean z = this.A05;
        boolean z2 = this.A06;
        boolean z3 = this.A07;
        boolean z4 = this.A08;
        boolean z5 = this.A09;
        int i3 = this.A00;
        boolean z6 = this.A0A;
        int i4 = this.A01;
        C95814uZ r5 = this.A03;
        C108985dt r16 = null;
        if (r2 != null) {
            r4 = r6.A06.A01(r2);
            if (r4 != null) {
                r18 = r6.A08.A0A(r4);
            }
            r18 = null;
        } else {
            r4 = null;
            r18 = null;
        }
        if (z) {
            i = r6.A0G.A00(r2);
        } else {
            i = 0;
        }
        if (!z2 || !r6.A0I.A0X(4184) || r4 == null || !r6.A0H.A0D(r4)) {
            i2 = 0;
        } else {
            i2 = r6.A07.A03(r4).size();
        }
        if (z3) {
            r16 = r6.A03.A02(AnonymousClass3ZH.A07(r6.A00));
        }
        AnonymousClass08M r3 = r6.A02;
        AnonymousClass3ZH r22 = r6.A00;
        boolean z7 = r22.A0j;
        CountryGatingViewModel countryGatingViewModel = r6.A0D;
        C95814uZ r72 = r6.A01;
        UserJid A032 = AnonymousClass32Y.A03(r72);
        boolean A0D = countryGatingViewModel.A0D(A032);
        boolean A0D2 = r6.A0T.A0D(A032);
        boolean A0F = r6.A0F();
        boolean A0E = r6.A0E();
        C103985Pe r1 = r6.A0S;
        if (r72 instanceof C95804uY) {
            r7 = (C95804uY) r72;
        } else {
            r7 = null;
        }
        C27991fJ r19 = r4;
        AnonymousClass3ZH r17 = r22;
        r3.A0G(new AnonymousClass5R9(r16, r17, r18, r19, r6.A0B.A00(r5), i3, i4, i, i2, z4, z7, A0D, A0D2, z2, A0F, z5, z6, A0E, r1.A01(r7)));
    }

    public /* synthetic */ C117545s6(AnonymousClass4VF r1, C95814uZ r2, C27991fJ r3, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A02 = r1;
        this.A04 = r3;
        this.A05 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A08 = z4;
        this.A09 = z5;
        this.A00 = i;
        this.A0A = z6;
        this.A01 = i2;
        this.A03 = r2;
    }
}
