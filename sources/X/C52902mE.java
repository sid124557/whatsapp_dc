package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.2mE  reason: invalid class name and case insensitive filesystem */
public abstract class C52902mE {
    public final C69263Wi A00;
    public final AnonymousClass5Y0 A01;
    public final AnonymousClass4FS A02;
    public final WeakReference A03;

    public abstract void A00(int i, String str, boolean z);

    public abstract void A01(Drawable drawable, Integer num);

    public final void A02(C52892mD r13) {
        View view = (View) this.A03.get();
        if (view != null) {
            Context context = view.getContext();
            Resources resources = context.getResources();
            if (r13 != null) {
                String str = r13.A03;
                if (str != null) {
                    A00(resources.getColor(R.color.f5nameremoved), str, false);
                }
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
                String str2 = r13.A02;
                if (str2 == null || str2.length() == 0) {
                    A01((Drawable) null, (Integer) null);
                } else {
                    this.A02.BkP(new C70473aY(resources, this, str2, dimensionPixelSize, 5));
                }
            } else {
                int A012 = AnonymousClass34K.A01(context, R.attr.f3nameremoved);
                A00(context.getResources().getColor(A012), C18290x4.A0l(context, R.string.f11nameremoved), true);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
                Drawable A04 = C107335b8.A04(context, R.drawable.ib_emoji, A012);
                C162457s7.A0D(A04);
                A04.setBounds(0, 0, dimensionPixelSize2, dimensionPixelSize2);
                A01(A04, Integer.valueOf(A012));
            }
        }
    }

    public C52902mE(C69263Wi r1, AnonymousClass5Y0 r2, AnonymousClass4FS r3, WeakReference weakReference) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = weakReference;
    }
}
