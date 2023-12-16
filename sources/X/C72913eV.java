package X;

import java.util.List;

/* renamed from: X.3eV  reason: invalid class name and case insensitive filesystem */
public final class C72913eV implements C85154Fd {
    public final long A00;

    public AnonymousClass4C8 Az9(C85564Gt r5) {
        return C58072uf.A00(new AnonymousClass4J6((AnonymousClass4GR) new C74783kP((C84814Du) null), C57752u9.A00(new C74983pO((C84814Du) null, this), r5), 8));
    }

    public String toString() {
        AnonymousClass8U9 r7 = new AnonymousClass8U9(2);
        long j = this.A00;
        if (j > 0) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("stopTimeout=");
            A0o.append(j);
            C18270x1.A1D("ms", A0o, r7);
        }
        List A0h = C159507lx.A0h(r7);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("SharingStarted.WhileSubscribed(");
        return C18260x0.A07(C73723fy.A0A(", ", A0h, (AnonymousClass4GQ) null), A0o2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C72913eV) || this.A00 != ((C72913eV) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(AnonymousClass0x2.A02(this.A00), Long.MAX_VALUE);
    }

    public C72913eV(long j) {
        this.A00 = j;
        if (!AnonymousClass001.A1U((j > 0 ? 1 : (j == 0 ? 0 : -1)))) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("stopTimeout(");
            A0o.append(j);
            throw AnonymousClass000.A0F(" ms) cannot be negative", A0o);
        }
    }
}
