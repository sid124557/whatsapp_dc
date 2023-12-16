package X;

import android.view.MenuItem;
import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;
import com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel;
import java.util.List;

/* renamed from: X.613  reason: invalid class name */
public final class AnonymousClass613 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ InviteNonWhatsAppContactPickerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass613(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        super(1);
        this.this$0 = inviteNonWhatsAppContactPickerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C162457s7.A0J(list, 0);
        MenuItem menuItem = this.this$0.A00;
        if (menuItem == null) {
            throw C18270x1.A0S("searchMenuItem");
        }
        C86644Kx.A0u(menuItem, list);
        InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = this.this$0;
        C91934lp r2 = inviteNonWhatsAppContactPickerActivity.A0H;
        if (r2 == null) {
            throw C18270x1.A0S("adapter");
        }
        r2.A01 = list;
        r2.A02 = list;
        InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = inviteNonWhatsAppContactPickerActivity.A0I;
        if (inviteNonWhatsAppContactPickerViewModel == null) {
            throw C86604Kt.A0j();
        }
        r2.A00 = C86644Kx.A0h(inviteNonWhatsAppContactPickerViewModel.A06);
        C91934lp r0 = this.this$0.A0H;
        if (r0 == null) {
            throw C18270x1.A0S("adapter");
        }
        r0.notifyDataSetChanged();
        return C59022wD.A00;
    }
}
