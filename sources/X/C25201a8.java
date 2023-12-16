package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1a8  reason: invalid class name and case insensitive filesystem */
public final class C25201a8 extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;

    public C25201a8() {
        super(3488, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A03);
        r3.Blb(2, this.A00);
        r3.Blb(3, this.A04);
        r3.Blb(4, this.A01);
        r3.Blb(5, this.A05);
        r3.Blb(6, this.A02);
        r3.Blb(7, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A03, A0r), this.A00, A0r), this.A04, A0r), this.A01, A0r), this.A05, A0r), this.A02, A0r), this.A06);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamKeepInChatPerf {");
        C57292tP.A00(A0o, "chatEphemeralityDuration", this.A03);
        C57292tP.A00(A0o, "kicErrorCode", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "kicMessageEphemeralityDuration", this.A04);
        C57292tP.A00(A0o, "kicRequestType", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "requestSendTime", this.A05);
        C57292tP.A00(A0o, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, C18270x1.A0T(this.A02));
        return AnonymousClass3ZG.A0G(this.A06, "threadId", A0o);
    }
}
