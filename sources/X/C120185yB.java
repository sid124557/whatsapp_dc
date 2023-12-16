package X;

import com.whatsapp.spamreport.ReportSpamDialogFragment;

/* renamed from: X.5yB  reason: invalid class name and case insensitive filesystem */
public final class C120185yB extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ ReportSpamDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120185yB(ReportSpamDialogFragment reportSpamDialogFragment) {
        super(0);
        this.this$0 = reportSpamDialogFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C95814uZ A05 = C95814uZ.A00.A05(this.this$0.A0H().getString("jid"));
        if (A05 != null) {
            return A05;
        }
        throw C18300x5.A0X();
    }
}
