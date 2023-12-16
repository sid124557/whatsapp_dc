package X;

import java.util.List;

/* renamed from: X.10k  reason: invalid class name */
public class AnonymousClass10k extends C05550Ty {
    public AnonymousClass4AX A00;
    public String A01 = "";
    public boolean A02;
    public final AnonymousClass08M A03 = AnonymousClass08M.A01();
    public final AnonymousClass1VX A04;
    public final AnonymousClass2QZ A05;

    public void A0D() {
        AnonymousClass08M r1 = this.A03;
        if (r1.A07() != null && !((List) r1.A07()).isEmpty()) {
            A0E(this.A01, true);
        }
    }

    public final void A0E(String str, boolean z) {
        this.A02 = z;
        if (str.length() <= 20) {
            String A002 = new C116975rB("[\\p{Punct}¥%，。？；：（）【】「」《》—¡!«»¿?{}]").A00(str, "");
            if (A002.equals(this.A01) && !z) {
                return;
            }
            if (!A002.isEmpty()) {
                this.A01 = A002;
                AnonymousClass2QZ r5 = this.A05;
                C626936e.A01();
                C48652fF r4 = new C48652fF();
                if (r5.A01.A02) {
                    C33471tB r1 = r5.A00;
                    if (r1 != null) {
                        r1.A0D(true);
                        r5.A00 = null;
                    }
                    C33471tB r2 = new C33471tB(new AnonymousClass4KS(r4, 2), r5, r5.A02);
                    r5.A00 = r2;
                    r5.A03.BkL(r2, C18300x5.A1a(A002, 1));
                }
                AnonymousClass4AX r12 = this.A00;
                if (r12 == null) {
                    r12 = new C389029s(this, 2);
                    this.A00 = r12;
                }
                r4.A00(r12);
                return;
            }
        }
        this.A03.A0H(AnonymousClass002.A0I(0));
        this.A01 = "";
        AnonymousClass2QZ r22 = this.A05;
        C33471tB r13 = r22.A00;
        if (r13 != null) {
            r13.A0D(true);
            r22.A00 = null;
        }
    }

    public AnonymousClass10k(AnonymousClass1VX r2, AnonymousClass2QZ r3) {
        this.A04 = r2;
        this.A05 = r3;
    }
}
