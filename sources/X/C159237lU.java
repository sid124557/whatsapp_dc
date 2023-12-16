package X;

import android.os.Build;
import android.util.Log;
import com.facebook.soloader.SysUtil$LollipopSysdeps;
import com.facebook.soloader.SysUtil$MarshmallowSysdeps;
import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: X.7lU  reason: invalid class name and case insensitive filesystem */
public final class C159237lU {
    public static String[] A02() {
        if (Build.VERSION.SDK_INT >= 23) {
            return SysUtil$MarshmallowSysdeps.getSupportedAbis();
        }
        return SysUtil$LollipopSysdeps.getSupportedAbis();
    }

    public static void A00(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File A00 : listFiles) {
                    A00(A00);
                }
            } else {
                return;
            }
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            Log.e("SysUtil", AnonymousClass000.A0P(parentFile, "Enable write permission failed: ", AnonymousClass001.A0o()));
        }
        if (!file.delete() && file.exists()) {
            throw AnonymousClass002.A0C(AnonymousClass000.A0P(file, "Could not delete file ", AnonymousClass001.A0o()));
        }
    }

    public static void A01(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File A01 : listFiles) {
                    A01(A01);
                }
                return;
            }
            throw AnonymousClass002.A0C(AnonymousClass000.A0P(file, "cannot list directory ", AnonymousClass001.A0o()));
        } else if (!file.getPath().endsWith("_lock")) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }
}
