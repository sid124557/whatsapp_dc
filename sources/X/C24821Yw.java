package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Yw  reason: invalid class name and case insensitive filesystem */
public final class C24821Yw extends AnonymousClass3ZG {
    public Long A00;
    public Long A01;
    public Long A02;
    public String A03;

    public C24821Yw() {
        super(4480, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A02);
        r3.Blb(4, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamContactsPresenceRequestSummary {");
        C57292tP.A00(A0o, "contactsToCheck", this.A00);
        C57292tP.A00(A0o, "contactsToFetchPresence", this.A01);
        C57292tP.A00(A0o, "contactsWithPresenceSuccess", this.A02);
        return AnonymousClass3ZG.A0G(this.A03, "jobId", A0o);
    }
}
