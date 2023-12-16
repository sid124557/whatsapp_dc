package X;

import com.whatsapp.R;
import com.whatsapp.product.newsletterenforcements.enforcedmessages.DeleteEnforcedMessageDialogFragment;
import com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesActivity;

/* renamed from: X.431  reason: invalid class name */
public final class AnonymousClass431 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ EnforcedMessagesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass431(EnforcedMessagesActivity enforcedMessagesActivity) {
        super(1);
        this.this$0 = enforcedMessagesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass2z0 r10 = (AnonymousClass2z0) obj;
        C162457s7.A0J(r10, 0);
        DeleteEnforcedMessageDialogFragment deleteEnforcedMessageDialogFragment = new DeleteEnforcedMessageDialogFragment();
        deleteEnforcedMessageDialogFragment.A0u(C57022sw.A00((Object[]) null, -1, 0, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, -1));
        C107395bF.A07(deleteEnforcedMessageDialogFragment.A0H(), r10);
        this.this$0.Boo(deleteEnforcedMessageDialogFragment);
        return C59022wD.A00;
    }
}
