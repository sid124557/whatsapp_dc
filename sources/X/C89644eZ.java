package X;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.dialogs.ProgressDialogFragment;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4eZ  reason: invalid class name and case insensitive filesystem */
public class C89644eZ extends AnonymousClass1Ha implements AnonymousClass64D {
    public C111095hX A00;
    public C56972sr A01;
    public C101625Fm A02;
    public AnonymousClass5X8 A03;
    public C105275Ug A04;
    public AnonymousClass310 A05;
    public C56612sH A06;
    public C61072zf A07;
    public C84474Cm A08;
    public C51072jE A09;
    public C29321id A0A;
    public C105895Wv A0B;
    public boolean A0C = false;
    public boolean A0D = true;
    public boolean A0E;
    public final Set A0F = new CopyOnWriteArraySet();

    public static /* synthetic */ void A4G(C89644eZ r3, Integer num) {
        Intent A062 = C86624Kv.A06(r3, 1);
        if (num.intValue() == 1) {
            r3.finish();
            r3.startActivity(A062);
        }
    }

    public static boolean A4I(KeyEvent keyEvent, C89644eZ r2, int i) {
        if (i == 4) {
            r2.A0E = false;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.A0E = true;
        }
        return super.onKeyLongPress(i, keyEvent);
    }

    public static /* synthetic */ void A33(C89644eZ r3) {
        C18270x1.A0l(C18270x1.A03(r3.A09), "smb_client_viewed_eu_tos_update", true);
        AnonymousClass1Ha.A1w(r3.A03.A00(C18280x3.A0Z(AnonymousClass1Hf.A27(r3), "smb_eu_tos_update_url")), r3);
    }

    public void A66() {
        this.A02.A00.A00();
    }

    public boolean A6C() {
        return this.A0D.A0X(3858);
    }

    public void A6k() {
    }

    public void A6l() {
    }

    @Deprecated
    public void A6p() {
    }

    public void A6q() {
    }

    public void A6s() {
        if (this.A08.B7n() == 1 || this.A08.B7n() == 4 || this.A08.B7n() == 3) {
            Intent A062 = C86624Kv.A06(this, 1);
            finish();
            startActivity(A062);
        } else if (this.A08.B7n() == 0) {
            C84474Cm r2 = this.A08;
            ((C55442qM) r2).A00.A0B(this, AnonymousClass6C6.A00(this, 3));
        }
    }

    public void A6t() {
    }

    public void A6w(AnonymousClass64L r3) {
        synchronized (this.A0F) {
            this.A0F.add(r3);
        }
    }

    public void A6x(AnonymousClass64L r3) {
        synchronized (this.A0F) {
            this.A0F.remove(r3);
        }
    }

    public boolean A6z() {
        return false;
    }

    public boolean A70() {
        return this.A04.A05();
    }

    public boolean A71(int i, KeyEvent keyEvent) {
        if (i != 82 || !this.A0E) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public /* synthetic */ AnonymousClass5ZC BCP() {
        return C58152un.A03;
    }

    public void Bqv(List list) {
        int i;
        boolean contains = list.contains(C135166kE.A00);
        if (list.size() == 1) {
            i = R.string.f11nameremoved;
            if (contains) {
                i = R.string.f11nameremoved;
            }
        } else {
            i = R.string.f11nameremoved;
            if (contains) {
                i = R.string.f11nameremoved;
            }
        }
        this.A05.A0H(i, 1);
    }

    public C111095hX getActivityUtils() {
        return this.A00;
    }

    public C105895Wv getImeUtils() {
        return this.A0B;
    }

    public C56972sr getMeManager() {
        return this.A01;
    }

    public C51072jE getRegistrationStateManager() {
        return this.A09;
    }

    public C29321id getScreenLockStateProvider() {
        return this.A0A;
    }

    public C61072zf getStorageUtils() {
        return this.A07;
    }

    public C56612sH getTime() {
        return this.A06;
    }

    public void onDestroy() {
        this.A0F.clear();
        super.onDestroy();
    }

    public C89644eZ(int i) {
        super(i);
    }

    private void A1s() {
        AnonymousClass001.A0M(this).fontScale = AnonymousClass001.A0M(getApplicationContext()).fontScale;
        getResources().updateConfiguration(AnonymousClass001.A0M(this), AnonymousClass000.A0B(this));
    }

    private boolean A4H() {
        return AnonymousClass000.A1T((AnonymousClass001.A0M(getApplicationContext()).fontScale > AnonymousClass001.A0M(this).fontScale ? 1 : (AnonymousClass001.A0M(getApplicationContext()).fontScale == AnonymousClass001.A0M(this).fontScale ? 0 : -1)));
    }

    public Dialog A6j(int i) {
        return super.onCreateDialog(i);
    }

    public void A6r() {
        int A2K = AnonymousClass4SG.A2K(this);
        if (AnonymousClass4SG.A2b(this) == null && A2K == 11 && !isFinishing()) {
            Intent A072 = C18320x8.A07();
            A072.setClassName(getPackageName(), "com.whatsapp.migration.export.ui.ExportMigrationDataExportedActivity");
            A072.setFlags(33554432);
            startActivity(A072);
            finish();
        }
    }

    public void A6y(boolean z) {
        this.A0D = z;
    }

    public boolean A72(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public boolean A73(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addContentView(view, layoutParams);
        this.A0C = true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        synchronized (this.A0F) {
            for (AnonymousClass64L r0 : this.A0F) {
                if (r0 != null) {
                    r0.BM3(intent, i, i2);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (!A4H()) {
            A1s();
        }
        super.onCreate(bundle);
        AnonymousClass5X0 r2 = this.A0O;
        if (AnonymousClass5X0.A02) {
            r2.A00 = (ProgressDialogFragment) r2.A01.getSupportFragmentManager().A0D(AnonymousClass5X0.A03);
        }
        this.A04.A01(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return A71(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return A4I(keyEvent, this, i);
    }

    public void onResume() {
        super.onResume();
        if (!A70()) {
            return;
        }
        if (this.A04.A07()) {
            Intent className = C18320x8.A07().setClassName(getPackageName(), "com.whatsapp.authentication.AppAuthenticationActivity");
            className.setFlags(AnonymousClass35S.A0F);
            BpY(className, 202);
            overridePendingTransition(0, 0);
            return;
        }
        this.A04.A03(false);
    }

    public void onStart() {
        super.onStart();
        A6s();
        A6r();
    }

    public void setContentView(int i) {
        super.setContentView(i);
        this.A0C = true;
    }

    public void A6m() {
        super.onBackPressed();
    }

    public void A6n() {
        super.onResume();
    }

    public void A6o() {
        super.onStart();
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void A6u(KeyEvent keyEvent, int i) {
        A71(i, keyEvent);
    }

    public void A6v(KeyEvent keyEvent, int i) {
        A4I(keyEvent, this, i);
    }

    public C89644eZ() {
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.A0C = true;
    }

    public void setContentView(View view) {
        super.setContentView(view);
        this.A0C = true;
    }
}
