package X;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.02E  reason: invalid class name */
public final class AnonymousClass02E extends ClickableSpan {
    public final int A00;
    public final int A01;
    public final C05650Ui A02;

    public AnonymousClass02E(C05650Ui r1, int i, int i2) {
        this.A01 = i;
        this.A02 = r1;
        this.A00 = i2;
    }

    public void onClick(View view) {
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.A01);
        C05650Ui r0 = this.A02;
        r0.A01.performAction(this.A00, A08);
    }
}
