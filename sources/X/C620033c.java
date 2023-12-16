package X;

import android.os.SystemClock;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: X.33c  reason: invalid class name and case insensitive filesystem */
public class C620033c {
    public final C55682qk A00;
    public final C64393Dh A01;
    public final C69263Wi A02;
    public final C56352rq A03;
    public final C29441ip A04;
    public final C60872zJ A05;
    public final AnonymousClass1VX A06;
    public final AnonymousClass4FV A07;
    public final C48092eK A08;
    public final C55972rD A09;
    public final C55812qx A0A;
    public final C55572qZ A0B;
    public final C49592gm A0C;
    public final C50112he A0D;
    public final C46042az A0E;
    public final C55852r1 A0F;
    public final C162287rd A0G;
    public final C28121fj A0H;
    public final C55732qp A0I;
    public final C107105ah A0J;
    public final C617832f A0K;
    public final AnonymousClass306 A0L;
    public final C107085af A0M;
    public final AnonymousClass4FS A0N;
    public final Executor A0O;

    public void A07(C66513Ls r16, C85044Es r17, boolean z) {
        String str;
        byte[] bArr;
        C633138t r0;
        C66513Ls r02 = r16;
        if (r16 != null && (str = r02.A0Z) != null && (bArr = r02.A0W) != null) {
            C64393Dh r03 = this.A01;
            String A0Y = C18280x3.A0Y();
            File file = r03.A08().A0R;
            C64393Dh.A07(file, false);
            C626936e.A06(A0Y);
            File A032 = C64393Dh.A03(file, A0Y);
            try {
                C627536m.A0H(A032, bArr);
                Pair A0L2 = C107655bf.A0L(A032);
                C55592qb r1 = new C55592qb();
                r1.A01 = C18290x4.A03(A0L2);
                r1.A00 = C18280x3.A03(A0L2);
                r1.A07 = A032.getName();
                C85044Es r7 = r17;
                r7.Bmb(r1, str);
                if (z) {
                    r0 = C633138t.A0U;
                } else {
                    r0 = C633138t.A0I;
                }
                AnonymousClass2UD A012 = C154347d1.A01((C148267Hs) null, r0, A032);
                AnonymousClass3QN A033 = this.A09.A03(C18280x3.A0Y(), (byte) 0, 0, false);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("MediaJobManager/enqueueLinkThumbnailJob ");
                C18260x0.A1J(A0o, A033.B8u());
                C61212zt r10 = new C61212zt(A00(A012), A033.A00, A012, new C157497iO(false, false, true));
                C619833a r12 = A033.A01;
                r12.A08((byte) -1, 0, true);
                r12.A0B(r10.A04);
                long currentTimeMillis = System.currentTimeMillis();
                r7.Bmd(A033, str);
                C28121fj r2 = this.A0H;
                C18260x0.A1R(AnonymousClass001.A0o(), "mediauploadqueue/enqueue ", r10);
                ((AnonymousClass1I5) r2.A02(A033, r10)).A0H.A04(new AnonymousClass3X8(A0L2, r7, this, A033, r10, A032, str, currentTimeMillis), this.A0O);
            } catch (IOException e) {
                Object[] A0L3 = AnonymousClass002.A0L();
                A0L3[0] = A032;
                Log.w(String.format("MediaJobManager/writeLinkThumbnailFileAsLocalResource create thumbnail fail at %s.", A0L3), e);
                C627536m.A0O(A032);
            }
        }
    }

    public void A0A(AnonymousClass3QO r12, C61212zt r13) {
        C28121fj r2 = this.A0H;
        C61212zt r6 = r13;
        C18260x0.A1R(AnonymousClass001.A0o(), "mediauploadqueue/enqueue ", r13);
        AnonymousClass3QO r9 = r12;
        AnonymousClass1I5 r8 = (AnonymousClass1I5) r2.A02(r12, r13);
        r12.A0M.A0B(r8.A0V.A04);
        boolean z = true;
        if (r13.A00() != 3) {
            z = false;
            r8.A0C.A04(r12.A0R, this.A0O);
        }
        C86214Jg r5 = new C86214Jg(r6, this, r8, r9, 4);
        Executor executor = this.A0O;
        r8.A0H.A04(r5, executor);
        r8.A0E.A04(new C86264Jl(this, 7, r12), (Executor) null);
        r8.A0F.A04(new AnonymousClass92X(r12, 4), (Executor) null);
        if (!z) {
            r8.A0G.A04(r12.A0S, executor);
        }
        r8.A0D.A04(r12.A0O, executor);
    }

