package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: X.0Wy  reason: invalid class name and case insensitive filesystem */
public abstract class C06280Wy {
    public static int A00 = -100;
    public static final C13570nO A01 = new C13570nO(0);
    public static final Object A02 = AnonymousClass002.A0D();

    public static void A02(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (A00 != i) {
            A00 = i;
            synchronized (A02) {
                Iterator it = A01.iterator();
                while (it.hasNext()) {
                    C06280Wy r1 = (C06280Wy) ((WeakReference) it.next()).get();
                    if (r1 != null) {
                        ((AnonymousClass040) r1).A0W(true);
                    }
                }
            }
        }
    }

    public abstract Context A04(Context context);

    public abstract View A05(View view, String str, Context context, AttributeSet attributeSet);

    public abstract AnonymousClass0R2 A06(C16910uE r1);

    public abstract void A07();

    public abstract void A08();

    public abstract void A09();

    public abstract void A0A();

    public abstract void A0B(int i);

    public abstract void A0C(Configuration configuration);

    public abstract void A0D(Bundle bundle);

    public abstract void A0E(View view);

    public abstract void A0F(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void A0G(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void A0H(Toolbar toolbar);

    public abstract void A0I(CharSequence charSequence);

    public abstract boolean A0J(int i);

    public static void A03(C06280Wy r3) {
        synchronized (A02) {
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                C06280Wy r0 = (C06280Wy) ((WeakReference) it.next()).get();
                if (r0 == r3 || r0 == null) {
                    it.remove();
                }
            }
        }
    }
}
