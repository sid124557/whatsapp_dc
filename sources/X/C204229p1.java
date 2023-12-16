package X;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.WaEditText;

/* renamed from: X.9p1  reason: invalid class name and case insensitive filesystem */
public class C204229p1 implements AnonymousClass4CE {
    public Object A00;
    public Object A01;
    public final int A02;

    public C204229p1(WaEditText waEditText, C194419Su r2, int i) {
        this.A02 = i;
        this.A00 = r2;
        this.A01 = waEditText;
    }

    public void BNH() {
        View view = (View) this.A01;
        C626936e.A04(view);
        view.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public void BRo(int[] iArr) {
        int i = this.A02;
        EditText editText = (EditText) this.A01;
        if (i == 0 || editText.getVisibility() == 0) {
            C107345b9.A09(editText, iArr, 0);
        }
    }
}
