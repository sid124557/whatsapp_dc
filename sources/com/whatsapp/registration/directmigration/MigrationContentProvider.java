package com.whatsapp.registration.directmigration;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0N6;
import X.AnonymousClass0PJ;
import X.AnonymousClass0WN;
import X.AnonymousClass0YS;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1R1;
import X.AnonymousClass22O;
import X.AnonymousClass310;
import X.AnonymousClass33p;
import X.AnonymousClass5ZR;
import X.C03880Lx;
import X.C04860Qy;
import X.C16370su;
import X.C18260x0;
import X.C18270x1;
import X.C18300x5;
import X.C18330xA;
import X.C18530xp;
import X.C23021Qz;
import X.C48772fR;
import X.C54412og;
import X.C56972sr;
import X.C60882zK;
import X.C623834u;
import X.C625835r;
import X.C626936e;
import X.C64393Dh;
import X.C66663Mh;
import X.C72303dV;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class MigrationContentProvider extends C18530xp {
    public static UriMatcher A0D;
    public static final List A0E;
    public C64393Dh A00;
    public C56972sr A01;
    public C66663Mh A02;
    public AnonymousClass0N6 A03;
    public C04860Qy A04;
    public AnonymousClass0WN A05;
    public AnonymousClass310 A06;
    public AnonymousClass5ZR A07;
    public AnonymousClass33p A08;
    public C54412og A09;
    public AnonymousClass1R1 A0A;
    public C623834u A0B;
    public C23021Qz A0C;

    static {
        ArrayList A0i = AnonymousClass0x2.A0i(new AnonymousClass0PJ[]{AnonymousClass0x9.A0G("push_name", 2), AnonymousClass0x9.A0G("interface_gdrive_backup_frequency", 2), AnonymousClass0x9.A0G("interface_gdrive_backup_network_setting", 2), AnonymousClass0x9.A0G("gdrive_include_videos_in_backup", 1)});
        A0i.addAll(AnonymousClass33p.A00());
        A0E = Collections.unmodifiableList(A0i);
    }

    public static synchronized UriMatcher A03() {
        UriMatcher uriMatcher;
        synchronized (MigrationContentProvider.class) {
            if (A0D == null) {
                UriMatcher uriMatcher2 = new UriMatcher(-1);
                A0D = uriMatcher2;
                uriMatcher2.addURI("com.whatsapp.provider.MigrationContentProvider", "msg_store", 1);
                A0D.addURI("com.whatsapp.provider.MigrationContentProvider", "wallpaper", 2);
                A0D.addURI("com.whatsapp.provider.MigrationContentProvider", "chat_setting_store", 3);
                A0D.addURI("com.whatsapp.provider.MigrationContentProvider", "sticker_store", 4);
                A0D.addURI("com.whatsapp.provider.MigrationContentProvider", "share_preferences", 5);
                A0D.addURI("com.whatsapp.provider.MigrationContentProvider", "media", 7);
            }
            uriMatcher = A0D;
        }
        return uriMatcher;
    }

    public final void A0C(MatrixCursor matrixCursor, File file, int i) {
        int length;
        if (i != 0) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || (length = listFiles.length) == 0) {
                C18260x0.A1R(AnonymousClass001.A0o(), "MigrationContentProvider/fillMediaCursor/skipping folder ", file);
                return;
            }
            int i2 = 0;
            do {
                File file2 = listFiles[i2];
                if (file2.isDirectory()) {
                    A0C(matrixCursor, file2, i - 1);
                } else {
                    matrixCursor.addRow(new String[]{file2.getAbsolutePath().replace(AnonymousClass002.A0A(AnonymousClass310.A00(this.A06), "Media").getAbsolutePath(), "")});
                }
                i2++;
            } while (i2 < length);
        }
    }

    public final int A09(Uri uri, int i) {
        return A0A(uri.getQueryParameter("query_param_country_code"), uri.getQueryParameter("query_param_phone_number"), i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (r0 != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
        if (r3 < r1) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0078, code lost:
        if (r11 == 268435456) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0A(java.lang.String r9, java.lang.String r10, int r11) {
        /*
            r8 = this;
            android.content.Context r3 = r8.getContext()
            if (r3 != 0) goto L_0x0008
            r0 = 7
        L_0x0007:
            return r0
        L_0x0008:
            android.content.pm.PackageManager r1 = r3.getPackageManager()
            int r0 = android.os.Binder.getCallingUid()
            java.lang.String r2 = r1.getNameForUid(r0)
            r7 = 0
            android.content.pm.PackageManager r4 = r3.getPackageManager()     // Catch:{ RuntimeException -> 0x002a }
            android.content.pm.ApplicationInfo r0 = r3.getApplicationInfo()     // Catch:{ RuntimeException -> 0x002a }
            int r1 = r0.uid     // Catch:{ RuntimeException -> 0x002a }
            int r0 = android.os.Binder.getCallingUid()     // Catch:{ RuntimeException -> 0x002a }
            int r0 = r4.checkSignatures(r1, r0)     // Catch:{ RuntimeException -> 0x002a }
            if (r0 != 0) goto L_0x0036
            goto L_0x0035
        L_0x002a:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FileSharingHelper/checkSameSignatureCaller. Error is : "
            X.C18260x0.A1Q(r1, r0, r4)
            goto L_0x0036
        L_0x0035:
            r7 = 1
        L_0x0036:
            X.2sr r0 = r8.A01
            com.whatsapp.Me r1 = X.C56972sr.A00(r0)
            r6 = 0
            if (r1 == 0) goto L_0x0050
            java.lang.String r0 = r1.cc
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = r1.number
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0050
            r6 = 1
        L_0x0050:
            java.lang.String r0 = "com.whatsapp.w4b"
            boolean r1 = r0.equals(r2)
            java.lang.String r0 = "com.whatsapp"
            boolean r0 = r0.equals(r2)
            if (r1 != 0) goto L_0x0061
            r5 = 0
            if (r0 == 0) goto L_0x0062
        L_0x0061:
            r5 = 1
        L_0x0062:
            if (r2 == 0) goto L_0x0071
            long r3 = X.AnonymousClass345.A00(r3, r2)
            if (r1 == 0) goto L_0x007f
            r1 = 597(0x255, double:2.95E-321)
        L_0x006c:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 1
            if (r0 >= 0) goto L_0x0072
        L_0x0071:
            r2 = 0
        L_0x0072:
            r0 = -1
            if (r11 == r0) goto L_0x007a
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = 0
            if (r11 != r1) goto L_0x007b
        L_0x007a:
            r0 = 1
        L_0x007b:
            if (r7 != 0) goto L_0x0085
            r0 = 2
            return r0
        L_0x007f:
            if (r0 == 0) goto L_0x0071
            r1 = 452962(0x6e962, double:2.23793E-318)
            goto L_0x006c
        L_0x0085:
            if (r5 != 0) goto L_0x0089
            r0 = 3
            return r0
        L_0x0089:
            if (r2 != 0) goto L_0x008d
            r0 = 4
            return r0
        L_0x008d:
            if (r0 != 0) goto L_0x0091
            r0 = 5
            return r0
        L_0x0091:
            r0 = 0
            if (r6 != 0) goto L_0x0007
            r0 = 6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.directmigration.MigrationContentProvider.A0A(java.lang.String, java.lang.String, int):int");
    }

    public final File A0B(String str) {
        if (!TextUtils.isEmpty(str) && this.A07.A0E()) {
            File A0A2 = AnonymousClass002.A0A(AnonymousClass002.A0A(AnonymousClass310.A00(this.A06), "Media"), str);
            try {
                if (!this.A00.A0d(A0A2) || !A0A2.exists()) {
                    return null;
                }
                return A0A2;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        String str3;
        String str4;
        A08();
        if (bundle == null) {
            Log.e("MigrationContentProvider/call no params passed");
            str4 = "No params passed";
        } else {
            int A0A2 = A0A(bundle.getString("query_param_country_code"), bundle.getString("query_param_phone_number"), -1);
            if (A0A2 != 0) {
                C18260x0.A0z("MigrationContentProvider/call denied ", AnonymousClass001.A0o(), A0A2);
                StringBuilder A0o = AnonymousClass001.A0o();
                C18270x1.A19("call denied (", ")", A0o, A0A2);
                throw new SecurityException(A0o.toString());
            } else if (!"retrieve_rk".equals(str)) {
                C18260x0.A0r("MigrationContentProvider/call failed/unsupported method ", str, AnonymousClass001.A0o());
                str4 = AnonymousClass000.A0U("Unsupported method (", str, ")", AnonymousClass001.A0o());
            } else {
                if (!this.A05.A0G()) {
                    str3 = "MigrationContentProvider/retrieveRK/encryption disabled";
                } else {
                    byte[] byteArray = bundle.getByteArray("pk");
                    if (byteArray == null) {
                        Log.e("MigrationContentProvider/retrieveRK/no public key");
                        str4 = "No key provided";
                    } else {
                        byte[] A092 = this.A04.A09();
                        if (A092 == null) {
                            str3 = "MigrationContentProvider/retrieveRK/no root key";
                        } else {
                            try {
                                Bundle bundle2 = new Bundle(1);
                                bundle2.putByteArray("erk", AnonymousClass0YS.A09(A092, byteArray));
                                C03880Lx A002 = this.A04.A00();
                                if (this.A08.A2F() || A002 == null) {
                                    return bundle2;
                                }
                                bundle2.putByteArray("ph", AnonymousClass0YS.A09(A002.A01, byteArray));
                                bundle2.putByteArray("ps", AnonymousClass0YS.A09(A002.A02, byteArray));
                                bundle2.putInt("ic", A002.A00);
                                return bundle2;
                            } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                                Log.w("MigrationContentProvider/call encryption failed", e);
                                Bundle A082 = AnonymousClass002.A08();
                                A082.putString("error", "MigrationContentProvider/call encryption failed");
                                A082.putString("exception", C18300x5.A0W(e).toString());
                                return A082;
                            }
                        }
                    }
                }
                Log.e(str3);
                return null;
            }
        }
        Bundle A083 = AnonymousClass002.A08();
        A083.putString("error", str4);
        return A083;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        File A0B2;
        A08();
        if (A09(uri, -1) != 0 || A03().match(uri) != 7 || (A0B2 = A0B(uri.getQueryParameter("path"))) == null || !A0B2.delete()) {
            return 0;
        }
        return 1;
    }

    public String getType(Uri uri) {
        A08();
        if (A09(uri, -1) == 0) {
            if (1 == A03().match(uri)) {
                try {
                    Log.i("MigrationContentProvider/getType");
                    File A0K = AnonymousClass0x7.A0N(this.A03).A0K();
                    if (A0K != null) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        C18260x0.A1L(A0o, AnonymousClass0x7.A0p(A0K, "MigrationContentProvider/getType/msgstore-file-name = ", A0o));
                        return A0K.getName();
                    }
                } catch (Exception e) {
                    Log.i("MigrationContentProvider/getType/exception = ", e);
                    return null;
                }
            } else {
                throw AnonymousClass002.A0G(AnonymousClass000.A0P(uri, "This operation is not supported ", AnonymousClass001.A0o()));
            }
        }
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        A08();
        return null;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        int i2;
        String obj;
        File A0K;
        A08();
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else if ("rwt".equals(str)) {
            i = 1006632960;
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Invalid mode: ");
            throw AnonymousClass000.A0F(str, A0o);
        }
        int A092 = A09(uri, i);
        if (A092 == 0) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("MigrationContentProvider/openFile/");
            C18260x0.A1L(A0o2, uri.getPath());
            int match = A03().match(uri);
            if (match == 1) {
                C625835r A0N = AnonymousClass0x7.A0N(this.A03);
                C48772fR r3 = A0N.A0g;
                boolean z = true;
                r3.A00();
                C72303dV r0 = A0N.A0R;
                r0.A05();
                if (r0.A05.exists()) {
                    Log.i("MessageStoreBackup/getFileForMigration/backup-db");
                    int A0C2 = A0N.A0C((C16370su) null, 1, 0);
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("MessageStoreBackup/finish-backup-db-successful? = ");
                    if (A0C2 != 0) {
                        z = false;
                    }
                    C18260x0.A1V(A0o3, z);
                    if (A0C2 == 0) {
                        try {
                            A0K = A0N.A0K();
                            C18260x0.A1R(AnonymousClass001.A0o(), "MessageStoreBackup/getFileForMigration/latest-backup-file", A0K);
                        } catch (IOException e) {
                            Log.e("MessageStoreBackup/getFileForMigration/exception = ", e);
                            throw C18330xA.A05(AnonymousClass000.A0P(e, "MessageStoreBackup/failed-to-get-backup-file", AnonymousClass001.A0o()));
                        }
                    } else {
                        StringBuilder A0o4 = AnonymousClass001.A0o();
                        A0o4.append("MessageStoreBackup/getFileForMigration/backup-failed/backup-result = ");
                        A0o4.append(A0C2);
                        A0o4.append(" log = ");
                        synchronized (r3) {
                            obj = r3.A01.toString();
                        }
                        throw C18330xA.A05(AnonymousClass000.A0X(obj, A0o4));
                    }
                } else {
                    throw C18330xA.A05(String.valueOf(14));
                }
            } else if (match != 2) {
                if (match == 3) {
                    AnonymousClass1R1 r32 = this.A0A;
                    ReentrantReadWriteLock.WriteLock writeLock = r32.A0G().A05.writeLock();
                    C626936e.A06(writeLock);
                    writeLock.lock();
                    try {
                        A0K = r32.A0E.A00.getDatabasePath("chatsettings.db");
                        if (A0K.exists()) {
                            r32.A0G().close();
                        } else {
                            writeLock.unlock();
                        }
                    } finally {
                        writeLock.unlock();
                    }
                } else if (match == 4) {
                    C60882zK A0G = this.A0C.A0G(AnonymousClass22O.UNENCRYPTED);
                    if (A0G != null) {
                        A0K = A0G.A01;
                    }
                } else if (match == 7) {
                    A0K = A0B(uri.getQueryParameter("path"));
                } else {
                    throw AnonymousClass000.A0E(uri, "Unknown URI ", AnonymousClass001.A0o());
                }
                A0K = null;
            } else {
                A0K = this.A0B.A09();
            }
            if (A0K != null) {
                return ParcelFileDescriptor.open(A0K, i);
            }
            return null;
        }
        switch (A092) {
            case 1:
                i2 = 8;
                break;
            case 2:
                i2 = 9;
                break;
            case 3:
                i2 = 10;
                break;
            case 4:
                i2 = 11;
                break;
            case 5:
                i2 = 12;
                break;
            case 6:
                i2 = 13;
                break;
            default:
                i2 = 0;
                break;
        }
        throw C18330xA.A05(String.valueOf(i2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r8, java.lang.String[] r9, java.lang.String r10, java.lang.String[] r11, java.lang.String r12) {
        /*
            r7 = this;
            r7.A08()
            r0 = -1
            int r2 = r7.A09(r8, r0)
            if (r2 == 0) goto L_0x0015
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MigrationContentProvider/query denied "
            X.C18260x0.A0z(r0, r1, r2)
            r2 = 0
        L_0x0014:
            return r2
        L_0x0015:
            android.content.UriMatcher r0 = A03()
            int r1 = r0.match(r8)
            r0 = 5
            if (r1 == r0) goto L_0x0059
            r0 = 7
            if (r1 != r0) goto L_0x004e
            X.310 r0 = r7.A06
            java.io.File r1 = X.AnonymousClass310.A00(r0)
            java.lang.String r0 = "Media"
            java.io.File r1 = X.AnonymousClass002.A0A(r1, r0)
            java.lang.String r0 = "path"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            android.database.MatrixCursor r2 = new android.database.MatrixCursor
            r2.<init>(r0)
            X.5ZR r0 = r7.A07
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x0014
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0014
            r0 = 4
            r7.A0C(r2, r1, r0)
            return r2
        L_0x004e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown URI "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0E(r8, r0, r1)
            throw r0
        L_0x0059:
            java.lang.String r2 = "value"
            java.lang.String r1 = "valueType"
            java.lang.String r0 = "key"
            java.lang.String[] r0 = new java.lang.String[]{r0, r2, r1}
            android.database.MatrixCursor r4 = new android.database.MatrixCursor
            r4.<init>(r0)
            java.util.List r0 = A0E
            java.util.Iterator r6 = r0.iterator()
        L_0x0070:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0131
            java.lang.Object r0 = r6.next()
            X.0PJ r0 = (X.AnonymousClass0PJ) r0
            android.database.MatrixCursor$RowBuilder r3 = r4.newRow()
            java.lang.Object r5 = r0.A00
            r3.add(r5)
            java.lang.Object r0 = r0.A01
            X.C626936e.A06(r0)
            int r2 = X.AnonymousClass001.A0K(r0)
            X.C626936e.A06(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r2 == 0) goto L_0x0119
            r0 = 1
            if (r2 == r0) goto L_0x010a
            r0 = 2
            if (r2 == r0) goto L_0x00ef
            r0 = 3
            if (r2 == r0) goto L_0x00d4
            r0 = 4
            if (r2 != r0) goto L_0x00ba
            X.33p r0 = r7.A08
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)
            long r0 = X.AnonymousClass0x2.A0B(r0, r5)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x00af:
            r3.add(r0)
            if (r2 != 0) goto L_0x00ba
            java.lang.String r0 = "int"
        L_0x00b6:
            r3.add(r0)
            goto L_0x0070
        L_0x00ba:
            r0 = 1
            if (r2 == r0) goto L_0x00d1
            r0 = 2
            if (r2 == r0) goto L_0x00cd
            r0 = 3
            if (r2 == r0) goto L_0x00c9
            r0 = 4
            if (r2 != r0) goto L_0x0129
            java.lang.String r0 = "long"
            goto L_0x00b6
        L_0x00c9:
            java.lang.String r0 = "string_set"
            goto L_0x00b6
        L_0x00cd:
            java.lang.String r0 = "string"
            goto L_0x00b6
        L_0x00d1:
            java.lang.String r0 = "boolean"
            goto L_0x00b6
        L_0x00d4:
            X.33p r0 = r7.A08
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.util.HashSet r0 = X.AnonymousClass002.A0K()
            java.util.Set r1 = r1.getStringSet(r5, r0)
            X.C626936e.A06(r1)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x00af
        L_0x00ef:
            java.lang.String r0 = "push_name"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00ff
            X.2og r0 = r7.A09
            java.lang.String r0 = r0.A03()
            goto L_0x00af
        L_0x00ff:
            X.33p r0 = r7.A08
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = X.AnonymousClass0x9.A0v(r0, r5)
            goto L_0x00af
        L_0x010a:
            X.33p r0 = r7.A08
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)
            boolean r0 = X.C18280x3.A1W(r0, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x00af
        L_0x0119:
            X.33p r0 = r7.A08
            r1 = 0
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)
            int r0 = r0.getInt(r5, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x00af
        L_0x0129:
            java.lang.String r0 = "unexpected type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0131:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.directmigration.MigrationContentProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        A08();
        return 0;
    }

    public Bundle call(String str, String str2, String str3, Bundle bundle) {
        A08();
        if (!"com.whatsapp.provider.MigrationContentProvider".equals(str)) {
            return null;
        }
        return call(str2, str3, bundle);
    }
}
