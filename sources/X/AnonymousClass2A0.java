package X;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.2A0  reason: invalid class name */
public final class AnonymousClass2A0 {
    public static Application A00(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
            if (context2 instanceof Application) {
                return (Application) context2;
            }
        }
        throw AnonymousClass000.A0H(context, "Could not find an Application in the given context: ", AnonymousClass001.A0o());
    }
}
