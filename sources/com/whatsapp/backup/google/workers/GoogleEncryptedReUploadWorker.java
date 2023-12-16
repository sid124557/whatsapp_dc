package com.whatsapp.backup.google.workers;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0Aw;
import X.AnonymousClass0Dl;
import X.AnonymousClass0EG;
import X.AnonymousClass0F1;
import X.AnonymousClass0FN;
import X.AnonymousClass0PW;
import X.AnonymousClass0Pq;
import X.AnonymousClass0QR;
import X.AnonymousClass0U8;
import X.AnonymousClass0WK;
import X.AnonymousClass0WN;
import X.AnonymousClass0XS;
import X.AnonymousClass0Y7;
import X.AnonymousClass1VX;
import X.AnonymousClass306;
import X.AnonymousClass310;
import X.AnonymousClass31C;
import X.AnonymousClass33T;
import X.AnonymousClass33p;
import X.AnonymousClass3FI;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass5PA;
import X.AnonymousClass5ZR;
import X.C01390An;
import X.C01400Ao;
import X.C01460Ay;
import X.C02320Fs;
import X.C02380Fy;
import X.C03070Is;
import X.C04450Oi;
import X.C05610Ue;
import X.C06310Xb;
import X.C06540Yd;
import X.C10240hc;
import X.C107385bE;
import X.C17090uY;
import X.C25491ab;
import X.C28861ht;
import X.C29441ip;
import X.C34171uL;
import X.C389229y;
import X.C54292oU;
import X.C55682qk;
import X.C56492s4;
import X.C56512s6;
import X.C56612sH;
import X.C56972sr;
import X.C624735e;
import X.C64393Dh;
import X.C66553Lw;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.Me;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class GoogleEncryptedReUploadWorker extends Worker {
    public AnonymousClass0WK A00;
    public boolean A01 = false;
    public final C55682qk A02;
    public final C64393Dh A03;
    public final C56972sr A04;
    public final C56492s4 A05;
    public final AnonymousClass0U8 A06;
    public final AnonymousClass0WN A07;
    public final C10240hc A08;
    public final AnonymousClass0F1 A09;
    public final AnonymousClass0EG A0A;
    public final AnonymousClass0QR A0B;
    public final AnonymousClass5PA A0C;
    public final C29441ip A0D;
    public final AnonymousClass310 A0E;
    public final C56512s6 A0F;
    public final C56612sH A0G;
    public final C54292oU A0H;
    public final AnonymousClass33T A0I;
    public final AnonymousClass5ZR A0J;
    public final AnonymousClass33p A0K;
    public final AnonymousClass1VX A0L;
    public final AnonymousClass4FV A0M;
    public final C25491ab A0N = new C25491ab();
    public final AnonymousClass31C A0O;
    public final C28861ht A0P;
    public final AnonymousClass306 A0Q;
    public final AnonymousClass3FI A0R;
    public final AnonymousClass4FS A0S;
    public final C34171uL A0T;
    public final ArrayList A0U = AnonymousClass001.A0s();
    public final Random A0V;

    public static C01460Ay A00(AnonymousClass33p r4, long j) {
        C02380Fy r0;
        AnonymousClass0Pq r1 = new AnonymousClass0Pq();
        r1.A02 = true;
        if (r4.A06() == 0) {
            r0 = C02380Fy.UNMETERED;
        } else {
            r0 = C02380Fy.NOT_ROAMING;
        }
        r1.A02(r0);
        AnonymousClass0XS A002 = r1.A00();
        AnonymousClass0Aw r42 = new AnonymousClass0Aw(GoogleEncryptedReUploadWorker.class);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        r42.A02(j, timeUnit);
        r42.A04(A002);
        r42.A03(AnonymousClass0FN.LINEAR, timeUnit, 900000);
        return (C01460Ay) r42.A00();
    }

    public static final void A03(String str, boolean z) {
        if (z) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("google-encrypted-re-upload-worker ");
            A0o.append(str);
            Log.w(AnonymousClass000.A0X(", work aborted", A0o));
        }
    }

    public void A0A() {
        Log.i("google-encrypted-re-upload-worker/onStopped");
        this.A08.A0x(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009b, code lost:
        if (r13.jabber_id == null) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C03070Is A0C() {
        /*
            r14 = this;
            java.lang.String r3 = "GoogleDriveNotificationManager1"
            X.0Ao r0 = new X.0Ao
            r0.<init>()
            r2 = 5
            r5 = 7
            r4 = 0
            r14.A0J()     // Catch:{ all -> 0x0133 }
            X.5PA r6 = r14.A0C     // Catch:{ all -> 0x0133 }
            r11 = 1
            r6.A00(r5, r11)     // Catch:{ all -> 0x0133 }
            androidx.work.WorkerParameters r0 = r14.A01     // Catch:{ all -> 0x0133 }
            int r8 = r0.A00     // Catch:{ all -> 0x0133 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = "google-encrypted-re-upload-worker/doWork, attempt "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r8)     // Catch:{ all -> 0x0133 }
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0133 }
            X.1ab r7 = r14.A0N     // Catch:{ all -> 0x0133 }
            long r0 = (long) r8     // Catch:{ all -> 0x0133 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0133 }
            r7.A03 = r0     // Catch:{ all -> 0x0133 }
            X.33p r12 = r14.A0K     // Catch:{ all -> 0x0133 }
            java.lang.String r9 = r12.A0X()     // Catch:{ all -> 0x0133 }
            X.2sr r0 = r14.A04     // Catch:{ all -> 0x0133 }
            com.whatsapp.Me r13 = r0.A0F()     // Catch:{ all -> 0x0133 }
            X.0WN r0 = r14.A07     // Catch:{ all -> 0x0133 }
            boolean r0 = r0.A0G()     // Catch:{ all -> 0x0133 }
            boolean r1 = X.AnonymousClass000.A1T(r0)
            java.lang.String r0 = "backup encryption is not enabled"
            A03(r0, r1)     // Catch:{ all -> 0x0133 }
            r10 = 3
            if (r1 != 0) goto L_0x011e
            X.0hc r7 = r14.A08     // Catch:{ all -> 0x0133 }
            boolean r1 = r7.A0b()     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = "backup is running"
            A03(r0, r1)     // Catch:{ all -> 0x0133 }
            if (r1 != 0) goto L_0x011e
            X.2oU r0 = r14.A0H     // Catch:{ all -> 0x0133 }
            android.content.Context r0 = r0.A06()     // Catch:{ all -> 0x0133 }
            boolean r0 = X.AnonymousClass0YV.A0F(r0)     // Catch:{ all -> 0x0133 }
            boolean r1 = X.AnonymousClass000.A1T(r0)
            java.lang.String r0 = "Google Drive is not accessible"
            A03(r0, r1)     // Catch:{ all -> 0x0133 }
            if (r1 != 0) goto L_0x011e
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = "grdive account name is empty"
            A03(r0, r1)     // Catch:{ all -> 0x0133 }
            if (r1 != 0) goto L_0x011e
            X.1ht r0 = r14.A0P     // Catch:{ all -> 0x0133 }
            boolean r1 = r0.A09()     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = "WhatsApp login has failed"
            A03(r0, r1)     // Catch:{ all -> 0x0133 }
            if (r1 != 0) goto L_0x011e
            X.5ZR r0 = r14.A0J     // Catch:{ all -> 0x0133 }
            boolean r0 = r0.A0E()     // Catch:{ all -> 0x0133 }
            boolean r1 = X.AnonymousClass000.A1T(r0)
            java.lang.String r0 = "read/write storage permission denied"
            A03(r0, r1)     // Catch:{ all -> 0x0133 }
            if (r1 != 0) goto L_0x011e
            if (r13 == 0) goto L_0x009d
            java.lang.String r0 = r13.jabber_id     // Catch:{ all -> 0x0133 }
            r1 = 0
            if (r0 != 0) goto L_0x009e
        L_0x009d:
            r1 = 1
        L_0x009e:
            java.lang.String r0 = "me or jabberId is null"
            A03(r0, r1)     // Catch:{ all -> 0x0133 }
            if (r1 != 0) goto L_0x011e
            boolean r1 = X.C06540Yd.A0K(r12)     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = "media restore is pending"
            A03(r0, r1)     // Catch:{ all -> 0x0133 }
            if (r1 != 0) goto L_0x011e
            r7.A0R()     // Catch:{ all -> 0x0133 }
            boolean r0 = r7.A0l()     // Catch:{ all -> 0x0133 }
            boolean r1 = X.AnonymousClass000.A1T(r0)
            java.lang.String r0 = "sdcard is not available"
            A03(r0, r1)     // Catch:{ all -> 0x0133 }
            if (r1 == 0) goto L_0x00c9
            r0 = 9
            X.0Is r1 = r14.A0E(r8, r0)     // Catch:{ all -> 0x0133 }
            goto L_0x0122
        L_0x00c9:
            r7.A0Q()     // Catch:{ all -> 0x0133 }
            r7.A0W()     // Catch:{ all -> 0x0133 }
            boolean r0 = r7.A0i()     // Catch:{ all -> 0x0133 }
            boolean r1 = X.AnonymousClass000.A1T(r0)
            java.lang.String r0 = "network is not available"
            A03(r0, r1)     // Catch:{ all -> 0x0133 }
            if (r1 == 0) goto L_0x00eb
            boolean r1 = r7.A0j()     // Catch:{ all -> 0x0133 }
            r0 = 5
            if (r1 == 0) goto L_0x00e6
            r0 = 4
        L_0x00e6:
            X.0Is r1 = r14.A0E(r8, r0)     // Catch:{ all -> 0x0133 }
            goto L_0x0122
        L_0x00eb:
            boolean r1 = r7.A0x(r11)     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = "media re-encryption already running"
            A03(r0, r1)     // Catch:{ all -> 0x0133 }
            if (r1 == 0) goto L_0x00fb
            X.0Is r1 = r14.A0E(r8, r10)     // Catch:{ all -> 0x0133 }
            goto L_0x0122
        L_0x00fb:
            r7.A09()     // Catch:{ all -> 0x0133 }
            boolean r0 = r14.A0L()     // Catch:{ all -> 0x0133 }
            X.0Is r1 = r14.A0F(r0)     // Catch:{ all -> 0x0133 }
            X.0An r0 = new X.0An     // Catch:{ all -> 0x0133 }
            r0.<init>()     // Catch:{ all -> 0x0133 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0133 }
            if (r0 != 0) goto L_0x0114
            r14.A0K(r9)     // Catch:{ all -> 0x0133 }
        L_0x0114:
            r6.A00(r5, r4)
            r7.A0S()
            r7.A0x(r4)
            goto L_0x012d
        L_0x011e:
            X.0Is r1 = r14.A0E(r8, r10)     // Catch:{ all -> 0x0133 }
        L_0x0122:
            r6.A00(r5, r4)
            X.0hc r0 = r14.A08
            r0.A0S()
            r0.A0x(r4)
        L_0x012d:
            X.33T r0 = r14.A0I
            r0.A05(r2, r3)
            return r1
        L_0x0133:
            r1 = move-exception
            X.5PA r0 = r14.A0C
            r0.A00(r5, r4)
            X.0hc r0 = r14.A08
            r0.A0S()
            r0.A0x(r4)
            X.33T r0 = r14.A0I
            r0.A05(r2, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.workers.GoogleEncryptedReUploadWorker.A0C():X.0Is");
    }

    public Notification A0D() {
        C54292oU r5 = this.A0H;
        Context A062 = r5.A06();
        C05610Ue A012 = C66553Lw.A01(A062);
        A012.A0K = "chat_history_backup@1";
        Intent intent = new Intent();
        intent.setClassName(A062.getPackageName(), "com.whatsapp.backup.google.SettingsGoogleDrive");
        A012.A09 = C624735e.A00(A062, 0, intent, 0);
        AnonymousClass33T.A02(A012, R.drawable.notifybar);
        A012.A06 = 1;
        A012.A0B(r5.A07().getString(R.string.f11nameremoved));
        A012.A0A(r5.A07().getString(R.string.f11nameremoved));
        A012.A03(100, 100, true);
        return A012.A01();
    }

    public final C03070Is A0E(int i, int i2) {
        AnonymousClass33p r2 = this.A0K;
        String A0X = r2.A0X();
        if (!TextUtils.isEmpty(A0X)) {
            C25491ab r22 = this.A0N;
            Long valueOf = Long.valueOf((System.currentTimeMillis() - r2.A0P(A0X)) / 3600000);
            r22.A08 = valueOf;
            r22.A05 = valueOf;
        }
        C25491ab r1 = this.A0N;
        if (i < 6) {
            r1.A02 = Integer.valueOf(i2);
            this.A0M.BhD(r1);
            return new C01390An();
        }
        r1.A02 = 7;
        this.A0M.BhD(r1);
        return new C01400Ao();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C03070Is A0F(boolean r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0008
            X.0Ap r0 = new X.0Ap
            r0.<init>()
            return r0
        L_0x0008:
            X.0EG r1 = r4.A0A
            boolean r0 = r1.A05()
            if (r0 != 0) goto L_0x00a3
            androidx.work.WorkerParameters r0 = r4.A01
            int r0 = r0.A00
            r2 = 6
            if (r0 >= r2) goto L_0x007e
            boolean r0 = r1.A03()
            if (r0 != 0) goto L_0x004d
            X.1ab r1 = r4.A0N
            r2 = 9
        L_0x0021:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A02 = r0
        L_0x0027:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "google-encrypted-re-upload-worker/doWork conditions were not met(result code = "
            r1.append(r0)
            X.1ab r0 = r4.A0N
            java.lang.Integer r0 = r0.A02
            r1.append(r0)
            java.lang.String r0 = "), retrying backup later"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0WK r0 = r4.A00
            if (r0 == 0) goto L_0x0047
            r0.A03()
        L_0x0047:
            X.0An r0 = new X.0An
            r0.<init>()
            return r0
        L_0x004d:
            boolean r0 = r1.A02()
            if (r0 != 0) goto L_0x0060
            X.0hc r0 = r4.A08
            boolean r0 = r0.A0j()
            X.1ab r1 = r4.A0N
            r2 = 4
            if (r0 != 0) goto L_0x0021
            r2 = 5
            goto L_0x0021
        L_0x0060:
            boolean r0 = r1.A04()
            if (r0 != 0) goto L_0x006b
            X.1ab r1 = r4.A0N
            r2 = 8
            goto L_0x0021
        L_0x006b:
            boolean r0 = r1.A01()
            if (r0 != 0) goto L_0x0074
            X.1ab r1 = r4.A0N
            goto L_0x0021
        L_0x0074:
            X.2qk r3 = r4.A02
            r2 = 0
            r1 = 1
            java.lang.String r0 = "google-encrypted-re-upload-worker/unknown condition was not met"
            r3.A0A(r0, r1, r2)
            goto L_0x0027
        L_0x007e:
            X.1ab r1 = r4.A0N
            r0 = 7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "google-encrypted-re-upload-worker/doWork worker reached the maximum amount of retries("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "), failing"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0WK r0 = r4.A00
            if (r0 == 0) goto L_0x00a3
            r0.A03()
        L_0x00a3:
            X.0Ao r0 = new X.0Ao
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.workers.GoogleEncryptedReUploadWorker.A0F(boolean):X.0Is");
    }

    public AnonymousClass0WK A0G(AnonymousClass0Y7 r37, String str) {
        C56612sH r17 = this.A0G;
        AnonymousClass1VX r14 = this.A0L;
        C54292oU r15 = this.A0H;
        ArrayList arrayList = this.A0U;
        AnonymousClass4FV r12 = this.A0M;
        C64393Dh r11 = this.A03;
        AnonymousClass310 r10 = this.A0E;
        AnonymousClass31C r9 = this.A0O;
        AnonymousClass0EG r8 = this.A0A;
        AnonymousClass0WN r7 = this.A07;
        AnonymousClass33p r6 = this.A0K;
        C04450Oi r5 = new C04450Oi(r11, r6, r14);
        C56512s6 r4 = this.A0F;
        AnonymousClass0QR r3 = this.A0B;
        AnonymousClass5ZR r2 = this.A0J;
        AnonymousClass0F1 r1 = this.A09;
        C56612sH r26 = r17;
        return new AnonymousClass0WK(r11, r7, r1, r5, r3, r8, r37, r10, r4, r26, r15, r2, r6, r14, r12, this.A0N, r9, str, arrayList);
    }

    public final String A0H() {
        Me A0F2 = this.A04.A0F();
        if (A0F2 == null) {
            Log.i("google-re-enc-upload-worker/my-jid/me is null, can't proceed");
            return null;
        }
        String str = A0F2.jabber_id;
        if (str != null) {
            return str;
        }
        Log.e("google-re-enc-upload-worker/my-jid/jidUser is null, fatal error.");
        return null;
    }

    public final void A0I() {
        if (!this.A01) {
            this.A0U.addAll(C06540Yd.A02(this.A03));
            this.A01 = true;
        }
    }

    public final void A0J() {
        if (this.A0L.A0X(3129)) {
            Log.i("google-encrypted-re-upload-worker/publishNotification enable setForegroundAsync");
            try {
                A07(new AnonymousClass0PW(5, A0D(), AnonymousClass000.A1S(C107385bE.A07() ? 1 : 0) ? 1 : 0)).get();
            } catch (InterruptedException | ExecutionException unused) {
            }
        } else {
            Log.i("google-encrypted-re-upload-worker/publishNotification skip setForegroundAsync");
        }
    }

    public final void A0K(String str) {
        if (this.A07.A0J(str)) {
            C34171uL r4 = this.A0T;
            Random random = this.A0V;
            A02(C02320Fs.APPEND_OR_REPLACE, this.A0K, r4, random, false);
        }
    }

    public boolean A0L() {
        String str;
        String A0H2 = A0H();
        if (A0H2 == null) {
            str = "google-re-enc-upload-worker/handle-intent/backup jid is null.";
        } else {
            String A0X = this.A0K.A0X();
            if (A0X == null) {
                str = "google-re-enc-upload-worker/handle-intent/gdrive account name is null.";
            } else {
                Context context = this.A00;
                AnonymousClass1VX r12 = this.A0L;
                C55682qk r4 = this.A02;
                AnonymousClass3FI r14 = this.A0R;
                C56492s4 r5 = this.A05;
                AnonymousClass310 r10 = this.A0E;
                AnonymousClass0Y7 r2 = new AnonymousClass0Y7(context, r4, r5, this.A06, this.A07, this.A0B, this.A0D, r10, this.A0J, r12, this.A0Q, r14, this.A0S, A0X, "background");
                A0I();
                AnonymousClass0WK A0G2 = A0G(r2, A0H2);
                this.A00 = A0G2;
                return A0G2.A06();
            }
        }
        Log.e(str);
        return false;
    }

    public GoogleEncryptedReUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Log.d("google-encrypted-re-upload-worker/hilt");
        C17090uY r1 = (C17090uY) C389229y.A02(context, C17090uY.class);
        this.A0V = r1.Bi9();
        this.A0G = r1.Bqh();
        this.A0L = r1.Avy();
        this.A0S = r1.BsP();
        this.A0R = r1.BsC();
        this.A02 = r1.Azq();
        this.A04 = r1.BL4();
        this.A0H = r1.BsL();
        this.A03 = r1.B2z();
        this.A05 = r1.Bq6();
        this.A0M = r1.BsT();
        this.A0E = r1.B2w();
        this.A0P = r1.BKO();
        AnonymousClass31C BLC = r1.BLC();
        this.A0O = BLC;
        this.A0C = r1.Axh();
        this.A0T = r1.BsX();
        this.A07 = r1.B2O();
        this.A0F = r1.BL8();
        this.A0B = r1.Bk8();
        this.A0J = r1.BsN();
        this.A0K = r1.BsO();
        this.A0Q = r1.B2x();
        this.A0I = r1.BsM();
        this.A06 = r1.Axg();
        this.A09 = r1.BLn();
        this.A0D = r1.AzX();
        C10240hc BEj = r1.BEj();
        this.A08 = BEj;
        this.A0A = new AnonymousClass0Dl(r1.Bso(), BEj, this, BLC);
    }

    public static void A02(C02320Fs r8, AnonymousClass33p r9, C34171uL r10, Random random, boolean z) {
        long j;
        Calendar instance = Calendar.getInstance();
        if (!z) {
            int A052 = r9.A05();
            long currentTimeMillis = System.currentTimeMillis() - r9.A0R(r9.A0X());
            if (A052 == 1 || (A052 != 2 ? !(A052 != 3 || currentTimeMillis < 2419200000L) : currentTimeMillis >= 432000000)) {
                Log.i("google-encrypted-re-upload-worker/scheduleNextRun doesn't schedule run because google drive backup will run in the next backup slot");
                return;
            }
            long timeInMillis = instance.getTimeInMillis();
            if (instance.get(11) >= 2) {
                instance.add(5, 1);
            }
            instance.set(14, 0);
            instance.set(13, 0);
            instance.set(12, 0);
            instance.set(11, 2);
            instance.add(13, random.nextInt((int) TimeUnit.SECONDS.convert(4, TimeUnit.HOURS)));
            j = instance.getTimeInMillis() - timeInMillis;
        } else {
            j = 0;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("google-encrypted-re-upload-worker/scheduleNextRun at ");
        A0o.append(instance.getTime());
        A0o.append(", immediately = ");
        A0o.append(z);
        Log.i(AnonymousClass000.A0P(r8, ", existingWorkPolicy = ", A0o));
        ((C06310Xb) r10.get()).A07(r8, A00(r9, j), "com.whatsapp.backup.google.google-encrypted-re-upload-worker");
    }
}
