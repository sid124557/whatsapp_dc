package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.0bB  reason: invalid class name and case insensitive filesystem */
public class C07530bB implements C17050uU, C14930qV {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Context A05;
    public Context A06;
    public Drawable A07;
    public LayoutInflater A08;
    public LayoutInflater A09;
    public C07890cz A0A;
    public C16470tS A0B;
    public C15570ra A0C;
    public AnonymousClass04N A0D;
    public AnonymousClass04G A0E;
    public C11760kA A0F;
    public AnonymousClass04R A0G;
    public AnonymousClass04O A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final SparseBooleanArray A0M = new SparseBooleanArray();
    public final AnonymousClass0b5 A0N = new AnonymousClass0b5(this);

    public boolean A01() {
        C15570ra r0;
        C11760kA r2 = this.A0F;
        if (r2 == null || (r0 = this.A0C) == null) {
            AnonymousClass04O r02 = this.A0H;
            if (r02 == null) {
                return false;
            }
            r02.A01();
            return true;
        }
        ((View) r0).removeCallbacks(r2);
        this.A0F = null;
        return true;
    }

    public boolean A02() {
        C07520bA r0;
        AnonymousClass04O r02 = this.A0H;
        if (r02 == null || (r0 = r02.A03) == null || !r0.BIy()) {
            return false;
        }
        return true;
    }

