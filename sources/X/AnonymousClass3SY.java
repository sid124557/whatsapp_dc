package X;

import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.3SY  reason: invalid class name */
public class AnonymousClass3SY implements AnonymousClass4EZ {
    public final JniBridge A00;

    public void BQs(String str) {
        JniBridge.jvidispatchIOOO(1, AnonymousClass0x9.A0r(this.A00), (Object) null, (Object) null);
    }

    public void BSN(AnonymousClass36K r4, String str) {
        JniBridge.jvidispatchIOOO(1, AnonymousClass0x9.A0r(this.A00), (Object) null, (Object) null);
    }

    public AnonymousClass3SY(JniBridge jniBridge) {
        this.A00 = jniBridge;
    }

    public void BdM(AnonymousClass36K r5, String str) {
        AnonymousClass36K A0m = r5.A0m("sign_credential");
        AnonymousClass36K.A04(A0m, "t");
        JniBridge.jvidispatchIOOO(1, AnonymousClass0x9.A0r(this.A00), A0m.A0m("signed_credential").A01, A0m.A0m("acs_public_key").A01);
    }
}
