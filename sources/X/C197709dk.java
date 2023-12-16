package X;

import com.whatsapp.payments.phoenix.flowconfigurationservice.clientdaslquery.BrazilDeviceResolver$resolve$1;
import java.util.Map;

/* renamed from: X.9dk  reason: invalid class name and case insensitive filesystem */
public final class C197709dk implements AnonymousClass4DR {
    public String A00;
    public String A01;
    public String A02;
    public final C69263Wi A03;
    public final C56972sr A04;
    public final C56612sH A05;
    public final C54292oU A06;
    public final C194929Vc A07;
    public final C40602Ha A08;
    public final AnonymousClass9U5 A09;
    public final AnonymousClass9U4 A0A;
    public final C194029Rh A0B;

    public /* bridge */ /* synthetic */ Object Bk2(Enum enumR, Object obj, Map map) {
        C194689Uc r5 = (C194689Uc) obj;
        AnonymousClass9KH r4 = (AnonymousClass9KH) enumR;
        C18260x0.A0O(r5, r4);
        C133736hr r0 = ((C191029At) r5).A00;
        if (r0 != null) {
            return C380725l.A00(C72553du.A00, new BrazilDeviceResolver$resolve$1(r0, this, r4, (C84814Du) null));
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(C197709dk.class.getSimpleName());
        C18260x0.A1K(A0o, "/resolveObject credential does not exists");
        return null;
    }

    public C197709dk(C69263Wi r2, C56972sr r3, C56612sH r4, C54292oU r5, C194929Vc r6, C40602Ha r7, AnonymousClass9U5 r8, AnonymousClass9U4 r9, C194029Rh r10) {
        C18260x0.A0f(r4, r2, r5, r3, r9);
        C162457s7.A0J(r8, 6);
        C162457s7.A0J(r10, 7);
        C162457s7.A0J(r6, 8);
        C162457s7.A0J(r7, 9);
        this.A05 = r4;
        this.A03 = r2;
        this.A06 = r5;
        this.A04 = r3;
        this.A0A = r9;
        this.A09 = r8;
        this.A0B = r10;
        this.A07 = r6;
        this.A08 = r7;
    }

    public Class B3E() {
        return AnonymousClass9KH.class;
    }
}
