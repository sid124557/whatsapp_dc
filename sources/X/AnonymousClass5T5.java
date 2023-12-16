package X;

import android.content.SharedPreferences;

/* renamed from: X.5T5  reason: invalid class name */
public class AnonymousClass5T5 {
    public long A00;
    public long A01;
    public long A02;
    public boolean A03;
    public final AnonymousClass33p A04;
    public final C150637Ro A05;
    public final C101975Gz A06;

    public void A00(long j, long j2, boolean z) {
        SharedPreferences.Editor A032;
        SharedPreferences A0F;
        String str;
        long j3 = j;
        long j4 = j2;
        this.A05.A00(2, j3, j4, this.A01, this.A02, this.A00, z, this.A03);
        C95814uZ r1 = this.A06.A00.A0E;
        if (r1 != null) {
            if (r1 instanceof AnonymousClass1fS) {
                AnonymousClass33p r0 = this.A04;
                A032 = C18270x1.A03(r0);
                A0F = AnonymousClass0x2.A0F(r0);
                str = "ptt_cancel_broadcast";
            } else {
                boolean A0K = C627336j.A0K(r1);
                AnonymousClass33p r02 = this.A04;
                A032 = C18270x1.A03(r02);
                A0F = AnonymousClass0x2.A0F(r02);
                if (A0K) {
                    str = "ptt_cancel_group";
                } else {
                    str = "ptt_cancel_individual";
                }
            }
            C86604Kt.A14(A032, A0F, str);
        }
    }

    public void A01(long j, long j2, boolean z) {
        SharedPreferences.Editor A032;
        SharedPreferences A0F;
        String str;
        C95814uZ r1 = this.A06.A00.A0E;
        long j3 = j;
        long j4 = j2;
        this.A05.A00(1, j3, j4, this.A01, this.A02, this.A00, z, this.A03);
        if (r1 != null) {
            if (r1 instanceof AnonymousClass1fS) {
                AnonymousClass33p r0 = this.A04;
                A032 = C18270x1.A03(r0);
                A0F = AnonymousClass0x2.A0F(r0);
                str = "ptt_send_broadcast";
            } else {
                boolean A0K = C627336j.A0K(r1);
                AnonymousClass33p r02 = this.A04;
                A032 = C18270x1.A03(r02);
                A0F = AnonymousClass0x2.A0F(r02);
                if (A0K) {
                    str = "ptt_send_group";
                } else {
                    str = "ptt_send_individual";
                }
            }
            C86604Kt.A14(A032, A0F, str);
        }
    }

    public AnonymousClass5T5(AnonymousClass33p r1, C150637Ro r2, C101975Gz r3) {
        this.A05 = r2;
        this.A04 = r1;
        this.A06 = r3;
    }
}
