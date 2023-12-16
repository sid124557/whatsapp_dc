package X;

import android.content.ContentValues;
import java.util.List;
import java.util.Map;

/* renamed from: X.2gL  reason: invalid class name and case insensitive filesystem */
public final class C49322gL {
    public final /* synthetic */ C52732lx A00;
    public final /* synthetic */ C46902cO A01;
    public final /* synthetic */ C43832Tq A02;

    public void A01(Integer num, int i, long j) {
        List A0j = C18280x3.A0j(j);
        C43832Tq r0 = this.A02;
        AnonymousClass36X.A06(r0.A01, r0.A06, r0.A08, A0j, 4);
        this.A01.A00(num, 2, i, j);
    }

    public C49322gL(C52732lx r1, C46902cO r2, C43832Tq r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void A00(long j, String str) {
        C46902cO r6;
        Integer num;
        int i;
        int i2;
        Map map = this.A00.A02;
        long j2 = j;
        Long valueOf = Long.valueOf(j);
        C53142mc r0 = (C53142mc) map.get(valueOf);
        if (r0 == null) {
            C626936e.A0D(false, "XFamilyCrosspostMediaUploadManager/cached DB data map entry is empty");
            List A12 = C18290x4.A12(valueOf);
            C43832Tq r02 = this.A02;
            AnonymousClass36X.A06(r02.A01, r02.A06, r02.A08, A12, 4);
            r6 = this.A01;
            num = null;
            i = 2;
            i2 = -12;
        } else {
            long j3 = r0.A01;
            map.put(valueOf, new C53142mc(r0.A02, r0.A03, str, r0.A00, j3));
            ContentValues A06 = AnonymousClass0x9.A06();
            A06.put("media_path", str);
            ((AnonymousClass30J) this.A02.A08.get()).A02(A06, C18280x3.A0j(j));
            r6 = this.A01;
            num = null;
            i = 1;
            i2 = 0;
        }
        r6.A00(num, i, i2, j2);
    }
}
