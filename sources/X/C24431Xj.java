package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Xj  reason: invalid class name and case insensitive filesystem */
public final class C24431Xj extends AnonymousClass3ZG {
    public Integer A00;
    public String A01;

    public C24431Xj() {
        super(4970, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A01);
        r3.Blb(1, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0D(C18280x3.A0S(), this.A01, A0r), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamSupportAiSession {");
        C57292tP.A00(A0o, "contactUsEntryPoint", this.A01);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A00), "supportAiEventType", A0o);
    }
}
