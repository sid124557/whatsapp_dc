package X;

import android.content.ContentValues;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;

/* renamed from: X.2W8  reason: invalid class name */
public class AnonymousClass2W8 {
    public final AnonymousClass1RF A00;

    public AnonymousClass2W8(AnonymousClass1RF r1) {
        this.A00 = r1;
    }

    public void A00(GroupJid groupJid, int i, int i2) {
        String str;
        C69833Yo Axl;
        int i3 = i2;
        if (i2 == 0) {
            str = "reaction_open_tray_count";
        } else if (i3 == 1) {
            str = "reaction_delete_count";
        } else if (i3 != 2) {
            str = "pnh_indicator_clicks_info_screen";
        } else {
            str = "pnh_indicator_clicks_chat";
        }
        C85284Fq A0C = this.A00.A0C();
        try {
            Axl = A0C.Axl();
            C56862sg r5 = ((AnonymousClass3H0) A0C).A03;
            if (!(!C626235v.A04(r5, "pnh_daily_event_logging"))) {
                Log.e("PnhDailyActionLoggingStore/incrementCount: table does not exist");
            } else {
                StringBuilder A0p = C18300x5.A0p("pnh_daily_event_logging");
                C18300x5.A1O(A0p, str);
                A0p.append(str);
                AnonymousClass0x2.A1P(A0p, " + ?");
                A0p.append("community_id");
                A0p.append(" = ? AND ");
                A0p.append("type_of_subgroup");
                C56702sQ A0G = r5.A0G(AnonymousClass000.A0X(" = ?", A0p), "update_pnh_daily_action");
                A0G.A06(1, 1);
                A0G.A07(2, groupJid.getRawString());
                A0G.A06(3, (long) i);
                if (A0G.A00() == 0) {
                    ContentValues A07 = AnonymousClass0x9.A07(3);
                    AnonymousClass0x2.A0n(A07, groupJid, "community_id");
                    C18270x1.A0b(A07, "type_of_subgroup", i);
                    C18270x1.A0b(A07, str, 1);
                    r5.A08("pnh_daily_event_logging", "update_pnh_daily_action", A07);
                }
                Axl.A00();
            }
            Axl.close();
            A0C.close();
            return;
        } catch (Throwable th) {
            try {
                A0C.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
