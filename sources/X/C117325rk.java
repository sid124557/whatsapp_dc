package X;

import com.whatsapp.community.CommunitySpamReportDialogFragment;
import java.util.List;

/* renamed from: X.5rk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117325rk implements Runnable {
    public final /* synthetic */ AnonymousClass4VM A00;
    public final /* synthetic */ CommunitySpamReportDialogFragment A01;
    public final /* synthetic */ AnonymousClass3ZH A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public final void run() {
        CommunitySpamReportDialogFragment communitySpamReportDialogFragment = this.A01;
        AnonymousClass3ZH r5 = this.A02;
        String str = this.A03;
        boolean z = this.A04;
        AnonymousClass4VM r2 = this.A00;
        communitySpamReportDialogFragment.A02.A04(r5, str, (List) null);
        communitySpamReportDialogFragment.A00.A0D();
        C117665sI.A00(communitySpamReportDialogFragment.A00, communitySpamReportDialogFragment, r2, 15, z);
    }

    public /* synthetic */ C117325rk(AnonymousClass4VM r1, CommunitySpamReportDialogFragment communitySpamReportDialogFragment, AnonymousClass3ZH r3, String str, boolean z) {
        this.A01 = communitySpamReportDialogFragment;
        this.A02 = r3;
        this.A03 = str;
        this.A04 = z;
        this.A00 = r1;
    }
}
