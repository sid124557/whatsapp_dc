package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Wa  reason: invalid class name and case insensitive filesystem */
public final class C24081Wa extends AnonymousClass3ZG {
    public Integer A00;

    public C24081Wa() {
        super(3826, new AnonymousClass5ZC(1, 1, 20, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(AnonymousClass001.A0f(), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPnhCagFutureProofBannerAction {");
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A00), "pnhCagBannerAction", A0o);
    }
}
