package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import com.whatsapp.R;
import java.util.HashSet;

/* renamed from: X.4Ny  reason: invalid class name and case insensitive filesystem */
public abstract class C87084Ny extends ViewGroup implements C15570ra {
    public static final int[] A0T = {16842912};
    public static final int[] A0U = {-16842910};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = -1;
    public int A06 = -1;
    public int A07;
    public int A08;
    public int A09;
    public int A0A = 0;
    public int A0B = 0;
    public ColorStateList A0C;
    public ColorStateList A0D;
    public ColorStateList A0E;
    public ColorStateList A0F;
    public Drawable A0G;
    public C07890cz A0H;
    public C110375g8 A0I;
    public C161877ql A0J;
    public boolean A0K;
    public boolean A0L = false;
    public AnonymousClass4PF[] A0M;
    public final ColorStateList A0N = A00();
    public final SparseArray A0O = new SparseArray(5);
    public final SparseArray A0P = new SparseArray(5);
    public final View.OnClickListener A0Q;
    public final C16600tf A0R = new AnonymousClass05z(5);
    public final AnonymousClass0A7 A0S;

    private AnonymousClass4PF getNewItem() {
        AnonymousClass4PF r0 = (AnonymousClass4PF) this.A0R.AwG();
        if (r0 == null) {
            return A01(getContext());
        }
        return r0;
    }

    public AnonymousClass4PF A01(Context context) {
        return new AnonymousClass6Z5(context);
    }

    public SparseArray getBadgeDrawables() {
        return this.A0O;
    }

    public ColorStateList getIconTintList() {
        return this.A0D;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.A0C;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.A0K;
    }

    public int getItemActiveIndicatorHeight() {
        return this.A00;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.A01;
    }

    public C161877ql getItemActiveIndicatorShapeAppearance() {
        return this.A0J;
    }

    public int getItemActiveIndicatorWidth() {
        return this.A02;
    }

