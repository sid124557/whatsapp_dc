package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass31C;
import X.AnonymousClass4FV;
import X.C1228065u;
import X.C18330xA;
import X.C389229y;
import X.C49332gM;
import X.C626936e;
import X.C627336j;
import X.C64333Db;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public final class BulkGetPreKeyJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass4FV A00;
    public transient AnonymousClass31C A01;
    public final int context;
    public final String[] identityChangedJids;
    public final String[] jids;

    public BulkGetPreKeyJob(DeviceJid[] deviceJidArr, DeviceJid[] deviceJidArr2, int i) {
        super(C49332gM.A00().A04());
        String[] A0P;
        String[] A0P2 = C627336j.A0P(deviceJidArr);
        C626936e.A0H(A0P2);
        this.jids = A0P2;
        if (deviceJidArr2 == null) {
            A0P = null;
        } else {
            A0P = C627336j.A0P(deviceJidArr2);
        }
        this.identityChangedJids = A0P;
        this.context = i;
        int length = deviceJidArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            DeviceJid deviceJid = deviceJidArr[i3];
            if (deviceJid == null) {
                throw AnonymousClass001.A0c("an element of jids was empty");
            } else if (!C627336j.A0K(deviceJid)) {
                i3++;
            } else {
                throw AnonymousClass000.A0E(deviceJid, "jid must be an individual jid; jid=", AnonymousClass001.A0o());
            }
        }
        if (deviceJidArr2 != null) {
            int length2 = deviceJidArr2.length;
            while (i2 < length2) {
                DeviceJid deviceJid2 = deviceJidArr2[i2];
                if (deviceJid2 == null) {
                    throw AnonymousClass001.A0c("an element of identityChangedJids was empty");
                } else if (!C627336j.A0K(deviceJid2)) {
                    i2++;
                } else {
                    throw AnonymousClass000.A0E(deviceJid2, "jid must be an individual jid; jid=", AnonymousClass001.A0o());
                }
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int length;
        objectInputStream.defaultReadObject();
        String[] strArr = this.jids;
        if (strArr == null || (length = strArr.length) == 0) {
            throw C18330xA.A06("jids must not be empty");
        }
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            DeviceJid nullable = DeviceJid.getNullable(strArr[i2]);
            if (nullable == null) {
                throw C18330xA.A06("an element of jids was empty");
            } else if (!C627336j.A0K(nullable)) {
                i2++;
            } else {
                throw C18330xA.A06(AnonymousClass000.A0k(nullable, "jid must be an individual jid; jid=").toString());
            }
        }
        String[] strArr2 = this.identityChangedJids;
        if (strArr2 != null) {
            int length2 = strArr2.length;
            while (i < length2) {
                DeviceJid nullable2 = DeviceJid.getNullable(strArr2[i]);
                if (nullable2 == null) {
                    throw C18330xA.A06("an element of identityChangedJids was empty");
                } else if (!C627336j.A0K(nullable2)) {
                    i++;
                } else {
                    throw C18330xA.A06(AnonymousClass000.A0k(nullable2, "jid must be an individual jid; jid=").toString());
                }
            }
        }
    }

    public final String A08() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("; jids=");
        A0o.append(C627336j.A09(this.jids));
        A0o.append("; context=");
        return AnonymousClass000.A0h(A0o, this.context);
    }

    public void Bm4(Context context2) {
        C64333Db A002 = C389229y.A00(context2);
        this.A00 = A002.BsT();
        this.A01 = A002.BLC();
    }
}
