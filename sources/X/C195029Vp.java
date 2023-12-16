package X;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.9Vp  reason: invalid class name and case insensitive filesystem */
public class C195029Vp {
    public static int A00 = 270;
    public static Boolean A01;
    public static boolean A02;

    public static boolean A00() {
        boolean booleanValue;
        synchronized (C195029Vp.class) {
            Boolean bool = A01;
            if (bool == null) {
                try {
                    Boolean bool2 = (Boolean) Class.forName("com.facebook.endtoend.EndToEnd").getMethod("isRunningEndToEndTest", new Class[0]).invoke((Object) null, new Object[0]);
                    if (bool2 == null || !bool2.booleanValue()) {
                        bool = Boolean.FALSE;
                    } else {
                        boolean exists = new File("/sdcard/e2e/media/fineYoungGentleman.jpg").exists();
                        C162477s9.A05(bool2, "OpticE2EConfig", "is e2e test: %s");
                        bool = Boolean.valueOf(exists);
                        C162477s9.A05(bool, "OpticE2EConfig", "static frame file exists: %s");
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException e) {
                    if (!A02) {
                        Log.i("OpticE2EConfig", "Failed to access test", e);
                    }
                    bool = Boolean.FALSE;
                }
                A01 = bool;
            }
            booleanValue = bool.booleanValue();
        }
        return booleanValue;
    }

    public static byte[] A01() {
        try {
            File file = new File("/sdcard/e2e/media/fineYoungGentleman.jpg");
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[((int) file.length())];
            fileInputStream.read(bArr);
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
