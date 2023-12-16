package X;

import android.graphics.Point;
import android.graphics.Rect;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.GroupChatLiveLocationsActivity;

/* renamed from: X.5h9  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C110855h9 implements C180268kl {
    public final /* synthetic */ GroupChatLiveLocationsActivity A00;

    public final void BUY(C88534Zc r9) {
        Double d;
        Double d2;
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = this.A00;
        C105735We r0 = (C105735We) r9.A0K;
        if (r0 != null) {
            C56972sr r1 = groupChatLiveLocationsActivity.A01;
            UserJid userJid = r0.A02.A06;
            if (!r1.A0a(userJid)) {
                C108975ds r12 = r9.A0J;
                C110885hC r02 = groupChatLiveLocationsActivity.A05;
                C626936e.A06(r02);
                Point A04 = r02.A0S.A04(r12);
                Rect A0N = AnonymousClass001.A0N();
                int i = A04.x;
                A0N.left = i;
                int i2 = A04.y;
                A0N.top = i2;
                A0N.right = i;
                A0N.bottom = i2;
                C111445i6 r5 = groupChatLiveLocationsActivity.A0N;
                C54942pX r2 = r5.A0m;
                if (r2 != null) {
                    d = Double.valueOf(r2.A00);
                    d2 = Double.valueOf(r2.A01);
                } else {
                    d = null;
                    d2 = null;
                }
                AnonymousClass5XB r13 = new AnonymousClass5XB(A0N, (C95814uZ) userJid, (Integer) 16);
                r13.A01 = r5.A0c;
                r13.A05 = true;
                r13.A02 = d;
                r13.A03 = d2;
                groupChatLiveLocationsActivity.startActivity(r13.A01(groupChatLiveLocationsActivity));
            }
        }
    }

    public /* synthetic */ C110855h9(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.A00 = groupChatLiveLocationsActivity;
    }
}
