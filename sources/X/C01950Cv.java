package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import com.facebook.rendercore.text.RCTextView;

/* renamed from: X.0Cv  reason: invalid class name and case insensitive filesystem */
public class C01950Cv extends AnonymousClass6E8 {
    public final C153427bI A00;
    public final AnonymousClass84O A01;
    public final AnonymousClass84O A02;
    public final C835248t A03;
    public final boolean A04;

    public void onClick(View view) {
        Object obj;
        C152057Xj r4 = new C152057Xj();
        r4.A05(this.A02, 0);
        if (!this.A04 || !(view instanceof RCTextView)) {
            obj = this.A00;
        } else {
            obj = A00((RCTextView) view);
        }
        r4.A05(obj, 1);
        AnonymousClass84O r3 = this.A01;
        C835248t r2 = this.A03;
        C159377lj.A01(this.A00, r3, r4.A03(), r2);
    }

    public C01950Cv(C153427bI r1, AnonymousClass84O r2, AnonymousClass84O r3, C835248t r4, String str, String str2, boolean z) {
        super(str, str2);
        this.A03 = r4;
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = r1;
        this.A04 = z;
    }

    public final AnonymousClass7MP A00(RCTextView rCTextView) {
        Spanned spanned = (Spanned) rCTextView.getText();
        Layout layout = rCTextView.getLayout();
        double spanStart = (double) spanned.getSpanStart(this);
        double spanEnd = (double) spanned.getSpanEnd(this);
        int i = (int) spanStart;
        double primaryHorizontal = (double) layout.getPrimaryHorizontal(i);
        double primaryHorizontal2 = (double) layout.getPrimaryHorizontal((int) spanEnd);
        int lineForOffset = layout.getLineForOffset(i);
        Rect A0N = AnonymousClass001.A0N();
        layout.getLineBounds(lineForOffset, A0N);
        RectF rectF = new RectF(A0N);
        float paddingBottom = (float) (((double) rectF.left) + ((((double) rCTextView.getPaddingBottom()) + primaryHorizontal) - ((double) rCTextView.getScrollX())) + ((double) rCTextView.getLayoutTranslationX()));
        rectF.left = paddingBottom;
        rectF.right = (float) ((((double) paddingBottom) + primaryHorizontal2) - primaryHorizontal);
        double scrollY = (double) (((float) (rCTextView.getScrollY() + rCTextView.getPaddingTop())) + rCTextView.getLayoutTranslationY());
        rectF.top = (float) (((double) rectF.top) + scrollY);
        rectF.bottom = (float) (((double) rectF.bottom) + scrollY);
        rCTextView.getMatrix().mapRect(rectF);
        rectF.offset((float) rCTextView.getLeft(), (float) rCTextView.getTop());
        return new AnonymousClass7MP(rectF.left + (rectF.width() / 2.0f), rectF.top + (rectF.height() / 2.0f), rectF.width(), rectF.height());
    }

    public void updateDrawState(TextPaint textPaint) {
    }
}
