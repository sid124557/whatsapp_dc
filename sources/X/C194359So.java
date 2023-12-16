package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.9So  reason: invalid class name and case insensitive filesystem */
public class C194359So {
    public final Context A00;
    public final C69263Wi A01;
    public final C56972sr A02;
    public final C56612sH A03;
    public final C617332a A04;
    public final AnonymousClass31C A05;
    public final C194929Vc A06;
    public final C40602Ha A07;
    public final AnonymousClass9U5 A08;
    public final AnonymousClass9U4 A09;
    public final C202539mB A0A;
    public final C194029Rh A0B;

    public void A00(C133736hr r8) {
        if (r8 == null) {
            this.A0A.BQz((C133736hr) null, C1899693i.A0M(), (ArrayList) null, false);
            return;
        }
        C133796hx r0 = r8.A08;
        C626936e.A06(r0);
        if (TextUtils.isEmpty(((AnonymousClass99I) r0).A06)) {
            new C194099Ro(this.A00, this.A01, this.A07, this.A08, new C204789pv(r8, 0, this)).A00(r8.A0A);
            return;
        }
        A01(r8);
    }

    public final void A01(C133736hr r30) {
        Log.i("PAY: BrazilDeviceBindingAction starts to bind device");
        C56612sH r4 = this.A03;
        C56972sr r2 = this.A02;
        String A022 = AnonymousClass35J.A02(r2, r4);
        C133736hr r3 = r30;
        String A002 = this.A0B.A00(r3.A01);
        String A023 = AnonymousClass35J.A02(r2, r4);
        C194929Vc r1 = this.A06;
        String A042 = r1.A04(A002);
        C133796hx r0 = r3.A08;
        C626936e.A06(r0);
        String A082 = r1.A08(A002, A022, ((AnonymousClass99I) r0).A06);
        AnonymousClass31C r13 = this.A05;
        String A032 = r13.A03();
        String str = r3.A0A;
        C35351wj A0W = C1899693i.A0W(A032);
        C56052rL A012 = C56052rL.A01();
        C1899593h.A1M(A012);
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "br-bind-network-token");
        if (C1899593h.A1b(str, false)) {
            C56052rL.A0D(A0U, "credential-id", str);
        }
        if (C626836d.A0M(A042, 1, 10000, false)) {
            C56052rL.A0D(A0U, "device-csr", A042);
        }
        if (C626836d.A0M(A082, 1, 10000, false)) {
            C56052rL.A0D(A0U, "jws-token", A082);
        }
        if (C626836d.A0M(A022, 1, 10000, false)) {
            C56052rL.A0D(A0U, "client-reference-id", A022);
        }
        C1899593h.A1O(A0U, A002, false);
        C1899593h.A1N(A0U, A023);
        r13.A0D(new C203889oT(this.A00, this.A07, this.A01, this, 1), C1899593h.A0S(A0U, A012, A0W), A032, 204, 0);
    }

    public C194359So(Context context, C69263Wi r2, C56972sr r3, C56612sH r4, C617332a r5, AnonymousClass31C r6, C194929Vc r7, C40602Ha r8, AnonymousClass9U5 r9, AnonymousClass9U4 r10, C202539mB r11, C194029Rh r12) {
        this.A03 = r4;
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r6;
        this.A09 = r10;
        this.A08 = r9;
        this.A0B = r12;
        this.A04 = r5;
        this.A06 = r7;
        this.A07 = r8;
        this.A0A = r11;
    }
}
