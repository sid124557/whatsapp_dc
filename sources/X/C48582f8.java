package X;

import java.util.AbstractMap;
import java.util.List;

/* renamed from: X.2f8  reason: invalid class name and case insensitive filesystem */
public final class C48582f8 {
    public final AnonymousClass30J A00;
    public final AnonymousClass66R A01 = C154517dI.A01(new C77783tx(this));

    public C48582f8(AnonymousClass30J r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final void A00(String str) {
        StringBuilder A0X = C18270x1.A0X(str);
        A0X.append("[XFAM] StatusCrosspostUnsentSessionManager/unsent session: ");
        A0X.append(str);
        C18260x0.A1J(A0X, " removed");
        ((AbstractMap) this.A01.getValue()).remove(str);
    }

    public final void A01(String str, List list) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[XFAM] StatusCrosspostUnsentSessionManager/new unsent session added with sessionId: ");
        A0o.append(str);
        C18260x0.A1P(A0o, ", messages: ", list);
        ((AbstractMap) this.A01.getValue()).put(str, list);
    }
}
