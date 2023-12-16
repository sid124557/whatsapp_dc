package X;

import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.Map;

/* renamed from: X.6BA  reason: invalid class name */
public class AnonymousClass6BA implements AnonymousClass4EP {
    public Object A00;
    public final int A01;

    public AnonymousClass6BA(AnonymousClass4VR r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public void BQs(String str) {
        int i;
        int i2 = this.A01;
        AnonymousClass4VR r2 = (AnonymousClass4VR) this.A00;
        if (i2 != 0) {
            i = 2;
        } else {
            i = 0;
        }
        AnonymousClass4VR.A00(r2, -408, i);
    }

    public void BU8(C27991fJ r15, C27991fJ r16, UserJid userJid, C60912zN r18, String str, String str2, String str3, Map map, int i, int i2, int i3, long j, long j2) {
        AnonymousClass4VR r1 = (AnonymousClass4VR) this.A00;
        List A09 = r1.A0N.A09(map);
        C27991fJ r3 = r15;
        r1.A0Q = r15;
        C27991fJ r2 = r16;
        if (r16 != null) {
            r1.A0U = AnonymousClass001.A1W(r1.A06.A05(r2).size());
        }
        r1.A0G(new AnonymousClass5L8(r3, userJid, r18, str, str3, A09, i, i2, i3, j));
    }

    public void onError(int i) {
        int i2;
        int i3 = this.A01;
        AnonymousClass4VR r1 = (AnonymousClass4VR) this.A00;
        if (i3 != 0) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        AnonymousClass4VR.A00(r1, i, i2);
    }
}
