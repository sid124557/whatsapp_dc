package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: X.2Af  reason: invalid class name and case insensitive filesystem */
public class C38982Af {
    public static volatile AnonymousClass3DM A00;

    public static void A00(Context context, Throwable th) {
        File file;
        FileOutputStream A0h;
        boolean z;
        String str;
        try {
            if (AnonymousClass322.A01(context)) {
                File filesDir = context.getFilesDir();
                if (!AnonymousClass322.A01(context)) {
                    str = null;
                } else {
                    str = "account_switching";
                    if (!C18320x8.A0f(AnonymousClass000.A0X(":", C18320x8.A0k(context)), AnonymousClass322.A00).equals(str)) {
                        str = "unknown_process_name";
                    }
                }
                StringBuilder A0u = C18290x4.A0u(str);
                A0u.append("crash_sentinel_");
                file = C18270x1.A0A(filesDir, str, A0u);
            } else {
                file = AnonymousClass002.A0A(context.getFilesDir(), "crash_sentinel");
            }
            file.createNewFile();
            A0h = AnonymousClass0x9.A0h(file);
            Throwable th2 = th;
            while (true) {
                if (!(th2 instanceof OutOfMemoryError)) {
                    th2 = th2.getCause();
                    if (th2 == null) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            Throwable th3 = th;
            while (th3.getCause() != null) {
                th3 = th3.getCause();
            }
            AnonymousClass5KD r4 = new AnonymousClass5KD(th3.toString(), "2.23.26.14", C18300x5.A0W(th).toString(), C106965aS.A08, 546598543, z);
            AnonymousClass0x2.A1L(AnonymousClass0x9.A1G().put("isOom", r4.A05).put("deepestThrowable", r4.A01).put("versionName", "2.23.26.14").put("mobileBuildId", 546598543).put("stacktrace", r4.A03).put("sessionId", r4.A02).toString(), A0h);
            A0h.close();
        } catch (Exception e) {
            try {
                Log.e("Unable to create crash sentinel file", e);
            } catch (Throwable th4) {
                if (A00 != null) {
                    A00.A02();
                }
                throw th4;
            }
        } catch (Throwable th5) {
            th.addSuppressed(th5);
        }
        if (A00 != null) {
            A00.A02();
            return;
        }
        return;
        throw th;
    }
}
