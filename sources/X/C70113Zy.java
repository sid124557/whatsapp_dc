package X;

import android.os.PowerManager;
import com.whatsapp.util.Log;

/* renamed from: X.3Zy  reason: invalid class name and case insensitive filesystem */
public class C70113Zy implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C70113Zy(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static void A00(PowerManager.WakeLock wakeLock) {
        if (wakeLock != null && wakeLock.isHeld()) {
            Log.i("ExportFlowManager/onStartCommand/wakelock released");
            wakeLock.release();
        }
    }

    public static void A01(AnonymousClass4FS r1, Object obj, Object obj2, int i) {
        r1.BkM(new C70113Zy(obj, i, obj2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: X.2QN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: X.2SP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: X.2SP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v42, resolved type: X.5nx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v43, resolved type: X.5nx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v173, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v473, resolved type: X.5nx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v45, resolved type: X.5nx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v53, resolved type: X.2QN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v54, resolved type: X.2QN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v55, resolved type: X.2QN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v56, resolved type: X.2QN} */
    /* JADX WARNING: type inference failed for: r9v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r9v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0a37, code lost:
        if (r2 <= r0) goto L_0x0a39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        X.AnonymousClass2A8.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0a7e, code lost:
        X.AnonymousClass0x2.A18(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0a81, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0111, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0cee, code lost:
        r2.A00(new X.AnonymousClass4HL(r6, r4, r5, r1)).A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0cfa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0f6c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:?, code lost:
        X.AnonymousClass2A8.A00(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0f70, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:685:0x10fd, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:0x10fe, code lost:
        X.AnonymousClass2A8.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:710:0x118c, code lost:
        r3.post(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:711:0x118f, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:464:0x0b8b  */
    /* JADX WARNING: Removed duplicated region for block: B:790:0x0a8c A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r3 = r23
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x0f59;
                case 1: goto L_0x0f4b;
                case 2: goto L_0x0a82;
                case 3: goto L_0x0f3d;
                case 4: goto L_0x0a15;
                case 5: goto L_0x004a;
                case 6: goto L_0x1105;
                case 7: goto L_0x09ee;
                case 8: goto L_0x0f1b;
                case 9: goto L_0x0f05;
                case 10: goto L_0x090b;
                case 11: goto L_0x090b;
                case 12: goto L_0x0ef7;
                case 13: goto L_0x0ef7;
                case 14: goto L_0x0ee9;
                case 15: goto L_0x0ee9;
                case 16: goto L_0x0eda;
                case 17: goto L_0x0eac;
                case 18: goto L_0x0e99;
                case 19: goto L_0x0e25;
                case 20: goto L_0x0dce;
                case 21: goto L_0x08bd;
                case 22: goto L_0x058b;
                case 23: goto L_0x0da4;
                case 24: goto L_0x056c;
                case 25: goto L_0x045a;
                case 26: goto L_0x0d85;
                case 27: goto L_0x0d77;
                case 28: goto L_0x042a;
                case 29: goto L_0x03fc;
                case 30: goto L_0x0363;
                case 31: goto L_0x0d5c;
                case 32: goto L_0x02ed;
                case 33: goto L_0x0d36;
                case 34: goto L_0x0224;
                case 35: goto L_0x0d26;
                case 36: goto L_0x014a;
                case 37: goto L_0x0d1a;
                case 38: goto L_0x0d0c;
                case 39: goto L_0x0007;
                case 40: goto L_0x0007;
                case 41: goto L_0x0cfb;
                case 42: goto L_0x0cb0;
                case 43: goto L_0x0c72;
                case 44: goto L_0x0c33;
                case 45: goto L_0x0bf4;
                case 46: goto L_0x0be6;
                case 47: goto L_0x0bbc;
                case 48: goto L_0x0138;
                case 49: goto L_0x0bb0;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r3.A00
            X.5Os r4 = (X.C103865Os) r4
            java.lang.Object r5 = r3.A01
            X.4uY r5 = (X.C95804uY) r5
            X.4uY r0 = r4.A07
            if (r0 == 0) goto L_0x0049
            X.31C r6 = r4.A03
            java.lang.String r9 = r6.A03()
            r1 = 25
            X.1wm r0 = new X.1wm
            r0.<init>((java.lang.String) r9, (int) r1)
            X.1wm r1 = new X.1wm
            r1.<init>((X.C95804uY) r5, (X.C35381wm) r0)
            r0 = 2
            X.1xJ r3 = new X.1xJ
            r3.<init>((X.C35381wm) r1, (int) r0)
            X.2sL r2 = r4.A01
            X.2se r0 = r4.A05
            X.2g3 r1 = new X.2g3
            r1.<init>(r2, r5, r0)
            X.2HO r0 = new X.2HO
            r0.<init>(r1)
            X.36K r8 = X.C41032Ir.A05(r3)
            X.93F r7 = new X.93F
            r7.<init>(r5, r4, r0, r3)
            r11 = 32000(0x7d00, double:1.581E-319)
            r10 = 404(0x194, float:5.66E-43)
            r6.A0D(r7, r8, r9, r10, r11)
        L_0x0049:
            return
        L_0x004a:
            java.lang.Object r7 = r3.A00
            X.3Cl r7 = (X.C64173Cl) r7
            java.lang.Object r5 = r3.A01
            X.2lg r5 = (X.C52562lg) r5
            monitor-enter(r7)
            java.lang.Long r4 = r7.A01(r5)     // Catch:{ all -> 0x0f73 }
            if (r4 != 0) goto L_0x00b3
            X.3fv r3 = r7.A09     // Catch:{ all -> 0x0f73 }
            int r0 = r3.size()     // Catch:{ all -> 0x0f73 }
            java.util.ListIterator r2 = r3.listIterator(r0)     // Catch:{ all -> 0x0f73 }
        L_0x0063:
            boolean r0 = r2.hasPrevious()     // Catch:{ all -> 0x0f73 }
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r0 = r2.previous()     // Catch:{ all -> 0x0f73 }
            X.2lg r0 = (X.C52562lg) r0     // Catch:{ all -> 0x0f73 }
            X.36K r1 = r0.A01     // Catch:{ all -> 0x0f73 }
            X.36K r0 = r5.A01     // Catch:{ all -> 0x0f73 }
            boolean r0 = X.C162457s7.A0P(r1, r0)     // Catch:{ all -> 0x0f73 }
            if (r0 == 0) goto L_0x0063
            int r1 = r2.nextIndex()     // Catch:{ all -> 0x0f73 }
            if (r1 < 0) goto L_0x00b2
            java.lang.Object r0 = r3.get(r1)     // Catch:{ all -> 0x0f73 }
            X.2lg r0 = (X.C52562lg) r0     // Catch:{ all -> 0x0f73 }
            java.lang.Long r4 = r0.A02     // Catch:{ all -> 0x0f73 }
            int r2 = r1 + 1
            r0 = 0
        L_0x008a:
            if (r0 >= r2) goto L_0x0092
            r3.A04()     // Catch:{ all -> 0x0f73 }
            int r0 = r0 + 1
            goto L_0x008a
        L_0x0092:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0f73 }
            java.lang.String r0 = "PreacksQueue/removeDeliveredPreacksFromPersistedPreacks removed "
            r1.append(r0)     // Catch:{ all -> 0x0f73 }
            r1.append(r2)     // Catch:{ all -> 0x0f73 }
            java.lang.String r0 = " preacks, notSavedPreacks.size="
            r1.append(r0)     // Catch:{ all -> 0x0f73 }
            X.3fv r0 = r7.A08     // Catch:{ all -> 0x0f73 }
            int r0 = r0.size()     // Catch:{ all -> 0x0f73 }
            r1.append(r0)     // Catch:{ all -> 0x0f73 }
            java.lang.String r0 = " persistedPreacks.size="
            X.C18260x0.A1A(r0, r1, r3)     // Catch:{ all -> 0x0f73 }
            goto L_0x00b3
        L_0x00b2:
            r4 = 0
        L_0x00b3:
            monitor-exit(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PreacksQueue/removeDeliveredPreacks lastDeliveredRowId="
            X.C18260x0.A1R(r1, r0, r4)
            if (r4 == 0) goto L_0x0112
            X.2bh r9 = r7.A02
            long r5 = r4.longValue()
            r2 = 0
            r1 = 1
            r8 = 0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            boolean r3 = X.AnonymousClass001.A1U(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid rowId="
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = " provided"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r2)
            X.C626936e.A0E(r3, r0)
            r7 = 0
            X.8qC r0 = r9.A04     // Catch:{ Exception -> 0x0114 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0114 }
            X.1RJ r0 = (X.AnonymousClass1RJ) r0     // Catch:{ Exception -> 0x0114 }
            X.4Fq r10 = r0.A0C()     // Catch:{ Exception -> 0x0114 }
            r0 = r10
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x010b }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x010b }
            java.lang.String r3 = "preacks"
            java.lang.String r2 = "_id <= ?"
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x010b }
            X.AnonymousClass0x2.A1S(r1, r8, r5)     // Catch:{ all -> 0x010b }
            java.lang.String r0 = "PreacksStore/DELETE_ALL_OLDER_THAN_OR_EQUAL"
            int r0 = r4.A07(r3, r2, r0, r1)     // Catch:{ all -> 0x010b }
            r10.close()     // Catch:{ Exception -> 0x0114 }
            r8 = r0
            goto L_0x0121
        L_0x010b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x010d }
        L_0x010d:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r10, r1)     // Catch:{ Exception -> 0x0114 }
            throw r0     // Catch:{ Exception -> 0x0114 }
        L_0x0112:
            r1 = 0
            goto L_0x0125
        L_0x0114:
            r2 = move-exception
            java.lang.String r0 = "PreacksStore/deleteAllOlderThanOrEqual failed to remove pre-acks from DB"
            X.C626936e.A08(r0, r2)
            X.2qk r1 = r9.A00
            java.lang.String r0 = "failed_to_remove_pre_acks"
            r1.A09(r0, r7, r2)
        L_0x0121:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
        L_0x0125:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PreacksQueue/removeDeliveredPreacks "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " deleted from store"
            r2.append(r0)
            goto L_0x0a7e
        L_0x0138:
            java.lang.Object r2 = r3.A00
            X.2iH r2 = (X.C50502iH) r2
            java.lang.Object r1 = r3.A01
            X.34x r1 = (X.C624134x) r1
            boolean r0 = r2.A01(r1)
            if (r0 == 0) goto L_0x0049
            r2.A00(r1)
            return
        L_0x014a:
            java.lang.Object r6 = r3.A00
            X.2bi r6 = (X.C46492bi) r6
            java.lang.Object r5 = r3.A01
            X.34x r5 = (X.C624134x) r5
            X.2SV r4 = r5.A12()
            if (r4 == 0) goto L_0x0049
            r7 = 1
            long r1 = r4.A01
            long r1 = r1 & r7
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0049
            X.2LV r3 = r6.A03
            r1 = 0
            X.2z0 r0 = r5.A1J
            X.4uZ r11 = r0.A00
            boolean r0 = r11 instanceof X.C95804uY
            if (r0 == 0) goto L_0x01e0
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid"
            X.C162457s7.A0K(r11, r0)
            X.4uY r11 = (X.C95804uY) r11
            java.lang.String[] r8 = X.AnonymousClass0x9.A1Y()
            X.C624134x.A0Y(r5, r8, r1)
            X.3dV r0 = r3.A01
            X.4GK r2 = r0.get()
            r0 = r2
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0f71 }
            X.2sg r7 = r0.A03     // Catch:{ all -> 0x0f71 }
            java.lang.String r1 = "SELECT reaction, reaction_count FROM newsletter_message_reaction WHERE message_row_id = ?"
            java.lang.String r0 = "GET_ALL_REACTIONS_FOR_NEWSLETTER_MESSAGE"
            android.database.Cursor r1 = r7.A0E(r1, r0, r8)     // Catch:{ all -> 0x0f71 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0f6a }
            java.lang.String r7 = "reaction_count"
            int r8 = r1.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x0f6a }
            java.lang.String r7 = "reaction"
            int r7 = r1.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x0f6a }
        L_0x01a0:
            boolean r9 = r1.moveToNext()     // Catch:{ all -> 0x0f6a }
            if (r9 == 0) goto L_0x01cc
            long r13 = r1.getLong(r8)     // Catch:{ all -> 0x0f6a }
            java.lang.String r12 = r1.getString(r7)     // Catch:{ all -> 0x0f6a }
            X.2sr r10 = r3.A00     // Catch:{ all -> 0x0f6a }
            X.C18280x3.A12(r12)     // Catch:{ all -> 0x0f6a }
            X.2SV r9 = r5.A12()     // Catch:{ all -> 0x0f6a }
            if (r9 == 0) goto L_0x01ca
            java.lang.String r9 = r9.A05     // Catch:{ all -> 0x0f6a }
        L_0x01bb:
            boolean r17 = r12.equals(r9)     // Catch:{ all -> 0x0f6a }
            long r15 = r5.A1L     // Catch:{ all -> 0x0f6a }
            X.1Hp r9 = new X.1Hp     // Catch:{ all -> 0x0f6a }
            r9.<init>(r10, r11, r12, r13, r15, r17)     // Catch:{ all -> 0x0f6a }
            r0.add(r9)     // Catch:{ all -> 0x0f6a }
            goto L_0x01a0
        L_0x01ca:
            r9 = 0
            goto L_0x01bb
        L_0x01cc:
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0f6a }
            if (r3 != 0) goto L_0x01da
            X.3Cz r3 = new X.3Cz     // Catch:{ all -> 0x0f6a }
            r3.<init>(r0)     // Catch:{ all -> 0x0f6a }
            r5.A1t(r3)     // Catch:{ all -> 0x0f6a }
        L_0x01da:
            r1.close()     // Catch:{ all -> 0x0f71 }
            r2.close()
        L_0x01e0:
            X.4FP r7 = r5.A0L
            boolean r0 = r7 instanceof X.C64313Cz
            if (r0 == 0) goto L_0x0213
            X.3Cz r7 = (X.C64313Cz) r7
            if (r7 == 0) goto L_0x0213
            java.lang.String r3 = r4.A05
            monitor-enter(r7)
            if (r3 == 0) goto L_0x0212
            int r0 = r3.length()     // Catch:{ all -> 0x0f73 }
            if (r0 == 0) goto L_0x0212
            java.util.List r0 = r7.A00     // Catch:{ all -> 0x0f73 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0f73 }
        L_0x01fb:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0f73 }
            if (r0 == 0) goto L_0x0212
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0f73 }
            X.1Hp r1 = (X.AnonymousClass1Hp) r1     // Catch:{ all -> 0x0f73 }
            java.lang.String r0 = r1.A02     // Catch:{ all -> 0x0f73 }
            boolean r0 = X.C162457s7.A0P(r0, r3)     // Catch:{ all -> 0x0f73 }
            if (r0 == 0) goto L_0x01fb
            r0 = 1
            r1.A01 = r0     // Catch:{ all -> 0x0f73 }
        L_0x0212:
            monitor-exit(r7)
        L_0x0213:
            X.4FP r0 = r5.A0L
            if (r0 == 0) goto L_0x0049
            X.3Wi r2 = r6.A00
            r1 = 35
            X.3Zy r0 = new X.3Zy
            r0.<init>(r6, r1, r5)
            r2.A0S(r0)
            return
        L_0x0224:
            java.lang.Object r6 = r3.A00
            X.4uZ r6 = (X.C95814uZ) r6
            java.lang.Object r7 = r3.A01
            com.whatsapp.newsletter.NewsletterInfoMembersListViewModel r7 = (com.whatsapp.newsletter.NewsletterInfoMembersListViewModel) r7
            boolean r0 = r6 instanceof X.C27981fH
            r5 = 0
            if (r0 == 0) goto L_0x023f
            r1 = r6
            X.1fH r1 = (X.C27981fH) r1
            if (r1 == 0) goto L_0x023f
            X.2sM r0 = r7.A0A
            com.whatsapp.jid.PhoneUserJid r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x023f
            r6 = r0
        L_0x023f:
            X.3Ex r0 = r7.A09
            X.3ZH r4 = r0.A0A(r6)
            X.08M r3 = r7.A06
            java.lang.Object r0 = r3.A07()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x0297
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r0.iterator()
        L_0x0257:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0269
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C115005nx
            if (r0 == 0) goto L_0x0257
            r8.add(r1)
            goto L_0x0257
        L_0x0269:
            java.util.Iterator r2 = r8.iterator()
        L_0x026d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02bb
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.5nx r0 = (X.C115005nx) r0
            X.5Ih r0 = r0.A00
            X.3ZH r0 = r0.A00
            X.4uZ r0 = r0.A0H
            boolean r0 = X.C162457s7.A0P(r0, r6)
            if (r0 == 0) goto L_0x026d
        L_0x0286:
            X.5nx r1 = (X.C115005nx) r1
            if (r1 == 0) goto L_0x0297
            X.5Ih r0 = r1.A00
            r0.A00 = r4
            java.lang.Object r0 = r3.A07()
            if (r0 == 0) goto L_0x0297
            r3.A0G(r0)
        L_0x0297:
            X.08M r3 = r7.A05
            java.lang.Object r0 = r3.A07()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x0049
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r0.iterator()
        L_0x02a9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02bd
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C115005nx
            if (r0 == 0) goto L_0x02a9
            r7.add(r1)
            goto L_0x02a9
        L_0x02bb:
            r1 = r5
            goto L_0x0286
        L_0x02bd:
            java.util.Iterator r2 = r7.iterator()
        L_0x02c1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02db
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.5nx r0 = (X.C115005nx) r0
            X.5Ih r0 = r0.A00
            X.3ZH r0 = r0.A00
            X.4uZ r0 = r0.A0H
            boolean r0 = X.C162457s7.A0P(r0, r6)
            if (r0 == 0) goto L_0x02c1
            r5 = r1
        L_0x02db:
            X.5nx r5 = (X.C115005nx) r5
            if (r5 == 0) goto L_0x0049
            X.5Ih r0 = r5.A00
            r0.A00 = r4
            java.lang.Object r0 = r3.A07()
            if (r0 == 0) goto L_0x0049
            r3.A0G(r0)
            return
        L_0x02ed:
            java.lang.Object r2 = r3.A00
            X.2hg r2 = (X.C50132hg) r2
            java.lang.Object r5 = r3.A01
            android.util.Pair r5 = (android.util.Pair) r5
            X.2kU r4 = r2.A03
            java.lang.Object r0 = r5.first
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r4.A00(r0)
            r0 = 5
            if (r1 == r0) goto L_0x0049
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.Object r0 = r5.first
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.Object r0 = r5.second
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = X.AnonymousClass000.A0X(r0, r1)
            X.8qC r0 = r2.A06
            java.lang.Object r0 = r0.get()
            X.2oU r0 = (X.C54292oU) r0
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.io.File r0 = X.C54292oU.A03(r0)
            r2.append(r0)
            java.lang.String r1 = "/"
            r2.append(r1)
            java.lang.String r0 = "NetworkResource"
            java.lang.String r0 = X.AnonymousClass000.A0U(r0, r1, r3, r2)
            java.io.File r1 = X.AnonymousClass002.A0B(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x034d
            android.net.Uri r0 = android.net.Uri.fromFile(r1)
            if (r0 == 0) goto L_0x034d
            java.io.File r0 = X.C18310x6.A0a(r0)
            boolean r0 = r0.delete()
            if (r0 == 0) goto L_0x0049
        L_0x034d:
            java.lang.Object r3 = r5.first
            java.lang.String r3 = (java.lang.String) r3
            android.content.SharedPreferences r0 = r4.A01()
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "downloadstate/"
            X.C18260x0.A0G(r2, r0, r3, r1)
            return
        L_0x0363:
            java.lang.Object r8 = r3.A00
            com.whatsapp.mute.ui.MuteDialogViewModel r8 = (com.whatsapp.mute.ui.MuteDialogViewModel) r8
            java.lang.Object r9 = r3.A01
            java.util.List r9 = (java.util.List) r9
            X.221 r0 = r8.A01
            long r3 = r0.durationInMillis
            r0 = -1
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x037a
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r3
        L_0x037a:
            java.util.Iterator r13 = r9.iterator()
        L_0x037e:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x03db
            X.4uZ r12 = X.C18300x5.A0P(r13)
            if (r12 == 0) goto L_0x037e
            boolean r2 = r12 instanceof X.AnonymousClass1fS
            if (r2 != 0) goto L_0x037e
            boolean r2 = r12 instanceof X.C28001fK
            if (r2 != 0) goto L_0x037e
            X.2iC r11 = r8.A0A
            X.21R r3 = r8.A00
            if (r3 != 0) goto L_0x039a
            X.21R r3 = X.AnonymousClass21R.CHAT_LIST_SCREEN
        L_0x039a:
            r2 = 2
            X.C162457s7.A0J(r3, r2)
            r11.A01(r12, r3, r0)
            X.3Gp r10 = r11.A02
            r6 = -1
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x03b6
            X.2sH r2 = r11.A04
            long r6 = r2.A0H()
            long r4 = java.lang.System.currentTimeMillis()
            long r2 = r0 - r4
            long r6 = r6 + r2
        L_0x03b6:
            r2 = 1
            java.util.Set r3 = r10.A04(r12, r6, r2)
            X.C162457s7.A0D(r3)
            X.1R1 r2 = r11.A0A
            boolean r2 = r2.A0k(r12, r0)
            if (r2 == 0) goto L_0x03d7
            r10.A0O(r3)
        L_0x03c9:
            boolean r2 = X.C627336j.A0K(r12)
            if (r2 == 0) goto L_0x037e
            X.2oU r2 = r11.A05
            android.content.Context r2 = r2.A00
            com.whatsapp.push.RegistrationIntentService.A02(r2)
            goto L_0x037e
        L_0x03d7:
            r10.A0N(r3)
            goto L_0x03c9
        L_0x03db:
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x03ec
            X.3Wi r3 = r8.A04
            r0 = 26
            X.3Zo r2 = new X.3Zo
            r2.<init>(r8, r0)
        L_0x03e8:
            r3.A0S(r2)
            return
        L_0x03ec:
            java.lang.Object r1 = X.C73723fy.A04(r9)
            if (r1 == 0) goto L_0x0049
            X.3Wi r3 = r8.A04
            r0 = 29
            X.3Zy r2 = new X.3Zy
            r2.<init>(r1, r0, r8)
            goto L_0x03e8
        L_0x03fc:
            java.lang.Object r2 = r3.A00
            X.4uZ r2 = (X.C95814uZ) r2
            java.lang.Object r1 = r3.A01
            com.whatsapp.mute.ui.MuteDialogViewModel r1 = (com.whatsapp.mute.ui.MuteDialogViewModel) r1
            boolean r0 = X.C627336j.A0K(r2)
            if (r0 == 0) goto L_0x0049
            X.3Ex r0 = r1.A06
            X.3ZH r0 = r0.A0A(r2)
            boolean r0 = r0.A0e
            if (r0 == 0) goto L_0x0049
            X.1ib r0 = r1.A05
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x041a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r0 = r1.next()
            X.2oO r0 = (X.C54232oO) r0
            r0.A02(r2)
            goto L_0x041a
        L_0x042a:
            java.lang.Object r0 = r3.A00
            X.3DR r0 = (X.AnonymousClass3DR) r0
            java.lang.Object r6 = r3.A01
            X.4uZ r6 = (X.C95814uZ) r6
            X.1R1 r5 = r0.A07
            X.2sa r2 = X.AnonymousClass1R1.A00(r6, r5)
            int r1 = r2.A00
            r0 = 1
            if (r1 != r0) goto L_0x0049
            long r3 = r2.A00()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 != 0) goto L_0x0049
            r2 = 2
            X.2sa r1 = X.AnonymousClass1R1.A00(r6, r5)
            int r0 = r1.A00
            if (r2 == r0) goto L_0x0049
            r1.A00 = r2
            r5.A0a(r1)
            return
        L_0x045a:
            java.lang.Object r4 = r3.A00
            com.whatsapp.migration.transfer.service.ReceiverP2pTransferService r4 = (com.whatsapp.migration.transfer.service.ReceiverP2pTransferService) r4
            java.lang.Object r6 = r3.A01
            android.content.Intent r6 = (android.content.Intent) r6
            java.lang.String r0 = "authToken"
            java.io.Serializable r7 = r6.getSerializableExtra(r0)     // Catch:{ IOException -> 0x0f86 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x0f86 }
            java.lang.String r0 = "privateKey"
            java.io.Serializable r2 = r6.getSerializableExtra(r0)     // Catch:{ IOException -> 0x0f86 }
            java.security.PrivateKey r2 = (java.security.PrivateKey) r2     // Catch:{ IOException -> 0x0f86 }
            java.lang.String r0 = "certificate"
            java.io.Serializable r0 = r6.getSerializableExtra(r0)     // Catch:{ IOException -> 0x0f86 }
            java.security.cert.Certificate r0 = (java.security.cert.Certificate) r0     // Catch:{ IOException -> 0x0f86 }
            X.2D7 r5 = r4.A00     // Catch:{ IOException -> 0x0f86 }
            X.3fh r1 = new X.3fh     // Catch:{ IOException -> 0x0f86 }
            r1.<init>(r2, r0)     // Catch:{ IOException -> 0x0f86 }
            r0 = 8988(0x231c, float:1.2595E-41)
            java.net.ServerSocket r3 = r1.createServerSocket(r0)     // Catch:{ IOException -> 0x0f86 }
            X.2HF r2 = new X.2HF     // Catch:{ IOException -> 0x0f86 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0f86 }
            X.3dQ r0 = r5.A00     // Catch:{ IOException -> 0x0f86 }
            X.3Db r0 = r0.A02     // Catch:{ IOException -> 0x0f86 }
            X.5bk r0 = r0.A00     // Catch:{ IOException -> 0x0f86 }
            X.4C1 r0 = r0.A8X     // Catch:{ IOException -> 0x0f86 }
            java.lang.Object r1 = r0.get()     // Catch:{ IOException -> 0x0f86 }
            X.1hx r1 = (X.C28901hx) r1     // Catch:{ IOException -> 0x0f86 }
            X.1uK r0 = new X.1uK     // Catch:{ IOException -> 0x0f86 }
            r0.<init>(r1, r2, r7, r3)     // Catch:{ IOException -> 0x0f86 }
            r4.A06 = r0     // Catch:{ IOException -> 0x0f86 }
            r0.start()     // Catch:{ IOException -> 0x0f86 }
            java.lang.String r0 = "sessionId"
            java.io.Serializable r3 = r6.getSerializableExtra(r0)     // Catch:{ IOException -> 0x0f86 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x0f86 }
            java.lang.String r0 = "fpm/ReceiverChatTransferService/Started discovery service, waiting for connections..."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0f86 }
            X.4FS r2 = r4.A07     // Catch:{ IOException -> 0x0f86 }
            X.1hx r1 = r4.A04     // Catch:{ IOException -> 0x0f86 }
            X.2HE r0 = new X.2HE     // Catch:{ IOException -> 0x0f86 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0f86 }
            X.2cA r6 = new X.2cA     // Catch:{ IOException -> 0x0f86 }
            r6.<init>(r1, r0, r2, r3)     // Catch:{ IOException -> 0x0f86 }
            r4.A05 = r6     // Catch:{ IOException -> 0x0f86 }
            X.4FS r5 = r6.A04     // Catch:{ IOException -> 0x0f86 }
            r0 = 60000(0xea60, float:8.4078E-41)
            long r2 = (long) r0     // Catch:{ IOException -> 0x0f86 }
            r0 = 16
            X.3Zo r1 = new X.3Zo     // Catch:{ IOException -> 0x0f86 }
            r1.<init>(r6, r0)     // Catch:{ IOException -> 0x0f86 }
            java.lang.String r0 = "fpm/ReceiverConnectionHandler/unableToFindPeer"
            java.lang.Runnable r0 = r5.Bkn(r1, r0, r2)     // Catch:{ IOException -> 0x0f86 }
            r6.A01 = r0     // Catch:{ IOException -> 0x0f86 }
            r5 = 0
        L_0x04d9:
            X.2HE r0 = r6.A03     // Catch:{ InterruptedException -> 0x0f80 }
            com.whatsapp.migration.transfer.service.ReceiverP2pTransferService r0 = r0.A00     // Catch:{ InterruptedException -> 0x0f80 }
            X.2oU r0 = r0.A02     // Catch:{ InterruptedException -> 0x0f80 }
            X.1gc r2 = new X.1gc     // Catch:{ InterruptedException -> 0x0f80 }
            r2.<init>(r0)     // Catch:{ InterruptedException -> 0x0f80 }
            r6.A00 = r2     // Catch:{ InterruptedException -> 0x0f80 }
            java.lang.String r1 = r6.A05     // Catch:{ InterruptedException -> 0x0f80 }
            X.3R5 r0 = new X.3R5     // Catch:{ InterruptedException -> 0x0f80 }
            r0.<init>(r6)     // Catch:{ InterruptedException -> 0x0f80 }
            r2.A01(r0, r1)     // Catch:{ InterruptedException -> 0x0f80 }
            X.1gc r7 = r6.A00     // Catch:{ InterruptedException -> 0x0f80 }
            android.net.wifi.p2p.WifiP2pManager r0 = r7.A01     // Catch:{ InterruptedException -> 0x0f80 }
            if (r0 != 0) goto L_0x051c
            java.lang.String r0 = "fpm/ReceiverWifiDirectManager/Trying to start service without manager"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0f80 }
        L_0x04fb:
            X.1gc r0 = r6.A00     // Catch:{ InterruptedException -> 0x0f80 }
            r0.A00()     // Catch:{ InterruptedException -> 0x0f80 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ InterruptedException -> 0x0f80 }
            java.lang.String r0 = "fpm/ReceiverConnectionHandler/Unable to start discoverable service, attempt #"
            r1.append(r0)     // Catch:{ InterruptedException -> 0x0f80 }
            int r5 = r5 + 1
            r1.append(r5)     // Catch:{ InterruptedException -> 0x0f80 }
            X.AnonymousClass0x2.A19(r1)     // Catch:{ InterruptedException -> 0x0f80 }
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x0f80 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0f80 }
            r0 = 3
            if (r5 < r0) goto L_0x04d9
            goto L_0x0f76
        L_0x051c:
            java.lang.String r2 = r7.A04     // Catch:{ InterruptedException -> 0x0f80 }
            java.lang.String r1 = "_presence._tcp"
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ InterruptedException -> 0x0f80 }
            android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceInfo r2 = android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceInfo.newInstance(r2, r1, r0)     // Catch:{ InterruptedException -> 0x0f80 }
            java.lang.String r0 = "add local service"
            X.37S r3 = new X.37S     // Catch:{ InterruptedException -> 0x0f80 }
            r3.<init>(r0)     // Catch:{ InterruptedException -> 0x0f80 }
            android.net.wifi.p2p.WifiP2pManager r1 = r7.A01     // Catch:{ InterruptedException -> 0x0f80 }
            android.net.wifi.p2p.WifiP2pManager$Channel r0 = r7.A00     // Catch:{ InterruptedException -> 0x0f80 }
            r1.addLocalService(r0, r2, r3)     // Catch:{ InterruptedException -> 0x0f80 }
            java.lang.String r0 = "discoverPeers"
            X.37S r2 = new X.37S     // Catch:{ InterruptedException -> 0x0f80 }
            r2.<init>(r0)     // Catch:{ InterruptedException -> 0x0f80 }
            android.net.wifi.p2p.WifiP2pManager r1 = r7.A01     // Catch:{ InterruptedException -> 0x0f80 }
            android.net.wifi.p2p.WifiP2pManager$Channel r0 = r7.A00     // Catch:{ InterruptedException -> 0x0f80 }
            r1.discoverPeers(r0, r2)     // Catch:{ InterruptedException -> 0x0f80 }
            boolean r0 = r3.A00()     // Catch:{ InterruptedException -> 0x0f80 }
            if (r0 == 0) goto L_0x04fb
            boolean r0 = r2.A00()     // Catch:{ InterruptedException -> 0x0f80 }
            if (r0 == 0) goto L_0x04fb
            X.1hx r0 = r6.A02     // Catch:{ InterruptedException -> 0x0f80 }
            java.util.Iterator r2 = X.C61102zi.A03(r0)     // Catch:{ InterruptedException -> 0x0f80 }
        L_0x0556:
            boolean r0 = r2.hasNext()     // Catch:{ InterruptedException -> 0x0f80 }
            if (r0 == 0) goto L_0x0049
            java.lang.Object r0 = r2.next()     // Catch:{ InterruptedException -> 0x0f80 }
            X.3R4 r0 = (X.AnonymousClass3R4) r0     // Catch:{ InterruptedException -> 0x0f80 }
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = r0.A00     // Catch:{ InterruptedException -> 0x0f80 }
            X.2po r1 = r0.A0X     // Catch:{ InterruptedException -> 0x0f80 }
            r0 = 16
            r1.A01(r0)     // Catch:{ InterruptedException -> 0x0f80 }
            goto L_0x0556
        L_0x056c:
            java.lang.Object r4 = r3.A00
            com.whatsapp.migration.transfer.service.DonorP2pTransferService r4 = (com.whatsapp.migration.transfer.service.DonorP2pTransferService) r4
            java.lang.Object r3 = r3.A01
            android.content.Intent r3 = (android.content.Intent) r3
            java.lang.String r2 = "details_key"
            boolean r1 = r3.hasExtra(r2)
            java.lang.String r0 = "intent.getExtras()[EXTRA_DETAILS_KEY] is required but is not present"
            X.C626936e.A0E(r1, r0)
            java.lang.String r0 = r3.getStringExtra(r2)     // Catch:{ 247 -> 0x0049 }
            X.2vi r0 = X.C58722vi.A00(r0)     // Catch:{ 247 -> 0x0049 }
            r4.A08 = r0     // Catch:{ 247 -> 0x0049 }
            goto L_0x0f99
        L_0x058b:
            java.lang.Object r0 = r3.A00
            com.whatsapp.migration.export.service.MessagesExporterService r0 = (com.whatsapp.migration.export.service.MessagesExporterService) r0
            java.lang.Object r1 = r3.A01
            android.content.Intent r1 = (android.content.Intent) r1
            X.2sE r6 = r0.A00
            java.lang.String r0 = "IS_FIRST_PARTY"
            r7 = 0
            boolean r19 = r1.getBooleanExtra(r0, r7)
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/called"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            monitor-enter(r6)
            X.33M r2 = r6.A0J     // Catch:{ all -> 0x1196 }
            r0 = 0
            r2.A01 = r0     // Catch:{ all -> 0x1196 }
            r2.A00 = r0     // Catch:{ all -> 0x1196 }
            r2.A09()     // Catch:{ all -> 0x1196 }
            monitor-exit(r6)
            X.3R3 r0 = r6.A0E
            r22 = r0
            r0.A00 = r7
            monitor-enter(r6)
            android.os.CancellationSignal r0 = r6.A00     // Catch:{ all -> 0x10ea }
            if (r0 != 0) goto L_0x10e3
            java.util.concurrent.CountDownLatch r0 = r6.A01     // Catch:{ all -> 0x10ea }
            if (r0 != 0) goto L_0x10e3
            android.os.CancellationSignal r0 = new android.os.CancellationSignal     // Catch:{ all -> 0x10ea }
            r0.<init>()     // Catch:{ all -> 0x10ea }
            r6.A00 = r0     // Catch:{ all -> 0x10ea }
            r5 = 1
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x10ea }
            r0.<init>(r5)     // Catch:{ all -> 0x10ea }
            r6.A01 = r0     // Catch:{ all -> 0x10ea }
            android.os.CancellationSignal r13 = r6.A00     // Catch:{ all -> 0x10ea }
            monitor-exit(r6)     // Catch:{ all -> 0x10ea }
            java.lang.String r1 = "ExportFlowManager/"
            X.33i r0 = r6.A03
            android.os.PowerManager r0 = r0.A0J()
            if (r0 != 0) goto L_0x05e5
            java.lang.String r0 = "OsUtil/acquireWakeLock()/pm=null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r8 = 0
        L_0x05df:
            r4 = 0
            r3 = 16
            if (r8 == 0) goto L_0x05f5
            goto L_0x05ea
        L_0x05e5:
            android.os.PowerManager$WakeLock r8 = X.AnonymousClass75K.A00(r0, r1, r5)
            goto L_0x05df
        L_0x05ea:
            java.lang.String r0 = "ExportFlowManager/onStartCommand/wakelock acquired"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            r0 = 14400000(0xdbba00, double:7.1145453E-317)
            r8.acquire(r0)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
        L_0x05f5:
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/started"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            r12 = 3
            r6.A07(r12)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            X.1at r9 = new X.1at     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            r9.<init>()     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            X.1at r2 = new X.1at     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            r2.<init>()     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            X.1at r1 = r6.A01(r12)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            java.lang.Integer r0 = X.C18300x5.A0Z()     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            r9.A05 = r0     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            r2.A05 = r0     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            monitor-enter(r6)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            java.util.List r11 = r6.A0N     // Catch:{ all -> 0x0fdb }
            r11.clear()     // Catch:{ all -> 0x0fdb }
            r11.add(r9)     // Catch:{ all -> 0x0fdb }
            r11.add(r2)     // Catch:{ all -> 0x0fdb }
            r11.add(r1)     // Catch:{ all -> 0x0fdb }
            monitor-exit(r6)     // Catch:{ all -> 0x0fdb }
            X.1hs r0 = r6.A0F     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            r21 = r0
            java.util.Iterator r1 = X.C61102zi.A03(r21)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
        L_0x0630:
            boolean r0 = r1.hasNext()     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            if (r0 == 0) goto L_0x0640
            java.lang.Object r0 = r1.next()     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            X.4FE r0 = (X.AnonymousClass4FE) r0     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            r0.BSc()     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            goto L_0x0630
        L_0x0640:
            r6.A05()     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            X.2qO r15 = r6.A0C     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            r15.A02(r13)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            r15.A00()     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            X.317 r2 = r6.A0I     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            r2.A0G()     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            X.3Lj r0 = r6.A07     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            r0.A03(r7)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            X.2eR r14 = r6.A0D     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            java.lang.String r0 = "messages"
            java.io.File r9 = r14.A00(r0)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            X.36W r0 = r6.A08     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            r0.A0J(r13, r9)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            java.lang.String r0 = "ExportFlowManager/doExport()/data-exported"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            X.2qE r0 = r6.A0H     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            r20 = r0
            java.lang.String r1 = "migration/messages_export.zip"
            long r0 = r0.A02(r9, r1, r5)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            java.lang.String r9 = "ExportFlowManager/doExport()/master-file: "
            X.C18260x0.A10(r9, r10, r0)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            r16 = 0
            int r9 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r9 < 0) goto L_0x0fde
            java.lang.String r0 = "enc-metadata"
            java.io.File r18 = r14.A00(r0)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            X.1VX r9 = r6.A05     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            r1 = 1387(0x56b, float:1.944E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            boolean r1 = r9.A0Y(r0, r1)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            r0 = 10
            X.1at r0 = r6.A01(r0)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            r11.add(r0)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            java.io.FileOutputStream r0 = X.AnonymousClass0x9.A0h(r18)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            java.util.zip.ZipOutputStream r9 = new java.util.zip.ZipOutputStream     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            r9.<init>(r0)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            r15.A03(r13, r9, r5)     // Catch:{ all -> 0x0fd1 }
            X.2OZ r14 = r6.A0G     // Catch:{ all -> 0x0fd1 }
            if (r1 != 0) goto L_0x06af
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0fd1 }
        L_0x06af:
            java.lang.String r1 = "attempt.json"
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0fd1 }
            r0.<init>(r1)     // Catch:{ all -> 0x0fd1 }
            r9.putNextEntry(r0)     // Catch:{ all -> 0x0fd1 }
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0fd1 }
            r1.<init>(r9)     // Catch:{ all -> 0x0fd1 }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x0fd1 }
            r0.<init>(r1)     // Catch:{ all -> 0x0fd1 }
            android.util.JsonWriter r10 = new android.util.JsonWriter     // Catch:{ all -> 0x0fd1 }
            r10.<init>(r0)     // Catch:{ all -> 0x0fd1 }
            r10.beginObject()     // Catch:{ all -> 0x0fd1 }
            X.2rI r0 = r14.A01     // Catch:{ all -> 0x0fc1 }
            java.lang.String r1 = r0.A02()     // Catch:{ all -> 0x0fc1 }
            java.lang.String r0 = "attemptInfo"
            r10.name(r0)     // Catch:{ all -> 0x0fc1 }
            r10.beginObject()     // Catch:{ all -> 0x0fc1 }
            java.lang.String r0 = "attemptId"
            r10.name(r0)     // Catch:{ all -> 0x0fc1 }
            r10.value(r1)     // Catch:{ all -> 0x0fc1 }
            r10.endObject()     // Catch:{ all -> 0x0fc1 }
            X.33i r13 = r14.A00     // Catch:{ all -> 0x0fc1 }
            X.2y5 r1 = r14.A02     // Catch:{ all -> 0x0fc1 }
            java.lang.String r0 = "donorInfo"
            r10.name(r0)     // Catch:{ all -> 0x0fc1 }
            r10.beginObject()     // Catch:{ all -> 0x0fc1 }
            java.lang.String r0 = "deviceName"
            r10.name(r0)     // Catch:{ all -> 0x0fc1 }
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0fc1 }
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0fc1 }
            r14.append(r0)     // Catch:{ all -> 0x0fc1 }
            java.lang.String r0 = "-"
            r14.append(r0)     // Catch:{ all -> 0x0fc1 }
            java.lang.String r0 = android.os.Build.MODEL     // Catch:{ all -> 0x0fc1 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r14)     // Catch:{ all -> 0x0fc1 }
            r10.value(r0)     // Catch:{ all -> 0x0fc1 }
            java.lang.String r0 = "appVersion"
            r10.name(r0)     // Catch:{ all -> 0x0fc1 }
            java.lang.String r0 = "2.23.26.14"
            r10.value(r0)     // Catch:{ all -> 0x0fc1 }
            java.lang.String r0 = "osVersion"
            r10.name(r0)     // Catch:{ all -> 0x0fc1 }
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0fc1 }
            r10.value(r0)     // Catch:{ all -> 0x0fc1 }
            java.lang.String r0 = "buildType"
            r10.name(r0)     // Catch:{ all -> 0x0fc1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0fc1 }
            r10.value(r0)     // Catch:{ all -> 0x0fc1 }
            java.lang.String r0 = "yearClass2016"
            r10.name(r0)     // Catch:{ all -> 0x0fc1 }
            int r0 = X.AnonymousClass34G.A02(r13, r1)     // Catch:{ all -> 0x0fc1 }
            long r0 = (long) r0     // Catch:{ all -> 0x0fc1 }
            r10.value(r0)     // Catch:{ all -> 0x0fc1 }
            r10.endObject()     // Catch:{ all -> 0x0fc1 }
            boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x0fc1 }
            if (r0 != 0) goto L_0x07fb
            java.lang.String r0 = "loggingEvents"
            android.util.JsonWriter r0 = r10.name(r0)     // Catch:{ all -> 0x0fc1 }
            r0.beginArray()     // Catch:{ all -> 0x0fc1 }
            java.util.Iterator r13 = r11.iterator()     // Catch:{ all -> 0x0fc1 }
        L_0x0751:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0fc1 }
            if (r0 == 0) goto L_0x07f8
            java.lang.Object r11 = r13.next()     // Catch:{ all -> 0x0fc1 }
            X.1at r11 = (X.C25671at) r11     // Catch:{ all -> 0x0fc1 }
            java.lang.Integer r0 = r11.A05     // Catch:{ all -> 0x0fc1 }
            if (r0 == 0) goto L_0x0751
            int r0 = r0.intValue()     // Catch:{ all -> 0x0fc1 }
            if (r0 == 0) goto L_0x0751
            r10.beginObject()     // Catch:{ all -> 0x0fc1 }
            java.lang.Integer r0 = r11.A05     // Catch:{ all -> 0x0fc1 }
            if (r0 == 0) goto L_0x0792
            int r1 = r0.intValue()     // Catch:{ all -> 0x0fc1 }
            if (r1 == r5) goto L_0x0785
            if (r1 == r12) goto L_0x0782
            r0 = 10
            if (r1 == r0) goto L_0x077f
            r0 = 11
            if (r1 != r0) goto L_0x0792
            goto L_0x0788
        L_0x077f:
            java.lang.String r1 = "COMPLETED"
            goto L_0x078a
        L_0x0782:
            java.lang.String r1 = "STARTED"
            goto L_0x078a
        L_0x0785:
            java.lang.String r1 = "ENTERED"
            goto L_0x078a
        L_0x0788:
            java.lang.String r1 = "ATTEMPTED_TO_OPEN_LANDING_SCREEN"
        L_0x078a:
            java.lang.String r0 = "eventType"
            r10.name(r0)     // Catch:{ all -> 0x0fc1 }
            r10.value(r1)     // Catch:{ all -> 0x0fc1 }
        L_0x0792:
            java.lang.String r0 = "eventTypeCode"
            r10.name(r0)     // Catch:{ all -> 0x0fc1 }
            java.lang.Integer r0 = r11.A05     // Catch:{ all -> 0x0fc1 }
            r10.value(r0)     // Catch:{ all -> 0x0fc1 }
            java.lang.Long r0 = r11.A07     // Catch:{ all -> 0x0fc1 }
            if (r0 == 0) goto L_0x07aa
            java.lang.String r0 = "duration"
            r10.name(r0)     // Catch:{ all -> 0x0fc1 }
            java.lang.Long r0 = r11.A07     // Catch:{ all -> 0x0fc1 }
            r10.value(r0)     // Catch:{ all -> 0x0fc1 }
        L_0x07aa:
            java.lang.Long r0 = r11.A08     // Catch:{ all -> 0x0fc1 }
            if (r0 == 0) goto L_0x07b9
            java.lang.String r0 = "progress"
            r10.name(r0)     // Catch:{ all -> 0x0fc1 }
            java.lang.Long r0 = r11.A08     // Catch:{ all -> 0x0fc1 }
            r10.value(r0)     // Catch:{ all -> 0x0fc1 }
        L_0x07b9:
            java.lang.Double r0 = r11.A02     // Catch:{ all -> 0x0fc1 }
            if (r0 == 0) goto L_0x07c7
            java.lang.String r0 = "exportedDbSize"
            r10.name(r0)     // Catch:{ all -> 0x0fc1 }
            java.lang.Double r0 = r11.A02     // Catch:{ all -> 0x0fc1 }
            r10.value(r0)     // Catch:{ all -> 0x0fc1 }
        L_0x07c7:
            java.lang.Long r0 = r11.A06     // Catch:{ all -> 0x0fc1 }
            if (r0 == 0) goto L_0x07d6
            java.lang.String r0 = "storageAvailableSize"
            r10.name(r0)     // Catch:{ all -> 0x0fc1 }
            java.lang.Long r0 = r11.A06     // Catch:{ all -> 0x0fc1 }
            r10.value(r0)     // Catch:{ all -> 0x0fc1 }
        L_0x07d6:
            java.lang.Double r0 = r11.A00     // Catch:{ all -> 0x0fc1 }
            if (r0 == 0) goto L_0x07e5
            java.lang.String r0 = "waDbSize"
            r10.name(r0)     // Catch:{ all -> 0x0fc1 }
            java.lang.Double r0 = r11.A00     // Catch:{ all -> 0x0fc1 }
            r10.value(r0)     // Catch:{ all -> 0x0fc1 }
        L_0x07e5:
            java.lang.Double r0 = r11.A01     // Catch:{ all -> 0x0fc1 }
            if (r0 == 0) goto L_0x07f3
            java.lang.String r0 = "mediaSize"
            r10.name(r0)     // Catch:{ all -> 0x0fc1 }
            java.lang.Double r0 = r11.A01     // Catch:{ all -> 0x0fc1 }
            r10.value(r0)     // Catch:{ all -> 0x0fc1 }
        L_0x07f3:
            r10.endObject()     // Catch:{ all -> 0x0fc1 }
            goto L_0x0751
        L_0x07f8:
            r10.endArray()     // Catch:{ all -> 0x0fc1 }
        L_0x07fb:
            r10.endObject()     // Catch:{ all -> 0x0fd1 }
            r10.flush()     // Catch:{ all -> 0x0fd1 }
            r9.closeEntry()     // Catch:{ all -> 0x0fd1 }
            r9.close()     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            java.lang.String r11 = "migration/enc.zip"
            r0 = r20
            X.2wN r0 = r0.A01     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            java.lang.String r10 = r18.getCanonicalPath()     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            long r13 = r18.length()     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            java.lang.String r12 = ""
            r9 = r0
            r15 = r5
            long r0 = r9.A01(r10, r11, r12, r13, r15)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            java.lang.String r9 = "ExportFlowManager/doExport()/metadata-file: "
            X.C18260x0.A10(r9, r10, r0)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            int r9 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r9 < 0) goto L_0x0fb7
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            monitor-enter(r6)
            java.util.concurrent.CountDownLatch r0 = r6.A01     // Catch:{ all -> 0x0fb4 }
            r0.countDown()     // Catch:{ all -> 0x0fb4 }
            r6.A01 = r4     // Catch:{ all -> 0x0fb4 }
            r6.A00 = r4     // Catch:{ all -> 0x0fb4 }
            monitor-exit(r6)     // Catch:{ all -> 0x0fb4 }
            A00(r8)
            r0 = 10
            r6.A07(r0)
            r6.A06()
            if (r19 != 0) goto L_0x08a9
            X.30Q r4 = r6.A0A
            X.2rI r0 = r4.A05
            X.8qC r0 = r0.A02
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass0x2.A0E(r0)
            java.lang.String r0 = "/export/provider_closed/timestamp"
            X.C18270x1.A0g(r1, r0)
            r4.A03()
            android.content.pm.PackageManager r1 = r4.A02
            android.content.ComponentName r0 = r4.A00
            r1.setComponentEnabledSetting(r0, r5, r5)
            java.lang.String r0 = "RegistrationManager/unregisterUserFromDevice"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33S r0 = r2.A0q
            r0.A00()
            X.8qC r0 = r2.A11
            X.3Lt r0 = X.AnonymousClass0x9.A0S(r0)
            r0.A0F(r5, r3)
            X.33b r0 = r2.A0r
            r0.A0D(r5)
            X.2sr r0 = r2.A0I
            r0.A0M()
            r0.A0N()
            java.lang.String r0 = "RegistrationManager/setMigrationExportStage"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33p r0 = r2.A0c
            r0.A0r()
            r0 = 11
            r2.A0B(r0, r5)
            X.2rI r4 = r6.A0B
            long r2 = java.lang.System.currentTimeMillis()
            X.8qC r0 = r4.A02
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass0x2.A0E(r0)
            java.lang.String r0 = "/export/start_time"
            X.C18270x1.A0i(r1, r0, r2)
            r4.A03()
            java.lang.String r0 = "ExportFlowManager/exportProviderAndLogout/complete"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x08a9:
            java.util.Iterator r1 = X.C61102zi.A03(r21)
        L_0x08ad:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r0 = r1.next()
            X.4FE r0 = (X.AnonymousClass4FE) r0
            r0.BSa()
            goto L_0x08ad
        L_0x08bd:
            java.lang.Object r7 = r3.A00
            com.whatsapp.migration.android.integration.service.GoogleMigrateService r7 = (com.whatsapp.migration.android.integration.service.GoogleMigrateService) r7
            java.lang.Object r6 = r3.A01
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            X.33i r0 = r7.A01
            android.os.PowerManager r2 = r0.A0J()
            java.lang.String r1 = "GoogleMigrateService/"
            if (r2 != 0) goto L_0x08da
            java.lang.String r0 = "OsUtil/acquireWakeLock()/pm=null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r5 = 0
        L_0x08d5:
            java.lang.String r4 = "GoogleMigrateService/onStartCommand/wakelock released"
            if (r5 == 0) goto L_0x08eb
            goto L_0x08e0
        L_0x08da:
            r0 = 1
            android.os.PowerManager$WakeLock r5 = X.AnonymousClass75K.A00(r2, r1, r0)
            goto L_0x08d5
        L_0x08e0:
            java.lang.String r0 = "GoogleMigrateService/onStartCommand/wakelock acquired"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x08ef }
            r0 = 14400000(0xdbba00, double:7.1145453E-317)
            r5.acquire(r0)     // Catch:{ Exception -> 0x08ef }
        L_0x08eb:
            r6.run()     // Catch:{ Exception -> 0x08ef }
            goto L_0x08fc
        L_0x08ef:
            r3 = move-exception
            X.2qk r2 = r7.A00     // Catch:{ all -> 0x10ed }
            java.lang.String r1 = "xpm-gms-async"
            java.lang.String r0 = X.AnonymousClass000.A0O(r6)     // Catch:{ all -> 0x10ed }
            r2.A09(r1, r0, r3)     // Catch:{ all -> 0x10ed }
        L_0x08fc:
            if (r5 == 0) goto L_0x0049
            boolean r0 = r5.isHeld()
            if (r0 == 0) goto L_0x0049
            com.whatsapp.util.Log.i((java.lang.String) r4)
            r5.release()
            return
        L_0x090b:
            java.lang.Object r0 = r3.A00
            X.3Qh r0 = (X.C67693Qh) r0
            java.lang.Object r1 = r3.A01
            java.util.List r1 = (java.util.List) r1
            X.2iB r2 = r0.A06
            java.lang.String r0 = "RecvPreKeyMessageListener/processPrekeysAsync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.HashSet r3 = X.AnonymousClass002.A0K()
            java.util.Iterator r7 = r1.iterator()
        L_0x0926:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x099f
            java.lang.Object r0 = r7.next()
            X.2T8 r0 = (X.AnonymousClass2T8) r0
            com.whatsapp.jid.DeviceJid r11 = r0.A01
            byte[] r14 = r0.A05
            byte[] r15 = r0.A06
            byte[] r6 = r0.A04
            byte r1 = r0.A00
            X.2Ov r12 = r0.A02
            X.2Ov r13 = r0.A03
            if (r12 != 0) goto L_0x0945
            r3.add(r11)
        L_0x0945:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "prekey request successful; initiating signal protocol session; jid="
            X.C18260x0.A1R(r5, r0, r11)
            int r0 = r11.getDevice()
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r0 != 0) goto L_0x0977
            X.33Z r0 = r2.A08
            r21 = 4
            r16 = r0
            r17 = r11
            r18 = r6
            r19 = r14
            r20 = r1
            boolean r0 = r16.A0C(r17, r18, r19, r20, r21)
            if (r0 != 0) goto L_0x0977
            java.lang.String r0 = "recvprekeymessagelistener/onGetPreKeySuccess adv verification fails"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r2.A00(r11)
            goto L_0x0926
        L_0x0977:
            X.2ov r9 = X.AnonymousClass36G.A02(r11)
            X.33n r10 = r2.A05
            X.3fa r8 = new X.3fa
            r16 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            monitor-enter(r2)
            X.3dH r6 = r2.A00     // Catch:{ all -> 0x1102 }
            if (r6 != 0) goto L_0x0997
            X.4FS r5 = r2.A09     // Catch:{ all -> 0x1102 }
            int r1 = X.AnonymousClass321.A00()     // Catch:{ all -> 0x1102 }
            r0 = 1
            X.3dH r6 = new X.3dH     // Catch:{ all -> 0x1102 }
            r6.<init>(r5, r1, r0)     // Catch:{ all -> 0x1102 }
            r2.A00 = r6     // Catch:{ all -> 0x1102 }
        L_0x0997:
            monitor-exit(r2)
            r6.execute(r8)
            r4.add(r8)
            goto L_0x0926
        L_0x099f:
            java.util.HashMap r7 = X.AnonymousClass001.A0t()
            java.util.Iterator r6 = r4.iterator()
        L_0x09a7:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x09de
            java.lang.Object r0 = r6.next()
            X.3fa r0 = (X.C73493fa) r0
            com.whatsapp.jid.DeviceJid r5 = r0.A00
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x09d4 }
            int r4 = X.AnonymousClass001.A0K(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x09d4 }
            if (r4 != 0) goto L_0x09c7
            boolean r0 = r3.contains(r5)     // Catch:{ InterruptedException | ExecutionException -> 0x09d4 }
            X.AnonymousClass000.A1C(r5, r7, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x09d4 }
            goto L_0x09a7
        L_0x09c7:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ InterruptedException | ExecutionException -> 0x09d4 }
            java.lang.String r0 = "Error received from SignalCoordinator; status="
            X.C18260x0.A0x(r0, r1, r4)     // Catch:{ InterruptedException | ExecutionException -> 0x09d4 }
            r2.A00(r5)     // Catch:{ InterruptedException | ExecutionException -> 0x09d4 }
            goto L_0x09a7
        L_0x09d4:
            r1 = move-exception
            java.lang.String r0 = "Error received from SignalCoordinator"
            com.whatsapp.util.Log.e(r0, r1)
            r2.A00(r5)
            goto L_0x09a7
        L_0x09de:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0049
            android.os.Handler r3 = r2.A01
            r0 = 6
            X.3Zy r1 = new X.3Zy
            r1.<init>(r2, r0, r7)
            goto L_0x118c
        L_0x09ee:
            java.lang.Object r0 = r3.A00
            X.2iB r0 = (X.C50442iB) r0
            java.lang.Object r3 = r3.A01
            java.util.List r3 = (java.util.List) r3
            X.1iU r2 = r0.A04
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AxolotlSessionObservable/notifyAxolotlSessionEstablished: jidList="
            X.C18260x0.A1P(r1, r0, r3)
            java.util.Iterator r1 = X.C61102zi.A03(r2)
        L_0x0a05:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r0 = r1.next()
            X.49g r0 = (X.C836549g) r0
            r0.BNB(r3)
            goto L_0x0a05
        L_0x0a15:
            java.lang.Object r8 = r3.A00
            X.3Lt r8 = (X.C66523Lt) r8
            java.lang.Object r1 = r3.A01
            java.lang.Number r1 = (java.lang.Number) r1
            X.2sH r0 = r8.A0S
            long r10 = r0.A0H()
            r4 = 1
            if (r1 == 0) goto L_0x0a39
            int r2 = r1.intValue()
            X.2rU r5 = r8.A0W
            monitor-enter(r5)
            android.content.SharedPreferences r1 = r5.A00     // Catch:{ all -> 0x1193 }
            java.lang.String r0 = "ab_props:sys:last_version"
            int r0 = X.C18280x3.A02(r1, r0)     // Catch:{ all -> 0x1193 }
            monitor-exit(r5)
            r5 = 1
            if (r2 > r0) goto L_0x0a3a
        L_0x0a39:
            r5 = 0
        L_0x0a3a:
            X.2rU r9 = r8.A0W
            long r6 = r9.A00()
            monitor-enter(r9)
            android.content.SharedPreferences r3 = r9.A00     // Catch:{ all -> 0x1190 }
            java.lang.String r2 = "ab_props:sys:refresh"
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r3.getLong(r2, r0)     // Catch:{ all -> 0x1190 }
            monitor-exit(r9)
            long r6 = r6 + r0
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0a5b
            long r1 = r9.A00()
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0a5b
            r4 = 0
        L_0x0a5b:
            if (r5 != 0) goto L_0x0a5f
            if (r4 == 0) goto L_0x0049
        L_0x0a5f:
            X.4C1 r0 = r8.A0y
            java.lang.Object r0 = r0.get()
            X.2bo r0 = (X.C46542bo) r0
            r0.A00(r5)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageHandler/maybeGetNewAbProps: AB props fetch: versionMismatch: "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = " AB Props too old:"
            r2.append(r0)
            r2.append(r4)
        L_0x0a7e:
            X.AnonymousClass0x2.A18(r2)
            return
        L_0x0a82:
            java.lang.Object r4 = r3.A00
            X.2hV r4 = (X.C50022hV) r4
            java.lang.Object r0 = r3.A01
            java.util.Iterator r11 = X.C18320x8.A0q(r0)
        L_0x0a8c:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0049
            X.4uZ r7 = X.C18300x5.A0P(r11)
            boolean r0 = r7 instanceof X.C95804uY
            if (r0 != 0) goto L_0x0a8c
            boolean r0 = r7 instanceof X.C28011fL
            if (r0 == 0) goto L_0x0bad
            X.2ba r1 = r4.A02
            r0 = r7
            X.1fL r0 = (X.C28011fL) r0
            X.33k r2 = r1.A00(r0)
        L_0x0aa7:
            r3 = 0
            if (r2 == 0) goto L_0x0ab9
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x0ab9
            X.2Vy r5 = r4.A01
            monitor-enter(r5)
            if (r7 == 0) goto L_0x0abb
            java.util.Map r0 = r5.A00     // Catch:{ all -> 0x1193 }
            r0.remove(r7)     // Catch:{ all -> 0x1193 }
            goto L_0x0abb
        L_0x0ab9:
            r9 = 0
            goto L_0x0abd
        L_0x0abb:
            monitor-exit(r5)
            r9 = 1
        L_0x0abd:
            X.2Vy r6 = r4.A01
            monitor-enter(r6)
            if (r7 == 0) goto L_0x0ad8
            java.util.Map r1 = r6.A00     // Catch:{ all -> 0x1196 }
            boolean r0 = r1.containsKey(r7)     // Catch:{ all -> 0x1196 }
            if (r0 == 0) goto L_0x0ad5
            monitor-exit(r6)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FetchPrekey/requestFetch prekeys already requested: "
            X.C18260x0.A1R(r1, r0, r7)
            goto L_0x0a8c
        L_0x0ad5:
            X.C18280x3.A1D(r7, r1, r3)     // Catch:{ all -> 0x1196 }
        L_0x0ad8:
            monitor-exit(r6)
            if (r2 == 0) goto L_0x0add
            r2.A0A = r3
        L_0x0add:
            boolean r5 = r7 instanceof X.C135166kE
            if (r5 == 0) goto L_0x0afa
            X.2o7 r1 = r4.A04
            X.3dV r0 = r1.A08
            X.4Fq r8 = r0.A04()
            X.3Yo r2 = r8.Axl()     // Catch:{ all -> 0x11a3 }
            r0 = 0
            r1.A02(r0, r3)     // Catch:{ all -> 0x1199 }
            r2.A00()     // Catch:{ all -> 0x1199 }
            r2.close()     // Catch:{ all -> 0x11a3 }
            r8.close()
        L_0x0afa:
            X.3Lp r8 = r4.A03
            if (r9 == 0) goto L_0x0b47
            r10 = r7
            X.1fL r10 = (X.C28011fL) r10
            X.2sj r0 = r8.A06
            X.33h r9 = r0.A09
            X.33k r1 = r9.A07(r10)
            X.2sr r2 = r8.A02
            r0 = 1
            java.util.Set r1 = r1.A0G(r2, r0)
            X.33k r0 = r9.A07(r10)
            java.util.Set r0 = r0.A0G(r2, r3)
            r1.addAll(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0b78
            java.util.List r0 = X.C66483Lp.A00(r1)
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r0.iterator()
        L_0x0b2d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0b7c
            java.lang.Object r1 = r2.next()
            java.util.List r1 = (java.util.List) r1
            X.33n r0 = r8.A04
            java.util.Set r0 = r0.A0H(r1)
            java.util.List r0 = X.AnonymousClass36G.A05(r0)
            r9.addAll(r0)
            goto L_0x0b2d
        L_0x0b47:
            r0 = 0
            java.util.Set r1 = r8.A03(r7, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0b78
            java.util.List r0 = X.C66483Lp.A00(r1)
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r0.iterator()
        L_0x0b5e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0b7c
            java.lang.Object r1 = r2.next()
            java.util.List r1 = (java.util.List) r1
            X.33n r0 = r8.A04
            java.util.Set r0 = r0.A0H(r1)
            java.util.List r0 = X.AnonymousClass36G.A05(r0)
            r9.addAll(r0)
            goto L_0x0b5e
        L_0x0b78:
            java.util.Set r9 = java.util.Collections.emptySet()
        L_0x0b7c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FetchPrekey/requestFetch missing sessions: "
            X.C18260x0.A1R(r1, r0, r9)
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0a8c
            int r1 = r9.size()
            monitor-enter(r6)
            if (r7 == 0) goto L_0x0b97
            java.util.Map r0 = r6.A00     // Catch:{ all -> 0x11ad }
            X.C18280x3.A1D(r7, r0, r1)     // Catch:{ all -> 0x11ad }
        L_0x0b97:
            monitor-exit(r6)
            com.whatsapp.jid.DeviceJid[] r0 = new com.whatsapp.jid.DeviceJid[r3]
            java.lang.Object[] r2 = r9.toArray(r0)
            com.whatsapp.jid.DeviceJid[] r2 = (com.whatsapp.jid.DeviceJid[]) r2
            r1 = 10
            if (r5 == 0) goto L_0x0ba6
            r1 = 13
        L_0x0ba6:
            X.2qR r0 = r4.A00
            r0.A04(r2, r1, r3)
            goto L_0x0a8c
        L_0x0bad:
            r2 = 0
            goto L_0x0aa7
        L_0x0bb0:
            java.lang.Object r1 = r3.A00
            X.2iH r1 = (X.C50502iH) r1
            java.lang.Object r0 = r3.A01
            X.34x r0 = (X.C624134x) r0
            r1.A01(r0)
            return
        L_0x0bbc:
            java.lang.Object r5 = r3.A00
            X.2rc r5 = (X.C56212rc) r5
            java.lang.Object r7 = r3.A01
            X.4uY r7 = (X.C95804uY) r7
            X.2rr r0 = r5.A05
            long r3 = r0.A06(r7)
            r1 = 100
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0bd4
            r5.A00(r7)
            return
        L_0x0bd4:
            X.2nm r6 = r5.A0B
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            r8 = 0
            r13 = 0
            r11 = 50
            r9 = r8
            r6.A00(r7, r8, r9, r10, r11, r13)
            r5.A01(r7)
            return
        L_0x0be6:
            java.lang.Object r0 = r3.A00
            X.5Jw r0 = (X.C102685Jw) r0
            java.lang.Object r1 = r3.A01
            X.4uZ r1 = (X.C95814uZ) r1
            X.1ib r0 = r0.A01
            r0.A08(r1)
            return
        L_0x0bf4:
            java.lang.Object r1 = r3.A00
            X.2se r1 = (X.C56842se) r1
            java.lang.Object r6 = r3.A01
            X.4uY r6 = (X.C95804uY) r6
            X.2SP r5 = r1.A0M
            X.2sL r0 = r1.A0B
            X.2g3 r4 = new X.2g3
            r4.<init>(r0, r6, r1)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterLeaveMutationImpl$Builder r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterLeaveMutationImpl$Builder
            r0.<init>()
            java.lang.String r1 = r6.getRawString()
            X.2ie r3 = r0.A00
            java.lang.String r0 = "jid"
            r3.A02(r0, r1)
            boolean r0 = X.AnonymousClass000.A1W(r1)
            X.C162187rP.A06(r0)
            java.lang.String r2 = "NewsletterLeave"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterLeaveResponseImpl> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterLeaveResponseImpl.class
            X.7J9 r1 = new X.7J9
            r1.<init>(r3, r0, r2)
            X.8qC r0 = r5.A05
            r0.get()
            X.2gi r0 = r5.A01
            X.2fG r2 = r0.A01(r1)
            r1 = 3
            goto L_0x0cee
        L_0x0c33:
            java.lang.Object r1 = r3.A00
            X.2se r1 = (X.C56842se) r1
            java.lang.Object r6 = r3.A01
            X.4uY r6 = (X.C95804uY) r6
            X.2QN r5 = r1.A0L
            X.2sL r0 = r1.A0B
            X.2g3 r4 = new X.2g3
            r4.<init>(r0, r6, r1)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterUnmuteMutationImpl$Builder r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterUnmuteMutationImpl$Builder
            r0.<init>()
            java.lang.String r1 = r6.getRawString()
            X.2ie r3 = r0.A00
            java.lang.String r0 = "newsletter_id"
            r3.A02(r0, r1)
            boolean r0 = X.AnonymousClass000.A1W(r1)
            X.C162187rP.A06(r0)
            java.lang.String r2 = "NewsletterUnmute"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterUnmuteResponseImpl> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterUnmuteResponseImpl.class
            X.7J9 r1 = new X.7J9
            r1.<init>(r3, r0, r2)
            X.8qC r0 = r5.A03
            r0.get()
            X.2gi r0 = r5.A00
            X.2fG r2 = r0.A01(r1)
            r1 = 1
            goto L_0x0cee
        L_0x0c72:
            java.lang.Object r1 = r3.A00
            X.2se r1 = (X.C56842se) r1
            java.lang.Object r6 = r3.A01
            X.4uY r6 = (X.C95804uY) r6
            X.2SP r5 = r1.A0M
            X.2sL r0 = r1.A0B
            X.2g3 r4 = new X.2g3
            r4.<init>(r0, r6, r1)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterJoinMutationImpl$Builder r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterJoinMutationImpl$Builder
            r0.<init>()
            java.lang.String r1 = r6.getRawString()
            X.2ie r3 = r0.A00
            java.lang.String r0 = "jid"
            r3.A02(r0, r1)
            boolean r0 = X.AnonymousClass000.A1W(r1)
            X.C162187rP.A06(r0)
            java.lang.String r2 = "NewsletterJoin"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterJoinResponseImpl> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterJoinResponseImpl.class
            X.7J9 r1 = new X.7J9
            r1.<init>(r3, r0, r2)
            X.8qC r0 = r5.A05
            r0.get()
            X.2gi r0 = r5.A01
            X.2fG r2 = r0.A01(r1)
            r1 = 2
            goto L_0x0cee
        L_0x0cb0:
            java.lang.Object r1 = r3.A00
            X.2se r1 = (X.C56842se) r1
            java.lang.Object r6 = r3.A01
            X.4uY r6 = (X.C95804uY) r6
            X.2QN r5 = r1.A0L
            X.2sL r0 = r1.A0B
            X.2g3 r4 = new X.2g3
            r4.<init>(r0, r6, r1)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMuteMutationImpl$Builder r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMuteMutationImpl$Builder
            r0.<init>()
            java.lang.String r1 = r6.getRawString()
            X.2ie r3 = r0.A00
            java.lang.String r0 = "newsletter_id"
            r3.A02(r0, r1)
            boolean r0 = X.AnonymousClass000.A1W(r1)
            X.C162187rP.A06(r0)
            java.lang.String r2 = "NewsletterMute"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterMuteResponseImpl> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterMuteResponseImpl.class
            X.7J9 r1 = new X.7J9
            r1.<init>(r3, r0, r2)
            X.8qC r0 = r5.A03
            r0.get()
            X.2gi r0 = r5.A00
            X.2fG r2 = r0.A01(r1)
            r1 = 0
        L_0x0cee:
            X.4HL r0 = new X.4HL
            r0.<init>(r6, r4, r5, r1)
            X.7UH r0 = r2.A00(r0)
            r0.A00()
            return
        L_0x0cfb:
            java.lang.Object r2 = r3.A00
            X.4DH r2 = (X.AnonymousClass4DH) r2
            java.lang.Object r1 = r3.A01
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            X.C162457s7.A0J(r1, r0)
            r0 = 0
            r2.BiS(r0, r1)
            return
        L_0x0d0c:
            java.lang.Object r0 = r3.A00
            X.7qM r0 = (X.C161747qM) r0
            java.lang.Object r1 = r3.A01
            X.4uZ r1 = (X.C95814uZ) r1
            X.1in r0 = r0.A02
            r0.A08(r1)
            return
        L_0x0d1a:
            java.lang.Object r1 = r3.A00
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.Object r0 = r3.A01
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r1.setImageBitmap(r0)
            return
        L_0x0d26:
            java.lang.Object r0 = r3.A00
            X.2bi r0 = (X.C46492bi) r0
            java.lang.Object r2 = r3.A01
            X.34x r2 = (X.C624134x) r2
            X.1io r1 = r0.A01
            r0 = 28
            r1.A0C(r2, r0)
            return
        L_0x0d36:
            java.lang.Object r5 = r3.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r5 = (com.whatsapp.newsletter.NewsletterInfoActivity) r5
            java.lang.Object r4 = r3.A01
            java.util.List r4 = (java.util.List) r4
            r3 = 0
            r0 = 1
            r2 = 2131893205(0x7f121bd5, float:1.942118E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = r5.A7M(r4)
            java.lang.String r3 = X.C18300x5.A0e(r5, r0, r1, r3, r2)
            X.0df r2 = r5.getSupportFragmentManager()
            r1 = 0
            X.21J r0 = X.AnonymousClass21J.REVOKE
            com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog r0 = X.AnonymousClass27t.A00(r0, r3, r1, r4)
            X.AnonymousClass344.A01(r0, r2)
            return
        L_0x0d5c:
            java.lang.Object r3 = r3.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.corruptinstallation.CorruptInstallationActivity"
            r2.setClassName(r1, r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r0 = r2.setFlags(r0)
            r3.startActivity(r0)
            return
        L_0x0d77:
            java.lang.Object r2 = r3.A00
            X.2nM r2 = (X.C53602nM) r2
            java.lang.Object r1 = r3.A01
            X.03q r1 = (X.C003203q) r1
            java.lang.String r0 = "chat-transfer-help"
            r2.A01(r1, r0)
            return
        L_0x0d85:
            java.lang.Object r4 = r3.A00
            X.1gh r4 = (X.C28341gh) r4
            java.lang.Object r0 = r3.A01
            com.airbnb.lottie.LottieAnimationView r2 = r4.A01
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "chat_transfer_android_to_android_lottie_animation.json"
            r2.setAnimationFromJson(r1, r0)
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = r4.A09
            X.08M r0 = r0.A0H
            java.lang.Object r0 = r0.A07()
            X.2UG r0 = (X.AnonymousClass2UG) r0
            r4.A7B(r0)
            return
        L_0x0da4:
            java.lang.Object r4 = r3.A00
            X.2iR r4 = (X.C50592iR) r4
            java.lang.Object r2 = r3.A01
            X.2HG r2 = (X.AnonymousClass2HG) r2
            X.33p r1 = r4.A06
            java.lang.String r0 = "chat_transfer_intent_to_migrate_last_set_timestamp"
            r1.A1Y(r0)
            X.317 r0 = r4.A0L
            r0.A0G()
            X.3Lj r1 = r4.A0B
            r0 = 0
            r1.A03(r0)
            java.lang.String r0 = "fpm/ExportHelper/disconnectFromServer()/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = r2.A00
            r0.A0F()
            java.lang.String r0 = "fpm/ExportHelper/prepareForAuthentication()/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0dce:
            java.lang.Object r5 = r3.A00
            X.3Qg r5 = (X.C67683Qg) r5
            java.lang.Object r4 = r3.A01
            X.39T r4 = (X.AnonymousClass39T) r4
            X.2Ki r7 = r5.A00
            com.whatsapp.jid.Jid r0 = r4.A02
            com.whatsapp.jid.DeviceJid r6 = X.C18320x8.A0O(r0)
            java.lang.String r2 = r4.A07
            java.lang.StringBuilder r1 = X.C18290x4.A0u(r2)
            java.lang.String r0 = "PeerMessageReceiptHandler/handleDeliveryReceipt/peerDevice: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "; msgId: "
            X.C18260x0.A0s(r0, r2, r1)
            X.2rl r3 = r7.A01
            X.1mE r2 = r3.A03(r6, r2)
            if (r2 != 0) goto L_0x0e04
            java.lang.String r0 = "PeerMessageReceiptHandler/handleDeliveryReceipt/no such message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0dfe:
            X.33S r0 = r5.A01
            r0.A01(r4)
            return
        L_0x0e04:
            boolean r0 = r2 instanceof X.AnonymousClass1nO
            if (r0 == 0) goto L_0x0e14
            java.lang.String r0 = "PeerMessageReceiptHandler/handleDeliveryReceipt/skipping history sync notification message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Ek r1 = r7.A00
            r0 = -1
            r1.A0E(r2, r0)
            goto L_0x0dfe
        L_0x0e14:
            long r0 = r2.A1L
            X.C626936e.A00()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r3.A06(r0)
            goto L_0x0dfe
        L_0x0e25:
            java.lang.Object r4 = r3.A00
            X.3Lj r4 = (X.C66423Lj) r4
            java.lang.Object r2 = r3.A01
            X.1mH r2 = (X.C30331mH) r2
            X.2oz r0 = r4.A0K
            r0.A02(r2)
            boolean r0 = r2 instanceof X.C30571mf
            if (r0 == 0) goto L_0x0e6a
            X.2iH r3 = r4.A0O
            r5 = r2
            X.1mf r5 = (X.C30571mf) r5
            X.2z0 r1 = X.C624134x.A07(r5)
            boolean r0 = r1.A02
            java.lang.String r7 = "Failed requirement."
            if (r0 == 0) goto L_0x0e94
            X.4uZ r6 = r1.A00
            boolean r0 = r6 instanceof X.C95804uY
            if (r0 == 0) goto L_0x0e8f
            X.2ss r1 = r3.A03
            X.5UP r0 = r3.A05
            X.4uY r6 = (X.C95804uY) r6
            boolean r0 = X.C106855aH.A04(r1, r6, r0)
            if (r0 == 0) goto L_0x0e6a
            X.2z0 r1 = r5.A1v()
            if (r1 == 0) goto L_0x0e8a
            X.2qz r0 = r3.A0A
            X.34x r7 = r0.A05(r1)
            if (r7 != 0) goto L_0x0e70
            java.lang.String r0 = "NewsletterMessageManager/message not found/ignore"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0e6a:
            X.2iH r0 = r4.A0O
            r0.A00(r2)
            return
        L_0x0e70:
            X.2qf r6 = r3.A07
            r13 = 1
            X.2sH r0 = r3.A02
            long r11 = r0.A0H()
            r8 = 0
            java.lang.String r10 = r5.A01
            java.lang.Long r9 = X.C56612sH.A09(r0)
            r14 = r13
            r6.A02(r7, r8, r9, r10, r11, r13, r14)
            X.2rZ r0 = r3.A06
            r0.A04(r7)
            goto L_0x0e6a
        L_0x0e8a:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r7)
            throw r0
        L_0x0e8f:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r7)
            throw r0
        L_0x0e94:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r7)
            throw r0
        L_0x0e99:
            java.lang.Object r2 = r3.A00
            X.3Lj r2 = (X.C66423Lj) r2
            java.lang.Object r1 = r3.A01
            X.34x r1 = (X.C624134x) r1
            X.2oz r0 = r2.A0K
            r0.A02(r1)
            X.2iH r0 = r2.A0O
            r0.A00(r1)
            return
        L_0x0eac:
            java.lang.Object r0 = r3.A00
            X.2dH r0 = (X.C47452dH) r0
            java.lang.Object r5 = r3.A01
            X.3ST r5 = (X.AnonymousClass3ST) r5
            X.2dP r0 = r0.A04
            X.33f r4 = r0.A07
            X.2z0 r3 = X.AnonymousClass3ST.A00(r5)
            long r0 = r5.A16
            X.1mc r2 = new X.1mc
            r2.<init>(r3, r0)
            com.whatsapp.jid.Jid r0 = r5.A0E
            X.4uZ r0 = X.C627336j.A02(r0)
            r2.A1J(r0)
            r0 = -1
            r2.A02 = r0
            r0 = 16
            r2.A1G(r0)
            r0 = 0
            r4.A03(r2, r0)
            return
        L_0x0eda:
            java.lang.Object r0 = r3.A00
            X.2dH r0 = (X.C47452dH) r0
            java.lang.Object r2 = r3.A01
            X.3ST r2 = (X.AnonymousClass3ST) r2
            X.2dP r1 = r0.A04
            r0 = 0
            r1.A00(r0, r2)
            return
        L_0x0ee9:
            java.lang.Object r0 = r3.A00
            X.3Qh r0 = (X.C67693Qh) r0
            java.lang.Object r1 = r3.A01
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            X.2iB r0 = r0.A06
            r0.A00(r1)
            return
        L_0x0ef7:
            java.lang.Object r0 = r3.A00
            X.3Qh r0 = (X.C67693Qh) r0
            java.lang.Object r1 = r3.A01
            java.util.List r1 = (java.util.List) r1
            X.2iB r0 = r0.A06
            r0.A01(r1)
            return
        L_0x0f05:
            java.lang.Object r1 = r3.A00
            X.33Y r1 = (X.AnonymousClass33Y) r1
            java.lang.Object r0 = r3.A01
            X.34x r0 = (X.C624134x) r0
            X.2dC r1 = r1.A05
            X.4uZ r2 = X.AnonymousClass2z0.A00(r0)
            long r3 = r0.A1L
            long r5 = r0.A1M
            r1.A00(r2, r3, r5)
            return
        L_0x0f1b:
            java.lang.Object r0 = r3.A00
            X.33Y r0 = (X.AnonymousClass33Y) r0
            java.lang.Object r2 = r3.A01
            X.34x r2 = (X.C624134x) r2
            X.2sC r1 = r0.A04     // Catch:{ IOException -> 0x0f2a }
            r0 = 0
            r1.A07(r2, r0)     // Catch:{ IOException -> 0x0f2a }
            return
        L_0x0f2a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.C18280x3.A0e()
            java.lang.String r0 = "/updateMessageToRead Failed to update msg status back to "
            r1.append(r0)
            r0 = 16
            r1.append(r0)
            X.C18280x3.A1C(r1, r2)
            return
        L_0x0f3d:
            java.lang.Object r1 = r3.A00
            X.49i r1 = (X.C836749i) r1
            java.lang.Object r0 = r3.A01
            X.2a1 r0 = (X.C45442a1) r0
            byte[] r0 = r0.A02
            r1.BF5(r0)
            return
        L_0x0f4b:
            java.lang.Object r0 = r3.A00
            X.3G6 r0 = (X.AnonymousClass3G6) r0
            java.lang.Object r1 = r3.A01
            X.34w r1 = (X.C624034w) r1
            X.1iY r0 = r0.A0d
            r0.A08(r1)
            return
        L_0x0f59:
            java.lang.Object r0 = r3.A00
            X.3G6 r0 = (X.AnonymousClass3G6) r0
            java.lang.Object r1 = r3.A01
            X.4uZ r1 = (X.C95814uZ) r1
            X.3Ex r0 = r0.A08
            r0.A0A(r1)
            r0.A0K()
            return
        L_0x0f6a:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0f6c }
        L_0x0f6c:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r1, r3)     // Catch:{ all -> 0x0f71 }
            throw r0     // Catch:{ all -> 0x0f71 }
        L_0x0f71:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x10fd }
        L_0x0f73:
            r1 = move-exception
            monitor-exit(r7)
            throw r1
        L_0x0f76:
            X.1hx r2 = r6.A02     // Catch:{ IOException -> 0x0f86 }
            r1 = 602(0x25a, float:8.44E-43)
            java.lang.String r0 = "failure to start discoverable service"
            r2.A0A(r1, r0)     // Catch:{ IOException -> 0x0f86 }
            return
        L_0x0f80:
            java.lang.String r0 = "fpm/ReceiverConnectionHandler/interrupted while starting discoverable service"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0f86 }
            return
        L_0x0f86:
            r1 = move-exception
            java.lang.String r0 = "fpm/ReceiverChatTransferService/failed to start receiver service"
            com.whatsapp.util.Log.i(r0, r1)
            X.1hx r2 = r4.A04
            r1 = 601(0x259, float:8.42E-43)
            java.lang.String r0 = "failed to start receiver service"
            r2.A0A(r1, r0)
            r4.stopSelf()
            return
        L_0x0f99:
            java.lang.String r10 = r0.A03
            X.4FS r9 = r4.A09
            X.1hx r6 = r4.A05
            X.2HD r7 = new X.2HD
            r7.<init>(r4)
            X.2We r8 = new X.2We
            r8.<init>(r4)
            X.2zX r5 = new X.2zX
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A06 = r5
            r5.A01()
            return
        L_0x0fb4:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0fb4 }
            throw r1
        L_0x0fb7:
            r1 = 503(0x1f7, float:7.05E-43)
            java.lang.String r0 = "ExportFlowManager/Failed to register encryption metadata file."
            X.1zv r2 = new X.1zv     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            r2.<init>(r1, r0)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            goto L_0x0fe7
        L_0x0fc1:
            r1 = move-exception
            r10.endObject()     // Catch:{ all -> 0x0fcc }
            r10.flush()     // Catch:{ all -> 0x0fcc }
            r9.closeEntry()     // Catch:{ all -> 0x0fcc }
            goto L_0x0fd0
        L_0x0fcc:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0fd1 }
        L_0x0fd0:
            throw r1     // Catch:{ all -> 0x0fd1 }
        L_0x0fd1:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0fd6 }
            goto L_0x0fda
        L_0x0fd6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
        L_0x0fda:
            throw r1     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
        L_0x0fdb:
            r2 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0fdb }
            goto L_0x0fe7
        L_0x0fde:
            r1 = 502(0x1f6, float:7.03E-43)
            java.lang.String r0 = "ExportFlowManager/Failed to register master file."
            X.1zv r2 = new X.1zv     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
            r2.<init>(r1, r0)     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
        L_0x0fe7:
            throw r2     // Catch:{ OperationCanceledException -> 0x10c2, Exception -> 0x0fe8 }
        L_0x0fe8:
            r10 = move-exception
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/failed"
            com.whatsapp.util.Log.e(r0, r10)     // Catch:{ all -> 0x10aa }
            boolean r0 = r10 instanceof X.C83914Ah     // Catch:{ all -> 0x10aa }
            if (r0 == 0) goto L_0x1019
            r0 = r10
            X.4Ah r0 = (X.C83914Ah) r0     // Catch:{ all -> 0x10aa }
            int r5 = r0.B9k()     // Catch:{ all -> 0x10aa }
            r0 = 103(0x67, float:1.44E-43)
            if (r5 == r0) goto L_0x100a
            switch(r5) {
                case 501: goto L_0x1007;
                case 502: goto L_0x1004;
                case 503: goto L_0x1001;
                default: goto L_0x1000;
            }     // Catch:{ all -> 0x10aa }
        L_0x1000:
            goto L_0x100d
        L_0x1001:
            r3 = 12
            goto L_0x1019
        L_0x1004:
            r3 = 8
            goto L_0x1019
        L_0x1007:
            r3 = 9
            goto L_0x1019
        L_0x100a:
            r3 = 13
            goto L_0x1019
        L_0x100d:
            X.2qk r2 = r6.A02     // Catch:{ all -> 0x10aa }
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x10aa }
            java.lang.String r0 = "xpm-export-unexpected-migration-error-code"
            r2.A0A(r0, r7, r1)     // Catch:{ all -> 0x10aa }
        L_0x1019:
            boolean r0 = r10 instanceof X.AnonymousClass1gV     // Catch:{ all -> 0x10aa }
            if (r0 == 0) goto L_0x1032
            java.lang.String r9 = "EncryptionKeyException"
        L_0x101f:
            X.2qk r7 = r6.A02     // Catch:{ all -> 0x10aa }
            java.lang.String r2 = "xpm-export-failed"
            java.lang.StringBuilder r1 = X.C18320x8.A0j(r5)     // Catch:{ all -> 0x10aa }
            java.lang.String r0 = "; "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r9, r1)     // Catch:{ all -> 0x10aa }
            r7.A09(r2, r0, r10)     // Catch:{ all -> 0x10aa }
            goto L_0x1037
        L_0x1032:
            java.lang.String r9 = X.C18310x6.A0n(r10)     // Catch:{ all -> 0x10aa }
            goto L_0x101f
        L_0x1037:
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            monitor-enter(r6)
            java.util.concurrent.CountDownLatch r0 = r6.A01     // Catch:{ all -> 0x10a7 }
            r0.countDown()     // Catch:{ all -> 0x10a7 }
            r6.A01 = r4     // Catch:{ all -> 0x10a7 }
            r6.A00 = r4     // Catch:{ all -> 0x10a7 }
            monitor-exit(r6)     // Catch:{ all -> 0x10a7 }
            A00(r8)
            X.2rI r7 = r6.A0B
            java.lang.String r8 = r7.A02()
            X.8qC r0 = r6.A0L
            java.lang.Object r10 = r0.get()
            X.2ws r10 = (X.C59412ws) r10
            X.8qC r0 = r6.A0M
            long r1 = X.C61072zf.A00(r0)
            X.1at r4 = new X.1at
            r4.<init>()
            r4.A09 = r8
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            r4.A03 = r0
            java.lang.Integer r0 = X.C18290x4.A0b()
            r4.A05 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r4.A04 = r0
            long r8 = r6.A00()
            long r8 = X.C18290x4.A0B(r8)
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r4.A07 = r0
            r0 = r22
            int r0 = r0.A00
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r4.A08 = r0
            long r0 = r10.A01(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A06 = r0
            X.4FV r0 = r6.A06
            r0.BhA(r4)
            r7.A03()
            X.1hs r0 = r6.A0F
            r0.A08(r5)
            goto L_0x10d5
        L_0x10a7:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x10a7 }
            throw r1
        L_0x10aa:
            r1 = move-exception
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            monitor-enter(r6)
            java.util.concurrent.CountDownLatch r0 = r6.A01     // Catch:{ all -> 0x10bf }
            r0.countDown()     // Catch:{ all -> 0x10bf }
            r6.A01 = r4     // Catch:{ all -> 0x10bf }
            r6.A00 = r4     // Catch:{ all -> 0x10bf }
            monitor-exit(r6)     // Catch:{ all -> 0x10bf }
            A00(r8)
            throw r1
        L_0x10bf:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x10bf }
            throw r1
        L_0x10c2:
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            monitor-enter(r6)
            java.util.concurrent.CountDownLatch r0 = r6.A01     // Catch:{ all -> 0x10e0 }
            r0.countDown()     // Catch:{ all -> 0x10e0 }
            r6.A01 = r4     // Catch:{ all -> 0x10e0 }
            r6.A00 = r4     // Catch:{ all -> 0x10e0 }
            monitor-exit(r6)     // Catch:{ all -> 0x10e0 }
            A00(r8)
        L_0x10d5:
            X.1hs r1 = r6.A0F
            r0 = r22
            r1.A07(r0)
            r6.A05()
            return
        L_0x10e0:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x10e0 }
            throw r1
        L_0x10e3:
            java.lang.String r0 = "ExportFlowManager/prepareExportData() already running, cannot start another export."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x10ea }
            throw r0     // Catch:{ all -> 0x10ea }
        L_0x10ea:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x10ea }
            throw r1
        L_0x10ed:
            r1 = move-exception
            if (r5 == 0) goto L_0x1101
            boolean r0 = r5.isHeld()
            if (r0 == 0) goto L_0x1101
            com.whatsapp.util.Log.i((java.lang.String) r4)
            r5.release()
            throw r1
        L_0x10fd:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r2, r0)
        L_0x1101:
            throw r1
        L_0x1102:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x1105:
            java.lang.Object r4 = r3.A00
            X.2iB r4 = (X.C50442iB) r4
            java.lang.Object r5 = r3.A01
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r0 = "completion callback for onGetPreKeySuccess"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2qR r6 = r4.A02
            monitor-enter(r6)
            java.util.Iterator r7 = X.AnonymousClass000.A0q(r5)     // Catch:{ all -> 0x1196 }
        L_0x1119:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x1196 }
            if (r0 == 0) goto L_0x116c
            java.util.Map$Entry r3 = X.AnonymousClass001.A0w(r7)     // Catch:{ all -> 0x1196 }
            com.whatsapp.jid.DeviceJid r2 = X.AnonymousClass0x9.A0Q(r3)     // Catch:{ all -> 0x1196 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x1196 }
            java.lang.String r0 = "prekeysmanager/onGetPreKeySuccess:"
            X.C18260x0.A1R(r1, r0, r2)     // Catch:{ all -> 0x1196 }
            java.util.Map r0 = r6.A08     // Catch:{ all -> 0x1196 }
            java.lang.Object r1 = r0.remove(r2)     // Catch:{ all -> 0x1196 }
            X.2Qn r1 = (X.C43042Qn) r1     // Catch:{ all -> 0x1196 }
            if (r1 == 0) goto L_0x1119
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x1196 }
            boolean r0 = X.AnonymousClass001.A1Z(r0)     // Catch:{ all -> 0x1196 }
            if (r0 == 0) goto L_0x1119
            int r0 = r1.A00     // Catch:{ all -> 0x1196 }
            int r3 = r1.A02     // Catch:{ all -> 0x1196 }
            int r2 = r1.A01     // Catch:{ all -> 0x1196 }
            X.1YS r1 = new X.1YS     // Catch:{ all -> 0x1196 }
            r1.<init>()     // Catch:{ all -> 0x1196 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x1196 }
            r1.A02 = r0     // Catch:{ all -> 0x1196 }
            if (r3 <= 0) goto L_0x115e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x1196 }
            r1.A01 = r0     // Catch:{ all -> 0x1196 }
        L_0x115e:
            if (r2 <= 0) goto L_0x1166
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x1196 }
            r1.A00 = r0     // Catch:{ all -> 0x1196 }
        L_0x1166:
            X.4FV r0 = r6.A06     // Catch:{ all -> 0x1196 }
            r0.BhD(r1)     // Catch:{ all -> 0x1196 }
            goto L_0x1119
        L_0x116c:
            r6.A00()     // Catch:{ all -> 0x1196 }
            monitor-exit(r6)
            java.util.Set r0 = r5.keySet()
            java.util.ArrayList r2 = X.AnonymousClass002.A0J(r0)
            X.2Mv r1 = r4.A03
            X.2VZ r0 = new X.2VZ
            r0.<init>(r2)
            X.2dt r0 = r1.A02
            r0.A00()
            android.os.Handler r3 = r4.A01
            r0 = 7
            X.3Zy r1 = new X.3Zy
            r1.<init>(r4, r0, r2)
        L_0x118c:
            r3.post(r1)
            return
        L_0x1190:
            r1 = move-exception
            monitor-exit(r9)
            throw r1
        L_0x1193:
            r1 = move-exception
            monitor-exit(r5)
            throw r1
        L_0x1196:
            r1 = move-exception
            monitor-exit(r6)
            throw r1
        L_0x1199:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x119e }
            goto L_0x11a2
        L_0x119e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x11a3 }
        L_0x11a2:
            throw r1     // Catch:{ all -> 0x11a3 }
        L_0x11a3:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x11a8 }
            throw r1
        L_0x11a8:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x11ad:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70113Zy.run():void");
    }
}
