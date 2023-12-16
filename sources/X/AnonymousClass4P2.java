package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.4P2  reason: invalid class name */
public abstract class AnonymousClass4P2 extends FrameLayout {
    public MenuInflater A00;
    public C178868iE A01;
    public C178878iF A02;
    public final AnonymousClass4SJ A03;
    public final C87084Ny A04;
    public final C110375g8 A05;

    public abstract int getMaxItemCount();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4P2(android.content.Context r18, android.util.AttributeSet r19, int r20, int r21) {
        /*
            r17 = this;
            r0 = r18
            r12 = r19
            r15 = r20
            r3 = r21
            android.content.Context r0 = X.C105515Vh.A00(r0, r12, r15, r3)
            r6 = r17
            r6.<init>(r0, r12, r15)
            X.5g8 r7 = new X.5g8
            r7.<init>()
            r6.A05 = r7
            android.content.Context r11 = r6.getContext()
            int[] r13 = X.C1463179t.A0U
            int[] r14 = X.C86664Kz.A1Z()
            r4 = 10
            r5 = 0
            r14[r5] = r4
            r1 = 9
            r2 = 1
            r14[r2] = r1
            r16 = r3
            X.0UD r3 = X.C161837qd.A01(r11, r12, r13, r14, r15, r16)
            java.lang.Class r9 = r6.getClass()
            int r0 = r6.getMaxItemCount()
            X.4SJ r8 = new X.4SJ
            r8.<init>(r11, r9, r0)
            r6.A03 = r8
            boolean r0 = r6 instanceof com.google.android.material.navigationrail.NavigationRailView
            if (r0 == 0) goto L_0x01b0
            X.6Z7 r9 = new X.6Z7
            r9.<init>(r11)
        L_0x004a:
            r6.A04 = r9
            r7.A02 = r9
            r7.A00 = r2
            r9.A0I = r7
            android.content.Context r0 = r8.A0N
            r8.A09(r0, r7)
            android.content.Context r0 = r6.getContext()
            r7.BG6(r0, r8)
            r10 = 5
            android.content.res.TypedArray r7 = r3.A02
            boolean r0 = r7.hasValue(r10)
            if (r0 == 0) goto L_0x01aa
            android.content.res.ColorStateList r0 = r3.A01(r10)
        L_0x006b:
            r9.setIconTintList(r0)
            android.content.res.Resources r10 = r6.getResources()
            r0 = 2131167473(0x7f0708f1, float:1.794922E38)
            int r10 = r10.getDimensionPixelSize(r0)
            r0 = 4
            int r0 = r7.getDimensionPixelSize(r0, r10)
            r6.setItemIconSize(r0)
            boolean r0 = r7.hasValue(r4)
            if (r0 == 0) goto L_0x008e
            int r0 = r7.getResourceId(r4, r5)
            r6.setItemTextAppearanceInactive(r0)
        L_0x008e:
            boolean r0 = r7.hasValue(r1)
            if (r0 == 0) goto L_0x009b
            int r0 = r7.getResourceId(r1, r5)
            r6.setItemTextAppearanceActive(r0)
        L_0x009b:
            r1 = 11
            boolean r0 = r7.hasValue(r1)
            if (r0 == 0) goto L_0x00aa
            android.content.res.ColorStateList r0 = r3.A01(r1)
            r6.setItemTextColor(r0)
        L_0x00aa:
            android.graphics.drawable.Drawable r0 = r6.getBackground()
            if (r0 == 0) goto L_0x00b8
            android.graphics.drawable.Drawable r0 = r6.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x00d8
        L_0x00b8:
            X.6D7 r4 = new X.6D7
            r4.<init>()
            android.graphics.drawable.Drawable r1 = r6.getBackground()
            boolean r0 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x00d2
            android.graphics.drawable.ColorDrawable r1 = (android.graphics.drawable.ColorDrawable) r1
            int r0 = r1.getColor()
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r4.A06(r0)
        L_0x00d2:
            r4.A05(r11)
            X.AnonymousClass0YY.A04(r4, r6)
        L_0x00d8:
            r0 = 7
            boolean r0 = r7.hasValue(r0)
            if (r0 == 0) goto L_0x00e7
            r0 = 7
            int r0 = r7.getDimensionPixelSize(r0, r5)
            r6.setItemPaddingTop(r0)
        L_0x00e7:
            r0 = 6
            boolean r0 = r7.hasValue(r0)
            if (r0 == 0) goto L_0x00f6
            r0 = 6
            int r0 = r7.getDimensionPixelSize(r0, r5)
            r6.setItemPaddingBottom(r0)
        L_0x00f6:
            boolean r0 = r7.hasValue(r2)
            if (r0 == 0) goto L_0x0104
            int r0 = r7.getDimensionPixelSize(r2, r5)
            float r0 = (float) r0
            r6.setElevation(r0)
        L_0x0104:
            android.content.res.ColorStateList r1 = X.C160917of.A01(r11, r3, r5)
            android.graphics.drawable.Drawable r0 = r6.getBackground()
            android.graphics.drawable.Drawable r0 = r0.mutate()
            X.AnonymousClass0YG.A01(r1, r0)
            r1 = 12
            r0 = -1
            int r0 = r7.getInteger(r1, r0)
            r6.setLabelVisibilityMode(r0)
            r0 = 3
            int r0 = r7.getResourceId(r0, r5)
            if (r0 == 0) goto L_0x019f
            r9.setItemBackgroundRes(r0)
        L_0x0127:
            r0 = 2
            int r1 = r7.getResourceId(r0, r5)
            if (r1 == 0) goto L_0x016f
            r6.setItemActiveIndicatorEnabled(r2)
            int[] r0 = X.C1463179t.A0T
            android.content.res.TypedArray r3 = r11.obtainStyledAttributes(r1, r0)
            int r0 = r3.getDimensionPixelSize(r2, r5)
            r6.setItemActiveIndicatorWidth(r0)
            int r0 = r3.getDimensionPixelSize(r5, r5)
            r6.setItemActiveIndicatorHeight(r0)
            r0 = 3
            int r0 = r3.getDimensionPixelOffset(r0, r5)
            r6.setItemActiveIndicatorMarginHorizontal(r0)
            r0 = 2
            android.content.res.ColorStateList r0 = X.C160917of.A00(r11, r3, r0)
            r6.setItemActiveIndicatorColor(r0)
            r0 = 4
            int r2 = r3.getResourceId(r0, r5)
            float r1 = (float) r5
            X.8Bv r0 = new X.8Bv
            r0.<init>(r1)
            X.7jd r1 = X.C161877ql.A02(r11, r0, r2, r5)
            X.7ql r0 = new X.7ql
            r0.<init>(r1)
            r6.setItemActiveIndicatorShapeAppearance(r0)
            r3.recycle()
        L_0x016f:
            r0 = 13
            boolean r0 = r7.hasValue(r0)
            if (r0 == 0) goto L_0x0190
            r0 = 13
            int r4 = r7.getResourceId(r0, r5)
            X.5g8 r3 = r6.A05
            r2 = 1
            r3.A03 = r2
            android.view.MenuInflater r1 = r6.getMenuInflater()
            X.4SJ r0 = r6.A03
            r1.inflate(r4, r0)
            r3.A03 = r5
            r3.Brl(r2)
        L_0x0190:
            r7.recycle()
            r6.addView(r9)
            X.6A0 r0 = new X.6A0
            r0.<init>(r6, r5)
            r8.A0D(r0)
            return
        L_0x019f:
            r0 = 8
            android.content.res.ColorStateList r0 = X.C160917of.A01(r11, r3, r0)
            r6.setItemRippleColor(r0)
            goto L_0x0127
        L_0x01aa:
            android.content.res.ColorStateList r0 = r9.A00()
            goto L_0x006b
        L_0x01b0:
            X.4aU r9 = new X.4aU
            r9.<init>(r11)
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4P2.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    private MenuInflater getMenuInflater() {
        MenuInflater menuInflater = this.A00;
        if (menuInflater != null) {
            return menuInflater;
        }
        AnonymousClass02O r1 = new AnonymousClass02O(getContext());
        this.A00 = r1;
        return r1;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.A04.A0C;
    }

    public int getItemActiveIndicatorHeight() {
        return this.A04.A00;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.A04.A01;
    }

    public C161877ql getItemActiveIndicatorShapeAppearance() {
        return this.A04.A0J;
    }

    public int getItemActiveIndicatorWidth() {
        return this.A04.A02;
    }

    public Drawable getItemBackground() {
        return this.A04.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.A04.A03;
    }

    public int getItemIconSize() {
        return this.A04.A04;
    }

    public ColorStateList getItemIconTintList() {
        return this.A04.A0D;
    }

    public int getItemPaddingBottom() {
        return this.A04.A05;
    }

    public int getItemPaddingTop() {
        return this.A04.A06;
    }

    public ColorStateList getItemRippleColor() {
        return this.A04.A0E;
    }

    public int getItemTextAppearanceActive() {
        return this.A04.A07;
    }

    public int getItemTextAppearanceInactive() {
        return this.A04.A08;
    }

    public ColorStateList getItemTextColor() {
        return this.A04.A0F;
    }

    public int getLabelVisibilityMode() {
        return this.A04.A09;
    }

    public Menu getMenu() {
        return this.A03;
    }

    public C15570ra getMenuView() {
        return this.A04;
    }

    public C110375g8 getPresenter() {
        return this.A05;
    }

    public int getSelectedItemId() {
        return this.A04.A0A;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof AnonymousClass6GW)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AnonymousClass6GW r6 = (AnonymousClass6GW) parcelable;
        super.onRestoreInstanceState(r6.A00);
        AnonymousClass4SJ r2 = this.A03;
        SparseArray sparseParcelableArray = r6.A00.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = r2.A0B;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    Reference reference = (Reference) it.next();
                    C17050uU r1 = (C17050uU) reference.get();
                    if (r1 == null) {
                        copyOnWriteArrayList.remove(reference);
                    } else {
                        int id = r1.getId();
                        if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                            r1.BaE(parcelable2);
                        }
                    }
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.A04.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.A04.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.A04.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.A04.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(C161877ql r2) {
        this.A04.setItemActiveIndicatorShapeAppearance(r2);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.A04.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.A04.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.A04.setItemBackgroundRes(i);
    }

    public void setItemIconSize(int i) {
        this.A04.setItemIconSize(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.A04.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.A04.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.A04.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.A04.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.A04.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.A04.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.A04.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        C87084Ny r1 = this.A04;
        if (r1.A09 != i) {
            r1.A09 = i;
            this.A05.Brl(false);
        }
    }

    public void setSelectedItemId(int i) {
        AnonymousClass4SJ r3 = this.A03;
        MenuItem findItem = r3.findItem(i);
        if (findItem != null && !r3.A0L(findItem, this.A05, 0)) {
            findItem.setChecked(true);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C160927og.A01(this);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable Baj;
        AnonymousClass6GW r6 = new AnonymousClass6GW(super.onSaveInstanceState());
        Bundle A08 = AnonymousClass002.A08();
        r6.A00 = A08;
        CopyOnWriteArrayList copyOnWriteArrayList = this.A03.A0B;
        if (!copyOnWriteArrayList.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                C17050uU r0 = (C17050uU) reference.get();
                if (r0 == null) {
                    copyOnWriteArrayList.remove(reference);
                } else {
                    int id = r0.getId();
                    if (id > 0 && (Baj = r0.Baj()) != null) {
                        sparseArray.put(id, Baj);
                    }
                }
            }
            A08.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return r6;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C160927og.A02(this, f);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(C86614Ku.A05(this, i));
    }

    public void setOnItemReselectedListener(C178868iE r1) {
        this.A01 = r1;
    }

    public void setOnItemSelectedListener(C178878iF r1) {
        this.A02 = r1;
    }
}
