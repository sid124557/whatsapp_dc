package X;

import java.lang.reflect.Constructor;
import java.util.List;

/* renamed from: X.86h  reason: invalid class name and case insensitive filesystem */
public final class C1686686h implements C180658lQ {
    public static final Constructor A00;
    public static final int[] A01 = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
        r0 = r1.equals(r0);
        r5 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bc, code lost:
        r0 = r1.equals(r0);
        r5 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c4, code lost:
        r0 = r1.equals(r0);
        r5 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00de, code lost:
        r0 = r1.equals(r0);
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e3, code lost:
        if (r0 == false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e8, code lost:
        A00(r4, r5);
     */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0216  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.C185328tT[] B0e(android.net.Uri r9, java.util.Map r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 14
            java.util.ArrayList r4 = X.AnonymousClass002.A0I(r0)     // Catch:{ all -> 0x0230 }
            java.lang.String r0 = "Content-Type"
            java.util.List r1 = X.C18320x8.A0s(r0, r10)     // Catch:{ all -> 0x0230 }
            if (r1 == 0) goto L_0x00e6
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x00e6
            java.lang.Object r1 = X.C18290x4.A0k(r1)     // Catch:{ all -> 0x0230 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0230 }
            if (r1 == 0) goto L_0x00e6
            int r0 = r1.hashCode()     // Catch:{ all -> 0x0230 }
            switch(r0) {
                case -1007807498: goto L_0x002d;
                case -586683234: goto L_0x0038;
                case 187090231: goto L_0x0043;
                default: goto L_0x0024;
            }     // Catch:{ all -> 0x0230 }
        L_0x0024:
            int r0 = r1.hashCode()     // Catch:{ all -> 0x0230 }
            switch(r0) {
                case -2123537834: goto L_0x00dc;
                case -1662384011: goto L_0x00d3;
                case -1662384007: goto L_0x00ca;
                case -1662095187: goto L_0x00c2;
                case -1606874997: goto L_0x00ba;
                case -1487394660: goto L_0x00b1;
                case -1248337486: goto L_0x00a8;
                case -1004728940: goto L_0x009f;
                case -387023398: goto L_0x009c;
                case -43467528: goto L_0x0099;
                case 13915911: goto L_0x0091;
                case 187078296: goto L_0x008e;
                case 187078297: goto L_0x0086;
                case 187078669: goto L_0x0083;
                case 187090232: goto L_0x0080;
                case 187091926: goto L_0x0077;
                case 187099443: goto L_0x006e;
                case 1331848029: goto L_0x006b;
                case 1503095341: goto L_0x0068;
                case 1504578661: goto L_0x0065;
                case 1504619009: goto L_0x005d;
                case 1504831518: goto L_0x0054;
                case 1505118770: goto L_0x0051;
                case 2039520277: goto L_0x004e;
                default: goto L_0x002b;
            }     // Catch:{ all -> 0x0230 }
        L_0x002b:
            goto L_0x00e6
        L_0x002d:
            java.lang.String r0 = "audio/x-flac"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0230 }
            if (r0 == 0) goto L_0x0024
            java.lang.String r1 = "audio/flac"
            goto L_0x0024
        L_0x0038:
            java.lang.String r0 = "audio/x-wav"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0230 }
            if (r0 == 0) goto L_0x0024
            java.lang.String r1 = "audio/wav"
            goto L_0x0024
        L_0x0043:
            java.lang.String r0 = "audio/mp3"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0230 }
            if (r0 == 0) goto L_0x0024
            java.lang.String r1 = "audio/mpeg"
            goto L_0x0024
        L_0x004e:
            java.lang.String r0 = "video/x-matroska"
            goto L_0x00c4
        L_0x0051:
            java.lang.String r0 = "audio/webm"
            goto L_0x00c4
        L_0x0054:
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0230 }
            r5 = 7
            goto L_0x00e3
        L_0x005d:
            java.lang.String r0 = "audio/flac"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0230 }
            r5 = 4
            goto L_0x00e3
        L_0x0065:
            java.lang.String r0 = "audio/eac3"
            goto L_0x00de
        L_0x0068:
            java.lang.String r0 = "audio/3gpp"
            goto L_0x00bc
        L_0x006b:
            java.lang.String r0 = "video/mp4"
            goto L_0x00aa
        L_0x006e:
            java.lang.String r0 = "audio/wav"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0230 }
            r5 = 12
            goto L_0x00e3
        L_0x0077:
            java.lang.String r0 = "audio/ogg"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0230 }
            r5 = 9
            goto L_0x00e3
        L_0x0080:
            java.lang.String r0 = "audio/mp4"
            goto L_0x00aa
        L_0x0083:
            java.lang.String r0 = "audio/amr"
            goto L_0x00bc
        L_0x0086:
            java.lang.String r0 = "audio/ac4"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0230 }
            r5 = 1
            goto L_0x00e3
        L_0x008e:
            java.lang.String r0 = "audio/ac3"
            goto L_0x00de
        L_0x0091:
            java.lang.String r0 = "video/x-flv"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0230 }
            r5 = 5
            goto L_0x00e3
        L_0x0099:
            java.lang.String r0 = "application/webm"
            goto L_0x00c4
        L_0x009c:
            java.lang.String r0 = "audio/x-matroska"
            goto L_0x00c4
        L_0x009f:
            java.lang.String r0 = "text/vtt"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0230 }
            r5 = 13
            goto L_0x00e3
        L_0x00a8:
            java.lang.String r0 = "application/mp4"
        L_0x00aa:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0230 }
            r5 = 8
            goto L_0x00e3
        L_0x00b1:
            java.lang.String r0 = "image/jpeg"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0230 }
            r5 = 14
            goto L_0x00e3
        L_0x00ba:
            java.lang.String r0 = "audio/amr-wb"
        L_0x00bc:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0230 }
            r5 = 3
            goto L_0x00e3
        L_0x00c2:
            java.lang.String r0 = "video/webm"
        L_0x00c4:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0230 }
            r5 = 6
            goto L_0x00e3
        L_0x00ca:
            java.lang.String r0 = "video/mp2t"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0230 }
            r5 = 11
            goto L_0x00e3
        L_0x00d3:
            java.lang.String r0 = "video/mp2p"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0230 }
            r5 = 10
            goto L_0x00e3
        L_0x00dc:
            java.lang.String r0 = "audio/eac3-joc"
        L_0x00de:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0230 }
            r5 = 0
        L_0x00e3:
            if (r0 == 0) goto L_0x00e6
            goto L_0x00e8
        L_0x00e6:
            r5 = -1
            goto L_0x00eb
        L_0x00e8:
            r8.A00(r4, r5)     // Catch:{ all -> 0x0230 }
        L_0x00eb:
            java.lang.String r1 = r9.getLastPathSegment()     // Catch:{ all -> 0x0230 }
            if (r1 == 0) goto L_0x020b
            java.lang.String r0 = ".ac3"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x0205
            java.lang.String r0 = ".ec3"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x0205
            java.lang.String r0 = ".ac4"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0230 }
            if (r0 == 0) goto L_0x010b
            goto L_0x0207
        L_0x010b:
            java.lang.String r0 = ".adts"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x0203
            java.lang.String r0 = ".aac"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x0203
            java.lang.String r0 = ".amr"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0230 }
            if (r0 == 0) goto L_0x0126
            r6 = 3
            goto L_0x0208
        L_0x0126:
            java.lang.String r0 = ".flac"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0230 }
            r2 = 4
            if (r0 == 0) goto L_0x0132
            r6 = 4
            goto L_0x0208
        L_0x0132:
            java.lang.String r0 = ".flv"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0230 }
            r7 = 5
            if (r0 == 0) goto L_0x013e
            r6 = 5
            goto L_0x0208
        L_0x013e:
            int r6 = r1.length()     // Catch:{ all -> 0x0230 }
            int r3 = r6 - r2
            java.lang.String r0 = ".mk"
            boolean r0 = r1.startsWith(r0, r3)     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x0201
            java.lang.String r0 = ".webm"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x0201
            java.lang.String r0 = ".mp3"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0230 }
            if (r0 == 0) goto L_0x015f
            r6 = 7
            goto L_0x0208
        L_0x015f:
            java.lang.String r2 = ".mp4"
            boolean r0 = r1.endsWith(r2)     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x01fe
            java.lang.String r0 = ".m4"
            boolean r0 = r1.startsWith(r0, r3)     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x01fe
            int r6 = r6 - r7
            boolean r0 = r1.startsWith(r2, r6)     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x01fe
            java.lang.String r0 = ".cmf"
            boolean r0 = r1.startsWith(r0, r6)     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x01fe
            java.lang.String r0 = ".og"
            boolean r0 = r1.startsWith(r0, r3)     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x01fb
            java.lang.String r0 = ".opus"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x01fb
            java.lang.String r0 = ".ps"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x01f8
            java.lang.String r0 = ".mpeg"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x01f8
            java.lang.String r0 = ".mpg"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x01f8
            java.lang.String r0 = ".m2p"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x01f8
            java.lang.String r2 = ".ts"
            boolean r0 = r1.endsWith(r2)     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x01f5
            boolean r0 = r1.startsWith(r2, r3)     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x01f5
            java.lang.String r0 = ".wav"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x01f2
            java.lang.String r0 = ".wave"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x01f2
            java.lang.String r0 = ".vtt"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x01ef
            java.lang.String r0 = ".webvtt"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x01ef
            java.lang.String r0 = ".jpg"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x01ec
            java.lang.String r0 = ".jpeg"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0230 }
            if (r0 == 0) goto L_0x020b
        L_0x01ec:
            r6 = 14
            goto L_0x0208
        L_0x01ef:
            r6 = 13
            goto L_0x0208
        L_0x01f2:
            r6 = 12
            goto L_0x0208
        L_0x01f5:
            r6 = 11
            goto L_0x0208
        L_0x01f8:
            r6 = 10
            goto L_0x0208
        L_0x01fb:
            r6 = 9
            goto L_0x0208
        L_0x01fe:
            r6 = 8
            goto L_0x0208
        L_0x0201:
            r6 = 6
            goto L_0x0208
        L_0x0203:
            r6 = 2
            goto L_0x0208
        L_0x0205:
            r6 = 0
            goto L_0x0208
        L_0x0207:
            r6 = 1
        L_0x0208:
            if (r6 == r5) goto L_0x0210
            goto L_0x020d
        L_0x020b:
            r6 = -1
            goto L_0x0210
        L_0x020d:
            r8.A00(r4, r6)     // Catch:{ all -> 0x0230 }
        L_0x0210:
            int[] r3 = A01     // Catch:{ all -> 0x0230 }
            int r2 = r3.length     // Catch:{ all -> 0x0230 }
            r1 = 0
        L_0x0214:
            if (r1 >= r2) goto L_0x0222
            r0 = r3[r1]     // Catch:{ all -> 0x0230 }
            if (r0 == r5) goto L_0x021f
            if (r0 == r6) goto L_0x021f
            r8.A00(r4, r0)     // Catch:{ all -> 0x0230 }
        L_0x021f:
            int r1 = r1 + 1
            goto L_0x0214
        L_0x0222:
            int r0 = r4.size()     // Catch:{ all -> 0x0230 }
            X.8tT[] r0 = new X.C185328tT[r0]     // Catch:{ all -> 0x0230 }
            java.lang.Object[] r0 = r4.toArray(r0)     // Catch:{ all -> 0x0230 }
            X.8tT[] r0 = (X.C185328tT[]) r0     // Catch:{ all -> 0x0230 }
            monitor-exit(r8)
            return r0
        L_0x0230:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1686686h.B0e(android.net.Uri, java.util.Map):X.8tT[]");
    }

    static {
        Constructor<? extends U> constructor = null;
        try {
            if (Boolean.TRUE.equals(AnonymousClass000.A0K(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary"), (Object) null, "isAvailable"))) {
                constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(C185328tT.class).getConstructor(new Class[]{Integer.TYPE});
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw AnonymousClass6CA.A0Q("Error instantiating FLAC extension", e);
        }
        A00 = constructor;
    }

    public final void A00(List list, int i) {
        Object obj;
        switch (i) {
            case 0:
                obj = new AnonymousClass86O();
                break;
            case 1:
                obj = new AnonymousClass86P();
                break;
            case 2:
                obj = new AnonymousClass86V(0);
                break;
            case 3:
                obj = new AnonymousClass86Z(0);
                break;
            case 4:
                Constructor constructor = A00;
                if (constructor == null) {
                    obj = new AnonymousClass86X(0);
                    break;
                } else {
                    try {
                        list.add((C185328tT) constructor.newInstance(new Object[]{0}));
                        return;
                    } catch (Exception e) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
                    }
                }
            case 5:
                obj = new AnonymousClass86T();
                break;
            case 6:
                obj = new C1685986a(0);
                break;
            case 7:
                obj = new AnonymousClass86Y(0);
                break;
            case 8:
                list.add(new C1686086b((C153267ax) null, 0));
                obj = new C1687686r(0);
                break;
            case 9:
                obj = new AnonymousClass86R();
                break;
            case 10:
                obj = new AnonymousClass86Q();
                break;
            case 11:
                obj = new AnonymousClass86W(1, 0, 112800);
                break;
            case 12:
                obj = new AnonymousClass86U();
                break;
            case 14:
                obj = new AnonymousClass86S();
                break;
            default:
                return;
        }
        list.add(obj);
    }
}
