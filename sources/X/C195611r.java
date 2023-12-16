package X;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment;
import java.util.List;

/* renamed from: X.11r  reason: invalid class name and case insensitive filesystem */
public class C195611r extends AnonymousClass0R6 {
    public List A00 = AnonymousClass001.A0s();
    public final FilterBottomSheetDialogFragment A01;

    public int A0G() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r2, int i) {
        ((AnonymousClass6mM) r2).A09(this.A00.get(i));
    }

    public C195611r(FilterBottomSheetDialogFragment filterBottomSheetDialogFragment) {
        this.A01 = filterBottomSheetDialogFragment;
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new C28401go((AppCompatCheckBox) C18310x6.A0H(C18280x3.A0D(viewGroup), R.layout.f8nameremoved), this.A01);
    }
}
