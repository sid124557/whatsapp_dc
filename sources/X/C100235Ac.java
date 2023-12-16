package X;

import android.content.Context;
import com.whatsapp.R;
import java.util.Locale;

/* renamed from: X.5Ac  reason: invalid class name and case insensitive filesystem */
public final class C100235Ac {
    public static String A00(Context context, AnonymousClass5ZU r6, C620733j r7, AnonymousClass3ZH r8) {
        String A0J = r6.A0J(r8);
        if (A0J == null) {
            A0J = "";
        }
        String A0H = r7.A0H(context.getString(R.string.f11nameremoved));
        String A0H2 = r7.A0H(A0J);
        String string = context.getString(R.string.f11nameremoved);
        Locale A02 = C620733j.A02(r7);
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A16(A0H2, A0H, A0M);
        return String.format(A02, string, A0M);
    }
}
