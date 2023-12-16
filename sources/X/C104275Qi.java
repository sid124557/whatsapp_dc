package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.5Qi  reason: invalid class name and case insensitive filesystem */
public final class C104275Qi {
    public final C69263Wi A00;
    public final AnonymousClass314 A01;
    public final AnonymousClass5XH A02;
    public final C56612sH A03;
    public final C56542sA A04;
    public final AnonymousClass1R1 A05;
    public final AnonymousClass4FS A06;
    public final WeakReference A07;

    public final void A00(Set set) {
        Context A0U = C86664Kz.A0U(this.A07);
        if (A0U != null) {
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (!this.A01.A0D(C18300x5.A0P(it))) {
                        C19340zH A002 = AnonymousClass5V0.A00(A0U);
                        A002.A0U(R.string.f11nameremoved);
                        A002.A0T(R.string.f11nameremoved);
                        A002.A0W((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
                        A002.A0Y(new AnonymousClass69T(this, 7, set), R.string.f11nameremoved);
                        A002.A0S();
                        return;
                    }
                }
            }
            C69263Wi r4 = this.A00;
            Resources resources = A0U.getResources();
            Object[] A0L = AnonymousClass002.A0L();
            AnonymousClass000.A1P(A0L, 3, 0);
            r4.A0P(resources.getQuantityString(R.plurals.f9nameremoved, 3, A0L), 0);
        }
    }

    public C104275Qi(Context context, C69263Wi r3, AnonymousClass314 r4, AnonymousClass5XH r5, C56612sH r6, C56542sA r7, AnonymousClass1R1 r8, AnonymousClass4FS r9) {
        C18260x0.A0f(context, r6, r3, r9, r7);
        C18260x0.A0W(r8, r4, r5);
        this.A03 = r6;
        this.A00 = r3;
        this.A06 = r9;
        this.A04 = r7;
        this.A05 = r8;
        this.A01 = r4;
        this.A02 = r5;
        this.A07 = AnonymousClass0x9.A14(context);
    }
}
