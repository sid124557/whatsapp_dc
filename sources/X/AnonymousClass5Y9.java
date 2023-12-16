package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Y9  reason: invalid class name */
public class AnonymousClass5Y9 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass08M A03 = AnonymousClass08M.A01();
    public final AnonymousClass08M A04 = AnonymousClass08M.A01();
    public final AnonymousClass08M A05 = C18330xA.A01(Boolean.FALSE);
    public final AnonymousClass2VK A06;
    public final C69263Wi A07;
    public final C56972sr A08;
    public final AnonymousClass2PU A09;
    public final C620433g A0A;
    public final C29211iS A0B;
    public final C105405Uu A0C;
    public final C105145Tt A0D;
    public final C146947Cf A0E = new C146947Cf(this);
    public final AnonymousClass5UJ A0F;
    public final C184098rF A0G = new C170818Eq(this);
    public final C40082El A0H;
    public final C48922fh A0I;
    public final C29441ip A0J;
    public final AnonymousClass1VX A0K;
    public final C105915Wx A0L;
    public final AnonymousClass31C A0M;
    public final C105255Ue A0N;
    public final C104705Sa A0O;
    public final List A0P = AnonymousClass001.A0s();
    public final List A0Q = AnonymousClass001.A0s();
    public final Map A0R = AnonymousClass001.A0t();

    public void A02(int i, UserJid userJid, String str, boolean z) {
        UserJid userJid2 = userJid;
        int A002 = C18280x3.A00(this.A08.A0a(userJid) ? 1 : 0) * 9;
        String str2 = str;
        int i2 = i;
        if (str.equals("catalog_products_all_items_collection_id")) {
            A06(userJid, i, A002, true);
        } else {
            A07(userJid2, str2, i2, A002, z);
        }
    }

    public final void A06(UserJid userJid, int i, int i2, boolean z) {
        this.A0I.A01(userJid, AnonymousClass74S.A00(), new C124346Bx(this, userJid, i2, i, 0, z));
    }

    public final void A07(UserJid userJid, String str, int i, int i2, boolean z) {
        String str2;
        C105405Uu r1 = this.A0C;
        UserJid userJid2 = userJid;
        String str3 = str;
        C148047Gs A052 = r1.A05(userJid, str);
        if (A052 == null) {
            str2 = null;
        } else {
            str2 = A052.A00;
        }
        C148047Gs A053 = r1.A05(userJid, str);
        if (A053 == null || A053.A01) {
            AnonymousClass08M r12 = this.A05;
            if (r12.A07() == null || !C86604Kt.A1Z(r12)) {
                C86654Ky.A1H(r12);
                this.A0I.A01(userJid, AnonymousClass74S.A00(), new C118155t5(this, userJid2, str3, str2, i2, i, z));
            }
        }
    }

    public static /* synthetic */ void A00(AnonymousClass5Y9 r3, UserJid userJid) {
        if (!r3.A00) {
            Log.d("fetchBusinessProfile sendGetProfile");
            r3.A00 = true;
            r3.A0A.A08(new C1898792z(r3, 1), userJid, (String) null);
        }
    }

    public void A01(int i, UserJid userJid, String str, boolean z) {
        C148057Gt r2;
        String str2 = str;
        boolean equals = str.equals("catalog_products_all_items_collection_id");
        UserJid userJid2 = userJid;
        int A002 = C18280x3.A00(this.A08.A0a(userJid) ? 1 : 0) * 9;
        int i2 = i;
        if (equals) {
            C105405Uu r0 = this.A0C;
            r0.A0G(userJid, A002);
            if (r0.A0J(userJid)) {
                this.A03.A0H(new C132326f6(userJid, str, true, true));
                A002 *= 2;
            }
            A06(userJid, i, A002, true);
            return;
        }
        C105405Uu r4 = this.A0C;
        C162457s7.A0J(userJid, 0);
        synchronized (r4) {
            AnonymousClass7OX A003 = C105405Uu.A00(r4, userJid);
            if (!(A003 == null || (r2 = (C148057Gt) A003.A05.get(str)) == null)) {
                r2.A00 = new C148047Gs(true, (String) null);
                List list = r2.A01.A04;
                int size = list.size();
                if (size > A002) {
                    for (int i3 = A002; i3 < size; i3++) {
                        list.remove(AnonymousClass002.A03(list));
                    }
                }
            }
        }
        C49722gz A062 = r4.A06(userJid, str);
        if (A062 != null && !A062.A04.isEmpty()) {
            this.A03.A0H(new C132326f6(userJid, A062.A03, true, true));
            A002 *= 2;
        }
        A07(userJid2, str2, i2, A002, z);
    }

    public void A03(C184038r9 r14, C160157n8 r15) {
        boolean A062;
        AnonymousClass5UJ r3 = this.A0F;
        C160157n8 r9 = r15;
        UserJid userJid = r15.A07;
        C162457s7.A0J(userJid, 0);
        if (r3.A00.A0a(userJid) || !this.A0K.A0X(1096)) {
            Log.d("CatalogManager/requestBusinessProductCatalogPage via IQ");
            AnonymousClass2PU r1 = this.A09;
            AnonymousClass93I r6 = new AnonymousClass93I(this, 1);
            C64333Db r12 = r1.A02.A00.A01;
            C55682qk A012 = C64333Db.A01(r12);
            C105255Ue A0a = C86644Kx.A0a(r12);
            AnonymousClass31C A5u = C64333Db.A5u(r12);
            A062 = new C90224gv(A012, C86624Kv.A0K(r12), r6, new C106665Zw(0), C64333Db.A24(r12), r9, (C105915Wx) r12.AG3.get(), A5u, A0a).A06();
        } else {
            Log.d("CatalogManager/requestBusinessProductCatalogPage via GraphQL M1");
            A062 = r3.A04(new AnonymousClass93I(this, 0), r15);
        }
        if (A062) {
            this.A0R.put(r15, r14);
        } else {
            r14.BTF(r15, -1);
        }
    }

    public void A04(C149847Od r3, boolean z) {
        C117665sI.A00(this.A07, this, r3, 5, z);
    }

    public void A05(UserJid userJid, int i) {
        int i2 = 1;
        if (this.A08.A0a(userJid)) {
            i2 = 4;
        }
        int i3 = i2 * 6;
        C105405Uu r0 = this.A0C;
        r0.A0G(userJid, i3);
        if (r0.A0J(userJid)) {
            this.A0B.A08(userJid, true, true);
            i3 *= 2;
        }
        A06(userJid, i, i3, false);
    }

    public boolean A08(C149847Od r10) {
        this.A0N.A02(774782053, "report_product_tag", "CatalogManager");
        AnonymousClass2PU r0 = this.A09;
        C146947Cf r3 = this.A0E;
        C64333Db r1 = r0.A03.A00.A01;
        C105255Ue A0a = C86644Kx.A0a(r1);
        AnonymousClass31C A5u = C64333Db.A5u(r1);
        return new C90164gp(C86624Kv.A0K(r1), r3, r10, C64333Db.A4B(r1), (C105915Wx) r1.AG3.get(), A5u, A0a).A02();
    }

    public boolean A09(AnonymousClass7PB r12) {
        AnonymousClass5UJ r2 = this.A0F;
        AnonymousClass7PB r7 = r12;
        UserJid userJid = r12.A01;
        C162457s7.A0J(userJid, 0);
        if (r2.A00.A0a(userJid) || !this.A0K.A0X(1096)) {
            Log.d("CatalogManager/requestProduct via IQ");
            AnonymousClass2PU r0 = this.A09;
            C184098rF r4 = this.A0G;
            C64333Db r1 = r0.A00.A00.A01;
            AnonymousClass31C A5u = C64333Db.A5u(r1);
            C105255Ue A0a = C86644Kx.A0a(r1);
            C90214gu r13 = new C90214gu(C86624Kv.A0K(r1), (C105405Uu) r1.A4W.get(), r4, new C106665Zw(0), C64333Db.A24(r1), r7, (C105915Wx) r1.AG3.get(), A5u, A0a);
            if (!r13.A03.A0F()) {
                r13.A01.BT2(r13.A04, -1);
                return false;
            }
            C90244gx.A00(r13.A01, r13);
            return true;
        }
        Log.d("CatalogManager/requestProduct via GraphQL");
        return r2.A05(this.A0G, r12);
    }

    public AnonymousClass5Y9(AnonymousClass2VK r2, C69263Wi r3, C56972sr r4, AnonymousClass2PU r5, C620433g r6, C29211iS r7, C105405Uu r8, C105145Tt r9, AnonymousClass5UJ r10, C40082El r11, C48922fh r12, C29441ip r13, AnonymousClass1VX r14, C105915Wx r15, AnonymousClass31C r16, C105255Ue r17, C104705Sa r18) {
        this.A0K = r14;
        this.A07 = r3;
        this.A08 = r4;
        this.A0N = r17;
        this.A0M = r16;
        this.A0B = r7;
        this.A0C = r8;
        this.A0D = r9;
        this.A0A = r6;
        this.A0L = r15;
        this.A0J = r13;
        this.A0F = r10;
        this.A06 = r2;
        this.A09 = r5;
        this.A0O = r18;
        this.A0I = r12;
        this.A0H = r11;
    }
}
