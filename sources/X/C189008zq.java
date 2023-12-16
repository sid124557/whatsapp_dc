package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;

/* renamed from: X.8zq  reason: invalid class name and case insensitive filesystem */
public class C189008zq extends C86994Mr {
    public Object A00;
    public final int A01 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C189008zq(Context context, Runnable runnable, int i) {
        super(context, i);
        this.A00 = runnable;
    }

    public void onClick(View view) {
        if (this.A01 != 0) {
            ((Runnable) this.A00).run();
        } else {
            ((View.OnClickListener) this.A00).onClick(view);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        if (1 - this.A01 != 0) {
            super.updateDrawState(textPaint);
            return;
        }
        C162457s7.A0J(textPaint, 0);
        super.updateDrawState(textPaint);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C189008zq(Context context, View.OnClickListener onClickListener) {
        super(context);
        this.A00 = onClickListener;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C189008zq(Runnable runnable, int i) {
        super(i, i, i);
        this.A00 = runnable;
    }
}
