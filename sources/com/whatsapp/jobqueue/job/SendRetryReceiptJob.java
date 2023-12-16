package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass32W;
import X.C1228065u;
import X.C18330xA;
import X.C389229y;
import X.C42612Ov;
import X.C46472bg;
import X.C48972fm;
import X.C55262q4;
import X.C56972sr;
import X.C614730x;
import X.C621133n;
import X.C64333Db;
import X.C73523fe;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.Jid;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public final class SendRetryReceiptJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient C56972sr A00;
    public transient C55262q4 A01;
    public transient C621133n A02;
    public transient C48972fm A03;
    public transient C614730x A04;
    public transient C46472bg A05;
    public final String category;
    public final String id;
    public final String jid;
    public final int localRegistrationId;
    public final long loggableStanzaId;
    public final String participant;
    public final String recipientJid;
    public final int retryCount;
    public final int retryErrorCode;
    public final long timestamp;

    public final Pair A08() {
        C73523fe A032 = this.A04.A03();
        try {
            Pair A0C = AnonymousClass0x9.A0C(this.A02.A0d(), new C42612Ov[]{this.A02.A0D(), this.A02.A0E()});
            if (A032 != null) {
                A032.close();
            }
            return A0C;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public String A09() {
        String str = this.jid;
        AnonymousClass32W r1 = Jid.Companion;
        Jid A032 = r1.A03(str);
        Jid A033 = r1.A03(this.participant);
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass0x7.A1G(A0o, "; jid=", A032);
        A0o.append(this.id);
        A0o.append("; participant=");
        A0o.append(A033);
        A0o.append("; retryCount=");
        return AnonymousClass000.A0h(A0o, this.retryCount);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendRetryReceiptJob(X.AnonymousClass4FY r4, int r5, int r6) {
        /*
            r3 = this;
            X.2gM r2 = X.C49332gM.A01()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "retry-receipt-"
            r1.append(r0)
            X.4uZ r0 = r4.BC1()
            java.lang.String r0 = X.C627336j.A07(r0)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.C49332gM.A03(r0, r2)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A04()
            r3.<init>(r0)
            com.whatsapp.jid.Jid r0 = r4.BC2()
            java.lang.String r0 = X.C18300x5.A0i(r0)
            r3.jid = r0
            java.lang.String r0 = r4.getId()
            X.C626936e.A06(r0)
            r3.id = r0
            com.whatsapp.jid.Jid r0 = r4.BAb()
            java.lang.String r0 = X.C627336j.A07(r0)
            r3.participant = r0
            com.whatsapp.jid.UserJid r0 = r4.BBz()
            java.lang.String r0 = X.C627336j.A07(r0)
            r3.recipientJid = r0
            long r0 = r4.BDj()
            r3.timestamp = r0
            int r0 = r4.BCI()
            r3.retryCount = r0
            r3.localRegistrationId = r5
            long r0 = r4.B9D()
            r3.loggableStanzaId = r0
            java.lang.String r0 = r4.B5K()
            r3.category = r0
            r3.retryErrorCode = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendRetryReceiptJob.<init>(X.4FY, int, int):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (AnonymousClass32W.A00(this.jid) == null) {
            throw C18330xA.A06("jid must not be empty");
        } else if (TextUtils.isEmpty(this.id)) {
            throw C18330xA.A06("id must not be empty");
        }
    }

    public void Bm4(Context context) {
        C64333Db A002 = C389229y.A00(context);
        this.A00 = A002.BL4();
        this.A04 = (C614730x) A002.AW8.get();
        this.A03 = (C48972fm) A002.AW6.get();
        this.A02 = C64333Db.A2v(A002);
        this.A05 = (C46472bg) A002.ALt.get();
        this.A01 = (C55262q4) A002.A5q.get();
    }
}
