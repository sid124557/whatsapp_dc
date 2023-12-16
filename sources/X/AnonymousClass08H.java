package X;

import android.content.AsyncQueryHandler;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;

/* renamed from: X.08H  reason: invalid class name */
public final class AnonymousClass08H extends C06270Wx {
    public static final Uri A03 = new Uri.Builder().scheme("content").authority("androidx.car.app.connection").build();
    public final AsyncQueryHandler A00;
    public final Context A01;
    public final C000200d A02 = new C000200d(this);

    public void A08() {
        IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
        int i = Build.VERSION.SDK_INT;
        Context context = this.A01;
        C000200d r0 = this.A02;
        if (i >= 33) {
            AnonymousClass0H4.A00(r0, context, intentFilter);
        } else {
            context.registerReceiver(r0, intentFilter);
        }
        this.A00.startQuery(42, (Object) null, A03, new String[]{"CarConnectionState"}, (String) null, (String[]) null, (String) null);
    }

    public void A09() {
        this.A01.unregisterReceiver(this.A02);
        this.A00.cancelOperation(42);
    }

    public AnonymousClass08H(Context context) {
        this.A01 = context;
        this.A00 = new C000100b(context.getContentResolver(), this);
    }
}
