package X;

import com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity;
import java.io.IOException;

/* renamed from: X.3Ol  reason: invalid class name and case insensitive filesystem */
public final class C67223Ol implements AnonymousClass4EN {
    public final /* synthetic */ C54662p5 A00;
    public final /* synthetic */ C108895dj A01;
    public final /* synthetic */ C45722aT A02;
    public final /* synthetic */ AnonymousClass2Z8 A03;
    public final /* synthetic */ AnonymousClass21S A04;

    public void AyP(AnonymousClass2SI r12) {
        C162457s7.A0J(r12, 0);
        if (!(!C615631i.A02())) {
            throw AnonymousClass001.A0e("Check failed.");
        } else if (r12.A00 != 0) {
            AnonymousClass2Z8 r5 = this.A03;
            C59192wV r3 = r5.A01;
            C48642fE r2 = r12.A04;
            C162457s7.A0K(r2, "null cannot be cast to non-null type com.whatsapp.xfamily.utils.XFamilyGraphqlErrorProcessor");
            C54662p5 r9 = this.A00;
            AnonymousClass21S r6 = this.A04;
            C108895dj r7 = this.A01;
            C45722aT r8 = this.A02;
            C71453c8 r4 = new C71453c8(r5, r6, r7, r8, r9, 17);
            r3.A00(r9, new AnonymousClass4JD(r8, 0), (C27131dK) r2, r4);
        } else {
            C51122jJ r1 = (C51122jJ) r12.A03.A00;
            if (r1 == null) {
                this.A02.A00(2, (Integer) null);
                return;
            }
            C45722aT r52 = this.A02;
            AnonymousClass21S r32 = r52.A01;
            C51132jK r22 = new C51132jK(r1.A00);
            C18260x0.A1N(C18270x1.A0X(r32), "FbAccountManager/linkAccount called by ", r32);
            C617031x.A01(new C81293ze(r22, ((C56042rK) r52.A00.A01.get()).A01), 2);
            C41962Mg r13 = r52.A02;
            r13.A01.A00();
            AccountLinkingNativeAuthActivity accountLinkingNativeAuthActivity = r13.A00;
            accountLinkingNativeAuthActivity.A05.A0S(new C71303bt(accountLinkingNativeAuthActivity, 0));
        }
    }

    public void BSB(Exception exc) {
        int i;
        Integer num;
        C162457s7.A0J(exc, 0);
        boolean z = exc instanceof AnonymousClass244;
        C45722aT r2 = this.A02;
        if (z) {
            C618532n r0 = ((AnonymousClass244) exc).error;
            i = r0.A01;
            num = Integer.valueOf(r0.A02);
        } else {
            i = 2;
            num = null;
        }
        r2.A00(i, num);
    }

    public C67223Ol(C54662p5 r1, C108895dj r2, C45722aT r3, AnonymousClass2Z8 r4, AnonymousClass21S r5) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
    }

    public void BQq(IOException iOException) {
        C41962Mg r1 = this.A02.A02;
        Integer A0f = AnonymousClass0x7.A0f();
        r1.A01.A00();
        AccountLinkingNativeAuthActivity accountLinkingNativeAuthActivity = r1.A00;
        accountLinkingNativeAuthActivity.A05.A0S(new C70363aN(accountLinkingNativeAuthActivity, A0f, (Object) null, 40));
    }
}
