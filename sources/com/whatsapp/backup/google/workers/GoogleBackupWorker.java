package com.whatsapp.backup.google.workers;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0EG;
import X.AnonymousClass0EZ;
import X.AnonymousClass0F1;
import X.AnonymousClass0PW;
import X.AnonymousClass0QJ;
import X.AnonymousClass0QR;
import X.AnonymousClass0U8;
import X.AnonymousClass0WF;
import X.AnonymousClass0WN;
import X.AnonymousClass0X8;
import X.AnonymousClass0Xq;
import X.AnonymousClass0Y7;
import X.AnonymousClass0YL;
import X.AnonymousClass0YV;
import X.AnonymousClass1VX;
import X.AnonymousClass310;
import X.AnonymousClass31C;
import X.AnonymousClass33p;
import X.AnonymousClass4FV;
import X.AnonymousClass5PA;
import X.AnonymousClass5ZR;
import X.C01400Ao;
import X.C03070Is;
import X.C04450Oi;
import X.C06260Ww;
import X.C06430Xr;
import X.C06540Yd;
import X.C10230hb;
import X.C10240hc;
import X.C107385bE;
import X.C130066bK;
import X.C17100uZ;
import X.C17980wY;
import X.C183538qC;
import X.C188268yc;
import X.C26041bU;
import X.C28861ht;
import X.C34171uL;
import X.C389229y;
import X.C48602fA;
import X.C54292oU;
import X.C55682qk;
import X.C56512s6;
import X.C56612sH;
import X.C56972sr;
import X.C613830m;
import X.C625835r;
import X.C626936e;
import X.C64393Dh;
import X.C72303dV;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

public class GoogleBackupWorker extends Worker {
    public final int A00;
    public final C55682qk A01;
    public final C64393Dh A02;
    public final C56972sr A03;
    public final AnonymousClass0U8 A04;
    public final AnonymousClass0WN A05;
    public final AnonymousClass0WF A06;
    public final C10240hc A07;
    public final C06260Ww A08;
    public final AnonymousClass0F1 A09;
    public final AnonymousClass0QJ A0A;
    public final AnonymousClass0EG A0B;
    public final C10230hb A0C;
    public final AnonymousClass0QR A0D;
    public final AnonymousClass5PA A0E;
    public final AnonymousClass310 A0F;
    public final C56512s6 A0G;
    public final C56612sH A0H;
    public final C54292oU A0I;
    public final AnonymousClass5ZR A0J;
    public final AnonymousClass33p A0K;
    public final C613830m A0L;
    public final C625835r A0M;
    public final C72303dV A0N;
    public final C48602fA A0O;
    public final AnonymousClass1VX A0P;
    public final AnonymousClass4FV A0Q;
    public final C26041bU A0R;
    public final AnonymousClass31C A0S;
    public final C28861ht A0T;
    public final C34171uL A0U;
    public final C183538qC A0V;

    public static final boolean A01(String str) {
        if (str != null) {
            return false;
        }
        Log.e("google-backup-worker/doWork my jid is null.");
        return true;
    }

    public C188268yc A08() {
        Log.i("google-backup-worker/getForegroundInfoAsync");
        C130066bK A002 = C130066bK.A00();
        A002.A05(A0D());
        return A002;
    }

