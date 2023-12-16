package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass32Y;
import X.C1228065u;
import X.C18330xA;
import X.C389229y;
import X.C49332gM;
import X.C626936e;
import X.C627336j;
import X.C64223Cq;
import android.content.Context;
import com.whatsapp.jid.UserJid;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public class SyncProfilePictureJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient C64223Cq A00;
    public final String[] jids;
    public final int type;

    public SyncProfilePictureJob(UserJid[] userJidArr, int i) {
        super(C49332gM.A00().A04());
        C626936e.A0H(userJidArr);
        for (UserJid A07 : userJidArr) {
            C626936e.A07(A07, "an element of jids was empty.");
        }
        this.jids = C627336j.A0P(userJidArr);
        this.type = i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int length;
        objectInputStream.defaultReadObject();
        String[] strArr = this.jids;
        if (strArr == null || (length = strArr.length) == 0) {
            throw C18330xA.A06("jids must not be empty");
        }
        int i = 0;
        while (AnonymousClass32Y.A08(strArr[i]) != null) {
            i++;
            if (i >= length) {
                return;
            }
        }
        throw C18330xA.A06("an jid is not a UserJid");
    }

    public final String A08() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("; jids=");
        return AnonymousClass000.A0X(C627336j.A09(this.jids), A0o);
    }

    public void Bm4(Context context) {
        this.A00 = (C64223Cq) C389229y.A01(context).A6b.get();
    }
}
