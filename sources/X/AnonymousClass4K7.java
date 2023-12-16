package X;

import android.app.Activity;
import android.view.View;
import android.widget.CompoundButton;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity;
import com.whatsapp.dialogs.DeleteOrArchiveChatDialog;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.group.NonAdminGJRFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.4K7  reason: invalid class name */
public class AnonymousClass4K7 implements C15930sC {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4K7(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BOf(Object obj) {
        switch (this.A02) {
            case 0:
                ((MemberSuggestedGroupsManagementActivity) this.A00).A74().A0H(((AnonymousClass1OC) this.A01).A02, true);
                return;
            case 1:
                Log.i("AccountSwitcher/abandonAddAccount");
                ((C614930z) this.A00).A04((Activity) this.A01, (String) null);
                return;
            case 2:
                AnonymousClass1PT.A01((C009707r) this.A01, (AnonymousClass1PT) this.A00, (C380225d) obj);
                return;
            case 3:
                DeleteOrArchiveChatDialog deleteOrArchiveChatDialog = (DeleteOrArchiveChatDialog) this.A00;
                Object obj2 = this.A01;
                C162457s7.A0H(obj2);
                deleteOrArchiveChatDialog.A1K();
                C18310x6.A1A(deleteOrArchiveChatDialog);
                AnonymousClass4FS r1 = deleteOrArchiveChatDialog.A04;
                if (r1 != null) {
                    C71343bx.A00(r1, obj2, deleteOrArchiveChatDialog, 28);
                    return;
                }
                throw C18270x1.A0S("waWorkers");
            case 4:
                UserJid userJid = (UserJid) this.A01;
                C46632bx r0 = ((GroupChatInfoActivity) this.A00).A0l;
                if (r0 != null) {
                    r0.A05.A00(userJid, (Integer) null);
                    return;
                }
                return;
            case 5:
                UserJid userJid2 = (UserJid) this.A01;
                C46632bx r02 = ((GroupChatInfoActivity) this.A00).A0l;
                if (r02 != null) {
                    r02.A05.A01(userJid2, (Integer) null);
                    return;
                }
                return;
            case 6:
                NonAdminGJRFragment nonAdminGJRFragment = (NonAdminGJRFragment) this.A01;
                List list = (List) obj;
                ((View) this.A00).setVisibility(0);
                AnonymousClass4u4 r03 = nonAdminGJRFragment.A01;
                if (r03 != null) {
                    C162457s7.A0H(list);
                    C162457s7.A0J(list, 0);
                    r03.A01 = list;
                    AnonymousClass4u4 r04 = nonAdminGJRFragment.A01;
                    if (r04 != null) {
                        r04.A05();
                        return;
                    }
                    throw C18270x1.A0S("nonAdminGJRAdapter");
                }
                throw C18270x1.A0S("nonAdminGJRAdapter");
            case 7:
                ((C61022zZ) this.A00).A03(((CompoundButton) this.A01).isChecked());
                return;
            default:
                AnonymousClass10r r3 = (AnonymousClass10r) this.A00;
                C06270Wx r2 = (C06270Wx) this.A01;
                C46202bF r5 = (C46202bF) obj;
                if (r5.A00 != 5) {
                    r3.A0F(r5);
                    return;
                } else {
                    r2.A0H(r5);
                    return;
                }
        }
    }
}
