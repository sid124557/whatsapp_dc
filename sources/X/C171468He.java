package X;

import android.database.ContentObserver;
import android.util.SparseArray;
import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.8He  reason: invalid class name and case insensitive filesystem */
public class C171468He implements C1229866p {
    public int A00;
    public int A01;
    public C86684Lb A02;
    public C86684Lb A03;
    public C138226py A04;
    public C138196pv A05;
    public C138196pv A06;
    public Runnable A07;
    public boolean A08;
    public boolean A09;
    public final ContentObserver A0A = new C188688zK(this);
    public final SparseArray A0B;
    public final AnonymousClass319 A0C;
    public final AnonymousClass1VX A0D;
    public final C95814uZ A0E;
    public final MediaViewFragment A0F;
    public final C30471mV A0G;
    public final C55832qz A0H;
    public final AnonymousClass4FS A0I;

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C30471mV B9Y(int r16) {
        /*
            r15 = this;
            r9 = r15
            int r1 = r15.A00
            int r0 = r16 - r1
            android.util.SparseArray r2 = r15.A0B
            java.lang.Object r6 = r2.get(r0)
            X.1mV r6 = (X.C30471mV) r6
            if (r6 != 0) goto L_0x0020
            r1 = 0
            java.lang.String r5 = " pos:"
            java.lang.String r7 = " is not less than isHead cursor count "
            r6 = 0
            if (r0 >= 0) goto L_0x003e
            X.4Lb r8 = r15.A02
            if (r8 != 0) goto L_0x0021
            java.lang.String r0 = "MediaMessagesNavigator/navigator/ no isHead cursor"
        L_0x001d:
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0020:
            return r6
        L_0x0021:
            int r3 = -r0
            int r4 = r3 + -1
            int r3 = r8.getCount()
            if (r4 < r3) goto L_0x00ca
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaMessagesNavigator/navigator/ isHead pos "
            X.C18270x1.A19(r0, r7, r1, r4)
            X.4Lb r0 = r15.A02
            int r0 = r0.getCount()
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            goto L_0x001d
        L_0x003e:
            if (r0 != 0) goto L_0x0044
            X.1mV r6 = r15.A0G
            goto L_0x012f
        L_0x0044:
            X.4Lb r3 = r15.A03
            if (r3 != 0) goto L_0x004b
            java.lang.String r0 = "MediaMessagesNavigator/navigator/ no tail cursor"
            goto L_0x001d
        L_0x004b:
            int r4 = r0 + -1
            int r3 = r3.getCount()
            if (r4 < r3) goto L_0x0067
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaMessagesNavigator/navigator/ tail pos "
            X.C18270x1.A19(r0, r7, r1, r4)
            X.4Lb r0 = r15.A03
            int r0 = r0.getCount()
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            goto L_0x001d
        L_0x0067:
            X.4Lb r3 = r15.A03
            boolean r3 = r3.moveToPosition(r4)
            if (r3 == 0) goto L_0x0139
            boolean r3 = r15.A09
            if (r3 != 0) goto L_0x00c7
            X.6pv r3 = r15.A06
            if (r3 != 0) goto L_0x00c7
            X.4Lb r3 = r15.A03
            int r4 = r3.getPosition()
            X.4Lb r3 = r15.A03
            int r3 = r3.getCount()
            int r3 = r3 / 2
            if (r4 <= r3) goto L_0x00c7
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "MediaMessagesNavigator/navigator/ start upgrade tail cursor count:"
            r4.append(r3)
            X.4Lb r3 = r15.A03
            int r3 = r3.getCount()
            r4.append(r3)
            r4.append(r5)
            X.4Lb r3 = r15.A03
            int r3 = r3.getPosition()
            X.C18260x0.A1G(r4, r3)
            X.1VX r7 = r15.A0D
            X.2qz r10 = r15.A0H
            X.319 r6 = r15.A0C
            X.4uZ r8 = r15.A0E
            X.1mV r3 = r15.A0G
            long r3 = r3.A1L
            X.4Lb r5 = r15.A03
            int r11 = r5.getPosition()
            X.6pv r5 = new X.6pv
            r12 = r3
            r14 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r14)
            r15.A06 = r5
            X.4FS r3 = r15.A0I
            java.lang.Void[] r1 = new java.lang.Void[r1]
            r3.BkL(r5, r1)
        L_0x00c7:
            X.4Lb r1 = r15.A03
            goto L_0x012b
        L_0x00ca:
            X.4Lb r3 = r15.A02
            boolean r3 = r3.moveToPosition(r4)
            if (r3 == 0) goto L_0x0135
            boolean r3 = r15.A08
            if (r3 != 0) goto L_0x0129
            X.6pv r3 = r15.A05
            if (r3 != 0) goto L_0x0129
            X.4Lb r3 = r15.A02
            int r4 = r3.getPosition()
            X.4Lb r3 = r15.A02
            int r3 = r3.getCount()
            int r3 = r3 / 2
            if (r4 <= r3) goto L_0x0129
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "MediaMessagesNavigator/navigator/ start upgrade head cursor count:"
            r4.append(r3)
            X.4Lb r3 = r15.A02
            int r3 = r3.getCount()
            r4.append(r3)
            r4.append(r5)
            X.4Lb r3 = r15.A02
            int r3 = r3.getPosition()
            X.C18260x0.A1G(r4, r3)
            X.1VX r7 = r15.A0D
            X.2qz r10 = r15.A0H
            X.319 r6 = r15.A0C
            X.4uZ r8 = r15.A0E
            X.1mV r3 = r15.A0G
            long r12 = r3.A1L
            r14 = 1
            X.4Lb r3 = r15.A02
            int r11 = r3.getPosition()
            X.6pv r5 = new X.6pv
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r14)
            r15.A05 = r5
            X.4FS r3 = r15.A0I
            java.lang.Void[] r1 = new java.lang.Void[r1]
            r3.BkL(r5, r1)
        L_0x0129:
            X.4Lb r1 = r15.A02
        L_0x012b:
            X.1mV r6 = r1.A00()
        L_0x012f:
            if (r6 == 0) goto L_0x0020
            r2.put(r0, r6)
            return r6
        L_0x0135:
            java.lang.String r0 = "MediaMessagesNavigator/navigator/ no message at isHead cursor"
            goto L_0x001d
        L_0x0139:
            java.lang.String r0 = "MediaMessagesNavigator/navigator/ no message at tail cursor"
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C171468He.B9Y(int):X.1mV");
    }

    public int BBZ(AnonymousClass2z0 r6) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A0B;
            if (i < sparseArray.size()) {
                int keyAt = sparseArray.keyAt(i);
                if (r6.equals(((C624134x) sparseArray.get(keyAt)).A1J)) {
                    StringBuilder A0l = AnonymousClass000.A0l("MediaMessagesNavigator/navigator/getItemPosition/ ");
                    A0l.append(r6.A01);
                    AnonymousClass001.A1L(A0l);
                    C18260x0.A1F(A0l, this.A00 + keyAt);
                    return this.A00 + keyAt;
                }
                i++;
            } else {
                StringBuilder A0l2 = AnonymousClass000.A0l("MediaMessagesNavigator/navigator/getItemPosition/ ");
                A0l2.append(r6.A01);
                C18260x0.A1J(A0l2, " none");
                return -2;
            }
        }
    }

    public void Bpf() {
        AnonymousClass1VX r3 = this.A0D;
        C95814uZ r4 = this.A0E;
        C30471mV r6 = this.A0G;
        C55832qz r7 = this.A0H;
        C138226py r1 = new C138226py(this.A0C, r3, r4, this, r6, r7);
        this.A04 = r1;
        C18270x1.A0w(r1, this.A0I);
    }

    public void BWs() {
    }

    public void Bm9(Runnable runnable) {
        this.A07 = runnable;
    }

    public void BqB() {
        C138226py r0 = this.A04;
        if (r0 != null && !C18320x8.A1T(r0)) {
            this.A04.A0D(true);
        }
    }

    public void Brd(int i) {
    }

    public int getCount() {
        return this.A00 + 1 + this.A01;
    }

    public C171468He(AnonymousClass319 r3, AnonymousClass1VX r4, C95814uZ r5, MediaViewFragment mediaViewFragment, C30471mV r7, C55832qz r8, AnonymousClass4FS r9) {
        SparseArray A0I2 = AnonymousClass6CA.A0I();
        this.A0B = A0I2;
        this.A0D = r4;
        this.A0F = mediaViewFragment;
        this.A0G = r7;
        this.A0I = r9;
        this.A0E = r5;
        this.A0H = r8;
        this.A0C = r3;
        A0I2.put(0, r7);
    }

    public void close() {
        BqB();
        C86684Lb r0 = this.A02;
        if (r0 != null) {
            r0.close();
        }
        this.A02 = null;
        C86684Lb r02 = this.A03;
        if (r02 != null) {
            r02.close();
        }
        this.A03 = null;
        C138196pv r03 = this.A05;
        if (r03 != null) {
            r03.A0D(true);
        }
        this.A05 = null;
        C138196pv r04 = this.A06;
        if (r04 != null) {
            r04.A0D(true);
        }
        this.A06 = null;
        this.A08 = false;
        this.A09 = false;
        this.A00 = 0;
        this.A01 = 0;
        this.A0B.clear();
    }
}
