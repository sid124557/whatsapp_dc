package X;

import com.whatsapp.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6Bc  reason: invalid class name and case insensitive filesystem */
public class C124136Bc implements C84634Dc {
    public Object A00;
    public final int A01;

    public C124136Bc(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BTD(Map map) {
        if (this.A01 != 0) {
            Iterator A0v = AnonymousClass001.A0v(map);
            while (A0v.hasNext()) {
                C18280x3.A13(A0v.next());
            }
            AnonymousClass4UA r2 = (AnonymousClass4UA) this.A00;
            C66513Ls r0 = r2.A01;
            if (r0 != null) {
                r2.A0K((C95814uZ) null, r0.A0Z);
            }
        }
    }

    public void BTE(C108865dg r11) {
        if (this.A01 != 0) {
            AnonymousClass4UA r2 = (AnonymousClass4UA) this.A00;
            C66513Ls r1 = r2.A01;
            if (r1 != null && (r1 instanceof C131946eR)) {
                C131946eR r12 = (C131946eR) r1;
                r12.A00 = r11;
                String str = r11.A04;
                if (str != null) {
                    r12.A0J = str;
                }
                String str2 = r11.A02;
                if (str2 != null) {
                    r12.A0G = str2;
                }
                byte[] A012 = r11.A01();
                if (A012 != null) {
                    r12.A0V = A012;
                }
                r2.A0G(r2.A01, AnonymousClass59D.SMALL_THUMBNAIL_LOADED);
            }
        } else if (!r11.A00()) {
            C89894fS r13 = (C89894fS) this.A00;
            r13.A0B.A0U((C624134x) null, r11.A00, r11.A04, r11.A02, r13.A03.getString(R.string.f11nameremoved), Collections.singletonList(r13.A0W), r11.A01());
        }
    }
}
