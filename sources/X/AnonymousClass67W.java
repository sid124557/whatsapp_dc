package X;

import com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity;
import com.whatsapp.settings.SettingsSetupUserProxyActivity;

/* renamed from: X.67W  reason: invalid class name */
public class AnonymousClass67W extends AnonymousClass0N7 {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass67W(Object obj, int i) {
        super(true);
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00() {
        switch (this.A01) {
            case 0:
                ((ReportToAdminMessagesActivity) this.A00).A74();
                return;
            case 1:
                ((SettingsSetupUserProxyActivity) this.A00).A74();
                return;
            default:
                super.A00();
                return;
        }
    }
}
