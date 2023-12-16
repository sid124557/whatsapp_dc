package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.4fT  reason: invalid class name and case insensitive filesystem */
public abstract class C89904fT extends AnonymousClass5c4 implements C185008su {
    public AnonymousClass3ZH A00;
    public final C009707r A01;
    public final C116985rC A02;
    public final C116985rC A03;
    public final C116985rC A04;
    public final AnonymousClass4FU A05;
    public final C69263Wi A06;
    public final C56972sr A07;
    public final C66663Mh A08;
    public final C621033m A09;
    public final AnonymousClass5MG A0A;
    public final AnonymousClass5TW A0B;
    public final C54232oO A0C = new C1233167y(this, 6);
    public final C29301ib A0D;
    public final C46342bT A0E;
    public final AnonymousClass5HS A0F;
    public final AnonymousClass5IR A0G;
    public final AnonymousClass5OT A0H;
    public final C56602sG A0I = AnonymousClass681.A00(this, 17);
    public final C29421in A0J;
    public final AnonymousClass67A A0K;
    public final C113905mB A0L;
    public final AnonymousClass33p A0M;
    public final C620733j A0N;
    public final C56982ss A0O;
    public final C66473Lo A0P;
    public final C29041iB A0Q;
    public final AnonymousClass1VX A0R;
    public final AnonymousClass3LP A0S;
    public final C55702qm A0T = new AnonymousClass687(this, 7);
    public final C29241iV A0U;
    public final C95814uZ A0V;
    public final C50452iC A0W;
    public final AnonymousClass1R1 A0X;
    public final C50282hv A0Y;
    public final AnonymousClass4FS A0Z;

    public int A03() {
        AnonymousClass1R1 r0 = this.A0X;
        C95814uZ r2 = this.A0V;
        if (!r0.A0h(r2)) {
            if (C622334f.A01(this.A0M, this.A0O, r2)) {
                return R.string.f11nameremoved;
            }
            return R.string.f11nameremoved;
        }
        return R.string.f11nameremoved;
    }

    public MenuItem A04(Menu menu, int i, int i2, int i3) {
        if (menu == null) {
            return null;
        }
        MenuItem add = menu.add(0, i, 0, i2);
        AnonymousClass1VX r2 = this.A0R;
        if (!C106545Zk.A00(r2)) {
            return add;
        }
        add.setIcon(C107335b8.A05(this.A01, i3, C106545Zk.A03(r2)));
        return add;
    }

    public void A05(MenuItem menuItem) {
        C009707r r4 = this.A01;
        SpannableString A0A2 = AnonymousClass4L0.A0A(r4.getString(A03()));
        C95814uZ r2 = this.A0V;
        if (C622334f.A01(this.A0M, this.A0O, r2)) {
            A0A2.setSpan(C86634Kw.A0I(r4, R.color.f5nameremoved), 0, A0A2.length(), 0);
        }
        menuItem.setTitle(A0A2);
    }

