package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: X.4hJ  reason: invalid class name and case insensitive filesystem */
public final class C90434hJ extends C95614ty {
    public final C148067Gu A00;
    public final C148077Gv A01;
    public final AnonymousClass2U6 A02;
    public final C29441ip A03;

    public void A02(C618532n r4, JSONObject jSONObject, int i) {
        C162457s7.A0J(r4, 0);
        try {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GetCatalogPromotionsGraphQLService/onErrorResponse: graphqlErrorCode: ");
            int i2 = r4.A01;
            C18260x0.A1F(A0o, i2);
            if (!A07(this.A01.A00, i2, true)) {
                A08(i);
            }
        } catch (Exception e) {
            Log.d("GetCatalogPromotionsGraphQLService/onErrorResponse", e);
            A08(i);
        }
    }

    public void BQq(IOException iOException) {
        C162457s7.A0J(iOException, 0);
        Log.e("GetCatalogPromotionsGraphQLService/onDeliveryFailure", iOException);
        if (!A07(this.A01.A00, -1, false)) {
            A08(-1);
        }
    }

    public void BSB(Exception exc) {
        C162457s7.A0J(exc, 0);
        Log.e("GetCatalogPromotionsGraphQLService/onError", exc);
        if (!A07(this.A01.A00, 0, false)) {
            A08(0);
        }
    }

    public C90434hJ(C148067Gu r10, C148077Gv r11, AnonymousClass7RW r12, C59012wB r13, AnonymousClass7MY r14, AnonymousClass2PW r15, AnonymousClass2U6 r16, C29441ip r17, AnonymousClass7IB r18, AnonymousClass4FS r19) {
        super(r12, r13, r14, r15, r18, r19, 8);
        this.A02 = r16;
        this.A03 = r17;
        this.A01 = r11;
        this.A00 = r10;
    }

    public void BRC(UserJid userJid) {
        Log.d("GetCatalogPromotionsGraphQLService/onDirectConnectionError");
        A08(422);
    }

    public void BRD(UserJid userJid) {
        Log.d("GetCatalogPromotionsGraphQLService/onDirectConnectionSucceeded");
        A05();
    }

    public final void A08(int i) {
        C18260x0.A0w("GetCatalogPromotionsGraphQLService/onFailure: ", AnonymousClass001.A0o(), i);
        C148067Gu r1 = this.A00;
        r1.A01.A07.A0S(new C71733ca((Object) this.A01, (Object) r1.A00, i, 13));
    }
}
