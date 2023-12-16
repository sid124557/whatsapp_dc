package com.whatsapp.conversationslist;

import X.AnonymousClass0O1;
import X.AnonymousClass0R2;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass4SG;
import X.AnonymousClass5AS;
import X.AnonymousClass5UK;
import X.AnonymousClass5ZC;
import X.AnonymousClass68W;
import X.C05880Vi;
import X.C08240dc;
import X.C106405Yw;
import X.C106545Zk;
import X.C106995aW;
import X.C107335b8;
import X.C107405bG;
import X.C107695bk;
import X.C107895c5;
import X.C117625sE;
import X.C162457s7;
import X.C18270x1;
import X.C18320x8;
import X.C58152un;
import X.C619933b;
import X.C627736r;
import X.C64333Db;
import X.C71703cX;
import X.C86624Kv;
import X.C86654Ky;
import X.C86664Kz;
import X.C89644eZ;
import X.C95814uZ;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;

public final class LockedConversationsActivity extends C89644eZ {
    public Intent A00;
    public AnonymousClass0O1 A01;
    public C107895c5 A02;
    public C106995aW A03;
    public AnonymousClass5UK A04;
    public C619933b A05;
    public Integer A06;
    public boolean A07;

    public void Bdh(AnonymousClass0R2 r2) {
        C162457s7.A0J(r2, 0);
        super.Bdh(r2);
        C107405bG.A04(this);
    }

    public void Bdi(AnonymousClass0R2 r2) {
        C162457s7.A0J(r2, 0);
        super.Bdi(r2);
        AnonymousClass4SG.A34(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C162457s7.A0J(menuItem, 0);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            Intent A072 = C18320x8.A07();
            A072.setClassName(getPackageName(), "com.whatsapp.chatlock.ChatLockSettingsActivity");
            startActivity(A072);
            AnonymousClass5UK r0 = this.A04;
            if (r0 != null) {
                r0.A00(0);
                return true;
            }
            throw C18270x1.A0S("chatLockLogger");
        } else if (itemId != 16908332) {
            return false;
        } else {
            A76();
            return true;
        }
    }

    public void A5r() {
        if (!this.A07) {
            this.A07 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A04 = (AnonymousClass5UK) A2Y.A4p.get();
            this.A03 = C86654Ky.A0V(A2Y);
            this.A05 = C86624Kv.A0V(A2Y);
            this.A02 = (C107895c5) r1.A0I.get();
        }
    }

    public final C106995aW A74() {
        C106995aW r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("chatLockManager");
    }

    public final void A75() {
        C619933b r4 = this.A05;
        if (r4 != null) {
            r4.A03().post(new C71703cX(r4, 47, true));
            r4.A06();
            C08240dc A0J = AnonymousClass0x2.A0J(this);
            A0J.A0E(new LockedConversationsFragment(), "LockedConversationsFragment", R.id.container);
            A0J.A01();
            return;
        }
        throw C18270x1.A0S("messageNotification");
    }

