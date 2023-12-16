package X;

import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesActivity;

/* renamed from: X.62F  reason: invalid class name */
public final class AnonymousClass62F extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ EnforcedMessagesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass62F(EnforcedMessagesActivity enforcedMessagesActivity) {
        super(1);
        this.this$0 = enforcedMessagesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass0x9.A0F(this.this$0.A00, R.id.channel_badge).setImageResource(R.drawable.ic_opaque_warning_triangle);
        ImageView A0F = AnonymousClass0x9.A0F(this.this$0.A00, R.id.channel_icon);
        int dimensionPixelSize = this.this$0.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.this$0.A07.A09(A0F, (AnonymousClass3ZH) obj, dimensionPixelSize, true);
        return C59022wD.A00;
    }
}
