package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.5mO  reason: invalid class name and case insensitive filesystem */
public class C114035mO implements C182398oL {
    public final int A00;
    public final int A01;

    public Drawable B79(Context context) {
        Drawable A012 = AnonymousClass0VX.A01(context, this.A00);
        if (A012 == null) {
            return null;
        }
        Drawable A013 = C06130Wj.A01(A012);
        int i = this.A01;
        if (i == R.color.f5nameremoved) {
            i = AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved);
        }
        AnonymousClass0YG.A06(A013, context.getResources().getColor(i));
        return A013;
    }

    public C114035mO(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
