package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.03y  reason: invalid class name */
public class AnonymousClass03y extends AnonymousClass0R8 {
    public Window.Callback A00;
    public C17020uQ A01;
    public ArrayList A02 = AnonymousClass001.A0s();
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final C15610re A06;
    public final Runnable A07 = new C10680iL(this);

    public void A0F(Drawable drawable) {
        C07580bG r0 = (C07580bG) this.A01;
        r0.A04 = null;
        r0.A00();
    }

    public void A0G(View view) {
        A0H(view, new C001902e(-2, -2));
    }

    public void A0N(boolean z) {
        int i = 0;
        if (z) {
            i = 4;
        }
        A0Z(i, 4);
    }

    public void A0P(boolean z) {
        int i = 0;
        if (z) {
            i = 2;
        }
        A0Z(i, 2);
    }

    public float A00() {
        return AnonymousClass0YZ.A00(((C07580bG) this.A01).A09);
    }

    public int A01() {
        return ((C07580bG) this.A01).A01;
    }

    public Context A02() {
        return ((C07580bG) this.A01).A09.getContext();
    }

    public View A03() {
        return ((C07580bG) this.A01).A06;
    }

    public void A05() {
        ((C07580bG) this.A01).A09.removeCallbacks(this.A07);
    }

    public void A06() {
        ((C07580bG) this.A01).A09.setVisibility(8);
    }

    public void A07() {
        ((C07580bG) this.A01).A09.setVisibility(0);
    }

    public void A08(float f) {
        AnonymousClass0YZ.A0B(((C07580bG) this.A01).A09, f);
    }

    public void A09(int i) {
        C07580bG r2 = (C07580bG) this.A01;
        r2.Bmf(AnonymousClass0XW.A01(r2.A09.getContext(), R.drawable.ic_pip_close));
    }

    public void A0A(int i) {
        C17020uQ r1 = this.A01;
        r1.BnV(((C07580bG) r1).A09.getContext().getText(i));
    }

    public void A0B(int i) {
        CharSequence charSequence;
        C17020uQ r1 = this.A01;
        if (i != 0) {
            charSequence = ((C07580bG) r1).A09.getContext().getText(i);
        } else {
            charSequence = null;
        }
        r1.BnZ(charSequence);
    }

    public void A0D(Drawable drawable) {
        AnonymousClass0YY.A04(drawable, ((C07580bG) this.A01).A09);
    }

    public void A0E(Drawable drawable) {
        this.A01.Bmf(drawable);
    }

    public void A0H(View view, C001902e r3) {
        if (view != null) {
            view.setLayoutParams(r3);
        }
        this.A01.Bm8(view);
    }

    public void A0I(CharSequence charSequence) {
        this.A01.BnV(charSequence);
    }

    public void A0J(CharSequence charSequence) {
        this.A01.BnZ(charSequence);
    }

    public void A0K(CharSequence charSequence) {
        this.A01.setWindowTitle(charSequence);
    }

    public void A0L(boolean z) {
        if (z != this.A03) {
            this.A03 = z;
            ArrayList arrayList = this.A02;
            if (0 < arrayList.size()) {
                arrayList.get(0);
                throw AnonymousClass001.A0g("onMenuVisibilityChanged");
            }
        }
    }

    public void A0O(boolean z) {
        A0Z(16, 16);
    }

    public void A0Q(boolean z) {
        int i = 0;
        if (z) {
            i = 8;
        }
        A0Z(i, 8);
    }

    public boolean A0S() {
        C07530bB r0;
        ActionMenuView actionMenuView = ((C07580bG) this.A01).A09.A0O;
        if (actionMenuView == null || (r0 = actionMenuView.A08) == null || !r0.A01()) {
            return false;
        }
        return true;
    }

    public boolean A0T() {
        Toolbar toolbar = ((C07580bG) this.A01).A09;
        Runnable runnable = this.A07;
        toolbar.removeCallbacks(runnable);
        AnonymousClass0YY.A07(toolbar, runnable);
        return true;
    }

    public boolean A0U() {
        C07530bB r0;
        ActionMenuView actionMenuView = ((C07580bG) this.A01).A09.A0O;
        if (actionMenuView == null || (r0 = actionMenuView.A08) == null || !r0.A03()) {
            return false;
        }
        return true;
    }

    public boolean A0V() {
        C07910d1 r0;
        AnonymousClass0b8 r02 = ((C07580bG) this.A01).A09.A0Q;
        if (r02 == null || (r0 = r02.A01) == null) {
            return false;
        }
        r0.collapseActionView();
        return true;
    }

    public final Menu A0Y() {
        if (!this.A04) {
            C17020uQ r0 = this.A01;
            ((C07580bG) r0).A09.setMenuCallbacks(new AnonymousClass0b6(this), new C07500az(this));
            this.A04 = true;
        }
        return ((C07580bG) this.A01).A09.getMenu();
    }

    public void A0Z(int i, int i2) {
        C17020uQ r2 = this.A01;
        r2.BmB((i & i2) | ((~i2) & ((C07580bG) r2).A01));
    }

    public AnonymousClass03y(Window.Callback callback, Toolbar toolbar, CharSequence charSequence) {
        C07650bN r2 = new C07650bN(this);
        this.A06 = r2;
        C07580bG r1 = new C07580bG(toolbar, false);
        this.A01 = r1;
        AnonymousClass04E r0 = new AnonymousClass04E(callback, this);
        this.A00 = r0;
        r1.A07 = r0;
        toolbar.A0R = r2;
        r1.setWindowTitle(charSequence);
    }

    public boolean A0W(int i, KeyEvent keyEvent) {
        Menu A0Y = A0Y();
        if (A0Y == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() == 1) {
            z = false;
        }
        A0Y.setQwertyMode(z);
        return A0Y.performShortcut(i, keyEvent, 0);
    }

    public boolean A0X(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            A0U();
        }
        return true;
    }

    public void A0M(boolean z) {
    }

    public void A0R(boolean z) {
    }
}
