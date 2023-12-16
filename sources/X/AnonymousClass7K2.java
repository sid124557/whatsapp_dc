package X;

import android.content.Context;
import android.util.Log;

/* renamed from: X.7K2  reason: invalid class name */
public final class AnonymousClass7K2 {
    public final C158887ki A00;
    public final C157897j6 A01;
    public final String A02;

    public AnonymousClass7K2(Context context, C157897j6 r9) {
        Context context2 = context;
        this.A02 = context.getPackageName();
        C157897j6 r4 = r9;
        this.A01 = r9;
        if (!C154967e3.A00(context)) {
            Object[] A0U = AnonymousClass4L0.A0U();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", C157897j6.A00(r9.A00, "Phonesky is not installed.", A0U));
                return;
            }
            return;
        }
        this.A00 = new C158887ki(context2, AnonymousClass776.A00, r4, AnonymousClass8CI.A00, "ExpressIntegrityService");
    }
}
