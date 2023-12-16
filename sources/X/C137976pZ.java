package X;

import android.view.View;
import com.whatsapp.WaEditText;
import com.whatsapp.picker.search.StickerSearchDialogFragment;

/* renamed from: X.6pZ  reason: invalid class name and case insensitive filesystem */
public final class C137976pZ extends C166677z5 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ StickerSearchDialogFragment A01;

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        WaEditText waEditText;
        C162457s7.A0J(charSequence, 0);
        StickerSearchDialogFragment stickerSearchDialogFragment = this.A01;
        Runnable runnable = stickerSearchDialogFragment.A0C;
        if (!(runnable == null || (waEditText = stickerSearchDialogFragment.A05) == null)) {
            waEditText.removeCallbacks(runnable);
        }
        View view = this.A00;
        C70353aM r3 = new C70353aM(stickerSearchDialogFragment, charSequence, view, 32);
        stickerSearchDialogFragment.A0C = r3;
        WaEditText waEditText2 = stickerSearchDialogFragment.A05;
        if (waEditText2 != null) {
            waEditText2.postDelayed(r3, 500);
        }
        view.setVisibility(0);
    }

    public C137976pZ(View view, StickerSearchDialogFragment stickerSearchDialogFragment) {
        this.A01 = stickerSearchDialogFragment;
        this.A00 = view;
    }
}
