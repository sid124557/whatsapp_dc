package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3P5  reason: invalid class name */
public class AnonymousClass3P5 implements AnonymousClass4D0 {
    public final /* synthetic */ C15790rw A00;
    public final /* synthetic */ AnonymousClass2FI A01;
    public final /* synthetic */ AnonymousClass2TH A02;
    public final /* synthetic */ C27991fJ A03;

    public AnonymousClass3P5(C15790rw r1, AnonymousClass2FI r2, AnonymousClass2TH r3, C27991fJ r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }

    public void Bcw(C27991fJ r22, UserJid userJid, C60912zN r24, String str, Map map, int i, int i2, int i3, long j, long j2, boolean z) {
        int i4;
        AnonymousClass2TH r5 = this.A02;
        Map map2 = map;
        List A09 = r5.A05.A09(map2);
        C27991fJ r9 = r22;
        C620833k r3 = new C620833k(r9, 0);
        Iterator A0q = AnonymousClass000.A0q(map2);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            String str2 = ((C54792pI) A0w.getValue()).A04;
            boolean equals = "admin".equals(str2);
            boolean equals2 = "superadmin".equals(str2);
            if (equals) {
                i4 = 1;
            } else if (equals2) {
                i4 = 2;
            }
            r3.A07(C18320x8.A0P(A0w), r5.A03.A0D(C18320x8.A0P(A0w)), i4, false, true);
        }
        r5.A02.A03.put(r9, r3);
        AnonymousClass5L8 r8 = new AnonymousClass5L8(r9, userJid, r24, str, (String) null, A09, i, i2, i3, j);
        r8.A00 = z;
        this.A00.AwB(r8);
    }

    public void onError(int i) {
        AnonymousClass2FI r0 = this.A01;
        C27991fJ r5 = this.A03;
        AnonymousClass4VR r2 = r0.A00;
        AnonymousClass5L8 r4 = new AnonymousClass5L8(r5, (UserJid) null, (C60912zN) null, (String) null, (String) null, (List) null, 0, 2, 0, 0);
        AnonymousClass08M r1 = r2.A0c;
        int i2 = i;
        if (i2 != -1) {
            r1.A0G(new AnonymousClass5PY(r4, i2));
            r2.A0D(5);
            return;
        }
        throw AnonymousClass001.A0e("Error code expected but default success code '-1' was provided.");
    }
}
