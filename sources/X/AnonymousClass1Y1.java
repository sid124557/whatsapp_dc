package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Y1  reason: invalid class name */
public final class AnonymousClass1Y1 extends AnonymousClass3ZG {
    public Long A00;
    public Long A01;
    public String A02;

    public AnonymousClass1Y1() {
        super(3316, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A02);
        r3.Blb(3, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A02, A0r), this.A01);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamBadInteraction {");
        C57292tP.A00(A0o, "actual", this.A00);
        C57292tP.A00(A0o, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A02);
        return AnonymousClass3ZG.A0G(this.A01, "threshold", A0o);
    }
}
