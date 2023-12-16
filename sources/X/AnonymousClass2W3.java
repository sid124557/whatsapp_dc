package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2W3  reason: invalid class name */
public class AnonymousClass2W3 {
    public final ConcurrentHashMap A00 = AnonymousClass0x9.A1D();

    public boolean A00(UserJid userJid, int i, long j) {
        long j2 = j;
        if (j > 0) {
            ConcurrentHashMap concurrentHashMap = this.A00;
            UserJid userJid2 = userJid;
            C60722z3 r8 = (C60722z3) concurrentHashMap.get(userJid2);
            if (r8 == null) {
                r8 = C60722z3.A03;
            }
            int i2 = i;
            if (i2 == 5) {
                long j3 = r8.A00;
                if (j3 > 0 && j3 <= j) {
                    return false;
                }
                r8 = new C60722z3(j2, r8.A02, r8.A01);
            } else if (i2 == 8) {
                long j4 = r8.A01;
                if (j4 > 0 && j4 <= j) {
                    return false;
                }
                r8 = new C60722z3(r8.A00, r8.A02, j2);
            } else if (i2 == 13) {
                long j5 = r8.A02;
                if (j5 <= 0 || j5 > j) {
                    r8 = new C60722z3(r8.A00, j2, r8.A01);
                }
            }
            concurrentHashMap.put(userJid2, r8);
            return true;
        }
        return false;
    }
}
