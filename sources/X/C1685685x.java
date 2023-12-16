package X;

import android.os.Looper;
import android.util.SparseArray;
import android.view.Surface;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.exoplayer2.Timeline;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.85x  reason: invalid class name and case insensitive filesystem */
public class C1685685x implements C186488vR, C186238uy, C186248uz, AnonymousClass4F1, C178068gu, C178258hF {
    public C186498vS A00;
    public C152647Zr A01;
    public boolean A02;
    public final SparseArray A03;
    public final C153417bH A04;
    public final C158647kK A05;
    public final C158187jZ A06;
    public final C186668vk A07;

    public final void BYS(int i) {
        if (i == 1) {
            this.A02 = false;
        }
        C158187jZ r4 = this.A06;
        C186498vS r3 = this.A00;
        r3.getClass();
        C129586aY r2 = r4.A03;
        AnonymousClass6PS A022 = C158187jZ.A02(r3, r4.A05, r4.A01, r2);
        r4.A00 = A022;
        AnonymousClass7XD A012 = A01(A022);
        A03(A012, C1894991n.A00(A012, 12), 12);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        if (r9 != r1.A00.B6d()) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass7XD A00(com.google.android.exoplayer2.Timeline r20, X.AnonymousClass6PS r21, int r22) {
        /*
            r19 = this;
            r5 = r20
            r7 = r21
            int r0 = r5.A01()
            boolean r4 = X.AnonymousClass000.A1T(r0)
            if (r4 == 0) goto L_0x000f
            r7 = 0
        L_0x000f:
            long r11 = android.os.SystemClock.elapsedRealtime()
            r1 = r19
            X.8vS r0 = r1.A00
            com.google.android.exoplayer2.Timeline r0 = r0.B6b()
            boolean r0 = r5.equals(r0)
            r9 = r22
            if (r0 == 0) goto L_0x002c
            X.8vS r0 = r1.A00
            int r0 = r0.B6d()
            r3 = 1
            if (r9 == r0) goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            r13 = 0
            if (r7 == 0) goto L_0x0076
            int r2 = r7.A00
            r0 = -1
            boolean r0 = X.AnonymousClass001.A1X(r2, r0)
            if (r0 == 0) goto L_0x0076
            if (r3 == 0) goto L_0x0054
            X.8vS r0 = r1.A00
            int r0 = r0.B6L()
            if (r0 != r2) goto L_0x0054
            X.8vS r0 = r1.A00
            int r2 = r0.B6M()
            int r0 = r7.A01
            if (r2 != r0) goto L_0x0054
            X.8vS r0 = r1.A00
            long r13 = r0.B6W()
        L_0x0054:
            X.7jZ r0 = r1.A06
            X.6PS r8 = r0.A00
            X.8vS r0 = r1.A00
            com.google.android.exoplayer2.Timeline r6 = r0.B6b()
            X.8vS r0 = r1.A00
            int r10 = r0.B6d()
            X.8vS r0 = r1.A00
            long r15 = r0.B6W()
            X.8vS r0 = r1.A00
            long r17 = r0.BDn()
            X.7XD r4 = new X.7XD
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r13, r15, r17)
            return r4
        L_0x0076:
            if (r3 == 0) goto L_0x007f
            X.8vS r0 = r1.A00
            long r13 = r0.B5u()
            goto L_0x0054
        L_0x007f:
            if (r4 != 0) goto L_0x0054
            X.7kK r0 = r1.A05
            r5.A0B(r0, r9, r13)
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1685685x.A00(com.google.android.exoplayer2.Timeline, X.6PS, int):X.7XD");
    }

    public final AnonymousClass7XD A01(AnonymousClass6PS r5) {
        Timeline timeline;
        this.A00.getClass();
        if (r5 == null || (timeline = (Timeline) this.A06.A04.get(r5)) == null) {
            int B6d = this.A00.B6d();
            Timeline B6b = this.A00.B6b();
            if (B6d >= B6b.A01()) {
                B6b = Timeline.A00;
            }
            return A00(B6b, (AnonymousClass6PS) null, B6d);
        }
        return A00(timeline, r5, C153417bH.A00(this.A04, timeline, r5.A04));
    }

    public final AnonymousClass7XD A02(AnonymousClass6PS r3, int i) {
        this.A00.getClass();
        if (r3 == null) {
            Timeline B6b = this.A00.B6b();
            if (i >= B6b.A01()) {
                B6b = Timeline.A00;
            }
            return A00(B6b, (AnonymousClass6PS) null, i);
        } else if (this.A06.A04.get(r3) != null) {
            return A01(r3);
        } else {
            return A00(Timeline.A00, r3, i);
        }
    }

    public final void A03(AnonymousClass7XD r2, C835148s r3, int i) {
        this.A03.put(i, r2);
        C152647Zr r0 = this.A01;
        r0.A02(r3, i);
        r0.A00();
    }

    public final void BMo(C150277Pz r4) {
        AnonymousClass7XD A012 = A01(this.A06.A01);
        A03(A012, new C1895291q(r4, 12, A012), 1014);
    }

    public final void BRh(int i, long j) {
        AnonymousClass7XD A012 = A01(this.A06.A01);
        A03(A012, C1894991n.A00(A012, 29), 1023);
    }

    public /* synthetic */ void BSZ(boolean z) {
    }

    public final void BYK(C143886zd r4) {
        AnonymousClass6PS r0;
        C158567kB r1 = r4.mediaPeriodId;
        if (r1 != null) {
            r0 = new AnonymousClass6PS(r1);
        } else {
            r0 = this.A06.A00;
        }
        AnonymousClass7XD A012 = A01(r0);
        A03(A012, new C1895291q(r4, 4, A012), 11);
    }

    public final void Be5(Timeline timeline, int i) {
        C158187jZ r4 = this.A06;
        C186498vS r3 = this.A00;
        r3.getClass();
        C129586aY r2 = r4.A03;
        r4.A00 = C158187jZ.A02(r3, r4.A05, r4.A01, r2);
        r4.A03(r3.B6b());
        AnonymousClass7XD A012 = A01(r4.A00);
        A03(A012, C1894991n.A00(A012, 11), 0);
    }

    public final void BfJ(C150277Pz r4) {
        AnonymousClass7XD A012 = A01(this.A06.A01);
        A03(A012, new C1895291q(r4, 7, A012), 1025);
    }

    public final void BfM(long j, int i) {
        AnonymousClass7XD A012 = A01(this.A06.A01);
        A03(A012, C1894991n.A00(A012, 13), 1026);
    }

    public C1685685x(C186668vk r7) {
        C186668vk r2 = r7;
        this.A07 = r7;
        Looper myLooper = Looper.myLooper();
        this.A01 = new C152647Zr(myLooper == null ? Looper.getMainLooper() : myLooper, r2, new C1692488o(), new C1450573z(5), new CopyOnWriteArraySet());
        C153417bH r1 = new C153417bH();
        this.A04 = r1;
        this.A05 = new C158647kK();
        this.A06 = new C158187jZ(r1);
        this.A03 = AnonymousClass6CA.A0I();
    }

    public final void BMm(long j, String str, long j2) {
        AnonymousClass7XD A002 = C158187jZ.A00(this);
        A03(A002, C1894991n.A00(A002, 17), 1009);
    }

    public final void BMn(String str) {
        AnonymousClass7XD A002 = C158187jZ.A00(this);
        A03(A002, C1894991n.A00(A002, 20), 1013);
    }

    public final void BMp(C150277Pz r4) {
        AnonymousClass7XD A002 = C158187jZ.A00(this);
        A03(A002, new C1895291q(r4, 3, A002), 1008);
    }

    public final void BMq(C166527yp r4, C151887Wr r5) {
        AnonymousClass7XD A002 = C158187jZ.A00(this);
        A03(A002, new C1895191p(r4, A002, r5, 1), 1010);
    }

    public final void BMs(long j) {
        AnonymousClass7XD A002 = C158187jZ.A00(this);
        A03(A002, C1894991n.A00(A002, 27), 1011);
    }

    public final void BMt(Exception exc) {
        AnonymousClass7XD A002 = C158187jZ.A00(this);
        A03(A002, new C1895291q(exc, 10, A002), 1018);
    }

    public final void BMu(int i, long j, long j2) {
        AnonymousClass7XD A002 = C158187jZ.A00(this);
        A03(A002, C1894991n.A00(A002, 25), 1012);
    }

    public final void BRc(AnonymousClass7P1 r4, AnonymousClass6PS r5, int i) {
        AnonymousClass7XD A022 = A02(r5, i);
        A03(A022, new C1895291q(r4, 13, A022), 1004);
    }

    public final void BUm(boolean z) {
        AnonymousClass7XD A012 = C158187jZ.A01(this);
        A03(A012, C1894991n.A00(A012, 23), 4);
    }

    public void BUn(boolean z) {
        AnonymousClass7XD A012 = C158187jZ.A01(this);
        A03(A012, C1894991n.A00(A012, 26), 8);
    }

    public final void BVJ(C156527gm r4, AnonymousClass7P1 r5, AnonymousClass6PS r6, int i) {
        AnonymousClass7XD A022 = A02(r6, i);
        A03(A022, new C1895191p(r4, A022, r5, 4), 1002);
    }

    public final void BVN(C156527gm r4, AnonymousClass7P1 r5, AnonymousClass6PS r6, int i) {
        AnonymousClass7XD A022 = A02(r6, i);
        A03(A022, new C1895191p(r4, A022, r5, 3), 1001);
    }

    public final void BVS(C156527gm r4, AnonymousClass7P1 r5, AnonymousClass6PS r6, IOException iOException, int i, boolean z) {
        AnonymousClass7XD A022 = A02(r6, i);
        A03(A022, new C1692388n(A022, r4, r5, iOException), 1003);
    }

    public final void BVa(C156527gm r4, AnonymousClass7P1 r5, AnonymousClass6PS r6, int i) {
        AnonymousClass7XD A022 = A02(r6, i);
        A03(A022, new C1895191p(r4, A022, r5, 2), 1000);
    }

    public final void BW7(C151877Wq r4, int i) {
        AnonymousClass7XD A012 = C158187jZ.A01(this);
        A03(A012, new C1895291q(r4, 6, A012), 1);
    }

    public final void BYA(boolean z, int i) {
        AnonymousClass7XD A012 = C158187jZ.A01(this);
        A03(A012, C1894991n.A00(A012, 30), 6);
    }

    public final void BYE(C158477k2 r4) {
        AnonymousClass7XD A012 = C158187jZ.A01(this);
        A03(A012, new C1895291q(r4, 8, A012), 13);
    }

    public final void BYI(int i) {
        AnonymousClass7XD A012 = C158187jZ.A01(this);
        A03(A012, C1894991n.A00(A012, 24), 5);
    }

    public final void BYJ(int i) {
        AnonymousClass7XD A012 = C158187jZ.A01(this);
        A03(A012, C1894991n.A00(A012, 16), 7);
    }

    public final void BYM(boolean z, int i) {
        AnonymousClass7XD A012 = C158187jZ.A01(this);
        A03(A012, C1894991n.A00(A012, 31), -1);
    }

    public final void BZt(Surface surface) {
        AnonymousClass7XD A002 = C158187jZ.A00(this);
        A03(A002, new C1895291q(surface, 1, A002), 1027);
    }

    public final void Bb4() {
        AnonymousClass7XD A012 = C158187jZ.A01(this);
        A03(A012, C1894991n.A00(A012, 10), -1);
    }

    public final void Bbk(boolean z) {
        AnonymousClass7XD A002 = C158187jZ.A00(this);
        A03(A002, C1894991n.A00(A002, 14), 1017);
    }

    public final void BcO(List list) {
        AnonymousClass7XD A012 = C158187jZ.A01(this);
        A03(A012, new C1895291q(list, 5, A012), 3);
    }

    public final void BeS(C166387yb r4, C151537Ve r5) {
        AnonymousClass7XD A012 = C158187jZ.A01(this);
        A03(A012, new C1895191p(r4, A012, r5, 5), 2);
    }

    public final void BfH(long j, String str, long j2) {
        AnonymousClass7XD A002 = C158187jZ.A00(this);
        A03(A002, C1894991n.A00(A002, 28), 1021);
    }

    public final void BfI(String str) {
        AnonymousClass7XD A002 = C158187jZ.A00(this);
        A03(A002, C1894991n.A00(A002, 32), EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
    }

    public final void BfK(C150277Pz r4) {
        AnonymousClass7XD A002 = C158187jZ.A00(this);
        A03(A002, new C1895291q(r4, 11, A002), 1020);
    }

    public final void BfN(C166527yp r4, C151887Wr r5) {
        AnonymousClass7XD A002 = C158187jZ.A00(this);
        A03(A002, new C1895191p(r4, A002, r5, 0), 1022);
    }

    public final void BfR(float f, int i, int i2, int i3) {
        AnonymousClass7XD A002 = C158187jZ.A00(this);
        A03(A002, C1894991n.A00(A002, 18), 1028);
    }

    public /* synthetic */ void Be6(Timeline timeline, Object obj, int i) {
    }
}
