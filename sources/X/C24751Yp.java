package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Yp  reason: invalid class name and case insensitive filesystem */
public final class C24751Yp extends AnonymousClass3ZG {
    public Long A00;
    public String A01;
    public String A02;
    public String A03;

    public C24751Yp() {
        super(4744, AnonymousClass0x9.A0U(1, false), 2, 0);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A02);
        r3.Blb(3, this.A03);
        r3.Blb(4, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamBizConversationSketchAnonymousDaily {");
        C57292tP.A00(A0o, "businessJid", this.A01);
        C57292tP.A00(A0o, "conversationEvents", this.A02);
        C57292tP.A00(A0o, "conversationId", this.A03);
        return AnonymousClass3ZG.A0G(this.A00, "numConversationEventsSkipped", A0o);
    }
}
