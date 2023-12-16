package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* renamed from: X.31j  reason: invalid class name and case insensitive filesystem */
public class C615731j {
    public static int A00(C624134x r1) {
        if (r1 instanceof C30421mQ) {
            return 1;
        }
        if (r1 instanceof C30411mP) {
            return ((C30411mP) r1).A1v().size();
        }
        if (!AnonymousClass31H.A02(r1)) {
            return 0;
        }
        AnonymousClass1nF r12 = (AnonymousClass1nF) r1;
        AnonymousClass33C r0 = r12.A01;
        if (r0 != null) {
            return r0.A01;
        }
        return r12.A00;
    }

    public static List A02(C624134x r3, AnonymousClass5TD r4) {
        File A01;
        if (r3 instanceof C30421mQ) {
            return Collections.singletonList(((C30421mQ) r3).A1v());
        }
        if (r3 instanceof C30411mP) {
            return ((C30411mP) r3).A1v();
        }
        if (AnonymousClass31H.A02(r3) && (A01 = C30471mV.A01((C30471mV) r3)) != null) {
            try {
                return C106325Yn.A00(r4.A01(Uri.fromFile(A01)));
            } catch (IOException e) {
                Log.e("vcardloader/splitvcards/exception", e);
            }
        }
        return null;
    }

    public static String A01(Context context, C624134x r3) {
        if (!AnonymousClass31H.A02(r3)) {
            return null;
        }
        String A1x = ((C30471mV) r3).A1x();
        if (TextUtils.isEmpty(A1x)) {
            return context.getString(R.string.f11nameremoved);
        }
        return C627536m.A09(A1x);
    }
}
