package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: X.4hK  reason: invalid class name and case insensitive filesystem */
public final class C90444hK extends C95614ty {
    public final AnonymousClass5PW A00;
    public final AnonymousClass2U6 A01;
    public final AnonymousClass7PS A02;
    public final C90234gw A03;
    public final C29441ip A04;
    public final AnonymousClass1VX A05;
    public final C105255Ue A06;

    public C90444hK(AnonymousClass5PW r10, AnonymousClass7RW r11, C59012wB r12, AnonymousClass7MY r13, AnonymousClass2PW r14, AnonymousClass2U6 r15, AnonymousClass7PS r16, C90234gw r17, C29441ip r18, AnonymousClass1VX r19, C105255Ue r20, AnonymousClass7IB r21, AnonymousClass4FS r22) {
        super(r11, r12, r13, r14, r21, r22, 4);
        this.A03 = r17;
        this.A01 = r15;
        this.A02 = r16;
        this.A06 = r20;
        this.A04 = r18;
        this.A00 = r10;
        this.A05 = r19;
    }

    public void A02(C618532n r5, JSONObject jSONObject, int i) {
        C162457s7.A0J(r5, 0);
        A08();
        C18260x0.A0x("GetCollectionsGraphQLService/onErrorResponse/error - ", AnonymousClass001.A0o(), i);
        AnonymousClass7PS r3 = this.A02;
        if (!A07(r3.A05, r5.A01, true)) {
            this.A00.A01(r3, i);
        }
    }

    public final void A08() {
        if (this.A02.A06 == null) {
            AnonymousClass316 A002 = C105255Ue.A00(this.A06, "catalog_collections_view_tag");
            if (A002 == null) {
                Log.d("BizQPLManager/endCollectionsDataSourceBlock/pref tracker not found. Have you called startPrefTracker()?");
            } else {
                A002.A09("datasource_collections");
            }
        }
    }

    public void BRD(UserJid userJid) {
        Log.d("GetCollectionsGraphQLService/onDirectConnectionSucceeded");
        A05();
    }

    public void BQq(IOException iOException) {
        A08();
        Log.e("GetCollectionsGraphQLService/onDeliveryFailure");
        AnonymousClass7PS r3 = this.A02;
        if (!A07(r3.A05, -1, false)) {
            this.A00.A01(r3, -1);
        }
    }

    public void BRC(UserJid userJid) {
        StringBuilder A0X = C18270x1.A0X(userJid);
        A0X.append("GetCollectionsGraphQLService/onDirectConnectionError, jid = ");
        C18260x0.A1K(A0X, userJid.getRawString());
        this.A00.A01(this.A02, 422);
    }

    public void BSB(Exception exc) {
        A08();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GetCollectionsGraphQLService/onError/error - ");
        C18270x1.A1F(A0o, 0);
        AnonymousClass7PS r1 = this.A02;
        if (!A07(r1.A05, 0, false)) {
            this.A00.A01(r1, 0);
        }
    }
}
