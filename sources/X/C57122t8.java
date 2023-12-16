package X;

import com.whatsapp.R;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.util.Log;

/* renamed from: X.2t8  reason: invalid class name and case insensitive filesystem */
public class C57122t8 implements AnonymousClass4AR {
    public Object A00;
    public final int A01;

    public C57122t8(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BS0(int i, String str) {
        C69263Wi r1;
        int i2;
        int i3 = i;
        if (this.A01 != 0) {
            GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) ((C34031u7) this.A00).A07.get();
            if (groupChatInfoActivity != null) {
                if (i3 == 403) {
                    r1 = groupChatInfoActivity.A05;
                    i2 = R.string.f11nameremoved;
                } else if (i3 == 406) {
                    groupChatInfoActivity.A05.A0P(AnonymousClass0x2.A0Y(groupChatInfoActivity.getResources(), Math.max(0, groupChatInfoActivity.A06.A03(C66663Mh.A1A)), 0, R.plurals.f9nameremoved), 0);
                    groupChatInfoActivity.A1m.A05(false);
                    return;
                } else if (i3 != 409) {
                    r1 = groupChatInfoActivity.A05;
                    i2 = R.string.f11nameremoved;
                } else {
                    C66503Lr r7 = groupChatInfoActivity.A1Y;
                    C27991fJ r8 = groupChatInfoActivity.A1h;
                    Log.i("GroupXmppMethods/sendGetGroupDescription");
                    AnonymousClass31C r9 = r7.A06;
                    String A03 = r9.A03();
                    AnonymousClass39V[] r12 = new AnonymousClass39V[1];
                    AnonymousClass39V.A0B("request", "description", r12, 0);
                    AnonymousClass36K A0I = AnonymousClass36K.A0I("query", r12);
                    AnonymousClass39V[] A0H = AnonymousClass39V.A0H(A03, 0);
                    AnonymousClass39V.A09("xmlns", "w:g2", A0H);
                    r9.A0K(new AnonymousClass4KQ(r7, 2), AnonymousClass36K.A0C(r8, A0I, A0H), A03, 158, 32000);
                    GroupChatInfoActivity.DescriptionConflictDialogFragment descriptionConflictDialogFragment = new GroupChatInfoActivity.DescriptionConflictDialogFragment();
                    descriptionConflictDialogFragment.A0u(AnonymousClass0x7.A0F("description", str));
                    groupChatInfoActivity.Bon(descriptionConflictDialogFragment, (String) null);
                    return;
                }
                r1.A0H(i2, 0);
                return;
            }
            return;
        }
        AnonymousClass11H r5 = (AnonymousClass11H) this.A00;
        AnonymousClass0x9.A1I(r5.A0z);
        Integer valueOf = Integer.valueOf(i3);
        int intValue = valueOf.intValue();
        if (intValue == 406) {
            r5.A0u.A05(false);
        } else if (intValue == 409) {
            r5.A0m.A0E(r5.A0s, (String) null, 3);
        }
        r5.A0C.A0G(valueOf);
    }
}
