package X;

import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.jid.UserJid;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6BR  reason: invalid class name */
public class AnonymousClass6BR implements AnonymousClass4EU {
    public Object A00;
    public final int A01;

    public AnonymousClass6BR(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BZX(C54942pX r7) {
        AnonymousClass2OP r1;
        if (3 - this.A01 == 0) {
            C111445i6 r5 = (C111445i6) this.A00;
            C621233o r3 = r5.A1J;
            C95814uZ r2 = r5.A0c;
            UserJid userJid = r7.A06;
            synchronized (r3.A0Q) {
                Map map = (Map) r3.A0B().get(r2);
                if (map != null) {
                    if (userJid == null) {
                        r1 = (AnonymousClass2OP) map.get(r2);
                    } else {
                        r1 = (AnonymousClass2OP) map.get(userJid);
                    }
                    if (r1 != null) {
                        if (C621233o.A02(r1.A00, r3.A0D.A0H())) {
                            r5.A0V(r7);
                        }
                    }
                }
            }
        }
    }

    public void BZZ(C95814uZ r5, UserJid userJid) {
        C69263Wi r3;
        Runnable runnable;
        switch (this.A01) {
            case 0:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                if (r5.equals(C86604Kt.A0d(contactInfoActivity.A1K))) {
                    r3 = contactInfoActivity.A05;
                    runnable = new C71553cI(contactInfoActivity, 13);
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
                    runnable = new C70003Zm(groupChatInfoActivity, 2);
                    break;
                } else {
                    return;
                }
            default:
                C111445i6 r1 = (C111445i6) this.A00;
                if (r1.A0c.equals(r5)) {
                    r1.A0I();
                    return;
                }
                return;
        }
        r3.A0S(runnable);
    }

    public void BZa(C95814uZ r5, UserJid userJid) {
        C69263Wi r3;
        Runnable runnable;
        switch (this.A01) {
            case 0:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                if (r5.equals(C86604Kt.A0d(contactInfoActivity.A1K))) {
                    r3 = contactInfoActivity.A05;
                    runnable = new C71553cI(contactInfoActivity, 14);
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
                    runnable = new C70003Zm(groupChatInfoActivity, 1);
                    break;
                } else {
                    return;
                }
            default:
                C111445i6 r2 = (C111445i6) this.A00;
                if (r2.A0c.equals(r5)) {
                    if (userJid == null) {
                        userJid = AnonymousClass32Y.A03(r5);
                    }
                    C54942pX r0 = r2.A0o;
                    if (r0 != null && r0.A06.equals(userJid)) {
                        r2.A0o = null;
                    }
                    Set set = r2.A1T;
                    synchronized (set) {
                        set.add(userJid);
                    }
                    r2.A0I();
                    return;
                }
                return;
        }
        r3.A0S(runnable);
    }
}
