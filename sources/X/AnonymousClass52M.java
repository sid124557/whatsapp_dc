package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextPaint;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.52M  reason: invalid class name */
public final class AnonymousClass52M extends AnonymousClass52T {
    public boolean A00;
    public final EditText A01;
    public final C620633i A02;
    public final AnonymousClass487 A03;
    public final AnonymousClass5Y0 A04;
    public final C60152y5 A05;
    public final boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        if (X.C175738Zn.A0Y(r2, r1, false) != false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r8) {
        /*
            r7 = this;
            r6 = 0
            X.C162457s7.A0J(r8, r6)
            android.widget.EditText r5 = r7.A01
            android.text.Layout r0 = r5.getLayout()
            if (r0 == 0) goto L_0x006b
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x006b
            r7.A00 = r6
            r5.removeTextChangedListener(r7)
            int r4 = r5.getSelectionStart()
            android.text.Layout r0 = r5.getLayout()
            int r1 = r0.getLineForOffset(r4)
            if (r1 <= 0) goto L_0x0060
            android.text.Layout r0 = r5.getLayout()
            int r1 = r1 + -1
            int r3 = r0.getLineStart(r1)
            android.text.Layout r0 = r5.getLayout()
            int r1 = r0.getLineEnd(r1)
            java.lang.CharSequence r0 = r8.subSequence(r3, r1)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "* \n"
            boolean r0 = X.C162457s7.A0P(r2, r0)
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = "- \n"
            boolean r0 = X.C162457s7.A0P(r2, r0)
            if (r0 != 0) goto L_0x0067
            java.lang.String r1 = "* "
            boolean r0 = X.C175738Zn.A0Y(r2, r1, r6)
            if (r0 != 0) goto L_0x005d
            java.lang.String r1 = "- "
            boolean r0 = X.C175738Zn.A0Y(r2, r1, r6)
            if (r0 == 0) goto L_0x0060
        L_0x005d:
            r8.insert(r4, r1)
        L_0x0060:
            r7.A00(r8)
            r5.addTextChangedListener(r7)
            return
        L_0x0067:
            r8.delete(r3, r1)
            goto L_0x0060
        L_0x006b:
            r7.A00(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass52M.afterTextChanged(android.text.Editable):void");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i3 >= 1 && charSequence != null && charSequence.charAt(i) == 10) {
            this.A00 = true;
        }
    }

    public final void A00(Editable editable) {
        boolean z = this.A06;
        EditText editText = this.A01;
        if (z) {
            Context context = editText.getContext();
            AnonymousClass5Y0 r3 = this.A04;
            C620633i r5 = this.A02;
            C60152y5 r2 = this.A05;
            TextPaint paint = editText.getPaint();
            C18270x1.A11(context, 1, r3);
            C107345b9.A08(context, paint, editable, r3, 1.3f);
            C107635bd.A0M(editable, false);
            float textSize = paint.getTextSize();
            int A012 = AnonymousClass34G.A01(r5, r2);
            int i = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            if (A012 < 2011) {
                i = 512;
            }
            C107635bd.A0A(editable, textSize, -16777216, i, true);
            return;
        }
        C107345b9.A07(editText.getContext(), editText.getPaint(), editable, this.A04);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass52M(EditText editText, TextView textView, C620633i r4, C620733j r5, AnonymousClass487 r6, AnonymousClass5Y0 r7, C60152y5 r8, int i, int i2, boolean z) {
        super(editText, textView, r4, r5, r6, r7, r8, i, i2, z);
        C18260x0.A0f(r7, r4, r5, r8, r6);
        C162457s7.A0J(editText, 6);
        this.A04 = r7;
        this.A02 = r4;
        this.A05 = r8;
        this.A03 = r6;
        this.A01 = editText;
        this.A06 = z;
    }
}
