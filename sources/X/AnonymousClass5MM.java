package X;

import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.5MM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5MM {
    public final /* synthetic */ BusinessDirectorySERPMapViewActivity A00;

    public final void A00(C109075e2 r22, AnonymousClass4Zh r23) {
        BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity = this.A00;
        C109075e2 r7 = r22;
        AnonymousClass4Zh r10 = r23;
        if (r7.A09) {
            C109065e1 r2 = r7.A0B.A03;
            if (r2 != null) {
                businessDirectorySERPMapViewActivity.A74().A0I(r7, r10, C18290x4.A0b());
                AnonymousClass5U9 r3 = businessDirectorySERPMapViewActivity.A05;
                if (r3 != null) {
                    r3.A02(businessDirectorySERPMapViewActivity.A00, (C182048nm) null, (C186368vB) null, r2.A0F);
                    return;
                }
                throw C18270x1.A0S("businessProfileSyncUtil");
            }
            return;
        }
        AnonymousClass4U8 A74 = businessDirectorySERPMapViewActivity.A74();
        A74.A07 = r7;
        AnonymousClass08M r24 = A74.A0H;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new C136046ll(r7));
        r24.A0G(A0s);
        C157107hk r11 = C157107hk.A00;
        C108975ds BBX = r7.BBX();
        double d = (double) 111132;
        C108975ds A002 = r11.A00(C108975ds.A00(BBX.A00 + (500.0d / d), BBX.A01), 500.0d);
        C108975ds BBX2 = r7.BBX();
        double d2 = 500.0d * -1.0d;
        C108995du r25 = new C108995du(r11.A00(C108975ds.A00(BBX2.A00 + (d2 / d), BBX2.A01), d2), A002);
        AnonymousClass5ZH r1 = A74.A08.A0B;
        AnonymousClass5X3 r32 = r1.A03;
        C157467iL A03 = r1.A03(r25, 60);
        HashSet A0K = AnonymousClass002.A0K();
        r32.A00(r32.A00, A03, A0K);
        ArrayList A0c = C73783g4.A0c(A0K);
        Iterator it = A0K.iterator();
        while (it.hasNext()) {
            A0c.add(((AnonymousClass8Le) it.next()).A03);
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it2 = A0c.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            C109075e2 r26 = (C109075e2) next;
            float f = r26.A06;
            float f2 = r7.A06;
            if (f <= f2 || r26.A05 <= f2) {
                A0s2.add(next);
            }
        }
        Set A0P = C73723fy.A0P(A0s2);
        ArrayList A0s3 = AnonymousClass001.A0s();
        A0s3.add(C86624Kv.A0d(C73823g8.A01(A74.A0B, A0P)));
        AnonymousClass5T3 r12 = A74.A06;
        if (r12 != null) {
            r12.A00 = true;
        }
        C109055e0 r0 = r7.A0B;
        LatLng A0H = AnonymousClass4L0.A0H(r0.A07, r0.A08);
        Double valueOf = Double.valueOf(800.0d);
        Double valueOf2 = Double.valueOf(A0H.A00);
        Double valueOf3 = Double.valueOf(A0H.A01);
        Double valueOf4 = Double.valueOf(0.0d);
        AnonymousClass5T3 r122 = new AnonymousClass5T3(new AnonymousClass5ZO(valueOf, valueOf2, valueOf3, valueOf2, valueOf3, valueOf4, (String) null, (String) null, "pin_on_map"), new C112245jQ(r7, A74, A0s3, A0P), valueOf4, A74.A09, A0s3, 2);
        A74.A0O.A00(r122);
        A74.A06 = r122;
        A74.A0I(r7, r10, (Integer) null);
    }

    public /* synthetic */ AnonymousClass5MM(BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity) {
        this.A00 = businessDirectorySERPMapViewActivity;
    }
}
