package X;

import com.whatsapp.jid.UserJid;
import java.util.HashMap;

/* renamed from: X.2YC  reason: invalid class name */
public final class AnonymousClass2YC {
    public final C183538qC A00;
    public final HashMap A01 = AnonymousClass001.A0t();

    public AnonymousClass2YC(C183538qC r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final Integer A00(UserJid userJid) {
        HashMap hashMap = this.A01;
        if (hashMap.get(userJid) == null) {
            C60412yW r0 = (C60412yW) hashMap.get(userJid);
            if (r0 == null) {
                r0 = new C60412yW((Integer) null);
            }
            r0.A00 = null;
            hashMap.put(userJid, r0);
        }
        C60412yW r3 = (C60412yW) hashMap.get(userJid);
        if (r3 == null) {
            return null;
        }
        Integer num = r3.A00;
        if (num != null) {
            return num;
        }
        Integer A002 = ((C59602xB) this.A00.get()).A00(userJid, System.currentTimeMillis());
        r3.A00 = A002;
        return A002;
    }
}
