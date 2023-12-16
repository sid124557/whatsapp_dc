package X;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.4Mr  reason: invalid class name and case insensitive filesystem */
public abstract class C86994Mr extends CharacterStyle implements AnonymousClass8r4, UpdateAppearance {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public boolean A04;

    public void updateDrawState(TextPaint textPaint) {
        if (this.A04) {
            textPaint.setColor(this.A02);
            textPaint.bgColor = this.A00;
            textPaint.setUnderlineText(true);
            return;
        }
        int i = this.A01;
        if (i == 0) {
            i = textPaint.linkColor;
        }
        textPaint.setColor(i);
        textPaint.setUnderlineText(false);
        textPaint.bgColor = 0;
    }

    public C86994Mr(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
    }

    public void BeF(MotionEvent motionEvent, View view) {
        boolean z = true;
        if (motionEvent.getAction() == 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.A03 > 1000) {
                this.A03 = elapsedRealtime;
                if (this.A04) {
                    onClick(view);
                }
            }
        }
        if (motionEvent.getAction() != 0) {
            z = false;
        }
        this.A04 = z;
        view.invalidate();
    }

    public C86994Mr(Context context, int i) {
        this.A01 = AnonymousClass0Y8.A04(context, i);
        int A042 = AnonymousClass0Y8.A04(context, i);
        this.A02 = A042;
        this.A00 = AnonymousClass0YI.A06(A042, 72);
    }

    public C86994Mr(Context context) {
        this(context, C18290x4.A00(context));
    }
}
