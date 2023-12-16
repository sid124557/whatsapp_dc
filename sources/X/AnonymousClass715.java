package X;

import com.facebook.bloks.common.implementations.components.imagenode.log.BloksImageCallerContext;
import com.whatsapp.R;

/* renamed from: X.715  reason: invalid class name */
public final class AnonymousClass715 {
    public static final Object A00(C153427bI r3, AnonymousClass84O r4) {
        String str = (String) r3.A01.get(R.id.bk_context_key_app_id);
        if (str == null) {
            return "BloksImageComponent";
        }
        AnonymousClass84O A0J = r4.A0K(46);
        String str2 = null;
        if (A0J != null) {
            str2 = AnonymousClass84O.A08(A0J);
        }
        return new BloksImageCallerContext(str, str2, A0J);
    }
}
