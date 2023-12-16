package com.facebook.cameracore.mediapipeline.services.networking.implementation;

import X.AnonymousClass9MZ;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkClient;
import com.facebook.jni.HybridData;

public class NetworkClientImpl extends NetworkClient {
    public final AnonymousClass9MZ mWorker;

    private native HybridData initHybrid();

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0111 A[SYNTHETIC, Splitter:B:40:0x0111] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void sendRequest(com.facebook.native_bridge.NativeDataPromise r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String[] r25, java.lang.String[] r26, boolean r27) {
        /*
            r20 = this;
            r14 = r24
            r0 = r20
            r2 = r21
            X.9MZ r7 = r0.mWorker     // Catch:{ Exception -> 0x011c }
            com.facebook.cameracore.mediapipeline.services.networking.implementation.HTTPClientResponseHandler r3 = new com.facebook.cameracore.mediapipeline.services.networking.implementation.HTTPClientResponseHandler     // Catch:{ Exception -> 0x011c }
            r3.<init>()     // Catch:{ Exception -> 0x011c }
            X.9Ny r1 = new X.9Ny     // Catch:{ Exception -> 0x011c }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x011c }
            r4 = 0
            r13 = r22
            X.C162457s7.A0J(r13, r4)     // Catch:{ Exception -> 0x011c }
            r6 = r23
            r12 = r25
            X.C18260x0.A0R(r6, r12)     // Catch:{ Exception -> 0x011c }
            r0 = 4
            r11 = r26
            X.C162457s7.A0J(r11, r0)     // Catch:{ Exception -> 0x011c }
            X.9Nz r5 = new X.9Nz     // Catch:{ Exception -> 0x011c }
            r5.<init>(r1, r3)     // Catch:{ Exception -> 0x011c }
            X.2QY r1 = r7.A00     // Catch:{ Exception -> 0x011c }
            X.2Yr r3 = r1.A02     // Catch:{ Exception -> 0x011c }
            java.lang.String r0 = "SparkRetryHandler/onResponseFromSpark Spark responded, cleaning up"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ Exception -> 0x011c }
            r3.A00()     // Catch:{ Exception -> 0x011c }
            java.lang.String r0 = "SparkHttpClient Starting request"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x011c }
            r3 = 0
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch:{ all -> 0x00fe }
            java.lang.String r7 = r6.toUpperCase(r0)     // Catch:{ all -> 0x00fe }
            X.C162457s7.A0D(r7)     // Catch:{ all -> 0x00fe }
            java.lang.String r0 = "GET"
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x00fe }
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "POST"
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x00fe }
            if (r0 != 0) goto L_0x0063
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00fe }
            java.lang.String r0 = "Unsupported method: "
            r1.append(r0)     // Catch:{ all -> 0x00fe }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r6, r1)     // Catch:{ all -> 0x00fe }
            throw r0     // Catch:{ all -> 0x00fe }
        L_0x0063:
            int r6 = r12.length     // Catch:{ all -> 0x00fe }
            int r0 = r11.length     // Catch:{ all -> 0x00fe }
            int r10 = java.lang.Math.min(r6, r0)     // Catch:{ all -> 0x00fe }
            java.util.ArrayList r9 = X.AnonymousClass002.A0I(r10)     // Catch:{ all -> 0x00fe }
            r8 = 0
        L_0x006e:
            if (r8 >= r10) goto L_0x007f
            r7 = r25[r8]     // Catch:{ all -> 0x00fe }
            r6 = r26[r8]     // Catch:{ all -> 0x00fe }
            X.3Z6 r0 = new X.3Z6     // Catch:{ all -> 0x00fe }
            r0.<init>(r7, r6)     // Catch:{ all -> 0x00fe }
            r9.add(r0)     // Catch:{ all -> 0x00fe }
            int r8 = r8 + 1
            goto L_0x006e
        L_0x007f:
            java.util.Map r16 = X.C73813g7.A0B(r9)     // Catch:{ all -> 0x00fe }
            X.33K r11 = r1.A01     // Catch:{ all -> 0x00fe }
            if (r24 == 0) goto L_0x008d
            int r0 = r14.length()     // Catch:{ all -> 0x00fe }
            if (r0 != 0) goto L_0x008e
        L_0x008d:
            r14 = r3
        L_0x008e:
            X.3FI r0 = r1.A03     // Catch:{ all -> 0x00fe }
            java.lang.String r15 = r0.A00()     // Catch:{ all -> 0x00fe }
            r0 = 35
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00fe }
            if (r15 != 0) goto L_0x00a2
            X.3FI r0 = r11.A01     // Catch:{ all -> 0x00fe }
            java.lang.String r15 = r0.A02()     // Catch:{ all -> 0x00fe }
        L_0x00a2:
            r19 = r4
            r17 = r4
            r18 = r4
            X.4GL r6 = r11.A02(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x00fe }
            r0 = r6
            X.3PZ r0 = (X.AnonymousClass3PZ) r0     // Catch:{ all -> 0x00fb }
            java.net.HttpURLConnection r0 = r0.A01     // Catch:{ all -> 0x00fb }
            int r4 = r0.getResponseCode()     // Catch:{ all -> 0x00fb }
            X.2s4 r0 = r1.A00     // Catch:{ all -> 0x00fb }
            java.io.InputStream r7 = r6.B47(r0, r3, r12)     // Catch:{ all -> 0x00fb }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "SparkHttpClient Success with code: "
            X.C18260x0.A0y(r0, r1, r4)     // Catch:{ all -> 0x00fb }
            org.apache.http.HttpVersion r3 = org.apache.http.HttpVersion.HTTP_1_1     // Catch:{ all -> 0x00fb }
            org.apache.http.impl.EnglishReasonPhraseCatalog r1 = org.apache.http.impl.EnglishReasonPhraseCatalog.INSTANCE     // Catch:{ all -> 0x00fb }
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = r1.getReason(r4, r0)     // Catch:{ all -> 0x00fb }
            org.apache.http.message.BasicHttpResponse r1 = new org.apache.http.message.BasicHttpResponse     // Catch:{ all -> 0x00fb }
            r1.<init>(r3, r4, r0)     // Catch:{ all -> 0x00fb }
            r3 = -1
            org.apache.http.entity.InputStreamEntity r0 = new org.apache.http.entity.InputStreamEntity     // Catch:{ all -> 0x00fb }
            r0.<init>(r7, r3)     // Catch:{ all -> 0x00fb }
            r1.setEntity(r0)     // Catch:{ all -> 0x00fb }
            X.9Ny r3 = r5.A00     // Catch:{ all -> 0x00fb }
            org.apache.http.client.ResponseHandler r0 = r5.A01     // Catch:{ all -> 0x00fb }
            java.lang.Object r1 = r0.handleResponse(r1)     // Catch:{ all -> 0x00fb }
            com.facebook.cameracore.mediapipeline.services.networking.interfaces.HTTPResponse r1 = (com.facebook.cameracore.mediapipeline.services.networking.interfaces.HTTPResponse) r1     // Catch:{ all -> 0x00fb }
            com.facebook.native_bridge.NativeDataPromise r0 = r3.A01     // Catch:{ Exception -> 0x00ed }
            r0.setValue(r1)     // Catch:{ Exception -> 0x00ed }
            goto L_0x00f7
        L_0x00ed:
            r0 = move-exception
            com.facebook.native_bridge.NativeDataPromise r1 = r3.A01     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00fb }
            r1.setException(r0)     // Catch:{ all -> 0x00fb }
        L_0x00f7:
            r6.close()     // Catch:{ Exception -> 0x011c }
            return
        L_0x00fb:
            r4 = move-exception
            r3 = r6
            goto L_0x00ff
        L_0x00fe:
            r4 = move-exception
        L_0x00ff:
            java.lang.String r0 = "SparkHttpClient Error occurred"
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ all -> 0x0115 }
            X.9Ny r0 = r5.A00     // Catch:{ all -> 0x0115 }
            com.facebook.native_bridge.NativeDataPromise r1 = r0.A01     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0115 }
            r1.setException(r0)     // Catch:{ all -> 0x0115 }
            if (r3 == 0) goto L_0x0124
            r3.close()     // Catch:{ Exception -> 0x011c }
            return
        L_0x0115:
            r0 = move-exception
            if (r3 == 0) goto L_0x011b
            r3.close()     // Catch:{ Exception -> 0x011c }
        L_0x011b:
            throw r0     // Catch:{ Exception -> 0x011c }
        L_0x011c:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            r2.setException(r0)
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkClientImpl.sendRequest(com.facebook.native_bridge.NativeDataPromise, java.lang.String, java.lang.String, java.lang.String, java.lang.String[], java.lang.String[], boolean):void");
    }

    public NetworkClientImpl(AnonymousClass9MZ r2) {
        this.mWorker = r2;
        this.mHybridData = initHybrid();
    }
}
