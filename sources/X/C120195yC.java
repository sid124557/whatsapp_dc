package X;

import com.whatsapp.spamreport.ReportSpamDialogFragment;

/* renamed from: X.5yC  reason: invalid class name and case insensitive filesystem */
public final class C120195yC extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ ReportSpamDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120195yC(ReportSpamDialogFragment reportSpamDialogFragment) {
        super(0);
        this.this$0 = reportSpamDialogFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String string = this.this$0.A0H().getString("flow");
        if (string != null) {
            return string;
        }
        throw C18300x5.A0X();
    }
}
