package X;

import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Y4  reason: invalid class name */
public class AnonymousClass5Y4 {
    public final C64773Ex A00;
    public final C620633i A01;
    public final C54292oU A02;
    public final C620733j A03;
    public final C106705a1 A04 = new C106705a1();

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public X.C42032Mn A03(X.C30421mQ r9) {
        /*
            r8 = this;
            monitor-enter(r9)
            java.lang.Object r7 = r9.A1K     // Catch:{ all -> 0x0039 }
            monitor-enter(r7)     // Catch:{ all -> 0x0039 }
            X.2Mn r6 = r9.A02     // Catch:{ all -> 0x0036 }
            monitor-exit(r7)     // Catch:{ all -> 0x0036 }
            if (r6 != 0) goto L_0x0034
            r6 = 0
            java.lang.String r5 = r9.A1v()     // Catch:{ 6zK -> 0x002e }
            X.2oU r4 = r8.A02     // Catch:{ 6zK -> 0x002e }
            X.3Ex r3 = r8.A00     // Catch:{ 6zK -> 0x002e }
            X.33i r2 = r8.A01     // Catch:{ 6zK -> 0x002e }
            X.33j r1 = r8.A03     // Catch:{ 6zK -> 0x002e }
            X.5Y4 r0 = new X.5Y4     // Catch:{ 6zK -> 0x002e }
            r0.<init>(r3, r2, r4, r1)     // Catch:{ 6zK -> 0x002e }
            r0.A05(r5)     // Catch:{ 6zK -> 0x002e }
            X.5a1 r1 = r0.A04     // Catch:{ 6zK -> 0x002e }
            X.2Mn r0 = new X.2Mn     // Catch:{ 6zK -> 0x002e }
            r0.<init>(r5, r1)     // Catch:{ 6zK -> 0x002e }
            monitor-enter(r7)     // Catch:{ 6zK -> 0x002e }
            r9.A02 = r0     // Catch:{ all -> 0x002b }
            monitor-exit(r7)     // Catch:{ all -> 0x002b }
            monitor-exit(r9)     // Catch:{ all -> 0x0039 }
            return r0
        L_0x002b:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ 6zK -> 0x002e }
        L_0x002e:
            r1 = move-exception
            java.lang.String r0 = "Can't read VCard contact."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0039 }
        L_0x0034:
            monitor-exit(r9)     // Catch:{ all -> 0x0039 }
            return r6
        L_0x0036:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0036 }
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0039 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Y4.A03(X.1mQ):X.2Mn");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: X.5KP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x057e, code lost:
        r1 = r4.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x05d9, code lost:
        r1 = r4.A04;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C149097La r26) {
        /*
            r25 = this;
            r5 = 0
            r2 = r26
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "VCARD"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x05f0
            java.util.ArrayList r0 = r2.A02
            java.util.Iterator r18 = r0.iterator()
            r17 = 0
            r16 = 0
            r15 = 0
            r14 = 0
        L_0x0019:
            boolean r0 = r18.hasNext()
            r4 = r25
            if (r0 == 0) goto L_0x057c
            java.lang.Object r2 = r18.next()
            X.5T6 r2 = (X.AnonymousClass5T6) r2
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r2.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "VERSION"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "FN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004a
            X.5a1 r0 = r4.A04
            X.5Ot r1 = r0.A0A
            java.lang.String r0 = r2.A02
            r1.A01 = r0
            goto L_0x0019
        L_0x004a:
            java.lang.String r0 = "NAME"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
            X.5a1 r0 = r4.A04
            X.5Ot r3 = r0.A0A
            java.lang.String r0 = r3.A01
            if (r0 != 0) goto L_0x005f
            java.lang.String r0 = r2.A02
            r3.A01 = r0
            goto L_0x0019
        L_0x005f:
            java.lang.String r0 = "N"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0071
            X.5a1 r0 = r4.A04
            X.5Ot r1 = r0.A0A
            java.util.List r0 = r2.A03
            X.C106705a1.A02(r0, r1)
            goto L_0x0019
        L_0x0071:
            java.lang.String r0 = "SORT-STRING"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0080
            X.5a1 r1 = r4.A04
            java.lang.String r0 = r2.A02
            r1.A01 = r0
            goto L_0x0019
        L_0x0080:
            java.lang.String r0 = "SOUND"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00bb
            java.util.Set r1 = r2.A04
            java.lang.String r0 = "X-IRMC-N"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x054e
            X.5a1 r7 = r4.A04
            java.lang.String r0 = r7.A01
            if (r0 != 0) goto L_0x054e
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r4 = r2.A02
            int r3 = r4.length()
            r2 = 0
        L_0x00a3:
            if (r2 >= r3) goto L_0x00b3
            char r1 = r4.charAt(r2)
            r0 = 59
            if (r1 == r0) goto L_0x00b0
            r6.append(r1)
        L_0x00b0:
            int r2 = r2 + 1
            goto L_0x00a3
        L_0x00b3:
            java.lang.String r0 = r6.toString()
            r7.A01 = r0
            goto L_0x0019
        L_0x00bb:
            java.lang.String r0 = "ADR"
            boolean r0 = r1.equals(r0)
            java.lang.String r10 = "X-"
            r6 = -1
            java.lang.String r7 = "PREF"
            java.lang.String r3 = ""
            java.lang.String r9 = "WORK"
            java.lang.String r8 = "HOME"
            if (r0 == 0) goto L_0x01dd
            java.util.List r13 = r2.A03
            java.util.Iterator r1 = r13.iterator()
        L_0x00d4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = X.AnonymousClass001.A0m(r1)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00d4
            java.util.Set r0 = r2.A04
            java.util.Iterator r19 = r0.iterator()
            r12 = r3
            r11 = 0
        L_0x00ec:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0153
            java.lang.String r1 = X.AnonymousClass001.A0m(r19)
            boolean r0 = r1.equals(r7)
            if (r0 == 0) goto L_0x0102
            if (r16 != 0) goto L_0x0102
            r16 = 1
            r11 = 1
            goto L_0x00ec
        L_0x0102:
            boolean r0 = r1.equalsIgnoreCase(r8)
            if (r0 == 0) goto L_0x010b
            r12 = r3
            r6 = 1
            goto L_0x00ec
        L_0x010b:
            boolean r0 = r1.equalsIgnoreCase(r9)
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = "COMPANY"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = "POSTAL"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00ec
            java.lang.String r0 = "PARCEL"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00ec
            java.lang.String r0 = "DOM"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00ec
            java.lang.String r0 = "INTL"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00ec
            java.lang.String r0 = X.C86664Kz.A1L(r1)
            boolean r0 = r0.startsWith(r10)
            if (r0 == 0) goto L_0x014c
            if (r6 >= 0) goto L_0x00ec
            r0 = 2
            java.lang.String r12 = r1.substring(r0)
        L_0x014a:
            r6 = 0
            goto L_0x00ec
        L_0x014c:
            if (r6 >= 0) goto L_0x00ec
            r12 = r1
            goto L_0x014a
        L_0x0150:
            r12 = r3
            r6 = 2
            goto L_0x00ec
        L_0x0153:
            if (r6 >= 0) goto L_0x0156
            r6 = 1
        L_0x0156:
            int r1 = r13.size()
            r0 = 1
            if (r1 <= r0) goto L_0x01d9
            X.5X7 r7 = new X.5X7
            r7.<init>()
            int r1 = r13.size()
            r0 = 2
            if (r1 <= r0) goto L_0x016f
            java.lang.String r0 = X.AnonymousClass001.A0n(r13, r0)
            r7.A03 = r0
        L_0x016f:
            int r1 = r13.size()
            r0 = 3
            if (r1 <= r0) goto L_0x017c
            java.lang.String r0 = X.AnonymousClass001.A0n(r13, r0)
            r7.A00 = r0
        L_0x017c:
            int r1 = r13.size()
            r0 = 4
            if (r1 <= r0) goto L_0x0189
            java.lang.String r0 = X.AnonymousClass001.A0n(r13, r0)
            r7.A02 = r0
        L_0x0189:
            int r1 = r13.size()
            r0 = 5
            if (r1 <= r0) goto L_0x0196
            java.lang.String r0 = X.AnonymousClass001.A0n(r13, r0)
            r7.A04 = r0
        L_0x0196:
            int r1 = r13.size()
            r0 = 6
            if (r1 <= r0) goto L_0x01a3
            java.lang.String r0 = X.AnonymousClass001.A0n(r13, r0)
            r7.A01 = r0
        L_0x01a3:
            int r1 = r13.size()
            r0 = 7
            if (r1 <= r0) goto L_0x01ad
            r13.get(r0)
        L_0x01ad:
            java.lang.String r0 = r7.toString()
            java.lang.String r3 = r0.trim()
        L_0x01b5:
            X.5a1 r0 = r4.A04
            java.util.List r2 = r0.A03
            if (r2 != 0) goto L_0x01c1
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            r0.A03 = r2
        L_0x01c1:
            X.5KP r1 = new X.5KP
            r1.<init>()
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$StructuredPostal> r0 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class
            r1.A01 = r0
            r1.A00 = r6
            r1.A02 = r3
            r1.A04 = r7
            r1.A03 = r12
            r1.A05 = r11
            r2.add(r1)
            goto L_0x0019
        L_0x01d9:
            java.lang.String r3 = r2.A02
            r7 = 0
            goto L_0x01b5
        L_0x01dd:
            java.lang.String r0 = "ORG"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x022d
            java.util.Set r0 = r2.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x01eb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ff
            java.lang.String r0 = X.AnonymousClass001.A0m(r1)
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x01eb
            if (r14 != 0) goto L_0x01eb
            r14 = 1
            goto L_0x01eb
        L_0x01ff:
            X.5a1 r4 = r4.A04
            java.util.List r0 = r2.A03
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.util.Iterator r1 = r0.iterator()
        L_0x020b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0224
            java.lang.String r0 = X.AnonymousClass001.A0m(r1)
            r2.append(r0)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x020b
            r0 = 32
            r2.append(r0)
            goto L_0x020b
        L_0x0224:
            java.lang.String r0 = r2.toString()
            r4.A05(r0, r3)
            goto L_0x0019
        L_0x022d:
            java.lang.String r0 = "TITLE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0555
            java.lang.String r0 = "ROLE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0555
            java.lang.String r0 = "PHOTO"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0265
            java.lang.String r0 = r2.A02
            byte[] r2 = r0.getBytes()
            X.5a1 r1 = r4.A04
            r0 = 0
            r1.A0B = r0
            if (r2 == 0) goto L_0x0019
            int r0 = r2.length
            if (r0 <= 0) goto L_0x0019
            byte[] r0 = android.util.Base64.decode(r2, r5)     // Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException | StringIndexOutOfBoundsException -> 0x025d }
            r1.A0B = r0     // Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException | StringIndexOutOfBoundsException -> 0x025d }
            goto L_0x0019
        L_0x025d:
            r1 = move-exception
            java.lang.String r0 = "contactstruct/constructcontactfromvnode/base64-decode/error"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0019
        L_0x0265:
            java.lang.String r0 = "LOGO"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0274
            java.lang.String r0 = "name/LOGO/we_don't_support"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0019
        L_0x0274:
            java.lang.String r0 = "EMAIL"
            boolean r0 = r1.equals(r0)
            java.lang.String r3 = "CELL"
            if (r0 == 0) goto L_0x02ee
            java.util.Set r0 = r2.A04
            java.util.Iterator r13 = r0.iterator()
            r12 = 0
            r11 = 0
        L_0x0286:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x02ca
            java.lang.String r1 = X.AnonymousClass001.A0m(r13)
            boolean r0 = r1.equals(r7)
            if (r0 == 0) goto L_0x029b
            if (r15 != 0) goto L_0x029b
            r15 = 1
            r11 = 1
            goto L_0x0286
        L_0x029b:
            boolean r0 = r1.equalsIgnoreCase(r8)
            if (r0 == 0) goto L_0x02a3
            r6 = 1
            goto L_0x0286
        L_0x02a3:
            boolean r0 = r1.equalsIgnoreCase(r9)
            if (r0 == 0) goto L_0x02ab
            r6 = 2
            goto L_0x0286
        L_0x02ab:
            boolean r0 = r1.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x02b3
            r6 = 4
            goto L_0x0286
        L_0x02b3:
            java.lang.String r0 = X.C86664Kz.A1L(r1)
            boolean r0 = r0.startsWith(r10)
            if (r0 == 0) goto L_0x02c7
            if (r6 >= 0) goto L_0x0286
            r0 = 2
            java.lang.String r1 = r1.substring(r0)
        L_0x02c4:
            r12 = r1
            r6 = 0
            goto L_0x0286
        L_0x02c7:
            if (r6 >= 0) goto L_0x0286
            goto L_0x02c4
        L_0x02ca:
            if (r6 >= 0) goto L_0x02cd
            r6 = 3
        L_0x02cd:
            X.5a1 r3 = r4.A04
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Email> r1 = android.provider.ContactsContract.CommonDataKinds.Email.class
            java.lang.String r0 = r2.A02
            java.util.List r4 = r3.A03
            if (r4 != 0) goto L_0x02dd
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            r3.A03 = r4
        L_0x02dd:
            X.5KP r2 = new X.5KP
            r2.<init>()
            r2.A01 = r1
            r2.A00 = r6
            r2.A02 = r0
            r2.A03 = r12
            r2.A05 = r11
            goto L_0x03bb
        L_0x02ee:
            java.lang.String r0 = "TEL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03ad
            java.util.Set r0 = r2.A04
            java.util.Iterator r12 = r0.iterator()
            r22 = r8
            r11 = 0
            r24 = 0
        L_0x0301:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0392
            java.lang.String r1 = X.AnonymousClass001.A0m(r12)
            if (r11 == 0) goto L_0x0327
            boolean r0 = r1.equals(r8)
            if (r0 == 0) goto L_0x031f
            r6 = 5
        L_0x0314:
            android.content.ContentValues r1 = r2.A00
            java.lang.String r0 = "waId"
            java.lang.String r0 = r1.getAsString(r0)
            if (r0 == 0) goto L_0x039c
            goto L_0x0397
        L_0x031f:
            boolean r0 = r1.equals(r9)
            if (r0 == 0) goto L_0x0392
            r6 = 4
            goto L_0x0314
        L_0x0327:
            boolean r0 = r1.equals(r7)
            if (r0 == 0) goto L_0x0334
            if (r17 != 0) goto L_0x0334
            r17 = 1
            r24 = 1
            goto L_0x0301
        L_0x0334:
            boolean r0 = r1.equalsIgnoreCase(r8)
            if (r0 == 0) goto L_0x033c
            r6 = 1
            goto L_0x0301
        L_0x033c:
            boolean r0 = r1.equalsIgnoreCase(r9)
            if (r0 == 0) goto L_0x0344
            r6 = 3
            goto L_0x0301
        L_0x0344:
            boolean r0 = r1.equalsIgnoreCase(r3)
            if (r0 != 0) goto L_0x038f
            java.lang.String r0 = "MOBILE"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x038f
            java.lang.String r0 = "PAGER"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x035c
            r6 = 6
            goto L_0x0301
        L_0x035c:
            java.lang.String r0 = "FAX"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0366
            r11 = 1
            goto L_0x0301
        L_0x0366:
            java.lang.String r0 = "VOICE"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0301
            java.lang.String r0 = "MSG"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0301
            java.lang.String r0 = X.C86664Kz.A1L(r1)
            boolean r0 = r0.startsWith(r10)
            if (r0 == 0) goto L_0x038a
            if (r6 >= 0) goto L_0x0301
            r0 = 2
            java.lang.String r22 = r1.substring(r0)
        L_0x0387:
            r6 = 0
            goto L_0x0301
        L_0x038a:
            if (r6 >= 0) goto L_0x0301
            r22 = r1
            goto L_0x0387
        L_0x038f:
            r6 = 2
            goto L_0x0301
        L_0x0392:
            if (r6 >= 0) goto L_0x0314
            r6 = 1
            goto L_0x0314
        L_0x0397:
            com.whatsapp.jid.PhoneUserJid r20 = X.AnonymousClass32X.A00(r0)     // Catch:{ 24P -> 0x039c }
            goto L_0x039e
        L_0x039c:
            r20 = 0
        L_0x039e:
            X.5a1 r1 = r4.A04
            java.lang.String r0 = r2.A02
            r19 = r1
            r21 = r0
            r23 = r6
            r19.A04(r20, r21, r22, r23, r24)
            goto L_0x0019
        L_0x03ad:
            java.lang.String r0 = "NOTE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03c0
            X.5a1 r0 = r4.A04
            java.util.List r4 = r0.A04
            java.lang.String r2 = r2.A02
        L_0x03bb:
            r4.add(r2)
            goto L_0x0019
        L_0x03c0:
            java.lang.String r0 = "BDAY"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03ef
            X.5a1 r4 = r4.A04
            java.lang.String r3 = r2.A02
            if (r3 == 0) goto L_0x03ea
            java.lang.String r0 = "1604"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x03ea
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "-"
            r1.append(r0)
            r0 = 4
            java.lang.String r0 = r3.substring(r0)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            r2.A02 = r0
        L_0x03ea:
            r4.A06(r2)
            goto L_0x0019
        L_0x03ef:
            java.lang.String r0 = "URL"
            boolean r0 = r1.equals(r0)
            java.lang.String r3 = "PROFILE"
            if (r0 == 0) goto L_0x046a
            java.lang.String r7 = r2.A02
            java.util.Set r0 = r2.A04
            java.util.Iterator r2 = r0.iterator()
        L_0x0401:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x044b
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)
            java.lang.String r0 = "BLOG"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0415
            r6 = 2
            goto L_0x0401
        L_0x0415:
            java.lang.String r0 = "FTP"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x041f
            r6 = 6
            goto L_0x0401
        L_0x041f:
            boolean r0 = r1.equalsIgnoreCase(r8)
            if (r0 == 0) goto L_0x0427
            r6 = 4
            goto L_0x0401
        L_0x0427:
            java.lang.String r0 = "HOMEPAGE"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0431
            r6 = 1
            goto L_0x0401
        L_0x0431:
            java.lang.String r0 = "OTHER"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x043b
            r6 = 7
            goto L_0x0401
        L_0x043b:
            boolean r0 = r1.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0443
            r6 = 3
            goto L_0x0401
        L_0x0443:
            boolean r0 = r1.equalsIgnoreCase(r9)
            if (r0 == 0) goto L_0x0401
            r6 = 5
            goto L_0x0401
        L_0x044b:
            X.5a1 r2 = r4.A04
            java.util.List r0 = r2.A07
            if (r0 != 0) goto L_0x0457
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r2.A07 = r0
        L_0x0457:
            X.7Im r1 = new X.7Im
            r1.<init>()
            r1.A00 = r6
            X.C626936e.A06(r7)
            r1.A01 = r7
            java.util.List r0 = r2.A07
            r0.add(r1)
            goto L_0x0019
        L_0x046a:
            java.lang.String r0 = "REV"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x054e
            java.lang.String r0 = "UID"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x054e
            java.lang.String r0 = "KEY"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x054e
            java.lang.String r0 = "MAILER"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x054e
            java.lang.String r0 = "TZ"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x054e
            java.lang.String r0 = "GEO"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x054e
            java.lang.String r0 = "NICKNAME"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x054e
            java.lang.String r0 = "CLASS"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x054e
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x054e
            java.lang.String r0 = "CATEGORIES"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x054e
            java.lang.String r0 = "SOURCE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x054e
            java.lang.String r0 = "PRODID"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x054e
            java.lang.String r0 = "X-PHONETIC-FIRST-NAME"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x04da
            X.5a1 r0 = r4.A04
            X.5Ot r1 = r0.A0A
            java.lang.String r0 = r2.A02
            r1.A04 = r0
            goto L_0x0019
        L_0x04da:
            java.lang.String r0 = "X-PHONETIC-MIDDLE-NAME"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "X-PHONETIC-LAST-NAME"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x04f4
            X.5a1 r0 = r4.A04
            X.5Ot r1 = r0.A0A
            java.lang.String r0 = r2.A02
            r1.A05 = r0
            goto L_0x0019
        L_0x04f4:
            java.lang.String r0 = "X-WA-BIZ-NAME"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0506
            X.5a1 r0 = r4.A04
            X.5Ot r1 = r0.A0A
            java.lang.String r0 = r2.A02
            r1.A08 = r0
            goto L_0x0019
        L_0x0506:
            java.lang.String r0 = "X-WA-BIZ-DESCRIPTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0516
            X.5a1 r1 = r4.A04
            java.lang.String r0 = r2.A02
            r1.A02 = r0
            goto L_0x0019
        L_0x0516:
            java.lang.String r0 = "X-WA-BIZ-AUTOMATED-TYPE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0526
            X.5a1 r1 = r4.A04
            java.lang.String r0 = r2.A02
            r1.A00 = r0
            goto L_0x0019
        L_0x0526:
            java.lang.String r0 = "X-WA-LID"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x053c
            X.5a1 r0 = r4.A04
            X.7Ik r1 = r0.A09
            java.lang.String r0 = r2.A02
            X.1fH r0 = X.C27981fH.A00(r0)
            r1.A00 = r0
            goto L_0x0019
        L_0x053c:
            java.lang.String r0 = "X-WA-LID-DISPLAY-NAME"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x054e
            X.5a1 r0 = r4.A04
            X.7Ik r1 = r0.A09
            java.lang.String r0 = r2.A02
            r1.A01 = r0
            goto L_0x0019
        L_0x054e:
            X.5a1 r0 = r4.A04
            r0.A06(r2)
            goto L_0x0019
        L_0x0555:
            X.5a1 r6 = r4.A04
            java.lang.String r4 = r2.A02
            java.util.List r0 = r6.A05
            if (r0 != 0) goto L_0x0563
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r6.A05 = r0
        L_0x0563:
            int r2 = r0.size()
            r1 = 1
            if (r2 != 0) goto L_0x056f
            r0 = 0
            r6.A05(r3, r0)
            r2 = 1
        L_0x056f:
            java.util.List r0 = r6.A05
            int r2 = r2 - r1
            java.lang.Object r0 = r0.get(r2)
            X.7Il r0 = (X.C148457Il) r0
            r0.A01 = r4
            goto L_0x0019
        L_0x057c:
            if (r17 != 0) goto L_0x0595
            X.5a1 r1 = r4.A04
            java.util.List r0 = r1.A06
            if (r0 == 0) goto L_0x0595
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0595
            java.util.List r0 = r1.A06
            java.lang.Object r1 = r0.get(r5)
            X.7OD r1 = (X.AnonymousClass7OD) r1
            r0 = 1
            r1.A04 = r0
        L_0x0595:
            if (r16 != 0) goto L_0x05b6
            X.5a1 r0 = r4.A04
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x05b6
            java.util.Iterator r3 = r0.iterator()
        L_0x05a1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x05b6
            java.lang.Object r2 = r3.next()
            X.5KP r2 = (X.AnonymousClass5KP) r2
            java.lang.Class r1 = r2.A01
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$StructuredPostal> r0 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class
            if (r1 != r0) goto L_0x05a1
            r0 = 1
            r2.A05 = r0
        L_0x05b6:
            if (r15 != 0) goto L_0x05d7
            X.5a1 r0 = r4.A04
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x05d7
            java.util.Iterator r3 = r0.iterator()
        L_0x05c2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x05d7
            java.lang.Object r2 = r3.next()
            X.5KP r2 = (X.AnonymousClass5KP) r2
            java.lang.Class r1 = r2.A01
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Email> r0 = android.provider.ContactsContract.CommonDataKinds.Email.class
            if (r1 != r0) goto L_0x05c2
            r0 = 1
            r2.A05 = r0
        L_0x05d7:
            if (r14 != 0) goto L_0x05ea
            X.5a1 r1 = r4.A04
            java.util.List r0 = r1.A05
            if (r0 == 0) goto L_0x05ea
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x05ea
            java.util.List r0 = r1.A05
            r0.get(r5)
        L_0x05ea:
            X.5a1 r0 = r4.A04
            r4.A07(r0)
            return
        L_0x05f0:
            java.lang.String r1 = "Non VCARD data is inserted."
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.6zK r0 = new X.6zK
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Y4.A06(X.7La):void");
    }

    public List A01(List list) {
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        int i2 = 0;
        ArrayList A0p = AnonymousClass000.A0p(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            AnonymousClass5Y4 r0 = new AnonymousClass5Y4(this.A00, this.A01, this.A02, this.A03);
            try {
                r0.A05(A0m);
                C106705a1 r1 = r0.A04;
                A0p.add(new C42032Mn(A0m, r1));
                AnonymousClass7OE r11 = r1.A0C;
                i2 += r11.A01;
                i += r11.A00;
                j3 += r11.A04;
                j += r11.A02;
                j2 += r11.A03;
            } catch (C143696zK unused) {
            }
        }
        if (i2 > 0 || i > 0) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("contactstruct/construct/too_long=");
            A0o.append(i2);
            C18260x0.A0z("; exceed_max=", A0o, i);
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("contactstruct/construct/parse_time=");
        A0o2.append(j3);
        A0o2.append("; construct_time=");
        A0o2.append(j);
        C18260x0.A10("; select_time=", A0o2, j2);
        return A0p;
    }

    public Map A02(String str) {
        HashMap A0t = AnonymousClass001.A0t();
        Uri A0H = C18290x4.A0H(ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_name", this.A02.A00.getString(R.string.f11nameremoved)), "account_type", "com.whatsapp");
        Cursor A032 = C620633i.A02(this.A01).A03(A0H, new String[]{"sync1", "_id"}, "contact_id=?", C18270x1.A1b(str), (String) null);
        if (A032 != null) {
            while (A032.moveToNext()) {
                try {
                    String A0Z = AnonymousClass0x2.A0Z(A032, "_id");
                    UserJid A08 = AnonymousClass32Y.A08(AnonymousClass0x2.A0Z(A032, "sync1"));
                    if (A08 != null) {
                        A0t.put(A0Z, A08);
                    }
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
            }
        }
        if (A032 != null) {
            A032.close();
        }
        return A0t;
    }

    public void A04(C620433g r8) {
        String str;
        C106705a1 r4 = this.A04;
        List list = r4.A06;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass7OD A0R = AnonymousClass4L0.A0R(it);
                AnonymousClass3ZH A0C = this.A00.A0C(A0R.A02);
                if (A0C != null) {
                    if (A0C.A0R()) {
                        C103875Ot r1 = r4.A0A;
                        r1.A08 = r1.A01;
                        UserJid A07 = AnonymousClass3ZH.A07(A0C);
                        String A032 = r8.A03(A07);
                        if (!TextUtils.isEmpty(A032)) {
                            r4.A02 = A032;
                        }
                        if (A07 != null) {
                            int A002 = r8.A0A.A00(A07);
                            if (A002 == 1) {
                                str = "1p_partial";
                            } else if (A002 == 2) {
                                str = "3p_full";
                            }
                            r4.A00 = str;
                        }
                    }
                    UserJid A072 = AnonymousClass3ZH.A07(A0C);
                    if (A0C.A10 && A072 != null) {
                        A0R.A01 = A072;
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void A07(C106705a1 r10) {
        Cursor A0A;
        boolean z;
        Map map;
        String str;
        String A06;
        String str2;
        String str3;
        String str4;
        List list = r10.A06;
        if (list != null) {
            ArrayList A0p = AnonymousClass000.A0p(list);
            Iterator it = r10.A06.iterator();
            while (it.hasNext()) {
                AnonymousClass7OD A0R = AnonymousClass4L0.A0R(it);
                if (A0R.A01 == null && (str4 = A0R.A02) != null) {
                    int indexOf = str4.indexOf(44);
                    if (indexOf != -1) {
                        str4 = AnonymousClass0x7.A0r(str4, indexOf);
                    }
                    A0p.add(PhoneNumberUtils.stripSeparators(str4.trim()));
                }
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            C34461vC r5 = this.A00.A05;
            if (A0p.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                boolean z2 = false;
                if (A0p.size() <= 10) {
                    z2 = true;
                }
                C626936e.A0C(z2);
                Iterator it2 = A0p.iterator();
                while (it2.hasNext()) {
                    String A0m = AnonymousClass001.A0m(it2);
                    if (A0m != null) {
                        int length = A0m.length();
                        z = true;
                        if (length <= 30) {
                            C626936e.A0C(z);
                        }
                    }
                    z = false;
                    C626936e.A0C(z);
                }
                HashMap hashMap = new HashMap(A0p.size());
                AnonymousClass4GK A0B = r5.A00.get();
                try {
                    int size = A0p.size();
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("SELECT wa_contacts.jid, number FROM wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid) WHERE ");
                    A0o.append("number IN ");
                    A0A = AnonymousClass361.A0A(A0B, AnonymousClass000.A0X(C57212tH.A00(size), A0o), "GET_JIDS_BY_PHONE_NUMBERS", C18300x5.A1b(A0p));
                    int columnIndexOrThrow = A0A.getColumnIndexOrThrow("jid");
                    int columnIndexOrThrow2 = A0A.getColumnIndexOrThrow("number");
                    while (A0A.moveToNext()) {
                        UserJid A08 = AnonymousClass32Y.A08(A0A.getString(columnIndexOrThrow));
                        String string = A0A.getString(columnIndexOrThrow2);
                        if (!(A08 == null || string == null)) {
                            hashMap.put(string, A08);
                        }
                    }
                    A0A.close();
                    A0B.close();
                    map = hashMap;
                } catch (Throwable th) {
                    try {
                        A0B.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            r10.A0C.A03 = C18310x6.A0A(uptimeMillis);
            Iterator it3 = r10.A06.iterator();
            while (it3.hasNext()) {
                AnonymousClass7OD A0R2 = AnonymousClass4L0.A0R(it3);
                C95814uZ r0 = A0R2.A01;
                if (r0 == null) {
                    String str5 = A0R2.A02;
                    int indexOf2 = str5.indexOf(44);
                    if (indexOf2 != -1) {
                        str5 = AnonymousClass0x7.A0r(str5, indexOf2);
                    }
                    r0 = (C95814uZ) map.get(PhoneNumberUtils.stripSeparators(str5.trim()));
                    if (r0 == null) {
                        A06 = A0R2.A02.trim();
                        A0R2.A02 = A06;
                    }
                }
                A06 = AnonymousClass36P.A06(r0);
                if (!(A06 == null || (str2 = A0R2.A02) == null || A0R2.A01 != null)) {
                    int indexOf3 = str2.indexOf(44);
                    if (indexOf3 != -1) {
                        str3 = str2.substring(indexOf3 + 1);
                    } else {
                        str3 = "";
                    }
                    String stripSeparators = PhoneNumberUtils.stripSeparators(str3.trim());
                    if (!TextUtils.isEmpty(stripSeparators)) {
                        A06 = AnonymousClass0x2.A0e(stripSeparators, AnonymousClass000.A0l(A06), ',');
                    }
                }
                A0R2.A02 = A06;
            }
            Iterator it4 = r10.A06.iterator();
            while (it4.hasNext()) {
                AnonymousClass7OD A0R3 = AnonymousClass4L0.A0R(it4);
                if (A0R3.A00 == 0 && ((str = A0R3.A03) == null || str.equalsIgnoreCase("null"))) {
                    A0R3.A03 = this.A02.A00.getString(R.string.f11nameremoved);
                }
            }
            return;
        }
        return;
        throw th;
    }

    public AnonymousClass5Y4(C64773Ex r2, C620633i r3, C54292oU r4, C620733j r5) {
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
    }

    public String A00(String str) {
        C106705a1 r0;
        C149097La A012 = C106705a1.A01(str);
        if (A012 != null) {
            Iterator it = A012.A02.iterator();
            AnonymousClass5T6 r6 = null;
            AnonymousClass5T6 r4 = null;
            AnonymousClass5T6 r3 = null;
            while (it.hasNext()) {
                AnonymousClass5T6 r2 = (AnonymousClass5T6) it.next();
                String str2 = r2.A01;
                if (!TextUtils.isEmpty(r2.A02)) {
                    if ("FN".equals(str2)) {
                        r6 = r2;
                    } else if ("NAME".equals(str2)) {
                        r4 = r2;
                    } else if ("ORG".equals(str2) && r3 == null) {
                        r3 = r2;
                    }
                }
            }
            if (r6 != null) {
                return r6.A02;
            }
            if (r4 != null) {
                return r4.A02;
            }
            if (r3 != null) {
                List list = r3.A03;
                StringBuilder A0o = AnonymousClass001.A0o();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    A0o.append(AnonymousClass001.A0m(it2));
                    if (it2.hasNext()) {
                        A0o.append(' ');
                    }
                }
                return A0o.toString();
            }
            AnonymousClass5Y4 r02 = new AnonymousClass5Y4(this.A00, this.A01, this.A02, this.A03);
            try {
                r02.A06(A012);
                r0 = r02.A04;
            } catch (C143696zK unused) {
                r0 = null;
            }
            if (r0 != null) {
                return r0.A03();
            }
        }
        return null;
    }

    public void A05(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        C149097La A012 = C106705a1.A01(str);
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (A012 != null) {
            try {
                A06(A012);
                long uptimeMillis3 = SystemClock.uptimeMillis();
                AnonymousClass7OE r2 = this.A04.A0C;
                r2.A04 = uptimeMillis2 - uptimeMillis;
                r2.A02 = uptimeMillis3 - uptimeMillis2;
                return;
            } catch (C143696zK unused) {
                Log.e("Failed to construct VCard from node.");
            }
        }
        throw new C143696zK("Invalid VCard node.");
    }
}
