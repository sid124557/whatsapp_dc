package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.AlarmService;

/* renamed from: X.5iK  reason: invalid class name and case insensitive filesystem */
public final class C111575iK implements AnonymousClass66U {
    public final Context A00;

    public String BDW() {
        return "AlarmServiceAsyncInit";
    }

    public void BMd() {
        Context context = this.A00;
        Class<AlarmService> cls = AlarmService.class;
        AnonymousClass00W.A00(context, new Intent("com.whatsapp.action.SETUP", (Uri) null, context, cls), cls, 3);
    }

    public /* synthetic */ void BMe() {
    }

    public C111575iK(Context context) {
        this.A00 = context;
    }
}
