package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.lang.ref.WeakReference;

/* renamed from: X.3TU  reason: invalid class name */
public class AnonymousClass3TU implements AnonymousClass4EZ {
    public final C69263Wi A00;
    public final AnonymousClass31C A01;
    public final WeakReference A02;
    public final boolean A03;

    public void A00(C27991fJ r13) {
        int i;
        String str;
        AnonymousClass31C r5 = this.A01;
        String A032 = r5.A03();
        if (this.A03) {
            i = 105;
            str = "set";
        } else {
            i = 106;
            str = "get";
        }
        AnonymousClass36K A0H = AnonymousClass36K.A0H("invite");
        AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
        AnonymousClass39V.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W);
        AnonymousClass39V.A05("xmlns", "w:g2", A1W);
        AnonymousClass39V.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str, A1W);
        r5.A0D(this, AnonymousClass36K.A0C(r13, A0H, A1W), A032, i, 32000);
    }

    public final void A01(String str, int i) {
        Object obj = this.A02.get();
        if (obj != null) {
            this.A00.A0S(new C70473aY(this, obj, str, i, 6));
        }
    }

    public void BQs(String str) {
        A01((String) null, 0);
    }

    public void BdM(AnonymousClass36K r4, String str) {
        AnonymousClass36K A0k = r4.A0k(0);
        AnonymousClass36K.A0N(A0k, "invite");
        A01(AnonymousClass36K.A0L(A0k, "code"), 0);
    }

    public AnonymousClass3TU(C69263Wi r2, AnonymousClass4AT r3, AnonymousClass31C r4, boolean z) {
        this.A00 = r2;
        this.A01 = r4;
        this.A02 = AnonymousClass0x9.A14(r3);
        this.A03 = z;
    }

    public void BSN(AnonymousClass36K r3, String str) {
        A01((String) null, C57492tj.A01(r3));
    }
}
