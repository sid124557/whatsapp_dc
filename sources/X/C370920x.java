package X;

import java.util.Arrays;

/* renamed from: X.20x  reason: invalid class name and case insensitive filesystem */
public enum C370920x {
    SKIP_THUMBNAILS,
    SKIP_ADDONS,
    SKIP_COMMENT_INFO;

    public static C51692kE A00(Object[] objArr) {
        objArr[0] = SKIP_ADDONS;
        objArr[1] = SKIP_THUMBNAILS;
        return new C51692kE(C73833g9.A06(Arrays.copyOf(objArr, 2)), false);
    }

    /* access modifiers changed from: public */
    static {
        C370920x[] r0;
        A00 = C73653fr.A00(r0);
    }
}
