package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5jj  reason: invalid class name and case insensitive filesystem */
public class C112435jj implements C185658u2 {
    public final int A00;
    public final C117005rE A01;
    public final AnonymousClass5RB A02;
    public final AnonymousClass3ZH A03;
    public final List A04;

    public C112435jj(C117005rE r7, AnonymousClass5RB r8, AnonymousClass3ZH r9) {
        this(r7, r8, r9, (List) null, -1);
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        AnonymousClass000.A1L(objArr, 2);
        objArr[1] = this.A01;
        objArr[2] = this.A03;
        objArr[3] = this.A02;
        objArr[4] = this.A04;
        C18310x6.A1U(objArr, this.A00);
        return Arrays.hashCode(objArr);
    }

    public C117005rE B58() {
        return this.A01;
    }

    public int B8k() {
        return 2;
    }

    public /* bridge */ /* synthetic */ C95814uZ B8o() {
        AnonymousClass3ZH A022 = this.A01.A02();
        if (A022 == null) {
            return null;
        }
        return (C95814uZ) AnonymousClass3ZH.A03(A022);
    }

    public int BCW() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C112435jj)) {
            return false;
        }
        C112435jj r4 = (C112435jj) obj;
        if (!Collections.unmodifiableList(this.A01.A04).equals(Collections.unmodifiableList(r4.A01.A04)) || !AnonymousClass75J.A00(this.A03, r4.A03) || !AnonymousClass75J.A00(this.A02, r4.A02) || !AnonymousClass75J.A00(this.A04, r4.A04) || this.A00 != r4.A00) {
            return false;
        }
        return true;
    }

    public C112435jj(C117005rE r1, AnonymousClass5RB r2, AnonymousClass3ZH r3, List list, int i) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = list;
        this.A00 = i;
    }
}
