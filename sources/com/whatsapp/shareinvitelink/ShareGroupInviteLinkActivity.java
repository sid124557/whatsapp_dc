package com.whatsapp.shareinvitelink;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass10M;
import X.AnonymousClass21X;
import X.AnonymousClass29Q;
import X.AnonymousClass2I6;
import X.AnonymousClass31C;
import X.AnonymousClass34R;
import X.AnonymousClass3TU;
import X.AnonymousClass493;
import X.AnonymousClass4AT;
import X.AnonymousClass4FV;
import X.AnonymousClass4SG;
import X.AnonymousClass5ZU;
import X.AnonymousClass6C6;
import X.C101145Dq;
import X.C104085Pp;
import X.C106715a2;
import X.C107695bk;
import X.C131696e2;
import X.C131706e3;
import X.C131716e4;
import X.C141426vY;
import X.C143916zg;
import X.C150907Sr;
import X.C159727mM;
import X.C18260x0;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C18320x8;
import X.C188678zJ;
import X.C27991fJ;
import X.C56072rN;
import X.C626936e;
import X.C634139d;
import X.C64333Db;
import X.C64773Ex;
import X.C66493Lq;
import X.C70143a1;
import X.C71293bs;
import X.C86604Kt;
import X.C86664Kz;
import X.C86904Mh;
import X.C88834as;
import X.C89144bm;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.growthlock.InviteLinkUnavailableDialogFragment;
import com.whatsapp.util.Log;
import java.util.EnumMap;

public class ShareGroupInviteLinkActivity extends C89144bm implements AnonymousClass493, AnonymousClass4AT {
    public C101145Dq A00;
    public C104085Pp A01;
    public C104085Pp A02;
    public C131696e2 A03;
    public C131716e4 A04;
    public C131706e3 A05;
    public TextEmojiLabel A06;
    public C64773Ex A07;
    public AnonymousClass5ZU A08;
    public AnonymousClass4FV A09;
    public C66493Lq A0A;
    public C27991fJ A0B;
    public AnonymousClass31C A0C;
    public AnonymousClass10M A0D;
    public C56072rN A0E;
    public C106715a2 A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public final BroadcastReceiver A0K;
    public final AnonymousClass2I6 A0L;

    public void BV9(int i, String str, boolean z) {
        A7E(true);
        A5n(false);
        StringBuilder A0o = AnonymousClass001.A0o();
        if (str != null) {
            A0o.append("invitelink/gotcode/");
            A0o.append(str);
            C18260x0.A1E(" recreate:", A0o, z);
            C66493Lq r0 = this.A0A;
            r0.A1F.put(this.A0B, str);
            A7D(str);
            if (z) {
                Bot(R.string.f11nameremoved);
                return;
            }
            return;
        }
        C18260x0.A0y("invitelink/failed/", A0o, i);
        if (i == 436) {
            Boo(InviteLinkUnavailableDialogFragment.A00(true, true));
            C66493Lq r02 = this.A0A;
            r02.A1F.remove(this.A0B);
            A7D((String) null);
            return;
        }
        this.A05.A0H(AnonymousClass29Q.A00(i, this.A0E.A06(this.A0B)), 0);
        if (TextUtils.isEmpty(this.A0H)) {
            finish();
        }
    }

    public void BkF() {
        C18260x0.A1E("invitelink/sendgetlink/recreate:", AnonymousClass001.A0o(), true);
        A7E(false);
        A5n(true);
        AnonymousClass3TU r1 = new AnonymousClass3TU(this.A05, this, this.A0C, true);
        C27991fJ r0 = this.A0B;
        C626936e.A06(r0);
        r1.A00(r0);
    }

    public void A5r() {
        if (!this.A0I) {
            this.A0I = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            this.A09 = C64333Db.A4H(r2);
            this.A0C = C64333Db.A5u(r2);
            this.A07 = C64333Db.A26(r2);
            this.A08 = C64333Db.A28(r2);
            this.A0E = C64333Db.A8w(r2);
            this.A0A = C64333Db.A5A(r2);
            this.A0F = C18280x3.A0Q(r1);
            this.A00 = (C101145Dq) A2W.A1r.get();
        }
    }

    public final void A7D(String str) {
        String A0V;
        this.A0H = str;
        if (TextUtils.isEmpty(str)) {
            A0V = null;
        } else {
            A0V = AnonymousClass000.A0V("https://chat.whatsapp.com/", str, AnonymousClass001.A0o());
        }
        if (!TextUtils.isEmpty(str)) {
            this.A02.setText(A0V);
            boolean A062 = this.A0E.A06(this.A0B);
            int i = R.string.f11nameremoved;
            if (A062) {
                i = R.string.f11nameremoved;
            }
            String A0X = AnonymousClass0x2.A0X(this, A0V, 1, i);
            C131716e4 r3 = this.A04;
            r3.A02 = A0X;
            r3.A01 = AnonymousClass002.A0F(this, this.A0G, new Object[1], 0, R.string.f11nameremoved);
            this.A04.A00 = getString(R.string.f11nameremoved);
            this.A05.A00 = A0X;
            this.A03.A00 = A0V;
            return;
        }
        A7E(false);
        this.A02.setText(" \n ");
    }

    public final void A7E(boolean z) {
        this.A02.setEnabled(z);
        this.A03.A00.setEnabled(z);
        this.A02.A00.setEnabled(z);
        this.A04.A00.setEnabled(z);
        this.A01.A00.setEnabled(z);
        this.A05.A00.setEnabled(z);
    }

