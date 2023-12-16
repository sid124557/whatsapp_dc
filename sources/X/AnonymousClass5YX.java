package X;

import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.group.GroupChatInfoActivity;

/* renamed from: X.5YX  reason: invalid class name */
public class AnonymousClass5YX implements AnonymousClass4D8 {
    public Object A00;
    public final int A01;

    public AnonymousClass5YX(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BcE(C95814uZ r5) {
        C69263Wi r3;
        Runnable r2;
        switch (this.A01) {
            case 0:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                if (r5.equals(C86604Kt.A0d(contactInfoActivity.A1K))) {
                    r3 = contactInfoActivity.A05;
                    r2 = new C71553cI(contactInfoActivity, 12);
                    break;
                } else {
                    return;
                }
            case 1:
                C87674Ui r0 = (C87674Ui) this.A00;
                r0.A04.A0G(r0.A00);
                return;
            case 2:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                if (r5.equals(groupChatInfoActivity.A1h)) {
                    r3 = groupChatInfoActivity.A05;
                    r2 = new C69993Zl(groupChatInfoActivity, 49);
                    break;
                } else {
                    return;
                }
            default:
                r3 = ((C89654ea) this.A00).A05;
                r2 = new C71293bs((Object) this, 15);
                break;
        }
        r3.A0S(r2);
    }

    public void Bcr(C95814uZ r5) {
        C69263Wi r3;
        Runnable r2;
        switch (this.A01) {
            case 0:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                if (r5.equals(C86604Kt.A0d(contactInfoActivity.A1K))) {
                    r3 = contactInfoActivity.A05;
                    r2 = new C71553cI(contactInfoActivity, 11);
                    break;
                } else {
                    return;
                }
            case 1:
                ((C87674Ui) this.A00).A04.A0G(r5);
                return;
            case 2:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                if (r5.equals(groupChatInfoActivity.A1h)) {
                    r3 = groupChatInfoActivity.A05;
                    r2 = new C70003Zm(groupChatInfoActivity, 0);
                    break;
                } else {
                    return;
                }
            default:
                r3 = ((C89654ea) this.A00).A05;
                r2 = new C71293bs((Object) this, 14);
                break;
        }
        r3.A0S(r2);
    }
}
