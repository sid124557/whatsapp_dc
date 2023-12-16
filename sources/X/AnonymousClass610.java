package X;

import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;
import com.whatsapp.wds.components.search.WDSSearchBar;

/* renamed from: X.610  reason: invalid class name */
public final class AnonymousClass610 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ InviteNonWhatsAppContactPickerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass610(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        super(1);
        this.this$0 = inviteNonWhatsAppContactPickerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1Z = AnonymousClass001.A1Z(obj);
        WDSSearchBar wDSSearchBar = this.this$0.A0J;
        if (A1Z) {
            if (wDSSearchBar == null) {
                throw C18270x1.A0S("wdsSearchBar");
            }
            wDSSearchBar.A01();
        } else if (wDSSearchBar == null) {
            throw C18270x1.A0S("wdsSearchBar");
        } else {
            wDSSearchBar.A02(true);
        }
        return C59022wD.A00;
    }
}