    public ShareGroupInviteLinkActivity(int i) {
        this.A0I = false;
        C86604Kt.A1K(this, 101);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        A79();
        C131706e3 A78 = A78();
        this.A05 = A78;
        A78.A02 = new C70143a1(this, 43, C18290x4.A0b());
        C131696e2 A76 = A76();
        this.A03 = A76;
        A76.A02 = new C70143a1(this, 43, 1);
        C131716e4 A77 = A77();
        this.A04 = A77;
        A77.A02 = new C70143a1(this, 43, C18290x4.A0a());
        C104085Pp r1 = new C104085Pp();
        this.A01 = r1;
        r1.A00 = A75();
        this.A01.A00(new C634139d(this, 38), getString(R.string.f11nameremoved), R.drawable.ic_scan_qr);
        this.A01.A00.setVisibility(0);
        C104085Pp r12 = new C104085Pp();
        this.A02 = r12;
        r12.A00 = A75();
        this.A02.A00(new C634139d(this, 39), getString(R.string.f11nameremoved), R.drawable.ic_revoke_invite);
        C27991fJ A042 = AnonymousClass34R.A04(AnonymousClass0x7.A0l(this));
        C626936e.A06(A042);
        this.A0B = A042;
        C101145Dq r13 = this.A00;
        this.A0D = new AnonymousClass10M(C64333Db.A26(r13.A00.A03), A042, C64333Db.A8y(r13.A00.A03));
        this.A06 = C86664Kz.A0z(this, R.id.share_link_description);
        boolean A062 = this.A0E.A06(this.A0B);
        TextEmojiLabel textEmojiLabel = this.A06;
        if (A062) {
            textEmojiLabel.setText(R.string.f11nameremoved);
        } else {
            AnonymousClass0x2.A14(this.A0D, textEmojiLabel);
            this.A0J = true;
        }
        C18260x0.A1E("invitelink/sendgetlink/recreate:", AnonymousClass001.A0o(), false);
        AnonymousClass3TU r14 = new AnonymousClass3TU(this.A05, this, this.A0C, false);
        C27991fJ r0 = this.A0B;
        C626936e.A06(r0);
        r14.A00(r0);
        C18320x8.A0x(this.A0K, this, "android.nfc.action.ADAPTER_STATE_CHANGED", true);
        C66493Lq r02 = this.A0A;
        r02.A0q.A06(this.A0L);
        C86604Kt.A1M(this, this.A0D.A00, 349);
        AnonymousClass6C6.A01(this, this.A0D.A01, 346);
        C86604Kt.A1M(this, this.A0D.A04, 350);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (NfcAdapter.getDefaultAdapter(this) != null) {
            menu.add(0, R.id.menuitem_write_tag, 0, R.string.f11nameremoved);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.A0K);
        C66493Lq r0 = this.A0A;
        r0.A0q.A07(this.A0L);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_print) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("invitelink/printlink/");
            A0o.append(this.A0H);
            A0o.append(" jid:");
            C18260x0.A0o(this.A0B, A0o);
            if (!(this.A0B == null || this.A0H == null)) {
                try {
                    EnumMap enumMap = new EnumMap(C141426vY.class);
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("whatsapp://chat?code=");
                    C150907Sr r4 = C159727mM.A00(AnonymousClass21X.M, AnonymousClass000.A0X(this.A0H, A0o2), enumMap).A04;
                    String A0F2 = AnonymousClass002.A0F(this, this.A0G, new Object[1], 0, R.string.f11nameremoved);
                    C626936e.A0D(!(this instanceof Application), "Application context should not be used here");
                    PrintManager printManager = (PrintManager) getSystemService("print");
                    if (printManager == null) {
                        Log.e("invitelink/print/no-print-manager");
                        return true;
                    }
                    printManager.print(A0F2, new C86904Mh(this, r4, this.A0C, A0F2), (PrintAttributes) null);
                    return true;
                } catch (C143916zg e) {
                    Log.i("invitelink/", e);
                    return true;
                }
            }
        } else if (itemId != R.id.menuitem_write_tag) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("invitelink/writetag/");
            A0o3.append(this.A0H);
            A0o3.append(" jid:");
            C18260x0.A0o(this.A0B, A0o3);
            if (!(this.A0B == null || (str = this.A0H) == null)) {
                Intent A072 = C18320x8.A07();
                A072.setClassName(getPackageName(), "com.whatsapp.writenfctag.WriteNfcTagActivity");
                A072.putExtra("mime", "application/com.whatsapp.join");
                A072.putExtra("data", str);
                startActivity(A072);
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r1 == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPrepareOptionsMenu(android.view.Menu r4) {
        /*
            r3 = this;
            r0 = 2131431501(0x7f0b104d, float:1.8484733E38)
            android.view.MenuItem r2 = r4.findItem(r0)
            if (r2 == 0) goto L_0x001a
            android.nfc.NfcAdapter r0 = android.nfc.NfcAdapter.getDefaultAdapter(r3)
            if (r0 == 0) goto L_0x0016
            boolean r1 = r0.isEnabled()
            r0 = 1
            if (r1 != 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r2.setEnabled(r0)
        L_0x001a:
            boolean r0 = super.onPrepareOptionsMenu(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity.onPrepareOptionsMenu(android.view.Menu):boolean");
    }

    public void onResume() {
        super.onResume();
        A7D(C18310x6.A0o(this.A0B, this.A0A.A1F));
        if (this.A0J) {
            AnonymousClass10M r2 = this.A0D;
            C71293bs.A00(r2.A05, r2, 27);
        }
    }

    public ShareGroupInviteLinkActivity() {
        this(0);
        this.A0J = false;
        this.A0G = "";
        this.A0K = new C188678zJ(this, 5);
        this.A0L = new AnonymousClass2I6(this);
    }
}
