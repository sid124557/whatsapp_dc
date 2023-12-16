package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.29R  reason: invalid class name */
public class AnonymousClass29R {
    public static boolean A00(Context context, Intent intent) {
        try {
            AnonymousClass0Y8.A0A(context, intent);
            return true;
        } catch (IllegalStateException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Failed to start foreground service ");
            Log.w(AnonymousClass000.A0R(intent.getComponent(), A0o), e);
            return false;
        }
    }
}
