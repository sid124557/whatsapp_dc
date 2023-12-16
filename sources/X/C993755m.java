package X;

import java.lang.ref.WeakReference;

/* renamed from: X.55m  reason: invalid class name and case insensitive filesystem */
public class C993755m extends AnonymousClass5ZM {
    public WeakReference A00;
    public final C69263Wi A01;
    public final C55272q5 A02;
    public final C53282mq A03;
    public final C101835Gh A04;

    public static String A00(int i) {
        if (i == 0) {
            return "from-backup";
        }
        if (i == 1) {
            return "from-google-migrate";
        }
        if (i == 2) {
            return "from-consumer-app";
        }
        if (i == 3) {
            return "media-unreadable";
        }
        if (i != 4) {
            return AnonymousClass000.A0Y("unspecified restore type: ", AnonymousClass001.A0o(), i);
        }
        return "message-store-is-healthy";
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r5) {
        /*
            r4 = this;
            X.5Gh r0 = r4.A04
            java.util.Set r3 = r0.A00
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0063
            int r0 = r3.size()
            boolean r1 = X.AnonymousClass001.A1T(r0)
            java.lang.String r0 = "Multiple bridges registered. Not supported."
            X.C626936e.A0D(r1, r0)
            java.util.Iterator r0 = r3.iterator()
            java.lang.Object r0 = r0.next()
            X.35p r0 = (X.C625635p) r0
            if (r0 == 0) goto L_0x0063
            boolean r0 = r0.A0H()
        L_0x0027:
            java.lang.Integer r2 = X.AnonymousClass001.A0f()
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = "restore>DetermineRestoreStateBackgroundTask/google-migrate-flow/import is still running"
        L_0x002f:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r2
        L_0x0033:
            X.2q5 r0 = r4.A02
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x00a4
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x006a
            int r0 = r3.size()
            boolean r1 = X.AnonymousClass001.A1T(r0)
            java.lang.String r0 = "Multiple bridges registered. Not supported."
            X.C626936e.A0D(r1, r0)
            java.util.Iterator r0 = r3.iterator()
            java.lang.Object r0 = r0.next()
            X.35p r0 = (X.C625635p) r0
            if (r0 == 0) goto L_0x006a
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = "restore>DetermineRestoreStateBackgroundTask/google-migrate-flow"
            goto L_0x002f
        L_0x0063:
            java.lang.String r0 = "GoogleMigrateUtil/isImportRunning/no-bridge"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            goto L_0x0027
        L_0x006a:
            java.lang.String r0 = "GoogleMigrateUtil/hasWhatsAppData/no-bridge"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x006f:
            X.2mq r2 = r4.A03
            X.33p r0 = r2.A01
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "migrate_from_consumer_app_directly"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 == 0) goto L_0x0082
            r2.A00()
        L_0x0082:
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            java.lang.String r0 = "mounted"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009d
            java.lang.String r0 = "mounted_ro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009d
            java.lang.String r0 = "restore>DetermineRestoreStateBackgroundTask/media-storage-unreachable"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 3
            goto L_0x00aa
        L_0x009d:
            java.lang.String r0 = "restore>DetermineRestoreStateBackgroundTask/restore-from-backup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            goto L_0x00aa
        L_0x00a4:
            java.lang.String r0 = "restore>DetermineRestoreStateBackgroundTask/msg-store-is-healthy"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 4
        L_0x00aa:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C993755m.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass66D r1;
        Number number = (Number) obj;
        this.A01.A0D();
        WeakReference weakReference = this.A00;
        if (weakReference != null && (r1 = (AnonymousClass66D) weakReference.get()) != null && !r1.BHW()) {
            r1.BaF(number.intValue());
        }
    }

    public C993755m(C69263Wi r2, C55272q5 r3, AnonymousClass66D r4, C53282mq r5, C101835Gh r6) {
        this.A01 = r2;
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = r3;
        this.A00 = AnonymousClass0x9.A14(r4);
    }
}
