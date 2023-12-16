package X;

import android.os.Message;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jobqueue.job.SendReadReceiptJob;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.33Y  reason: invalid class name */
public class AnonymousClass33Y {
    public final C116985rC A00;
    public final C55682qk A01;
    public final C49712gy A02;
    public final C52852m9 A03;
    public final C56562sC A04;
    public final C47402dC A05;
    public final AnonymousClass1VX A06;
    public final AnonymousClass31C A07;
    public final C55882r4 A08;
    public final C55892r5 A09;
    public final AnonymousClass4FS A0A;

    public static Message A00(C55682qk r7, AnonymousClass1VX r8, C624134x r9) {
        AnonymousClass36N.A0A(r7, r8, "message", "receipt", r9.A1O, true);
        return C18290x4.A0J(9, r9);
    }

    public static final AnonymousClass39T A01(C624134x r5, String str, String str2) {
        AnonymousClass2z0 r4 = r5.A1J;
        Pair A052 = C626635z.A05(r5.A1R, r4.A00, r5.A0n());
        C50412i8 r2 = new C50412i8();
        r2.A05 = "message";
        r2.A07 = r4.A01;
        r2.A00 = r5.A1O;
        r2.A02 = (Jid) A052.first;
        r2.A01 = (Jid) A052.second;
        r2.A08 = str;
        AnonymousClass0x7.A1A(r2, str2);
        return r2.A01();
    }

    public final void A03(Message message, long j) {
        this.A09.A04(j);
        AnonymousClass31C r2 = this.A07;
        C162457s7.A0J(message, 0);
        r2.A0A(message, (String) null, false);
    }

    public void A04(C624134x r7) {
        StringBuilder A0e;
        boolean z;
        if (r7.A1I == 31) {
            A06(r7, (String) null);
            return;
        }
        if (!(r7.A0n() instanceof C135216kJ) && !r7.A1E) {
            AnonymousClass2z0 r3 = r7.A1J;
            C95814uZ r2 = r3.A00;
            if (!(r2 instanceof C95804uY) && r7.A0D != 6) {
                if (C57322tS.A00(r7)) {
                    A0e = C18280x3.A0e();
                    A0e.append("/acknowledgeMessageIfNeeded ignoring bot response key=");
                    A0e.append(r3);
                    C18280x3.A14(A0e);
                }
                if (r7.A0D == 13) {
                    C55882r4 r5 = this.A08;
                    if (r5.A01(r2) && r7.A0K >= 1415214000000L && !C627636p.A0l(r7) && !r7.A1W) {
                        if (r7.A1Y) {
                            if (!r5.A05(r7)) {
                                A03(A00(this.A01, this.A06, r7), r7.A1O);
                                z = true;
                            } else {
                                z = false;
                            }
                            r7.A1Y = false;
                            if (z) {
                                A0D(r7, true);
                                return;
                            }
                        }
                        if (A0C(r7)) {
                            return;
                        }
                    }
                }
                A03(A00(this.A01, this.A06, r7), r7.A1O);
                return;
            }
        }
        A0e = C18280x3.A0e();
        C624134x.A0S(r7, "/acknowledgeMessageIfNeeded ignoring key=", A0e);
        C624134x.A0O(r7, " status=", A0e);
        C18280x3.A14(A0e);
    }

    public final void A05(C624134x r3) {
        if (!(r3 instanceof C30331mH) && !AnonymousClass2z0.A0C(r3)) {
            r3.A1G(16);
            C70113Zy.A01(this.A0A, this, r3, 8);
        }
    }

