package X;

import android.util.Pair;
import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Ya  reason: invalid class name */
public class AnonymousClass9Ya implements C202259le {
    public final /* synthetic */ C201339ju A00;
    public final /* synthetic */ List A01;

    public AnonymousClass9Ya(C201339ju r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public void BPO(X.AnonymousClass9SI r10, java.lang.Exception r11) {
        /*
            r9 = this;
            X.9ju r1 = r9.A00
            X.9Rr r0 = r1.A01
            r0.A00(r10, r11)
            if (r10 == 0) goto L_0x00b1
            X.9PU r3 = r1.A02
            java.util.List r0 = r9.A01
            java.util.LinkedList r8 = X.AnonymousClass0x9.A18()
            java.util.Iterator r2 = r0.iterator()
        L_0x0015:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r2.next()
            com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest r0 = (com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest) r0
            com.facebook.cameracore.ardelivery.model.VersionedCapability r1 = r0.mCapability
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r0 = r10.A00(r1)
            if (r0 == 0) goto L_0x0033
            int r0 = r0.mVersion
        L_0x002b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.AnonymousClass0x2.A1F(r1, r0, r8)
            goto L_0x0015
        L_0x0033:
            r0 = 0
            goto L_0x002b
        L_0x0035:
            X.5Ms r7 = r3.A02
            X.8yc r5 = r7.A00
            r4 = 0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0083, all -> 0x0053 }
            r0 = 20
            r5.get(r0, r2)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0083, all -> 0x0053 }
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r1 = r8.iterator()
        L_0x0049:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0095
            A00(r7, r5, r1)
            goto L_0x0049
        L_0x0053:
            r6 = move-exception
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r1 = r8.iterator()
        L_0x005c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0066
            A00(r7, r5, r1)
            goto L_0x005c
        L_0x0066:
            X.2bL r1 = new X.2bL
            r1.<init>()
            r0 = 1
            r1.A04 = r0
            X.32L r2 = r1.A00()
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0082
            X.9TF r1 = r3.A00
            X.9YZ r0 = new X.9YZ
            r0.<init>(r3)
            r1.A00(r4, r0, r2, r5)
        L_0x0082:
            throw r6
        L_0x0083:
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r1 = r8.iterator()
        L_0x008b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0095
            A00(r7, r5, r1)
            goto L_0x008b
        L_0x0095:
            X.2bL r1 = new X.2bL
            r1.<init>()
            r0 = 1
            r1.A04 = r0
            X.32L r2 = r1.A00()
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x00b1
            X.9TF r1 = r3.A00
            X.9YZ r0 = new X.9YZ
            r0.<init>(r3)
            r1.A00(r4, r0, r2, r5)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Ya.BPO(X.9SI, java.lang.Exception):void");
    }

    public static void A00(C103395Ms r5, AbstractCollection abstractCollection, Iterator it) {
        int intValue;
        Pair pair = (Pair) it.next();
        VersionedCapability versionedCapability = (VersionedCapability) pair.first;
        Object obj = pair.second;
        C162457s7.A0J(versionedCapability, 0);
        Number number = (Number) ((AnonymousClass8OQ) r5.A01.getValue()).get(versionedCapability);
        if (number == null) {
            intValue = 0;
        } else {
            intValue = number.intValue();
        }
        Integer valueOf = Integer.valueOf(intValue);
        if (!valueOf.equals(obj)) {
            int intValue2 = valueOf.intValue();
            abstractCollection.add(new ARModelMetadataRequest(versionedCapability, intValue2, intValue2, false));
        }
    }
}
