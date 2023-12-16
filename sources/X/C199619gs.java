package X;

import com.whatsapp.util.Log;

/* renamed from: X.9gs  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199619gs implements Runnable {
    public final /* synthetic */ C191689Fx A00;

    public final void run() {
        C191689Fx r0 = this.A00;
        AnonymousClass9VV r1 = r0.A07;
        C193899Qn r2 = new C193899Qn(r0);
        String str = r0.A09;
        synchronized (r1) {
            Log.i("dyiReportManager/download-report");
            C193519Oy A02 = r1.A02(str);
            if (A02 == null) {
                Log.e("dyiReportManager/download-report no valid report info");
            } else {
                String str2 = A02.A02;
                if (str2 == null) {
                    Log.e("dyiReportManager/download-report no url");
                } else {
                    C56612sH r6 = r1.A05;
                    AnonymousClass1VX r8 = r1.A08;
                    C56492s4 r5 = r1.A04;
                    C61072zf r7 = r1.A07;
                    C29011i8 r11 = r1.A0B;
                    C28251fy r4 = new C28251fy(r5, r6, r7, r8, r1.A09, C633138t.A09, r11, r1.A02.A0P(str), str2, "application/zip");
                    r1.A00 = r4;
                    r4.AwR(new AnonymousClass9bD(r1, r2, str));
                    Log.i("dyiReportManager/on-report-downloading");
                    r1.A0A.A0G(3, str);
                    r1.A00.A02();
                }
            }
            r1.A04(str);
            r2.A00();
        }
    }

    public /* synthetic */ C199619gs(C191689Fx r1) {
        this.A00 = r1;
    }
}
