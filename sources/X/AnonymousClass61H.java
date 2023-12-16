package X;

import android.database.Cursor;
import com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity;

/* renamed from: X.61H  reason: invalid class name */
public final class AnonymousClass61H extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ ReportToAdminMessagesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61H(ReportToAdminMessagesActivity reportToAdminMessagesActivity) {
        super(1);
        this.this$0 = reportToAdminMessagesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Cursor cursor = (Cursor) obj;
        C87944Ws r0 = this.this$0.A06;
        if (r0 == null) {
            throw C18270x1.A0S("adapter");
        }
        r0.A00 = cursor;
        r0.A05();
        ReportToAdminMessagesActivity.A0C(this.this$0);
        return C59022wD.A00;
    }
}
