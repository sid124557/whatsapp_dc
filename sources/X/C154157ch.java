package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;

/* renamed from: X.7ch  reason: invalid class name and case insensitive filesystem */
public final class C154157ch {
    public static Activity A00(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return A00(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static List A01(Activity activity) {
        if (activity instanceof C003203q) {
            return ((C003203q) activity).getSupportFragmentManager().A0Y.A05();
        }
        return null;
    }
}
