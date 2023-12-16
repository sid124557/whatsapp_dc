package X;

import android.content.SharedPreferences;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment;
import com.whatsapp.conversationslist.ArchiveNotificationSettingActivity;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.registration.ChangeNumberNotifyContacts;

/* renamed from: X.4Hw  reason: invalid class name and case insensitive filesystem */
public class C85854Hw implements CompoundButton.OnCheckedChangeListener {
    public Object A00;
    public final int A01;

    public C85854Hw(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static final void A00(C85854Hw r1, boolean z) {
        AnonymousClass2O0 r12 = ((AnonymousClass12W) r1.A00).A00;
        if (r12.A00 != z) {
            r12.A00 = z;
            if (z) {
                r12.A01.A0G(r12);
            }
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SharedPreferences.Editor A03;
        String str;
        switch (this.A01) {
            case 0:
                if (z) {
                    MarketingOptOutReasonsFragment.A00((RadioButton) compoundButton, (MarketingOptOutReasonsFragment) this.A00);
                    return;
                }
                return;
            case 1:
                ((ArchiveNotificationSettingActivity) this.A00).A00.A03(!z);
                return;
            case 2:
                A03 = C18270x1.A03(((C89654ea) this.A00).A09);
                str = "auto_archive_inactive_chats";
                break;
            case 3:
                A00(this, z);
                return;
            case 4:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                C95084sb r1 = groupChatInfoActivity.A1K;
                if (r1 != null) {
                    r1.A07 = Boolean.TRUE;
                }
                if (z) {
                    groupChatInfoActivity.Bon(C57402ta.A00(groupChatInfoActivity.A1h, AnonymousClass21R.CONTACT_INFO), (String) null);
                    return;
                } else {
                    C69993Zl.A00(groupChatInfoActivity.A04, this, 48);
                    return;
                }
            case 5:
                ChangeNumberNotifyContacts changeNumberNotifyContacts = (ChangeNumberNotifyContacts) this.A00;
                if (!z) {
                    changeNumberNotifyContacts.A01 = 0;
                    changeNumberNotifyContacts.A03.setVisibility(8);
                    changeNumberNotifyContacts.A0G.clear();
                } else if (!changeNumberNotifyContacts.A0D.A00()) {
                    RequestPermissionActivity.A0d(changeNumberNotifyContacts, R.string.f11nameremoved, R.string.f11nameremoved, false);
                    return;
                } else {
                    changeNumberNotifyContacts.A74();
                }
                changeNumberNotifyContacts.A75();
                return;
            default:
                A03 = C18270x1.A03(((C89654ea) this.A00).A09);
                str = "security_notifications";
                break;
        }
        C18270x1.A0l(A03, str, z);
    }
}
