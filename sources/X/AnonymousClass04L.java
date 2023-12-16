package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.04L  reason: invalid class name */
public final class AnonymousClass04L extends C07520bA implements C17050uU, PopupWindow.OnDismissListener, View.OnKeyListener {
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public int A03;
    public int A04;
    public View A05;
    public View A06;
    public ViewTreeObserver A07;
    public PopupWindow.OnDismissListener A08;
    public C16470tS A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final Context A0I;
    public final Handler A0J;
    public final View.OnAttachStateChangeListener A0K = new C17800wG(this, 0);
    public final ViewTreeObserver.OnGlobalLayoutListener A0L = new C18180ws(this, 0);
    public final C16500tV A0M = new C07590bH(this);
    public final List A0N = AnonymousClass001.A0s();
    public final List A0O = AnonymousClass001.A0s();
    public final boolean A0P;

    public void A02(int i) {
        this.A0B = true;
        this.A03 = i;
    }

    public void A03(int i) {
        this.A0C = true;
        this.A04 = i;
    }

    public void A01(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            this.A00 = Gravity.getAbsoluteGravity(i, AnonymousClass0YH.A01(this.A05));
        }
    }

    public void A04(View view) {
        if (this.A05 != view) {
            this.A05 = view;
            this.A00 = Gravity.getAbsoluteGravity(this.A02, AnonymousClass0YH.A01(view));
        }
    }

    public void A06(C07890cz r2) {
        r2.A09(this.A0I, this);
        if (BIy()) {
            A0A(r2);
        } else {
            this.A0N.add(r2);
        }
    }

    public boolean A09() {
        return false;
    }

    public final void A0A(C07890cz r18) {
        C03670Lc r2;
        View view;
        Rect rect;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        AnonymousClass033 r14;
        int i5;
        int firstVisiblePosition;
        Context context = this.A0I;
        LayoutInflater from = LayoutInflater.from(context);
        C07890cz r7 = r18;
        AnonymousClass033 r10 = new AnonymousClass033(from, r7, R.layout.f8nameremoved, this.A0P);
        if (!BIy() && this.A0A) {
            r10.A02 = true;
        } else if (BIy()) {
            int size = r7.size();
            boolean z2 = false;
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    break;
                }
                MenuItem item = r7.getItem(i6);
                if (item.isVisible() && item.getIcon() != null) {
                    z2 = true;
                    break;
                }
                i6++;
            }
            r10.A02 = z2;
        }
        int A002 = C07520bA.A00(context, r10, this.A0F);
        C003804f r4 = new C003804f(context, this.A0G, this.A0H);
        r4.A00 = this.A0M;
        r4.A08 = this;
        PopupWindow popupWindow = r4.A0B;
        popupWindow.setOnDismissListener(this);
        r4.A07 = this.A05;
        r4.A00 = this.A00;
        r4.A0G = true;
        popupWindow.setFocusable(true);
        popupWindow.setInputMethodMode(2);
        r4.Ble(r10);
        r4.A02(A002);
        r4.A00 = this.A00;
        List list = this.A0O;
        if (list.size() > 0) {
            r2 = (C03670Lc) list.get(AnonymousClass002.A04(list, 1));
            C07890cz r12 = r2.A01;
            int size2 = r12.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size2) {
                    break;
                }
                MenuItem item2 = r12.getItem(i7);
                if (!item2.hasSubMenu() || r7 != item2.getSubMenu()) {
                    i7++;
                } else {
                    C002803e r13 = r2.A02.A0C;
                    ListAdapter adapter = r13.getAdapter();
                    int i8 = 0;
                    if (adapter instanceof HeaderViewListAdapter) {
                        HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                        i5 = headerViewListAdapter.getHeadersCount();
                        r14 = (AnonymousClass033) headerViewListAdapter.getWrappedAdapter();
                    } else {
                        r14 = (AnonymousClass033) adapter;
                        i5 = 0;
                    }
                    int count = r14.getCount();
                    while (true) {
                        if (i8 >= count) {
                            break;
                        } else if (item2 != r14.getItem(i8)) {
                            i8++;
                        } else if (i8 != -1 && (firstVisiblePosition = (i8 + i5) - r13.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < r13.getChildCount()) {
                            view = r13.getChildAt(firstVisiblePosition);
                        }
                    }
                }
            }
            view = null;
        } else {
            r2 = null;
            view = null;
        }
        if (view != null) {
            r4.A05();
            r4.A03();
            C002803e r142 = ((C03670Lc) list.get(AnonymousClass002.A04(list, 1))).A02.A0C;
            int[] iArr = new int[2];
            r142.getLocationOnScreen(iArr);
            Rect A0N2 = AnonymousClass001.A0N();
            this.A06.getWindowVisibleDisplayFrame(A0N2);
            if (this.A01 != 1 ? iArr[0] - A002 >= 0 : iArr[0] + r142.getWidth() + A002 > A0N2.right) {
                i = 0;
                z = false;
            } else {
                i = 1;
                z = true;
            }
            this.A01 = i;
            if (Build.VERSION.SDK_INT >= 26) {
                r4.A07 = view;
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.A05.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                if ((this.A00 & 7) == 5) {
                    iArr2[0] = iArr2[0] + this.A05.getWidth();
                    iArr3[0] = iArr3[0] + view.getWidth();
                }
                i2 = iArr3[0] - iArr2[0];
                i3 = iArr3[1] - iArr2[1];
            }
            if ((this.A00 & 5) == 5) {
                if (!z) {
                    A002 = view.getWidth();
                }
                i4 = i2 + A002;
                r4.A01 = i4;
                r4.A0I = true;
                r4.A0H = true;
                r4.Bnk(i3);
            } else if (z) {
                A002 = view.getWidth();
                i4 = i2 + A002;
                r4.A01 = i4;
                r4.A0I = true;
                r4.A0H = true;
                r4.Bnk(i3);
            }
            i4 = i2 - A002;
            r4.A01 = i4;
            r4.A0I = true;
            r4.A0H = true;
            r4.Bnk(i3);
        } else {
            if (this.A0B) {
                r4.A01 = this.A03;
            }
            if (this.A0C) {
                r4.Bnk(this.A04);
            }
            Rect rect2 = this.A00;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            r4.A06 = rect;
        }
        list.add(new C03670Lc(r7, r4, this.A01));
        r4.Bod();
        C002803e r3 = r4.A0C;
        r3.setOnKeyListener(this);
        if (r2 == null && this.A0E && r7.A05 != null) {
            View inflate = from.inflate(R.layout.f8nameremoved, r3, false);
            TextView A092 = AnonymousClass002.A09(inflate, 16908310);
            inflate.setEnabled(false);
            A092.setText(r7.A05);
            r3.addHeaderView(inflate, (Object) null, false);
            r4.Bod();
        }
    }

    public boolean B3N() {
        return false;
    }

    public boolean BIy() {
        List list = this.A0O;
        if (list.size() <= 0 || !((C03670Lc) list.get(0)).A02.A0B.isShowing()) {
            return false;
        }
        return true;
    }

    public void BPH(C07890cz r7, boolean z) {
        List list = this.A0O;
        int size = list.size();
        int i = 0;
        while (i < size) {
            if (r7 != ((C03670Lc) list.get(i)).A01) {
                i++;
            } else if (i >= 0) {
                int i2 = i + 1;
                if (i2 < list.size()) {
                    ((C03670Lc) list.get(i2)).A01.A0G(false);
                }
                C03670Lc r1 = (C03670Lc) list.remove(i);
                r1.A01.A0E(this);
                if (this.A0D) {
                    C003804f r0 = r1.A02;
                    r0.A04();
                    r0.A0B.setAnimationStyle(0);
                }
                r1.A02.dismiss();
                int size2 = list.size();
                if (size2 > 0) {
                    this.A01 = ((C03670Lc) list.get(size2 - 1)).A00;
                } else {
                    int i3 = 1;
                    if (AnonymousClass0YH.A01(this.A05) == 1) {
                        i3 = 0;
                    }
                    this.A01 = i3;
                    if (size2 == 0) {
                        dismiss();
                        C16470tS r12 = this.A09;
                        if (r12 != null) {
                            r12.BPH(r7, true);
                        }
                        ViewTreeObserver viewTreeObserver = this.A07;
                        if (viewTreeObserver != null) {
                            if (viewTreeObserver.isAlive()) {
                                this.A07.removeGlobalOnLayoutListener(this.A0L);
                            }
                            this.A07 = null;
                        }
                        this.A06.removeOnAttachStateChangeListener(this.A0K);
                        this.A08.onDismiss();
                        return;
                    }
                }
                if (z) {
                    ((C03670Lc) list.get(0)).A01.A0G(false);
                    return;
                }
                return;
            } else {
                return;
            }
        }
    }

    public Parcelable Baj() {
        return null;
    }

    public boolean Bcv(AnonymousClass04J r5) {
        Iterator it = this.A0O.iterator();
        while (true) {
            if (it.hasNext()) {
                C03670Lc r1 = (C03670Lc) it.next();
                if (r5 == r1.A01) {
                    r1.A02.A0C.requestFocus();
                    break;
                }
            } else if (!r5.hasVisibleItems()) {
                return false;
            } else {
                A06(r5);
                C16470tS r0 = this.A09;
                if (r0 != null) {
                    r0.BXO(r5);
                    return true;
                }
            }
        }
        return true;
    }

    public void Brl(boolean z) {
        for (C03670Lc r0 : this.A0O) {
            ListAdapter adapter = r0.A02.A0C.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((AnonymousClass033) adapter).notifyDataSetChanged();
        }
    }

    public void dismiss() {
        List list = this.A0O;
        int size = list.size();
        if (size > 0) {
            C03670Lc[] r2 = (C03670Lc[]) list.toArray(new C03670Lc[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    C03670Lc r1 = r2[size];
                    if (r1.A02.A0B.isShowing()) {
                        r1.A02.dismiss();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public ListView getListView() {
        List list = this.A0O;
        if (list.isEmpty()) {
            return null;
        }
        return ((C03670Lc) list.get(AnonymousClass002.A03(list))).A02.A0C;
    }

    public void onDismiss() {
        List list = this.A0O;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C03670Lc r1 = (C03670Lc) list.get(i);
            if (!r1.A02.A0B.isShowing()) {
                r1.A01.A0G(false);
                return;
            }
        }
    }

    public AnonymousClass04L(Context context, View view, int i, int i2, boolean z) {
        this.A0I = context;
        this.A05 = view;
        this.A0G = i;
        this.A0H = i2;
        this.A0P = z;
        this.A0A = false;
        this.A01 = AnonymousClass0YH.A01(view) == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.A0F = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.f6nameremoved));
        this.A0J = new Handler();
    }

    public void Bod() {
        if (!BIy()) {
            List<C07890cz> list = this.A0N;
            for (C07890cz A0A2 : list) {
                A0A(A0A2);
            }
            list.clear();
            View view = this.A05;
            this.A06 = view;
            if (view != null) {
                boolean A1X = AnonymousClass000.A1X(this.A07);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.A07 = viewTreeObserver;
                if (A1X) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.A0L);
                }
                this.A06.addOnAttachStateChangeListener(this.A0K);
            }
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void A05(PopupWindow.OnDismissListener onDismissListener) {
        this.A08 = onDismissListener;
    }

    public void A07(boolean z) {
        this.A0A = z;
    }

    public void A08(boolean z) {
        this.A0E = z;
    }

    public void BaE(Parcelable parcelable) {
    }

    public void Bls(C16470tS r1) {
        this.A09 = r1;
    }
}
