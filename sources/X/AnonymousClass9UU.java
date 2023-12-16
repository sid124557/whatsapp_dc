package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.9UU  reason: invalid class name */
public class AnonymousClass9UU {
    public static final boolean A00;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        }
        A00 = z;
    }

    public static boolean A00(Context context) {
        if (!A00) {
            try {
                PackageManager packageManager = context.getPackageManager();
                packageManager.getClass();
                String[] strArr = packageManager.getPackageInfo(context.getPackageName(), ZipDecompressor.UNZIP_BUFFER_SIZE).requestedPermissions;
                if (strArr == null) {
                    return false;
                }
                for (String equals : strArr) {
                    if ("android.permission.CAMERA".equals(equals)) {
                        return true;
                    }
                }
                return false;
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("ContextUtil", "Could not find the package of this very app!", e);
                return false;
            }
        } else if (context.checkSelfPermission("android.permission.CAMERA") == 0) {
            return true;
        } else {
            return false;
        }
    }
}
