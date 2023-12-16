package X;

import android.content.ContentValues;

/* renamed from: X.2ux  reason: invalid class name and case insensitive filesystem */
public class C58252ux {
    public final C72303dV A00;

    public C58252ux(C72303dV r1) {
        this.A00 = r1;
    }

    public static void A00(C85284Fq r4, C30571mf r5, long j) {
        ContentValues A0E = C18290x4.A0E();
        C18270x1.A0c(A0E, "message_add_on_row_id", j);
        A0E.put("reaction", r5.A01);
        AnonymousClass3H0.A00(A0E, Long.valueOf(r5.A00), r4, "sender_timestamp").A09("message_add_on_reaction", "MessageAddOnReactionStore/insertMessageAddOnReaction", A0E);
    }
}
