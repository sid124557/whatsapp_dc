package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.9bD  reason: invalid class name */
public class AnonymousClass9bD implements AnonymousClass4EV {
    public final /* synthetic */ AnonymousClass9VV A00;
    public final /* synthetic */ C193899Qn A01;
    public final /* synthetic */ String A02;

    public AnonymousClass9bD(AnonymousClass9VV r1, C193899Qn r2, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }

    public void BRW(boolean z) {
        C18260x0.A1E("dyiReportManager/download-report/on-download-canceled transferred -> ", AnonymousClass001.A0o(), z);
        if (!z) {
            AnonymousClass9VV r3 = this.A00;
            C64393Dh r0 = r3.A02;
            String str = this.A02;
            File A0P = r0.A0P(str);
            if (A0P.exists() && !A0P.delete()) {
                Log.e("dyiReportManager/reset/failed-delete-report-file");
            }
            r3.A0A.A0G(2, str);
        }
    }

    public void BRX(C625435m r5, C56902sk r6) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("dyiReportManager/download-report/on-download-canceled success -> ");
        boolean A03 = r5.A03();
        A0o.append(A03);
        C18280x3.A14(A0o);
        if (A03) {
            AnonymousClass9VV r3 = this.A00;
            String str = this.A02;
            synchronized (r3) {
                r3.A0A.A0G(4, str);
            }
            C193899Qn r1 = this.A01;
            Log.i("DyiViewModel/download-report/on-success");
            C191689Fx r0 = r1.A00;
            C06270Wx.A04(r0.A02, r0.A07.A01(r0.A09));
            return;
        }
        this.A01.A00();
        this.A00.A0A.A0G(2, this.A02);
    }

    public /* synthetic */ void BRU(long j) {
    }
}
