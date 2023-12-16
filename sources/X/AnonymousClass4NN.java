package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.4NN  reason: invalid class name */
public class AnonymousClass4NN extends View {
    public final Rect A00 = AnonymousClass001.A0N();
    public final /* synthetic */ AnonymousClass5TP A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4NN(Context context, AnonymousClass5TP r3) {
        super(context);
        this.A01 = r3;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        AnonymousClass5TP r1 = this.A01;
        C93294oH r2 = r1.A0D;
        AnonymousClass677 r0 = r2.A0m;
        if ((r0 == null || r0.BLE()) && isSelected()) {
            StickerView stickerView = r1.A0C;
            Rect rect = this.A00;
            stickerView.getDrawingRect(rect);
            canvas.drawRect(rect, r2.A0n.B7l());
        }
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        StickerView stickerView = this.A01.A0C;
        int measuredHeight = stickerView.getMeasuredHeight();
        int measuredWidth = stickerView.getMeasuredWidth();
        if (mode != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(measuredWidth, size);
            } else {
                size = measuredWidth;
            }
        }
        if (mode2 != 1073741824) {
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(size2, measuredHeight);
            } else {
                size2 = measuredHeight;
            }
        }
        setMeasuredDimension(size, size2);
    }
}
