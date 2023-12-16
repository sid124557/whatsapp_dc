package X;

import android.text.Editable;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.calling.callrating.CallRatingActivity;

/* renamed from: X.6pY  reason: invalid class name and case insensitive filesystem */
public class C137966pY extends AnonymousClass52T {
    public final /* synthetic */ CallRatingActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137966pY(EditText editText, CallRatingActivity callRatingActivity, C620633i r16, C620733j r17, AnonymousClass487 r18, AnonymousClass5Y0 r19, C60152y5 r20) {
        super(editText, (TextView) null, r16, r17, r18, r19, r20, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 0, false, false, false);
        this.A00 = callRatingActivity;
    }

    public void afterTextChanged(Editable editable) {
        super.afterTextChanged(editable);
        this.A00.A6D();
    }
}
