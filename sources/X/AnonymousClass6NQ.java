package X;

import android.content.Context;
import android.util.Log;

/* renamed from: X.6NQ  reason: invalid class name */
public class AnonymousClass6NQ extends AnonymousClass7Uk {
    public int A00;
    public Context A01;
    public AnonymousClass6NR A02;

    public String toString() {
        return this.A02.toString();
    }

    public AnonymousClass6NQ(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.A01 = applicationContext;
        if (applicationContext == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: ");
            Log.w("SoLoader", AnonymousClass000.A0X(context.getApplicationInfo().nativeLibraryDir, A0o));
            this.A01 = context;
            applicationContext = context;
        }
        this.A00 = i;
        this.A02 = new AnonymousClass6NR(AnonymousClass002.A0B(applicationContext.getApplicationInfo().nativeLibraryDir), new String[0], i);
    }
}
