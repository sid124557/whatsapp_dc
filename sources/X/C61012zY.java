package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.2zY  reason: invalid class name and case insensitive filesystem */
public final class C61012zY {
    public final C69263Wi A00;
    public final C44212Vc A01;
    public final C58182uq A02;
    public final C58192ur A03;
    public final C29301ib A04;
    public final C56612sH A05;
    public final AnonymousClass33p A06;
    public final C66543Lv A07;
    public final C56832sd A08;

    public final void A02(UserJid userJid, String str, String str2, int i) {
        String str3;
        UserJid userJid2 = userJid;
        C162457s7.A0J(userJid2, 2);
        C58182uq r2 = this.A02;
        int i2 = i;
        AnonymousClass2N8 r1 = new AnonymousClass2N8(this, userJid2, i2);
        AnonymousClass31C r10 = r2.A00;
        String A032 = r10.A03();
        Log.i("bizOptOutHandler/sendSetOptOutListRequest");
        if (i2 == 1) {
            str3 = "unblock";
        } else {
            str3 = "block";
        }
        C35701xI r4 = new C35701xI(userJid2, A032, str3, str, str2);
        r10.A0K(new C35571x5(r4, new C41132Jb(r2, r1), 0), C41032Ir.A05(r4), A032, 427, 20000);
    }

    public final boolean A03(UserJid userJid) {
        C162457s7.A0J(userJid, 1);
        C41122Ja r6 = new C41122Ja(userJid, (String) null);
        String A0j = C18310x6.A0j(C60152y5.A02(this.A03.A00, "biz_opt_out"), C18290x4.A0o(AnonymousClass0x9.A1G().putOpt("key_brand_id", r6.A01).putOpt("key_jid", C18290x4.A0n(r6.A00))));
        C162457s7.A0H(A0j);
        return AnonymousClass000.A1T(AnonymousClass0x9.A1H(A0j).optInt(String.valueOf(0), 1));
    }

    public final void A01(C41122Ja r5, String str, int i) {
        SharedPreferences A022 = C60152y5.A02(this.A03.A00, "biz_opt_out");
        String A0o = C18290x4.A0o(AnonymousClass0x9.A1G().putOpt("key_brand_id", r5.A01).putOpt("key_jid", C18290x4.A0n(r5.A00)));
        String A0j = C18310x6.A0j(A022, A0o);
        C162457s7.A0H(A0j);
        JSONObject A1H = AnonymousClass0x9.A1H(A0j);
        A1H.put(String.valueOf(0), i);
        C18270x1.A0j(A022.edit(), A0o, C18290x4.A0o(A1H));
        C18270x1.A0j(C18270x1.A03(this.A06), "biz_opt_out_dhash", str);
    }

    public C61012zY(C69263Wi r2, C44212Vc r3, C58182uq r4, C58192ur r5, C29301ib r6, C56612sH r7, AnonymousClass33p r8, C66543Lv r9, C56832sd r10) {
        C18260x0.A0f(r10, r9, r7, r8, r4);
        C18260x0.A0U(r5, r2);
        C162457s7.A0J(r3, 9);
        this.A08 = r10;
        this.A07 = r9;
        this.A05 = r7;
        this.A06 = r8;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
        this.A04 = r6;
        this.A01 = r3;
    }

    public static final /* synthetic */ void A00(C41142Jc r7, C61012zY r8, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C41142Jc r0 = (C41142Jc) it.next();
            r8.A01(r0.A01, str, r0.A00);
        }
        C41122Ja r02 = r7.A01;
        UserJid userJid = r02.A00;
        if (userJid != null) {
            int i = r7.A00;
            r8.A01(r02, str, i);
            C56832sd r1 = r8.A08;
            C31261o0 r2 = new C31261o0(C56832sd.A00(userJid, r1), r8.A05.A0H());
            r2.A01 = 0;
            r2.A00 = i;
            r8.A07.A09(r2, -1);
        }
    }
}
