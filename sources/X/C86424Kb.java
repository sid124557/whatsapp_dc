package X;

import com.whatsapp.registration.report.BanReportViewModel;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.List;

/* renamed from: X.4Kb  reason: invalid class name and case insensitive filesystem */
public class C86424Kb implements AnonymousClass4EN {
    public Object A00;
    public final int A01;

    public C86424Kb(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void AyP(AnonymousClass2SI r7) {
        switch (this.A01) {
            case 0:
                C162457s7.A0J(r7, 0);
                Log.d("performServerRequest/SUCCESS");
                Exception exc = (Exception) r7.A04.A00((Object) null);
                if (exc == null) {
                    List list = (List) r7.A03.A00;
                    if (list != null) {
                        C84814Du r1 = (C84814Du) this.A00;
                        if (list.isEmpty()) {
                            exc = new C376023g();
                        } else {
                            r1.BkD(list);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                BSB(exc);
                return;
            case 1:
                C162457s7.A0J(r7, 0);
                ((C84814Du) this.A00).BkD(r7);
                return;
            default:
                C67193Oi r0 = (C67193Oi) this.A00;
                BanReportViewModel banReportViewModel = r0.A01;
                int i = r0.A00 + 1;
                AnonymousClass000.A0A().postDelayed(new C71563cJ((Object) banReportViewModel, i, 9), ((long) i) * 5000);
                return;
        }
    }

    public void BQq(IOException iOException) {
        switch (this.A01) {
            case 0:
                Log.d(AnonymousClass000.A0a("performServerRequest/FAILURE/", C18270x1.A0X(iOException), iOException));
                break;
            case 1:
                C162457s7.A0J(iOException, 0);
                break;
            default:
                Log.d("BanReportViewModel: getBusinessActivityReport/error during report request", iOException);
                C06270Wx.A04(((C67193Oi) this.A00).A01.A02, 1);
                return;
        }
        AnonymousClass3Z0.A02(iOException, (C84814Du) this.A00);
    }

    public void BSB(Exception exc) {
        switch (this.A01) {
            case 0:
                Log.d(AnonymousClass000.A0a("performServerRequest/ERROR/", C18270x1.A0X(exc), exc));
                break;
            case 1:
                C162457s7.A0J(exc, 0);
                break;
            default:
                Log.d("BanReportViewModel: getBusinessActivityReport/error during report request", exc);
                C06270Wx.A04(((C67193Oi) this.A00).A01.A02, 1);
                return;
        }
        AnonymousClass3Z0.A02(exc, (C84814Du) this.A00);
    }
}
