package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.3Cp  reason: invalid class name and case insensitive filesystem */
public class C64213Cp implements AnonymousClass4F2, AnonymousClass485 {
    public final C49712gy A00;
    public final C64773Ex A01;
    public final C49422gV A02;
    public final AnonymousClass314 A03;
    public final C56612sH A04;
    public final AnonymousClass33p A05;
    public final AnonymousClass1VX A06;
    public final AnonymousClass4FS A07;

    public void BUE() {
        if (this.A06.A0Y(C58422vE.A02, 560)) {
            this.A07.BkM(new C69973Zj(this, 36));
        }
    }

    public C64213Cp(C49712gy r1, C64773Ex r2, C49422gV r3, AnonymousClass314 r4, C56612sH r5, AnonymousClass33p r6, AnonymousClass1VX r7, AnonymousClass4FS r8) {
        this.A04 = r5;
        this.A06 = r7;
        this.A07 = r8;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r6;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final Set A00() {
        HashSet A0K = AnonymousClass002.A0K();
        Set<String> stringSet = AnonymousClass0x2.A0F(this.A05).getStringSet("pending_users_to_sync_device", AnonymousClass002.A0K());
        C626936e.A06(stringSet);
        A0K.addAll(C627336j.A0C((String[]) stringSet.toArray(new String[0])));
        return A0K;
    }

    public void A01(UserJid[] userJidArr, int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DeviceSyncManager/scheduleSyncDevicesJob size=");
        A0o.append(r7);
        C18260x0.A0y(" type=", A0o, i);
        String[] A0P = C627336j.A0P(userJidArr);
        if (A0P == null || A0P.length == 0) {
            throw AnonymousClass001.A0c("invalid jid list");
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (UserJid userJid : userJidArr) {
            C49422gV r1 = this.A02;
            Set set = r1.A03;
            synchronized (set) {
                if (!set.contains(userJid)) {
                    AnonymousClass0x2.A1K(userJid, r1.A01, r1.A00.A0H());
                    set.add(userJid);
                    A0s.add(userJid);
                }
            }
        }
        if (!A0s.isEmpty()) {
            new C71733ca((Object) A0s, (Object) this, i, 24).run();
        } else {
            Log.d("SyncDevicesJob/scheduleSyncDevicesJob/ already has the job running.");
        }
    }

    public /* synthetic */ void BUB() {
    }

    public /* synthetic */ void BUC() {
    }

    public /* synthetic */ void BUD() {
    }

    public /* synthetic */ void BUF() {
    }
}
