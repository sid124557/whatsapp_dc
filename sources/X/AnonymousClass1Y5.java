package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Y5  reason: invalid class name */
public final class AnonymousClass1Y5 extends AnonymousClass3ZG {
    public Integer A00;
    public Long A01;
    public Long A02;

    public AnonymousClass1Y5() {
        super(4738, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A02);
        r3.Blb(3, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A01, A0r), this.A02, A0r), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamBotWaitlistUsersDaily {");
        C57292tP.A00(A0o, "accessGrantedDs1pAgent", this.A01);
        C57292tP.A00(A0o, "waitlistJoinedDs1pAgent", this.A02);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A00), "waitlistState1pAgent", A0o);
    }
}
