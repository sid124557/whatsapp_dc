package X;

import android.content.Context;
import android.content.pm.Signature;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.2BN  reason: invalid class name */
public class AnonymousClass2BN {
    public static Long A00;

    public static long A00(Context context) {
        long j;
        int length;
        Long l = A00;
        if (l == null) {
            if ("com.whatsapp".equals(context.getPackageName())) {
                long A002 = AnonymousClass345.A00(context, context.getPackageName());
                if (A002 >= ((long) 232614005) && A002 <= ((long) 232614009)) {
                    Signature[] A03 = AnonymousClass345.A03(context);
                    String str = null;
                    if (!(A03 == null || (length = A03.length) == 0)) {
                        try {
                            MessageDigest instance = MessageDigest.getInstance("SHA-1");
                            instance.reset();
                            int i = 0;
                            do {
                                instance.update(A03[i].toByteArray());
                                i++;
                            } while (i < length);
                            str = AnonymousClass0x7.A0s(instance.digest());
                        } catch (NoSuchAlgorithmException e) {
                            Log.e((Throwable) e);
                        }
                    }
                    if ("OKD31QX-GP7GT780Psqq8xDb15k".equals(str)) {
                        j = 1;
                        l = Long.valueOf(j);
                        A00 = l;
                    }
                }
            }
            j = 0;
            l = Long.valueOf(j);
            A00 = l;
        }
        return l.longValue();
    }
}
