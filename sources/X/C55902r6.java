package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.2r6  reason: invalid class name and case insensitive filesystem */
public class C55902r6 {
    public int A00 = 0;
    public AnonymousClass37I A01 = null;
    public String A02;
    public final Context A03;
    public final Context A04;
    public final C55682qk A05;
    public final AnonymousClass2EK A06;
    public final C183538qC A07;

    public C32481qh A01() {
        C32481qh r0;
        synchronized (this) {
            int i = this.A00 + 1;
            this.A00 = i;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("svc-client/createApiSession; service=");
            A0o.append("GoogleMigrateClient");
            C18260x0.A0w(",ref_cnt=", A0o, i);
            r0 = new C32481qh(this);
        }
        return r0;
    }

    public C69823Yn A02() {
        C69823Yn r0;
        synchronized (this) {
            int i = this.A00 + 1;
            this.A00 = i;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("svc-client/createSession; service=");
            A0o.append("GoogleMigrateClient");
            C18260x0.A0w(", ref_cnt=", A0o, i);
            r0 = new C69823Yn(this);
        }
        return r0;
    }

    public void A03() {
        Parcel obtain;
        Parcel obtain2;
        Log.d("GoogleMigrateClient/deleteAll()");
        try {
            C32481qh A012 = A01();
            try {
                C10050hB r1 = (C10050hB) ((IAppDataReaderService) A012.A00());
                obtain = Parcel.obtain();
                obtain2 = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService");
                AnonymousClass000.A0w(r1.A00, obtain, obtain2, 4);
                obtain2.recycle();
                obtain.recycle();
                A012.close();
            } catch (Throwable th) {
                A012.close();
                throw th;
            }
        } catch (Exception e) {
            throw new IOException(e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r3.getFileDescriptor() == null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04() {
        /*
            r7 = this;
            java.lang.String r6 = "GoogleMigrateClient/hasWhatsAppData()"
            com.whatsapp.util.Log.d((java.lang.String) r6)
            r5 = 0
            X.1qh r4 = r7.A01()     // Catch:{ 24Q | SecurityException -> 0x004b, all -> 0x0046 }
            android.os.IInterface r0 = r4.A00()     // Catch:{ all -> 0x003c }
            com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService r0 = (com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService) r0     // Catch:{ all -> 0x003c }
            android.os.ParcelFileDescriptor r3 = r0.B7e()     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x001d
            java.io.FileDescriptor r0 = r3.getFileDescriptor()     // Catch:{ all -> 0x0030 }
            r2 = 1
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0030 }
            java.lang.String r0 = "GoogleMigrateClient/hasWhatsAppData; hasFileDescriptor = "
            X.C18260x0.A1E(r0, r1, r2)     // Catch:{ all -> 0x0030 }
            if (r3 == 0) goto L_0x002c
            r3.close()     // Catch:{ all -> 0x003c }
        L_0x002c:
            r4.close()     // Catch:{ 24Q | SecurityException -> 0x004b, all -> 0x0046 }
            return r2
        L_0x0030:
            r1 = move-exception
            if (r3 == 0) goto L_0x003b
            r3.close()     // Catch:{ all -> 0x0037 }
            goto L_0x003b
        L_0x0037:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x003c }
        L_0x003b:
            throw r1     // Catch:{ all -> 0x003c }
        L_0x003c:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0041 }
            goto L_0x0045
        L_0x0041:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ 24Q | SecurityException -> 0x004b, all -> 0x0046 }
        L_0x0045:
            throw r1     // Catch:{ 24Q | SecurityException -> 0x004b, all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)
            return r5
        L_0x004b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GoogleMigrateClient/hasWhatsAppData(): "
            X.C18260x0.A1R(r1, r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55902r6.A04():boolean");
    }

    public boolean A05(String str) {
        try {
            ApplicationInfo applicationInfo = this.A03.getPackageManager().getPackageInfo(str, 0).applicationInfo;
            if (!applicationInfo.enabled) {
                return false;
            }
            int i = applicationInfo.flags;
            boolean A1S = AnonymousClass000.A1S(i & 1);
            boolean A1S2 = AnonymousClass000.A1S(i & 128);
            if (A1S || A1S2) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public C55902r6(Context context, C55682qk r3, AnonymousClass2EK r4, C183538qC r5) {
        this.A04 = context;
        this.A05 = r3;
        this.A03 = context;
        this.A07 = r5;
        this.A06 = r4;
    }

    public ParcelFileDescriptor A00(String str) {
        Parcel obtain;
        Parcel obtain2;
        Object obj;
        C18260x0.A0q("GoogleMigrateClient/openFile(); ", str, AnonymousClass001.A0o());
        try {
            C32481qh A012 = A01();
            try {
                C10050hB r1 = (C10050hB) ((IAppDataReaderService) A012.A00());
                obtain = Parcel.obtain();
                obtain2 = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService");
                obtain.writeString(str);
                AnonymousClass000.A0w(r1.A00, obtain, obtain2, 2);
                Parcelable.Creator creator = ParcelFileDescriptor.CREATOR;
                if (obtain2.readInt() != 0) {
                    obj = creator.createFromParcel(obtain2);
                } else {
                    obj = null;
                }
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                obtain2.recycle();
                obtain.recycle();
                A012.close();
                return parcelFileDescriptor;
            } catch (Throwable th) {
                A012.close();
                throw th;
            }
        } catch (Exception e) {
            throw new IOException(str, e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }
}
