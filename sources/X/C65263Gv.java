package X;

import java.util.Iterator;

/* renamed from: X.3Gv  reason: invalid class name and case insensitive filesystem */
public class C65263Gv implements C85274Fp {
    public int A00;
    public int A01;
    public int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ C43912Ty A05;
    public final /* synthetic */ AnonymousClass2Y7 A06;
    public final /* synthetic */ C46702c4 A07;

    public C65263Gv(C43912Ty r1, AnonymousClass2Y7 r2, C46702c4 r3, int i, int i2) {
        this.A07 = r3;
        this.A04 = i;
        this.A03 = i2;
        this.A05 = r1;
        this.A06 = r2;
    }

    public void BTW() {
        C55792qv r1 = this.A07.A02;
        C43912Ty r0 = this.A05;
        r1.A05(r0);
        C95814uZ r5 = r0.A07;
        AnonymousClass2Y7 r4 = this.A06;
        C60302yK r7 = r4.A01;
        C613830m r6 = r7.A07;
        AnonymousClass39K A032 = r6.A03(r5);
        C18270x1.A0g(C18270x1.A03(r7.A04).remove("storage_usage_deletion_jid").remove("storage_usage_deletion_current_msg_cnt"), "storage_usage_deletion_all_msg_cnt");
        r7.A02.A0J(new AnonymousClass3ZS(r6.A03(r5), r5));
        Iterator it = r7.A0A.iterator();
        while (it.hasNext()) {
            ((AnonymousClass4EC) it.next()).BQm(A032, r5);
        }
        r4.A00.BTW();
    }

    public void BZ0(int i, int i2) {
        int i3 = this.A02;
        if (i3 == -1) {
            i3 = Math.max(this.A03 / 100, 1);
            this.A02 = i3;
        }
        int i4 = this.A04 + i;
        this.A00 = i4;
        if (i4 - this.A01 > i3) {
            this.A06.A00(this.A05.A07, i4, this.A03);
            this.A01 = this.A00;
        }
    }

    public void Bc5() {
        this.A00 = this.A04;
    }

    public boolean Boa() {
        return false;
    }
}
