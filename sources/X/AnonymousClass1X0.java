package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1X0  reason: invalid class name */
public final class AnonymousClass1X0 extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;

    public AnonymousClass1X0() {
        super(3182, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(3, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(AnonymousClass001.A0f(), this.A00);
        AnonymousClass3ZG.A0I(A0r, 2);
        A0r.put(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18290x4.A0a(), this.A01, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamBackupQuotaUserNotice {");
        C57292tP.A00(A0o, "bannerDismissed", C18270x1.A0T(this.A00));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A01), "bannerTapLearnMore", A0o);
    }
}
