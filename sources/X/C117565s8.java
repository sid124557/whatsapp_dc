package X;

import com.whatsapp.R;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.5s8  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117565s8 implements Runnable {
    public final /* synthetic */ C835748y A00;
    public final /* synthetic */ AnonymousClass64F A01;
    public final /* synthetic */ C69263Wi A02;
    public final /* synthetic */ C621033m A03;
    public final /* synthetic */ C620733j A04;
    public final /* synthetic */ AnonymousClass36Y A05;
    public final /* synthetic */ AnonymousClass1VX A06;
    public final /* synthetic */ AnonymousClass4FV A07;
    public final /* synthetic */ AnonymousClass30N A08;
    public final /* synthetic */ C50222hp A09;
    public final /* synthetic */ C45042Yl A0A;
    public final /* synthetic */ Set A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    public final void run() {
        AnonymousClass4FV r9 = this.A07;
        AnonymousClass36Y r8 = this.A05;
        AnonymousClass30N r10 = this.A08;
        Set set = this.A0B;
        C50222hp r11 = this.A09;
        C45042Yl r12 = this.A0A;
        boolean z = this.A0D;
        C835748y r6 = this.A00;
        C69263Wi r5 = this.A02;
        C621033m r2 = this.A03;
        boolean z2 = this.A0C;
        AnonymousClass1VX r0 = this.A06;
        C620733j r4 = this.A04;
        AnonymousClass64F r3 = this.A01;
        boolean z3 = false;
        AnonymousClass5ZW.A02(r8, r9, r10, r11, r12, set, 0);
        if (z && r6 != null) {
            z3 = true;
            if (set.size() > 999) {
                r5.A0I(R.string.f11nameremoved, 1);
                return;
            }
        }
        r2.A0Y(set, z2, z3);
        if (z3) {
            r5.A0S(new C70173a4(set, 10, r6));
        } else {
            C624134x A0T = C18300x5.A0T(set.iterator());
            boolean A0X = r0.A0X(5141);
            boolean A1U = AnonymousClass000.A1U(set.size(), 1);
            if (!A0X || !A1U || A0T == null || !C624134x.A0g(A0T)) {
                long size = (long) set.size();
                Object[] objArr = new Object[1];
                AnonymousClass000.A1P(objArr, set.size(), 0);
                r5.A0Q(r4.A0L(objArr, R.plurals.f9nameremoved, size), 0);
            }
        }
        Objects.requireNonNull(r3);
        r5.A0S(new C117645sG((Object) r3, 10));
    }

    public /* synthetic */ C117565s8(C835748y r1, AnonymousClass64F r2, C69263Wi r3, C621033m r4, C620733j r5, AnonymousClass36Y r6, AnonymousClass1VX r7, AnonymousClass4FV r8, AnonymousClass30N r9, C50222hp r10, C45042Yl r11, Set set, boolean z, boolean z2) {
        this.A07 = r8;
        this.A05 = r6;
        this.A08 = r9;
        this.A0B = set;
        this.A09 = r10;
        this.A0A = r11;
        this.A0D = z;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A0C = z2;
        this.A06 = r7;
        this.A04 = r5;
        this.A01 = r2;
    }
}
