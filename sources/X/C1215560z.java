package X;

import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;

/* renamed from: X.60z  reason: invalid class name and case insensitive filesystem */
public final class C1215560z extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ InviteNonWhatsAppContactPickerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1215560z(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        super(1);
        this.this$0 = inviteNonWhatsAppContactPickerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C162457s7.A0J(str, 0);
        InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = this.this$0;
        C53802nh r2 = inviteNonWhatsAppContactPickerActivity.A0F;
        if (r2 != null) {
            r2.A01(inviteNonWhatsAppContactPickerActivity, inviteNonWhatsAppContactPickerActivity.A75(), str, "sms:");
            return C59022wD.A00;
        }
        throw C18270x1.A0S("inviteContactUtils");
    }
}
