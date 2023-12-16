package X;

import java.util.List;

/* renamed from: X.3Sx  reason: invalid class name and case insensitive filesystem */
public final class C68373Sx implements AnonymousClass4EZ {
    public final C29441ip A00;
    public final AnonymousClass31C A01;
    public final C46172bC A02;
    public final List A03;

    public void BdM(AnonymousClass36K r4, String str) {
        C162457s7.A0J(r4, 1);
        C46172bC r2 = this.A02;
        C60612yq A002 = AnonymousClass29B.A00(r4);
        C69183Wa r1 = r2.A01;
        r1.A01(A002);
        if (r2.A03) {
            C52032km r0 = r1.A08;
            C18270x1.A0h(C18270x1.A04(r0.A01), "tos_fetch_iteration", r2.A00);
        }
    }

    public void BQs(String str) {
        this.A02.A00(-1);
    }

    public C68373Sx(C29441ip r1, AnonymousClass31C r2, C46172bC r3, List list) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = list;
    }

    public void BSN(AnonymousClass36K r3, String str) {
        int A002 = C57492tj.A00(r3);
        if (A002 > 0) {
            this.A02.A00(A002);
        } else {
            this.A02.A00(0);
        }
    }
}
