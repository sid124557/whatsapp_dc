package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.2zo  reason: invalid class name and case insensitive filesystem */
public class C61162zo {
    public final int A00;
    public final int A01;
    public final Set A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61162zo)) {
            return false;
        }
        C61162zo r4 = (C61162zo) obj;
        return this.A01 == r4.A01 && this.A00 == r4.A00 && this.A02.equals(r4.A02);
    }

    public static C61162zo A00(C21511Cc r3) {
        int i = r3.bitField0_;
        if ((i & 1) == 0 || (i & 2) == 0 || r3.deviceIndexes_.size() == 0) {
            return null;
        }
        return new C61162zo(AnonymousClass0x9.A15(r3.deviceIndexes_), r3.rawId_, r3.currentIndex_);
    }

    public C21511Cc A01() {
        C130546c9 A0G = C21511Cc.DEFAULT_INSTANCE.A0G();
        int i = this.A01;
        C21511Cc r1 = (C21511Cc) C18320x8.A0C(A0G);
        r1.bitField0_ |= 1;
        r1.rawId_ = i;
        int i2 = this.A00;
        C21511Cc r12 = (C21511Cc) C18320x8.A0C(A0G);
        r12.bitField0_ |= 2;
        r12.currentIndex_ = i2;
        Set set = this.A02;
        C21511Cc r2 = (C21511Cc) C18320x8.A0C(A0G);
        C85224Fk r13 = r2.deviceIndexes_;
        if (!((AnonymousClass8T6) r13).A00) {
            r13 = C130786cX.A06(r13);
            r2.deviceIndexes_ = r13;
        }
        C170208Ch.A05(set, r13);
        return (C21511Cc) A0G.A06();
    }

    public C61162zo(Set set, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        AnonymousClass000.A1L(A1X, this.A01);
        AnonymousClass000.A1M(A1X, this.A00);
        return C18310x6.A08(this.A02, A1X, 2);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SyncdKeyFingerprint{");
        A0o.append("rawId=");
        A0o.append(this.A01);
        A0o.append(", currentIndex=");
        A0o.append(this.A00);
        A0o.append(", deviceIndexes=");
        return AnonymousClass000.A0Q(this.A02, A0o);
    }
}
