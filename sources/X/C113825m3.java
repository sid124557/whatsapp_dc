package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.5m3  reason: invalid class name and case insensitive filesystem */
public class C113825m3 implements C836849j {
    public final C64393Dh A00;

    public static long[] A00(File file) {
        long[] jArr = {0, 0};
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    jArr[0] = jArr[0] + file2.length();
                    jArr[1] = jArr[1] + 1;
                } else if (file2.isDirectory()) {
                    long[] A002 = A00(file2);
                    jArr[0] = jArr[0] + A002[0];
                    jArr[1] = jArr[1] + A002[1];
                }
            }
        } else {
            C18260x0.A1S(AnonymousClass001.A0o(), "mediafoldersize listedFiles is null for folder ", file);
        }
        return jArr;
    }

    public void BYP(C134256ih r7) {
        String str;
        C64393Dh r5 = this.A00;
        File A0G = r5.A0G();
        if (A0G.exists() && A0G.isDirectory()) {
            try {
                long[] A002 = A00(A0G);
                r7.A13 = Long.valueOf(A002[0]);
                r7.A12 = Long.valueOf(A002[1]);
                File A0J = r5.A0J();
                if (!A0J.exists() || !A0J.isDirectory()) {
                    Log.e("fieldstathelpers/update-media-folder-fieldstats/error/video-folder-does-not-exist");
                    return;
                }
                long[] A003 = A00(A0J);
                r7.A1K = Long.valueOf(A003[0]);
                r7.A1J = Long.valueOf(A003[1]);
            } catch (StackOverflowError e) {
                e = e;
                str = "fieldstathelpers/update-media-folder-fieldstats/error/stackoverflow";
                Log.e(str, e);
            } catch (OutOfMemoryError e2) {
                e = e2;
                str = "fieldstathelpers/update-media-folder-fieldstats/error/outofmemory";
                Log.e(str, e);
            }
        }
    }

    public C113825m3(C64393Dh r1) {
        this.A00 = r1;
    }
}
