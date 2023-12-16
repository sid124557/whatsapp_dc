package X;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment;

/* renamed from: X.1go  reason: invalid class name and case insensitive filesystem */
public class C28401go extends AnonymousClass6mM {
    public final AppCompatCheckBox A00;
    public final FilterBottomSheetDialogFragment A01;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        C48432et r5 = (C48432et) obj;
        C166447yh r3 = r5.A01;
        AppCompatCheckBox appCompatCheckBox = this.A00;
        appCompatCheckBox.setText(r3.A01);
        appCompatCheckBox.setChecked(r5.A00);
        appCompatCheckBox.setOnClickListener(new C109725f5((Object) this, (Object) r5, (Object) r3, 13));
    }

    public C28401go(AppCompatCheckBox appCompatCheckBox, FilterBottomSheetDialogFragment filterBottomSheetDialogFragment) {
        super(appCompatCheckBox);
        this.A00 = appCompatCheckBox;
        this.A01 = filterBottomSheetDialogFragment;
        appCompatCheckBox.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }
}