    public void A06(C624134x r13, String str) {
        Message A022;
        if (r13.A0D == 6) {
            StringBuilder A0e = C18280x3.A0e();
            A0e.append("/acknowledgeMessageSilent ignoring type=");
            A0e.append(str);
            C18260x0.A0o(C624134x.A08(r13, " key=", A0e), A0e);
            return;
        }
        AnonymousClass39T A012 = A01(r13, str, (String) null);
        AnonymousClass1VX r10 = this.A06;
        boolean A0Y = r10.A0Y(C58422vE.A02, 3280);
        long j = r13.A1O;
        if (A0Y) {
            A022 = AnonymousClass36N.A02(this.A01, r10, A012);
        } else {
            C55682qk r9 = this.A01;
            AnonymousClass2z0 r0 = r13.A1J;
            C95814uZ A013 = AnonymousClass2z0.A01(r0);
            C95814uZ A0n = r13.A0n();
            String str2 = r0.A01;
            long j2 = r13.A1O;
            C95814uZ r6 = A0n;
            if (!(A0n instanceof AnonymousClass1fS)) {
                r6 = A013;
                A013 = A0n;
            }
            C50412i8 r3 = new C50412i8();
            r3.A05 = "message";
            r3.A07 = str2;
            r3.A00 = j2;
            r3.A02 = r6;
            r3.A01 = A013;
            r3.A08 = str;
            AnonymousClass0x7.A1A(r3, (String) null);
            A022 = AnonymousClass36N.A02(r9, r10, r3.A01());
        }
        A03(A022, j);
    }

    public void A09(AnonymousClass4FY r10, String str, String str2) {
        Message A022;
        if (str != null) {
            long B9D = r10.B9D();
            AnonymousClass39T BDD = r10.BDD(str2);
            AnonymousClass1VX r8 = this.A06;
            if (r8.A0Y(C58422vE.A02, 3280)) {
                A022 = AnonymousClass36N.A02(this.A01, r8, BDD);
            } else {
                C55682qk r7 = this.A01;
                C95814uZ BC1 = r10.BC1();
                C95814uZ BAZ = r10.BAZ();
                String id = r10.getId();
                C95814uZ r4 = BAZ;
                if (!(BAZ instanceof AnonymousClass1fS)) {
                    r4 = BC1;
                    BC1 = BAZ;
                }
                C50412i8 r3 = new C50412i8();
                r3.A05 = "message";
                r3.A07 = id;
                r3.A00 = B9D;
                r3.A02 = r4;
                r3.A01 = BC1;
                r3.A08 = str;
                AnonymousClass0x7.A1A(r3, str2);
                A022 = AnonymousClass36N.A02(r7, r8, r3.A01());
            }
            A03(A022, B9D);
        }
    }

