package X;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.R;

/* renamed from: X.4ag  reason: invalid class name and case insensitive filesystem */
public class C88724ag extends C153787c0 {
    public int A00 = R.drawable.design_password_eye;
    public EditText A01;
    public final View.OnClickListener A02 = new C109415ea(this, 7);

    public int A01() {
        return this.A00;
    }

    public View.OnClickListener A02() {
        return this.A02;
    }

    public void A03() {
        EditText editText = this.A01;
        if (editText == null) {
            return;
        }
        if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
            this.A01.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public void A04() {
        EditText editText = this.A01;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public void A05(EditText editText) {
        this.A01 = editText;
        this.A02.A05(false);
    }

    public void A06(CharSequence charSequence, int i, int i2, int i3) {
        this.A02.A05(false);
    }

    public boolean A07() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r1 == false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A08() {
        /*
            r2 = this;
            android.widget.EditText r0 = r2.A01
            if (r0 == 0) goto L_0x000d
            android.text.method.TransformationMethod r0 = r0.getTransformationMethod()
            boolean r1 = r0 instanceof android.text.method.PasswordTransformationMethod
            r0 = 1
            if (r1 != 0) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88724ag.A08():boolean");
    }

    public C88724ag(AnonymousClass6Ff r3, int i) {
        super(r3);
        if (i != 0) {
            this.A00 = i;
        }
    }

    public int A00() {
        return R.string.f11nameremoved;
    }
}
