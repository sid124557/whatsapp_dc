package X;

import com.whatsapp.WaTextView;
import com.whatsapp.extensions.bloks.view.ExtensionsBottomsheetBaseContainer;

/* renamed from: X.423  reason: invalid class name */
public final class AnonymousClass423 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ ExtensionsBottomsheetBaseContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass423(ExtensionsBottomsheetBaseContainer extensionsBottomsheetBaseContainer) {
        super(1);
        this.this$0 = extensionsBottomsheetBaseContainer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        WaTextView waTextView = this.this$0.A08;
        if (waTextView != null) {
            waTextView.setText(str);
        }
        return C59022wD.A00;
    }
}
