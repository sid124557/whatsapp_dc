package X;

import java.util.Map;

/* renamed from: X.8Iv  reason: invalid class name and case insensitive filesystem */
public final class C171898Iv implements AnonymousClass4DK {
    public final /* synthetic */ C159127lA A00;
    public final /* synthetic */ C55212pz A01;
    public final /* synthetic */ C137066ni A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public void BSv(C60752z6 r12, Map map) {
        String A002;
        C60752z6 r6 = r12;
        C162457s7.A0J(r12, 1);
        C159127lA r3 = this.A00;
        C48722fM r4 = r3.A05;
        if (r4 == null) {
            throw C18270x1.A0S("fcsLoadingEventManager");
        }
        AnonymousClass21K r5 = AnonymousClass21K.ON_FAILURE;
        String str = this.A04;
        C137066ni r1 = this.A02;
        r4.A00(r5, r6, str, r1.A00(), this.A03, map);
        AnonymousClass1j2 r52 = r3.A0M;
        r52.A00(r3.A00, "actionPerformed");
        r52.A03(r3.A00, "action_performed", "submit");
        r3.A01();
        C152677Zw r2 = r3.A07;
        if (r2 != null) {
            C151217Tw r0 = r3.A01;
            if (r0 == null) {
                throw C18270x1.A0S("flowManager");
            }
            r2.A01((String) C162457s7.A03(r0.A03));
        }
        Map A012 = r1.A01(this.A05, map);
        C157187ht r13 = r1.A00;
        if (r13 == null || (A002 = r13.A00(r12.A02)) == null) {
            r52.A03.A07(r3.A00, 3);
            r3.A08(r12, A012);
            return;
        }
        r3.A07(r12, A002, A012, 3);
    }

    public C171898Iv(C159127lA r1, C55212pz r2, C137066ni r3, String str, String str2, Map map) {
        this.A00 = r1;
        this.A04 = str;
        this.A02 = r3;
        this.A03 = str2;
        this.A01 = r2;
        this.A05 = map;
    }

    public void BdH(Map map) {
        C159127lA r3 = this.A00;
        C48722fM r5 = r3.A05;
        Object obj = null;
        if (r5 == null) {
            throw C18270x1.A0S("fcsLoadingEventManager");
        }
        AnonymousClass21K r6 = AnonymousClass21K.ON_COMPLETION;
        String str = this.A04;
        C137066ni r4 = this.A02;
        r5.A00(r6, (C60752z6) null, str, r4.A00(), this.A03, map);
        AnonymousClass1j2 r62 = r3.A0M;
        r62.A00(r3.A00, "actionPerformed");
        r62.A03(r3.A00, "action_performed", "submit");
        r3.A01();
        C152677Zw r2 = r3.A07;
        if (r2 != null) {
            C151217Tw r0 = r3.A01;
            if (r0 == null) {
                throw C18270x1.A0S("flowManager");
            }
            r2.A01((String) C162457s7.A03(r0.A03));
        }
        if (this.A01 instanceof AnonymousClass1jJ) {
            if (map != null) {
                obj = map.get(C373621y.RESUMABLE_DATA.key);
            }
            if (obj instanceof Map) {
                Map A0l = AnonymousClass6C8.A0l(C373621y.RESUMABLE_DATA.key, map);
                C152677Zw r02 = r3.A07;
                if (r02 != null) {
                    r02.A02((String) null, A0l);
                }
            }
        }
        r3.A07((C60752z6) null, r4.A00, r4.A01(this.A05, map), 2);
    }
}
