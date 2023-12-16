package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1SA  reason: invalid class name */
public final class AnonymousClass1SA extends AnonymousClass33W {
    public final int A00;
    public final Set A01;

    public AnonymousClass1SA(C60642yt r10, AnonymousClass33J r11, String str, Set set, int i, long j) {
        super(r10, r11, str, "regular_high", 7, j, false);
        this.A00 = i;
        this.A01 = set;
    }

    public AnonymousClass18L A06() {
        C374622s r0;
        int i = this.A00;
        if (i == 3) {
            Log.e("StatusPrivacySyncMutation invalid status setting");
            return super.A06();
        }
        C130546c9 A0G = C21291Bg.DEFAULT_INSTANCE.A0G();
        if (i == 1) {
            r0 = C374622s.ALLOW_LIST;
        } else if (i != 2) {
            r0 = C374622s.CONTACTS;
        } else {
            r0 = C374622s.DENY_LIST;
        }
        C21291Bg r1 = (C21291Bg) C18320x8.A0C(A0G);
        r1.mode_ = r0.value;
        r1.bitField0_ |= 1;
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            String A0g = C18300x5.A0g(A0G, AnonymousClass0x7.A0S(it));
            C21291Bg r2 = (C21291Bg) A0G.A00;
            A0g.getClass();
            C188248ya r12 = r2.userJid_;
            if (!((AnonymousClass8T6) r12).A00) {
                r12 = C130786cX.A07(r12);
                r2.userJid_ = r12;
            }
            r12.add(A0g);
        }
        C21291Bg r02 = (C21291Bg) A0G.A06();
        AnonymousClass18L A06 = super.A06();
        if (A06 == null) {
            return null;
        }
        AnonymousClass1EO A0W = C18290x4.A0W(A06, r02);
        A0W.statusPrivacy_ = r02;
        A0W.bitField1_ |= 32;
        return A06;
    }
}