    public void BQQ(Menu menu) {
        if ((menu instanceof C07890cz) && C106545Zk.A00(this.A0R)) {
            ((C07890cz) menu).A0H = true;
        }
        Log.i("listconversationmenu/oncreateoptionsmenu");
        A04(menu, 21, R.string.f11nameremoved, R.drawable.vec_ic_receipt_24dp);
        A04(menu, 6, R.string.f11nameremoved, R.drawable.ic_settings_media);
        A04(menu, 7, R.string.f11nameremoved, R.drawable.ic_action_search);
        A04(menu, 5, R.string.f11nameremoved, R.drawable.ic_settings_wallpaper);
        SubMenu addSubMenu = menu.addSubMenu(0, 1, 0, R.string.f11nameremoved);
        addSubMenu.clearHeader();
        A01(addSubMenu, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        X.C627336j.A0D(r2, r3, r0);
        r4.startActivity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0083, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BXQ(android.view.MenuItem r13) {
        /*
            r12 = this;
            X.2bT r1 = r12.A0E
            r0 = 6
            r1.A01 = r0
            int r1 = r13.getItemId()
            r0 = 12
            r5 = 1
            if (r1 == r0) goto L_0x00d0
            r2 = 14
            if (r1 == r2) goto L_0x00ad
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            if (r1 == r0) goto L_0x00a7
            r0 = 0
            switch(r1) {
                case 2: goto L_0x001c;
                case 3: goto L_0x0026;
                case 4: goto L_0x00f9;
                case 5: goto L_0x003d;
                case 6: goto L_0x006a;
                case 7: goto L_0x0084;
                case 8: goto L_0x002d;
                case 9: goto L_0x009c;
                case 10: goto L_0x008a;
                default: goto L_0x001b;
            }
        L_0x001b:
            return r0
        L_0x001c:
            X.5HS r0 = r12.A0F
            X.3DP r1 = r0.A00
            X.3ZH r0 = r0.A01
            r1.A05(r0)
            goto L_0x003b
        L_0x0026:
            X.5OT r0 = r12.A0H
            boolean r0 = r0.A00()
            return r0
        L_0x002d:
            X.5IR r0 = r12.A0G
            X.5pz r2 = new X.5pz
            r2.<init>(r0)
            X.5Qq r1 = r0.A02
            X.4uZ r0 = r0.A01
            r1.A01(r0, r2)
        L_0x003b:
            r0 = 1
            return r0
        L_0x003d:
            java.lang.String r0 = "conversation/menu/wallpaper/"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.07r r4 = r12.A01
            X.4uZ r3 = r12.A0V
            if (r3 == 0) goto L_0x005f
            boolean r0 = X.C107405bG.A0D(r4)
            if (r0 != 0) goto L_0x005f
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.wallpaper.WallpaperCategoriesActivity"
        L_0x0058:
            android.content.Intent r2 = r2.setClassName(r1, r0)
            java.lang.String r0 = "chat_jid"
            goto L_0x007d
        L_0x005f:
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity"
            goto L_0x0058
        L_0x006a:
            X.07r r4 = r12.A01
            X.4uZ r3 = r12.A0V
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.gallery.MediaGalleryActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "jid"
        L_0x007d:
            X.C627336j.A0D(r2, r3, r0)
            r4.startActivity(r2)
            return r5
        L_0x0084:
            X.07r r0 = r12.A01
            r0.onSearchRequested()
            return r5
        L_0x008a:
            X.5rC r1 = r12.A02
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x011e
            r1.A04()
            java.lang.String r0 = "exportChatMessages"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x009c:
            X.1iB r0 = r12.A0Q
            X.3XA r1 = r0.A08()
            r0 = 4
            X.C124266Bp.A00(r1, r12, r0)
            return r5
        L_0x00a7:
            X.07r r0 = r12.A01
            r0.finish()
            return r5
        L_0x00ad:
            r1 = 2131890247(0x7f121047, float:1.941518E38)
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0U()
            X.5OS r1 = X.C1001459r.A00(r0, r2, r1)
            r0 = 2131895595(0x7f12252b, float:1.9426027E38)
            r1.A01 = r0
            r0 = 2131891183(0x7f1213ef, float:1.9417079E38)
            r1.A03 = r0
            com.whatsapp.MessageDialogFragment r1 = r1.A00()
            X.07r r0 = r12.A01
            X.0df r0 = r0.getSupportFragmentManager()
            X.AnonymousClass344.A00(r1, r0)
            return r5
        L_0x00d0:
            X.4FS r1 = r12.A0Z
            r0 = 11
            X.C117085rM.A01(r1, r12, r0)
            X.4uZ r3 = r12.A0V
            boolean r0 = r3 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x011e
            X.2hv r0 = r12.A0Y
            r1 = r3
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            boolean r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x011e
            X.07r r2 = r12.A01
            X.2ss r0 = r12.A0O
            int r1 = r0.A04(r1)
            r0 = 3
            android.content.Intent r0 = X.C627736r.A0R(r2, r3, r1, r0)
            r2.startActivity(r0)
            return r5
        L_0x00f9:
            X.4uZ r9 = r12.A0V
            X.2ss r1 = r12.A0O
            X.33p r0 = r12.A0M
            boolean r0 = X.C622334f.A01(r0, r1, r9)
            if (r0 == 0) goto L_0x011f
            X.07r r6 = r12.A01
            X.33m r8 = r12.A09
            r0 = 2131430204(0x7f0b0b3c, float:1.8482102E38)
            android.view.View r7 = r6.findViewById(r0)
            java.lang.Integer r10 = X.C18290x4.A0b()
            r0 = 2131886459(0x7f12017b, float:1.9407497E38)
            java.lang.String r11 = r6.getString(r0)
            X.C622334f.A00(r6, r7, r8, r9, r10, r11)
        L_0x011e:
            return r5
        L_0x011f:
            X.1R1 r0 = r12.A0X
            boolean r0 = r0.A0h(r9)
            if (r0 == 0) goto L_0x012f
            X.4FS r1 = r12.A0Z
            r0 = 10
            X.C117085rM.A01(r1, r12, r0)
            return r5
        L_0x012f:
            X.21R r0 = X.AnonymousClass21R.CONVERSATION_SCREEN
            com.whatsapp.mute.ui.MuteDialogFragment r2 = X.C57402ta.A00(r9, r0)
            X.07r r0 = r12.A01
            X.0df r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = "MuteDialogFragment"
            r2.A1O(r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89904fT.BXQ(android.view.MenuItem):boolean");
    }

    public boolean BYj(Menu menu) {
        boolean BFK = this.A0K.BFK();
        A00(menu, 8, BFK);
        A00(menu, 7, BFK);
        A00(menu, 3, BFK);
        A00(menu, 9, true);
        MenuItem findItem = menu.findItem(1);
        if (findItem != null) {
            SubMenu subMenu = findItem.getSubMenu();
            A00(subMenu, 10, BFK);
            findItem.setVisible(subMenu.hasVisibleItems());
        }
        return true;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.A0J.A06(this.A0I);
        this.A0D.A06(this.A0C);
        this.A0U.A06(this.A0T);
    }

    public void onActivityDestroyed(Activity activity) {
        this.A0J.A07(this.A0I);
        this.A0D.A07(this.A0C);
        this.A0U.A07(this.A0T);
    }

    public C89904fT(C009707r r5, C116985rC r6, C116985rC r7, C116985rC r8, AnonymousClass5M8 r9, AnonymousClass5M9 r10, C101365Em r11, AnonymousClass4FU r12, C69263Wi r13, C56972sr r14, C66663Mh r15, C621033m r16, AnonymousClass5MG r17, AnonymousClass5TW r18, C29301ib r19, C46342bT r20, C29421in r21, AnonymousClass67A r22, C113905mB r23, AnonymousClass33p r24, C620733j r25, C56982ss r26, C66473Lo r27, AnonymousClass3ZH r28, C29041iB r29, AnonymousClass1VX r30, AnonymousClass3LP r31, C29241iV r32, C95814uZ r33, C50452iC r34, AnonymousClass1R1 r35, C50282hv r36, AnonymousClass4FS r37) {
        this.A0R = r30;
        this.A01 = r5;
        this.A05 = r12;
        this.A0K = r22;
        this.A06 = r13;
        this.A07 = r14;
        this.A0Z = r37;
        this.A0O = r26;
        this.A04 = r6;
        this.A08 = r15;
        this.A09 = r16;
        this.A0S = r31;
        this.A0B = r18;
        this.A0N = r25;
        this.A0A = r17;
        this.A0W = r34;
        this.A0E = r20;
        this.A0J = r21;
        this.A03 = r7;
        this.A0L = r23;
        this.A0X = r35;
        this.A0D = r19;
        this.A0M = r24;
        this.A0Q = r29;
        this.A0P = r27;
        this.A0Y = r36;
        this.A0U = r32;
        this.A02 = r8;
        C95814uZ r3 = r33;
        this.A0V = r3;
        AnonymousClass3ZH r2 = r28;
        this.A00 = r2;
        this.A0G = new AnonymousClass5IR(r5, r3, C107695bk.A5a(r9.A00.A03));
        this.A0H = r10.A00(r5, r12, r2, r3);
        this.A0F = new AnonymousClass5HS((AnonymousClass3DP) r11.A00.A03.Aak.get(), r2);
    }

    public static void A00(Menu menu, int i, boolean z) {
        MenuItem findItem = menu.findItem(i);
        if (findItem != null) {
            findItem.setVisible(z);
        }
    }

    public static void A01(Menu menu, C89904fT r4) {
        r4.A04(menu, 8, R.string.f11nameremoved, R.drawable.ic_settings_clearchat);
        if (r4.A08.A08(C66663Mh.A0J)) {
            r4.A04(menu, 3, R.string.f11nameremoved, R.drawable.ic_settings_export);
        }
        r4.A04(menu, 2, R.string.f11nameremoved, R.drawable.ic_spam_add);
    }

    public void A06(MenuItem menuItem, int i, boolean z) {
        C109885fL r0;
        View actionView = menuItem.getActionView();
        float f = 0.4f;
        if (z) {
            f = 1.0f;
        }
        actionView.setAlpha(f);
        actionView.setEnabled(z);
        if (z) {
            if (!C620733j.A04(this.A0N)) {
                r0 = new C109885fL(0.2f, 0.0f, 0.0f, 0.0f);
            }
            actionView.setOnTouchListener(r0);
            C18290x4.A1I(actionView, this, menuItem, 46);
            actionView.setOnLongClickListener(new C109835fG(this, i));
        }
    }
}
