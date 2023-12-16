package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1YB  reason: invalid class name */
public final class AnonymousClass1YB extends AnonymousClass3ZG {
    public Integer A00;
    public String A01;
    public String A02;

    public AnonymousClass1YB() {
        super(3574, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(4, this.A01);
        r3.Blb(5, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0H(C18270x1.A0G(AnonymousClass001.A0f(), this.A00, A0r), this.A01, A0r), this.A02);
        AnonymousClass3ZG.A0I(A0r, 3);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamChatPsaRead {");
        C57292tP.A00(A0o, "messageMediaType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "psaCampaignId", this.A01);
        return AnonymousClass3ZG.A0G(this.A02, "psaMsgId", A0o);
    }
}
