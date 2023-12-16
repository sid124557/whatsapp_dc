package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.Objects;

/* renamed from: X.3Sk  reason: invalid class name and case insensitive filesystem */
public class C68243Sk implements AnonymousClass4EZ {
    public final C69263Wi A00;
    public final AnonymousClass2OG A01;
    public final AnonymousClass31C A02;

    public void BQs(String str) {
        Log.e("ChatSupportTicketProtocolHelper/onDeliveryFailure");
        C69263Wi r2 = this.A00;
        AnonymousClass2OG r1 = this.A01;
        Objects.requireNonNull(r1);
        r2.BkS(C70003Zm.A00(r1, 33));
    }

    public C68243Sk(C69263Wi r1, AnonymousClass2OG r2, AnonymousClass31C r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void BSN(AnonymousClass36K r5, String str) {
        C18260x0.A1Q(AnonymousClass001.A0o(), "ChatSupportTicketProtocolHelper/onError: error response:", r5);
        AnonymousClass36K A0l = r5.A0l("error");
        if (A0l != null) {
            this.A00.BkS(new C117705sM((Object) this, AnonymousClass36K.A01(A0l, "code"), 37));
        }
    }

    public void BdM(AnonymousClass36K r6, String str) {
        C69263Wi r2;
        Runnable runnable;
        String str2;
        AnonymousClass36K A0l = r6.A0l(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
        C95814uZ r4 = null;
        if (A0l != null) {
            AnonymousClass36K A0l2 = A0l.A0l("ticket_id");
            if (A0l2 != null) {
                str2 = A0l2.A0n();
            } else {
                str2 = null;
            }
            AnonymousClass36K A0l3 = A0l.A0l("group_jid");
            if (A0l3 != null) {
                try {
                    GroupJid A03 = GroupJid.Companion.A03(A0l3.A0n());
                    r4 = A03 == null ? C106405Yw.A04(A0l3.A0n()) : A03;
                } catch (AnonymousClass24P unused) {
                    Log.e("ChatSupportTicketProtocolHelper/onSuccess called with invalid jid");
                }
            }
            if (str2 != null) {
                C18260x0.A0s("ChatSupportTicketProtocolHelper/onSuccess called, ticketId=", str2, AnonymousClass001.A0o());
                r2 = this.A00;
                runnable = new C117715sN(this, r4, str2, 46);
                r2.BkS(runnable);
            }
        }
        Log.e("ChatSupportTicketProtocolHelper/onSuccess called but ticketId is null, posting an error");
        r2 = this.A00;
        runnable = C70003Zm.A00(this, 32);
        r2.BkS(runnable);
    }
}
