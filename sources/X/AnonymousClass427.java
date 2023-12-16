package X;

import android.widget.LinearLayout;
import com.whatsapp.extensions.bloks.view.ExtensionsBottomsheetBaseContainer;

/* renamed from: X.427  reason: invalid class name */
public final class AnonymousClass427 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ ExtensionsBottomsheetBaseContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass427(ExtensionsBottomsheetBaseContainer extensionsBottomsheetBaseContainer) {
        super(1);
        this.this$0 = extensionsBottomsheetBaseContainer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        LinearLayout linearLayout = this.this$0.A01;
        if (linearLayout != null) {
            C162457s7.A0H(bool);
            linearLayout.setVisibility(AnonymousClass001.A08(bool.booleanValue() ? 1 : 0));
        }
        return C59022wD.A00;
    }
}
