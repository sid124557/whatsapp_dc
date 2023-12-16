package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4rb  reason: invalid class name and case insensitive filesystem */
public final class C94594rb extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;

    public C94594rb() {
        super(4510, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(6, this.A02);
        r3.Blb(2, this.A03);
        r3.Blb(3, this.A04);
        r3.Blb(5, this.A01);
    }

    public static void A00(AnonymousClass5XC r1, C94594rb r2) {
        r2.A03 = Long.valueOf((long) (r1.A05.A0A.A0C() + 1));
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0E(C18270x1.A0I(AnonymousClass001.A0f(), this.A00, A0r), this.A02, A0r), this.A03, A0r), this.A04);
        AnonymousClass3ZG.A0I(A0r, 4);
        A0r.put(C18290x4.A0c(), this.A01);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAccountSwitchingEvent {");
        C57292tP.A00(A0o, "accountSwitchingAction", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "accountSwitchingLatencyMs", this.A02);
        C57292tP.A00(A0o, "accountSwitchingNumAccounts", this.A03);
        C57292tP.A00(A0o, "accountSwitchingNumPendingMessageNotifs", this.A04);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A01), "accountSwitchingSource", A0o);
    }
}
