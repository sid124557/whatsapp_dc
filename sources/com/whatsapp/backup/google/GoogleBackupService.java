package com.whatsapp.backup.google;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0Dm;
import X.AnonymousClass0Dw;
import X.AnonymousClass0EF;
import X.AnonymousClass0EI;
import X.AnonymousClass0EJ;
import X.AnonymousClass0EL;
import X.AnonymousClass0EN;
import X.AnonymousClass0EU;
import X.AnonymousClass0EW;
import X.AnonymousClass0EX;
import X.AnonymousClass0EY;
import X.AnonymousClass0F1;
import X.AnonymousClass0F2;
import X.AnonymousClass0GD;
import X.AnonymousClass0QJ;
import X.AnonymousClass0QR;
import X.AnonymousClass0U8;
import X.AnonymousClass0UV;
import X.AnonymousClass0UW;
import X.AnonymousClass0WF;
import X.AnonymousClass0WN;
import X.AnonymousClass0X8;
import X.AnonymousClass0Y7;
import X.AnonymousClass0YL;
import X.AnonymousClass0YV;
import X.AnonymousClass1VW;
import X.AnonymousClass1VX;
import X.AnonymousClass310;
import X.AnonymousClass319;
import X.AnonymousClass31C;
import X.AnonymousClass327;
import X.AnonymousClass33p;
import X.AnonymousClass4FV;
import X.AnonymousClass5PA;
import X.AnonymousClass5ZR;
import X.C02320Fs;
import X.C04450Oi;
import X.C04610Pv;
import X.C04710Qi;
import X.C05580Ub;
import X.C06260Ww;
import X.C06310Xb;
import X.C06430Xr;
import X.C06520Ya;
import X.C06540Yd;
import X.C10180hW;
import X.C10230hb;
import X.C10240hc;
import X.C17980wY;
import X.C183538qC;
import X.C25911bH;
import X.C28861ht;
import X.C34171uL;
import X.C48602fA;
import X.C54292oU;
import X.C55272q5;
import X.C55682qk;
import X.C56512s6;
import X.C56612sH;
import X.C56972sr;
import X.C59302wh;
import X.C613830m;
import X.C618232j;
import X.C620633i;
import X.C623834u;
import X.C625835r;
import X.C626936e;
import X.C64393Dh;
import X.C69263Wi;
import X.C72303dV;
import android.app.Notification;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.Me;
import com.whatsapp.backup.google.workers.GoogleEncryptedReUploadWorker;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public final class GoogleBackupService extends AnonymousClass0F2 {
    public int A00;
    public C55682qk A01;
    public C64393Dh A02;
    public C69263Wi A03;
    public C56972sr A04;
    public AnonymousClass0U8 A05;
    public AnonymousClass0WN A06;
    public AnonymousClass0WF A07;
    public C10240hc A08;
    public C06260Ww A09;
    public AnonymousClass0F1 A0A;
    public AnonymousClass0QJ A0B;
    public C10230hb A0C;
    public AnonymousClass0QR A0D;
    public AnonymousClass5PA A0E;
    public AnonymousClass310 A0F;
    public C56512s6 A0G;
    public C620633i A0H;
    public C56612sH A0I;
    public C54292oU A0J;
    public AnonymousClass5ZR A0K;
    public AnonymousClass33p A0L;
    public C613830m A0M;
    public AnonymousClass319 A0N;
    public C625835r A0O;
    public C55272q5 A0P;
    public C72303dV A0Q;
    public C48602fA A0R;
    public AnonymousClass1VW A0S;
    public AnonymousClass1VX A0T;
    public AnonymousClass4FV A0U;
    public C59302wh A0V;
    public AnonymousClass31C A0W;
    public C28861ht A0X;
    public C618232j A0Y;
    public C623834u A0Z;
    public C34171uL A0a;
    public C183538qC A0b;
    public Map A0c;
    public Random A0d;
    public boolean A0e = false;
    public final Binder A0f = new Binder();
    public final Object A0g = AnonymousClass002.A0D();
    public final ArrayList A0h = AnonymousClass001.A0s();
    public final AtomicBoolean A0i = new AtomicBoolean(false);

    public final void A07(Intent intent) {
        String str;
        String A0X2;
        String str2;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (str != null) {
            C06260Ww r0 = this.A09;
            synchronized (r0.A0P) {
                r0.A03 = str;
            }
            this.A08.A0Z(true);
            if (!AnonymousClass0YV.A0F(this.A0J.A06())) {
                Log.d("gdrive-service/handle-intent Google Drive backups are disabled for this user.");
                this.A08.A0Z(false);
                return;
            }
            this.A08.A0R();
            this.A08.A0Q();
            this.A08.A0W();
            boolean equals = "user_initiated".equals(intent.getStringExtra("backup_mode"));
            AnonymousClass33p r02 = this.A0L;
            if (equals) {
                r02.A1p(true);
            } else {
                equals = r02.A2C();
            }
            this.A0C.A0M(equals);
            boolean equals2 = str.equals("action_delete");
            if (equals2) {
                A0X2 = intent.getStringExtra("account_name");
            } else {
                A0X2 = this.A0L.A0X();
            }
            if (!TextUtils.isEmpty(A0X2)) {
                Log.i(AnonymousClass000.A0V("gdrive-service/handle-intent action is ", str, AnonymousClass001.A0o()));
                switch (str.hashCode()) {
                    case -1755890518:
                        if (str.equals("action_restore_media")) {
                            A0E(A0X2);
                            return;
                        }
                        break;
                    case -818191995:
                        if (str.equals("action_restore")) {
                            A0D(A0X2);
                            return;
                        }
                        break;
                    case 1035381739:
                        if (str.equals("action_backup")) {
                            A0A(intent, A0X2, equals);
                            return;
                        }
                        break;
                    case 1096596436:
                        if (equals2) {
                            A09(intent, A0X2);
                            return;
                        }
                        break;
                    case 1122735421:
                        if (str.equals("action_fetch_backup_info")) {
                            Bundle extras = intent.getExtras();
                            C626936e.A06(extras);
                            String string = extras.getString("account_name");
                            if (string == null) {
                                str2 = "gdrive-service/handle-intent/ action action_fetch_backup_info called without account_name";
                                break;
                            } else {
                                A0C(string);
                                return;
                            }
                        }
                        break;
                    case 1461510777:
                        if (str.equals("action_remove_backup_info")) {
                            Bundle extras2 = intent.getExtras();
                            C626936e.A06(extras2);
                            String string2 = extras2.getString("account_name");
                            if (string2 == null) {
                                str2 = "gdrive-service/handle-intent/ action action_remove_backup_info called without account_name";
                                break;
                            } else {
                                this.A0L.A1P(string2);
                                if (string2.equals(this.A0L.A0X()) && intent.getExtras().getBoolean("remove_account_name")) {
                                    this.A0L.A1S((String) null);
                                }
                                this.A0A.A0G();
                                return;
                            }
                        }
                        break;
                    case 1583504647:
                        if (str.equals("action_list")) {
                            A0B(A0X2);
                            return;
                        }
                        break;
                    case 1996912751:
                        if (str.equals("action_change_number")) {
                            A08(intent, A0X2);
                            return;
                        }
                        break;
                }
            } else if (equals2) {
                Log.i("gdrive-service/handle-intent accountName is null or empty => user has never configured Google Drive backup and is now deleting WhatsApp account, nothing to delete.");
                this.A0A.A0b(true);
                return;
            } else {
                int A0A2 = this.A0L.A0A();
                StringBuilder A0l = AnonymousClass000.A0l("gdrive-service/handle-intent ");
                if (A0A2 != 0) {
                    A0l.append(intent);
                    A0l.append(" accountName is null or empty, cannot proceed further also, change google drive state from ");
                    A0l.append(this.A0L.A0A());
                    Log.e(AnonymousClass000.A0X(" to clean_state", A0l));
                    this.A0L.A17(0);
                    this.A0C.A0F();
                    return;
                }
                A0l.append(intent);
                str2 = AnonymousClass000.A0X(" accountName is null or empty, cannot proceed further.", A0l);
            }
            Log.e(str2);
            return;
        }
        Log.e("gdrive-service/handle-intent started without an action.");
    }

    public GoogleBackupService() {
        super(GoogleBackupService.class.getCanonicalName());
    }

    public final String A05() {
        Me A0F2 = this.A04.A0F();
        if (A0F2 == null) {
            Log.i("gdrive-service/my-jid/me is null, can't proceed");
            return null;
        }
        String str = A0F2.jabber_id;
        if (str != null) {
            return str;
        }
        Log.e("gdrive-service/my-jid/jidUser is null, fatal error.");
        return null;
    }

    public final void A06() {
        if (!this.A0e) {
            this.A0h.addAll(C06540Yd.A02(this.A02));
            this.A0e = true;
        }
    }

    public final void A08(Intent intent, String str) {
        String A0X2;
        String stringExtra = intent.getStringExtra("old_phone_number");
        String stringExtra2 = intent.getStringExtra("new_phone_number");
        if (stringExtra == null) {
            A0X2 = "gdrive-service/handle-intent change number requested but old phone number was not passed in the request.";
        } else if (stringExtra2 == null) {
            A0X2 = "gdrive-service/handle-intent change number requested but new phone number was not passed in the request.";
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("gdrive-service/handle-intent about to change number from ");
            A0o.append(stringExtra);
            Log.i(AnonymousClass000.A0V(" to ", stringExtra2, A0o));
            boolean A0I2 = A0I(stringExtra, stringExtra2, str);
            StringBuilder A0m = AnonymousClass000.A0m("gdrive-service/handle-intent change number (from old number ", stringExtra);
            A0m.append(" to ");
            if (A0I2) {
                A0m.append(stringExtra2);
                Log.i(AnonymousClass000.A0X(") succeeded.", A0m));
                return;
            }
            A0m.append(stringExtra2);
            A0X2 = AnonymousClass000.A0X(") failed.", A0m);
        }
        Log.e(A0X2);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x0050=Splitter:B:27:0x0050, B:31:0x0057=Splitter:B:31:0x0057, B:23:0x0049=Splitter:B:23:0x0049} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(android.content.Intent r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r7 = "success"
            java.lang.String r2 = "failed"
            java.lang.String r6 = "gdrive-service/handle-intent"
            java.util.concurrent.atomic.AtomicBoolean r5 = r8.A0i
            r0 = 1
            boolean r0 = r5.getAndSet(r0)
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = "gdrive-service/handle-intent another deletion is already running."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0015:
            r4 = 0
            java.lang.String r0 = "jid_user"
            java.lang.String r0 = r9.getStringExtra(r0)     // Catch:{ 0EW -> 0x0055, 0EX -> 0x004e, 0EN -> 0x0047, 0EL -> 0x0044, all -> 0x0073 }
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "gdrive-service/handle-intent DELETE called with no number."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 0EW -> 0x0055, 0EX -> 0x004e, 0EN -> 0x0047, 0EL -> 0x0044, all -> 0x0073 }
            goto L_0x0067
        L_0x0024:
            boolean r3 = r8.A0H(r0, r10)     // Catch:{ 0EW -> 0x0055, 0EX -> 0x004e, 0EN -> 0x0047, 0EL -> 0x0044, all -> 0x0073 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 0EW -> 0x0042, 0EX -> 0x0040, 0EN -> 0x003e, 0EL -> 0x003c }
            java.lang.String r0 = "gdrive-service/handle-intent/delete-all-files/"
            r1.append(r0)     // Catch:{ 0EW -> 0x0042, 0EX -> 0x0040, 0EN -> 0x003e, 0EL -> 0x003c }
            if (r3 != 0) goto L_0x0034
            r7 = r2
        L_0x0034:
            java.lang.String r0 = X.AnonymousClass000.A0X(r7, r1)     // Catch:{ 0EW -> 0x0042, 0EX -> 0x0040, 0EN -> 0x003e, 0EL -> 0x003c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 0EW -> 0x0042, 0EX -> 0x0040, 0EN -> 0x003e, 0EL -> 0x003c }
            goto L_0x0068
        L_0x003c:
            r2 = move-exception
            goto L_0x005c
        L_0x003e:
            r2 = move-exception
            goto L_0x0049
        L_0x0040:
            r2 = move-exception
            goto L_0x0050
        L_0x0042:
            r2 = move-exception
            goto L_0x0057
        L_0x0044:
            r2 = move-exception
            r3 = 0
            goto L_0x005c
        L_0x0047:
            r2 = move-exception
            r3 = 0
        L_0x0049:
            X.0Ww r1 = r8.A09     // Catch:{ all -> 0x0071 }
            r0 = 19
            goto L_0x0060
        L_0x004e:
            r2 = move-exception
            r3 = 0
        L_0x0050:
            X.0Ww r1 = r8.A09     // Catch:{ all -> 0x0071 }
            r0 = 11
            goto L_0x0060
        L_0x0055:
            r2 = move-exception
            r3 = 0
        L_0x0057:
            X.0Ww r1 = r8.A09     // Catch:{ all -> 0x0071 }
            r0 = 12
            goto L_0x0060
        L_0x005c:
            X.0Ww r1 = r8.A09     // Catch:{ all -> 0x0071 }
            r0 = 25
        L_0x0060:
            r1.A0C(r0)     // Catch:{ all -> 0x0071 }
            com.whatsapp.util.Log.e(r6, r2)     // Catch:{ all -> 0x0071 }
            goto L_0x0068
        L_0x0067:
            r3 = 0
        L_0x0068:
            r5.set(r4)
            X.0F1 r0 = r8.A0A
            r0.A0b(r3)
            return
        L_0x0071:
            r1 = move-exception
            goto L_0x0075
        L_0x0073:
            r1 = move-exception
            r3 = 0
        L_0x0075:
            r5.set(r4)
            X.0F1 r0 = r8.A0A
            r0.A0b(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.GoogleBackupService.A09(android.content.Intent, java.lang.String):void");
    }

    public final void A0A(Intent intent, String str, boolean z) {
        String str2;
        boolean booleanExtra = intent.getBooleanExtra("only_if_pending", false);
        Log.i("gdrive-service/handle-intent/backup");
        String str3 = str;
        boolean A1W = AnonymousClass001.A1W(((System.currentTimeMillis() - this.A0L.A0R(str3)) > 3600000 ? 1 : ((System.currentTimeMillis() - this.A0L.A0R(str3)) == 3600000 ? 0 : -1)));
        if (!booleanExtra || C06540Yd.A0J(this.A0L)) {
            boolean z2 = z;
            if (z || A1W) {
                if (this.A0X.A09()) {
                    str2 = "gdrive-service/handle-intent/backup WhatsApp Login has failed, google drive backup aborted";
                } else if (this.A0K.A0H()) {
                    Log.e("gdrive-service/handle-intent/backup/read-storage-permission-denied/aborting-backup");
                    this.A09.A0C(23);
                    return;
                } else if (C06540Yd.A0K(this.A0L)) {
                    str2 = "gdrive-service/handle-intent/backup cannot start backup, media restore in pending";
                } else if (this.A08.A0w(true)) {
                    str2 = "gdrive-service/handle-intent/backup another backup is already running.";
                } else {
                    if (this.A0L.A07() != 10) {
                        this.A09.A0C(10);
                    }
                    this.A0E.A00(2, true);
                    try {
                        this.A08.A09();
                        String A052 = A05();
                        if (A052 == null) {
                            Log.e("gdrive-service/handle-intent/backup jid is null.");
                            this.A08.A0S();
                            this.A0E.A00(2, false);
                            this.A09.A0B();
                            return;
                        }
                        A06();
                        C54292oU r33 = this.A0J;
                        C56612sH r32 = this.A0I;
                        AnonymousClass1VX r7 = this.A0T;
                        C55682qk r50 = this.A01;
                        C64393Dh r6 = this.A02;
                        AnonymousClass4FV r40 = this.A0U;
                        AnonymousClass310 r30 = this.A0F;
                        AnonymousClass31C r42 = this.A0W;
                        C34171uL r27 = this.A0a;
                        AnonymousClass0WN r25 = this.A06;
                        C04450Oi r5 = new C04450Oi(r6, this.A0L, r7);
                        C56512s6 r24 = this.A0G;
                        C625835r r23 = this.A0O;
                        C72303dV r22 = this.A0Q;
                        AnonymousClass0QR r26 = this.A0D;
                        AnonymousClass5ZR r21 = this.A0K;
                        AnonymousClass33p r19 = this.A0L;
                        C183538qC r18 = this.A0b;
                        C613830m r17 = this.A0M;
                        AnonymousClass0U8 r15 = this.A05;
                        AnonymousClass0WF r14 = this.A07;
                        C10240hc r13 = this.A08;
                        ArrayList arrayList = this.A0h;
                        AnonymousClass0QJ r0 = this.A0B;
                        AtomicLong atomicLong = r0.A07;
                        AtomicLong atomicLong2 = r0.A06;
                        AnonymousClass0Y7 A042 = this.A09.A04(str3, "backup");
                        C06260Ww r1 = this.A09;
                        AnonymousClass0EF r3 = new AnonymousClass0EF(this.A08, r1, this.A0B);
                        AnonymousClass0F1 r2 = this.A0A;
                        C55682qk r172 = r50;
                        C64393Dh r182 = r6;
                        AnonymousClass0U8 r192 = r15;
                        AnonymousClass0WN r212 = r25;
                        AnonymousClass0WF r222 = r14;
                        C10240hc r232 = r13;
                        AnonymousClass0F1 r242 = r2;
                        C04450Oi r252 = r5;
                        AnonymousClass0EF r272 = r3;
                        boolean A0L2 = new AnonymousClass0YL(r172, r182, r192, C06430Xr.A02(this.A0R, this.A0T), r212, r222, r232, r242, r252, r26, r272, A042, new C17980wY(this, 0), r30, r24, r32, r33, r21, r19, r17, r23, r22, r7, r40, r1.A06(z2), r42, r27, r18, A052, arrayList, atomicLong, atomicLong2, z2).A0L();
                        this.A08.A0S();
                        this.A0E.A00(2, false);
                        this.A09.A0B();
                        if (A0L2 && this.A06.A0G() && this.A0L.A0G(str3) == 1) {
                            C34171uL r4 = this.A0a;
                            Random random = this.A0d;
                            GoogleEncryptedReUploadWorker.A02(C02320Fs.KEEP, this.A0L, r4, random, !z);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        this.A08.A0S();
                        this.A0E.A00(2, false);
                        this.A09.A0B();
                        throw th;
                    }
                }
                Log.e(str2);
                return;
            }
        }
        Log.i("gdrive-service/handle-intent/backup automated backup called too early, ignored");
    }

    public void A0B(String str) {
        AnonymousClass0Y7 A042 = this.A09.A04(str, (String) null);
        try {
            if (!A042.A0H()) {
                Log.e("gdrive-service/v2/list-files failed to make auth");
                return;
            }
            String A052 = A05();
            if (A052 == null) {
                Log.e("gdrive-service/v2/list-files no jid");
                return;
            }
            C05580Ub A092 = A042.A09(A052);
            if (A092 == null) {
                Log.e(AnonymousClass000.A0V("gdrive-service/v2/list-files no backup for ", A052, AnonymousClass001.A0o()));
                return;
            }
            String str2 = null;
            do {
                Pair A072 = A042.A07(A092.A0B, str2, (String) null, 1000);
                if (A072 != null) {
                    str2 = (String) A072.second;
                    for (Object A0P2 : (List) A072.first) {
                        Log.d(AnonymousClass000.A0P(A0P2, "gdrive-service/v2/list-files ", AnonymousClass001.A0o()));
                    }
                } else {
                    return;
                }
            } while (!TextUtils.isEmpty(str2));
        } catch (AnonymousClass0EI | AnonymousClass0EL | AnonymousClass0EU | AnonymousClass0EW | AnonymousClass0EX e) {
            Log.e("gdrive-service/v2/list-files failed", e);
        }
    }

    public final void A0D(String str) {
        String A0a2 = this.A0L.A0a();
        if (TextUtils.isEmpty(A0a2)) {
            Log.e("restore>google-service/restore-messages jid is null");
            this.A09.A0C(18);
            return;
        }
        C56612sH r7 = this.A0I;
        C55682qk r10 = this.A01;
        AnonymousClass310 r6 = this.A0F;
        C25911bH A072 = this.A09.A07();
        C06260Ww r1 = this.A09;
        C04710Qi r15 = r1.A0E;
        AnonymousClass1VW r5 = this.A0S;
        AnonymousClass0Y7 A042 = r1.A04(str, "restore");
        C623834u r4 = this.A0Z;
        C625835r r3 = this.A0O;
        C06430Xr A022 = C06430Xr.A02(this.A0R, this.A0T);
        C06260Ww r14 = this.A09;
        AnonymousClass5ZR r2 = this.A0K;
        AnonymousClass33p r12 = this.A0L;
        AtomicLong atomicLong = this.A0B.A04;
        Objects.requireNonNull(atomicLong);
        AnonymousClass33p r20 = r12;
        AnonymousClass5ZR r19 = r2;
        C56612sH r18 = r7;
        AnonymousClass310 r17 = r6;
        this.A0c = new AnonymousClass0UV(this, r10, A022, new C10180hW(atomicLong), this.A08, r14, r15, A042, r17, r18, r19, r20, r3, this.A0P, r5, A072, r4, A0a2).A02(this.A0A);
    }

    public final void A0E(String str) {
        String A0a2 = this.A0L.A0a();
        if (TextUtils.isEmpty(A0a2)) {
            Log.e("restore>google-service/restore-messages jidUser is null");
            this.A09.A0C(18);
            return;
        }
        C56612sH r16 = this.A0I;
        C55682qk r34 = this.A01;
        C64393Dh r33 = this.A02;
        AnonymousClass4FV r15 = this.A0U;
        AnonymousClass310 r14 = this.A0F;
        AnonymousClass0Y7 A042 = this.A09.A04(str, "restore");
        C59302wh r13 = this.A0V;
        AnonymousClass0WN r11 = this.A06;
        AnonymousClass319 r10 = this.A0N;
        C618232j r9 = this.A0Y;
        C06260Ww r8 = this.A09;
        AnonymousClass5ZR r7 = this.A0K;
        AnonymousClass33p r6 = this.A0L;
        C10240hc r5 = this.A08;
        AnonymousClass0F1 r4 = this.A0A;
        C25911bH A072 = r8.A07();
        AnonymousClass0QJ r0 = this.A0B;
        AtomicLong atomicLong = r0.A05;
        AtomicLong atomicLong2 = r0.A04;
        C10240hc r162 = r5;
        C06260Ww r17 = r8;
        AnonymousClass0F1 r18 = r4;
        C04710Qi r19 = this.A09.A0D;
        C55682qk r132 = r34;
        C64393Dh r142 = r33;
        AnonymousClass0WN r152 = r11;
        new AnonymousClass0UW(this, r132, r142, r152, r162, r17, r18, r19, A042, r14, r16, r7, r6, r10, r15, A072, r13, r9, A0a2, atomicLong, atomicLong2).A04(this.A0c);
    }

    public final boolean A0F() {
        try {
            for (C04610Pv r0 : (List) ((C06310Xb) this.A0a.get()).A04("com.whatsapp.backup.google.google-backup-worker").get()) {
                if (r0.A03 == AnonymousClass0GD.RUNNING) {
                    return true;
                }
            }
            return false;
        } catch (InterruptedException | ExecutionException unused) {
            return false;
        }
    }

    public final boolean A0H(String str, String str2) {
        AnonymousClass0Y7 A042 = this.A09.A04(str2, (String) null);
        if (!C06520Ya.A0C(this.A08.A0L, A042)) {
            Log.e("gdrive-service/delete-backup/failed-to-fetch-auth-token");
        } else {
            Boolean bool = (Boolean) AnonymousClass0X8.A01(new AnonymousClass0Dm(this, A042, str), this.A08.A0L, "gdrive-service/delete-backup");
            if (bool == null || !bool.booleanValue()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A0I(String str, String str2, String str3) {
        C06260Ww r1;
        int i;
        try {
            AnonymousClass0Y7 A042 = this.A09.A04(str3, (String) null);
            if (!C06520Ya.A0C(this.A08.A0L, A042)) {
                Log.i("gdrive-service/change-number/failed-to-fetch-auth-token");
                this.A09.A0C(11);
                return false;
            }
            C05580Ub A012 = C06520Ya.A01(this.A08.A0L, A042, str, "gdrive-service/change-number-v2");
            if (A012 == null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("gdrive-service/change-number-v2 fetching backup name ");
                A0o.append(str);
                Log.e(AnonymousClass000.A0X(" returned null, unexpected.", A0o));
                return false;
            }
            Boolean bool = (Boolean) AnonymousClass0X8.A01(new AnonymousClass0Dw(this, A012, str2, str), this.A08.A0L, "gdrive-service/change-number-v2");
            if (bool == null || !bool.booleanValue()) {
                return false;
            }
            return true;
        } catch (AnonymousClass0EW e) {
            this.A09.A0C(12);
            Log.e((Throwable) e);
            return false;
        } catch (AnonymousClass0EX e2) {
            e = e2;
            this.A09.A0C(11);
            Log.e("gdrive-service/change-number-v2", e);
            return false;
        } catch (AnonymousClass0EJ | AnonymousClass0EN e3) {
            e = e3;
            this.A09.A0C(19);
            Log.e("gdrive-service/change-number-v2", e);
            return false;
        } catch (AnonymousClass0EY e4) {
            e = e4;
            r1 = this.A09;
            i = 17;
            r1.A0C(i);
            Log.e("gdrive-service/change-number-v2", e);
            return false;
        } catch (AnonymousClass0EL e5) {
            e = e5;
            r1 = this.A09;
            i = 25;
            r1.A0C(i);
            Log.e("gdrive-service/change-number-v2", e);
            return false;
        }
    }

    public final void A0C(String str) {
        try {
            if (A0G(str)) {
                this.A0A.A0G();
            }
        } catch (AnonymousClass0EL | AnonymousClass0EN | AnonymousClass0EW | AnonymousClass0EX e) {
            Log.e("gdrive-service/handle-intent/action_fetch_backup_info", e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0G(java.lang.String r10) {
        /*
            r9 = this;
            X.C626936e.A00()
            X.33p r0 = r9.A0L
            boolean r0 = r0.A2M(r10)
            r6 = 0
            if (r0 != 0) goto L_0x002a
            X.0Ww r1 = r9.A09
            r0 = 0
            X.0Y7 r3 = r1.A04(r10, r0)
            X.0hc r0 = r9.A08
            X.0Qi r0 = r0.A0L
            boolean r0 = X.C06520Ya.A0C(r0, r3)
            if (r0 != 0) goto L_0x002b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "gdrive-service/fetch-account-data-v2/auth-failed/"
            java.lang.String r0 = X.AnonymousClass0YV.A0B(r0, r10, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x002a:
            return r6
        L_0x002b:
            java.lang.String r2 = r9.A05()
            if (r2 == 0) goto L_0x002a
            X.0hc r0 = r9.A08
            X.0Qi r1 = r0.A0L
            java.lang.String r0 = "gdrive-service/fetch-account-data-v2"
            X.0Ub r8 = X.C06520Ya.A01(r1, r3, r2, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r8 != 0) goto L_0x005a
            java.lang.String r0 = "gdrive-service/fetch-account-data-v2/no backup found/"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "/"
            java.lang.String r0 = X.AnonymousClass0YV.A0B(r0, r10, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33p r2 = r9.A0L
            r0 = 0
            r2.A1c(r10, r0)
            return r6
        L_0x005a:
            java.lang.String r0 = "gdrive-service/fetch-account-data-v2/setting-backup-data-for "
            X.AnonymousClass0YV.A0E(r0, r10, r1)
            java.lang.String r0 = " data: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r8, r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33p r2 = r9.A0L
            long r0 = r8.A05
            r2.A1c(r10, r0)
            X.33p r2 = r9.A0L
            long r0 = r8.A04
            r2.A1d(r10, r0)
            X.33p r7 = r9.A0L
            java.lang.String r3 = "mediaSize"
            r1 = -1
            org.json.JSONObject r5 = r8.A0C
            if (r5 == 0) goto L_0x00ca
            boolean r0 = r5.has(r3)
            if (r0 == 0) goto L_0x00bf
            long r3 = r5.optLong(r3, r1)
        L_0x008a:
            r7.A1b(r10, r3)
            X.33p r4 = r9.A0L
            java.lang.String r3 = "videoSize"
            if (r5 == 0) goto L_0x00bc
            boolean r0 = r5.has(r3)
            if (r0 == 0) goto L_0x00b1
            long r0 = r5.optLong(r3, r1)
        L_0x009d:
            r4.A1e(r10, r0)
            X.33p r1 = r9.A0L
            if (r5 != 0) goto L_0x00aa
            r0 = 0
        L_0x00a5:
            r1.A1l(r10, r0)
            r0 = 1
            return r0
        L_0x00aa:
            java.lang.String r0 = "encryptedBackupEnabled"
            boolean r0 = r5.optBoolean(r0, r6)
            goto L_0x00a5
        L_0x00b1:
            org.json.JSONObject r0 = r8.A05()
            if (r0 == 0) goto L_0x00bc
            long r0 = r0.optLong(r3, r1)
            goto L_0x009d
        L_0x00bc:
            r0 = -1
            goto L_0x009d
        L_0x00bf:
            org.json.JSONObject r0 = r8.A05()
            if (r0 == 0) goto L_0x00ca
            long r3 = r0.optLong(r3, r1)
            goto L_0x008a
        L_0x00ca:
            r3 = -1
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.GoogleBackupService.A0G(java.lang.String):boolean");
    }

    public void onCreate() {
        super.onCreate();
        this.A0C.A0I();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0A.A0H();
        AnonymousClass0QJ r3 = this.A0B;
        r3.A06.set(0);
        r3.A05.set(0);
        r3.A04.set(0);
        r3.A07.set(0);
        r3.A03.set(0);
        this.A0C.A0J();
        if (!A0F()) {
            this.A09.A08();
            AnonymousClass0X8.A03();
        }
        this.A08.A0S();
        this.A08.A0Z(false);
    }

    public void onHandleIntent(Intent intent) {
        Log.d(AnonymousClass000.A0P(intent, "gdrive-service/onHandleIntent: ", AnonymousClass001.A0o()));
        A07(intent);
        if (intent != null) {
            synchronized (this.A0g) {
                int i = this.A00;
                if (i > 0) {
                    int i2 = i - 1;
                    this.A00 = i2;
                    if (i2 == 0) {
                        stopForeground(true);
                    }
                }
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Notification A0A2;
        Log.d(AnonymousClass000.A0P(intent, "gdrive-service/onStartCommand: ", AnonymousClass001.A0o()));
        int onStartCommand = super.onStartCommand(intent, i, i2);
        if (intent == null) {
            return onStartCommand;
        }
        synchronized (this.A0g) {
            AnonymousClass327.A00(this.A0J.A06(), this.A0H);
            Notification A0B2 = this.A0C.A0B(this.A0J.A07(), intent.getAction());
            if (!(this.A00 == 0 || (A0A2 = this.A0C.A0A()) == null)) {
                A0B2 = A0A2;
            }
            this.A0C.A0F();
            try {
                startForeground(5, A0B2);
                this.A00++;
            } catch (IllegalStateException e) {
                Log.w("Failed to start foreground service GoogleBackupService", e);
                stopSelf();
            }
        }
        return onStartCommand;
    }

    public IBinder onBind(Intent intent) {
        return this.A0f;
    }
}
