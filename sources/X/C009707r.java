package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;

/* renamed from: X.07r  reason: invalid class name and case insensitive filesystem */
public class C009707r extends C003203q implements C16440tP, C14480pl, C14910qT {
    public static final String A02 = "androidx:appcompat";
    public Resources A00;
    public C06280Wy A01;

    private void A0C() {
        this.A07.A01.A04(new C02470Gj(this, 1), A02);
        AnonymousClass00M.A05(this, 1);
    }

    public static void A0N() {
    }

    public static void A0T() {
    }

    @Deprecated
    public static void A0U() {
    }

    @Deprecated
    public static void A0V() {
    }

    @Deprecated
    public static void A0W() {
    }

    private boolean A0X(KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public C06280Wy A5e() {
        C06280Wy r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass040 r02 = new AnonymousClass040(this, (Window) null, this, this);
        this.A01 = r02;
        return r02;
    }

    @Deprecated
    public void A5h() {
    }

    public void A5i() {
    }

    public Resources getResources() {
        Resources resources = this.A00;
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    public C009707r(int i) {
        super(i);
        A0C();
    }

    private void A0L() {
        AnonymousClass001.A0Q(this).setTag(R.id.view_tree_lifecycle_owner, this);
        AnonymousClass001.A0Q(this).setTag(R.id.view_tree_view_model_store_owner, this);
        C02940Ie.A00(AnonymousClass001.A0Q(this), this);
    }

    public void A5T() {
        A5e().A08();
    }

    public void A5f() {
        new C07470aw((AnonymousClass040) A5e());
    }

    public void A5j(int i) {
        A5e().A0J(i);
    }

    public boolean A5o() {
        Intent A002 = AnonymousClass0RG.A00(this);
        if (A002 == null) {
            return false;
        }
        if (C05730Ur.A02(this, A002)) {
            C10620iF r0 = new C10620iF(this);
            r0.A02(this);
            r0.A01();
            try {
                C05680Um.A00(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            C05730Ur.A01(this, A002);
            return true;
        }
    }

    public AnonymousClass0R2 Bpz(C16910uE r2) {
        return A5e().A06(r2);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A0L();
        A5e().A0F(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(A5e().A04(context));
    }

    public void closeOptionsMenu() {
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.A0S()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.A0X(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public View findViewById(int i) {
        AnonymousClass040 r0 = (AnonymousClass040) A5e();
        r0.A0N();
        return r0.A08.findViewById(i);
    }

    public MenuInflater getMenuInflater() {
        Context context;
        AnonymousClass040 r2 = (AnonymousClass040) A5e();
        MenuInflater menuInflater = r2.A05;
        if (menuInflater != null) {
            return menuInflater;
        }
        r2.A0P();
        AnonymousClass0R8 r0 = r2.A0B;
        if (r0 != null) {
            context = r0.A02();
        } else {
            context = r2.A0i;
        }
        AnonymousClass02O r1 = new AnonymousClass02O(context);
        r2.A05 = r1;
        return r1;
    }

    public AnonymousClass0R8 getSupportActionBar() {
        AnonymousClass040 r0 = (AnonymousClass040) A5e();
        r0.A0P();
        return r0.A0B;
    }

    public void invalidateOptionsMenu() {
        A5e().A08();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A00 != null) {
            this.A00.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        A5e().A0C(configuration);
    }

    public void onDestroy() {
        super.onDestroy();
        A5e().A09();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (A0X(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.A01() & 4) == 0) {
            return false;
        }
        return A5o();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((AnonymousClass040) A5e()).A0N();
    }

    public void onPostResume() {
        super.onPostResume();
        AnonymousClass040 r0 = (AnonymousClass040) A5e();
        r0.A0P();
        AnonymousClass0R8 r1 = r0.A0B;
        if (r1 != null) {
            r1.A0R(true);
        }
    }

    public void onStart() {
        super.onStart();
        AnonymousClass040 r1 = (AnonymousClass040) A5e();
        r1.A0e = true;
        r1.A0W(true);
    }

    public void onStop() {
        super.onStop();
        A5e().A0A();
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        A5e().A0I(charSequence);
    }

    public void openOptionsMenu() {
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.A0U()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A0L();
        A5e().A0G(view, layoutParams);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        A5e().A0H(toolbar);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        ((AnonymousClass040) A5e()).A02 = i;
    }

    public void A5k(Intent intent) {
        C05730Ur.A01(this, intent);
    }

    public void A5l(Intent intent) {
        C05730Ur.A02(this, intent);
    }

    public void A5m(C10620iF r1) {
        r1.A02(this);
    }

    @Deprecated
    public void A5n(boolean z) {
    }

    public void Bdh(AnonymousClass0R2 r1) {
    }

    public void Bdi(AnonymousClass0R2 r1) {
    }

    public void A5g() {
        AnonymousClass0RG.A00(this);
    }

    public void onContentChanged() {
        A5h();
    }

    public C009707r() {
        A0C();
    }

    public void setContentView(int i) {
        A0L();
        A5e().A0B(i);
    }

    public void setContentView(View view) {
        A0L();
        A5e().A0E(view);
    }
}
