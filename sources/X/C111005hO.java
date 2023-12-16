package X;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;

/* renamed from: X.5hO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C111005hO implements C181098m9 {
    public final /* synthetic */ GroupChatLiveLocationsActivity2 A00;

    public final void BUZ(C105345Uo r10) {
        Double d;
        Double d2;
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A00;
        C105735We r0 = (C105735We) r10.A01();
        if (r0 != null) {
            C56972sr r1 = groupChatLiveLocationsActivity2.A01;
            UserJid userJid = r0.A02.A06;
            if (!r1.A0a(userJid)) {
                groupChatLiveLocationsActivity2.A0N.getLocationOnScreen(C86664Kz.A1Z());
                LatLng A002 = r10.A00();
                C105415Uv r02 = groupChatLiveLocationsActivity2.A06;
                C626936e.A06(r02);
                Point A003 = r02.A00().A00(A002);
                Rect A0N = AnonymousClass001.A0N();
                int i = A003.x;
                A0N.left = i;
                int i2 = A003.y;
                A0N.top = i2;
                A0N.right = i;
                A0N.bottom = i2;
                C111445i6 r5 = groupChatLiveLocationsActivity2.A0O;
                C54942pX r2 = r5.A0m;
                if (r2 != null) {
                    d = Double.valueOf(r2.A00);
                    d2 = Double.valueOf(r2.A01);
                } else {
                    d = null;
                    d2 = null;
                }
                AnonymousClass5XB r12 = new AnonymousClass5XB(A0N, (C95814uZ) userJid, (Integer) null);
                r12.A01 = r5.A0c;
                r12.A05 = true;
                r12.A02 = d;
                r12.A03 = d2;
                groupChatLiveLocationsActivity2.startActivity(r12.A01(groupChatLiveLocationsActivity2));
            }
        }
    }

    public /* synthetic */ C111005hO(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.A00 = groupChatLiveLocationsActivity2;
    }
}
