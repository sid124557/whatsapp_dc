package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1YE  reason: invalid class name */
public final class AnonymousClass1YE extends AnonymousClass3ZG {
    public String A00;
    public String A01;
    public String A02;

    public AnonymousClass1YE() {
        super(1684, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A00);
        r3.Blb(3, this.A01);
        r3.Blb(1, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0D(C18270x1.A0F(C18280x3.A0S(), this.A00, A0r), this.A01, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamCriticalEvent {");
        C57292tP.A00(A0o, "context", this.A00);
        C57292tP.A00(A0o, "debug", this.A01);
        return AnonymousClass3ZG.A0G(this.A02, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A0o);
    }
}
