package X;

import com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity;

/* renamed from: X.3ts  reason: invalid class name and case insensitive filesystem */
public final class C77733ts extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ ReportToAdminMessagesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77733ts(ReportToAdminMessagesActivity reportToAdminMessagesActivity) {
        super(0);
        this.this$0 = reportToAdminMessagesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ReportToAdminMessagesActivity reportToAdminMessagesActivity = this.this$0;
        AnonymousClass483 r3 = reportToAdminMessagesActivity.A04;
        if (r3 != null) {
            C27991fJ A05 = AnonymousClass34R.A05(AnonymousClass0x7.A0l(reportToAdminMessagesActivity));
            AnonymousClass0OA r2 = new AnonymousClass0OA();
            r2.A01(new C823643h(r3, A05), AnonymousClass0x9.A1E(AnonymousClass113.class));
            return r2.A00();
        }
        throw C18270x1.A0S("rtaViewModelFactory");
    }
}
