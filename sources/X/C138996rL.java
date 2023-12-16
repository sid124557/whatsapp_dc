package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.6rL  reason: invalid class name and case insensitive filesystem */
public final class C138996rL extends C41022Iq {
    public static final ArrayList A02 = AnonymousClass0x2.A0i(new String[]{"ACTIVE", "EXPIRED", "SUSPENDED", "VOIDED"});
    public static final ArrayList A03 = AnonymousClass0x2.A0i(new String[]{"AMEX", "DISCOVER", "MAESTRO", "MASTERCARD", "VISA"});
    public static final ArrayList A04 = AnonymousClass0x2.A0i(new String[]{"combo", "credit", "debit"});
    public static final ArrayList A05 = C18260x0.A0C("0", "1");
    public final C138946rG A00;
    public final C138936rF A01;

    public C138996rL(AnonymousClass36K r10) {
        AnonymousClass36K r2 = r10;
        AnonymousClass36K.A0N(r10, "card");
        Class<String> cls = String.class;
        C626836d.A06(r2, cls, 4L, 4, (Object) null, new String[]{"last4"}, false);
        C626836d.A06(r2, cls, AnonymousClass0x2.A0T(), 1000L, (Object) null, new String[]{"time-last-added"}, false);
        AnonymousClass6C8.A13(r10, "verified", A05);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        C626836d.A06(r2, cls, A0R, A0S, (Object) null, strArr, false);
        C626836d.A06(r2, cls, A0R, A0S, (Object) null, new String[]{"network-type"}, false);
        C41022Iq.A01(r10, "display-state", A02);
        this.A01 = (C138936rF) C1896292a.A0L(r10, 47, 0);
        this.A00 = (C138946rG) C1896292a.A0L(r10, 48, 0);
        this.A00 = r10;
    }
}
