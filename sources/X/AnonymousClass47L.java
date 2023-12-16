package X;

import android.content.Context;
import java.util.List;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.47L  reason: invalid class name */
public final class AnonymousClass47L extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass300 A00;
    public transient C95804uY A01;
    public transient AnonymousClass31C A02;
    public transient C56182rZ A03;
    public final String newsletterRawJid;
    public String receiptStanzaId;
    public List serverMessageIds;

    public void Bm4(Context context) {
        C162457s7.A0J(context, 0);
        C64333Db A012 = C389229y.A01(context);
        this.A02 = A012.BLC();
        this.A03 = (C56182rZ) A012.AO5.get();
        this.A00 = (AnonymousClass300) A012.AM7.get();
    }

    public final String A08() {
        C95814uZ A05 = C95814uZ.A00.A05(this.newsletterRawJid);
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass0x7.A1G(A0o, "; jid=", A05);
        A0o.append(C18310x6.A0B(C18290x4.A0k(this.serverMessageIds)));
        A0o.append("; count=");
        return AnonymousClass000.A0h(A0o, this.serverMessageIds.size());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass47L(X.C95804uY r4, java.lang.String r5, java.util.List r6) {
        /*
            r3 = this;
            X.2gM r2 = X.C49332gM.A01()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "view-receipt-"
            java.lang.String r0 = X.C18260x0.A03(r4, r0, r1)
            X.C49332gM.A03(r0, r2)
            org.whispersystems.jobqueue.JobParameters r0 = X.C49332gM.A02(r2)
            r3.<init>(r0)
            r3.A01 = r4
            r3.receiptStanzaId = r5
            r3.serverMessageIds = r6
            java.lang.String r0 = r4.getRawString()
            r3.newsletterRawJid = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass47L.<init>(X.4uY, java.lang.String, java.util.List):void");
    }
}
