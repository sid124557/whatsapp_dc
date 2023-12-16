package X;

import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3P4  reason: invalid class name */
public class AnonymousClass3P4 implements AnonymousClass4D0 {
    public final /* synthetic */ AcceptInviteLinkActivity A00;
    public final /* synthetic */ C27991fJ A01;

    public AnonymousClass3P4(AcceptInviteLinkActivity acceptInviteLinkActivity, C27991fJ r2) {
        this.A00 = acceptInviteLinkActivity;
        this.A01 = r2;
    }

    public void Bcw(C27991fJ r23, UserJid userJid, C60912zN r25, String str, Map map, int i, int i2, int i3, long j, long j2, boolean z) {
        int i4;
        AcceptInviteLinkActivity acceptInviteLinkActivity = this.A00;
        Map map2 = map;
        List A09 = acceptInviteLinkActivity.A0F.A09(map2);
        C27991fJ r8 = r23;
        C620833k r3 = new C620833k(r8, 0);
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
            r3.A07(C18320x8.A0P(A0w), acceptInviteLinkActivity.A0C.A0D(C18320x8.A0P(A0w)), i4, false, true);
        }
        Object obj = acceptInviteLinkActivity.A0N.get();
        if (obj != null) {
            acceptInviteLinkActivity.A0B.A03.put(obj, r3);
        }
        acceptInviteLinkActivity.A05.A0S(new C172708Mj(this, new AnonymousClass5L8(r8, userJid, r25, str, (String) null, A09, i, 0, 0, j), this.A01, 25));
    }

    public void onError(int i) {
        this.A00.A05.A0S(new C117705sM((Object) this, i, 10));
    }
}
