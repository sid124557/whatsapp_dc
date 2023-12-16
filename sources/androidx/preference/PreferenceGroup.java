package androidx.preference;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0KB;
import X.C010708q;
import X.C06290Wz;
import X.C11020iy;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import java.util.List;

public abstract class PreferenceGroup extends Preference {
    public int A00;
    public int A01;
    public List A02;
    public boolean A03;
    public boolean A04;
    public final Handler A05;
    public final C06290Wz A06;
    public final Runnable A07;

    public Parcelable A03() {
        this.A0P = true;
        return new C010708q(AbsSavedState.EMPTY_STATE, this.A01);
    }

    public void A0V() {
        synchronized (this) {
            List list = this.A02;
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    A0X((Preference) list.get(0));
                }
            }
        }
        A07();
    }

    public final void A0X(Preference preference) {
        synchronized (this) {
            preference.A0B();
            if (preference.A0E == this) {
                preference.A0E = null;
            }
            if (this.A02.remove(preference)) {
                String str = preference.A0L;
                if (str != null) {
                    this.A06.put(str, Long.valueOf(preference.A02()));
                    Handler handler = this.A05;
                    Runnable runnable = this.A07;
                    handler.removeCallbacks(runnable);
                    handler.post(runnable);
                }
                if (this.A03) {
                    preference.A0A();
                }
            }
        }
    }

    public void A0G(Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(C010708q.class)) {
            C010708q r3 = (C010708q) parcelable;
            this.A01 = r3.A00;
            parcelable = r3.getSuperState();
        }
        super.A0G(parcelable);
    }

    public Preference A0U(CharSequence charSequence) {
        if (charSequence == null) {
            throw AnonymousClass001.A0c("Key cannot be null");
        } else if (TextUtils.equals(this.A0L, charSequence)) {
            return this;
        } else {
            List list = this.A02;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Preference preference = (Preference) list.get(i);
                if (TextUtils.equals(preference.A0L, charSequence) || ((preference instanceof PreferenceGroup) && (preference = ((PreferenceGroup) preference).A0U(charSequence)) != null)) {
                    return preference;
                }
            }
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0W(androidx.preference.Preference r8) {
        /*
            r7 = this;
            java.util.List r3 = r7.A02
            boolean r0 = r3.contains(r8)
            r6 = 1
            if (r0 != 0) goto L_0x00bf
            java.lang.String r4 = r8.A0L
            if (r4 == 0) goto L_0x002e
            r1 = r7
        L_0x000e:
            androidx.preference.PreferenceGroup r0 = r1.A0E
            if (r0 == 0) goto L_0x0015
            androidx.preference.PreferenceGroup r1 = r1.A0E
            goto L_0x000e
        L_0x0015:
            androidx.preference.Preference r0 = r1.A0U(r4)
            if (r0 == 0) goto L_0x002e
            java.lang.String r2 = "PreferenceGroup"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Found duplicated key: \""
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "\". This can cause unintended behaviour, please use unique keys for every preference."
            X.AnonymousClass000.A1D(r0, r2, r1)
        L_0x002e:
            int r2 = r8.A02
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r0) goto L_0x0051
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x0046
            int r1 = r7.A00
            int r0 = r1 + 1
            r7.A00 = r0
            if (r1 == r2) goto L_0x0046
            r8.A02 = r1
            r8.A07()
        L_0x0046:
            boolean r0 = r8 instanceof androidx.preference.PreferenceGroup
            if (r0 == 0) goto L_0x0051
            r1 = r8
            androidx.preference.PreferenceGroup r1 = (androidx.preference.PreferenceGroup) r1
            boolean r0 = r7.A04
            r1.A04 = r0
        L_0x0051:
            int r2 = java.util.Collections.binarySearch(r3, r8)
            if (r2 >= 0) goto L_0x0059
            int r2 = -r2
            int r2 = r2 - r6
        L_0x0059:
            boolean r1 = r7.A0R()
            boolean r0 = r8.A0W
            if (r0 != r1) goto L_0x0068
            r0 = r1 ^ 1
            r8.A0W = r0
            X.AnonymousClass001.A1C(r8)
        L_0x0068:
            monitor-enter(r7)
            r3.add(r2, r8)     // Catch:{ all -> 0x00bc }
            monitor-exit(r7)     // Catch:{ all -> 0x00bc }
            X.0Pz r5 = r7.A0F
            java.lang.String r4 = r8.A0L
            if (r4 == 0) goto L_0x008e
            X.0Wz r1 = r7.A06
            boolean r0 = r1.containsKey(r4)
            if (r0 == 0) goto L_0x008e
            java.lang.Object r0 = r1.get(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            r1.remove(r4)
        L_0x0088:
            r8.A04 = r2
            r8.A0T = r6
            r1 = 0
            goto L_0x0098
        L_0x008e:
            monitor-enter(r5)
            long r2 = r5.A00     // Catch:{ all -> 0x00b9 }
            r0 = 1
            long r0 = r0 + r2
            r5.A00 = r0     // Catch:{ all -> 0x00b9 }
            monitor-exit(r5)     // Catch:{ all -> 0x00b9 }
            goto L_0x0088
        L_0x0098:
            r8.A0K(r5)     // Catch:{ all -> 0x00b5 }
            r8.A0T = r1
            androidx.preference.PreferenceGroup r0 = r8.A0E
            if (r0 != 0) goto L_0x00ae
            r8.A0E = r7
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x00aa
            r8.A08()
        L_0x00aa:
            r7.A07()
            return
        L_0x00ae:
            java.lang.String r0 = "This preference already has a parent. You must remove the existing parent before assigning a new one."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x00b5:
            r0 = move-exception
            r8.A0T = r1
            throw r0
        L_0x00b9:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b9 }
            throw r0
        L_0x00bc:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00bc }
            throw r0
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.PreferenceGroup.A0W(androidx.preference.Preference):void");
    }

    public boolean A0Y() {
        return true;
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A06 = new C06290Wz();
        this.A05 = new Handler();
        this.A04 = true;
        this.A00 = 0;
        this.A03 = false;
        this.A01 = Integer.MAX_VALUE;
        this.A07 = new C11020iy(this);
        this.A02 = AnonymousClass001.A0s();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0KB.A08, i, i2);
        this.A04 = obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1)) {
            int i3 = obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i3 != Integer.MAX_VALUE && !(!TextUtils.isEmpty(this.A0L))) {
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass000.A1A(this, A0o);
                Log.e("PreferenceGroup", AnonymousClass000.A0X(" should have a key defined if it contains an expandable preference", A0o));
            }
            this.A01 = i3;
        }
        obtainStyledAttributes.recycle();
    }

    public void A08() {
        super.A08();
        this.A03 = true;
        List list = this.A02;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).A08();
        }
    }

    public void A0A() {
        A0B();
        this.A03 = false;
        List list = this.A02;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).A0A();
        }
    }

    public void A0E(Bundle bundle) {
        super.A0E(bundle);
        List list = this.A02;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).A0E(bundle);
        }
    }

    public void A0F(Bundle bundle) {
        super.A0F(bundle);
        List list = this.A02;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).A0F(bundle);
        }
    }

    public void A0O(boolean z) {
        super.A0O(z);
        List list = this.A02;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) list.get(i);
            if (preference.A0W == z) {
                preference.A0W = !z;
                AnonymousClass001.A1C(preference);
            }
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }
}
