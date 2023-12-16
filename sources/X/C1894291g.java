package X;

import android.media.MediaPlayer;

/* renamed from: X.91g  reason: invalid class name and case insensitive filesystem */
public class C1894291g implements MediaPlayer.OnErrorListener {
    public Object A00;
    public final int A01;

    public C1894291g(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0071, code lost:
        X.AnonymousClass6C7.A1J(r0, r2, r1, r6, r7);
        r3.A0Y((java.lang.String) null, true, r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007e, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r2.onError(r0, r6, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onError(android.media.MediaPlayer r5, int r6, int r7) {
        /*
            r4 = this;
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x003a;
                case 1: goto L_0x0056;
                case 2: goto L_0x0019;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r4.A00
            X.6qC r1 = (X.C138346qC) r1
            r0 = -1
            r1.A00 = r0
            r1.A03 = r0
            android.media.MediaPlayer$OnErrorListener r2 = r1.A07
            if (r2 == 0) goto L_0x0017
            android.media.MediaPlayer r0 = r1.A09
        L_0x0014:
            r2.onError(r0, r6, r7)
        L_0x0017:
            r0 = 1
            return r0
        L_0x0019:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "videoview/ Error: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ","
            X.C18260x0.A0z(r0, r1, r7)
            java.lang.Object r1 = r4.A00
            com.whatsapp.videoplayback.VideoSurfaceView r1 = (com.whatsapp.videoplayback.VideoSurfaceView) r1
            r0 = -1
            r1.A02 = r0
            r1.A06 = r0
            android.media.MediaPlayer$OnErrorListener r2 = r1.A0A
            if (r2 == 0) goto L_0x0017
            android.media.MediaPlayer r0 = r1.A0C
            goto L_0x0014
        L_0x003a:
            java.lang.Object r3 = r4.A00
            X.5YG r3 = (X.AnonymousClass5YG) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VideoPlayerOnSurfaceView/error "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r2 = " "
            X.C18260x0.A0x(r2, r1, r7)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VideoPlayerOnSurfaceView "
            goto L_0x0071
        L_0x0056:
            java.lang.Object r3 = r4.A00
            X.5YG r3 = (X.AnonymousClass5YG) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VideoPlayerOnTextureView/error "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r2 = " "
            X.C18260x0.A0x(r2, r1, r7)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VideoPlayerOnTextureView "
        L_0x0071:
            X.AnonymousClass6C7.A1J(r0, r2, r1, r6, r7)
            java.lang.String r2 = r1.toString()
            r1 = 0
            r0 = 1
            r3.A0Y(r1, r0, r2)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1894291g.onError(android.media.MediaPlayer, int, int):boolean");
    }
}
