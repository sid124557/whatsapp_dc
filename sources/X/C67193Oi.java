package X;

import com.whatsapp.registration.report.BanReportViewModel;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.3Oi  reason: invalid class name and case insensitive filesystem */
public class C67193Oi implements AnonymousClass4EN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BanReportViewModel A01;

    public C67193Oi(BanReportViewModel banReportViewModel, int i) {
        this.A01 = banReportViewModel;
        this.A00 = i;
    }

    public void AyP(AnonymousClass2SI r22) {
        AnonymousClass2SI r0 = r22;
        AnonymousClass2WN r1 = r0.A03;
        int i = r0.A00;
        Integer A0f = AnonymousClass001.A0f();
        if (i == 0) {
            Object obj = r1.A00;
            if (obj == null) {
                this.A01.A02.A0G(A0f);
                Log.d("BanReportViewModel : GetBanReportDataProcessor is null");
                return;
            }
            AnonymousClass7IF r3 = (AnonymousClass7IF) obj;
            String str = r3.A01;
            if ("AVAILABLE".equals(str)) {
                AnonymousClass7PF r12 = r3.A00;
                if (r12 != null) {
                    BanReportViewModel banReportViewModel = this.A01;
                    banReportViewModel.A06.A08(new C114725nV(banReportViewModel), C633138t.A09, (C84134Bd) null, (C84134Bd) null, r12.A03, r12.A04, r12.A02, r12.A06, r12.A01, (String) null, AnonymousClass0x7.A1X(r12.A05), 2, 1, 10, 2, (long) r12.A00);
                    return;
                }
            } else {
                boolean equals = "PENDING".equals(str);
                BanReportViewModel banReportViewModel2 = this.A01;
                if (equals) {
                    int i2 = this.A00 + 1;
                    AnonymousClass000.A0A().postDelayed(new C71563cJ((Object) banReportViewModel2, i2, 9), ((long) i2) * 5000);
                    return;
                }
                C101615Fl r02 = banReportViewModel2.A05;
                String str2 = banReportViewModel2.A00;
                C118065sw r13 = r02.A00;
                C64333Db r03 = r13.A02;
                C56492s4 A07 = C64333Db.A07(r03);
                AnonymousClass33p A2s = C64333Db.A2s(r03);
                C183538qC A9V = C64333Db.A9V(r03);
                AnonymousClass3FI A8x = C64333Db.A8x(r03);
                AnonymousClass1VX A4B = C64333Db.A4B(r03);
                C88874aw r04 = r13.A03;
                new C32271q5(A07, A2s, A4B, A8x, A9V, str2, r04.A1D, r04.A0H).Bh4(new C86424Kb(this, 2));
                return;
            }
        }
        this.A01.A02.A0G(A0f);
    }

    public void BQq(IOException iOException) {
        Log.d("BanReportViewModel: requestBusinessActivityReport/error during report request", iOException);
        C06270Wx.A04(this.A01.A02, 1);
    }

    public void BSB(Exception exc) {
        Log.d("BanReportViewModel: requestBusinessActivityReport/error during report request", exc);
        C06270Wx.A04(this.A01.A02, 1);
    }
}
