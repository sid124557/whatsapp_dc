package X;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;

/* renamed from: X.7c3  reason: invalid class name and case insensitive filesystem */
public final class C153807c3 {
    public static boolean A00(Throwable th) {
        return th instanceof DeniedByServerException;
    }

    public static boolean A01(Throwable th) {
        return th instanceof NotProvisionedException;
    }
}
