package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.6Ht  reason: invalid class name and case insensitive filesystem */
public class C125366Ht extends C04580Ov {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass5UD A01;
    public final /* synthetic */ C620733j A02;

    public C125366Ht(AnonymousClass5UD r1, C620733j r2, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }

    public void A03(Rect rect, View view, AnonymousClass0Q1 r6, RecyclerView recyclerView) {
        boolean A0T = this.A02.A0T();
        int i = this.A00;
        if (A0T) {
            rect.set(0, 0, i, 0);
        } else {
            rect.set(i, 0, 0, 0);
        }
    }
}
