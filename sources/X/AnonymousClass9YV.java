package X;

import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import java.util.List;

/* renamed from: X.9YV  reason: invalid class name */
public class AnonymousClass9YV implements C202879mj {
    public final /* synthetic */ ARModelMetadataRequest A00;
    public final /* synthetic */ AnonymousClass9SI A01;
    public final /* synthetic */ AnonymousClass9RB A02;
    public final /* synthetic */ AnonymousClass9TF A03;
    public final /* synthetic */ List A04;

    public AnonymousClass9YV(ARModelMetadataRequest aRModelMetadataRequest, AnonymousClass9SI r2, AnonymousClass9RB r3, AnonymousClass9TF r4, List list) {
        this.A03 = r4;
        this.A00 = aRModelMetadataRequest;
        this.A04 = list;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void BSl(AnonymousClass9KQ r2) {
        this.A02.A00(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r7.A01(r5, r6.mCapability, r4);
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r9) {
        /*
            r8 = this;
            X.9TF r7 = r8.A03
            com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest r6 = r8.A00
            java.util.List r1 = r8.A04
            X.9RB r3 = r8.A02
            X.9SI r5 = r8.A01
            java.lang.Object r0 = X.C18290x4.A0k(r1)
            X.9Xk r0 = (X.C195349Xk) r0
            X.9WL r0 = r0.A02
            int r4 = r0.A02()
            java.util.Iterator r2 = r1.iterator()
        L_0x001a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r1 = r2.next()
            X.9Xk r1 = (X.C195349Xk) r1
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r6.mCapability     // Catch:{ 9KP -> 0x004a }
            boolean r0 = r7.A02(r1, r0)     // Catch:{ 9KP -> 0x004a }
            if (r0 != 0) goto L_0x001a
            X.9Tm r1 = new X.9Tm
            r1.<init>()
            X.9K2 r0 = X.AnonymousClass9K2.MODEL_FETCH_FAILURE
            r1.A00 = r0
            java.lang.String r0 = "Models not found in cache even after download"
            r1.A01 = r0
            X.9KQ r0 = r1.A00()
            goto L_0x0046
        L_0x0040:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r6.mCapability     // Catch:{ 9KP -> 0x004a }
            r7.A01(r5, r0, r4)     // Catch:{ 9KP -> 0x004a }
            r0 = 0
        L_0x0046:
            r3.A00(r0)
            return
        L_0x004a:
            r2 = move-exception
            X.9Tm r1 = new X.9Tm
            r1.<init>()
            X.9K2 r0 = X.AnonymousClass9K2.MODEL_FETCH_FAILURE
            r1.A00 = r0
            r1.A03 = r2
            X.9KQ r0 = r1.A00()
            r3.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9YV.onSuccess(java.lang.Object):void");
    }
}
