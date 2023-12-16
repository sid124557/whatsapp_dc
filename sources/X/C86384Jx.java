package X;

import android.content.Context;
import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextPaint;
import android.text.TextWatcher;
import com.whatsapp.WaEditText;
import com.whatsapp.events.EventCreationFragment;

/* renamed from: X.4Jx  reason: invalid class name and case insensitive filesystem */
public class C86384Jx implements NoCopySpan, TextWatcher {
    public Object A00;
    public final int A01;

    public C86384Jx(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void afterTextChanged(Editable editable) {
        if (this.A01 != 0) {
            C162457s7.A0J(editable, 0);
            EventCreationFragment eventCreationFragment = (EventCreationFragment) this.A00;
            WaEditText waEditText = eventCreationFragment.A05;
            if (waEditText != null) {
                Context context = waEditText.getContext();
                TextPaint paint = waEditText.getPaint();
                AnonymousClass5Y0 r0 = eventCreationFragment.A0D;
                if (r0 != null) {
                    C107345b9.A07(context, paint, editable, r0);
                    return;
                }
                throw C18270x1.A0S("emojiLoader");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r5.length() < 4) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            int r0 = r4.A01
            if (r0 != 0) goto L_0x0022
            java.lang.Object r0 = r4.A00
            com.whatsapp.email.UpdateEmailActivity r0 = (com.whatsapp.email.UpdateEmailActivity) r0
            com.whatsapp.wds.components.button.WDSButton r3 = r0.A0B
            if (r3 != 0) goto L_0x0014
            java.lang.String r0 = "nextButton"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0014:
            if (r5 == 0) goto L_0x001e
            int r2 = r5.length()
            r1 = 4
            r0 = 1
            if (r2 >= r1) goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            r3.setEnabled(r0)
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86384Jx.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
