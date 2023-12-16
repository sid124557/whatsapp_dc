package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Iterator;

/* renamed from: X.2tm  reason: invalid class name and case insensitive filesystem */
public class C57522tm {
    public static long A00(AnonymousClass36K r3) {
        String A0L = AnonymousClass36K.A0L(r3, "last");
        if (A0L == null) {
            return System.currentTimeMillis();
        }
        if ("deny".equals(A0L) || "error".equals(A0L) || "none".equals(A0L)) {
            return 0;
        }
        return Long.parseLong(A0L) * 1000;
    }

    public static AnonymousClass8OQ A01(AnonymousClass36K r8) {
        C160667o6 r7 = new C160667o6();
        if (r8 != null) {
            Iterator A0M = AnonymousClass36K.A0M(r8, "device");
            while (A0M.hasNext()) {
                AnonymousClass36K A0Y = C18310x6.A0Y(A0M);
                Class<DeviceJid> cls = DeviceJid.class;
                DeviceJid deviceJid = (DeviceJid) A0Y.A0h(cls, "jid");
                r7.put(deviceJid, new C52642lo(deviceJid, (DeviceJid) A0Y.A0g(cls, "lid"), AnonymousClass36K.A05(A0Y, "key-index")));
            }
        }
        return r7.build();
    }
}
