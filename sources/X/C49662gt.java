package X;

import android.graphics.Bitmap;
import java.io.InputStream;

/* renamed from: X.2gt  reason: invalid class name and case insensitive filesystem */
public final class C49662gt {
    public final C56492s4 A00;
    public final AnonymousClass33K A01;
    public final C44612Wt A02;
    public final C73853gB A03;

    public final Bitmap A00(String str) {
        InputStream B47 = this.A01.A04(str).B47(this.A00, (Integer) null, 35);
        C44612Wt r2 = this.A02;
        String A04 = C627236i.A04(str);
        C626936e.A06(A04);
        C162457s7.A0D(A04);
        ((AnonymousClass30R) r2.A00.getValue()).A04(B47, A04);
        return r2.A00(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0018 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A01(java.util.List r7, boolean r8, boolean r9) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x0010
            X.2Wt r0 = r6.A02
            X.66R r0 = r0.A00
            java.lang.Object r1 = r0.getValue()
            X.30R r1 = (X.AnonymousClass30R) r1
            r0 = 1
            r1.A05(r0)
        L_0x0010:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r5 = r7.iterator()
        L_0x0018:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0073
            java.lang.Object r2 = r5.next()
            X.38j r2 = (X.C632138j) r2
            r3 = 0
            if (r8 == 0) goto L_0x0037
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x004f }
            android.graphics.Bitmap r1 = r6.A00(r0)     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x0055
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x004f }
            X.2kd r2 = new X.2kd     // Catch:{ all -> 0x004f }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x004f }
            goto L_0x0056
        L_0x0037:
            X.2Wt r1 = r6.A02     // Catch:{ all -> 0x004f }
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x004f }
            android.graphics.Bitmap r1 = r1.A00(r0)     // Catch:{ all -> 0x004f }
            if (r1 != 0) goto L_0x0045
            android.graphics.Bitmap r1 = r6.A00(r0)     // Catch:{ all -> 0x004f }
        L_0x0045:
            if (r1 == 0) goto L_0x0055
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x004f }
            X.2kd r2 = new X.2kd     // Catch:{ all -> 0x004f }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x004f }
            goto L_0x0056
        L_0x004f:
            r0 = move-exception
            X.3Z0 r2 = X.AnonymousClass3Z0.A01(r0)
            goto L_0x0056
        L_0x0055:
            r2 = r3
        L_0x0056:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r2)
            if (r1 == 0) goto L_0x0061
            java.lang.String r0 = "AvatarProfilePhotoPosesFetcher/fetchPoses"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0061:
            boolean r0 = r2 instanceof X.AnonymousClass3Z0
            if (r0 != 0) goto L_0x0066
            r3 = r2
        L_0x0066:
            if (r9 == 0) goto L_0x006d
            if (r3 != 0) goto L_0x006d
            X.3d3 r0 = X.C72023d3.A00
            return r0
        L_0x006d:
            if (r3 == 0) goto L_0x0018
            r4.add(r3)
            goto L_0x0018
        L_0x0073:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49662gt.A01(java.util.List, boolean, boolean):java.util.List");
    }

    public C49662gt(C56492s4 r2, C54292oU r3, AnonymousClass33K r4, C73853gB r5) {
        C18260x0.A0V(r3, r2, r4);
        this.A00 = r2;
        this.A01 = r4;
        this.A03 = r5;
        this.A02 = new C44612Wt(r3);
    }
}
