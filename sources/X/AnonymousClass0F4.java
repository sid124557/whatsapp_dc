package X;

import android.accounts.Account;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0F4  reason: invalid class name */
public class AnonymousClass0F4 extends AnonymousClass5ZM {
    public final C69263Wi A00;
    public final C10240hc A01;
    public final C06320Xc A02;
    public final AnonymousClass310 A03;
    public final C54292oU A04;
    public final AnonymousClass33p A05;
    public final C625835r A06;
    public final AnonymousClass1VW A07;
    public final AnonymousClass33M A08 = new AnonymousClass33M("gdrive-activity/one-time-setup");
    public final WeakReference A09;
    public final Set A0A;
    public final Timer A0B = new Timer("perform-one-time-setup");
    public final AtomicBoolean A0C;
    public final AtomicBoolean A0D;
    public final Account[] A0E;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        if (this.A09.get() == null) {
            return null;
        }
        return A0G();
    }

    public void A0A() {
        this.A0B.schedule(new C13960o1(this), C625635p.A0L);
    }

    public final AnonymousClass0UH A0H(String str, String str2) {
        try {
            return this.A02.A06(str, str2);
        } catch (AnonymousClass0EL e) {
            Log.i(AnonymousClass0YV.A0B("restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/google drive api disabled on google side for ", str, AnonymousClass001.A0o()), e);
            return null;
        }
    }

    /* renamed from: A0I */
    public void A0C(AnonymousClass0UH r8) {
        RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A09.get();
        if (restoreFromBackupActivity != null) {
            restoreFromBackupActivity.A7n(r8);
        }
        Locale locale = Locale.ENGLISH;
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass33M r4 = this.A08;
        A0L[0] = Double.valueOf(((double) r4.A06()) / 1000.0d);
        String.format(locale, "Load time: %.2f seconds", A0L);
        r4.A07();
        this.A0B.cancel();
    }

    public AnonymousClass0F4(C69263Wi r3, C10240hc r4, RestoreFromBackupActivity restoreFromBackupActivity, C06320Xc r6, AnonymousClass310 r7, C54292oU r8, AnonymousClass33p r9, C625835r r10, AnonymousClass1VW r11, Set set, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, Account[] accountArr) {
        this.A00 = r3;
        this.A0E = accountArr;
        this.A04 = r8;
        this.A03 = r7;
        this.A07 = r11;
        this.A0A = set;
        this.A0D = atomicBoolean;
        this.A09 = new WeakReference(restoreFromBackupActivity);
        this.A06 = r10;
        this.A05 = r9;
        this.A02 = r6;
        this.A0C = atomicBoolean2;
        this.A01 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00df, code lost:
        if (r3 != null) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e7, code lost:
        if (X.AnonymousClass0S8.A00(r11.A07) == false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e9, code lost:
        r3 = r11.A0D;
        r3.set(X.C06540Yd.A0P(r5, r6.A0a(), r5.A0R(), r3.get()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ff, code lost:
        r3 = r11.A0D;
        r3.set(X.C06540Yd.A0O(r5, r5.A0K(), r6.A0a(), r3.get()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0115, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        com.whatsapp.util.Log.w((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x011e, code lost:
        if (r3.A03() == false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0120, code lost:
        r16 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass0UH A0G() {
        /*
            r17 = this;
            X.C626936e.A00()
            r11 = r17
            X.35r r5 = r11.A06
            X.33p r6 = r11.A05
            X.2oU r0 = r11.A04
            android.content.Context r0 = r0.A06()
            boolean r0 = X.C159787mS.A01(r0)
            r16 = 0
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/google-play-services-not-available"
        L_0x0019:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r16
        L_0x001d:
            java.lang.String r13 = r6.A0a()
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/jid-user is null"
            goto L_0x0019
        L_0x002a:
            X.0hc r4 = r11.A01
            r4.A0U()
            android.accounts.Account[] r12 = r11.A0E     // Catch:{ all -> 0x0126 }
            int r10 = r12.length     // Catch:{ all -> 0x0126 }
            r9 = 0
            r3 = r16
        L_0x0035:
            if (r9 >= r10) goto L_0x00df
            r8 = r12[r9]     // Catch:{ all -> 0x0126 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A0C     // Catch:{ all -> 0x0126 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/canceled"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0126 }
            goto L_0x0122
        L_0x0048:
            java.util.Set r7 = r11.A0A     // Catch:{ all -> 0x0126 }
            boolean r0 = r7.contains(r8)     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x0067
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = "one-time-setup/skipping-account-with-no-backup/"
            r1.append(r0)     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = r8.name     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = X.AnonymousClass0YV.A0A(r0)     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0126 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0126 }
            goto L_0x00db
        L_0x0067:
            java.lang.String r15 = r8.name     // Catch:{ all -> 0x0126 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = "one-time-setup/looking for google backups in "
            java.lang.String r0 = X.AnonymousClass0YV.A0B(r0, r15, r1)     // Catch:{ all -> 0x0126 }
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0126 }
            X.0UH r14 = r11.A0H(r15, r13)     // Catch:{ 0EW -> 0x00b1, 0EX -> 0x00af, 0EN -> 0x00ad, 0EL -> 0x00ab, 0EK -> 0x00a9 }
            if (r14 != 0) goto L_0x008d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 0EW -> 0x00b1, 0EX -> 0x00af, 0EN -> 0x00ad, 0EL -> 0x00ab, 0EK -> 0x00a9 }
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/account-with-no-backup/"
            java.lang.String r0 = X.AnonymousClass0YV.A0B(r0, r15, r1)     // Catch:{ 0EW -> 0x00b1, 0EX -> 0x00af, 0EN -> 0x00ad, 0EL -> 0x00ab, 0EK -> 0x00a9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 0EW -> 0x00b1, 0EX -> 0x00af, 0EN -> 0x00ad, 0EL -> 0x00ab, 0EK -> 0x00a9 }
            r7.add(r8)     // Catch:{ 0EW -> 0x00b1, 0EX -> 0x00af, 0EN -> 0x00ad, 0EL -> 0x00ab, 0EK -> 0x00a9 }
            goto L_0x00db
        L_0x008d:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ 0EW -> 0x00b1, 0EX -> 0x00af, 0EN -> 0x00ad, 0EL -> 0x00ab, 0EK -> 0x00a9 }
            java.lang.String r1 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup "
            X.AnonymousClass0YV.A0E(r1, r15, r0)     // Catch:{ 0EW -> 0x00b1, 0EX -> 0x00af, 0EN -> 0x00ad, 0EL -> 0x00ab, 0EK -> 0x00a9 }
            java.lang.String r1 = " has google backup created on "
            r0.append(r1)     // Catch:{ 0EW -> 0x00b1, 0EX -> 0x00af, 0EN -> 0x00ad, 0EL -> 0x00ab, 0EK -> 0x00a9 }
            long r1 = r14.A04     // Catch:{ 0EW -> 0x00b1, 0EX -> 0x00af, 0EN -> 0x00ad, 0EL -> 0x00ab, 0EK -> 0x00a9 }
            java.lang.String r0 = X.AnonymousClass001.A0k(r0, r1)     // Catch:{ 0EW -> 0x00b1, 0EX -> 0x00af, 0EN -> 0x00ad, 0EL -> 0x00ab, 0EK -> 0x00a9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 0EW -> 0x00b1, 0EX -> 0x00af, 0EN -> 0x00ad, 0EL -> 0x00ab, 0EK -> 0x00a9 }
            if (r3 == 0) goto L_0x00da
            long r7 = r3.A04     // Catch:{ 0EW -> 0x00b1, 0EX -> 0x00af, 0EN -> 0x00ad, 0EL -> 0x00ab, 0EK -> 0x00a9 }
            goto L_0x00d6
        L_0x00a9:
            r2 = move-exception
            goto L_0x00b2
        L_0x00ab:
            r2 = move-exception
            goto L_0x00b2
        L_0x00ad:
            r2 = move-exception
            goto L_0x00b2
        L_0x00af:
            r2 = move-exception
            goto L_0x00b2
        L_0x00b1:
            r2 = move-exception
        L_0x00b2:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup failed to access account: "
            java.lang.String r0 = X.AnonymousClass0YV.A0B(r0, r15, r1)     // Catch:{ all -> 0x0126 }
            com.whatsapp.util.Log.i(r0, r2)     // Catch:{ all -> 0x0126 }
            boolean r0 = X.C06540Yd.A0M(r6)     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x00db
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/new-user/add-account-to-no-backup-found "
            java.lang.String r0 = X.AnonymousClass0YV.A0B(r0, r15, r1)     // Catch:{ all -> 0x0126 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0126 }
            r7.add(r8)     // Catch:{ all -> 0x0126 }
            goto L_0x00db
        L_0x00d6:
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x00db
        L_0x00da:
            r3 = r14
        L_0x00db:
            int r9 = r9 + 1
            goto L_0x0035
        L_0x00df:
            if (r3 != 0) goto L_0x011a
            X.1VW r0 = r11.A07     // Catch:{ IOException -> 0x0115 }
            boolean r0 = X.AnonymousClass0S8.A00(r0)     // Catch:{ IOException -> 0x0115 }
            if (r0 == 0) goto L_0x00ff
            java.util.concurrent.atomic.AtomicBoolean r3 = r11.A0D     // Catch:{ IOException -> 0x0115 }
            java.util.List r2 = r5.A0R()     // Catch:{ IOException -> 0x0115 }
            boolean r1 = r3.get()     // Catch:{ IOException -> 0x0115 }
            java.lang.String r0 = r6.A0a()     // Catch:{ IOException -> 0x0115 }
            boolean r0 = X.C06540Yd.A0P(r5, r0, r2, r1)     // Catch:{ IOException -> 0x0115 }
            r3.set(r0)     // Catch:{ IOException -> 0x0115 }
            goto L_0x0122
        L_0x00ff:
            java.util.concurrent.atomic.AtomicBoolean r3 = r11.A0D     // Catch:{ IOException -> 0x0115 }
            java.io.File r2 = r5.A0K()     // Catch:{ IOException -> 0x0115 }
            boolean r1 = r3.get()     // Catch:{ IOException -> 0x0115 }
            java.lang.String r0 = r6.A0a()     // Catch:{ IOException -> 0x0115 }
            boolean r0 = X.C06540Yd.A0O(r5, r2, r0, r1)     // Catch:{ IOException -> 0x0115 }
            r3.set(r0)     // Catch:{ IOException -> 0x0115 }
            goto L_0x0122
        L_0x0115:
            r0 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)     // Catch:{ all -> 0x0126 }
            goto L_0x0122
        L_0x011a:
            boolean r0 = r3.A03()     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x0122
            r16 = r3
        L_0x0122:
            r4.A0L()
            return r16
        L_0x0126:
            r0 = move-exception
            r4.A0L()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0F4.A0G():X.0UH");
    }
}
