package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Xk  reason: invalid class name and case insensitive filesystem */
public final class C24441Xk extends AnonymousClass3ZG {
    public Double A00;
    public Integer A01;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A00);
    }

    public C24441Xk() {
        super(2958, AnonymousClass3ZG.A04(), 2, 248614979);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(AnonymousClass001.A0f(), this.A01, A0r), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamTestAnonymousDailyId {");
        C57292tP.A00(A0o, "psTestEnumField", C18270x1.A0T(this.A01));
        return AnonymousClass3ZG.A0G(this.A00, "psTestFloatField", A0o);
    }
}
