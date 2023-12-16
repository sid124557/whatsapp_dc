package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Yv  reason: invalid class name and case insensitive filesystem */
public final class C24811Yv extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public String A02;
    public String A03;

    public C24811Yv() {
        super(3572, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(4, this.A02);
        r3.Blb(2, this.A01);
        r3.Blb(5, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0H(C18270x1.A0E(C18270x1.A0G(AnonymousClass001.A0f(), this.A00, A0r), this.A02, A0r), this.A01, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamChatPsaAction {");
        C57292tP.A00(A0o, "messageMediaType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "psaCampaignId", this.A02);
        C57292tP.A00(A0o, "psaMessageActionType", C18270x1.A0T(this.A01));
        return AnonymousClass3ZG.A0G(this.A03, "psaMsgId", A0o);
    }
}
