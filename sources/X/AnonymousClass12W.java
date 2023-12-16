package X;

import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.12W  reason: invalid class name */
public class AnonymousClass12W extends C05570Ua {
    public AnonymousClass2O0 A00;
    public final RadioButton A01;
    public final TextView A02;

    public AnonymousClass12W(View view) {
        super(view);
        this.A02 = C18300x5.A0G(view, R.id.question);
        RadioButton radioButton = (RadioButton) C06560Yg.A02(view, R.id.radio);
        this.A01 = radioButton;
        radioButton.setOnCheckedChangeListener(new C85854Hw(this, 3));
        C633839a.A00(this.A02, this, 2);
    }
}
