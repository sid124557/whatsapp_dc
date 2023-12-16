package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.conversation.comments.MessageText;
import com.whatsapp.inappsupport.ui.ContactUsActivity;

/* renamed from: X.67s  reason: invalid class name and case insensitive filesystem */
public class C1232567s extends C86994Mr {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1232567s(Context context, Object obj, Object obj2, int i) {
        super(context);
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void onClick(View view) {
        if (this.A02 != 0) {
            ContactUsActivity contactUsActivity = (ContactUsActivity) this.A00;
            Class BBA = contactUsActivity.A0K.A0G().BBA();
            C18260x0.A1R(AnonymousClass001.A0o(), "PAY: ContactUsActivity starting settings ", BBA);
            Context context = (Context) this.A01;
            context.startActivity(AnonymousClass0x9.A08(context, BBA));
            C203499no B7b = contactUsActivity.A0K.A0G().B7b();
            if (B7b != null) {
                AnonymousClass303 r3 = new AnonymousClass303(new AnonymousClass303[0]);
                r3.A03("hc_entrypoint", "wa_settings_support");
                r3.A03("app_type", "consumer");
                B7b.BKE(r3, AnonymousClass001.A0f(), 39, "settings_contact_us", (String) null);
                return;
            }
            return;
        }
        MessageText messageText = (MessageText) this.A01;
        messageText.A00 = 0;
        messageText.A0L(messageText.A04, (C624134x) this.A00, messageText.A0E);
    }
}
