package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import com.whatsapp.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.55s  reason: invalid class name and case insensitive filesystem */
public class C994355s extends AnonymousClass5ZM {
    public final C29171iO A00;
    public final C64393Dh A01;
    public final C69263Wi A02;
    public final AnonymousClass310 A03;
    public final C620633i A04;
    public final C56612sH A05;
    public final C54292oU A06;
    public final AnonymousClass3DM A07;
    public final AnonymousClass4FS A08;
    public final WeakReference A09;
    public final AtomicLong A0A = new AtomicLong();

    public static String A00(Context context, Uri uri, String str) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, (String) null, (String[]) null, (String) null);
            if (cursor.moveToFirst() && !cursor.isNull(0)) {
                String string = cursor.getString(0);
                AnonymousClass0IN.A00(cursor);
                return string;
            }
        } catch (Exception e) {
            Log.w("DocumentFile", AnonymousClass000.A0P(e, "Failed query: ", AnonymousClass001.A0o()));
        } catch (Throwable th) {
            AnonymousClass0IN.A00((AutoCloseable) null);
            throw th;
        }
        AnonymousClass0IN.A00(cursor);
        return null;
    }

    public final boolean A0H(AnonymousClass0OQ r16, AnonymousClass5UR r17, File file, List list, AtomicLong atomicLong) {
        String str;
        FileOutputStream A0h;
        boolean z = true;
        AnonymousClass0OQ r6 = r16;
        if (r16 == null || r6.A00()) {
            str = "externaldirmigration/manual/doc file either null or virtual";
        } else {
            Context context = r6.A00;
            Uri uri = r6.A01;
            String A002 = A00(context, uri, "_display_name");
            if (A002 == null) {
                str = "externaldirmigration/manual/file name is null";
            } else {
                File A0A2 = AnonymousClass002.A0A(file, A002);
                AnonymousClass5UR r11 = r17;
                List list2 = list;
                AtomicLong atomicLong2 = atomicLong;
                if (!"vnd.android.document/directory".equals(A00(context, uri, "mime_type"))) {
                    if (context.checkCallingOrSelfUriPermission(uri, 1) != 0 || TextUtils.isEmpty(A00(context, uri, "mime_type"))) {
                        C18260x0.A0t("externaldirmigration/manual/cannot read file ", A002, AnonymousClass001.A0o());
                        atomicLong2.incrementAndGet();
                        return false;
                    } else if (A0A2.exists()) {
                        str = AnonymousClass000.A0P(A0A2, "externaldirmigration/manual/target file already exists ", AnonymousClass001.A0o());
                    } else {
                        try {
                            InputStream A062 = r11.A06(uri);
                            try {
                                A0h = AnonymousClass0x9.A0h(A0A2);
                                C627536m.A0I(A062, A0h);
                                list2.add(A0A2);
                                if (!A0G(r6, r11)) {
                                    C18260x0.A1S(AnonymousClass001.A0o(), "externaldirmigration/manual/failed to delete source file for ", A0A2);
                                }
                                A0h.close();
                                if (A062 != null) {
                                    A062.close();
                                    return true;
                                }
                                return z;
                            } catch (Throwable th) {
                                if (A062 != null) {
                                    A062.close();
                                }
                                throw th;
                            }
                        } catch (IOException e) {
                            com.whatsapp.util.Log.e("externaldirmigration/manual//failed to copy file", e);
                            atomicLong2.incrementAndGet();
                            return false;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                } else if (A0A2.exists() || A0A2.mkdirs()) {
                    for (AnonymousClass0OQ A0H : r6.A01()) {
                        if (!A0H(A0H, r11, A0A2, list2, atomicLong2)) {
                            z = false;
                        }
                    }
                    if (z && !A0G(r6, r11)) {
                        str = AnonymousClass000.A0P(A0A2, "externaldirmigration/manual/failed to delete source file for ", AnonymousClass001.A0o());
                    }
                    return z;
                } else {
                    C18260x0.A1Q(AnonymousClass001.A0o(), "externaldirmigration/manual/failed to create target directory ", A0A2);
                    return false;
                }
            }
        }
        com.whatsapp.util.Log.w(str);
        return z;
        throw th;
    }

    public static /* synthetic */ void A01(Activity activity, C994355s r13) {
        AnonymousClass4FS r11 = r13.A08;
        C54292oU r9 = r13.A06;
        C56612sH r8 = r13.A05;
        C69263Wi r5 = r13.A02;
        Activity activity2 = activity;
        r11.BkL(new C994355s(activity2, r13.A00, r13.A01, r5, r13.A03, r13.A04, r8, r9, r13.A07, r11), new Uri[0]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r17) {
        /*
            r16 = this;
            r3 = r17
            android.net.Uri[] r3 = (android.net.Uri[]) r3
            r0 = 0
            java.util.concurrent.atomic.AtomicLong r15 = new java.util.concurrent.atomic.AtomicLong
            r15.<init>(r0)
            if (r3 == 0) goto L_0x0108
            int r2 = r3.length
            r5 = 1
            if (r2 != r5) goto L_0x0108
            r2 = 0
            r3 = r3[r2]
            if (r3 == 0) goto L_0x0108
            java.util.ArrayList r14 = X.AnonymousClass001.A0s()
            r10 = r16
            X.2oU r2 = r10.A06
            android.content.Context r4 = r2.A00
            java.lang.String r2 = android.provider.DocumentsContract.getTreeDocumentId(r3)
            android.net.Uri r3 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r3, r2)
            r2 = 0
            X.0OQ r9 = new X.0OQ
            r9.<init>(r4, r3, r2)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "externaldirmigration/manual/going to migrate "
            X.C18260x0.A1R(r3, r2, r9)
            boolean r2 = r9.A00()
            if (r2 != 0) goto L_0x00c8
            android.content.Context r6 = r9.A00
            android.net.Uri r4 = r9.A01
            java.lang.String r2 = "_display_name"
            java.lang.String r2 = A00(r6, r4, r2)
            if (r2 == 0) goto L_0x00c8
            java.lang.String r3 = "vnd.android.document/directory"
            java.lang.String r2 = "mime_type"
            java.lang.String r2 = A00(r6, r4, r2)
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00c8
            X.33i r4 = r10.A04
            X.5UR r12 = r4.A0R()
            if (r12 != 0) goto L_0x007f
            java.lang.String r2 = "externaldirmigration/manual/no content resolver"
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x0064:
            r15.incrementAndGet()
        L_0x0067:
            boolean r2 = r14.isEmpty()
            if (r2 != 0) goto L_0x00e4
            java.util.concurrent.CountDownLatch r6 = new java.util.concurrent.CountDownLatch
            r6.<init>(r5)
            X.3Dh r4 = r10.A01
            r3 = 25
            X.3Zi r2 = new X.3Zi
            r2.<init>(r6, r3)
            r4.A0c(r2, r14)
            goto L_0x00da
        L_0x007f:
            X.310 r2 = r10.A03
            java.io.File r13 = r2.A04()
            X.C626936e.A06(r13)
            X.0OQ[] r8 = r9.A01()
            int r7 = r8.length
            r6 = 1
            r3 = 0
        L_0x008f:
            if (r3 >= r7) goto L_0x009d
            r11 = r8[r3]
            boolean r2 = r10.A0H(r11, r12, r13, r14, r15)
            if (r2 != 0) goto L_0x009a
            r6 = 0
        L_0x009a:
            int r3 = r3 + 1
            goto L_0x008f
        L_0x009d:
            if (r6 == 0) goto L_0x00a3
            boolean r6 = r10.A0G(r9, r12)
        L_0x00a3:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "externaldirmigration/manual/succeeded: "
            X.C18260x0.A1E(r2, r3, r6)
            if (r6 == 0) goto L_0x0067
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r2 = "WhatsApp"
            java.io.File r3 = X.AnonymousClass002.A0A(r3, r2)
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            X.C106125Xs.A00(r2, r4, r3)
            android.net.Uri r2 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            X.C106125Xs.A00(r2, r4, r3)
            android.net.Uri r2 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            X.C106125Xs.A00(r2, r4, r3)
            goto L_0x0067
        L_0x00c8:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "externaldirmigration/manual/not a suitable tree to migrate ("
            r3.append(r2)
            r3.append(r9)
            java.lang.String r2 = ")"
            X.C18260x0.A1M(r3, r2)
            goto L_0x0064
        L_0x00da:
            r6.await()     // Catch:{ InterruptedException -> 0x00de }
            goto L_0x00e4
        L_0x00de:
            r3 = move-exception
            java.lang.String r2 = "WhatsAppscan interrupted"
            com.whatsapp.util.Log.w(r2, r3)
        L_0x00e4:
            long r5 = java.lang.System.currentTimeMillis()
            java.util.concurrent.atomic.AtomicLong r2 = r10.A0A
            long r2 = r2.get()
            long r5 = r5 - r2
            r3 = 300(0x12c, double:1.48E-321)
            long r3 = r3 - r5
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00f9
            android.os.SystemClock.sleep(r3)
        L_0x00f9:
            int r0 = r14.size()
            long r2 = (long) r0
            long r0 = r15.get()
            X.5Hr r4 = new X.5Hr
            r4.<init>(r2, r0)
            return r4
        L_0x0108:
            long r2 = r15.get()
            X.5Hr r4 = new X.5Hr
            r4.<init>(r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C994355s.A08(java.lang.Object[]):java.lang.Object");
    }

    public void A0A() {
        this.A0A.set(System.currentTimeMillis());
        this.A02.A0G(0, R.string.f11nameremoved);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C19340zH A002;
        int i;
        int i2;
        DialogInterface.OnClickListener r1;
        C102155Hr r10 = (C102155Hr) obj;
        this.A02.A0D();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("externaldirmigration/manual/migration results: moved ");
        A0o.append(r10.A01);
        A0o.append(" failed ");
        long j = r10.A00;
        C18260x0.A1I(A0o, j);
        AnonymousClass310 r2 = this.A03;
        boolean z = !r2.A0B();
        if (!z) {
            r2.A0A("scoped");
        }
        Activity activity = (Activity) this.A09.get();
        if (activity != null && !C621433s.A03(activity) && this.A00.A00) {
            if (z) {
                A002 = AnonymousClass5V0.A00(activity);
                A002.A0U(R.string.f11nameremoved);
                C86624Kv.A0i(activity, A002, new Object[]{activity.getString(R.string.f11nameremoved)}, R.string.f11nameremoved);
                A002.A0i(false);
                i = R.string.f11nameremoved;
                i2 = 18;
            } else {
                int i3 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                A002 = AnonymousClass5V0.A00(activity);
                if (i3 == 0) {
                    A002.A0U(R.string.f11nameremoved);
                    A002.A0T(R.string.f11nameremoved);
                    A002.A0i(false);
                    i = R.string.f11nameremoved;
                    r1 = new AnonymousClass69A(9);
                    A002.A0Y(r1, i);
                    C18280x3.A0q(A002);
                }
                A002.A0U(R.string.f11nameremoved);
                A002.A0T(R.string.f11nameremoved);
                A002.A0i(false);
                A002.A0W(new AnonymousClass69A(10), R.string.f11nameremoved);
                i = R.string.f11nameremoved;
                i2 = 19;
            }
            r1 = new AnonymousClass69T(this, i2, activity);
            A002.A0Y(r1, i);
            C18280x3.A0q(A002);
        } else if (z) {
            this.A07.A03("ManualExternalDirMigration");
        }
    }

    public final boolean A0G(AnonymousClass0OQ r14, AnonymousClass5UR r15) {
        Uri uri = r14.A01;
        Cursor A032 = r15.A03(uri, new String[]{"flags"}, (String) null, (String[]) null, (String) null);
        boolean z = false;
        if (A032 != null) {
            try {
                if (A032.moveToFirst()) {
                    int columnIndexOrThrow = A032.getColumnIndexOrThrow("flags");
                    if (!A032.isNull(columnIndexOrThrow) && (A032.getLong(columnIndexOrThrow) & 4) != 0) {
                        z = true;
                    }
                }
                A032.close();
                if (z) {
                    try {
                        return DocumentsContract.deleteDocument(r15.A00, uri);
                    } catch (FileNotFoundException e) {
                        com.whatsapp.util.Log.e("externaldirmigration/manual/", e);
                        return false;
                    }
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
        com.whatsapp.util.Log.w("externaldirmigration/manual/file deletion is not supported");
        return true;
    }

    public C994355s(Activity activity, C29171iO r3, C64393Dh r4, C69263Wi r5, AnonymousClass310 r6, C620633i r7, C56612sH r8, C54292oU r9, AnonymousClass3DM r10, AnonymousClass4FS r11) {
        this.A09 = AnonymousClass0x9.A14(activity);
        this.A06 = r9;
        this.A05 = r8;
        this.A02 = r5;
        this.A08 = r11;
        this.A01 = r4;
        this.A03 = r6;
        this.A04 = r7;
        this.A07 = r10;
        this.A00 = r3;
    }

    public static /* synthetic */ void A02(Activity activity, C994355s r2) {
        activity.startActivity(C627736r.A03(activity));
        r2.A07.A03("ManualExternalDirMigration");
    }
}
