package X;

import com.whatsapp.bridge.wfal.WfalManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2cz  reason: invalid class name and case insensitive filesystem */
public final class C47272cz {
    public final C64393Dh A00;
    public final C69263Wi A01;
    public final AnonymousClass2WV A02;
    public final C29121iJ A03;
    public final C183538qC A04;
    public final C183538qC A05;
    public final C183538qC A06;
    public final C183538qC A07;
    public final C183538qC A08;

    public C47272cz(C64393Dh r2, C69263Wi r3, AnonymousClass2WV r4, C29121iJ r5, C183538qC r6, C183538qC r7, C183538qC r8, C183538qC r9, C183538qC r10) {
        C18260x0.A0f(r3, r2, r4, r5, r6);
        C18260x0.A0W(r7, r8, r9);
        C162457s7.A0J(r10, 9);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r6;
        this.A07 = r7;
        this.A06 = r8;
        this.A04 = r9;
        this.A08 = r10;
    }

    public final void A00(C84954Ej r18, String str, List list, List list2, List list3, int i) {
        String str2;
        C626936e.A0B(!C615631i.A02());
        ArrayList A0s = AnonymousClass001.A0s();
        List list4 = list;
        int size = list4.size();
        for (int i2 = 0; i2 < size; i2++) {
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(C18320x8.A0R(list4, i2).A0K + 86400000);
            List list5 = list2;
            if (list2 != null) {
                str2 = AnonymousClass001.A0n(list5, i2);
            } else {
                str2 = null;
            }
            A0s.add(new C52082kr(str2, seconds));
        }
        List list6 = list3;
        C50052hY r5 = new C50052hY(r18, this, str, list4, list6, i);
        ArrayList A0c = C73783g4.A0c(list4);
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            C624134x.A0Z(A0c, it);
        }
        C626736a.A06(this.A01, this.A03, this.A07, A0c, list6, 1);
        C58762vm r4 = (C58762vm) this.A06.get();
        C185988uZ r0 = C158317jm.A00().A00;
        byte[] B3i = r0.B3i();
        byte[] generatePublicKey = r0.generatePublicKey(B3i);
        C162457s7.A0D(generatePublicKey);
        C162457s7.A0D(B3i);
        C72383dd r1 = new C72383dd(generatePublicKey, B3i);
        if (!C615631i.A02()) {
            WfalManager wfalManager = r4.A01;
            wfalManager.A03.A00(new AnonymousClass3MS(r5, r4, r1, A0s, list6));
            return;
        }
        throw AnonymousClass001.A0e("Check failed.");
    }
}