    public final void A77(C95814uZ r6, Integer num) {
        int i;
        this.A06 = num;
        A74().A00 = true;
        Boolean bool = Boolean.FALSE;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 8;
        }
        Intent A072 = C18320x8.A07();
        A072.setClassName(getPackageName(), "com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity");
        if (r6 != null) {
            AnonymousClass0x2.A0u(A072, r6, "extra_chat_jid");
        }
        A072.putExtra("extra_open_chat_directly", bool);
        A072.putExtra("extra_unlock_entry_point", i);
        AnonymousClass0O1 r1 = this.A01;
        if (r1 == null) {
            throw C18270x1.A0S("reauthenticationLauncher");
        }
        r1.A00((C05880Vi) null, A072);
    }

    public AnonymousClass5ZC BCP() {
        AnonymousClass5ZC r0 = C58152un.A02;
        C162457s7.A0F(r0);
        return r0;
    }

    public void onRestart() {
        this.A04.BkM(C117625sE.A00(this, 48));
        super.onRestart();
    }

    public void onWindowFocusChanged(boolean z) {
        Window window = getWindow();
        if (z) {
            window.clearFlags(DefaultCrypto.BUFFER_SIZE);
        } else {
            window.addFlags(DefaultCrypto.BUFFER_SIZE);
        }
        super.onWindowFocusChanged(z);
    }

    public LockedConversationsActivity(int i) {
        this.A07 = false;
        AnonymousClass68W.A00(this, 50);
    }

    public final void A76() {
        Intent intent;
        if ((!isTaskRoot() || C162457s7.A0P(getComponentName().getClassName(), "com.whatsapp.HomeActivity")) && ((intent = getIntent()) == null || !intent.getBooleanExtra("extra_from_lock_chat_helper", false))) {
            finish();
            return;
        }
        Intent A022 = C627736r.A02(this);
        Intent intent2 = getIntent();
        boolean z = false;
        if (intent2 != null) {
            z = intent2.getBooleanExtra("extra_from_lock_chat_helper", false);
        }
        A022.putExtra("extra_from_lock_chat_helper", z);
        finishAndRemoveTask();
        startActivity(A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0051, code lost:
        if (r6.A04.A07() == false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            X.03v r2 = new X.03v
            r2.<init>()
            r1 = 5
            X.5bZ r0 = new X.5bZ
            r0.<init>(r6, r1)
            X.0O1 r0 = r6.Bid(r0, r2)
            r6.A01 = r0
            r0 = 2131890554(0x7f12117a, float:1.9415803E38)
            java.lang.String r0 = r6.getString(r0)
            r6.setTitle(r0)
            X.0R8 r0 = r6.getSupportActionBar()
            r4 = 1
            if (r0 == 0) goto L_0x0028
            r0.A0N(r4)
        L_0x0028:
            r0 = 2131625345(0x7f0e0581, float:1.8877895E38)
            r6.setContentView((int) r0)
            X.5aW r0 = r6.A74()
            r1 = 0
            r0.A0E(r1)
            if (r7 != 0) goto L_0x007d
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r5 = "fromNotification"
            boolean r0 = r0.getBooleanExtra(r5, r1)
            if (r0 == 0) goto L_0x0086
            boolean r0 = r6.A70()
            if (r0 == 0) goto L_0x0053
            X.5Ug r0 = r6.A04
            boolean r0 = r0.A07()
            r3 = 1
            if (r0 != 0) goto L_0x0054
        L_0x0053:
            r3 = 0
        L_0x0054:
            X.5Yw r1 = X.C95814uZ.A00
            java.lang.String r0 = X.AnonymousClass0x7.A0l(r6)
            X.4uZ r2 = r1.A05(r0)
            if (r3 == 0) goto L_0x007e
            X.5aW r0 = r6.A74()
            r0.A01 = r4
            r6.A75()
            if (r2 == 0) goto L_0x007d
            X.36r r1 = X.C86664Kz.A1B()
            r0 = 2
            android.content.Intent r0 = r1.A1O(r6, r2, r0)
            X.C162457s7.A0D(r0)
            r0.putExtra(r5, r4)
            r6.startActivity(r0)
        L_0x007d:
            return
        L_0x007e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r6.A77(r2, r0)
            return
        L_0x0086:
            X.5aW r0 = r6.A74()
            r0.A01 = r4
            r6.A75()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.LockedConversationsActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItem;
        if (A74().A04.A0X(5854)) {
            if (menu != null) {
                menuItem = menu.add(0, 0, 0, R.string.f11nameremoved);
            } else {
                menuItem = null;
            }
            if (C106545Zk.A00(this.A0D) && menuItem != null) {
                menuItem.setIcon(C107335b8.A05(this, R.drawable.ic_settings_settings, C106545Zk.A03(this.A0D)));
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        A74().A05((AnonymousClass5AS) null).Aya();
    }

    public void onNewIntent(Intent intent) {
        String str;
        super.onNewIntent(intent);
        C106405Yw r1 = C95814uZ.A00;
        Boolean bool = null;
        if (intent != null) {
            str = intent.getStringExtra("jid");
        } else {
            str = null;
        }
        C95814uZ A052 = r1.A05(str);
        if (A052 != null) {
            int i = 0;
            if (intent != null) {
                bool = Boolean.valueOf(intent.getBooleanExtra("fromNotification", false));
            }
            if (AnonymousClass0x9.A1Q(bool)) {
                i = 2;
            }
            if (!A74().A00) {
                Intent A1O = C86664Kz.A1B().A1O(this, A052, i);
                C162457s7.A0D(A1O);
                A1O.putExtra("fromNotification", bool);
                startActivity(A1O);
                return;
            }
            this.A00 = intent;
        }
    }

    public void onBackPressed() {
        A76();
    }

    public LockedConversationsActivity() {
        this(0);
    }
}
