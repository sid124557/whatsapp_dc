package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.2Wd  reason: invalid class name and case insensitive filesystem */
public class C44462Wd {
    public final C54292oU A00;

    public Notification A00() {
        Log.i("fpm/ChatTransferNotificationManager/buildDefaultNotification");
        Context context = this.A00.A00;
        PendingIntent A04 = C624735e.A04(context, context.getPackageManager().getLaunchIntentForPackage("com.whatsapp"), 0);
        C05610Ue A002 = C66553Lw.A00(context);
        A002.A03 = C18290x4.A17();
        AnonymousClass33T.A01(A04, A002);
        A002.A06 = 1;
        A002.A0B(context.getResources().getString(R.string.f11nameremoved));
        return A002.A01();
    }

    public C44462Wd(C54292oU r1) {
        this.A00 = r1;
    }
}
