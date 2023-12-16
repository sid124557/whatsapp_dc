package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9YW  reason: invalid class name */
public class AnonymousClass9YW implements C202879mj {
    public final /* synthetic */ C195639Yw A00;
    public final /* synthetic */ AnonymousClass9QB A01;
    public final /* synthetic */ AnonymousClass9QN A02;
    public final /* synthetic */ C202879mj A03;
    public final /* synthetic */ C192529Kl A04;
    public final /* synthetic */ C195349Xk A05;
    public final /* synthetic */ AnonymousClass32L A06;

    public AnonymousClass9YW(C195639Yw r1, AnonymousClass9QB r2, AnonymousClass9QN r3, C202879mj r4, C192529Kl r5, C195349Xk r6, AnonymousClass32L r7) {
        this.A00 = r1;
        this.A05 = r6;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A06 = r7;
    }

    public void BSl(AnonymousClass9KQ r5) {
        C195639Yw.A01(this.A00, this.A03, this.A05, this.A06, r5);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list = (List) obj;
        C193219Np r2 = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C193209No r3 = (C193209No) it.next();
                if (r3.A00.A02.A02 == ARAssetType.EFFECT) {
                    try {
                        String canonicalPath = r3.A01.getCanonicalPath();
                        if (canonicalPath != null) {
                            r2 = new C193219Np(this.A05.A05, canonicalPath);
                        }
                    } catch (IOException | SecurityException e) {
                        if (C162477s9.A01.BI0(6)) {
                            C162477s9.A01.Bsn("DefaultCameraCoreEffectManager", "corrupted effect file path", e);
                        }
                    }
                }
            }
        }
        AnonymousClass9QB r4 = this.A01;
        r4.A02 = r2;
        r4.A04 = true;
        if (r4.A05 && r4.A06) {
            C195639Yw r32 = this.A00;
            C195349Xk r8 = this.A05;
            C192529Kl r7 = this.A04;
            C195639Yw.A00(r32, r4, this.A02, this.A03, r7, r8, AnonymousClass000.A1W(r2));
        }
    }
}
