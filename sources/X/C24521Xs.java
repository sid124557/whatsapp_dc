package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Xs  reason: invalid class name and case insensitive filesystem */
public final class C24521Xs extends AnonymousClass3ZG {
    public Boolean A00;
    public Long A01;
    public Long A02;

    public C24521Xs() {
        super(3046, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A01);
        r3.Blb(1, this.A02);
        r3.Blb(3, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0D(C18280x3.A0S(), this.A01, A0r), this.A02, A0r), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAdvIdentityTimestampInvalid {");
        C57292tP.A00(A0o, "advIdentityIncomingTimestampInHours", this.A01);
        C57292tP.A00(A0o, "advIdentityLocalTimestampInHours", this.A02);
        return AnonymousClass3ZG.A0G(this.A00, "advIdentityPrimaryIdentityMatch", A0o);
    }
}
