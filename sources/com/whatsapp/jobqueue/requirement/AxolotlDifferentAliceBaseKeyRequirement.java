package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass001;
import X.AnonymousClass24P;
import X.AnonymousClass36G;
import X.C1228065u;
import X.C18270x1;
import X.C18330xA;
import X.C389229y;
import X.C621133n;
import X.C626936e;
import X.C64333Db;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import java.io.ObjectInputStream;
import java.util.Arrays;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class AxolotlDifferentAliceBaseKeyRequirement implements Requirement, C1228065u {
    public static final long serialVersionUID = 1;
    public transient C621133n A00;
    public transient DeviceJid A01;
    public final String jid;
    public final byte[] oldAliceBaseKey;

    public boolean BIR() {
        return !Arrays.equals(this.oldAliceBaseKey, this.A00.A0A(AnonymousClass36G.A02(this.A01)).A01.A00.aliceBaseKey_.A07());
    }

    public AxolotlDifferentAliceBaseKeyRequirement(DeviceJid deviceJid, byte[] bArr) {
        this.A01 = deviceJid;
        this.jid = deviceJid.getRawString();
        C626936e.A0G(bArr);
        this.oldAliceBaseKey = bArr;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.A01 = DeviceJid.Companion.A02(this.jid);
            byte[] bArr = this.oldAliceBaseKey;
            if (bArr == null || bArr.length == 0) {
                throw C18330xA.A06("oldAliceBaseKey must not be empty");
            }
        } catch (AnonymousClass24P unused) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("jid must be a valid user jid; jid=");
            throw C18270x1.A0C(this.jid, A0o);
        }
    }

    public void Bm4(Context context) {
        this.A00 = C64333Db.A2v(C389229y.A01(context));
    }
}
