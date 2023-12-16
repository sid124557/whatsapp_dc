package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.287  reason: invalid class name */
public class AnonymousClass287 {
    public static String A00(Context context, C64773Ex r6, AnonymousClass5ZU r7, C624134x r8) {
        C95814uZ r0;
        AnonymousClass2z0 r1 = r8.A1J;
        if (r1.A02) {
            return context.getString(R.string.f11nameremoved);
        }
        C95814uZ r12 = r1.A00;
        if (C627336j.A0K(r12)) {
            r0 = r8.A0n();
        } else {
            r0 = r12;
        }
        if (r0 == null) {
            return "";
        }
        AnonymousClass3ZH A0A = r6.A0A(r0);
        int A0A2 = r7.A0A(r12);
        AnonymousClass7HU A0D = r7.A0D(A0A, A0A2, false, true);
        String str = A0D.A01;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        r7.A0G(A0D.A00, A0A, A0A2);
        return str2;
    }
}
