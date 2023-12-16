package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.GroupChatLiveLocationsActivity;

/* renamed from: X.5h7  reason: invalid class name and case insensitive filesystem */
public class C110835h7 implements C180248kj {
    public final View A00;
    public final /* synthetic */ GroupChatLiveLocationsActivity A01;

    public C110835h7(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.A01 = groupChatLiveLocationsActivity;
        View A0F = C86604Kt.A0F(groupChatLiveLocationsActivity.getLayoutInflater(), R.layout.f8nameremoved);
        this.A00 = A0F;
        AnonymousClass0YH.A06(A0F, 3);
    }

    public View B8K(C88534Zc r12) {
        int A04;
        C60842zG A0J;
        C54942pX r9 = ((C105735We) r12.A0K).A02;
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = this.A01;
        AnonymousClass64J r1 = groupChatLiveLocationsActivity.A07;
        View view = this.A00;
        AnonymousClass5YB A002 = AnonymousClass5YB.A00(view, r1, R.id.name_in_group_tv);
        TextView A09 = AnonymousClass002.A09(view, R.id.participant_info);
        View findViewById = view.findViewById(R.id.info_btn);
        C56972sr r0 = groupChatLiveLocationsActivity.A01;
        UserJid userJid = r9.A06;
        if (r0.A0a(userJid)) {
            AnonymousClass5YB.A03(A002, C18300x5.A03(groupChatLiveLocationsActivity, R.attr.f3nameremoved, R.color.f5nameremoved));
            A002.A05();
            findViewById.setVisibility(8);
        } else {
            C27991fJ A012 = AnonymousClass34R.A01(groupChatLiveLocationsActivity.A0N.A0c);
            if (A012 == null || (A0J = C86624Kv.A0J(groupChatLiveLocationsActivity.A0J, A012, userJid)) == null) {
                A04 = AnonymousClass0Y8.A04(groupChatLiveLocationsActivity, R.color.f5nameremoved);
            } else {
                A04 = C86624Kv.A00(groupChatLiveLocationsActivity.getResources(), A0J);
            }
            AnonymousClass5YB.A03(A002, A04);
            A002.A08(groupChatLiveLocationsActivity.A0C.A0A(userJid));
            findViewById.setVisibility(0);
        }
        C106905aM.A04(A002.A02);
        int i = r9.A03;
        String str = "";
        if (i != -1) {
            str = AnonymousClass000.A0X(C86604Kt.A0p(groupChatLiveLocationsActivity.A00, i, R.plurals.f9nameremoved), AnonymousClass000.A0l(str));
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
