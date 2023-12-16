package X;

import com.whatsapp.jid.Jid;
import java.security.MessageDigest;
import java.util.List;
import java.util.UUID;

/* renamed from: X.33w  reason: invalid class name and case insensitive filesystem */
public class C621733w {
    public static boolean A01(AnonymousClass3ZH r5, MessageDigest messageDigest, List list) {
        C95814uZ r0 = r5.A0H;
        StringBuilder A0u = C18290x4.A0u(r0);
        A0u.append(r0.user);
        String A0X = AnonymousClass000.A0X("WA_ADD_NOTIF", A0u);
        messageDigest.reset();
        messageDigest.update(A0X.getBytes());
        byte[] digest = messageDigest.digest();
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            if (digest.length >= bArr.length) {
                int i2 = 0;
                while (i2 < bArr.length) {
                    if (digest[i2] == bArr[i2]) {
                        i2++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean A02(Jid jid) {
        if (jid == null || !jid.isProtocolCompliant() || (jid instanceof C135216kJ)) {
            return true;
        }
        return false;
    }

    public static String A00(String str) {
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append('_');
        AnonymousClass000.A1B(UUID.randomUUID(), A0l);
        return A0l.toString();
    }
}
