package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: X.4hL  reason: invalid class name and case insensitive filesystem */
public final class C90454hL extends C95614ty {
    public final C620433g A00;
    public final C105405Uu A01;
    public final AnonymousClass5Y9 A02;
    public final AnonymousClass2U6 A03;
    public final C184098rF A04;
    public final C90214gu A05;
    public final C29441ip A06;
    public final AnonymousClass7PB A07;
    public final AnonymousClass1VX A08;
    public final C105915Wx A09;
    public final AnonymousClass31C A0A;
    public final C105255Ue A0B;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C90454hL(X.C620433g r10, X.C105405Uu r11, X.AnonymousClass5Y9 r12, X.AnonymousClass7RW r13, X.C59012wB r14, X.AnonymousClass7MY r15, X.AnonymousClass2PW r16, X.AnonymousClass2U6 r17, X.C184098rF r18, X.C90214gu r19, X.C29441ip r20, X.AnonymousClass7PB r21, X.AnonymousClass1VX r22, X.C105915Wx r23, X.AnonymousClass31C r24, X.C105255Ue r25, X.AnonymousClass7IB r26, X.AnonymousClass4FS r27) {
        /*
            r9 = this;
            r8 = 2
            r0 = 9
            X.C162457s7.A0J(r12, r0)
            r1 = r9
            r7 = r27
            r3 = r14
            r6 = r26
            r2 = r13
            r4 = r15
            r5 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0 = r25
            r9.A0B = r0
            r9.A00 = r10
            r9.A02 = r12
            r9.A01 = r11
            r0 = r21
            r9.A07 = r0
            r0 = r17
            r9.A03 = r0
            r0 = r24
            r9.A0A = r0
            r0 = r20
            r9.A06 = r0
            r0 = r23
            r9.A09 = r0
            r0 = r18
            r9.A04 = r0
            r0 = r19
            r9.A05 = r0
            r0 = r22
            r9.A08 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90454hL.<init>(X.33g, X.5Uu, X.5Y9, X.7RW, X.2wB, X.7MY, X.2PW, X.2U6, X.8rF, X.4gu, X.1ip, X.7PB, X.1VX, X.5Wx, X.31C, X.5Ue, X.7IB, X.4FS):void");
    }

    public void A02(C618532n r7, JSONObject jSONObject, int i) {
        C162457s7.A0J(r7, 0);
        A08((Exception) null, "/onErrorResponse", i, r7.A01, true);
    }

    public void BQq(IOException iOException) {
        C162457s7.A0J(iOException, 0);
        A08(iOException, "/onDeliveryFailure", 0, -1, false);
    }

    public void BRC(UserJid userJid) {
        StringBuilder A0g = C18280x3.A0g(userJid, 0);
        A0g.append("GetProductGraphQLService/direct-connection-error/jid=");
        C18260x0.A1K(A0g, userJid.getRawString());
        this.A04.BT2(this.A07, 0);
    }

    public void BSB(Exception exc) {
        C162457s7.A0J(exc, 0);
        A08(exc, "/onError", 0, 0, false);
    }

    public final void A08(Exception exc, String str, int i, int i2, boolean z) {
        Log.e("GetProductGraphQLService/onError/response-error");
        this.A0B.A03("view_product_tag");
        AnonymousClass7PB r1 = this.A07;
        UserJid userJid = r1.A01;
        C162457s7.A0C(userJid);
        if (!A07(userJid, i2, z)) {
            String A0T = AnonymousClass000.A0T("GetProductGraphQLService", str);
            if (exc != null) {
                Log.e(A0T, exc);
            } else {
                Log.e(A0T);
            }
            this.A04.BT2(r1, i);
        }
    }

    public void BRD(UserJid userJid) {
        A05();
    }
}
