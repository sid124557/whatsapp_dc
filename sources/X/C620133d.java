package X;

import android.os.ConditionVariable;
import android.os.Handler;
import com.whatsapp.jid.UserJid;
import com.whatsapp.media.download.ExpressPathGarbageCollectWorker;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.33d  reason: invalid class name and case insensitive filesystem */
public class C620133d {
    public static final AnonymousClass5ZC A0q = AnonymousClass0x9.A0T(1, 60, 200);
    public long A00;
    public final ConditionVariable A01 = new ConditionVariable(true);
    public final Handler A02 = AnonymousClass000.A0A();
    public final C55682qk A03;
    public final AnonymousClass2VS A04;
    public final C64393Dh A05;
    public final C69263Wi A06;
    public final C56972sr A07;
    public final AnonymousClass36E A08;
    public final C56352rq A09;
    public final C49712gy A0A;
    public final AnonymousClass3XB A0B = AnonymousClass3XB.A00();
    public final C56612sH A0C;
    public final C54292oU A0D;
    public final C56982ss A0E;
    public final C66543Lv A0F;
    public final C56892sj A0G;
    public final C29431io A0H;
    public final AnonymousClass300 A0I;
    public final AnonymousClass36Y A0J;
    public final AnonymousClass1VX A0K;
    public final C66843Mz A0L;
    public final C45982at A0M;
    public final C60132y3 A0N;
    public final C55572qZ A0O;
    public final C48132eP A0P;
    public final C73373fO A0Q = new C73373fO(this);
    public final C28181fp A0R;
    public final C28191fq A0S;
    public final C52532ld A0T;
    public final AnonymousClass33S A0U;
    public final AnonymousClass5UP A0V;
    public final C60152y5 A0W;
    public final C50222hp A0X;
    public final C45042Yl A0Y;
    public final C29011i8 A0Z;
    public final C54622p1 A0a;
    public final AnonymousClass1R1 A0b;
    public final C55732qp A0c;
    public final WebpUtils A0d;
    public final C55832qz A0e;
    public final C617832f A0f;
    public final C33141sV A0g;
    public final AnonymousClass4FS A0h;
    public final C72163dH A0i;
    public final C34171uL A0j;
    public final HashMap A0k = AnonymousClass001.A0t();
    public final HashMap A0l = AnonymousClass001.A0t();
    public final HashMap A0m = AnonymousClass001.A0t();
    public final Set A0n = AnonymousClass002.A0K();
    public final Executor A0o;
    public final Executor A0p;

    public void A06(AnonymousClass4EV r9, C30471mV r10, int i) {
        AnonymousClass4EV r5 = r9;
        C30471mV r4 = r10;
        int i2 = i;
        if (this.A0K.A0Y(C58422vE.A02, 5858)) {
            C71433c6 r2 = new C71433c6(this, r4, r5, i2, 25);
            C72163dH r0 = this.A0i;
            if (r0 != null) {
                r0.execute(r2);
            } else {
                this.A0h.BkM(r2);
            }
        } else {
            A07(r9, r10, i);
        }
    }

