package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Xr  reason: invalid class name and case insensitive filesystem */
public final class C24511Xr extends AnonymousClass3ZG {
    public Integer A00;
    public Long A01;
    public String A02;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A02);
        r3.Blb(2, this.A01);
        r3.Blb(5, this.A00);
    }

    public C24511Xr() {
        super(2692, AnonymousClass0x9.A0T(10, 1000, 1000000), 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 4);
        A0r.put(C18270x1.A0H(C18270x1.A0E(AnonymousClass001.A0f(), this.A02, A0r), this.A01, A0r), this.A00);
        AnonymousClass3ZG.A0I(A0r, 3);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamActivityStats {");
        C57292tP.A00(A0o, "featureName", this.A02);
        C57292tP.A00(A0o, "memoryKbsConsumed", this.A01);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A00), "memoryStatStage", A0o);
    }
}
