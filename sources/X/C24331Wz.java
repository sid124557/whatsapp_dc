package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Wz  reason: invalid class name and case insensitive filesystem */
public final class C24331Wz extends AnonymousClass3ZG {
    public Long A00;
    public String A01;

    public C24331Wz() {
        super(2578, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(AnonymousClass001.A0f(), this.A01);
        AnonymousClass3ZG.A0I(A0r, 3);
        A0r.put(C18280x3.A0S(), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAndroidDatabaseRollbackEvent {");
        C57292tP.A00(A0o, "migrationName", this.A01);
        return AnonymousClass3ZG.A0G(this.A00, "rollbackT", A0o);
    }
}
