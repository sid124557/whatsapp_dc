package X;

/* renamed from: X.5Wg  reason: invalid class name and case insensitive filesystem */
public class C105755Wg {
    public int A00 = 0;
    public String A01;
    public StringBuilder A02;
    public final C106175Xx A03;
    public final C620733j A04;

    public C105755Wg(C106175Xx r2, C620733j r3) {
        this.A04 = r3;
        this.A03 = r2;
    }

    public static void A00(String str, StringBuilder sb, C105755Wg r2) {
        sb.append(str);
        sb.append(r2.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01c2, code lost:
        if (r10.trim().equals("") != false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0271, code lost:
        if (r9.trim().equals("") != false) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x030d, code lost:
        if (r8.trim().equals("") != false) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ea, code lost:
        if (r1 != false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0187, code lost:
        if (r4.A00 == -1) goto L_0x014d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x018f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01(X.C106705a1 r13) {
        /*
            r12 = this;
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            r12.A02 = r2
            X.5Ot r3 = r13.A0A
            java.lang.String r1 = r3.A01
            if (r1 != 0) goto L_0x0010
            java.lang.String r1 = ""
            r3.A01 = r1
        L_0x0010:
            java.lang.String r8 = "\n"
            r12.A01 = r8
            java.lang.String r0 = "BEGIN:VCARD"
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = "VERSION:3.0"
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = "N:"
            r2.append(r0)
            java.lang.String r0 = r3.A00
            java.lang.String r6 = ";"
            if (r0 == 0) goto L_0x0032
            r2.append(r0)
        L_0x0032:
            r2.append(r6)
            java.lang.String r0 = r3.A02
            if (r0 == 0) goto L_0x003c
            r2.append(r0)
        L_0x003c:
            r2.append(r6)
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x0046
            r2.append(r0)
        L_0x0046:
            r2.append(r6)
            java.lang.String r0 = r3.A06
            if (r0 == 0) goto L_0x0050
            r2.append(r0)
        L_0x0050:
            r2.append(r6)
            java.lang.String r0 = r3.A07
            if (r0 == 0) goto L_0x005a
            r2.append(r0)
        L_0x005a:
            r2.append(r8)
            java.lang.String r0 = "FN:"
            X.AnonymousClass001.A1K(r0, r1, r8, r2)
            java.util.Map r0 = r13.A08
            r5 = 0
            if (r0 == 0) goto L_0x007f
            java.lang.String r2 = "NICKNAME"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x007f
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "NICKNAME:"
            r1.append(r0)
            X.5T6 r0 = X.C106705a1.A00(r2, r13)
            java.lang.String r0 = r0.A02
            A00(r0, r1, r12)
        L_0x007f:
            java.lang.String r2 = r3.A04
            if (r2 == 0) goto L_0x008d
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "X-PHONETIC-FIRST-NAME:"
            r1.append(r0)
            A00(r2, r1, r12)
        L_0x008d:
            java.lang.String r2 = r3.A05
            if (r2 == 0) goto L_0x009b
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "X-PHONETIC-LAST-NAME:"
            r1.append(r0)
            A00(r2, r1, r12)
        L_0x009b:
            java.util.List r0 = r13.A05
            if (r0 == 0) goto L_0x00d1
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00d1
            java.util.List r0 = r13.A05
            java.lang.Object r0 = r0.get(r5)
            X.7Il r0 = (X.C148457Il) r0
            java.lang.String r4 = r0.A00
            java.util.List r0 = r13.A05
            java.lang.Object r0 = r0.get(r5)
            X.7Il r0 = (X.C148457Il) r0
            java.lang.String r2 = r0.A01
            if (r4 == 0) goto L_0x00c5
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "ORG:"
            r1.append(r0)
            A00(r4, r1, r12)
        L_0x00c5:
            if (r2 == 0) goto L_0x00d1
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "TITLE:"
            r1.append(r0)
            A00(r2, r1, r12)
        L_0x00d1:
            java.util.List r2 = r13.A04
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x011b
            java.lang.String r0 = X.AnonymousClass001.A0n(r2, r5)
            if (r0 == 0) goto L_0x00ec
            java.lang.String r1 = r0.trim()
            java.lang.String r0 = ""
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x00ed
        L_0x00ec:
            r0 = 1
        L_0x00ed:
            if (r0 != 0) goto L_0x011b
            java.lang.StringBuilder r7 = r12.A02
            java.lang.String r0 = "NOTE:"
            r7.append(r0)
            java.lang.String r10 = X.AnonymousClass001.A0n(r2, r5)
            java.lang.String r9 = "\r\n"
            boolean r0 = r10.endsWith(r9)
            r4 = 1
            r2 = 0
            r1 = 2
            if (r0 == 0) goto L_0x0198
            int r0 = r10.length()
            int r0 = r0 - r1
        L_0x010a:
            java.lang.String r0 = r10.substring(r5, r0)
            java.lang.String r1 = r0.replaceAll(r9, r8)
            java.lang.String r0 = "\n "
            java.lang.String r2 = r1.replaceAll(r8, r0)
        L_0x0118:
            A00(r2, r7, r12)
        L_0x011b:
            java.util.List r0 = r13.A06
            if (r0 == 0) goto L_0x024e
            java.util.HashMap r2 = X.AnonymousClass001.A0t()
            java.util.Iterator r11 = r0.iterator()
        L_0x0127:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01a5
            X.7OD r4 = X.AnonymousClass4L0.A0R(r11)
            java.lang.String r0 = r4.A02
            boolean r1 = r2.containsKey(r0)
            java.lang.String r0 = r4.A02
            if (r1 == 0) goto L_0x0194
            java.lang.Object r1 = r2.get(r0)
            X.7OD r1 = (X.AnonymousClass7OD) r1
            int r0 = r1.A00
            r7 = 1
            r8 = -1
            if (r0 != r8) goto L_0x0181
            int r0 = r4.A00
            if (r0 != r8) goto L_0x0189
            r1.A00 = r7
        L_0x014d:
            java.lang.String r10 = r1.A03
            java.lang.String r9 = "null"
            if (r10 == 0) goto L_0x0159
            boolean r0 = r10.equalsIgnoreCase(r9)
            if (r0 == 0) goto L_0x0165
        L_0x0159:
            java.lang.String r8 = r4.A03
            if (r8 == 0) goto L_0x017a
            boolean r0 = r8.equalsIgnoreCase(r9)
            if (r0 != 0) goto L_0x017a
            r1.A03 = r8
        L_0x0165:
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x016d
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x016f
        L_0x016d:
            r1.A04 = r7
        L_0x016f:
            com.whatsapp.jid.UserJid r0 = r1.A01
            if (r0 != 0) goto L_0x0127
            com.whatsapp.jid.UserJid r0 = r4.A01
            if (r0 == 0) goto L_0x0127
            r1.A01 = r0
            goto L_0x0127
        L_0x017a:
            if (r10 != 0) goto L_0x0165
            java.lang.String r0 = "HOME"
            r1.A03 = r0
            goto L_0x0165
        L_0x0181:
            if (r0 == r8) goto L_0x0189
            if (r0 != 0) goto L_0x014d
            int r0 = r4.A00
            if (r0 == r8) goto L_0x014d
        L_0x0189:
            int r0 = r4.A00
            r1.A00 = r0
            if (r0 != 0) goto L_0x014d
            java.lang.String r0 = r4.A03
            r1.A03 = r0
            goto L_0x014d
        L_0x0194:
            r2.put(r0, r4)
            goto L_0x0127
        L_0x0198:
            boolean r0 = r10.endsWith(r8)
            if (r0 == 0) goto L_0x0118
            int r0 = r10.length()
            int r0 = r0 - r4
            goto L_0x010a
        L_0x01a5:
            java.util.Iterator r11 = X.C18290x4.A10(r2)
        L_0x01a9:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x024e
            X.7OD r7 = X.AnonymousClass4L0.A0R(r11)
            java.lang.String r10 = r7.A02
            if (r10 == 0) goto L_0x01c4
            java.lang.String r1 = r10.trim()
            java.lang.String r0 = ""
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x01c5
        L_0x01c4:
            r0 = 1
        L_0x01c5:
            if (r0 != 0) goto L_0x01a9
            int r0 = r7.A00
            r4 = 58
            if (r0 != 0) goto L_0x0211
            int r0 = r12.A00
            int r9 = r0 + 1
            r12.A00 = r9
            java.lang.StringBuilder r8 = r12.A02
            java.lang.String r2 = "item"
            r8.append(r2)
            r8.append(r9)
            java.lang.String r0 = ".TEL"
            r8.append(r0)
            com.whatsapp.jid.UserJid r0 = r7.A01
            if (r0 == 0) goto L_0x01f2
            java.lang.String r1 = r0.user
            if (r1 == 0) goto L_0x01f2
            java.lang.String r0 = ";waid="
            r8.append(r0)
            r8.append(r1)
        L_0x01f2:
            r8.append(r4)
            r8.append(r10)
            java.lang.String r1 = r12.A01
            r8.append(r1)
            r8.append(r2)
            r8.append(r9)
            java.lang.String r0 = ".X-ABLabel:"
            r8.append(r0)
            java.lang.String r0 = r7.A03
            r8.append(r0)
            r8.append(r1)
            goto L_0x01a9
        L_0x0211:
            X.33j r1 = r12.A04
            int r0 = android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(r0)
            java.lang.String r8 = r1.A0C(r0)
            r2 = 59
            int r1 = r8.indexOf(r2)
            r0 = -1
            if (r1 == r0) goto L_0x022a
            r0 = 44
            java.lang.String r8 = r8.replace(r2, r0)
        L_0x022a:
            java.lang.StringBuilder r2 = r12.A02
            java.lang.String r0 = "TEL;type="
            r2.append(r0)
            r2.append(r8)
            com.whatsapp.jid.UserJid r0 = r7.A01
            if (r0 == 0) goto L_0x0244
            java.lang.String r1 = r0.user
            if (r1 == 0) goto L_0x0244
            java.lang.String r0 = ";waid="
            r2.append(r0)
            r2.append(r1)
        L_0x0244:
            r2.append(r4)
            java.lang.String r0 = r7.A02
            A00(r0, r2, r12)
            goto L_0x01a9
        L_0x024e:
            java.util.List r0 = r13.A07
            if (r0 == 0) goto L_0x02e4
            java.util.Iterator r10 = r0.iterator()
        L_0x0256:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02e4
            java.lang.Object r4 = r10.next()
            X.7Im r4 = (X.C148467Im) r4
            java.lang.String r9 = r4.A01
            if (r9 == 0) goto L_0x0273
            java.lang.String r1 = r9.trim()
            java.lang.String r0 = ""
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0274
        L_0x0273:
            r0 = 1
        L_0x0274:
            if (r0 != 0) goto L_0x0256
            int r7 = r4.A00
            r2 = 2
            r0 = 4
            r1 = 1
            if (r7 == r0) goto L_0x02c4
            r0 = 5
            if (r7 == r0) goto L_0x02c1
            if (r7 == r1) goto L_0x02be
            if (r7 == r2) goto L_0x02bb
            r0 = 3
            if (r7 == r0) goto L_0x02b8
            r0 = 6
            if (r7 == r0) goto L_0x02b5
            java.lang.String r8 = "OTHER"
        L_0x028c:
            int r0 = r12.A00
            int r7 = r0 + 1
            r12.A00 = r7
            java.lang.StringBuilder r4 = r12.A02
            java.lang.String r2 = "item"
            r4.append(r2)
            r4.append(r7)
            java.lang.String r0 = ".URL:"
            r4.append(r0)
            r4.append(r9)
            java.lang.String r1 = r12.A01
            r4.append(r1)
            r4.append(r2)
            r4.append(r7)
            java.lang.String r0 = ".X-ABLabel:"
            X.AnonymousClass001.A1K(r0, r8, r1, r4)
            goto L_0x0256
        L_0x02b5:
            java.lang.String r8 = "FTP"
            goto L_0x028c
        L_0x02b8:
            java.lang.String r8 = "PROFILE"
            goto L_0x028c
        L_0x02bb:
            java.lang.String r8 = "BLOG"
            goto L_0x028c
        L_0x02be:
            java.lang.String r8 = "HOMEPAGE"
            goto L_0x028c
        L_0x02c1:
            java.lang.String r2 = "WORK"
            goto L_0x02c6
        L_0x02c4:
            java.lang.String r2 = "HOME"
        L_0x02c6:
            int r1 = r2.indexOf(r6)
            r0 = -1
            if (r1 == r0) goto L_0x02d3
            java.lang.String r0 = ","
            java.lang.String r2 = r2.replace(r6, r0)
        L_0x02d3:
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "URL;type="
            r1.append(r0)
            X.C18290x4.A1R(r1, r2)
            java.lang.String r0 = r4.A01
            A00(r0, r1, r12)
            goto L_0x0256
        L_0x02e4:
            java.util.List r0 = r13.A03
            if (r0 == 0) goto L_0x0457
            java.util.Iterator r11 = r0.iterator()
        L_0x02ec:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0457
            java.lang.Object r10 = r11.next()
            X.5KP r10 = (X.AnonymousClass5KP) r10
            java.lang.Class r1 = r10.A01
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Email> r0 = android.provider.ContactsContract.CommonDataKinds.Email.class
            if (r1 != r0) goto L_0x0347
            java.lang.String r8 = r10.A02
            if (r8 == 0) goto L_0x030f
            java.lang.String r1 = r8.trim()
            java.lang.String r0 = ""
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0310
        L_0x030f:
            r0 = 1
        L_0x0310:
            if (r0 != 0) goto L_0x02ec
            int r0 = r10.A00
            if (r0 != 0) goto L_0x0430
            int r0 = r12.A00
            int r7 = r0 + 1
            r12.A00 = r7
            java.lang.StringBuilder r4 = r12.A02
            java.lang.String r2 = "item"
            r4.append(r2)
            r4.append(r7)
            java.lang.String r0 = ".EMAIL;type=INTERNET:"
            r4.append(r0)
            r4.append(r8)
            java.lang.String r1 = r12.A01
            r4.append(r1)
            r4.append(r2)
            r4.append(r7)
            java.lang.String r0 = ".X-ABLabel:"
            r4.append(r0)
            java.lang.String r0 = r10.A03
            r4.append(r0)
            r4.append(r1)
            goto L_0x02ec
        L_0x0347:
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$StructuredPostal> r0 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class
            if (r1 != r0) goto L_0x02ec
            int r0 = r12.A00
            int r7 = r0 + 1
            r12.A00 = r7
            X.5X7 r1 = r10.A04
            if (r1 == 0) goto L_0x0450
            int r0 = r10.A00
            java.lang.String r4 = "vcardcomposer/appendwapostalstr failed isoFromNativeName"
            java.lang.String r9 = ".X-ABADR:"
            java.lang.String r8 = "item"
            if (r0 != 0) goto L_0x03ca
            java.lang.StringBuilder r2 = r12.A02
            r2.append(r8)
            r2.append(r7)
            java.lang.String r0 = ".ADR:;;"
            r2.append(r0)
            java.lang.String r0 = r1.A01()
            A00(r0, r2, r12)
            X.C18270x1.A19(r8, r9, r2, r7)
            java.lang.String r9 = r1.A01
            if (r9 == 0) goto L_0x03ac
            X.5Xx r0 = r12.A03     // Catch:{ IOException -> 0x03a8 }
            r0.A05()     // Catch:{ IOException -> 0x03a8 }
            java.util.ArrayList r0 = r0.A01     // Catch:{ IOException -> 0x03a8 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ IOException -> 0x03a8 }
        L_0x0385:
            boolean r0 = r7.hasNext()     // Catch:{ IOException -> 0x03a8 }
            if (r0 == 0) goto L_0x03a5
            java.lang.Object r1 = r7.next()     // Catch:{ IOException -> 0x03a8 }
            X.5Ow r1 = (X.C103905Ow) r1     // Catch:{ IOException -> 0x03a8 }
            java.lang.String r0 = r1.A03     // Catch:{ IOException -> 0x03a8 }
            boolean r0 = r0.startsWith(r9)     // Catch:{ IOException -> 0x03a8 }
            if (r0 == 0) goto L_0x0385
            java.lang.String r1 = r1.A02     // Catch:{ IOException -> 0x03a8 }
        L_0x039b:
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IOException -> 0x03a8 }
            java.lang.String r0 = r1.toLowerCase(r0)     // Catch:{ IOException -> 0x03a8 }
            r2.append(r0)     // Catch:{ IOException -> 0x03a8 }
            goto L_0x03ac
        L_0x03a5:
            java.lang.String r1 = ""
            goto L_0x039b
        L_0x03a8:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)
        L_0x03ac:
            java.lang.StringBuilder r2 = r12.A02
            java.lang.String r1 = r12.A01
            r2.append(r1)
            r2.append(r8)
            int r0 = r12.A00
            r2.append(r0)
            java.lang.String r0 = ".X-ABLabel:"
            r2.append(r0)
            java.lang.String r0 = r10.A03
            r2.append(r0)
            r2.append(r1)
            goto L_0x02ec
        L_0x03ca:
            X.33j r1 = r12.A04
            int r0 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabelResource(r0)
            java.lang.String r1 = r1.A0C(r0)
            java.lang.StringBuilder r7 = r12.A02
            r7.append(r8)
            int r2 = r12.A00
            r7.append(r2)
            java.lang.String r0 = ".ADR;type="
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = ":;;"
            r7.append(r0)
            X.5X7 r1 = r10.A04
            java.lang.String r0 = r1.A01()
            A00(r0, r7, r12)
            X.C18270x1.A19(r8, r9, r7, r2)
            java.lang.String r8 = r1.A01
            if (r8 == 0) goto L_0x042d
            X.5Xx r0 = r12.A03     // Catch:{ IOException -> 0x0429 }
            r0.A05()     // Catch:{ IOException -> 0x0429 }
            java.util.ArrayList r0 = r0.A01     // Catch:{ IOException -> 0x0429 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ IOException -> 0x0429 }
        L_0x0406:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x0429 }
            if (r0 == 0) goto L_0x0426
            java.lang.Object r1 = r2.next()     // Catch:{ IOException -> 0x0429 }
            X.5Ow r1 = (X.C103905Ow) r1     // Catch:{ IOException -> 0x0429 }
            java.lang.String r0 = r1.A03     // Catch:{ IOException -> 0x0429 }
            boolean r0 = r0.startsWith(r8)     // Catch:{ IOException -> 0x0429 }
            if (r0 == 0) goto L_0x0406
            java.lang.String r1 = r1.A02     // Catch:{ IOException -> 0x0429 }
        L_0x041c:
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IOException -> 0x0429 }
            java.lang.String r0 = r1.toLowerCase(r0)     // Catch:{ IOException -> 0x0429 }
            r7.append(r0)     // Catch:{ IOException -> 0x0429 }
            goto L_0x042d
        L_0x0426:
            java.lang.String r1 = ""
            goto L_0x041c
        L_0x0429:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)
        L_0x042d:
            java.lang.StringBuilder r1 = r12.A02
            goto L_0x0449
        L_0x0430:
            X.33j r1 = r12.A04
            int r0 = android.provider.ContactsContract.CommonDataKinds.Email.getTypeLabelResource(r0)
            java.lang.String r2 = r1.A0C(r0)
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "EMAIL;TYPE="
            r1.append(r0)
            X.C18290x4.A1R(r1, r2)
            java.lang.String r0 = r10.A02
            r1.append(r0)
        L_0x0449:
            java.lang.String r0 = r12.A01
            r1.append(r0)
            goto L_0x02ec
        L_0x0450:
            java.lang.String r0 = "appendWAPostalStr addr_data is NULL"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x02ec
        L_0x0457:
            java.util.Map r0 = r13.A08
            if (r0 == 0) goto L_0x0473
            java.lang.String r2 = "BDAY"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x0473
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "BDAY;value=date:"
            r1.append(r0)
            X.5T6 r0 = X.C106705a1.A00(r2, r13)
            java.lang.String r0 = r0.A02
            A00(r0, r1, r12)
        L_0x0473:
            java.util.Map r0 = r13.A08
            if (r0 == 0) goto L_0x04c4
            java.util.Iterator r8 = X.C18280x3.A0i(r0)
        L_0x047b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x04c4
            java.lang.String r1 = X.AnonymousClass001.A0m(r8)
            java.util.HashMap r0 = X.C106705a1.A0E
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x047b
            X.5T6 r7 = X.C106705a1.A00(r1, r13)
            java.lang.StringBuilder r0 = r12.A02
            r0.append(r1)
            r0.append(r6)
            java.util.Set r4 = r7.A04
            java.lang.String r2 = ":"
            int r0 = r4.size()
            java.lang.StringBuilder r1 = r12.A02
            if (r0 <= 0) goto L_0x04be
            java.lang.String r0 = "type="
            r1.append(r0)
            java.lang.Object[] r0 = r4.toArray()
            r0 = r0[r5]
            r1.append(r0)
        L_0x04b3:
            r1.append(r2)
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = r7.A02
            A00(r0, r1, r12)
            goto L_0x047b
        L_0x04be:
            java.lang.String r0 = "type=HOME"
            r1.append(r0)
            goto L_0x04b3
        L_0x04c4:
            byte[] r2 = r13.A0B
            if (r2 == 0) goto L_0x04d7
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "PHOTO;BASE64:"
            r1.append(r0)
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r2, r0)
            A00(r0, r1, r12)
        L_0x04d7:
            java.lang.String r0 = r3.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x052e
            java.lang.String r0 = r13.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x04fc
            java.lang.StringBuilder r2 = r12.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "X-WA-BIZ-DESCRIPTION:"
            r1.append(r0)
            java.lang.String r0 = r13.A02
            X.C18270x1.A1C(r0, r1, r2)
            java.lang.String r0 = r12.A01
            r2.append(r0)
        L_0x04fc:
            java.lang.String r0 = r13.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0519
            java.lang.StringBuilder r2 = r12.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "X-WA-BIZ-AUTOMATED-TYPE:"
            r1.append(r0)
            java.lang.String r0 = r13.A00
            X.C18270x1.A1C(r0, r1, r2)
            java.lang.String r0 = r12.A01
            r2.append(r0)
        L_0x0519:
            java.lang.StringBuilder r2 = r12.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "X-WA-BIZ-NAME:"
            r1.append(r0)
            java.lang.String r0 = r3.A08
            X.C18270x1.A1C(r0, r1, r2)
            java.lang.String r0 = r12.A01
            r2.append(r0)
        L_0x052e:
            X.7Ik r4 = r13.A09
            X.1fH r2 = r4.A00
            java.lang.String r3 = ":"
            if (r2 == 0) goto L_0x0545
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "X-WA-LID"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r2.user
            A00(r0, r1, r12)
        L_0x0545:
            java.lang.String r2 = r4.A01
            if (r2 == 0) goto L_0x0555
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "X-WA-LID-DISPLAY-NAME"
            X.AnonymousClass001.A1K(r0, r3, r2, r1)
            java.lang.String r0 = r12.A01
            r1.append(r0)
        L_0x0555:
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "END:VCARD"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105755Wg.A01(X.5a1):java.lang.String");
    }
}
