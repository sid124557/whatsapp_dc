package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass001;
import X.AnonymousClass318;
import X.AnonymousClass36G;
import X.C1228065u;
import X.C18260x0;
import X.C389229y;
import X.C621133n;
import X.C626936e;
import X.C64333Db;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import org.whispersystems.jobqueue.requirements.Requirement;

public class AxolotlPeerDeviceSessionRequirement implements Requirement, C1228065u {
    public transient C621133n A00;
    public transient AnonymousClass318 A01;
    public final String targetJidRawString;

    public boolean BIR() {
        DeviceJid nullable = DeviceJid.getNullable(this.targetJidRawString);
        C626936e.A06(nullable);
        if (this.A01.A04().contains(nullable)) {
            return this.A00.A0Z(AnonymousClass36G.A02(nullable));
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AxolotlDeviceSessionRequirement/isPresent/warning: the specific device is not in db, handle the error in the job. jid=");
        C18260x0.A1M(A0o, this.targetJidRawString);
        return true;
    }

    public AxolotlPeerDeviceSessionRequirement(DeviceJid deviceJid) {
        this.targetJidRawString = deviceJid.getRawString();
    }

    public void Bm4(Context context) {
        C64333Db A012 = C389229y.A01(context);
        this.A01 = (AnonymousClass318) A012.AZQ.get();
        this.A00 = C64333Db.A2v(A012);
    }
}
