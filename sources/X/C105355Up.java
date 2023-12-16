package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.5Up  reason: invalid class name and case insensitive filesystem */
public class C105355Up {
    public AnonymousClass3LP A00;
    public C183538qC A01;
    public Boolean A02;
    public final AnonymousClass1VX A03;

    public Set A00() {
        String A0Q = this.A03.A0Q(2246);
        if (A0Q == null || A0Q.isEmpty()) {
            return AnonymousClass002.A0K();
        }
        HashSet A0K = AnonymousClass002.A0K();
        for (String add : A0Q.split(":")) {
            A0K.add(add);
        }
        return A0K;
    }

    public boolean A02() {
        AnonymousClass1VX r1 = this.A03;
        if (!r1.A0X(1890) || !C86634Kw.A1a(r1)) {
            return false;
        }
        return true;
    }

    public boolean A03() {
        AnonymousClass1VX r1 = this.A03;
        if (!C86634Kw.A1a(r1) || !r1.A0X(1920)) {
            return false;
        }
        return true;
    }

    public boolean A04() {
        C183538qC r0;
        if (!C86634Kw.A1a(this.A03)) {
            return false;
        }
        if (!(this.A02 != null || (r0 = this.A01) == null || r0.get() == null)) {
            C622534h r1 = (C622534h) this.A01.get();
            this.A02 = Boolean.valueOf(r1.A05(r1.A05.A00));
        }
        Boolean bool = this.A02;
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public boolean A06() {
        AnonymousClass1VX r1 = this.A03;
        if (!C86634Kw.A1a(r1) || !r1.A0X(4690)) {
            return false;
        }
        return true;
    }

    public boolean A07() {
        AnonymousClass1VX r1 = this.A03;
        if (!C86634Kw.A1a(r1) || !r1.A0X(3587)) {
            return false;
        }
        return true;
    }

    public boolean A08() {
        AnonymousClass1VX r1 = this.A03;
        if (!C86634Kw.A1a(r1) || !r1.A0X(2613)) {
            return false;
        }
        return true;
    }

    public boolean A09() {
        AnonymousClass1VX r1 = this.A03;
        if (!C86634Kw.A1a(r1) || !r1.A0X(4492)) {
            return false;
        }
        return true;
    }

    public boolean A0A() {
        AnonymousClass1VX r1 = this.A03;
        if (!C86634Kw.A1a(r1) || !r1.A0X(3984)) {
            return false;
        }
        return true;
    }

    public C105355Up(AnonymousClass1VX r1, AnonymousClass3LP r2) {
        this.A03 = r1;
        this.A00 = r2;
    }

    public boolean A01() {
        if (!A04() || !this.A03.A0X(3400)) {
            return false;
        }
        return true;
    }

    public boolean A05() {
        if (!A04() || !this.A03.A0X(4486)) {
            return false;
        }
        return true;
    }
}
