package X;

import android.widget.CompoundButton;
import com.whatsapp.chatinfo.ContactInfoActivity;

/* renamed from: X.5fw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C110255fw implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C08270df A00;
    public final /* synthetic */ ContactInfoActivity A01;

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ContactInfoActivity contactInfoActivity = this.A01;
        contactInfoActivity.A0g.A00(contactInfoActivity, this.A00, C86604Kt.A0d(contactInfoActivity.A1K), "profile_view", !z);
    }

    public /* synthetic */ C110255fw(C08270df r1, ContactInfoActivity contactInfoActivity) {
        this.A01 = contactInfoActivity;
        this.A00 = r1;
    }
}
