package X;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3Gp  reason: invalid class name and case insensitive filesystem */
public class C65203Gp implements AnonymousClass4FW, AnonymousClass4F2, AnonymousClass4FJ, AnonymousClass4E2, AnonymousClass494, AnonymousClass49X {
    public AnonymousClass3TQ A00;
    public AnonymousClass30i A01;
    public C44312Vo A02 = null;
    public Runnable A03;
    public boolean A04;
    public final C55682qk A05;
    public final C56972sr A06;
    public final C66663Mh A07;
    public final C153167am A08;
    public final C28991i6 A09;
    public final C68413Tb A0A;
    public final C50072ha A0B;
    public final C43502Sj A0C;
    public final C58872vx A0D;
    public final C64743Et A0E;
    public final C44302Vn A0F;
    public final C42772Pl A0G;
    public final C64663Ek A0H;
    public final C64673El A0I;
    public final C613730l A0J;
    public final C28631hW A0K;
    public final AnonymousClass339 A0L;
    public final C56792sZ A0M;
    public final C55392qH A0N;
    public final C44322Vp A0O;
    public final C58582vU A0P;
    public final C64773Ex A0Q;
    public final AnonymousClass314 A0R;
    public final C55262q4 A0S;
    public final C56612sH A0T;
    public final AnonymousClass34c A0U;
    public final C56982ss A0V;
    public final AnonymousClass1RE A0W;
    public final C29041iB A0X;
    public final C56272ri A0Y;
    public final C623934v A0Z;
    public final AnonymousClass2G5 A0a;
    public final AnonymousClass1VX A0b;
    public final C50962j3 A0c;
    public final AnonymousClass31C A0d;
    public final C66653Mg A0e;
    public final C56932sn A0f;
    public final C72173dI A0g;
    public final AnonymousClass4FS A0h;
    public final C34441vA A0i;
    public final AnonymousClass1RI A0j;

