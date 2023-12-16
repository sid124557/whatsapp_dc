package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: X.4hO  reason: invalid class name and case insensitive filesystem */
public final class C90484hO extends C95614ty {
    public final AnonymousClass2U6 A00;
    public final AnonymousClass5TG A01;
    public final C184088rE A02;
    public final C90174gq A03;
    public final C29441ip A04;
    public final AnonymousClass1VX A05;
    public final C105255Ue A06;

    public C90484hO(AnonymousClass7RW r10, C59012wB r11, AnonymousClass7MY r12, AnonymousClass2PW r13, AnonymousClass2U6 r14, AnonymousClass5TG r15, C184088rE r16, C90174gq r17, C29441ip r18, AnonymousClass1VX r19, C105255Ue r20, AnonymousClass7IB r21, AnonymousClass4FS r22) {
        super(r10, r11, r12, r13, r21, r22, 5);
        this.A06 = r20;
        this.A04 = r18;
        this.A01 = r15;
        this.A02 = r16;
        this.A00 = r14;
        this.A03 = r17;
        this.A05 = r19;
    }

    public void A02(C618532n r5, JSONObject jSONObject, int i) {
        C162457s7.A0J(r5, 0);
        A08();
        Log.e("GetSingleCollectionGraphQLService/sendRequest/onErrorResponse");
        AnonymousClass5TG r3 = this.A01;
        if (!A07(r3.A04, r5.A01, true)) {
            this.A02.BSn(r3, i);
        }
    }

    public final void A08() {
        if (this.A01.A05 == null) {
            this.A06.A03("view_collection_details_tag");
        }
    }

    public void BRC(UserJid userJid) {
        Log.e("GetSingleCollectionGraphQLService/sendRequest/direct-connection-error");
        this.A02.BSn(this.A01, 422);
    }

    public void BRD(UserJid userJid) {
        Log.i("GetSingleCollectionGraphQLService/onDirectConnectionSucceeded/retry-request");
        A05();
    }

    public void BQq(IOException iOException) {
        A08();
        Log.e("GetSingleCollectionGraphQLService/sendRequest/onDeliveryFailure");
        AnonymousClass5TG r3 = this.A01;
        if (!A07(r3.A04, -1, false)) {
            this.A02.BSn(r3, -1);
        }
    }

    public void BSB(Exception exc) {
        A08();
        Log.e("GetSingleCollectionGraphQLService/sendRequest/onError");
        AnonymousClass5TG r2 = this.A01;
        if (!A07(r2.A04, 0, false)) {
            this.A02.BSn(r2, 0);
        }
    }
}
