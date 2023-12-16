package X;

import android.content.pm.PackageManager;
import com.whatsapp.util.Log;

/* renamed from: X.2ax  reason: invalid class name and case insensitive filesystem */
public class C46022ax {
    public final C65213Gq A00;
    public final AnonymousClass2OK A01;
    public final AnonymousClass2LA A02;
    public final C60692yy A03;

    public void A00(String str) {
        C66663Mh r0 = this.A01.A00;
        C22051Ei r2 = C66663Mh.A0w;
        if (r0.A08(r2)) {
            C65213Gq r1 = this.A00;
            if (r1.A01.A00.A08(r2)) {
                Log.d("InstrumentationObserverImpl/onAuthorizationRevoked");
                C52972mL r12 = r1.A02;
                try {
                    if (r12.A02.A01(str).A03) {
                        C183538qC r02 = (C183538qC) r12.A00.A00.get(str);
                        if (r02 != null) {
                            ((C56262rh) r02.get()).A01();
                        }
                        r12.A03.A00(str);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                C18260x0.A0t("InstrumentationChangeDispatcher/verification failed, dropping event for package - ", str, AnonymousClass001.A0o());
            }
            this.A03.A03(str);
        }
    }

    public C46022ax(C65213Gq r1, AnonymousClass2OK r2, AnonymousClass2LA r3, C60692yy r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
