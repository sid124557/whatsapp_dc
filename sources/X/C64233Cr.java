package X;

import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3Cr  reason: invalid class name and case insensitive filesystem */
public class C64233Cr implements AnonymousClass4F2, AnonymousClass4DA {
    public final C55682qk A00;
    public final C56972sr A01;
    public final C29411im A02;
    public final C64773Ex A03;
    public final C64213Cp A04;
    public final AnonymousClass33p A05;
    public final AnonymousClass33Z A06;
    public final AnonymousClass318 A07;
    public final AnonymousClass1VX A08;
    public final AnonymousClass33S A09;
    public final C55892r5 A0A;
    public final C72173dI A0B;
    public final AnonymousClass4FS A0C;

    public final synchronized void A00() {
        AnonymousClass33p r4 = this.A05;
        Set<String> stringSet = AnonymousClass0x2.A0F(r4).getStringSet("pending_side_list_hash", AnonymousClass002.A0K());
        StringBuilder A0u = C18290x4.A0u(stringSet);
        A0u.append("DeviceUpdateNotificationHandler/process offline pending sidelist, size=");
        C18260x0.A1F(A0u, stringSet.size());
        if (!stringSet.isEmpty()) {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                A0s.add(new AnonymousClass32S((AnonymousClass39T) null, AnonymousClass001.A0m(it)));
            }
            C72173dI r0 = this.A0B;
            C55682qk r6 = this.A00;
            C56972sr r7 = this.A01;
            AnonymousClass33S r12 = this.A09;
            r0.execute(new C71233bm(r6, r7, this.A03, this.A04, this.A06, this.A07, r12, A0s));
            C18260x0.A0K(r4, "pending_side_list_hash");
        }
    }

    public boolean BFA(Message message, int i) {
        boolean z;
        AnonymousClass0PJ r14;
        long A042;
        AnonymousClass32S r13;
        boolean z2 = false;
        if (i != 204) {
            return false;
        }
        Message message2 = message;
        AnonymousClass39T r3 = (AnonymousClass39T) message2.getData().getParcelable("stanzaKey");
        C626936e.A07(r3, "stanzaKey is null");
        AnonymousClass1gR A002 = C55892r5.A00(this.A0A, r3);
        if (A002 != null) {
            A002.A03(3);
        }
        AnonymousClass36K r4 = (AnonymousClass36K) message2.obj;
        AnonymousClass36K A0k = r4.A0k(0);
        if (!(A002 == null || A0k == null)) {
            A002.A00 = A0k.A00;
        }
        if (r4.A0l("update") != null) {
            z = true;
            r13 = new AnonymousClass32S(r3, r4.A0m("update").A0q("hash"));
        } else {
            z = false;
            AnonymousClass36K A0l = r4.A0l("add");
            AnonymousClass36K A0l2 = r4.A0l("remove");
            AnonymousClass36K r7 = A0l2;
            if (A0l != null) {
                r7 = A0l;
            }
            Jid A0g = r4.A0g(C27981fH.class, "lid");
            if (r7 != null) {
                String A0q = r7.A0q("device_hash");
                byte[] bArr = null;
                String A0r = r7.A0r("device_lid_hash", (String) null);
                AnonymousClass36K A0l3 = r7.A0l("key-index-list");
                if (A0g == null || A0r == null) {
                    r14 = null;
                } else {
                    r14 = AnonymousClass0x9.A0G(A0g, A0r);
                }
                UserJid userJid = (UserJid) r4.A0h(UserJid.class, "from");
                C626936e.A06(A0q);
                AnonymousClass8OQ A012 = C57522tm.A01(A0l);
                AnonymousClass8OQ A013 = C57522tm.A01(A0l2);
                if (A0l3 == null) {
                    A042 = 0;
                } else {
                    bArr = A0l3.A01;
                    A042 = AnonymousClass36K.A04(A0l3, "ts");
                }
                r13 = new AnonymousClass32S(r14, A012, A013, userJid, r3, A0q, bArr, A042);
            } else {
                Log.e("DeviceUpdateNotificationHandler/handleXmppMessage/unknown type of device notification.");
                throw AnonymousClass24Y.A01("unknown device notification not found");
            }
        }
        if (AnonymousClass36K.A0L(r4, "offline") != null || (this.A02.A0A() && this.A08.A0Y(C58422vE.A02, 4097))) {
            z2 = true;
        }
        if (z) {
            if (z2) {
                String str = r13.A09;
                synchronized (this) {
                    if (!TextUtils.isEmpty(str)) {
                        AnonymousClass33p r42 = this.A05;
                        Set<String> stringSet = AnonymousClass0x2.A0F(r42).getStringSet("pending_side_list_hash", AnonymousClass002.A0K());
                        C626936e.A06(stringSet);
                        if (stringSet.add(str)) {
                            C18300x5.A15(C18270x1.A03(r42), "pending_side_list_hash", stringSet);
                        }
                    }
                }
            }
            Log.d("DeviceUpdateNotificationHandler/handleXmppMessage run side list sync job");
            C72173dI r5 = this.A0B;
            C55682qk r142 = this.A00;
            C56972sr r15 = this.A01;
            AnonymousClass33S r43 = this.A09;
            C64773Ex r32 = this.A03;
            C64213Cp r2 = this.A04;
            C64773Ex r16 = r32;
            C64213Cp r17 = r2;
            r5.execute(new C71233bm(r142, r15, r16, r17, this.A06, this.A07, r43, Collections.singletonList(r13)));
            return true;
        }
        if (z2) {
            C64213Cp r44 = this.A04;
            if (r44.A06.A0Y(C58422vE.A02, 560)) {
                UserJid userJid2 = r13.A06;
                C18260x0.A1P(C18290x4.A0u(userJid2), "DeviceUpdateNotificationHandler/ add to pending user to sync jid=", userJid2);
                Set singleton = Collections.singleton(userJid2);
                synchronized (r44) {
                    Set A003 = r44.A00();
                    if (A003.addAll(singleton)) {
                        C18300x5.A15(C18270x1.A03(r44.A05), "pending_users_to_sync_device", C18280x3.A0h(C627336j.A0O(A003)));
                    }
                }
            }
        }
        Log.d("DeviceUpdateNotificationHandler/handleXmppMessage run side list sync job");
        C72173dI r52 = this.A0B;
        C55682qk r1422 = this.A00;
        C56972sr r152 = this.A01;
        AnonymousClass33S r432 = this.A09;
        C64773Ex r322 = this.A03;
        C64213Cp r22 = this.A04;
        C64773Ex r162 = r322;
        C64213Cp r172 = r22;
        r52.execute(new C71233bm(r1422, r152, r162, r172, this.A06, this.A07, r432, Collections.singletonList(r13)));
        return true;
        this.A09.A01(r3);
        return true;
    }

    public void BUE() {
        if (this.A04.A06.A0Y(C58422vE.A02, 560)) {
            this.A0C.BkM(new C71273bq((Object) this, 16));
        }
    }

    public C64233Cr(C55682qk r2, C56972sr r3, C29411im r4, C64773Ex r5, C64213Cp r6, AnonymousClass33p r7, AnonymousClass33Z r8, AnonymousClass318 r9, AnonymousClass1VX r10, AnonymousClass33S r11, C55892r5 r12, AnonymousClass4FS r13) {
        this.A08 = r10;
        this.A00 = r2;
        this.A0C = r13;
        this.A01 = r3;
        this.A09 = r11;
        this.A03 = r5;
        this.A02 = r4;
        this.A04 = r6;
        this.A07 = r9;
        this.A0A = r12;
        this.A05 = r7;
        this.A06 = r8;
        this.A0B = C72173dI.A00(r13);
    }

    public int[] B81() {
        int[] A0E = C18330xA.A0E();
        A0E[0] = 204;
        return A0E;
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
