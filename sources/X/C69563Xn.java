package X;

import java.util.List;

/* renamed from: X.3Xn  reason: invalid class name and case insensitive filesystem */
public final class C69563Xn implements C84954Ej {
    public final /* synthetic */ C54362ob A00;
    public final /* synthetic */ C55542qW A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public C69563Xn(C54362ob r1, C55542qW r2, String str, List list) {
        this.A02 = str;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = list;
    }

    public void BQp() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CrosspostRequestSessionManager/eligibility retry delivery failure for session: ");
        String str = this.A02;
        AnonymousClass356.A05(A0o, str);
        this.A00.A02(AnonymousClass217.ELIGIBILITY, str);
    }

    public void BSA(C73263fC r7) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CrosspostRequestSessionManager/eligibility retry error for session: ");
        String str = this.A02;
        A0o.append(str);
        AnonymousClass356.A01(AnonymousClass000.A0P(r7, " with exception:", A0o));
        this.A00.A01(AnonymousClass217.ELIGIBILITY, r7, str, this.A03, 10);
    }

    public void BdA(C53572nJ r3, C53862nn r4) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CrosspostRequestSessionManager/eligibility retry success for session: ");
        AnonymousClass356.A05(A0o, this.A02);
        this.A01.A02(this.A00, r3, r4);
    }
}
