package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1XB  reason: invalid class name */
public final class AnonymousClass1XB extends AnonymousClass3ZG {
    public Integer A00;
    public String A01;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A00);
    }

    public AnonymousClass1XB() {
        super(3720, AnonymousClass3ZG.A04(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18280x3.A0S(), this.A01, A0r), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamCtwaJwtVerificationState {");
        C57292tP.A00(A0o, "failReason", this.A01);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A00), "verificationState", A0o);
    }
}
