package X;

import java.util.Map;

/* renamed from: X.2cB  reason: invalid class name and case insensitive filesystem */
public final class C46772cB {
    public final /* synthetic */ C159127lA A00;
    public final /* synthetic */ C55212pz A01;
    public final /* synthetic */ C137066ni A02;
    public final /* synthetic */ C60752z6 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C46772cB(C159127lA r1, C55212pz r2, C137066ni r3, C60752z6 r4, String str, Map map) {
        this.A00 = r1;
        this.A04 = str;
        this.A02 = r3;
        this.A05 = map;
        this.A01 = r2;
        this.A03 = r4;
    }

    public void A00() {
        C159127lA r3 = this.A00;
        C48722fM r2 = r3.A05;
        if (r2 == null) {
            throw C18270x1.A0S("fcsLoadingEventManager");
        }
        String str = this.A04;
        C162457s7.A0C(str);
        r2.A01((C60752z6) null, "onLoadingCompletion", str, (Map) null);
        C137066ni r7 = this.A02;
        Map map = this.A05;
        r3.A05(r7, map);
        r3.A03((C368820c) null, this.A01, AnonymousClass211.EXECUTE, r7, this.A03, (String) null, map);
    }
}