    public static /* synthetic */ void A01(C65203Gp r1, boolean z) {
        synchronized (r1) {
            r1.A04 = false;
            if (z) {
                r1.A0G();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: X.1Oo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.1SU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.1Op} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.1ST} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: X.1Ow} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.1SP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: X.1Or} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: X.1SV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: X.1Oi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: X.1SX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: X.1Oe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: X.1SQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: X.1Oo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: X.1SU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: X.1Ou} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: X.1Sa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: X.1Oc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: X.1SM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: X.1Oo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: X.1Oo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: X.1SU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: X.1SU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: X.1Oo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: X.1Oo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: X.1SU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: X.1SU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: X.1Oo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: X.1Oo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: X.1Oo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: X.1SU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: X.1SU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: X.1SU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: X.1Oo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: X.1Oo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: X.1SU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: X.1SU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: X.1Oo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: X.1Oo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: X.1SU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: X.1SU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: X.1Oo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: X.1SU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: X.1Oo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: X.1Oo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: X.1SU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: X.1SU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: X.1SZ} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02d3 A[Catch:{ all -> 0x0348 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02d8 A[Catch:{ all -> 0x0348 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E() {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.A0Q()     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x0353
            boolean r0 = X.C56972sr.A0C(r11)     // Catch:{ all -> 0x0355 }
            if (r0 != 0) goto L_0x00a9
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            X.1vA r5 = r11.A0i     // Catch:{ all -> 0x0355 }
            java.lang.String r4 = "SYNC_MANAGER_CONTACTS_JID_ADDED"
            java.util.Set r0 = r5.A04(r4)     // Catch:{ all -> 0x0355 }
            java.util.List r6 = X.C627336j.A0B(r1, r0)     // Catch:{ all -> 0x0355 }
            java.lang.String r3 = "SYNC_MANAGER_CONTACTS_JID_REMOVED"
            java.util.Set r0 = r5.A04(r3)     // Catch:{ all -> 0x0355 }
            java.util.List r2 = X.C627336j.A0B(r1, r0)     // Catch:{ all -> 0x0355 }
            X.2j3 r1 = r11.A0c     // Catch:{ all -> 0x0355 }
            java.lang.String r0 = "contact"
            X.2sc r7 = r1.A00(r0)     // Catch:{ all -> 0x0355 }
            X.1Ox r7 = (X.C22621Ox) r7     // Catch:{ all -> 0x0355 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0355 }
            java.lang.String r0 = "sync-manager/handleNotReadyToSyncPendingMutations added="
            X.AnonymousClass000.A1H(r0, r1, r6)     // Catch:{ all -> 0x0355 }
            java.lang.String r0 = "; removed="
            X.AnonymousClass000.A1H(r0, r1, r2)     // Catch:{ all -> 0x0355 }
            X.AnonymousClass0x2.A18(r1)     // Catch:{ all -> 0x0355 }
            if (r7 == 0) goto L_0x00a2
            X.2sr r0 = r7.A02     // Catch:{ all -> 0x0355 }
            boolean r0 = r0.A0Y()     // Catch:{ all -> 0x0355 }
            r1 = r0 ^ 1
            java.lang.String r0 = "Companion cannot create contact mutations"
            X.C626936e.A0F(r1, r0)     // Catch:{ all -> 0x0355 }
            java.util.ArrayList r8 = X.AnonymousClass002.A0J(r6)     // Catch:{ all -> 0x0355 }
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0355 }
            java.util.Iterator r10 = r2.iterator()     // Catch:{ all -> 0x0355 }
        L_0x005c:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x0089
            X.4uZ r9 = X.C18300x5.A0P(r10)     // Catch:{ all -> 0x0355 }
            boolean r0 = r8.contains(r9)     // Catch:{ all -> 0x0355 }
            if (r0 != 0) goto L_0x005c
            X.3Ex r2 = r7.A03     // Catch:{ all -> 0x0355 }
            r0 = 0
            X.3ZH r1 = r2.A0B(r9, r0)     // Catch:{ all -> 0x0355 }
            if (r1 == 0) goto L_0x0085
            X.1vC r0 = r2.A05     // Catch:{ all -> 0x0355 }
            boolean r0 = r0.A0V(r1)     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x0085
            boolean r0 = r1.A10     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x0085
            r8.add(r9)     // Catch:{ all -> 0x0355 }
            goto L_0x005c
        L_0x0085:
            r6.add(r9)     // Catch:{ all -> 0x0355 }
            goto L_0x005c
        L_0x0089:
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0355 }
            X.2yt r0 = X.C60642yt.A03     // Catch:{ all -> 0x0355 }
            java.util.List r0 = r7.A0D(r0, r8)     // Catch:{ all -> 0x0355 }
            r1.addAll(r0)     // Catch:{ all -> 0x0355 }
            X.2yt r0 = X.C60642yt.A02     // Catch:{ all -> 0x0355 }
            java.util.List r0 = r7.A0D(r0, r6)     // Catch:{ all -> 0x0355 }
            r1.addAll(r0)     // Catch:{ all -> 0x0355 }
            r11.A0B(r1)     // Catch:{ all -> 0x0355 }
        L_0x00a2:
            r0 = 0
            r5.A05(r4, r0)     // Catch:{ all -> 0x0355 }
            r5.A05(r3, r0)     // Catch:{ all -> 0x0355 }
        L_0x00a9:
            X.2qH r2 = r11.A0N     // Catch:{ all -> 0x0355 }
            monitor-enter(r2)     // Catch:{ all -> 0x0355 }
            X.2j3 r4 = r2.A04     // Catch:{ all -> 0x034d }
            java.util.List r0 = r4.A01()     // Catch:{ all -> 0x034d }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x034d }
        L_0x00b6:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x034d }
            if (r0 == 0) goto L_0x00c0
            r1.next()     // Catch:{ all -> 0x034d }
            goto L_0x00b6
        L_0x00c0:
            monitor-exit(r2)     // Catch:{ all -> 0x034d }
            X.34v r6 = r11.A0Z     // Catch:{ all -> 0x0355 }
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0355 }
            X.4GK r3 = X.C18630y0.A01(r6)     // Catch:{ all -> 0x0355 }
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0343 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0343 }
            java.lang.String r1 = "SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE is_ready_to_sync = 0  ORDER BY _id ASC "
            java.lang.String r0 = "PendingMutationsTable.SELECT_NOT_READY_TO_SYNC_MUTATIONS"
            android.database.Cursor r2 = X.C56862sg.A01(r2, r1, r0)     // Catch:{ all -> 0x0343 }
        L_0x00d8:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0337 }
            if (r0 == 0) goto L_0x00e6
            X.33W r0 = r6.A03(r2)     // Catch:{ all -> 0x0337 }
            r5.add(r0)     // Catch:{ all -> 0x0337 }
            goto L_0x00d8
        L_0x00e6:
            r2.close()     // Catch:{ all -> 0x0343 }
            java.lang.StringBuilder r1 = X.C18280x3.A0f(r3)     // Catch:{ all -> 0x0355 }
            java.lang.String r0 = "sync-manager/handleNotReadyToSyncPendingMutations count: "
            X.C18260x0.A1B(r0, r1, r5)     // Catch:{ all -> 0x0355 }
            java.util.Iterator r10 = r5.iterator()     // Catch:{ all -> 0x0355 }
        L_0x00f7:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x0350
            X.33W r3 = X.C18320x8.A0K(r10)     // Catch:{ all -> 0x0355 }
            if (r3 == 0) goto L_0x00f7
            java.lang.String r0 = r3.A09()     // Catch:{ all -> 0x0355 }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x0355 }
            X.2sc r5 = r4.A00(r0)     // Catch:{ all -> 0x0355 }
            if (r5 == 0) goto L_0x00f7
            boolean r0 = r5 instanceof X.AnonymousClass1On     // Catch:{ all -> 0x0355 }
            if (r0 != 0) goto L_0x0332
            boolean r0 = r5 instanceof X.AnonymousClass1P3     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x0130
            X.1P3 r5 = (X.AnonymousClass1P3) r5     // Catch:{ all -> 0x0355 }
            X.1SB r3 = (X.AnonymousClass1SB) r3     // Catch:{ all -> 0x0355 }
            r0 = 0
            X.C162457s7.A0J(r3, r0)     // Catch:{ all -> 0x0355 }
            boolean r0 = r5.A0F(r3)     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x012a
            r5.A07(r3)     // Catch:{ all -> 0x0355 }
            goto L_0x00f7
        L_0x012a:
            X.34v r0 = r5.A00     // Catch:{ all -> 0x0355 }
            r0.A0F(r3)     // Catch:{ all -> 0x0355 }
            goto L_0x00f7
        L_0x0130:
            boolean r0 = r5 instanceof X.C22451Oc     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x014b
            X.1Oc r5 = (X.C22451Oc) r5     // Catch:{ all -> 0x0355 }
            X.1SM r3 = (X.AnonymousClass1SM) r3     // Catch:{ all -> 0x0355 }
            boolean r2 = r3.A01     // Catch:{ all -> 0x0355 }
            X.1R1 r1 = r5.A02     // Catch:{ all -> 0x0355 }
            com.whatsapp.jid.UserJid r0 = r3.A00     // Catch:{ all -> 0x0355 }
            if (r2 == 0) goto L_0x0147
            r1.A0m(r0)     // Catch:{ all -> 0x0355 }
        L_0x0143:
            r5.A07(r3)     // Catch:{ all -> 0x0355 }
            goto L_0x00f7
        L_0x0147:
            r1.A0l(r0)     // Catch:{ all -> 0x0355 }
            goto L_0x0143
        L_0x014b:
            boolean r0 = r5 instanceof X.C22601Ov     // Catch:{ all -> 0x0355 }
            if (r0 != 0) goto L_0x0332
            boolean r0 = r5 instanceof X.AnonymousClass1Ol     // Catch:{ all -> 0x0355 }
            if (r0 != 0) goto L_0x0332
            boolean r0 = r5 instanceof X.AnonymousClass1Ok     // Catch:{ all -> 0x0355 }
            if (r0 != 0) goto L_0x0332
            boolean r0 = r5 instanceof X.C22591Ou     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x0170
            X.1Ou r5 = (X.C22591Ou) r5     // Catch:{ all -> 0x0355 }
            X.1Sa r3 = (X.C23291Sa) r3     // Catch:{ all -> 0x0355 }
            X.2qz r1 = r5.A08     // Catch:{ all -> 0x0355 }
            X.2z0 r0 = r3.A01     // Catch:{ all -> 0x0355 }
            X.34x r0 = r1.A05(r0)     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x02f8
            r5.A0E(r3, r0)     // Catch:{ all -> 0x0355 }
        L_0x016c:
            r5.A07(r3)     // Catch:{ all -> 0x0355 }
            goto L_0x00f7
        L_0x0170:
            boolean r0 = r5 instanceof X.C22471Oe     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x0184
            X.1Oe r5 = (X.C22471Oe) r5     // Catch:{ all -> 0x0355 }
            X.1SQ r3 = (X.AnonymousClass1SQ) r3     // Catch:{ all -> 0x0355 }
            r0 = 0
            X.C162457s7.A0J(r3, r0)     // Catch:{ all -> 0x0355 }
            X.311 r1 = r5.A02     // Catch:{ all -> 0x0355 }
            X.1fH r0 = r3.A00     // Catch:{ all -> 0x0355 }
            r1.A05(r0)     // Catch:{ all -> 0x0355 }
            goto L_0x016c
        L_0x0184:
            boolean r0 = r5 instanceof X.C22521Oj     // Catch:{ all -> 0x0355 }
            if (r0 != 0) goto L_0x00f7
            boolean r0 = r5 instanceof X.AnonymousClass1Om     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x01bd
            X.1Om r5 = (X.AnonymousClass1Om) r5     // Catch:{ all -> 0x0355 }
            X.1SO r3 = (X.AnonymousClass1SO) r3     // Catch:{ all -> 0x0355 }
            X.8qC r9 = r5.A04     // Catch:{ all -> 0x0355 }
            X.1el r1 = X.AnonymousClass0x9.A0a(r9)     // Catch:{ all -> 0x0355 }
            java.lang.String r0 = r3.A01     // Catch:{ all -> 0x0355 }
            android.util.Pair r8 = r1.A0B(r0)     // Catch:{ all -> 0x0355 }
            if (r8 == 0) goto L_0x02c7
            java.lang.Object r0 = r8.second     // Catch:{ all -> 0x0355 }
            long r6 = X.C18310x6.A0B(r0)     // Catch:{ all -> 0x0355 }
            long r1 = r3.A00     // Catch:{ all -> 0x0355 }
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x02c7
            X.1el r6 = X.AnonymousClass0x9.A0a(r9)     // Catch:{ all -> 0x0355 }
            java.lang.Object r2 = r8.first     // Catch:{ all -> 0x0355 }
            X.39M r2 = (X.AnonymousClass39M) r2     // Catch:{ all -> 0x0355 }
            r1 = 2
            X.4IK r0 = new X.4IK     // Catch:{ all -> 0x0355 }
            r0.<init>(r5, r1, r3)     // Catch:{ all -> 0x0355 }
            r6.A0G(r0, r2)     // Catch:{ all -> 0x0355 }
            goto L_0x00f7
        L_0x01bd:
            boolean r0 = r5 instanceof X.C22441Ob     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x01db
            X.1Ob r5 = (X.C22441Ob) r5     // Catch:{ all -> 0x0355 }
            X.1SG r3 = (X.AnonymousClass1SG) r3     // Catch:{ all -> 0x0355 }
            X.2sr r0 = r5.A00     // Catch:{ all -> 0x0355 }
            java.lang.String r2 = r3.A00     // Catch:{ all -> 0x0355 }
            r0.A0W(r2)     // Catch:{ all -> 0x0355 }
            X.31C r1 = r5.A02     // Catch:{ all -> 0x0355 }
            r0 = 3
            android.os.Message r0 = X.C18290x4.A0J(r0, r2)     // Catch:{ all -> 0x0355 }
            r1.A0J(r0)     // Catch:{ all -> 0x0355 }
            r5.A07(r3)     // Catch:{ all -> 0x0355 }
            goto L_0x00f7
        L_0x01db:
            boolean r0 = r5 instanceof X.C22501Oh     // Catch:{ all -> 0x0355 }
            if (r0 != 0) goto L_0x0332
            boolean r0 = r5 instanceof X.C22571Os     // Catch:{ all -> 0x0355 }
            if (r0 != 0) goto L_0x0332
            boolean r0 = r5 instanceof X.C22431Oa     // Catch:{ all -> 0x0355 }
            if (r0 != 0) goto L_0x0332
            boolean r0 = r5 instanceof X.C22551Oq     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x01ff
            X.1Oq r5 = (X.C22551Oq) r5     // Catch:{ all -> 0x0355 }
            X.34v r2 = r5.A07     // Catch:{ all -> 0x0355 }
            java.lang.String r1 = "pin_v1"
            r0 = 1
            java.util.List r0 = r2.A0A(r1, r0)     // Catch:{ all -> 0x0355 }
            r5.A0D(r0)     // Catch:{ all -> 0x0355 }
            r5.A07(r3)     // Catch:{ all -> 0x0355 }
            goto L_0x00f7
        L_0x01ff:
            boolean r0 = r5 instanceof X.C22511Oi     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x0216
            X.1Oi r5 = (X.C22511Oi) r5     // Catch:{ all -> 0x0355 }
            X.1SX r3 = (X.AnonymousClass1SX) r3     // Catch:{ all -> 0x0355 }
            X.2ss r1 = r5.A01     // Catch:{ all -> 0x0355 }
            X.4uZ r0 = r3.A01     // Catch:{ all -> 0x0355 }
            boolean r0 = r1.A0L(r0)     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x02f8
            r5.A0D(r3)     // Catch:{ all -> 0x0355 }
            goto L_0x016c
        L_0x0216:
            boolean r0 = r5 instanceof X.C22561Or     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x022d
            X.1Or r5 = (X.C22561Or) r5     // Catch:{ all -> 0x0355 }
            X.1SV r3 = (X.AnonymousClass1SV) r3     // Catch:{ all -> 0x0355 }
            X.2ss r1 = r5.A03     // Catch:{ all -> 0x0355 }
            X.4uZ r0 = r3.A01     // Catch:{ all -> 0x0355 }
            X.31A r0 = X.C56982ss.A00(r1, r0)     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x02f8
            r5.A0E(r3)     // Catch:{ all -> 0x0355 }
            goto L_0x016c
        L_0x022d:
            boolean r0 = r5 instanceof X.C22491Og     // Catch:{ all -> 0x0355 }
            if (r0 != 0) goto L_0x0332
            boolean r0 = r5 instanceof X.C22611Ow     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x0255
            X.1Ow r5 = (X.C22611Ow) r5     // Catch:{ all -> 0x0355 }
            X.1SP r3 = (X.AnonymousClass1SP) r3     // Catch:{ all -> 0x0355 }
            java.lang.String r0 = "FavoriteStickerHandler/handleNotReadyToSyncPendingMutation"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0355 }
            X.2cr r0 = r3.A01     // Catch:{ all -> 0x0355 }
            java.lang.String r1 = r0.A07     // Catch:{ all -> 0x0355 }
            boolean r0 = r3.A02     // Catch:{ all -> 0x0355 }
            if (r0 != 0) goto L_0x024b
            r5.A0F(r1)     // Catch:{ all -> 0x0355 }
            goto L_0x016c
        L_0x024b:
            X.2pZ r0 = r5.A07     // Catch:{ all -> 0x0355 }
            X.39M r0 = r0.A00(r1)     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x02f8
            goto L_0x016c
        L_0x0255:
            boolean r0 = r5 instanceof X.C22461Od     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x0274
            X.1Od r5 = (X.C22461Od) r5     // Catch:{ all -> 0x0355 }
            X.1SZ r3 = (X.AnonymousClass1SZ) r3     // Catch:{ all -> 0x0355 }
            X.2qz r1 = r5.A03     // Catch:{ all -> 0x0355 }
            X.2z0 r0 = r3.A02     // Catch:{ all -> 0x0355 }
            X.34x r0 = r1.A05(r0)     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x0143
            boolean r2 = r3.A03     // Catch:{ all -> 0x0355 }
            X.3Lv r1 = r5.A01     // Catch:{ all -> 0x0355 }
            java.util.Set r0 = java.util.Collections.singleton(r0)     // Catch:{ all -> 0x0355 }
            r1.A0k(r0, r2)     // Catch:{ all -> 0x0355 }
            goto L_0x0143
        L_0x0274:
            boolean r0 = r5 instanceof X.C22541Op     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x028b
            X.1Op r5 = (X.C22541Op) r5     // Catch:{ all -> 0x0355 }
            X.1ST r3 = (X.AnonymousClass1ST) r3     // Catch:{ all -> 0x0355 }
            X.2ss r1 = r5.A05     // Catch:{ all -> 0x0355 }
            X.4uZ r0 = r3.A01     // Catch:{ all -> 0x0355 }
            X.31A r0 = X.C56982ss.A00(r1, r0)     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x02f8
            r5.A0D(r3)     // Catch:{ all -> 0x0355 }
            goto L_0x016c
        L_0x028b:
            boolean r0 = r5 instanceof X.C22621Ox     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x02b0
            X.1Ox r5 = (X.C22621Ox) r5     // Catch:{ all -> 0x0355 }
            X.1SN r3 = (X.AnonymousClass1SN) r3     // Catch:{ all -> 0x0355 }
            X.3Ex r2 = r5.A03     // Catch:{ all -> 0x0355 }
            com.whatsapp.jid.UserJid r1 = r3.A01     // Catch:{ all -> 0x0355 }
            r0 = 0
            X.3ZH r6 = r2.A0B(r1, r0)     // Catch:{ all -> 0x0355 }
            if (r6 == 0) goto L_0x02cc
            X.1vC r0 = r2.A05     // Catch:{ all -> 0x0355 }
            boolean r0 = r0.A0V(r6)     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x02cc
            r2 = 1
            boolean r0 = r6.A10     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x02cd
            X.2yt r1 = r3.A05     // Catch:{ all -> 0x0355 }
            X.2yt r0 = X.C60642yt.A03     // Catch:{ all -> 0x0355 }
            goto L_0x02d1
        L_0x02b0:
            boolean r0 = r5 instanceof X.C22531Oo     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x02ff
            X.1Oo r5 = (X.C22531Oo) r5     // Catch:{ all -> 0x0355 }
            X.1SU r3 = (X.AnonymousClass1SU) r3     // Catch:{ all -> 0x0355 }
            X.2ss r1 = r5.A05     // Catch:{ all -> 0x0355 }
            X.4uZ r0 = r3.A01     // Catch:{ all -> 0x0355 }
            X.31A r0 = X.C56982ss.A00(r1, r0)     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x02f8
            r5.A0D(r3)     // Catch:{ all -> 0x0355 }
            goto L_0x016c
        L_0x02c7:
            r5.A07(r3)     // Catch:{ all -> 0x0355 }
            goto L_0x00f7
        L_0x02cc:
            r2 = 0
        L_0x02cd:
            X.2yt r1 = r3.A05     // Catch:{ all -> 0x0355 }
            X.2yt r0 = X.C60642yt.A02     // Catch:{ all -> 0x0355 }
        L_0x02d1:
            if (r1 != r0) goto L_0x02d8
            r5.A07(r3)     // Catch:{ all -> 0x0355 }
            goto L_0x00f7
        L_0x02d8:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0355 }
            java.lang.String r0 = "contact-mutation-handler/handleNotReadyToSyncPendingMutation delete mutation isValidWhatsAppContact = "
            r1.append(r0)     // Catch:{ all -> 0x0355 }
            r1.append(r2)     // Catch:{ all -> 0x0355 }
            java.lang.String r0 = "; WAState="
            r1.append(r0)     // Catch:{ all -> 0x0355 }
            boolean r0 = r6.A10     // Catch:{ all -> 0x0355 }
            r1.append(r0)     // Catch:{ all -> 0x0355 }
            X.AnonymousClass0x2.A19(r1)     // Catch:{ all -> 0x0355 }
            X.34v r0 = r5.A00     // Catch:{ all -> 0x0355 }
            r0.A0F(r3)     // Catch:{ all -> 0x0355 }
            goto L_0x00f7
        L_0x02f8:
            X.34v r0 = r5.A00     // Catch:{ all -> 0x0355 }
            r0.A0F(r3)     // Catch:{ all -> 0x0355 }
            goto L_0x00f7
        L_0x02ff:
            boolean r0 = r5 instanceof X.C22481Of     // Catch:{ all -> 0x0355 }
            if (r0 != 0) goto L_0x0332
            boolean r0 = r5 instanceof X.C22581Ot     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x00f7
            X.1Ot r5 = (X.C22581Ot) r5     // Catch:{ all -> 0x0355 }
            X.1SW r3 = (X.AnonymousClass1SW) r3     // Catch:{ all -> 0x0355 }
            X.2ss r1 = r5.A07     // Catch:{ all -> 0x0355 }
            X.4uZ r0 = r3.A01     // Catch:{ all -> 0x0355 }
            X.31A r2 = X.C56982ss.A00(r1, r0)     // Catch:{ all -> 0x0355 }
            if (r2 != 0) goto L_0x031c
            X.34v r0 = r5.A00     // Catch:{ all -> 0x0355 }
            r0.A0F(r3)     // Catch:{ all -> 0x0355 }
            goto L_0x00f7
        L_0x031c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0355 }
            java.lang.String r0 = "ArchiveChatHandler/handleNotReadyToSyncPendingMutation/setArchivedState - "
            r1.append(r0)     // Catch:{ all -> 0x0355 }
            boolean r0 = r3.A02     // Catch:{ all -> 0x0355 }
            X.C18260x0.A1V(r1, r0)     // Catch:{ all -> 0x0355 }
            r5.A0D(r2, r3)     // Catch:{ all -> 0x0355 }
            r5.A07(r3)     // Catch:{ all -> 0x0355 }
            goto L_0x00f7
        L_0x0332:
            r5.A07(r3)     // Catch:{ all -> 0x0355 }
            goto L_0x00f7
        L_0x0337:
            r1 = move-exception
            if (r2 == 0) goto L_0x0342
            r2.close()     // Catch:{ all -> 0x033e }
            goto L_0x0342
        L_0x033e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0343 }
        L_0x0342:
            throw r1     // Catch:{ all -> 0x0343 }
        L_0x0343:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0348 }
            goto L_0x034c
        L_0x0348:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0355 }
        L_0x034c:
            throw r1     // Catch:{ all -> 0x0355 }
        L_0x034d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x034d }
            throw r0     // Catch:{ all -> 0x0355 }
        L_0x0350:
            r11.A0F()     // Catch:{ all -> 0x0355 }
        L_0x0353:
            monitor-exit(r11)     // Catch:{ all -> 0x0355 }
            return
        L_0x0355:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0355 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65203Gp.A0E():void");
    }

    public void A0F() {
        synchronized (this) {
            Runnable runnable = this.A03;
            if (runnable != null) {
                this.A0h.BjN(runnable);
                this.A03 = null;
                Log.i("sync-manager/forceSync removed scheduled sync");
            }
            A0G();
        }
    }

    public void A0H(int i) {
        synchronized (this) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("sync-manager/deleteAllSyncdData: isSyncing = ");
            C18260x0.A1V(A0o, this.A04);
            this.A02 = new AnonymousClass1OX(this, i);
            if (!this.A04) {
                A0P();
            }
        }
    }

    public void A0J(Integer num) {
        synchronized (this) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("sync-manager/handleFatalFailure: errorCode = ");
            A0o.append(num);
            A0o.append("; isSyncing = ");
            C18260x0.A1V(A0o, this.A04);
            this.A02 = new AnonymousClass1OY(this, num);
            if (!this.A04) {
                A0P();
            }
        }
    }

    public boolean A0P() {
        synchronized (this) {
            C44312Vo r2 = this.A02;
            if (r2 == null) {
                return false;
            }
            C18260x0.A1R(AnonymousClass001.A0o(), "sync-manager/handleSyncdStateIfRequired: syncdState = ", r2);
            C44312Vo r1 = this.A02;
            if (r1 instanceof AnonymousClass1OY) {
                AnonymousClass1OY r12 = (AnonymousClass1OY) r1;
                r12.A01.A03().A03(r12.A00, (String) null);
            } else {
                ((AnonymousClass1OX) r1).A00.A0A.A02(false);
            }
            this.A02 = null;
            return true;
        }
    }

    public final Pair A02(Collection collection, Collection collection2) {
        Class<UserJid> cls = UserJid.class;
        C34441vA r2 = this.A0i;
        List A0B2 = C627336j.A0B(cls, r2.A04("SYNC_MANAGER_CONTACTS_JID_ADDED"));
        List A0B3 = C627336j.A0B(cls, r2.A04("SYNC_MANAGER_CONTACTS_JID_REMOVED"));
        collection.addAll(A0B2);
        collection2.addAll(A0B3);
        HashSet A0K2 = AnonymousClass002.A0K();
        C627336j.A0H(collection, A0K2);
        HashSet A0K3 = AnonymousClass002.A0K();
        C627336j.A0H(collection2, A0K3);
        return AnonymousClass0x9.A0C(A0K2, A0K3);
    }

    public final synchronized AnonymousClass30i A03() {
        AnonymousClass30i r0;
        synchronized (this) {
            r0 = this.A01;
            if (r0 == null) {
                C56612sH r21 = this.A0T;
                AnonymousClass1VX r20 = this.A0b;
                C55682qk r19 = this.A05;
                C56972sr r18 = this.A06;
                AnonymousClass1RE r17 = this.A0W;
                C56792sZ r16 = this.A0M;
                C55392qH r15 = this.A0N;
                C64663Ek r14 = this.A0H;
                C153167am r13 = this.A08;
                C623934v r12 = this.A0Z;
                AnonymousClass339 r11 = this.A0L;
                C56272ri r10 = this.A0Y;
                C29041iB r9 = this.A0X;
                AnonymousClass34c r7 = this.A0U;
                C613730l r6 = this.A0J;
                C50072ha r5 = this.A0B;
                C58872vx r4 = this.A0D;
                C55262q4 r3 = this.A0S;
                C60902zM r2 = new C60902zM(AnonymousClass0x9.A1C());
                C55682qk r152 = r19;
                C56972sr r162 = r18;
                C153167am r172 = r13;
                C50072ha r182 = r5;
                C58872vx r192 = r4;
                AnonymousClass2FT r202 = new AnonymousClass2FT(this);
                C64663Ek r212 = r14;
                r0 = new AnonymousClass30i(r152, r162, r172, r182, r192, r202, r212, r6, r11, r16, r15, r3, r21, r7, r17, r9, r10, r12, r20, r2);
                this.A01 = r0;
            }
        }
        return r0;
    }

    public Set A04(C95814uZ r11, long j, boolean z) {
        C22511Oi r0 = (C22511Oi) this.A0c.A00("mute");
        if (r0 == null) {
            return Collections.emptySet();
        }
        return A00(this, new AnonymousClass1SX((AnonymousClass33J) null, r11, (String) null, j, r0.A00.A0H(), z, false));
    }

    public Set A05(C95814uZ r11, boolean z) {
        C22551Oq r2;
        C50962j3 r1 = this.A0c;
        C22581Ot r5 = (C22581Ot) r1.A00("archive");
        if (r5 == null || C56972sr.A04(this.A06) == null || !A0Q()) {
            return Collections.emptySet();
        }
        ArrayList A0s = AnonymousClass001.A0s();
        C95814uZ r6 = r11;
        boolean z2 = z;
        if (z && (r2 = (C22551Oq) r1.A00("pin_v1")) != null) {
            r2.A02.A07(1);
            A0s.add(new AnonymousClass1SY(r11, r2.A03.A0H(), false));
        }
        A0s.add(new AnonymousClass1SW(r5.A00.A04(r11, false), r6, r5.A03.A0H(), z2));
        return A0B(A0s);
    }

    public Set A06(C95814uZ r11, boolean z) {
        C22581Ot r1;
        C50962j3 r12 = this.A0c;
        C22551Oq r2 = (C22551Oq) r12.A00("pin_v1");
        if (r2 == null || C56972sr.A04(this.A06) == null || !A0Q()) {
            return Collections.emptySet();
        }
        ArrayList A0s = AnonymousClass001.A0s();
        C95814uZ r6 = r11;
        if (z && (r1 = (C22581Ot) r12.A00("archive")) != null) {
            A0s.add(new AnonymousClass1SW(r1.A00.A04(r11, false), r6, r1.A03.A0H(), false));
        }
        r2.A02.A07(1);
        A0s.add(new AnonymousClass1SY(r11, r2.A03.A0H(), z));
        return A0B(A0s);
    }

    public Set A07(C95814uZ r11, boolean z) {
        C22541Op r3 = (C22541Op) this.A0c.A00("deleteChat");
        if (r3 == null || !A0Q()) {
            return Collections.emptySet();
        }
        C55392qH r2 = this.A0N;
        C95814uZ r4 = r11;
        Set A062 = A06(r11, false);
        synchronized (r2) {
            r2.A02.A0I(A062);
        }
        r3.A03.A07(3);
        return A00(this, new AnonymousClass1ST((AnonymousClass33J) null, r3.A02.A03(r11), r4, (String) null, r3.A04.A0H(), z, true));
    }

    public Set A08(C95814uZ r10, boolean z) {
        C22561Or r1 = (C22561Or) this.A0c.A00("markChatAsRead");
        if (r1 == null) {
            return Collections.emptySet();
        }
        long A0H2 = r1.A02.A0H();
        return A00(this, new AnonymousClass1SV((AnonymousClass33J) null, r1.A00.A04(r10, false), r10, (String) null, A0H2, z, false));
    }

    public Set A09(C95814uZ r11, boolean z, boolean z2) {
        C22531Oo r2 = (C22531Oo) this.A0c.A00("clearChat");
        if (r2 == null || C56972sr.A04(this.A06) == null) {
            return Collections.emptySet();
        }
        C64663Ek r1 = r2.A03;
        int i = 5;
        boolean z3 = z;
        if (z) {
            i = 4;
        }
        r1.A07(i);
        long A0H2 = r2.A04.A0H();
        return A00(this, new AnonymousClass1SU((AnonymousClass33J) null, r2.A02.A03(r11), r11, (String) null, A0H2, z3, z2, true));
    }

    public Set A0A(AnonymousClass39M r20, long j, boolean z) {
        List singletonList;
        C22611Ow r2 = (C22611Ow) this.A0c.A00("favoriteSticker");
        if (r2 != null) {
            AnonymousClass39M r3 = r20;
            if (r3.A0J) {
                Log.d("SyncManager/onFavoriteSticker/not sync avatar sticker");
            } else {
                if (TextUtils.isEmpty(r3.A0D)) {
                    Log.e("FavoriteStickerHandler/empty sticker fileHash");
                    singletonList = Collections.emptyList();
                } else {
                    int A0D2 = r2.A01.A0D();
                    String str = r3.A0D;
                    C626936e.A06(str);
                    singletonList = Collections.singletonList(new AnonymousClass1SP(new C47192cr(str, r3.A0G, r3.A08, r3.A0B, r3.A0C, r3.A06, r3.A03, r3.A02, (long) r3.A00), (AnonymousClass33J) null, (String) null, A0D2, j, z, false));
                }
                return A0B(singletonList);
            }
        }
        return Collections.emptySet();
    }

    public Set A0C(Collection collection, boolean z) {
        C95814uZ A0n;
        C22591Ou r1 = (C22591Ou) this.A0c.A00("star");
        if (r1 == null || C56972sr.A04(this.A06) == null) {
            return Collections.emptySet();
        }
        long A0H2 = r1.A02.A0H();
        ArrayList A0u = C18300x5.A0u(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C624134x A0T2 = C18300x5.A0T(it);
            C95814uZ r12 = A0T2.A1J.A00;
            if (C627336j.A0K(r12) || (r12 instanceof AnonymousClass1fS)) {
                A0n = A0T2.A0n();
            } else {
                A0n = null;
            }
            A0u.add(new C23291Sa((AnonymousClass33J) null, A0n, C627636p.A0B(A0T2), (String) null, A0H2, z, false));
        }
        return A0B(A0u);
    }

    public void A0I(C51452jq r14, C373121t r15) {
        C56822sc r5;
        Object obj;
        C50962j3 r4 = this.A0c;
        C162457s7.A0J(r15, 0);
        synchronized (r4) {
            Iterator it = C18300x5.A0w(r4.A00).iterator();
            while (true) {
                r5 = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C56822sc r1 = (C56822sc) obj;
                if (r1 instanceof AnonymousClass1P3) {
                    if (((AnonymousClass1P3) r1).A0D() == r15) {
                        break;
                    }
                } else if (C162457s7.A0P(r1.A04(), r15.mutationName)) {
                    break;
                }
            }
            if (obj instanceof C56822sc) {
                r5 = (C56822sc) obj;
            }
        }
        AnonymousClass1P3 r52 = (AnonymousClass1P3) r5;
        C626936e.A07(r52, AnonymousClass000.A0P(r15, "There was no handler for ", AnonymousClass001.A0o()));
        C44322Vp r0 = this.A0O;
        C18270x1.A14(r14, r52);
        AnonymousClass1SB r42 = new AnonymousClass1SB(r52, (AnonymousClass33J) null, r14.A00, r14.A01, (String) null, r0.A00.A0H(), false);
        if (!r52.A0C() || !A0Q()) {
            r52.A0F(r42);
            return;
        }
        Set A002 = A00(this, r42);
        r52.A0F(r42);
        A0O(A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0311, code lost:
        if (r22 == false) goto L_0x031e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0313, code lost:
        r5.A01.post(X.C69963Zi.A00(r5, 46));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0322, code lost:
        if (r4.size() <= 0) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0324, code lost:
        r5.A0g(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0327, code lost:
        r5.A0c(r27);
        r24.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        r24.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:?, code lost:
        r25.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0335, code lost:
        if (r26 == false) goto L_0x034f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x034c, code lost:
        A0E();
     */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x027c A[Catch:{ all -> 0x030c, all -> 0x0338 }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02af A[Catch:{ all -> 0x030c, all -> 0x0338 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02d4 A[Catch:{ all -> 0x030c, all -> 0x0338 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0L(java.util.Collection r29, java.util.Collection r30) {
        /*
            r28 = this;
            r6 = r28
            boolean r0 = X.C56972sr.A0C(r6)
            if (r0 != 0) goto L_0x0354
            monitor-enter(r6)
            r26 = 0
            X.3Mg r0 = r6.A0e     // Catch:{ all -> 0x0351 }
            boolean r0 = X.C66653Mg.A00(r0)     // Catch:{ all -> 0x0351 }
            if (r0 == 0) goto L_0x034f
            boolean r0 = X.C56972sr.A0C(r6)     // Catch:{ all -> 0x0351 }
            if (r0 != 0) goto L_0x034f
            X.2j3 r1 = r6.A0c     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = "contact"
            X.2sc r0 = r1.A00(r0)     // Catch:{ all -> 0x0351 }
            X.1Ox r0 = (X.C22621Ox) r0     // Catch:{ all -> 0x0351 }
            if (r0 == 0) goto L_0x002d
            boolean r0 = r6.A0Q()     // Catch:{ all -> 0x0351 }
            if (r0 == 0) goto L_0x002d
            r26 = 1
        L_0x002d:
            java.util.HashSet r3 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x0351 }
            java.util.HashSet r2 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x0351 }
            r27 = r29
            if (r26 == 0) goto L_0x0085
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0351 }
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0351 }
            java.util.Iterator r2 = r27.iterator()     // Catch:{ all -> 0x0351 }
        L_0x0045:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0351 }
            if (r0 == 0) goto L_0x005d
            X.3ZH r1 = X.C18310x6.A0R(r2)     // Catch:{ all -> 0x0351 }
            boolean r0 = r1.A10     // Catch:{ all -> 0x0351 }
            if (r0 == 0) goto L_0x0045
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3ZH.A07(r1)     // Catch:{ all -> 0x0351 }
            if (r0 == 0) goto L_0x0045
            r4.add(r0)     // Catch:{ all -> 0x0351 }
            goto L_0x0045
        L_0x005d:
            java.util.Iterator r2 = r30.iterator()     // Catch:{ all -> 0x0351 }
        L_0x0061:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0351 }
            if (r0 == 0) goto L_0x0079
            X.3ZH r1 = X.C18310x6.A0R(r2)     // Catch:{ all -> 0x0351 }
            boolean r0 = r1.A10     // Catch:{ all -> 0x0351 }
            if (r0 == 0) goto L_0x0061
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3ZH.A07(r1)     // Catch:{ all -> 0x0351 }
            if (r0 == 0) goto L_0x0061
            r3.add(r0)     // Catch:{ all -> 0x0351 }
            goto L_0x0061
        L_0x0079:
            android.util.Pair r0 = r6.A02(r4, r3)     // Catch:{ all -> 0x0351 }
            java.lang.Object r3 = r0.first     // Catch:{ all -> 0x0351 }
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ all -> 0x0351 }
            java.lang.Object r2 = r0.second     // Catch:{ all -> 0x0351 }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x0351 }
        L_0x0085:
            X.1RI r0 = r6.A0j     // Catch:{ all -> 0x0351 }
            X.4Fq r25 = r0.A0C()     // Catch:{ all -> 0x0351 }
            X.3Yo r24 = r25.Axl()     // Catch:{ all -> 0x0342 }
            if (r26 == 0) goto L_0x009d
            X.1vA r1 = r6.A0i     // Catch:{ all -> 0x0338 }
            java.lang.String r0 = "SYNC_MANAGER_CONTACTS_JID_ADDED"
            r1.A06(r0, r3)     // Catch:{ all -> 0x0338 }
            java.lang.String r0 = "SYNC_MANAGER_CONTACTS_JID_REMOVED"
            r1.A06(r0, r2)     // Catch:{ all -> 0x0338 }
        L_0x009d:
            X.3Ex r5 = r6.A0Q     // Catch:{ all -> 0x0338 }
            X.314 r3 = r6.A0R     // Catch:{ all -> 0x0338 }
            java.util.HashMap r7 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x0338 }
            java.util.Iterator r2 = r30.iterator()     // Catch:{ all -> 0x0338 }
        L_0x00a9:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0338 }
            if (r0 == 0) goto L_0x00c6
            X.3ZH r1 = X.C18310x6.A0R(r2)     // Catch:{ all -> 0x0338 }
            X.4uZ r0 = X.AnonymousClass3ZH.A01(r1)     // Catch:{ all -> 0x0338 }
            boolean r0 = r3.A0D(r0)     // Catch:{ all -> 0x0338 }
            if (r0 == 0) goto L_0x00c3
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0338 }
        L_0x00bf:
            r7.put(r1, r0)     // Catch:{ all -> 0x0338 }
            goto L_0x00a9
        L_0x00c3:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0338 }
            goto L_0x00bf
        L_0x00c6:
            java.util.Set r1 = r7.keySet()     // Catch:{ all -> 0x0338 }
            java.lang.String r0 = "dbinfo/manager/deleteContacts"
            X.C64773Ex.A02(r0, r1)     // Catch:{ all -> 0x0338 }
            java.util.Set r0 = r7.keySet()     // Catch:{ all -> 0x0338 }
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0338 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0338 }
        L_0x00db:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0338 }
            if (r0 == 0) goto L_0x00f7
            X.3ZH r1 = X.C18310x6.A0R(r2)     // Catch:{ all -> 0x0338 }
            if (r1 == 0) goto L_0x00db
            X.4uZ r0 = r1.A0H     // Catch:{ all -> 0x0338 }
            boolean r0 = r0 instanceof X.AnonymousClass1fW     // Catch:{ all -> 0x0338 }
            if (r0 != 0) goto L_0x00db
            boolean r0 = r1.A0U()     // Catch:{ all -> 0x0338 }
            if (r0 != 0) goto L_0x00db
            r3.add(r1)     // Catch:{ all -> 0x0338 }
            goto L_0x00db
        L_0x00f7:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0338 }
            java.util.Iterator r23 = r3.iterator()     // Catch:{ all -> 0x0338 }
        L_0x00ff:
            r22 = 0
        L_0x0101:
            boolean r0 = r23.hasNext()     // Catch:{ all -> 0x0338 }
            if (r0 == 0) goto L_0x0311
            X.3ZH r3 = X.C18310x6.A0R(r23)     // Catch:{ all -> 0x0338 }
            boolean r0 = r3.A10     // Catch:{ all -> 0x0338 }
            if (r0 == 0) goto L_0x02f6
            X.1vC r2 = r5.A05     // Catch:{ all -> 0x0338 }
            r0 = 1
            X.33M r13 = X.AnonymousClass33M.A02(r0)     // Catch:{ all -> 0x0338 }
            X.4uZ r9 = r3.A0H     // Catch:{ all -> 0x0338 }
            X.1RI r11 = r2.A00     // Catch:{ all -> 0x0338 }
            X.4GK r10 = r11.get()     // Catch:{ all -> 0x0338 }
            java.lang.String r12 = "SELECT count(*) AS _count FROM wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid) WHERE wa_contacts.jid = ?"
            r15 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x0307 }
            java.lang.String r1 = X.C627336j.A07(r9)     // Catch:{ all -> 0x0307 }
            X.C626936e.A06(r1)     // Catch:{ all -> 0x0307 }
            r0 = 0
            r8[r0] = r1     // Catch:{ all -> 0x0307 }
            java.lang.String r0 = "COUNT_DUPLICATES"
            android.database.Cursor r14 = X.AnonymousClass361.A0A(r10, r12, r0, r8)     // Catch:{ all -> 0x0307 }
            boolean r0 = r14.moveToNext()     // Catch:{ all -> 0x02fb }
            if (r0 == 0) goto L_0x014f
            java.lang.String r0 = "_count"
            long r12 = X.AnonymousClass0x2.A0C(r14, r0)     // Catch:{ all -> 0x02fb }
            r8 = 1
            int r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0146
            r15 = 0
        L_0x0146:
            r14.close()     // Catch:{ all -> 0x0307 }
            r10.close()     // Catch:{ all -> 0x0338 }
            if (r15 != 0) goto L_0x02f6
            goto L_0x016d
        L_0x014f:
            r14.close()     // Catch:{ all -> 0x0307 }
            java.lang.StringBuilder r8 = X.C18280x3.A0f(r10)     // Catch:{ all -> 0x0338 }
            java.lang.String r0 = "failed during duplicate contact detection for jid ("
            r8.append(r0)     // Catch:{ all -> 0x0338 }
            r8.append(r9)     // Catch:{ all -> 0x0338 }
            java.lang.String r0 = ") | time: "
            r8.append(r0)     // Catch:{ all -> 0x0338 }
            long r0 = r13.A06()     // Catch:{ all -> 0x0338 }
            r8.append(r0)     // Catch:{ all -> 0x0338 }
            X.AnonymousClass0x2.A19(r8)     // Catch:{ all -> 0x0338 }
        L_0x016d:
            java.lang.Object r0 = r7.get(r3)     // Catch:{ all -> 0x0338 }
            boolean r0 = X.AnonymousClass001.A1Z(r0)     // Catch:{ all -> 0x0338 }
            if (r0 != 0) goto L_0x0199
            long r0 = r3.A0B     // Catch:{ all -> 0x0338 }
            X.2sH r8 = r5.A09     // Catch:{ all -> 0x0338 }
            long r9 = r8.A0H()     // Catch:{ all -> 0x0338 }
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0199
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0338 }
            java.lang.String r0 = "deleteContacts:not in conversation list"
            X.C18260x0.A1P(r1, r0, r3)     // Catch:{ all -> 0x0338 }
            r4.add(r3)     // Catch:{ all -> 0x0338 }
        L_0x018f:
            X.4uZ r0 = r3.A0H     // Catch:{ all -> 0x0338 }
            com.whatsapp.jid.UserJid r8 = X.AnonymousClass32Y.A03(r0)     // Catch:{ all -> 0x0338 }
            X.1fY r0 = X.AnonymousClass1fY.A00     // Catch:{ all -> 0x0338 }
            goto L_0x02c7
        L_0x0199:
            X.2k5 r0 = r3.A0F     // Catch:{ all -> 0x0338 }
            if (r0 == 0) goto L_0x018f
            X.33M r21 = X.AnonymousClass33M.A00()     // Catch:{ all -> 0x0338 }
            android.content.ContentValues r13 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0338 }
            long r0 = r3.A0B     // Catch:{ all -> 0x0338 }
            X.2sH r8 = r2.A05     // Catch:{ all -> 0x0338 }
            long r14 = r8.A0H()     // Catch:{ all -> 0x0338 }
            r12 = 1
            r10 = 0
            int r8 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            boolean r20 = X.AnonymousClass001.A1W(r8)
            java.lang.String r0 = "raw_contact_id"
            java.lang.Integer r14 = X.AnonymousClass0x7.A0f()     // Catch:{ all -> 0x0338 }
            r13.put(r0, r14)     // Catch:{ all -> 0x0338 }
            r9 = 0
            if (r20 != 0) goto L_0x01c7
            java.lang.String r0 = "display_name"
            r13.put(r0, r9)     // Catch:{ all -> 0x0338 }
        L_0x01c7:
            java.lang.String r0 = "given_name"
            r13.put(r0, r9)     // Catch:{ all -> 0x0338 }
            java.lang.String r0 = "family_name"
            r13.put(r0, r9)     // Catch:{ all -> 0x0338 }
            java.lang.String r0 = "sort_name"
            r13.put(r0, r9)     // Catch:{ all -> 0x0338 }
            java.lang.String r0 = "phone_type"
            r13.put(r0, r14)     // Catch:{ all -> 0x0338 }
            java.lang.String r0 = "phone_label"
            r13.put(r0, r9)     // Catch:{ all -> 0x0338 }
            java.lang.String r0 = "nickname"
            r13.put(r0, r9)     // Catch:{ all -> 0x0338 }
            java.lang.String r0 = "company"
            r13.put(r0, r9)     // Catch:{ all -> 0x0338 }
            java.lang.String r0 = "title"
            r13.put(r0, r9)     // Catch:{ all -> 0x0338 }
            java.lang.String r0 = "is_starred"
            r13.put(r0, r9)     // Catch:{ all -> 0x0338 }
            X.4uZ r8 = r3.A0H     // Catch:{ all -> 0x0338 }
            X.4Fq r11 = r11.A0C()     // Catch:{ IllegalArgumentException -> 0x0268 }
            X.3Yo r19 = r11.Axl()     // Catch:{ all -> 0x025a }
            java.lang.String r17 = "wa_contacts"
            java.lang.String r16 = "wa_contacts._id = ?"
            java.lang.String[] r15 = new java.lang.String[r12]     // Catch:{ all -> 0x024c }
            long r0 = r3.A0F()     // Catch:{ all -> 0x024c }
            X.AnonymousClass0x2.A1S(r15, r10, r0)     // Catch:{ all -> 0x024c }
            r1 = r17
            r0 = r16
            long r17 = X.AnonymousClass361.A07(r13, r11, r1, r0, r15)     // Catch:{ all -> 0x024a }
            r15 = 1
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            boolean r16 = X.AnonymousClass000.A1T(r0)
            boolean r0 = r8 instanceof X.C27991fJ     // Catch:{ all -> 0x0248 }
            if (r0 == 0) goto L_0x022e
            r1 = r8
            X.1fJ r1 = (X.C27991fJ) r1     // Catch:{ all -> 0x0248 }
            r0 = r19
            r2.A07(r0, r11, r1, r9)     // Catch:{ all -> 0x0248 }
        L_0x022e:
            java.lang.String r15 = "wa_group_admin_settings"
            java.lang.String r13 = "jid = ?"
            java.lang.String[] r1 = new java.lang.String[r12]     // Catch:{ all -> 0x0248 }
            java.lang.String r0 = X.C627336j.A07(r8)     // Catch:{ all -> 0x0248 }
            r1[r10] = r0     // Catch:{ all -> 0x0248 }
            X.AnonymousClass361.A08(r11, r15, r13, r1)     // Catch:{ all -> 0x0248 }
            r19.A00()     // Catch:{ all -> 0x0248 }
            r19.close()     // Catch:{ all -> 0x0258 }
            r11.close()     // Catch:{ IllegalArgumentException -> 0x0266 }
            goto L_0x0278
        L_0x0248:
            r1 = move-exception
            goto L_0x024f
        L_0x024a:
            r1 = move-exception
            goto L_0x024d
        L_0x024c:
            r1 = move-exception
        L_0x024d:
            r16 = 0
        L_0x024f:
            r19.close()     // Catch:{ all -> 0x0253 }
            goto L_0x0257
        L_0x0253:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0258 }
        L_0x0257:
            throw r1     // Catch:{ all -> 0x0258 }
        L_0x0258:
            r1 = move-exception
            goto L_0x025d
        L_0x025a:
            r1 = move-exception
            r16 = 0
        L_0x025d:
            r11.close()     // Catch:{ all -> 0x0261 }
            goto L_0x0265
        L_0x0261:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalArgumentException -> 0x0266 }
        L_0x0265:
            throw r1     // Catch:{ IllegalArgumentException -> 0x0266 }
        L_0x0266:
            r8 = move-exception
            goto L_0x026b
        L_0x0268:
            r8 = move-exception
            r16 = 0
        L_0x026b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0338 }
            java.lang.String r0 = "contact-mgr-db/unable to nullify contact android info "
            java.lang.String r0 = X.AnonymousClass000.A0P(r3, r0, r1)     // Catch:{ all -> 0x0338 }
            X.C626936e.A08(r0, r8)     // Catch:{ all -> 0x0338 }
        L_0x0278:
            r3.A0F = r9     // Catch:{ all -> 0x0338 }
            if (r20 == 0) goto L_0x0282
            java.lang.String r0 = r3.A0J()     // Catch:{ all -> 0x0338 }
            r3.A0N = r0     // Catch:{ all -> 0x0338 }
        L_0x0282:
            r3.A0P = r9     // Catch:{ all -> 0x0338 }
            r3.A0L = r14     // Catch:{ all -> 0x0338 }
            r3.A0V = r9     // Catch:{ all -> 0x0338 }
            r3.A0R = r9     // Catch:{ all -> 0x0338 }
            r3.A0Q = r9     // Catch:{ all -> 0x0338 }
            r3.A0W = r9     // Catch:{ all -> 0x0338 }
            r3.A0U = r9     // Catch:{ all -> 0x0338 }
            r3.A0O = r9     // Catch:{ all -> 0x0338 }
            r3.A0Z = r9     // Catch:{ all -> 0x0338 }
            X.2zN r0 = X.C60912zN.A05     // Catch:{ all -> 0x0338 }
            r3.A0K = r0     // Catch:{ all -> 0x0338 }
            r3.A0r = r10     // Catch:{ all -> 0x0338 }
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0338 }
            java.lang.String r0 = "android info nullified for contact "
            r8.append(r0)     // Catch:{ all -> 0x0338 }
            r8.append(r3)     // Catch:{ all -> 0x0338 }
            java.lang.String r1 = " | time: "
            r0 = r21
            X.AnonymousClass33M.A04(r0, r1, r8)     // Catch:{ all -> 0x0338 }
            if (r16 == 0) goto L_0x018f
            X.1hq r0 = X.C34461vC.A00(r2)     // Catch:{ all -> 0x0338 }
            java.util.Iterator r1 = X.C61102zi.A03(r0)     // Catch:{ all -> 0x0338 }
        L_0x02b7:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0338 }
            if (r0 == 0) goto L_0x018f
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0338 }
            X.4Eo r0 = (X.C85004Eo) r0     // Catch:{ all -> 0x0338 }
            r0.BPs(r3)     // Catch:{ all -> 0x0338 }
            goto L_0x02b7
        L_0x02c7:
            boolean r0 = X.AnonymousClass000.A1Y(r8, r0)
            r3 = 0
            if (r0 == 0) goto L_0x02d4
            java.lang.String r0 = "deleting MeJid status from ContactManager/deleteStatusesOnContactDeletion"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0338 }
            goto L_0x02ee
        L_0x02d4:
            X.33e r0 = r5.A0E     // Catch:{ all -> 0x0338 }
            int r2 = r0.A03(r8)     // Catch:{ all -> 0x0338 }
            java.lang.StringBuilder r1 = X.C18320x8.A0j(r2)     // Catch:{ all -> 0x0338 }
            java.lang.String r0 = " status of UserJid "
            r1.append(r0)     // Catch:{ all -> 0x0338 }
            r1.append(r8)     // Catch:{ all -> 0x0338 }
            java.lang.String r0 = " deleted."
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0338 }
            if (r2 <= 0) goto L_0x02ee
            r3 = 1
        L_0x02ee:
            if (r22 != 0) goto L_0x02f2
            if (r3 == 0) goto L_0x00ff
        L_0x02f2:
            r22 = 1
            goto L_0x0101
        L_0x02f6:
            r4.add(r3)     // Catch:{ all -> 0x0338 }
            goto L_0x0101
        L_0x02fb:
            r1 = move-exception
            if (r14 == 0) goto L_0x0306
            r14.close()     // Catch:{ all -> 0x0302 }
            goto L_0x0306
        L_0x0302:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0307 }
        L_0x0306:
            throw r1     // Catch:{ all -> 0x0307 }
        L_0x0307:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x030c }
            goto L_0x0310
        L_0x030c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0338 }
        L_0x0310:
            throw r1     // Catch:{ all -> 0x0338 }
        L_0x0311:
            if (r22 == 0) goto L_0x031e
            android.os.Handler r1 = r5.A01     // Catch:{ all -> 0x0338 }
            r0 = 46
            X.3Zi r0 = X.C69963Zi.A00(r5, r0)     // Catch:{ all -> 0x0338 }
            r1.post(r0)     // Catch:{ all -> 0x0338 }
        L_0x031e:
            int r0 = r4.size()     // Catch:{ all -> 0x0338 }
            if (r0 <= 0) goto L_0x0327
            r5.A0g(r4)     // Catch:{ all -> 0x0338 }
        L_0x0327:
            r0 = r27
            r5.A0c(r0)     // Catch:{ all -> 0x0338 }
            r24.A00()     // Catch:{ all -> 0x0338 }
            r24.close()     // Catch:{ all -> 0x0342 }
            r25.close()     // Catch:{ all -> 0x0351 }
            if (r26 == 0) goto L_0x034f
            goto L_0x034c
        L_0x0338:
            r1 = move-exception
            r24.close()     // Catch:{ all -> 0x033d }
            goto L_0x0341
        L_0x033d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0342 }
        L_0x0341:
            throw r1     // Catch:{ all -> 0x0342 }
        L_0x0342:
            r1 = move-exception
            r25.close()     // Catch:{ all -> 0x0347 }
            goto L_0x034b
        L_0x0347:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0351 }
        L_0x034b:
            throw r1     // Catch:{ all -> 0x0351 }
        L_0x034c:
            r6.A0E()     // Catch:{ all -> 0x0351 }
        L_0x034f:
            monitor-exit(r6)     // Catch:{ all -> 0x0351 }
            return
        L_0x0351:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0351 }
            throw r0
        L_0x0354:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65203Gp.A0L(java.util.Collection, java.util.Collection):void");
    }

    public boolean A0R() {
        if (this.A0A.A05.A08()) {
            return true;
        }
        C43502Sj r1 = this.A0C;
        if (!r1.A00.A0Y() || !C18280x3.A1W(r1.A03.A01(), "companion_syncd_dirty")) {
            return false;
        }
        return true;
    }

    public /* synthetic */ void BQS(C48932fi r1) {
    }

    public /* synthetic */ void BQx(C48932fi r1) {
    }

    public void BR0(C48932fi r11) {
        if (this.A0X.A0D().size() == 1 && !C56972sr.A0C(this)) {
            C64663Ek r8 = this.A0H;
            long A0H2 = r8.A02.A0H();
            C613730l r9 = r8.A01;
            C18270x1.A0i(C613730l.A00(r9), "syncd_first_companion_reg_logging_time", A0H2);
            long j = r9.A02().getLong("syncd_last_companion_dereg_logging_time", 0);
            if (j != 0) {
                C18270x1.A0n(r9.A02(), "syncd_last_companion_dereg_logging_time");
                AnonymousClass1WR r1 = new AnonymousClass1WR();
                r1.A00 = C18310x6.A0f(A0H2, j);
                C64663Ek.A05(r8, r1);
            }
            A0D();
            A0F();
        }
    }

    public /* synthetic */ void BR2(C48932fi r1) {
    }

    public /* synthetic */ void BR4(AnonymousClass33G r1) {
    }

    public /* synthetic */ void BRi(C624134x r1) {
    }

    public void BSh(C30301mE r5) {
        if (r5 instanceof C30851nJ) {
            try {
                C56792sZ r3 = this.A0M;
                C30851nJ r52 = (C30851nJ) r5;
                if (r52.A01 && !r3.A0A()) {
                    r3.A06();
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("SyncdKeyManager/onFMessageAppStateSyncKeyShareSent rowId=");
                    C18260x0.A1H(A0o, r52.A1L);
                    r3.A09(AnonymousClass0x9.A15(r52.A1v().values()));
                    this.A0h.BkM(new C33231sf(this, 1));
                }
            } catch (C23341Sf e) {
                A0J(Integer.valueOf(e.errorCode));
            }
        }
    }

    public void BUB() {
        this.A0h.BkN(C69963Zi.A00(this, 19), "SyncManager/onHandlerConnected");
    }

    public /* synthetic */ void BVB(C95814uZ r1) {
    }

    public void BWS(C624134x r4, int i) {
        if ((!C66653Mg.A00(this.A0e) && !C56972sr.A0C(this)) || r4.A1J.A00 == null) {
            return;
        }
        if (i == -1 || i == 22) {
            this.A0g.execute(new C70193a6(this, 33, r4));
        }
    }

    public /* synthetic */ void BWW(C624134x r1) {
    }

    public /* synthetic */ void BWY(C624134x r1) {
    }

    public /* synthetic */ void BWf(C95814uZ r1) {
    }

    public /* synthetic */ void BWj(Collection collection) {
    }

    public /* synthetic */ void BX3(C95804uY r1) {
    }

    public /* synthetic */ void BX4(C624134x r1) {
    }

    public /* synthetic */ void BX6(C95804uY r1) {
    }

    public void Bdq() {
        C58582vU r1 = this.A0P;
        synchronized (r1) {
            Set set = r1.A00;
            if (set != null) {
                set.clear();
            }
        }
        this.A0W.A0D();
        SharedPreferences.Editor A002 = C613730l.A00(this.A0J);
        Iterator it = C613730l.A03.iterator();
        while (it.hasNext()) {
            A002.remove(AnonymousClass001.A0m(it));
        }
        A002.apply();
        C34441vA r2 = this.A0i;
        r2.A05("SYNC_MANAGER_CONTACTS_JID_ADDED", (String) null);
        r2.A05("SYNC_MANAGER_CONTACTS_JID_REMOVED", (String) null);
    }

    public C65203Gp(C55682qk r3, C56972sr r4, C66663Mh r5, C153167am r6, C28991i6 r7, C68413Tb r8, C50072ha r9, C43502Sj r10, C58872vx r11, C64743Et r12, C44302Vn r13, C42772Pl r14, C64663Ek r15, C64673El r16, C613730l r17, C28631hW r18, AnonymousClass339 r19, C56792sZ r20, C55392qH r21, C44322Vp r22, C58582vU r23, C64773Ex r24, AnonymousClass314 r25, C55262q4 r26, C56612sH r27, AnonymousClass34c r28, C56982ss r29, AnonymousClass1RE r30, C29041iB r31, C56272ri r32, C623934v r33, AnonymousClass2G5 r34, AnonymousClass1VX r35, C50962j3 r36, AnonymousClass31C r37, C66653Mg r38, C56932sn r39, AnonymousClass4FS r40, C34441vA r41, AnonymousClass1RI r42) {
        this.A0T = r27;
        this.A0b = r35;
        this.A05 = r3;
        this.A06 = r4;
        AnonymousClass4FS r1 = r40;
        this.A0h = r1;
        this.A0V = r29;
        this.A07 = r5;
        this.A0W = r30;
        this.A0i = r41;
        this.A0d = r37;
        this.A0Q = r24;
        this.A0M = r20;
        this.A0N = r21;
        this.A0H = r15;
        this.A0j = r42;
        this.A0e = r38;
        this.A0f = r39;
        this.A08 = r6;
        this.A0E = r12;
        this.A0Z = r33;
        this.A0K = r18;
        this.A0R = r25;
        this.A0L = r19;
        this.A0I = r16;
        this.A0Y = r32;
        this.A0X = r31;
        this.A0F = r13;
        this.A0U = r28;
        this.A0J = r17;
        this.A0c = r36;
        this.A09 = r7;
        this.A0B = r9;
        this.A0a = r34;
        this.A0A = r8;
        this.A0C = r10;
        this.A0D = r11;
        this.A0G = r14;
        this.A0O = r22;
        this.A0P = r23;
        this.A0S = r26;
        this.A0g = C72173dI.A00(r1);
    }

    public static Set A00(C65203Gp r1, Object obj) {
        return r1.A0B(Collections.singletonList(obj));
    }

    public Set A0B(Collection collection) {
        Set A0C2;
        if (!A0Q()) {
            return Collections.emptySet();
        }
        C55392qH r1 = this.A0N;
        synchronized (r1) {
            A0C2 = r1.A02.A0C(collection);
        }
        return A0C2;
    }

    public void A0D() {
        C22571Os r0;
        if (A0Q() && !C56972sr.A0C(this) && (r0 = (C22571Os) this.A0c.A00("primary_feature")) != null) {
            A0K(r0.A0E());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        if (r0 != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G() {
        /*
            r9 = this;
            boolean r0 = r9.A0R()
            if (r0 != 0) goto L_0x0171
            monitor-enter(r9)
            boolean r0 = r9.A04     // Catch:{ all -> 0x016e }
            if (r0 != 0) goto L_0x016c
            X.2ri r0 = r9.A0Y     // Catch:{ all -> 0x016e }
            X.1RE r0 = r0.A00     // Catch:{ all -> 0x016e }
            X.4GK r3 = r0.get()     // Catch:{ all -> 0x016e }
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0160 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0160 }
            java.lang.String r1 = "SELECT collection_name FROM collection_versions WHERE dirty_version = 0 OR dirty_version > version"
            java.lang.String r0 = "CollectionVersionsTable.SELECT_DIRTY_COLLECTIONS"
            android.database.Cursor r2 = X.C56862sg.A01(r2, r1, r0)     // Catch:{ all -> 0x0160 }
            java.util.HashSet r4 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x0154 }
        L_0x0024:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0154 }
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "collection_name"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x0154 }
            r4.add(r0)     // Catch:{ all -> 0x0154 }
            goto L_0x0024
        L_0x0034:
            r2.close()     // Catch:{ all -> 0x0160 }
            r3.close()     // Catch:{ all -> 0x016e }
            X.34v r6 = r9.A0Z     // Catch:{ all -> 0x016e }
            boolean r0 = r6.A0J()     // Catch:{ all -> 0x016e }
            r0 = r0 ^ 1
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto L_0x006f
            java.util.Set r0 = X.AnonymousClass33W.A09     // Catch:{ all -> 0x016e }
            java.util.HashSet r1 = X.AnonymousClass0x9.A15(r0)     // Catch:{ all -> 0x016e }
            java.lang.String r0 = "critical_unblock_low"
            r1.remove(r0)     // Catch:{ all -> 0x016e }
            java.util.List r5 = r6.A0B(r1, r7)     // Catch:{ all -> 0x016e }
            java.util.Set r2 = java.util.Collections.singleton(r0)     // Catch:{ all -> 0x016e }
            X.3Mh r1 = r9.A07     // Catch:{ all -> 0x016e }
            X.1Ek r0 = X.C66663Mh.A1N     // Catch:{ all -> 0x016e }
            int r0 = r1.A03(r0)     // Catch:{ all -> 0x016e }
            java.util.List r0 = r6.A0B(r2, r0)     // Catch:{ all -> 0x016e }
            r5.addAll(r0)     // Catch:{ all -> 0x016e }
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x016e }
            if (r0 == 0) goto L_0x00b2
        L_0x006f:
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x016e }
            X.4GK r8 = X.C18630y0.A01(r6)     // Catch:{ all -> 0x016e }
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00a9 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = "SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE is_ready_to_sync = 1  ORDER BY _id ASC  LIMIT ?"
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x00a9 }
            X.C18270x1.A1O(r1, r7)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "PendingMutationsTable.SELECT_MUTATIONS_WITH_LIMIT"
            android.database.Cursor r2 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x00a9 }
        L_0x008b:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x0099
            X.33W r0 = r6.A03(r2)     // Catch:{ all -> 0x009d }
            r5.add(r0)     // Catch:{ all -> 0x009d }
            goto L_0x008b
        L_0x0099:
            r2.close()     // Catch:{ all -> 0x00a9 }
            goto L_0x00af
        L_0x009d:
            r1 = move-exception
            if (r2 == 0) goto L_0x00a8
            r2.close()     // Catch:{ all -> 0x00a4 }
            goto L_0x00a8
        L_0x00a4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00a9 }
        L_0x00a8:
            throw r1     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0165 }
            goto L_0x0169
        L_0x00af:
            r8.close()     // Catch:{ all -> 0x016e }
        L_0x00b2:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x016e }
            java.lang.String r0 = "sync-manager/prepareAndSendRequest loaded "
            X.AnonymousClass000.A1H(r0, r1, r5)     // Catch:{ all -> 0x016e }
            java.lang.String r0 = " pending mutation(s)"
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x016e }
            java.util.Iterator r2 = r5.iterator()     // Catch:{ all -> 0x016e }
            r1 = 0
        L_0x00c6:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x016e }
            if (r0 == 0) goto L_0x00d7
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x016e }
            if (r0 != 0) goto L_0x00c6
            r2.remove()     // Catch:{ all -> 0x016e }
            r1 = 1
            goto L_0x00c6
        L_0x00d7:
            if (r1 == 0) goto L_0x00e1
            X.3Ek r2 = r9.A0H     // Catch:{ all -> 0x016e }
            r1 = 12
            r0 = 0
            r2.A08(r1, r0)     // Catch:{ all -> 0x016e }
        L_0x00e1:
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x016e }
            if (r0 == 0) goto L_0x00ee
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x016e }
            if (r0 == 0) goto L_0x00ee
            goto L_0x0152
        L_0x00ee:
            java.util.HashMap r3 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x016e }
            java.util.Iterator r2 = r5.iterator()     // Catch:{ all -> 0x016e }
        L_0x00f6:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x016e }
            if (r0 == 0) goto L_0x010a
            X.33W r1 = X.C18320x8.A0K(r2)     // Catch:{ all -> 0x016e }
            java.lang.String r0 = r1.A06     // Catch:{ all -> 0x016e }
            java.util.List r0 = X.C18280x3.A0k(r0, r3)     // Catch:{ all -> 0x016e }
            r0.add(r1)     // Catch:{ all -> 0x016e }
            goto L_0x00f6
        L_0x010a:
            java.util.Iterator r2 = r4.iterator()     // Catch:{ all -> 0x016e }
        L_0x010e:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x016e }
            if (r0 == 0) goto L_0x0126
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x016e }
            boolean r0 = r3.containsKey(r1)     // Catch:{ all -> 0x016e }
            if (r0 != 0) goto L_0x010e
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x016e }
            r3.put(r1, r0)     // Catch:{ all -> 0x016e }
            goto L_0x010e
        L_0x0126:
            X.2sZ r0 = r9.A0M     // Catch:{ all -> 0x016e }
            X.2WC r0 = r0.A0A     // Catch:{ all -> 0x016e }
            java.util.Set r0 = r0.A00()     // Catch:{ all -> 0x016e }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x016e }
        L_0x0132:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x016e }
            if (r0 == 0) goto L_0x0140
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x016e }
            r3.remove(r0)     // Catch:{ all -> 0x016e }
            goto L_0x0132
        L_0x0140:
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x016e }
            if (r0 != 0) goto L_0x0152
            X.4FS r1 = r9.A0h     // Catch:{ all -> 0x016e }
            X.1sg r0 = new X.1sg     // Catch:{ all -> 0x016e }
            r0.<init>((X.C65203Gp) r9, (java.util.Map) r3)     // Catch:{ all -> 0x016e }
            r1.BkM(r0)     // Catch:{ all -> 0x016e }
            r0 = 1
            goto L_0x016a
        L_0x0152:
            r0 = 0
            goto L_0x016a
        L_0x0154:
            r1 = move-exception
            if (r2 == 0) goto L_0x015f
            r2.close()     // Catch:{ all -> 0x015b }
            goto L_0x015f
        L_0x015b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0160 }
        L_0x015f:
            throw r1     // Catch:{ all -> 0x0160 }
        L_0x0160:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0165 }
            goto L_0x0169
        L_0x0165:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x016e }
        L_0x0169:
            throw r1     // Catch:{ all -> 0x016e }
        L_0x016a:
            r9.A04 = r0     // Catch:{ all -> 0x016e }
        L_0x016c:
            monitor-exit(r9)     // Catch:{ all -> 0x016e }
            return
        L_0x016e:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x016e }
            throw r0
        L_0x0171:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65203Gp.A0G():void");
    }

    public void A0K(Collection collection) {
        if (A0Q()) {
            this.A0N.A04(collection);
        }
    }

    public void A0M(Collection collection, boolean z) {
        C69833Yo Axl;
        if (!C56972sr.A0C(this)) {
            synchronized (this) {
                boolean z2 = false;
                if (C66653Mg.A00(this.A0e) && !C56972sr.A0C(this)) {
                    if (((C22621Ox) this.A0c.A00("contact")) != null && A0Q()) {
                        z2 = true;
                    }
                    Set A0K2 = AnonymousClass002.A0K();
                    Set A0K3 = AnonymousClass002.A0K();
                    if (z2) {
                        ArrayList A0s = AnonymousClass001.A0s();
                        ArrayList A0s2 = AnonymousClass001.A0s();
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            AnonymousClass3ZH A0R2 = C18310x6.A0R(it);
                            UserJid A072 = AnonymousClass3ZH.A07(A0R2);
                            if (A072 != null) {
                                if (A0R2.A10) {
                                    A0s.add(A072);
                                } else {
                                    A0s2.add(A072);
                                }
                            }
                        }
                        Pair A022 = A02(A0s, A0s2);
                        A0K2 = (Set) A022.first;
                        A0K3 = (Set) A022.second;
                    }
                    C85284Fq A0C2 = this.A0j.A0C();
                    try {
                        Axl = A0C2.Axl();
                        C34441vA r1 = this.A0i;
                        r1.A06("SYNC_MANAGER_CONTACTS_JID_ADDED", A0K2);
                        r1.A06("SYNC_MANAGER_CONTACTS_JID_REMOVED", A0K3);
                        if (z) {
                            this.A0Q.A0d(collection);
                        } else {
                            this.A0Q.A0f(collection);
                        }
                        Axl.A00();
                        Axl.close();
                        A0C2.close();
                        if (z2) {
                            A0E();
                        }
                    } catch (Throwable th) {
                        try {
                            A0C2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            return;
        }
        return;
        throw th;
    }

    public void A0N(Set set) {
        C69833Yo Axl;
        if (!set.isEmpty()) {
            C55392qH r4 = this.A0N;
            synchronized (r4) {
                C85284Fq A0C2 = r4.A02.A01.A0C();
                try {
                    Axl = A0C2.Axl();
                    C623934v.A01(((AnonymousClass3H0) A0C2).A03, (String[]) set.toArray(C58152un.A0N));
                    Axl.A00();
                    Axl.close();
                    A0C2.close();
                } catch (Throwable th) {
                    try {
                        A0C2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            return;
        }
        return;
        throw th;
    }

    public void A0O(Set set) {
        if (!set.isEmpty()) {
            C55392qH r1 = this.A0N;
            synchronized (r1) {
                r1.A02.A0I(set);
            }
            A0F();
        }
    }

    public boolean A0Q() {
        Cursor A012;
        if (A0R()) {
            return false;
        }
        if (!C66653Mg.A00(this.A0e) && !C56972sr.A0C(this)) {
            return false;
        }
        C623934v r1 = this.A0Z;
        if (!r1.A0J()) {
            AnonymousClass4GK A013 = C18630y0.A01(r1);
            try {
                A012 = C56862sg.A01(((AnonymousClass3H0) A013).A03, "SELECT _id FROM pending_mutations WHERE is_ready_to_sync = 1  LIMIT 1", "PendingMutationsTable.SELECT_ANY_MUTATION");
                boolean z = false;
                if (A012.moveToNext() && AnonymousClass0x2.A0Z(A012, "_id") != null) {
                    z = true;
                }
                A012.close();
                A013.close();
                if (z) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                try {
                    A013.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        return true;
        throw th;
    }

    public void BR3(C129526aS r3) {
        if (!C56972sr.A0C(this)) {
            this.A0h.BkM(new C33241sg(r3, this));
        }
    }

    public /* synthetic */ void BUC() {
    }

    public /* synthetic */ void BUD() {
    }

    public /* synthetic */ void BUE() {
    }

    public /* synthetic */ void BUF() {
    }

    public /* synthetic */ void BXI() {
    }

    public void BZp() {
    }

    public void Bdr() {
    }

    public void BfB(UserJid userJid, String str, String str2) {
        if (!C56972sr.A0C(this) && str.isEmpty() && !str2.isEmpty()) {
            C69963Zi.A01(this.A0h, this, 18);
        }
    }

    public /* synthetic */ void BNb(C624134x r1, int i) {
    }

    public /* synthetic */ void BR1(C129526aS r1, int i) {
    }

    public /* synthetic */ void BWU(C624134x r1, int i) {
    }

    public /* synthetic */ void BWX(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BWe(Collection collection, int i) {
        C381525x.A00(this, collection, i);
    }

    public /* synthetic */ void BWg(Collection collection, Map map) {
    }

    public /* synthetic */ void BWh(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BWi(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BX5(C95804uY r1, boolean z) {
    }

    public /* synthetic */ void BY8(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BY9(C624134x r1, C624134x r2) {
    }
}
