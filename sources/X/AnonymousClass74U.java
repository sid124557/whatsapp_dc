package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* renamed from: X.74U  reason: invalid class name */
public final class AnonymousClass74U {
    public static final Context A00(Context context) {
        C162457s7.A0J(context, 0);
        Object systemService = context.getSystemService("display");
        C162457s7.A0K(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        Display display = ((DisplayManager) systemService).getDisplay(0);
        if (display == null) {
            return context;
        }
        Context createDisplayContext = context.createDisplayContext(display);
        C162457s7.A0D(createDisplayContext);
        return createDisplayContext;
    }
}
