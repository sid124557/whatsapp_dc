package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.4hW  reason: invalid class name and case insensitive filesystem */
public abstract class C90504hW extends C131766e9 {
    public RecyclerView A00;
    public C101015Dd A01;
    public C620433g A02;
    public C29291ia A03;
    public C29201iR A04;
    public AnonymousClass5UW A05;
    public C181728nE A06;
    public C87604Ty A07;
    public C29211iS A08;
    public C29221iT A09;
    public C105405Uu A0A;
    public AnonymousClass7KG A0B;
    public C105145Tt A0C;
    public AnonymousClass5Y9 A0D;
    public C151257Ua A0E;
    public C152967aS A0F;
    public C181798nL A0G;
    public C90264gz A0H;
    public C87614Tz A0I;
    public C56602sG A0J = new C189088zy(this, 0);
    public C29421in A0K;
    public C47882dz A0L;
    public UserJid A0M;
    public C105255Ue A0N;
    public AnonymousClass7SU A0O;
    public AnonymousClass7SV A0P;
    public String A0Q;
    public boolean A0R;
    public boolean A0S;
    public final AnonymousClass4CK A0T = new AnonymousClass930(this, 2);
    public final AnonymousClass2UT A0U = new C189028zs(this, 0);
    public final AnonymousClass4CO A0V = new C111765ie(this);
    public final C50642iX A0W = new C189038zt(this, 0);

    public final void A74() {
        C105145Tt r2 = this.A0C;
        AnonymousClass5P6 A002 = AnonymousClass5P6.A00(r2);
        AnonymousClass5P6.A04(A002, this.A0C);
        AnonymousClass5P6.A02(A002, 32);
        AnonymousClass5P6.A03(A002, 50);
        AnonymousClass5P6.A01(this.A0I.A0O.A03, A002);
        A002.A00 = this.A0M;
        r2.A03(A002);
        C87614Tz r0 = this.A0I;
        Boo(r0.A0U.A00(r0.A0T, (String) null, 0));
    }

