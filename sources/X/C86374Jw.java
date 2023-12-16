package X;

import android.content.Intent;
import com.whatsapp.group.newgroup.NewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Jw  reason: invalid class name and case insensitive filesystem */
public class C86374Jw implements C834048g, AnonymousClass4GP {
    public Object A00;
    public final int A01;

    public C86374Jw(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object invoke() {
        AnonymousClass11H r3;
        C72173dI r1;
        int i;
        switch (this.A01) {
            case 0:
                r3 = (AnonymousClass11H) this.A00;
                r3.A09 = !r3.A09;
                r1 = r3.A12;
                i = 44;
                break;
            case 1:
                r3 = (AnonymousClass11H) this.A00;
                C18270x1.A0l(C18270x1.A03(r3.A0Z), "dismissed_invite_member_row", true);
                r1 = r3.A12;
                i = 47;
                break;
            case 2:
                C64633Eh r2 = ((AnonymousClass11H) this.A00).A02;
                C18320x8.A18(r2.A03, true);
                r2.A01.AwB(AnonymousClass0x7.A0f());
                r2.A04.run();
                return null;
            default:
                NewGroup newGroup = (NewGroup) this.A00;
                List A09 = AnonymousClass3ZH.A09(newGroup.A0e);
                C27991fJ r32 = newGroup.A0V;
                Intent A07 = C18320x8.A07();
                A07.setClassName(newGroup.getPackageName(), "com.whatsapp.group.GroupMembersSelector");
                if (!A09.isEmpty()) {
                    ArrayList A0u = C18300x5.A0u(A09);
                    C627336j.A0H(A09, A0u);
                    A07.putExtra("selected", A0u);
                }
                if (r32 != null) {
                    AnonymousClass0x2.A0u(A07, r32, "parent_group_jid_to_link");
                }
                A07.putExtra("return_result", true);
                newGroup.startActivityForResult(A07, 14);
                return null;
        }
        C71553cI.A00(r1, r3, i);
        return null;
    }
}
