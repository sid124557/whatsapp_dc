package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2qH  reason: invalid class name and case insensitive filesystem */
public class C55392qH {
    public final C64663Ek A00;
    public final C58582vU A01;
    public final C623934v A02;
    public final AnonymousClass2G5 A03;
    public final C50962j3 A04;

    public void A03(String str) {
        Cursor A0E;
        synchronized (this) {
            C623934v r7 = this.A02;
            List singletonList = Collections.singletonList(str);
            ArrayList A0s = AnonymousClass001.A0s();
            if (!singletonList.isEmpty()) {
                Object[] array = singletonList.toArray(C58152un.A0N);
                AnonymousClass4GK A012 = C18630y0.A01(r7);
                try {
                    C71923ct r5 = new C71923ct(array, 975);
                    while (r5.hasNext()) {
                        String[] A013 = C71923ct.A01(r5);
                        C56862sg r3 = ((AnonymousClass3H0) A012).A03;
                        int length = A013.length;
                        StringBuilder A0o = AnonymousClass001.A0o();
                        C57212tH.A02("SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE are_dependencies_missing = 1 AND mutation_index IN ", A0o, length);
                        A0E = r3.A0E(A0o.toString(), "SyncdMutationsTable.buildSelectStoredMutationsWhereDependenciesMissingByIndices", A013);
                        while (A0E.moveToNext()) {
                            AnonymousClass33W A042 = r7.A04(A0E);
                            if (A042 != null) {
                                A0s.add(A042);
                            }
                        }
                        A0E.close();
                    }
                    A012.close();
                } catch (Throwable th) {
                    try {
                        A012.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                A02(C18320x8.A0K(it));
            }
        }
        return;
        throw th;
    }

    public void A04(Collection collection) {
        synchronized (this) {
            this.A02.A0G(collection);
        }
    }

    public AnonymousClass33W A00(AnonymousClass35M r9) {
        StringBuilder sb;
        String str;
        String str2 = r9.A06[0];
        C56822sc A002 = this.A04.A00(str2);
        if (A002 == null) {
            sb = AnonymousClass001.A0o();
            str = "mutation-handlers/handleMutation no mutation handlers found to handle mutation: ";
        } else if (A002.A0C()) {
            try {
                AnonymousClass33W A022 = A002.A02(r9, (String) null, false);
                if (A022 != null) {
                    A022.A02 = r9.A05;
                    return A022;
                }
            } catch (C377523w e) {
                this.A00.A08(e.errorCode, (String) null);
            }
            sb = AnonymousClass001.A0o();
            str = "mutation-handlers/handleMutation the handler couldn't create a valid mutation for ";
        } else {
            sb = AnonymousClass001.A0o();
            str = "mutation-handlers/handler was not active for ";
        }
        C18260x0.A0r(str, str2, sb);
        String str3 = r9.A04;
        Integer valueOf = Integer.valueOf(r9.A00);
        byte[] bArr = r9.A05;
        C626936e.A06(bArr);
        throw new C23351Sg(r9.A01, r9.A02, r9.A03, valueOf, str3, bArr, 6);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.1Ow} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.1Oq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.1Oj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: X.1SH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: X.1Ou} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: X.1Sa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: X.1Oc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: X.1SX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: X.1Oi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: X.1On} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: X.1SR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: X.1SP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: X.1SP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: X.1SP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: X.1Oi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: X.1SX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: X.1Oi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v20, resolved type: X.1SX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: X.1Oi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: X.1SX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: X.1SM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v23, resolved type: X.1SM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: X.1Oi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v24, resolved type: X.1SX} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass33W r9) {
        /*
            r8 = this;
            X.2j3 r1 = r8.A04
            if (r9 == 0) goto L_0x0023
            java.lang.String r0 = r9.A09()
            X.C162457s7.A0D(r0)
            X.2sc r3 = r1.A00(r0)
            if (r3 == 0) goto L_0x0023
            boolean r0 = r3 instanceof X.AnonymousClass1On
            if (r0 == 0) goto L_0x0024
            X.1On r3 = (X.AnonymousClass1On) r3
            X.1SR r9 = (X.AnonymousClass1SR) r9
            java.lang.String r1 = r9.A00
            boolean r0 = r9.A01
            r3.A0D(r1, r0)
        L_0x0020:
            r3.A06(r9)
        L_0x0023:
            return
        L_0x0024:
            boolean r0 = r3 instanceof X.AnonymousClass1P3
            if (r0 == 0) goto L_0x003a
            X.1P3 r3 = (X.AnonymousClass1P3) r3
            X.1SB r9 = (X.AnonymousClass1SB) r9
            r0 = 0
            X.C162457s7.A0J(r9, r0)
            boolean r0 = r3.A0F(r9)
            if (r0 == 0) goto L_0x0023
            r3.A06(r9)
            return
        L_0x003a:
            boolean r0 = r3 instanceof X.C22451Oc
            if (r0 == 0) goto L_0x0055
            X.1Oc r3 = (X.C22451Oc) r3
            X.1SM r9 = (X.AnonymousClass1SM) r9
            boolean r2 = r9.A01
            X.1R1 r1 = r3.A02
            com.whatsapp.jid.UserJid r0 = r9.A00
            if (r2 == 0) goto L_0x0051
            r1.A0m(r0)
        L_0x004d:
            r3.A06(r9)
            return
        L_0x0051:
            r1.A0l(r0)
            goto L_0x004d
        L_0x0055:
            boolean r0 = r3 instanceof X.C22601Ov
            if (r0 != 0) goto L_0x0063
            boolean r0 = r3 instanceof X.AnonymousClass1Ol
            if (r0 == 0) goto L_0x0067
            java.lang.String r1 = "Android shouldn't process TimeFormatMutation with dependencies missing"
        L_0x005f:
            r0 = 0
            X.C626936e.A0D(r0, r1)
        L_0x0063:
            r3.A06(r9)
            return
        L_0x0067:
            boolean r0 = r3 instanceof X.AnonymousClass1Ok
            if (r0 != 0) goto L_0x0023
            boolean r0 = r3 instanceof X.C22591Ou
            if (r0 == 0) goto L_0x0081
            X.1Ou r3 = (X.C22591Ou) r3
            X.1Sa r9 = (X.C23291Sa) r9
            X.2qz r1 = r3.A08
            X.2z0 r0 = r9.A01
            X.34x r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x0023
            r3.A0E(r9, r0)
            goto L_0x0020
        L_0x0081:
            boolean r0 = r3 instanceof X.C22471Oe
            if (r0 != 0) goto L_0x0063
            boolean r0 = r3 instanceof X.C22521Oj
            if (r0 == 0) goto L_0x0095
            X.1Oj r3 = (X.C22521Oj) r3
            X.1SH r9 = (X.AnonymousClass1SH) r9
            X.2sZ r1 = r3.A01
            int r0 = r9.A00
            r1.A07(r0)
            goto L_0x0020
        L_0x0095:
            boolean r0 = r3 instanceof X.AnonymousClass1Om
            if (r0 == 0) goto L_0x00d7
            X.1Om r3 = (X.AnonymousClass1Om) r3
            X.1SO r9 = (X.AnonymousClass1SO) r9
            X.8qC r7 = r3.A04
            X.1el r1 = X.AnonymousClass0x9.A0a(r7)
            java.lang.String r0 = r9.A01
            android.util.Pair r6 = r1.A0B(r0)
            if (r6 == 0) goto L_0x0023
            java.lang.Object r0 = r6.second
            long r4 = X.C18310x6.A0B(r0)
            long r1 = r9.A00
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00c9
            X.1el r4 = X.AnonymousClass0x9.A0a(r7)
            java.lang.Object r2 = r6.first
            X.39M r2 = (X.AnonymousClass39M) r2
            r1 = 3
            X.4IK r0 = new X.4IK
            r0.<init>(r3, r1, r9)
        L_0x00c5:
            r4.A0G(r0, r2)
            return
        L_0x00c9:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0191
            X.1el r4 = X.AnonymousClass0x9.A0a(r7)
            java.lang.Object r2 = r6.first
            X.39M r2 = (X.AnonymousClass39M) r2
            r0 = 0
            goto L_0x00c5
        L_0x00d7:
            boolean r0 = r3 instanceof X.C22441Ob
            if (r0 != 0) goto L_0x0023
            boolean r0 = r3 instanceof X.C22501Oh
            if (r0 == 0) goto L_0x00e3
            java.lang.String r1 = "PrimaryVersionMutation shouldn't have dependencies"
            goto L_0x005f
        L_0x00e3:
            boolean r0 = r3 instanceof X.C22571Os
            if (r0 != 0) goto L_0x0063
            boolean r0 = r3 instanceof X.C22431Oa
            if (r0 != 0) goto L_0x0063
            boolean r0 = r3 instanceof X.C22551Oq
            if (r0 == 0) goto L_0x0100
            X.1Oq r3 = (X.C22551Oq) r3
            X.34v r2 = r3.A07
            java.lang.String r1 = "pin_v1"
            r0 = 1
            java.util.List r0 = r2.A0A(r1, r0)
            r3.A0D(r0)
            goto L_0x004d
        L_0x0100:
            boolean r0 = r3 instanceof X.C22511Oi
            if (r0 == 0) goto L_0x0117
            X.1Oi r3 = (X.C22511Oi) r3
            X.1SX r9 = (X.AnonymousClass1SX) r9
            X.2ss r1 = r3.A01
            X.4uZ r0 = r9.A01
            boolean r0 = r1.A0L(r0)
            if (r0 == 0) goto L_0x0023
            r3.A0D(r9)
            goto L_0x0020
        L_0x0117:
            boolean r0 = r3 instanceof X.C22561Or
            if (r0 == 0) goto L_0x0123
            X.1Or r3 = (X.C22561Or) r3
            X.1SV r9 = (X.AnonymousClass1SV) r9
            r3.A0D(r9)
            return
        L_0x0123:
            boolean r0 = r3 instanceof X.C22491Og
            if (r0 != 0) goto L_0x0023
            boolean r0 = r3 instanceof X.C22611Ow
            if (r0 == 0) goto L_0x0145
            X.1Ow r3 = (X.C22611Ow) r3
            X.1SP r9 = (X.AnonymousClass1SP) r9
            X.2cr r0 = r9.A01
            java.lang.String r2 = r0.A07
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FavoriteStickerHandler/handleMutationWithDependenciesMissing, fileHash="
            X.C18260x0.A0q(r0, r2, r1)
            boolean r0 = r9.A02
            if (r0 != 0) goto L_0x017c
            r3.A0F(r2)
            goto L_0x004d
        L_0x0145:
            boolean r0 = r3 instanceof X.C22461Od
            if (r0 == 0) goto L_0x0164
            X.1Od r3 = (X.C22461Od) r3
            X.1SZ r9 = (X.AnonymousClass1SZ) r9
            X.2qz r1 = r3.A03
            X.2z0 r0 = r9.A02
            X.34x r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x0023
            boolean r2 = r9.A03
            X.3Lv r1 = r3.A01
            java.util.Set r0 = java.util.Collections.singleton(r0)
            r1.A0k(r0, r2)
            goto L_0x004d
        L_0x0164:
            boolean r0 = r3 instanceof X.C22541Op
            if (r0 != 0) goto L_0x0023
            boolean r0 = r3 instanceof X.C22621Ox
            if (r0 != 0) goto L_0x0023
            boolean r0 = r3 instanceof X.C22531Oo
            if (r0 != 0) goto L_0x0023
            boolean r0 = r3 instanceof X.C22481Of
            if (r0 == 0) goto L_0x0195
            r1 = 0
            java.lang.String r0 = "CallLogSyncMutation shouldn't have dependencies"
            X.C626936e.A0D(r1, r0)
            goto L_0x0063
        L_0x017c:
            X.2pZ r0 = r3.A07
            X.39M r0 = r0.A00(r2)
            if (r0 != 0) goto L_0x004d
            X.39M r2 = r3.A0D(r9)
            if (r2 == 0) goto L_0x0023
            long r0 = r9.A04
            r3.A0E(r2, r0)
            goto L_0x004d
        L_0x0191:
            r3.A06(r9)
            return
        L_0x0195:
            boolean r0 = r3 instanceof X.C22581Ot
            if (r0 == 0) goto L_0x01a1
            X.1Ot r3 = (X.C22581Ot) r3
            X.1SW r9 = (X.AnonymousClass1SW) r9
            r3.A0E(r9)
            return
        L_0x01a1:
            r0 = 0
            r3.A0B(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55392qH.A02(X.33W):void");
    }

    public C55392qH(C64663Ek r1, C58582vU r2, C623934v r3, AnonymousClass2G5 r4, C50962j3 r5) {
        this.A04 = r5;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }

    public void A01(AnonymousClass33W r4) {
        if (r4.A0B() && (r4 instanceof C837649r) && C58582vU.A00(r4.A09())) {
            C58582vU r2 = this.A01;
            C95814uZ chatJid = ((C837649r) r4).getChatJid();
            synchronized (r2) {
                Set set = r2.A00;
                if (set != null) {
                    set.add(chatJid);
                }
            }
        }
    }
}