    public void A0F(AnonymousClass3QO r4, boolean z) {
        r4.A03 = true;
        if (z) {
            r4.A0M.A06();
        }
        C50112he r2 = this.A0D;
        if (r2.A04.A06(r4) || (r2.A05.A00(C47592dV.A00(r4)).A06(r4) | r2.A03.A06(r4))) {
            C18260x0.A1P(AnonymousClass001.A0o(), "mediajobmanager/cancelled transcoding job: ", r4);
        }
        C28121fj r22 = this.A0H;
        if (r22.A06(r4)) {
            C18260x0.A1P(AnonymousClass001.A0o(), "mediajobmanager/cancelled uploading job: ", r4);
        }
        AnonymousClass3QN r0 = r4.A02;
        if (r0 != null && r22.A06(r0)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("mediajobmanager/cancelled thumbnail uploading job: ");
            C18260x0.A0m(r4.A02, A0o);
        }
    }

    public static C184298rZ A00(AnonymousClass2UD r2) {
        boolean z;
        C633138t r1 = r2.A06;
        if (AnonymousClass36O.A05(r1)) {
            z = r2.A0D;
        } else {
            z = r2.A0C;
        }
        if (z) {
            return new AnonymousClass8GH(r1);
        }
        return new AnonymousClass3GE(r1);
    }

    public static String A01(File file) {
        if (file == null) {
            return "null";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C18280x3.A11(file, "size=", A0o);
        A0o.append(" exists=");
        return C18300x5.A0m(A0o, file.exists());
    }

    public AnonymousClass3QO A02(C184298rZ r13, AnonymousClass32J r14, boolean z) {
        C55972rD r2 = this.A09;
        C55812qx r6 = r2.A0J;
        AnonymousClass32J r11 = r14;
        String str = r14.A04;
        if (str == null) {
            str = C18280x3.A0Y();
        }
        AnonymousClass5LM A012 = r6.A01(str, 0);
        C184298rZ r7 = r13;
        AnonymousClass3QO r62 = new AnonymousClass3QO(r7, r2.A0B, A012, new C619833a(r2.A06, A012, r6, r2.A0Q, z), r11);
        String str2 = r62.A0L.A0D;
        C162457s7.A0J(str2, 0);
        r62.A0A.A05(str2);
        r62.A0M.A07();
        return r62;
    }

    public AnonymousClass3QO A03(AnonymousClass32J r2, boolean z) {
        return A02(A00(r2.A01), r2, z);
    }

    public AnonymousClass3QO A04(AnonymousClass32J r4, boolean z) {
        AnonymousClass3QO A022 = this.A09.A02(r4, z);
        if (A022 == null) {
            return A03(r4, z);
        }
        if (z) {
            A022.A0L.A03++;
        }
        C55812qx r1 = this.A0A;
        AnonymousClass5LM r0 = A022.A0L;
        r1.A03(r0);
        String str = r0.A0D;
        C162457s7.A0J(str, 0);
        A022.A0A.A05(str);
        A022.A0M.A07();
        return A022;
    }

    public C104575Rn A05(AnonymousClass5LM r16, C619833a r17, C149897Oi r18, int i, int i2, int i3) {
        C149897Oi r2;
        int i4;
        List list;
        int i5 = i;
        int i6 = i3;
        C619833a r7 = r17;
        if (i6 == 4) {
            r7.A09(i6);
        }
        synchronized (r7) {
            r2 = r18;
            if (i == 0) {
                r7.A03 = SystemClock.uptimeMillis();
                r7.A05();
                if (i6 != 3) {
                    C71353by.A01(this.A0N, this, r16, 23);
                }
            } else {
                r7.A03 = SystemClock.uptimeMillis();
                r7.A05();
                if (!this.A04.A0F() && ((r18 != null && r2.A01.A04.A0A == null && (i5 == 17 || i5 == 22 || i5 == 13 || i5 == 33)) || i5 == 14)) {
                    i5 = 25;
                }
            }
        }
        int i7 = i2;
        C26061bW A022 = r7.A02(this.A06, i5, i7);
        if (r18 == null) {
            list = Collections.emptyList();
        } else {
            C49592gm r3 = this.A0C;
            List A002 = r3.A00(r2.A01.A02.A0B);
            ArrayList A0c = C73783g4.A0c(A002);
            Iterator it = A002.iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                C29441ip r10 = r3.A00;
                C25841bA r22 = new C25841bA();
                AnonymousClass5LM r9 = r7.A0K;
                r22.A09 = Long.valueOf(UUID.fromString(r9.A0D).getLeastSignificantBits() & Long.MAX_VALUE);
                r22.A0E = A0m;
                AnonymousClass2UL r11 = r7.A07;
                if (r11 != null) {
                    r22.A00 = r11.A02;
                    r22.A01 = r11.A03;
                    r22.A02 = C18330xA.A07(C106495Zf.A02(r11.A0C));
                    r22.A03 = C18330xA.A07(C106495Zf.A02(r11.A08));
                    r22.A0B = r11.A0G;
                    r22.A0C = C106495Zf.A03(r11.A0I, r7.A0F);
                }
                int i8 = r7.A02;
                if (r9.A0B == 2) {
                    i4 = 7;
                } else if (i8 == 0 || i8 == 2) {
                    i4 = 1;
                } else {
                    i4 = 5;
                    if (i8 != 3) {
                        if (i8 == 4) {
                            i4 = 8;
                        } else {
                            throw AnonymousClass0x9.A0i("Unreachable code");
                        }
                    }
                }
                r22.A04 = Integer.valueOf(i4);
                r22.A05 = AnonymousClass26q.A00(r10.A0A());
                r22.A06 = r7.A09;
                Integer A032 = r7.A03(i5);
                Integer A042 = r7.A04(i5);
                if (A042 != null && A042.intValue() == 12 && A032 != null && A032.intValue() == 1) {
                    A042 = 30;
                }
                r22.A07 = A042;
                r22.A08 = Integer.valueOf(i7);
                r22.A0A = Long.valueOf(C106495Zf.A02(Long.valueOf(r9.A07)));
                r22.A0D = C106495Zf.A03(Long.valueOf(r7.A05), r7.A0F);
                A0c.add(r22);
            }
            list = A0c;
        }
        return new C104575Rn(A022, list);
    }

