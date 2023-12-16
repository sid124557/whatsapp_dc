package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.2tV  reason: invalid class name and case insensitive filesystem */
public class C57352tV {
    public static boolean A01(Context context, Intent intent) {
        if (!intent.hasExtra("authentication_token")) {
            return false;
        }
        try {
            Intent A07 = C18320x8.A07();
            C18320x8.A10(A07, context.getPackageName(), "FakeClass");
            return C624735e.A00(context.getApplicationContext(), 0, A07, 0).equals((PendingIntent) intent.getParcelableExtra("authentication_token"));
        } catch (Exception e) {
            Log.e("conversation/unable to verify intent", e);
            return false;
        }
    }

    public static void A00(Context context, Intent intent) {
        intent.setPackage(context.getPackageName());
        Intent A07 = C18320x8.A07();
        C18320x8.A10(A07, context.getPackageName(), "FakeClass");
        intent.putExtra("authentication_token", C624735e.A00(context.getApplicationContext(), 0, A07, 0));
    }
}
