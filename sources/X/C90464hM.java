package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: X.4hM  reason: invalid class name and case insensitive filesystem */
public final class C90464hM extends C95614ty {
    public final C55682qk A00;
    public final C620433g A01;
    public final AnonymousClass2U6 A02;
    public final C60852zH A03;
    public final C181788nK A04;
    public final C90204gt A05;
    public final C29441ip A06;
    public final AnonymousClass1VX A07;
    public final C105915Wx A08;
    public final AnonymousClass31C A09;
    public final C105255Ue A0A;
    public final C40662Hg A0B;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C90464hM(X.C55682qk r10, X.C620433g r11, X.AnonymousClass7RW r12, X.C59012wB r13, X.AnonymousClass7MY r14, X.AnonymousClass2PW r15, X.AnonymousClass2U6 r16, X.C60852zH r17, X.C181788nK r18, X.C90204gt r19, X.C29441ip r20, X.AnonymousClass1VX r21, X.C105915Wx r22, X.AnonymousClass31C r23, X.C105255Ue r24, X.C40662Hg r25, X.AnonymousClass7IB r26, X.AnonymousClass4FS r27) {
        /*
            r9 = this;
            r8 = 3
            r1 = r9
            r7 = r27
            r4 = r14
            r6 = r26
            r3 = r13
            r2 = r12
            r5 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0 = r18
            r9.A04 = r0
            r0 = r24
            r9.A0A = r0
            r9.A01 = r11
            r9.A00 = r10
            r0 = r17
            r9.A03 = r0
            r0 = r16
            r9.A02 = r0
            r0 = r23
            r9.A09 = r0
            r0 = r25
            r9.A0B = r0
            r0 = r20
            r9.A06 = r0
            r0 = r22
            r9.A08 = r0
            r0 = r19
            r9.A05 = r0
            r0 = r21
            r9.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90464hM.<init>(X.2qk, X.33g, X.7RW, X.2wB, X.7MY, X.2PW, X.2U6, X.2zH, X.8nK, X.4gt, X.1ip, X.1VX, X.5Wx, X.31C, X.5Ue, X.2Hg, X.7IB, X.4FS):void");
    }

    public void A02(C618532n r8, JSONObject jSONObject, int i) {
        C162457s7.A0J(r8, 0);
        A08(new C64543Dx(2), (Exception) null, "/onErrorResponse", i, r8.A01, true);
    }

    public void BQq(IOException iOException) {
        C162457s7.A0J(iOException, 0);
        A08(new C64543Dx(3), iOException, "/onDeliveryFailure", -1, -1, false);
    }

    public void BSB(Exception exc) {
        C162457s7.A0J(exc, 0);
        A08(new C64543Dx(2), exc, "/onError", 0, 0, false);
    }

    public final void A08(C64543Dx r5, Exception exc, String str, int i, int i2, boolean z) {
        Log.e("GetProductListGraphQLService/onError/response-error");
        this.A0A.A03("plm_details_view_tag");
        if (!A07(this.A03.A01, i2, z)) {
            String A0T = AnonymousClass000.A0T("GetProductListGraphQLService", str);
            if (exc != null) {
                Log.e(A0T, exc);
            } else {
                Log.e(A0T);
            }
            this.A04.Bh3(r5);
            this.A00.A0A(AnonymousClass000.A0T("GetProductListGraphQLService", str), true, AnonymousClass000.A0Y("error_code=", AnonymousClass001.A0o(), i));
        }
    }

    public void BRC(UserJid userJid) {
        StringBuilder A0X = C18270x1.A0X(userJid);
        A0X.append("GetProductListGraphQLService/onDirectConnectionError/jid=");
        C18260x0.A1K(A0X, userJid.getRawString());
        this.A0A.A03("plm_details_view_tag");
        C86644Kx.A1K(this.A04, 2);
        C55682qk r3 = this.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("error_code=");
        r3.A0A("GetProductListGraphQLService/get product list error - direct connection failed", true, AnonymousClass000.A0h(A0o, 422));
    }

    public void BRD(UserJid userJid) {
        A05();
    }
}
