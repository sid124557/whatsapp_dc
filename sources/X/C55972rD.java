package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.InteractiveAnnotation;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2rD  reason: invalid class name and case insensitive filesystem */
public class C55972rD {
    public final C55682qk A00;
    public final C64393Dh A01;
    public final C69263Wi A02;
    public final C56972sr A03;
    public final C56352rq A04;
    public final C56492s4 A05;
    public final C56612sH A06;
    public final C54292oU A07;
    public final C57162tC A08;
    public final AnonymousClass319 A09;
    public final C49802h7 A0A;
    public final AnonymousClass1VX A0B;
    public final AnonymousClass2O8 A0C;
    public final C46992cX A0D;
    public final C55002pd A0E;
    public final C54672p6 A0F;
    public final AnonymousClass2WV A0G;
    public final AnonymousClass2H2 A0H;
    public final C60132y3 A0I;
    public final C55812qx A0J;
    public final C49592gm A0K;
    public final AnonymousClass5KI A0L;
    public final C622934l A0M;
    public final AnonymousClass2RO A0N;
    public final C60152y5 A0O;
    public final C29011i8 A0P;
    public final AnonymousClass4FS A0Q;
    public final AnonymousClass2JB A0R;
    public final C55142pr A0S;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r4 = r11.A0J;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3QO A02(X.AnonymousClass32J r12, boolean r13) {
        /*
            r11 = this;
            r10 = r12
            java.lang.String r1 = r12.A04
            r5 = 0
            if (r1 == 0) goto L_0x002c
            X.2qx r4 = r11.A0J
            r0 = 0
            X.5LM r3 = r4.A02(r1, r0)
            if (r3 == 0) goto L_0x002c
            X.2sH r2 = r11.A06
            X.4FS r5 = r11.A0Q
            X.33a r1 = new X.33a
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            X.1VX r7 = r11.A0B
            r0 = 4
            X.C162457s7.A0J(r7, r0)
            X.2UD r0 = r12.A01
            X.8rZ r6 = X.C620033c.A00(r0)
            X.3QO r5 = new X.3QO
            r8 = r3
            r9 = r1
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x002c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55972rD.A02(X.32J, boolean):X.3QO");
    }

    public AnonymousClass5LM A01(String str) {
        if (str == null) {
            return null;
        }
        C55812qx r3 = this.A0J;
        synchronized (r3) {
            C04840Qw r1 = r3.A00;
            if (r1.A04(C18260x0.A05(str, 1)) == null) {
                return null;
            }
            AnonymousClass5LM r0 = (AnonymousClass5LM) r1.A04(C18260x0.A05(str, 1));
            return r0;
        }
    }

    public AnonymousClass3QN A03(String str, byte b, int i, boolean z) {
        C55812qx r4 = this.A0J;
        AnonymousClass5LM A022 = r4.A02(str, 2);
        boolean z2 = z;
        if (A022 == null) {
            A022 = r4.A01(str, 2);
        } else if (z) {
            A022.A03++;
        }
        C619833a r1 = new C619833a(this.A06, A022, r4, this.A0Q, z2);
        r1.A08(b, i, false);
        return new AnonymousClass3QN(A022, r1);
    }

    public C30471mV A04(Uri uri, AnonymousClass33C r11, C108845de r12, C95814uZ r13, C624134x r14, String str, String str2, List list, List list2, byte b, int i, int i2, boolean z) {
        int A082;
        AnonymousClass2O8 r2 = this.A0C;
        byte b2 = b;
        C624134x A002 = r2.A00.A00(r2.A01.A04(r13, true), b2, this.A06.A0H());
        if (A002 instanceof C30471mV) {
            C30471mV r4 = (C30471mV) A002;
            r4.A01 = r11;
            r4.A02 = 0;
            r4.A1G(1);
            r4.A06 = null;
            r4.A00 = 0;
            r4.A09 = i;
            r2.A02.A00(r4, r14);
            if (str != null) {
                if (!(r4 instanceof AnonymousClass1nF)) {
                    r4.A02 = str.trim();
                    if (TextUtils.isEmpty(r4.A1w())) {
                        r4.A02 = null;
                    }
                } else {
                    AnonymousClass1nF r1 = (AnonymousClass1nF) r4;
                    r1.A23(str.trim());
                    if (TextUtils.isEmpty(r1.A01)) {
                        r1.A23((String) null);
                    }
                }
            }
            File file = r11.A0F;
            if (file == null) {
                C626936e.A06(uri);
                r4.A06 = uri.toString();
                r4.A00 = 0;
            } else {
                r4.A06 = file.getName();
                r4.A00 = r11.A0F.length();
            }
            if (b2 == 2 || b2 == 3 || b2 == 43 || b2 == 81 || b2 == 13 || b2 == 82) {
                long j = r11.A0D;
                if (j > 0 || r11.A0E > 0) {
                    A082 = (int) C18280x3.A08(r11.A0E, j);
                } else {
                    A082 = C107655bf.A0F(r11.A0F);
                }
                r4.A0B = A082;
            }
            r4.A1g(list);
            r11.A0A = r4.A00;
            r11.A0M = true;
            r4.A1a(str2);
            if (z) {
                r4.A1B(4);
            }
            List list3 = list2;
            if (list2 != null && !list3.isEmpty()) {
                r11.A0X = (InteractiveAnnotation[]) list3.toArray(new InteractiveAnnotation[0]);
            }
            int i3 = i2;
            if (i2 > 0) {
                r4.A1B(1);
                r4.A06 = i3;
            }
            if (r12 != null) {
                r4.A0O = r12;
                r4.A0E = r12.A00;
            }
            return r4;
        }
        throw AnonymousClass000.A0G("FMessageMediaFactory/newFMessageMedia/wrong message type; mediaWaType=", AnonymousClass001.A0o(), b2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        if (r1 == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean A05() {
        /*
            r3 = this;
            X.1VX r2 = r3.A0B
            r1 = 147(0x93, float:2.06E-43)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0019
            X.2pr r2 = r3.A0S
            monitor-enter(r2)
            boolean r1 = r2.A01     // Catch:{ all -> 0x0012 }
            goto L_0x0015
        L_0x0012:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0015:
            monitor-exit(r2)
            r0 = 1
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55972rD.A05():java.lang.Boolean");
    }

    public C55972rD(C55682qk r2, C64393Dh r3, C69263Wi r4, C56972sr r5, C56352rq r6, C56492s4 r7, C56612sH r8, C54292oU r9, C57162tC r10, AnonymousClass319 r11, C49802h7 r12, AnonymousClass1VX r13, AnonymousClass2O8 r14, C46992cX r15, C55002pd r16, C54672p6 r17, AnonymousClass2WV r18, AnonymousClass2H2 r19, C60132y3 r20, C55812qx r21, C49592gm r22, AnonymousClass5KI r23, C622934l r24, AnonymousClass2RO r25, C60152y5 r26, C29011i8 r27, AnonymousClass4FS r28, AnonymousClass2JB r29, C55142pr r30) {
        this.A07 = r9;
        this.A06 = r8;
        this.A0B = r13;
        this.A02 = r4;
        this.A00 = r2;
        this.A03 = r5;
        this.A0Q = r28;
        this.A01 = r3;
        this.A05 = r7;
        this.A0R = r29;
        this.A0S = r30;
        this.A0P = r27;
        this.A0G = r18;
        this.A0I = r20;
        this.A0M = r24;
        this.A0J = r21;
        this.A09 = r11;
        this.A0N = r25;
        this.A0A = r12;
        this.A0K = r22;
        this.A0C = r14;
        this.A0H = r19;
        this.A0F = r17;
        this.A0D = r15;
        this.A0E = r16;
        this.A0O = r26;
        this.A0L = r23;
        this.A04 = r6;
        this.A08 = r10;
    }

    public AnonymousClass30M A00(Uri uri, AnonymousClass33C r19, C108845de r20, C624134x r21, String str, List list, List list2, List list3, byte b, int i, int i2, boolean z) {
        String str2;
        ArrayList A0s = AnonymousClass001.A0s();
        if (list.size() > 1) {
            str2 = AnonymousClass35J.A02(this.A03, this.A06);
        } else {
            str2 = null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri2 = uri;
            A0s.add(A04(uri2, r19.A02(), r20, C18300x5.A0P(it), r21, str, str2, list2, list3, b, i, i2, z));
        }
        return new AnonymousClass30M(A0s);
    }
}
