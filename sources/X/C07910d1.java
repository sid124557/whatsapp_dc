package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.util.ArrayList;

/* renamed from: X.0d1  reason: invalid class name and case insensitive filesystem */
public final class C07910d1 implements C17230vB {
    public char A00;
    public char A01;
    public int A02 = 16;
    public int A03 = 0;
    public int A04 = ZipDecompressor.UNZIP_BUFFER_SIZE;
    public int A05 = ZipDecompressor.UNZIP_BUFFER_SIZE;
    public int A06;
    public Intent A07;
    public ColorStateList A08 = null;
    public PorterDuff.Mode A09 = null;
    public Drawable A0A;
    public MenuItem.OnActionExpandListener A0B;
    public MenuItem.OnMenuItemClickListener A0C;
    public View A0D;
    public C07890cz A0E;
    public AnonymousClass04J A0F;
    public AnonymousClass0L5 A0G;
    public CharSequence A0H;
    public CharSequence A0I;
    public CharSequence A0J;
    public CharSequence A0K;
    public boolean A0L = false;
    public boolean A0M = false;
    public boolean A0N = false;
    public boolean A0O = false;
    public final int A0P;
    public final int A0Q;
    public final int A0R;
    public final int A0S;

    public MenuItem setIcon(Drawable drawable) {
        this.A03 = 0;
        this.A0A = drawable;
        this.A0O = true;
        this.A0E.A0F(false);
        return this;
    }

    public void A00(View view) {
        int i;
        this.A0D = view;
        this.A0G = null;
        if (view != null && view.getId() == -1 && (i = this.A0R) > 0) {
            view.setId(i);
        }
        C07890cz r1 = this.A0E;
        r1.A0D = true;
        r1.A0F(true);
    }

    public boolean A01() {
        if ((this.A06 & 8) == 0) {
            return false;
        }
        if (this.A0D == null) {
            AnonymousClass0L5 r0 = this.A0G;
            if (r0 == null) {
                return false;
            }
            View onCreateActionView = ((AnonymousClass067) r0).A00.onCreateActionView(this);
            this.A0D = onCreateActionView;
            if (onCreateActionView != null) {
                return true;
            }
            return false;
        }
        return true;
    }

    public AnonymousClass0L5 BDO() {
        return this.A0G;
    }

    public C17230vB Bm0(CharSequence charSequence) {
        this.A0H = charSequence;
        C07890cz.A00(this);
        return this;
    }

    public C17230vB BnW(AnonymousClass0L5 r3) {
        AnonymousClass0L5 r1 = this.A0G;
        if (r1 != null) {
            r1.A00 = null;
        }
        this.A0D = null;
        this.A0G = r3;
        this.A0E.A0F(true);
        AnonymousClass0L5 r12 = this.A0G;
        if (r12 != null) {
            AnonymousClass04K r13 = (AnonymousClass04K) r12;
            r13.A00 = new C08040dE(this);
            r13.A00.setVisibilityListener(r13);
        }
        return this;
    }

    public C17230vB Bna(CharSequence charSequence) {
        this.A0K = charSequence;
        C07890cz.A00(this);
        return this;
    }

