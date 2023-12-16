package X;

import android.util.Base64;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3bm  reason: invalid class name and case insensitive filesystem */
public final class C71233bm implements Runnable {
    public final C55682qk A00;
    public final C56972sr A01;
    public final C64773Ex A02;
    public final C64213Cp A03;
    public final AnonymousClass33Z A04;
    public final AnonymousClass318 A05;
    public final AnonymousClass33S A06;
    public final List A07;

    public final void A00(AnonymousClass8OQ r8, AnonymousClass32S r9) {
        UserJid userJid = r9.A06;
        if (r8.isEmpty()) {
            return;
        }
        if (!this.A01.A0a(userJid)) {
            AnonymousClass318 r5 = this.A05;
            C129496aP r6 = new C129496aP();
            Iterator A0q = AnonymousClass000.A0q(r5.A09(userJid));
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                if (r8.containsKey(A0w.getKey()) && r8.get(A0w.getKey()) == A0w.getValue()) {
                    r6.add(A0w.getKey());
                }
            }
            r5.A0E(r6.build(), userJid, (String) null);
            return;
        }
        C55682qk r3 = this.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Remove self device, userJid=");
        A0o.append(userJid);
        r3.A0A("invalid-device-notification", false, AnonymousClass000.A0P(r8, "; toAdd=", A0o));
    }

    public final boolean A01(AnonymousClass8OQ r21, UserJid userJid, AnonymousClass32S r23) {
        AnonymousClass1DS r8;
        C47932e4 r2;
        String A0P;
        Object obj;
        AnonymousClass8OQ r5 = r21;
        if (!r5.isEmpty()) {
            UserJid userJid2 = userJid;
            if (!this.A01.A0a(userJid2)) {
                AnonymousClass32S r10 = r23;
                byte[] bArr = r10.A0A;
                if (bArr == null) {
                    A0P = "SyncDeviceNotificationRunnable/verifyADVIndexList/no key index list in device add notification";
                } else {
                    UserJid userJid3 = r10.A06;
                    AnonymousClass33Z r52 = this.A04;
                    AnonymousClass0PJ A032 = r52.A03(userJid3, bArr);
                    if (A032 == null || (obj = A032.A00) == null) {
                        r8 = null;
                        r2 = null;
                    } else {
                        r8 = (AnonymousClass1DS) obj;
                        r2 = (C47932e4) A032.A01;
                    }
                    long j = r10.A00;
                    if (!r52.A0D(userJid3, r8, AnonymousClass33D.A01, j)) {
                        A0P = AnonymousClass000.A0P(userJid3, "SyncDeviceNotificationRunnable/verifyADVIndexList/validate indexList fail, userJid=", AnonymousClass001.A0o());
                    } else {
                        C626936e.A06(r8);
                        AnonymousClass318 r6 = this.A05;
                        HashMap hashMap = new HashMap(r6.A09(userJid3));
                        hashMap.putAll(r10.A02);
                        C60212yB A072 = r6.A07(userJid3);
                        if (A072 == null) {
                            A072 = new C60212yB(r8.rawId_, C60212yB.A00(AnonymousClass239.A00(r8.accountType_)), 0, 0, 0, 0);
                        }
                        r6.A0I(AnonymousClass8OQ.copyOf(r52.A07(r8.validIndexes_, r6.A09(userJid3), hashMap, r8.currentIndex_)), r6.A06(A072, j), userJid3, false);
                        if (r2 != null) {
                            r52.A0A.A0M(r2, AnonymousClass36G.A03(userJid3));
                            return false;
                        }
                    }
                }
                Log.e(A0P);
                Log.e("SyncDeviceNotificationRunnable/handleUserDeviceUpdate/invalid adv data");
                return true;
            }
            C55682qk r22 = this.A00;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Add self device, userJid=");
            A0o.append(userJid2);
            r22.A0A("invalid-device-notification", false, AnonymousClass000.A0P(r5, "; toAdd=", A0o));
        }
        return false;
    }

    public C71233bm(C55682qk r1, C56972sr r2, C64773Ex r3, C64213Cp r4, AnonymousClass33Z r5, AnonymousClass318 r6, AnonymousClass33S r7, List list) {
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = r7;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A07 = list;
    }

    public void run() {
        String str;
        boolean z;
        Boolean valueOf;
        Boolean valueOf2;
        AnonymousClass0PJ A0G;
        AnonymousClass0PJ r0;
        Object obj;
        ArrayList arrayList;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SyncDeviceNotificationRunnable/run start size=");
        List<AnonymousClass32S> list = this.A07;
        C18260x0.A1F(A0o, list.size());
        HashSet A0K = AnonymousClass002.A0K();
        for (AnonymousClass32S r5 : list) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("SyncDeviceNotificationRunnable/run processing id=");
            AnonymousClass39T r02 = r5.A07;
            if (r02 != null) {
                str = r02.A07;
            } else {
                str = null;
            }
            A0o2.append(str);
            A0o2.append(" device_hash=");
            String str2 = r5.A08;
            C18260x0.A1J(A0o2, str2);
            String str3 = r5.A09;
            if (str3 != null) {
                C18260x0.A0q("SyncDeviceNotificationRunnable/getSidelistContactsMatchingHash hash=", str3, C18290x4.A0u(str3));
                byte[] decode = Base64.decode(str3.getBytes(), 0);
                try {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    ArrayList A0s = AnonymousClass001.A0s();
                    List singletonList = Collections.singletonList(decode);
                    List A0F = this.A02.A05.A0F(true);
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    Iterator it = A0F.iterator();
                    while (it.hasNext()) {
                        AnonymousClass3ZH A0R = C18310x6.A0R(it);
                        if (!C621733w.A02(A0R.A0H) && C621733w.A01(A0R, instance, singletonList)) {
                            A0s2.add(A0R);
                        }
                    }
                    Iterator it2 = A0s2.iterator();
                    while (it2.hasNext()) {
                        C95814uZ r1 = C18310x6.A0R(it2).A0H;
                        if (r1 instanceof UserJid) {
                            A0s.add(r1);
                        }
                    }
                    C18260x0.A1A("; size=", AnonymousClass000.A0m("SyncDeviceNotificationRunnable/getSidelistContactsMatchingHash hash=", str3), A0s);
                    arrayList = A0s;
                } catch (NoSuchAlgorithmException e) {
                    this.A00.A0A("SyncDeviceNotificationRunnable/getSidelistContactsMatchingHash NoSuchAlgorithmException", true, e.toString());
                    Log.e("SyncDeviceNotificationRunnable/onRun/NoSuchAlgorithmException.");
                    arrayList = Collections.EMPTY_LIST;
                }
                A0K.addAll(arrayList);
            } else {
                UserJid userJid = r5.A06;
                C626936e.A06(userJid);
                AnonymousClass318 r6 = this.A05;
                if (r6.A02(userJid) > r5.A00) {
                    Log.w("SyncDeviceNotificationRunnable/handleUserDeviceUpdate/local ts is larger than notification one");
                    Boolean bool = Boolean.FALSE;
                    A0G = new AnonymousClass0PJ(bool, bool);
                } else {
                    boolean A012 = A01(r5.A02, userJid, r5);
                    AnonymousClass0PJ r9 = r5.A01;
                    boolean z2 = false;
                    if (r9 != null) {
                        z = A01(r5.A04, (UserJid) r9.A00, r5);
                    } else {
                        z = false;
                    }
                    if (A012 || z) {
                        valueOf = Boolean.valueOf(A012);
                        valueOf2 = Boolean.valueOf(z);
                    } else {
                        A00(r5.A03, r5);
                        if (r9 != null) {
                            A00(r5.A05, r5);
                            String str4 = (String) r9.A01;
                            C626936e.A06(str4);
                            if (!r6.A0J((UserJid) r9.A00, str4)) {
                                z2 = true;
                            }
                        }
                        C626936e.A06(str2);
                        valueOf = C18320x8.A0V(r6.A0J(userJid, str2));
                        valueOf2 = Boolean.valueOf(z2);
                    }
                    A0G = AnonymousClass0x9.A0G(valueOf, valueOf2);
                }
                if (AnonymousClass001.A1Z(A0G.A00)) {
                    C626936e.A06(userJid);
                    A0K.add(userJid);
                }
                if (!(!AnonymousClass001.A1Z(A0G.A01) || (r0 = r5.A01) == null || (obj = r0.A00) == null)) {
                    C626936e.A06(obj);
                    A0K.add(obj);
                }
            }
        }
        if (!A0K.isEmpty()) {
            C18260x0.A1A("SyncDeviceNotificationRunnable/run sync device size=", AnonymousClass001.A0o(), A0K);
            this.A03.A01((UserJid[]) A0K.toArray(new UserJid[A0K.size()]), 2);
        }
        for (AnonymousClass32S r03 : list) {
            AnonymousClass39T r12 = r03.A07;
            if (r12 != null) {
                this.A06.A01(r12);
            } else {
                Log.e("SyncDeviceNotificationRunnable/sendStanzaReceived no stanzaKey");
            }
        }
    }
}
