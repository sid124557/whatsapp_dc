package X;

import android.content.Intent;
import android.view.View;
import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.permissions.RequestPermissionsBottomSheet;

/* renamed from: X.1sc  reason: invalid class name and case insensitive filesystem */
public class C33201sc extends C109665ez {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C33201sc(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = str;
        this.A01 = obj2;
    }

    public void A07(View view) {
        if (this.A03 != 0) {
            String str = this.A02;
            if (str != null) {
                ((RequestPermissionsBottomSheet) this.A00).A06.A04(str, "continue");
            }
            RequestPermissionsBottomSheet requestPermissionsBottomSheet = (RequestPermissionsBottomSheet) this.A00;
            requestPermissionsBottomSheet.A1K();
            AnonymousClass33p r6 = requestPermissionsBottomSheet.A04;
            String[] strArr = (String[]) this.A01;
            for (String str2 : strArr) {
                C18260x0.A0q("wa-shared-prefs/set-permission-requested ", str2, AnonymousClass001.A0o());
                C18270x1.A0f(C18270x1.A03(r6), str2);
                if (AnonymousClass367.A03(str2, C622534h.A09)) {
                    C18270x1.A0l(C18270x1.A03(r6), "live_location_is_new_user", true);
                    C18270x1.A0l(C18270x1.A03(r6), "nearby_location_new_user", true);
                }
            }
            C005205m.A02(requestPermissionsBottomSheet.A0R(), strArr, 0);
            return;
        }
        AcceptInviteLinkActivity acceptInviteLinkActivity = (AcceptInviteLinkActivity) this.A00;
        String str3 = this.A02;
        Intent A07 = C18320x8.A07();
        A07.setClassName(acceptInviteLinkActivity.getPackageName(), "com.whatsapp.group.GroupAdminPickerActivity");
        C627336j.A0D(A07, (Jid) acceptInviteLinkActivity.A0N.get(), "gid");
        A07.putExtra("subgroup_subject", str3);
        A07.putExtra("subgroup_request_message", (String) null);
        AnonymousClass0x2.A0u(A07, (Jid) this.A01, "parent_group_jid");
        acceptInviteLinkActivity.startActivity(A07);
        acceptInviteLinkActivity.overridePendingTransition(0, 0);
        acceptInviteLinkActivity.finish();
    }
}
