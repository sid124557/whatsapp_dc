package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Ws  reason: invalid class name and case insensitive filesystem */
public final class C24261Ws extends AnonymousClass3ZG {
    public Integer A00;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
    }

    public C24261Ws() {
        super(2908, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 2);
        A0r.put(AnonymousClass001.A0f(), this.A00);
        AnonymousClass3ZG.A0I(A0r, 3);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamWaShopsManagement {");
        C162457s7.A0J("isShopsProductPreviewVisible", 1);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A00), "shopsManagementAction", A0o);
    }
}
