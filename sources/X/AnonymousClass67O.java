package X;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: X.67O  reason: invalid class name */
public class AnonymousClass67O extends ContentObserver {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass67O(Handler handler, Object obj, int i) {
        super(handler);
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean deliverSelfNotifications() {
        if (this.A01 != 0) {
            return super.deliverSelfNotifications();
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
        if (r7 != null) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onChange(boolean r11) {
        /*
            r10 = this;
            int r0 = r10.A01
            if (r0 == 0) goto L_0x0083
            java.lang.Object r3 = r10.A00
            com.whatsapp.gallerypicker.GalleryPickerFragment r3 = (com.whatsapp.gallerypicker.GalleryPickerFragment) r3
            X.03q r0 = r3.A0Q()
            if (r0 == 0) goto L_0x0082
            boolean r1 = r0.isFinishing()
            r0 = 1
            if (r1 == r0) goto L_0x0082
            X.33i r0 = r3.A0B
            if (r0 == 0) goto L_0x007b
            X.5UR r4 = r0.A0R()
            if (r4 == 0) goto L_0x0067
            X.5O9 r0 = r3.A0J
            if (r0 == 0) goto L_0x0060
            java.lang.String r2 = "volume"
            java.lang.String[] r6 = new java.lang.String[]{r2}
            android.net.Uri r5 = android.provider.MediaStore.getMediaScannerUri()
            r7 = 0
            r9 = r7
            r8 = r7
            android.database.Cursor r7 = r4.A03(r5, r6, r7, r8, r9)     // Catch:{ UnsupportedOperationException -> 0x0055 }
            if (r7 == 0) goto L_0x0055
            int r1 = r7.getCount()     // Catch:{ all -> 0x004b }
            r0 = 1
            if (r1 != r0) goto L_0x0055
            r7.moveToFirst()     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "external"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r7, r2)     // Catch:{ all -> 0x004b }
            boolean r1 = r1.equals(r0)     // Catch:{ all -> 0x004b }
            goto L_0x0058
        L_0x004b:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0050 }
            throw r1
        L_0x0050:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0055:
            r1 = 0
            if (r7 == 0) goto L_0x005b
        L_0x0058:
            r7.close()
        L_0x005b:
            r0 = 0
            r3.A1L(r0, r1)
            return
        L_0x0060:
            java.lang.String r0 = "mediaManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0067:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "gallerypicker/"
            r1.append(r0)
            int r0 = r3.A00
            r1.append(r0)
            java.lang.String r0 = " no content resolver"
            X.C18260x0.A1L(r1, r0)
            return
        L_0x007b:
            java.lang.String r0 = "systemServices"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0082:
            return
        L_0x0083:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "documentsgalleryfragment/onchange "
            X.C18260x0.A1E(r0, r1, r11)
            java.lang.Object r1 = r10.A00
            X.4sv r1 = (X.C95254sv) r1
            android.database.Cursor r0 = r1.A01
            if (r0 != 0) goto L_0x009b
            r0 = 0
        L_0x0095:
            r1.A00 = r0
            r1.A05()
            return
        L_0x009b:
            int r0 = r0.getCount()
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass67O.onChange(boolean):void");
    }
}
