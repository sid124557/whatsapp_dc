package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;

/* renamed from: X.5hM  reason: invalid class name and case insensitive filesystem */
public class C110985hM implements C181078m6 {
    public final View A00;
    public final /* synthetic */ GroupChatLiveLocationsActivity2 A01;

    public C110985hM(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.A01 = groupChatLiveLocationsActivity2;
        View A0F = C86604Kt.A0F(groupChatLiveLocationsActivity2.getLayoutInflater(), R.layout.f8nameremoved);
        this.A00 = A0F;
        AnonymousClass0YH.A06(A0F, 3);
    }

    public View B8L(C105345Uo r12) {
        int A04;
        C60842zG A0J;
        Object A012 = r12.A01();
        C626936e.A06(A012);
        C54942pX r9 = ((C105735We) A012).A02;
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A01;
        AnonymousClass64J r1 = groupChatLiveLocationsActivity2.A08;
        View view = this.A00;
        AnonymousClass5YB A002 = AnonymousClass5YB.A00(view, r1, R.id.name_in_group_tv);
        TextView A09 = AnonymousClass002.A09(view, R.id.participant_info);
        View findViewById = view.findViewById(R.id.info_btn);
        C56972sr r0 = groupChatLiveLocationsActivity2.A01;
        UserJid userJid = r9.A06;
        if (r0.A0a(userJid)) {
            AnonymousClass5YB.A03(A002, C18300x5.A03(groupChatLiveLocationsActivity2, R.attr.f3nameremoved, R.color.f5nameremoved));
            A002.A05();
            findViewById.setVisibility(8);
        } else {
            C27991fJ A013 = AnonymousClass34R.A01(groupChatLiveLocationsActivity2.A0O.A0c);
            if (A013 == null || (A0J = C86624Kv.A0J(groupChatLiveLocationsActivity2.A0K, A013, userJid)) == null) {
                A04 = AnonymousClass0Y8.A04(groupChatLiveLocationsActivity2, R.color.f5nameremoved);
            } else {
                A04 = C86624Kv.A00(groupChatLiveLocationsActivity2.getResources(), A0J);
            }
            AnonymousClass5YB.A03(A002, A04);
            A002.A08(groupChatLiveLocationsActivity2.A0D.A0A(userJid));
            findViewById.setVisibility(0);
        }
        C106905aM.A04(A002.A02);
        int i = r9.A03;
        String str = "";
        if (i != -1) {
            str = AnonymousClass000.A0X(C86604Kt.A0p(groupChatLiveLocationsActivity2.A00, i, R.plurals.f9nameremoved), AnonymousClass000.A0l(str));
        }
        if (!TextUtils.isEmpty(str)) {
            A09.setText(str);
            A09.setVisibility(0);
            return view;
        }
        A09.setVisibility(8);
        return view;
    }
}
