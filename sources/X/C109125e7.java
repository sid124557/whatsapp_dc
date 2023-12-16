package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.components.TextAndDateLayout;

/* renamed from: X.5e7  reason: invalid class name and case insensitive filesystem */
public class C109125e7 implements TextWatcher {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ TextAndDateLayout A01;

    public C109125e7(TextView textView, TextAndDateLayout textAndDateLayout) {
        this.A01 = textAndDateLayout;
        this.A00 = textView;
    }

    public void afterTextChanged(Editable editable) {
        FrameLayout.LayoutParams A0p = C86664Kz.A0p();
        int i = 5;
        if (C107555bV.A0C(editable)) {
            i = 3;
        }
        A0p.gravity = i;
        this.A00.setLayoutParams(A0p);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
