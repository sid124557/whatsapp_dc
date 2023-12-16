package X;

import android.os.StrictMode;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* renamed from: X.32L  reason: invalid class name */
public class AnonymousClass32L {
    public static final List A05 = Arrays.asList(new String[]{"test_lint"});
    public String A00;
    public String A01;
    public boolean A02;
    public final String A03;
    public final String A04;

    public AnonymousClass32L(C46262bL r2) {
        String str = r2.A01;
        str.getClass();
        this.A01 = str;
        String str2 = r2.A00;
        str2.getClass();
        this.A00 = str2;
        this.A02 = r2.A04;
        this.A03 = r2.A02;
        this.A04 = r2.A03;
    }

    /* JADX INFO: finally extract failed */
    public static String A00() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            UUID randomUUID = UUID.randomUUID();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return randomUUID.toString();
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }
}
