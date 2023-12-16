package X;

import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.account.remove.RemoveAccountActivity;
import java.util.Collection;

/* renamed from: X.43V  reason: invalid class name */
public final class AnonymousClass43V extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ WaTextView $removeAccountLinkedDevicesInfoTextView;
    public final /* synthetic */ RemoveAccountActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass43V(WaTextView waTextView, RemoveAccountActivity removeAccountActivity) {
        super(1);
        this.$removeAccountLinkedDevicesInfoTextView = waTextView;
        this.this$0 = removeAccountActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Collection collection = (Collection) obj;
        if (collection != null && !collection.isEmpty()) {
            this.$removeAccountLinkedDevicesInfoTextView.setVisibility(0);
            RemoveAccountActivity removeAccountActivity = this.this$0;
            AnonymousClass1Ha.A1v(removeAccountActivity, this.$removeAccountLinkedDevicesInfoTextView, C18290x4.A0l(removeAccountActivity, R.string.f11nameremoved));
        }
        return C59022wD.A00;
    }
}
