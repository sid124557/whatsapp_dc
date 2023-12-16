package X;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.IntentSender;
import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;

/* renamed from: X.0Yd  reason: invalid class name and case insensitive filesystem */
public final class C06540Yd {
    public static final Executor A00;

    public static int A00(AnonymousClass33p r4, boolean z) {
        if (!z) {
            int A05 = r4.A05();
            if (A05 != 0) {
                int i = 1;
                if (A05 != 1) {
                    i = 2;
                    if (A05 != 2) {
                        i = 3;
                        if (A05 != 3) {
                            if (A05 != 4) {
                                return 0;
                            }
                        }
                    }
                }
                return i;
            }
            return 0;
        }
        return 4;
    }

    public static void A0C(AnonymousClass33p r1) {
        r1.A17(0);
    }

    public static void A0D(AnonymousClass33p r1) {
        r1.A17(2);
    }

    public static /* synthetic */ void A0G(BufferedInputStream bufferedInputStream, AtomicBoolean atomicBoolean, HttpsURLConnection httpsURLConnection) {
        atomicBoolean.set(false);
        httpsURLConnection.disconnect();
        C624535b.A03(bufferedInputStream);
    }

    public static boolean A0I(C10240hc r9, File file, List list) {
        if (r9 == null || r9.A0r()) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(file);
            while (linkedList.peek() != null) {
                Object poll = linkedList.poll();
                C626936e.A06(poll);
                File file2 = (File) poll;
                if (!file2.exists()) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    AnonymousClass000.A10(file2, "gdrive-util/get-files-in-folder/does-not-exist ", A0o);
                    Log.w(A0o.toString());
                } else if (file2.isDirectory()) {
                    File[] listFiles = file2.listFiles();
                    if (listFiles != null) {
                        for (File file3 : listFiles) {
                            if (!file3.exists()) {
                                StringBuilder A0o2 = AnonymousClass001.A0o();
                                AnonymousClass000.A10(file3, "gdrive-util/get-files-in-folder/does-not-exist ", A0o2);
                                Log.w(A0o2.toString());
                            } else if (file3.isDirectory()) {
                                linkedList.add(file3);
                            } else if (file3.length() > 0) {
                                list.add(file3);
                            }
                        }
                    }
                } else if (file2.length() > 0) {
                    list.add(file2);
                }
                list.size();
            }
            return true;
        }
        StringBuilder A0o3 = AnonymousClass001.A0o();
        AnonymousClass000.A10(file, "gdrive-util/get-files-in-folder/timeout ", A0o3);
        Log.e(A0o3.toString());
        return false;
    }

    public static boolean A0N(AnonymousClass33p r7, AnonymousClass1VX r8, long j, long j2, long j3) {
        if (j3 <= 86400000) {
            return true;
        }
        long j4 = j - j2;
        if (j4 < j3 - 86400000) {
            return false;
        }
        if (r7.A07() != 13) {
            return true;
        }
        long j5 = (j4 - j3) / 86400000;
        long A0N = (long) r8.A0N(4917);
        return j5 > 0 && A0N > 0 && j5 % A0N == 0;
    }

    public static boolean A0P(C625835r r3, String str, List list, boolean z) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!A0O(r3, (File) it.next(), str, z)) {
                return false;
            }
        }
        return true;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 2, (long) 1, TimeUnit.SECONDS, new C13990o4(), new C13730ne("Google Drive Write Worker #"));
        threadPoolExecutor.setRejectedExecutionHandler(new C17990wZ(0));
        A00 = threadPoolExecutor;
    }

    public static HostnameVerifier A04() {
        return new C72353da("backup.googleapis.com", new BrowserCompatHostnameVerifier());
    }

    public static void A07(AnonymousClass0Y7 r0, AnonymousClass5PA r1, boolean z) {
        if (r0 != null) {
            r0.A0G(z);
        }
        r1.A00(2, z);
    }

    public static boolean A0Q(AnonymousClass1VX r2) {
        if (Build.VERSION.SDK_INT < 30 || !r2.A0X(603)) {
            return false;
        }
        return true;
    }

    public static Dialog A01(Activity activity, DialogInterface.OnCancelListener onCancelListener, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gdrive-util/get-error-dialog creating dialog for ");
        Log.i(AnonymousClass000.A0X(AnonymousClass0YV.A01(i), A0o));
        C06720Yy r4 = new C06720Yy(activity, i, i2);
        C19340zH A002 = AnonymousClass5V0.A00(activity);
        A002.A0R(false);
        A002.setNegativeButton(R.string.f11nameremoved, new C17750wB(onCancelListener, 5));
        if (i == 0) {
            return null;
        }
        if (i == 1) {
            i3 = R.string.f11nameremoved;
            int i6 = R.string.f11nameremoved;
            if (z) {
                i6 = R.string.f11nameremoved;
            }
            i5 = R.string.f11nameremoved;
        } else if (i == 2) {
            i3 = R.string.f11nameremoved;
            int i7 = R.string.f11nameremoved;
            if (z) {
                i7 = R.string.f11nameremoved;
            }
            i5 = R.string.f11nameremoved;
        } else if (i != 3) {
            return C162117rH.A01(activity, onCancelListener, i, i2);
        } else {
            i3 = R.string.f11nameremoved;
            i4 = R.string.f11nameremoved;
            if (z) {
                i4 = R.string.f11nameremoved;
            }
            i5 = R.string.f11nameremoved;
        }
        A002.A0B(i3);
        A002.A0A(i4);
        A002.setPositiveButton(i5, r4);
        return A002.create();
    }

    public static List A02(C64393Dh r2) {
        ArrayList A0J = AnonymousClass002.A0J(r2.A0X());
        A0J.remove(r2.A0I());
        return A0J;
    }

    public static Executor A03(int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gdrive-util/max concurrent reads ");
        Log.i(AnonymousClass000.A0h(A0o, i));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, i, (long) 1, TimeUnit.SECONDS, new C13990o4(), new C13730ne("Google Drive Read Worker #"));
        threadPoolExecutor.setRejectedExecutionHandler(new C17990wZ(0));
        return threadPoolExecutor;
    }

    public static /* synthetic */ void A05(Activity activity, int i, int i2) {
        try {
            PendingIntent A02 = C162117rH.A02(activity, i, i2);
            if (A02 != null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("gdrive-util/get-error-dialog starting resolution for ");
                Log.e(AnonymousClass000.A0X(AnonymousClass0YV.A01(i), A0o));
                new C127866Tp(i, A02).A00(activity, i2);
                return;
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("gdrive-util/get-error-dialog pending intent is null for error code: ");
            Log.e(AnonymousClass000.A0X(AnonymousClass0YV.A01(i), A0o2));
        } catch (IntentSender.SendIntentException e) {
            Log.e("gdrive-util/get-error-dialog", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d3, code lost:
        if (r10 == null) goto L_0x00dd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(X.C16400tD r22, X.C04710Qi r23, X.C29441ip r24, X.AnonymousClass4FS r25, java.io.File r26, javax.net.ssl.HttpsURLConnection r27) {
        /*
            android.os.Handler r4 = X.AnonymousClass000.A0A()
            r11 = 1
            java.util.concurrent.atomic.AtomicBoolean r13 = new java.util.concurrent.atomic.AtomicBoolean
            r13.<init>(r11)
            r15 = -1
            r10 = 0
            r6 = r22
            r22 = r27
            java.io.InputStream r0 = r22.getInputStream()     // Catch:{ all -> 0x00ce }
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00ce }
            r8.<init>(r0)     // Catch:{ all -> 0x00ce }
            r5 = r24
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ all -> 0x00c2 }
            r12 = r26
            r9.<init>(r12, r11)     // Catch:{ all -> 0x00c2 }
            X.0he r7 = new X.0he     // Catch:{ all -> 0x00b4 }
            r18 = r25
            r21 = r13
            r17 = r7
            r19 = r8
            r20 = r12
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x00b4 }
            X.0lG r0 = new X.0lG     // Catch:{ all -> 0x00b4 }
            r0.<init>(r7, r5)     // Catch:{ all -> 0x00b4 }
            r4.post(r0)     // Catch:{ all -> 0x00b4 }
            r14 = 8192(0x2000, float:1.14794E-41)
            byte[] r10 = new byte[r14]     // Catch:{ all -> 0x00b1 }
            r2 = 0
        L_0x0040:
            boolean r0 = r23.A06()     // Catch:{ all -> 0x00ae }
            r1 = 0
            if (r0 != 0) goto L_0x0050
            r13.set(r1)     // Catch:{ all -> 0x00ae }
            r22.disconnect()     // Catch:{ all -> 0x00ae }
            X.C624535b.A03(r8)     // Catch:{ all -> 0x00ae }
        L_0x0050:
            boolean r0 = r13.get()     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x0080
            java.util.Locale r14 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00ae }
            java.lang.String r13 = "gdrive-util/write-file/disconnected after downloading %d bytes from %s to %s (new size: %d)"
            r0 = 4
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ all -> 0x00ae }
            X.AnonymousClass000.A1Q(r10, r1, r2)     // Catch:{ all -> 0x00ae }
            java.net.URL r0 = r22.getURL()     // Catch:{ all -> 0x00ae }
            r10[r11] = r0     // Catch:{ all -> 0x00ae }
            java.lang.String r1 = r12.getAbsolutePath()     // Catch:{ all -> 0x00ae }
            r0 = 2
            r10[r0] = r1     // Catch:{ all -> 0x00ae }
            long r0 = r12.length()     // Catch:{ all -> 0x00ae }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00ae }
            r0 = 3
            r10[r0] = r1     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = java.lang.String.format(r14, r13, r10)     // Catch:{ all -> 0x00ae }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ae }
            goto L_0x0095
        L_0x0080:
            int r0 = r8.read(r10, r1, r14)     // Catch:{ IllegalStateException -> 0x008f }
            if (r0 <= 0) goto L_0x0095
            r9.write(r10, r1, r0)     // Catch:{ all -> 0x00ae }
            long r0 = (long) r0     // Catch:{ all -> 0x00ae }
            long r2 = r2 + r0
            r6.BQd(r0)     // Catch:{ all -> 0x00ae }
            goto L_0x0040
        L_0x008f:
            r1 = move-exception
            java.lang.String r0 = "gdrive-util/write-file/connection-disconnected-during-read"
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x00ae }
        L_0x0095:
            r9.close()     // Catch:{ all -> 0x00ab }
            r8.close()     // Catch:{ all -> 0x00a8 }
            X.0lH r0 = new X.0lH
            r0.<init>(r7, r5)
            r4.post(r0)
            long r2 = r2 * r15
            r6.BQd(r2)
            return
        L_0x00a8:
            r1 = move-exception
            r10 = r7
            goto L_0x00d5
        L_0x00ab:
            r1 = move-exception
            r10 = r7
            goto L_0x00c5
        L_0x00ae:
            r1 = move-exception
            r10 = r7
            goto L_0x00b7
        L_0x00b1:
            r1 = move-exception
            r10 = r7
            goto L_0x00b5
        L_0x00b4:
            r1 = move-exception
        L_0x00b5:
            r2 = 0
        L_0x00b7:
            r9.close()     // Catch:{ all -> 0x00bb }
            goto L_0x00bf
        L_0x00bb:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00c0 }
        L_0x00bf:
            throw r1     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r1 = move-exception
            goto L_0x00c5
        L_0x00c2:
            r1 = move-exception
            r2 = 0
        L_0x00c5:
            r8.close()     // Catch:{ all -> 0x00c9 }
            goto L_0x00cd
        L_0x00c9:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00d2 }
        L_0x00cd:
            throw r1     // Catch:{ all -> 0x00d2 }
        L_0x00ce:
            r1 = move-exception
            r2 = 0
            goto L_0x00dd
        L_0x00d2:
            r1 = move-exception
            if (r10 == 0) goto L_0x00dd
        L_0x00d5:
            X.0lH r0 = new X.0lH
            r0.<init>(r10, r5)
            r4.post(r0)
        L_0x00dd:
            long r2 = r2 * r15
            r6.BQd(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06540Yd.A06(X.0tD, X.0Qi, X.1ip, X.4FS, java.io.File, javax.net.ssl.HttpsURLConnection):void");
    }

    public static boolean A0H(C64393Dh r2, File file) {
        try {
            return r2.A0d(file);
        } catch (IOException e) {
            Log.e(AnonymousClass000.A0P(file, "gdrive-util/in-media-folder ", AnonymousClass001.A0o()), e);
            return false;
        }
    }

    public static boolean A0J(AnonymousClass33p r0) {
        return AnonymousClass001.A1T(r0.A0A());
    }

    public static boolean A0K(AnonymousClass33p r1) {
        return AnonymousClass000.A1U(r1.A0A(), 2);
    }

    public static boolean A0L(AnonymousClass33p r1) {
        return AnonymousClass000.A1U(r1.A0A(), 3);
    }

    public static boolean A0M(AnonymousClass33p r2) {
        boolean A2D = r2.A2D();
        Log.i(AnonymousClass000.A0b("gdrive-util/is-new-jid/", AnonymousClass001.A0o(), A2D));
        return A2D;
    }

    public static boolean A0O(C625835r r6, File file, String str, boolean z) {
        String str2;
        Log.d(AnonymousClass000.A0P(file, "gdrive-util/validate local msgstore: ", AnonymousClass001.A0o()));
        if (file == null || !file.exists() || !z) {
            str2 = "gdrive-util/validate local msgstore does not exist or is unusable";
        } else if (file.length() == 0) {
            str2 = "gdrive-util/validate local msgstore exists but is empty.";
        } else if (r6.A0b(file, str)) {
            str2 = "gdrive-util/validate local msgstore exists but for a different jid.";
        } else if (r6.A0F().A0C(file)) {
            return true;
        } else {
            str2 = "gdrive-util/the backup is not supported.";
        }
        Log.i(str2);
        return false;
    }
}
