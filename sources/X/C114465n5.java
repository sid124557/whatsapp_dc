package X;

import com.whatsapp.registration.report.BanReportViewModel;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.5n5  reason: invalid class name and case insensitive filesystem */
public class C114465n5 implements AnonymousClass4EN {
    public final /* synthetic */ BanReportViewModel A00;

    public C114465n5(BanReportViewModel banReportViewModel) {
        this.A00 = banReportViewModel;
    }

    public void AyP(AnonymousClass2SI r3) {
        C06270Wx.A04(this.A00.A02, 4);
    }

    public void BSB(Exception exc) {
        Log.d("BanReportViewModel: deleteBusinessActivityReport/error during report request", exc);
        C06270Wx.A04(this.A00.A02, 1);
    }

    public void BQq(IOException iOException) {
        BSB(iOException);
    }
}
