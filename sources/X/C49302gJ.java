package X;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2gJ  reason: invalid class name and case insensitive filesystem */
public final class C49302gJ {
    public final /* synthetic */ C53572nJ A00;
    public final /* synthetic */ C46872cL A01;
    public final /* synthetic */ C43902Tx A02;

    public C49302gJ(C53572nJ r1, C46872cL r2, C43902Tx r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void A00(int i, long j) {
        C129586aY r0 = this.A00.A01;
        ArrayList A0c = C73783g4.A0c(r0);
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            C52072kq.A00(A0c, it);
        }
        List A0j = C18280x3.A0j(j);
        C43902Tx r02 = this.A02;
        C626736a.A06(r02.A02, r02.A07, r02.A09, A0j, A0c, 4);
        this.A01.A00(2, j, i);
    }

    public void A01(long j, String str) {
        C46872cL r2;
        int i;
        int i2;
        C53572nJ r22 = this.A00;
        Map map = r22.A05;
        Long valueOf = Long.valueOf(j);
        C53342mw r0 = (C53342mw) map.get(valueOf);
        if (r0 == null) {
            C626936e.A0D(false, "CrosspostMediaUploadManager/cached DB data map entry is empty");
            C129586aY r02 = r22.A01;
            ArrayList A0c = C73783g4.A0c(r02);
            Iterator it = r02.iterator();
            while (it.hasNext()) {
                C52072kq.A00(A0c, it);
            }
            List A12 = C18290x4.A12(valueOf);
            C43902Tx r03 = this.A02;
            C626736a.A06(r03.A02, r03.A07, r03.A09, A12, A0c, 4);
            r2 = this.A01;
            i = 2;
            i2 = -12;
        } else {
            String str2 = str;
            map.put(valueOf, new C53342mw(r0.A03, r0.A02, str2, r0.A04, r0.A00));
            ContentValues A06 = AnonymousClass0x9.A06();
            A06.put("direct_url_path", str);
            ((C55202py) this.A02.A09.get()).A02(A06, C18290x4.A12(valueOf));
            r2 = this.A01;
            i = 1;
            i2 = 0;
        }
        r2.A00(i, j, i2);
    }
}
