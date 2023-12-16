package X;

import android.database.Cursor;
import java.util.HashMap;

/* renamed from: X.26E  reason: invalid class name */
public final class AnonymousClass26E {
    public static final HashMap A00(Cursor cursor, byte b) {
        String[] strArr;
        C162457s7.A0J(cursor, 0);
        HashMap A0t = AnonymousClass001.A0t();
        C626135u.A02(cursor, A0t, C66203Kl.A00);
        if (b == 56) {
            strArr = C66183Kj.A00;
        } else if (b == 67) {
            strArr = C66173Ki.A00;
        } else if (b == 68) {
            strArr = C66143Kf.A00;
        } else if (b == 79) {
            strArr = C66163Kh.A00;
        } else {
            if (b != 74) {
                if (b == 86) {
                    strArr = C66193Kk.A00;
                } else if (b == 93) {
                    strArr = C39112As.A00;
                } else {
                    throw AnonymousClass001.A0c("MessageAddOnUtilsV2/getColIndexesForMessageAddOnStatements messageAddOnType not supported");
                }
            }
            return A0t;
        }
        C626135u.A02(cursor, A0t, strArr);
        return A0t;
    }
}
