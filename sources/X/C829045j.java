package X;

import android.widget.TextView;
import java.io.Serializable;

/* renamed from: X.45j  reason: invalid class name and case insensitive filesystem */
public abstract class C829045j implements AnonymousClass4GV, Serializable {
    public final int arity;

    public static C26491cD A08(Object obj) {
        C26491cD r1 = (C26491cD) obj;
        C162457s7.A0J(r1, 0);
        return r1;
    }

    public static C27851em A09(Object obj) {
        C27851em r1 = (C27851em) obj;
        C162457s7.A0J(r1, 0);
        return r1;
    }

    public static C59022wD A0A(C27851em r1, Object obj, int i) {
        r1.A01 = new C383026z(obj, i);
        return C59022wD.A00;
    }

    public static void A0B(C26491cD r2, Class cls) {
        r2.A04 = new AnonymousClass8PJ(cls);
        C371020y r1 = C371020y.IN_DEVELOPMENT;
        C162457s7.A0J(r1, 0);
        r2.A00 = r1;
    }

    public static void A0C(C26451c9 r1, Class cls) {
        r1.A01 = new AnonymousClass8PJ(cls);
    }

    public static void A0D(C27851em r1, Object obj, int i) {
        r1.A00 = new C383026z(obj, i);
    }

    public C829045j(int i) {
        this.arity = i;
    }

    public static int A01(AnonymousClass66R r1) {
        ((AnonymousClass5UY) r1.getValue()).A06(8);
        return 8;
    }

    public static TextView A02(AnonymousClass66R r2) {
        ((AnonymousClass5UY) r2.getValue()).A06(0);
        return (TextView) ((AnonymousClass5UY) r2.getValue()).A04();
    }

    public static C17190ui A03(C08310eF r0) {
        C17190ui B6u = r0.A0R().B6u();
        C162457s7.A0D(B6u);
        return B6u;
    }

    public static AnonymousClass0N2 A04(C08310eF r0) {
        AnonymousClass0N2 BEL = r0.A0R().BEL();
        C162457s7.A0D(BEL);
        return BEL;
    }

    public static AnonymousClass0N2 A05(AnonymousClass66R r0) {
        AnonymousClass0N2 BEL = ((C15940sD) r0.getValue()).BEL();
        C162457s7.A0D(BEL);
        return BEL;
    }

    public static C15940sD A06(AnonymousClass66R r0) {
        return (C15940sD) r0.getValue();
    }

    public static AnonymousClass0N3 A07(C08310eF r0) {
        return r0.A0R().B6t();
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String A00 = C57712u5.A00(this);
        C162457s7.A0D(A00);
        return A00;
    }
}
