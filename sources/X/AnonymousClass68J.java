package X;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.profile.SetAboutInfo;
import com.whatsapp.status.StatusesFragment;
import com.whatsapp.status.playback.MyStatusesActivity;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.68J  reason: invalid class name */
public class AnonymousClass68J extends C110245fv {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass68J(C56612sH r1, Object obj, int i) {
        super(r1);
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00(AdapterView adapterView, View view, int i, long j) {
        C113995mK r1;
        UserJid userJid;
        List list;
        List list2;
        List list3;
        Map map;
        String A1K;
        Integer num;
        Integer num2;
        switch (this.A01) {
            case 0:
                String A1M = C86664Kz.A1M(SetAboutInfo.A0A, i);
                SetAboutInfo setAboutInfo = (SetAboutInfo) this.A00;
                setAboutInfo.A75(A1M);
                setAboutInfo.A05.A00(3);
                return;
            case 1:
                C88474Yw r4 = (C88474Yw) view.getTag();
                if (r4 == null) {
                    return;
                }
                if (r4.A06 != AnonymousClass1fY.A00 || r4.A01 != 0) {
                    StatusesFragment statusesFragment = (StatusesFragment) this.A00;
                    statusesFragment.A0m(C627736r.A0S(statusesFragment.A1D(), r4.A06, false, false, false));
                    r1 = statusesFragment.A13;
                    userJid = r4.A06;
                    C105765Wh r0 = statusesFragment.A10;
                    list = r0.A02;
                    list2 = r0.A03;
                    list3 = r0.A01;
                    map = r0.A05;
                    A1K = statusesFragment.A1K();
                    C162457s7.A0J(userJid, 0);
                    C18260x0.A0V(list, list2, list3);
                    num = null;
                    num2 = null;
                    break;
                } else {
                    ((StatusesFragment) this.A00).A1O();
                    return;
                }
            default:
                MyStatusesActivity myStatusesActivity = (MyStatusesActivity) this.A00;
                if (myStatusesActivity.A11.isEmpty()) {
                    C624134x A0R = C18320x8.A0R(myStatusesActivity.A0Z.A00, i);
                    AnonymousClass0R2 r02 = myStatusesActivity.A01;
                    if (r02 != null) {
                        r02.A05();
                    }
                    A1K = null;
                    Intent A0S = C627736r.A0S(myStatusesActivity, A0R.A0o(), false, false, false);
                    C107395bF.A00(A0S, A0R.A1J);
                    myStatusesActivity.startActivity(A0S);
                    if (myStatusesActivity.A0K.A04() != null) {
                        r1 = myStatusesActivity.A0X;
                        userJid = AnonymousClass1fY.A00;
                        list = Collections.emptyList();
                        list2 = Collections.emptyList();
                        list3 = Collections.emptyList();
                        map = Collections.emptyMap();
                        num = C18290x4.A0b();
                        num2 = Integer.valueOf(i);
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
        r1.A07(userJid, num, num2, A1K, list, list2, list3, map);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (2 - this.A01 == 0) {
            MyStatusesActivity myStatusesActivity = (MyStatusesActivity) this.A00;
            if (!myStatusesActivity.A11.isEmpty()) {
                myStatusesActivity.A77(view, C18320x8.A0R(myStatusesActivity.A0Z.A00, i));
                return;
            }
        }
        super.onItemClick(adapterView, view, i, j);
    }
}
