package X;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LruCache;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Ex  reason: invalid class name and case insensitive filesystem */
public class C64773Ex implements C85004Eo, AnonymousClass4CK, C84444Cj, AnonymousClass491 {
    public LruCache A00;
    public final Handler A01 = AnonymousClass000.A0A();
    public final C56972sr A02;
    public final C44772Xk A03;
    public final C48452ev A04;
    public final C34461vC A05;
    public final C29421in A06;
    public final C28641hX A07;
    public final C56332ro A08;
    public final C56612sH A09;
    public final C54292oU A0A;
    public final AnonymousClass33p A0B;
    public final C620733j A0C;
    public final C29431io A0D;
    public final C620233e A0E;
    public final C55302q8 A0F;
    public final C56662sM A0G;
    public final AnonymousClass1VX A0H;
    public final AnonymousClass2ML A0I;
    public final C183538qC A0J;

    public C64773Ex(C56972sr r3, C44772Xk r4, C34461vC r5, C29421in r6, C28641hX r7, C56332ro r8, C56612sH r9, C54292oU r10, AnonymousClass33p r11, C620733j r12, C29431io r13, C620233e r14, C55302q8 r15, C56662sM r16, AnonymousClass1VX r17, AnonymousClass2ML r18, C183538qC r19) {
        C48452ev r1 = new C48452ev(C72333dY.A06(new AnonymousClass4KK(r10, 0, r12)));
        this.A09 = r9;
        this.A0H = r17;
        this.A02 = r3;
        this.A0A = r10;
        this.A0E = r14;
        this.A04 = r1;
        this.A0J = r19;
        this.A0C = r12;
        this.A06 = r6;
        this.A0D = r13;
        this.A0G = r16;
        this.A08 = r8;
        this.A03 = r4;
        this.A0B = r11;
        this.A07 = r7;
        this.A05 = r5;
        this.A0I = r18;
        this.A0F = r15;
    }

