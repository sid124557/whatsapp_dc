package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.style.LineBackgroundSpan;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;

/* renamed from: X.5i0  reason: invalid class name and case insensitive filesystem */
public final class C111385i0 implements AnonymousClass4CF, LineBackgroundSpan {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass64E A03;
    public final TextEmojiLabel A04;
    public final String A05;
    public final ArrayList A06 = AnonymousClass001.A0s();
    public final boolean A07;

    public C111385i0(AnonymousClass64E r2, TextEmojiLabel textEmojiLabel, String str, int i, int i2, int i3, boolean z) {
        C162457s7.A0J(str, 2);
        this.A04 = textEmojiLabel;
        this.A05 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A07 = z;
        this.A03 = r2;
    }

    public void BP4(MotionEvent motionEvent, View view) {
        AnonymousClass64E r1 = this.A03;
        if (r1 != null) {
            r1.BV7(motionEvent, view, this.A05);
        }
    }

    public void BVw(MotionEvent motionEvent, View view) {
        AnonymousClass64E r0 = this.A03;
        if (r0 != null) {
            String str = this.A05;
            AnonymousClass51x r02 = ((C111275hp) r0).A00;
            C620633i r1 = r02.A0G;
            C106595Zp.A01(r02.A0D, r1, str);
            C106755a7.A03(r1);
        }
    }

    public void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        int i9;
        float f;
        float measureText;
        float f2;
        C18260x0.A0O(canvas, paint);
        CharSequence charSequence2 = charSequence;
        C162457s7.A0J(charSequence2, 7);
        TextEmojiLabel textEmojiLabel = this.A04;
        Layout layout = textEmojiLabel.getLayout();
        int i10 = this.A01;
        int lineForOffset = layout.getLineForOffset(i10);
        int i11 = this.A00;
        int lineForOffset2 = layout.getLineForOffset(i11);
        int i12 = i8;
        if (lineForOffset <= i12 && i12 <= lineForOffset2) {
            if (i12 == lineForOffset) {
                i9 = (int) layout.getPrimaryHorizontal(i10);
                if (i12 == lineForOffset2) {
                    f2 = layout.getPrimaryHorizontal(i11);
                } else {
                    f = (float) i9;
                    measureText = paint.measureText(charSequence2, i10, i7);
                    f2 = f + measureText;
                }
            } else {
                i10 = i6;
                i9 = (int) layout.getPrimaryHorizontal(i10);
                f = (float) i9;
                if (i12 >= lineForOffset2) {
                    measureText = paint.measureText(charSequence2, i10, i11);
                    f2 = f + measureText;
                }
                measureText = paint.measureText(charSequence2, i10, i7);
                f2 = f + measureText;
            }
            int i13 = (int) f2;
            int A012 = AnonymousClass4L0.A01(textEmojiLabel.getResources(), R.dimen.f6nameremoved) / 3;
            RectF A09 = AnonymousClass4L0.A09((float) (i9 - A012), (float) i3, (float) (i13 + A012), (float) i5);
            Rect A0N = AnonymousClass001.A0N();
            textEmojiLabel.getGlobalVisibleRect(A0N);
            int i14 = A0N.left;
            int i15 = this.A02;
            int i16 = A0N.top;
            this.A06.add(AnonymousClass4L0.A09((float) (((i9 + i14) - A012) + i15), (float) (i3 + i16 + i15), (float) (i14 + i13 + A012 + i15), (float) (i16 + i5 + i15)));
            int color = paint.getColor();
            C86624Kv.A0k(C18290x4.A0G(textEmojiLabel), paint, R.color.f5nameremoved);
            float f3 = (float) i15;
            canvas.drawRoundRect(A09, f3, f3, paint);
            paint.setColor(color);
        }
    }
}
