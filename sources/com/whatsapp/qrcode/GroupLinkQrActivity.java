package com.whatsapp.qrcode;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass29Q;
import X.AnonymousClass31C;
import X.AnonymousClass34R;
import X.AnonymousClass35W;
import X.AnonymousClass3DZ;
import X.AnonymousClass3TU;
import X.AnonymousClass3ZH;
import X.AnonymousClass493;
import X.AnonymousClass4AT;
import X.AnonymousClass4FS;
import X.AnonymousClass4HY;
import X.AnonymousClass5PT;
import X.C107335b8;
import X.C107695bk;
import X.C18260x0;
import X.C18310x6;
import X.C27991fJ;
import X.C33511tF;
import X.C56072rN;
import X.C56972sr;
import X.C620733j;
import X.C626936e;
import X.C633939b;
import X.C64333Db;
import X.C64393Dh;
import X.C64773Ex;
import X.C66493Lq;
import X.C69263Wi;
import X.C89644eZ;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.RevokeLinkConfirmationDialogFragment;
import com.whatsapp.growthlock.InviteLinkUnavailableDialogFragment;
import com.whatsapp.qrcode.contactqr.ContactQrContactCardView;

public class GroupLinkQrActivity extends C89644eZ implements AnonymousClass493, AnonymousClass4AT {
    public C64773Ex A00;
    public C620733j A01;
    public AnonymousClass3ZH A02;
    public C66493Lq A03;
    public C27991fJ A04;
    public AnonymousClass31C A05;
    public AnonymousClass5PT A06;
    public ContactQrContactCardView A07;
    public C56072rN A08;
    public String A09;
    public boolean A0A;

    public void BkF() {
        A74(true);
    }

    public void A5r() {
        if (!this.A0A) {
            this.A0A = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A05 = C64333Db.A5u(A002);
            this.A00 = C64333Db.A26(A002);
            this.A01 = C64333Db.A2t(A002);
            this.A08 = C64333Db.A8w(A002);
            this.A03 = C64333Db.A5A(A002);
        }
    }

    public final void A74(boolean z) {
        if (z) {
            BpA(0, R.string.f11nameremoved);
        }
        AnonymousClass3TU r1 = new AnonymousClass3TU(this.A05, this, this.A05, z);
        C27991fJ r0 = this.A04;
        C626936e.A06(r0);
        r1.A00(r0);
    }

    public void onStop() {
        this.A06.A00(getWindow());
        super.onStop();
    }

    public GroupLinkQrActivity(int i) {
        this.A0A = false;
        AnonymousClass4HY.A00(this, 100);
    }

    public static final String A0C(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return AnonymousClass000.A0V("https://chat.whatsapp.com/", str, AnonymousClass001.A0o());
    }

    public void BV9(int i, String str, boolean z) {
        BjL();
        StringBuilder A0o = AnonymousClass001.A0o();
        if (str != null) {
            A0o.append("invitelink/gotcode/");
            A0o.append(str);
            C18260x0.A1E(" recreate:", A0o, z);
            C66493Lq r0 = this.A03;
            r0.A1F.put(this.A04, str);
            this.A09 = str;
            this.A07.setQrCode(A0C(str));
            if (z) {
                Bot(R.string.f11nameremoved);
                return;
            }
            return;
        }
        C18260x0.A0y("invitelink/failed/", A0o, i);
        if (i == 436) {
            Boo(InviteLinkUnavailableDialogFragment.A00(true, true));
            C66493Lq r02 = this.A03;
            r02.A1F.remove(this.A04);
            return;
        }
        this.A05.A0H(AnonymousClass29Q.A00(i, this.A08.A06(this.A04)), 0);
        if (TextUtils.isEmpty(this.A09)) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        Toolbar A28 = AnonymousClass1Hf.A28(this);
        C18260x0.A0E(this, getResources(), A28, this.A01, R.drawable.ic_back);
        A28.setTitle((int) R.string.f11nameremoved);
        A28.setNavigationOnClickListener(new C633939b(this, 49));
        setSupportActionBar(A28);
        setTitle(R.string.f11nameremoved);
        C27991fJ A042 = AnonymousClass34R.A04(AnonymousClass0x7.A0l(this));
        C626936e.A06(A042);
        this.A04 = A042;
        this.A02 = this.A00.A0A(A042);
        ContactQrContactCardView contactQrContactCardView = (ContactQrContactCardView) findViewById(R.id.group_qr_card);
        this.A07 = contactQrContactCardView;
        contactQrContactCardView.A02(this.A02, true);
        this.A07.setStyle(0);
        boolean A062 = this.A08.A06(this.A04);
        ContactQrContactCardView contactQrContactCardView2 = this.A07;
        int i = R.string.f11nameremoved;
        if (A062) {
            i = R.string.f11nameremoved;
        }
        contactQrContactCardView2.setPrompt(getString(i));
        this.A06 = new AnonymousClass5PT();
        String A0o = C18310x6.A0o(this.A04, this.A03.A1F);
        this.A09 = A0o;
        if (!TextUtils.isEmpty(A0o)) {
            this.A07.setQrCode(A0C(this.A09));
        }
        A74(false);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_contactqr_share, 0, R.string.f11nameremoved).setIcon(C107335b8.A04(this, R.drawable.ic_share, R.color.f5nameremoved)).setShowAsAction(2);
        menu.add(0, R.id.menuitem_contactqr_revoke, 0, R.string.f11nameremoved);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_contactqr_share) {
            if (this.A09 == null) {
                A74(false);
                this.A05.A0H(R.string.f11nameremoved, 0);
                return true;
            }
            boolean A062 = this.A08.A06(this.A04);
            Bp9(R.string.f11nameremoved);
            AnonymousClass4FS r5 = this.A04;
            C69263Wi r11 = this.A05;
            C56972sr r12 = this.A01;
            C64393Dh r10 = this.A04;
            int i = R.string.f11nameremoved;
            if (A062) {
                i = R.string.f11nameremoved;
            }
            C33511tF r8 = new C33511tF(this, r10, r11, r12, AnonymousClass002.A0F(this, A0C(this.A09), new Object[1], 0, i));
            Bitmap[] bitmapArr = new Bitmap[1];
            AnonymousClass3ZH r3 = this.A02;
            String A0C = A0C(this.A09);
            int i2 = R.string.f11nameremoved;
            if (A062) {
                i2 = R.string.f11nameremoved;
            }
            bitmapArr[0] = AnonymousClass35W.A00(this, r3, A0C, getString(i2), true);
            r5.BkL(r8, bitmapArr);
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_contactqr_revoke) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            Boo(RevokeLinkConfirmationDialogFragment.A00(this.A04, true));
            return true;
        }
    }

    public void onStart() {
        super.onStart();
        this.A06.A01(getWindow(), this.A08);
    }

    public GroupLinkQrActivity() {
        this(0);
    }
}
