package X;

import android.os.Handler;
import android.os.PowerManager;
import com.whatsapp.util.Log;
import java.util.Objects;

/* renamed from: X.2hW  reason: invalid class name and case insensitive filesystem */
public class C50032hW {
    public boolean A00;
    public final C69263Wi A01;
    public final C29411im A02;
    public final C620633i A03;
    public final AnonymousClass3S3 A04;
    public final C183538qC A05;

    public void A00() {
        this.A00 = true;
        C18260x0.A1D("PresenseSendMethods/sendAvailableForChat deviceAvailable=", AnonymousClass001.A0o(), true);
        if (this.A02.A06 || !this.A00) {
            C66523Lt A0S = AnonymousClass0x9.A0S(this.A05);
            Log.i("MessageHandler/sendAvailableForChat");
            AnonymousClass4EW r1 = A0S.A08;
            C626936e.A06(r1);
            Log.d("ConnectionThread/MessageServiceHandler/sendAvailableForChat");
            ((Handler) r1).obtainMessage(7).sendToTarget();
            C61032zb.A00(A0S.A0s, 4);
            A0S.A0p.A02();
            A0S.A0H(true, false, false);
            C56732sT r2 = A0S.A0Y;
            Log.i("ClientPingManager/on-demand-ping");
            C70013Zn.A00(r2.A07, r2, 25);
        }
    }

    public void A01() {
        this.A00 = false;
        C18260x0.A1D("PresenseSendMethods/sendUnavailableForChat deviceAvailable=", AnonymousClass001.A0o(), false);
        if (this.A02.A06 && !this.A00) {
            PowerManager A0J = this.A03.A0J();
            if (A0J == null) {
                Log.w("PresenceSendMethods/sendUnavailableForChat pm=null");
            } else {
                PowerManager.WakeLock A002 = AnonymousClass75K.A00(A0J, "sendinactive", 1);
                if (A002 != null) {
                    A002.acquire(3000);
                    Log.i("PresenceSendMethods/sendUnavailableForChat/wl");
                }
            }
            C66523Lt A0S = AnonymousClass0x9.A0S(this.A05);
            Log.i("MessageHandler/sendUnavailableForChat");
            AnonymousClass4EW r1 = A0S.A08;
            C626936e.A06(r1);
            Log.d("ConnectionThread/MessageServiceHandler/sendUnavailableForChat");
            ((Handler) r1).obtainMessage(6).sendToTarget();
        }
        if (!this.A00) {
            C69263Wi r2 = this.A01;
            AnonymousClass3S3 r12 = this.A04;
            Objects.requireNonNull(r12);
            r2.A0S(C71263bp.A00(r12, 28));
        }
    }

    public C50032hW(C69263Wi r1, C29411im r2, C620633i r3, AnonymousClass3S3 r4, C183538qC r5) {
        this.A01 = r1;
        this.A05 = r5;
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r2;
    }
}
