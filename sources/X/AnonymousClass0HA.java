package X;

import android.app.Activity;
import android.content.pm.PackageManager;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.0HA  reason: invalid class name */
public class AnonymousClass0HA {
    public static boolean A00(Activity activity, String str) {
        try {
            return AnonymousClass000.A1Z(activity.getApplication().getPackageManager(), AnonymousClass001.A0r(PackageManager.class, String.class, "shouldShowRequestPermissionRationale", new Class[1], 0), new Object[]{str});
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }
}
