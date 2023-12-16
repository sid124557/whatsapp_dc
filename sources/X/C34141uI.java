package X;

/* renamed from: X.1uI  reason: invalid class name and case insensitive filesystem */
public class C34141uI extends C173778Rq {
    public final C64393Dh A00;
    public final C620733j A01;
    public final AnonymousClass5Y0 A02;
    public final AnonymousClass33Q A03;
    public final /* synthetic */ C50542iL A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34141uI(C64393Dh r2, C620733j r3, AnonymousClass5Y0 r4, AnonymousClass33Q r5, C50542iL r6) {
        super("MessageThumbsThread");
        this.A04 = r6;
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x028f, code lost:
        if (r6 != null) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r0.A0A <= 0) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0143, code lost:
        if (X.AnonymousClass36U.A02(r4.A00, r8.A05, r6, r3) >= 262144) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b4, code lost:
        if (r6 == null) goto L_0x01b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0212 A[Catch:{ InterruptedException -> 0x02d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a3 A[ADDED_TO_REGION, Catch:{ InterruptedException -> 0x02d0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r19 = this;
            r5 = 10
            android.os.Process.setThreadPriority(r5)
        L_0x0005:
            r4 = r19
            X.2iL r8 = r4.A04     // Catch:{ InterruptedException -> 0x02d0 }
            X.7IT r0 = r8.A0C     // Catch:{ InterruptedException -> 0x02d0 }
            java.util.concurrent.LinkedBlockingDeque r0 = r0.A00     // Catch:{ InterruptedException -> 0x02d0 }
            java.lang.Object r7 = r0.takeLast()     // Catch:{ InterruptedException -> 0x02d0 }
            X.2hk r7 = (X.C50172hk) r7     // Catch:{ InterruptedException -> 0x02d0 }
        L_0x0013:
            java.util.concurrent.atomic.AtomicInteger r9 = r8.A0D     // Catch:{ InterruptedException -> 0x02d0 }
            int r2 = r9.get()     // Catch:{ InterruptedException -> 0x02d0 }
            r17 = 1000(0x3e8, double:4.94E-321)
            if (r2 > r5) goto L_0x02c1
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ InterruptedException -> 0x02d0 }
            long r0 = X.C1441870j.A00     // Catch:{ InterruptedException -> 0x02d0 }
            long r2 = r2 - r0
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x002e
            r0 = 50
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x02d0 }
            goto L_0x0013
        L_0x002e:
            java.lang.Object r10 = r7.A04     // Catch:{ InterruptedException -> 0x02d0 }
            android.view.View r11 = r7.A00     // Catch:{ InterruptedException -> 0x02d0 }
            java.lang.Object r0 = r11.getTag()     // Catch:{ InterruptedException -> 0x02d0 }
            boolean r0 = r10.equals(r0)     // Catch:{ InterruptedException -> 0x02d0 }
            r2 = 0
            if (r0 == 0) goto L_0x0291
            X.34x r3 = r7.A01     // Catch:{ InterruptedException -> 0x02d0 }
            boolean r0 = r3 instanceof X.C30471mV     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x021e
            X.1mV r3 = (X.C30471mV) r3     // Catch:{ InterruptedException -> 0x02d0 }
            X.33C r13 = r3.A01     // Catch:{ InterruptedException -> 0x02d0 }
            r12 = 1
            r15 = 0
            if (r13 == 0) goto L_0x01cb
            X.2rD r1 = r8.A09     // Catch:{ InterruptedException -> 0x02d0 }
            java.lang.String r0 = r13.A0I     // Catch:{ InterruptedException -> 0x02d0 }
            X.5LM r0 = r1.A01(r0)     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x005d
            long r0 = r0.A0A     // Catch:{ InterruptedException -> 0x02d0 }
            int r6 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            r1 = 1
            if (r6 > 0) goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            java.io.File r0 = r13.A0F     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x0111
            boolean r0 = r0.canRead()     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x0111
            boolean r0 = r3 instanceof X.AnonymousClass1n2     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x0074
            java.io.File r0 = r13.A0F     // Catch:{ InterruptedException -> 0x02d0 }
            android.graphics.Bitmap r6 = r8.A00(r13, r7, r0, r2)     // Catch:{ InterruptedException -> 0x02d0 }
            goto L_0x0210
        L_0x0074:
            boolean r0 = r3 instanceof X.C31981pC     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x00df
            X.2z0 r0 = r3.A1J     // Catch:{ InterruptedException -> 0x02d0 }
            boolean r14 = r0.A02     // Catch:{ InterruptedException -> 0x02d0 }
            if (r14 == 0) goto L_0x009b
            boolean r0 = r13.A0R     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 != 0) goto L_0x009b
            boolean r0 = r13.A0Q     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 != 0) goto L_0x009b
            long r2 = r13.A0D     // Catch:{ InterruptedException -> 0x02d0 }
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x009b
            long r0 = r13.A0E     // Catch:{ InterruptedException -> 0x02d0 }
            int r6 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r6 <= 0) goto L_0x009b
            java.io.File r0 = r13.A0F     // Catch:{ InterruptedException -> 0x02d0 }
            long r2 = r2 * r17
            android.graphics.Bitmap r6 = X.C107085af.A02(r0, r2)     // Catch:{ InterruptedException -> 0x02d0 }
            goto L_0x00a1
        L_0x009b:
            java.io.File r0 = r13.A0F     // Catch:{ InterruptedException -> 0x02d0 }
            android.graphics.Bitmap r6 = X.C107085af.A01(r0)     // Catch:{ InterruptedException -> 0x02d0 }
        L_0x00a1:
            if (r6 == 0) goto L_0x0291
            if (r14 == 0) goto L_0x02a1
            boolean r0 = r13.A0R     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 != 0) goto L_0x02a1
            boolean r0 = r13.A0Q     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 != 0) goto L_0x02a1
            java.lang.String r1 = r13.A0H     // Catch:{ InterruptedException -> 0x02d0 }
            if (r1 == 0) goto L_0x02a1
            X.3Dh r0 = r4.A00     // Catch:{ InterruptedException -> 0x02d0 }
            java.io.File r13 = X.C107655bf.A0R(r0, r1)     // Catch:{ InterruptedException -> 0x02d0 }
            boolean r0 = r13.exists()     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x02a1
            X.2oU r0 = r8.A03     // Catch:{ InterruptedException -> 0x02d0 }
            android.content.Context r3 = r0.A00     // Catch:{ InterruptedException -> 0x02d0 }
            X.5Y0 r2 = r4.A02     // Catch:{ InterruptedException -> 0x02d0 }
            X.33j r1 = r4.A01     // Catch:{ InterruptedException -> 0x02d0 }
            X.33O r0 = r8.A0A     // Catch:{ InterruptedException -> 0x02d0 }
            X.5aV r1 = X.C106985aV.A02(r3, r1, r2, r0, r13)     // Catch:{ InterruptedException -> 0x02d0 }
            if (r1 == 0) goto L_0x02a1
            boolean r0 = r6.isMutable()     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 != 0) goto L_0x00d9
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ InterruptedException -> 0x02d0 }
            android.graphics.Bitmap r6 = r6.copy(r0, r12)     // Catch:{ InterruptedException -> 0x02d0 }
        L_0x00d9:
            r0 = 0
            r1.A07(r6, r0, r0, r0)     // Catch:{ InterruptedException -> 0x02d0 }
            goto L_0x0210
        L_0x00df:
            boolean r0 = r3 instanceof X.AnonymousClass1nF     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x0291
            java.lang.String r1 = "application/pdf"
            java.lang.String r0 = r3.A05     // Catch:{ InterruptedException -> 0x02d0 }
            boolean r0 = r1.equals(r0)     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x0291
            java.io.File r0 = r13.A0F     // Catch:{ InterruptedException -> 0x02d0 }
            java.lang.String r6 = r0.getAbsolutePath()     // Catch:{ InterruptedException -> 0x02d0 }
            X.8tp r0 = r7.A03     // Catch:{ InterruptedException -> 0x02d0 }
            int r3 = r0.BD5()     // Catch:{ InterruptedException -> 0x02d0 }
            int r0 = r0.BD5()     // Catch:{ InterruptedException -> 0x02d0 }
            int r2 = r0 / 3
            r0 = 0
            X.C162457s7.A0J(r6, r0)     // Catch:{ InterruptedException -> 0x02d0 }
            r1 = 480(0x1e0, float:6.73E-43)
            boolean r0 = X.C107535bT.A08()     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 != 0) goto L_0x0291
            android.graphics.Bitmap r6 = X.AnonymousClass5b1.A01(r6, r3, r2, r1, r12)     // Catch:{ InterruptedException -> 0x02d0 }
            goto L_0x0210
        L_0x0111:
            boolean r0 = r3 instanceof X.C31971pB     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 != 0) goto L_0x0119
            boolean r0 = r3 instanceof X.C31951p9     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x016d
        L_0x0119:
            r0 = r3
            X.1pC r0 = (X.C31981pC) r0     // Catch:{ InterruptedException -> 0x02d0 }
            boolean r0 = X.AnonymousClass35Z.A03(r0)     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 != 0) goto L_0x0145
            if (r1 != 0) goto L_0x0145
            boolean r0 = X.AnonymousClass2z0.A0C(r3)     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x016d
            X.1VX r6 = r8.A07     // Catch:{ InterruptedException -> 0x02d0 }
            r1 = 6508(0x196c, float:9.12E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ InterruptedException -> 0x02d0 }
            boolean r0 = r6.A0Y(r0, r1)     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x016d
            X.3Dh r1 = r4.A00     // Catch:{ InterruptedException -> 0x02d0 }
            X.2zf r0 = r8.A05     // Catch:{ InterruptedException -> 0x02d0 }
            long r16 = X.AnonymousClass36U.A02(r1, r0, r6, r3)     // Catch:{ InterruptedException -> 0x02d0 }
            r14 = 262144(0x40000, double:1.295163E-318)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x016d
        L_0x0145:
            X.3Dh r6 = r8.A02     // Catch:{ InterruptedException -> 0x02d0 }
            java.io.File r2 = r6.A0N(r3)     // Catch:{ InterruptedException -> 0x02d0 }
            if (r2 == 0) goto L_0x0291
            boolean r0 = r2.exists()     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x0291
            java.lang.StringBuilder r1 = X.C18320x8.A0l(r2)     // Catch:{ InterruptedException -> 0x02d0 }
            java.lang.String r0 = ".chck"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ InterruptedException -> 0x02d0 }
            java.io.File r0 = X.C64393Dh.A00(r6, r0)     // Catch:{ InterruptedException -> 0x02d0 }
            boolean r0 = r0.exists()     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x0291
            android.graphics.Bitmap r6 = X.C107085af.A01(r2)     // Catch:{ InterruptedException -> 0x02d0 }
            goto L_0x0210
        L_0x016d:
            boolean r0 = r3 instanceof X.AnonymousClass1n2     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x01cb
            X.30d r12 = r3.A1v()     // Catch:{ InterruptedException -> 0x02d0 }
            X.3Dh r14 = r4.A00     // Catch:{ InterruptedException -> 0x02d0 }
            X.8qC r0 = r14.A02     // Catch:{ InterruptedException -> 0x02d0 }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x02d0 }
            X.310 r0 = (X.AnonymousClass310) r0     // Catch:{ InterruptedException -> 0x02d0 }
            java.lang.String r1 = ".Thumbs"
            java.io.File r0 = X.AnonymousClass310.A00(r0)     // Catch:{ InterruptedException -> 0x02d0 }
            java.io.File r15 = X.AnonymousClass002.A0A(r0, r1)     // Catch:{ InterruptedException -> 0x02d0 }
            java.lang.String r6 = ".prog.thumb.jpg"
            java.lang.String r1 = r3.A04     // Catch:{ InterruptedException -> 0x02d0 }
            java.lang.String r0 = r3.A07     // Catch:{ InterruptedException -> 0x02d0 }
            java.io.File r1 = X.C64393Dh.A04(r15, r1, r0, r6)     // Catch:{ InterruptedException -> 0x02d0 }
            java.io.File r6 = r14.A0N(r3)     // Catch:{ InterruptedException -> 0x02d0 }
            boolean r0 = X.C624234y.A04(r3)     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x01b6
            if (r12 == 0) goto L_0x01b6
            if (r6 == 0) goto L_0x01b6
            boolean r0 = r6.exists()     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x01b6
            X.3Mz r0 = r8.A08     // Catch:{ InterruptedException -> 0x02d0 }
            r0.A00(r12)     // Catch:{ InterruptedException -> 0x02d0 }
            int[] r0 = r12.A07()     // Catch:{ InterruptedException -> 0x02d0 }
            android.graphics.Bitmap r6 = r8.A00(r13, r7, r6, r0)     // Catch:{ InterruptedException -> 0x02d0 }
            if (r6 != 0) goto L_0x02a1
        L_0x01b6:
            boolean r0 = r7.A05     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 != 0) goto L_0x0291
            if (r1 == 0) goto L_0x0291
            boolean r0 = r1.exists()     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x0291
            android.graphics.Bitmap r6 = r8.A00(r13, r7, r1, r2)     // Catch:{ InterruptedException -> 0x02d0 }
            if (r6 == 0) goto L_0x0291
            r1 = 4
            goto L_0x029d
        L_0x01cb:
            boolean r0 = r3 instanceof X.AnonymousClass1nE     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x0291
            X.1nE r3 = (X.AnonymousClass1nE) r3     // Catch:{ InterruptedException -> 0x02d0 }
            boolean r0 = r3.A02     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x0291
            android.content.Context r12 = r11.getContext()     // Catch:{ InterruptedException -> 0x02d0 }
            X.2z0 r6 = r3.A1J     // Catch:{ InterruptedException -> 0x02d0 }
            X.3Dh r2 = r4.A00     // Catch:{ InterruptedException -> 0x02d0 }
            java.lang.String r1 = r3.A04     // Catch:{ InterruptedException -> 0x02d0 }
            java.lang.String r0 = r3.A07     // Catch:{ InterruptedException -> 0x02d0 }
            java.io.File r3 = r2.A0W(r1, r0)     // Catch:{ InterruptedException -> 0x02d0 }
            if (r3 == 0) goto L_0x0214
            boolean r0 = r3.exists()     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x0214
            android.content.res.Resources r1 = r12.getResources()     // Catch:{ InterruptedException -> 0x02d0 }
            r0 = 2131166096(0x7f070390, float:1.7946428E38)
            int r2 = r1.getDimensionPixelSize(r0)     // Catch:{ InterruptedException -> 0x02d0 }
            X.33Q r1 = r4.A03     // Catch:{ InterruptedException -> 0x02d0 }
            java.lang.String r0 = r6.A01     // Catch:{ InterruptedException -> 0x02d0 }
            android.graphics.Bitmap r6 = r1.A03(r3, r0, r2, r2)     // Catch:{ InterruptedException -> 0x02d0 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ InterruptedException -> 0x02d0 }
            java.lang.String r0 = "MessageThumbFetcher/got sticker bitmap: "
            r1.append(r0)     // Catch:{ InterruptedException -> 0x02d0 }
            boolean r0 = X.AnonymousClass000.A1X(r6)
            X.C18260x0.A1U(r1, r0)     // Catch:{ InterruptedException -> 0x02d0 }
        L_0x0210:
            if (r6 == 0) goto L_0x0291
            goto L_0x02a1
        L_0x0214:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ InterruptedException -> 0x02d0 }
            java.lang.String r0 = "MessageThumbFetcher/sticker thumbnail doesn't exist: "
            X.C18260x0.A1Q(r1, r0, r3)     // Catch:{ InterruptedException -> 0x02d0 }
            goto L_0x0291
        L_0x021e:
            boolean r0 = r3 instanceof X.C30481mW     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x0291
            X.8tp r0 = r7.A03     // Catch:{ InterruptedException -> 0x02d0 }
            int r2 = r0.BD5()     // Catch:{ InterruptedException -> 0x02d0 }
            X.2qb r6 = r3.A0l     // Catch:{ InterruptedException -> 0x02d0 }
            if (r6 == 0) goto L_0x0253
            X.3Dh r1 = r4.A00     // Catch:{ InterruptedException -> 0x02d0 }
            java.lang.String r0 = r6.A04     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x023b
            java.io.File r3 = r1.A0T(r0)     // Catch:{ InterruptedException -> 0x02d0 }
        L_0x0236:
            int r2 = r6.A01     // Catch:{ InterruptedException -> 0x02d0 }
            int r1 = r6.A00     // Catch:{ InterruptedException -> 0x02d0 }
            goto L_0x0282
        L_0x023b:
            java.lang.String r2 = r6.A07     // Catch:{ InterruptedException -> 0x02d0 }
            if (r2 == 0) goto L_0x0251
            X.2UN r0 = r1.A08()     // Catch:{ InterruptedException -> 0x02d0 }
            java.io.File r1 = r0.A0R     // Catch:{ InterruptedException -> 0x02d0 }
            r0 = 0
            X.C64393Dh.A07(r1, r0)     // Catch:{ InterruptedException -> 0x02d0 }
            X.C626936e.A06(r2)     // Catch:{ InterruptedException -> 0x02d0 }
            java.io.File r3 = X.C64393Dh.A03(r1, r2)     // Catch:{ InterruptedException -> 0x02d0 }
            goto L_0x0236
        L_0x0251:
            r3 = 0
            goto L_0x0236
        L_0x0253:
            X.2nF r0 = r3.A0r()     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x0291
            X.2nF r0 = r3.A0r()     // Catch:{ InterruptedException -> 0x02d0 }
            java.lang.String r0 = r0.A05     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x0291
            X.3Dh r6 = r4.A00     // Catch:{ InterruptedException -> 0x02d0 }
            X.2nF r0 = r3.A0r()     // Catch:{ InterruptedException -> 0x02d0 }
            java.lang.String r0 = r0.A05     // Catch:{ InterruptedException -> 0x02d0 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ InterruptedException -> 0x02d0 }
            java.lang.String r0 = X.C627236i.A04(r0)     // Catch:{ InterruptedException -> 0x02d0 }
            X.C626936e.A06(r0)     // Catch:{ InterruptedException -> 0x02d0 }
            r1.append(r0)     // Catch:{ InterruptedException -> 0x02d0 }
            java.lang.String r0 = "-hqthumb"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ InterruptedException -> 0x02d0 }
            java.io.File r3 = X.C64393Dh.A00(r6, r0)     // Catch:{ InterruptedException -> 0x02d0 }
            r1 = r2
        L_0x0282:
            if (r3 == 0) goto L_0x0291
            X.5WB r0 = new X.5WB     // Catch:{ InterruptedException -> 0x02d0 }
            r0.<init>(r2, r1)     // Catch:{ InterruptedException -> 0x02d0 }
            X.7KE r0 = X.C107245ax.A06(r0, r3)     // Catch:{ InterruptedException -> 0x02d0 }
            android.graphics.Bitmap r6 = r0.A02     // Catch:{ InterruptedException -> 0x02d0 }
            if (r6 != 0) goto L_0x02a1
        L_0x0291:
            boolean r0 = java.lang.Thread.interrupted()     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x0005
            java.lang.String r0 = "MessageThumbsThread/run/Thread interrupted"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x02d0 }
            goto L_0x02cf
        L_0x029d:
            r0 = 2
            com.whatsapp.filter.FilterUtils.blurNative(r6, r1, r0)     // Catch:{ InterruptedException -> 0x02d0 }
        L_0x02a1:
            java.lang.Object r0 = r11.getTag()     // Catch:{ InterruptedException -> 0x02d0 }
            boolean r0 = r10.equals(r0)     // Catch:{ InterruptedException -> 0x02d0 }
            if (r0 == 0) goto L_0x02bd
            r9.incrementAndGet()     // Catch:{ InterruptedException -> 0x02d0 }
            X.7O7 r3 = r7.A02     // Catch:{ InterruptedException -> 0x02d0 }
            android.os.Handler r2 = r8.A01     // Catch:{ InterruptedException -> 0x02d0 }
            r1 = 26
            X.3aN r0 = new X.3aN     // Catch:{ InterruptedException -> 0x02d0 }
            r0.<init>(r4, r3, r6, r1)     // Catch:{ InterruptedException -> 0x02d0 }
            r2.post(r0)     // Catch:{ InterruptedException -> 0x02d0 }
            goto L_0x0291
        L_0x02bd:
            r6.recycle()     // Catch:{ InterruptedException -> 0x02d0 }
            goto L_0x0291
        L_0x02c1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ InterruptedException -> 0x02d0 }
            java.lang.String r0 = "MessageThumbsThread/too many result callbacks pending="
            X.C18260x0.A0y(r0, r1, r2)     // Catch:{ InterruptedException -> 0x02d0 }
            java.lang.Thread.sleep(r17)     // Catch:{ InterruptedException -> 0x02d0 }
            goto L_0x0013
        L_0x02cf:
            return
        L_0x02d0:
            r1 = move-exception
            java.lang.String r0 = "MessageThumbsThread/run/InterruptedException"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34141uI.run():void");
    }
}
