package X;

import android.database.AbstractCursor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0xv  reason: invalid class name and case insensitive filesystem */
public class C18580xv extends AbstractCursor {
    public Map A00 = null;
    public Map A01 = null;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final C56722sS A08;
    public final AnonymousClass5ZU A09;
    public final C56332ro A0A;
    public final AnonymousClass2OK A0B;
    public final AnonymousClass2L7 A0C;
    public final C45292Zl A0D;
    public final C48672fH A0E;
    public final C619332v A0F;
    public final C186568vZ A0G;
    public final C54742pD A0H;
    public final List A0I;
    public final AtomicInteger A0J = new AtomicInteger();
    public final String[] A0K;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.3d5} */
    /* JADX WARNING: type inference failed for: r4v7, types: [java.util.LinkedHashMap, java.util.AbstractMap] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getInt(int r14) {
        /*
            r13 = this;
            r0 = -1
            if (r14 == r0) goto L_0x01e9
            int r0 = r13.getPosition()
            X.3ZH r5 = r13.A00(r0)
            int r0 = r13.A05
            if (r14 != r0) goto L_0x0014
            boolean r0 = r5.A0U()
            return r0
        L_0x0014:
            int r0 = r13.A02
            r12 = 2147483647(0x7fffffff, float:NaN)
            if (r14 != r0) goto L_0x00f1
            java.util.Map r4 = r13.A00
            if (r4 != 0) goto L_0x00e5
            X.2L7 r4 = r13.A0C
            X.2pD r0 = r13.A0H
            java.lang.String r9 = r0.A01
            r7 = 0
            X.C162457s7.A0J(r9, r7)
            X.2Zk r6 = r4.A01
            X.2OK r0 = r6.A01
            X.3Mh r1 = r0.A00
            X.1Ei r0 = X.C66663Mh.A0v
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x00df
            X.2sH r0 = r6.A00
            long r10 = r0.A0H()
            X.2yy r8 = r6.A02
            java.lang.String r3 = "metadata/last_call_ranking_time"
            java.lang.String r1 = X.C60692yy.A00(r9, r3)
            android.content.SharedPreferences r0 = r8.A01()
            long r0 = X.AnonymousClass0x2.A0B(r0, r1)
            long r10 = r10 - r0
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00df
            java.lang.String r3 = X.C60692yy.A00(r9, r3)
            android.content.SharedPreferences r0 = r8.A01()
            android.content.SharedPreferences$Editor r2 = r0.edit()
            X.2sH r0 = r8.A01
            long r0 = r0.A0H()
            X.C18270x1.A0i(r2, r3, r0)
            X.2sW r2 = r4.A00
            X.3Gs r1 = new X.3Gs
            r1.<init>()
            r0 = 1000(0x3e8, float:1.401E-42)
            java.util.ArrayList r0 = r2.A04(r1, r7, r0)
            long r2 = r6.A00()
            X.4C5 r1 = X.C73723fy.A0R(r0)
            X.43n r0 = new X.43n
            r0.<init>(r4, r2)
            X.4C5 r2 = X.C829345m.A04(r0, r1)
            r1 = 24
            X.4IU r0 = new X.4IU
            r0.<init>(r1)
            X.3e0 r1 = new X.3e0
            r1.<init>(r0, r2)
            X.42e r0 = new X.42e
            r0.<init>(r4)
            X.3dz r2 = new X.3dz
            r2.<init>(r0, r1)
            r1 = 50
            boolean r0 = r2 instanceof X.C85434Gf
            if (r0 == 0) goto L_0x00d9
            X.4Gf r2 = (X.C85434Gf) r2
            X.4C5 r1 = r2.BqY(r1)
        L_0x00ab:
            X.3dy r0 = new X.3dy
            r0.<init>(r1)
            java.util.LinkedHashMap r4 = X.C18320x8.A0r()
            X.4Ju r3 = new X.4Ju
            r3.<init>((X.C72593dy) r0)
        L_0x00b9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r2 = r3.next()
            X.2q1 r2 = (X.C55232q1) r2
            java.lang.Object r0 = r2.A01
            X.C162457s7.A0D(r0)
            X.3ZF r0 = (X.AnonymousClass3ZF) r0
            X.39J r0 = r0.A0E
            com.whatsapp.jid.UserJid r1 = r0.A01
            X.C162457s7.A0D(r1)
            int r0 = r2.A00
            X.AnonymousClass0x2.A1I(r1, r4, r0)
            goto L_0x00b9
        L_0x00d9:
            X.3e3 r1 = new X.3e3
            r1.<init>(r2)
            goto L_0x00ab
        L_0x00df:
            X.3d5 r4 = X.C72043d5.A00()
        L_0x00e3:
            r13.A00 = r4
        L_0x00e5:
            X.4uZ r1 = r5.A0H
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x01d5
            java.util.Map r0 = r13.A00
            goto L_0x01cd
        L_0x00f1:
            int r0 = r13.A06
            if (r14 != r0) goto L_0x01d6
            java.util.Map r0 = r13.A01
            if (r0 != 0) goto L_0x01c1
            X.2Zl r6 = r13.A0D
            X.2pD r0 = r13.A0H
            java.lang.String r9 = r0.A01
            r0 = 0
            X.C162457s7.A0J(r9, r0)
            X.2Zk r2 = r6.A02
            X.2OK r0 = r2.A01
            X.3Mh r1 = r0.A00
            X.1Ei r0 = X.C66663Mh.A0v
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0199
            X.2sH r0 = r2.A00
            long r7 = r0.A0H()
            X.2yy r4 = r2.A02
            java.lang.String r3 = "metadata/last_message_ranking_time"
            java.lang.String r1 = X.C60692yy.A00(r9, r3)
            android.content.SharedPreferences r0 = r4.A01()
            long r0 = X.AnonymousClass0x2.A0B(r0, r1)
            long r7 = r7 - r0
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0199
            java.lang.String r3 = X.C60692yy.A00(r9, r3)
            android.content.SharedPreferences r0 = r4.A01()
            android.content.SharedPreferences$Editor r2 = r0.edit()
            X.2sH r0 = r4.A01
            long r0 = r0.A0H()
            X.C18270x1.A0i(r2, r3, r0)
            X.2sA r1 = r6.A00
            r0 = 0
            r1.A08(r0)
            X.2ss r0 = r6.A01
            java.util.Collection r0 = r0.A0E()
            java.util.ArrayList r3 = X.C18300x5.A0t(r0)
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r0.iterator()
        L_0x015d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0174
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.31A r0 = (X.AnonymousClass31A) r0
            X.4uZ r0 = r0.A05()
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            X.C18300x5.A1M(r1, r3, r7, r0)
            goto L_0x015d
        L_0x0174:
            java.util.Map r4 = r6.A00(r3)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r7.iterator()
        L_0x0180:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01aa
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.31A r0 = (X.AnonymousClass31A) r0
            X.4uZ r0 = r0.A05()
            boolean r0 = r0 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0180
            r3.add(r1)
            goto L_0x0180
        L_0x0199:
            X.3d5 r1 = X.C72043d5.A00
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>"
            X.C162457s7.A0K(r1, r0)
            X.C162457s7.A0K(r1, r0)
            X.2kM r2 = new X.2kM
            r2.<init>(r1, r1)
            goto L_0x01b3
        L_0x01aa:
            java.util.Map r0 = r6.A00(r3)
            X.2kM r2 = new X.2kM
            r2.<init>(r4, r0)
        L_0x01b3:
            java.util.Map r0 = r2.A01
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r0)
            r13.A01 = r1
            java.util.Map r0 = r2.A00
            r1.putAll(r0)
        L_0x01c1:
            X.4uZ r1 = r5.A0H
            java.util.Map r0 = r13.A01
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x01d5
            java.util.Map r0 = r13.A01
        L_0x01cd:
            java.lang.Object r0 = r0.get(r1)
            int r12 = X.AnonymousClass001.A0K(r0)
        L_0x01d5:
            return r12
        L_0x01d6:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Column #"
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = " is not an int."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r0, r1)
            throw r0
        L_0x01e9:
            java.lang.String r0 = "Invalid column index"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18580xv.getInt(int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a4, code lost:
        if (r0 == false) goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getString(int r14) {
        /*
            r13 = this;
            r0 = -1
            if (r14 == r0) goto L_0x01f4
            int r0 = r13.getPosition()
            X.3ZH r1 = r13.A00(r0)
            int r0 = r13.A04
            if (r14 != r0) goto L_0x001e
            X.2fH r3 = r13.A0E
            X.2pD r2 = r13.A0H
            X.4uZ r0 = X.AnonymousClass3ZH.A01(r1)
            if (r0 == 0) goto L_0x01d6
            java.lang.String r0 = r3.A01(r0, r2)
            return r0
        L_0x001e:
            int r0 = r13.A03
            if (r14 != r0) goto L_0x0049
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass3ZH.A07(r1)
            if (r3 == 0) goto L_0x003f
            X.2sS r2 = r13.A08
            if (r2 == 0) goto L_0x003f
            X.2m4 r0 = r2.A01
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x003f
            boolean r0 = X.C155477ey.A00(r3)
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r2.A01(r3)
            return r0
        L_0x003f:
            X.5ZU r2 = r13.A09
            r0 = 0
            X.7HU r0 = r2.A0E(r1, r0)
            java.lang.String r0 = r0.A01
            return r0
        L_0x0049:
            int r0 = r13.A05
            if (r14 == r0) goto L_0x01eb
            int r0 = r13.A02
            if (r14 == r0) goto L_0x01eb
            int r0 = r13.A06
            if (r14 == r0) goto L_0x01eb
            int r0 = r13.A07
            if (r14 != r0) goto L_0x01d8
            X.2OK r0 = r13.A0B
            X.1VX r3 = r0.A01
            r2 = 5340(0x14dc, float:7.483E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r2)
            if (r0 == 0) goto L_0x01d6
            X.4uZ r0 = r1.A0H
            if (r0 == 0) goto L_0x01d6
            java.util.concurrent.atomic.AtomicInteger r0 = r13.A0J
            int r5 = r0.getAndIncrement()
            X.8vZ r4 = r13.A0G
            r3 = 494354237(0x1d773f3d, float:3.2722871E-21)
            r2 = 0
            r4.BKl(r3, r5, r2)
            int r6 = r13.getPosition()
            if (r6 >= 0) goto L_0x00d0
            java.lang.String r6 = "invalid"
        L_0x0082:
            java.lang.String r0 = "cursor_position"
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r0, (java.lang.String) r6)
            X.4uZ r0 = r1.A0H
            boolean r0 = r0 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x00a6
            X.4uZ r0 = X.AnonymousClass3ZH.A01(r1)
            java.lang.String r6 = X.AnonymousClass36P.A04(r0)
            if (r6 == 0) goto L_0x00a6
            X.8qC r0 = X.C619332v.A04
            java.lang.Object r0 = r0.get()
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            boolean r0 = X.C18280x3.A1X(r6, r0)
            r6 = 1
            if (r0 != 0) goto L_0x00a7
        L_0x00a6:
            r6 = 0
        L_0x00a7:
            if (r6 == 0) goto L_0x0188
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "getThumbnailPicPrivacyAware/isTestContact "
            java.lang.String r0 = X.C18300x5.A0k(r1, r0, r6)
            X.C18260x0.A1J(r6, r0)
            java.lang.String r0 = "is_privacy_placeholder"
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r0, (boolean) r2)
            X.2ro r0 = r13.A0A
            java.io.File r1 = r0.A01(r1)
            java.lang.String r0 = "get_file_end"
            r4.markerPoint((int) r3, (int) r5, (java.lang.String) r0)
            r6 = 0
            if (r1 == 0) goto L_0x0181
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0181
            goto L_0x00f6
        L_0x00d0:
            r0 = 10
            if (r6 >= r0) goto L_0x00d7
            java.lang.String r6 = "<10"
            goto L_0x0082
        L_0x00d7:
            r0 = 50
            if (r6 >= r0) goto L_0x00de
            java.lang.String r6 = "<50"
            goto L_0x0082
        L_0x00de:
            r0 = 100
            if (r6 >= r0) goto L_0x00e5
            java.lang.String r6 = "<100"
            goto L_0x0082
        L_0x00e5:
            r0 = 500(0x1f4, float:7.0E-43)
            if (r6 >= r0) goto L_0x00ec
            java.lang.String r6 = "<500"
            goto L_0x0082
        L_0x00ec:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r6 >= r0) goto L_0x00f3
            java.lang.String r6 = "<1000"
            goto L_0x0082
        L_0x00f3:
            java.lang.String r6 = ">=1000"
            goto L_0x0082
        L_0x00f6:
            java.io.FileInputStream r7 = X.AnonymousClass0x9.A0g(r1)     // Catch:{ IOException -> 0x0197 }
            long r0 = r1.length()     // Catch:{ all -> 0x0177 }
            int r11 = (int) r0     // Catch:{ all -> 0x0177 }
            java.lang.String r12 = "file_size"
            long r0 = (long) r11     // Catch:{ all -> 0x0177 }
            r9 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x010e
            java.lang.String r8 = "Invalid"
        L_0x010a:
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r12, (java.lang.String) r8)     // Catch:{ all -> 0x0177 }
            goto L_0x013e
        L_0x010e:
            r9 = 2048(0x800, double:1.0118E-320)
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0117
            java.lang.String r8 = "<2KB"
            goto L_0x010a
        L_0x0117:
            r9 = 4096(0x1000, double:2.0237E-320)
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0120
            java.lang.String r8 = "<4KB"
            goto L_0x010a
        L_0x0120:
            r9 = 6144(0x1800, double:3.0355E-320)
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0129
            java.lang.String r8 = "<6KB"
            goto L_0x010a
        L_0x0129:
            r9 = 8192(0x2000, double:4.0474E-320)
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0132
            java.lang.String r8 = "<8KB"
            goto L_0x010a
        L_0x0132:
            r9 = 10240(0x2800, double:5.059E-320)
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x013b
            java.lang.String r8 = "<10KB"
            goto L_0x010a
        L_0x013b:
            java.lang.String r8 = ">=10KB"
            goto L_0x010a
        L_0x013e:
            r9 = 102400(0x19000, double:5.05923E-319)
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0154
            java.lang.String r0 = "ContactsUriHandler/RestrictedCursor/getThumbnailPic thumbnail file size is >100KB"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0177 }
            X.210 r0 = X.AnonymousClass210.FILE_TOO_LARGE     // Catch:{ all -> 0x0177 }
            android.util.Pair r8 = X.AnonymousClass0x9.A0C(r6, r0)     // Catch:{ all -> 0x0177 }
            r7.close()     // Catch:{ IOException -> 0x0197 }
            goto L_0x01a3
        L_0x0154:
            byte[] r1 = new byte[r11]     // Catch:{ all -> 0x0177 }
            java.lang.String r0 = "read_from_file_to_byte_array_end"
            r4.markerPoint((int) r3, (int) r5, (java.lang.String) r0)     // Catch:{ all -> 0x0177 }
            r7.read(r1)     // Catch:{ all -> 0x0177 }
            java.lang.String r0 = "convert_to_byte_array_end"
            r4.markerPoint((int) r3, (int) r5, (java.lang.String) r0)     // Catch:{ all -> 0x0177 }
            java.lang.String r1 = X.C18290x4.A0t(r1)     // Catch:{ all -> 0x0177 }
            java.lang.String r0 = "encode_to_base64_string_end"
            r4.markerPoint((int) r3, (int) r5, (java.lang.String) r0)     // Catch:{ all -> 0x0177 }
            X.210 r0 = X.AnonymousClass210.SUCCESS_WITH_PICTURE     // Catch:{ all -> 0x0177 }
            android.util.Pair r8 = X.AnonymousClass0x9.A0C(r1, r0)     // Catch:{ all -> 0x0177 }
            r7.close()     // Catch:{ IOException -> 0x0197 }
            goto L_0x01a3
        L_0x0177:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x017c }
            goto L_0x0180
        L_0x017c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0197 }
        L_0x0180:
            throw r1     // Catch:{ IOException -> 0x0197 }
        L_0x0181:
            X.210 r0 = X.AnonymousClass210.SUCCESS_WITHOUT_PICTURE
            android.util.Pair r8 = X.AnonymousClass0x9.A0C(r6, r0)
            goto L_0x01a3
        L_0x0188:
            java.lang.String r1 = "is_privacy_placeholder"
            r0 = 1
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r1, (boolean) r0)
            java.lang.String r1 = "/9j/4AAQSkZJRgABAQAAAQABAAD/7QCEUGhvdG9zaG9wIDMuMAA4QklNBAQAAAAAAGgcAigAYkZCTUQwYTAwMGE2ZjAxMDAwMDUxMDIwMDAwZWMwMzAwMDA2ZjA0MDAwMGU2MDQwMDAwMTYwNjAwMDA4MzA3MDAwMGQ0MDcwMDAwNTMwODAwMDBiYTA4MDAwMDBlMGIwMDAwAP/bAEMABgQFBgUEBgYFBgcHBggKEAoKCQkKFA4PDBAXFBgYFxQWFhodJR8aGyMcFhYgLCAjJicpKikZHy0wLSgwJSgpKP/bAEMBBwcHCggKEwoKEygaFhooKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKP/CABEIAGAAYAMBIgACEQEDEQH/xAAbAAACAgMBAAAAAAAAAAAAAAAEBwUGAAEDAv/EABkBAAIDAQAAAAAAAAAAAAAAAAAEAQIDBf/aAAwDAQACEAMQAAABVOZsNdDr+FBkG4VWiYAewoITmz6Da8dm9BkiCygnJ/ROKopgERivZg4aXDrXbPx2ZQ8eylxsya61C6K08+TKurz7DD2euAFnLF0rJqEsjD0YlXslWuhjpRDpIlavOcVedHWiilZ4zPgsG+oVk4cbX7pVtJhroDNdWOgmf4E88lo6FmScVa9YNizJXrVR2ah6ESJqzJN1KFg2otY8yHZIIoqIdccpRQuNOH8zbeswP//EACMQAAICAgICAgMBAAAAAAAAAAIDAQQABRESEyEQIhQgMiP/2gAIAQEAAQUC+YGZxdQywdaycLWsjGVTHJGY/atXJs0NTi6alxwqM4VONpqZF/U5YrkqfmqmWnrKArBjYCAS5uRSHJpDhqcnAZBxtKEGNpMrPBjmdHUxx9BrIgBsXiKZKSwSkcr3iGbSIkVF5A3lTjCjiag9m65fjroHzWtm/llKmLFWA8Tuc5zVv+zR8NrZr8iLY9WayOXL9VtXjS7M1rIOrsGSdrOcrl1fsv6f7rbKP9tbPDlfatq59vHo6rYmu16F3Vo17Cbbokgag97Oznllj61tjPLqpdWatnkQmZVd3QCLecRYYglbaMvbDzhqa/Qe35Fnat6Jsl2YH9aCZ6qHtbu0mWrDdTMCdOwMhTsHNXWivLdnzYEQle6t9in3KY5PSJ4VEkqTl5xE2EzF9sZN9s4UOfIiCR2ux9PZJllLjyU7i1JftxjI3P2Ts1nkWUzk2Uxj9msIu7STxrZOfgS65+SfEsKc7TguIci2cZNs5wnEWc/p/8QAIREAAgIBAwUBAAAAAAAAAAAAAQIAAxEQEiEgMUFhcRT/2gAIAQMBAT8B0LqIHB6Hcudqw2VL2GYtlTeMRGKHa2jnAljbah7lyIKlI0rbdV8iHIjjIlozT8lVwUbH5Eb84TjvK12Vc+YowNCqlcNGqpPqLXUnbmIhY7n6CoMCga//xAAhEQACAgEEAgMAAAAAAAAAAAABAgAREBIxYXEDIBMhIv/aAAgBAgEBPwHGoQMD6MSxoQug5gdDxFJU0cNtHNJ3HVQgIwhtOou0baOLTqJ5K/LbQ/Fp+oopO4NsEAijCiHiBUHMVSTZ9KlZ/8QAKxAAAQIEBAYCAgMAAAAAAAAAAQACAxEhMRASQVETICIyYYEjcQRiQlKC/9oACAEBAAY/AuSysrK3PQIFwVlZWVkS0KvIEC4KQU+0eV1RHLpiFT7m+FIolo5A4qQXGj/ddFKF0t31VSSukkKUWo3XGg/ZkpFEjAYV7W1XCFhdZ4k62TmbY8I2NkQO01GBQQUU+U47lNGraFOmJZaYwz+yhHAoYRW+09uxWYW1CESG7q3UowysGo1Re12ZgUNvlQm+8CgpJsv5UTHjudfCcN0l8sM/5WRjcrNZox4lKU+kX6aKSOIP9RNZszWsAkF8USbv2VYTvVVSE73RZ/yXAy00XDg9mp3UyiAcBg7K0Eld8vpTa8+11QwV0wwF8jqbKZRa04iaFVTCq0WioqFV5Lq+F1dXV+X/xAAkEAACAQQCAQUBAQAAAAAAAAAAAREhMUFREGFxIIGhsdHB8P/aAAgBAQABPyHl7RFjYQXiC8u7D2q9SSgohKUoLFDxQ1QhCgnlJ6FglzBCNdV8/gSVZ4hDSpfMM1gzy8vRqTXEShbgCiqFJiCwfozfYH4PJcduRtLTpwJH39FAOixraFhSEiZRHOxSHGCOuqRkzn7MRZ2JOKDXWVO1jkYnfk6vRYgAprjBCuz3mWTQk7YIa3u1/IhGmNE9XWyeDUuE+xYzaoqp0ReU98jQRohyJQc/yoVKz03IU6UKfyx1cuGfAXUupo0MXZV+yqQjdSGknR75Jd2JTLBAiU015GgUYTxnhcGXWGQaB7afsqWZVrmQCqu42G3hvgLfLBKCxBBTYXuAU6kyPugouCukiSDN+H8EMS7/AGNrNq87Gv8A6D6M4OGR6hHiDcYHVkFnwjpGFondVJlObdNopb7bllTT9hEqVIhAGtt8VIJSFiSkhGVBQpoyYyYYJonkT825c0odBIvrHYWpjPTPS9MNnf0f/9oADAMBAAIAAwAAABDiAyhzTyGRZzxNQj26KsUo/wAAb4/dJ8sNU50c/8QAJREBAAIBAwMDBQAAAAAAAAAAAQARMRAhUUFxkSBhoYGxwfDx/9oACAEDAQE/ENMozDPospQZeI7VnlYrTbyO08NnnS5YxDLb7EBvdr683LjPeXt2lCyxJTPV15/SOAt+O0Db30c/yPRk/iVJHEZku90RHcX5PzHrK/fE69vtrUyxMAa//8QAHREBAAICAwEBAAAAAAAAAAAAAQAREDEgIVGRof/aAAgBAgEBPxDCW2aR4fUbOhCEaS2UapMQwjcRhHvaisMFonY+oQotQhWt/Y9TuDQIymlz0odstcQaXZAms//EACYQAQACAQIGAgMBAQAAAAAAAAEAESExQVFhcYGRoRCxIMHw0eH/2gAIAQEAAT8Q+SgzKnVcoMfRGj6Je6LlGgx+IK0RfCLwgvOmSZ4Jyg1Hhg1PhmWC8poYa4IhkB4REafl6yLBSDV5JQkKxiAlWUW2nLV5qWxDiB93LQltQfVQFqZje0czWVfG+MKtdXgjLCn4UjdmwnnJB9JRWIyQHYHGf5XWWhlix3P5cavWqy9wWT6L/SXAvih3nie+syxWdSXU+4upbKh4n1wRWNmYyuxKNhipGhS6NODz9QlSrp3ch2Pbymoil+mi2t2Ikpku5lePksFA3bGXoTPZ4ynWCXAdTs3KZljBVUodjghgRC6rfIF/cV+0fdR4jtCtHufuCl/IaoyLjd30r5nUz4qB9MMvUv0wwEKNTihuXZD1aSXaAjlkfomB17ddnpJebrL/AEmp/wBmPN1WHl648kMwNgvIL7slQoHQa1po67eIIi2lcS3ogaAE7oH0wdGkqnFMpVQmXRhdSk25/hp7Sp4nica9q7Hwdo3PPXP3rFE3SYPaleWIjIEDG2FGAuNnJBx3F8LrHLrDMNGp2On+94WwMZqu1iTdXGGnCVAE7w4Pt8QCrrQvqrQavHaU0xhD0Jp3uLqZuQ82hyx7ADvSJjDRNc5Ppg6zIbKhK6D+XF7gC8zNAFmGOi3jkF2zR4sOKIztAbUdYwFB2D319xOWWrxGA05vcfcGUTdp+oKb5YMPYxEgALzB5Vphjrm34orKGOAE4o3kusdROXGB1t4w22RtkhS8cJf5TwYhFuOfg6tJEU1dYxkd4A3a5SVO8Go8sCp8ssLneM2l/D//2Q=="
            X.210 r0 = X.AnonymousClass210.SUCCESS_WITH_PICTURE
            android.util.Pair r8 = X.AnonymousClass0x9.A0C(r1, r0)
            goto L_0x01a3
        L_0x0197:
            r1 = move-exception
            java.lang.String r0 = "ContactsUriHandler/RestrictedCursor/getThumbnailPic encountered IO exception"
            com.whatsapp.util.Log.w(r0, r1)
            X.210 r0 = X.AnonymousClass210.IO_EXCEPTION
            android.util.Pair r8 = X.AnonymousClass0x9.A0C(r6, r0)
        L_0x01a3:
            java.lang.Object r0 = r8.second
            X.210 r0 = (X.AnonymousClass210) r0
            int r7 = r0.ordinal()
            r0 = 1
            r6 = 2
            java.lang.String r1 = "is_pic_available"
            if (r7 == r2) goto L_0x01cf
            if (r7 == r0) goto L_0x01cb
            r0 = 3
            if (r7 == r0) goto L_0x01c5
            if (r7 != r6) goto L_0x01c0
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r1, (boolean) r2)
            r0 = 147(0x93, float:2.06E-43)
        L_0x01bd:
            r4.markerEnd(r3, r5, r0)
        L_0x01c0:
            java.lang.Object r0 = r8.first
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x01c5:
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r1, (boolean) r2)
            r0 = 159(0x9f, float:2.23E-43)
            goto L_0x01bd
        L_0x01cb:
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r1, (boolean) r2)
            goto L_0x01d2
        L_0x01cf:
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r1, (boolean) r0)
        L_0x01d2:
            r4.markerEnd(r3, r5, r6)
            goto L_0x01c0
        L_0x01d6:
            r0 = 0
            return r0
        L_0x01d8:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Column #"
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = " is not a string."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r0, r1)
            throw r0
        L_0x01eb:
            int r0 = r13.getInt(r14)
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
        L_0x01f4:
            java.lang.String r0 = "Invalid column index"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18580xv.getString(int):java.lang.String");
    }

    public final AnonymousClass3ZH A00(int i) {
        if (i >= 0) {
            List list = this.A0I;
            if (i < list.size()) {
                return (AnonymousClass3ZH) list.get(i);
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Position: ");
        A0o.append(i);
        A0o.append(", size = ");
        throw AnonymousClass001.A0e(AnonymousClass000.A0h(A0o, this.A0I.size()));
    }

    public int getCount() {
        return this.A0I.size();
    }

    public boolean isNull(int i) {
        return false;
    }

    public C18580xv(C56722sS r14, AnonymousClass5ZU r15, C56332ro r16, AnonymousClass2OK r17, AnonymousClass2L7 r18, C45282Zk r19, C45292Zl r20, C48672fH r21, C619332v r22, C186568vZ r23, C54742pD r24, List list, String[] strArr) {
        String[] A1b;
        String[] strArr2 = strArr;
        if (strArr == null) {
            A1b = new String[]{"_id", "display_name", "is_group", "call_rank", "message_rank", "primary_profile_picture_bytestream"};
        } else {
            HashSet A0h = C18280x3.A0h(new String[]{"_id", "display_name", "is_group", "call_rank", "message_rank", "primary_profile_picture_bytestream"});
            ArrayList A0s = AnonymousClass001.A0s();
            int length = strArr2.length;
            for (int i = 0; i < length; i++) {
                String str = strArr[i];
                if (A0h.contains(str)) {
                    A0s.add(str);
                }
            }
            A1b = C18300x5.A1b(A0s);
        }
        if (!r19.A01.A00.A08(C66663Mh.A0v)) {
            LinkedList linkedList = new LinkedList(Arrays.asList(A1b));
            linkedList.remove("call_rank");
            linkedList.remove("message_rank");
            A1b = C18280x3.A1b(linkedList);
        }
        this.A0K = A1b;
        this.A08 = r14;
        this.A0I = AnonymousClass002.A0J(list);
        this.A0G = r23;
        this.A09 = r15;
        this.A0A = r16;
        this.A0H = r24;
        this.A0B = r17;
        this.A0C = r18;
        this.A0D = r20;
        this.A0F = r22;
        this.A0E = r21;
        this.A04 = AnonymousClass367.A00("_id", A1b);
        this.A03 = AnonymousClass367.A00("display_name", A1b);
        this.A05 = AnonymousClass367.A00("is_group", A1b);
        this.A02 = AnonymousClass367.A00("call_rank", A1b);
        this.A06 = AnonymousClass367.A00("message_rank", A1b);
        this.A07 = AnonymousClass367.A00("primary_profile_picture_bytestream", A1b);
    }

    public String[] getColumnNames() {
        return this.A0K;
    }

    public double getDouble(int i) {
        throw C18320x8.A0m();
    }

    public float getFloat(int i) {
        throw C18320x8.A0m();
    }

    public long getLong(int i) {
        throw C18320x8.A0m();
    }

    public short getShort(int i) {
        throw C18320x8.A0m();
    }
}
