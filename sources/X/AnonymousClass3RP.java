package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.Jid;
import java.util.Set;

/* renamed from: X.3RP  reason: invalid class name */
public final class AnonymousClass3RP implements C85064Eu {
    public final AnonymousClass33p A00;

    public /* bridge */ /* synthetic */ boolean BFM(Object obj) {
        Jid jid = (Jid) obj;
        C183538qC r2 = this.A00.A01;
        if (C18280x3.A1W(C18300x5.A0B(r2), "about_community_nux_threshold_reached") || C18300x5.A0B(r2).getStringSet("pref_about_community_nux_seen_communities", AnonymousClass002.A0K()).contains(C18290x4.A0n(jid))) {
            return true;
        }
        return false;
    }

    public void BLm(boolean z) {
        AnonymousClass33p r2 = this.A00;
        C18270x1.A0l(C18270x1.A03(r2), "about_community_nux_threshold_reached", z);
        if (!z) {
            C18270x1.A0g(C18270x1.A03(r2), "pref_about_community_nux_seen_communities");
        }
    }

    public /* bridge */ /* synthetic */ void Bmg(Object obj) {
        boolean z;
        SharedPreferences.Editor A03;
        Jid jid = (Jid) obj;
        if (jid != null) {
            AnonymousClass33p r3 = this.A00;
            Set<String> stringSet = AnonymousClass0x2.A0F(r3).getStringSet("pref_about_community_nux_seen_communities", AnonymousClass002.A0K());
            stringSet.add(jid.getRawString());
            C18300x5.A15(C18270x1.A03(r3), "pref_about_community_nux_seen_communities", stringSet);
            z = true;
            if (stringSet.size() >= 1) {
                A03 = C18270x1.A03(r3);
            } else {
                return;
            }
        } else {
            z = true;
            A03 = C18270x1.A03(this.A00);
        }
        C18270x1.A0l(A03, "about_community_nux_threshold_reached", z);
    }

    public AnonymousClass3RP(AnonymousClass33p r1) {
        this.A00 = r1;
    }

    public String BA5() {
        return "community_home";
    }
}
