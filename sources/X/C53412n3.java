package X;

import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: X.2n3  reason: invalid class name and case insensitive filesystem */
public class C53412n3 {
    public C59262wd A00;
    public C59262wd A01;
    public AnonymousClass1VX A02;
    public final C56612sH A03;
    public final C22931Qq A04;
    public final C45882aj A05;

    public final void A01(C55012pe r4) {
        try {
            C18270x1.A0j(C60152y5.A00(this.A01.A00, "entry_point_conversions_for_sending"), r4.A04.getRawString(), r4.A00());
        } catch (JSONException e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "CTWA: EntryPointConversionStore/updateConversion/json error", e);
        }
    }

    public void A03(UserJid userJid, String str, String str2, long j, long j2) {
        C47942e5 r7;
        AnonymousClass1VX r72 = this.A02;
        UserJid userJid2 = userJid;
        String str3 = str;
        String str4 = str2;
        long j3 = j;
        long j4 = j2;
        if (r72.A0Y(C58422vE.A02, 6122)) {
            if (userJid == null || str == null) {
                r7 = new C22911Qo();
            } else {
                r7 = new C22881Ql(userJid2, str3, str4, -1, j3, j4, -1, false);
            }
            this.A04.A03(r7);
            return;
        }
        C55012pe r6 = new C55012pe(new AnonymousClass2TW(userJid2, str3, str4, j3, j4));
        C59262wd r1 = this.A01;
        UserJid userJid3 = r6.A04;
        C55012pe A012 = r1.A01(userJid3);
        if (A012 == null) {
            try {
                C18270x1.A0j(C60152y5.A00(r1.A00, "entry_point_conversions_for_sending"), userJid3.getRawString(), r6.A00());
            } catch (JSONException e) {
                C18260x0.A1Q(AnonymousClass001.A0o(), "CTWA: EntryPointConversionStore/storeConversion/json error", e);
            }
        } else if (System.currentTimeMillis() - A012.A03 > TimeUnit.DAYS.toMillis(C56952sp.A06(r72, 3017))) {
            A01(r6);
        }
    }

    public C53412n3(C56612sH r3, C22931Qq r4, C45882aj r5, AnonymousClass1VX r6, C60152y5 r7) {
        this.A02 = r6;
        this.A03 = r3;
        this.A05 = r5;
        this.A04 = r4;
        this.A01 = new C59262wd(r7, "entry_point_conversions_for_sending");
        this.A00 = new C59262wd(r7, "entry_point_conversions_for_logging");
    }

    public static void A00(C53412n3 r8, UserJid userJid, String str) {
        r8.A03(userJid, str, SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME, System.currentTimeMillis(), System.currentTimeMillis());
    }

    public final void A02(C59262wd r10) {
        ArrayList A0s = AnonymousClass001.A0s();
        C60152y5 r3 = r10.A00;
        String str = r10.A01;
        Map<String, ?> all = r3.A03(str).getAll();
        Iterator A0q = AnonymousClass000.A0q(all);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            Object A0k = AnonymousClass0x7.A0k(A0w, all);
            if (A0k != null) {
                C55012pe A002 = C59262wd.A00(A0k.toString());
                if (A002 != null) {
                    A0s.add(A002);
                }
            } else {
                C18260x0.A1Q(AnonymousClass001.A0o(), "CTWA: EntryPointConversionStore/getAllConversions/ null pref value for key=", A0w);
            }
        }
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            C55012pe r7 = (C55012pe) it.next();
            if (System.currentTimeMillis() - r7.A03 > TimeUnit.DAYS.toMillis(C56952sp.A06(this.A02, 3017))) {
                C18270x1.A0g(C60152y5.A00(r3, str), r7.A04.getRawString());
            }
        }
    }
}
