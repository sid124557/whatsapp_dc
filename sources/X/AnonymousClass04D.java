package X;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: X.04D  reason: invalid class name */
public class AnonymousClass04D extends AnonymousClass0R2 implements C16460tR {
    public Context A00;
    public C16910uE A01;
    public C07890cz A02;
    public ActionBarContextView A03;
    public WeakReference A04;
    public boolean A05;

    public Menu A00() {
        return this.A02;
    }

    public MenuInflater A01() {
        return new AnonymousClass02O(this.A03.getContext());
    }

    public View A02() {
        WeakReference weakReference = this.A04;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public CharSequence A03() {
        return this.A03.A0D;
    }

    public CharSequence A04() {
        return this.A03.A0E;
    }

    public void A05() {
        if (!this.A05) {
            this.A05 = true;
            this.A03.sendAccessibilityEvent(32);
            this.A01.BQw(this);
        }
    }

    public void A06() {
        this.A01.BYg(this.A02, this);
    }

    public void A07(int i) {
        A0A(this.A00.getString(i));
    }

    public void A08(int i) {
        A0B(this.A00.getString(i));
    }

    public void A09(View view) {
        WeakReference weakReference;
        this.A03.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.A04 = weakReference;
    }

    public void A0A(CharSequence charSequence) {
        this.A03.setSubtitle(charSequence);
    }

    public void A0B(CharSequence charSequence) {
        this.A03.setTitle(charSequence);
    }

    public void A0C(boolean z) {
        this.A01 = z;
        this.A03.setTitleOptional(z);
    }

    public boolean A0D() {
        return this.A03.A0H;
    }

    public boolean BWQ(MenuItem menuItem, C07890cz r3) {
        return this.A01.BLz(menuItem, this);
    }

    public AnonymousClass04D(Context context, C16910uE r4, ActionBarContextView actionBarContextView) {
        this.A00 = context;
        this.A03 = actionBarContextView;
        this.A01 = r4;
        C07890cz r1 = new C07890cz(actionBarContextView.getContext());
        r1.A00 = 1;
        this.A02 = r1;
        r1.A0D(this);
    }

    public void BWR(C07890cz r2) {
        A06();
        C07530bB r0 = this.A03.A0A;
        if (r0 != null) {
            r0.A03();
        }
    }
}
