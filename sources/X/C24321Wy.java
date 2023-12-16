package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Wy  reason: invalid class name and case insensitive filesystem */
public final class C24321Wy extends AnonymousClass3ZG {
    public Long A00;
    public String A01;

    public C24321Wy() {
        super(2492, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A00);
        r3.Blb(1, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0D(C18280x3.A0S(), this.A00, A0r), this.A01);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAndroidDatabaseMigrationLlks {");
        C57292tP.A00(A0o, "llksLatency", this.A00);
        return AnonymousClass3ZG.A0G(this.A01, "llksState", A0o);
    }
}
