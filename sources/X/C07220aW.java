package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import java.util.List;

/* renamed from: X.0aW  reason: invalid class name and case insensitive filesystem */
public final class C07220aW implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass04T A01;
    public final /* synthetic */ C03830Ls A02;

    public C07220aW(AnonymousClass04T r1, C03830Ls r2, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }

    public void onGlobalLayout() {
        int A002;
        List list;
        AnonymousClass04T r7 = this.A01;
        r7.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        AnonymousClass0Pr r0 = this.A02.A02;
        if (!(r0 == null || (list = r0.A04) == null)) {
            r7.A03(list);
        }
        Drawable progressDrawable = r7.getProgressDrawable();
        int i = r7.getProgressDrawable().getBounds().left;
        int i2 = r7.getProgressDrawable().getBounds().left;
        Context context = r7.getContext();
        C162457s7.A0D(context);
        int A003 = i2 + AnonymousClass04T.A00(context, 4);
        int i3 = r7.getProgressDrawable().getBounds().right;
        int i4 = this.A00;
        if (i4 == 0) {
            A002 = r7.getProgressDrawable().getBounds().bottom;
        } else {
            Context context2 = r7.getContext();
            C162457s7.A0D(context2);
            A002 = i4 - AnonymousClass04T.A00(context2, 4);
        }
        progressDrawable.setBounds(i, A003, i3, A002);
    }
}
