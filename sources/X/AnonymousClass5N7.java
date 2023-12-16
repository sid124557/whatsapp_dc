package X;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.whatsapp.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.5N7  reason: invalid class name */
public class AnonymousClass5N7 {
    public final Application A00;
    public final C55682qk A01;

    public void A00() {
        Throwable e;
        if (Build.VERSION.SDK_INT == 21) {
            try {
                Class.forName("android.media.session.MediaSessionLegacyHelper").getDeclaredMethod("getHelper", new Class[]{Context.class}).invoke((Object) null, new Object[]{this.A00});
            } catch (InvocationTargetException e2) {
                e = e2.getTargetException();
                Log.e("MediaSessionLegacyHelperLeakFix/applyFix", e);
                this.A01.A09("MediaSessionLegacyHelperLeakFix", e.getMessage(), e);
            } catch (Exception e3) {
                e = e3;
                Log.e("MediaSessionLegacyHelperLeakFix/applyFix", e);
                this.A01.A09("MediaSessionLegacyHelperLeakFix", e.getMessage(), e);
            }
        }
    }

    public AnonymousClass5N7(Application application, C55682qk r2) {
        this.A01 = r2;
        this.A00 = application;
    }
}
