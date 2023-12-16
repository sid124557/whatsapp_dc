package X;

import org.chromium.net.NetworkException;

/* renamed from: X.7dC  reason: invalid class name and case insensitive filesystem */
public final class C154457dC {
    public static Integer A00(Throwable th) {
        int i;
        if (th instanceof NetworkException) {
            NetworkException networkException = (NetworkException) th;
            int errorCode = networkException.getErrorCode();
            int cronetInternalErrorCode = networkException.getCronetInternalErrorCode();
            int i2 = 2;
            if (errorCode != 1) {
                if (errorCode != 2) {
                    i2 = 4;
                    if (errorCode != 4) {
                        if (errorCode != 11) {
                            if (errorCode != 6) {
                                if (errorCode == 7) {
                                    i = 19;
                                }
                            }
                        } else if (cronetInternalErrorCode != -103) {
                            if (!(cronetInternalErrorCode == -18 || cronetInternalErrorCode == -176)) {
                                if (cronetInternalErrorCode == -107) {
                                    i = 15;
                                }
                            }
                        }
                    }
                    return 3;
                }
                i = 25;
                return Integer.valueOf(i);
            }
            return Integer.valueOf(i2);
        }
        return null;
    }

    public static boolean A01(Throwable th) {
        if (!(th instanceof NetworkException)) {
            return false;
        }
        NetworkException networkException = (NetworkException) th;
        int errorCode = networkException.getErrorCode();
        int cronetInternalErrorCode = networkException.getCronetInternalErrorCode();
        if (!(errorCode == 1 || errorCode == 9 || errorCode == 2 || errorCode == 4 || errorCode == 6 || errorCode == 7)) {
            if (errorCode != 11) {
                return false;
            }
            if (cronetInternalErrorCode == -103 || cronetInternalErrorCode == -107 || cronetInternalErrorCode == -202 || cronetInternalErrorCode == -176 || cronetInternalErrorCode == -18) {
                return true;
            }
            return false;
        }
        return true;
    }
}
