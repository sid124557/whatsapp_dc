package X;

import android.net.Uri;
import android.view.View;
import com.whatsapp.calling.callhistory.group.GroupCallLogActivity;

/* renamed from: X.5ed  reason: invalid class name and case insensitive filesystem */
public class C109445ed implements View.OnClickListener {
    public Object A00;
    public String A01;
    public boolean A02;

    public final void onClick(View view) {
        GroupCallLogActivity groupCallLogActivity = (GroupCallLogActivity) this.A00;
        Uri parse = Uri.parse(C107305b5.A05(this.A01, this.A02));
        C1230066r r2 = groupCallLogActivity.A03;
        groupCallLogActivity.A01.A00();
        AnonymousClass36T.A05(parse, groupCallLogActivity, groupCallLogActivity.A05, r2, 13);
    }

    public C109445ed(GroupCallLogActivity groupCallLogActivity, String str, boolean z) {
        this.A00 = groupCallLogActivity;
        this.A01 = str;
        this.A02 = z;
    }
}
