package X;

import android.content.DialogInterface;
import com.whatsapp.community.CommunitySpamReportDialogFragment;

/* renamed from: X.5c9  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C107935c9 implements DialogInterface.OnClickListener {
    public final /* synthetic */ CommunitySpamReportDialogFragment A00;
    public final /* synthetic */ C95814uZ A01;
    public final /* synthetic */ String A02;

    public final void onClick(DialogInterface dialogInterface, int i) {
        CommunitySpamReportDialogFragment communitySpamReportDialogFragment = this.A00;
        String str = this.A02;
        communitySpamReportDialogFragment.A03.A00(this.A01, str);
    }

    public /* synthetic */ C107935c9(CommunitySpamReportDialogFragment communitySpamReportDialogFragment, C95814uZ r2, String str) {
        this.A00 = communitySpamReportDialogFragment;
        this.A02 = str;
        this.A01 = r2;
    }
}
