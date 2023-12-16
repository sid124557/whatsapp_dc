package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Xo  reason: invalid class name and case insensitive filesystem */
public final class C24481Xo extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;

    public C24481Xo() {
        super(4104, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A01);
        AnonymousClass3ZG.A0I(A0r, 3);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamWaffleDaily {");
        C57292tP.A00(A0o, "isAccountConnected", this.A00);
        return AnonymousClass3ZG.A0G(this.A01, "isAutoStatusCrossPostOn", A0o);
    }
}
