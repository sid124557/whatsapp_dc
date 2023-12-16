package X;

import android.os.ResultReceiver;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.WaEditText;

/* renamed from: X.92R  reason: invalid class name */
public class AnonymousClass92R implements C181578mz {
    public Object A00;
    public final int A01;

    public AnonymousClass92R(WaEditText waEditText, int i) {
        this.A01 = i;
        this.A00 = waEditText;
    }

    public final boolean AyN(ResultReceiver resultReceiver, InputMethodManager inputMethodManager) {
        if (this.A01 != 0) {
            return inputMethodManager.hideSoftInputFromWindow(((View) this.A00).getWindowToken(), 0, resultReceiver);
        }
        return inputMethodManager.showSoftInput((View) this.A00, 0, resultReceiver);
    }
}