    public boolean A03() {
        C07890cz r1;
        if (!this.A0K || A02() || (r1 = this.A0A) == null || this.A0C == null || this.A0F != null) {
            return false;
        }
        r1.A06();
        if (r1.A08.isEmpty()) {
            return false;
        }
        C11760kA r12 = new C11760kA(new AnonymousClass04O(this.A05, this.A0G, this.A0A, this), this);
        this.A0F = r12;
        ((View) this.A0C).post(r12);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f5, code lost:
        if (r13 != false) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean B3N() {
        /*
            r17 = this;
            r14 = r17
            X.0cz r0 = r14.A0A
            r2 = 0
            r13 = 0
            if (r0 == 0) goto L_0x0049
            java.util.ArrayList r12 = r0.A05()
            int r11 = r12.size()
        L_0x0010:
            int r10 = r14.A02
            int r9 = r14.A00
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r13)
            X.0ra r7 = r14.A0C
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r4 = 0
            r15 = 0
            r6 = 0
            r3 = 0
        L_0x0020:
            if (r4 >= r11) goto L_0x004c
            X.0d1 r5 = X.AnonymousClass001.A0V(r12, r4)
            int r0 = r5.A06
            r1 = 2
            r0 = r0 & 2
            if (r0 != r1) goto L_0x003d
            int r6 = r6 + 1
        L_0x002f:
            boolean r0 = r14.A0I
            if (r0 == 0) goto L_0x003a
            boolean r0 = r5.isActionViewExpanded()
            if (r0 == 0) goto L_0x003a
            r10 = 0
        L_0x003a:
            int r4 = r4 + 1
            goto L_0x0020
        L_0x003d:
            int r0 = r5.A06
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x0047
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0047:
            r15 = 1
            goto L_0x002f
        L_0x0049:
            r12 = r2
            r11 = 0
            goto L_0x0010
        L_0x004c:
            boolean r0 = r14.A0K
            if (r0 == 0) goto L_0x0057
            if (r15 != 0) goto L_0x0055
            int r3 = r3 + r6
            if (r3 <= r10) goto L_0x0057
        L_0x0055:
            int r10 = r10 + -1
        L_0x0057:
            int r10 = r10 - r6
            android.util.SparseBooleanArray r6 = r14.A0M
            r6.clear()
            r5 = 0
            r16 = 0
        L_0x0060:
            if (r5 >= r11) goto L_0x00f8
            X.0d1 r4 = X.AnonymousClass001.A0V(r12, r5)
            int r0 = r4.A06
            r1 = 2
            r0 = r0 & 2
            if (r0 != r1) goto L_0x0092
            android.view.View r0 = r14.A00(r2, r7, r4)
            r0.measure(r8, r8)
            int r0 = r0.getMeasuredWidth()
            int r9 = r9 - r0
            if (r16 != 0) goto L_0x007d
            r16 = r0
        L_0x007d:
            int r1 = r4.getGroupId()
            r0 = 1
            if (r1 == 0) goto L_0x0087
            r6.put(r1, r0)
        L_0x0087:
            int r0 = r4.A02
        L_0x0089:
            r0 = r0 | 32
        L_0x008b:
            r4.A02 = r0
            int r5 = r5 + 1
            r2 = 0
            r13 = 0
            goto L_0x0060
        L_0x0092:
            int r0 = r4.A06
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x00c9
            int r3 = r4.getGroupId()
            boolean r2 = r6.get(r3)
            if (r10 > 0) goto L_0x00a5
            if (r2 == 0) goto L_0x00c9
        L_0x00a5:
            if (r9 <= 0) goto L_0x00d0
            r0 = 0
            android.view.View r0 = r14.A00(r0, r7, r4)
            r0.measure(r8, r8)
            int r0 = r0.getMeasuredWidth()
            int r9 = r9 - r0
            if (r16 != 0) goto L_0x00b8
            r16 = r0
        L_0x00b8:
            int r0 = r9 + r16
            boolean r0 = X.AnonymousClass001.A1W(r0)
            r13 = r0 & 1
            if (r13 == 0) goto L_0x00d0
            if (r3 == 0) goto L_0x00d0
            r6.put(r3, r1)
        L_0x00c7:
            int r10 = r10 + -1
        L_0x00c9:
            int r0 = r4.A02
            if (r13 != 0) goto L_0x0089
            r0 = r0 & -33
            goto L_0x008b
        L_0x00d0:
            if (r2 == 0) goto L_0x00f5
            r2 = 0
            r6.put(r3, r2)
        L_0x00d6:
            if (r2 >= r5) goto L_0x00f5
            X.0d1 r1 = X.AnonymousClass001.A0V(r12, r2)
            int r0 = r1.getGroupId()
            if (r0 != r3) goto L_0x00f2
            int r0 = r1.A02
            r15 = 32
            r0 = r0 & 32
            if (r0 != r15) goto L_0x00ec
            int r10 = r10 + 1
        L_0x00ec:
            int r0 = r1.A02
            r0 = r0 & -33
            r1.A02 = r0
        L_0x00f2:
            int r2 = r2 + 1
            goto L_0x00d6
        L_0x00f5:
            if (r13 == 0) goto L_0x00c9
            goto L_0x00c7
        L_0x00f8:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07530bB.B3N():boolean");
    }

    public void BG6(Context context, C07890cz r8) {
        this.A05 = context;
        this.A08 = LayoutInflater.from(context);
        this.A0A = r8;
        Resources resources = context.getResources();
        if (!this.A0L) {
            this.A0K = true;
        }
        this.A04 = AnonymousClass000.A0B(context).widthPixels / 2;
        this.A02 = C02520Go.A00(context);
        int i = this.A04;
        if (this.A0K) {
            if (this.A0G == null) {
                AnonymousClass04R r2 = new AnonymousClass04R(this.A06, this);
                this.A0G = r2;
                if (this.A0J) {
                    r2.setImageDrawable(this.A07);
                    this.A07 = null;
                    this.A0J = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.A0G.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.A0G.getMeasuredWidth();
        } else {
            this.A0G = null;
        }
        this.A00 = i;
        resources.getDisplayMetrics();
    }

    public void BaE(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof AnonymousClass0ZY) && (i = ((AnonymousClass0ZY) parcelable).A00) > 0 && (findItem = this.A0A.findItem(i)) != null) {
            Bcv((AnonymousClass04J) findItem.getSubMenu());
        }
    }

    public Parcelable Baj() {
        AnonymousClass0ZY r1 = new AnonymousClass0ZY();
        r1.A00 = this.A03;
        return r1;
    }

    public void Brl(boolean z) {
        ArrayList arrayList;
        C15570ra r1;
        int size;
        C07910d1 r0;
        ViewGroup viewGroup = (ViewGroup) this.A0C;
        if (viewGroup != null) {
            C07890cz r02 = this.A0A;
            int i = 0;
            if (r02 != null) {
                r02.A06();
                ArrayList A052 = this.A0A.A05();
                int size2 = A052.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    C07910d1 A0V = AnonymousClass001.A0V(A052, i3);
                    if ((A0V.A02 & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof C16480tT) {
                            r0 = ((C16480tT) childAt).getItemData();
                        } else {
                            r0 = null;
                        }
                        View A002 = A00(childAt, viewGroup, A0V);
                        if (A0V != r0) {
                            A002.setPressed(false);
                            A002.jumpDrawablesToCurrentState();
                        }
                        if (A002 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) A002.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(A002);
                            }
                            ((ViewGroup) this.A0C).addView(A002, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.A0G) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.A0C).requestLayout();
        C07890cz r03 = this.A0A;
        if (r03 != null) {
            r03.A06();
            ArrayList arrayList2 = r03.A06;
            int size3 = arrayList2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                AnonymousClass0L5 r04 = AnonymousClass001.A0V(arrayList2, i4).A0G;
                if (r04 != null) {
                    r04.A00 = this;
                }
            }
        }
        C07890cz r05 = this.A0A;
        if (r05 != null) {
            r05.A06();
            arrayList = r05.A08;
        } else {
            arrayList = null;
        }
        if (!this.A0K || arrayList == null || ((size = arrayList.size()) != 1 ? size <= 0 : !(!AnonymousClass001.A0V(arrayList, 0).isActionViewExpanded()))) {
            AnonymousClass04R r06 = this.A0G;
            if (r06 != null && r06.getParent() == (r1 = this.A0C)) {
                ((ViewGroup) r1).removeView(this.A0G);
            }
        } else {
            AnonymousClass04R r12 = this.A0G;
            if (r12 == null) {
                r12 = new AnonymousClass04R(this.A06, this);
                this.A0G = r12;
            }
            ViewGroup viewGroup3 = (ViewGroup) r12.getParent();
            if (viewGroup3 != this.A0C) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.A0G);
                }
                AnonymousClass04R r2 = this.A0G;
                AnonymousClass03V r13 = new AnonymousClass03V();
                r13.gravity = 16;
                r13.A04 = true;
                ((ViewGroup) this.A0C).addView(r2, r13);
            }
        }
        ((ActionMenuView) this.A0C).A0B = this.A0K;
    }

    public int getId() {
        return this.A01;
    }

    public C07530bB(Context context) {
        this.A06 = context;
        this.A09 = LayoutInflater.from(context);
    }

    public View A00(View view, ViewGroup viewGroup, C07910d1 r6) {
        View actionView = r6.getActionView();
        if (actionView == null || r6.A01()) {
            if (!(view instanceof C16480tT)) {
                view = AnonymousClass001.A0R(this.A09, viewGroup, R.layout.f8nameremoved);
            }
            C16480tT r4 = (C16480tT) view;
            r4.BGB(r6, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) r4;
            actionMenuItemView.A05 = (ActionMenuView) this.A0C;
            AnonymousClass04G r0 = this.A0E;
            if (r0 == null) {
                r0 = new AnonymousClass04G(this);
                this.A0E = r0;
            }
            actionMenuItemView.A04 = r0;
            actionView = (View) r4;
        }
        int i = 0;
        if (r6.isActionViewExpanded()) {
            i = 8;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof AnonymousClass03V)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public boolean Az7(C07890cz r2, C07910d1 r3) {
        return false;
    }

    public boolean B2v(C07890cz r2, C07910d1 r3) {
        return false;
    }

    public void BPH(C07890cz r2, boolean z) {
        A01();
        AnonymousClass04N r0 = this.A0D;
        if (r0 != null) {
            r0.A01();
        }
        C16470tS r02 = this.A0B;
        if (r02 != null) {
            r02.BPH(r2, z);
        }
    }

    public boolean Bcv(AnonymousClass04J r8) {
        boolean z = false;
        if (r8.hasVisibleItems()) {
            AnonymousClass04J r0 = r8;
            while (r0.A00 != this.A0A) {
                r0 = (AnonymousClass04J) r0.A00;
            }
            MenuItem item = r0.getItem();
            ViewGroup viewGroup = (ViewGroup) this.A0C;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if (!(childAt instanceof C16480tT) || ((C16480tT) childAt).getItemData() != item) {
                        i++;
                    } else if (childAt != null) {
                        this.A03 = r8.getItem().getItemId();
                        int size = r8.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                break;
                            }
                            MenuItem item2 = r8.getItem(i2);
                            if (item2.isVisible() && item2.getIcon() != null) {
                                z = true;
                                break;
                            }
                            i2++;
                        }
                        AnonymousClass04N r1 = new AnonymousClass04N(this.A05, childAt, r8, this);
                        this.A0D = r1;
                        r1.A05 = z;
                        C07520bA r02 = r1.A03;
                        if (r02 != null) {
                            r02.A07(z);
                        }
                        if (r1.A03()) {
                            C16470tS r03 = this.A0B;
                            if (r03 != null) {
                                r03.BXO(r8);
                            }
                            return true;
                        }
                        throw AnonymousClass001.A0e("MenuPopupHelper cannot be used without an anchor");
                    }
                }
            }
        }
        return false;
    }

    public void Bls(C16470tS r1) {
        this.A0B = r1;
    }
}
