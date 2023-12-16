package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.3Lp  reason: invalid class name and case insensitive filesystem */
public class C66483Lp implements AnonymousClass485 {
    public final C116985rC A00;
    public final C55682qk A01;
    public final C56972sr A02;
    public final C64773Ex A03;
    public final C621133n A04;
    public final C56982ss A05;
    public final C56892sj A06;
    public final C55332qB A07;
    public final AnonymousClass318 A08;
    public final C54932pW A09;
    public final AnonymousClass27Z A0A;
    public final AnonymousClass2LE A0B;

    public Set A04(C624134x r7) {
        C95814uZ r5 = r7.A1J.A00;
        if ((r7 instanceof C30341mI) || !C627636p.A0P(this.A02, r7)) {
            return null;
        }
        if ((!(r5 instanceof UserJid) && !(r5 instanceof C28011fL)) || r7.A0I != 0 || r7.A1R != null) {
            return null;
        }
        if (r7 instanceof AnonymousClass48R) {
            return A02(r5, r7.A1I);
        }
        return A03(r5, r7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (X.C624134x.A0b(r10) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A05(X.C624134x r10) {
        /*
            r9 = this;
            X.2z0 r2 = r10.A1J
            X.4uZ r6 = r2.A00
            X.5rC r1 = r9.A00
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0016
            r1.A04()
            boolean r0 = X.C624134x.A0b(r10)
            r8 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r8 = 0
        L_0x0017:
            X.2sr r7 = r9.A02
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0031
            boolean r0 = X.C627636p.A0R(r7, r10)
            if (r0 != 0) goto L_0x0031
            byte r1 = r10.A1I
            r0 = 83
            if (r1 != r0) goto L_0x0062
            X.4uZ r0 = r10.A0Q
            boolean r0 = r7.A0a(r0)
            if (r0 == 0) goto L_0x0062
        L_0x0031:
            java.util.Set r5 = r9.A06(r10)
            if (r5 == 0) goto L_0x005e
            boolean r0 = r6 instanceof X.C28011fL
            if (r0 == 0) goto L_0x005e
            long r3 = r10.A0I
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0057
            boolean r0 = X.C627636p.A0R(r7, r10)
            if (r0 != 0) goto L_0x0057
            byte r1 = r10.A1I
            r0 = 83
            if (r1 != r0) goto L_0x005f
            X.4uZ r0 = r10.A0Q
            boolean r0 = r7.A0a(r0)
            if (r0 == 0) goto L_0x005f
        L_0x0057:
            java.util.Set r0 = r9.A03(r6, r10)
            r5.addAll(r0)
        L_0x005e:
            return r5
        L_0x005f:
            if (r8 == 0) goto L_0x005e
            goto L_0x0057
        L_0x0062:
            if (r8 != 0) goto L_0x0031
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66483Lp.A05(X.34x):java.util.Set");
    }

    public final Set A06(C624134x r6) {
        Set A0C;
        AnonymousClass2z0 r2 = r6.A1J;
        C95814uZ r1 = r2.A00;
        if (r1 instanceof C28011fL) {
            Set A012 = this.A07.A01(r2);
            HashSet A15 = AnonymousClass0x9.A15(A012);
            C55682qk r22 = this.A01;
            HashSet hashSet = new HashSet(A012.size());
            C627336j.A0F(r22, A012, hashSet);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                A15.addAll(this.A08.A0D(C18310x6.A0T(it)));
            }
            boolean A0V = C627636p.A0V(this.A03, this.A05, this.A06, r6);
            AnonymousClass318 r0 = this.A08;
            if (A0V) {
                A0C = r0.A0B();
            } else {
                A0C = r0.A0C();
            }
            A15.addAll(A0C);
            C56972sr r12 = this.A02;
            A15.remove(C56972sr.A03(r12));
            A15.remove(r12.A0G());
            return A15;
        } else if (r1 instanceof UserJid) {
            return A03(r1, r6);
        } else {
            return null;
        }
    }

    public void A07(C624134x r11, Set set) {
        C28011fL r1;
        Integer valueOf;
        Integer valueOf2;
        AnonymousClass2z0 r9 = r11.A1J;
        C95814uZ r3 = r9.A00;
        if ((r3 instanceof C28011fL) && (r1 = (C28011fL) r3) != null) {
            int A002 = this.A09.A00(r1);
            AnonymousClass2LE r12 = this.A0B;
            boolean z = true;
            if (!set.isEmpty() && r12.A01.A0Y(C58422vE.A02, 4162)) {
                boolean z2 = true;
                if (A002 == 0 || ((A002 == 1 || A002 == 2) && ((!(r11 instanceof C30331mH) || !((C30331mH) r11).A1z()) && !C624134x.A0g(r11)))) {
                    z = false;
                }
                int size = set.size();
                AnonymousClass367.A01(new AnonymousClass3AP(z), set);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("[LidGroup]IncorrectlyAddressedDeviceFilter/removeIncorrectlyAddressedDevices key: ");
                A0o.append(r9);
                A0o.append("; lidAddressingOnly: ");
                A0o.append(z);
                A0o.append("; lidDefaultType: ");
                A0o.append(A002);
                A0o.append("; hasMix: ");
                if (size == set.size()) {
                    z2 = false;
                }
                C18260x0.A1U(A0o, z2);
                if (size != set.size()) {
                    int size2 = set.size();
                    if (z) {
                        valueOf = Integer.valueOf(size2);
                        valueOf2 = Integer.valueOf(size - set.size());
                    } else {
                        valueOf = Integer.valueOf(size - size2);
                        valueOf2 = Integer.valueOf(set.size());
                    }
                    C55682qk r4 = r12.A00;
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append(valueOf.intValue());
                    A0o2.append(" lid participants & ");
                    A0o2.append(valueOf2.intValue());
                    r4.A0A("GroupLidInfra/outgoing_message", false, AnonymousClass000.A0X(" pn participants", A0o2));
                }
            }
        }
        if (r3 != null && !set.isEmpty()) {
            int size3 = set.size();
            if (C57372tX.A01(r3) || (r11 instanceof C30801n8)) {
                C73743g0.A0X(set, AnonymousClass453.A00);
            }
            StringBuilder A0o3 = AnonymousClass001.A0o();
            C624134x.A0T(r11, "[CoEx]HostedDevicesFilter/removeHostedDevices ; FMessage type: ", A0o3);
            A0o3.append("; multipleParticipantJid: ");
            A0o3.append(r3);
            A0o3.append("; removed hosted device count: ");
            C18260x0.A1F(A0o3, size3 - set.size());
        }
    }

    public C66483Lp(C116985rC r1, C55682qk r2, C56972sr r3, C64773Ex r4, C621133n r5, C56982ss r6, C56892sj r7, C55332qB r8, AnonymousClass318 r9, C54932pW r10, AnonymousClass27Z r11, AnonymousClass2LE r12) {
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r6;
        this.A09 = r10;
        this.A03 = r4;
        this.A04 = r5;
        this.A08 = r9;
        this.A0A = r11;
        this.A00 = r1;
        this.A07 = r8;
        this.A06 = r7;
        this.A0B = r12;
    }

    public static final List A00(Set set) {
        List A062 = AnonymousClass36G.A06(set);
        ArrayList A0s = AnonymousClass001.A0s();
        int size = A062.size() / 100;
        int size2 = A062.size() % 100;
        int i = 0;
        while (i < size) {
            int i2 = i * 100;
            i++;
            A0s.add(A062.subList(i2, i * 100));
        }
        if (size2 > 0) {
            A0s.add(A062.subList(AnonymousClass002.A04(A062, size2), A062.size()));
        }
        return A0s;
    }

    public final Set A01(C95814uZ r4) {
        Set A0C;
        HashSet A0K = AnonymousClass002.A0K();
        boolean z = r4 instanceof C27981fH;
        AnonymousClass318 r1 = this.A08;
        if (z) {
            A0C = r1.A0B();
        } else {
            A0C = r1.A0C();
        }
        A0K.addAll(A0C);
        if (!this.A02.A0a(r4)) {
            A0K.addAll(r1.A0D(AnonymousClass32Y.A04(r4)));
        }
        return A0K;
    }

    public final Set A02(C95814uZ r5, int i) {
        Set A012;
        HashSet A0K = AnonymousClass002.A0K();
        if (i == 58) {
            A012 = C56892sj.A01(this.A06, C57382tY.A00(r5)).A0G(this.A02, false);
        } else {
            if (i == 69) {
                if (r5 instanceof UserJid) {
                    A0K.add(DeviceJid.of(r5));
                    return A0K;
                }
            } else if (i == 77 && (r5 instanceof UserJid)) {
                A012 = A01(r5);
            }
            return A0K;
        }
        A0K.addAll(A012);
        return A0K;
    }

    public final Set A03(C95814uZ r6, C624134x r7) {
        Object obj;
        HashSet A0K = AnonymousClass002.A0K();
        if (r6 instanceof UserJid) {
            return A01(r6);
        }
        C56982ss r1 = this.A05;
        C64773Ex r0 = this.A03;
        C56892sj r2 = this.A06;
        if (C627636p.A0V(r0, r1, r2, r7)) {
            A0K = AnonymousClass002.A0K();
            C172878Nf it = C129526aS.copyOf(C56892sj.A01(r2, (C28011fL) r6).A08.values()).iterator();
            while (it.hasNext()) {
                A0K.addAll(C129526aS.copyOf((Collection) C18320x8.A0G(it).A04.keySet()));
            }
            Iterator it2 = A0K.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Jid A0S = AnonymousClass0x7.A0S(it2);
                if (!C627336j.A0L(A0S)) {
                    C55682qk r3 = this.A01;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Adding a non lid device ");
                    A0o.append(A0S);
                    r3.A0A("FanOutLidMessagingPnDevice", false, AnonymousClass000.A0X(" on lid messaging", A0o));
                    break;
                }
            }
            C56972sr r12 = this.A02;
            A0K.remove(C56972sr.A03(r12));
            obj = r12.A0G();
        } else {
            C172878Nf A012 = C620533h.A01(r2.A09, C57382tY.A00(r6));
            while (A012.hasNext()) {
                A0K.addAll(C129526aS.copyOf((Collection) C18320x8.A0G(A012).A04.keySet()));
            }
            Iterator it3 = A0K.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Jid A0S2 = AnonymousClass0x7.A0S(it3);
                if (C627336j.A0L(A0S2)) {
                    C55682qk r32 = this.A01;
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("Adding a lid device ");
                    A0o2.append(A0S2);
                    r32.A0A("FanOutMessagingLidDevice", false, AnonymousClass000.A0X(" on regular messaging", A0o2));
                    break;
                }
            }
            obj = C56972sr.A03(this.A02);
        }
        A0K.remove(obj);
        return A0K;
    }
}
