package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aQ  reason: invalid class name and case insensitive filesystem */
public final class C25381aQ extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;

    public C25381aQ() {
        super(3892, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A02);
        r3.Blb(2, this.A03);
        r3.Blb(3, this.A00);
        r3.Blb(5, this.A01);
        r3.Blb(6, this.A04);
        r3.Blb(7, this.A05);
        r3.Blb(8, this.A07);
        r3.Blb(9, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0L(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A02, A0r), this.A03, A0r), this.A00, A0r), this.A01, A0r), this.A04, A0r), this.A05, A0r), this.A07, A0r), this.A06);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamEphemeralOutOfSyncInfo {");
        C57292tP.A00(A0o, "groupSizeBucket", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "incomingMessageEphemeralityDuration", this.A03);
        C57292tP.A00(A0o, "isAGroup", this.A00);
        C57292tP.A00(A0o, "isNewThreadForUser", this.A01);
        C57292tP.A00(A0o, "otherDefaultModeDuration", this.A04);
        C57292tP.A00(A0o, "threadEphemeralityDuration", this.A05);
        C57292tP.A00(A0o, "threadId", this.A07);
        return AnonymousClass3ZG.A0G(this.A06, "userDefaultModeDuration", A0o);
    }
}
