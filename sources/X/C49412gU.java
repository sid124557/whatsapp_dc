package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2gU  reason: invalid class name and case insensitive filesystem */
public final class C49412gU {
    public final C55492qR A00;
    public final C64213Cp A01;
    public final C621133n A02;
    public final Set A03;

    public final Set A00(Collection collection, boolean z) {
        C162457s7.A0J(collection, 0);
        HashSet A0K = AnonymousClass002.A0K();
        HashSet A0K2 = AnonymousClass002.A0K();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            DeviceJid A0R = AnonymousClass0x7.A0R(it);
            if (AnonymousClass0x9.A1P(A0R)) {
                UserJid userJid = A0R.userJid;
                DeviceJid primaryDevice = userJid.getPrimaryDevice();
                if (!this.A02.A0Z(AnonymousClass36G.A02(primaryDevice)) && !this.A03.contains(primaryDevice)) {
                    C18260x0.A1R(AnonymousClass001.A0o(), "voip/encryption/schedule usync for ", userJid);
                    this.A01.A01(new UserJid[]{userJid}, 4);
                    A0K2.add(primaryDevice);
                    A0K.add(A0R);
                }
            }
            if (!this.A02.A0Z(AnonymousClass36G.A02(A0R)) && !this.A03.contains(A0R)) {
                A0K2.add(A0R);
                A0K.add(A0R);
            }
        }
        if (!A0K2.isEmpty()) {
            DeviceJid[] deviceJidArr = (DeviceJid[]) A0K2.toArray(new DeviceJid[0]);
            C55492qR r1 = this.A00;
            int i = 6;
            if (z) {
                i = 10;
            }
            r1.A04(deviceJidArr, i, false);
        }
        return A0K;
    }

    public final void A01(DeviceJid deviceJid) {
        boolean add = this.A03.add(deviceJid);
        StringBuilder A0o = AnonymousClass001.A0o();
        if (add) {
            C18260x0.A1R(A0o, "voip/encryption/startGetPreKeyJobForE2EFail for ", deviceJid);
            this.A00.A04(new DeviceJid[]{deviceJid}, 7, false);
            return;
        }
        C18260x0.A1R(A0o, "voip/encryption/startGetPreKeyJobForE2EFail do nothing, PreKey already sent for ", deviceJid);
    }

    public C49412gU(C55492qR r2, C64213Cp r3, C621133n r4) {
        C18260x0.A0V(r3, r4, r2);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
        Set newSetFromMap = Collections.newSetFromMap(AnonymousClass0x9.A1D());
        C162457s7.A0D(newSetFromMap);
        this.A03 = newSetFromMap;
    }
}
