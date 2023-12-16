package X;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.whatsapp.R;
import com.whatsapp.radio.RadioButtonWithSubtitle;

/* renamed from: X.6EB  reason: invalid class name */
public final class AnonymousClass6EB extends ForegroundColorSpan {
    public final /* synthetic */ RadioButtonWithSubtitle A00;

    public void updateDrawState(TextPaint textPaint) {
        C162457s7.A0J(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setTextSize(this.A00.getResources().getDimension(R.dimen.f6nameremoved));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6EB(RadioButtonWithSubtitle radioButtonWithSubtitle, int i) {
        super(i);
        this.A00 = radioButtonWithSubtitle;
    }
}
