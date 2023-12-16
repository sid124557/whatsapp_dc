package X;

import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.extensions.bloks.view.ExtensionsBottomsheetBaseContainer;

/* renamed from: X.424  reason: invalid class name */
public final class AnonymousClass424 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ ExtensionsBottomsheetBaseContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass424(ExtensionsBottomsheetBaseContainer extensionsBottomsheetBaseContainer) {
        super(1);
        this.this$0 = extensionsBottomsheetBaseContainer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1Z = AnonymousClass001.A1Z(obj);
        ExtensionsBottomsheetBaseContainer extensionsBottomsheetBaseContainer = this.this$0;
        int i = R.drawable.ic_close;
        int i2 = R.string.f11nameremoved;
        if (A1Z) {
            i = R.drawable.ic_back_gray;
            i2 = R.string.f11nameremoved;
        }
        Toolbar toolbar = extensionsBottomsheetBaseContainer.A03;
        if (toolbar != null) {
            toolbar.setNavigationIcon(C18310x6.A0G(extensionsBottomsheetBaseContainer.A0G(), i));
            toolbar.setNavigationContentDescription((CharSequence) C08310eF.A09(extensionsBottomsheetBaseContainer).getString(i2));
        }
        return C59022wD.A00;
    }
}
