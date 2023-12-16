package X;

import android.util.Pair;

/* renamed from: X.3Sm  reason: invalid class name and case insensitive filesystem */
public class C68263Sm implements AnonymousClass4EZ {
    public final /* synthetic */ AnonymousClass2P5 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C68263Sm(AnonymousClass2P5 r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public void BQs(String str) {
        C18260x0.A0s("TwoFactorXmppMethods/sendSetTwoFactorAuth/onDeliveryFailure; iq=", str, AnonymousClass001.A0o());
        this.A00.A00.BkS(new C70313aI(this, this.A02, this.A01, 17));
    }

    public void BSN(AnonymousClass36K r8, String str) {
        Pair A022 = C57492tj.A02(r8);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TwoFactorXmppMethods/sendSetTwoFactorAuth/onError; iq=");
        A0o.append(str);
        C18260x0.A1R(A0o, ", error=", A022);
        this.A00.A00.BkS(new C70493aa(this, A022, this.A01, this.A02, 8));
    }

    public void BdM(AnonymousClass36K r8, String str) {
        C18260x0.A0s("TwoFactorXmppMethods/sendSetTwoFactorAuth/onSuccess; iq=", str, AnonymousClass001.A0o());
        C613130e r2 = (C613130e) this.A00.A02.get();
        r2.A0C.BkP(new C70483aZ(r2, this.A01, this.A02, 0, 1));
    }
}
