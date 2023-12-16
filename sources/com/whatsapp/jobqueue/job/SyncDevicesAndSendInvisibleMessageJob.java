package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass2z0;
import X.AnonymousClass32Y;
import X.C1228065u;
import X.C18270x1;
import X.C18300x5;
import X.C18330xA;
import X.C30501mY;
import X.C389229y;
import X.C49332gM;
import X.C49422gV;
import X.C56612sH;
import X.C626936e;
import X.C627336j;
import X.C64223Cq;
import X.C64333Db;
import X.C66543Lv;
import X.C95814uZ;
import android.content.Context;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.io.ObjectInputStream;
import java.util.Set;
import org.whispersystems.jobqueue.Job;

public class SyncDevicesAndSendInvisibleMessageJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient C64223Cq A00;
    public transient C49422gV A01;
    public transient C56612sH A02;
    public transient C66543Lv A03;
    public transient AnonymousClass2z0 A04;
    public transient Set A05 = AnonymousClass002.A0K();
    public final String messageId;
    public final String rawGroupJid;
    public final String[] rawUserJids;

    public SyncDevicesAndSendInvisibleMessageJob(C30501mY r6, UserJid[] userJidArr) {
        super(C49332gM.A02(C49332gM.A00()));
        C626936e.A0H(userJidArr);
        AnonymousClass2z0 r3 = r6.A1J;
        C95814uZ r2 = r3.A00;
        C626936e.A0E(r2 instanceof GroupJid, "Invalid message");
        this.A04 = r3;
        this.rawGroupJid = C18300x5.A0i(r2);
        this.messageId = r3.A01;
        for (UserJid userJid : userJidArr) {
            Set set = this.A05;
            C626936e.A07(userJid, "invalid jid");
            set.add(userJid);
        }
        this.rawUserJids = C627336j.A0P(userJidArr);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int length;
        objectInputStream.defaultReadObject();
        String[] strArr = this.rawUserJids;
        if (strArr == null || (length = strArr.length) == 0) {
            throw C18330xA.A06("rawJids must not be empty");
        }
        this.A05 = AnonymousClass002.A0K();
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            UserJid A08 = AnonymousClass32Y.A08(str);
            if (A08 != null) {
                this.A05.add(A08);
                i++;
            } else {
                throw C18330xA.A06(AnonymousClass000.A0T("invalid jid:", str));
            }
        }
        GroupJid A032 = GroupJid.Companion.A03(this.rawGroupJid);
        if (A032 != null) {
            this.A04 = AnonymousClass2z0.A04(A032, this.messageId);
        } else {
            throw C18270x1.A0C(this.rawGroupJid, AnonymousClass000.A0l("invalid jid:"));
        }
    }

    public final String A08() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("; key=");
        A0o.append(this.A04);
        A0o.append("; rawJids=");
        return AnonymousClass000.A0R(this.A05, A0o);
    }

    public void Bm4(Context context) {
        C64333Db A002 = C389229y.A00(context);
        this.A02 = A002.Bqh();
        this.A03 = C64333Db.A3D(A002);
        this.A00 = (C64223Cq) A002.A6b.get();
        C49422gV r1 = (C49422gV) A002.A8D.get();
        this.A01 = r1;
        r1.A01(this.A04);
    }
}
