package X;

import android.view.ViewTreeObserver;
import com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText;

/* renamed from: X.0ab  reason: invalid class name and case insensitive filesystem */
public class C07270ab implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ BloksEditText A00;
    public final /* synthetic */ C07080aI A01;

    public C07270ab(BloksEditText bloksEditText, C07080aI r2) {
        this.A01 = r2;
        this.A00 = bloksEditText;
    }

    public boolean onPreDraw() {
        BloksEditText bloksEditText = this.A00;
        bloksEditText.getViewTreeObserver().removeOnPreDrawListener(this);
        bloksEditText.setSelection(bloksEditText.length());
        return true;
    }
}
