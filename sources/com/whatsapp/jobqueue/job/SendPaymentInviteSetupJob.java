package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass31C;
import X.AnonymousClass32Y;
import X.AnonymousClass36K;
import X.AnonymousClass39T;
import X.AnonymousClass39V;
import X.AnonymousClass9U5;
import X.C1228065u;
import X.C18260x0;
import X.C1899593h;
import X.C389229y;
import X.C50412i8;
import X.C626936e;
import X.C64333Db;
import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public class SendPaymentInviteSetupJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass31C A00;
    public transient AnonymousClass9U5 A01;
    public final boolean inviteUsed;
    public final String jidRawStr;
    public final int paymentService;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendPaymentInviteSetupJob(com.whatsapp.jid.UserJid r3, int r4, boolean r5) {
        /*
            r2 = this;
            X.2gM r1 = new X.2gM
            r1.<init>()
            java.lang.String r0 = "SendPaymentInviteSetupJob"
            r1.A00 = r0
            r0 = 1
            r1.A02 = r0
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r1.A05(r0)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A04()
            r2.<init>(r0)
            java.lang.String r0 = r3.getRawString()
            r2.jidRawStr = r0
            r2.paymentService = r4
            r2.inviteUsed = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendPaymentInviteSetupJob.<init>(com.whatsapp.jid.UserJid, int, boolean):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.jidRawStr)) {
            throw new InvalidObjectException("jid must not be empty");
        } else if (this.paymentService == 0) {
            throw new InvalidObjectException("payment service must not be unknown");
        }
    }

    public void A04() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PAY: SendPaymentInviteSetupJob notif job added: ");
        C18260x0.A1L(A0o, A08());
    }

    public void A05() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("canceled SendPaymentInviteSetupJob job");
        Log.w(AnonymousClass000.A0X(A08(), A0o));
    }

    public boolean A06(Exception exc) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("exception while running SendPaymentInviteSetupJob job");
        Log.w(AnonymousClass000.A0X(A08(), A0o), exc);
        return true;
    }

    public void A07() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PAY: starting SendPaymentInviteSetupJob job");
        C18260x0.A1L(A0o, A08());
        String A04 = this.A00.A04();
        C50412i8 r2 = new C50412i8();
        String str2 = this.jidRawStr;
        AnonymousClass32Y r1 = UserJid.Companion;
        r2.A02 = r1.A0E(str2);
        r2.A05 = "notification";
        r2.A08 = "pay";
        r2.A07 = A04;
        AnonymousClass39T A012 = r2.A01();
        UserJid A0E = r1.A0E(this.jidRawStr);
        int i = this.paymentService;
        boolean z = this.inviteUsed;
        AnonymousClass39V[] r6 = new AnonymousClass39V[3];
        r6[0] = new AnonymousClass39V((Jid) A0E, "to");
        int A0G = AnonymousClass39V.A0G(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "pay", r6);
        r6[2] = new AnonymousClass39V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A04);
        AnonymousClass36K[] r3 = new AnonymousClass36K[A0G];
        AnonymousClass39V[] r22 = new AnonymousClass39V[3];
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "account-set-up", r22, 0);
        if (i == A0G) {
            str = "FBPAY";
        } else if (i == 2) {
            str = "NOVI";
        } else if (i != 3) {
            str = null;
        } else {
            str = "UPI";
        }
        C626936e.A06(str);
        AnonymousClass39V.A0B("service", str, r22, A0G);
        r22[2] = new AnonymousClass39V("invite-used", z ? 1 : 0);
        r3[0] = AnonymousClass36K.A0I("invite", r22);
        this.A00.A07(new AnonymousClass36K("notification", r6, r3), A012, 272);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("PAY: done SendPaymentInviteSetupJob job");
        C18260x0.A1L(A0o2, A08());
    }

    public final String A08() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("; jid=");
        A0o.append(this.jidRawStr);
        A0o.append("; service: ");
        A0o.append(this.paymentService);
        A0o.append("; inviteUsed: ");
        A0o.append(this.inviteUsed);
        A0o.append("; persistentId=");
        A0o.append(this.A01);
        return A0o.toString();
    }

    public void Bm4(Context context) {
        C64333Db r1 = (C64333Db) C389229y.A02(context.getApplicationContext(), C64333Db.class);
        this.A00 = r1.BLC();
        this.A01 = C1899593h.A0F(r1);
    }
}
