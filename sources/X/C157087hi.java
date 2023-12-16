package X;

/* renamed from: X.7hi  reason: invalid class name and case insensitive filesystem */
public final class C157087hi {
    public static final C157087hi A00 = new C157087hi();

    public final long A00(int i, int i2, int i3, int i4) {
        C153227at r14;
        C153227at r13;
        int i5 = i;
        int i6 = i2;
        if (i5 == i6) {
            r14 = AnonymousClass6NF.A00;
        } else if (i == 0) {
            r14 = AnonymousClass6NH.A00;
        } else {
            r14 = AnonymousClass6NG.A00;
        }
        int i7 = i3;
        int i8 = i4;
        if (i7 == i8) {
            r13 = AnonymousClass6NF.A00;
        } else if (i3 == 0) {
            r13 = AnonymousClass6NH.A00;
        } else {
            r13 = AnonymousClass6NG.A00;
        }
        C175698Zj r1 = r14.A01;
        int i9 = r1.A00;
        int i10 = r1.A01;
        C175698Zj r0 = r13.A01;
        int i11 = r0.A00;
        int i12 = r0.A01;
        if (i < 0) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("minWidth must be >= 0, but was: ");
            A0o.append(i5);
            AnonymousClass6C7.A1J(". minWidth=", ", maxWidth=", A0o, i5, i6);
            A0o.append(", minHeight=");
            A0o.append(i7);
            throw AnonymousClass000.A0G(", maxHeight=", A0o, i8);
        } else if (i3 >= 0) {
            int i13 = i9;
            if (i5 <= i13 || i5 == Integer.MAX_VALUE) {
                int i14 = i10;
                if (i6 > i14 && i6 != Integer.MAX_VALUE) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    AnonymousClass6C7.A1J("maxWidth must be <= ", ", but was: ", A0o2, i14, i6);
                    AnonymousClass6C7.A1J(". Components this big may affect performance and lead to out of memory errors. minWidth=", ", maxWidth=", A0o2, i5, i6);
                    A0o2.append(", minHeight=");
                    A0o2.append(i7);
                    throw AnonymousClass000.A0G(", maxHeight=", A0o2, i8);
                } else if (i7 > i11 && i7 != Integer.MAX_VALUE) {
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    AnonymousClass6C7.A1J("minHeight must be <= ", ", but was: ", A0o3, i11, i7);
                    AnonymousClass6C7.A1J(". Components this big may affect performance and lead to out of memory errors. minWidth=", ", maxWidth=", A0o3, i5, i6);
                    A0o3.append(", minHeight=");
                    A0o3.append(i7);
                    throw AnonymousClass000.A0G(", maxHeight=", A0o3, i8);
                } else if (i8 > i12 && i8 != Integer.MAX_VALUE) {
                    StringBuilder A0o4 = AnonymousClass001.A0o();
                    AnonymousClass6C7.A1J("maxHeight must be <= ", ", but was: ", A0o4, i12, i8);
                    AnonymousClass6C7.A1J(". Components this big may affect performance and lead to out of memory errors. minWidth=", ", maxWidth=", A0o4, i5, i6);
                    A0o4.append(", minHeight=");
                    A0o4.append(i7);
                    throw AnonymousClass000.A0G(", maxHeight=", A0o4, i8);
                } else if (i5 > i6) {
                    StringBuilder A0o5 = AnonymousClass001.A0o();
                    A0o5.append("maxWidth must be >= minWidth, but was: maxWidth=");
                    A0o5.append(i6);
                    A0o5.append("; minWidth=");
                    A0o5.append(i5);
                    AnonymousClass6C7.A1J(". minWidth=", ", maxWidth=", A0o5, i5, i6);
                    A0o5.append(", minHeight=");
                    A0o5.append(i7);
                    throw AnonymousClass000.A0G(", maxHeight=", A0o5, i8);
                } else if (i7 <= i8) {
                    return (r14.A05(i5, i6) << 32) | r13.A05(i7, i8);
                } else {
                    StringBuilder A0o6 = AnonymousClass001.A0o();
                    A0o6.append("maxHeight must be >= minHeight, but was: maxHeight=");
                    A0o6.append(i8);
                    AnonymousClass6C7.A1J("; minHeight=", ". minWidth=", A0o6, i7, i5);
                    AnonymousClass6C7.A1J(", maxWidth=", ", minHeight=", A0o6, i6, i7);
                    throw AnonymousClass000.A0G(", maxHeight=", A0o6, i8);
                }
            } else {
                StringBuilder A0o7 = AnonymousClass001.A0o();
                AnonymousClass6C7.A1J("minWidth must be <= ", ", but was: ", A0o7, i13, i5);
                AnonymousClass6C7.A1J(". Components this big may affect performance and lead to out of memory errors. minWidth=", ", maxWidth=", A0o7, i5, i6);
                A0o7.append(", minHeight=");
                A0o7.append(i7);
                throw AnonymousClass000.A0G(", maxHeight=", A0o7, i8);
            }
        } else {
            StringBuilder A0o8 = AnonymousClass001.A0o();
            AnonymousClass6C7.A1J("minHeight must be >= 0, but was: ", ". minWidth=", A0o8, i7, i5);
            AnonymousClass6C7.A1J(", maxWidth=", ", minHeight=", A0o8, i6, i7);
            throw AnonymousClass000.A0G(", maxHeight=", A0o8, i8);
        }
    }
}
