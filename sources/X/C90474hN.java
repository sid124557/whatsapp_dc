package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: X.4hN  reason: invalid class name and case insensitive filesystem */
public final class C90474hN extends C95614ty {
    public boolean A00;
    public final C151157Tq A01;
    public final AnonymousClass2U6 A02;
    public final C184058rB A03;
    public final C29441ip A04;

    public C90474hN(C151157Tq r10, AnonymousClass7RW r11, C59012wB r12, AnonymousClass7MY r13, AnonymousClass2PW r14, AnonymousClass2U6 r15, C184058rB r16, C29441ip r17, AnonymousClass7IB r18, AnonymousClass4FS r19) {
        super(r11, r12, r13, r14, r18, r19, 6);
        this.A02 = r15;
        this.A04 = r17;
        this.A03 = r16;
        this.A01 = r10;
    }

    public void A02(C618532n r4, JSONObject jSONObject, int i) {
        C162457s7.A0J(r4, 0);
        try {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GetCategoriesGraphQLService/onErrorResponse: graphqlErrorCode: ");
            int i2 = r4.A01;
            C18260x0.A1F(A0o, i2);
            UserJid userJid = this.A01.A02;
            C162457s7.A0C(userJid);
            if (!A07(userJid, i2, true)) {
                A09(i);
            }
        } catch (Exception e) {
            Log.d("GetCategoriesGraphQLService/onErrorResponse", e);
            A09(i);
        }
    }

    public void BQq(IOException iOException) {
        C162457s7.A0J(iOException, 0);
        Log.e("GetCategoriesGraphQLService/onDeliveryFailure", iOException);
        if (this.A00) {
            A08(-1);
            return;
        }
        this.A00 = true;
        A05();
    }

    public void BSB(Exception exc) {
        C162457s7.A0J(exc, 0);
        Log.e("GetCategoriesGraphQLService/onError", exc);
        A08(0);
    }

    public final void A08(int i) {
        try {
            UserJid userJid = this.A01.A02;
            C162457s7.A0C(userJid);
            if (!A07(userJid, i, false)) {
                A09(i);
            }
        } catch (Exception e) {
            Log.d("GetCategoriesGraphQLService/onException", e);
            A09(0);
        }
    }

    public void BRC(UserJid userJid) {
        Log.d("GetCategoriesGraphQLService/onDirectConnectionError");
        A09(422);
    }

    public void BRD(UserJid userJid) {
        Log.d("GetCategoriesGraphQLService/onDirectConnectionSucceeded");
        A05();
    }

    public final void A09(int i) {
        C18260x0.A0w("GetCategoriesGraphQLService/onFailure: ", AnonymousClass001.A0o(), i);
        this.A03.BSm(this.A01, i);
    }
}
