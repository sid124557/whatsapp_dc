package X;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.6d8  reason: invalid class name and case insensitive filesystem */
public final class C131156d8 extends AnonymousClass84O {
    public void A0Y() {
        int i;
        int i2;
        boolean z = true;
        if (!C154137cf.A00(this)) {
            C160317nR A01 = C158977kt.A01();
            int i3 = this.A03;
            int[] A012 = A01.A01(i3);
            int length = A012.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    AnonymousClass84O A0J = A0K(A012[i4]);
                    if (A0J != null && (A0J.A00 & 1) != 0) {
                        break;
                    }
                    i4++;
                } else {
                    int[] A00 = C158977kt.A01().A00(i3);
                    int length2 = A00.length;
                    int i5 = 0;
                    loop2:
                    while (true) {
                        if (i5 >= length2) {
                            z = false;
                            break;
                        }
                        for (AnonymousClass84O r0 : A0R(A00[i5])) {
                            if (r0 != null && (r0.A00 & 1) != 0) {
                                break loop2;
                            }
                        }
                        i5++;
                    }
                }
            }
        }
        int i6 = this.A00;
        if (z) {
            i = i6 | 1;
        } else {
            i = i6 & -2;
        }
        this.A00 = i;
        LinkedHashSet A17 = AnonymousClass0x9.A17();
        if (C154137cf.A01(this)) {
            C18270x1.A1K(A17, this.A02);
        }
        C160317nR A013 = C158977kt.A01();
        int i7 = this.A03;
        for (int A0J2 : A013.A01(i7)) {
            AnonymousClass84O A0J3 = A0K(A0J2);
            if (A0J3 != null) {
                Set set = A0J3.A01;
                if (set == null) {
                    set = Collections.emptySet();
                }
                C162457s7.A0D(set);
                if (C18310x6.A1X(set)) {
                    A17.addAll(set);
                }
            }
        }
        for (int A0R : C158977kt.A01().A00(i7)) {
            for (AnonymousClass84O r02 : A0R(A0R)) {
                if (r02 != null) {
                    Set set2 = r02.A01;
                    if (set2 == null) {
                        set2 = Collections.emptySet();
                    }
                    C162457s7.A0D(set2);
                    if (C18310x6.A1X(set2)) {
                        A17.addAll(set2);
                    }
                }
            }
        }
        this.A01 = A17;
        boolean z2 = !A17.isEmpty();
        int i8 = this.A00;
        if (z2) {
            i2 = i8 | 2;
        } else {
            i2 = i8 & -3;
        }
        this.A00 = i2;
    }

    public C131156d8(List list, int i, int i2) {
        super(list, i, i2);
    }
}
