package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Z3  reason: invalid class name */
public final class AnonymousClass1Z3 extends AnonymousClass3ZG {
    public Integer A00;
    public Long A01;
    public String A02;
    public String A03;

    public AnonymousClass1Z3() {
        super(2286, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A00);
        r3.Blb(4, this.A02);
        r3.Blb(1, this.A03);
        r3.Blb(3, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0D(C18270x1.A0G(C18280x3.A0S(), this.A00, A0r), this.A02, A0r), this.A03, A0r), this.A01);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMdBootstrapStarted {");
        C57292tP.A00(A0o, "mdBootstrapSource", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "mdRegAttemptId", this.A02);
        C57292tP.A00(A0o, "mdSessionId", this.A03);
        return AnonymousClass3ZG.A0G(this.A01, "mdTimestamp", A0o);
    }
}
