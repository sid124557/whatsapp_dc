package X;

import android.view.View;
import com.whatsapp.calling.callhistory.group.GroupCallLogActivity;

/* renamed from: X.7zS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C166907zS implements View.OnLongClickListener {
    public final /* synthetic */ GroupCallLogActivity A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public final boolean onLongClick(View view) {
        GroupCallLogActivity.A0C(this.A00, this.A01, this.A02);
        return true;
    }

    public /* synthetic */ C166907zS(GroupCallLogActivity groupCallLogActivity, String str, boolean z) {
        this.A00 = groupCallLogActivity;
        this.A02 = z;
        this.A01 = str;
    }
}
