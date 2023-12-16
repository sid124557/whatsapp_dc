package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: X.4hP  reason: invalid class name and case insensitive filesystem */
public final class C90494hP extends C95614ty {
    public final C55682qk A00;
    public final C620433g A01;
    public final AnonymousClass2U6 A02;
    public final C184068rC A03;
    public final C90224gv A04;
    public final C29441ip A05;
    public final C160157n8 A06;
    public final AnonymousClass1VX A07;
    public final C105915Wx A08;
    public final AnonymousClass31C A09;
    public final C105255Ue A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C90494hP(X.C55682qk r10, X.C620433g r11, X.AnonymousClass7RW r12, X.C59012wB r13, X.AnonymousClass7MY r14, X.AnonymousClass2PW r15, X.AnonymousClass2U6 r16, X.C184068rC r17, X.C90224gv r18, X.C29441ip r19, X.C160157n8 r20, X.AnonymousClass1VX r21, X.C105915Wx r22, X.AnonymousClass31C r23, X.C105255Ue r24, X.AnonymousClass7IB r25, X.AnonymousClass4FS r26) {
        /*
            r9 = this;
            r8 = 1
            r7 = r26
            r3 = r13
            r6 = r25
            r2 = r12
            r1 = r9
            r4 = r14
            r5 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0 = r17
            r9.A03 = r0
            r9.A00 = r10
            r0 = r24
            r9.A0A = r0
            r9.A01 = r11
            r0 = r19
            r9.A05 = r0
            r0 = r16
            r9.A02 = r0
            r0 = r20
            r9.A06 = r0
            r0 = r23
            r9.A09 = r0
            r0 = r22
            r9.A08 = r0
            r0 = r18
            r9.A04 = r0
            r0 = r21
            r9.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90494hP.<init>(X.2qk, X.33g, X.7RW, X.2wB, X.7MY, X.2PW, X.2U6, X.8rC, X.4gv, X.1ip, X.7n8, X.1VX, X.5Wx, X.31C, X.5Ue, X.7IB, X.4FS):void");
    }

    public void A02(C618532n r8, JSONObject jSONObject, int i) {
        C162457s7.A0J(r8, 0);
        A08((Exception) null, "/onErrorResponse", r8.A01, i, true, false);
    }

    public void BQq(IOException iOException) {
        C162457s7.A0J(iOException, 0);
        A08(iOException, "/delivery-error", -1, -1, false, true);
    }

    public void BSB(Exception exc) {
        C162457s7.A0J(exc, 0);
        A08(exc, "/onError", 0, 0, false, false);
    }

    public final void A08(Exception exc, String str, int i, int i2, boolean z, boolean z2) {
        Log.e("GetProductCatalogGraphQLService/onError/response-error");
        C160157n8 r2 = this.A06;
        if (r2.A08 == null) {
            this.A0A.A01();
        }
        UserJid userJid = r2.A07;
        C162457s7.A0C(userJid);
        if (!A07(userJid, i, z)) {
            String A0T = AnonymousClass000.A0T("GetProductCatalogGraphQLService", str);
            if (exc != null) {
                Log.e(A0T, exc);
            } else {
                Log.e(A0T);
            }
            this.A03.BSo(r2, i2);
            if (!z2) {
                this.A00.A0A(AnonymousClass000.A0T("GetProductCatalogGraphQLService", str), true, AnonymousClass000.A0Y("error_code=", AnonymousClass001.A0o(), i2));
            }
        }
    }

    public void BRC(UserJid userJid) {
        C18260x0.A1Q(C18270x1.A0X(userJid), "GetProductCatalogGraphQLServicesendGetBizProductCatalog/direct-connection-error/jid=", userJid);
        this.A03.BSo(this.A06, 422);
    }

    public void BRD(UserJid userJid) {
        A05();
    }
}
