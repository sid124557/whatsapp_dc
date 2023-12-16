package X;

import com.whatsapp.conversationslist.LeaveGroupsDialogFragment;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.5gB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C110405gB implements C15630rg {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass5UU A01;
    public final /* synthetic */ C27991fJ A02;

    public final Object apply(Object obj) {
        AnonymousClass5UU r3 = this.A01;
        C27991fJ r2 = this.A02;
        int i = this.A00;
        C101985Ha r11 = (C101985Ha) obj;
        AnonymousClass4FU r1 = r3.A04;
        r1.BjL();
        Set singleton = Collections.singleton(r2);
        boolean A1T = AnonymousClass001.A1T(i);
        String str = "group_spam_banner_exit";
        if (r3.A01) {
            str = "triggered_block";
        }
        r1.Boo(LeaveGroupsDialogFragment.A00(r11.A01, str, singleton, 0, 2, A1T, r3.A0B.A0N(r2)));
        return null;
    }

    public /* synthetic */ C110405gB(AnonymousClass5UU r1, C27991fJ r2, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }
}