    public Drawable getItemBackground() {
        AnonymousClass4PF[] r1 = this.A0M;
        if (r1 == null || r1.length <= 0) {
            return this.A0G;
        }
        return r1[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.A03;
    }

    public int getItemIconSize() {
        return this.A04;
    }

    public int getItemPaddingBottom() {
        return this.A05;
    }

    public int getItemPaddingTop() {
        return this.A06;
    }

    public ColorStateList getItemRippleColor() {
        return this.A0E;
    }

    public int getItemTextAppearanceActive() {
        return this.A07;
    }

    public int getItemTextAppearanceInactive() {
        return this.A08;
    }

    public ColorStateList getItemTextColor() {
        return this.A0F;
    }

    public int getLabelVisibilityMode() {
        return this.A09;
    }

    public C07890cz getMenu() {
        return this.A0H;
    }

    public int getSelectedItemId() {
        return this.A0A;
    }

    public int getSelectedItemPosition() {
        return this.A0B;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.A0D = colorStateList;
        AnonymousClass4PF[] r3 = this.A0M;
        if (r3 != null) {
            for (AnonymousClass4PF iconTintList : r3) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        AnonymousClass6D7 r1;
        this.A0C = colorStateList;
        AnonymousClass4PF[] r6 = this.A0M;
        if (r6 != null) {
            for (AnonymousClass4PF r3 : r6) {
                C161877ql r2 = this.A0J;
                if (r2 == null || this.A0C == null) {
                    r1 = null;
                } else {
                    r1 = new AnonymousClass6D7(r2);
                    r1.A06(this.A0C);
                }
                r3.setActiveIndicatorDrawable(r1);
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.A0K = z;
        AnonymousClass4PF[] r3 = this.A0M;
        if (r3 != null) {
            for (AnonymousClass4PF activeIndicatorEnabled : r3) {
                activeIndicatorEnabled.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.A00 = i;
        AnonymousClass4PF[] r3 = this.A0M;
        if (r3 != null) {
            for (AnonymousClass4PF activeIndicatorHeight : r3) {
                activeIndicatorHeight.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.A01 = i;
        AnonymousClass4PF[] r3 = this.A0M;
        if (r3 != null) {
            for (AnonymousClass4PF activeIndicatorMarginHorizontal : r3) {
                activeIndicatorMarginHorizontal.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.A0L = z;
        AnonymousClass4PF[] r3 = this.A0M;
        if (r3 != null) {
            for (AnonymousClass4PF r0 : r3) {
                r0.A0L = z;
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(C161877ql r8) {
        AnonymousClass6D7 r1;
        this.A0J = r8;
        AnonymousClass4PF[] r6 = this.A0M;
        if (r6 != null) {
            for (AnonymousClass4PF r3 : r6) {
                C161877ql r2 = this.A0J;
                if (r2 == null || this.A0C == null) {
                    r1 = null;
                } else {
                    r1 = new AnonymousClass6D7(r2);
                    r1.A06(this.A0C);
                }
                r3.setActiveIndicatorDrawable(r1);
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.A02 = i;
        AnonymousClass4PF[] r3 = this.A0M;
        if (r3 != null) {
            for (AnonymousClass4PF activeIndicatorWidth : r3) {
                activeIndicatorWidth.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.A0G = drawable;
        AnonymousClass4PF[] r3 = this.A0M;
        if (r3 != null) {
            for (AnonymousClass4PF itemBackground : r3) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.A03 = i;
        AnonymousClass4PF[] r3 = this.A0M;
        if (r3 != null) {
            for (AnonymousClass4PF itemBackground : r3) {
                itemBackground.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.A04 = i;
        AnonymousClass4PF[] r3 = this.A0M;
        if (r3 != null) {
            for (AnonymousClass4PF iconSize : r3) {
                iconSize.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.A05 = i;
        AnonymousClass4PF[] r3 = this.A0M;
        if (r3 != null) {
            for (AnonymousClass4PF itemPaddingBottom : r3) {
                itemPaddingBottom.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.A06 = i;
        AnonymousClass4PF[] r3 = this.A0M;
        if (r3 != null) {
            for (AnonymousClass4PF itemPaddingTop : r3) {
                itemPaddingTop.setItemPaddingTop(i);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.A0E = colorStateList;
        AnonymousClass4PF[] r3 = this.A0M;
        if (r3 != null) {
            for (AnonymousClass4PF itemRippleColor : r3) {
                itemRippleColor.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.A07 = i;
        AnonymousClass4PF[] r4 = this.A0M;
        if (r4 != null) {
            for (AnonymousClass4PF r1 : r4) {
                r1.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.A0F;
                if (colorStateList != null) {
                    r1.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.A08 = i;
        AnonymousClass4PF[] r4 = this.A0M;
        if (r4 != null) {
            for (AnonymousClass4PF r1 : r4) {
                r1.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.A0F;
                if (colorStateList != null) {
                    r1.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.A0F = colorStateList;
        AnonymousClass4PF[] r3 = this.A0M;
        if (r3 != null) {
            for (AnonymousClass4PF textColor : r3) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public C87084Ny(Context context) {
        super(context);
        if (isInEditMode()) {
            this.A0S = null;
        } else {
            AnonymousClass0AH r3 = new AnonymousClass0AH();
            this.A0S = r3;
            r3.A03 = true;
            r3.A0Z((long) C160907oe.A00(getContext(), R.attr.f3nameremoved, getResources().getInteger(R.integer.f7nameremoved)));
            r3.A0a(AnonymousClass5YH.A01(C159917mg.A02, getContext(), R.attr.f3nameremoved));
            r3.A0c(new AnonymousClass6JC());
        }
        this.A0Q = new C109415ea(this, 4);
        AnonymousClass0YY.A06(this, 1);
    }

    private void setBadgeIfNeeded(AnonymousClass4PF r3) {
        AnonymousClass4M1 r0;
        int id = r3.getId();
        if (id != -1 && (r0 = (AnonymousClass4M1) this.A0O.get(id)) != null) {
            r3.setBadge(r0);
        }
    }

    public ColorStateList A00() {
        TypedValue A0B2 = AnonymousClass4L0.A0B();
        if (C86614Ku.A0C(this).resolveAttribute(16842808, A0B2, true)) {
            ColorStateList A002 = AnonymousClass0VX.A00(getContext(), A0B2.resourceId);
            if (C86614Ku.A0C(this).resolveAttribute(R.attr.f3nameremoved, A0B2, true)) {
                int i = A0B2.data;
                int defaultColor = A002.getDefaultColor();
                int[] iArr = A0U;
                int[][] iArr2 = {iArr, A0T, ViewGroup.EMPTY_STATE_SET};
                int[] iArr3 = new int[3];
                iArr3[0] = A002.getColorForState(iArr, defaultColor);
                iArr3[1] = i;
                return C86664Kz.A0W(iArr3, iArr2, defaultColor, 2);
            }
        }
        return null;
    }

    public void A02() {
        AnonymousClass6D7 r1;
        removeAllViews();
        AnonymousClass4PF[] r6 = this.A0M;
        if (r6 != null) {
            for (AnonymousClass4PF r2 : r6) {
                if (r2 != null) {
                    this.A0R.Bio(r2);
                    ImageView imageView = r2.A0R;
                    if (r2.A0I != null) {
                        if (imageView != null) {
                            r2.setClipChildren(true);
                            r2.setClipToPadding(true);
                            C154047cU.A01(imageView, r2.A0I);
                        }
                        r2.A0I = null;
                    }
                    r2.A0H = null;
                    r2.A00 = 0.0f;
                    r2.A0M = false;
                }
            }
        }
        if (this.A0H.size() == 0) {
            this.A0A = 0;
            this.A0B = 0;
            this.A0M = null;
            return;
        }
        HashSet A0K2 = AnonymousClass002.A0K();
        int i = 0;
        int i2 = 0;
        while (true) {
            C07890cz r12 = this.A0H;
            if (i2 >= r12.size()) {
                break;
            }
            C18270x1.A1K(A0K2, r12.getItem(i2).getItemId());
            i2++;
        }
        while (true) {
            SparseArray sparseArray = this.A0O;
            if (i >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i);
            if (!C86624Kv.A1a(A0K2, keyAt)) {
                sparseArray.delete(keyAt);
            }
            i++;
        }
        C07890cz r13 = this.A0H;
        this.A0M = new AnonymousClass4PF[r13.size()];
        int i3 = this.A09;
        int size = r13.A05().size();
        boolean z = true;
        if (i3 != -1 ? i3 != 0 : size <= 3) {
            z = false;
        }
        int i4 = 0;
        while (true) {
            C07890cz r62 = this.A0H;
            if (i4 < r62.size()) {
                this.A0I.A03 = true;
                r62.getItem(i4).setCheckable(true);
                this.A0I.A03 = false;
                AnonymousClass4PF newItem = getNewItem();
                this.A0M[i4] = newItem;
                newItem.setIconTintList(this.A0D);
                newItem.setIconSize(this.A04);
                newItem.setTextColor(this.A0N);
                newItem.setTextAppearanceInactive(this.A08);
                newItem.setTextAppearanceActive(this.A07);
                newItem.setTextColor(this.A0F);
                int i5 = this.A06;
                if (i5 != -1) {
                    newItem.setItemPaddingTop(i5);
                }
                int i6 = this.A05;
                if (i6 != -1) {
                    newItem.setItemPaddingBottom(i6);
                }
                newItem.setActiveIndicatorWidth(this.A02);
                newItem.setActiveIndicatorHeight(this.A00);
                newItem.setActiveIndicatorMarginHorizontal(this.A01);
                C161877ql r63 = this.A0J;
                if (r63 == null || this.A0C == null) {
                    r1 = null;
                } else {
                    r1 = new AnonymousClass6D7(r63);
                    r1.A06(this.A0C);
                }
                newItem.setActiveIndicatorDrawable(r1);
                newItem.A0L = this.A0L;
                newItem.setActiveIndicatorEnabled(this.A0K);
                Drawable drawable = this.A0G;
                if (drawable != null) {
                    newItem.setItemBackground(drawable);
                } else {
                    newItem.setItemBackground(this.A03);
                }
                newItem.setItemRippleColor(this.A0E);
                newItem.setShifting(z);
                newItem.setLabelVisibilityMode(this.A09);
                C07910d1 r0 = (C07910d1) this.A0H.getItem(i4);
                newItem.BGB(r0, 0);
                newItem.A09 = i4;
                int itemId = r0.getItemId();
                newItem.setOnTouchListener((View.OnTouchListener) this.A0P.get(itemId));
                newItem.setOnClickListener(this.A0Q);
                int i7 = this.A0A;
                if (i7 != 0 && itemId == i7) {
                    this.A0B = i4;
                }
                setBadgeIfNeeded(newItem);
                addView(newItem);
                i4++;
            } else {
                int min = Math.min(r62.size() - 1, this.A0B);
                this.A0B = min;
                r62.getItem(min).setChecked(true);
                return;
            }
        }
    }

    public void BGA(C07890cz r1) {
        this.A0H = r1;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new C05650Ui(accessibilityNodeInfo).A0F(new AnonymousClass0KO(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.A0H.A05().size(), false, 1)));
    }

    public void setLabelVisibilityMode(int i) {
        this.A09 = i;
    }

    public void setPresenter(C110375g8 r1) {
        this.A0I = r1;
    }
}
