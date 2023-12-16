package X;

import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;

/* renamed from: X.612  reason: invalid class name */
public final class AnonymousClass612 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ InviteNonWhatsAppContactPickerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass612(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        super(1);
        this.this$0 = inviteNonWhatsAppContactPickerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = this.this$0;
        C49762h3 r3 = inviteNonWhatsAppContactPickerActivity.A0G;
        if (r3 != null) {
            Integer A75 = inviteNonWhatsAppContactPickerActivity.A75();
            C25351aN r1 = new C25351aN();
            r1.A03 = AnonymousClass001.A0f();
            r1.A04 = A75;
            r1.A02 = Boolean.TRUE;
            r3.A03.BhD(r1);
            return C59022wD.A00;
        }
        throw C18270x1.A0S("inviteFlowLogger");
    }
}