    public final AnonymousClass0PW A0D() {
        return new AnonymousClass0PW(5, this.A0C.A0B(this.A0I.A07(), (String) null), C107385bE.A07() ? 1 : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0016, code lost:
        if (r1 == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C03070Is A0E(boolean r6) {
        /*
            r5 = this;
            androidx.work.WorkerParameters r0 = r5.A01
            int r3 = r0.A00
            X.0Ww r0 = r5.A08
            java.lang.Object r4 = r0.A0P
            monitor-enter(r4)
            X.0Y7 r2 = r0.A00     // Catch:{ all -> 0x006f }
            if (r2 == 0) goto L_0x0018
            monitor-enter(r2)     // Catch:{ all -> 0x006f }
            boolean r1 = r2.A01     // Catch:{ all -> 0x0012 }
            monitor-exit(r2)     // Catch:{ all -> 0x006f }
            goto L_0x0015
        L_0x0012:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006f }
            throw r0     // Catch:{ all -> 0x006f }
        L_0x0015:
            r0 = 1
            if (r1 != 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = "google-backup-worker/doWork cancelled by user, attempt: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0029:
            X.0Ao r0 = new X.0Ao
            r0.<init>()
            return r0
        L_0x002f:
            java.lang.String r0 = "google-backup-worker/doWork done with success = "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", attempt: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r6 == 0) goto L_0x0048
            X.0Ap r0 = new X.0Ap
            r0.<init>()
            return r0
        L_0x0048:
            X.0EG r0 = r5.A0B
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x0029
            int r2 = r5.A00
            if (r3 >= r2) goto L_0x0029
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "google-backup-worker/doWork needs to be retried. Resource conditions were  not met. Attempt: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " from "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0An r0 = new X.0An
            r0.<init>()
            return r0
        L_0x006f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.workers.GoogleBackupWorker.A0E(boolean):X.0Is");
    }

    public AnonymousClass0YL A0F(AnonymousClass0Y7 r51, String str) {
        C54292oU r34 = this.A0I;
        C56612sH r30 = this.A0H;
        AnonymousClass1VX r11 = this.A0P;
        C55682qk r29 = this.A01;
        C64393Dh r10 = this.A02;
        AnonymousClass4FV r27 = this.A0Q;
        AnonymousClass310 r31 = this.A0F;
        AnonymousClass31C r25 = this.A0S;
        C34171uL r24 = this.A0U;
        AnonymousClass0WN r23 = this.A05;
        AnonymousClass33p r9 = this.A0K;
        C04450Oi r8 = new C04450Oi(r10, r9, r11);
        C56512s6 r22 = this.A0G;
        C625835r r21 = this.A0M;
        C72303dV r19 = this.A0N;
        AnonymousClass0QR r26 = this.A0D;
        AnonymousClass5ZR r18 = this.A0J;
        C183538qC r17 = this.A0V;
        C613830m r15 = this.A0L;
        AnonymousClass0U8 r14 = this.A04;
        AnonymousClass0WF r7 = this.A06;
        C10240hc r6 = this.A07;
        List A022 = C06540Yd.A02(r10);
        AnonymousClass0QJ r0 = this.A0A;
        AtomicLong atomicLong = r0.A07;
        AtomicLong atomicLong2 = r0.A06;
        AnonymousClass0EG r3 = this.A0B;
        AnonymousClass0F1 r2 = this.A09;
        C26041bU r1 = this.A0R;
        C56512s6 r32 = r22;
        C56612sH r33 = r30;
        AnonymousClass5ZR r35 = r18;
        AnonymousClass33p r36 = r9;
        C613830m r37 = r15;
        C625835r r38 = r21;
        C72303dV r39 = r19;
        AnonymousClass1VX r40 = r11;
        AnonymousClass4FV r41 = r27;
        C26041bU r42 = r1;
        AnonymousClass31C r43 = r25;
        C34171uL r44 = r24;
        C183538qC r45 = r17;
        return new AnonymousClass0EZ(r29, r10, r14, C06430Xr.A02(this.A0O, r11), r23, r7, r6, r2, r8, r26, r3, r51, new C17980wY(this, 1), this, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, str, A022, atomicLong, atomicLong2);
    }

    public final String A0G() {
        Me A0F2 = this.A03.A0F();
        if (A0F2 == null) {
            Log.i("google-backup-worker/my-jid/me is null, can't proceed");
            return null;
        }
        String str = A0F2.jabber_id;
        if (str != null) {
            return str;
        }
        Log.e("google-backup-worker/my-jid/jidUser is null, fatal error.");
        return null;
    }

    public final void A0H() {
        this.A0E.A00(6, false);
        C10240hc r2 = this.A07;
        r2.A0S();
        AnonymousClass33p r1 = this.A0K;
        if (C06540Yd.A0J(r1) || r2.A0b()) {
            r2.A0w(false);
            this.A08.A0A();
            AnonymousClass0X8.A03();
            r2.A0K();
            r2.A0H();
            r2.A0E();
            r2.A0T();
            r1.A17(0);
            r1.A15(10);
        }
        this.A09.A0H();
        AnonymousClass0QJ r3 = this.A0A;
        r3.A06.set(0);
        r3.A05.set(0);
        r3.A04.set(0);
        r3.A07.set(0);
        r3.A03.set(0);
    }

    public final void A0I() {
        C10230hb r0 = this.A0C;
        r0.A0I();
        r0.A0F();
        boolean A0X = this.A0P.A0X(3129);
        StringBuilder A0o = AnonymousClass001.A0o();
        if (A0X) {
            A0o.append("google-backup-worker/publishNotification enable setForegroundAsync, attempt: ");
            Log.i(AnonymousClass000.A0h(A0o, this.A01.A00));
            try {
                A07(A0D()).get();
            } catch (InterruptedException | ExecutionException unused) {
            }
        } else {
            A0o.append("google-backup-worker/publishNotification skip setForegroundAsync, attempt: ");
            Log.i(AnonymousClass000.A0h(A0o, this.A01.A00));
        }
    }

    public final void A0J(int i) {
        if (this.A0B.A05()) {
            String A022 = AnonymousClass0YV.A02(i);
            if (i != 10) {
                TextUtils.join("\n", Thread.currentThread().getStackTrace());
                Log.e(AnonymousClass000.A0V("google-backup-worker/set-error/", A022, AnonymousClass001.A0o()));
            }
            this.A0K.A15(i);
            this.A0R.A0U = Integer.valueOf(AnonymousClass0YV.A00(i));
            this.A09.A0I(i, this.A0A.A00());
        }
    }

    public final boolean A0K() {
        if (!this.A0J.A0H()) {
            return true;
        }
        Log.e("google-backup-worker/doWork read storage permission denied backup aborted");
        A0J(23);
        return false;
    }

    public final boolean A0L() {
        if (AnonymousClass0YV.A0F(this.A0I.A06())) {
            return false;
        }
        Log.i("google-backup-worker/doWork Google Drive backups are disabled for this user.");
        return true;
    }

    public final boolean A0M() {
        if (!this.A0T.A09()) {
            return false;
        }
        Log.e("google-backup-worker/doWork WhatsApp Login has failed, google drive backup aborted");
        return true;
    }

    public final boolean A0N() {
        if (!C06540Yd.A0K(this.A0K)) {
            return false;
        }
        Log.e("google-backup-worker/doWork cannot start backup, media restore is pending");
        return true;
    }

    public final boolean A0O() {
        Object obj = this.A01.A01.A00.get("only_if_pending");
        if (!(obj instanceof Boolean) || !AnonymousClass001.A1Z(obj) || C06540Yd.A0J(this.A0K)) {
            return true;
        }
        Log.i("google-backup-worker/doWork backup called when not pending and required, ignoring");
        return false;
    }

    public final boolean A0R(String str, String str2) {
        try {
            this.A0E.A00(6, true);
            this.A0K.A15(10);
            C10240hc r0 = this.A07;
            r0.A0R();
            r0.A0Q();
            r0.A0W();
            r0.A09();
            C06260Ww r1 = this.A08;
            C626936e.A06(str);
            AnonymousClass0YL A0F2 = A0F(r1.A04(str, "backup"), str2);
            C26041bU r3 = this.A0R;
            Long valueOf = Long.valueOf((long) this.A01.A00);
            r3.A0c = valueOf;
            Log.i(AnonymousClass000.A0P(valueOf, "google-backup-worker/runBackup, attempt: ", AnonymousClass001.A0o()));
            return A0F2.A0L();
        } finally {
            A0H();
        }
    }

    public GoogleBackupWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Log.d("google-backup-worker/hilt");
        C17100uZ r7 = (C17100uZ) C389229y.A02(context, C17100uZ.class);
        this.A0H = r7.Bqh();
        this.A0P = r7.Avy();
        this.A01 = r7.Azq();
        this.A03 = r7.BL4();
        this.A0I = r7.BsL();
        this.A02 = r7.B2z();
        this.A0Q = r7.BsT();
        this.A0F = r7.B2w();
        this.A0T = r7.BKO();
        AnonymousClass31C BLC = r7.BLC();
        this.A0S = BLC;
        this.A0E = r7.Axh();
        this.A0U = r7.BsX();
        this.A0V = r7.Axe();
        this.A05 = r7.B2O();
        this.A0G = r7.BL8();
        this.A0O = r7.BLJ();
        this.A0M = r7.BLF();
        this.A08 = r7.BEk();
        this.A0N = r7.BLG();
        this.A0D = r7.Bk8();
        this.A0J = r7.BsN();
        this.A0K = r7.BsO();
        this.A0L = r7.BL6();
        this.A04 = r7.Axg();
        this.A06 = r7.Axf();
        C10240hc BEj = r7.BEj();
        this.A07 = BEj;
        this.A09 = r7.BEl();
        this.A0C = r7.BEn();
        this.A0A = r7.BEm();
        C26041bU r6 = new C26041bU();
        this.A0R = r6;
        r6.A0W = 2;
        AnonymousClass0Xq r3 = this.A01.A01;
        r6.A0X = Integer.valueOf(r3.A02("KEY_BACKUP_SCHEDULE", 0));
        r6.A0T = Integer.valueOf(r3.A02("KEY_BACKUP_NETWORK_SETTING", -1));
        this.A0B = new AnonymousClass0EG(r7.Bso(), BEj, BLC);
        this.A00 = r3.A02("KEY_MAX_NUMBER_OF_RETRIES", 0);
    }

    public void A0A() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("google-backup-worker/onStopped, attempt: ");
        Log.i(AnonymousClass000.A0h(A0o, this.A01.A00));
        this.A0B.A07();
        this.A07.A0w(false);
    }

    public C03070Is A0C() {
        C03070Is r1;
        try {
            A0I();
            Log.i(AnonymousClass000.A0Y("google-backup-worker/doWork, attempt ", AnonymousClass001.A0o(), this.A01.A00));
            String A0X = this.A0K.A0X();
            String A0G2 = A0G();
            C10240hc r12 = this.A07;
            if (r12.A0w(true)) {
                Log.e("google-backup-worker/doWork another backup is already running.");
                r1 = new C01400Ao();
            } else {
                if (!A0L() && A0Q(A0X)) {
                    C626936e.A06(A0X);
                    if (A0P(A0X) && A0O() && !A0M() && A0K() && !A0N() && !A01(A0G2)) {
                        C626936e.A06(A0G2);
                        r1 = A0E(A0R(A0X, A0G2));
                    }
                }
                r12.A0w(false);
                Log.i("google-backup-worker/doWork, failed on backup conditions");
                r1 = new C01400Ao();
            }
            return r1;
        } finally {
            this.A0C.A0J();
        }
    }

    public final boolean A0P(String str) {
        if (System.currentTimeMillis() - this.A0K.A0R(str) > 3600000) {
            return true;
        }
        Log.i("google-backup-worker/doWork backup called too early, ignoring");
        return false;
    }

    public final boolean A0Q(String str) {
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        AnonymousClass33p r3 = this.A0K;
        if (r3.A0A() != 0) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("google-backup-worker/doWork accountName is null, cannot proceed further. Change google drive state from ");
            A0o.append(r3.A0A());
            Log.e(AnonymousClass000.A0X(" to clean_state", A0o));
            r3.A17(0);
            return false;
        }
        Log.e("google-backup-worker/doWork grdive account name is empty, google drive backup aborted");
        return false;
    }
}
