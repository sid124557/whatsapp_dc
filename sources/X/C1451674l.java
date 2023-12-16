package X;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import org.chromium.net.CronetException;

/* renamed from: X.74l  reason: invalid class name and case insensitive filesystem */
public class C1451674l {
    public static int A00(Exception exc) {
        if (exc instanceof UnknownHostException) {
            return 2;
        }
        if (exc instanceof SocketTimeoutException) {
            return 3;
        }
        if (exc instanceof ConnectException) {
            return 19;
        }
        if (!(exc instanceof CronetException)) {
            return 18;
        }
        Integer A00 = C154457dC.A00(exc);
        if (!C154457dC.A01(exc) || A00 == null) {
            return 22;
        }
        return A00.intValue();
    }
}
