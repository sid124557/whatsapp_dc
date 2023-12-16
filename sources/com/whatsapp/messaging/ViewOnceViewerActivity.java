package com.whatsapp.messaging;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass0VX;
import X.AnonymousClass0YG;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass2z0;
import X.AnonymousClass3DZ;
import X.AnonymousClass4DU;
import X.AnonymousClass4FW;
import X.AnonymousClass4HY;
import X.AnonymousClass5ZU;
import X.C06130Wj;
import X.C08240dc;
import X.C08270df;
import X.C08310eF;
import X.C107335b8;
import X.C107395bF;
import X.C107695bk;
import X.C18300x5;
import X.C29041iB;
import X.C29431io;
import X.C41532Kp;
import X.C55832qz;
import X.C57162tC;
import X.C624134x;
import X.C626936e;
import X.C64333Db;
import X.C64773Ex;
import X.C86164Jb;
import X.C86264Jl;
import X.C89644eZ;
import X.C95814uZ;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;
import com.whatsapp.ephemeral.ViewOnceNuxBottomSheet;
import com.whatsapp.mediaview.DeleteMessagesDialogFragment;
import java.util.Collections;
import java.util.Objects;

public class ViewOnceViewerActivity extends C89644eZ {
    public C64773Ex A00;
    public AnonymousClass5ZU A01;
    public C57162tC A02;
    public C29431io A03;
    public C29041iB A04;
    public ViewOnceAudioFragment A05;
    public ViewOnceTextFragment A06;
    public AnonymousClass2z0 A07;
    public C55832qz A08;
    public boolean A09;
    public final AnonymousClass4FW A0A;

    public void A5r() {
        if (!this.A09) {
            this.A09 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A08 = C64333Db.A8F(A002);
            this.A02 = (C57162tC) A002.AaV.get();
            this.A03 = C64333Db.A3K(A002);
            this.A04 = C64333Db.A3S(A002);
            this.A00 = C64333Db.A26(A002);
            this.A01 = C64333Db.A28(A002);
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem;
        C624134x A052 = this.A08.A05(this.A07);
        if (A052 == null) {
            this.A03.A0A("Expand VO: No message found", false, (String) null);
            return false;
        }
        C95814uZ A0n = A052.A0n();
        if (A0n == null || (findItem = menu.findItem(R.id.menu_report)) == null) {
            return true;
        }
        findItem.setTitle(getString(R.string.f11nameremoved, AnonymousClass000.A1b(C18300x5.A0h(this.A01, this.A00.A0A(A0n)))));
        return true;
    }

    public ViewOnceViewerActivity(int i) {
        this.A09 = false;
        AnonymousClass4HY.A00(this, 78);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C08310eF A0B = getSupportFragmentManager().A0B(R.id.view_once_fragment_container);
        if (A0B != null) {
            A0B.A0k(i, i2, intent);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        C08240dc r2;
        int i;
        C08310eF r0;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        getWindow().setFlags(DefaultCrypto.BUFFER_SIZE, DefaultCrypto.BUFFER_SIZE);
        AnonymousClass2z0 A022 = C107395bF.A02(getIntent());
        this.A07 = A022;
        if (A022 == null) {
            finish();
            return;
        }
        C624134x A052 = this.A08.A05(A022);
        C626936e.A06(A052);
        C08270df supportFragmentManager = getSupportFragmentManager();
        if (A052.A1I == 82) {
            str = "view_once_audio";
            ViewOnceAudioFragment viewOnceAudioFragment = (ViewOnceAudioFragment) supportFragmentManager.A0D(str);
            this.A05 = viewOnceAudioFragment;
            if (viewOnceAudioFragment == null) {
                AnonymousClass2z0 r22 = this.A07;
                ViewOnceAudioFragment viewOnceAudioFragment2 = new ViewOnceAudioFragment();
                Bundle A082 = AnonymousClass002.A08();
                C107395bF.A07(A082, r22);
                viewOnceAudioFragment2.A0u(A082);
                this.A05 = viewOnceAudioFragment2;
            }
            r2 = new C08240dc(supportFragmentManager);
            i = R.id.view_once_fragment_container;
            r0 = this.A05;
        } else {
            str = "view_once_text";
            ViewOnceTextFragment viewOnceTextFragment = (ViewOnceTextFragment) supportFragmentManager.A0D(str);
            this.A06 = viewOnceTextFragment;
            if (viewOnceTextFragment == null) {
                AnonymousClass2z0 r23 = this.A07;
                ViewOnceTextFragment viewOnceTextFragment2 = new ViewOnceTextFragment();
                Bundle A083 = AnonymousClass002.A08();
                C107395bF.A07(A083, r23);
                viewOnceTextFragment2.A0u(A083);
                this.A06 = viewOnceTextFragment2;
            }
            r2 = new C08240dc(supportFragmentManager);
            i = R.id.view_once_fragment_container;
            r0 = this.A06;
        }
        r2.A0E(r0, str, i);
        r2.A01();
        this.A03.A06(this.A0A);
        Toolbar A28 = AnonymousClass1Hf.A28(this);
        if (A28 != null) {
            A28.A07();
            Drawable A012 = C06130Wj.A01(AnonymousClass0VX.A01(this, R.drawable.ic_close));
            AnonymousClass0YG.A06(A012, -1);
            A28.setNavigationIcon(A012);
            setSupportActionBar(A28);
            if (getSupportActionBar() != null) {
                getSupportActionBar().A0Q(false);
                getSupportActionBar().A0N(true);
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.clear();
        menu.add(0, R.id.menu_view_once_info, 1, R.string.f11nameremoved).setIcon(C107335b8.A04(this, R.drawable.ic_viewonce, R.color.f5nameremoved)).setShowAsAction(1);
        menu.add(1, R.id.menu_delete, 0, R.string.f11nameremoved);
        menu.add(1, R.id.menu_report, 0, R.string.f11nameremoved);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A03.A07(this.A0A);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        C624134x A052 = this.A08.A05(this.A07);
        Objects.requireNonNull(A052);
        if (itemId == 16908332) {
            finish();
        } else if (itemId == R.id.menu_view_once_info) {
            ViewOnceNuxBottomSheet.A00(getSupportFragmentManager(), (C41532Kp) null, (C624134x) ((AnonymousClass4DU) A052), true);
            return true;
        } else if (itemId == R.id.menu_delete) {
            DeleteMessagesDialogFragment.A00(A052.A1J.A00, Collections.singletonList(A052)).A1O(getSupportFragmentManager(), (String) null);
            return true;
        } else if (itemId == R.id.menu_report) {
            this.A04.A08().A03(new C86264Jl(this, 16, A052));
            return true;
        }
        return true;
    }

    public ViewOnceViewerActivity() {
        this(0);
        this.A0A = new C86164Jb(this, 6);
    }
}
