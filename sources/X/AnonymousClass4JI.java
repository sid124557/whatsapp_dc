package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.4JI  reason: invalid class name */
public class AnonymousClass4JI implements AnonymousClass4EP {
    public Object A00;
    public final int A01;

    public AnonymousClass4JI(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BQs(String str) {
    }

    public void BU8(C27991fJ r28, C27991fJ r29, UserJid userJid, C60912zN r31, String str, String str2, String str3, Map map, int i, int i2, int i3, long j, long j2) {
        C27991fJ r4 = r28;
        UserJid userJid2 = userJid;
        C60912zN r6 = r31;
        String str4 = str;
        String str5 = str3;
        Map map2 = map;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        long j3 = j;
        if (this.A01 != 0) {
            ((C33911tt) this.A00).A0G(r4, userJid2, r6, str4, str5, map2.keySet(), i4, i5, i6, j3);
            return;
        }
        C33631tR r1 = (C33631tR) this.A00;
        r1.A01 = new AnonymousClass5L8(r4, userJid2, r6, str4, str5, r1.A03.A09(map2), i4, i5, i6, j3);
    }

    public void onError(int i) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            ((C33911tt) obj).A00 = i;
        } else {
            ((C33631tR) obj).A00 = i;
        }
    }
}
