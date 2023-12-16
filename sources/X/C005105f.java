package X;

import com.whatsapp.util.Log;

/* renamed from: X.05f  reason: invalid class name and case insensitive filesystem */
public abstract class C005105f extends AnonymousClass00W {
    public C16540tZ A04() {
        try {
            return super.A04();
        } catch (SecurityException e) {
            if (e.getMessage().contains("Caller no longer running")) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("WaJobIntentService/'Caller no longer running' failure for ");
                AnonymousClass000.A1A(this, A0o);
                Log.e(A0o.toString(), e);
                return null;
            }
            throw e;
        }
    }
}
