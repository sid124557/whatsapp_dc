package X;

import com.whatsapp.util.Log;

/* renamed from: X.3FX  reason: invalid class name */
public class AnonymousClass3FX implements AnonymousClass4E8 {
    public final C47882dz A00;
    public final C56642sK A01;
    public final C56422rx A02;
    public final C56882si A03;

    public void BQW() {
        C85284Fq A07;
        C85284Fq A072;
        C56422rx r1 = this.A02;
        Log.i("VerifiedNameManager/deleteStaleUnconfirmedVerifiedNameCerts");
        C626936e.A00();
        synchronized (r1.A09) {
            C34461vC r2 = r1.A04;
            int A032 = r1.A02.A03(C66663Mh.A21);
            try {
                A072 = C18630y0.A07(r2);
                String[] A1Z = AnonymousClass0x9.A1Z();
                A1Z[0] = "0";
                C18270x1.A1R(A1Z, C18280x3.A07() - ((long) A032));
                AnonymousClass361.A08(A072, "wa_vnames", "identity_unconfirmed_since > ? AND identity_unconfirmed_since < ?", A1Z);
                A072.close();
            } catch (IllegalArgumentException e) {
                C626936e.A08("contact-mgr-db/unable to delete stale vnames", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        C34411v7 r0 = this.A00.A00;
        AnonymousClass33M A002 = AnonymousClass33M.A00();
        try {
            A07 = C18630y0.A07(r0);
            String[] A1Y = AnonymousClass0x9.A1Y();
            AnonymousClass0x2.A1S(A1Y, 0, System.currentTimeMillis() - 604800000);
            long A08 = AnonymousClass361.A08(A07, "wa_last_entry_point", "entry_point_time <= ?", A1Y);
            A07.close();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("deleteOldChatEntryPointLogs/deleted entry points/");
            A0o.append(A08);
            AnonymousClass33M.A04(A002, " | time: ", A0o);
        } catch (IllegalArgumentException e2) {
            C626936e.A08("deleteOldChatEntryPointLogs/unable to delete old chat entry points ", e2);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        C56642sK r6 = this.A01;
        long A003 = C56642sK.A00(r6, r6.A06);
        long A022 = r6.A02();
        AnonymousClass1RI r3 = r6.A03.A00;
        C85284Fq A0C = r3.A0C();
        try {
            AnonymousClass361.A08(A0C, "wa_trusted_contacts", "incoming_tc_token_timestamp< ?", C18260x0.A1b(A003));
            A0C.close();
            A0C = r3.A0C();
            long A082 = AnonymousClass361.A08(A0C, "wa_trusted_contacts_send", "sent_tc_token_timestamp< ?", C18260x0.A1b(A022));
            A0C.close();
            if (A082 > 0) {
                r6.A09().clear();
            }
            C18270x1.A0g(C56882si.A01(this.A03).remove("last_picture_full_sync").remove("last_business_full_sync").remove("last_devices_full_sync").remove("last_payment_full_sync").remove("last_disappearing_mode_full_sync").remove("last_lid_full_sync").remove("picture_full_sync_wait").remove("business_full_sync_wait").remove("devices_full_sync_wait").remove("payment_full_sync_wait").remove("disappearing_mode_full_sync_wait"), "contact_lid_sync_wait");
            return;
        } catch (Throwable th3) {
            th.addSuppressed(th3);
            throw th;
        }
        throw th;
        throw th;
    }

    public AnonymousClass3FX(C47882dz r1, C56642sK r2, C56422rx r3, C56882si r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
    }

    public String BDW() {
        return "ContactDailyCron";
    }

    public /* synthetic */ void BQX() {
    }
}
