package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.35N  reason: invalid class name */
public class AnonymousClass35N {
    public final long A00;
    public final long A01;
    public final Set A02;
    public final Set A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass35N r7 = (AnonymousClass35N) obj;
            if (this.A00 != r7.A00 || this.A01 != r7.A01 || !this.A02.equals(r7.A02) || !this.A03.equals(r7.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        C18280x3.A1S(objArr, this.A00);
        AnonymousClass001.A1Q(objArr, this.A01);
        objArr[2] = this.A02;
        return C18310x6.A08(this.A03, objArr, 3);
    }

    public static AnonymousClass35N A01(AnonymousClass35N r10, AnonymousClass35N r11) {
        long max = Math.max(r10.A00, r11.A00);
        long max2 = Math.max(r10.A01, r11.A01);
        HashSet A15 = AnonymousClass0x9.A15(r10.A02);
        A15.addAll(r11.A02);
        Iterator it = A15.iterator();
        while (it.hasNext()) {
            if (((C54782pH) it.next()).A00 < max) {
                it.remove();
            }
        }
        if (A15.size() > 1000) {
            ArrayList A0J = AnonymousClass002.A0J(A15);
            AnonymousClass4IU.A00(A0J, 14);
            List subList = A0J.subList(0, 1000);
            A15 = AnonymousClass0x9.A15(subList);
            max = ((C54782pH) C18300x5.A0c(subList)).A00;
        }
        HashSet A152 = AnonymousClass0x9.A15(r10.A03);
        A152.addAll(r11.A03);
        if (max2 <= max) {
            max2 = 0;
        }
        return new AnonymousClass35N(A15, A152, max, max2);
    }

    public static AnonymousClass35N A02(AnonymousClass1CO r17, boolean z) {
        if (z) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            AnonymousClass1CO r3 = r17;
            long millis = timeUnit.toMillis(r3.lastMessageTimestamp_);
            long millis2 = timeUnit.toMillis(r3.lastSystemMessageTimestamp_);
            int i = r3.bitField0_;
            if ((i & 1) == 0 || (i & 2) == 0 || millis2 > millis) {
                C188248ya<C21301Bh> r0 = r3.messages_;
                HashSet A0K = AnonymousClass002.A0K();
                HashSet A0K2 = AnonymousClass002.A0K();
                for (C21301Bh r1 : r0) {
                    if ((r1.bitField0_ & 1) != 0) {
                        AnonymousClass1ET r02 = r1.key_;
                        AnonymousClass1ET r32 = r02;
                        if (r02 == null) {
                            r02 = AnonymousClass1ET.DEFAULT_INSTANCE;
                        }
                        if ((r02.bitField0_ & 2) != 0) {
                            AnonymousClass1ET r03 = r32;
                            if (r32 == null) {
                                r03 = AnonymousClass1ET.DEFAULT_INSTANCE;
                            }
                            if ((r03.bitField0_ & 4) != 0) {
                                AnonymousClass1ET r04 = r32;
                                if (r32 == null) {
                                    r04 = AnonymousClass1ET.DEFAULT_INSTANCE;
                                }
                                if ((r04.bitField0_ & 1) != 0) {
                                    if (r32 == null) {
                                        r32 = AnonymousClass1ET.DEFAULT_INSTANCE;
                                    }
                                    C95814uZ A0S = C18310x6.A0S(r32.remoteJid_);
                                    if (A0S != null) {
                                        UserJid A08 = AnonymousClass32Y.A08(r32.participant_);
                                        boolean z2 = r32.fromMe_;
                                        if (!C627336j.A0K(A0S) || z2 || A08 != null) {
                                            C54782pH r6 = new C54782pH(A0S, A08, r32.id_, TimeUnit.SECONDS.toMillis(r1.timestamp_), z2);
                                            if (r6.A00 == 0) {
                                                A0K2.add(r6);
                                            } else {
                                                A0K.add(r6);
                                            }
                                        } else {
                                            throw new C377523w(11);
                                        }
                                    } else {
                                        throw new C377523w(10);
                                    }
                                } else {
                                    throw new C377523w(7);
                                }
                            } else {
                                throw new C377523w(9);
                            }
                        } else {
                            throw new C377523w(8);
                        }
                    } else {
                        throw new C377523w(6);
                    }
                }
                if (A0K.size() <= 1000) {
                    return new AnonymousClass35N(A0K, A0K2, millis, millis2);
                }
                throw new C377523w(5);
            }
            throw new C377523w(2);
        }
        throw new C377523w(1);
    }

    public static boolean A03(AnonymousClass35N r8, AnonymousClass35N r9) {
        for (Object next : r9.A03) {
            if (!r8.A02.contains(next) && !r8.A03.contains(next)) {
                return false;
            }
        }
        for (C54782pH r5 : r9.A02) {
            if (r5.A00 > r8.A00 && !r8.A02.contains(r5) && !r8.A03.contains(r5)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass1CO A04() {
        C207819h r2 = (C207819h) AnonymousClass1CO.DEFAULT_INSTANCE.A0G();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(this.A00);
        long seconds2 = timeUnit.toSeconds(this.A01);
        if (seconds > 0) {
            AnonymousClass1CO r1 = (AnonymousClass1CO) C18320x8.A0C(r2);
            r1.bitField0_ |= 1;
            r1.lastMessageTimestamp_ = seconds;
        }
        if (seconds2 > 0) {
            AnonymousClass1CO r12 = (AnonymousClass1CO) C18320x8.A0C(r2);
            r12.bitField0_ |= 2;
            r12.lastSystemMessageTimestamp_ = seconds2;
        }
        for (C54782pH A002 : this.A02) {
            r2.A09(A002.A00());
        }
        for (C54782pH A003 : this.A03) {
            r2.A09(A003.A00());
        }
        return (AnonymousClass1CO) r2.A06();
    }

    public AnonymousClass35N(Set set, Set set2, long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = set;
        this.A03 = set2;
    }

    public static int A00(AnonymousClass35N r1, AnonymousClass35N r2) {
        boolean A032 = A03(r1, r2);
        boolean A033 = A03(r2, r1);
        if (A032) {
            return C18310x6.A02(A033 ? 1 : 0);
        }
        if (A033) {
            return 1;
        }
        return 3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SyncdMessageRange{lastMessageTimestamp=");
        A0o.append(this.A00);
        A0o.append(", lastSystemMessageTimestamp=");
        A0o.append(this.A01);
        A0o.append(", messages=");
        A0o.append(this.A02);
        A0o.append(", messagesWithoutTimestamp=");
        return AnonymousClass000.A0Q(this.A03, A0o);
    }
}
