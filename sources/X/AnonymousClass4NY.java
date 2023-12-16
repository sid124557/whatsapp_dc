package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: X.4NY  reason: invalid class name */
public class AnonymousClass4NY extends View implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;
    public boolean A02;
    public final Rect A03;
    public final /* synthetic */ C93314oJ A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4NY(Context context, C93314oJ r3) {
        super(context);
        this.A04 = r3;
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = AnonymousClass001.A0N();
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public boolean isSelected() {
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r2.isPressed() == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setRowSelected(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.A02
            if (r0 == r4) goto L_0x001b
            r3.A02 = r4
            r3.setSelected(r4)
            X.4oJ r2 = r3.A04
            if (r4 != 0) goto L_0x0014
            boolean r1 = r2.isPressed()
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r2.dispatchSetPressed(r0)
            r3.invalidate()
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4NY.setRowSelected(boolean):void");
    }

    public void onDraw(Canvas canvas) {
        int BCi;
        super.onDraw(canvas);
        if (this.A02) {
            C93314oJ r4 = this.A04;
            AnonymousClass677 r0 = r4.A0m;
            if (r0 == null || r0.BLE()) {
                Rect rect = this.A03;
                getDrawingRect(rect);
                if (r4.A0W) {
                    rect.top += r4.getPaddingTop();
                    BCi = rect.bottom - r4.getPaddingBottom();
                } else {
                    AnonymousClass679 r5 = r4.A0n;
                    if (r5.BHd()) {
                        if (r4.A2L) {
                            rect.top += r4.A0l.getTop();
                        }
                        if (r4.A15()) {
                            Rect rect2 = r4.A0b;
                            rect.top = rect2.top - r5.BCj(getContext());
                            int BCi2 = rect2.bottom + r5.BCi(getContext());
                            rect.bottom = BCi2;
                            LinearLayout linearLayout = r4.A0E;
                            if (linearLayout != null) {
                                rect.bottom = BCi2 + (linearLayout.getHeight() - r4.getReactionsViewVerticalOverlap());
                            }
                            canvas.drawRect(rect, r4.A0n.B7l());
                        }
                        rect.top -= r5.BCj(getContext());
                    }
                    BCi = rect.bottom + r5.BCi(getContext());
                }
                rect.bottom = BCi;
                canvas.drawRect(rect, r4.A0n.B7l());
            }
        }
    }
}
