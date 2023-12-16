package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.941  reason: invalid class name */
public class AnonymousClass941 extends ClickableSpan {
    public final /* synthetic */ AnonymousClass9F5 A00;
    public final /* synthetic */ C191509Fe A01;

    public AnonymousClass941(AnonymousClass9F5 r1, C191509Fe r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void onClick(View view) {
        this.A01.A03.onClick(this.A00.A08);
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        View view = this.A00.A01;
        C86624Kv.A0k(C18290x4.A0G(view), textPaint, AnonymousClass0x2.A05(view));
        textPaint.setUnderlineText(false);
    }
}
