package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ZZ  reason: invalid class name */
public final class AnonymousClass1ZZ extends AnonymousClass3ZG {
    public Boolean A00;
    public Double A01;
    public Double A02;
    public Double A03;
    public String A04;

    public AnonymousClass1ZZ() {
        super(4608, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A02);
        r3.Blb(3, this.A03);
        r3.Blb(4, this.A00);
        r3.Blb(5, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A00, A0r), this.A04);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamReportConversationContext {");
        C57292tP.A00(A0o, "estimatedNumMessagesReceived", this.A01);
        C57292tP.A00(A0o, "estimatedNumMessagesSent", this.A02);
        C57292tP.A00(A0o, "estimatedTimeSinceFirstMessage", this.A03);
        C57292tP.A00(A0o, "isInAddressbook", this.A00);
        return AnonymousClass3ZG.A0G(this.A04, "reportedJid", A0o);
    }
}
