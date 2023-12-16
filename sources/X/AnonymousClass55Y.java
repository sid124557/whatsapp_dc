package X;

import android.os.SystemClock;
import com.whatsapp.gallerypicker.GalleryPickerFragment;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;

/* renamed from: X.55Y  reason: invalid class name */
public final class AnonymousClass55Y extends AnonymousClass5ZM {
    public final int A00;
    public final int A01;
    public final C106995aW A02;
    public final C620633i A03;
    public final C54292oU A04;
    public final C620733j A05;
    public final AnonymousClass1VX A06;
    public final AnonymousClass5O9 A07;
    public final C58392vB A08;
    public final WeakReference A09;

    public static long A00(AnonymousClass55Y r3, AbstractCollection abstractCollection) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        abstractCollection.clear();
        r3.A0F(arrayList);
        return SystemClock.uptimeMillis();
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 214 */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02b6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02b7, code lost:
        X.AnonymousClass2A8.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02ba, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00af, code lost:
        if (r7.intValue() == r8.getCount()) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0237, code lost:
        if (r7.A03.A0P(r12) == false) goto L_0x0239;
     */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r29) {
        /*
            r28 = this;
            r0 = r28
            int r5 = r0.A00
            r2 = 0
            r6 = 0
            long r16 = android.os.SystemClock.uptimeMillis()
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            int r4 = r0.A01
            r1 = 7
            if (r4 != r1) goto L_0x00b5
            X.7Mr[] r12 = com.whatsapp.gallerypicker.GalleryPickerFragment.A0S
        L_0x0015:
            java.util.HashMap r11 = X.AnonymousClass001.A0t()
            int r13 = r12.length
            r1 = 0
            r10 = 0
        L_0x001c:
            if (r10 >= r13) goto L_0x00b9
            r15 = r12[r10]
            boolean r7 = X.C18320x8.A1T(r0)
            if (r7 != 0) goto L_0x00b9
            int r14 = r15.A00
            r8 = r14 & r4
            if (r8 == 0) goto L_0x0086
            java.lang.String r9 = r15.A03
            X.5O9 r7 = r0.A07
            X.8v5 r8 = X.AnonymousClass5ZM.A04(r7, r9, r8, r1)
            X.C162457s7.A0D(r8)
            boolean r7 = r8.isEmpty()
            if (r7 != 0) goto L_0x00b1
            java.lang.String r7 = com.whatsapp.gallerypicker.GalleryPickerFragment.A0Q
            boolean r7 = X.C162457s7.A0P(r7, r9)
            if (r7 == 0) goto L_0x009d
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            int r7 = r8.getCount()
            X.AnonymousClass0x2.A1I(r14, r11, r7)
        L_0x0050:
            int r14 = r15.A02
            X.2oU r7 = r0.A04
            android.content.Context r7 = r7.A00
            int r15 = r15.A01
            java.lang.String r21 = X.C18290x4.A0l(r7, r15)
            X.8ug r19 = r8.B9S(r1)
            int r24 = r8.getCount()
            X.5Qf r7 = new X.5Qf
            r18 = r7
            r20 = r9
            r22 = r14
            r23 = r4
            r25 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r8.close()
            if (r2 >= r5) goto L_0x0089
            java.util.List r8 = X.C18290x4.A12(r7)
            r7 = 1
            java.util.List[] r7 = new java.util.List[r7]
            r7[r1] = r8
            r0.A0F(r7)
        L_0x0084:
            int r2 = r2 + 1
        L_0x0086:
            int r10 = r10 + 1
            goto L_0x001c
        L_0x0089:
            r3.add(r7)
            r7 = 1000(0x3e8, double:4.94E-321)
            long r14 = r16 + r7
            long r8 = android.os.SystemClock.uptimeMillis()
            int r7 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x0084
            long r16 = A00(r0, r3)
            goto L_0x0084
        L_0x009d:
            if (r9 != 0) goto L_0x0050
            java.lang.Object r7 = X.C18290x4.A0j(r11, r14)
            java.lang.Number r7 = (java.lang.Number) r7
            if (r7 == 0) goto L_0x0050
            int r14 = r8.getCount()
            int r7 = r7.intValue()
            if (r7 != r14) goto L_0x0050
        L_0x00b1:
            r8.close()
            goto L_0x0086
        L_0x00b5:
            X.7Mr[] r12 = com.whatsapp.gallerypicker.GalleryPickerFragment.A0R
            goto L_0x0015
        L_0x00b9:
            X.4MC r11 = r0.A02
            boolean r7 = r11.isCancelled()
            if (r7 != 0) goto L_0x02bb
            boolean r7 = X.C107385bE.A08()
            if (r7 == 0) goto L_0x010c
            X.5O9 r7 = r0.A07
            r10 = 7
            r9 = 1
            X.8v5 r8 = X.AnonymousClass5ZM.A04(r7, r6, r10, r9)
            X.C162457s7.A0D(r8)
            boolean r7 = r8.isEmpty()
            if (r7 != 0) goto L_0x0109
            r22 = 3
            X.2oU r7 = r0.A04
            android.content.Context r12 = r7.A00
            r7 = 2131886410(0x7f12014a, float:1.9407398E38)
            java.lang.String r21 = X.C18290x4.A0l(r12, r7)
            X.8ug r19 = r8.B9S(r1)
            int r24 = r8.getCount()
            X.5Qf r7 = new X.5Qf
            r18 = r7
            r20 = r6
            r23 = r10
            r25 = r9
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            if (r2 >= r5) goto L_0x01f2
            java.util.List r10 = X.C18290x4.A12(r7)
            java.util.List[] r7 = new java.util.List[r9]
            r7[r1] = r10
            r0.A0F(r7)
        L_0x0107:
            int r2 = r2 + 1
        L_0x0109:
            r8.close()
        L_0x010c:
            X.5O9 r10 = r0.A07
            X.8v5 r13 = X.AnonymousClass5ZM.A04(r10, r6, r4, r1)
            X.C162457s7.A0D(r13)
            boolean r7 = r11.isCancelled()
            if (r7 == 0) goto L_0x0154
            r13.close()
        L_0x011e:
            boolean r7 = r11.isCancelled()
            if (r7 != 0) goto L_0x02bb
            X.33i r8 = r0.A03
            X.5UR r18 = r8.A0R()
            if (r18 == 0) goto L_0x029b
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()
            java.lang.String r7 = "content://"
            r9.append(r7)
            java.lang.String r7 = "com.whatsapp"
            r9.append(r7)
            java.lang.String r7 = ".provider.media/buckets"
            java.lang.String r7 = X.AnonymousClass000.A0X(r7, r9)
            android.net.Uri r19 = android.net.Uri.parse(r7)
            r21 = r6
            r22 = r6
            r23 = r6
            r20 = r6
            android.database.Cursor r10 = r18.A03(r19, r20, r21, r22, r23)
            if (r10 == 0) goto L_0x029c
            goto L_0x020a
        L_0x0154:
            java.util.HashMap r7 = r13.B4t()
            java.util.Set r7 = r7.entrySet()
            java.util.ArrayList r12 = X.AnonymousClass002.A0J(r7)
            X.33j r7 = r0.A05
            java.text.Collator r8 = X.C86614Ku.A0w(r7)
            r7 = 1
            r8.setDecomposition(r7)
            X.8ZO r9 = new X.8ZO
            r9.<init>(r8)
            r8 = 14
            X.91R r7 = new X.91R
            r7.<init>(r9, r8)
            X.C73753g1.A0a(r12, r7)
            r13.close()
            boolean r7 = r11.isCancelled()
            if (r7 != 0) goto L_0x011e
            java.util.Iterator r18 = r12.iterator()
        L_0x0186:
            boolean r7 = r18.hasNext()
            if (r7 == 0) goto L_0x011e
            java.util.Map$Entry r7 = X.AnonymousClass001.A0w(r18)
            java.lang.String r9 = X.C18310x6.A0q(r7)
            java.lang.String r22 = X.AnonymousClass0x9.A12(r7)
            boolean r7 = r11.isCancelled()
            if (r7 != 0) goto L_0x011e
            java.lang.String r7 = com.whatsapp.gallerypicker.GalleryPickerFragment.A0Q
            boolean r7 = X.C162457s7.A0P(r9, r7)
            if (r7 != 0) goto L_0x0186
            X.8v5 r8 = X.AnonymousClass5ZM.A04(r10, r9, r4, r1)
            X.C162457s7.A0D(r8)
            boolean r7 = r8.isEmpty()
            if (r7 != 0) goto L_0x01da
            X.8ug r20 = r8.B9S(r1)
            int r25 = r8.getCount()
            r23 = 8
            X.5Qf r7 = new X.5Qf
            r19 = r7
            r21 = r9
            r24 = r4
            r26 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            if (r2 >= r5) goto L_0x01de
            java.util.List r9 = X.C18290x4.A12(r7)
            r7 = 1
            java.util.List[] r7 = new java.util.List[r7]
            r7[r1] = r9
            r0.A0F(r7)
        L_0x01d8:
            int r2 = r2 + 1
        L_0x01da:
            r8.close()
            goto L_0x0186
        L_0x01de:
            r3.add(r7)
            r12 = 1000(0x3e8, double:4.94E-321)
            long r14 = r16 + r12
            long r12 = android.os.SystemClock.uptimeMillis()
            int r7 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r7 >= 0) goto L_0x01d8
            long r16 = A00(r0, r3)
            goto L_0x01d8
        L_0x01f2:
            r3.add(r7)
            r9 = 1000(0x3e8, double:4.94E-321)
            long r12 = r16 + r9
            long r9 = android.os.SystemClock.uptimeMillis()
            int r7 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0107
            long r16 = A00(r0, r3)
            goto L_0x0107
        L_0x0207:
            r9.close()     // Catch:{ all -> 0x02b4 }
        L_0x020a:
            boolean r7 = r10.moveToNext()     // Catch:{ all -> 0x02b4 }
            if (r7 == 0) goto L_0x02a2
            X.32W r9 = com.whatsapp.jid.Jid.Companion     // Catch:{ all -> 0x02b4 }
            java.lang.String r7 = r10.getString(r1)     // Catch:{ all -> 0x02b4 }
            com.whatsapp.jid.Jid r9 = r9.A03(r7)     // Catch:{ all -> 0x02b4 }
            r7 = 1
            java.lang.String r21 = r10.getString(r7)     // Catch:{ all -> 0x02b4 }
            boolean r7 = r11.isCancelled()     // Catch:{ all -> 0x02b4 }
            if (r7 != 0) goto L_0x02a2
            boolean r7 = r9 instanceof X.C95814uZ     // Catch:{ all -> 0x02b4 }
            if (r7 == 0) goto L_0x0239
            X.5aW r7 = r0.A02     // Catch:{ all -> 0x02b4 }
            r12 = r9
            X.4uZ r12 = (X.C95814uZ) r12     // Catch:{ all -> 0x02b4 }
            X.C162457s7.A0J(r12, r1)     // Catch:{ all -> 0x02b4 }
            X.2ss r7 = r7.A03     // Catch:{ all -> 0x02b4 }
            boolean r7 = r7.A0P(r12)     // Catch:{ all -> 0x02b4 }
            if (r7 != 0) goto L_0x020a
        L_0x0239:
            java.lang.String r20 = X.C627336j.A07(r9)     // Catch:{ all -> 0x02b4 }
            X.1VX r12 = r0.A06     // Catch:{ all -> 0x02b4 }
            X.2vB r7 = r0.A08     // Catch:{ all -> 0x02b4 }
            X.4tN r9 = new X.4tN     // Catch:{ all -> 0x02b4 }
            r22 = r9
            r23 = r8
            r24 = r12
            r25 = r7
            r26 = r20
            r27 = r4
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x02b4 }
            int r7 = r9.getCount()     // Catch:{ all -> 0x02b4 }
            boolean r7 = X.AnonymousClass000.A1T(r7)     // Catch:{ all -> 0x02b4 }
            if (r7 != 0) goto L_0x0207
            if (r21 != 0) goto L_0x0260
            java.lang.String r21 = ""
        L_0x0260:
            X.8ug r19 = r9.B9S(r1)     // Catch:{ all -> 0x02b4 }
            int r24 = r9.getCount()     // Catch:{ all -> 0x02b4 }
            r22 = 9
            X.5Qf r7 = new X.5Qf     // Catch:{ all -> 0x02b4 }
            r18 = r7
            r23 = r4
            r25 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x02b4 }
            if (r2 >= r5) goto L_0x0284
            java.util.List r12 = X.C18290x4.A12(r7)     // Catch:{ all -> 0x02b4 }
            r7 = 1
            java.util.List[] r7 = new java.util.List[r7]     // Catch:{ all -> 0x02b4 }
            r7[r1] = r12     // Catch:{ all -> 0x02b4 }
            r0.A0F(r7)     // Catch:{ all -> 0x02b4 }
            goto L_0x0297
        L_0x0284:
            r3.add(r7)     // Catch:{ all -> 0x02b4 }
            r12 = 1000(0x3e8, double:4.94E-321)
            long r14 = r16 + r12
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x02b4 }
            int r7 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r7 >= 0) goto L_0x0297
            long r16 = A00(r0, r3)     // Catch:{ all -> 0x02b4 }
        L_0x0297:
            int r2 = r2 + 1
            goto L_0x0207
        L_0x029b:
            r10 = r6
        L_0x029c:
            java.lang.String r2 = "gallerypicker/cursor/null"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x02b4 }
            goto L_0x02a5
        L_0x02a2:
            r10.close()
        L_0x02a5:
            boolean r2 = r11.isCancelled()
            if (r2 != 0) goto L_0x02bb
            r2 = 1
            java.util.List[] r2 = new java.util.List[r2]
            r2[r1] = r3
            r0.A0F(r2)
            return r6
        L_0x02b4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x02b6 }
        L_0x02b6:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r10, r1)
            throw r0
        L_0x02bb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass55Y.A08(java.lang.Object[]):java.lang.Object");
    }

    public AnonymousClass55Y(C106995aW r2, C620633i r3, C54292oU r4, C620733j r5, AnonymousClass1VX r6, GalleryPickerFragment galleryPickerFragment, AnonymousClass5O9 r8, C58392vB r9, int i, int i2) {
        this.A06 = r6;
        this.A04 = r4;
        this.A07 = r8;
        this.A05 = r5;
        this.A03 = r3;
        this.A02 = r2;
        this.A08 = r9;
        this.A01 = i;
        this.A00 = i2;
        this.A09 = AnonymousClass0x9.A14(galleryPickerFragment);
    }
}
