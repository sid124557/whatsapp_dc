package X;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Map;

/* renamed from: X.1Eo  reason: invalid class name and case insensitive filesystem */
public class C22111Eo extends C86994Mr {
    public final /* synthetic */ int A00;
    public final /* synthetic */ URLSpan A01;
    public final /* synthetic */ Map A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22111Eo(URLSpan uRLSpan, Map map, int i) {
        super(0, 0, 0);
        this.A02 = map;
        this.A01 = uRLSpan;
        this.A00 = i;
    }

    public void onClick(View view) {
        Runnable runnable = (Runnable) this.A02.get(this.A01.getURL());
        if (runnable != null) {
            runnable.run();
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        int i = this.A00;
        textPaint.setUnderlineText(false);
        if (i == 0) {
            i = textPaint.linkColor;
        }
        textPaint.setColor(i);
    }
}
