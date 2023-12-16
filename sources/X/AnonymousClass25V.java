package X;

import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.25V  reason: invalid class name */
public class AnonymousClass25V {
    public static Integer A00(C620633i r2, AnonymousClass5ZR r3) {
        Integer num = null;
        if (r3.A02("android.permission.READ_CONTACTS") != 0) {
            Log.i("phonebook/getCount/permission_denied");
        } else {
            Cursor A00 = C622134a.A00(r2, "phonebook/get_count/");
            if (A00 != null) {
                try {
                    num = Integer.valueOf(A00.getCount());
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
            }
            if (A00 != null) {
                A00.close();
                return num;
            }
        }
        return num;
    }
}
