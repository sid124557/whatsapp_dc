package X;

import android.content.Context;
import com.whatsapp.util.Log;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.47C  reason: invalid class name */
public abstract class AnonymousClass47C extends Job implements AnonymousClass495, C1228065u {
    public boolean isCancelled;
    public AnonymousClass48L newsletterRequestTimeManager;

    public void cancel() {
        this.isCancelled = true;
    }

    public void Bm4(Context context) {
        if (this instanceof C28501gz) {
            C28501gz r2 = (C28501gz) this;
            C162457s7.A0J(context, 0);
            C64333Db A01 = C389229y.A01(context);
            r2.A02 = C64333Db.A39(A01);
            r2.A00 = C64333Db.A26(A01);
            r2.A03 = C64333Db.A3L(A01);
            r2.A04 = A01.Anh();
            r2.A05 = C64333Db.A66(A01);
            r2.A01 = (C56332ro) A01.A6Q.get();
            r2.A06 = A01.AoV();
        } else if (this instanceof C28481gx) {
            C28481gx r22 = (C28481gx) this;
            C162457s7.A0J(context, 0);
            C64333Db A012 = C389229y.A01(context);
            r22.A00 = A012.Bqh();
            r22.A02 = A012.Anh();
            r22.A01 = (C56662sM) A012.AaX.get();
            r22.A04 = A012.AoV();
            r22.A03 = (C50142hh) A012.AcK.A00.A89.get();
        } else if (this instanceof AnonymousClass1gw) {
            C162457s7.A0J(context, 0);
            Log.i("NewsletterReactionSendersGraphqlJob/setContext");
            ((AnonymousClass1gw) this).A00 = C389229y.A01(context).Anh();
        } else if (this instanceof AnonymousClass1h0) {
            AnonymousClass1h0 r3 = (AnonymousClass1h0) this;
            C162457s7.A0J(context, 0);
            C64333Db A013 = C389229y.A01(context);
            C56982ss A39 = C64333Db.A39(A013);
            C162457s7.A0J(A39, 0);
            r3.A00 = A39;
            r3.A02 = A013.Anh();
            C56652sL A3L = C64333Db.A3L(A013);
            C162457s7.A0J(A3L, 0);
            r3.A01 = A3L;
            r3.A04 = C64333Db.A66(A013);
            r3.A05 = A013.AoV();
            C53942nv r0 = (C53942nv) A013.AOM.get();
            C162457s7.A0J(r0, 0);
            r3.A03 = r0;
        } else if (this instanceof C28451gt) {
            C28451gt r23 = (C28451gt) this;
            C162457s7.A0J(context, 0);
            C64333Db A014 = C389229y.A01(context);
            r23.A02 = A014.BLC();
            r23.A01 = C64333Db.A3L(A014);
            r23.A03 = C64333Db.A66(A014);
            r23.A00 = A014.BsO();
            r23.A04 = (C50462iD) A014.ANk.get();
        } else if (this instanceof C28461gu) {
            C28461gu r24 = (C28461gu) this;
            C162457s7.A0J(context, 0);
            C64333Db A015 = C389229y.A01(context);
            r24.A00 = A015.Azq();
            r24.A02 = A015.BLC();
            r24.A01 = C64333Db.A3L(A015);
            r24.A03 = C64333Db.A66(A015);
            r24.A04 = (C56212rc) A015.ANc.get();
        } else if (this instanceof C28471gv) {
            C28471gv r25 = (C28471gv) this;
            C162457s7.A0J(context, 0);
            C64333Db A016 = C389229y.A01(context);
            r25.A00 = A016.Azq();
            r25.A01 = C64333Db.A39(A016);
            r25.A03 = A016.BLC();
            r25.A02 = C64333Db.A3L(A016);
            r25.A04 = C64333Db.A66(A016);
            r25.A05 = (C56212rc) A016.ANc.get();
        } else {
            C28491gy r26 = (C28491gy) this;
            C162457s7.A0J(context, 0);
            C64333Db A017 = C389229y.A01(context);
            r26.A01 = A017.Avy();
            r26.A02 = A017.Anh();
            r26.A00 = C64333Db.A3L(A017);
            r26.A03 = (C56182rZ) A017.AO5.get();
            r26.A04 = (C51022j9) A017.ANj.get();
            r26.A05 = (C49152g4) A017.ANu.get();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass47C(java.lang.String r3) {
        /*
            r2 = this;
            X.2gM r1 = X.C49332gM.A01()
            r1.A00 = r3
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r1.A05(r0)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A04()
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass47C.<init>(java.lang.String):void");
    }
}