    public void A75(List list) {
        this.A0Q = this.A07.A0D(this.A00, list);
        Set A012 = C87604Ty.A01(this.A0H.A08, list);
        List list2 = this.A0H.A08;
        list2.clear();
        list2.addAll(list);
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            this.A09.A08(AnonymousClass001.A0m(it));
        }
        invalidateOptionsMenu();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 3000) {
            super.onActivityResult(i, i2, intent);
        } else if (intent != null && C86664Kz.A07(intent, "get_collection_error_code") == 404) {
            this.A0I.A0D(this.A0M);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00fa, code lost:
        if (r2 != false) goto L_0x00fc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r27) {
        /*
            r26 = this;
            r0 = r26
            r3 = r27
            super.onCreate(r3)
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r2 = "is_prefetched_catalog"
            r1 = 0
            boolean r2 = r4.getBooleanExtra(r2, r1)
            if (r2 != 0) goto L_0x0020
            X.5Ue r6 = r0.A0N
            java.lang.String r5 = "catalog_collections_view_tag"
            java.lang.String r4 = "CatalogListBaseActivity"
            r2 = 774781666(0x2e2e3ae2, float:3.9615318E-11)
            r6.A02(r2, r5, r4)
        L_0x0020:
            X.1iR r4 = r0.A04
            X.2UT r2 = r0.A0U
            r4.A06(r2)
            X.7Ua r5 = r0.A0E
            X.7SV r4 = r0.A0P
            X.7aS r2 = new X.7aS
            r2.<init>(r5, r4)
            r0.A0F = r2
            r2 = 2131624240(0x7f0e0130, float:1.8875654E38)
            r0.setContentView((int) r2)
            r2 = 2131434053(0x7f0b1a45, float:1.848991E38)
            android.view.ViewStub r2 = X.C86664Kz.A0o(r0, r2)
            r2.inflate()
            androidx.appcompat.widget.Toolbar r2 = X.AnonymousClass1Hf.A28(r0)
            r0.setSupportActionBar(r2)
            r2 = 2131428244(0x7f0b0394, float:1.8478127E38)
            android.view.View r4 = r0.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r0.A00 = r4
            X.93K r2 = new X.93K
            r2.<init>(r1)
            r4.A0W = r2
            X.0R8 r4 = r0.getSupportActionBar()
            if (r4 == 0) goto L_0x006b
            r2 = 1
            r4.A0N(r2)
            r2 = 2131887165(0x7f12043d, float:1.940893E38)
            r4.A0B(r2)
        L_0x006b:
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r2 = "cache_jid"
            java.lang.String r2 = r4.getStringExtra(r2)
            com.whatsapp.jid.UserJid r2 = X.C86624Kv.A0U(r2)
            r0.A0M = r2
            X.1iT r4 = r0.A09
            X.2iX r2 = r0.A0W
            r4.A06(r2)
            X.1iS r4 = r0.A08
            X.4CO r2 = r0.A0V
            r4.A06(r2)
            com.whatsapp.jid.UserJid r4 = r0.A0M
            X.8nE r2 = r0.A06
            X.0Ty r2 = X.C86604Kt.A0L(r0, r2, r4)
            X.4Ty r2 = (X.C87604Ty) r2
            r0.A07 = r2
            com.whatsapp.jid.UserJid r6 = r0.A0M
            X.8nL r2 = r0.A0G
            X.5Qn r5 = r2.Azv(r6)
            X.5Dd r4 = r0.A01
            X.5gh r2 = new X.5gh
            r2.<init>(r4, r5, r6)
            X.0XL r4 = X.AnonymousClass4L0.A0F(r2, r0)
            java.lang.Class<X.4Tz> r2 = X.C87614Tz.class
            X.0Ty r2 = r4.A01(r2)
            X.4Tz r2 = (X.C87614Tz) r2
            r0.A0I = r2
            X.5Y9 r2 = r2.A0N
            X.08M r4 = r2.A04
            r2 = 24
            X.C86604Kt.A1M(r0, r4, r2)
            X.4Tz r10 = r0.A0I
            com.whatsapp.jid.UserJid r9 = r0.A0M
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r2 = "entry_point"
            int r8 = r4.getIntExtra(r2, r1)
            X.5Ue r7 = r10.A0V
            X.2sr r2 = r10.A0E
            boolean r2 = r2.A0a(r9)
            r6 = 1
            r4 = r2 ^ 1
            java.lang.String r5 = "catalog_collections_view_tag"
            java.lang.String r2 = "IsConsumer"
            r7.A07(r5, r4, r2)
            X.5Uu r4 = r10.A0K
            boolean r2 = r4.A0J(r9)
            if (r2 != 0) goto L_0x00fc
            X.C162457s7.A0J(r9, r1)
            monitor-enter(r4)
            X.7OX r2 = X.C105405Uu.A00(r4, r9)     // Catch:{ all -> 0x00f6 }
            if (r2 != 0) goto L_0x00ef
            goto L_0x0269
        L_0x00ef:
            java.util.List r2 = r2.A04     // Catch:{ all -> 0x00f6 }
            boolean r2 = X.C18310x6.A1X(r2)     // Catch:{ all -> 0x00f6 }
            goto L_0x00f9
        L_0x00f6:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x00f9:
            monitor-exit(r4)
            if (r2 == 0) goto L_0x026a
        L_0x00fc:
            java.lang.String r2 = "Cached"
            r7.A07(r5, r6, r2)
            switch(r8) {
                case 1: goto L_0x0260;
                case 2: goto L_0x025d;
                case 3: goto L_0x025a;
                case 4: goto L_0x0257;
                case 5: goto L_0x0254;
                case 6: goto L_0x0251;
                case 7: goto L_0x024e;
                case 8: goto L_0x024b;
                case 9: goto L_0x0248;
                case 10: goto L_0x0245;
                case 11: goto L_0x0242;
                case 12: goto L_0x023f;
                case 13: goto L_0x023c;
                case 14: goto L_0x0239;
                default: goto L_0x0104;
            }
        L_0x0104:
            java.lang.String r2 = "CatalogListBaseActivity unhandled entry point in setCatalogViewQplAnnotations"
            com.whatsapp.util.Log.d((java.lang.String) r2)
        L_0x0109:
            r7 = r0
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity r7 = (com.whatsapp.biz.catalog.view.activity.CatalogListActivity) r7
            X.5Dj r2 = r7.A02
            com.whatsapp.jid.UserJid r5 = r7.A0M
            X.7aS r13 = r7.A0F
            X.4Tz r15 = r7.A0I
            X.5aJ r4 = new X.5aJ
            r4.<init>(r7, r1)
            X.5sx r2 = r2.A00
            X.3Db r2 = r2.A03
            X.1VX r23 = X.C64333Db.A4B(r2)
            X.5hX r8 = X.C64333Db.A00(r2)
            X.4C1 r6 = r2.A4W
            java.lang.Object r11 = r6.get()
            X.5Uu r11 = (X.C105405Uu) r11
            X.4C1 r6 = r2.A4Y
            java.lang.Object r12 = r6.get()
            X.5Y9 r12 = (X.AnonymousClass5Y9) r12
            X.3Ex r18 = X.C64333Db.A26(r2)
            X.2sr r9 = X.C64333Db.A06(r2)
            X.4C1 r6 = r2.AUS
            java.lang.Object r10 = r6.get()
            X.5WY r10 = (X.AnonymousClass5WY) r10
            X.2mi r24 = X.C86654Ky.A0Z(r2)
            X.5ZU r20 = X.C64333Db.A28(r2)
            X.33j r22 = X.C64333Db.A2t(r2)
            X.2rx r19 = X.C86614Ku.A0T(r2)
            X.33p r21 = X.C64333Db.A2s(r2)
            X.5Tb r16 = r2.AhS()
            X.7Qo r14 = new X.7Qo
            r14.<init>()
            X.4gz r6 = new X.4gz
            r17 = r4
            r25 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r7.A0H = r6
            X.4Tz r2 = r7.A0I
            X.08M r5 = r2.A0B
            X.1VX r4 = r6.A0J
            r2 = 1514(0x5ea, float:2.122E-42)
            boolean r2 = r4.A0X(r2)
            if (r2 == 0) goto L_0x0180
            r2 = 27
            X.C86604Kt.A1N(r7, r5, r6, r2)
        L_0x0180:
            if (r27 != 0) goto L_0x022f
            X.2sr r3 = r0.A01
            com.whatsapp.jid.UserJid r2 = r0.A0M
            boolean r2 = r3.A0a(r2)
            X.4Tz r5 = r0.A0I
            com.whatsapp.jid.UserJid r4 = r0.A0M
            if (r2 == 0) goto L_0x0218
            r5.A0D(r4)
            X.5Y9 r3 = r5.A0N
            int r2 = r5.A05
            r3.A05(r4, r2)
        L_0x019a:
            X.4gz r2 = r0.A0H
            r2.A0R()
        L_0x019f:
            androidx.recyclerview.widget.RecyclerView r3 = r0.A00
            X.4gz r2 = r0.A0H
            r3.setAdapter(r2)
            androidx.recyclerview.widget.RecyclerView r2 = r0.A00
            X.C18270x1.A0u(r2)
            androidx.recyclerview.widget.RecyclerView r4 = r0.A00
            X.0UY r3 = r4.A0R
            boolean r2 = r3 instanceof X.AnonymousClass09N
            if (r2 == 0) goto L_0x01b7
            X.09N r3 = (X.AnonymousClass09N) r3
            r3.A00 = r1
        L_0x01b7:
            X.C1231767k.A00(r4, r0, r1)
            X.1in r3 = r0.A0K
            X.2sG r2 = r0.A0J
            r3.A06(r2)
            X.1ia r3 = r0.A03
            X.4CK r2 = r0.A0T
            r3.A06(r2)
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "source"
            java.io.Serializable r2 = r3.getSerializableExtra(r2)
            if (r2 == 0) goto L_0x01db
            X.4FS r3 = r0.A04
            r2 = 35
            X.C117115rP.A01(r3, r0, r2)
        L_0x01db:
            X.4Tz r2 = r0.A0I
            X.5Qn r2 = r2.A0O
            X.0Wx r3 = r2.A03
            r2 = 25
            X.C86604Kt.A1M(r0, r3, r2)
            com.whatsapp.jid.UserJid r7 = r0.A0M
            if (r7 == 0) goto L_0x020f
            X.7SU r6 = r0.A0O
            java.util.concurrent.atomic.AtomicInteger r2 = r6.A00
            int r3 = r2.get()
            r2 = -1
            if (r3 == r2) goto L_0x0209
            X.2pA r5 = r6.A01
            java.util.concurrent.atomic.AtomicInteger r2 = r6.A00
            int r4 = r2.get()
            r3 = 0
            X.2QO r2 = new X.2QO
            r2.<init>(r7, r3, r1, r1)
            r1 = 897464270(0x357e37ce, float:9.470358E-7)
            r5.A02(r2, r1, r4)
        L_0x0209:
            java.util.concurrent.atomic.AtomicInteger r2 = r6.A00
            r1 = -1
            r2.set(r1)
        L_0x020f:
            X.5Tt r1 = r0.A0C
            X.7KG r1 = r1.A00()
            r0.A0B = r1
            return
        L_0x0218:
            X.33g r3 = r5.A0G
            X.2en r2 = r3.A05
            int r2 = r2.A00()
            r2 = r2 & 128(0x80, float:1.794E-43)
            if (r2 <= 0) goto L_0x0229
            r3.A05(r5, r4)
            goto L_0x019a
        L_0x0229:
            r2 = 0
            r5.BXC(r2)
            goto L_0x019a
        L_0x022f:
            java.lang.String r2 = "catalog_loaded"
            boolean r2 = r3.getBoolean(r2, r1)
            r0.A0R = r2
            goto L_0x019f
        L_0x0239:
            java.lang.String r4 = "Cart"
            goto L_0x0262
        L_0x023c:
            java.lang.String r4 = "Product"
            goto L_0x0262
        L_0x023f:
            java.lang.String r4 = "ChatHeader"
            goto L_0x0262
        L_0x0242:
            java.lang.String r4 = "Deeplink"
            goto L_0x0262
        L_0x0245:
            java.lang.String r4 = "Attachment"
            goto L_0x0262
        L_0x0248:
            java.lang.String r4 = "ContactInfo"
            goto L_0x0262
        L_0x024b:
            java.lang.String r4 = "Profile"
            goto L_0x0262
        L_0x024e:
            java.lang.String r4 = "CatalogHomeEdit"
            goto L_0x0262
        L_0x0251:
            java.lang.String r4 = "ConversationHomeBanner"
            goto L_0x0262
        L_0x0254:
            java.lang.String r4 = "ContentChooser"
            goto L_0x0262
        L_0x0257:
            java.lang.String r4 = "ToolsMenu"
            goto L_0x0262
        L_0x025a:
            java.lang.String r4 = "BusinessHome"
            goto L_0x0262
        L_0x025d:
            java.lang.String r4 = "CatalogShare"
            goto L_0x0262
        L_0x0260:
            java.lang.String r4 = "Onboarding"
        L_0x0262:
            java.lang.String r2 = "EntryPoint"
            r7.A05(r5, r2, r4)
            goto L_0x0109
        L_0x0269:
            monitor-exit(r4)
        L_0x026a:
            r6 = 0
            goto L_0x00fc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90504hW.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        this.A04.A07(this.A0U);
        this.A08.A07(this.A0V);
        this.A09.A07(this.A0W);
        this.A0K.A07(this.A0J);
        this.A03.A07(this.A0T);
        this.A0F.A00();
        this.A0N.A06("catalog_collections_view_tag", false);
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            C90264gz r3 = this.A0H;
            List list = r3.A00;
            if (list.size() > 0 && (list.get(0) instanceof C132376fB)) {
                list.remove(0);
                r3.A08(0);
                return;
            }
            return;
        }
        this.A0H.A0Q();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.menu_cart);
        findItem.setVisible(false);
        C989453v.A00(AnonymousClass4SG.A2Q(findItem), this, 16);
        TextView A092 = AnonymousClass002.A09(findItem.getActionView(), R.id.cart_total_quantity);
        String str = this.A0Q;
        if (str != null) {
            A092.setText(str);
        }
        C100385As.A00(this, this.A07.A00, findItem, 0);
        this.A07.A0E();
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (16908332 == itemId) {
            onBackPressed();
            return true;
        } else if (R.id.menu_share == itemId) {
            UserJid userJid = this.A0M;
            Intent A072 = C18320x8.A07();
            A072.setClassName(getPackageName(), "com.whatsapp.ShareCatalogLinkActivity");
            A072.setAction("android.intent.action.VIEW");
            AnonymousClass0x2.A0u(A072, userJid, "jid");
            startActivity(A072);
            return true;
        } else if (R.id.menu_cart != itemId) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            A74();
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        this.A0H.A0R();
        this.A0I.A0O.A00();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("catalog_loaded", this.A0R);
    }

    public void onStop() {
        super.onStop();
    }
}
