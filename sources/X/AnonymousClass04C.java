package X;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: X.04C  reason: invalid class name */
public class AnonymousClass04C extends AnonymousClass0R2 implements C16460tR {
    public C16910uE A00;
    public WeakReference A01;
    public final Context A02;
    public final C07890cz A03;
    public final /* synthetic */ AnonymousClass03z A04;

    public AnonymousClass04C(Context context, AnonymousClass03z r4, C16910uE r5) {
        this.A04 = r4;
        this.A02 = context;
        this.A00 = r5;
        C07890cz r1 = new C07890cz(context);
        r1.A00 = 1;
        this.A03 = r1;
        r1.A0D(this);
    }

    public Menu A00() {
        return this.A03;
    }

    public MenuInflater A01() {
        return new AnonymousClass02O(this.A02);
    }

    public View A02() {
        WeakReference weakReference = this.A01;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public CharSequence A03() {
        return this.A04.A0A.A0D;
    }

    public CharSequence A04() {
        return this.A04.A0A.A0E;
    }

    public void A05() {
        AnonymousClass03z r3 = this.A04;
        if (r3.A05 == this) {
            boolean z = r3.A0H;
            boolean z2 = r3.A0I;
            if (z || z2) {
                r3.A07 = this;
                r3.A06 = this.A00;
            } else {
                this.A00.BQw(this);
            }
            this.A00 = null;
            r3.A0a(false);
            ActionBarContextView actionBarContextView = r3.A0A;
            if (actionBarContextView.A04 == null) {
                actionBarContextView.A03();
            }
            ((C07580bG) r3.A0C).A09.sendAccessibilityEvent(32);
            r3.A0B.setHideOnContentScrollEnabled(r3.A0J);
            r3.A05 = null;
        }
    }

    public void A06() {
        if (this.A04.A05 == this) {
            C07890cz r1 = this.A03;
            r1.A08();
            try {
                this.A00.BYg(r1, this);
            } finally {
                r1.A07();
            }
        }
    }

    public void A07(int i) {
        A0A(this.A04.A02.getResources().getString(i));
    }

    public void A08(int i) {
        A0B(this.A04.A02.getResources().getString(i));
    }

    public void A09(View view) {
        this.A04.A0A.setCustomView(view);
        this.A01 = new WeakReference(view);
    }

    public void A0A(CharSequence charSequence) {
        this.A04.A0A.setSubtitle(charSequence);
    }

    public void A0B(CharSequence charSequence) {
        this.A04.A0A.setTitle(charSequence);
    }

    public void A0C(boolean z) {
        this.A01 = z;
        this.A04.A0A.setTitleOptional(z);
    }

    public boolean A0D() {
        return this.A04.A0A.A0H;
    }

    public boolean BWQ(MenuItem menuItem, C07890cz r3) {
        C16910uE r0 = this.A00;
        if (r0 != null) {
            return r0.BLz(menuItem, this);
        }
        return false;
    }

    public void BWR(C07890cz r2) {
        if (this.A00 != null) {
            A06();
            C07530bB r0 = this.A04.A0A.A0A;
            if (r0 != null) {
                r0.A03();
            }
        }
    }
}
