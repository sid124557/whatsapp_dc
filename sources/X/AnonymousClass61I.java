package X;

import com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity;

/* renamed from: X.61I  reason: invalid class name */
public final class AnonymousClass61I extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ ReportToAdminMessagesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61I(ReportToAdminMessagesActivity reportToAdminMessagesActivity) {
        super(1);
        this.this$0 = reportToAdminMessagesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ReportToAdminMessagesActivity reportToAdminMessagesActivity = this.this$0;
        int A07 = C86644Kx.A07((Number) obj);
        C87944Ws r0 = reportToAdminMessagesActivity.A06;
        if (r0 == null) {
            throw C18270x1.A0S("adapter");
        }
        r0.A05();
        if (A07 != 0) {
            AnonymousClass5Y0 r8 = reportToAdminMessagesActivity.A0C;
            C112975kg r02 = reportToAdminMessagesActivity.A00;
            C64773Ex r1 = r02.A0C;
            AnonymousClass5ZU r2 = r02.A0F;
            C620733j r7 = reportToAdminMessagesActivity.A00;
            AnonymousClass5M7 r03 = reportToAdminMessagesActivity.A02;
            if (r03 != null) {
                C93644ow A00 = r03.A00(reportToAdminMessagesActivity);
                AnonymousClass5RO r5 = new AnonymousClass5RO();
                C93754pF r6 = reportToAdminMessagesActivity.A07;
                if (r6 != null) {
                    reportToAdminMessagesActivity.A00.A00 = reportToAdminMessagesActivity.Bpz(new AnonymousClass685(r1, r2, reportToAdminMessagesActivity, A00, r5, r6, r7, r8));
                } else {
                    throw C18270x1.A0S("modifiedMessagesMessageSelectionActionRepository");
                }
            } else {
                throw C18270x1.A0S("coreMessageSelectionActionExecutorFactory");
            }
        }
        return C59022wD.A00;
    }
}
