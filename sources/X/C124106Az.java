package X;

import java.util.AbstractCollection;

/* renamed from: X.6Az  reason: invalid class name and case insensitive filesystem */
public class C124106Az implements C15630rg {
    public Object A00;
    public final int A01;

    public C124106Az(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass5ZL r2, AbstractCollection abstractCollection, boolean z) {
        abstractCollection.add(new C97824zJ(new C118995wG(r2), z));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v368, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v32, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r4v26, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0355, code lost:
        if (r9.A0X(6743) != false) goto L_0x0357;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x05e8, code lost:
        if (r9.size() <= 0) goto L_0x05ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x06ea, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x06eb, code lost:
        com.whatsapp.util.Log.e("InviteNonWhatsAppContactPickerViewModel/getFilteredNonWAContactsListViewItems/error", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x06f4, code lost:
        return X.AnonymousClass001.A0s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        if (r7.A06 != null) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0aa8, code lost:
        if (r8.A06() >= 300) goto L_0x0ab2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0e50, code lost:
        if (r2 == -3) goto L_0x0e52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0ebf, code lost:
        if (r1.B3H(r15) == false) goto L_0x0ec1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:725:?, code lost:
        return java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0111 A[Catch:{ 0nr -> 0x1031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0133 A[Catch:{ 0nr -> 0x1031 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r34) {
        /*
            r33 = this;
            r8 = r34
            r1 = r33
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x007f;
                case 1: goto L_0x004b;
                case 2: goto L_0x051d;
                case 3: goto L_0x05d3;
                case 4: goto L_0x06f5;
                case 5: goto L_0x1021;
                case 6: goto L_0x071c;
                case 7: goto L_0x0745;
                case 8: goto L_0x0797;
                case 9: goto L_0x07b3;
                case 10: goto L_0x093e;
                case 11: goto L_0x0ab8;
                case 12: goto L_0x0cd8;
                case 13: goto L_0x0d9a;
                case 14: goto L_0x0fb7;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r1.A00
            com.whatsapp.status.viewmodels.StatusesViewModel r1 = (com.whatsapp.status.viewmodels.StatusesViewModel) r1
            java.util.Map r8 = (java.util.Map) r8
            r0 = 1
            X.C162457s7.A0J(r8, r0)
            java.util.Set r6 = r1.A03
            int r0 = r8.size()
            int r1 = X.AnonymousClass8UG.A0I(r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            java.util.Iterator r5 = X.AnonymousClass0x9.A16(r8)
        L_0x0026:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x1031
            java.util.Map$Entry r2 = X.AnonymousClass001.A0w(r5)
            java.lang.Object r4 = r2.getKey()
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r3 = r2.getValue()
            X.34r r3 = (X.C623534r) r3
            boolean r2 = r6.contains(r1)
            X.5OF r1 = new X.5OF
            r1.<init>(r3, r2)
            r0.put(r4, r1)
            goto L_0x0026
        L_0x004b:
            X.C162457s7.A0H(r8)
            boolean r0 = r8 instanceof X.C91164j1
            if (r0 == 0) goto L_0x0055
            r0 = 0
            goto L_0x102d
        L_0x0055:
            boolean r0 = r8 instanceof X.C91134iy
            if (r0 != 0) goto L_0x007c
            boolean r0 = r8 instanceof X.C91094iu
            if (r0 != 0) goto L_0x007c
            boolean r0 = r8 instanceof X.C91154j0
            if (r0 != 0) goto L_0x007c
            boolean r0 = r8 instanceof X.C91114iw
            if (r0 != 0) goto L_0x007c
            boolean r0 = r8 instanceof X.C91124ix
            if (r0 != 0) goto L_0x007c
            boolean r0 = r8 instanceof X.C91144iz
            if (r0 == 0) goto L_0x0070
            r0 = 3
            goto L_0x102d
        L_0x0070:
            boolean r0 = r8 instanceof X.C91104iv
            if (r0 == 0) goto L_0x0077
            r0 = 4
            goto L_0x102d
        L_0x0077:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x007c:
            r0 = 1
            goto L_0x102d
        L_0x007f:
            java.lang.Object r3 = r1.A00
            X.5ZL r3 = (X.AnonymousClass5ZL) r3
            X.5I3 r8 = (X.AnonymousClass5I3) r8
            r4 = 1
            X.C162457s7.A0J(r8, r4)
            long r16 = android.os.SystemClock.uptimeMillis()
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            X.0QU r1 = r8.A00
            r32 = r1
            java.lang.Object r7 = r8.A01
            X.2s8 r7 = (X.C56532s8) r7
            X.C162457s7.A0H(r7)     // Catch:{ 0nr -> 0x1031 }
            int r2 = r7.A02     // Catch:{ 0nr -> 0x1031 }
            if (r2 == 0) goto L_0x00a4
            r1 = 98
            if (r1 != r2) goto L_0x00ad
        L_0x00a4:
            X.4uZ r1 = r7.A04     // Catch:{ 0nr -> 0x1031 }
            if (r1 != 0) goto L_0x00ad
            X.5dZ r2 = r7.A06     // Catch:{ 0nr -> 0x1031 }
            r1 = 1
            if (r2 == 0) goto L_0x00ae
        L_0x00ad:
            r1 = 0
        L_0x00ae:
            if (r1 == 0) goto L_0x1031
            r32.A02()     // Catch:{ 0nr -> 0x1031 }
            int r5 = r7.A02     // Catch:{ 0nr -> 0x1031 }
            r2 = 1
            if (r5 == 0) goto L_0x0340
            r1 = 98
            if (r5 == r1) goto L_0x00c5
            X.3d3 r1 = X.C72023d3.A00     // Catch:{ 0nr -> 0x1031 }
            X.5Ra r7 = new X.5Ra     // Catch:{ 0nr -> 0x1031 }
            r7.<init>(r1, r4)     // Catch:{ 0nr -> 0x1031 }
            goto L_0x04f0
        L_0x00c5:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ 0nr -> 0x1031 }
            X.5XN r1 = X.AnonymousClass5ZL.A0L     // Catch:{ 0nr -> 0x1031 }
            X.1VX r10 = r3.A0D     // Catch:{ 0nr -> 0x1031 }
            boolean r1 = r1.A00(r10)     // Catch:{ 0nr -> 0x1031 }
            r9 = 0
            java.lang.Integer r20 = java.lang.Integer.valueOf(r9)     // Catch:{ 0nr -> 0x1031 }
            if (r1 == 0) goto L_0x04eb
            r32.A02()     // Catch:{ 0nr -> 0x1031 }
            java.lang.String r1 = r7.A02()     // Catch:{ 0nr -> 0x1031 }
            X.C162457s7.A0D(r1)     // Catch:{ 0nr -> 0x1031 }
            int r1 = r1.length()     // Catch:{ 0nr -> 0x1031 }
            if (r1 <= 0) goto L_0x032e
            boolean r1 = X.C56532s8.A00(r7)     // Catch:{ 0nr -> 0x1031 }
            if (r1 == 0) goto L_0x010b
            java.util.List r6 = r3.A03(r8)     // Catch:{ 0nr -> 0x1031 }
        L_0x00f2:
            X.5P2 r8 = r3.A09     // Catch:{ 0nr -> 0x1031 }
            X.5jc r1 = r8.A04     // Catch:{ 0nr -> 0x1031 }
            r31 = r1
            X.5U8 r11 = r1.A02     // Catch:{ 0nr -> 0x1031 }
            X.08M r1 = r11.A02     // Catch:{ 0nr -> 0x1031 }
            java.lang.Number r1 = X.C86654Ky.A0i(r1)     // Catch:{ 0nr -> 0x1031 }
            if (r1 == 0) goto L_0x010e
            int r12 = r1.intValue()     // Catch:{ 0nr -> 0x1031 }
            r5 = 7
            r1 = 1
            if (r12 == r5) goto L_0x010f
            goto L_0x010e
        L_0x010b:
            X.3d3 r6 = X.C72023d3.A00     // Catch:{ 0nr -> 0x1031 }
            goto L_0x00f2
        L_0x010e:
            r1 = 0
        L_0x010f:
            if (r1 == 0) goto L_0x0133
            X.4C1 r1 = r3.A0G     // Catch:{ 0nr -> 0x1031 }
            java.lang.Object r1 = r1.get()     // Catch:{ 0nr -> 0x1031 }
            X.C162457s7.A0D(r1)     // Catch:{ 0nr -> 0x1031 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ 0nr -> 0x1031 }
            java.util.List r1 = X.C73723fy.A0F(r1)     // Catch:{ 0nr -> 0x1031 }
            java.util.List r6 = X.C73723fy.A0K(r6, r1)     // Catch:{ 0nr -> 0x1031 }
            r5 = 29
            X.4zH r4 = new X.4zH     // Catch:{ 0nr -> 0x1031 }
            r1 = r20
            r4.<init>(r1, r5)     // Catch:{ 0nr -> 0x1031 }
            java.util.List r4 = X.C73723fy.A0M(r4, r6)     // Catch:{ 0nr -> 0x1031 }
            goto L_0x04eb
        L_0x0133:
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()     // Catch:{ 0nr -> 0x1031 }
            boolean r1 = r6.isEmpty()     // Catch:{ 0nr -> 0x1031 }
            if (r1 == 0) goto L_0x0226
            r1 = 5706(0x164a, float:7.996E-42)
            boolean r1 = r10.A0X(r1)     // Catch:{ 0nr -> 0x1031 }
            if (r1 == 0) goto L_0x0226
            X.5ZO r1 = r11.A00     // Catch:{ 0nr -> 0x1031 }
            if (r1 != 0) goto L_0x014c
            r11.A00()     // Catch:{ 0nr -> 0x1031 }
        L_0x014c:
            X.5ZO r1 = r11.A00     // Catch:{ 0nr -> 0x1031 }
            r30 = r1
            X.C162457s7.A0D(r30)     // Catch:{ 0nr -> 0x1031 }
            java.lang.String r10 = r7.A02()     // Catch:{ 0nr -> 0x1031 }
            X.C162457s7.A0D(r10)     // Catch:{ 0nr -> 0x1031 }
            X.53t r9 = r8.A02     // Catch:{ 0nr -> 0x1031 }
            monitor-enter(r9)     // Catch:{ 0nr -> 0x1031 }
            X.8Tk r1 = r9.A00     // Catch:{ all -> 0x032a }
            r21 = r1
            java.util.Set r1 = r21.keySet()     // Catch:{ all -> 0x032a }
            X.C162457s7.A0D(r1)     // Catch:{ all -> 0x032a }
            java.util.Iterator r19 = r1.iterator()     // Catch:{ all -> 0x032a }
            r18 = 0
        L_0x016e:
            r14 = 0
        L_0x016f:
            boolean r1 = r19.hasNext()     // Catch:{ all -> 0x032a }
            if (r1 == 0) goto L_0x01bd
            java.lang.String r15 = X.AnonymousClass001.A0m(r19)     // Catch:{ all -> 0x032a }
            X.C162457s7.A0H(r15)     // Catch:{ all -> 0x032a }
            boolean r1 = X.C175728Zm.A0S(r15, r10, r2)     // Catch:{ all -> 0x032a }
            if (r1 == 0) goto L_0x016f
            boolean r1 = X.C175738Zn.A0Y(r15, r10, r2)     // Catch:{ all -> 0x032a }
            if (r1 == 0) goto L_0x0189
            goto L_0x01ba
        L_0x0189:
            r13 = 0
        L_0x018a:
            int r12 = r15.length()     // Catch:{ all -> 0x032a }
            if (r13 >= r12) goto L_0x016f
            char r1 = r15.charAt(r13)     // Catch:{ all -> 0x032a }
            r11 = 32
            if (r1 != r11) goto L_0x01b3
        L_0x0198:
            if (r13 >= r12) goto L_0x01a3
            char r1 = r15.charAt(r13)     // Catch:{ all -> 0x032a }
            if (r1 != r11) goto L_0x01a3
            int r13 = r13 + 1
            goto L_0x0198
        L_0x01a3:
            if (r13 >= r12) goto L_0x01b3
            java.lang.String r1 = r15.substring(r13)     // Catch:{ all -> 0x032a }
            X.C162457s7.A0D(r1)     // Catch:{ all -> 0x032a }
            boolean r1 = X.C175738Zn.A0Y(r1, r10, r2)     // Catch:{ all -> 0x032a }
            if (r1 == 0) goto L_0x01b3
            goto L_0x01b6
        L_0x01b3:
            int r13 = r13 + 1
            goto L_0x018a
        L_0x01b6:
            r18 = r15
            r14 = r13
            goto L_0x016f
        L_0x01ba:
            r18 = r15
            goto L_0x016e
        L_0x01bd:
            r1 = r18
            X.3Z6 r1 = X.AnonymousClass3Z6.A01(r1, r14)     // Catch:{ all -> 0x032a }
            java.lang.Object r12 = r1.first     // Catch:{ all -> 0x032a }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x032a }
            java.lang.Object r1 = r1.second     // Catch:{ all -> 0x032a }
            int r11 = X.AnonymousClass001.A0K(r1)     // Catch:{ all -> 0x032a }
            r1 = r21
            java.lang.Object r12 = r1.get(r12)     // Catch:{ all -> 0x032a }
            X.5T8 r12 = (X.AnonymousClass5T8) r12     // Catch:{ all -> 0x032a }
            if (r12 == 0) goto L_0x020f
            java.lang.String r1 = r12.A03     // Catch:{ all -> 0x032a }
            r25 = r1
            java.lang.String r1 = r12.A04     // Catch:{ all -> 0x032a }
            r19 = r1
            java.lang.String r1 = r12.A06     // Catch:{ all -> 0x032a }
            r18 = r1
            java.lang.Integer r14 = r12.A02     // Catch:{ all -> 0x032a }
            java.lang.String r13 = r12.A05     // Catch:{ all -> 0x032a }
            java.lang.Double r1 = r12.A00     // Catch:{ all -> 0x032a }
            java.lang.Double r12 = r12.A01     // Catch:{ all -> 0x032a }
            int r10 = X.C86664Kz.A0L(r10, r11)     // Catch:{ all -> 0x032a }
            int r15 = r10 + -1
            X.5Rb r10 = new X.5Rb     // Catch:{ all -> 0x032a }
            r10.<init>(r11, r15)     // Catch:{ all -> 0x032a }
            java.util.List r29 = X.C18290x4.A12(r10)     // Catch:{ all -> 0x032a }
            X.5T8 r10 = new X.5T8     // Catch:{ all -> 0x032a }
            r21 = r10
            r22 = r1
            r23 = r12
            r24 = r14
            r26 = r19
            r27 = r18
            r28 = r13
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x032a }
            monitor-exit(r9)     // Catch:{ 0nr -> 0x1031 }
            goto L_0x0211
        L_0x020f:
            monitor-exit(r9)     // Catch:{ 0nr -> 0x1031 }
            r10 = 0
        L_0x0211:
            if (r10 == 0) goto L_0x0226
            X.62o r11 = new X.62o     // Catch:{ 0nr -> 0x1031 }
            r11.<init>(r3, r10)     // Catch:{ 0nr -> 0x1031 }
            X.4zK r9 = new X.4zK     // Catch:{ 0nr -> 0x1031 }
            r1 = r30
            r9.<init>(r1, r10, r11)     // Catch:{ 0nr -> 0x1031 }
            java.util.List r1 = X.C18290x4.A12(r9)     // Catch:{ 0nr -> 0x1031 }
            r5.addAll(r1)     // Catch:{ 0nr -> 0x1031 }
        L_0x0226:
            r32.A02()     // Catch:{ 0nr -> 0x1031 }
            boolean r11 = r5.isEmpty()     // Catch:{ 0nr -> 0x1031 }
            X.08J r12 = r3.A07     // Catch:{ 0nr -> 0x1031 }
            X.4C1 r10 = r3.A0G     // Catch:{ 0nr -> 0x1031 }
            java.lang.Object r1 = r10.get()     // Catch:{ 0nr -> 0x1031 }
            X.C162457s7.A0D(r1)     // Catch:{ 0nr -> 0x1031 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ 0nr -> 0x1031 }
            java.util.List r9 = X.C73723fy.A0F(r1)     // Catch:{ 0nr -> 0x1031 }
            if (r11 == 0) goto L_0x0242
            r1 = r6
            goto L_0x024f
        L_0x0242:
            X.4zM r1 = r3.A01()     // Catch:{ 0nr -> 0x1031 }
            java.util.List r1 = X.C18290x4.A12(r1)     // Catch:{ 0nr -> 0x1031 }
            java.util.List r9 = X.C73723fy.A0K(r1, r9)     // Catch:{ 0nr -> 0x1031 }
            r1 = r5
        L_0x024f:
            java.util.List r13 = X.C73723fy.A0K(r1, r9)     // Catch:{ 0nr -> 0x1031 }
            r11 = 29
            X.4zH r9 = new X.4zH     // Catch:{ 0nr -> 0x1031 }
            r1 = r20
            r9.<init>(r1, r11)     // Catch:{ 0nr -> 0x1031 }
            java.util.List r1 = X.C73723fy.A0M(r9, r13)     // Catch:{ 0nr -> 0x1031 }
            r12.A0G(r1)     // Catch:{ 0nr -> 0x1031 }
            r32.A02()     // Catch:{ 0nr -> 0x1031 }
            X.63E r13 = new X.63E     // Catch:{ 0nr -> 0x1031 }
            r13.<init>(r3, r6, r5)     // Catch:{ 0nr -> 0x1031 }
            java.lang.String r12 = "business_search"
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()     // Catch:{ 0nr -> 0x1031 }
            r1 = r31
            X.7Md r9 = r1.A03     // Catch:{ 0nr -> 0x1031 }
            monitor-enter(r9)     // Catch:{ 0nr -> 0x1031 }
            boolean r1 = r9.A02     // Catch:{ all -> 0x032a }
            monitor-exit(r9)     // Catch:{ 0nr -> 0x1031 }
            if (r1 != 0) goto L_0x027f
            monitor-enter(r9)     // Catch:{ 0nr -> 0x1031 }
            r9.A02 = r2     // Catch:{ all -> 0x032a }
            monitor-exit(r9)     // Catch:{ 0nr -> 0x1031 }
        L_0x027f:
            java.lang.String r1 = r7.A02()     // Catch:{ 0nr -> 0x1031 }
            X.C162457s7.A0D(r1)     // Catch:{ 0nr -> 0x1031 }
            X.25E r9 = r8.A00(r1, r12)     // Catch:{ 0nr -> 0x1031 }
            boolean r1 = r9 instanceof X.C22311Mo     // Catch:{ 0nr -> 0x1031 }
            r8 = 0
            if (r1 == 0) goto L_0x02ca
            r32.A02()     // Catch:{ 0nr -> 0x1031 }
            X.1Mo r9 = (X.C22311Mo) r9     // Catch:{ 0nr -> 0x1031 }
            java.util.List r1 = r9.A00     // Catch:{ 0nr -> 0x1031 }
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()     // Catch:{ 0nr -> 0x1031 }
            java.util.Iterator r15 = r1.iterator()     // Catch:{ 0nr -> 0x1031 }
        L_0x029e:
            boolean r1 = r15.hasNext()     // Catch:{ 0nr -> 0x1031 }
            if (r1 == 0) goto L_0x02b6
            java.lang.Object r1 = r15.next()     // Catch:{ 0nr -> 0x1031 }
            java.lang.Object r14 = r13.invoke(r1)     // Catch:{ 0nr -> 0x1031 }
            boolean r14 = X.AnonymousClass001.A1Z(r14)     // Catch:{ 0nr -> 0x1031 }
            if (r14 == 0) goto L_0x029e
            r7.add(r1)     // Catch:{ 0nr -> 0x1031 }
            goto L_0x029e
        L_0x02b6:
            java.util.Iterator r7 = r7.iterator()     // Catch:{ 0nr -> 0x1031 }
        L_0x02ba:
            boolean r1 = r7.hasNext()     // Catch:{ 0nr -> 0x1031 }
            if (r1 == 0) goto L_0x02ea
            java.lang.Object r1 = r7.next()     // Catch:{ 0nr -> 0x1031 }
            X.5T8 r1 = (X.AnonymousClass5T8) r1     // Catch:{ 0nr -> 0x1031 }
            r3.A05(r1, r12, r11)     // Catch:{ 0nr -> 0x1031 }
            goto L_0x02ba
        L_0x02ca:
            boolean r1 = r9 instanceof X.C22321Mp     // Catch:{ 0nr -> 0x1031 }
            if (r1 == 0) goto L_0x02e6
            X.1Mp r9 = (X.C22321Mp) r9     // Catch:{ 0nr -> 0x1031 }
            int r1 = r9.A00     // Catch:{ 0nr -> 0x1031 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)     // Catch:{ 0nr -> 0x1031 }
            r7 = 32
            X.4zH r1 = new X.4zH     // Catch:{ 0nr -> 0x1031 }
            r1.<init>(r8, r7)     // Catch:{ 0nr -> 0x1031 }
            r11.add(r1)     // Catch:{ 0nr -> 0x1031 }
            java.util.List r7 = r9.A01     // Catch:{ 0nr -> 0x1031 }
            java.util.List r1 = r9.A02     // Catch:{ 0nr -> 0x1031 }
            r9 = 1
            goto L_0x02ee
        L_0x02e6:
            r7 = r8
            r1 = r8
            r9 = 0
            goto L_0x02ee
        L_0x02ea:
            boolean r9 = r9.A01     // Catch:{ 0nr -> 0x1031 }
            r7 = r8
            r1 = r8
        L_0x02ee:
            java.lang.Object r10 = r10.get()     // Catch:{ 0nr -> 0x1031 }
            X.C162457s7.A0D(r10)     // Catch:{ 0nr -> 0x1031 }
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch:{ 0nr -> 0x1031 }
            java.util.List r10 = X.C73723fy.A0F(r10)     // Catch:{ 0nr -> 0x1031 }
            r4.addAll(r10)     // Catch:{ 0nr -> 0x1031 }
            r4.addAll(r6)     // Catch:{ 0nr -> 0x1031 }
            if (r8 != 0) goto L_0x0305
            goto L_0x04b1
        L_0x0305:
            r4.addAll(r11)     // Catch:{ 0nr -> 0x1031 }
            X.2s8 r5 = r3.A0E     // Catch:{ 0nr -> 0x1031 }
            java.lang.String r20 = r5.A02()     // Catch:{ 0nr -> 0x1031 }
            int r23 = r6.size()     // Catch:{ 0nr -> 0x1031 }
            int r24 = r8.intValue()     // Catch:{ 0nr -> 0x1031 }
            X.3dI r6 = r3.A0F     // Catch:{ 0nr -> 0x1031 }
            X.5ro r5 = new X.5ro     // Catch:{ 0nr -> 0x1031 }
            r18 = r5
            r19 = r3
            r21 = r7
            r22 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24)     // Catch:{ 0nr -> 0x1031 }
            r6.execute(r5)     // Catch:{ 0nr -> 0x1031 }
            goto L_0x04eb
        L_0x032a:
            r1 = move-exception
            monitor-exit(r9)     // Catch:{ 0nr -> 0x1031 }
            goto L_0x04a4
        L_0x032e:
            boolean r1 = r3.A0K     // Catch:{ 0nr -> 0x1031 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)     // Catch:{ 0nr -> 0x1031 }
            r5 = 30
            X.4zH r1 = new X.4zH     // Catch:{ 0nr -> 0x1031 }
            r1.<init>(r6, r5)     // Catch:{ 0nr -> 0x1031 }
            r4.add(r1)     // Catch:{ 0nr -> 0x1031 }
            goto L_0x04eb
        L_0x0340:
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()     // Catch:{ 0nr -> 0x1031 }
            X.1VX r9 = r3.A0D     // Catch:{ 0nr -> 0x1031 }
            r1 = 5257(0x1489, float:7.367E-42)
            boolean r1 = r9.A0X(r1)     // Catch:{ 0nr -> 0x1031 }
            if (r1 != 0) goto L_0x0357
            r1 = 6743(0x1a57, float:9.449E-42)
            boolean r5 = r9.A0X(r1)     // Catch:{ 0nr -> 0x1031 }
            r1 = 0
            if (r5 == 0) goto L_0x0358
        L_0x0357:
            r1 = 1
        L_0x0358:
            r11 = 0
            if (r1 == 0) goto L_0x04ab
            java.lang.String r1 = r7.A02()     // Catch:{ 0nr -> 0x1031 }
            X.C162457s7.A0D(r1)     // Catch:{ 0nr -> 0x1031 }
            int r1 = r1.length()     // Catch:{ 0nr -> 0x1031 }
            if (r1 <= 0) goto L_0x04ab
            r32.A02()     // Catch:{ 0nr -> 0x1031 }
            X.5QC r1 = r3.A0B     // Catch:{ 0nr -> 0x1031 }
            java.util.List r1 = r1.A00()     // Catch:{ 0nr -> 0x1031 }
            java.util.Iterator r5 = r1.iterator()     // Catch:{ 0nr -> 0x1031 }
        L_0x0375:
            boolean r1 = r5.hasNext()     // Catch:{ 0nr -> 0x1031 }
            if (r1 == 0) goto L_0x049d
            java.lang.Object r10 = r5.next()     // Catch:{ 0nr -> 0x1031 }
            X.5dh r10 = (X.C108875dh) r10     // Catch:{ 0nr -> 0x1031 }
            int r1 = r10.A01     // Catch:{ 0nr -> 0x1031 }
            if (r1 != 0) goto L_0x0375
            X.60N r5 = new X.60N     // Catch:{ 0nr -> 0x1031 }
            r5.<init>(r3)     // Catch:{ 0nr -> 0x1031 }
            X.4zI r1 = new X.4zI     // Catch:{ 0nr -> 0x1031 }
            r1.<init>(r10, r5)     // Catch:{ 0nr -> 0x1031 }
            java.util.List r12 = X.C18290x4.A12(r1)     // Catch:{ 0nr -> 0x1031 }
            r1 = 6055(0x17a7, float:8.485E-42)
            int r5 = r9.A0N(r1)     // Catch:{ 0nr -> 0x1031 }
            int r1 = X.C86644Kx.A05(r7)     // Catch:{ 0nr -> 0x1031 }
            if (r1 < r5) goto L_0x04a5
            X.0Wx r1 = r3.A02     // Catch:{ 0nr -> 0x1031 }
            java.lang.Object r1 = r1.A07()     // Catch:{ 0nr -> 0x1031 }
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ 0nr -> 0x1031 }
            boolean r1 = X.C162457s7.A0P(r1, r5)     // Catch:{ 0nr -> 0x1031 }
            if (r1 == 0) goto L_0x04a5
            X.0Wx r1 = r3.A03     // Catch:{ 0nr -> 0x1031 }
            java.lang.Object r1 = r1.A07()     // Catch:{ 0nr -> 0x1031 }
            boolean r1 = X.C162457s7.A0P(r1, r5)     // Catch:{ 0nr -> 0x1031 }
            if (r1 == 0) goto L_0x04a5
            X.08J r13 = r3.A07     // Catch:{ 0nr -> 0x1031 }
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ 0nr -> 0x1031 }
            A00(r3, r10, r11)     // Catch:{ 0nr -> 0x1031 }
            r9 = 3
            r5 = 0
            X.4zN r1 = new X.4zN     // Catch:{ 0nr -> 0x1031 }
            r1.<init>(r5, r5, r11, r9)     // Catch:{ 0nr -> 0x1031 }
            r10.add(r1)     // Catch:{ 0nr -> 0x1031 }
            r13.A0G(r10)     // Catch:{ 0nr -> 0x1031 }
            java.util.List r1 = r3.A03(r8)     // Catch:{ 0nr -> 0x1031 }
            X.62n r13 = new X.62n     // Catch:{ 0nr -> 0x1031 }
            r13.<init>(r3, r1)     // Catch:{ 0nr -> 0x1031 }
            java.lang.String r9 = "global_search"
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ 0nr -> 0x1031 }
            X.5P2 r8 = r3.A09     // Catch:{ 0nr -> 0x1031 }
            java.lang.String r1 = r7.A02()     // Catch:{ 0nr -> 0x1031 }
            X.C162457s7.A0D(r1)     // Catch:{ 0nr -> 0x1031 }
            X.25E r8 = r8.A00(r1, r9)     // Catch:{ 0nr -> 0x1031 }
            boolean r1 = r8 instanceof X.C22311Mo     // Catch:{ 0nr -> 0x1031 }
            r18 = 0
            if (r1 == 0) goto L_0x0431
            r32.A02()     // Catch:{ 0nr -> 0x1031 }
            X.1Mo r8 = (X.C22311Mo) r8     // Catch:{ 0nr -> 0x1031 }
            java.util.List r1 = r8.A00     // Catch:{ 0nr -> 0x1031 }
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()     // Catch:{ 0nr -> 0x1031 }
            java.util.Iterator r15 = r1.iterator()     // Catch:{ 0nr -> 0x1031 }
        L_0x0400:
            boolean r1 = r15.hasNext()     // Catch:{ 0nr -> 0x1031 }
            if (r1 == 0) goto L_0x0418
            java.lang.Object r1 = r15.next()     // Catch:{ 0nr -> 0x1031 }
            java.lang.Object r14 = r13.invoke(r1)     // Catch:{ 0nr -> 0x1031 }
            boolean r14 = X.AnonymousClass001.A1Z(r14)     // Catch:{ 0nr -> 0x1031 }
            if (r14 == 0) goto L_0x0400
            r7.add(r1)     // Catch:{ 0nr -> 0x1031 }
            goto L_0x0400
        L_0x0418:
            java.util.Iterator r7 = r7.iterator()     // Catch:{ 0nr -> 0x1031 }
        L_0x041c:
            boolean r1 = r7.hasNext()     // Catch:{ 0nr -> 0x1031 }
            if (r1 == 0) goto L_0x042c
            java.lang.Object r1 = r7.next()     // Catch:{ 0nr -> 0x1031 }
            X.5T8 r1 = (X.AnonymousClass5T8) r1     // Catch:{ 0nr -> 0x1031 }
            r3.A05(r1, r9, r10)     // Catch:{ 0nr -> 0x1031 }
            goto L_0x041c
        L_0x042c:
            boolean r8 = r8.A01     // Catch:{ 0nr -> 0x1031 }
            r9 = r5
            r7 = r5
            goto L_0x0442
        L_0x0431:
            boolean r1 = r8 instanceof X.C22321Mp     // Catch:{ 0nr -> 0x1031 }
            if (r1 == 0) goto L_0x0449
            X.1Mp r8 = (X.C22321Mp) r8     // Catch:{ 0nr -> 0x1031 }
            int r1 = r8.A00     // Catch:{ 0nr -> 0x1031 }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r1)     // Catch:{ 0nr -> 0x1031 }
            java.util.List r9 = r8.A01     // Catch:{ 0nr -> 0x1031 }
            java.util.List r7 = r8.A02     // Catch:{ 0nr -> 0x1031 }
            r8 = 1
        L_0x0442:
            boolean r1 = X.AnonymousClass0x7.A1S(r10)     // Catch:{ 0nr -> 0x1031 }
            if (r1 == 0) goto L_0x0479
            goto L_0x044d
        L_0x0449:
            r9 = r5
            r7 = r5
            r8 = 0
            goto L_0x0442
        L_0x044d:
            if (r18 != 0) goto L_0x0479
            A00(r3, r6, r4)     // Catch:{ 0nr -> 0x1031 }
            java.lang.Object r1 = X.C73723fy.A03(r10)     // Catch:{ 0nr -> 0x1031 }
            r6.add(r1)     // Catch:{ 0nr -> 0x1031 }
            X.3dI r7 = r3.A0F     // Catch:{ 0nr -> 0x1031 }
            r4 = 24
            X.5sN r1 = new X.5sN     // Catch:{ 0nr -> 0x1031 }
            r1.<init>(r3, r10, r5, r4)     // Catch:{ 0nr -> 0x1031 }
            r7.execute(r1)     // Catch:{ 0nr -> 0x1031 }
            r1 = -1
            r3.A00 = r1     // Catch:{ 0nr -> 0x1031 }
            int r1 = r3.A01     // Catch:{ 0nr -> 0x1031 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ 0nr -> 0x1031 }
            r4 = 45
            X.5rV r1 = new X.5rV     // Catch:{ 0nr -> 0x1031 }
            r1.<init>(r3, r4, r5)     // Catch:{ 0nr -> 0x1031 }
            r7.execute(r1)     // Catch:{ 0nr -> 0x1031 }
            goto L_0x049b
        L_0x0479:
            A00(r3, r6, r11)     // Catch:{ 0nr -> 0x1031 }
            r6.addAll(r12)     // Catch:{ 0nr -> 0x1031 }
            if (r18 == 0) goto L_0x049b
            int r24 = r18.intValue()     // Catch:{ 0nr -> 0x1031 }
            X.3dI r4 = r3.A0F     // Catch:{ 0nr -> 0x1031 }
            X.5ro r1 = new X.5ro     // Catch:{ 0nr -> 0x1031 }
            r18 = r1
            r19 = r3
            r20 = r5
            r21 = r9
            r22 = r7
            r23 = r11
            r18.<init>(r19, r20, r21, r22, r23, r24)     // Catch:{ 0nr -> 0x1031 }
            r4.execute(r1)     // Catch:{ 0nr -> 0x1031 }
        L_0x049b:
            r11 = r8
            goto L_0x04ab
        L_0x049d:
            java.lang.String r2 = "Collection contains no element matching the predicate."
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch:{ 0nr -> 0x1031 }
            r1.<init>(r2)     // Catch:{ 0nr -> 0x1031 }
        L_0x04a4:
            throw r1     // Catch:{ 0nr -> 0x1031 }
        L_0x04a5:
            A00(r3, r6, r11)     // Catch:{ 0nr -> 0x1031 }
            r6.addAll(r12)     // Catch:{ 0nr -> 0x1031 }
        L_0x04ab:
            X.5Ra r7 = new X.5Ra     // Catch:{ 0nr -> 0x1031 }
            r7.<init>(r6, r11)     // Catch:{ 0nr -> 0x1031 }
            goto L_0x04f0
        L_0x04b1:
            boolean r1 = X.AnonymousClass0x7.A1S(r11)     // Catch:{ 0nr -> 0x1031 }
            if (r1 != 0) goto L_0x04bd
            boolean r1 = X.AnonymousClass0x7.A1S(r5)     // Catch:{ 0nr -> 0x1031 }
            if (r1 == 0) goto L_0x04c4
        L_0x04bd:
            X.4zM r1 = r3.A01()     // Catch:{ 0nr -> 0x1031 }
            r4.add(r1)     // Catch:{ 0nr -> 0x1031 }
        L_0x04c4:
            java.util.List r1 = X.C73723fy.A0K(r11, r5)     // Catch:{ 0nr -> 0x1031 }
            r4.addAll(r1)     // Catch:{ 0nr -> 0x1031 }
            X.2s8 r1 = r3.A0E     // Catch:{ 0nr -> 0x1031 }
            java.lang.String r7 = r1.A02()     // Catch:{ 0nr -> 0x1031 }
            X.3dI r6 = r3.A0F     // Catch:{ 0nr -> 0x1031 }
            r5 = 24
            X.5sN r1 = new X.5sN     // Catch:{ 0nr -> 0x1031 }
            r1.<init>(r3, r4, r7, r5)     // Catch:{ 0nr -> 0x1031 }
            r6.execute(r1)     // Catch:{ 0nr -> 0x1031 }
            r1 = -1
            r3.A00 = r1     // Catch:{ 0nr -> 0x1031 }
            int r1 = r3.A01     // Catch:{ 0nr -> 0x1031 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ 0nr -> 0x1031 }
            r1 = 12
            X.C86654Ky.A1O(r6, r3, r5, r4, r1)     // Catch:{ 0nr -> 0x1031 }
        L_0x04eb:
            X.5Ra r7 = new X.5Ra     // Catch:{ 0nr -> 0x1031 }
            r7.<init>(r4, r9)     // Catch:{ 0nr -> 0x1031 }
        L_0x04f0:
            java.util.List r1 = r7.A00     // Catch:{ 0nr -> 0x1031 }
            r0.addAll(r1)     // Catch:{ 0nr -> 0x1031 }
            X.5iD r6 = r3.A0A     // Catch:{ 0nr -> 0x1031 }
            long r4 = X.C18310x6.A0A(r16)     // Catch:{ 0nr -> 0x1031 }
            boolean r1 = r7.A01     // Catch:{ 0nr -> 0x1031 }
            if (r1 == 0) goto L_0x0500
            r2 = 0
        L_0x0500:
            X.4ru r3 = new X.4ru     // Catch:{ 0nr -> 0x1031 }
            r3.<init>()     // Catch:{ 0nr -> 0x1031 }
            java.lang.Integer r1 = X.C18290x4.A0b()     // Catch:{ 0nr -> 0x1031 }
            r3.A02 = r1     // Catch:{ 0nr -> 0x1031 }
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ 0nr -> 0x1031 }
            r3.A04 = r1     // Catch:{ 0nr -> 0x1031 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)     // Catch:{ 0nr -> 0x1031 }
            r3.A00 = r1     // Catch:{ 0nr -> 0x1031 }
            X.4FV r1 = r6.A02     // Catch:{ 0nr -> 0x1031 }
            r1.BhD(r3)     // Catch:{ 0nr -> 0x1031 }
            return r0
        L_0x051d:
            java.lang.Object r5 = r1.A00
            X.4Ts r5 = (X.AnonymousClass4Ts) r5
            X.5I3 r8 = (X.AnonymousClass5I3) r8
            java.lang.Object r9 = r8.A01
            java.util.Collection r9 = (java.util.Collection) r9
            X.0QU r6 = r8.A00
            r6.A02()     // Catch:{ 0nr -> 0x05c8 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ 0nr -> 0x05c8 }
            X.2oU r7 = r5.A07     // Catch:{ 0nr -> 0x05c8 }
            X.3Ex r3 = r5.A05     // Catch:{ 0nr -> 0x05c8 }
            X.33i r2 = r5.A06     // Catch:{ 0nr -> 0x05c8 }
            X.33j r4 = r5.A08     // Catch:{ 0nr -> 0x05c8 }
            X.5Y4 r1 = new X.5Y4     // Catch:{ 0nr -> 0x05c8 }
            r1.<init>(r3, r2, r7, r4)     // Catch:{ 0nr -> 0x05c8 }
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ 0nr -> 0x05c8 }
            X.3Ex r2 = r1.A00     // Catch:{ 0nr -> 0x05c8 }
            java.util.HashSet r1 = X.AnonymousClass0x9.A15(r9)     // Catch:{ 0nr -> 0x05c8 }
            java.util.Map r1 = r2.A0I(r1)     // Catch:{ 0nr -> 0x05c8 }
            java.util.Iterator r7 = X.AnonymousClass000.A0q(r1)     // Catch:{ 0nr -> 0x05c8 }
        L_0x054f:
            boolean r1 = r7.hasNext()     // Catch:{ 0nr -> 0x05c8 }
            if (r1 == 0) goto L_0x0597
            java.util.Map$Entry r2 = X.AnonymousClass001.A0w(r7)     // Catch:{ 0nr -> 0x05c8 }
            java.lang.Object r1 = r2.getKey()     // Catch:{ 0nr -> 0x05c8 }
            boolean r1 = r1 instanceof com.whatsapp.jid.UserJid     // Catch:{ 0nr -> 0x05c8 }
            if (r1 != 0) goto L_0x0567
            java.lang.String r1 = "ContactStruct/constructContactsFromUserJid chat JID not an instance of user JID"
        L_0x0563:
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ 0nr -> 0x05c8 }
            goto L_0x054f
        L_0x0567:
            java.lang.Object r1 = r2.getValue()     // Catch:{ 0nr -> 0x05c8 }
            if (r1 != 0) goto L_0x0570
            java.lang.String r1 = "ContactStruct/constructContactsFromUserJid null WaContact"
            goto L_0x0563
        L_0x0570:
            java.lang.Object r9 = r2.getKey()     // Catch:{ 0nr -> 0x05c8 }
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9     // Catch:{ 0nr -> 0x05c8 }
            java.lang.Object r1 = r2.getValue()     // Catch:{ 0nr -> 0x05c8 }
            X.3ZH r1 = (X.AnonymousClass3ZH) r1     // Catch:{ 0nr -> 0x05c8 }
            X.5a1 r8 = new X.5a1     // Catch:{ 0nr -> 0x05c8 }
            r8.<init>()     // Catch:{ 0nr -> 0x05c8 }
            X.5Ot r2 = r8.A0A     // Catch:{ 0nr -> 0x05c8 }
            java.lang.String r1 = r1.A0J()     // Catch:{ 0nr -> 0x05c8 }
            r2.A01 = r1     // Catch:{ 0nr -> 0x05c8 }
            r12 = 2
            java.lang.String r10 = X.AnonymousClass36P.A06(r9)     // Catch:{ 0nr -> 0x05c8 }
            r11 = 0
            r13 = 1
            r8.A04(r9, r10, r11, r12, r13)     // Catch:{ 0nr -> 0x05c8 }
            r3.add(r8)     // Catch:{ 0nr -> 0x05c8 }
            goto L_0x054f
        L_0x0597:
            java.util.Iterator r7 = r3.iterator()     // Catch:{ 0nr -> 0x05c8 }
        L_0x059b:
            boolean r1 = r7.hasNext()     // Catch:{ 0nr -> 0x05c8 }
            if (r1 == 0) goto L_0x1031
            java.lang.Object r3 = r7.next()     // Catch:{ 0nr -> 0x05c8 }
            X.5a1 r3 = (X.C106705a1) r3     // Catch:{ 0nr -> 0x05c8 }
            r6.A02()     // Catch:{ 0nr -> 0x05c8 }
            X.5Xx r2 = r5.A04     // Catch:{ 0nr -> 0x05c8 }
            X.5Wg r1 = new X.5Wg     // Catch:{ 0nr -> 0x05c8 }
            r1.<init>(r2, r4)     // Catch:{ 0nr -> 0x05c8 }
            java.lang.String r1 = r1.A01(r3)     // Catch:{ 6zK -> 0x05b6 }
            goto L_0x05c2
        L_0x05b6:
            r3 = move-exception
            java.lang.String r2 = "ContactsAttachmentSelectorViewModel/ Could not create VCard"
            X.23q r1 = new X.23q     // Catch:{ 0nr -> 0x05c8 }
            r1.<init>(r3)     // Catch:{ 0nr -> 0x05c8 }
            com.whatsapp.util.Log.e(r2, r1)     // Catch:{ 0nr -> 0x05c8 }
            r1 = 0
        L_0x05c2:
            if (r1 == 0) goto L_0x059b
            r0.add(r1)     // Catch:{ 0nr -> 0x05c8 }
            goto L_0x059b
        L_0x05c8:
            r1 = move-exception
            java.lang.String r0 = "ContactsAttachmentSelectorViewModel/convertContacts operation cancelled"
            com.whatsapp.util.Log.d(r0, r1)
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            return r0
        L_0x05d3:
            java.lang.Object r6 = r1.A00
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r6 = (com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel) r6
            X.5I3 r8 = (X.AnonymousClass5I3) r8
            java.lang.Object r9 = r8.A01
            java.util.List r9 = (java.util.List) r9
            X.0QU r4 = r8.A00
            r7 = 1
            r5 = 0
            if (r9 == 0) goto L_0x05ea
            int r0 = r9.size()
            r11 = 1
            if (r0 > 0) goto L_0x05eb
        L_0x05ea:
            r11 = 0
        L_0x05eb:
            r4.A02()     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            monitor-enter(r6)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            java.util.List r2 = r6.A0E     // Catch:{ all -> 0x06e7 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x06e7 }
            if (r0 == 0) goto L_0x05fc
            X.3Ex r0 = r6.A09     // Catch:{ all -> 0x06e7 }
            r0.A0i(r2)     // Catch:{ all -> 0x06e7 }
        L_0x05fc:
            monitor-exit(r6)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            r4.A02()     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            java.util.HashMap r3 = X.AnonymousClass001.A0t()     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            if (r11 == 0) goto L_0x064e
            X.5ZU r1 = r6.A0A     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            X.7HT r0 = new X.7HT     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            r0.<init>(r1, r9)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            java.util.List r10 = java.util.Collections.singletonList(r0)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            java.util.Iterator r9 = r2.iterator()     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
        L_0x0615:
            boolean r0 = r9.hasNext()     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            if (r0 == 0) goto L_0x067b
            X.3ZH r8 = X.C18310x6.A0R(r9)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            r4.A02()     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            if (r10 == 0) goto L_0x0645
            boolean r0 = r10.isEmpty()     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            if (r0 != 0) goto L_0x0645
            java.util.Iterator r2 = r10.iterator()     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
        L_0x062e:
            boolean r0 = r2.hasNext()     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            if (r0 == 0) goto L_0x0645
            java.lang.Object r0 = r2.next()     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            X.7HT r0 = (X.AnonymousClass7HT) r0     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            X.5ZU r1 = r0.A00     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            java.util.List r0 = r0.A01     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            boolean r0 = r1.A0f(r8, r0, r7)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            if (r0 != 0) goto L_0x062e
            goto L_0x0647
        L_0x0645:
            r0 = 1
            goto L_0x0648
        L_0x0647:
            r0 = 0
        L_0x0648:
            if (r0 == 0) goto L_0x0615
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel.A00(r8, r3)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            goto L_0x0615
        L_0x064e:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
        L_0x0652:
            boolean r0 = r2.hasNext()     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            if (r0 == 0) goto L_0x067b
            X.3ZH r1 = X.C18310x6.A0R(r2)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            r4.A02()     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel.A00(r1, r3)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            boolean r0 = r6.A01     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            if (r0 != 0) goto L_0x0652
            java.lang.String r0 = r1.A0J()     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            java.util.List r0 = (java.util.List) r0     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            if (r0 == 0) goto L_0x0652
            int r0 = r0.size()     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            if (r0 <= r7) goto L_0x0652
            r6.A01 = r7     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            goto L_0x0652
        L_0x067b:
            java.util.LinkedList r4 = X.AnonymousClass0x9.A18()     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            java.util.Iterator r3 = X.AnonymousClass001.A0u(r3)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
        L_0x0683:
            boolean r0 = r3.hasNext()     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            if (r0 == 0) goto L_0x06a0
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r3)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            java.lang.String r2 = X.C18310x6.A0q(r0)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            java.lang.Object r1 = r0.getValue()     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            java.util.List r1 = (java.util.List) r1     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            X.5kJ r0 = new X.5kJ     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            r0.<init>(r2, r1)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            r4.add(r0)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            goto L_0x0683
        L_0x06a0:
            X.33j r1 = r6.A0B     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            X.5sQ r0 = new X.5sQ     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            r0.<init>(r1)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            java.util.Collections.sort(r4, r0)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            r0.<init>(r4)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            boolean r1 = r0.isEmpty()     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            if (r1 != 0) goto L_0x06c7
            android.app.Application r2 = r6.A00     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            r1 = 2131895932(0x7f12267c, float:1.942671E38)
            java.lang.String r2 = r2.getString(r1)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            X.8Fs r1 = new X.8Fs     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            r1.<init>(r2)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            r0.add(r5, r1)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            return r0
        L_0x06c7:
            if (r11 == 0) goto L_0x1031
            java.lang.String r1 = r6.A00     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            if (r1 != 0) goto L_0x1031
            android.app.Application r4 = r6.A00     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            r3 = 2131893369(0x7f121c79, float:1.9421513E38)
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            java.lang.String r1 = r6.A00     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            java.lang.String r2 = X.AnonymousClass002.A0F(r4, r1, r2, r5, r3)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            X.8Fr r1 = new X.8Fr     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            r1.<init>(r2)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            r0.add(r1)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            return r0
        L_0x06e7:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
            throw r0     // Catch:{ 0nr | IllegalStateException -> 0x06ea }
        L_0x06ea:
            r1 = move-exception
            java.lang.String r0 = "InviteNonWhatsAppContactPickerViewModel/getFilteredNonWAContactsListViewItems/error"
            com.whatsapp.util.Log.e(r0, r1)
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            return r0
        L_0x06f5:
            java.lang.Object r0 = r1.A00
            X.4mN r0 = (X.C92274mN) r0
            X.5Ha r8 = (X.C101985Ha) r8
            X.4FU r3 = r0.A05
            r3.BjL()
            X.1fJ r0 = r0.A0W
            java.util.Set r6 = java.util.Collections.singleton(r0)
            int r2 = r8.A00
            r9 = 0
            r0 = 0
            X.1fJ r1 = r8.A01
            r8 = 0
            if (r1 == 0) goto L_0x0710
            r8 = 2
        L_0x0710:
            r10 = 1
            r4 = r1
            r5 = r0
            r7 = r2
            com.whatsapp.conversationslist.LeaveGroupsDialogFragment r1 = com.whatsapp.conversationslist.LeaveGroupsDialogFragment.A00(r4, r5, r6, r7, r8, r9, r10)
            r3.Bon(r1, r0)
            return r0
        L_0x071c:
            java.lang.Object r0 = r1.A00
            X.53w r0 = (X.C989553w) r0
            X.5Ha r8 = (X.C101985Ha) r8
            java.lang.Object r3 = r0.A00
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            r3.BjL()
            X.1fJ r0 = r3.A1h
            java.util.Set r6 = java.util.Collections.singleton(r0)
            int r2 = r8.A00
            r9 = 0
            r0 = 0
            X.1fJ r1 = r8.A01
            r8 = 0
            if (r1 == 0) goto L_0x0739
            r8 = 2
        L_0x0739:
            r10 = 1
            r4 = r1
            r5 = r0
            r7 = r2
            com.whatsapp.conversationslist.LeaveGroupsDialogFragment r1 = com.whatsapp.conversationslist.LeaveGroupsDialogFragment.A00(r4, r5, r6, r7, r8, r9, r10)
            r3.Bon(r1, r0)
            return r0
        L_0x0745:
            java.lang.Object r6 = r1.A00
            X.4US r6 = (X.AnonymousClass4US) r6
            X.7N6 r8 = (X.AnonymousClass7N6) r8
            X.58v r5 = r8.A01
            int r2 = r5.ordinal()
            r0 = 0
            r1 = 0
            if (r2 != r0) goto L_0x0782
            r6.A00 = r1
            java.util.List r0 = r8.A03
            java.util.ArrayList r4 = X.C73783g4.A0c(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0761:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x078d
            java.lang.Object r2 = r3.next()
            X.1RL r2 = (X.AnonymousClass1RL) r2
            X.3Ex r1 = r6.A03
            X.31A r0 = r2.A0P
            X.4uZ r0 = r0.A05()
            X.3ZH r1 = r1.A0A(r0)
            X.4xH r0 = new X.4xH
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x0761
        L_0x0782:
            X.47C r0 = r6.A00
            if (r0 == 0) goto L_0x0789
            r0.cancel()
        L_0x0789:
            r6.A00 = r1
            X.3d3 r4 = X.C72023d3.A00
        L_0x078d:
            java.lang.String r2 = r8.A02
            X.8SE r1 = r8.A00
            X.7N7 r0 = new X.7N7
            r0.<init>(r1, r5, r2, r4)
            return r0
        L_0x0797:
            java.lang.Object r2 = r1.A00
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r2 = (com.whatsapp.newsletter.viewmodel.NewsletterViewModel) r2
            java.util.Map r8 = (java.util.Map) r8
            X.4uY r0 = r2.A00
            java.lang.Object r0 = r8.get(r0)
            if (r0 != 0) goto L_0x1031
            X.5m4 r1 = r2.A03
            X.4uY r0 = r2.A00
            X.5Rp r0 = r1.A01(r0)
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.newsletter.cache.NewsletterState"
            X.C162457s7.A0K(r0, r1)
            return r0
        L_0x07b3:
            java.lang.Object r4 = r1.A00
            X.5P7 r4 = (X.AnonymousClass5P7) r4
            X.5I3 r8 = (X.AnonymousClass5I3) r8
            java.lang.String r5 = "filter"
            long r18 = android.os.SystemClock.uptimeMillis()
            X.08M r3 = r4.A04
            X.AnonymousClass0x7.A18(r3)
            java.lang.Object r10 = r8.A01
            X.2s8 r10 = (X.C56532s8) r10
            r9 = 1
            java.lang.Object[] r2 = X.AnonymousClass002.A0M()
            long r0 = java.lang.System.nanoTime()
            X.C18280x3.A1S(r2, r0)
            X.AnonymousClass000.A1P(r2, r9, r9)
            int r7 = java.util.Arrays.hashCode(r2)
            X.8JP r6 = r4.A0D
            r2 = 926875649(0x373f0001, float:1.1384488E-5)
            r6.markerStart(r2, r7)
            int r1 = r10.A02
            java.lang.String r0 = "type"
            r6.markerAnnotate((int) r2, (int) r7, (java.lang.String) r0, (int) r1)
            X.4uZ r0 = r10.A04
            boolean r1 = X.AnonymousClass000.A1W(r0)
            java.lang.String r0 = "jid"
            r6.markerAnnotate((int) r2, (int) r7, (java.lang.String) r0, (boolean) r1)
            A01(r6, r10, r7, r9)
            X.0QU r14 = r8.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r13 = "chatSearchManager/getContactsForQuery/"
            r1.append(r13)
            java.util.concurrent.atomic.AtomicInteger r12 = r4.A0H
            int r0 = r12.getAndIncrement()
            r1.append(r0)
            java.lang.String r9 = "/"
            r1.append(r9)
            int r0 = X.C86644Kx.A05(r10)
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            X.33M r8 = new X.33M
            r8.<init>((java.lang.String) r0)
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r1 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)     // Catch:{ 0nr -> 0x092d }
            int r1 = r10.A02     // Catch:{ 0nr -> 0x092d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ 0nr -> 0x092d }
            boolean r1 = r11.equals(r1)     // Catch:{ 0nr -> 0x092d }
            if (r1 == 0) goto L_0x0841
            X.4uZ r1 = r10.A04     // Catch:{ 0nr -> 0x092d }
            if (r1 != 0) goto L_0x0841
            boolean r1 = X.C56532s8.A00(r10)     // Catch:{ 0nr -> 0x092d }
            if (r1 != 0) goto L_0x084e
            X.5dZ r1 = r10.A06     // Catch:{ 0nr -> 0x092d }
            if (r1 != 0) goto L_0x084e
        L_0x0841:
            java.lang.String r1 = "empty"
            r8.A08(r1)     // Catch:{ 0nr -> 0x092d }
            r6.markerDrop(r2, r7)     // Catch:{ 0nr -> 0x092d }
            X.AnonymousClass0x9.A1I(r3)     // Catch:{ 0nr -> 0x092d }
            goto L_0x0cbb
        L_0x084e:
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()     // Catch:{ 0nr -> 0x092d }
            X.65X r11 = r4.A0E     // Catch:{ 0nr -> 0x092d }
            java.util.List r1 = r10.A04()     // Catch:{ 0nr -> 0x092d }
            X.5lP r11 = r11.B07(r1)     // Catch:{ 0nr -> 0x092d }
            boolean r1 = X.C56532s8.A00(r10)     // Catch:{ 0nr -> 0x092d }
            if (r1 == 0) goto L_0x0865
            r2.add(r11)     // Catch:{ 0nr -> 0x092d }
        L_0x0865:
            X.5dZ r15 = r10.A06     // Catch:{ 0nr -> 0x092d }
            if (r15 == 0) goto L_0x0872
            X.5Qp r1 = r4.A0F     // Catch:{ 0nr -> 0x092d }
            X.49e r1 = r1.A00(r15)     // Catch:{ 0nr -> 0x092d }
            r2.add(r1)     // Catch:{ 0nr -> 0x092d }
        L_0x0872:
            r8.A08(r5)     // Catch:{ 0nr -> 0x092d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ 0nr -> 0x092d }
            X.AnonymousClass5YZ.A01(r6, r1, r5)     // Catch:{ 0nr -> 0x092d }
            r14.A02()     // Catch:{ 0nr -> 0x092d }
            X.314 r1 = r4.A09     // Catch:{ 0nr -> 0x092d }
            java.util.List r5 = r1.A05()     // Catch:{ 0nr -> 0x092d }
            java.lang.String r1 = "get"
            r8.A08(r1)     // Catch:{ 0nr -> 0x092d }
            java.util.Iterator r17 = r5.iterator()     // Catch:{ 0nr -> 0x092d }
        L_0x088e:
            boolean r1 = r17.hasNext()     // Catch:{ 0nr -> 0x092d }
            if (r1 == 0) goto L_0x08c1
            X.4uZ r5 = X.C18300x5.A0P(r17)     // Catch:{ 0nr -> 0x092d }
            r14.A02()     // Catch:{ 0nr -> 0x092d }
            X.5aW r15 = r4.A06     // Catch:{ 0nr -> 0x092d }
            boolean r1 = r15.A0J     // Catch:{ 0nr -> 0x092d }
            r16 = 1
            if (r1 == 0) goto L_0x08af
            boolean r1 = r5 instanceof com.whatsapp.jid.UserJid     // Catch:{ 0nr -> 0x092d }
            if (r1 != 0) goto L_0x08af
            boolean r1 = r15.A0I(r5)     // Catch:{ 0nr -> 0x092d }
            if (r1 == 0) goto L_0x08af
            r16 = 0
        L_0x08af:
            if (r16 == 0) goto L_0x088e
            boolean r1 = X.C66473Lo.A00(r5, r2)     // Catch:{ 0nr -> 0x092d }
            if (r1 == 0) goto L_0x088e
            X.3Lo r1 = r4.A0B     // Catch:{ 0nr -> 0x092d }
            X.3ZH r1 = r1.A01(r5)     // Catch:{ 0nr -> 0x092d }
            r0.add(r1)     // Catch:{ 0nr -> 0x092d }
            goto L_0x088e
        L_0x08c1:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ 0nr -> 0x092d }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ 0nr -> 0x092d }
            r2.append(r13)     // Catch:{ 0nr -> 0x092d }
            int r1 = r12.getAndIncrement()     // Catch:{ 0nr -> 0x092d }
            r2.append(r1)     // Catch:{ 0nr -> 0x092d }
            r2.append(r9)     // Catch:{ 0nr -> 0x092d }
            int r1 = X.C86644Kx.A05(r10)     // Catch:{ 0nr -> 0x092d }
            java.lang.String r1 = X.AnonymousClass000.A0h(r2, r1)     // Catch:{ 0nr -> 0x092d }
            r5.append(r1)     // Catch:{ 0nr -> 0x092d }
            java.lang.String r1 = "/breakdown: get:"
            r5.append(r1)     // Catch:{ 0nr -> 0x092d }
            long r1 = r11.A00     // Catch:{ 0nr -> 0x092d }
            r9 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 / r9
            r5.append(r1)     // Catch:{ 0nr -> 0x092d }
            java.lang.String r1 = "; match: "
            r5.append(r1)     // Catch:{ 0nr -> 0x092d }
            long r1 = r11.A01     // Catch:{ 0nr -> 0x092d }
            long r1 = r1 / r9
            X.C18260x0.A1I(r5, r1)     // Catch:{ 0nr -> 0x092d }
            java.lang.String r1 = "done"
            r8.A08(r1)     // Catch:{ 0nr -> 0x092d }
            X.AnonymousClass0x9.A1I(r3)     // Catch:{ 0nr -> 0x092d }
            r1 = 2
            X.AnonymousClass5YZ.A00(r6, r7, r1)     // Catch:{ 0nr -> 0x092d }
            long r9 = X.C18310x6.A0A(r18)     // Catch:{ 0nr -> 0x092d }
            X.4ru r3 = new X.4ru     // Catch:{ 0nr -> 0x092d }
            r3.<init>()     // Catch:{ 0nr -> 0x092d }
            r2 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ 0nr -> 0x092d }
            r3.A02 = r1     // Catch:{ 0nr -> 0x092d }
            java.lang.Long r1 = java.lang.Long.valueOf(r9)     // Catch:{ 0nr -> 0x092d }
            r3.A04 = r1     // Catch:{ 0nr -> 0x092d }
            boolean r1 = r4.A01     // Catch:{ 0nr -> 0x092d }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ 0nr -> 0x092d }
            r3.A00 = r1     // Catch:{ 0nr -> 0x092d }
            r4.A01 = r2     // Catch:{ 0nr -> 0x092d }
            X.4FV r1 = r4.A0C     // Catch:{ 0nr -> 0x092d }
            r1.BhD(r3)     // Catch:{ 0nr -> 0x092d }
            goto L_0x0cbb
        L_0x092d:
            java.lang.String r1 = "cancelled"
            r8.A08(r1)     // Catch:{ all -> 0x0cbf }
            long r4 = r8.A06()     // Catch:{ all -> 0x0cbf }
            r2 = 300(0x12c, double:1.48E-321)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0ab2
            goto L_0x0aaa
        L_0x093e:
            java.lang.Object r5 = r1.A00
            X.5LN r5 = (X.AnonymousClass5LN) r5
            X.5I3 r8 = (X.AnonymousClass5I3) r8
            java.lang.String r11 = "filter"
            long r16 = android.os.SystemClock.uptimeMillis()
            X.08M r0 = r5.A03
            r18 = r0
            X.AnonymousClass0x7.A18(r18)
            java.lang.Object r12 = r8.A01
            X.2s8 r12 = (X.C56532s8) r12
            r3 = 0
            java.lang.Object[] r2 = X.AnonymousClass002.A0M()
            long r0 = java.lang.System.nanoTime()
            X.C18280x3.A1S(r2, r0)
            r0 = 1
            X.AnonymousClass000.A1P(r2, r3, r0)
            int r7 = java.util.Arrays.hashCode(r2)
            X.8JP r6 = r5.A0B
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r6.markerStart(r0, r7)
            A01(r6, r12, r7, r3)
            X.0QU r4 = r8.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ContactSearchManager/getForContactsQuery/"
            r1.append(r0)
            int r0 = X.C86644Kx.A05(r12)
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            X.33M r8 = new X.33M
            r8.<init>((java.lang.String) r0)
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r4.A02()     // Catch:{ 0nr -> 0x0a9b }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)     // Catch:{ 0nr -> 0x0a9b }
            int r1 = r12.A02     // Catch:{ 0nr -> 0x0a9b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ 0nr -> 0x0a9b }
            boolean r1 = r9.equals(r1)     // Catch:{ 0nr -> 0x0a9b }
            if (r1 == 0) goto L_0x09b1
            X.4uZ r1 = r12.A04     // Catch:{ 0nr -> 0x0a9b }
            if (r1 != 0) goto L_0x09b1
            boolean r1 = X.C56532s8.A00(r12)     // Catch:{ 0nr -> 0x0a9b }
            if (r1 != 0) goto L_0x09c1
            X.5dZ r1 = r12.A06     // Catch:{ 0nr -> 0x0a9b }
            if (r1 != 0) goto L_0x09c1
        L_0x09b1:
            java.lang.String r1 = "empty"
            r8.A08(r1)     // Catch:{ 0nr -> 0x0a9b }
            r1 = 926875649(0x373f0001, float:1.1384488E-5)
            r6.markerDrop(r1, r7)     // Catch:{ 0nr -> 0x0a9b }
            X.AnonymousClass0x9.A1I(r18)     // Catch:{ 0nr -> 0x0a9b }
            goto L_0x0cbb
        L_0x09c1:
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()     // Catch:{ 0nr -> 0x0a9b }
            boolean r1 = X.C56532s8.A00(r12)     // Catch:{ 0nr -> 0x0a9b }
            if (r1 == 0) goto L_0x09dd
            X.2ML r15 = r5.A0D     // Catch:{ 0nr -> 0x0a9b }
            X.3Lo r14 = r5.A08     // Catch:{ 0nr -> 0x0a9b }
            X.5ZU r13 = r5.A05     // Catch:{ 0nr -> 0x0a9b }
            java.util.List r10 = r12.A04()     // Catch:{ 0nr -> 0x0a9b }
            X.5lO r1 = new X.5lO     // Catch:{ 0nr -> 0x0a9b }
            r1.<init>(r13, r14, r15, r10)     // Catch:{ 0nr -> 0x0a9b }
            r2.add(r1)     // Catch:{ 0nr -> 0x0a9b }
        L_0x09dd:
            X.5dZ r10 = r12.A06     // Catch:{ 0nr -> 0x0a9b }
            if (r10 == 0) goto L_0x09ea
            X.5Qp r1 = r5.A0C     // Catch:{ 0nr -> 0x0a9b }
            X.49e r1 = r1.A00(r10)     // Catch:{ 0nr -> 0x0a9b }
            r2.add(r1)     // Catch:{ 0nr -> 0x0a9b }
        L_0x09ea:
            r8.A08(r11)     // Catch:{ 0nr -> 0x0a9b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ 0nr -> 0x0a9b }
            X.AnonymousClass5YZ.A01(r6, r1, r11)     // Catch:{ 0nr -> 0x0a9b }
            r4.A02()     // Catch:{ 0nr -> 0x0a9b }
            X.3Lo r10 = r5.A08     // Catch:{ 0nr -> 0x0a9b }
            java.util.List r1 = r10.A00     // Catch:{ 0nr -> 0x0a9b }
            boolean r1 = X.AnonymousClass000.A1X(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ 0nr -> 0x0a9b }
            boolean r1 = r1.booleanValue()     // Catch:{ 0nr -> 0x0a9b }
            boolean r14 = X.AnonymousClass000.A1T(r1)
            java.util.List r1 = r10.A02()     // Catch:{ 0nr -> 0x0a9b }
            java.util.Iterator r13 = r1.iterator()     // Catch:{ 0nr -> 0x0a9b }
        L_0x0a13:
            boolean r1 = r13.hasNext()     // Catch:{ 0nr -> 0x0a9b }
            if (r1 == 0) goto L_0x0a5f
            X.3ZH r10 = X.C18310x6.A0R(r13)     // Catch:{ 0nr -> 0x0a9b }
            r4.A02()     // Catch:{ 0nr -> 0x0a9b }
            X.2k5 r1 = r10.A0F     // Catch:{ 0nr -> 0x0a9b }
            if (r1 == 0) goto L_0x0a13
            java.lang.Class<X.4uZ> r11 = X.C95814uZ.class
            com.whatsapp.jid.Jid r12 = r10.A0I(r11)     // Catch:{ 0nr -> 0x0a9b }
            X.4uZ r12 = (X.C95814uZ) r12     // Catch:{ 0nr -> 0x0a9b }
            if (r12 == 0) goto L_0x0a13
            X.5aW r1 = r5.A04     // Catch:{ 0nr -> 0x0a9b }
            boolean r1 = r1.A0I(r12)     // Catch:{ 0nr -> 0x0a9b }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0a13
            X.314 r1 = r5.A06     // Catch:{ 0nr -> 0x0a9b }
            java.util.List r1 = r1.A05()     // Catch:{ 0nr -> 0x0a9b }
            boolean r1 = r1.contains(r12)     // Catch:{ 0nr -> 0x0a9b }
            if (r1 != 0) goto L_0x0a13
            com.whatsapp.jid.Jid r1 = r10.A0I(r11)     // Catch:{ 0nr -> 0x0a9b }
            X.4uZ r1 = (X.C95814uZ) r1     // Catch:{ 0nr -> 0x0a9b }
            X.C626936e.A06(r1)     // Catch:{ 0nr -> 0x0a9b }
            boolean r1 = X.C66473Lo.A00(r1, r2)     // Catch:{ 0nr -> 0x0a9b }
            if (r1 == 0) goto L_0x0a13
            r0.add(r10)     // Catch:{ 0nr -> 0x0a9b }
            boolean r1 = X.C86654Ky.A1Y(r10)     // Catch:{ 0nr -> 0x0a9b }
            if (r1 == 0) goto L_0x0a13
            int r3 = r3 + 1
            goto L_0x0a13
        L_0x0a5f:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ 0nr -> 0x0a9b }
            java.lang.String r1 = "found: "
            X.C18260x0.A19(r1, r2, r0)     // Catch:{ 0nr -> 0x0a9b }
            java.lang.String r1 = " | "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r1, r2, r3)     // Catch:{ 0nr -> 0x0a9b }
            r8.A08(r1)     // Catch:{ 0nr -> 0x0a9b }
            java.lang.String r1 = "done"
            r8.A08(r1)     // Catch:{ 0nr -> 0x0a9b }
            X.AnonymousClass0x9.A1I(r18)     // Catch:{ 0nr -> 0x0a9b }
            r1 = 2
            X.AnonymousClass5YZ.A00(r6, r7, r1)     // Catch:{ 0nr -> 0x0a9b }
            long r3 = X.C18310x6.A0A(r16)     // Catch:{ 0nr -> 0x0a9b }
            X.4ru r2 = new X.4ru     // Catch:{ 0nr -> 0x0a9b }
            r2.<init>()     // Catch:{ 0nr -> 0x0a9b }
            r2.A02 = r9     // Catch:{ 0nr -> 0x0a9b }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ 0nr -> 0x0a9b }
            r2.A04 = r1     // Catch:{ 0nr -> 0x0a9b }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r14)     // Catch:{ 0nr -> 0x0a9b }
            r2.A00 = r1     // Catch:{ 0nr -> 0x0a9b }
            X.4FV r1 = r5.A0A     // Catch:{ 0nr -> 0x0a9b }
            r1.BhD(r2)     // Catch:{ 0nr -> 0x0a9b }
            goto L_0x0cbb
        L_0x0a9b:
            java.lang.String r1 = "cancelled"
            r8.A08(r1)     // Catch:{ all -> 0x0cbf }
            long r4 = r8.A06()     // Catch:{ all -> 0x0cbf }
            r2 = 300(0x12c, double:1.48E-321)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0ab2
        L_0x0aaa:
            r1 = 926875649(0x373f0001, float:1.1384488E-5)
            r6.markerDrop(r1, r7)     // Catch:{ all -> 0x0cbf }
            goto L_0x0cbb
        L_0x0ab2:
            r1 = 4
            X.AnonymousClass5YZ.A00(r6, r7, r1)     // Catch:{ all -> 0x0cbf }
            goto L_0x0cbb
        L_0x0ab8:
            java.lang.Object r7 = r1.A00
            X.5Kx r7 = (X.C102955Kx) r7
            X.5I3 r8 = (X.AnonymousClass5I3) r8
            java.lang.String r13 = "found groups in common"
            java.lang.String r3 = "filtered contacts"
            long r17 = android.os.SystemClock.uptimeMillis()
            X.08M r0 = r7.A03
            r19 = r0
            X.AnonymousClass0x7.A18(r19)
            java.lang.Object r4 = r8.A01
            X.7O4 r4 = (X.AnonymousClass7O4) r4
            r5 = 3
            java.lang.Object[] r2 = X.AnonymousClass002.A0M()
            long r0 = java.lang.System.nanoTime()
            X.C18280x3.A1S(r2, r0)
            r0 = 1
            X.AnonymousClass000.A1P(r2, r5, r0)
            int r6 = java.util.Arrays.hashCode(r2)
            X.0QU r15 = r8.A00
            java.util.HashSet r2 = X.AnonymousClass002.A0K()
            java.util.Set r0 = r4.A02
            r5 = 0
            if (r0 == 0) goto L_0x0b19
            int r1 = r0.size()
        L_0x0af4:
            java.util.List r0 = r4.A01
            if (r0 == 0) goto L_0x0afc
            int r5 = r0.size()
        L_0x0afc:
            int r1 = r1 + r5
            if (r1 == 0) goto L_0x0b31
            r0 = 10
            if (r1 > r0) goto L_0x0b31
            java.util.Set r0 = r4.A02
            if (r0 == 0) goto L_0x0b1b
            java.util.Iterator r1 = r0.iterator()
        L_0x0b0b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0b1b
            java.lang.Object r0 = r1.next()
            r2.add(r0)
            goto L_0x0b0b
        L_0x0b19:
            r1 = 0
            goto L_0x0af4
        L_0x0b1b:
            java.util.List r0 = r4.A01
            if (r0 == 0) goto L_0x0b31
            java.util.Iterator r1 = r0.iterator()
        L_0x0b23:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0b31
            X.4uZ r0 = X.C86604Kt.A0b(r1)
            r2.add(r0)
            goto L_0x0b23
        L_0x0b31:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupSearchManager/getGroupsForQuery/"
            X.C18260x0.A19(r0, r1, r2)
            java.lang.String r0 = r1.toString()
            X.33M r8 = new X.33M
            r8.<init>((java.lang.String) r0)
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            int r1 = r4.A00
            if (r1 != 0) goto L_0x0cc4
            boolean r1 = r4.A03
            if (r1 != 0) goto L_0x0cc4
            boolean r1 = r2.isEmpty()     // Catch:{ 0nr -> 0x0c9d }
            if (r1 == 0) goto L_0x0b6a
            java.lang.String r1 = "empty"
            r8.A08(r1)     // Catch:{ 0nr -> 0x0c9d }
            r8.A07()     // Catch:{ 0nr -> 0x0c9d }
            X.8JP r2 = r7.A07     // Catch:{ 0nr -> 0x0c9d }
            r1 = 926875649(0x373f0001, float:1.1384488E-5)
            r2.markerDrop(r1, r6)     // Catch:{ 0nr -> 0x0c9d }
            X.AnonymousClass0x9.A1I(r19)     // Catch:{ 0nr -> 0x0c9d }
            goto L_0x0cbb
        L_0x0b6a:
            r8.A08(r3)     // Catch:{ 0nr -> 0x0c9d }
            X.8JP r14 = r7.A07     // Catch:{ 0nr -> 0x0c9d }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ 0nr -> 0x0c9d }
            X.AnonymousClass5YZ.A01(r14, r12, r3)     // Catch:{ 0nr -> 0x0c9d }
            r15.A02()     // Catch:{ 0nr -> 0x0c9d }
            X.5ON r11 = r7.A06     // Catch:{ 0nr -> 0x0c9d }
            int r9 = r7.A00     // Catch:{ 0nr -> 0x0c9d }
            X.2sr r10 = r11.A00     // Catch:{ 0nr -> 0x0c9d }
            X.1RR r1 = X.C56972sr.A01(r10)     // Catch:{ 0nr -> 0x0c9d }
            if (r1 == 0) goto L_0x0c64
            X.4uZ r3 = r1.A0H     // Catch:{ 0nr -> 0x0c9d }
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3     // Catch:{ 0nr -> 0x0c9d }
            if (r3 == 0) goto L_0x0c64
            java.util.HashSet r1 = X.AnonymousClass002.A0K()     // Catch:{ 0nr -> 0x0c9d }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ 0nr -> 0x0c9d }
        L_0x0b93:
            boolean r2 = r5.hasNext()     // Catch:{ 0nr -> 0x0c9d }
            if (r2 == 0) goto L_0x0bba
            java.lang.Object r4 = r5.next()     // Catch:{ 0nr -> 0x0c9d }
            com.whatsapp.jid.Jid r4 = (com.whatsapp.jid.Jid) r4     // Catch:{ 0nr -> 0x0c9d }
            boolean r2 = r4 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ 0nr -> 0x0c9d }
            if (r2 == 0) goto L_0x0ba6
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4     // Catch:{ 0nr -> 0x0c9d }
            goto L_0x0bb4
        L_0x0ba6:
            boolean r2 = X.C627336j.A0L(r4)     // Catch:{ 0nr -> 0x0c9d }
            if (r2 == 0) goto L_0x0b93
            X.2sM r2 = r11.A05     // Catch:{ 0nr -> 0x0c9d }
            X.1fH r4 = (X.C27981fH) r4     // Catch:{ 0nr -> 0x0c9d }
            com.whatsapp.jid.PhoneUserJid r4 = r2.A02(r4)     // Catch:{ 0nr -> 0x0c9d }
        L_0x0bb4:
            if (r4 == 0) goto L_0x0b93
            r1.add(r4)     // Catch:{ 0nr -> 0x0c9d }
            goto L_0x0b93
        L_0x0bba:
            boolean r2 = r1.isEmpty()     // Catch:{ 0nr -> 0x0c9d }
            if (r2 != 0) goto L_0x0c64
            r15.A02()     // Catch:{ 0nr -> 0x0c9d }
            java.util.HashSet r4 = X.AnonymousClass002.A0K()     // Catch:{ 0nr -> 0x0c9d }
            java.util.Iterator r16 = r1.iterator()     // Catch:{ 0nr -> 0x0c9d }
        L_0x0bcb:
            boolean r2 = r16.hasNext()     // Catch:{ 0nr -> 0x0c9d }
            if (r2 == 0) goto L_0x0be7
            com.whatsapp.jid.UserJid r5 = X.C18310x6.A0T(r16)     // Catch:{ 0nr -> 0x0c9d }
            boolean r2 = r5 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ 0nr -> 0x0c9d }
            if (r2 == 0) goto L_0x0bcb
            X.2sM r2 = r11.A05     // Catch:{ 0nr -> 0x0c9d }
            com.whatsapp.jid.PhoneUserJid r5 = (com.whatsapp.jid.PhoneUserJid) r5     // Catch:{ 0nr -> 0x0c9d }
            X.1fH r2 = r2.A01(r5)     // Catch:{ 0nr -> 0x0c9d }
            if (r2 == 0) goto L_0x0bcb
            r4.add(r2)     // Catch:{ 0nr -> 0x0c9d }
            goto L_0x0bcb
        L_0x0be7:
            X.2sj r5 = r11.A03     // Catch:{ 0nr -> 0x0c9d }
            X.33h r2 = r5.A09     // Catch:{ 0nr -> 0x0c9d }
            java.util.HashMap r3 = r2.A09(r3, r1, r9)     // Catch:{ 0nr -> 0x0c9d }
            r15.A02()     // Catch:{ 0nr -> 0x0c9d }
            X.1fH r1 = r10.A0I()     // Catch:{ 0nr -> 0x0c9d }
            java.util.HashMap r1 = r2.A09(r1, r4, r9)     // Catch:{ 0nr -> 0x0c9d }
            java.util.Iterator r4 = X.AnonymousClass001.A0u(r1)     // Catch:{ 0nr -> 0x0c9d }
        L_0x0bfe:
            boolean r1 = r4.hasNext()     // Catch:{ 0nr -> 0x0c9d }
            if (r1 == 0) goto L_0x0c1b
            java.util.Map$Entry r2 = X.AnonymousClass001.A0w(r4)     // Catch:{ 0nr -> 0x0c9d }
            r15.A02()     // Catch:{ 0nr -> 0x0c9d }
            java.lang.Object r1 = r2.getKey()     // Catch:{ 0nr -> 0x0c9d }
            X.4uZ r1 = (X.C95814uZ) r1     // Catch:{ 0nr -> 0x0c9d }
            boolean r1 = r5.A0B(r1)     // Catch:{ 0nr -> 0x0c9d }
            if (r1 == 0) goto L_0x0bfe
            X.C18270x1.A1N(r3, r2)     // Catch:{ 0nr -> 0x0c9d }
            goto L_0x0bfe
        L_0x0c1b:
            X.3Ex r2 = r11.A01     // Catch:{ 0nr -> 0x0c9d }
            java.util.Set r1 = r3.keySet()     // Catch:{ 0nr -> 0x0c9d }
            java.util.Map r9 = r2.A0I(r1)     // Catch:{ 0nr -> 0x0c9d }
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ 0nr -> 0x0c9d }
            java.util.Iterator r16 = X.AnonymousClass001.A0u(r3)     // Catch:{ 0nr -> 0x0c9d }
        L_0x0c2d:
            boolean r1 = r16.hasNext()     // Catch:{ 0nr -> 0x0c9d }
            if (r1 == 0) goto L_0x0c68
            java.util.Map$Entry r4 = X.AnonymousClass001.A0w(r16)     // Catch:{ 0nr -> 0x0c9d }
            r15.A02()     // Catch:{ 0nr -> 0x0c9d }
            java.lang.Object r1 = r4.getKey()     // Catch:{ 0nr -> 0x0c9d }
            java.lang.Object r5 = r9.get(r1)     // Catch:{ 0nr -> 0x0c9d }
            X.3ZH r5 = (X.AnonymousClass3ZH) r5     // Catch:{ 0nr -> 0x0c9d }
            X.2rV r2 = r11.A04     // Catch:{ 0nr -> 0x0c9d }
            X.4uZ r1 = r5.A0H     // Catch:{ 0nr -> 0x0c9d }
            if (r1 == 0) goto L_0x0c61
            X.34x r1 = r2.A00(r1)     // Catch:{ 0nr -> 0x0c9d }
            if (r1 == 0) goto L_0x0c61
            long r2 = r1.A0K     // Catch:{ 0nr -> 0x0c9d }
        L_0x0c52:
            java.lang.Object r4 = r4.getValue()     // Catch:{ 0nr -> 0x0c9d }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ 0nr -> 0x0c9d }
            X.4zL r1 = new X.4zL     // Catch:{ 0nr -> 0x0c9d }
            r1.<init>(r5, r4, r2)     // Catch:{ 0nr -> 0x0c9d }
            r10.add(r1)     // Catch:{ 0nr -> 0x0c9d }
            goto L_0x0c2d
        L_0x0c61:
            r2 = -1
            goto L_0x0c52
        L_0x0c64:
            java.util.List r10 = java.util.Collections.emptyList()     // Catch:{ 0nr -> 0x0c9d }
        L_0x0c68:
            r0.addAll(r10)     // Catch:{ 0nr -> 0x0c9d }
            r8.A08(r13)     // Catch:{ 0nr -> 0x0c9d }
            X.AnonymousClass5YZ.A01(r14, r12, r13)     // Catch:{ 0nr -> 0x0c9d }
            r1 = 51
            X.C86614Ku.A1U(r0, r1)     // Catch:{ 0nr -> 0x0c9d }
            java.lang.String r1 = "done"
            r8.A08(r1)     // Catch:{ 0nr -> 0x0c9d }
            X.AnonymousClass0x9.A1I(r19)     // Catch:{ 0nr -> 0x0c9d }
            r1 = 2
            X.AnonymousClass5YZ.A00(r14, r6, r1)     // Catch:{ 0nr -> 0x0c9d }
            long r3 = X.C18310x6.A0A(r17)     // Catch:{ 0nr -> 0x0c9d }
            X.4ru r2 = new X.4ru     // Catch:{ 0nr -> 0x0c9d }
            r2.<init>()     // Catch:{ 0nr -> 0x0c9d }
            java.lang.Integer r1 = X.C18290x4.A0a()     // Catch:{ 0nr -> 0x0c9d }
            r2.A02 = r1     // Catch:{ 0nr -> 0x0c9d }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ 0nr -> 0x0c9d }
            r2.A04 = r1     // Catch:{ 0nr -> 0x0c9d }
            X.4FV r1 = r7.A05     // Catch:{ 0nr -> 0x0c9d }
            r1.BhD(r2)     // Catch:{ 0nr -> 0x0c9d }
            goto L_0x0cbb
        L_0x0c9d:
            java.lang.String r1 = "cancelled"
            r8.A08(r1)     // Catch:{ all -> 0x0cbf }
            long r4 = r8.A06()     // Catch:{ all -> 0x0cbf }
            r2 = 300(0x12c, double:1.48E-321)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0cb5
            X.8JP r2 = r7.A07     // Catch:{ all -> 0x0cbf }
            r1 = 926875649(0x373f0001, float:1.1384488E-5)
            r2.markerDrop(r1, r6)     // Catch:{ all -> 0x0cbf }
            goto L_0x0cbb
        L_0x0cb5:
            X.8JP r2 = r7.A07     // Catch:{ all -> 0x0cbf }
            r1 = 4
            X.AnonymousClass5YZ.A00(r2, r6, r1)     // Catch:{ all -> 0x0cbf }
        L_0x0cbb:
            r8.A07()
            return r0
        L_0x0cbf:
            r0 = move-exception
            r8.A07()
            throw r0
        L_0x0cc4:
            java.lang.String r1 = "empty"
            r8.A08(r1)
            r8.A07()
            X.8JP r2 = r7.A07
            r1 = 926875649(0x373f0001, float:1.1384488E-5)
            r2.markerDrop(r1, r6)
            X.AnonymousClass0x9.A1I(r19)
            return r0
        L_0x0cd8:
            java.lang.Object r6 = r1.A00
            X.5Km r6 = (X.C102845Km) r6
            X.5I3 r8 = (X.AnonymousClass5I3) r8
            long r10 = android.os.SystemClock.uptimeMillis()
            X.08M r5 = r6.A02
            X.AnonymousClass0x7.A18(r5)
            java.lang.Object r2 = r8.A01
            X.2s8 r2 = (X.C56532s8) r2
            X.0QU r9 = r8.A00
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r9.A02()     // Catch:{ 0nr -> 0x0d8a }
            int r1 = r2.A02     // Catch:{ 0nr -> 0x0d8a }
            if (r1 != 0) goto L_0x0d84
            X.4uZ r1 = r2.A04     // Catch:{ 0nr -> 0x0d8a }
            if (r1 != 0) goto L_0x0d84
            X.5dZ r1 = r2.A06     // Catch:{ 0nr -> 0x0d8a }
            if (r1 != 0) goto L_0x0d84
            boolean r1 = X.C56532s8.A00(r2)     // Catch:{ 0nr -> 0x0d8a }
            if (r1 == 0) goto L_0x0d84
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()     // Catch:{ 0nr -> 0x0d8a }
            boolean r1 = X.C56532s8.A00(r2)     // Catch:{ 0nr -> 0x0d8a }
            if (r1 == 0) goto L_0x0d23
            java.util.List r4 = r2.A04()     // Catch:{ 0nr -> 0x0d8a }
            X.C162457s7.A0D(r4)     // Catch:{ 0nr -> 0x0d8a }
            X.5ZU r3 = r6.A03     // Catch:{ 0nr -> 0x0d8a }
            X.5NT r2 = r6.A05     // Catch:{ 0nr -> 0x0d8a }
            X.5lN r1 = new X.5lN     // Catch:{ 0nr -> 0x0d8a }
            r1.<init>(r3, r2, r4)     // Catch:{ 0nr -> 0x0d8a }
            r8.add(r1)     // Catch:{ 0nr -> 0x0d8a }
        L_0x0d23:
            r9.A02()     // Catch:{ 0nr -> 0x0d8a }
            X.5NT r2 = r6.A05     // Catch:{ 0nr -> 0x0d8a }
            java.util.List r1 = r2.A00     // Catch:{ 0nr -> 0x0d8a }
            boolean r1 = X.AnonymousClass000.A1X(r1)
            r7 = 0
            if (r1 != 0) goto L_0x0d32
            r7 = 1
        L_0x0d32:
            java.util.List r1 = r2.A00()     // Catch:{ 0nr -> 0x0d8a }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ 0nr -> 0x0d8a }
        L_0x0d3a:
            boolean r1 = r4.hasNext()     // Catch:{ 0nr -> 0x0d8a }
            if (r1 == 0) goto L_0x0d63
            X.3ZH r3 = X.C18310x6.A0R(r4)     // Catch:{ 0nr -> 0x0d8a }
            r9.A02()     // Catch:{ 0nr -> 0x0d8a }
            X.2k5 r1 = r3.A0F     // Catch:{ 0nr -> 0x0d8a }
            if (r1 == 0) goto L_0x0d3a
            java.lang.Class<X.4uZ> r2 = X.C95814uZ.class
            com.whatsapp.jid.Jid r1 = r3.A0I(r2)     // Catch:{ 0nr -> 0x0d8a }
            X.4uZ r1 = (X.C95814uZ) r1     // Catch:{ 0nr -> 0x0d8a }
            if (r1 == 0) goto L_0x0d3a
            X.4uZ r1 = X.AnonymousClass3ZH.A02(r3, r2)     // Catch:{ 0nr -> 0x0d8a }
            boolean r1 = X.C66473Lo.A00(r1, r8)     // Catch:{ 0nr -> 0x0d8a }
            if (r1 == 0) goto L_0x0d3a
            r0.add(r3)     // Catch:{ 0nr -> 0x0d8a }
            goto L_0x0d3a
        L_0x0d63:
            long r3 = X.C18310x6.A0A(r10)     // Catch:{ 0nr -> 0x0d8a }
            X.4ru r2 = new X.4ru     // Catch:{ 0nr -> 0x0d8a }
            r2.<init>()     // Catch:{ 0nr -> 0x0d8a }
            java.lang.Integer r1 = X.C18290x4.A0c()     // Catch:{ 0nr -> 0x0d8a }
            r2.A02 = r1     // Catch:{ 0nr -> 0x0d8a }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ 0nr -> 0x0d8a }
            r2.A04 = r1     // Catch:{ 0nr -> 0x0d8a }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)     // Catch:{ 0nr -> 0x0d8a }
            r2.A00 = r1     // Catch:{ 0nr -> 0x0d8a }
            X.4FV r1 = r6.A06     // Catch:{ 0nr -> 0x0d8a }
            r1.BhD(r2)     // Catch:{ 0nr -> 0x0d8a }
            goto L_0x0d8f
        L_0x0d84:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ 0nr -> 0x0d8a }
            r5.A0G(r1)     // Catch:{ 0nr -> 0x0d8a }
            goto L_0x0d91
        L_0x0d8a:
            java.lang.String r1 = "InvitableContactSearchManager/getNonWaContactsForQuery/operationCanceledException"
            com.whatsapp.util.Log.d((java.lang.String) r1)     // Catch:{ all -> 0x0d95 }
        L_0x0d8f:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L_0x0d91:
            r5.A0G(r1)
            return r0
        L_0x0d95:
            r0 = move-exception
            X.AnonymousClass0x9.A1I(r5)
            throw r0
        L_0x0d9a:
            java.lang.Object r7 = r1.A00
            X.5RD r7 = (X.AnonymousClass5RD) r7
            X.5I3 r8 = (X.AnonymousClass5I3) r8
            long r19 = android.os.SystemClock.uptimeMillis()
            X.08M r0 = r7.A0B
            r31 = r0
            X.AnonymousClass0x7.A18(r31)
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A01
            r30 = r0
            r4 = 1
            r0.set(r4)
            java.lang.Object r6 = r8.A01
            X.2s8 r6 = (X.C56532s8) r6
            int r0 = r6.A00
            r29 = r0
            X.08J r0 = r7.A05
            java.lang.Object r0 = r0.A07()
            X.5Wf r0 = (X.C105745Wf) r0
            r5 = 2
            java.lang.Object[] r3 = X.AnonymousClass002.A0M()
            long r1 = java.lang.System.nanoTime()
            X.C18280x3.A1S(r3, r1)
            X.AnonymousClass000.A1P(r3, r5, r4)
            int r4 = java.util.Arrays.hashCode(r3)
            X.8JP r3 = r7.A0J
            r9 = 926875649(0x373f0001, float:1.1384488E-5)
            r3.markerStart(r9, r4)
            int r2 = r6.A00
            java.lang.String r1 = "page"
            r3.markerAnnotate((int) r9, (int) r4, (java.lang.String) r1, (int) r2)
            java.lang.String r2 = "type"
            int r1 = r6.A02
            r3.markerAnnotate((int) r9, (int) r4, (java.lang.String) r2, (int) r1)
            X.4uZ r1 = r6.A04
            boolean r2 = X.AnonymousClass000.A1W(r1)
            java.lang.String r1 = "jid"
            r3.markerAnnotate((int) r9, (int) r4, (java.lang.String) r1, (boolean) r2)
            A01(r3, r6, r4, r5)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "MessageSearchManager/getMessagesForQuery/"
            r2.append(r1)
            int r1 = X.C86644Kx.A05(r6)
            java.lang.String r2 = X.AnonymousClass000.A0h(r2, r1)
            X.33M r21 = new X.33M
            r1 = r21
            r1.<init>((java.lang.String) r2)
            java.lang.Boolean r1 = r6.A08
            if (r1 == 0) goto L_0x0e73
            java.lang.Boolean r1 = r6.A01()
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0e73
            r1 = 0
            r6.A08 = r1
            r9 = 1
        L_0x0e24:
            X.3Lu r2 = r7.A0G
            X.0QU r1 = r8.A00
            r28 = r1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            android.util.Pair r13 = r2.A04(r1, r6, r12)
            int r8 = X.C18280x3.A03(r13)
            r1 = -2
            if (r8 != r1) goto L_0x0e47
            java.lang.String r1 = "MessageSearchManager/non-ambiguous fallback"
            com.whatsapp.util.Log.d((java.lang.String) r1)
            r1 = 0
            r6.A0F = r1
            r1 = r28
            android.util.Pair r13 = r2.A04(r1, r6, r12)
        L_0x0e47:
            int r2 = X.C18280x3.A03(r13)
            if (r2 == 0) goto L_0x0e52
            r1 = -3
            r18 = 0
            if (r2 != r1) goto L_0x0e54
        L_0x0e52:
            r18 = 1
        L_0x0e54:
            java.lang.Object r1 = r13.second
            java.util.Iterator r2 = X.C18320x8.A0q(r1)
            java.lang.String r1 = "search"
            X.AnonymousClass5YZ.A01(r3, r12, r1)
        L_0x0e5f:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0e75
            X.34x r1 = X.C18300x5.A0T(r2)
            if (r9 == 0) goto L_0x0e5f
            boolean r1 = r1.A1F
            if (r1 == 0) goto L_0x0e5f
            r2.remove()
            goto L_0x0e5f
        L_0x0e73:
            r9 = 0
            goto L_0x0e24
        L_0x0e75:
            java.lang.String r1 = "remove starred"
            X.AnonymousClass5YZ.A01(r3, r12, r1)
            java.lang.Object r1 = r13.second
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.ArrayList r17 = X.AnonymousClass002.A0J(r1)
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            X.2s8 r1 = r7.A0K
            X.5dZ r14 = r1.A06
            java.util.Iterator r16 = r17.iterator()
        L_0x0e9a:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0ef3
            X.34x r2 = X.C18300x5.A0T(r16)
            if (r2 == 0) goto L_0x0ec1
            boolean r1 = r2.A1N
            if (r1 != 0) goto L_0x0ec1
            if (r14 == 0) goto L_0x0ec5
            X.2z0 r1 = r2.A1J
            X.4uZ r15 = r1.A00
            if (r15 == 0) goto L_0x0ec5
            X.5Qp r1 = r7.A0M
            X.49e r1 = r1.A00(r14)
            X.C626936e.A06(r1)
            boolean r1 = r1.B3H(r15)
            if (r1 != 0) goto L_0x0ec5
        L_0x0ec1:
            r16.remove()
            goto L_0x0e9a
        L_0x0ec5:
            boolean r1 = r2.A1F
            if (r1 == 0) goto L_0x0ee4
            r10.add(r2)
        L_0x0ecc:
            boolean r1 = r2 instanceof X.AnonymousClass1n2
            if (r1 != 0) goto L_0x0ed8
            boolean r1 = r2 instanceof X.C31981pC
            if (r1 != 0) goto L_0x0ed8
            boolean r1 = r2 instanceof X.C30721mu
            if (r1 == 0) goto L_0x0e9a
        L_0x0ed8:
            X.1mV r2 = (X.C30471mV) r2
            boolean r1 = r2.A21()
            if (r1 == 0) goto L_0x0e9a
            r8.add(r2)
            goto L_0x0e9a
        L_0x0ee4:
            int r1 = r2.A0j()
            r15 = 1
            if (r1 != r15) goto L_0x0eef
            r11.add(r2)
            goto L_0x0ecc
        L_0x0eef:
            r9.add(r2)
            goto L_0x0ecc
        L_0x0ef3:
            java.lang.String r1 = "filter"
            X.AnonymousClass5YZ.A01(r3, r12, r1)
            if (r0 == 0) goto L_0x0f2c
            java.util.List r2 = r0.A02
            r1 = r17
            r2.addAll(r1)
            java.util.List r1 = r0.A00
            r1.addAll(r11)
            java.util.List r1 = r0.A03
            r1.addAll(r10)
            java.util.List r1 = r0.A04
            r1.addAll(r9)
            java.util.List r1 = r0.A01
            r1.addAll(r8)
        L_0x0f15:
            boolean r1 = r28.A04()
            if (r1 == 0) goto L_0x0f43
            long r7 = r21.A06()
            r5 = 300(0x12c, double:1.48E-321)
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0f3e
            r1 = 926875649(0x373f0001, float:1.1384488E-5)
            r3.markerDrop(r1, r4)
            return r0
        L_0x0f2c:
            X.5Wf r0 = new X.5Wf
            r22 = r0
            r23 = r17
            r24 = r11
            r25 = r10
            r26 = r9
            r27 = r8
            r22.<init>(r23, r24, r25, r26, r27)
            goto L_0x0f15
        L_0x0f3e:
            r1 = 4
            X.AnonymousClass5YZ.A00(r3, r4, r1)
            return r0
        L_0x0f43:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "found: "
            r2.append(r1)
            java.lang.Object r1 = r13.first
            r2.append(r1)
            java.lang.String r1 = "|:"
            r2.append(r1)
            java.lang.Object r1 = r13.second
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
            java.lang.String r2 = X.AnonymousClass000.A0h(r2, r1)
            r1 = r21
            r1.A08(r2)
            r21.A07()
            X.08M r2 = r7.A09
            if (r18 == 0) goto L_0x0fb1
            r1 = -1
            X.C06270Wx.A04(r2, r1)
            java.lang.Boolean r1 = r6.A01()
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0f7f
            X.AnonymousClass0x9.A1I(r31)
        L_0x0f7f:
            r2 = 0
            r1 = r30
            r1.set(r2)
            X.AnonymousClass5YZ.A00(r3, r4, r5)
            long r3 = X.C18310x6.A0A(r19)
            X.4ru r2 = new X.4ru
            r2.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r2.A02 = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.A04 = r1
            java.lang.Boolean r1 = r6.A01()
            r2.A01 = r1
            int r1 = r6.A00
            java.lang.Long r1 = X.AnonymousClass0x9.A0m(r1)
            r2.A03 = r1
            X.4FV r1 = r7.A0I
            r1.BhD(r2)
            return r0
        L_0x0fb1:
            r1 = r29
            X.C06270Wx.A04(r2, r1)
            goto L_0x0f7f
        L_0x0fb7:
            java.lang.Object r6 = r1.A00
            X.5L5 r6 = (X.AnonymousClass5L5) r6
            X.5I3 r8 = (X.AnonymousClass5I3) r8
            r0 = 1
            X.C162457s7.A0J(r8, r0)
            java.lang.Object r5 = r8.A01
            X.2s8 r5 = (X.C56532s8) r5
            X.3Yy r4 = new X.3Yy
            r4.<init>()
            r0 = 0
            X.8qC r1 = r6.A07     // Catch:{ 0nr -> 0x1031 }
            java.lang.Object r1 = r1.get()     // Catch:{ 0nr -> 0x1031 }
            X.5aW r1 = (X.C106995aW) r1     // Catch:{ 0nr -> 0x1031 }
            boolean r1 = r1.A0H()     // Catch:{ 0nr -> 0x1031 }
            if (r1 != 0) goto L_0x0fdc
            java.lang.Object r0 = r4.element     // Catch:{ 0nr -> 0x1031 }
            return r0
        L_0x0fdc:
            X.0QU r3 = r8.A00     // Catch:{ 0nr -> 0x1031 }
            r3.A02()     // Catch:{ 0nr -> 0x1031 }
            X.C162457s7.A0H(r5)     // Catch:{ 0nr -> 0x1031 }
            int r1 = r5.A02     // Catch:{ 0nr -> 0x1031 }
            if (r1 != 0) goto L_0x1031
            X.4uZ r1 = r5.A04     // Catch:{ 0nr -> 0x1031 }
            if (r1 != 0) goto L_0x1031
            X.5dZ r1 = r5.A06     // Catch:{ 0nr -> 0x1031 }
            if (r1 != 0) goto L_0x1031
            X.8qC r1 = r6.A08     // Catch:{ 0nr -> 0x1031 }
            java.lang.Object r2 = r1.get()     // Catch:{ 0nr -> 0x1031 }
            X.5To r2 = (X.C105095To) r2     // Catch:{ 0nr -> 0x1031 }
            java.lang.String r1 = r5.A02()     // Catch:{ 0nr -> 0x1031 }
            X.C162457s7.A0D(r1)     // Catch:{ 0nr -> 0x1031 }
            X.5AU r2 = r2.A00(r1)     // Catch:{ 0nr -> 0x1031 }
            X.4kb r1 = X.C91634kb.A00     // Catch:{ 0nr -> 0x1031 }
            boolean r1 = X.C162457s7.A0P(r2, r1)     // Catch:{ 0nr -> 0x1031 }
            if (r1 == 0) goto L_0x1031
            r3.A02()     // Catch:{ 0nr -> 0x1031 }
            com.whatsapp.search.chatlock.ChatLockSearchManager$tryUnlockLockedChats$1 r2 = new com.whatsapp.search.chatlock.ChatLockSearchManager$tryUnlockLockedChats$1     // Catch:{ 0nr -> 0x1031 }
            r9 = r2
            r10 = r5
            r11 = r6
            r12 = r8
            r13 = r0
            r14 = r4
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ 0nr -> 0x1031 }
            X.3du r1 = X.C72553du.A00     // Catch:{ 0nr -> 0x1031 }
            X.C380725l.A00(r1, r2)     // Catch:{ 0nr -> 0x1031 }
            java.lang.Object r0 = r4.element     // Catch:{ 0nr -> 0x1031 }
            return r0
        L_0x1021:
            java.lang.Object r0 = r1.A00
            X.34x r0 = (X.C624134x) r0
            X.2z0 r0 = r0.A1J
            boolean r0 = r0.equals(r8)
            r0 = r0 ^ 1
        L_0x102d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x1031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124106Az.apply(java.lang.Object):java.lang.Object");
    }

    public static void A01(AnonymousClass8JP r3, C56532s8 r4, int i, int i2) {
        r3.markerAnnotate(926875649, i, "token_count", r4.A04().size());
        r3.markerAnnotate(926875649, i, "domain", i2);
    }
}
