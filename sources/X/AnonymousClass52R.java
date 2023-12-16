package X;

import android.text.Editable;
import com.whatsapp.R;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;

/* renamed from: X.52R  reason: invalid class name */
public class AnonymousClass52R extends C166677z5 {
    public boolean A00;
    public final /* synthetic */ SharedTextPreviewDialogFragment A01;

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int codePointCount;
        boolean z = false;
        if (i3 > i2 && ((codePointCount = Character.codePointCount(charSequence, i, i3 + i)) > 1 || (codePointCount == 1 && Character.isWhitespace(Character.codePointAt(charSequence, i))))) {
            z = true;
        }
        this.A00 = z;
    }

    public AnonymousClass52R(SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment) {
        this.A01 = sharedTextPreviewDialogFragment;
    }

    public void afterTextChanged(Editable editable) {
        SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = this.A01;
        C003203q A0Q = sharedTextPreviewDialogFragment.A0Q();
        AnonymousClass5Y0 r6 = sharedTextPreviewDialogFragment.A0C;
        Editable editable2 = editable;
        C107635bd.A0F(A0Q, editable2, sharedTextPreviewDialogFragment.A0G.getPaint(), sharedTextPreviewDialogFragment.A0C, r6, sharedTextPreviewDialogFragment.A0H, R.color.f5nameremoved, sharedTextPreviewDialogFragment.A0U);
        sharedTextPreviewDialogFragment.A1Y(editable, this.A00);
    }
}