    public C104575Rn A06(AnonymousClass3QO r8, int i, int i2) {
        int A012;
        AnonymousClass5LM r1 = r8.A0L;
        C619833a r2 = r8.A0M;
        C149897Oi A022 = r8.A02();
        if (r8.A05()) {
            A012 = 4;
        } else {
            A012 = r2.A01();
        }
        return A05(r1, r2, A022, i, i2, A012);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r4.A02() != null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.AnonymousClass3QO r4, int r5) {
        /*
            r3 = this;
            r4.A00 = r5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediajobmanager/handleMediaJobFailure jobId="
            X.C18260x0.A1P(r1, r0, r4)
            X.3XB r0 = r4.A0F
            java.lang.Object r0 = r0.A01()
            r2 = 1
            if (r0 != 0) goto L_0x001b
            X.7Oi r1 = r4.A02()
            r0 = 0
            if (r1 == 0) goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            X.C626936e.A0C(r0)
            if (r5 == r2) goto L_0x0025
            r0 = 32
            if (r5 != r0) goto L_0x0048
        L_0x0025:
            X.3XB r0 = r4.A09
            java.lang.Object r0 = r0.A01()
            X.2QG r0 = (X.AnonymousClass2QG) r0
            if (r0 == 0) goto L_0x0048
            java.io.File r2 = r0.A01
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A02
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0052
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/mediajobmanager/deleteMediaJobFile skip; trying to delete deduplicated file or file attached to message: "
            r1.append(r0)
            r1.append(r2)
        L_0x0045:
            X.AnonymousClass0x2.A18(r1)
        L_0x0048:
            X.3XB r1 = r4.A0B
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.A05(r0)
            return
        L_0x0052:
            boolean r0 = X.C627536m.A0O(r2)
            if (r0 == 0) goto L_0x0048
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/mediajobmanager/deleteMediaJobFile file deleted"
            X.AnonymousClass000.A10(r2, r0, r1)
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C620033c.A09(X.3QO, int):void");
    }

    public final void A0B(AnonymousClass3QO r5, AnonymousClass7PV r6) {
        r6.A02.A04(r5.A0P, (Executor) null);
        r6.A03.A04(r5.A0Q, (Executor) null);
        r6.A04.A04(new C86224Jh(r5, this, r6, 2), (Executor) null);
        r6.A01.A04(new C124276Bq(r5, 2, this), (Executor) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        if (r4 != null) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(X.AnonymousClass3QO r6, X.AnonymousClass7N0 r7) {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r2 = r6.A0U
            r1 = 0
            r0 = 1
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 != 0) goto L_0x0014
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediajobmanager/handleProcessMediaResponse already handled; skipping: "
            X.C18260x0.A1P(r1, r0, r6)
            return
        L_0x0014:
            boolean r0 = r6.A03
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "mediajobmanager/handleProcessMediaResponse handling cancellation: "
            X.C18260x0.A1P(r1, r0, r6)
            boolean r1 = r6.A06()
            r0 = 1
            if (r1 == 0) goto L_0x002a
            r0 = 32
        L_0x002a:
            r5.A09(r6, r0)
            return
        L_0x002e:
            java.lang.String r0 = "mediajobmanager/handleProcessMediaResponse mediaJob continuing: "
            X.C18260x0.A1P(r1, r0, r6)
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x0072
            byte[] r4 = r7.A03
            boolean r1 = r6.A05()
            X.2UD r0 = r6.A00()
            if (r1 == 0) goto L_0x006c
            X.6kb r3 = new X.6kb
            r3.<init>(r6, r0)
        L_0x0048:
            X.38t r2 = X.C47592dV.A00(r6)
            X.32J r0 = r6.A0N
            X.7iO r0 = r0.A03
            boolean r1 = r0.A02
            X.2UD r0 = r6.A00()
            int[] r0 = r0.A0H
            boolean r0 = r5.A0H(r2, r0, r1)
            if (r0 == 0) goto L_0x006a
            if (r4 == 0) goto L_0x0062
        L_0x0060:
            r6.A04 = r4
        L_0x0062:
            boolean r0 = r6.A03
            if (r0 != 0) goto L_0x007e
            r5.A0A(r6, r3)
            return
        L_0x006a:
            r4 = 0
            goto L_0x0060
        L_0x006c:
            X.2zt r3 = new X.2zt
            r3.<init>(r6, r0)
            goto L_0x0048
        L_0x0072:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/mediajobmanager/handleProcessMediaFailure remove mediaJob jobId="
            X.C18260x0.A1P(r1, r0, r6)
            r0 = 20
            goto L_0x002a
        L_0x007e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediatranscodequeue/success/all-cancelled "
            X.C18260x0.A1R(r1, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C620033c.A0C(X.3QO, X.7N0):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        if (r5 == 0) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0175 A[Catch:{ FileNotFoundException -> 0x0154, IOException -> 0x0149 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0176 A[Catch:{ FileNotFoundException -> 0x0154, IOException -> 0x0149 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0198 A[Catch:{ FileNotFoundException -> 0x0154, IOException -> 0x0149 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ab A[Catch:{ FileNotFoundException -> 0x0154, IOException -> 0x0149 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(X.AnonymousClass3QO r18, X.C149897Oi r19) {
        /*
            r17 = this;
            r3 = r18
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.A0V
            r1 = 0
            r0 = 1
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 != 0) goto L_0x0016
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediajobmanager/handleMediaUploadResponse skipping; upload response already handled; mediaJob="
            X.C18260x0.A1P(r1, r0, r3)
            return
        L_0x0016:
            boolean r0 = r3.A06()
            r4 = r17
            r2 = r19
            if (r0 == 0) goto L_0x0031
            int r5 = r2.A00
            if (r5 == 0) goto L_0x0031
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediajobmanager/handleMediaUploadResponse handling optimistic cancellation mediaJob="
            X.C18260x0.A1P(r1, r0, r3)
            r4.A09(r3, r5)
            return
        L_0x0031:
            int r5 = r2.A00
            r0 = 12
            r9 = 0
            if (r5 != r0) goto L_0x0068
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediajobmanager/handleMediaUploadResponse media changed, generating new thumbnail; mediaJob="
            X.C18260x0.A1P(r1, r0, r3)
            X.2zt r0 = r2.A01
            X.2UD r0 = r0.A02
            X.38t r7 = r0.A06
            java.io.File r6 = r0.A07
            X.C626936e.A06(r6)
            X.2sV r1 = r2.A02
            monitor-enter(r1)
            java.lang.String r0 = r1.A0B     // Catch:{ all -> 0x0052 }
            goto L_0x0055
        L_0x0052:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0055:
            monitor-exit(r1)
            X.7Mx r1 = new X.7Mx
            r1.<init>(r7, r6, r0, r9)
            X.2az r0 = r4.A0E
            X.2QF r1 = r0.A00(r1)
            if (r1 == 0) goto L_0x0068
            X.3XB r0 = r3.A06
            r0.A05(r1)
        L_0x0068:
            java.lang.Object r8 = r3.A0T
            monitor-enter(r8)
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger     // Catch:{ all -> 0x026a }
            r1.<init>()     // Catch:{ all -> 0x026a }
            X.3XB r0 = r3.A08     // Catch:{ all -> 0x026a }
            r0.A05(r1)     // Catch:{ all -> 0x026a }
            int r7 = r1.get()     // Catch:{ all -> 0x026a }
            boolean r0 = r2.A05     // Catch:{ all -> 0x026a }
            r6 = 1
            if (r0 == 0) goto L_0x0081
            r0 = 1
            if (r5 != 0) goto L_0x0082
        L_0x0081:
            r0 = 0
        L_0x0082:
            if (r7 <= 0) goto L_0x01c7
            if (r0 != 0) goto L_0x01c7
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x026a }
            java.lang.String r0 = "app/mediajobmanager/handleMediaUploadResponse/moving file mediaJob="
            X.C18260x0.A1P(r1, r0, r3)     // Catch:{ all -> 0x026a }
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x026a }
            java.lang.String r0 = "src:"
            r11.append(r0)     // Catch:{ all -> 0x026a }
            X.2zt r0 = r2.A01     // Catch:{ all -> 0x026a }
            X.2UD r1 = r0.A02     // Catch:{ all -> 0x026a }
            java.io.File r13 = r1.A07     // Catch:{ all -> 0x026a }
            X.C626936e.A06(r13)     // Catch:{ all -> 0x026a }
            java.lang.String r0 = A01(r13)     // Catch:{ all -> 0x026a }
            r11.append(r0)     // Catch:{ all -> 0x026a }
            java.lang.String r0 = "; matched:"
            r11.append(r0)     // Catch:{ all -> 0x026a }
            java.io.File r10 = r2.A03     // Catch:{ all -> 0x026a }
            java.lang.String r0 = A01(r10)     // Catch:{ all -> 0x026a }
            java.lang.String r16 = X.AnonymousClass000.A0X(r0, r11)     // Catch:{ all -> 0x026a }
            if (r10 == 0) goto L_0x00ce
            long r14 = r10.length()     // Catch:{ all -> 0x026a }
            X.C626936e.A06(r13)     // Catch:{ all -> 0x026a }
            long r11 = r13.length()     // Catch:{ all -> 0x026a }
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x00ce
            java.lang.String r0 = "mediajobmanager/handleMediaUploadResponse/upload dedup with wrong size"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x026a }
        L_0x00ce:
            X.2rq r14 = r4.A03     // Catch:{ all -> 0x026a }
            X.C626936e.A06(r13)     // Catch:{ all -> 0x026a }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x026a }
            if (r10 == 0) goto L_0x00f6
            boolean r0 = r10.exists()     // Catch:{ all -> 0x026a }
            if (r0 == 0) goto L_0x00f6
            X.2QG r0 = new X.2QG     // Catch:{ all -> 0x026a }
            r0.<init>(r10, r6)     // Catch:{ all -> 0x026a }
        L_0x00e4:
            android.util.Pair r11 = android.util.Pair.create(r11, r0)     // Catch:{ all -> 0x026a }
        L_0x00e8:
            java.lang.Object r10 = r11.second     // Catch:{ all -> 0x026a }
            X.2QG r10 = (X.AnonymousClass2QG) r10     // Catch:{ all -> 0x026a }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x026a }
            java.lang.String r0 = "; dest:"
            r1.append(r0)     // Catch:{ all -> 0x026a }
            goto L_0x0173
        L_0x00f6:
            r10 = 0
            X.3Dh r12 = r14.A00     // Catch:{ IOException -> 0x0162 }
            boolean r0 = r12.A0d(r13)     // Catch:{ IOException -> 0x0162 }
            if (r0 != 0) goto L_0x015c
            java.lang.String r15 = r13.getCanonicalPath()     // Catch:{ IOException -> 0x0162 }
            X.2UN r0 = r12.A08()     // Catch:{ IOException -> 0x0162 }
            java.io.File r0 = r0.A08     // Catch:{ IOException -> 0x0162 }
            boolean r0 = X.C18290x4.A1V(r0, r15)     // Catch:{ IOException -> 0x0162 }
            if (r0 != 0) goto L_0x015c
            X.38t r15 = r1.A06     // Catch:{ all -> 0x026a }
            int r1 = r1.A01     // Catch:{ all -> 0x026a }
            X.2y5 r0 = r14.A05     // Catch:{ all -> 0x026a }
            java.io.File r1 = X.C107655bf.A0P(r12, r0, r15, r13, r1)     // Catch:{ all -> 0x026a }
            boolean r0 = r12.A0e(r13)     // Catch:{ IOException -> 0x012e }
            if (r0 == 0) goto L_0x012e
            X.2Y6 r14 = r14.A03     // Catch:{ IOException -> 0x012e }
            java.lang.String r0 = r13.getAbsolutePath()     // Catch:{ IOException -> 0x012e }
            int r0 = r14.A00(r0)     // Catch:{ IOException -> 0x012e }
            int r0 = r0 + 1
            if (r0 != r7) goto L_0x012e
            goto L_0x0137
        L_0x012e:
            java.lang.String r0 = "ReferenceCountedFileManager/moveFile/copy"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ FileNotFoundException -> 0x0154, IOException -> 0x0149 }
            r12.A0a(r13, r1)     // Catch:{ FileNotFoundException -> 0x0154, IOException -> 0x0149 }
            goto L_0x013f
        L_0x0137:
            java.lang.String r0 = "ReferenceCountedFileManager/moveFile/rename"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ FileNotFoundException -> 0x0154, IOException -> 0x0149 }
            r12.A0b(r13, r1)     // Catch:{ FileNotFoundException -> 0x0154, IOException -> 0x0149 }
        L_0x013f:
            X.2QG r0 = new X.2QG     // Catch:{ FileNotFoundException -> 0x0154, IOException -> 0x0149 }
            r0.<init>(r1, r9)     // Catch:{ FileNotFoundException -> 0x0154, IOException -> 0x0149 }
            android.util.Pair r11 = android.util.Pair.create(r11, r0)     // Catch:{ FileNotFoundException -> 0x0154, IOException -> 0x0149 }
            goto L_0x00e8
        L_0x0149:
            r1 = move-exception
            java.lang.String r0 = "ReferenceCountedFileManager/moveFile/copy-failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x026a }
            android.util.Pair r11 = android.util.Pair.create(r11, r10)     // Catch:{ all -> 0x026a }
            goto L_0x00e8
        L_0x0154:
            r1 = move-exception
            java.lang.String r0 = "ReferenceCountedFileManager/moveFile/file-not-found"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x026a }
            r0 = 7
            goto L_0x0169
        L_0x015c:
            X.2QG r0 = new X.2QG     // Catch:{ all -> 0x026a }
            r0.<init>(r13, r9)     // Catch:{ all -> 0x026a }
            goto L_0x00e4
        L_0x0162:
            r1 = move-exception
            java.lang.String r0 = "ReferenceCountedFileManager/moveFile/inmediafolder/ "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x026a }
            r0 = 3
        L_0x0169:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x026a }
            android.util.Pair r11 = android.util.Pair.create(r0, r10)     // Catch:{ all -> 0x026a }
            goto L_0x00e8
        L_0x0173:
            if (r10 == 0) goto L_0x0176
            goto L_0x0178
        L_0x0176:
            r0 = 0
            goto L_0x017a
        L_0x0178:
            java.io.File r0 = r10.A01     // Catch:{ all -> 0x026a }
        L_0x017a:
            java.lang.String r0 = A01(r0)     // Catch:{ all -> 0x026a }
            java.lang.String r12 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x026a }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x026a }
            java.lang.String r0 = "app/mediajobmanager/handleMediaUploadResponse/moved "
            r1.append(r0)     // Catch:{ all -> 0x026a }
            r0 = r16
            X.C18260x0.A0q(r0, r12, r1)     // Catch:{ all -> 0x026a }
            java.lang.Object r0 = r11.first     // Catch:{ all -> 0x026a }
            int r0 = X.AnonymousClass0x7.A05(r0)     // Catch:{ all -> 0x026a }
            if (r0 == 0) goto L_0x01a9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x026a }
            java.lang.String r0 = "app/mediajobmanager/handleMediaUploadResponse/failed to move file; mediaJob="
            X.C18260x0.A1Q(r1, r0, r3)     // Catch:{ all -> 0x026a }
            if (r5 != 0) goto L_0x01a9
            java.lang.Object r0 = r11.first     // Catch:{ all -> 0x026a }
            int r5 = X.AnonymousClass0x7.A05(r0)     // Catch:{ all -> 0x026a }
        L_0x01a9:
            if (r10 == 0) goto L_0x01c7
            java.util.concurrent.atomic.AtomicInteger r1 = r10.A03     // Catch:{ all -> 0x026a }
            int r0 = r1.get()     // Catch:{ all -> 0x026a }
            boolean r0 = X.AnonymousClass000.A1T(r0)
            X.C626936e.A0C(r0)     // Catch:{ all -> 0x026a }
            X.3XB r0 = r3.A09     // Catch:{ all -> 0x026a }
            r0.A05(r10)     // Catch:{ all -> 0x026a }
            int r0 = r1.get()     // Catch:{ all -> 0x026a }
            if (r0 != r7) goto L_0x01c4
            r9 = 1
        L_0x01c4:
            X.C626936e.A0C(r9)     // Catch:{ all -> 0x026a }
        L_0x01c7:
            monitor-exit(r8)     // Catch:{ all -> 0x026a }
            if (r5 != 0) goto L_0x0225
            X.2zt r0 = r2.A01
            X.2UD r1 = r0.A02
            boolean r0 = r1.A0E
            if (r0 == 0) goto L_0x0225
            X.38t r0 = r1.A06
            boolean r0 = X.AnonymousClass36O.A05(r0)
            if (r0 != 0) goto L_0x0217
            X.2sV r7 = r2.A02
            java.lang.String r0 = r7.A07()
            java.net.URL r1 = X.C18330xA.A0B(r0)     // Catch:{ MalformedURLException -> 0x01fa }
            java.lang.String r0 = r1.getHost()     // Catch:{ MalformedURLException -> 0x01fa }
            if (r0 == 0) goto L_0x01f4
            java.lang.String r0 = r1.getHost()     // Catch:{ MalformedURLException -> 0x01fa }
            int r0 = r0.length()     // Catch:{ MalformedURLException -> 0x01fa }
            if (r0 != 0) goto L_0x0217
        L_0x01f4:
            java.lang.String r0 = "mediaupload/url/no-host"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x01fa }
            goto L_0x0200
        L_0x01fa:
            r1 = move-exception
            java.lang.String r0 = "mediaupload/url/error "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0200:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/mediajobmanager/handleMediaUploadResponse/url/error; url="
            r1.append(r0)
            java.lang.String r0 = r7.A07()
            r1.append(r0)
            java.lang.String r0 = "; mediaJob="
            X.C18260x0.A1S(r1, r0, r3)
            r5 = 19
        L_0x0217:
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x0225
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/mediajobmanager/handleMediaUploadResponse/results not received; mediaJob="
            X.C18260x0.A1S(r1, r0, r3)
            r5 = 3
        L_0x0225:
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x0232
            boolean r0 = r3.A06()
            if (r0 == 0) goto L_0x0231
            r6 = 32
        L_0x0231:
            r5 = r6
        L_0x0232:
            r0 = 28
            if (r5 != r0) goto L_0x0241
            X.2zJ r1 = r4.A05
            X.2zt r0 = r2.A01
            X.2UL r0 = r0.A04
            java.lang.String r0 = r0.A0L
            r1.A01(r0)
        L_0x0241:
            r3.A00 = r5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/mediajobmanager/handleMediaUploadResponse mediaJob="
            X.C18260x0.A1P(r1, r0, r3)
            if (r5 != 0) goto L_0x0260
            byte[] r0 = r3.A04
            if (r0 == 0) goto L_0x0260
            r0 = 5
            X.92X r2 = new X.92X
            r2.<init>(r3, r0)
            java.util.concurrent.Executor r1 = r4.A0O
            X.3XB r0 = r3.A0G
            r0.A04(r2, r1)
            return
        L_0x0260:
            X.3XB r1 = r3.A0B
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.A05(r0)
            return
        L_0x026a:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x026a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C620033c.A0D(X.3QO, X.7Oi):void");
    }

    public boolean A0H(C633138t r4, int[] iArr, boolean z) {
        AnonymousClass1VX r2 = this.A06;
        C58422vE r1 = C58422vE.A02;
        if (r2.A0Y(r1, 247) && r4 == C633138t.A09) {
            return true;
        }
        if (!r2.A0Y(r1, 246)) {
            return false;
        }
        if (((r4 != C633138t.A0C || (iArr != null && iArr.length >= 2)) && r4 != C633138t.A0g && r4 != C633138t.A04) || !z) {
            return false;
        }
        return true;
    }

    public C620033c(C55682qk r3, C64393Dh r4, C69263Wi r5, C56352rq r6, C29441ip r7, C60872zJ r8, AnonymousClass1VX r9, AnonymousClass4FV r10, C48092eK r11, C55972rD r12, C55812qx r13, C55572qZ r14, C49592gm r15, C50112he r16, C46042az r17, C55852r1 r18, C162287rd r19, C28121fj r20, C55732qp r21, C107105ah r22, C617832f r23, AnonymousClass306 r24, C107085af r25, AnonymousClass4FS r26) {
        this.A06 = r9;
        this.A02 = r5;
        this.A00 = r3;
        this.A0N = r26;
        this.A01 = r4;
        this.A07 = r10;
        this.A0F = r18;
        this.A09 = r12;
        this.A05 = r8;
        this.A0J = r22;
        this.A0G = r19;
        this.A0M = r25;
        this.A0I = r21;
        this.A0K = r23;
        this.A0H = r20;
        this.A0A = r13;
        this.A0B = r14;
        this.A0D = r16;
        this.A0C = r15;
        this.A0L = r24;
        this.A04 = r7;
        this.A03 = r6;
        this.A08 = r11;
        Objects.requireNonNull(r5);
        this.A0O = new C86044Ip(r5, 2);
        this.A0E = r17;
    }

    public void A08(AnonymousClass3QO r4) {
        C149897Oi A022 = r4.A02();
        if (A022 != null) {
            C18260x0.A1P(AnonymousClass001.A0o(), "app/mediajobmanager/continueMediaJob found upload response for jobId=", r4);
            A0D(r4, A022);
            return;
        }
        AnonymousClass7N0 r2 = (AnonymousClass7N0) r4.A0F.A01();
        if (r2 != null) {
            C18260x0.A1P(AnonymousClass001.A0o(), "app/mediajobmanager/continueMediaJob found transcoding response for jobId=", r4);
            A0C(r4, r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        if (r7 != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a3, code lost:
        if (r6 == null) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(X.AnonymousClass3QO r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/mediajobmanager/enqueuemediaupload "
            X.C18260x0.A0s(r0, r11, r1)
            X.2dV r4 = r10.A01()
            X.38t r5 = r4.A05
            boolean r8 = r4.A0J
            boolean r7 = r4.A0C
            java.io.File r6 = r4.A07
            if (r8 == 0) goto L_0x0036
            X.7rd r0 = r9.A0G
            boolean r0 = r0.A0G(r5, r6)
            if (r0 != 0) goto L_0x0036
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/mediajobmanager/enqueuemediaupload we cannot transcode media that needs transcoding "
            X.C18260x0.A0r(r0, r11, r1)
            r0 = 34
        L_0x002a:
            r10.A00 = r0
            X.3XB r1 = r10.A0B
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A05(r0)
            return
        L_0x0036:
            X.38t r3 = X.C633138t.A09
            if (r5 != r3) goto L_0x004f
            java.lang.String r0 = r4.A0A
            byte r1 = X.C107655bf.A0A(r0)
            r0 = -1
            if (r1 != r0) goto L_0x004f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/mediajobmanager/enqueuemediaupload we are unable to determine the mimetype of this document "
            X.C18260x0.A0r(r0, r11, r1)
            r0 = 35
            goto L_0x002a
        L_0x004f:
            X.3XB r0 = r10.A0F
            java.lang.Object r0 = r0.A01()
            java.lang.String r2 = " "
            if (r0 == 0) goto L_0x005d
            r9.A08(r10)
            return
        L_0x005d:
            if (r8 != 0) goto L_0x008c
            boolean r0 = X.AnonymousClass36O.A09(r5)
            if (r0 != 0) goto L_0x008c
            X.7rd r0 = r9.A0G
            boolean r0 = r0.A0H(r5, r6)
            if (r0 != 0) goto L_0x008c
            if (r7 == 0) goto L_0x00a3
            if (r6 != 0) goto L_0x00a6
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/mediajobmanager queuing media into upload queue with null file, media_type="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "; media_name="
            r1.append(r0)
            java.lang.String r0 = r4.A0B
            r1.append(r0)
            X.C18260x0.A0r(r2, r11, r1)
            r0 = 7
            goto L_0x002a
        L_0x008c:
            if (r7 == 0) goto L_0x00a3
        L_0x008e:
            X.2dV r1 = r10.A01()
            X.2he r0 = r9.A0D
            X.7PV r2 = r0.A00(r10, r1)
            X.33a r1 = r10.A0M
            X.7kZ r0 = r2.A00
            r1.A0A(r0)
            r9.A0B(r10, r2)
            return
        L_0x00a3:
            if (r6 != 0) goto L_0x00a6
            goto L_0x008e
        L_0x00a6:
            if (r5 != r3) goto L_0x00be
            java.lang.String r0 = r4.A0A
            boolean r0 = X.C989053r.A08(r0)
            if (r0 == 0) goto L_0x00be
            X.2dV r1 = r10.A01()
            X.2he r0 = r9.A0D
            X.7PV r0 = r0.A00(r10, r1)
            r9.A0B(r10, r0)
            return
        L_0x00be:
            boolean r0 = r10.A05()
            X.2UD r1 = r10.A00()
            if (r0 == 0) goto L_0x00d1
            X.6kb r0 = new X.6kb
            r0.<init>(r10, r1)
        L_0x00cd:
            r9.A0A(r10, r0)
            return
        L_0x00d1:
            X.2zt r0 = new X.2zt
            r0.<init>(r10, r1)
            goto L_0x00cd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C620033c.A0E(X.3QO, java.lang.String):void");
    }

    public void A0G(AnonymousClass65N r3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MediaJobManager/cancelLinkThumbnailJob ");
        C18260x0.A1J(A0o, r3.B8u());
        this.A0H.A06(r3);
    }
}
