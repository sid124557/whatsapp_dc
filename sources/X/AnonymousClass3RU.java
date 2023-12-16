package X;

/* renamed from: X.3RU  reason: invalid class name */
public final class AnonymousClass3RU implements C85064Eu {
    public final AnonymousClass33p A00;
    public final AnonymousClass1VX A01;

    public /* bridge */ /* synthetic */ boolean BFM(Object obj) {
        int A0O = this.A01.A0O(C58422vE.A02, 4071);
        if (A0O <= -1) {
            return false;
        }
        C183538qC r2 = this.A00.A01;
        if (!C18300x5.A0B(r2).getBoolean("create_community_nux_threshold_reached", false) || C18300x5.A0B(r2).getInt("pref_create_community_nux_times_displayed", 0) < A0O) {
            return false;
        }
        return true;
    }

    public void BLm(boolean z) {
        AnonymousClass33p r2 = this.A00;
        C18270x1.A0l(C18270x1.A03(r2), "create_community_nux_threshold_reached", z);
        if (!z) {
            C18270x1.A0g(C18270x1.A03(r2), "pref_create_community_nux_times_displayed");
        }
    }

    public /* bridge */ /* synthetic */ void Bmg(Object obj) {
        int A0O = this.A01.A0O(C58422vE.A02, 4071);
        if (obj == null) {
            AnonymousClass33p r3 = this.A00;
            int i = AnonymousClass0x2.A0F(r3).getInt("pref_create_community_nux_times_displayed", 0) + 1;
            C18260x0.A0L(r3, "pref_create_community_nux_times_displayed", i);
            if (i < A0O) {
                return;
            }
        }
        C18270x1.A0l(C18270x1.A03(this.A00), "create_community_nux_threshold_reached", true);
    }

    public AnonymousClass3RU(AnonymousClass33p r1, AnonymousClass1VX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String BA5() {
        return "community";
    }
}
