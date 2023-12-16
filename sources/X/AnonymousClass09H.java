package X;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.09H  reason: invalid class name */
public class AnonymousClass09H extends AnonymousClass0R6 implements C15150qr {
    public Handler A00;
    public PreferenceGroup A01;
    public Runnable A02 = new C11030iz(this);
    public List A03;
    public List A04;
    public List A05;

    public final void A0N(PreferenceGroup preferenceGroup, List list) {
        List list2;
        synchronized (preferenceGroup) {
            list2 = preferenceGroup.A02;
            Collections.sort(list2);
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) list2.get(i);
            list.add(preference);
            AnonymousClass0OR r2 = new AnonymousClass0OR(preference);
            List list3 = this.A03;
            if (!list3.contains(r2)) {
                list3.add(r2);
            }
            if (preference instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preference;
                if (preferenceGroup2.A0Y()) {
                    A0N(preferenceGroup2, list);
                }
            }
            preference.A09 = this;
        }
    }

    public long A0B(int i) {
        if (!this.A00) {
            return -1;
        }
        return A0K(i).A02();
    }

    public int A0G() {
        return this.A05.size();
    }

    public Preference A0K(int i) {
        if (i < 0 || i >= this.A05.size()) {
            return null;
        }
        return (Preference) this.A05.get(i);
    }

    public void A0M() {
        for (Preference preference : this.A04) {
            preference.A09 = null;
        }
        ArrayList A0p = AnonymousClass000.A0p(this.A04);
        this.A04 = A0p;
        PreferenceGroup preferenceGroup = this.A01;
        A0N(preferenceGroup, A0p);
        this.A05 = A0L(preferenceGroup);
        A05();
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r2, int i) {
        A0K(i).A0T((C011409i) r2);
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        AnonymousClass0OR r4 = (AnonymousClass0OR) this.A03.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, AnonymousClass0KB.A00);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = AnonymousClass0XW.A01(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View A0R = AnonymousClass001.A0R(from, viewGroup, r4.A00);
        if (A0R.getBackground() == null) {
            AnonymousClass0YY.A04(drawable, A0R);
        }
        ViewGroup viewGroup2 = (ViewGroup) A0R.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = r4.A01;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new C011409i(A0R);
    }

    public AnonymousClass09H(PreferenceGroup preferenceGroup) {
        this.A01 = preferenceGroup;
        this.A00 = new Handler();
        this.A01.A09 = this;
        this.A04 = AnonymousClass001.A0s();
        this.A05 = AnonymousClass001.A0s();
        this.A03 = AnonymousClass001.A0s();
        A0E(true);
        A0M();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A0L(androidx.preference.PreferenceGroup r11) {
        /*
            r10 = this;
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.List r9 = r11.A02
            int r8 = r9.size()
            r7 = 0
            r6 = 0
        L_0x0010:
            if (r7 >= r8) goto L_0x006e
            java.lang.Object r2 = r9.get(r7)
            androidx.preference.Preference r2 = (androidx.preference.Preference) r2
            boolean r0 = r2.A0c
            if (r0 == 0) goto L_0x0030
            int r0 = r11.A01
            r3 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            if (r0 == r3) goto L_0x006a
            r1 = 1
            if (r6 < r0) goto L_0x006a
            r5.add(r2)
        L_0x002a:
            boolean r0 = r2 instanceof androidx.preference.PreferenceGroup
            if (r0 != 0) goto L_0x0033
            int r6 = r6 + 1
        L_0x0030:
            int r7 = r7 + 1
            goto L_0x0010
        L_0x0033:
            androidx.preference.PreferenceGroup r2 = (androidx.preference.PreferenceGroup) r2
            boolean r0 = r2.A0Y()
            if (r0 == 0) goto L_0x0030
            if (r1 == 0) goto L_0x0048
            int r0 = r2.A01
            if (r0 == r3) goto L_0x0048
            java.lang.String r0 = "Nesting an expandable group inside of another expandable group is not supported!"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0048:
            java.util.List r0 = r10.A0L(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x0050:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r1 = r2.next()
            int r0 = r11.A01
            if (r0 == r3) goto L_0x0066
            if (r6 < r0) goto L_0x0066
            r5.add(r1)
        L_0x0063:
            int r6 = r6 + 1
            goto L_0x0050
        L_0x0066:
            r4.add(r1)
            goto L_0x0063
        L_0x006a:
            r4.add(r2)
            goto L_0x002a
        L_0x006e:
            int r1 = r11.A01
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L_0x008c
            if (r6 <= r1) goto L_0x008c
            android.content.Context r0 = r11.A05
            long r2 = r11.A02()
            androidx.preference.ExpandButton r1 = new androidx.preference.ExpandButton
            r1.<init>(r0, r5, r2)
            X.0eT r0 = new X.0eT
            r0.<init>(r11, r10)
            r1.A0B = r0
            r4.add(r1)
        L_0x008c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09H.A0L(androidx.preference.PreferenceGroup):java.util.List");
    }

    public int getItemViewType(int i) {
        AnonymousClass0OR r3 = new AnonymousClass0OR(A0K(i));
        List list = this.A03;
        int indexOf = list.indexOf(r3);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = list.size();
        list.add(r3);
        return size;
    }
}
