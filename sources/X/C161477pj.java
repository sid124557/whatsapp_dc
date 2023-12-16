package X;

import android.os.StrictMode;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.7pj  reason: invalid class name and case insensitive filesystem */
public class C161477pj {
    public static long A00(Map map, boolean z) {
        String A0n;
        if (map == null) {
            return -1;
        }
        List A02 = A02("Content-Range", map, z);
        if (A02 == null || A02.isEmpty()) {
            List A022 = A02("Content-Length", map, z);
            if (A022 == null || A022.isEmpty()) {
                return -1;
            }
            A0n = AnonymousClass001.A0n(A022, 0);
        } else {
            String A0n2 = AnonymousClass001.A0n(A02, 0);
            A0n = AnonymousClass6C9.A0c(A0n2.lastIndexOf(47), A0n2).trim();
        }
        return Long.parseLong(A0n);
    }

    public static String A01(C161387pX r1) {
        return C18310x6.A0o("x-fb-qpl-ec", r1.A05.A0N);
    }

    public static boolean A04(C161387pX r1) {
        return AnonymousClass000.A1S(r1.A05.A0N.containsKey("x-fb-qpl-ec") ? 1 : 0);
    }

    public static List A02(String str, Map map, boolean z) {
        if (!map.containsKey(str)) {
            if (!z) {
                return null;
            }
            Locale locale = Locale.US;
            if (!map.containsKey(str.toLowerCase(locale))) {
                return null;
            }
            str = str.toLowerCase(locale);
        }
        return C18320x8.A0s(str, map);
    }

    /* JADX INFO: finally extract failed */
    public static void A03(C161387pX r3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("video_uid=");
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            UUID randomUUID = UUID.randomUUID();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            String A0R = AnonymousClass000.A0R(randomUUID, A0o);
            if (A0R != null) {
                r3.A05.A0N.put("x-fb-qpl-ec", A0R);
            }
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }
}