    public static void A01(C64773Ex r2, AnonymousClass5ZU r3, C95814uZ r4, Object[] objArr) {
        objArr[0] = r3.A0H(r2.A0A(r4));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.net.Uri A03(X.AnonymousClass3ZH r7, X.AnonymousClass5UR r8) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto L_0x007d
            X.2Xk r0 = r6.A03
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x007d
            X.2sr r0 = r6.A02
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x007d
            X.2k5 r0 = r7.A0F
            if (r0 == 0) goto L_0x003c
            long r1 = r0.A00
            r3 = -2
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x003c
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x003c
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI
            android.net.Uri r4 = android.content.ContentUris.withAppendedId(r0, r1)
        L_0x002b:
            if (r4 == 0) goto L_0x007d
            r3 = r6
            X.1VX r2 = r6.A0H
            r1 = 5914(0x171a, float:8.287E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0050
            monitor-enter(r3)
            goto L_0x003e
        L_0x003c:
            r4 = 0
            goto L_0x002b
        L_0x003e:
            android.util.LruCache r1 = r6.A00     // Catch:{ all -> 0x004d }
            if (r1 != 0) goto L_0x004b
            r0 = 20
            android.util.LruCache r1 = new android.util.LruCache     // Catch:{ all -> 0x004d }
            r1.<init>(r0)     // Catch:{ all -> 0x004d }
            r6.A00 = r1     // Catch:{ all -> 0x004d }
        L_0x004b:
            monitor-exit(r3)     // Catch:{ all -> 0x004d }
            goto L_0x0051
        L_0x004d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004d }
            throw r0
        L_0x0050:
            r1 = 0
        L_0x0051:
            if (r1 == 0) goto L_0x005c
            java.lang.Object r0 = r1.get(r4)
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 == 0) goto L_0x005c
        L_0x005b:
            return r0
        L_0x005c:
            if (r8 == 0) goto L_0x007d
            android.content.ContentResolver r0 = r8.A00     // Catch:{ SecurityException -> 0x0073, NullPointerException -> 0x006c }
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.getContactLookupUri(r0, r4)     // Catch:{ SecurityException -> 0x0073, NullPointerException -> 0x006c }
            if (r1 == 0) goto L_0x005b
            if (r0 == 0) goto L_0x005b
            r1.put(r4, r0)     // Catch:{ SecurityException -> 0x0073, NullPointerException -> 0x006c }
            return r0
        L_0x006c:
            r1 = move-exception
            java.lang.String r0 = "contactmanager/NPE"
            com.whatsapp.util.Log.w(r0, r1)
            return r5
        L_0x0073:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contactmanager/permission problem:"
            X.C18260x0.A1S(r1, r0, r2)
        L_0x007d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64773Ex.A03(X.3ZH, X.5UR):android.net.Uri");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0098, code lost:
        if (r2 == null) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3ZH A0C(java.lang.String r13) {
        /*
            r12 = this;
            r11 = 0
            if (r13 != 0) goto L_0x0004
            return r11
        L_0x0004:
            java.lang.String r0 = r13.trim()
            java.lang.String r6 = android.telephony.PhoneNumberUtils.stripSeparators(r0)
            int r0 = r6.length()
            if (r0 <= 0) goto L_0x0022
            r0 = 0
            char r0 = r6.charAt(r0)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 != 0) goto L_0x0022
            r0 = 1
            java.lang.String r6 = r6.substring(r0)
        L_0x0022:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0029
            return r11
        L_0x0029:
            X.1vC r7 = r12.A05
            r10 = r6
            X.33M r4 = X.AnonymousClass33M.A00()
            int r2 = r6.length()
            r0 = 5
            if (r2 < r0) goto L_0x0051
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "%"
            r1.append(r0)
            r0 = 5
            if (r2 <= r0) goto L_0x004d
            int r2 = r2 - r0
            r0 = 3
            int r0 = java.lang.Math.min(r2, r0)
            java.lang.String r10 = r6.substring(r0)
        L_0x004d:
            java.lang.String r10 = X.AnonymousClass000.A0X(r10, r1)
        L_0x0051:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            r5 = 0
            X.4GK r8 = X.C18630y0.A03(r7)     // Catch:{ IllegalStateException -> 0x00ad }
            java.lang.String r9 = X.C58142um.A05     // Catch:{ all -> 0x00a3 }
            java.lang.String[] r2 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x00a3 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r10)     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = "@"
            r1.append(r0)     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = "s.whatsapp.net"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x00a3 }
            r2[r5] = r0     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = "GET_CONTACTS_BY_JID_PATTERN"
            android.database.Cursor r2 = X.AnonymousClass361.A0A(r8, r9, r0, r2)     // Catch:{ all -> 0x00a3 }
            int r5 = r2.getCount()     // Catch:{ all -> 0x0097 }
            java.util.ArrayList r3 = X.AnonymousClass002.A0I(r5)     // Catch:{ all -> 0x0097 }
        L_0x0080:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x008e
            X.3ZH r0 = X.AnonymousClass25S.A00(r2)     // Catch:{ all -> 0x0095 }
            r3.add(r0)     // Catch:{ all -> 0x0095 }
            goto L_0x0080
        L_0x008e:
            r2.close()     // Catch:{ all -> 0x00a3 }
            r8.close()     // Catch:{ IllegalStateException -> 0x00ad }
            goto L_0x00b3
        L_0x0095:
            r1 = move-exception
            goto L_0x009a
        L_0x0097:
            r1 = move-exception
            if (r2 == 0) goto L_0x00a2
        L_0x009a:
            r2.close()     // Catch:{ all -> 0x009e }
            goto L_0x00a2
        L_0x009e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00a3 }
        L_0x00a2:
            throw r1     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x00a8 }
            goto L_0x00ac
        L_0x00a8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalStateException -> 0x00ad }
        L_0x00ac:
            throw r1     // Catch:{ IllegalStateException -> 0x00ad }
        L_0x00ad:
            r1 = move-exception
            java.lang.String r0 = "contactmanagerdb/getContactsByPhoneNumberLoose/"
            X.C34461vC.A05(r1, r0, r3, r5)     // Catch:{ all -> 0x00f0 }
        L_0x00b3:
            r7.A0S(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contact-mgr-db/getContactsByPhoneNumberLoose/fetched "
            X.C18260x0.A19(r0, r1, r3)
            java.lang.String r0 = " | time: "
            X.AnonymousClass33M.A04(r4, r0, r1)
            java.util.Iterator r5 = r3.iterator()
            r4 = 0
            r3 = r11
        L_0x00ca:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00eb
            X.3ZH r2 = X.C18310x6.A0R(r5)
            com.whatsapp.jid.Jid r1 = X.AnonymousClass3ZH.A03(r2)
            if (r1 == 0) goto L_0x00ca
            boolean r0 = r2.A10
            if (r0 == 0) goto L_0x00ca
            java.lang.String r0 = r1.user
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00e7
            return r2
        L_0x00e7:
            int r4 = r4 + 1
            r3 = r2
            goto L_0x00ca
        L_0x00eb:
            r0 = 1
            if (r4 != r0) goto L_0x00ef
            return r3
        L_0x00ef:
            return r11
        L_0x00f0:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64773Ex.A0C(java.lang.String):X.3ZH");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0067, code lost:
        if (r6 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0072, code lost:
        r1 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:28:0x005c, B:36:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3ZH A04(long r10) {
        /*
            r9 = this;
            X.2ev r4 = r9.A04
            X.8qC r3 = r4.A00
            r3.get()
            r1 = -2
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0016
            java.lang.Object r3 = r3.get()
            X.3ZH r3 = (X.AnonymousClass3ZH) r3
            if (r3 == 0) goto L_0x0032
            return r3
        L_0x0016:
            java.util.Map r5 = r4.A01
            monitor-enter(r5)
            java.util.Iterator r4 = X.AnonymousClass001.A0v(r5)     // Catch:{ all -> 0x00b7 }
        L_0x001d:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x00b7 }
            if (r0 == 0) goto L_0x0031
            X.3ZH r3 = X.C18310x6.A0R(r4)     // Catch:{ all -> 0x00b7 }
            long r1 = r3.A0F()     // Catch:{ all -> 0x00b7 }
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001d
            monitor-exit(r5)     // Catch:{ all -> 0x00b7 }
            return r3
        L_0x0031:
            monitor-exit(r5)     // Catch:{ all -> 0x00b7 }
        L_0x0032:
            X.1vC r5 = r9.A05
            X.33M r2 = X.AnonymousClass33M.A00()
            r4 = 0
            r3 = 0
            X.4GK r8 = X.C18630y0.A03(r5)     // Catch:{ IllegalStateException -> 0x0081 }
            java.lang.String r6 = X.C58142um.A07     // Catch:{ all -> 0x0074 }
            r7 = 1
            java.lang.String[] r1 = new java.lang.String[r7]     // Catch:{ all -> 0x0074 }
            X.AnonymousClass0x2.A1S(r1, r4, r10)     // Catch:{ all -> 0x0074 }
            java.lang.String r0 = "CONTACT"
            android.database.Cursor r6 = X.AnonymousClass361.A0A(r8, r6, r0, r1)     // Catch:{ all -> 0x0074 }
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0057
            X.3ZH r3 = X.AnonymousClass25S.A00(r6)     // Catch:{ all -> 0x0065 }
            goto L_0x0058
        L_0x0057:
            r7 = 0
        L_0x0058:
            int r4 = r6.getCount()     // Catch:{ all -> 0x0063 }
            r6.close()     // Catch:{ all -> 0x0072 }
            r8.close()     // Catch:{ IllegalStateException -> 0x007f }
            goto L_0x0088
        L_0x0063:
            r1 = move-exception
            goto L_0x0069
        L_0x0065:
            r1 = move-exception
            r7 = 0
            if (r6 == 0) goto L_0x0071
        L_0x0069:
            r6.close()     // Catch:{ all -> 0x006d }
            goto L_0x0071
        L_0x006d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0072 }
        L_0x0071:
            throw r1     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r1 = move-exception
            goto L_0x0076
        L_0x0074:
            r1 = move-exception
            r7 = 0
        L_0x0076:
            r8.close()     // Catch:{ all -> 0x007a }
            goto L_0x007e
        L_0x007a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalStateException -> 0x007f }
        L_0x007e:
            throw r1     // Catch:{ IllegalStateException -> 0x007f }
        L_0x007f:
            r1 = move-exception
            goto L_0x0083
        L_0x0081:
            r1 = move-exception
            r7 = 0
        L_0x0083:
            java.lang.String r0 = "contactmanagerdb/getContactById/"
            X.C34461vC.A04(r1, r0, r4, r7)     // Catch:{ all -> 0x00b5 }
        L_0x0088:
            if (r3 == 0) goto L_0x0093
            X.33j r0 = r5.A06
            java.util.Locale r0 = X.C620733j.A02(r0)
            r5.A0P(r3, r0)
        L_0x0093:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "fetched "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " contacts by id="
            r1.append(r0)
            r1.append(r10)
            r0 = 32
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " | time: "
            X.AnonymousClass33M.A04(r2, r0, r1)
            return r3
        L_0x00b5:
            r0 = move-exception
            throw r0
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64773Ex.A04(long):X.3ZH");
    }

    public AnonymousClass3ZH A05(AnonymousClass1fI r22, String str, String str2, long j) {
        AnonymousClass3ZH r1 = new AnonymousClass3ZH(r22);
        A0T(r1, (UserJid) null, C60912zN.A05, str, str2, 0, 0, j, false, false, false, false, false, false, false, false, false, false, false);
        return r1;
    }

    public AnonymousClass3ZH A06(C95814uZ r3) {
        C56972sr r1 = this.A02;
        if (r1.A0a(r3)) {
            return C56972sr.A01(r1);
        }
        boolean z = r3 instanceof C135216kJ;
        C48452ev r0 = this.A04;
        if (z) {
            return (AnonymousClass3ZH) r0.A00.get();
        }
        return r0.A01(r3);
    }

    public AnonymousClass3ZH A07(C95814uZ r3) {
        C56972sr r1 = this.A02;
        if (r1.A0a(r3)) {
            return C56972sr.A01(r1);
        }
        return A0B(r3, false);
    }

    public AnonymousClass3ZH A08(C95814uZ r3) {
        C56972sr r1 = this.A02;
        if (r1.A0a(r3)) {
            return C56972sr.A01(r1);
        }
        return this.A04.A01(r3);
    }

    public AnonymousClass3ZH A09(C95814uZ r5) {
        C48452ev r1 = this.A04;
        AnonymousClass3ZH A012 = r1.A01(r5);
        if (A012 == null) {
            A012 = this.A05.A0B(r5);
            A0S(A012, r5);
            if (A012 != null) {
                Class<C95814uZ> cls = C95814uZ.class;
                if (A012.A0I(cls) != null) {
                    r1.A01.put(AnonymousClass3ZH.A05(A012, cls), A012);
                }
            }
        }
        return A012;
    }

    public AnonymousClass3ZH A0B(C95814uZ r2, boolean z) {
        if (r2 == null) {
            return null;
        }
        if (r2 instanceof C135216kJ) {
            return (AnonymousClass3ZH) this.A04.A00.get();
        }
        if (z) {
            C48452ev.A00(this, r2);
        }
        return A09(r2);
    }

    public UserJid A0D(GroupJid groupJid) {
        UserJid userJid;
        String str;
        int indexOf;
        String A0r;
        AnonymousClass3ZH A072;
        if (groupJid == null || (A072 = A07(groupJid)) == null || (userJid = A072.A0I) == null) {
            userJid = null;
            if (!(groupJid == null || (str = groupJid.user) == null || (indexOf = str.indexOf("-")) == -1 || (A0r = AnonymousClass0x7.A0r(str, indexOf)) == null)) {
                try {
                    StringBuilder A0l = AnonymousClass000.A0l(A0r);
                    A0l.append("@");
                    return AnonymousClass32Y.A0A(AnonymousClass000.A0X("s.whatsapp.net", A0l));
                } catch (AnonymousClass24P unused) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("jids/failed to get group creator jid from group jid: ");
                    C18260x0.A1M(A0o, groupJid.getRawString());
                    return null;
                }
            }
        }
        return userJid;
    }

    public ArrayList A0E() {
        int count;
        C34461vC r7 = this.A05;
        AnonymousClass33M A002 = AnonymousClass33M.A00();
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass4GK A032 = C18630y0.A03(r7);
        try {
            Cursor A092 = AnonymousClass361.A09(A032, C58142um.A00, "GET_ALL_DB_CONTACTS");
            try {
                count = A092.getCount();
                C18260x0.A0w("contact-mgr-db/getAllDBContacts/cursor count=", AnonymousClass001.A0o(), count);
                while (A092.moveToNext()) {
                    A0s.add(AnonymousClass25S.A00(A092));
                }
            } catch (IllegalStateException e) {
                C34461vC.A05(e, "contactmanagerdb/getAllDBContacts/", A0s, count);
            } catch (Throwable th) {
                if (A092 != null) {
                    A092.close();
                }
                throw th;
            }
            A092.close();
            A032.close();
            r7.A0S(A0s);
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A19("returned ", A0o, A0s);
            AnonymousClass33M.A04(A002, " db contacts | time: ", A0o);
            return A0s;
        } catch (Throwable th2) {
            try {
                A032.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public ArrayList A0F() {
        Cursor A0A2;
        C34461vC r5 = this.A05;
        AnonymousClass33M A022 = AnonymousClass33M.A02(true);
        ArrayList A0s = AnonymousClass001.A0s();
        String A072 = C627336j.A07(C56972sr.A04(r5.A03));
        String[] strArr = new String[1];
        if (A072 == null) {
            A072 = C135206kI.A00.getRawString();
        }
        int i = 0;
        strArr[0] = A072;
        try {
            AnonymousClass4GK A032 = C18630y0.A03(r5);
            try {
                A0A2 = AnonymousClass361.A0A(A032, C58142um.A02, "CONTACT", strArr);
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A1F(A0o, AnonymousClass0x9.A02(A0A2, "contact-mgr-db/getAllIndividualContacts/cursor count=", A0o));
                i = A0A2.getCount();
                while (A0A2.moveToNext()) {
                    A0s.add(AnonymousClass25S.A00(A0A2));
                }
                A0A2.close();
                A032.close();
            } catch (Throwable th) {
                A032.close();
                throw th;
            }
        } catch (IllegalStateException e) {
            C34461vC.A05(e, "contactmanagerdb/getAllIndividualContacts/", A0s, i);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        r5.A0S(A0s);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        C18260x0.A19("returned ", A0o2, A0s);
        AnonymousClass33M.A04(A022, " individual contacts | time: ", A0o2);
        return A0s;
        throw th;
    }

    public void A0L(AnonymousClass3ZH r13) {
        C69833Yo Axl;
        C34461vC r6 = this.A05;
        ContentValues A072 = AnonymousClass0x9.A07(5);
        A072.put("given_name", (String) null);
        A072.put("display_name", (String) null);
        A072.put("raw_contact_id", AnonymousClass0x7.A0f());
        A072.put("sync_policy", 2);
        boolean z = false;
        A072.put("is_contact_synced", 0);
        try {
            C85284Fq A073 = C18630y0.A07(r6);
            try {
                Axl = A073.Axl();
                String[] A1Y = AnonymousClass0x9.A1Y();
                AnonymousClass0x2.A1S(A1Y, 0, r13.A0F());
                if (AnonymousClass361.A07(A072, A073, "wa_contacts", "wa_contacts._id = ?", A1Y) == 1) {
                    z = true;
                }
                Axl.A00();
                Axl.close();
                A073.close();
            } catch (Throwable th) {
                A073.close();
                throw th;
            }
        } catch (IllegalArgumentException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass3ZH.A0C(r13, "contact-mgr-db/unable to remove contact ", A0o);
            C626936e.A08(A0o.toString(), e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        r13.A0P = null;
        r13.A0R = null;
        r13.A0F = new C51602k5(-1, r13.A0F.A01);
        r13.A07 = 2;
        if (r13.A0G != null) {
            r13.A0G = null;
        }
        if (z) {
            C34461vC.A00(r6).A09(Collections.singleton(r13));
        }
        C48452ev r0 = this.A04;
        r0.A01.remove(r13.A0H);
        return;
        throw th;
    }

    public void A0M(AnonymousClass3ZH r6) {
        C34461vC r2 = this.A05;
        AnonymousClass33M A022 = AnonymousClass33M.A02(true);
        ContentValues A072 = AnonymousClass0x9.A07(1);
        A072.put("status_autodownload_disabled", Integer.valueOf(r6.A15 ? 1 : 0));
        r2.A0G(A072, r6.A0H);
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass3ZH.A0C(r6, "updated contact status autodownload jid=", A0o);
        A0o.append(' ');
        A0o.append(A072);
        A0o.append(" | time: ");
        C18260x0.A1I(A0o, A022.A06());
    }

    public void A0N(AnonymousClass3ZH r6) {
        C34461vC r4 = this.A05;
        AnonymousClass33M A022 = AnonymousClass33M.A02(true);
        ContentValues A072 = AnonymousClass0x9.A07(1);
        A072.put("wa_name", r6.A0b);
        r4.A0G(A072, r6.A0H);
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass3ZH.A0C(r6, "updated whatsapp name for contact jid=", A0o);
        A0o.append("");
        A0o.append(" | time: ");
        C18260x0.A1I(A0o, A022.A06());
        this.A04.A02(r6);
        A0K();
        C70193a6.A00(this.A01, this, r6, 45);
    }

    public void A0P(AnonymousClass3ZH r6) {
        C34461vC r2 = this.A05;
        AnonymousClass33M A002 = AnonymousClass33M.A00();
        ContentValues A0E2 = C18290x4.A0E();
        A0E2.put("photo_ts", Integer.valueOf(r6.A05));
        A0E2.put("thumb_ts", Integer.valueOf(r6.A06));
        A0E2.put("photo_id_timestamp", Long.valueOf(r6.A0C));
        r2.A0G(A0E2, r6.A0H);
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass3ZH.A0C(r6, "updated photo id for contact jid=", A0o);
        A0o.append(' ');
        A0o.append(A0E2);
        A0o.append(" | time: ");
        C18260x0.A1I(A0o, A002.A06());
        this.A04.A02(r6);
    }

    public void A0Q(AnonymousClass3ZH r4, C95814uZ r5) {
        C34461vC r2 = this.A05;
        AnonymousClass3ZH A0B2 = r2.A0B(r5);
        A0B2.A0P = r4.A0J();
        A0B2.A0R = r4.A0R;
        A0B2.A0Q = r4.A0Q;
        r2.A0K(A0B2);
        C70193a6.A00(this.A01, this, r5, 40);
    }

    public final void A0R(AnonymousClass3ZH r4, C95814uZ r5) {
        String str;
        if (r4 != null && (r5 instanceof AnonymousClass1fU)) {
            AnonymousClass2ML r1 = this.A0I;
            if (!r4.A0o || !r1.A01.A0Y(C58422vE.A02, 3519)) {
                if (!(r5 instanceof C135146kC)) {
                    if (r5 instanceof C27981fH) {
                        PhoneUserJid A022 = this.A0G.A02((C27981fH) r5);
                        if (A022 != null) {
                            AnonymousClass3ZH A072 = A07(A022);
                            if (A072 == null || !A072.A0Q()) {
                                str = AnonymousClass36P.A07(A022.user);
                                r4.A0P = str;
                            }
                            r4.A0P = A072.A0J();
                            r4.A0G = A072;
                            return;
                        }
                    } else {
                        return;
                    }
                }
                str = this.A0F.A00((AnonymousClass1fU) r5);
                if (str == null) {
                    if (!C107575bX.A0F(r4.A0b)) {
                        str = r4.A0b;
                    } else {
                        str = C54292oU.A00(this.A0A).getString(R.string.f11nameremoved);
                    }
                }
                r4.A0P = str;
            }
        }
    }

    public void A0T(AnonymousClass3ZH r7, UserJid userJid, C60912zN r9, String str, String str2, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        C85284Fq A072;
        Log.i("addGroupChatContact");
        r7.A0P = str;
        r7.A0V = Long.toString(j);
        r7.A0j = z;
        r7.A14 = z2;
        r7.A0e = z3;
        r7.A12 = z4;
        r7.A02 = i;
        r7.A0I = userJid;
        r7.A0s = z5;
        r7.A0O(r9);
        r7.A0k = z6;
        r7.A04 = i2;
        r7.A13 = z7;
        r7.A0M = str2;
        r7.A0q = z8;
        r7.A0d = z9;
        r7.A0i = z10;
        r7.A0f = z11;
        C34461vC r4 = this.A05;
        AnonymousClass33M A002 = AnonymousClass33M.A00();
        C95814uZ r1 = r7.A0H;
        if (r1 == null) {
            Log.w("contact-mgr-db/unable to add group chat with null jid");
            return;
        }
        ContentValues A062 = AnonymousClass0x9.A06();
        AnonymousClass0x2.A0n(A062, r1, "jid");
        A062.put("is_whatsapp_user", Boolean.TRUE);
        A062.put("status", r7.A0X);
        A062.put("status_timestamp", Long.valueOf(r7.A0D));
        AnonymousClass3ZH.A0A(A062, r7);
        A062.put("phone_label", r7.A0V);
        A062.put("history_sync_initial_phash", r7.A0S);
        try {
            A072 = C18630y0.A07(r4);
            r7.A0N(AnonymousClass361.A06(A062, A072, "wa_contacts"));
            r4.A0O(r7, (C28011fL) r7.A0I(C28011fL.class));
            A072.close();
        } catch (IllegalArgumentException e) {
            C626936e.A08(AnonymousClass000.A0P(r7, "contact-mgr-db/unable to add group chat ", AnonymousClass001.A0o()), e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("contact-mgr-db/group chat added: ");
        A0o.append(r7);
        AnonymousClass33M.A04(A002, " | time: ", A0o);
        return;
        throw th;
    }

    public void A0U(AnonymousClass1fU r3) {
        A0R(this.A04.A01(r3), r3);
        C70193a6.A00(this.A01, this, r3, 46);
    }

    public void A0X(UserJid userJid, int i, long j) {
        C85284Fq A072;
        C34461vC r4 = this.A05;
        long j2 = (long) i;
        ContentValues A073 = AnonymousClass0x9.A07(1);
        C18270x1.A0c(A073, "disappearing_mode_duration", j2);
        C18270x1.A0c(A073, "disappearing_mode_timestamp", j);
        try {
            A072 = C18630y0.A07(r4);
            String A074 = C627336j.A07(userJid);
            C626936e.A06(A074);
            AnonymousClass361.A07(A073, A072, "wa_contacts", "jid = ?", new String[]{A074});
            A072.close();
        } catch (IllegalArgumentException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("contact-mgr-db/unable to update disappearing_mode_duration state  ");
            A0o.append(userJid);
            C626936e.A08(AnonymousClass000.A0Z(", ", A0o, j2), e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        C48452ev.A00(this, userJid);
        A0K();
        return;
        throw th;
    }

    public void A0Y(UserJid userJid, String str, long j) {
        this.A05.A0Q(userJid, str, j);
        C48452ev.A00(this, userJid);
        C70193a6.A00(this.A01, this, userJid, 44);
    }

    public void A0Z(UserJid userJid, String str, String str2, long j) {
        C85284Fq A072;
        C34461vC r1 = this.A05;
        AnonymousClass33M A002 = AnonymousClass33M.A00();
        ContentValues A0E2 = C18290x4.A0E();
        A0E2.put("status", str);
        C18270x1.A0c(A0E2, "status_timestamp", j);
        A0E2.put("status_emoji", str2);
        try {
            A072 = C18630y0.A07(r1);
            AnonymousClass361.A07(A0E2, A072, "wa_contacts", "jid = ?", C18270x1.A1a(userJid));
            A072.close();
        } catch (IllegalArgumentException e) {
            C626936e.A08(AnonymousClass000.A0P(userJid, "contact-mgr-db/unable to update contact text status ", AnonymousClass001.A0o()), e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("contact-mgr-db/updated contact text status jid=");
        A0o.append(userJid);
        AnonymousClass33M.A04(A002, " | time: ", A0o);
        C48452ev.A00(this, userJid);
        C70193a6.A00(this.A01, this, userJid, 48);
        return;
        throw th;
    }

    public void A0a(UserJid userJid, boolean z) {
        C85284Fq A072;
        C34461vC r1 = this.A05;
        ContentValues A073 = AnonymousClass0x9.A07(1);
        AnonymousClass0x2.A0o(A073, "is_sidelist_synced", z);
        try {
            A072 = C18630y0.A07(r1);
            String[] strArr = new String[1];
            C18280x3.A0v(userJid, strArr);
            AnonymousClass361.A07(A073, A072, "wa_contacts", "jid = ?", strArr);
            A072.close();
        } catch (IllegalArgumentException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("contact-mgr-db/unable to update contact sidelist sync ");
            A0o.append(userJid);
            C626936e.A08(AnonymousClass000.A0b(", ", A0o, z), e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        C48452ev.A00(this, userJid);
        return;
        throw th;
    }

    public void A0b(ArrayList arrayList) {
        this.A05.A0U(arrayList, 1, false, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0217, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0220, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0c(java.util.Collection r18) {
        /*
            r17 = this;
            r0 = r17
            X.1vC r7 = r0.A05
            r3 = r18
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = "contact-mgr-db/add contacts called without any contacts"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0012:
            X.33M r4 = X.AnonymousClass33M.A00()
            android.content.ContentValues r8 = X.AnonymousClass0x9.A06()
            X.1RI r10 = r7.A00     // Catch:{ IllegalArgumentException -> 0x022b }
            X.4Fq r5 = r10.A0C()     // Catch:{ IllegalArgumentException -> 0x022b }
            X.3Yo r6 = r5.Axl()     // Catch:{ all -> 0x0221 }
            java.util.Iterator r16 = r3.iterator()     // Catch:{ all -> 0x0217 }
        L_0x0028:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x010a
            X.3ZH r9 = X.C18310x6.A0R(r16)     // Catch:{ all -> 0x0217 }
            X.4uZ r0 = X.AnonymousClass3ZH.A01(r9)     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x0028
            java.util.ArrayList r0 = r7.A0D(r0)     // Catch:{ all -> 0x0217 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x0217 }
        L_0x0040:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x0066
            X.3ZH r11 = X.C18310x6.A0R(r12)     // Catch:{ all -> 0x0217 }
            boolean r0 = r7.A0V(r11)     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x0062
            X.2k5 r2 = r9.A0F     // Catch:{ all -> 0x0217 }
            if (r2 == 0) goto L_0x0040
            X.2k5 r0 = r11.A0F     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x0040
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x0217 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x0040
        L_0x0062:
            r7.A0H(r6, r11, r5)     // Catch:{ all -> 0x0217 }
            goto L_0x0040
        L_0x0066:
            X.1VX r2 = r7.A07     // Catch:{ all -> 0x0217 }
            r1 = 5868(0x16ec, float:8.223E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x0217 }
            boolean r0 = r2.A0Y(r0, r1)     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x0028
            X.2k5 r13 = r9.A0F     // Catch:{ all -> 0x0217 }
            long r0 = r13.A00     // Catch:{ all -> 0x0217 }
            r11 = -5
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0028
            java.lang.String r15 = r13.A01     // Catch:{ all -> 0x0217 }
            r0 = 1
            X.33M r11 = X.AnonymousClass33M.A02(r0)     // Catch:{ all -> 0x0217 }
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0217 }
            r12 = 0
            X.4GK r13 = r10.get()     // Catch:{ IllegalStateException -> 0x00cd }
            java.lang.String r14 = X.C58142um.A06     // Catch:{ all -> 0x00c3 }
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x00c3 }
            r1[r12] = r15     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "CONTACTS-BY-NUMBER"
            android.database.Cursor r14 = X.AnonymousClass361.A0A(r13, r14, r0, r1)     // Catch:{ all -> 0x00c3 }
            int r12 = r14.getCount()     // Catch:{ all -> 0x00b7 }
            java.util.ArrayList r2 = X.AnonymousClass002.A0I(r12)     // Catch:{ all -> 0x00b7 }
        L_0x00a0:
            boolean r0 = r14.moveToNext()     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x00ae
            X.3ZH r0 = X.AnonymousClass25S.A00(r14)     // Catch:{ all -> 0x00b5 }
            r2.add(r0)     // Catch:{ all -> 0x00b5 }
            goto L_0x00a0
        L_0x00ae:
            r14.close()     // Catch:{ all -> 0x00c3 }
            r13.close()     // Catch:{ IllegalStateException -> 0x00cd }
            goto L_0x00d3
        L_0x00b5:
            r1 = move-exception
            goto L_0x00ba
        L_0x00b7:
            r1 = move-exception
            if (r14 == 0) goto L_0x00c2
        L_0x00ba:
            r14.close()     // Catch:{ all -> 0x00be }
            goto L_0x00c2
        L_0x00be:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00c3 }
        L_0x00c2:
            throw r1     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x00c8 }
            goto L_0x00cc
        L_0x00c8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalStateException -> 0x00cd }
        L_0x00cc:
            throw r1     // Catch:{ IllegalStateException -> 0x00cd }
        L_0x00cd:
            r1 = move-exception
            java.lang.String r0 = "contactmanagerdb/getContactsByPhoneNumberLoose/"
            X.C34461vC.A05(r1, r0, r2, r12)     // Catch:{ all -> 0x0108 }
        L_0x00d3:
            r7.A0S(r2)     // Catch:{ all -> 0x0217 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = "contact-mgr-db/getContactsByPhoneNumberStrict/fetched "
            X.C18260x0.A19(r0, r1, r2)     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = " | time: "
            X.AnonymousClass33M.A04(r11, r0, r1)     // Catch:{ all -> 0x0217 }
            java.util.Iterator r11 = r2.iterator()     // Catch:{ all -> 0x0217 }
        L_0x00e8:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x0028
            X.3ZH r2 = X.C18310x6.A0R(r11)     // Catch:{ all -> 0x0217 }
            java.lang.String r1 = r2.A0J()     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = r9.A0J()     // Catch:{ all -> 0x0217 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x00e8
            boolean r0 = r2.A0l     // Catch:{ all -> 0x0217 }
            if (r0 != 0) goto L_0x00e8
            r7.A0H(r6, r2, r5)     // Catch:{ all -> 0x0217 }
            goto L_0x00e8
        L_0x0108:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0217 }
        L_0x010a:
            java.util.Iterator r12 = r3.iterator()     // Catch:{ all -> 0x0217 }
            r2 = 0
        L_0x010f:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x01ee
            X.3ZH r9 = X.C18310x6.A0R(r12)     // Catch:{ all -> 0x0217 }
            X.4uZ r1 = r9.A0H     // Catch:{ all -> 0x0217 }
            if (r1 != 0) goto L_0x0127
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = "contact-mgr-db/skipped adding contact due to empty jid: "
            X.C18260x0.A1R(r1, r0, r9)     // Catch:{ all -> 0x0217 }
            goto L_0x010f
        L_0x0127:
            boolean r0 = r9.A10     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x012d
            int r2 = r2 + 1
        L_0x012d:
            X.2k5 r11 = r9.A0F     // Catch:{ all -> 0x0217 }
            java.lang.String r1 = r1.getRawString()     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = "jid"
            r8.put(r0, r1)     // Catch:{ all -> 0x0217 }
            java.lang.String r1 = "is_whatsapp_user"
            boolean r0 = r9.A10     // Catch:{ all -> 0x0217 }
            X.AnonymousClass0x2.A0o(r8, r1, r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r1 = "status"
            java.lang.String r0 = r9.A0X     // Catch:{ all -> 0x0217 }
            r8.put(r1, r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r10 = "status_timestamp"
            long r0 = r9.A0D     // Catch:{ all -> 0x0217 }
            X.C18270x1.A0c(r8, r10, r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r10 = "number"
            r1 = 0
            if (r11 == 0) goto L_0x01b7
            java.lang.String r0 = r11.A01     // Catch:{ all -> 0x0217 }
        L_0x0157:
            r8.put(r10, r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r10 = "raw_contact_id"
            if (r11 == 0) goto L_0x0165
            long r0 = r11.A00     // Catch:{ all -> 0x0217 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0217 }
        L_0x0165:
            r8.put(r10, r1)     // Catch:{ all -> 0x0217 }
            X.AnonymousClass3ZH.A0A(r8, r9)     // Catch:{ all -> 0x0217 }
            java.lang.String r1 = "phone_type"
            java.lang.Integer r0 = r9.A0L     // Catch:{ all -> 0x0217 }
            r8.put(r1, r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r1 = "phone_label"
            java.lang.String r0 = r9.A0V     // Catch:{ all -> 0x0217 }
            r8.put(r1, r0)     // Catch:{ all -> 0x0217 }
            X.AnonymousClass3ZH.A0B(r8, r9)     // Catch:{ all -> 0x0217 }
            java.lang.String r1 = "sort_name"
            java.lang.String r0 = r9.A0W     // Catch:{ all -> 0x0217 }
            r8.put(r1, r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r1 = "nickname"
            java.lang.String r0 = r9.A0U     // Catch:{ all -> 0x0217 }
            r8.put(r1, r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r1 = "company"
            java.lang.String r0 = r9.A0O     // Catch:{ all -> 0x0217 }
            r8.put(r1, r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r1 = "title"
            java.lang.String r0 = r9.A0Z     // Catch:{ all -> 0x0217 }
            r8.put(r1, r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r1 = "is_spam_reported"
            boolean r0 = r9.A0x     // Catch:{ all -> 0x0217 }
            X.AnonymousClass0x2.A0o(r8, r1, r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r1 = "status_emoji"
            java.lang.String r0 = r9.A0Y     // Catch:{ all -> 0x0217 }
            r8.put(r1, r0)     // Catch:{ all -> 0x0217 }
            X.1VX r10 = r7.A07     // Catch:{ all -> 0x0217 }
            r1 = 5868(0x16ec, float:8.223E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x0217 }
            boolean r0 = r10.A0Y(r0, r1)     // Catch:{ all -> 0x0217 }
            goto L_0x01b9
        L_0x01b7:
            r0 = r1
            goto L_0x0157
        L_0x01b9:
            if (r0 == 0) goto L_0x01d5
            java.lang.String r1 = "sync_policy"
            int r0 = r9.A07     // Catch:{ all -> 0x0217 }
            X.C18270x1.A0b(r8, r1, r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r1 = "is_wa_created_contact"
            boolean r0 = r9.A0t     // Catch:{ all -> 0x0217 }
            X.AnonymousClass0x2.A0o(r8, r1, r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r1 = "is_contact_synced"
            boolean r0 = r9.A0l     // Catch:{ all -> 0x0217 }
            boolean r0 = X.AnonymousClass000.A1S(r0)
            X.C18270x1.A0b(r8, r1, r0)     // Catch:{ all -> 0x0217 }
        L_0x01d5:
            java.lang.String r0 = "wa_contacts"
            X.AnonymousClass361.A06(r8, r5, r0)     // Catch:{ all -> 0x0217 }
            X.4uZ r0 = r9.A0H     // Catch:{ all -> 0x0217 }
            boolean r0 = r0 instanceof X.C27991fJ     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x010f
            com.whatsapp.jid.Jid r1 = X.AnonymousClass3ZH.A04(r9)     // Catch:{ all -> 0x0217 }
            X.1fL r1 = (X.C28011fL) r1     // Catch:{ all -> 0x0217 }
            X.2zN r0 = r9.A0K     // Catch:{ all -> 0x0217 }
            r7.A07(r6, r5, r1, r0)     // Catch:{ all -> 0x0217 }
            goto L_0x010f
        L_0x01ee:
            r6.A00()     // Catch:{ all -> 0x0217 }
            r1 = 1
            X.3a7 r0 = new X.3a7     // Catch:{ all -> 0x0217 }
            r0.<init>(r7, r1, r3)     // Catch:{ all -> 0x0217 }
            r5.B25(r0)     // Catch:{ all -> 0x0217 }
            r6.close()     // Catch:{ all -> 0x0221 }
            r5.close()     // Catch:{ IllegalArgumentException -> 0x022b }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contact-mgr-db/addContacts/size="
            X.C18290x4.A1O(r0, r1, r3)
            java.lang.String r0 = " contacts ("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " whatsapp) | time: "
            X.AnonymousClass33M.A04(r4, r0, r1)
            return
        L_0x0217:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x021c }
            goto L_0x0220
        L_0x021c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0221 }
        L_0x0220:
            throw r1     // Catch:{ all -> 0x0221 }
        L_0x0221:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0226 }
            goto L_0x022a
        L_0x0226:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalArgumentException -> 0x022b }
        L_0x022a:
            throw r1     // Catch:{ IllegalArgumentException -> 0x022b }
        L_0x022b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contact-mgr-db/unable to add "
            X.C18290x4.A1O(r0, r1, r3)
            java.lang.String r0 = " contacts "
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.C626936e.A08(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64773Ex.A0c(java.util.Collection):void");
    }

    public void A0e(Collection collection) {
        AnonymousClass3ZH r2;
        C69833Yo Axl;
        C34461vC r1 = this.A05;
        if (!collection.isEmpty()) {
            AnonymousClass33M A022 = AnonymousClass33M.A02(true);
            ContentValues A072 = AnonymousClass0x9.A07(1);
            try {
                C85284Fq A073 = C18630y0.A07(r1);
                try {
                    Axl = A073.Axl();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        AnonymousClass3ZH A0R = C18310x6.A0R(it);
                        C95814uZ r22 = A0R.A0H;
                        if (r22 == null) {
                            C18260x0.A1R(AnonymousClass001.A0o(), "contact-mgr-db/update contact skipped for jid=", r22);
                        } else {
                            C18270x1.A0c(A072, "keep_timestamp", A0R.A0B);
                            String[] strArr = new String[1];
                            AnonymousClass0x2.A1S(strArr, 0, A0R.A0F());
                            AnonymousClass361.A07(A072, A073, "wa_contacts", "_id = ?", strArr);
                        }
                    }
                    Axl.A00();
                    Axl.close();
                    A073.close();
                } catch (Throwable th) {
                    A073.close();
                    throw th;
                }
            } catch (IllegalArgumentException e) {
                C626936e.A08("contact-mgr-db/unable to update keep timestamp ", e);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("updated ");
            A0o.append(0);
            C18290x4.A1O(" contacts from a list of ", A0o, collection);
            AnonymousClass33M.A04(A022, " contacts | time: ", A0o);
        }
        C48452ev r5 = this.A04;
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            AnonymousClass3ZH A0R2 = C18310x6.A0R(it2);
            Jid A0I2 = A0R2.A0I(C95814uZ.class);
            if (!(A0I2 == null || (r2 = (AnonymousClass3ZH) r5.A01.get(A0I2)) == null)) {
                r2.A0B = A0R2.A0B;
            }
        }
        return;
        throw th;
    }

    public void A0f(Collection collection) {
        C69833Yo Axm;
        String str;
        C34461vC r9 = this.A05;
        AnonymousClass33M A002 = AnonymousClass33M.A00();
        ArrayList A0s = AnonymousClass001.A0s();
        ContentValues A062 = AnonymousClass0x9.A06();
        Collection collection2 = collection;
        try {
            C85284Fq A072 = C18630y0.A07(r9);
            try {
                Axm = A072.Axm();
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    AnonymousClass3ZH A0R = C18310x6.A0R(it);
                    C95814uZ r2 = A0R.A0H;
                    if (r2 == null) {
                        C18260x0.A1R(AnonymousClass001.A0o(), "contact-mgr-db/update or add contact skipped for jid=", r2);
                    } else {
                        String rawString = r2.getRawString();
                        A0s.add(A0R);
                        A062.clear();
                        long A0F2 = A0R.A0F();
                        if (A0F2 > 0) {
                            C18270x1.A0c(A062, "_id", A0F2);
                        }
                        A062.put("jid", rawString);
                        AnonymousClass0x2.A0o(A062, "is_whatsapp_user", A0R.A10);
                        A062.put("status", A0R.A0X);
                        C18270x1.A0c(A062, "status_timestamp", A0R.A0D);
                        C51602k5 r0 = A0R.A0F;
                        Long l = null;
                        if (r0 != null) {
                            str = r0.A01;
                        } else {
                            str = null;
                        }
                        A062.put("number", str);
                        C51602k5 r02 = A0R.A0F;
                        if (r02 != null) {
                            l = Long.valueOf(r02.A00);
                        }
                        A062.put("raw_contact_id", l);
                        if (A0R.A0o) {
                            C18270x1.A0c(A062, "raw_contact_id", -4);
                        }
                        AnonymousClass3ZH.A0A(A062, A0R);
                        A062.put("phone_type", A0R.A0L);
                        A062.put("phone_label", A0R.A0V);
                        AnonymousClass3ZH.A0B(A062, A0R);
                        A062.put("sort_name", A0R.A0W);
                        C18270x1.A0b(A062, "photo_ts", A0R.A05);
                        C18270x1.A0b(A062, "thumb_ts", A0R.A06);
                        C18270x1.A0c(A062, "photo_id_timestamp", A0R.A0C);
                        A062.put("history_sync_initial_phash", A0R.A0S);
                        A062.put("wa_name", A0R.A0b);
                        A062.put("nickname", A0R.A0U);
                        A062.put("company", A0R.A0O);
                        A062.put("title", A0R.A0Z);
                        AnonymousClass0x2.A0o(A062, "is_spam_reported", A0R.A0x);
                        AnonymousClass0x2.A0o(A062, "is_starred", A0R.A0r);
                        A062.put("status_emoji", A0R.A0Y);
                        if (r9.A07.A0Y(C58422vE.A02, 5868)) {
                            AnonymousClass0x2.A0o(A062, "is_wa_created_contact", A0R.A0t);
                            C18270x1.A0b(A062, "sync_policy", A0R.A07);
                        }
                        AnonymousClass361.A0B(A062, A072, "wa_contacts");
                        if (r2 instanceof C27991fJ) {
                            r9.A07(Axm, A072, (C27991fJ) r2, A0R.A0K);
                        }
                    }
                }
                Axm.A00();
                Axm.close();
                A072.close();
                C34461vC.A00(r9).A08(A0s);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("updated or added ");
                A0o.append(A0s);
                C18290x4.A1O(" contacts from a list of ", A0o, collection2);
                AnonymousClass33M.A04(A002, " contacts | time: ", A0o);
                Iterator it2 = collection2.iterator();
                while (it2.hasNext()) {
                    this.A04.A02(C18310x6.A0R(it2));
                }
                return;
            } catch (Throwable th) {
                A072.close();
                throw th;
            }
            throw th;
        } catch (IllegalArgumentException e) {
            C626936e.A08("contact-mgr-db/unable to update or add contacts ", e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public void A0g(List list) {
        C69833Yo Axl;
        Cursor A0A2;
        C34461vC r7 = this.A05;
        if (list.isEmpty()) {
            Log.i("contact-mgr-db/delete contacts called without any contacts");
            return;
        }
        AnonymousClass33M A002 = AnonymousClass33M.A00();
        try {
            AnonymousClass1RI r8 = r7.A00;
            C85284Fq A0C2 = r8.A0C();
            try {
                Axl = A0C2.Axl();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r7.A06(Axl, C18310x6.A0R(it), A0C2);
                }
                Axl.A00();
                A0C2.B25(new C70203a7(r7, 3, list));
                Axl.close();
                A0C2.close();
                AnonymousClass33M.A04(A002, "contact-mgr-db/deleted contacts | time: ", AnonymousClass001.A0o());
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    AnonymousClass3ZH A0R = C18310x6.A0R(it2);
                    Jid A0I2 = A0R.A0I(C95814uZ.class);
                    if (A0I2 != null) {
                        AnonymousClass4GK A0B2 = r8.get();
                        try {
                            A0A2 = AnonymousClass361.A0A(A0B2, "SELECT 1 FROM wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid) WHERE wa_contacts.jid = ?", "HAS_CONTACT_FOR_JID", C18270x1.A1a(A0I2));
                            boolean moveToNext = A0A2.moveToNext();
                            A0A2.close();
                            A0B2.close();
                            if (!moveToNext) {
                                A0s.add(A0R);
                            }
                        } catch (Throwable th) {
                            try {
                                A0B2.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                }
                if (!A0s.isEmpty()) {
                    Iterator A032 = C61102zi.A03((C61102zi) r7.A0A.get());
                    while (A032.hasNext()) {
                        ((C85004Eo) A032.next()).BUu(A0s);
                    }
                    return;
                }
                return;
            } catch (Throwable th3) {
                A0C2.close();
                throw th3;
            }
        } catch (IllegalArgumentException e) {
            C626936e.A08(AnonymousClass000.A0P(list, "contact-mgr-db/unable to delete contacts ", AnonymousClass001.A0o()), e);
            return;
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
        throw th;
        throw th;
    }

    public void A0h(List list) {
        this.A05.A0U(list, 0, false, false, false);
        A0j(list);
    }

    public void A0i(List list) {
        this.A05.A0U(list, 0, true, false, false);
        A0j(list);
    }

    public final void A0j(List list) {
        if (this.A0H.A0Y(C58422vE.A02, 6924)) {
            C48452ev r6 = this.A04;
            HashMap A0t = AnonymousClass001.A0t();
            List A0C2 = C73723fy.A0C(list);
            AnonymousClass4K0 r4 = new AnonymousClass4K0(0);
            C162457s7.A0J(A0C2, 0);
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object next : A0C2) {
                if (AnonymousClass001.A1Z(r4.invoke(next))) {
                    A0s.add(next);
                }
            }
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                AnonymousClass3ZH A0R = C18310x6.A0R(it);
                A0t.put(A0R.A0H, A0R);
            }
            r6.A01.putAll(A0t);
        }
    }

    public boolean A0k() {
        int i;
        Cursor A0A2;
        Integer num;
        C34461vC r7 = this.A05;
        synchronized (r7.A0B) {
            i = -1;
            if (r7.A02 == null) {
                PhoneUserJid A042 = C56972sr.A04(r7.A03);
                if (A042 != null) {
                    AnonymousClass33M A002 = AnonymousClass33M.A00();
                    AnonymousClass4GK A032 = C18630y0.A03(r7);
                    try {
                        A0A2 = AnonymousClass361.A0A(A032, "SELECT count(*) AS _count FROM wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid) WHERE is_whatsapp_user = 1 AND raw_contact_id NOT NULL AND raw_contact_id != -1 AND wa_contacts.jid != ?", "initIndividualContactCount", C18270x1.A1a(A042));
                        if (A0A2.moveToNext()) {
                            int A043 = AnonymousClass0x2.A04(A0A2, "_count");
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("contact-mgr-db/individual contact count: ");
                            A0o.append(A043);
                            AnonymousClass33M.A04(A002, " | time: ", A0o);
                            num = Integer.valueOf(A043);
                        } else {
                            Log.w("contact-mgr-db/individual contact count missing cursor");
                            num = null;
                        }
                        r7.A02 = num;
                        A0A2.close();
                        A032.close();
                    } catch (Throwable th) {
                        try {
                            A032.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            Integer num2 = r7.A02;
            if (num2 != null) {
                i = num2.intValue();
            }
        }
        C18260x0.A0y("indivcount/count ", AnonymousClass001.A0o(), i);
        return AnonymousClass001.A1W(i);
        throw th;
    }

    public /* synthetic */ void BNp(UserJid userJid) {
    }

    public void BPs(AnonymousClass3ZH r4) {
        C48452ev r2 = this.A04;
        r2.A01.remove(r4.A0I(C95814uZ.class));
    }

    public void BPx(Collection collection) {
        C70193a6.A00(this.A01, this, collection, 42);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it);
            C48452ev r2 = this.A04;
            r2.A01.remove(A0R.A0I(C95814uZ.class));
        }
    }

    public void BPy(Collection collection, boolean z) {
        if (z) {
            this.A04.A01.clear();
            C29421in r3 = this.A06;
            Iterator A032 = C61102zi.A03(r3);
            while (A032.hasNext()) {
                C56602sG r1 = (C56602sG) A032.next();
                if (r1 instanceof AnonymousClass1P8) {
                    AnonymousClass5ZU r12 = (AnonymousClass5ZU) ((AnonymousClass1P8) r1).A00.get();
                    r12.A0C.clear();
                    r12.A0D.clear();
                }
            }
            r3.A0D(collection);
        }
    }

    public void BUu(Collection collection) {
        Iterator A032 = C61102zi.A03(this.A07);
        if (A032.hasNext()) {
            A032.next();
            throw AnonymousClass001.A0g("onJidsRemoved");
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it);
            C56332ro r0 = this.A08;
            r0.A03(A0R);
            r0.A04(A0R);
        }
    }

    public void BWp() {
        this.A06.A0B(C56972sr.A05(this.A02));
    }

    public static AnonymousClass3ZH A00(C64773Ex r0, C95814uZ r1) {
        C626936e.A06(r1);
        return r0.A0A(r1);
    }

    public static void A02(String str, Collection collection) {
        C18260x0.A0y("/count ", AnonymousClass000.A0l(str), collection.size());
    }

    public AnonymousClass3ZH A0A(C95814uZ r3) {
        AnonymousClass3ZH A072 = A07(r3);
        if (A072 != null) {
            return A072;
        }
        AnonymousClass3ZH r1 = new AnonymousClass3ZH(r3);
        this.A05.A0L(r1);
        return r1;
    }

    public ArrayList A0G() {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = this.A05.A0C().iterator();
        while (it.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it);
            if (A0R.A0H instanceof C27991fJ) {
                A0s.add(A0R);
            }
        }
        return A0s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (X.C627336j.A0L(r3) == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0H(java.util.Set r9) {
        /*
            r8 = this;
            long r1 = java.lang.System.currentTimeMillis()
            X.1vC r3 = r8.A05
            r0 = 0
            java.util.List r0 = r3.A0F(r0)
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r7 = r0.iterator()
        L_0x0013:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x004a
            X.3ZH r6 = X.C18310x6.A0R(r7)
            X.1VX r5 = r8.A0H
            r3 = 723(0x2d3, float:1.013E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r5.A0Y(r0, r3)
            if (r0 == 0) goto L_0x0041
            X.4uZ r3 = r6.A0H
            boolean r0 = r6.A0R()
            if (r0 == 0) goto L_0x0037
            boolean r0 = X.C627336j.A0L(r3)
            if (r0 == 0) goto L_0x003d
        L_0x0037:
            boolean r0 = r9.contains(r3)
            if (r0 == 0) goto L_0x0013
        L_0x003d:
            r4.add(r6)
            goto L_0x0013
        L_0x0041:
            boolean r0 = r6.A0R()
            if (r0 != 0) goto L_0x003d
            X.4uZ r3 = r6.A0H
            goto L_0x0037
        L_0x004a:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "returned "
            X.C18260x0.A19(r0, r3, r4)
            java.lang.String r0 = " sidelist sync pending contacts | time: "
            X.C18260x0.A13(r0, r3, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64773Ex.A0H(java.util.Set):java.util.List");
    }

    public Map A0I(Collection collection) {
        C69833Yo Axl;
        int i;
        Throwable th;
        HashMap hashMap = new HashMap(collection.size(), 1.0f);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(it);
            C56972sr r1 = this.A02;
            if (r1.A0a(A0P)) {
                hashMap.put(A0P, C56972sr.A01(r1));
            }
            if (A0P instanceof C135216kJ) {
                hashMap.put(A0P, this.A04.A00.get());
            }
        }
        collection.removeAll(hashMap.keySet());
        HashMap hashMap2 = new HashMap(collection.size(), 1.0f);
        HashSet hashSet = new HashSet(collection.size(), 1.0f);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            C95814uZ A0P2 = C18300x5.A0P(it2);
            AnonymousClass3ZH A012 = this.A04.A01(A0P2);
            if (A012 != null) {
                hashMap2.put(A0P2, A012);
            } else {
                hashSet.add(A0P2);
            }
        }
        C34461vC r9 = this.A05;
        int min = Math.min(975, 975);
        AnonymousClass33M A022 = AnonymousClass33M.A02(true);
        HashMap hashMap3 = new HashMap(hashSet.size(), 1.0f);
        HashSet A0K = AnonymousClass002.A0K();
        String[] A0O = C627336j.A0O(hashSet);
        if (min >= 1) {
            C85284Fq A072 = C18630y0.A07(r9);
            try {
                C71923ct r4 = new C71923ct(A0O, min);
                while (r4.hasNext()) {
                    String[] A013 = C71923ct.A01(r4);
                    int length = A013.length;
                    int i2 = 0;
                    boolean z = false;
                    if (length <= 975) {
                        z = true;
                    }
                    C626936e.A0E(z, "SQL param length exceeded");
                    try {
                        StringBuilder A0h = AnonymousClass0x2.A0h();
                        AnonymousClass0x2.A1O(A0h, C66223Kn.A00);
                        AnonymousClass0x2.A1P(A0h, "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)");
                        C57212tH.A02("wa_contacts.jid IN ", A0h, length);
                        A0h.append(" ORDER BY ");
                        Cursor A0A2 = AnonymousClass361.A0A(A072, AnonymousClass000.A0X("wa_contacts.jid", A0h), "CONTACTS_BULK", A013);
                        try {
                            int count = A0A2.getCount();
                            while (A0A2.moveToNext()) {
                                try {
                                    AnonymousClass3ZH A002 = AnonymousClass25S.A00(A0A2);
                                    i2++;
                                    AnonymousClass3ZH A014 = C34461vC.A01(A002, (AnonymousClass3ZH) hashMap3.get(A002.A0H));
                                    hashMap3.put(A014.A0H, A014);
                                    if (A002.A0F == null) {
                                        A0K.add(A002);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    i = i2;
                                    i2 = count;
                                    try {
                                        A0A2.close();
                                    } catch (Throwable th3) {
                                        try {
                                            th.addSuppressed(th3);
                                        } catch (IllegalStateException e) {
                                            e = e;
                                            C34461vC.A04(e, "contactmanagerdb/fetchContacts/", i2, i);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            try {
                                A0A2.close();
                            } catch (IllegalStateException e2) {
                                e = e2;
                                i = i2;
                                i2 = count;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            i = 0;
                            if (A0A2 == null) {
                                throw th;
                            }
                            A0A2.close();
                            throw th;
                        }
                    } catch (IllegalStateException e3) {
                        e = e3;
                        i = 0;
                        C34461vC.A04(e, "contactmanagerdb/fetchContacts/", i2, i);
                    }
                }
                Collection values = hashMap3.values();
                if (A0K.size() != 0) {
                    Axl = A072.Axl();
                    Iterator it3 = A0K.iterator();
                    while (it3.hasNext()) {
                        AnonymousClass3ZH A0R = C18310x6.A0R(it3);
                        if (!values.contains(A0R)) {
                            r9.A0N(A0R);
                        }
                    }
                    Axl.A00();
                    Axl.close();
                }
                r9.A0S(values);
                A072.close();
                A022.A07();
                Iterator A0u = AnonymousClass001.A0u(hashMap3);
                while (A0u.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0u);
                    A0S((AnonymousClass3ZH) A0w.getValue(), C18320x8.A0N(A0w));
                    C48452ev r12 = this.A04;
                    AnonymousClass3ZH r3 = (AnonymousClass3ZH) A0w.getValue();
                    if (r3 != null) {
                        Class<C95814uZ> cls = C95814uZ.class;
                        if (r3.A0I(cls) != null) {
                            r12.A01.put(AnonymousClass3ZH.A05(r3, cls), r3);
                        }
                    }
                    C18270x1.A1N(hashMap2, A0w);
                }
                hashMap.putAll(hashMap2);
                return hashMap;
            } catch (Throwable th5) {
                try {
                    A072.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } else {
            throw AnonymousClass001.A0c("Chunk size must be positive.");
        }
        throw th;
    }

    public Map A0J(Collection collection) {
        Map A0I2 = A0I(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(it);
            if (!A0I2.containsKey(A0P)) {
                AnonymousClass3ZH r1 = new AnonymousClass3ZH(A0P);
                A0I2.put(A0P, r1);
                this.A05.A0L(r1);
            }
        }
        return A0I2;
    }

    public void A0K() {
        byte[] bArr = new byte[12];
        AnonymousClass0x9.A1C().nextBytes(bArr);
        C18270x1.A0j(C18270x1.A03(this.A0B), "web_contact_checksum", Base64.encodeToString(bArr, 8));
    }

    public void A0O(AnonymousClass3ZH r3) {
        C34461vC.A03(this, r3);
        this.A01.post(C69963Zi.A00(this, 45));
    }

    public final void A0S(AnonymousClass3ZH r3, C95814uZ r4) {
        String A0l;
        A0R(r3, r4);
        if (r3 != null && (r4 instanceof UserJid)) {
            UserJid userJid = (UserJid) r4;
            if (C155477ey.A00(userJid)) {
                C183538qC r1 = this.A0J;
                if (C18320x8.A0I(r1).A01.A00()) {
                    A0l = C18320x8.A0I(r1).A01(userJid);
                } else {
                    Context context = this.A0A.A00;
                    C162457s7.A0J(context, 0);
                    A0l = C18290x4.A0l(context, R.string.f11nameremoved);
                }
                r3.A0P = A0l;
            }
        }
    }

    public void A0V(C27991fJ r3, boolean z) {
        AnonymousClass3ZH A0A2 = A0A(r3);
        if (A0A2.A0v != z) {
            A0A2.A0v = z;
            C34461vC.A03(this, A0A2);
        }
    }

    public void A0W(C27991fJ r3, boolean z) {
        AnonymousClass3ZH A0A2 = A0A(r3);
        if (A0A2.A0w != z) {
            A0A2.A0w = z;
            C34461vC.A03(this, A0A2);
        }
    }

    public void A0d(Collection collection) {
        C85284Fq A072;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it);
            C34461vC r2 = this.A05;
            Jid A032 = AnonymousClass3ZH.A03(A0R);
            boolean z = A0R.A10;
            ContentValues A073 = AnonymousClass0x9.A07(1);
            AnonymousClass0x2.A0o(A073, "is_whatsapp_user", z);
            try {
                A072 = C18630y0.A07(r2);
                String A074 = C627336j.A07(A032);
                C626936e.A06(A074);
                AnonymousClass361.A07(A073, A072, "wa_contacts", "jid = ?", new String[]{A074});
                A072.close();
            } catch (IllegalArgumentException e) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("contact-mgr-db/unable to update is_whatsapp_user state  ");
                A0o.append(A032);
                C626936e.A08(AnonymousClass000.A0b(", ", A0o, z), e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            this.A04.A02(A0R);
            C70193a6.A00(this.A01, this, A0R, 49);
        }
        return;
        throw th;
    }

    public boolean A0l(UserJid userJid) {
        C51602k5 r0;
        AnonymousClass3ZH A072 = A07(userJid);
        if (A072 == null || (r0 = A072.A0F) == null || TextUtils.isEmpty(r0.A01)) {
            return false;
        }
        return true;
    }

    public void BPv(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it);
            C48452ev r2 = this.A04;
            r2.A01.remove(A0R.A0I(C95814uZ.class));
        }
        C70193a6.A00(this.A01, this, collection, 43);
    }

    public /* synthetic */ void BPz() {
    }

    public void BNs(UserJid userJid) {
        C48452ev.A00(this, userJid);
    }
}
