package X;

import com.whatsapp.util.Log;

/* renamed from: X.2c9  reason: invalid class name and case insensitive filesystem */
public final class C46752c9 {
    public final C29171iO A00;
    public final AnonymousClass1VX A01;
    public final C66523Lt A02;
    public final C52992mN A03;
    public final C67823Qu A04;
    public final C61032zb A05;

    public final boolean A00(String str) {
        StringBuilder A0l;
        String A012;
        if (!this.A01.A0Y(C58422vE.A01, 3531)) {
            return false;
        }
        if (!this.A03.A02()) {
            C66523Lt r1 = this.A02;
            Log.d("MessageHandler/onNoLogoutDueToLongConnect");
            r1.A07();
            return false;
        }
        C66523Lt r2 = this.A02;
        if (r2.A0L.A01() || this.A00.A00) {
            C18260x0.A1J(AnonymousClass000.A0l(str), "/voip call in progress or app is in foreground; do nothing");
            return false;
        }
        C67823Qu r3 = this.A04;
        if (!r3.A07()) {
            A0l = AnonymousClass000.A0l(str);
            A012 = "/lifecycle-logout-action; processing is done; logout";
        } else if (r3.A06 == null) {
            return false;
        } else {
            C18260x0.A1J(AnonymousClass000.A0l(str), "/lifecycle-logout-action; processing stanzas; last worker failed; logout");
            A0l = AnonymousClass000.A0l(str);
            A012 = r3.A01();
        }
        C18260x0.A1J(A0l, A012);
        AnonymousClass4EW r22 = r2.A08;
        if (r22 != null) {
            r22.BlM(false, 7);
        } else {
            Log.i("MessageHandler/onDoLogout ignoring due to null sending channel");
        }
        if (!r3.A08 && r3.A09("xmpp-bg-to-logout")) {
            r3.A08 = true;
        }
        C61032zb.A00(this.A05, 3);
        return true;
    }

    public C46752c9(C29171iO r2, AnonymousClass1VX r3, C66523Lt r4, C52992mN r5, C67823Qu r6, C61032zb r7) {
        C18260x0.A0f(r3, r6, r4, r5, r2);
        C162457s7.A0J(r7, 6);
        this.A01 = r3;
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
        this.A05 = r7;
    }
}
