package com.whatsapp.media.transcode;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass33T;
import X.AnonymousClass3YV;
import X.AnonymousClass4FW;
import X.AnonymousClass4GJ;
import X.AnonymousClass5ZU;
import X.C05610Ue;
import X.C107385bE;
import X.C18260x0;
import X.C18280x3;
import X.C18300x5;
import X.C18320x8;
import X.C18400xH;
import X.C22031Ec;
import X.C29431io;
import X.C56232re;
import X.C64323Da;
import X.C64333Db;
import X.C64773Ex;
import X.C65063Gb;
import X.C66553Lw;
import android.app.Notification;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.HashMap;

public class MediaTranscodeService extends C18400xH implements AnonymousClass4GJ {
    public static final HashMap A0B = AnonymousClass001.A0t();
    public int A00;
    public C64773Ex A01;
    public AnonymousClass5ZU A02;
    public AnonymousClass4FW A03;
    public C29431io A04;
    public C56232re A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final Object A09;
    public volatile AnonymousClass3YV A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f3, code lost:
        if (r0 != 13) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0157, code lost:
        if (r0 != 13) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0183, code lost:
        if (r0 != false) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c6, code lost:
        if (r1 != 13) goto L_0x01c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0207  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r17 = this;
            r10 = r17
            boolean r9 = r10.A08
            r8 = 1
            r10.A08 = r8
            java.util.HashSet r7 = X.AnonymousClass002.A0K()
            java.util.HashMap r16 = A0B
            int r0 = r16.size()
            r4 = 134217728(0x8000000, float:3.85186E-34)
            java.lang.String r11 = "MediaTranscodeService"
            r1 = 13
            r2 = 3
            r6 = 0
            r5 = 2
            if (r0 != r8) goto L_0x00ab
            java.util.Iterator r0 = X.C18290x4.A10(r16)
            X.1mV r14 = X.C18320x8.A0S(r0)
            X.3Ex r1 = r10.A01
            X.2z0 r0 = r14.A1J
            X.4uZ r3 = r0.A00
            X.3ZH r12 = r1.A0A(r3)
            byte r13 = r14.A1I
            if (r13 == r5) goto L_0x008d
            if (r13 == r2) goto L_0x0089
            r0 = 13
            r2 = 2131893543(0x7f121d27, float:1.9421866E38)
            if (r13 == r0) goto L_0x003e
            r2 = 2131893542(0x7f121d26, float:1.9421863E38)
        L_0x003e:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            boolean r0 = r3 instanceof X.C135166kE
            if (r0 == 0) goto L_0x0082
            r0 = 2131890906(0x7f1212da, float:1.9416517E38)
            java.lang.String r0 = r10.getString(r0)
        L_0x004b:
            java.lang.String r0 = X.C106815aD.A02(r0)
            java.lang.String r2 = X.AnonymousClass002.A0F(r10, r0, r1, r6, r2)
            X.33C r15 = r14.A01
            if (r15 == 0) goto L_0x00a8
            long r0 = r15.A0C
            int r3 = (int) r0
            X.2re r0 = r10.A05
            boolean r1 = r15.A0Q
            if (r1 != 0) goto L_0x0185
            X.30M r1 = r0.A00(r14)
            X.3QO r1 = r0.A01(r1)
            if (r1 == 0) goto L_0x0191
            X.33c r0 = r0.A0D
            X.2he r0 = r0.A0D
            X.38t r15 = X.C47592dV.A00(r1)
            X.2gn r0 = r0.A05
            X.6kP r0 = r0.A00(r15)
            java.lang.Runnable r1 = r0.A01(r1)
            X.8Mn r1 = (X.C172738Mn) r1
            if (r1 == 0) goto L_0x0191
            monitor-enter(r1)
            goto L_0x0091
        L_0x0082:
            X.5ZU r0 = r10.A02
            java.lang.String r0 = r0.A0H(r12)
            goto L_0x004b
        L_0x0089:
            r2 = 2131893553(0x7f121d31, float:1.9421886E38)
            goto L_0x003e
        L_0x008d:
            r2 = 2131893540(0x7f121d24, float:1.942186E38)
            goto L_0x003e
        L_0x0091:
            X.7UI r15 = r1.A00     // Catch:{ all -> 0x00a5 }
            monitor-enter(r15)     // Catch:{ all -> 0x00a5 }
            X.8rq r0 = r15.A00     // Catch:{ all -> 0x00a2 }
            monitor-exit(r15)     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x0181
            boolean r15 = r0.BFR()     // Catch:{ all -> 0x00a5 }
            r0 = 1
            if (r15 != 0) goto L_0x0182
            goto L_0x0181
        L_0x00a2:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00a5 }
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00a8:
            r3 = -1
            goto L_0x0191
        L_0x00ab:
            java.util.HashSet r15 = X.AnonymousClass002.A0K()
            java.util.Iterator r12 = X.C18290x4.A10(r16)
        L_0x00b3:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00ca
            X.34x r3 = X.C18300x5.A0T(r12)
            X.2z0 r0 = r3.A1J
            X.4uZ r0 = r0.A00
            r15.add(r0)
            byte r0 = r3.A1I
            X.AnonymousClass001.A1O(r7, r0)
            goto L_0x00b3
        L_0x00ca:
            int r0 = r15.size()
            if (r0 != r8) goto L_0x0142
            X.3Ex r3 = r10.A01
            java.util.Iterator r0 = r15.iterator()
            X.4uZ r0 = X.C18300x5.A0P(r0)
            X.3ZH r14 = r3.A0A(r0)
            int r0 = r7.size()
            if (r0 != r8) goto L_0x00f5
            java.util.Iterator r0 = r7.iterator()
            byte r0 = X.C18300x5.A00(r0)
            if (r0 == r5) goto L_0x013e
            if (r0 == r2) goto L_0x013a
            r13 = 2131755309(0x7f10012d, float:1.9141494E38)
            if (r0 == r1) goto L_0x00f8
        L_0x00f5:
            r13 = 2131755307(0x7f10012b, float:1.914149E38)
        L_0x00f8:
            X.33j r12 = r10.A01
            int r0 = r16.size()
            long r0 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r5]
            int r2 = r16.size()
            X.AnonymousClass000.A1P(r3, r2, r6)
            java.util.Iterator r2 = r15.iterator()
            java.lang.Object r2 = r2.next()
            boolean r2 = r2 instanceof X.C135166kE
            if (r2 == 0) goto L_0x0133
            r2 = 2131890906(0x7f1212da, float:1.9416517E38)
            java.lang.String r2 = r10.getString(r2)
        L_0x011b:
            java.lang.String r2 = X.C106815aD.A02(r2)
            r3[r8] = r2
            java.lang.String r2 = r12.A0L(r3, r13, r0)
            android.content.Intent r1 = X.C627736r.A0N(r10, r14)
            X.AnonymousClass5VI.A01(r1, r11)
            r0 = 5
            android.app.PendingIntent r12 = X.C624735e.A00(r10, r0, r1, r4)
        L_0x0131:
            r3 = -1
            goto L_0x01a0
        L_0x0133:
            X.5ZU r2 = r10.A02
            java.lang.String r2 = r2.A0H(r14)
            goto L_0x011b
        L_0x013a:
            r13 = 2131755312(0x7f100130, float:1.91415E38)
            goto L_0x00f8
        L_0x013e:
            r13 = 2131755305(0x7f100129, float:1.9141486E38)
            goto L_0x00f8
        L_0x0142:
            int r0 = r7.size()
            if (r0 != r8) goto L_0x0159
            java.util.Iterator r0 = r7.iterator()
            byte r0 = X.C18300x5.A00(r0)
            if (r0 == r5) goto L_0x017d
            if (r0 == r2) goto L_0x0179
            r11 = 2131755310(0x7f10012e, float:1.9141496E38)
            if (r0 == r1) goto L_0x015c
        L_0x0159:
            r11 = 2131755308(0x7f10012c, float:1.9141492E38)
        L_0x015c:
            android.content.Intent r0 = X.C627736r.A02(r10)
            android.app.PendingIntent r12 = X.C624735e.A00(r10, r8, r0, r6)
            X.33j r4 = r10.A01
            int r0 = r16.size()
            long r2 = (long) r0
            java.lang.Object[] r1 = new java.lang.Object[r8]
            int r0 = r16.size()
            X.AnonymousClass000.A1P(r1, r0, r6)
            java.lang.String r2 = r4.A0L(r1, r11, r2)
            goto L_0x0131
        L_0x0179:
            r11 = 2131755313(0x7f100131, float:1.9141502E38)
            goto L_0x015c
        L_0x017d:
            r11 = 2131755306(0x7f10012a, float:1.9141488E38)
            goto L_0x015c
        L_0x0181:
            r0 = 0
        L_0x0182:
            monitor-exit(r1)
            if (r0 == 0) goto L_0x0191
        L_0x0185:
            X.2re r0 = r10.A05
            boolean r0 = r0.A05(r14)
            int r3 = r3 / 2
            if (r0 == 0) goto L_0x0191
            int r3 = r3 + 50
        L_0x0191:
            android.content.Intent r1 = X.C627736r.A0N(r10, r12)
            X.AnonymousClass5VI.A01(r1, r11)
            r0 = 5
            android.app.PendingIntent r12 = X.C624735e.A00(r10, r0, r1, r4)
            X.AnonymousClass001.A1O(r7, r13)
        L_0x01a0:
            X.0Ue r11 = X.C66553Lw.A01(r10)
            java.lang.String r13 = "sending_media@1"
            r11.A0K = r13
            r11.A09 = r12
            r10.A01(r11, r2, r3, r9)
            int r0 = r7.size()
            if (r0 != r8) goto L_0x01c8
            java.util.Iterator r0 = r7.iterator()
            byte r1 = X.C18300x5.A00(r0)
            if (r1 == r5) goto L_0x0217
            r0 = 3
            if (r1 == r0) goto L_0x0213
            r0 = 13
            r12 = 2131755310(0x7f10012e, float:1.9141496E38)
            if (r1 == r0) goto L_0x01cb
        L_0x01c8:
            r12 = 2131755308(0x7f10012c, float:1.9141492E38)
        L_0x01cb:
            X.33j r7 = r10.A01
            int r0 = r16.size()
            long r0 = (long) r0
            java.lang.Object[] r5 = new java.lang.Object[r8]
            int r4 = r16.size()
            X.AnonymousClass000.A1P(r5, r4, r6)
            java.lang.String r1 = r7.A0L(r5, r12, r0)
            X.0Ue r0 = X.C66553Lw.A01(r10)
            r0.A0K = r13
            r10.A01(r0, r1, r3, r9)
            android.app.Notification r0 = r0.A01()
            r11.A08 = r0
            android.app.Notification r4 = r11.A01()
            if (r9 == 0) goto L_0x0200
            int r0 = r10.A00
            if (r0 != r3) goto L_0x0200
            java.lang.String r0 = r10.A06
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 != 0) goto L_0x020a
        L_0x0200:
            boolean r1 = X.C107385bE.A07()
            r0 = 3
            if (r1 == 0) goto L_0x020f
            r10.startForeground(r0, r4, r8)
        L_0x020a:
            r10.A00 = r3
            r10.A06 = r2
            return
        L_0x020f:
            r10.startForeground(r0, r4)
            goto L_0x020a
        L_0x0213:
            r12 = 2131755313(0x7f100131, float:1.9141502E38)
            goto L_0x01cb
        L_0x0217:
            r12 = 2131755306(0x7f10012a, float:1.9141488E38)
            goto L_0x01cb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.media.transcode.MediaTranscodeService.A00():void");
    }

    public final Object generatedComponent() {
        if (this.A0A == null) {
            synchronized (this.A09) {
                if (this.A0A == null) {
                    this.A0A = new AnonymousClass3YV(this);
                }
            }
        }
        return this.A0A.generatedComponent();
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        Log.i("MediaTranscodeService/onCreate");
        if (!this.A07) {
            this.A07 = true;
            C64333Db r1 = ((C22031Ec) ((C64323Da) generatedComponent())).A06;
            this.A01 = C64333Db.A26(r1);
            this.A02 = C64333Db.A28(r1);
            this.A04 = C64333Db.A3K(r1);
            this.A05 = (C56232re) r1.AUV.get();
        }
        super.onCreate();
        C65063Gb r12 = new C65063Gb(this);
        this.A03 = r12;
        this.A04.A06(r12);
    }

    public MediaTranscodeService(int i) {
        this.A09 = AnonymousClass002.A0D();
        this.A07 = false;
    }

    public final void A01(C05610Ue r3, String str, int i, boolean z) {
        r3.A0J = "progress";
        r3.A05(System.currentTimeMillis());
        C18300x5.A14(this, r3, R.string.f11nameremoved);
        r3.A0A(str);
        if (i >= 0) {
            r3.A03(100, i, AnonymousClass000.A1T(i));
        }
        if (!z) {
            r3.A0C(str);
        }
        AnonymousClass33T.A02(r3, 17301640);
    }

    public void onDestroy() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MediaTranscodeService/ondestroy foreground:");
        A0o.append(this.A08);
        A0o.append(" count:");
        C18260x0.A1F(A0o, A0B.size());
        this.A08 = false;
        stopForeground(true);
        this.A04.A07(this.A03);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MediaTranscodeService/onStartCommand intent:");
        A0o.append(intent);
        C18260x0.A0w(" startId:", A0o, i2);
        if (intent == null || !C18280x3.A1V(intent, "com.whatsapp.media.transcode.MediaTranscodeService.STOP")) {
            A00();
            return 2;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            C05610Ue A012 = C66553Lw.A01(this);
            A012.A0K = "sending_media@1";
            C18300x5.A14(this, A012, R.string.f11nameremoved);
            C18320x8.A0z(this, A012, R.string.f11nameremoved);
            A012.A03 = -1;
            AnonymousClass33T.A02(A012, 17301640);
            Notification A013 = A012.A01();
            if (C107385bE.A07()) {
                startForeground(3, A013, 1);
            } else {
                startForeground(3, A013);
            }
        }
        this.A08 = false;
        C18260x0.A1E("MediaTranscodeService/stopService success:", AnonymousClass001.A0o(), stopSelfResult(i2));
        return 2;
    }

    public MediaTranscodeService() {
        this(0);
        this.A08 = false;
        this.A00 = -1;
    }
}
