package X;

import com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet;
import java.text.DateFormat;

/* renamed from: X.3vu  reason: invalid class name and case insensitive filesystem */
public final class C78993vu extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ IndiaUpiDobPickerBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78993vu(IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet) {
        super(0);
        this.this$0 = indiaUpiDobPickerBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C620733j r0 = this.this$0.A00;
        if (r0 != null) {
            return DateFormat.getDateInstance(2, C620733j.A02(r0));
        }
        throw C18270x1.A0S("whatsAppLocale");
    }
}
