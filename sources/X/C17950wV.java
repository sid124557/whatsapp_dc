package X;

import android.content.res.Configuration;
import androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1;
import java.util.Iterator;

/* renamed from: X.0wV  reason: invalid class name and case insensitive filesystem */
public class C17950wV implements C15790rw {
    public Object A00;
    public final int A01;

    public C17950wV(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static final void A00(C17950wV r0, Object obj) {
        WindowInfoTrackerImpl$windowLayoutInfo$1.A00((AnonymousClass0P8) obj, (AnonymousClass4Gm) r0.A00);
    }

    public /* bridge */ /* synthetic */ void AwB(Object obj) {
        switch (this.A01) {
            case 0:
                C05350Sz r4 = (C05350Sz) obj;
                if (r4 == null) {
                    r4 = new C05350Sz(-3);
                }
                ((AnonymousClass0NA) this.A00).A00(r4);
                return;
            case 1:
                C003203q.A0D((C003203q) this.A00);
                return;
            case 2:
                C003203q.A0D((C003203q) this.A00);
                return;
            case 3:
                C08270df r1 = (C08270df) this.A00;
                Configuration configuration = (Configuration) obj;
                if (r1.A0u()) {
                    Iterator A002 = C04760Qo.A00(r1);
                    while (A002.hasNext()) {
                        C08310eF r0 = (C08310eF) A002.next();
                        if (r0 != null) {
                            r0.onConfigurationChanged(configuration);
                        }
                    }
                    return;
                }
                return;
            case 4:
                C08270df r2 = (C08270df) this.A00;
                Number number = (Number) obj;
                if (r2.A0u() && number.intValue() == 80) {
                    Iterator A003 = C04760Qo.A00(r2);
                    while (A003.hasNext()) {
                        C08310eF r02 = (C08310eF) A003.next();
                        if (r02 != null) {
                            r02.onLowMemory();
                        }
                    }
                    return;
                }
                return;
            case 7:
                A00(this, obj);
                return;
            default:
                C08270df r12 = (C08270df) this.A00;
                if (r12.A0u()) {
                    Iterator A004 = C04760Qo.A00(r12);
                    while (A004.hasNext()) {
                        A004.next();
                    }
                    return;
                }
                return;
        }
    }
}
