package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.04M  reason: invalid class name */
public final class AnonymousClass04M extends C07520bA implements C17050uU, PopupWindow.OnDismissListener, View.OnKeyListener, AdapterView.OnItemClickListener {
    public int A00;
    public int A01 = 0;
    public View A02;
    public View A03;
    public ViewTreeObserver A04;
    public PopupWindow.OnDismissListener A05;
    public C16470tS A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final Context A0D;
    public final View.OnAttachStateChangeListener A0E = new C17800wG(this, 1);
    public final ViewTreeObserver.OnGlobalLayoutListener A0F = new C18180ws(this, 1);
    public final AnonymousClass033 A0G;
    public final C07890cz A0H;
    public final C003804f A0I;
    public final boolean A0J;

    public boolean Bcv(AnonymousClass04J r14) {
        AnonymousClass04J r9 = r14;
        if (r14.hasVisibleItems()) {
            AnonymousClass0QK r6 = new AnonymousClass0QK(this.A0D, this.A03, r9, this.A0B, this.A0C, this.A0J);
            C16470tS r1 = this.A06;
            r6.A04 = r1;
            C07520bA r0 = r6.A03;
            if (r0 != null) {
                r0.Bls(r1);
            }
            int size = r14.size();
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                MenuItem item = r14.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            r6.A05 = z;
            C07520bA r02 = r6.A03;
            if (r02 != null) {
                r02.A07(z);
            }
            r6.A02 = this.A05;
            this.A05 = null;
            this.A0H.A0G(false);
            C003804f r03 = this.A0I;
            int i2 = r03.A01;
            int BEF = r03.BEF();
            if ((Gravity.getAbsoluteGravity(this.A01, AnonymousClass0YH.A01(this.A02)) & 7) == 5) {
                i2 += this.A02.getWidth();
            }
            C07520bA r04 = r6.A03;
            if (r04 == null || !r04.BIy()) {
                if (r6.A01 != null) {
                    C07520bA A002 = r6.A00();
                    A002.A08(true);
                    if ((Gravity.getAbsoluteGravity(r6.A00, AnonymousClass0YH.A01(r6.A01)) & 7) == 5) {
                        i2 -= r6.A01.getWidth();
                    }
                    A002.A02(i2);
                    A002.A03(BEF);
                    int i3 = (int) ((AnonymousClass000.A0B(r6.A08).density * 48.0f) / 2.0f);
                    A002.A00 = new Rect(i2 - i3, BEF - i3, i2 + i3, BEF + i3);
                    A002.Bod();
                }
            }
            C16470tS r05 = this.A06;
            if (r05 == null) {
                return true;
            }
            r05.BXO(r14);
            return true;
        }
        return false;
    }

    public void Brl(boolean z) {
        this.A07 = false;
        AnonymousClass033 r0 = this.A0G;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
    }

    public void onDismiss() {
        this.A09 = true;
        this.A0H.close();
        ViewTreeObserver viewTreeObserver = this.A04;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.A04 = this.A03.getViewTreeObserver();
            }
            this.A04.removeGlobalOnLayoutListener(this.A0F);
            this.A04 = null;
        }
        this.A03.removeOnAttachStateChangeListener(this.A0E);
        PopupWindow.OnDismissListener onDismissListener = this.A05;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void A02(int i) {
        this.A0I.A01 = i;
    }

    public void A03(int i) {
        this.A0I.Bnk(i);
    }

    public void A07(boolean z) {
        this.A0G.A02 = z;
    }

    public boolean B3N() {
        return false;
    }

    public boolean BIy() {
        if (this.A09 || !this.A0I.A0B.isShowing()) {
            return false;
        }
        return true;
    }

    public void BPH(C07890cz r2, boolean z) {
        if (r2 == this.A0H) {
            dismiss();
            C16470tS r0 = this.A06;
            if (r0 != null) {
                r0.BPH(r2, z);
            }
        }
    }

    public Parcelable Baj() {
        return null;
    }

    public ListView getListView() {
        return this.A0I.A0C;
    }

    public AnonymousClass04M(Context context, View view, C07890cz r6, int i, int i2, boolean z) {
        this.A0D = context;
        this.A0H = r6;
        this.A0J = z;
        this.A0G = new AnonymousClass033(LayoutInflater.from(context), r6, R.layout.f8nameremoved, z);
        this.A0B = i;
        this.A0C = i2;
        Resources resources = context.getResources();
        this.A0A = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.f6nameremoved));
        this.A02 = view;
        this.A0I = new C003804f(context, i, i2);
        r6.A09(context, this);
    }

    public void Bod() {
        View view;
        Rect rect;
        if (BIy()) {
            return;
        }
        if (this.A09 || (view = this.A02) == null) {
            throw AnonymousClass001.A0e("StandardMenuPopup cannot be used without an anchor");
        }
        this.A03 = view;
        C003804f r6 = this.A0I;
        PopupWindow popupWindow = r6.A0B;
        popupWindow.setOnDismissListener(this);
        r6.A08 = this;
        r6.A0G = true;
        popupWindow.setFocusable(true);
        View view2 = this.A03;
        boolean A1X = AnonymousClass000.A1X(this.A04);
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.A04 = viewTreeObserver;
        if (A1X) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A0F);
        }
        view2.addOnAttachStateChangeListener(this.A0E);
        r6.A07 = view2;
        r6.A00 = this.A01;
        if (!this.A07) {
            this.A00 = C07520bA.A00(this.A0D, this.A0G, this.A0A);
            this.A07 = true;
        }
        r6.A02(this.A00);
        popupWindow.setInputMethodMode(2);
        Rect rect2 = this.A00;
        if (rect2 != null) {
            rect = new Rect(rect2);
        } else {
            rect = null;
        }
        r6.A06 = rect;
        r6.Bod();
        C002803e r4 = r6.A0C;
        r4.setOnKeyListener(this);
        if (this.A08) {
            C07890cz r3 = this.A0H;
            if (r3.A05 != null) {
                View inflate = LayoutInflater.from(this.A0D).inflate(R.layout.f8nameremoved, r4, false);
                TextView A092 = AnonymousClass002.A09(inflate, 16908310);
                if (A092 != null) {
                    A092.setText(r3.A05);
                }
                inflate.setEnabled(false);
                r4.addHeaderView(inflate, (Object) null, false);
            }
        }
        r6.Ble(this.A0G);
        r6.Bod();
    }

    public void dismiss() {
        if (BIy()) {
            this.A0I.dismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void A01(int i) {
        this.A01 = i;
    }

    public void A04(View view) {
        this.A02 = view;
    }

    public void A05(PopupWindow.OnDismissListener onDismissListener) {
        this.A05 = onDismissListener;
    }

    public void A06(C07890cz r1) {
    }

    public void A08(boolean z) {
        this.A08 = z;
    }

    public void BaE(Parcelable parcelable) {
    }

    public void Bls(C16470tS r1) {
        this.A06 = r1;
    }
}
