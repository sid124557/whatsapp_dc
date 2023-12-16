package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.0d0  reason: invalid class name and case insensitive filesystem */
public class C07900d0 implements C17230vB {
    public char A00;
    public char A01;
    public int A02 = 16;
    public int A03 = ZipDecompressor.UNZIP_BUFFER_SIZE;
    public int A04 = ZipDecompressor.UNZIP_BUFFER_SIZE;
    public Context A05;
    public Intent A06;
    public ColorStateList A07 = null;
    public PorterDuff.Mode A08 = null;
    public Drawable A09;
    public MenuItem.OnMenuItemClickListener A0A;
    public CharSequence A0B;
    public CharSequence A0C;
    public CharSequence A0D;
    public CharSequence A0E;
    public boolean A0F = false;
    public boolean A0G = false;

    public final void A00() {
        Drawable drawable = this.A09;
        if (drawable == null) {
            return;
        }
        if (this.A0F || this.A0G) {
            Drawable A012 = C06130Wj.A01(drawable);
            this.A09 = A012;
            Drawable mutate = A012.mutate();
            this.A09 = mutate;
            if (this.A0F) {
                AnonymousClass0YG.A01(this.A07, mutate);
            }
            if (this.A0G) {
                AnonymousClass0YG.A04(this.A08, this.A09);
            }
        }
    }

    public AnonymousClass0L5 BDO() {
        return null;
    }

    public C17230vB BnW(AnonymousClass0L5 r2) {
        throw new UnsupportedOperationException();
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.A03;
    }

    public char getAlphabeticShortcut() {
        return this.A00;
    }

    public CharSequence getContentDescription() {
        return this.A0B;
    }

    public int getGroupId() {
        return 0;
    }

    public Drawable getIcon() {
        return this.A09;
    }

    public ColorStateList getIconTintList() {
        return this.A07;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.A08;
    }

    public Intent getIntent() {
        return this.A06;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.A04;
    }

    public char getNumericShortcut() {
        return this.A01;
    }

    public int getOrder() {
        return 0;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.A0C;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.A0D;
        if (charSequence == null) {
            return this.A0C;
        }
        return charSequence;
    }

    public CharSequence getTooltipText() {
        return this.A0E;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        if ((this.A02 & 1) == 0) {
            return false;
        }
        return true;
    }

    public boolean isChecked() {
        return AnonymousClass000.A1S(this.A02 & 2);
    }

    public boolean isEnabled() {
        return AnonymousClass000.A1S(this.A02 & 16);
    }

    public boolean isVisible() {
        return AnonymousClass000.A1T(this.A02 & 8);
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setCheckable(boolean z) {
        this.A02 = z | (this.A02 & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        int i = this.A02 & -3;
        int i2 = 0;
        if (z) {
            i2 = 2;
        }
        this.A02 = i2 | i;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        int i = this.A02 & -17;
        int i2 = 0;
        if (z) {
            i2 = 16;
        }
        this.A02 = i2 | i;
        return this;
    }

    public MenuItem setIcon(int i) {
        this.A09 = AnonymousClass0RP.A00(this.A05, i);
        A00();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.A07 = colorStateList;
        this.A0F = true;
        A00();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.A08 = mode;
        this.A0G = true;
        A00();
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.A01 = c;
        this.A04 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.A01 = c;
        this.A04 = KeyEvent.normalizeMetaState(i);
        this.A00 = Character.toLowerCase(c2);
        this.A03 = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.A0C = this.A05.getResources().getString(i);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.A02 & 8;
        if (z) {
            i = 0;
        }
        this.A02 = i2 | i;
        return this;
    }

    public C07900d0(Context context, CharSequence charSequence) {
        this.A05 = context;
        this.A0C = charSequence;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.A00 = Character.toLowerCase(c);
        this.A03 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public C17230vB Bm0(CharSequence charSequence) {
        this.A0B = charSequence;
        return this;
    }

    public C17230vB Bna(CharSequence charSequence) {
        this.A0E = charSequence;
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.A0B = charSequence;
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.A06 = intent;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.A0A = onMenuItemClickListener;
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.A0D = charSequence;
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.A0E = charSequence;
        return this;
    }

    public int getItemId() {
        return 16908332;
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.A00 = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.A09 = drawable;
        A00();
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.A01 = c;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.A01 = c;
        this.A00 = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.A0C = charSequence;
        return this;
    }
}
