package com.facebook.cameracore.mediapipeline.services.externalasset;

import X.AnonymousClass0x7;
import X.AnonymousClass9JA;
import com.facebook.native_bridge.NativeDataPromise;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class ExampleExternalAssetLocalDataSource implements ExternalAssetLocalDataSource {
    private String getLocalFilePath(String str) {
        if (str == null) {
            return null;
        }
        try {
            URL url = new URI(str).toURL();
            String protocol = url.getProtocol();
            if (protocol != null && protocol.equals("file")) {
                return url.getPath();
            }
        } catch (MalformedURLException | URISyntaxException unused) {
        }
        return null;
    }

    public boolean getAsset(NativeDataPromise nativeDataPromise, String str, String str2) {
        DataInputStream dataInputStream;
        String localFilePath = getLocalFilePath(str);
        if (localFilePath == null) {
            return false;
        }
        AnonymousClass9JA r5 = new AnonymousClass9JA(localFilePath);
        byte[] bArr = new byte[((int) r5.length())];
        try {
            dataInputStream = new DataInputStream(AnonymousClass0x7.A0c(r5));
            dataInputStream.readFully(bArr);
            ExternalAssetResponse externalAssetResponse = new ExternalAssetResponse();
            externalAssetResponse.buffer = bArr;
            externalAssetResponse.length = (int) r5.length();
            externalAssetResponse.completed = true;
            nativeDataPromise.setValue(externalAssetResponse);
            dataInputStream.close();
            return true;
        } catch (IOException unused) {
            nativeDataPromise.setException("ExampleExternalAssetLocalDataSource fails to load file.");
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getStreamingURI(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            int r0 = r5.hashCode()
            switch(r0) {
                case -384488815: goto L_0x0028;
                case 452781974: goto L_0x0033;
                case 1911932022: goto L_0x003e;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.9JE r1 = X.AnonymousClass9JE.UNKNOWN
        L_0x0009:
            X.9JE r0 = X.AnonymousClass9JE.VIDEO
            r2 = 0
            if (r1 != r0) goto L_0x0049
            java.lang.String r0 = r3.getLocalFilePath(r4)
            if (r0 == 0) goto L_0x0049
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L_0x0049
            java.net.URI r0 = r1.toURI()
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0028:
            java.lang.String r0 = "model/gltf-binary"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.9JE r1 = X.AnonymousClass9JE.GLTF
            goto L_0x0009
        L_0x0033:
            java.lang.String r0 = "video/*"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.9JE r1 = X.AnonymousClass9JE.VIDEO
            goto L_0x0009
        L_0x003e:
            java.lang.String r0 = "image/*"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.9JE r1 = X.AnonymousClass9JE.IMAGE
            goto L_0x0009
        L_0x0049:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.externalasset.ExampleExternalAssetLocalDataSource.getStreamingURI(java.lang.String, java.lang.String):java.lang.String");
    }
}
