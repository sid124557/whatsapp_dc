package X;

/* renamed from: X.2na  reason: invalid class name and case insensitive filesystem */
public class C53742na {
    public final AnonymousClass2DG A00;
    public final AnonymousClass2DH A01;
    public final C29441ip A02;
    public final C54292oU A03;
    public final AnonymousClass33p A04;
    public final C49952hM A05;
    public final AnonymousClass4FS A06;

    public String A00() {
        return AnonymousClass29C.A00(C18280x3.A0Z(AnonymousClass0x2.A0F(this.A04), "support_ban_appeal_state"));
    }

    public final void A01(AnonymousClass2SI r3, C84684Dh r4) {
        Integer num;
        C48642fE r1 = r3.A04;
        int i = 2;
        if (r1 != null) {
            num = (Integer) r1.A00((Object) null);
            if (num == null) {
                i = -1;
            }
            r4.BSq(num);
        }
        num = Integer.valueOf(i);
        r4.BSq(num);
    }

    public final void A02(AnonymousClass2P7 r5) {
        String str = r5.A00;
        AnonymousClass33p r3 = this.A04;
        C18270x1.A0j(C18270x1.A03(r3), "support_ban_appeal_state", str);
        if ("UNBANNED".equals(str)) {
            String str2 = r5.A01;
            C18260x0.A0s("BanAppealRepository/storeUnbanReason ", str2, AnonymousClass001.A0o());
            C18270x1.A0j(C18270x1.A03(r3), "support_ban_appeal_unban_reason", str2);
            String str3 = r5.A02;
            C18260x0.A0s("BanAppealRepository/storeUnbanReasonUrl ", str3, AnonymousClass001.A0o());
            C18270x1.A0j(C18270x1.A03(r3), "support_ban_appeal_unban_reason_url", str3);
        }
    }

    public C53742na(AnonymousClass2DG r1, AnonymousClass2DH r2, C29441ip r3, C54292oU r4, AnonymousClass33p r5, C49952hM r6, AnonymousClass4FS r7) {
        this.A03 = r4;
        this.A06 = r7;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