    public boolean collapseActionView() {
        if ((this.A06 & 8) != 0) {
            if (this.A0D == null) {
                return true;
            }
            MenuItem.OnActionExpandListener onActionExpandListener = this.A0B;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
                return this.A0E.A0M(this);
            }
        }
        return false;
    }

    public ActionProvider getActionProvider() {
        throw AnonymousClass002.A0G("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.A0D;
        if (view != null) {
            return view;
        }
        AnonymousClass0L5 r0 = this.A0G;
        if (r0 == null) {
            return null;
        }
        View onCreateActionView = ((AnonymousClass067) r0).A00.onCreateActionView(this);
        this.A0D = onCreateActionView;
        return onCreateActionView;
    }

    public int getAlphabeticModifiers() {
        return this.A04;
    }

    public char getAlphabeticShortcut() {
        return this.A00;
    }

    public CharSequence getContentDescription() {
        return this.A0H;
    }

    public int getGroupId() {
        return this.A0Q;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r1 != null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable getIcon() {
        /*
            r2 = this;
            android.graphics.drawable.Drawable r1 = r2.A0A
            if (r1 != 0) goto L_0x0017
            int r1 = r2.A03
            if (r1 == 0) goto L_0x0041
            X.0cz r0 = r2.A0E
            android.content.Context r0 = r0.A0N
            android.graphics.drawable.Drawable r1 = X.AnonymousClass0XW.A01(r0, r1)
            r0 = 0
            r2.A03 = r0
            r2.A0A = r1
            if (r1 == 0) goto L_0x0040
        L_0x0017:
            boolean r0 = r2.A0O
            if (r0 == 0) goto L_0x0040
            boolean r0 = r2.A0L
            if (r0 != 0) goto L_0x0023
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x0040
        L_0x0023:
            android.graphics.drawable.Drawable r0 = X.C06130Wj.A01(r1)
            android.graphics.drawable.Drawable r1 = r0.mutate()
            boolean r0 = r2.A0L
            if (r0 == 0) goto L_0x0034
            android.content.res.ColorStateList r0 = r2.A08
            X.AnonymousClass0YG.A01(r0, r1)
        L_0x0034:
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x003d
            android.graphics.PorterDuff$Mode r0 = r2.A09
            X.AnonymousClass0YG.A04(r0, r1)
        L_0x003d:
            r0 = 0
            r2.A0O = r0
        L_0x0040:
            return r1
        L_0x0041:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07910d1.getIcon():android.graphics.drawable.Drawable");
    }

    public ColorStateList getIconTintList() {
        return this.A08;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.A09;
    }

    public Intent getIntent() {
        return this.A07;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.A0R;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.A05;
    }

    public char getNumericShortcut() {
        return this.A01;
    }

    public int getOrder() {
        return this.A0P;
    }

    public SubMenu getSubMenu() {
        return this.A0F;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.A0I;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.A0J;
        if (charSequence == null) {
            return this.A0I;
        }
        return charSequence;
    }

    public CharSequence getTooltipText() {
        return this.A0K;
    }

    public boolean hasSubMenu() {
        return AnonymousClass000.A1W(this.A0F);
    }

    public boolean isActionViewExpanded() {
        return this.A0N;
    }

    public boolean isCheckable() {
        if ((this.A02 & 1) != 1) {
            return false;
        }
        return true;
    }

    public boolean isChecked() {
        return AnonymousClass000.A1U(this.A02 & 2, 2);
    }

    public boolean isEnabled() {
        return AnonymousClass000.A1S(this.A02 & 16);
    }

    public boolean isVisible() {
        AnonymousClass0L5 r0 = this.A0G;
        if (r0 == null || !((AnonymousClass067) r0).A00.overridesItemVisibility()) {
            if ((this.A02 & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.A02 & 8) != 0 || !((AnonymousClass067) this.A0G).A00.isVisible()) {
            return false;
        } else {
            return true;
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw AnonymousClass002.A0G("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.A0E.A0N;
        A00(AnonymousClass001.A0R(LayoutInflater.from(context), new LinearLayout(context), i));
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.A00 == c && this.A04 == i) {
            return this;
        }
        this.A00 = Character.toLowerCase(c);
        this.A04 = KeyEvent.normalizeMetaState(i);
        C07890cz.A00(this);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.A02;
        boolean z2 = z | (i & true);
        this.A02 = z2 ? 1 : 0;
        if (i != z2) {
            C07890cz.A00(this);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        int i = this.A02;
        if ((i & 4) != 0) {
            C07890cz r9 = this.A0E;
            int groupId = getGroupId();
            ArrayList arrayList = r9.A07;
            int size = arrayList.size();
            r9.A08();
            for (int i2 = 0; i2 < size; i2++) {
                C07910d1 A0V = AnonymousClass001.A0V(arrayList, i2);
                if (A0V.getGroupId() == groupId && (A0V.A02 & 4) != 0 && A0V.isCheckable()) {
                    boolean A1Y = AnonymousClass000.A1Y(A0V, this);
                    int i3 = A0V.A02;
                    int i4 = i3 & -3;
                    int i5 = 0;
                    if (A1Y) {
                        i5 = 2;
                    }
                    int i6 = i5 | i4;
                    A0V.A02 = i6;
                    if (i3 != i6) {
                        A0V.A0E.A0F(false);
                    }
                }
            }
            r9.A07();
            return this;
        }
        int i7 = i & -3;
        int i8 = 0;
        if (z) {
            i8 = 2;
        }
        int i9 = i8 | i7;
        this.A02 = i9;
        if (i != i9) {
            this.A0E.A0F(false);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        int i;
        int i2 = this.A02;
        if (z) {
            i = i2 | 16;
        } else {
            i = i2 & -17;
        }
        this.A02 = i;
        C07890cz.A00(this);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.A08 = colorStateList;
        this.A0L = true;
        this.A0O = true;
        C07890cz.A00(this);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.A09 = mode;
        this.A0M = true;
        this.A0O = true;
        C07890cz.A00(this);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.A01 == c && this.A05 == i) {
            return this;
        }
        this.A01 = c;
        this.A05 = KeyEvent.normalizeMetaState(i);
        C07890cz.A00(this);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.A01 = c;
        this.A05 = KeyEvent.normalizeMetaState(i);
        this.A00 = Character.toLowerCase(c2);
        this.A04 = KeyEvent.normalizeMetaState(i2);
        C07890cz.A00(this);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.A06 = i;
            C07890cz r1 = this.A0E;
            r1.A0D = true;
            r1.A0F(true);
            return;
        }
        throw AnonymousClass001.A0c("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.A0I = charSequence;
        C07890cz.A00(this);
        AnonymousClass04J r0 = this.A0F;
        if (r0 != null) {
            r0.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.A0J = charSequence;
        C07890cz.A00(this);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = this.A02;
        int A082 = AnonymousClass001.A08(z ? 1 : 0) | (i & -9);
        this.A02 = A082;
        if (i != A082) {
            C07890cz r1 = this.A0E;
            r1.A0F = true;
            r1.A0F(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.A0I;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public C07910d1(C07890cz r3, CharSequence charSequence, int i, int i2, int i3, int i4, int i5) {
        this.A0E = r3;
        this.A0R = i2;
        this.A0Q = i;
        this.A0P = i3;
        this.A0S = i4;
        this.A0I = charSequence;
        this.A06 = i5;
    }

    public boolean expandActionView() {
        MenuItem.OnActionExpandListener onActionExpandListener;
        if (!A01() || ((onActionExpandListener = this.A0B) != null && !onActionExpandListener.onMenuItemActionExpand(this))) {
            return false;
        }
        return this.A0E.A0N(this);
    }

    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        Bm0(charSequence);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.A07 = intent;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.A0B = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.A0C = onMenuItemClickListener;
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        Bna(charSequence);
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        A00(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.A00 != c) {
            this.A00 = Character.toLowerCase(c);
            C07890cz.A00(this);
        }
        return this;
    }

    public MenuItem setIcon(int i) {
        this.A0A = null;
        this.A03 = i;
        this.A0O = true;
        C07890cz.A00(this);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.A01 != c) {
            this.A01 = c;
            C07890cz.A00(this);
        }
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.A01 = c;
        this.A00 = Character.toLowerCase(c2);
        C07890cz.A00(this);
        return this;
    }

    public MenuItem setTitle(int i) {
        setTitle((CharSequence) this.A0E.A0N.getString(i));
        return this;
    }
}
