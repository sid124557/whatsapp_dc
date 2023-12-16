package X;

import android.text.Editable;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.WaEditText;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;

/* renamed from: X.52L  reason: invalid class name */
public final class AnonymousClass52L extends AnonymousClass52T {
    public final /* synthetic */ CallRatingViewModel A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass52L(WaEditText waEditText, CallRatingViewModel callRatingViewModel, C620633i r16, C620733j r17, AnonymousClass487 r18, AnonymousClass5Y0 r19, C60152y5 r20) {
        super(waEditText, (TextView) null, r16, r17, r18, r19, r20, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 0, false, false, false);
        this.A00 = callRatingViewModel;
    }

    public void afterTextChanged(Editable editable) {
        C162457s7.A0J(editable, 0);
        super.afterTextChanged(editable);
        CallRatingViewModel callRatingViewModel = this.A00;
        String A002 = AnonymousClass2AB.A00(editable.toString());
        C162457s7.A0J(A002, 0);
        callRatingViewModel.A06 = A002;
        C998558l r3 = C998558l.PROBLEM_OTHER;
        boolean z = false;
        if (A002.codePointCount(0, A002.length()) >= 3) {
            z = true;
        }
        callRatingViewModel.A0D(r3, z);
    }
}
