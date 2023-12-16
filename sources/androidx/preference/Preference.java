package androidx.preference;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass09H;
import X.AnonymousClass0Pz;
import X.AnonymousClass0XW;
import X.C05650Ui;
import X.C05790Uy;
import X.C06950a5;
import X.C15150qr;
import X.C15970sG;
import X.C15980sH;
import X.C15990sI;
import X.C16000sJ;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

public class Preference implements Comparable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public Context A05;
    public Intent A06;
    public Drawable A07;
    public Bundle A08;
    public C15150qr A09;
    public C15970sG A0A;
    public C15980sH A0B;
    public C06950a5 A0C;
    public C15990sI A0D;
    public PreferenceGroup A0E;
    public AnonymousClass0Pz A0F;
    public CharSequence A0G;
    public CharSequence A0H;
    public Object A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public List A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public final View.OnClickListener A0d;

    public Parcelable A03() {
        this.A0P = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void A0G(Parcelable parcelable) {
        this.A0P = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw AnonymousClass001.A0c("Wrong state class -- expecting Preference State");
        }
    }

    public long A02() {
        return this.A04;
    }

    public CharSequence A04() {
        C15990sI r0 = this.A0D;
        if (r0 != null) {
            return r0.Bhg(this);
        }
        return this.A0G;
    }

    public void A06() {
        C15150qr r1 = this.A09;
        if (r1 != null) {
            AnonymousClass09H r12 = (AnonymousClass09H) r1;
            int indexOf = r12.A05.indexOf(this);
            if (indexOf != -1) {
                r12.A01.A04(this, indexOf, 1);
            }
        }
    }

    public void A07() {
        C15150qr r0 = this.A09;
        if (r0 != null) {
            AnonymousClass09H r02 = (AnonymousClass09H) r0;
            Handler handler = r02.A00;
            Runnable runnable = r02.A02;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    public void A08() {
        PreferenceScreen preferenceScreen;
        Preference A0U2;
        String str = this.A0J;
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass0Pz r0 = this.A0F;
            if (r0 == null || (preferenceScreen = r0.A07) == null || (A0U2 = preferenceScreen.A0U(str)) == null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Dependency \"");
                A0o.append(str);
                A0o.append("\" not found for preference \"");
                A0o.append(this.A0L);
                A0o.append("\" (title: \"");
                A0o.append(this.A0H);
                throw AnonymousClass000.A0I("\"", A0o);
            }
            List list = A0U2.A0M;
            if (list == null) {
                list = AnonymousClass001.A0s();
                A0U2.A0M = list;
            }
            list.add(this);
            boolean A0R2 = A0U2.A0R();
            if (this.A0R == A0R2) {
                this.A0R = !A0R2;
                AnonymousClass001.A1C(this);
            }
        }
    }

    public void A09() {
    }

    public final void A0B() {
        AnonymousClass0Pz r0;
        PreferenceScreen preferenceScreen;
        Preference A0U2;
        List list;
        String str = this.A0J;
        if (str != null && (r0 = this.A0F) != null && (preferenceScreen = r0.A07) != null && (A0U2 = preferenceScreen.A0U(str)) != null && (list = A0U2.A0M) != null) {
            list.remove(this);
        }
    }

    public void A0C(int i) {
        Drawable A012 = AnonymousClass0XW.A01(this.A05, i);
        if (this.A07 != A012) {
            this.A07 = A012;
            this.A00 = 0;
            A06();
        }
        this.A00 = i;
    }

    public void A0D(int i) {
        String string = this.A05.getString(i);
        CharSequence charSequence = this.A0H;
        if (string == null) {
            if (charSequence == null) {
                return;
            }
        } else if (string.equals(charSequence)) {
            return;
        }
        this.A0H = string;
        A06();
    }

    public void A0E(Bundle bundle) {
        Parcelable parcelable;
        if ((!TextUtils.isEmpty(this.A0L)) && (parcelable = bundle.getParcelable(this.A0L)) != null) {
            this.A0P = false;
            A0G(parcelable);
            if (!this.A0P) {
                throw AnonymousClass001.A0e("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    public void A0F(Bundle bundle) {
        if (!TextUtils.isEmpty(this.A0L)) {
            this.A0P = false;
            Parcelable A032 = A03();
            if (!this.A0P) {
                throw AnonymousClass001.A0e("Derived class did not call super.onSaveInstanceState()");
            } else if (A032 != null) {
                bundle.putParcelable(this.A0L, A032);
            }
        }
    }

    public void A0K(AnonymousClass0Pz r5) {
        Object obj;
        SharedPreferences sharedPreferences;
        long j;
        this.A0F = r5;
        if (!this.A0T) {
            synchronized (r5) {
                j = r5.A00;
                r5.A00 = 1 + j;
            }
            this.A04 = j;
        }
        if (A0S()) {
            AnonymousClass0Pz r0 = this.A0F;
            if (r0 != null) {
                sharedPreferences = r0.A01();
            } else {
                sharedPreferences = null;
            }
            if (sharedPreferences.contains(this.A0L)) {
                obj = null;
                A0M(obj);
            }
        }
        obj = this.A0I;
        if (obj == null) {
            return;
        }
        A0M(obj);
    }

    public void A0L(CharSequence charSequence) {
        if (this.A0D != null) {
            throw AnonymousClass001.A0e("Preference already has a SummaryProvider set.");
        } else if (!TextUtils.equals(this.A0G, charSequence)) {
            this.A0G = charSequence;
            A06();
        }
    }

    public void A0O(boolean z) {
        List list = this.A0M;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Preference preference = (Preference) list.get(i);
                if (preference.A0R == z) {
                    preference.A0R = !z;
                    AnonymousClass001.A1C(preference);
                }
            }
        }
    }

    public void A0P(boolean z) {
        if (this.A0S != z) {
            this.A0S = z;
            AnonymousClass001.A1C(this);
        }
    }

    public boolean A0Q() {
        if (!this.A0S || !this.A0R || !this.A0W) {
            return false;
        }
        return true;
    }

    public boolean A0S() {
        if (this.A0F == null || !this.A0X || !(!TextUtils.isEmpty(this.A0L))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        if (r0 != null) goto L_0x0088;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0T(X.C011409i r9) {
        /*
            r8 = this;
            android.view.View r4 = r9.A0H
            android.view.View$OnClickListener r0 = r8.A0d
            r4.setOnClickListener(r0)
            r0 = 0
            r4.setId(r0)
            r0 = 16908304(0x1020010, float:2.3877274E-38)
            android.view.View r6 = r9.A07(r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5 = 0
            r2 = 8
            r3 = 0
            if (r6 == 0) goto L_0x0106
            java.lang.CharSequence r1 = r8.A04()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0103
            r6.setText(r1)
            r6.setVisibility(r5)
            int r0 = r6.getCurrentTextColor()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L_0x0032:
            r0 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r6 = r9.A07(r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x0067
            java.lang.CharSequence r1 = r8.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00fe
            r6.setText(r1)
            r6.setVisibility(r5)
            boolean r0 = r8.A0U
            if (r0 == 0) goto L_0x0054
            boolean r0 = r8.A0b
            r6.setSingleLine(r0)
        L_0x0054:
            boolean r0 = r8.A0Z
            if (r0 != 0) goto L_0x0067
            boolean r0 = r8.A0Q()
            if (r0 == 0) goto L_0x0067
            if (r7 == 0) goto L_0x0067
            int r0 = r7.intValue()
            r6.setTextColor(r0)
        L_0x0067:
            r0 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r6 = r9.A07(r0)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            if (r6 == 0) goto L_0x0092
            int r1 = r8.A00
            if (r1 != 0) goto L_0x007a
            android.graphics.drawable.Drawable r0 = r8.A07
            if (r0 == 0) goto L_0x008b
        L_0x007a:
            android.graphics.drawable.Drawable r0 = r8.A07
            if (r0 != 0) goto L_0x0088
            android.content.Context r0 = r8.A05
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0XW.A01(r0, r1)
            r8.A07 = r0
            if (r0 == 0) goto L_0x008b
        L_0x0088:
            r6.setImageDrawable(r0)
        L_0x008b:
            android.graphics.drawable.Drawable r0 = r8.A07
            if (r0 == 0) goto L_0x00f3
            r6.setVisibility(r5)
        L_0x0092:
            r0 = 2131430656(0x7f0b0d00, float:1.848302E38)
            android.view.View r1 = r9.A07(r0)
            if (r1 != 0) goto L_0x00a4
            r0 = 16908350(0x102003e, float:2.3877403E-38)
            android.view.View r1 = r9.A07(r0)
            if (r1 == 0) goto L_0x00ab
        L_0x00a4:
            android.graphics.drawable.Drawable r0 = r8.A07
            if (r0 == 0) goto L_0x00ea
            r1.setVisibility(r5)
        L_0x00ab:
            boolean r0 = r8.A0a
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r8.A0Q()
            r8.A0I(r4, r0)
        L_0x00b6:
            boolean r2 = r8.A0Z
            r4.setFocusable(r2)
            r4.setClickable(r2)
            boolean r0 = r8.A0N
            r9.A00 = r0
            boolean r0 = r8.A0O
            r9.A01 = r0
            boolean r1 = r8.A0Q
            if (r1 == 0) goto L_0x00e3
            X.0a5 r0 = r8.A0C
            if (r0 != 0) goto L_0x00d5
            X.0a5 r0 = new X.0a5
            r0.<init>(r8)
            r8.A0C = r0
        L_0x00d5:
            r4.setOnCreateContextMenuListener(r0)
            r4.setLongClickable(r1)
            if (r1 == 0) goto L_0x00e2
            if (r2 != 0) goto L_0x00e2
            X.AnonymousClass0YY.A04(r3, r4)
        L_0x00e2:
            return
        L_0x00e3:
            r0 = r3
            goto L_0x00d5
        L_0x00e5:
            r0 = 1
            r8.A0I(r4, r0)
            goto L_0x00b6
        L_0x00ea:
            boolean r0 = r8.A0V
            if (r0 == 0) goto L_0x00ef
            r2 = 4
        L_0x00ef:
            r1.setVisibility(r2)
            goto L_0x00ab
        L_0x00f3:
            boolean r1 = r8.A0V
            r0 = 8
            if (r1 == 0) goto L_0x00fa
            r0 = 4
        L_0x00fa:
            r6.setVisibility(r0)
            goto L_0x0092
        L_0x00fe:
            r6.setVisibility(r2)
            goto L_0x0067
        L_0x0103:
            r6.setVisibility(r2)
        L_0x0106:
            r7 = r3
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.A0T(X.09i):void");
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.A02;
        int i2 = preference.A02;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.A0H;
        CharSequence charSequence2 = preference.A0H;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.A0H.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00f3, code lost:
        if (r3.hasValue(11) != false) goto L_0x00f5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Preference(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11) {
        /*
            r7 = this;
            r7.<init>()
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7.A02 = r6
            r4 = 1
            r7.A0S = r4
            r7.A0Z = r4
            r7.A0X = r4
            r7.A0R = r4
            r7.A0W = r4
            r7.A0c = r4
            r7.A0N = r4
            r7.A0O = r4
            r7.A0b = r4
            r7.A0a = r4
            r5 = 2131625777(0x7f0e0731, float:1.8878772E38)
            r7.A01 = r5
            r2 = 3
            X.0wC r0 = new X.0wC
            r0.<init>(r7, r2)
            r7.A0d = r0
            r7.A05 = r8
            int[] r0 = X.AnonymousClass0KB.A06
            android.content.res.TypedArray r3 = r8.obtainStyledAttributes(r9, r0, r10, r11)
            r1 = 23
            r0 = 0
            int r0 = r3.getResourceId(r0, r0)
            int r0 = r3.getResourceId(r1, r0)
            r7.A00 = r0
            r1 = 26
            r0 = 6
            java.lang.String r0 = X.AnonymousClass000.A0M(r3, r1, r0)
            r7.A0L = r0
            r0 = 34
            r1 = 4
            java.lang.CharSequence r0 = r3.getText(r0)
            if (r0 != 0) goto L_0x0055
            java.lang.CharSequence r0 = r3.getText(r1)
        L_0x0055:
            r7.A0H = r0
            r0 = 33
            r1 = 7
            java.lang.CharSequence r0 = r3.getText(r0)
            if (r0 != 0) goto L_0x0064
            java.lang.CharSequence r0 = r3.getText(r1)
        L_0x0064:
            r7.A0G = r0
            r1 = 28
            r0 = 8
            int r0 = r3.getInt(r0, r6)
            int r0 = r3.getInt(r1, r0)
            r7.A02 = r0
            r1 = 22
            r0 = 13
            java.lang.String r0 = X.AnonymousClass000.A0M(r3, r1, r0)
            r7.A0K = r0
            r1 = 27
            int r0 = r3.getResourceId(r2, r5)
            int r0 = r3.getResourceId(r1, r0)
            r7.A01 = r0
            r2 = 35
            r1 = 9
            r0 = 0
            int r0 = r3.getResourceId(r1, r0)
            int r0 = r3.getResourceId(r2, r0)
            r7.A03 = r0
            r1 = 21
            r0 = 2
            boolean r0 = r3.getBoolean(r0, r4)
            boolean r0 = r3.getBoolean(r1, r0)
            r7.A0S = r0
            r1 = 30
            r0 = 5
            boolean r0 = r3.getBoolean(r0, r4)
            boolean r0 = r3.getBoolean(r1, r0)
            r7.A0Z = r0
            r1 = 29
            boolean r0 = r3.getBoolean(r4, r4)
            boolean r0 = r3.getBoolean(r1, r0)
            r7.A0X = r0
            r1 = 19
            r0 = 10
            java.lang.String r0 = X.AnonymousClass000.A0M(r3, r1, r0)
            r7.A0J = r0
            boolean r0 = r7.A0Z
            r1 = 16
            boolean r0 = r3.getBoolean(r1, r0)
            boolean r0 = r3.getBoolean(r1, r0)
            r7.A0N = r0
            boolean r0 = r7.A0Z
            r1 = 17
            boolean r0 = r3.getBoolean(r1, r0)
            boolean r0 = r3.getBoolean(r1, r0)
            r7.A0O = r0
            r1 = 18
            boolean r0 = r3.hasValue(r1)
            if (r0 != 0) goto L_0x00f5
            r1 = 11
            boolean r0 = r3.hasValue(r1)
            if (r0 == 0) goto L_0x00fb
        L_0x00f5:
            java.lang.Object r0 = r7.A05(r3, r1)
            r7.A0I = r0
        L_0x00fb:
            r1 = 31
            r0 = 12
            boolean r0 = r3.getBoolean(r0, r4)
            boolean r0 = r3.getBoolean(r1, r0)
            r7.A0a = r0
            r1 = 32
            boolean r0 = r3.hasValue(r1)
            r7.A0U = r0
            if (r0 == 0) goto L_0x011f
            r0 = 14
            boolean r0 = r3.getBoolean(r0, r4)
            boolean r0 = r3.getBoolean(r1, r0)
            r7.A0b = r0
        L_0x011f:
            r2 = 24
            r1 = 15
            r0 = 0
            boolean r0 = r3.getBoolean(r1, r0)
            boolean r0 = r3.getBoolean(r2, r0)
            r7.A0V = r0
            r1 = 25
            boolean r0 = r3.getBoolean(r1, r4)
            boolean r0 = r3.getBoolean(r1, r0)
            r7.A0c = r0
            r1 = 20
            r0 = 0
            boolean r0 = r3.getBoolean(r1, r0)
            boolean r0 = r3.getBoolean(r1, r0)
            r7.A0Q = r0
            r3.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public Object A05(TypedArray typedArray, int i) {
        return null;
    }

    public void A0H(View view) {
        Intent intent;
        C16000sJ r0;
        if (A0Q() && this.A0Z) {
            A09();
            C15980sH r02 = this.A0B;
            if (r02 != null) {
                r02.BYe(this);
                return;
            }
            AnonymousClass0Pz r03 = this.A0F;
            if ((r03 == null || (r0 = r03.A06) == null || !r0.BYf(this)) && (intent = this.A06) != null) {
                this.A05.startActivity(intent);
            }
        }
    }

    public final void A0I(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount >= 0) {
                    A0I(viewGroup.getChildAt(childCount), z);
                } else {
                    return;
                }
            }
        }
    }

    public void A0N(String str) {
        if (A0S()) {
            String str2 = null;
            if (A0S()) {
                str2 = this.A0F.A01().getString(this.A0L, (String) null);
            }
            if (!TextUtils.equals(str, str2)) {
                SharedPreferences.Editor A002 = this.A0F.A00();
                A002.putString(this.A0L, str);
                if (!this.A0F.A09) {
                    A002.apply();
                }
            }
        }
    }

    public boolean A0R() {
        return !A0Q();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        CharSequence charSequence = this.A0H;
        if (!TextUtils.isEmpty(charSequence)) {
            A0o.append(charSequence);
            A0o.append(' ');
        }
        CharSequence A042 = A04();
        if (!TextUtils.isEmpty(A042)) {
            A0o.append(A042);
            A0o.append(' ');
        }
        if (A0o.length() > 0) {
            A0o.setLength(A0o.length() - 1);
        }
        return A0o.toString();
    }

    @Deprecated
    public void A0J(C05650Ui r1) {
    }

    public void A0M(Object obj) {
    }

    public void A0A() {
        A0B();
    }

    public Preference(Context context) {
        this(context, (AttributeSet) null);
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C05790Uy.A00(context, R.attr.f3nameremoved, 16842894));
    }
}
