package X;

import android.content.DialogInterface;
import android.widget.CheckBox;
import com.whatsapp.R;
import com.whatsapp.conversationslist.LeaveGroupsDialogFragment;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5cF  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C107995cF implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CheckBox A01;
    public final /* synthetic */ LeaveGroupsDialogFragment A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    public final void onClick(DialogInterface dialogInterface, int i) {
        LeaveGroupsDialogFragment leaveGroupsDialogFragment = this.A02;
        int i2 = this.A00;
        List list = this.A04;
        CheckBox checkBox = this.A01;
        String str = this.A03;
        Log.i("LeaveGroupsDialogFragment/user-try-leaveGroup");
        boolean A0F = leaveGroupsDialogFragment.A01.A0F();
        C69263Wi r2 = leaveGroupsDialogFragment.A00;
        if (A0F) {
            if (i2 != 1) {
                r2.A0G(R.string.f11nameremoved, R.string.f11nameremoved);
                if (i2 == 2) {
                    leaveGroupsDialogFragment.A0m(C627736r.A00(leaveGroupsDialogFragment.A1D()));
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C95814uZ A0P = C18300x5.A0P(it);
                C18260x0.A1R(AnonymousClass001.A0o(), "LeaveGroupsDialogFragment/exit/group:", A0P);
                leaveGroupsDialogFragment.A08.A0C(A0P, true);
                leaveGroupsDialogFragment.A0F.BkM(new C117675sJ(leaveGroupsDialogFragment, checkBox, A0P, str, i2, 2));
            }
        } else {
            r2.A0H(R.string.f11nameremoved, 0);
        }
        AnonymousClass33p r5 = leaveGroupsDialogFragment.A05;
        int A022 = C18280x3.A02(AnonymousClass0x2.A0F(r5), "delete_chat_count") + list.size();
        C18260x0.A0w("wa-shared-preferences/setdeletechat ", AnonymousClass001.A0o(), A022);
        C18270x1.A0h(C18270x1.A03(r5), "delete_chat_count", A022);
        if (i2 == 1) {
            leaveGroupsDialogFragment.A08.A09(2);
        }
        leaveGroupsDialogFragment.A1K();
    }

    public /* synthetic */ C107995cF(CheckBox checkBox, LeaveGroupsDialogFragment leaveGroupsDialogFragment, String str, List list, int i) {
        this.A02 = leaveGroupsDialogFragment;
        this.A00 = i;
        this.A04 = list;
        this.A01 = checkBox;
        this.A03 = str;
    }
}