    public final void A09(C56902sk r7, C47662dc r8, C30471mV r9, boolean z) {
        Boolean bool;
        boolean z2;
        String str;
        byte[] bArr;
        Integer num;
        Integer num2;
        Long l;
        String str2;
        Integer num3;
        Integer num4;
        Integer num5;
        Long l2;
        Long l3;
        Integer num6;
        Integer num7;
        Integer num8;
        String str3;
        Long l4;
        Integer num9;
        Integer num10;
        byte[] bArr2;
        String str4;
        Boolean bool2;
        synchronized (r9) {
            AnonymousClass33C A002 = C30471mV.A00(r9);
            C625435m A012 = r7.A01();
            C626936e.A06(A012);
            A002.A0c = false;
            A002.A0b = false;
            A002.A0a = false;
            A002.A0Z = false;
            A002.A0Y = z;
            synchronized (r7) {
                bool = r7.A04;
            }
            if (bool != null) {
                synchronized (r7) {
                    bool2 = r7.A04;
                }
                A002.A0M = bool2.booleanValue();
            }
            if (r7.A04() != null) {
                A002.A0R = r7.A04().booleanValue();
            }
            synchronized (r7) {
                z2 = r7.A0J;
            }
            if (z2) {
                if (r9.A1v() != null) {
                    r9.A1v().A01();
                }
                A002.A0L = null;
                A002.A0K = null;
            }
            A002.A07 = r7.A00();
            synchronized (r7) {
                str = r7.A0F;
            }
            if (str != null) {
                synchronized (r7) {
                    str4 = r7.A0F;
                }
                A002.A0I = str4;
            }
            synchronized (r7) {
                bArr = r7.A0K;
            }
            if (bArr != null) {
                AnonymousClass1nE r5 = (AnonymousClass1nE) r9;
                C55732qp r4 = this.A0c;
                synchronized (r7) {
                    bArr2 = r7.A0K;
                }
                r5.A04 = r4.A03(r9.A05, bArr2);
            }
            synchronized (r7) {
                num = r7.A09;
            }
            if (num != null) {
                synchronized (r7) {
                    num10 = r7.A09;
                }
                A002.A02 = num10.intValue();
            }
            synchronized (r7) {
                num2 = r7.A0A;
            }
            if (num2 != null) {
                synchronized (r7) {
                    num9 = r7.A0A;
                }
                A002.A03 = num9.intValue();
            }
            synchronized (r7) {
                l = r7.A0D;
            }
            if (l != null) {
                synchronized (r7) {
                    l4 = r7.A0D;
                }
                A002.A09 = l4.longValue();
            }
            synchronized (r7) {
                str2 = r7.A0G;
            }
            if (str2 != null) {
                synchronized (r7) {
                    str3 = r7.A0G;
                }
                A002.A0G = str3;
            }
            synchronized (r7) {
                num3 = r7.A07;
            }
            if (num3 != null) {
                synchronized (r7) {
                    num8 = r7.A07;
                }
                A002.A01 = num8.intValue();
            }
            if (!z || AnonymousClass000.A1T(A012.A01)) {
                synchronized (r7) {
                    num4 = r7.A0C;
                }
                if (num4 != null) {
                    synchronized (r7) {
                        num7 = r7.A0C;
                    }
                    A002.A08 = num7.intValue();
                }
                synchronized (r7) {
                    num5 = r7.A0B;
                }
                if (num5 != null) {
                    synchronized (r7) {
                        num6 = r7.A0B;
                    }
                    A002.A06 = num6.intValue();
                }
                synchronized (r7) {
                    l2 = r7.A0E;
                }
                if (l2 != null) {
                    synchronized (r7) {
                        l3 = r7.A0E;
                    }
                    A002.A0A = l3.longValue();
                }
                if (!(r9.A0y() == null || r7.A0H() == null)) {
                    r9.A0y().A03(r7.A0H());
                }
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            C47662dc.A00(r8, "MediaDownloadManager/applyDownloadDataInMainThread/mediaHash=", A0o2);
            A0o2.append("transferred=");
            A0o2.append(A002.A0R);
            A0o2.append(",transferring=");
            A0o2.append(A002.A0c);
            A0o2.append(",prefetching=");
            A0o2.append(A002.A0a);
            A0o2.append(",autodownloadRetryEnabled=");
            A0o2.append(A002.A0M);
            A0o2.append(",streamViewable=");
            A0o2.append(A002.A0b);
            A0o2.append(",fileReadError=");
            A0o2.append(A002.A0Z);
            A0o2.append(",dedupeDownload=");
            A0o2.append(A002.A0Y);
            A0o2.append(",suspiciousContent=");
            C18260x0.A1F(A0o2, A002.A07);
        }
    }

    public void A0B(C30471mV r2) {
        A0E(r2, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0F(X.AnonymousClass4EV r10, X.AnonymousClass4D9 r11, X.C47662dc r12, X.C30471mV r13, java.lang.String r14, boolean r15) {
        /*
            r9 = this;
            r5 = r9
            java.util.HashMap r2 = r9.A0l
            monitor-enter(r2)
            java.lang.Object r0 = r2.get(r14)     // Catch:{ all -> 0x0049 }
            X.4D9 r0 = (X.AnonymousClass4D9) r0     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0023
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "MediaDownloadManager/addAndDedupeDownload/No existing regular MMS download in progress, creating new download instance for mediaHash="
            X.C18260x0.A0s(r0, r14, r1)     // Catch:{ all -> 0x0049 }
            r2.put(r14, r11)     // Catch:{ all -> 0x0049 }
            X.3QI r0 = new X.3QI     // Catch:{ all -> 0x0049 }
            r0.<init>(r9, r14)     // Catch:{ all -> 0x0049 }
            r11.AwR(r0)     // Catch:{ all -> 0x0049 }
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            r0 = 0
            return r0
        L_0x0023:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "MediaDownloadManager/addAndDedupeDownload/MMS download already in progress (according to current downloads) mediaHash="
            X.C18260x0.A0s(r0, r14, r1)     // Catch:{ all -> 0x0049 }
            r7 = r13
            if (r13 == 0) goto L_0x0046
            r6 = r12
            if (r12 == 0) goto L_0x0046
            X.1I7 r0 = r9.A03(r13)     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0046
            X.3X4 r3 = new X.3X4     // Catch:{ all -> 0x0049 }
            r4 = r10
            r8 = r15
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0049 }
            java.util.concurrent.Executor r1 = r9.A0p     // Catch:{ all -> 0x0049 }
            X.3XB r0 = r0.A0G     // Catch:{ all -> 0x0049 }
            r0.A04(r3, r1)     // Catch:{ all -> 0x0049 }
        L_0x0046:
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            r0 = 1
            return r0
        L_0x0049:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C620133d.A0F(X.4EV, X.4D9, X.2dc, X.1mV, java.lang.String, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x026b, code lost:
        if (r2.A0y().A05() == false) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02f3, code lost:
        if (X.AnonymousClass36V.A06(r2) == false) goto L_0x02f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a7, code lost:
        if (r1.A02(r5) == false) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e3, code lost:
        if (r12.contains("static.whatsapp.net/downloadable?category=PSA") == false) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01f7, code lost:
        if (((X.AnonymousClass1nE) r2).A24() == false) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0257, code lost:
        if (r0 != 12) goto L_0x0259;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0251  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1I7 A02(X.AnonymousClass4EV r63, X.C30471mV r64, int r65, long r66, boolean r68, boolean r69) {
        /*
            r62 = this;
            r2 = r64
            X.33C r6 = r2.A01
            r17 = 0
            if (r6 != 0) goto L_0x001c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS unable to download due to missing media data; message.key="
        L_0x000e:
            X.C624134x.A0S(r2, r0, r1)
            java.lang.String r0 = ", message.mediaHash="
            r1.append(r0)
            java.lang.String r0 = r2.A04
            X.C18260x0.A1K(r1, r0)
            return r17
        L_0x001c:
            boolean r0 = r6.A0R
            if (r0 == 0) goto L_0x002b
            boolean r0 = r6.A0Z
            if (r0 != 0) goto L_0x002b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS download already completed; message.key="
            goto L_0x000e
        L_0x002b:
            r4 = r62
            X.2eP r0 = r4.A0P
            r61 = r0
            X.1I7 r7 = r0.A00(r6)
            boolean r0 = r6.A0c
            r1 = 0
            r9 = r63
            r11 = r65
            r59 = r69
            if (r0 == 0) goto L_0x0052
            if (r7 == 0) goto L_0x0052
            if (r69 != 0) goto L_0x0046
            r7.A06 = r1
        L_0x0046:
            int r0 = r7.A12
            if (r11 >= r0) goto L_0x010a
            r6.A0a = r1
            r7.A12 = r11
            X.2sf r1 = r7.A0h
            monitor-enter(r1)
            goto L_0x005e
        L_0x0052:
            int r0 = r6.A07
            r1 = 1
            if (r0 != r1) goto L_0x009b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS media has been marked suspicious; message.key="
            goto L_0x000e
        L_0x005e:
            r1.A00 = r11     // Catch:{ all -> 0x0098 }
            monitor-exit(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS existing download upgraded to "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = "; message.key="
            X.C624134x.A0S(r2, r0, r1)
            java.lang.String r0 = ", message.mediaHash="
            r1.append(r0)
            java.lang.String r0 = r2.A04
            X.C18260x0.A1L(r1, r0)
            X.3Wi r6 = r4.A06
            X.1io r5 = r4.A0H
            r3 = -1
            r1 = 2
            X.3cY r0 = new X.3cY
            r0.<init>(r5, r2, r3, r1)
            r6.A0S(r0)
            if (r65 != 0) goto L_0x011d
            boolean r0 = r4.A0G(r2)
            if (r0 == 0) goto L_0x011d
            if (r63 == 0) goto L_0x0097
            r7.AwR(r9)
        L_0x0097:
            return r7
        L_0x0098:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x009b:
            java.lang.String r0 = r6.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00b1
            java.lang.String r0 = r2.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x011e
            boolean r0 = X.AnonymousClass2z0.A0C(r2)
            if (r0 != 0) goto L_0x011e
        L_0x00b1:
            X.4uZ r0 = r2.A0n()
            boolean r0 = r0 instanceof X.C135216kJ
            if (r0 != 0) goto L_0x011e
            X.5ZC r0 = A0q
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x00f3
            X.2qk r5 = r4.A03
            java.lang.String r3 = "MediaDownloadManager/createMediaDownloadForFMessage"
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "createMediaDownloadForFMessage/direct_path is "
            r7.append(r0)
            java.lang.String r0 = r6.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0106
            java.lang.String r0 = "null"
        L_0x00d9:
            r7.append(r0)
            java.lang.String r0 = " encHash is "
            r7.append(r0)
            java.lang.String r0 = r2.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0102
            java.lang.String r0 = "null"
        L_0x00ec:
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r7)
            r5.A0A(r3, r1, r0)
        L_0x00f3:
            if (r63 == 0) goto L_0x011d
            java.util.concurrent.Executor r2 = r4.A0o
            r1 = 33
            X.3cG r0 = new X.3cG
            r0.<init>((java.lang.Object) r9, (int) r1)
            r2.execute(r0)
            return r17
        L_0x0102:
            java.lang.String r0 = "not null"
            goto L_0x00ec
        L_0x0106:
            java.lang.String r0 = "not null"
            goto L_0x00d9
        L_0x010a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS download already in progress (according to media data); message.key="
            X.C624134x.A0S(r2, r0, r1)
            java.lang.String r0 = ", message.mediaHash="
            r1.append(r0)
            java.lang.String r0 = r2.A04
            X.C18260x0.A1K(r1, r0)
        L_0x011d:
            return r17
        L_0x011e:
            X.3Wi r0 = r4.A06
            r60 = r0
            r8 = 26
            X.3c6 r1 = new X.3c6
            r3 = r1
            r5 = r2
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0.BkS(r1)
            X.3fO r7 = r4.A0Q
            monitor-enter(r7)
            X.2z0 r8 = r2.A1J     // Catch:{ all -> 0x03e2 }
            boolean r0 = r7.containsKey(r8)     // Catch:{ all -> 0x03e2 }
            boolean r0 = X.AnonymousClass000.A1T(r0)
            monitor-exit(r7)     // Catch:{ all -> 0x03e2 }
            if (r0 == 0) goto L_0x031c
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/shouldAttemptCreate"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.4uZ r10 = r8.A00
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/shouldAttemptCreate/chat jid obtained"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.1VX r12 = r4.A0K
            X.3Dh r0 = r4.A05
            r14 = r0
            X.2ld r1 = r4.A0T
            X.36Y r0 = r4.A0J
            r36 = r0
            X.1R1 r15 = r4.A0b
            X.3Mz r3 = r4.A0L
            X.2hp r0 = r4.A0X
            r34 = r0
            X.2Yl r0 = r4.A0Y
            r19 = r0
            X.33C r5 = X.C30471mV.A00(r2)
            boolean r0 = X.C624234y.A04(r2)
            if (r0 == 0) goto L_0x0312
            r41 = 3
        L_0x016e:
            boolean r0 = r10 instanceof X.C135166kE
            r55 = r0
            java.lang.String r0 = r5.A0I
            if (r0 != 0) goto L_0x017c
            java.lang.String r0 = X.C18280x3.A0Y()
            r5.A0I = r0
        L_0x017c:
            int r13 = r5.A08
            int r12 = r5.A06
            X.7YG r16 = new X.7YG
            r0 = r16
            r0.<init>(r13, r12)
            boolean r13 = r10 instanceof X.C135176kF
            if (r13 == 0) goto L_0x030e
            java.lang.String r12 = "gdpr.zip"
            java.lang.String r0 = r2.A1x()
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x02fe
            X.20h r22 = X.C369320h.ACCOUNT
        L_0x0199:
            boolean r0 = r2 instanceof X.AnonymousClass4DU
            r54 = r0
            boolean r0 = r2 instanceof X.C31971pB
            if (r0 == 0) goto L_0x01a9
            boolean r0 = r1.A02(r5)
            r57 = 1
            if (r0 != 0) goto L_0x01ab
        L_0x01a9:
            r57 = 0
        L_0x01ab:
            X.38t r21 = X.AnonymousClass36O.A02(r2)
            java.lang.String r0 = r2.A03
            java.lang.String r1 = r2.A04
            java.lang.String r12 = r2.A07
            r26 = 0
            r20 = r14
            r23 = r0
            r24 = r1
            r25 = r12
            java.io.File r25 = r20.A0L(r21, r22, r23, r24, r25, r26)
            r27 = r14
            r28 = r21
            r29 = r22
            r30 = r1
            r31 = r12
            r33 = r54
            r32 = r26
            java.io.File r24 = r27.A0M(r28, r29, r30, r31, r32, r33)
            boolean r56 = r5.A03()
            if (r12 == 0) goto L_0x01e5
            java.lang.String r0 = "static.whatsapp.net/downloadable?category=PSA"
            boolean r1 = r12.contains(r0)
            r0 = 1
            if (r1 != 0) goto L_0x01e6
        L_0x01e5:
            r0 = 0
        L_0x01e6:
            int r42 = X.C18310x6.A02(r0)
            boolean r0 = r2 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x01f9
            r0 = r2
            X.1nE r0 = (X.AnonymousClass1nE) r0
            boolean r0 = r0.A24()
            r58 = 1
            if (r0 != 0) goto L_0x01fb
        L_0x01f9:
            r58 = 0
        L_0x01fb:
            int r0 = r5.A04
            r37 = r0
            byte[] r0 = r5.A0T
            r35 = r0
            java.io.File r0 = r5.A0F
            r23 = r0
            long r0 = r2.A00
            r45 = r0
            int r0 = r2.A0B
            long r0 = (long) r0
            r47 = r0
            X.30d r0 = r2.A1v()
            X.3d9 r14 = new X.3d9
            r14.<init>(r3, r0)
            java.lang.String r0 = r2.A04
            r27 = r0
            java.lang.String r28 = r2.A1x()
            java.lang.String r0 = r5.A0I
            r29 = r0
            java.lang.String r0 = r2.A03
            r30 = r0
            java.lang.String r0 = r2.A05
            r31 = r0
            java.lang.String r0 = r5.A0G
            r32 = r0
            int r0 = r2.A09
            r18 = r0
            int r39 = X.C989053r.A00(r2, r15)
            r3 = r36
            r1 = r34
            r0 = r19
            int r40 = X.AnonymousClass29K.A01(r3, r2, r1, r0)
            X.4uZ r0 = r2.A0n()
            boolean r15 = r0 instanceof X.C135216kJ
            int r0 = r2.A0D
            r1 = 11
            r50 = 1
            if (r0 == r1) goto L_0x0259
            r50 = 0
            r1 = 12
            r51 = 1
            if (r0 == r1) goto L_0x025b
        L_0x0259:
            r51 = 0
        L_0x025b:
            X.30w r0 = r2.A0y()
            if (r0 == 0) goto L_0x026d
            X.30w r0 = r2.A0y()
            boolean r0 = r0.A05()
            r52 = 1
            if (r0 != 0) goto L_0x026f
        L_0x026d:
            r52 = 0
        L_0x026f:
            byte r1 = r2.A1I
            r0 = 20
            if (r1 != r0) goto L_0x02fb
            r0 = r2
            X.1nE r0 = (X.AnonymousClass1nE) r0
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0280
            int r0 = r5.A04
            if (r0 <= 0) goto L_0x02fb
        L_0x0280:
            r53 = 1
        L_0x0282:
            r49 = 0
            byte[] r1 = r5.A0W
            X.33C r0 = r2.A01
            java.lang.String r0 = r0.A0L
            X.2dc r3 = new X.2dc
            r19 = r10
            r20 = r16
            r26 = r12
            r33 = r0
            r34 = r14
            r36 = r1
            r38 = r18
            r43 = r45
            r45 = r47
            r47 = r55
            r48 = r15
            r55 = r49
            r18 = r3
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r45, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            X.2VS r1 = r4.A04
            android.os.ConditionVariable r0 = r4.A01
            int r56 = X.AnonymousClass368.A00(r10)
            r57 = r66
            r52 = r1
            r53 = r0
            r54 = r3
            r55 = r11
            X.1I7 r5 = r52.A00(r53, r54, r55, r56, r57, r59)
            if (r10 == 0) goto L_0x02cf
            X.2sj r0 = r4.A0G
            java.util.Set r0 = r0.A04(r10)
            int r1 = r0.size()
            X.2sf r0 = r5.A0h
            r0.A01 = r1
        L_0x02cf:
            long r0 = r2.A0I
            X.2sf r10 = r5.A0h
            r10.A0E = r0
            java.lang.String r0 = r8.A01
            r10.A0W = r0
            int r1 = r2.A0l()
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            if (r13 != 0) goto L_0x02f5
            if (r0 != 0) goto L_0x02f5
            long r0 = r2.A1L
            r11 = -1
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x02f5
            boolean r1 = X.AnonymousClass36V.A06(r2)
            r0 = 0
            if (r1 == 0) goto L_0x02f6
        L_0x02f5:
            r0 = 1
        L_0x02f6:
            X.C626936e.A0C(r0)
        L_0x02f9:
            monitor-enter(r7)
            goto L_0x0320
        L_0x02fb:
            r53 = 0
            goto L_0x0282
        L_0x02fe:
            java.lang.String r12 = "channels_gdpr.zip"
            java.lang.String r0 = r2.A1x()
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x030e
            X.20h r22 = X.C369320h.NEWSLETTER
            goto L_0x0199
        L_0x030e:
            r22 = 0
            goto L_0x0199
        L_0x0312:
            boolean r0 = X.AnonymousClass35Z.A01(r12, r2)
            int r41 = X.C18280x3.A00(r0)
            goto L_0x016e
        L_0x031c:
            r5 = r17
            r3 = r5
            goto L_0x02f9
        L_0x0320:
            boolean r0 = r7.containsKey(r8)     // Catch:{ all -> 0x03df }
            if (r0 != 0) goto L_0x033d
            if (r5 == 0) goto L_0x033d
            r7.put(r8, r2)     // Catch:{ all -> 0x03df }
            r0 = r61
            java.util.HashMap r1 = r0.A00     // Catch:{ all -> 0x03df }
            monitor-enter(r1)     // Catch:{ all -> 0x03df }
            java.lang.String r0 = "MediaDataHelper/setDownloaderFor"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x033a }
            r1.put(r6, r5)     // Catch:{ all -> 0x033a }
            monitor-exit(r1)     // Catch:{ all -> 0x033a }
            goto L_0x0340
        L_0x033a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x033a }
            throw r0     // Catch:{ all -> 0x03df }
        L_0x033d:
            r5 = r17
            r3 = r5
        L_0x0340:
            monitor-exit(r7)     // Catch:{ all -> 0x03df }
            r16 = r68
            if (r68 == 0) goto L_0x0353
            X.1io r7 = r4.A0H
            r6 = -1
            r0 = 2
            X.3cY r1 = new X.3cY
            r1.<init>(r7, r2, r6, r0)
            r0 = r60
            r0.A0S(r1)
        L_0x0353:
            if (r5 == 0) goto L_0x03de
            java.lang.String r0 = r2.A04
            r10 = r4
            r11 = r9
            r12 = r5
            r13 = r3
            r14 = r2
            r15 = r0
            boolean r0 = r10.A0F(r11, r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x037a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS existing download with hash for message.key="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", message.mediaHash="
            r1.append(r0)
            java.lang.String r0 = r2.A04
            X.C18260x0.A1L(r1, r0)
            return r17
        L_0x037a:
            if (r63 == 0) goto L_0x037f
            r5.AwR(r9)
        L_0x037f:
            r0 = 18
            X.4Ji r1 = new X.4Ji
            r1.<init>(r2, r0)
            java.util.concurrent.Executor r7 = r4.A0o
            X.3XB r0 = r5.A0M
            r0.A04(r1, r7)
            r0 = 11
            X.4Jl r1 = new X.4Jl
            r1.<init>(r4, r0, r2)
            X.3XB r0 = r5.A0K
            r0.A04(r1, r7)
            if (r68 == 0) goto L_0x03b5
            r0 = 12
            X.4Jl r6 = new X.4Jl
            r6.<init>(r4, r0, r2)
            java.util.concurrent.Executor r1 = r4.A0p
            X.3XB r0 = r5.A0I
            r0.A04(r6, r1)
            r0 = 10
            X.4Jh r1 = new X.4Jh
            r1.<init>(r2, r4, r3, r0)
            X.3XB r0 = r5.A0L
            r0.A04(r1, r7)
        L_0x03b5:
            r0 = 13
            X.4Jl r1 = new X.4Jl
            r1.<init>(r4, r0, r2)
            X.3XB r0 = r5.A0H
            r0.A04(r1, r7)
            r15 = 1
            X.4Jk r1 = new X.4Jk
            r11 = r1
            r12 = r3
            r13 = r2
            r14 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            java.util.concurrent.Executor r3 = r4.A0p
            X.3XB r0 = r5.A0G
            r0.A04(r1, r3)
            r0 = 14
            X.4Jl r1 = new X.4Jl
            r1.<init>(r4, r0, r2)
            X.3XB r0 = r5.A0J
            r0.A04(r1, r3)
        L_0x03de:
            return r5
        L_0x03df:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x03df }
            throw r0
        L_0x03e2:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x03e2 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C620133d.A02(X.4EV, X.1mV, int, long, boolean, boolean):X.1I7");
    }

    public AnonymousClass1I7 A03(C30471mV r4) {
        AnonymousClass4D9 r1;
        HashMap hashMap = this.A0l;
        synchronized (hashMap) {
            r1 = (AnonymousClass4D9) hashMap.get(r4.A04);
        }
        if (r1 instanceof AnonymousClass1I7) {
            return (AnonymousClass1I7) r1;
        }
        return null;
    }

    public Collection A04() {
        ArrayList A0J2;
        C73373fO r1 = this.A0Q;
        synchronized (r1) {
            A0J2 = AnonymousClass002.A0J(r1.values());
        }
        return A0J2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if ((r5 instanceof X.AnonymousClass1I7) != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.AnonymousClass4EV r15, X.C30471mV r16, int r17) {
        /*
            r14 = this;
            r10 = -1
            r12 = 1
            r13 = 0
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            X.1I7 r4 = r6.A02(r7, r8, r9, r10, r12, r13)
            if (r4 == 0) goto L_0x0075
            java.lang.String r0 = r8.A03
            if (r0 == 0) goto L_0x0030
            X.1VX r0 = r14.A0K
            boolean r0 = X.C56952sp.A0I(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = r8.A03
            java.util.HashMap r1 = r14.A0m
            monitor-enter(r1)
            java.lang.Object r5 = r1.get(r0)     // Catch:{ all -> 0x002d }
            X.4D9 r5 = (X.AnonymousClass4D9) r5     // Catch:{ all -> 0x002d }
            monitor-exit(r1)     // Catch:{ all -> 0x002d }
            boolean r0 = r5 instanceof X.AnonymousClass1I7
            if (r0 == 0) goto L_0x0030
            goto L_0x0031
        L_0x002d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002d }
            throw r0
        L_0x0030:
            r5 = 0
        L_0x0031:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownloadManager/start manual download "
            X.C624134x.A0S(r8, r0, r1)
            java.lang.String r0 = ", message.mediaHash="
            r1.append(r0)
            java.lang.String r0 = r8.A04
            X.C18260x0.A1L(r1, r0)
            boolean r0 = r14.A0H(r8)
            if (r0 == 0) goto L_0x005e
            X.2p1 r3 = r14.A0a
            X.2oU r0 = r14.A0D
            android.content.Context r2 = r0.A00
            java.lang.Class<com.whatsapp.media.download.service.MediaDownloadService> r1 = com.whatsapp.media.download.service.MediaDownloadService.class
            java.lang.String r0 = "com.whatsapp.media.download.service.MediaDownloadService.DOWNLOAD_STARTED"
            android.content.Intent r0 = X.AnonymousClass0x9.A09(r0)
            r3.A03(r2, r0, r1)
            r14.A05()
        L_0x005e:
            if (r5 == 0) goto L_0x0068
            r1 = 31
            X.3by r0 = new X.3by
            r0.<init>(r5, r1, r4)
            r4 = r0
        L_0x0068:
            X.3dH r0 = r14.A0i
            if (r0 == 0) goto L_0x0070
            r0.execute(r4)
            return
        L_0x0070:
            X.4FS r0 = r14.A0h
            r0.BkM(r4)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C620133d.A07(X.4EV, X.1mV, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r3.A01 != r1.A00) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r1.A01().A02 == null) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.C56902sk r20, X.C47662dc r21, X.C30471mV r22, boolean r23) {
        /*
            r19 = this;
            r2 = r22
            monitor-enter(r2)
            X.33C r5 = X.C30471mV.A00(r2)     // Catch:{ all -> 0x011b }
            r1 = r20
            X.35m r8 = r1.A01()     // Catch:{ all -> 0x011b }
            X.C626936e.A06(r8)     // Catch:{ all -> 0x011b }
            r4 = r19
            r3 = r21
            if (r23 == 0) goto L_0x001e
            int r0 = r8.A01     // Catch:{ all -> 0x011b }
            boolean r0 = X.AnonymousClass000.A1T(r0)     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x00d6
        L_0x001e:
            java.io.File r0 = r1.A03()     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x00d6
            java.io.File r0 = r1.A03()     // Catch:{ all -> 0x011b }
            r5.A0F = r0     // Catch:{ all -> 0x011b }
            if (r23 == 0) goto L_0x0033
            int r6 = r3.A01     // Catch:{ all -> 0x011b }
            int r0 = r1.A00     // Catch:{ all -> 0x011b }
            r9 = 1
            if (r6 == r0) goto L_0x0034
        L_0x0033:
            r9 = 0
        L_0x0034:
            X.35m r0 = r1.A01()     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x0043
            X.35m r0 = r1.A01()     // Catch:{ all -> 0x011b }
            java.io.File r0 = r0.A02     // Catch:{ all -> 0x011b }
            r7 = 1
            if (r0 != 0) goto L_0x0044
        L_0x0043:
            r7 = 0
        L_0x0044:
            if (r23 == 0) goto L_0x0093
            if (r9 != 0) goto L_0x0093
            if (r7 != 0) goto L_0x0093
            boolean r7 = r3.A0Y     // Catch:{ all -> 0x011b }
            X.20h r11 = r3.A0B     // Catch:{ all -> 0x011b }
            boolean r6 = r3.A0W     // Catch:{ all -> 0x011b }
            boolean r0 = r3.A0b     // Catch:{ all -> 0x011b }
            X.38t r10 = r3.A0A     // Catch:{ all -> 0x011b }
            int r14 = r3.A04     // Catch:{ all -> 0x011b }
            int r15 = r3.A01     // Catch:{ all -> 0x011b }
            java.lang.String r12 = r3.A0K     // Catch:{ all -> 0x011b }
            java.lang.String r13 = r8.A03     // Catch:{ all -> 0x011b }
            java.lang.String r8 = r3.A0L     // Catch:{ all -> 0x011b }
            if (r13 != 0) goto L_0x0069
            if (r8 == 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r13 = 0
            goto L_0x0069
        L_0x0065:
            java.lang.String r13 = X.C627536m.A08(r8)     // Catch:{ all -> 0x011b }
        L_0x0069:
            X.3Dh r8 = r4.A05     // Catch:{ all -> 0x011b }
            X.2y5 r9 = r4.A0W     // Catch:{ all -> 0x011b }
            r16 = r7
            r17 = r6
            r18 = r0
            java.io.File r7 = X.C107655bf.A0O(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x011b }
            r5.A0F = r7     // Catch:{ all -> 0x011b }
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x011b }
            java.lang.String r0 = "MediaDownload/applyDownloadDataInWorkerThread/generate mediaDataV2.file = "
            java.lang.String r0 = X.AnonymousClass0x7.A0o(r7, r0, r6)     // Catch:{ all -> 0x011b }
            X.C18260x0.A1J(r6, r0)     // Catch:{ all -> 0x011b }
            java.io.File r1 = r1.A03()     // Catch:{ IOException -> 0x0090 }
            java.io.File r0 = r5.A0F     // Catch:{ IOException -> 0x0090 }
            r8.A0a(r1, r0)     // Catch:{ IOException -> 0x0090 }
            goto L_0x00d6
        L_0x0090:
            r6 = move-exception
            r0 = 0
            goto L_0x00c6
        L_0x0093:
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x011b }
            java.lang.String r0 = "MediaDownload/applyDownloadDataInWorkerThread/copy downloadData.file = "
            r6.append(r0)     // Catch:{ all -> 0x011b }
            java.io.File r0 = r1.A03()     // Catch:{ all -> 0x011b }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x011b }
            X.C18260x0.A1J(r6, r0)     // Catch:{ all -> 0x011b }
            java.io.File r6 = r1.A03()     // Catch:{ all -> 0x011b }
            r5.A0F = r6     // Catch:{ all -> 0x011b }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x011b }
            r6.setLastModified(r0)     // Catch:{ all -> 0x011b }
            if (r9 != 0) goto L_0x00b8
            if (r7 == 0) goto L_0x00d6
        L_0x00b8:
            java.lang.String r0 = "MediaDownload/applyDownloadDataInWorkerThread/add reference count to file"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x011b }
            X.2rq r6 = r4.A09     // Catch:{ all -> 0x011b }
            java.io.File r1 = r5.A0F     // Catch:{ all -> 0x011b }
            r0 = 1
            r6.A04(r1, r0, r0)     // Catch:{ all -> 0x011b }
            goto L_0x00d6
        L_0x00c6:
            r5.A0R = r0     // Catch:{ all -> 0x011b }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x011b }
            java.lang.String r0 = "MediaDownload/applyDownloadDataInWorkerThread/MMS download failed to copy file to duplicate download; mediaHash = "
            r1.append(r0)     // Catch:{ all -> 0x011b }
            java.lang.String r0 = r3.A0H     // Catch:{ all -> 0x011b }
            X.C18260x0.A1Q(r1, r0, r6)     // Catch:{ all -> 0x011b }
        L_0x00d6:
            java.util.Set r1 = r4.A0n     // Catch:{ all -> 0x011b }
            monitor-enter(r1)     // Catch:{ all -> 0x011b }
            X.2z0 r0 = r2.A1J     // Catch:{ all -> 0x0118 }
            boolean r0 = r1.remove(r0)     // Catch:{ all -> 0x0118 }
            monitor-exit(r1)     // Catch:{ all -> 0x0118 }
            if (r0 == 0) goto L_0x0108
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x011b }
            java.lang.String r0 = "MediaDownloadManager/applyDownloadDataInWorkerThread/revoking mediaHash = "
            r1.append(r0)     // Catch:{ all -> 0x011b }
            java.lang.String r0 = r3.A0H     // Catch:{ all -> 0x011b }
            X.C18260x0.A1J(r1, r0)     // Catch:{ all -> 0x011b }
            java.io.File r6 = r5.A0F     // Catch:{ all -> 0x011b }
            if (r6 == 0) goto L_0x0108
            X.2rq r5 = r4.A09     // Catch:{ all -> 0x011b }
            byte r4 = r2.A1I     // Catch:{ all -> 0x011b }
            r1 = 1
            boolean r0 = r5.A07(r6)     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x0108
            int r0 = r5.A00(r6, r1)     // Catch:{ all -> 0x011b }
            if (r0 >= 0) goto L_0x0108
            r5.A03(r6, r4)     // Catch:{ all -> 0x011b }
        L_0x0108:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x011b }
            java.lang.String r0 = "MediaDownloadManager/applyDownloadDataInWorkerThread/mediaHash="
            r1.append(r0)     // Catch:{ all -> 0x011b }
            java.lang.String r0 = r3.A0H     // Catch:{ all -> 0x011b }
            X.C18260x0.A1J(r1, r0)     // Catch:{ all -> 0x011b }
            monitor-exit(r2)     // Catch:{ all -> 0x011b }
            return
        L_0x0118:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0118 }
            throw r0     // Catch:{ all -> 0x011b }
        L_0x011b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x011b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C620133d.A0A(X.2sk, X.2dc, X.1mV, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r5 == 24) goto L_0x0038;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=X.1mV, code=X.34x, for r4v0, types: [X.1mV, X.34x] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(X.C624134x r4, int r5, boolean r6) {
        /*
            r3 = this;
            if (r6 == 0) goto L_0x003c
            boolean r0 = X.AnonymousClass31H.A02(r4)
            if (r0 == 0) goto L_0x0019
            X.2gy r1 = r3.A0A
            com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob r0 = new com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob
            r0.<init>(r4)
            r1.A02(r0)
            X.1io r1 = r3.A0H
            r0 = 20
            r1.A0C(r4, r0)
        L_0x0019:
            boolean r0 = X.AnonymousClass36V.A06(r4)
            if (r0 == 0) goto L_0x002d
            X.2z0 r1 = r4.A1J
            X.2qz r0 = r3.A0e     // Catch:{ all -> 0x002a }
            X.34x r0 = r0.A05(r1)     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x002d
            goto L_0x002c
        L_0x002a:
            r0 = move-exception
            throw r0
        L_0x002c:
            r4 = r0
        L_0x002d:
            X.3Lv r2 = r3.A0F
            r0 = 13
            if (r5 == r0) goto L_0x0038
            r1 = 24
            r0 = 3
            if (r5 != r1) goto L_0x0039
        L_0x0038:
            r0 = -1
        L_0x0039:
            r2.A0b(r4, r0)
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C620133d.A0D(X.1mV, int, boolean):void");
    }

    public final void A0E(C30471mV r4, boolean z, boolean z2) {
        AnonymousClass4D9 r2;
        C56482s3 r0;
        HashMap hashMap = this.A0l;
        synchronized (hashMap) {
            r2 = (AnonymousClass4D9) hashMap.get(r4.A04);
        }
        if (r2 != null) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            C624134x.A0S(r4, "MediaDownloadManager/cancelDownload/message.key=", A0o2);
            A0o2.append(", message.mediaHash=");
            C18260x0.A1L(A0o2, r4.A04);
            r2.Ayd(z2);
        }
        AnonymousClass2z0 r22 = r4.A1J;
        if (r22.A00 instanceof C95804uY) {
            r0 = this.A0S;
        } else {
            r0 = this.A0R;
        }
        r0.A06(r4);
        if (z) {
            Set set = this.A0n;
            synchronized (set) {
                set.add(r22);
            }
        }
    }

    public final boolean A0H(C30471mV r7) {
        AnonymousClass1VX r2 = this.A0K;
        if (!r2.A0Y(C58422vE.A02, 1147) || ((!(r7 instanceof AnonymousClass1nF) && !(r7 instanceof C31971pB)) || AnonymousClass2z0.A0B(r7) || r7.A00 <= C56952sp.A06(r2, 1148) * 1048576)) {
            return false;
        }
        return true;
    }

    public C620133d(C55682qk r7, AnonymousClass2VS r8, C64393Dh r9, C69263Wi r10, C56972sr r11, AnonymousClass36E r12, C56352rq r13, C49712gy r14, C56612sH r15, C54292oU r16, C56982ss r17, C66543Lv r18, C56892sj r19, C29431io r20, AnonymousClass300 r21, AnonymousClass36Y r22, AnonymousClass1VX r23, C66843Mz r24, C45982at r25, C60132y3 r26, C55572qZ r27, C48132eP r28, C28181fp r29, C28191fq r30, C52532ld r31, AnonymousClass33S r32, AnonymousClass5UP r33, C60152y5 r34, C50222hp r35, C45042Yl r36, C29011i8 r37, C54622p1 r38, AnonymousClass1R1 r39, C55732qp r40, WebpUtils webpUtils, C55832qz r42, C617832f r43, C33141sV r44, AnonymousClass4FS r45, C34171uL r46) {
        C72163dH r3 = null;
        this.A0C = r15;
        AnonymousClass1VX r5 = r23;
        this.A0K = r5;
        this.A06 = r10;
        this.A07 = r11;
        this.A03 = r7;
        this.A0D = r16;
        AnonymousClass4FS r4 = r45;
        this.A0h = r4;
        this.A0d = webpUtils;
        this.A0E = r17;
        this.A05 = r9;
        this.A0U = r32;
        this.A0T = r31;
        this.A0A = r14;
        this.A0Z = r37;
        this.A0J = r22;
        this.A08 = r12;
        this.A0P = r28;
        this.A0j = r46;
        this.A0f = r43;
        this.A0e = r42;
        this.A0N = r26;
        this.A0F = r18;
        this.A0a = r38;
        this.A0H = r20;
        this.A0V = r33;
        this.A0b = r39;
        this.A0c = r40;
        this.A0g = r44;
        this.A0I = r21;
        this.A0O = r27;
        this.A04 = r8;
        this.A0G = r19;
        this.A0W = r34;
        this.A0R = r29;
        this.A0M = r25;
        this.A09 = r13;
        this.A0L = r24;
        this.A0S = r30;
        this.A0X = r35;
        this.A0Y = r36;
        Objects.requireNonNull(r10);
        this.A0o = new C86044Ip(r10, 2);
        Objects.requireNonNull(r4);
        this.A0p = new C86044Ip(r4, 1);
        C58422vE r1 = C58422vE.A02;
        this.A0i = r5.A0O(r1, 776) > 0 ? new C72163dH(r4, r5.A0O(r1, 776), false) : r3;
    }

    public static void A00(C56902sk r2, C620133d r3, C624134x r4) {
        UserJid A0o2;
        r3.A05();
        if ((r4 instanceof AnonymousClass1n2) && (A0o2 = r4.A0o()) != null && C155477ey.A00(A0o2)) {
            C107655bf.A0b(r2.A03());
            r2.A0C(r2.A03().length());
        }
    }

    public static /* synthetic */ void A01(C620133d r6, C47662dc r7) {
        String str;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("mediadownloadmanager/scheduleExpressPathFileCleanUp scheduled clean up for express path with enc hash ");
        String str2 = r7.A0G;
        C18260x0.A1J(A0o2, str2);
        File file = r7.A0D;
        if (file == null) {
            str = "mediadownloadmanager/scheduleExpressPathFileCleanUp encrypted file is null";
        } else if (str2 == null) {
            str = "mediadownloadmanager/scheduleExpressPathFileCleanUp encrypted file hash is null";
        } else {
            AnonymousClass0Aw r4 = new AnonymousClass0Aw(ExpressPathGarbageCollectWorker.class);
            AnonymousClass0Q9 r3 = new AnonymousClass0Q9();
            String absolutePath = file.getAbsolutePath();
            Map map = r3.A00;
            map.put("file_path", absolutePath);
            map.put("end_hash", str2);
            C18320x8.A1A(r3, r4);
            r4.A02(5, TimeUnit.MINUTES);
            C72333dY.A01(r6.A0j).A07(C02320Fs.KEEP, AnonymousClass0x9.A0I(r4), str2);
            return;
        }
        Log.e(str);
    }

    public final void A05() {
        Collection A042 = A04();
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A042.iterator();
        while (it.hasNext()) {
            C30471mV A0S2 = C18320x8.A0S(it);
            if (A0H(A0S2)) {
                A0s.add(A0S2);
            }
        }
        this.A0B.A05(A0s);
    }

    public void A08(AnonymousClass4EV r6, C30471mV r7, int i, long j, boolean z, boolean z2) {
        AnonymousClass4D9 r62;
        AnonymousClass1I7 r63;
        long j2;
        AnonymousClass1I7 A022 = A02(r6, r7, i, j, z, z2);
        if (A022 != null) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            AnonymousClass2z0 A082 = C624134x.A08(r7, "MediaDownloadManager/queueDownload auto download ", A0o2);
            A0o2.append(A082);
            A0o2.append(", message.mediaHash=");
            C18260x0.A1L(A0o2, r7.A04);
            if (A082.A00 instanceof C95804uY) {
                if (this.A0V.A03(3)) {
                    j2 = (long) C383427e.A00(this.A0E, this.A0K, r7);
                } else {
                    j2 = 0;
                }
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("MediaDownloadManager/queueDownload queue in newsletterMediaDownloadPriorityQueue with delay ");
                A0o3.append(j2);
                C18260x0.A1L(A0o3, "ms");
                this.A02.postDelayed(new C70343aL(this, r7, A022, 44), j2);
                return;
            }
            if (r7.A03 != null && C56952sp.A0I(this.A0K)) {
                String str = r7.A03;
                HashMap hashMap = this.A0m;
                synchronized (hashMap) {
                    r62 = (AnonymousClass4D9) hashMap.get(str);
                }
                if ((r62 instanceof AnonymousClass1I7) && (r63 = (AnonymousClass1I7) r62) != null) {
                    r63.A0K.A04(new C86234Ji(A022, 16), (Executor) null);
                    A022.A00.A04(new C86234Ji(r63, 17), this.A0p);
                    this.A0h.BkM(new C70513ac(this, r63, r7, A022, 6));
                    return;
                }
            }
            this.A0R.A02(A022, r7);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (r1 == false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.C30471mV r12) {
        /*
            r11 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownloadManager/markAsUrgent message.key="
            X.2z0 r6 = X.C624134x.A08(r12, r0, r1)
            r1.append(r6)
            java.lang.String r5 = ", message.mediaHash="
            r1.append(r5)
            java.lang.String r0 = r12.A04
            X.C18260x0.A1J(r1, r0)
            X.33C r0 = r12.A01
            X.C626936e.A06(r0)
            X.2eP r4 = r11.A0P
            X.33C r0 = r12.A01
            X.1I7 r1 = r4.A00(r0)
            if (r1 == 0) goto L_0x00c8
            boolean r0 = r11.A0G(r12)
            if (r0 == 0) goto L_0x00c8
            r8 = 1
            r1.A13 = r8
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            X.3fO r3 = r11.A0Q
            monitor-enter(r3)
            android.os.ConditionVariable r0 = r11.A01     // Catch:{ all -> 0x00c5 }
            r0.close()     // Catch:{ all -> 0x00c5 }
            java.util.Collection r0 = r11.A04()     // Catch:{ all -> 0x00c5 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x00c5 }
        L_0x0043:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0077
            X.1mV r9 = X.C18320x8.A0S(r10)     // Catch:{ all -> 0x00c5 }
            X.33C r0 = r9.A01     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0043
            boolean r0 = X.AnonymousClass2z0.A0C(r9)     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0071
            X.1fq r2 = r11.A0S     // Catch:{ all -> 0x00c5 }
        L_0x0059:
            monitor-enter(r2)     // Catch:{ all -> 0x00c5 }
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x0074 }
            X.3ce r0 = (X.C71773ce) r0     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x0069
            boolean r1 = r0.A03     // Catch:{ all -> 0x0074 }
            r0 = 1
            if (r1 != 0) goto L_0x006a
        L_0x0069:
            r0 = 0
        L_0x006a:
            monitor-exit(r2)     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0043
            r7.add(r9)     // Catch:{ all -> 0x00c5 }
            goto L_0x0043
        L_0x0071:
            X.1fp r2 = r11.A0R     // Catch:{ all -> 0x00c5 }
            goto L_0x0059
        L_0x0074:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00c5 }
            throw r0     // Catch:{ all -> 0x00c5 }
        L_0x0077:
            monitor-exit(r3)     // Catch:{ all -> 0x00c5 }
            int r0 = r7.size()
            if (r0 <= 0) goto L_0x00ab
            java.util.Iterator r7 = r7.iterator()
        L_0x0082:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00ab
            X.1mV r3 = X.C18320x8.A0S(r7)
            X.1I7 r1 = r11.A03(r3)
            if (r1 == 0) goto L_0x0082
            boolean r0 = r1.A13
            if (r0 != 0) goto L_0x0082
            int r0 = r1.A12
            if (r0 != r8) goto L_0x0082
            java.util.HashMap r2 = r11.A0k
            monitor-enter(r2)
            long r0 = r1.A08     // Catch:{ all -> 0x00a8 }
            X.AnonymousClass0x2.A1J(r3, r2, r0)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r2)     // Catch:{ all -> 0x00a8 }
            r0 = 0
            r11.A0E(r3, r0, r0)
            goto L_0x0082
        L_0x00a8:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00a8 }
            throw r0
        L_0x00ab:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownloadManager/markAsUrgent/executing download message.key="
            X.AnonymousClass000.A17(r6, r0, r5, r1)
            java.lang.String r0 = r12.A04
            X.C18260x0.A1J(r1, r0)
            X.4FS r1 = r11.A0h
            X.33C r0 = r12.A01
            X.1I7 r0 = r4.A00(r0)
            r1.BkM(r0)
            return
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00c5 }
            throw r0
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C620133d.A0C(X.1mV):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (r3.A05(r0, r5) == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r1 == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0G(X.C30471mV r5) {
        /*
            r4 = this;
            boolean r0 = X.AnonymousClass2z0.A0C(r5)
            if (r0 == 0) goto L_0x000a
            X.1fq r3 = r4.A0S
        L_0x0008:
            monitor-enter(r3)
            goto L_0x000d
        L_0x000a:
            X.1fp r3 = r4.A0R
            goto L_0x0008
        L_0x000d:
            java.util.Map r2 = r3.A01     // Catch:{ all -> 0x0035 }
            java.lang.Object r0 = r2.get(r5)     // Catch:{ all -> 0x0035 }
            X.3ce r0 = (X.C71773ce) r0     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x001c
            boolean r1 = r0.A03     // Catch:{ all -> 0x0035 }
            r0 = 1
            if (r1 != 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            monitor-exit(r3)
            if (r0 == 0) goto L_0x0022
            r1 = 0
            return r1
        L_0x0022:
            monitor-enter(r3)
            java.lang.Object r0 = r2.get(r5)     // Catch:{ all -> 0x0035 }
            X.3ce r0 = (X.C71773ce) r0     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0032
            boolean r0 = r3.A05(r0, r5)     // Catch:{ all -> 0x0035 }
            r1 = 1
            if (r0 != 0) goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            monitor-exit(r3)
            return r1
        L_0x0035:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C620133d.A0G(X.1mV):boolean");
    }
}