    public void A0A(Collection collection) {
        long max;
        SendReadReceiptJob sendReadReceiptJob;
        Collection collection2 = collection;
        A0B(A02(collection2));
        HashMap A0t = AnonymousClass001.A0t();
        HashMap A0t2 = AnonymousClass001.A0t();
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            C624134x A0T = C18300x5.A0T(it);
            if (this.A08.A05(A0T)) {
                if (A0T.A0D == 17) {
                    A05(A0T);
                } else {
                    if (C57322tS.A00(A0T) && A0T.A0D != 16) {
                        C116985rC r1 = this.A00;
                        if (r1.A07()) {
                            r1.A04();
                            if (C624134x.A0b(A0T)) {
                                AnonymousClass2z0 r8 = A0T.A1J;
                                C95814uZ r13 = r8.A00;
                                boolean A0K = C627336j.A0K(r13);
                                C49712gy r2 = this.A02;
                                if (A0K) {
                                    sendReadReceiptJob = new SendReadReceiptJob(r13, A0T.A0n(), (C95814uZ) null, (DeviceJid) null, new String[]{r8.A01}, A0T.A0K, A0T.A1O, true);
                                } else {
                                    sendReadReceiptJob = new SendReadReceiptJob(A0T.A0n(), (C95814uZ) null, r13, (DeviceJid) null, new String[]{r8.A01}, A0T.A0K, A0T.A1O, true);
                                }
                                r2.A02(sendReadReceiptJob);
                            }
                        }
                        A05(A0T);
                    }
                    C95814uZ r10 = A0T.A1J.A00;
                    if (r10 instanceof C135166kE) {
                        C95814uZ A0n = A0T.A0n();
                        if (A0n instanceof PhoneUserJid) {
                            Number A0p = AnonymousClass0x9.A0p(A0n, A0t2);
                            if (A0p == null) {
                                max = A0T.A1M;
                            } else {
                                max = Math.max(A0p.longValue(), A0T.A1M);
                            }
                            AnonymousClass0x2.A1J(A0n, A0t2, max);
                        }
                    } else {
                        C624134x r9 = (C624134x) A0t.get(r10);
                        if (r9 != null && r9.A1M > A0T.A1M) {
                            A0T = r9;
                        }
                        A0t.put(r10, A0T);
                    }
                }
            }
        }
        this.A03.A01(new C70353aM(this, A0t, A0t2, 10), 43);
    }

    public void A0B(HashMap hashMap) {
        Iterator A0u = AnonymousClass001.A0u(hashMap);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            int size = ((AbstractCollection) A0w.getValue()).size();
            int i = 0;
            while (i < size) {
                int min = Math.min(i + 256, size);
                this.A02.A02(new SendReadReceiptJob(((C60062xw) A0w.getKey()).A00, ((C60062xw) A0w.getKey()).A01, (C95814uZ) null, (DeviceJid) null, (String[]) ((AbstractList) A0w.getValue()).subList(i, min).toArray(new String[0]), -1, 0, ((C60062xw) A0w.getKey()).A02));
                i = min;
            }
        }
    }

    public boolean A0C(C624134x r6) {
        AnonymousClass1VX r4 = this.A06;
        C58422vE r3 = C58422vE.A02;
        if (r4.A0Y(r3, 5139) || (r6.A0p != null && r4.A0Y(r3, 4702))) {
            return A0D(r6, false);
        }
        A0D(r6, true);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (X.C57322tS.A00(r0) != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        if ((r7 instanceof X.C135216kJ) != false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0D(X.C624134x r26, boolean r27) {
        /*
            r25 = this;
            r0 = r26
            int r2 = r0.A0D
            r1 = 16
            if (r2 == r1) goto L_0x0028
            r1 = 6
            if (r2 == r1) goto L_0x0028
            boolean r1 = X.C627636p.A0l(r0)
            if (r1 != 0) goto L_0x0028
            byte r2 = r0.A1I
            r1 = 19
            if (r2 == r1) goto L_0x0028
            r1 = 21
            if (r2 == r1) goto L_0x0028
            boolean r1 = X.C626635z.A09(r0)
            if (r1 != 0) goto L_0x0028
            boolean r1 = X.C57322tS.A00(r0)
            r3 = 1
            if (r1 == 0) goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            r2 = 0
            r1 = r25
            if (r3 == 0) goto L_0x005c
            X.4uZ r7 = r0.A0n()
            boolean r3 = r0 instanceof X.C30331mH
            r5 = 1
            if (r3 != 0) goto L_0x003c
            boolean r3 = r7 instanceof X.C135216kJ
            r15 = 0
            if (r3 == 0) goto L_0x003d
        L_0x003c:
            r15 = 1
        L_0x003d:
            if (r27 == 0) goto L_0x0074
            X.2gy r3 = r1.A02
            X.2z0 r4 = r0.A1J
            X.4uZ r6 = X.AnonymousClass2z0.A01(r4)
            com.whatsapp.jid.DeviceJid r9 = r0.A1R
            java.lang.String[] r10 = new java.lang.String[r5]
            java.lang.String r4 = r4.A01
            r10[r2] = r4
            long r11 = r0.A0K
            long r13 = r0.A1O
            r8 = 0
            com.whatsapp.jobqueue.job.SendReadReceiptJob r5 = new com.whatsapp.jobqueue.job.SendReadReceiptJob
            r5.<init>(r6, r7, r8, r9, r10, r11, r13, r15)
            r3.A02(r5)
        L_0x005c:
            boolean r3 = X.AnonymousClass2z0.A0B(r0)
            if (r3 != 0) goto L_0x0073
            X.2r4 r3 = r1.A08
            boolean r3 = r3.A05(r0)
            if (r3 == 0) goto L_0x0073
            int r4 = r0.A0D
            r3 = 17
            if (r4 != r3) goto L_0x00db
            r1.A05(r0)
        L_0x0073:
            return r2
        L_0x0074:
            X.2r4 r9 = r1.A08
            X.2z0 r7 = r0.A1J
            X.4uZ r17 = X.AnonymousClass2z0.A01(r7)
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r10 = r7.A01
            r6[r2] = r10
            long r3 = r0.A0K
            java.lang.Throwable r18 = new java.lang.Throwable
            r18.<init>()
            r16 = r9
            r19 = r6
            r20 = r3
            r22 = r15
            boolean r3 = r16.A04(r17, r18, r19, r20, r22)
            if (r3 == 0) goto L_0x00d1
            X.C626936e.A06(r17)
            X.4uZ r18 = r0.A0n()
            com.whatsapp.jid.DeviceJid r8 = r0.A1R
            r6 = 0
            java.lang.String[] r7 = new java.lang.String[r5]
            r7[r2] = r10
            long r3 = r0.A1O
            r19 = r8
            r20 = r6
            r21 = r7
            r22 = r3
            r24 = r15
            X.2T1 r7 = r16.A00(r17, r18, r19, r20, r21, r22, r24)
            long r3 = r0.A1O
            X.1VX r9 = r1.A06
            X.2qk r8 = r1.A01
            long r12 = r7.A00
            java.lang.String r10 = "message"
            java.lang.String r11 = "read-receipt"
            r14 = r5
            X.AnonymousClass36N.A0A(r8, r9, r10, r11, r12, r14)
            r5 = 419(0x1a3, float:5.87E-43)
            android.os.Message r2 = android.os.Message.obtain(r6, r2, r5, r2, r7)
            r1.A03(r2, r3)
            r2 = 1
            goto L_0x005c
        L_0x00d1:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "ReadReceipts/sendReadReceipt not sending read-receipt for "
            X.C18260x0.A1P(r4, r3, r7)
            goto L_0x005c
        L_0x00db:
            X.2m9 r5 = r1.A03
            r4 = 9
            X.3Zy r3 = new X.3Zy
            r3.<init>(r1, r4, r0)
            r0 = 43
            r5.A01(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass33Y.A0D(X.34x, boolean):boolean");
    }

    public AnonymousClass33Y(C116985rC r1, C55682qk r2, C49712gy r3, C52852m9 r4, C56562sC r5, C47402dC r6, AnonymousClass1VX r7, AnonymousClass31C r8, C55882r4 r9, C55892r5 r10, AnonymousClass4FS r11) {
        this.A06 = r7;
        this.A01 = r2;
        this.A0A = r11;
        this.A02 = r3;
        this.A07 = r8;
        this.A04 = r5;
        this.A08 = r9;
        this.A03 = r4;
        this.A09 = r10;
        this.A00 = r1;
        this.A05 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007f, code lost:
        if ((r3 instanceof X.C95804uY) != false) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap A02(java.util.Collection r9) {
        /*
            r8 = this;
            java.util.HashMap r5 = X.AnonymousClass001.A0t()
            java.util.Iterator r7 = r9.iterator()
        L_0x0008:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x009d
            X.34x r6 = X.C18300x5.A0T(r7)
            int r1 = r6.A0D
            r0 = 16
            if (r1 != r0) goto L_0x0025
            java.lang.StringBuilder r1 = X.C18280x3.A0e()
            java.lang.String r0 = "/generateReceiptGroups skipping read receipt since its already sent; message.key="
        L_0x001e:
            X.C624134x.A0S(r6, r0, r1)
        L_0x0021:
            X.C18280x3.A14(r1)
            goto L_0x0008
        L_0x0025:
            byte r1 = r6.A1I
            r0 = 11
            if (r1 != r0) goto L_0x0032
            java.lang.StringBuilder r1 = X.C18280x3.A0e()
            java.lang.String r0 = "/generateReceiptGroups skipping read receipt due to decryption failure; message.key="
            goto L_0x001e
        L_0x0032:
            r0 = 31
            if (r1 != r0) goto L_0x003d
            java.lang.StringBuilder r1 = X.C18280x3.A0e()
            java.lang.String r0 = "/generateReceiptGroups skipping read receipt due to multi device placeholder; message.key="
            goto L_0x001e
        L_0x003d:
            boolean r0 = X.C627636p.A0l(r6)
            if (r0 == 0) goto L_0x004d
            java.lang.StringBuilder r1 = X.C18280x3.A0e()
            java.lang.String r0 = "/generateReceiptGroups skip read receipt for revoked message"
        L_0x0049:
            r1.append(r0)
            goto L_0x0021
        L_0x004d:
            boolean r0 = X.C57322tS.A00(r6)
            if (r0 == 0) goto L_0x005a
            java.lang.StringBuilder r1 = X.C18280x3.A0e()
            java.lang.String r0 = "/generateReceiptGroups skip read receipt for bot message"
            goto L_0x0049
        L_0x005a:
            r0 = 19
            if (r1 != r0) goto L_0x0065
            java.lang.StringBuilder r1 = X.C18280x3.A0e()
            java.lang.String r0 = "/generateReceiptGroups skip read receipt for hsm rejection message. key="
            goto L_0x001e
        L_0x0065:
            r0 = 21
            if (r1 != r0) goto L_0x0070
            java.lang.StringBuilder r1 = X.C18280x3.A0e()
            java.lang.String r0 = "/generateReceiptGroups skip sending read receipt for request declined message."
            goto L_0x0049
        L_0x0070:
            X.2z0 r4 = r6.A1J
            X.4uZ r3 = r4.A00
            X.4uZ r2 = r6.A0n()
            boolean r0 = r6 instanceof X.C30331mH
            if (r0 != 0) goto L_0x0081
            boolean r0 = r3 instanceof X.C95804uY
            r1 = 0
            if (r0 == 0) goto L_0x0082
        L_0x0081:
            r1 = 1
        L_0x0082:
            X.2xw r0 = new X.2xw
            r0.<init>(r3, r2, r1)
            java.lang.Object r1 = r5.get(r0)
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            if (r1 != 0) goto L_0x0096
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            r5.put(r0, r1)
        L_0x0096:
            java.lang.String r0 = r4.A01
            r1.add(r0)
            goto L_0x0008
        L_0x009d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass33Y.A02(java.util.Collection):java.util.HashMap");
    }

    public void A07(AnonymousClass4FY r7) {
        long j;
        Message A002;
        if (r7.BIs()) {
            StringBuilder A0e = C18280x3.A0e();
            A0e.append("/acknowledgeMessageIfNeeded ignoring because retry key=");
            C18260x0.A0o(r7.B9a(), A0e);
            return;
        }
        if (r7 instanceof AnonymousClass3SS) {
            j = r7.B9D();
            A002 = C18290x4.A0J(362, r7);
        } else {
            AnonymousClass3ST r72 = (AnonymousClass3ST) r7;
            C624134x r0 = r72.A0P;
            if (r0 == null) {
                j = r72.A07;
                A002 = A00(this.A01, this.A06, r72.A01(new AnonymousClass4K1(0)));
            } else {
                A04(r0);
                return;
            }
        }
        A03(A002, j);
    }

    public void A08(AnonymousClass4FY r6, int i) {
        AnonymousClass39T BDD = r6.BDD(String.valueOf(i));
        A03(AnonymousClass36N.A02(this.A01, this.A06, BDD), r6.B9D());
    }
}
