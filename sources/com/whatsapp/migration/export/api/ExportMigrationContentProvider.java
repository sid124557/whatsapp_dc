package com.whatsapp.migration.export.api;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass2SN;
import X.AnonymousClass2SO;
import X.AnonymousClass2TP;
import X.AnonymousClass30Q;
import X.AnonymousClass3H0;
import X.AnonymousClass4GK;
import X.C18260x0;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C18330xA;
import X.C18530xp;
import X.C42422Oa;
import X.C45172Yy;
import X.C49112g0;
import X.C54742pD;
import X.C55682qk;
import X.C56862sg;
import X.C58422vE;
import X.C59112wN;
import X.C627536m;
import X.C70763b1;
import X.C994755w;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import javax.crypto.Cipher;

public class ExportMigrationContentProvider extends C18530xp {
    public UriMatcher A00;
    public C55682qk A01;
    public AnonymousClass1VX A02;
    public AnonymousClass2TP A03;
    public AnonymousClass30Q A04;
    public C994755w A05;
    public C42422Oa A06;

    public synchronized void A09() {
        SecurityException securityException;
        A08();
        try {
            if (this.A02.A0Y(C58422vE.A02, 843)) {
                AnonymousClass30Q r0 = this.A04;
                if (AnonymousClass001.A1T(r0.A02.getComponentEnabledSetting(r0.A00))) {
                    this.A05.A00().A00();
                    C42422Oa r2 = this.A06;
                    C54742pD A002 = r2.A01.A00();
                    if (!A002.A03) {
                        A002.A00();
                    }
                    C45172Yy r02 = r2.A02;
                    String str = A002.A01;
                    if (!r02.A00(str)) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("Caller ");
                        A0o.append(str);
                        throw new SecurityException(AnonymousClass000.A0V(" does not have a correctly declared permission ", "com.apple.movetoios.ACCESS", A0o));
                    }
                } else {
                    securityException = new SecurityException("Provider component is disabled.");
                }
            } else {
                securityException = new SecurityException("Provider access is disabled.");
            }
            throw securityException;
        } catch (SecurityException e) {
            this.A01.A09("xpm-export-provider-security", e.toString(), e);
            throw e;
        }
    }

    public String getType(Uri uri) {
        return null;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        FileNotFoundException e;
        Cursor A0E;
        IOException iOException;
        Cipher cipher;
        CancellationSignal cancellationSignal2 = cancellationSignal;
        A09();
        Uri uri2 = uri;
        try {
            this.A04.A03();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("ExportMigrationContentProvider/openFile/uriPath=");
            C18260x0.A1L(A0o, uri2.getPath());
            if (this.A00.match(uri2) == 2) {
                long parseLong = Long.parseLong(C18290x4.A0s(uri2.getPathSegments()));
                AnonymousClass2TP r12 = this.A03;
                AnonymousClass4GK A002 = C49112g0.A00(r12.A03);
                try {
                    C56862sg r8 = ((AnonymousClass3H0) A002).A03;
                    String[] A1Y = AnonymousClass0x9.A1Y();
                    C18260x0.A1Y(A1Y, parseLong);
                    A0E = r8.A0E("SELECT   f._id, f.local_path, f.exported_path, f.file_size, f.required, f.encryption_iv FROM exported_files_metadata AS f WHERE f._id = ?", "XPM_EXPORT_FILE_METADATA_SELECT_INTERNAL_SINGLE", A1Y);
                    if (!A0E.moveToFirst()) {
                        A0E.close();
                        e = C18330xA.A05(AnonymousClass000.A0Z("Unknown entry: ", C18280x3.A0f(A002), parseLong));
                    } else {
                        AnonymousClass2SO A003 = C59112wN.A00(A0E);
                        A0E.close();
                        A002.close();
                        File file = A003.A02;
                        if (file.exists()) {
                            if (file.length() == 0) {
                                C18260x0.A1R(AnonymousClass001.A0o(), "Exporting EMPTY file: path=", file);
                            }
                            long length = file.length();
                            long j = A003.A01;
                            if (length != j) {
                                StringBuilder A0o2 = AnonymousClass001.A0o();
                                A0o2.append("Exporting MISMATCHED SIZE file: path=");
                                A0o2.append(file);
                                C18280x3.A11(file, ", on-disk=", A0o2);
                                C18260x0.A12(", on-record=", A0o2, j);
                            }
                            if (r12.A07.getAndSet(parseLong) == parseLong) {
                                StringBuilder A0o3 = AnonymousClass001.A0o();
                                A0o3.append("RETRY DETECTED for path=");
                                A0o3.append(file);
                                C18280x3.A11(file, " with size on-disk=", A0o3);
                                C18260x0.A12(", on-record=", A0o3, j);
                            }
                            if (cancellationSignal == null) {
                                cancellationSignal2 = new CancellationSignal();
                            }
                            try {
                                ParcelFileDescriptor[] createReliablePipe = ParcelFileDescriptor.createReliablePipe();
                                ParcelFileDescriptor parcelFileDescriptor = createReliablePipe[0];
                                ParcelFileDescriptor parcelFileDescriptor2 = createReliablePipe[1];
                                synchronized (r12) {
                                    try {
                                        Set<ParcelFileDescriptor> set = r12.A05;
                                        if (!set.isEmpty()) {
                                            StringBuilder A032 = C55682qk.A03(r12.A00, "xpm-export-api-leaked-fd", Integer.toString(set.size()), false);
                                            C18290x4.A1P("ExportMigrationApi/force closing pending file descriptors (", A032, set);
                                            C18260x0.A1K(A032, ")");
                                            for (ParcelFileDescriptor closeWithError : set) {
                                                closeWithError.closeWithError("Force closing, concurrent streaming not supported.");
                                            }
                                            set.clear();
                                        }
                                        set.add(parcelFileDescriptor2);
                                    } catch (IOException e2) {
                                        Log.e("ExportMigrationApi/Failed to close the pipe after an error.", e2);
                                    } catch (Throwable th) {
                                        while (true) {
                                            th = th;
                                            break;
                                        }
                                    }
                                }
                                String str2 = A003.A03;
                                if (TextUtils.isEmpty(str2)) {
                                    cipher = null;
                                } else {
                                    AnonymousClass2SN A004 = r12.A01.A00();
                                    if (A004 != null) {
                                        byte[] decode = Base64.decode(A004.A03, 2);
                                        byte[] decode2 = Base64.decode(str2, 2);
                                        try {
                                            cipher = C18320x8.A0v();
                                            cipher.init(1, C18300x5.A0y(decode), C18330xA.A0D(decode2));
                                        } catch (GeneralSecurityException e3) {
                                            iOException = new IOException("Failed to initiate encrypting cipher.", e3);
                                            throw iOException;
                                        }
                                    } else {
                                        th = AnonymousClass002.A0C("Failed to initiate encryption, key is missing.");
                                        throw th;
                                    }
                                }
                                try {
                                    long j2 = A003.A00;
                                    StringBuilder A0o4 = AnonymousClass001.A0o();
                                    A0o4.append("ExportMigrationApi/scheduled a writer for ");
                                    A0o4.append(j2);
                                    C18260x0.A1P(A0o4, ", ", file);
                                    r12.A06.execute(new C70763b1(r12, file, cipher, parcelFileDescriptor2, cancellationSignal2, 2, j2));
                                    return parcelFileDescriptor;
                                } catch (RejectedExecutionException e4) {
                                    parcelFileDescriptor.close();
                                    parcelFileDescriptor2.close();
                                    iOException = new IOException("Failed to initiate streaming.", e4);
                                    throw iOException;
                                }
                            } catch (FileNotFoundException e5) {
                                e = e5;
                            } catch (IOException e6) {
                                e = C18330xA.A05(e6.toString());
                            }
                        } else {
                            e = C18330xA.A05(AnonymousClass000.A0Z("File no longer exists: ", C55682qk.A03(r12.A00, "xpm-export-missing-file-type", C627536m.A08(file.getAbsolutePath()), false), parseLong));
                        }
                    }
                } catch (Throwable th2) {
                    e = th2;
                    try {
                        A002.close();
                    } catch (Throwable th3) {
                        e.addSuppressed(th3);
                    }
                }
            } else {
                e = C18330xA.A05(uri2.toString());
            }
            throw e;
            throw th;
        } catch (FileNotFoundException e7) {
            if (e7.getMessage() == null || e7.getMessage().isEmpty()) {
                this.A01.A09("xpm-export-provider-file-not-found-other", AnonymousClass000.A0X("; FileNotFoundException without message", C18290x4.A0v(uri2)), e7);
                throw C18330xA.A05(AnonymousClass000.A0P(uri2, "File not found without reason: ", AnonymousClass001.A0o()));
            }
            this.A01.A09("xpm-export-provider-file-not-found", AnonymousClass000.A0a(";", C18290x4.A0v(uri2), e7), e7);
            throw e7;
        } catch (Exception e8) {
            this.A01.A09("xpm-export-provider-open-file", AnonymousClass000.A0a(";", C18290x4.A0v(uri2), e8), e8);
            StringBuilder A0o5 = AnonymousClass001.A0o();
            AnonymousClass000.A17(uri2, "Unexplained error opening ", ";", A0o5);
            throw C18330xA.A05(AnonymousClass000.A0R(e8, A0o5));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
        r2.putString(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        if ("FAILURE".equals(r8.getString("state")) == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002e, code lost:
        r5.A01.A0A("xpm-export-provider-unsupported-method", false, r6);
        X.C18260x0.A1K(X.AnonymousClass000.A0m("ExportMigrationContentProvider/call/", r6), " not found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0043, code lost:
        throw X.AnonymousClass002.A0G(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle call(java.lang.String r6, java.lang.String r7, android.os.Bundle r8) {
        /*
            r5 = this;
            r5.A08()
            r5.A09()
            if (r6 == 0) goto L_0x00b1
            X.30Q r0 = r5.A04
            r0.A03()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "ExportMigrationContentProvider/call/"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r0 = " Arg: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " Bundle: "
            X.C18260x0.A1R(r1, r0, r8)
            int r0 = r6.hashCode()
            r4 = 0
            switch(r0) {
                case 94756344: goto L_0x0069;
                case 1139677387: goto L_0x0054;
                case 1976339394: goto L_0x0044;
                default: goto L_0x002e;
            }
        L_0x002e:
            X.2qk r1 = r5.A01
            java.lang.String r0 = "xpm-export-provider-unsupported-method"
            r1.A0A(r0, r4, r6)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r2, r6)
            java.lang.String r0 = " not found"
            X.C18260x0.A1K(r1, r0)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass002.A0G(r6)
            throw r0
        L_0x0044:
            java.lang.String r0 = "get_icon"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002e
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            java.lang.String r1 = "iconUri"
            r0 = 0
            goto L_0x0065
        L_0x0054:
            java.lang.String r0 = "get_label"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002e
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            java.lang.String r1 = "name"
            java.lang.String r0 = "WhatsApp"
        L_0x0065:
            r2.putString(r1, r0)
            return r2
        L_0x0069:
            java.lang.String r0 = "close"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "ExportMigrationContentProvider/close() is called"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2TP r3 = r5.A03
            if (r8 == 0) goto L_0x0090
            java.lang.String r2 = "state"
            boolean r0 = r8.containsKey(r2)
            if (r0 == 0) goto L_0x0090
            java.lang.String r1 = "FAILURE"
            java.lang.String r0 = r8.getString(r2)
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0091
        L_0x0090:
            r0 = 1
        L_0x0091:
            X.2sE r1 = r3.A02
            if (r0 == 0) goto L_0x009d
            r1.A03()
        L_0x0098:
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            return r2
        L_0x009d:
            X.30Q r0 = r1.A0A
            r0.A02()
            X.2qk r2 = r1.A02
            r1 = 0
            java.lang.String r0 = "xpm-export-disabled-provider-with-failure"
            r2.A0A(r0, r4, r1)
            java.lang.String r0 = "ExportFlowManager/disableExportProviderAndClearMigrationFlags/complete/failure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0098
        L_0x00b1:
            java.lang.String r0 = "method is null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.export.api.ExportMigrationContentProvider.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        A08();
        A09();
        this.A01.A0A("xpm-export-provider-delete-unsupported", false, uri.getPath());
        throw C18320x8.A0m();
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        A08();
        A09();
        this.A01.A0A("xpm-export-provider-insert-unsupported", false, uri.getPath());
        throw C18320x8.A0m();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        AnonymousClass4GK r8;
        Cursor cursor;
        A08();
        A09();
        this.A04.A03();
        int match = this.A00.match(uri);
        if (match == 1) {
            C18260x0.A1R(AnonymousClass001.A0o(), "ExportMigrationContentProvider/query/supported-request ", uri);
            String queryParameter = uri.getQueryParameter("offset");
            String queryParameter2 = uri.getQueryParameter("limit");
            if (queryParameter == null || queryParameter2 == null) {
                AnonymousClass4GK A002 = C49112g0.A00(this.A03.A03);
                try {
                    Cursor A012 = C56862sg.A01(((AnonymousClass3H0) A002).A03, "SELECT   f._id AS _id,  ('xpm-import/' || f.exported_path)  AS path, f.file_size AS original_size, f.required AS required, 0 AS include_in_backups FROM exported_files_metadata AS f ORDER BY   f.required DESC , f.file_size DESC , f._id ASC ", "XPM_EXPORT_FILE_METADATA_PUBLIC_SELECT_ALL");
                    A002.close();
                    return A012;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
            } else {
                long parseLong = Long.parseLong(queryParameter);
                long parseLong2 = Long.parseLong(queryParameter2);
                r8 = C49112g0.A00(this.A03.A03);
                try {
                    C56862sg r7 = ((AnonymousClass3H0) r8).A03;
                    String[] A1Z = AnonymousClass0x9.A1Z();
                    C18260x0.A1Y(A1Z, parseLong);
                    C18280x3.A1R(A1Z, 1, parseLong2);
                    cursor = r7.A0E("SELECT   f._id AS _id,  ('xpm-import/' ||  f.exported_path)  AS path, f.file_size AS original_size, f.required AS required, 0 AS include_in_backups FROM exported_files_metadata AS f ORDER BY   f.required DESC , f.file_size DESC , f._id ASC  LIMIT ?, ?", "XPM_EXPORT_FILE_METADATA_PUBLIC_SELECT_PAGED", A1Z);
                } catch (Throwable th2) {
                    th = th2;
                    r8.close();
                    throw th;
                }
            }
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            if (match == 2) {
                C18260x0.A1R(A0o, "ExportMigrationContentProvider/query/ignored-request ", uri);
                long parseLong3 = Long.parseLong(AnonymousClass001.A0n(uri.getPathSegments(), 1));
                r8 = C49112g0.A00(this.A03.A03);
                C56862sg r3 = ((AnonymousClass3H0) r8).A03;
                String[] A1Y = AnonymousClass0x9.A1Y();
                C18260x0.A1Y(A1Y, parseLong3);
                cursor = r3.A0E("SELECT   f._id AS _id,  ('xpm-import/' || f.exported_path)  AS path, f.file_size AS original_size, f.required AS required, 0 AS include_in_backups FROM exported_files_metadata AS f WHERE f._id = ?", "XPM_EXPORT_METADATA_API_SELECT_SINGLE", A1Y);
            } else {
                C18260x0.A1Q(A0o, "ExportMigrationContentProvider/query/unsupported-request ", uri);
                throw AnonymousClass000.A0E(uri, "Unsupported URI: ", AnonymousClass001.A0o());
            }
        }
        r8.close();
        return cursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        A08();
        A09();
        this.A01.A0A("xpm-export-provider-update-unsupported", false, uri.getPath());
        throw C18320x8.A0m();
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return openFile(uri, str, new CancellationSignal());
    }
}
