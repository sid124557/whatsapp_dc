package androidx.preference;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass00M;
import X.AnonymousClass01z;
import X.AnonymousClass09H;
import X.AnonymousClass09Q;
import X.AnonymousClass0KB;
import X.AnonymousClass0Pz;
import X.AnonymousClass0R6;
import X.C011609k;
import X.C05930Vn;
import X.C08240dc;
import X.C08270df;
import X.C08310eF;
import X.C11010ix;
import X.C15160qs;
import X.C15170qt;
import X.C15960sF;
import X.C16000sJ;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

public abstract class PreferenceFragmentCompat extends C08310eF implements C15960sF, C16000sJ, C15160qs, C15170qt {
    public int A00 = R.layout.f8nameremoved;
    public Handler A01 = new AnonymousClass01z(this);
    public AnonymousClass0Pz A02;
    public RecyclerView A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass09Q A06 = new AnonymousClass09Q(this);
    public final Runnable A07 = new C11010ix(this);

    public void A0g() {
        this.A0X = true;
        AnonymousClass0Pz r0 = this.A02;
        r0.A06 = this;
        r0.A04 = this;
    }

    public void A0h() {
        this.A0X = true;
        AnonymousClass0Pz r1 = this.A02;
        r1.A06 = null;
        r1.A04 = null;
    }

    public abstract void A1H(String str, Bundle bundle);

    public void A0c() {
        Handler handler = this.A01;
        handler.removeCallbacks(this.A07);
        handler.removeMessages(1);
        if (this.A04) {
            this.A03.setAdapter((AnonymousClass0R6) null);
            PreferenceScreen preferenceScreen = this.A02.A07;
            if (preferenceScreen != null) {
                preferenceScreen.A0A();
            }
        }
        this.A03 = null;
        this.A0X = true;
    }

    public void A0q(Bundle bundle) {
        PreferenceScreen preferenceScreen = this.A02.A07;
        if (preferenceScreen != null) {
            Bundle A08 = AnonymousClass002.A08();
            preferenceScreen.A0F(A08);
            bundle.putBundle("android:preferences", A08);
        }
    }

    public void A0w(Bundle bundle, View view) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        if (!(bundle == null || (bundle2 = bundle.getBundle("android:preferences")) == null || (preferenceScreen2 = this.A02.A07) == null)) {
            preferenceScreen2.A0E(bundle2);
        }
        if (this.A04 && (preferenceScreen = this.A02.A07) != null) {
            this.A03.setAdapter(new AnonymousClass09H(preferenceScreen));
            preferenceScreen.A08();
        }
        this.A05 = true;
    }

    public Preference B3I(CharSequence charSequence) {
        PreferenceScreen preferenceScreen;
        AnonymousClass0Pz r0 = this.A02;
        if (r0 == null || (preferenceScreen = r0.A07) == null) {
            return null;
        }
        return preferenceScreen.A0U(charSequence);
    }

    public boolean BYf(Preference preference) {
        String str = preference.A0K;
        if (str == null) {
            return false;
        }
        Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        C08270df A012 = AnonymousClass00M.A01(A0R());
        Bundle bundle = preference.A08;
        if (bundle == null) {
            bundle = AnonymousClass002.A08();
            preference.A08 = bundle;
        }
        C05930Vn A0E = A012.A0E();
        A0R().getClassLoader();
        C08310eF A002 = A0E.A00(str);
        A002.A0u(bundle);
        A002.A10(this, 0);
        C08240dc r1 = new C08240dc(A012);
        r1.A0A(A002, ((View) this.A0B.getParent()).getId());
        r1.A0I((String) null);
        r1.A00(false);
        return true;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView;
        int i;
        TypedArray obtainStyledAttributes = A1D().obtainStyledAttributes((AttributeSet) null, AnonymousClass0KB.A07, R.attr.f3nameremoved, 0);
        this.A00 = obtainStyledAttributes.getResourceId(0, this.A00);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(A1D());
        View inflate = cloneInContext.inflate(this.A00, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            if (!A1D().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
                recyclerView = (RecyclerView) AnonymousClass001.A0R(cloneInContext, viewGroup2, R.layout.f8nameremoved);
                A1D();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                recyclerView.setAccessibilityDelegateCompat(new C011609k(recyclerView));
            }
            this.A03 = recyclerView;
            AnonymousClass09Q r2 = this.A06;
            recyclerView.A0o(r2);
            if (drawable != null) {
                i = drawable.getIntrinsicHeight();
            } else {
                i = 0;
            }
            r2.A00 = i;
            r2.A01 = drawable;
            PreferenceFragmentCompat preferenceFragmentCompat = r2.A03;
            preferenceFragmentCompat.A03.A0P();
            if (dimensionPixelSize != -1) {
                r2.A00 = dimensionPixelSize;
                preferenceFragmentCompat.A03.A0P();
            }
            r2.A02 = z;
            if (this.A03.getParent() == null) {
                viewGroup2.addView(this.A03);
            }
            this.A01.post(this.A07);
            return inflate;
        }
        throw AnonymousClass001.A0e("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    public void A0p(Bundle bundle) {
        String str;
        super.A0p(bundle);
        TypedValue typedValue = new TypedValue();
        A0Q().getTheme().resolveAttribute(R.attr.f3nameremoved, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.f12nameremoved;
        }
        A0Q().getTheme().applyStyle(i, false);
        AnonymousClass0Pz r0 = new AnonymousClass0Pz(A1D());
        this.A02 = r0;
        r0.A05 = this;
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            str = bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        } else {
            str = null;
        }
        A1H(str, bundle);
    }
}
