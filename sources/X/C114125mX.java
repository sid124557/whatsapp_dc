package X;

import java.util.List;

/* renamed from: X.5mX  reason: invalid class name and case insensitive filesystem */
public final class C114125mX implements AnonymousClass4EJ {
    public final /* synthetic */ C009707r A00;
    public final /* synthetic */ AnonymousClass64K A01;
    public final /* synthetic */ AnonymousClass5H1 A02;
    public final /* synthetic */ AnonymousClass5TE A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public C114125mX(C009707r r1, AnonymousClass64K r2, AnonymousClass5H1 r3, AnonymousClass5TE r4, String str, String str2, List list) {
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = r3;
        this.A06 = list;
        this.A01 = r2;
    }

    public void BQp() {
        A00(this, "WfalLauncherProxy/pingIfNeeded - onDeliveryFailure");
    }

    public void BSB(Exception exc) {
        A00(this, "WfalLauncherProxy/pingIfNeeded - onError");
    }

    public void Bd3(C60272yH r8) {
        AnonymousClass5TE r0 = this.A03;
        C009707r r1 = this.A00;
        String str = this.A04;
        String str2 = this.A05;
        r0.A02(r1, this.A01, this.A02, str, str2, this.A06);
    }

    public static void A00(C114125mX r2, String str) {
        AnonymousClass356.A03(str);
        AnonymousClass5TE r1 = r2.A03;
        r1.A00 = true;
        r1.A01.A0D();
        AnonymousClass356.A01("WfalLauncherProxy/onLoadingAttemptComplete");
        r1.A00(r2.A00);
        r2.A01.B29(false);
    }
}
