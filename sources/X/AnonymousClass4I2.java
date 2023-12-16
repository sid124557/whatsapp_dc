package X;

import android.view.View;
import android.widget.RadioGroup;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.4I2  reason: invalid class name */
public class AnonymousClass4I2 implements RadioGroup.OnCheckedChangeListener {
    public Object A00;
    public final int A01;

    public AnonymousClass4I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (this.A01 != 0) {
            ((View) this.A00).setEnabled(true);
            return;
        }
        DialogFragment dialogFragment = (DialogFragment) this.A00;
        C003203q A0Q = dialogFragment.A0Q();
        if (A0Q instanceof AnonymousClass4A6) {
            ((AnonymousClass4A6) A0Q).BRx(AnonymousClass001.A0K(C06560Yg.A02(radioGroup, i).getTag()));
        }
        dialogFragment.A1K();
    }
}
