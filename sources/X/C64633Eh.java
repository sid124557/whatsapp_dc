package X;

import java.util.List;

/* renamed from: X.3Eh  reason: invalid class name and case insensitive filesystem */
public final class C64633Eh implements AnonymousClass671 {
    public final int A00;
    public final C15790rw A01;
    public final C620733j A02;
    public final AnonymousClass107 A03 = new AnonymousClass107(Boolean.FALSE);
    public final Runnable A04;
    public final List A05 = AnonymousClass001.A0s();

    public C64633Eh(C15790rw r3, C620733j r4, Runnable runnable, int i) {
        C162457s7.A0J(r4, 1);
        this.A02 = r4;
        this.A00 = i;
        this.A04 = runnable;
        this.A01 = r3;
    }

    public boolean Bqc(int i, Object obj) {
        Object A07 = this.A03.A07();
        C162457s7.A0D(A07);
        boolean A1Z = AnonymousClass001.A1Z(A07);
        if (5 - i != 0) {
            return !A1Z;
        }
        if (A1Z) {
            List list = this.A05;
            if (!list.isEmpty()) {
                if (obj == null) {
                    return false;
                }
                if (C107155an.A05(this.A02, ((C52272lD) obj).A00.A03, list, true)) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}
