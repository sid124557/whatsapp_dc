package X;

import android.os.Looper;
import android.util.LruCache;
import com.facebook.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: X.80z  reason: invalid class name and case insensitive filesystem */
public class C1674180z implements C185208tG {
    public Looper A00;
    public C146617Ay A01;
    public final C1463679z A02;
    public final C160797oK A03;
    public final AnonymousClass7NZ A04;
    public final List A05;
    public final List A06;
    public final UUID A07;
    public final int[] A08;
    public volatile C124666Dk A09;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r1 == r13) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C184698sN AwH(android.os.Looper r13, X.C166657z3 r14) {
        /*
            r12 = this;
            r6 = r12
            android.os.Looper r1 = r12.A00
            r2 = 0
            r4 = r13
            if (r1 == 0) goto L_0x000a
            r0 = 0
            if (r1 != r13) goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            X.C159197lM.A02(r0)
            java.util.List r1 = r12.A06
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0023
            r12.A00 = r13
            X.6Dk r0 = r12.A09
            if (r0 != 0) goto L_0x0023
            X.6Dk r0 = new X.6Dk
            r0.<init>(r13, r12)
            r12.A09 = r0
        L_0x0023:
            java.util.UUID r10 = r12.A07
            X.7yl r0 = A00(r14, r10, r2)
            if (r0 != 0) goto L_0x0055
            X.6yL r2 = new X.6yL
            r2.<init>(r10)
            X.79z r0 = r12.A02
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0048
            r1.next()
            java.lang.String r0 = "listener"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0048:
            r0 = 6003(0x1773, float:8.412E-42)
            X.6tt r1 = new X.6tt
            r1.<init>(r2, r0)
            X.80x r0 = new X.80x
            r0.<init>(r1)
            return r0
        L_0x0055:
            byte[] r11 = r0.A04
            java.lang.String r9 = r0.A02
            int r3 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 26
            if (r3 >= r0) goto L_0x0079
            java.util.UUID r0 = X.C155567f7.A00
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0079
            java.lang.String r0 = "video/mp4"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0077
            java.lang.String r0 = "audio/mp4"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0079
        L_0x0077:
            java.lang.String r9 = "cenc"
        L_0x0079:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0087
            java.lang.Object r3 = r1.get(r2)
            X.80y r3 = (X.C1674080y) r3
            if (r3 != 0) goto L_0x0095
        L_0x0087:
            X.7oK r7 = r12.A03
            X.7NZ r8 = r12.A04
            X.79z r5 = r12.A02
            X.80y r3 = new X.80y
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r1.add(r3)
        L_0x0095:
            int r0 = r3.A00
            r1 = 1
            int r0 = r0 + 1
            r3.A00 = r0
            if (r0 != r1) goto L_0x00ab
            int r0 = r3.A01
            if (r0 == r1) goto L_0x00ab
            boolean r0 = r3.A03(r1)
            if (r0 == 0) goto L_0x00ab
            r3.A02(r1)
        L_0x00ab:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1674180z.AwH(android.os.Looper, X.7z3):X.8sN");
    }

    public static C166487yl A00(C166657z3 r8, UUID uuid, boolean z) {
        int i;
        C148537It A002;
        int i2 = r8.A01;
        ArrayList A0I = AnonymousClass002.A0I(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            C166487yl r1 = r8.A03[i3];
            if ((r1.A00(uuid) || (C155567f7.A00.equals(uuid) && r1.A00(C155567f7.A01))) && (r1.A04 != null || z)) {
                A0I.add(r1);
            }
        }
        if (A0I.isEmpty()) {
            return null;
        }
        if (C155567f7.A04.equals(uuid)) {
            for (int i4 = 0; i4 < A0I.size(); i4++) {
                C166487yl r3 = (C166487yl) A0I.get(i4);
                if (r3.A04 == null || (A002 = AnonymousClass70z.A00(r3.A04)) == null) {
                    i = -1;
                } else {
                    i = A002.A00;
                }
                if (Util.A00 < 23) {
                    if (i == 0) {
                        return r3;
                    }
                } else if (i == 1) {
                    return r3;
                }
            }
        }
        return (C166487yl) A0I.get(0);
    }

    public void A01(C1674080y r5) {
        List list = this.A05;
        list.add(r5);
        if (list.size() == 1) {
            r5.A03.obtainMessage(0, 1, 0, r5.A0B.A03()).sendToTarget();
        }
    }

    public void Biw(C184698sN r7) {
        if (!(r7 instanceof C1673980x)) {
            C1674080y r4 = (C1674080y) r7;
            int i = r4.A00 - 1;
            r4.A00 = i;
            if (i == 0) {
                r4.A01 = 0;
                r4.A08.removeCallbacksAndMessages((Object) null);
                r4.A03.removeCallbacksAndMessages((Object) null);
                r4.A03 = null;
                r4.A02.quit();
                r4.A02 = null;
                r4.A05 = null;
                r4.A04 = null;
                byte[] bArr = r4.A07;
                if (bArr != null) {
                    r4.A0B.A08(bArr);
                    r4.A07 = null;
                }
                this.A06.remove(r4);
                List list = this.A05;
                if (list.size() > 1 && C18290x4.A0k(list) == r4) {
                    C1674080y r1 = (C1674080y) list.get(1);
                    r1.A03.obtainMessage(0, 1, 0, r1.A0B.A03()).sendToTarget();
                }
                list.remove(r4);
            }
            if (this.A01 != null) {
                C159977mn A002 = C159977mn.A00();
                synchronized (A002) {
                    LruCache lruCache = A002.A00;
                    if (lruCache != null) {
                        Iterator A0i = C18280x3.A0i(lruCache.snapshot());
                        while (true) {
                            if (!A0i.hasNext()) {
                                break;
                            }
                            C166487yl r12 = (C166487yl) A0i.next();
                            if (A002.A00.get(r12) == r7) {
                                if (r12 != null) {
                                    A002.A00.remove(r12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public C1674180z(C160797oK r3, AnonymousClass7NZ r4, UUID uuid, int[] iArr) {
        if (!C155567f7.A01.equals(uuid)) {
            this.A07 = uuid;
            this.A03 = r3;
            this.A04 = r4;
            this.A02 = new C1463679z();
            this.A08 = iArr;
            this.A06 = AnonymousClass001.A0s();
            this.A05 = AnonymousClass001.A0s();
            r3.A07(new AnonymousClass7A0(this));
            return;
        }
        throw AnonymousClass6C7.A0U("Use C.CLEARKEY_UUID instead");
    }
}
