package X;

import android.text.TextUtils;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.3Qo  reason: invalid class name and case insensitive filesystem */
public class C67763Qo implements AnonymousClass4DA {
    public final C55682qk A00;
    public final C56972sr A01;
    public final C56942so A02;
    public final MemberSuggestedGroupsManager A03;
    public final C64773Ex A04;
    public final C56612sH A05;
    public final C54292oU A06;
    public final AnonymousClass33T A07;
    public final C56982ss A08;
    public final C54302oV A09;
    public final AnonymousClass1VX A0A;
    public final C66493Lq A0B;
    public final C54932pW A0C;
    public final C66503Lr A0D;
    public final AnonymousClass2WQ A0E;
    public final AnonymousClass33S A0F;
    public final C55892r5 A0G;
    public final AnonymousClass2SY A0H;
    public final AnonymousClass4FS A0I;

    public C67763Qo(C55682qk r2, C56972sr r3, C56942so r4, MemberSuggestedGroupsManager memberSuggestedGroupsManager, C64773Ex r6, C56612sH r7, C54292oU r8, AnonymousClass33T r9, C56982ss r10, C54302oV r11, AnonymousClass1VX r12, C66493Lq r13, C54932pW r14, C66503Lr r15, AnonymousClass2WQ r16, AnonymousClass33S r17, C55892r5 r18, AnonymousClass2SY r19, AnonymousClass4FS r20) {
        this.A05 = r7;
        this.A0A = r12;
        this.A00 = r2;
        this.A01 = r3;
        this.A06 = r8;
        this.A0I = r20;
        this.A08 = r10;
        this.A0F = r17;
        this.A0C = r14;
        this.A04 = r6;
        this.A0E = r16;
        this.A0B = r13;
        this.A0D = r15;
        this.A0H = r19;
        this.A0G = r18;
        this.A02 = r4;
        this.A07 = r9;
        this.A03 = memberSuggestedGroupsManager;
        this.A09 = r11;
    }

    public static final Set A00(AnonymousClass36K r11, int i) {
        long j;
        LinkedHashSet A17 = AnonymousClass0x9.A17();
        r11.A0r("link_type", (String) null);
        Iterator A0M = AnonymousClass36K.A0M(r11, "group");
        while (A0M.hasNext()) {
            AnonymousClass36K A0Y = C18310x6.A0Y(A0M);
            GroupJid groupJid = (GroupJid) A0Y.A0g(C27991fJ.class, "jid");
            String str = "";
            try {
                str = A0Y.A0r("subject", (String) null);
                j = C18290x4.A0A(AnonymousClass36K.A01(A0Y, "subject_ts"));
            } catch (AnonymousClass24Y e) {
                Log.e("cannot get group subject from notification", e);
                j = 0;
            }
            if (groupJid != null && !TextUtils.isEmpty(str)) {
                A17.add(new C52882mC(groupJid, str, i, j));
            }
        }
        return A17;
    }

    public final void A01(UserJid userJid, String str) {
        if (!TextUtils.isEmpty(str)) {
            C64773Ex r1 = this.A04;
            AnonymousClass3ZH A0A2 = r1.A0A(userJid);
            A0A2.A0b = str;
            r1.A0N(A0A2);
        }
    }

    public int[] B81() {
        int[] A0E2 = C18330xA.A0E();
        A0E2[0] = 209;
        return A0E2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v90, resolved type: X.1oZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v92, resolved type: X.1ou} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v52, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v155, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v290, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v156, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v158, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v92, resolved type: com.whatsapp.jid.PhoneUserJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v126, resolved type: X.1oZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v127, resolved type: X.1oZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v128, resolved type: X.1oZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v161, resolved type: X.1oK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v162, resolved type: X.1oL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v164, resolved type: X.1oE} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v20 */
    /* JADX WARNING: type inference failed for: r0v355, types: [java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r7v28, types: [int] */
    /* JADX WARNING: type inference failed for: r2v119, types: [X.1mI] */
    /* JADX WARNING: type inference failed for: r15v50 */
    /* JADX WARNING: type inference failed for: r15v53, types: [com.whatsapp.jid.UserJid] */
    /* JADX WARNING: type inference failed for: r11v90, types: [X.3am] */
    /* JADX WARNING: type inference failed for: r11v91, types: [X.3cM] */
    /* JADX WARNING: type inference failed for: r7v52 */
    /* JADX WARNING: type inference failed for: r15v69 */
    /* JADX WARNING: type inference failed for: r15v70 */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x0b57  */
    /* JADX WARNING: Removed duplicated region for block: B:456:0x0bbe  */
    /* JADX WARNING: Removed duplicated region for block: B:519:0x0e06 A[Catch:{ all -> 0x0fce, 24P -> 0x14fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:523:0x0e17 A[Catch:{ all -> 0x0fce, 24P -> 0x14fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:574:0x0fd3 A[Catch:{ all -> 0x0fce, 24P -> 0x14fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:582:0x1046 A[Catch:{ all -> 0x0fce, 24P -> 0x14fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:583:0x1047 A[Catch:{ all -> 0x0fce, 24P -> 0x14fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:601:0x10b9 A[Catch:{ all -> 0x0fce, 24P -> 0x14fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:602:0x10bb A[Catch:{ all -> 0x0fce, 24P -> 0x14fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:695:0x12f9 A[Catch:{ all -> 0x0fce, 24P -> 0x14fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:702:0x1327 A[Catch:{ all -> 0x0fce, 24P -> 0x14fc }, LOOP:8: B:700:0x1321->B:702:0x1327, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:705:0x1352 A[Catch:{ all -> 0x0fce, 24P -> 0x14fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:711:0x137b A[Catch:{ all -> 0x0fce, 24P -> 0x14fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:718:0x139a A[Catch:{ all -> 0x0fce, 24P -> 0x14fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:733:0x140b A[Catch:{ all -> 0x0fce, 24P -> 0x14fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:739:0x1451 A[ADDED_TO_REGION, Catch:{ all -> 0x0fce, 24P -> 0x14fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:759:0x14c3 A[Catch:{ all -> 0x0fce, 24P -> 0x14fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:765:0x14dc A[Catch:{ all -> 0x0fce, 24P -> 0x14fc }, LOOP:9: B:763:0x14d6->B:765:0x14dc, LOOP_END] */
    public boolean BFA(android.os.Message r84, int r85) {
        /*
            r83 = this;
            r4 = r83
            r0 = 209(0xd1, float:2.93E-43)
            r7 = 0
            r1 = r85
            if (r1 == r0) goto L_0x000a
            return r7
        L_0x000a:
            r2 = r84
            android.os.Bundle r1 = r2.getData()
            java.lang.String r0 = "stanzaKey"
            android.os.Parcelable r10 = r1.getParcelable(r0)
            X.39T r10 = (X.AnonymousClass39T) r10
            java.lang.String r0 = "stanzaKey is null"
            X.C626936e.A07(r10, r0)
            com.whatsapp.jid.UserJid r6 = r10.A00()
            java.lang.Object r2 = r2.obj
            X.36K r2 = (X.AnonymousClass36K) r2
            X.36K r5 = r2.A0j()
            boolean r22 = X.C627336j.A0L(r6)
            if (r22 == 0) goto L_0x0bd2
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r1 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r0 = "participant_pn"
            com.whatsapp.jid.Jid r12 = r2.A0g(r1, r0)
            com.whatsapp.jid.PhoneUserJid r12 = (com.whatsapp.jid.PhoneUserJid) r12
            if (r12 == 0) goto L_0x0048
            X.3Lq r0 = r4.A0B
            r1 = r6
            X.1fH r1 = (X.C27981fH) r1
            X.2mQ r0 = r0.A13
            r0.A00(r1, r12)
        L_0x0048:
            X.2r5 r0 = r4.A0G
            X.1gR r3 = X.C55892r5.A00(r0, r10)
            r1 = 3
            if (r3 == 0) goto L_0x0058
            java.lang.String r0 = r5.A00
            r3.A00 = r0
            r3.A03(r1)
        L_0x0058:
            java.lang.String r0 = "addressing_mode"
            java.lang.String r0 = X.AnonymousClass36K.A0L(r2, r0)
            java.lang.String r39 = X.C381125t.A00(r0)
            com.whatsapp.jid.Jid r0 = r10.A02
            r25 = r0
            X.4uZ r0 = X.C627336j.A02(r25)
            X.1fJ r15 = X.AnonymousClass34R.A01(r0)
            X.2ss r14 = r4.A08
            boolean r0 = r14.A0N(r15)
            if (r0 == 0) goto L_0x0091
            java.lang.String r1 = "lid"
            r0 = r39
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0091
            X.2qk r3 = r4.A00
            java.lang.StringBuilder r1 = X.C18290x4.A0v(r15)
            java.lang.String r0 = " is a CAG with LID addressing mode "
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r0 = "GroupLidInfra/cag_lid_addressing_mode"
            r3.A0A(r0, r7, r1)
        L_0x0091:
            X.2pW r1 = r4.A0C
            java.lang.String r0 = r5.A00
            r18 = r0
            r9 = 3
            r3 = 0
            r11 = 3
            r0 = r39
            boolean r0 = r1.A01(r15, r0)
            r8 = 1
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = "remove"
            boolean r0 = X.AnonymousClass36K.A0W(r5, r0)
            if (r0 == 0) goto L_0x2860
            X.2sr r0 = r4.A01
            com.whatsapp.jid.PhoneUserJid r13 = X.C56972sr.A04(r0)
            X.C626936e.A06(r13)
            X.2qk r0 = r4.A00
            java.util.Map r1 = X.AnonymousClass36J.A06(r5, r0)
            int r0 = r1.size()
            if (r0 != r8) goto L_0x2860
            boolean r0 = r1.containsKey(r13)
            if (r0 == 0) goto L_0x2860
        L_0x00c7:
            java.lang.String r13 = "t"
            r0 = 0
            long r26 = r2.A0e(r13, r0)
            r16 = 1000(0x3e8, double:4.94E-321)
            long r26 = r26 * r16
            int r13 = (r26 > r0 ? 1 : (r26 == r0 ? 0 : -1))
            if (r13 != 0) goto L_0x00de
            X.2sH r13 = r4.A05
            long r26 = r13.A0H()
        L_0x00de:
            java.lang.String r13 = "add"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r13)
            if (r13 == 0) goto L_0x02cd
            X.2qk r2 = r4.A00
            java.util.Map r14 = X.AnonymousClass36J.A06(r5, r2)
            int r2 = r14.size()
            if (r2 <= 0) goto L_0x2874
            X.1fJ r21 = X.AnonymousClass34R.A00(r25)
            java.lang.String r2 = "v_id"
            long r16 = r5.A0e(r2, r0)
            X.3Lq r6 = r4.A0B
            r0 = r21
            boolean r0 = r6.A0j(r0)
            if (r0 == 0) goto L_0x2874
            java.lang.String r0 = "reason"
            r30 = 0
            java.lang.String r36 = r5.A0r(r0, r3)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/onGroupAddUsers/"
            X.AnonymousClass0x7.A1F(r1, r0, r10)
            java.util.Collection r0 = r14.values()
            X.C18260x0.A0o(r0, r1)
            X.1fJ r5 = X.AnonymousClass34R.A00(r25)
            boolean r0 = r14.isEmpty()
            r11 = 2
            if (r0 != 0) goto L_0x014a
            boolean r0 = r6.A0k(r5, r14)
            if (r0 == 0) goto L_0x0145
            X.3Lr r0 = r6.A0t
            r0.A0E(r5, r3, r11)
        L_0x0136:
            X.33S r0 = r6.A11
        L_0x0138:
            r0.A01(r10)
        L_0x013b:
            X.2oV r3 = r4.A09
            r2 = r21
            r0 = r16
            r3.A02(r2, r0)
        L_0x0144:
            return r8
        L_0x0145:
            X.2mQ r0 = r6.A13
            r0.A02(r14)
        L_0x014a:
            X.5ZU r0 = r6.A0H
            r0.A0b(r5)
            X.3Ex r0 = r6.A0F
            X.3ZH r1 = r0.A09(r5)
            X.2sj r9 = r6.A0b
            X.33k r2 = X.C56892sj.A01(r9, r5)
            if (r1 == 0) goto L_0x0171
            X.2sr r0 = r6.A06
            r24 = r0
            boolean r0 = r2.A0O(r0)
            if (r0 != 0) goto L_0x0187
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r24)
            boolean r0 = r14.containsKey(r0)
            if (r0 != 0) goto L_0x0187
        L_0x0171:
            java.lang.String r0 = "groupmgr/onGroupAddUsers/requerygroupinfo"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Lr r0 = r6.A0t
            r0.A0E(r5, r3, r11)
            X.2s0 r2 = r6.A14
            if (r1 != 0) goto L_0x0184
            r0 = 0
        L_0x0180:
            r2.A01(r5, r0, r11)
            goto L_0x0136
        L_0x0184:
            int r0 = r1.A06
            goto L_0x0180
        L_0x0187:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.ArrayList r22 = X.C18290x4.A0z(r14)
            boolean r0 = r9.A0D(r5)
            r20 = 1
            r19 = r0 ^ 1
            boolean r0 = r1.A13
            if (r0 == 0) goto L_0x0233
            boolean r0 = r9.A0D(r5)
            if (r0 == 0) goto L_0x0233
        L_0x01a1:
            java.util.Iterator r18 = X.AnonymousClass001.A0v(r14)
        L_0x01a5:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0237
            java.lang.Object r13 = r18.next()
            X.2pI r13 = (X.C54792pI) r13
            com.whatsapp.jid.UserJid r12 = r13.A02
            java.lang.String r1 = r13.A04
            r3.add(r12)
            X.C162457s7.A0J(r1, r7)
            java.lang.String r0 = "admin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0227
            r11 = 1
        L_0x01c4:
            X.318 r0 = r6.A0i
            r23 = r0
            java.util.Set r0 = r0.A0D(r12)
            java.util.Set r0 = X.C620833k.A01(r0)
            X.2zG r1 = new X.2zG
            r1.<init>(r12, r0, r11, r7)
            r0 = r22
            r0.add(r1)
            boolean r0 = r13.A00()
            if (r0 == 0) goto L_0x020d
            X.2pW r0 = r6.A0r
            X.C162457s7.A0J(r5, r7)
            X.3Ex r15 = r0.A02
            X.3ZH r0 = r15.A09(r5)
            if (r0 == 0) goto L_0x021c
            java.lang.String r1 = "lid"
            java.lang.String r0 = r0.A0M
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x021c
        L_0x01f7:
            X.1fH r1 = r13.A00
            r0 = r23
            java.util.Set r0 = r0.A0D(r1)
            java.util.Set r13 = X.C620833k.A01(r0)
            X.2zG r0 = new X.2zG
            r0.<init>(r1, r13, r11, r7)
            r1 = r22
            r1.add(r0)
        L_0x020d:
            if (r20 == 0) goto L_0x0214
            X.2oj r0 = r6.A0X
            r0.A02(r5, r12)
        L_0x0214:
            if (r19 == 0) goto L_0x01a5
            X.2lN r0 = r6.A0g
            r0.A01(r5, r12)
            goto L_0x01a5
        L_0x021c:
            X.3ZH r0 = r15.A09(r5)
            if (r0 == 0) goto L_0x020d
            boolean r0 = r0.A0k
            if (r0 == 0) goto L_0x020d
            goto L_0x01f7
        L_0x0227:
            java.lang.String r0 = "superadmin"
            boolean r0 = r0.equals(r1)
            int r11 = X.C18310x6.A02(r0)
            goto L_0x01c4
        L_0x0233:
            r20 = 0
            goto L_0x01a1
        L_0x0237:
            X.3Cp r11 = r6.A0K
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r7]
            java.lang.Object[] r1 = r3.toArray(r0)
            com.whatsapp.jid.UserJid[] r1 = (com.whatsapp.jid.UserJid[]) r1
            r0 = 2
            r11.A01(r1, r0)
            X.4FS r11 = r6.A1C
            r1 = 23
            X.3Zx r0 = new X.3Zx
            r0.<init>(r6, r1, r3)
            r11.BkM(r0)
            r0 = r22
            r6.A0F(r2, r0)
            X.2pW r0 = r6.A0r
            boolean r0 = r0.A02(r5)
            if (r0 == 0) goto L_0x0263
            r0 = r16
            r9.A06(r2, r0)
        L_0x0263:
            r0 = 29
            X.C70343aL.A01(r11, r6, r5, r14, r0)
            java.util.List r1 = r6.A08(r5, r3)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x02cb
            boolean r0 = r9.A0D(r5)
            if (r0 != 0) goto L_0x02c5
            X.2ss r0 = r6.A0S
            boolean r0 = r0.A0N(r5)
            if (r0 == 0) goto L_0x02c5
            com.whatsapp.jid.UserJid r1 = r10.A00()
            r0 = r24
            boolean r0 = r0.A0a(r1)
            if (r0 == 0) goto L_0x02c5
        L_0x028c:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x02c5
            com.whatsapp.jid.UserJid r33 = r10.A00()
            X.2ss r0 = r6.A0S
            int r40 = r0.A06(r5)
            r34 = r30
            r37 = r30
            r38 = r30
            r28 = r6
            r29 = r2
            r31 = r30
            r32 = r5
            r35 = r10
            r39 = r3
            r41 = r26
            r43 = r16
            r45 = r7
            r28.A0D(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r43, r45)
        L_0x02b7:
            X.3Wi r3 = r6.A05
            r1 = 30
            X.3aL r0 = new X.3aL
            r0.<init>(r6, r5, r2, r1)
            r3.A0S(r0)
            goto L_0x013b
        L_0x02c5:
            X.33S r0 = r6.A11
            r0.A01(r10)
            goto L_0x02b7
        L_0x02cb:
            r3 = r1
            goto L_0x028c
        L_0x02cd:
            java.lang.String r13 = "create"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r13)
            if (r13 == 0) goto L_0x02ee
            X.36K r11 = r5.A0j()
            java.lang.String r35 = ""
            java.lang.String r12 = "type"
            r0 = r35
            java.lang.String r13 = r5.A0r(r12, r0)
            java.lang.String r0 = "group"
            boolean r0 = X.AnonymousClass36K.A0W(r11, r0)
            if (r0 == 0) goto L_0x2874
            goto L_0x0bd5
        L_0x02ee:
            java.lang.String r13 = "delete"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r13)
            if (r13 == 0) goto L_0x03c8
            java.lang.String r0 = "reason"
            r14 = 0
            java.lang.String r1 = r5.A0r(r0, r3)
            java.lang.String r0 = "delete_parent"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03bc
            r1 = 1
        L_0x0307:
            X.3Lq r2 = r4.A0B
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/onGroupDelete/"
            X.C18260x0.A1R(r3, r0, r10)
            X.4uZ r0 = X.C627336j.A02(r25)
            X.1fJ r3 = X.AnonymousClass34R.A03(r0)
            if (r3 == 0) goto L_0x1b58
            X.2ba r0 = r2.A0a
            java.util.Map r0 = r0.A04
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x1b58
            r5 = 2
            if (r1 != r5) goto L_0x033a
            X.2ss r4 = r2.A0S
            int r0 = r4.A07(r3)
            r13 = 0
            if (r0 == r8) goto L_0x150c
            if (r0 == r9) goto L_0x1b58
            java.lang.String r0 = "groupmgr/onGroupDelete/Integrity Deactivate notification received for non-CAG"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r1 = 0
        L_0x033a:
            r2.A0R(r3)
            X.33S r0 = r2.A11
            r0.A01(r10)
            if (r1 != r8) goto L_0x0144
            X.2rN r0 = r2.A1B
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0379
            X.2ss r0 = r2.A0S
            int r0 = r0.A07(r3)
            if (r0 == r8) goto L_0x0379
            X.3Oz r12 = r2.A0k
            X.2sd r4 = r2.A17
            X.5ZU r1 = r2.A0H
            X.2so r0 = r2.A0A
            X.1fJ r0 = r0.A01(r3)
            java.lang.String r10 = r1.A0T(r0)
            X.2z0 r9 = X.C56832sd.A01(r3, r4, r8)
            r7 = 87
            X.1oU r4 = new X.1oU
            r0 = r26
            r4.<init>(r9, r7, r0)
            r4.A00 = r10
            r4.A1J(r6)
            r12.BEz(r4, r5)
        L_0x0379:
            X.2ss r4 = r2.A0S
            int r0 = r4.A07(r3)
            if (r0 != r8) goto L_0x038f
            X.2so r0 = r2.A0A
            r0.A09(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/onGroupDelete/deletedParentGroup/jid = "
            X.C18260x0.A1R(r1, r0, r3)
        L_0x038f:
            int r0 = r4.A07(r3)
            if (r0 != r11) goto L_0x0144
            X.3Ex r4 = r2.A0F
            X.3ZH r1 = r4.A0A(r3)
            int r0 = r1.A03
            if (r0 == r8) goto L_0x03a4
            r1.A03 = r8
            X.C34461vC.A03(r4, r1)
        L_0x03a4:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/onGroupDelete/updated group state to deactivated/jid = "
            X.C18260x0.A1R(r1, r0, r3)
            X.2m9 r4 = r2.A0R
            r0 = 11
            X.3Zx r1 = new X.3Zx
            r1.<init>(r2, r0, r3)
            r0 = 47
            r4.A01(r1, r0)
            return r8
        L_0x03bc:
            java.lang.String r0 = "integrity_delete_parent"
            boolean r0 = r0.equals(r1)
            int r1 = X.C18310x6.A02(r0)
            goto L_0x0307
        L_0x03c8:
            java.lang.String r13 = "demote"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r13)
            if (r13 == 0) goto L_0x053c
            X.2qk r2 = r4.A00
            java.util.Map r2 = X.AnonymousClass36J.A06(r5, r2)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x2874
            X.1fJ r21 = X.AnonymousClass34R.A00(r25)
            java.lang.String r3 = "v_id"
            long r16 = r5.A0e(r3, r0)
            X.3Lq r12 = r4.A0B
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/onGroupDemoteUsers/"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "/"
            X.C18260x0.A1R(r1, r0, r2)
            X.4uZ r0 = X.C627336j.A02(r25)
            X.1fJ r9 = X.AnonymousClass34R.A03(r0)
            if (r9 != 0) goto L_0x0408
            X.33S r0 = r12.A11
            goto L_0x0138
        L_0x0408:
            X.2sj r14 = r12.A0b
            X.33k r13 = X.C56892sj.A01(r14, r9)
            X.2ss r1 = r12.A0S
            int r0 = r1.A06(r9)
            if (r0 == r11) goto L_0x041a
            r23 = 1
            if (r0 != r8) goto L_0x041c
        L_0x041a:
            r23 = 0
        L_0x041c:
            boolean r22 = r1.A0O(r9)
            X.2pW r0 = r12.A0r
            boolean r20 = r0.A02(r9)
            X.2mQ r0 = r12.A13
            r0.A02(r2)
            java.util.ArrayList r15 = X.AnonymousClass001.A0s()
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r19 = X.AnonymousClass000.A0q(r2)
            r18 = 0
        L_0x043d:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x048a
            java.util.Map$Entry r2 = X.AnonymousClass001.A0w(r19)
            java.lang.Object r1 = r2.getValue()
            X.2pI r1 = (X.C54792pI) r1
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x0484
            X.1fH r0 = r1.A00
            com.whatsapp.jid.UserJid r5 = r1.A02
            if (r20 == 0) goto L_0x045c
            r6.add(r5)
        L_0x045c:
            X.2zG r3 = r12.A04(r13, r5, r7)
            X.C626936e.A06(r3)
            if (r20 == 0) goto L_0x0482
            X.2zG r2 = r12.A04(r13, r0, r7)
        L_0x0469:
            X.2sr r1 = r12.A06
            com.whatsapp.jid.UserJid r0 = r3.A03
            boolean r0 = r1.A0a(r0)
            if (r0 == 0) goto L_0x0475
            r18 = 1
        L_0x0475:
            boolean r0 = X.C627336j.A0L(r5)
            X.C18300x5.A1M(r3, r11, r15, r0)
            if (r2 == 0) goto L_0x043d
            r11.add(r2)
            goto L_0x043d
        L_0x0482:
            r2 = 0
            goto L_0x0469
        L_0x0484:
            com.whatsapp.jid.UserJid r5 = X.C18320x8.A0P(r2)
            r0 = 0
            goto L_0x045c
        L_0x048a:
            if (r22 == 0) goto L_0x04d1
            java.util.HashSet r3 = X.AnonymousClass002.A0K()
            if (r18 == 0) goto L_0x04ba
            X.6aS r0 = r13.A04()
            X.8Nf r5 = r0.iterator()
        L_0x049a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x04cb
            X.2zG r2 = X.C18320x8.A0G(r5)
            int r0 = r2.A01
            if (r0 != 0) goto L_0x049a
            if (r20 != 0) goto L_0x04b4
            X.2sr r1 = r12.A06
            com.whatsapp.jid.UserJid r0 = r2.A03
            boolean r0 = r1.A0a(r0)
            if (r0 != 0) goto L_0x049a
        L_0x04b4:
            com.whatsapp.jid.UserJid r0 = r2.A03
            r3.add(r0)
            goto L_0x049a
        L_0x04ba:
            X.2sr r0 = r12.A06
            boolean r0 = r13.A0P(r0)
            if (r0 != 0) goto L_0x04cb
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x04cb
            r3.addAll(r6)
        L_0x04cb:
            r13.A0L(r3)
            r14.A08(r9, r3)
        L_0x04d1:
            if (r18 == 0) goto L_0x052a
            if (r23 == 0) goto L_0x052a
            r1 = 0
        L_0x04d6:
            if (r22 == 0) goto L_0x0526
            if (r20 == 0) goto L_0x051e
            r12.A0O(r9, r1, r11)
        L_0x04dd:
            if (r18 == 0) goto L_0x052f
            X.3Wi r1 = r12.A05
            r0 = 9
            X.C69263Wi.A04(r1, r12, r9, r0)
            X.4FS r2 = r12.A1C
            r1 = 10
            X.3Zx r0 = new X.3Zx
            r0.<init>(r12, r1, r9)
            r2.BkM(r0)
            if (r23 == 0) goto L_0x052f
            X.3Oz r1 = r12.A0k
            X.2sd r0 = r12.A17
            r33 = 16
            com.whatsapp.jid.UserJid r30 = r10.A00()
            X.2sr r2 = r12.A06
            com.whatsapp.jid.PhoneUserJid r2 = X.C56972sr.A04(r2)
            java.util.List r32 = java.util.Collections.singletonList(r2)
            r28 = 0
            r29 = r9
            r31 = r10
            r34 = r26
            r36 = r16
            r27 = r0
            X.1p1 r2 = r27.A05(r28, r29, r30, r31, r32, r33, r34, r36)
            r0 = 2
            r1.BEz(r2, r0)
            goto L_0x013b
        L_0x051e:
            X.2sr r0 = r12.A06
            boolean r0 = r13.A0P(r0)
            if (r0 == 0) goto L_0x04dd
        L_0x0526:
            r12.A0O(r9, r1, r15)
            goto L_0x04dd
        L_0x052a:
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            goto L_0x04d6
        L_0x052f:
            X.33S r0 = r12.A11
            r0.A01(r10)
            r1 = 5
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r9, r1)
            goto L_0x013b
        L_0x053c:
            java.lang.String r13 = "linked_group_demote"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r13)
            if (r13 == 0) goto L_0x057b
            X.2qk r2 = r4.A00
            java.util.Map r5 = X.AnonymousClass36J.A06(r5, r2)
            X.33S r2 = r4.A0F
            r2.A01(r10)
            X.3Lq r7 = r4.A0B
            X.2rN r2 = r7.A1B
            boolean r2 = r2.A01()
            if (r2 == 0) goto L_0x0144
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L_0x0144
            X.1fJ r2 = X.AnonymousClass34R.A00(r25)
            int r6 = r14.A06(r2)
            if (r6 == r9) goto L_0x0845
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupNotificationHandler/handleCommunityAdminDemotionMessage/ announcement group "
        L_0x056f:
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " are not of the correct type."
            X.C18260x0.A1J(r1, r0)
            return r8
        L_0x057b:
            java.lang.String r13 = "modify"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r13)
            if (r13 == 0) goto L_0x06c0
            X.2qk r2 = r4.A00
            java.util.Map r20 = X.AnonymousClass36J.A06(r5, r2)
            boolean r2 = r20.isEmpty()
            if (r2 != 0) goto L_0x2874
            X.1fJ r21 = X.AnonymousClass34R.A00(r25)
            java.lang.String r2 = "v_id"
            long r16 = r5.A0e(r2, r0)
            java.util.Iterator r0 = X.AnonymousClass001.A0v(r20)
            java.lang.Object r0 = r0.next()
            X.2pI r0 = (X.C54792pI) r0
            com.whatsapp.jid.UserJid r14 = r0.A02
            com.whatsapp.jid.PhoneUserJid r11 = r0.A01
            X.3Lq r9 = r4.A0B
            X.C626936e.A06(r6)
            java.lang.StringBuilder r1 = X.C18290x4.A0u(r14)
            java.lang.String r0 = "groupmgr/onGroupParticipantChangedNumber/"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "/oldjid:"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "/newjid:"
            X.C18260x0.A1R(r1, r0, r14)
            X.1fJ r13 = X.AnonymousClass34R.A00(r25)
            X.3Ex r0 = r9.A0F
            X.3ZH r5 = r0.A09(r13)
            X.2sj r3 = r9.A0b
            X.33k r2 = X.C56892sj.A01(r3, r13)
            X.2zG r1 = r2.A05(r6)
            r2.A06(r6)
            X.2sr r0 = r9.A06
            boolean r15 = r0.A0a(r14)
            if (r15 == 0) goto L_0x05e9
            r2.A06(r14)
        L_0x05e9:
            X.318 r15 = r9.A0i
            java.util.Set r30 = r15.A0D(r14)
            r19 = 0
            if (r1 == 0) goto L_0x06bd
            int r15 = r1.A01
        L_0x05f5:
            r28 = r2
            r29 = r14
            r31 = r15
            r32 = r7
            r33 = r8
            r28.A07(r29, r30, r31, r32, r33)
            X.33o r15 = r9.A0y
            java.util.List r7 = java.util.Collections.singletonList(r6)
            r15.A0S(r13, r7)
            java.util.List r7 = java.util.Collections.singletonList(r6)
            r9.A0K(r13, r7)
            if (r5 == 0) goto L_0x061c
            boolean r7 = r2.A0O(r0)
            if (r7 == 0) goto L_0x061c
            if (r1 != 0) goto L_0x065d
        L_0x061c:
            java.lang.StringBuilder r15 = X.AnonymousClass001.A0o()
            java.lang.String r7 = "groupmgr/onGroupParticipantChangedNumber/sendgetgroupinfo/"
            r15.append(r7)
            r18 = 1
            boolean r7 = X.AnonymousClass000.A1X(r5)
            r15.append(r7)
            java.lang.String r7 = "/"
            r15.append(r7)
            boolean r0 = r2.A0O(r0)
            r0 = r0 ^ 1
            r15.append(r0)
            r15.append(r7)
            if (r1 == 0) goto L_0x0643
            r18 = 0
        L_0x0643:
            r0 = r18
            X.C18260x0.A1V(r15, r0)
            X.3Lr r2 = r9.A0t
            r1 = 0
            r0 = 2
            r2.A0E(r13, r1, r0)
            X.2s0 r2 = r9.A14
            if (r5 == 0) goto L_0x0657
            int r0 = r5.A06
            r19 = r0
        L_0x0657:
            r1 = 2
            r0 = r19
            r2.A01(r13, r0, r1)
        L_0x065d:
            X.2mQ r1 = r9.A13
            r0 = r20
            r1.A02(r0)
            if (r22 == 0) goto L_0x06b6
            if (r12 == 0) goto L_0x06b6
        L_0x0668:
            boolean r0 = X.C627336j.A0L(r14)
            if (r0 == 0) goto L_0x06af
            if (r11 == 0) goto L_0x06af
        L_0x0670:
            X.2ss r0 = r9.A0S
            int r1 = r0.A06(r13)
            r0 = 3
            if (r1 != r0) goto L_0x0685
            boolean r0 = r3.A0D(r13)
            if (r0 != 0) goto L_0x0685
            boolean r0 = r3.A0I(r13, r14)
            if (r0 == 0) goto L_0x06ab
        L_0x0685:
            if (r12 == 0) goto L_0x06ab
            if (r11 == 0) goto L_0x06ab
            X.3Oz r5 = r9.A0k
            X.2sd r7 = r9.A17
            X.2z0 r6 = X.C56832sd.A01(r13, r7, r8)
            r3 = 10
            X.1o8 r2 = new X.1o8
            r0 = r26
            r2.<init>(r6, r3, r0)
            X.2qk r0 = r7.A00
            r2.A03 = r0
            r2.A01 = r12
            r2.A1w(r11)
            r0 = r16
            r2.A02 = r0
            r0 = 2
            r5.BEz(r2, r0)
        L_0x06ab:
            X.33S r0 = r9.A11
            goto L_0x0138
        L_0x06af:
            boolean r0 = r14 instanceof com.whatsapp.jid.PhoneUserJid
            r11 = 0
            if (r0 == 0) goto L_0x0670
            r11 = r14
            goto L_0x0670
        L_0x06b6:
            boolean r0 = r6 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 != 0) goto L_0x06bb
            r6 = 0
        L_0x06bb:
            r12 = r6
            goto L_0x0668
        L_0x06bd:
            r15 = 0
            goto L_0x05f5
        L_0x06c0:
            java.lang.String r12 = "promote"
            boolean r12 = X.AnonymousClass36K.A0W(r5, r12)
            if (r12 == 0) goto L_0x0810
            X.2qk r2 = r4.A00
            java.util.Map r2 = X.AnonymousClass36J.A06(r5, r2)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x2874
            X.1fJ r6 = X.AnonymousClass34R.A00(r25)
            java.lang.String r3 = "v_id"
            long r0 = r5.A0e(r3, r0)
            X.3Lq r7 = r4.A0B
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "groupmgr/onGroupPromoteUsers/"
            r5.append(r3)
            r5.append(r10)
            java.lang.String r3 = "/"
            X.C18260x0.A1R(r5, r3, r2)
            X.4uZ r3 = X.C627336j.A02(r25)
            X.1fJ r5 = X.AnonymousClass34R.A03(r3)
            if (r5 != 0) goto L_0x0708
            X.33S r2 = r7.A11
            r2.A01(r10)
        L_0x0702:
            X.2oV r2 = r4.A09
            r2.A02(r6, r0)
            return r8
        L_0x0708:
            X.2sj r3 = r7.A0b
            X.33k r13 = X.C56892sj.A01(r3, r5)
            X.2ss r3 = r7.A0S
            int r12 = r3.A06(r5)
            if (r12 == r9) goto L_0x071a
            r19 = 1
            if (r12 != r8) goto L_0x071c
        L_0x071a:
            r19 = 0
        L_0x071c:
            X.2pW r3 = r7.A0r
            boolean r18 = r3.A02(r5)
            X.2mQ r3 = r7.A13
            r3.A02(r2)
            java.util.ArrayList r14 = X.AnonymousClass001.A0s()
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            java.util.Iterator r17 = X.AnonymousClass001.A0v(r2)
            r16 = 0
        L_0x0735:
            boolean r2 = r17.hasNext()
            r15 = 0
            if (r2 == 0) goto L_0x0769
            java.lang.Object r2 = r17.next()
            X.2pI r2 = (X.C54792pI) r2
            com.whatsapp.jid.UserJid r9 = r2.A02
            boolean r3 = r2.A00()
            if (r3 == 0) goto L_0x074c
            X.1fH r15 = r2.A00
        L_0x074c:
            X.2zG r3 = r7.A04(r13, r9, r8)
            if (r18 == 0) goto L_0x075b
            X.2zG r2 = r7.A04(r13, r15, r8)
            if (r2 == 0) goto L_0x075b
            r11.add(r2)
        L_0x075b:
            r14.add(r3)
            X.2sr r2 = r7.A06
            boolean r2 = r2.A0a(r9)
            if (r2 == 0) goto L_0x0735
            r16 = 1
            goto L_0x0735
        L_0x0769:
            if (r18 == 0) goto L_0x076c
            r14 = r11
        L_0x076c:
            if (r19 == 0) goto L_0x080a
            if (r16 == 0) goto L_0x080a
        L_0x0770:
            r7.A0O(r5, r15, r14)
            X.3Ex r2 = r7.A0F
            X.3ZH r9 = r2.A09(r5)
            if (r16 == 0) goto L_0x0803
            X.3Wi r3 = r7.A05
            r2 = 16
            X.C69263Wi.A04(r3, r7, r5, r2)
            if (r9 == 0) goto L_0x07ba
            boolean r2 = r9.A0e
            if (r2 == 0) goto L_0x07ba
            X.6aS r2 = r13.A04()
            int r3 = r2.size()
            if (r12 == r8) goto L_0x07ba
            X.1VX r12 = r7.A0j
            r2 = 934(0x3a6, float:1.309E-42)
            X.2vE r11 = X.C58422vE.A02
            int r2 = r12.A0O(r11, r2)
            if (r3 < r2) goto L_0x07ba
            r2 = 1946(0x79a, float:2.727E-42)
            int r2 = r12.A0O(r11, r2)
            if (r3 > r2) goto L_0x07ba
            X.35J r2 = r7.A16
            X.2z0 r12 = r2.A04(r5, r8)
            long r2 = X.C56612sH.A07(r7)
            X.1mY r11 = new X.1mY
            r11.<init>(r12, r2)
            X.3Lv r2 = r7.A0U
            r2.A0V(r11)
        L_0x07ba:
            if (r19 == 0) goto L_0x0803
            X.3Oz r3 = r7.A0k
            X.2sd r2 = r7.A17
            r23 = 15
            com.whatsapp.jid.UserJid r20 = r10.A00()
            X.2sr r11 = r7.A06
            com.whatsapp.jid.PhoneUserJid r11 = X.C56972sr.A04(r11)
            java.util.List r22 = java.util.Collections.singletonList(r11)
            r18 = 0
            r19 = r5
            r21 = r10
            r24 = r26
            r26 = r0
            r17 = r2
            X.1p1 r11 = r17.A05(r18, r19, r20, r21, r22, r23, r24, r26)
            r2 = 2
            r3.BEz(r11, r2)
        L_0x07e4:
            X.33S r2 = r7.A11
            r2.A01(r10)
            if (r16 == 0) goto L_0x0702
            if (r9 == 0) goto L_0x0702
            boolean r2 = r9.A13
            if (r2 == 0) goto L_0x0702
            X.3DL r7 = r7.A0Y
            java.lang.String r2 = r5.getRawString()
            X.47H r3 = new X.47H
            r3.<init>(r2)
            X.2gy r2 = r7.A00
            r2.A02(r3)
            goto L_0x0702
        L_0x0803:
            r3 = 5
            android.os.Handler r2 = X.C66493Lq.A1H
            X.C18290x4.A1C(r2, r5, r3)
            goto L_0x07e4
        L_0x080a:
            java.lang.Long r15 = java.lang.Long.valueOf(r0)
            goto L_0x0770
        L_0x0810:
            java.lang.String r12 = "linked_group_promote"
            boolean r12 = X.AnonymousClass36K.A0W(r5, r12)
            if (r12 == 0) goto L_0x08ee
            X.2qk r2 = r4.A00
            java.util.Map r5 = X.AnonymousClass36J.A06(r5, r2)
            X.33S r2 = r4.A0F
            r2.A01(r10)
            X.3Lq r11 = r4.A0B
            X.2rN r2 = r11.A1B
            boolean r2 = r2.A01()
            if (r2 == 0) goto L_0x0144
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L_0x0144
            X.1fJ r2 = X.AnonymousClass34R.A00(r25)
            int r6 = r14.A06(r2)
            if (r6 == r9) goto L_0x0898
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupNotificationHandler/handleCommunityAdminPromotionMessage/ announcement group "
            goto L_0x056f
        L_0x0845:
            X.2sj r6 = r7.A0b
            boolean r6 = r6.A0D(r2)
            if (r6 != 0) goto L_0x0859
            X.2sr r6 = r7.A06
            com.whatsapp.jid.PhoneUserJid r6 = X.C56972sr.A04(r6)
            boolean r6 = r5.containsKey(r6)
            if (r6 == 0) goto L_0x0880
        L_0x0859:
            X.2mQ r6 = r7.A13
            r6.A02(r5)
            X.3Oz r6 = r7.A0k
            X.2sd r7 = r7.A17
            r17 = 82
            com.whatsapp.jid.UserJid r14 = r10.A00()
            java.util.Set r5 = r5.keySet()
            java.util.ArrayList r16 = X.AnonymousClass002.A0J(r5)
            r11 = r7
            r12 = r3
            r13 = r2
            r15 = r10
            r18 = r26
            r20 = r0
            X.1p1 r1 = r11.A05(r12, r13, r14, r15, r16, r17, r18, r20)
            r0 = 2
            r6.BEz(r1, r0)
        L_0x0880:
            X.1VX r0 = r4.A0A
            boolean r0 = X.C56952sp.A0D(r0)
            if (r0 == 0) goto L_0x0144
            X.2so r0 = r4.A02
            X.1fJ r3 = r0.A01(r2)
            if (r3 == 0) goto L_0x0144
            X.4FS r1 = r4.A0I
            r0 = 39
            X.C70353aM.A00(r1, r4, r3, r2, r0)
            return r8
        L_0x0898:
            X.2so r12 = r11.A0A
            X.1fJ r9 = r12.A01(r2)
            if (r9 == 0) goto L_0x08af
            X.2sr r6 = r11.A06
            com.whatsapp.jid.PhoneUserJid r6 = X.C56972sr.A04(r6)
            boolean r6 = r5.containsKey(r6)
            if (r6 == 0) goto L_0x08af
            r12.A0B(r9, r7)
        L_0x08af:
            X.2mQ r6 = r11.A13
            r6.A02(r5)
            X.3Oz r6 = r11.A0k
            X.2sd r7 = r11.A17
            r17 = 81
            com.whatsapp.jid.UserJid r14 = r10.A00()
            java.util.Set r5 = r5.keySet()
            java.util.ArrayList r16 = X.AnonymousClass002.A0J(r5)
            r11 = r7
            r12 = r3
            r13 = r2
            r15 = r10
            r18 = r26
            r20 = r0
            X.1p1 r1 = r11.A05(r12, r13, r14, r15, r16, r17, r18, r20)
            r0 = 2
            r6.BEz(r1, r0)
            X.1VX r0 = r4.A0A
            boolean r0 = X.C56952sp.A0D(r0)
            if (r0 == 0) goto L_0x0144
            X.2so r0 = r4.A02
            X.1fJ r3 = r0.A01(r2)
            if (r3 == 0) goto L_0x0144
            X.4FS r1 = r4.A0I
            r0 = 39
            X.C70353aM.A00(r1, r4, r3, r2, r0)
            return r8
        L_0x08ee:
            java.lang.String r12 = "remove"
            boolean r12 = X.AnonymousClass36K.A0W(r5, r12)
            if (r12 == 0) goto L_0x15d7
            java.lang.String r2 = "subject"
            r29 = 0
            java.lang.String r24 = r5.A0r(r2, r3)
            X.2qk r2 = r4.A00
            java.util.Map r2 = X.AnonymousClass36J.A06(r5, r2)
            boolean r7 = r2.isEmpty()
            if (r7 != 0) goto L_0x2874
            X.1fJ r21 = X.AnonymousClass34R.A00(r25)
            X.3Lq r7 = r4.A0B
            r9 = r21
            boolean r9 = r7.A0j(r9)
            if (r9 == 0) goto L_0x2874
            java.lang.String r9 = "v_id"
            long r16 = r5.A0e(r9, r0)
            java.lang.String r0 = "reason"
            java.lang.String r23 = r5.A0r(r0, r3)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/onGroupRemoveUsers/"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "jids:"
            r1.append(r0)
            java.util.Set r0 = r2.keySet()
            java.lang.Object[] r0 = r0.toArray()
            java.lang.String r0 = java.util.Arrays.deepToString(r0)
            r1.append(r0)
            java.lang.String r0 = "/removedBy:"
            X.C18260x0.A1R(r1, r0, r6)
            X.1fJ r9 = X.AnonymousClass34R.A00(r25)
            boolean r0 = r2.isEmpty()
            r11 = 2
            if (r0 != 0) goto L_0x0965
            boolean r0 = r7.A0k(r9, r2)
            if (r0 == 0) goto L_0x0965
            X.3Lr r0 = r7.A0t
            r0.A0E(r9, r3, r11)
            goto L_0x013b
        L_0x0965:
            X.5ZU r0 = r7.A0H
            r0.A0b(r9)
            X.2sr r0 = r7.A06
            r25 = r0
            com.whatsapp.jid.PhoneUserJid r12 = X.C56972sr.A05(r25)
            X.1fH r1 = r25.A0H()
            X.3Ex r0 = r7.A0F
            r39 = r0
            X.3ZH r5 = r0.A09(r9)
            X.2mQ r0 = r7.A13
            r0.A02(r2)
            r22 = 1
            if (r6 == 0) goto L_0x098d
            boolean r0 = r6.equals(r12)
            if (r0 == 0) goto L_0x099a
        L_0x098d:
            int r0 = r2.size()
            if (r0 != r8) goto L_0x099a
            boolean r0 = r2.containsKey(r12)
            r12 = 1
            if (r0 != 0) goto L_0x099b
        L_0x099a:
            r12 = 0
        L_0x099b:
            if (r6 == 0) goto L_0x09a3
            boolean r0 = r6.equals(r1)
            if (r0 == 0) goto L_0x09b0
        L_0x09a3:
            int r0 = r2.size()
            if (r0 != r8) goto L_0x09b0
            boolean r1 = r2.containsKey(r1)
            r0 = 1
            if (r1 != 0) goto L_0x09b1
        L_0x09b0:
            r0 = 0
        L_0x09b1:
            if (r12 != 0) goto L_0x0ad0
            if (r0 != 0) goto L_0x0ad0
            if (r5 == 0) goto L_0x0add
            X.2sj r12 = r7.A0b
            boolean r0 = r12.A0C(r9)
            if (r0 == 0) goto L_0x0add
            X.33h r13 = r12.A09
            X.33k r11 = r13.A07(r9)
            java.util.Set r0 = r2.keySet()
            boolean r22 = r11.A0R(r0)
            if (r22 == 0) goto L_0x09d2
            r12.A05(r11)
        L_0x09d2:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.ArrayList r20 = X.AnonymousClass001.A0s()
            java.util.ArrayList r19 = X.AnonymousClass001.A0s()
            java.util.Iterator r18 = X.AnonymousClass000.A0q(r2)
        L_0x09e2:
            boolean r0 = r18.hasNext()
            java.lang.String r2 = "default_sub_group_demote"
            if (r0 == 0) goto L_0x0a8e
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r18)
            com.whatsapp.jid.UserJid r14 = X.C18320x8.A0P(r0)
            java.lang.Object r1 = r0.getValue()
            X.2pI r1 = (X.C54792pI) r1
            X.2zG r0 = r11.A06(r14)
            if (r0 == 0) goto L_0x0a20
            r3.add(r14)
            boolean r0 = X.C627336j.A0L(r14)
            if (r0 == 0) goto L_0x0a20
            r0 = r25
            boolean r0 = r0.A0a(r14)
            if (r0 == 0) goto L_0x0a20
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A05(r25)
            X.2zG r0 = r11.A06(r0)
            if (r0 == 0) goto L_0x0a20
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A05(r25)
            r3.add(r0)
        L_0x0a20:
            r0 = r23
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0a61
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x0a61
            java.lang.String r0 = "superadmin"
            java.lang.String r2 = r1.A04
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0a61
            java.lang.String r0 = "admin"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0a61
            X.1fH r15 = r1.A00
            X.318 r0 = r7.A0i
            java.util.Set r0 = r0.A0D(r15)
            java.util.Set r0 = X.C620833k.A01(r0)
            r2 = 0
            X.2zG r1 = new X.2zG
            r1.<init>(r15, r0, r2, r2)
            r0 = r19
            r0.add(r14)
            r0 = r20
            r0.add(r1)
        L_0x0a61:
            r0 = r25
            boolean r0 = r0.A0a(r14)
            if (r0 == 0) goto L_0x09e2
            X.4FS r2 = r7.A1C
            r1 = 8
            X.3Zx r0 = new X.3Zx
            r0.<init>(r7, r1, r9)
            r2.BkP(r0)
            X.33o r1 = r7.A0y
            java.lang.Class<X.1fJ> r0 = X.C27991fJ.class
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3ZH.A05(r5, r0)
            X.1fJ r0 = (X.C27991fJ) r0
            r1.A0T(r0)
            X.2oj r0 = r7.A0X
            r0.A01(r9)
            X.2lN r0 = r7.A0g
            r0.A00(r9)
            goto L_0x09e2
        L_0x0a8e:
            r0 = r23
            boolean r14 = r2.equals(r0)
            if (r14 == 0) goto L_0x0af7
            r0 = r20
            r7.A0F(r11, r0)
            X.3dV r0 = r12.A07
            X.4Fq r11 = r0.A04()
            X.3Yo r2 = r11.Axl()     // Catch:{ all -> 0x15cd }
            java.util.Iterator r1 = r19.iterator()     // Catch:{ all -> 0x15c3 }
        L_0x0aa9:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x15c3 }
            if (r0 == 0) goto L_0x0ab7
            com.whatsapp.jid.UserJid r0 = X.C18310x6.A0T(r1)     // Catch:{ all -> 0x15c3 }
            r13.A0O(r9, r0)     // Catch:{ all -> 0x15c3 }
            goto L_0x0aa9
        L_0x0ab7:
            java.util.Iterator r1 = r20.iterator()     // Catch:{ all -> 0x15c3 }
        L_0x0abb:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x15c3 }
            if (r0 == 0) goto L_0x0ac9
            X.2zG r0 = X.C18320x8.A0G(r1)     // Catch:{ all -> 0x15c3 }
            r13.A0E(r0, r9)     // Catch:{ all -> 0x15c3 }
            goto L_0x0abb
        L_0x0ac9:
            r2.A00()     // Catch:{ all -> 0x15c3 }
            r2.close()     // Catch:{ all -> 0x15cd }
            goto L_0x0af4
        L_0x0ad0:
            java.lang.String r0 = "groupmgr/onGroupRemoveUsers/me leaving"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.List r0 = java.util.Collections.singletonList(r9)
            r7.A0c(r0, r8)
            goto L_0x0aef
        L_0x0add:
            java.lang.String r0 = "groupmgr/onGroupRemoveUsers/requerygroupinfo"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Lr r0 = r7.A0t
            r0.A0E(r9, r3, r11)
            X.2s0 r1 = r7.A14
            if (r5 != 0) goto L_0x0af1
            r0 = 0
        L_0x0aec:
            r1.A01(r9, r0, r11)
        L_0x0aef:
            r3 = 0
            goto L_0x0b53
        L_0x0af1:
            int r0 = r5.A06
            goto L_0x0aec
        L_0x0af4:
            r11.close()
        L_0x0af7:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0b05
            X.33o r0 = r7.A0y
            r0.A0S(r9, r3)
            r7.A0K(r9, r3)
        L_0x0b05:
            java.util.List r0 = r7.A08(r9, r3)
            if (r6 == 0) goto L_0x0bce
            boolean r1 = r0.contains(r6)
            if (r1 == 0) goto L_0x0bce
            r0.remove(r6)
            X.2sd r2 = r7.A17
            r34 = 5
            r1 = 7
            r30 = r2
            r31 = r9
            r32 = r6
            r33 = r10
            r35 = r26
            r37 = r16
            X.1p1 r3 = r30.A07(r31, r32, r33, r34, r35, r37)
            X.3Oz r2 = r7.A0k
            r2.BEz(r3, r1)
            r3 = 1
        L_0x0b2f:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0b53
            if (r14 == 0) goto L_0x0bc6
            r34 = 94
        L_0x0b39:
            X.2sd r2 = r7.A17
            r28 = r2
            r30 = r9
            r31 = r6
            r32 = r10
            r33 = r0
            r35 = r26
            r37 = r16
            X.1p1 r2 = r28.A05(r29, r30, r31, r32, r33, r34, r35, r37)
            X.3Oz r0 = r7.A0k
            r0.BEz(r2, r1)
            r3 = 1
        L_0x0b53:
            r3 = r3 ^ 1
            if (r22 == 0) goto L_0x0bbe
            X.2sj r0 = r7.A0b
            boolean r0 = r0.A0B(r9)
            if (r0 == 0) goto L_0x0bb9
            X.6kB r2 = r25.A0G()
        L_0x0b63:
            X.C626936e.A06(r2)
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2
            X.33n r0 = r7.A0P
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x0b9e
            r7.A0L(r2, r9, r10, r3)
        L_0x0b73:
            if (r5 == 0) goto L_0x013b
            boolean r0 = android.text.TextUtils.isEmpty(r24)
            if (r0 != 0) goto L_0x013b
            boolean r0 = X.AnonymousClass3ZH.A0E(r5)
            if (r0 == 0) goto L_0x013b
            java.lang.String r0 = "groupmgr/onGroupRemoveUsers/subjectchanged"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r39
            X.3ZH r1 = r0.A0A(r9)
            r0 = r24
            r1.A0P = r0
            r0 = r39
            X.C34461vC.A03(r0, r1)
            X.2qJ r1 = r7.A0V
            r0 = r24
            r1.A01(r9, r0)
            goto L_0x013b
        L_0x0b9e:
            X.2fm r0 = r7.A0Q
            r30 = 4
            X.3ap r1 = new X.3ap
            r25 = r1
            r26 = r7
            r27 = r10
            r28 = r9
            r29 = r2
            r31 = r3
            r25.<init>(r26, r27, r28, r29, r30, r31)
            java.util.concurrent.ThreadPoolExecutor r0 = r0.A00
            r0.submit(r1)
            goto L_0x0b73
        L_0x0bb9:
            X.6kH r2 = X.C56972sr.A03(r25)
            goto L_0x0b63
        L_0x0bbe:
            if (r3 == 0) goto L_0x0b73
            X.33S r0 = r7.A11
            r0.A01(r10)
            goto L_0x0b73
        L_0x0bc6:
            r34 = 14
            if (r6 != 0) goto L_0x0b39
            r34 = 13
            goto L_0x0b39
        L_0x0bce:
            r1 = 7
            r3 = 0
            goto L_0x0b2f
        L_0x0bd2:
            r12 = 0
            goto L_0x0048
        L_0x0bd5:
            X.1fJ r6 = X.AnonymousClass36K.A08(r11)     // Catch:{ 24P -> 0x14fc }
            X.C626936e.A06(r6)     // Catch:{ 24P -> 0x14fc }
            com.whatsapp.jid.UserJid r45 = X.AnonymousClass36K.A09(r11)     // Catch:{ 24P -> 0x14fc }
            java.lang.String r0 = "creation"
            java.lang.String r2 = r11.A0r(r0, r3)     // Catch:{ 24P -> 0x14fc }
            r0 = 0
            long r23 = X.C615531h.A04(r2, r0)     // Catch:{ 24P -> 0x14fc }
            long r23 = r23 * r16
            X.3Lq r2 = r4.A0B     // Catch:{ 24P -> 0x14fc }
            r9 = r45
            r2.A0Y(r9, r11)     // Catch:{ 24P -> 0x14fc }
            java.lang.String r9 = "reason"
            java.lang.String r42 = r5.A0r(r9, r3)     // Catch:{ 24P -> 0x14fc }
            java.lang.String r9 = "key"
            java.lang.String r49 = r5.A0r(r9, r3)     // Catch:{ 24P -> 0x14fc }
            java.lang.String r9 = "new"
            boolean r31 = r9.equalsIgnoreCase(r13)     // Catch:{ 24P -> 0x14fc }
            java.lang.String r9 = "subject"
            java.lang.String r38 = r11.A0r(r9, r3)     // Catch:{ 24P -> 0x14fc }
            long r20 = X.C615531h.A02(r11)     // Catch:{ 24P -> 0x14fc }
            long r20 = r20 * r16
            java.lang.String r9 = "p_v_id"
            long r43 = r11.A0e(r9, r0)     // Catch:{ 24P -> 0x14fc }
            java.lang.String r9 = "a_v_id"
            long r40 = r11.A0e(r9, r0)     // Catch:{ 24P -> 0x14fc }
            java.lang.String r0 = "ack"
            java.lang.String r1 = r11.A0r(r0, r3)     // Catch:{ 24P -> 0x14fc }
            if (r1 == 0) goto L_0x0c35
            java.lang.String r0 = "false"
            boolean r0 = r1.equals(r0)     // Catch:{ 24P -> 0x14fc }
            r32 = 0
            if (r0 != 0) goto L_0x0c37
        L_0x0c35:
            r32 = 1
        L_0x0c37:
            java.lang.String r12 = r11.A0r(r12, r3)     // Catch:{ 24P -> 0x14fc }
            X.2qk r3 = r4.A00     // Catch:{ 24P -> 0x14fc }
            r1 = 11
            X.4Jv r0 = new X.4Jv     // Catch:{ 24P -> 0x14fc }
            r0.<init>(r3, r1)     // Catch:{ 24P -> 0x14fc }
            java.util.Map r36 = X.AnonymousClass36J.A07(r11, r0)     // Catch:{ 24P -> 0x14fc }
            X.36J r1 = X.AnonymousClass36J.A00     // Catch:{ 24P -> 0x14fc }
            int r25 = X.AnonymousClass36J.A00(r11)     // Catch:{ 24P -> 0x14fc }
            X.2fO r76 = r1.A0B(r11)     // Catch:{ 24P -> 0x14fc }
            java.lang.String r3 = "size"
            java.lang.String r0 = "0"
            java.lang.String r0 = r11.A0r(r3, r0)     // Catch:{ 24P -> 0x14fc }
            X.C626936e.A06(r0)     // Catch:{ 24P -> 0x14fc }
            int r3 = java.lang.Integer.parseInt(r0)     // Catch:{ 24P -> 0x14fc }
            X.2zN r48 = X.AnonymousClass36J.A04(r11)     // Catch:{ 24P -> 0x14fc }
            java.lang.String r0 = "support"
            X.36K r0 = r11.A0l(r0)     // Catch:{ 24P -> 0x14fc }
            boolean r47 = X.AnonymousClass000.A1W(r0)
            java.lang.String r0 = "locked"
            X.36K r0 = r11.A0l(r0)     // Catch:{ 24P -> 0x14fc }
            boolean r46 = X.AnonymousClass000.A1W(r0)
            java.lang.String r0 = "announcement"
            X.36K r0 = r11.A0l(r0)     // Catch:{ 24P -> 0x14fc }
            boolean r50 = X.AnonymousClass000.A1W(r0)
            java.lang.String r0 = "no_frequently_forwarded"
            X.36K r0 = r11.A0l(r0)     // Catch:{ 24P -> 0x14fc }
            boolean r68 = X.AnonymousClass000.A1W(r0)
            java.lang.String r0 = "suspended"
            X.36K r0 = r11.A0l(r0)     // Catch:{ 24P -> 0x14fc }
            boolean r69 = X.AnonymousClass000.A1W(r0)
            int r0 = r36.size()     // Catch:{ 24P -> 0x14fc }
            int r54 = java.lang.Math.max(r3, r0)     // Catch:{ 24P -> 0x14fc }
            int r37 = X.AnonymousClass36J.A02(r11)     // Catch:{ 24P -> 0x14fc }
            X.1fJ r9 = X.AnonymousClass36J.A03(r11)     // Catch:{ 24P -> 0x14fc }
            java.lang.String r0 = "incognito"
            X.36K r0 = r11.A0l(r0)     // Catch:{ 24P -> 0x14fc }
            boolean r22 = X.AnonymousClass000.A1W(r0)
            boolean r53 = X.AnonymousClass36J.A08(r11)     // Catch:{ 24P -> 0x14fc }
            int r52 = r1.A09(r11)     // Catch:{ 24P -> 0x14fc }
            int r51 = X.AnonymousClass36J.A01(r11)     // Catch:{ 24P -> 0x14fc }
            java.lang.Class<com.whatsapp.jid.GroupJid> r1 = com.whatsapp.jid.GroupJid.class
            java.lang.String r0 = "context_group_jid"
            com.whatsapp.jid.Jid r30 = r5.A0g(r1, r0)     // Catch:{ 24P -> 0x14fc }
            r0 = r30
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0     // Catch:{ 24P -> 0x14fc }
            r30 = r0
            java.lang.String r0 = "allow_admin_reports"
            X.36K r0 = r11.A0l(r0)     // Catch:{ 24P -> 0x14fc }
            boolean r72 = X.AnonymousClass000.A1W(r0)
            java.lang.String r0 = "allow_non_admin_sub_group_creation"
            X.36K r0 = r11.A0l(r0)     // Catch:{ 24P -> 0x14fc }
            boolean r14 = X.AnonymousClass000.A1W(r0)
            java.lang.String r0 = "group_history"
            X.36K r0 = r11.A0l(r0)     // Catch:{ 24P -> 0x14fc }
            boolean r28 = X.AnonymousClass000.A1W(r0)
            java.lang.String r0 = "auto_add_disabled"
            X.36K r0 = r11.A0l(r0)     // Catch:{ 24P -> 0x14fc }
            boolean r13 = X.AnonymousClass000.A1W(r0)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 24P -> 0x14fc }
            java.lang.String r34 = "groupmgr/onGroupNewGroup/"
            r0 = r34
            r3.append(r0)     // Catch:{ 24P -> 0x14fc }
            r0 = r23
            r3.append(r0)     // Catch:{ 24P -> 0x14fc }
            java.lang.String r5 = "/"
            r3.append(r5)     // Catch:{ 24P -> 0x14fc }
            r0 = r20
            r3.append(r0)     // Catch:{ 24P -> 0x14fc }
            r3.append(r5)     // Catch:{ 24P -> 0x14fc }
            r3.append(r12)     // Catch:{ 24P -> 0x14fc }
            r3.append(r5)     // Catch:{ 24P -> 0x14fc }
            r0 = r43
            r3.append(r0)     // Catch:{ 24P -> 0x14fc }
            r3.append(r5)     // Catch:{ 24P -> 0x14fc }
            r0 = r42
            r3.append(r0)     // Catch:{ 24P -> 0x14fc }
            r3.append(r5)     // Catch:{ 24P -> 0x14fc }
            r0 = r47
            r3.append(r0)     // Catch:{ 24P -> 0x14fc }
            r3.append(r5)     // Catch:{ 24P -> 0x14fc }
            r0 = r46
            r3.append(r0)     // Catch:{ 24P -> 0x14fc }
            r3.append(r5)     // Catch:{ 24P -> 0x14fc }
            r0 = r50
            r3.append(r0)     // Catch:{ 24P -> 0x14fc }
            r3.append(r5)     // Catch:{ 24P -> 0x14fc }
            r0 = r25
            r3.append(r0)     // Catch:{ 24P -> 0x14fc }
            r3.append(r5)     // Catch:{ 24P -> 0x14fc }
            r0 = r37
            r3.append(r0)     // Catch:{ 24P -> 0x14fc }
            r3.append(r5)     // Catch:{ 24P -> 0x14fc }
            r0 = r22
            r3.append(r0)     // Catch:{ 24P -> 0x14fc }
            r3.append(r5)     // Catch:{ 24P -> 0x14fc }
            r0 = r53
            r3.append(r0)     // Catch:{ 24P -> 0x14fc }
            r3.append(r5)     // Catch:{ 24P -> 0x14fc }
            r0 = r52
            r3.append(r0)     // Catch:{ 24P -> 0x14fc }
            r3.append(r5)     // Catch:{ 24P -> 0x14fc }
            r3.append(r14)     // Catch:{ 24P -> 0x14fc }
            r3.append(r5)     // Catch:{ 24P -> 0x14fc }
            r0 = r28
            r3.append(r0)     // Catch:{ 24P -> 0x14fc }
            X.C18260x0.A1E(r5, r3, r13)     // Catch:{ 24P -> 0x14fc }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 24P -> 0x14fc }
            r1 = r34
            r0 = r36
            X.C18260x0.A1R(r3, r1, r0)     // Catch:{ 24P -> 0x14fc }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 24P -> 0x14fc }
            r0 = r48
            X.C18260x0.A1R(r3, r1, r0)     // Catch:{ 24P -> 0x14fc }
            X.2ss r0 = r2.A0S     // Catch:{ 24P -> 0x14fc }
            r82 = r0
            boolean r0 = r0.A0L(r6)     // Catch:{ 24P -> 0x14fc }
            r18 = r0 ^ 1
            com.whatsapp.jid.UserJid r29 = r10.A00()     // Catch:{ 24P -> 0x14fc }
            X.2sr r0 = r2.A06     // Catch:{ 24P -> 0x14fc }
            r81 = r0
            r1 = r0
            r0 = r45
            boolean r0 = r1.A0a(r0)     // Catch:{ 24P -> 0x14fc }
            if (r0 == 0) goto L_0x0db0
            r0 = r29
            boolean r0 = r1.A0a(r0)     // Catch:{ 24P -> 0x14fc }
            r15 = 1
            if (r0 != 0) goto L_0x0db1
        L_0x0db0:
            r15 = 0
        L_0x0db1:
            if (r29 == 0) goto L_0x0dbf
            r1 = r36
            r0 = r29
            boolean r0 = r1.containsKey(r0)     // Catch:{ 24P -> 0x14fc }
            r19 = 1
            if (r0 == 0) goto L_0x0dc1
        L_0x0dbf:
            r19 = 0
        L_0x0dc1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24P -> 0x14fc }
            java.lang.String r0 = "groupmgr/onGroupNewGroup/ new:"
            r1.append(r0)     // Catch:{ 24P -> 0x14fc }
            r0 = r18
            r1.append(r0)     // Catch:{ 24P -> 0x14fc }
            java.lang.String r0 = " mecreator:"
            r1.append(r0)     // Catch:{ 24P -> 0x14fc }
            r1.append(r15)     // Catch:{ 24P -> 0x14fc }
            java.lang.String r3 = " numberchange:"
            r0 = r19
            X.C18260x0.A1E(r3, r1, r0)     // Catch:{ 24P -> 0x14fc }
            java.util.HashMap r33 = X.AnonymousClass001.A0t()     // Catch:{ 24P -> 0x14fc }
            if (r15 == 0) goto L_0x0dff
            boolean r0 = android.text.TextUtils.isEmpty(r49)     // Catch:{ 24P -> 0x14fc }
            if (r0 == 0) goto L_0x0df8
            X.C626936e.A06(r38)     // Catch:{ 24P -> 0x14fc }
            X.2UZ r3 = X.C28001fK.A01     // Catch:{ 24P -> 0x14fc }
            r1 = r81
            r0 = r38
            X.1fK r3 = r3.A00(r1, r0)     // Catch:{ 24P -> 0x14fc }
            goto L_0x0dfc
        L_0x0df8:
            X.1fK r3 = X.C28001fK.A00(r49)     // Catch:{ 24P -> 0x14fc }
        L_0x0dfc:
            if (r3 == 0) goto L_0x0dff
            goto L_0x0e00
        L_0x0dff:
            r3 = 0
        L_0x0e00:
            boolean r0 = r36.isEmpty()     // Catch:{ 24P -> 0x14fc }
            if (r0 != 0) goto L_0x0e0d
            X.2mQ r1 = r2.A13     // Catch:{ 24P -> 0x14fc }
            r0 = r36
            r1.A02(r0)     // Catch:{ 24P -> 0x14fc }
        L_0x0e0d:
            if (r3 == 0) goto L_0x0fd3
            r0 = r82
            boolean r0 = r0.A0L(r3)     // Catch:{ 24P -> 0x14fc }
            if (r0 == 0) goto L_0x0fd3
            X.2sj r0 = r2.A0b     // Catch:{ 24P -> 0x14fc }
            r46 = r0
            X.33h r0 = r0.A09     // Catch:{ 24P -> 0x14fc }
            r61 = r0
            X.33k r49 = r0.A07(r3)     // Catch:{ 24P -> 0x14fc }
            X.2qJ r0 = r2.A0V     // Catch:{ 24P -> 0x14fc }
            java.lang.String[] r14 = new java.lang.String[r8]     // Catch:{ 24P -> 0x14fc }
            X.2sm r13 = r0.A01     // Catch:{ 24P -> 0x14fc }
            X.C56922sm.A02(r13, r3, r14, r7)     // Catch:{ 24P -> 0x14fc }
            X.3dV r0 = r0.A05     // Catch:{ 24P -> 0x14fc }
            X.4Fq r48 = r0.A04()     // Catch:{ 24P -> 0x14fc }
            X.3Yo r47 = r48.Axl()     // Catch:{ all -> 0x0fc9 }
            r0 = r48
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0fbf }
            X.2sg r0 = r0.A03     // Catch:{ all -> 0x0fbf }
            r12 = r0
            java.lang.String r11 = "message"
            java.lang.String r1 = "_id IN (   SELECT _id   FROM deleted_messages_ids_view   WHERE chat_row_id = ?)"
            java.lang.String r0 = "updateTempGroup/DELETE_MESSAGE"
            r12.A07(r11, r1, r0, r14)     // Catch:{ all -> 0x0fbf }
            r13.A0K(r3)     // Catch:{ all -> 0x0fbf }
            r47.A00()     // Catch:{ all -> 0x0fbf }
            r47.close()     // Catch:{ all -> 0x0fc9 }
            r48.close()     // Catch:{ 24P -> 0x14fc }
            r0 = r46
            X.3dV r0 = r0.A07     // Catch:{ 24P -> 0x14fc }
            X.4Fq r48 = r0.A04()     // Catch:{ 24P -> 0x14fc }
            X.3Yo r47 = r48.Axl()     // Catch:{ all -> 0x0fc9 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0fbf }
            java.lang.String r0 = "participant-user-store/updateTempGroup/"
            r1.append(r0)     // Catch:{ all -> 0x0fbf }
            r1.append(r3)     // Catch:{ all -> 0x0fbf }
            X.C18260x0.A1R(r1, r5, r6)     // Catch:{ all -> 0x0fbf }
            X.4Fq r46 = X.C620533h.A02(r61)     // Catch:{ all -> 0x0fbf }
            r0 = r61
            X.34p r5 = r0.A09     // Catch:{ all -> 0x0fb5 }
            long r0 = r5.A05(r3)     // Catch:{ all -> 0x0fb5 }
            long r13 = r5.A05(r6)     // Catch:{ all -> 0x0fb5 }
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ all -> 0x0fb5 }
            X.C18280x3.A1R(r11, r7, r0)     // Catch:{ all -> 0x0fb5 }
            android.content.ContentValues r5 = X.C18280x3.A09()     // Catch:{ all -> 0x0fb5 }
            java.lang.String r12 = "group_jid_row_id"
            X.C18270x1.A0c(r5, r12, r13)     // Catch:{ all -> 0x0fb5 }
            java.lang.String r1 = "pending"
            r0 = r46
            X.2sg r55 = X.AnonymousClass3H0.A01(r5, r0, r1, r7)     // Catch:{ all -> 0x0fb5 }
            java.lang.String r57 = "group_participant_user"
            java.lang.String r58 = "group_jid_row_id = ?"
            java.lang.String r59 = "updateTempGroup/UPDATE_GROUP_PARTICIPANT_USER"
            r56 = r5
            r60 = r11
            r55.A05(r56, r57, r58, r59, r60)     // Catch:{ all -> 0x0fb5 }
            r46.close()     // Catch:{ all -> 0x0fbf }
            r0 = r61
            X.2ba r0 = r0.A08     // Catch:{ all -> 0x0fbf }
            java.util.Map r0 = r0.A04     // Catch:{ all -> 0x0fbf }
            r0.remove(r3)     // Catch:{ all -> 0x0fbf }
            r47.A00()     // Catch:{ all -> 0x0fbf }
            r47.close()     // Catch:{ all -> 0x0fc9 }
            r48.close()     // Catch:{ 24P -> 0x14fc }
            android.os.Handler r5 = X.C66493Lq.A1H     // Catch:{ 24P -> 0x14fc }
            r1 = 17
            X.3Zx r0 = new X.3Zx     // Catch:{ 24P -> 0x14fc }
            r0.<init>(r2, r1, r3)     // Catch:{ 24P -> 0x14fc }
            r5.post(r0)     // Catch:{ 24P -> 0x14fc }
            X.3Ex r5 = r2.A0F     // Catch:{ 24P -> 0x14fc }
            X.3ZH r12 = r5.A0A(r3)     // Catch:{ 24P -> 0x14fc }
            r0 = r53
            r12.A13 = r0     // Catch:{ 24P -> 0x14fc }
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r81)     // Catch:{ 24P -> 0x14fc }
            r12.A0I = r0     // Catch:{ 24P -> 0x14fc }
            r0 = r51
            r12.A04 = r0     // Catch:{ 24P -> 0x14fc }
            X.1vC r11 = r5.A05     // Catch:{ 24P -> 0x14fc }
            X.33M r14 = X.AnonymousClass33M.A02(r8)     // Catch:{ 24P -> 0x14fc }
            android.content.ContentValues r1 = X.C18290x4.A0E()     // Catch:{ 24P -> 0x14fc }
            java.lang.String r0 = r6.getRawString()     // Catch:{ 24P -> 0x14fc }
            java.lang.String r13 = "jid"
            r1.put(r13, r0)     // Catch:{ 24P -> 0x14fc }
            java.lang.String r13 = "display_name"
            r0 = r38
            r1.put(r13, r0)     // Catch:{ 24P -> 0x14fc }
            java.lang.String r0 = "phone_label"
            java.lang.String r13 = java.lang.Long.toString(r23)     // Catch:{ 24P -> 0x14fc }
            r1.put(r0, r13)     // Catch:{ 24P -> 0x14fc }
            X.4uZ r0 = r12.A0H     // Catch:{ 24P -> 0x14fc }
            r11.A0G(r1, r0)     // Catch:{ 24P -> 0x14fc }
            r11.A0O(r12, r6)     // Catch:{ 24P -> 0x14fc }
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ 24P -> 0x14fc }
            java.lang.String r0 = "updated temp group"
            r11.append(r0)     // Catch:{ 24P -> 0x14fc }
            r0 = r35
            r11.append(r0)     // Catch:{ 24P -> 0x14fc }
            java.lang.String r0 = " creationTime="
            r11.append(r0)     // Catch:{ 24P -> 0x14fc }
            r0 = r23
            r11.append(r0)     // Catch:{ 24P -> 0x14fc }
            java.lang.String r0 = " oldJid="
            X.AnonymousClass3ZH.A0C(r12, r0, r11)     // Catch:{ 24P -> 0x14fc }
            java.lang.String r0 = " newJid="
            r11.append(r0)     // Catch:{ 24P -> 0x14fc }
            r11.append(r6)     // Catch:{ 24P -> 0x14fc }
            java.lang.String r0 = " | time: "
            r11.append(r0)     // Catch:{ 24P -> 0x14fc }
            long r0 = r14.A06()     // Catch:{ 24P -> 0x14fc }
            X.C18260x0.A1I(r11, r0)     // Catch:{ 24P -> 0x14fc }
            X.2ev r1 = r5.A04     // Catch:{ 24P -> 0x14fc }
            java.lang.Class<X.1fK> r0 = X.C28001fK.class
            com.whatsapp.jid.Jid r0 = r12.A0I(r0)     // Catch:{ 24P -> 0x14fc }
            java.util.Map r1 = r1.A01     // Catch:{ 24P -> 0x14fc }
            r1.remove(r0)     // Catch:{ 24P -> 0x14fc }
            r1.remove(r6)     // Catch:{ 24P -> 0x14fc }
            r5.A0A(r6)     // Catch:{ 24P -> 0x14fc }
            X.314 r11 = r2.A0L     // Catch:{ 24P -> 0x14fc }
            X.2ss r0 = r11.A02     // Catch:{ 24P -> 0x14fc }
            r0.A0G()     // Catch:{ 24P -> 0x14fc }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24P -> 0x14fc }
            java.lang.String r0 = "conversationsmgr/replacecontact:"
            r1.append(r0)     // Catch:{ 24P -> 0x14fc }
            r1.append(r3)     // Catch:{ 24P -> 0x14fc }
            java.lang.String r0 = " -> "
            X.C18260x0.A1R(r1, r0, r6)     // Catch:{ 24P -> 0x14fc }
            r0 = r26
            r11.A0E(r3, r6, r0)     // Catch:{ 24P -> 0x14fc }
            java.util.Iterator r12 = X.AnonymousClass000.A0q(r36)     // Catch:{ 24P -> 0x14fc }
        L_0x0f6b:
            boolean r0 = r12.hasNext()     // Catch:{ 24P -> 0x14fc }
            if (r0 == 0) goto L_0x1041
            java.util.Map$Entry r11 = X.AnonymousClass001.A0w(r12)     // Catch:{ 24P -> 0x14fc }
            com.whatsapp.jid.UserJid r1 = X.C18320x8.A0P(r11)     // Catch:{ 24P -> 0x14fc }
            r0 = r49
            X.2zG r0 = r0.A05(r1)     // Catch:{ 24P -> 0x14fc }
            if (r0 != 0) goto L_0x0f6b
            X.4uZ r1 = X.C18320x8.A0N(r11)     // Catch:{ 24P -> 0x14fc }
            r0 = r81
            boolean r0 = r0.A0a(r1)     // Catch:{ 24P -> 0x14fc }
            if (r0 != 0) goto L_0x0f6b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24P -> 0x14fc }
            java.lang.String r0 = "groupmgr/onGroupNewGroup/ identified new participant:"
            r1.append(r0)     // Catch:{ 24P -> 0x14fc }
            java.lang.Object r0 = r11.getKey()     // Catch:{ 24P -> 0x14fc }
            X.C18260x0.A0o(r0, r1)     // Catch:{ 24P -> 0x14fc }
            r11.getValue()     // Catch:{ 24P -> 0x14fc }
            java.lang.Object r3 = r11.getKey()     // Catch:{ 24P -> 0x14fc }
            java.lang.Object r0 = r11.getValue()     // Catch:{ 24P -> 0x14fc }
            X.2pI r0 = (X.C54792pI) r0     // Catch:{ 24P -> 0x14fc }
            java.lang.String r1 = r0.A04     // Catch:{ 24P -> 0x14fc }
            r0 = r33
            r0.put(r3, r1)     // Catch:{ 24P -> 0x14fc }
            r12.remove()     // Catch:{ 24P -> 0x14fc }
            goto L_0x0f6b
        L_0x0fb5:
            r1 = move-exception
            r46.close()     // Catch:{ all -> 0x0fba }
            goto L_0x0fbe
        L_0x0fba:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0fbf }
        L_0x0fbe:
            throw r1     // Catch:{ all -> 0x0fbf }
        L_0x0fbf:
            r1 = move-exception
            r47.close()     // Catch:{ all -> 0x0fc4 }
            goto L_0x0fc8
        L_0x0fc4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0fc9 }
        L_0x0fc8:
            throw r1     // Catch:{ all -> 0x0fc9 }
        L_0x0fc9:
            r1 = move-exception
            r48.close()     // Catch:{ all -> 0x0fce }
            goto L_0x0fd2
        L_0x0fce:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ 24P -> 0x14fc }
        L_0x0fd2:
            throw r1     // Catch:{ 24P -> 0x14fc }
        L_0x0fd3:
            X.3Ex r5 = r2.A0F     // Catch:{ 24P -> 0x14fc }
            X.3ZH r3 = r5.A07(r6)     // Catch:{ 24P -> 0x14fc }
            if (r3 != 0) goto L_0x1006
            X.3ZH r0 = new X.3ZH     // Catch:{ 24P -> 0x14fc }
            r0.<init>(r6)     // Catch:{ 24P -> 0x14fc }
            r55 = r5
            r56 = r0
            r57 = r45
            r58 = r48
            r59 = r38
            r60 = r39
            r61 = r25
            r62 = r51
            r63 = r23
            r65 = r47
            r66 = r46
            r67 = r50
            r70 = r22
            r71 = r53
            r73 = r14
            r74 = r28
            r75 = r13
            r55.A0T(r56, r57, r58, r59, r60, r61, r62, r63, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75)     // Catch:{ 24P -> 0x14fc }
            goto L_0x1041
        L_0x1006:
            X.2s0 r11 = r2.A14     // Catch:{ 24P -> 0x14fc }
            int r1 = r3.A06     // Catch:{ 24P -> 0x14fc }
            r0 = 2
            r11.A01(r6, r1, r0)     // Catch:{ 24P -> 0x14fc }
            r55 = r2
            r56 = r3
            r57 = r45
            r58 = r48
            r59 = r38
            r60 = r39
            r61 = r51
            r62 = r23
            r64 = r47
            r65 = r46
            r66 = r50
            r67 = r68
            r68 = r69
            r69 = r22
            r70 = r53
            r71 = r72
            r72 = r14
            r73 = r28
            r74 = r13
            boolean r0 = r55.A0f(r56, r57, r58, r59, r60, r61, r62, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74)     // Catch:{ 24P -> 0x14fc }
            if (r0 == 0) goto L_0x1041
            r0 = r25
            r3.A02 = r0     // Catch:{ 24P -> 0x14fc }
            r5.A0O(r3)     // Catch:{ 24P -> 0x14fc }
        L_0x1041:
            r1 = 3
            r0 = r37
            if (r0 != r1) goto L_0x1047
            goto L_0x1094
        L_0x1047:
            r0 = 0
            r12 = 1
            r1 = r37
            if (r1 != r8) goto L_0x109a
            r1 = r82
            X.31A r1 = r1.A0A(r6, r7)     // Catch:{ 24P -> 0x14fc }
            if (r1 == 0) goto L_0x106c
            X.2so r11 = r2.A0A     // Catch:{ 24P -> 0x14fc }
            r1 = r82
            X.31A r3 = r1.A0A(r6, r7)     // Catch:{ 24P -> 0x14fc }
            if (r3 == 0) goto L_0x109a
            r1 = r52
            if (r1 == r8) goto L_0x1064
            r12 = 0
        L_0x1064:
            r3.A0n = r12     // Catch:{ 24P -> 0x14fc }
            X.2f2 r1 = r11.A07     // Catch:{ 24P -> 0x14fc }
            r1.A00(r3)     // Catch:{ 24P -> 0x14fc }
            goto L_0x109a
        L_0x106c:
            if (r18 == 0) goto L_0x109a
            r1 = r52
            if (r1 == r8) goto L_0x1073
            r12 = 0
        L_0x1073:
            X.2jg r11 = r2.A0B     // Catch:{ 24P -> 0x14fc }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 24P -> 0x14fc }
            java.lang.String r1 = "CommunitySharedPrefs/setTempIsClosed()/groupType = "
            X.C18260x0.A1E(r1, r3, r12)     // Catch:{ 24P -> 0x14fc }
            android.content.SharedPreferences r1 = r11.A00()     // Catch:{ 24P -> 0x14fc }
            android.content.SharedPreferences$Editor r11 = r1.edit()     // Catch:{ 24P -> 0x14fc }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 24P -> 0x14fc }
            java.lang.String r1 = "closed_"
            java.lang.String r1 = X.C18260x0.A03(r6, r1, r3)     // Catch:{ 24P -> 0x14fc }
            X.C18270x1.A0l(r11, r1, r12)     // Catch:{ 24P -> 0x14fc }
            goto L_0x109a
        L_0x1094:
            r0 = 1
            r1 = r54
            r2.A0S(r6, r1)     // Catch:{ 24P -> 0x14fc }
        L_0x109a:
            r51 = r2
            r52 = r9
            r53 = r6
            r54 = r38
            r55 = r37
            r56 = r20
            r51.A0T(r52, r53, r54, r55, r56)     // Catch:{ 24P -> 0x14fc }
            X.2sj r1 = r2.A0b     // Catch:{ 24P -> 0x14fc }
            X.33k r46 = X.C56892sj.A01(r1, r6)     // Catch:{ 24P -> 0x14fc }
            java.lang.String r3 = "lid"
            r1 = r39
            boolean r14 = r3.equals(r1)     // Catch:{ 24P -> 0x14fc }
            if (r14 == 0) goto L_0x10bb
            r3 = 3
            goto L_0x10c4
        L_0x10bb:
            if (r0 == 0) goto L_0x10c2
            r3 = 2
        L_0x10be:
            if (r22 != 0) goto L_0x10c4
            r3 = 0
            goto L_0x10c4
        L_0x10c2:
            r3 = 1
            goto L_0x10be
        L_0x10c4:
            r1 = r46
            r1.A00 = r3     // Catch:{ 24P -> 0x14fc }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 24P -> 0x14fc }
            java.lang.String r1 = "groupmgr/onGroupNewGroup oldparticipants:"
            r3.append(r1)     // Catch:{ 24P -> 0x14fc }
            X.6aS r1 = r46.A02()     // Catch:{ 24P -> 0x14fc }
            X.C18260x0.A0o(r1, r3)     // Catch:{ 24P -> 0x14fc }
            r3 = r46
            r1 = r81
            boolean r39 = r3.A0O(r1)     // Catch:{ 24P -> 0x14fc }
            r12 = 0
            r1 = 2
            X.334 r3 = new X.334     // Catch:{ 24P -> 0x14fc }
            r3.<init>((java.lang.String) r12, (int) r1)     // Catch:{ 24P -> 0x14fc }
            if (r50 == 0) goto L_0x10f3
            r11 = r46
            r1 = r81
            boolean r1 = r11.A0P(r1)     // Catch:{ 24P -> 0x14fc }
            if (r1 == 0) goto L_0x10fb
        L_0x10f3:
            X.2OF r1 = r2.A0l     // Catch:{ 24P -> 0x14fc }
            boolean r1 = r1.A01     // Catch:{ 24P -> 0x14fc }
            r57 = 1
            if (r1 == 0) goto L_0x10fd
        L_0x10fb:
            r57 = 0
        L_0x10fd:
            if (r14 != 0) goto L_0x1103
            r58 = 0
            if (r22 == 0) goto L_0x1105
        L_0x1103:
            r58 = 1
        L_0x1105:
            r55 = r7
            r47 = r2
            r48 = r46
            r49 = r3
            r50 = r12
            r51 = r36
            r52 = r43
            r54 = r7
            r56 = r8
            r47.A01(r48, r49, r50, r51, r52, r54, r55, r56, r57, r58)     // Catch:{ 24P -> 0x14fc }
            X.5ZU r1 = r2.A0H     // Catch:{ 24P -> 0x14fc }
            r1.A0b(r6)     // Catch:{ 24P -> 0x14fc }
            if (r18 == 0) goto L_0x12a6
            boolean r1 = r2.A0l(r6, r0)     // Catch:{ 24P -> 0x14fc }
            if (r1 == 0) goto L_0x113e
            X.3Oz r3 = r2.A0k     // Catch:{ 24P -> 0x14fc }
            X.2sd r1 = r2.A17     // Catch:{ 24P -> 0x14fc }
            r51 = 99
            r47 = r1
            r48 = r12
            r49 = r6
            r52 = r26
            X.1p1 r1 = r47.A06(r48, r49, r50, r51, r52)     // Catch:{ 24P -> 0x14fc }
            X.3Lv r3 = r3.A01     // Catch:{ 24P -> 0x14fc }
            r3.A0V(r1)     // Catch:{ 24P -> 0x14fc }
        L_0x113e:
            java.lang.String r11 = "linked_group_join"
            if (r0 == 0) goto L_0x118e
            java.lang.String r1 = "default_sub_group_admin_add"
            r0 = r42
            boolean r0 = r1.equals(r0)     // Catch:{ 24P -> 0x14fc }
            if (r0 != 0) goto L_0x1230
            java.lang.String r1 = "invite"
            r0 = r42
            boolean r0 = r1.equals(r0)     // Catch:{ 24P -> 0x14fc }
            if (r0 != 0) goto L_0x1230
            java.lang.String r1 = "auto_add"
            r0 = r42
            boolean r0 = r1.equals(r0)     // Catch:{ 24P -> 0x14fc }
            if (r0 != 0) goto L_0x1230
            r0 = r42
            boolean r0 = r11.equals(r0)     // Catch:{ 24P -> 0x14fc }
            if (r0 != 0) goto L_0x1230
            java.lang.String r1 = "invite_auto_add"
            r0 = r42
            boolean r0 = r1.equals(r0)     // Catch:{ 24P -> 0x14fc }
            if (r0 != 0) goto L_0x1230
            if (r15 == 0) goto L_0x1230
            X.1oE r3 = new X.1oE     // Catch:{ 24P -> 0x14fc }
            r0 = r23
            r3.<init>((X.AnonymousClass39T) r10, (long) r0)     // Catch:{ 24P -> 0x14fc }
            if (r9 == 0) goto L_0x1182
            r0 = r38
            X.C30341mI.A00(r9, r3, r0)     // Catch:{ 24P -> 0x14fc }
        L_0x1182:
            r0 = r45
            r3.A1J(r0)     // Catch:{ 24P -> 0x14fc }
            r0 = r38
            r3.A1Z(r0)     // Catch:{ 24P -> 0x14fc }
            goto L_0x124c
        L_0x118e:
            int r0 = r36.size()     // Catch:{ 24P -> 0x14fc }
            if (r0 != r8) goto L_0x11d8
            if (r9 == 0) goto L_0x11d8
            r1 = 2
            r0 = r37
            if (r0 != r1) goto L_0x11d8
            X.1VX r3 = r2.A0j     // Catch:{ 24P -> 0x14fc }
            r1 = 3966(0xf7e, float:5.558E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ 24P -> 0x14fc }
            boolean r0 = r3.A0Y(r0, r1)     // Catch:{ 24P -> 0x14fc }
            if (r0 == 0) goto L_0x11d8
            r0 = r82
            java.lang.String r13 = r0.A0D(r9)     // Catch:{ 24P -> 0x14fc }
            X.1oL r3 = new X.1oL     // Catch:{ 24P -> 0x14fc }
            r0 = r23
            r3.<init>((X.AnonymousClass39T) r10, (long) r0)     // Catch:{ 24P -> 0x14fc }
            X.C30341mI.A00(r9, r3, r13)     // Catch:{ 24P -> 0x14fc }
            if (r6 == 0) goto L_0x11c9
            java.util.List r13 = r3.A00     // Catch:{ 24P -> 0x14fc }
            X.C162457s7.A0D(r13)     // Catch:{ 24P -> 0x14fc }
            X.458 r0 = X.AnonymousClass458.A00     // Catch:{ 24P -> 0x14fc }
            X.C73743g0.A0Z(r13, r0, r8)     // Catch:{ 24P -> 0x14fc }
            r1 = 2
            r0 = r38
            X.C52662lq.A01(r6, r0, r13, r1)     // Catch:{ 24P -> 0x14fc }
        L_0x11c9:
            r0 = r45
            r3.A1J(r0)     // Catch:{ 24P -> 0x14fc }
            r0 = r38
            r3.A1Z(r0)     // Catch:{ 24P -> 0x14fc }
            r0 = r42
            r3.A01 = r0     // Catch:{ 24P -> 0x14fc }
            goto L_0x124c
        L_0x11d8:
            if (r15 == 0) goto L_0x1213
            X.2rN r1 = r2.A1B     // Catch:{ 24P -> 0x14fc }
            r0 = r37
            boolean r0 = r1.A02(r0)     // Catch:{ 24P -> 0x14fc }
            if (r0 == 0) goto L_0x1213
            r0 = r82
            java.lang.String r13 = r0.A0D(r9)     // Catch:{ 24P -> 0x14fc }
            X.1oK r3 = new X.1oK     // Catch:{ 24P -> 0x14fc }
            r0 = r23
            r3.<init>((X.AnonymousClass39T) r10, (long) r0)     // Catch:{ 24P -> 0x14fc }
            if (r9 == 0) goto L_0x11f6
            X.C30341mI.A00(r9, r3, r13)     // Catch:{ 24P -> 0x14fc }
        L_0x11f6:
            if (r6 == 0) goto L_0x1208
            java.util.List r13 = r3.A00     // Catch:{ 24P -> 0x14fc }
            X.C162457s7.A0D(r13)     // Catch:{ 24P -> 0x14fc }
            X.45A r0 = X.AnonymousClass45A.A00     // Catch:{ 24P -> 0x14fc }
            X.C73743g0.A0Z(r13, r0, r8)     // Catch:{ 24P -> 0x14fc }
            r1 = 2
            r0 = r38
            X.C52662lq.A01(r6, r0, r13, r1)     // Catch:{ 24P -> 0x14fc }
        L_0x1208:
            r0 = r45
            r3.A1J(r0)     // Catch:{ 24P -> 0x14fc }
            r0 = r38
            r3.A1Z(r0)     // Catch:{ 24P -> 0x14fc }
            goto L_0x124c
        L_0x1213:
            X.2sd r0 = r2.A17     // Catch:{ 24P -> 0x14fc }
            r51 = 11
            r47 = r0
            r48 = r12
            r49 = r6
            r50 = r10
            r52 = r23
            X.1p1 r3 = r47.A06(r48, r49, r50, r51, r52)     // Catch:{ 24P -> 0x14fc }
            r0 = r38
            r3.A1Z(r0)     // Catch:{ 24P -> 0x14fc }
            r0 = r45
            r3.A1J(r0)     // Catch:{ 24P -> 0x14fc }
            goto L_0x124c
        L_0x1230:
            X.2sd r0 = r2.A17     // Catch:{ 24P -> 0x14fc }
            r51 = 11
            r47 = r0
            r48 = r12
            r49 = r6
            r50 = r10
            r52 = r23
            X.1p1 r3 = r47.A06(r48, r49, r50, r51, r52)     // Catch:{ 24P -> 0x14fc }
            r0 = r38
            r3.A1Z(r0)     // Catch:{ 24P -> 0x14fc }
            r0 = r45
            r3.A1J(r0)     // Catch:{ 24P -> 0x14fc }
        L_0x124c:
            X.3Oz r0 = r2.A0k     // Catch:{ 24P -> 0x14fc }
            r0.BEz(r3, r8)     // Catch:{ 24P -> 0x14fc }
            r0 = r42
            boolean r53 = r11.equals(r0)     // Catch:{ 24P -> 0x14fc }
            if (r9 == 0) goto L_0x125c
            r58 = 0
            goto L_0x125f
        L_0x125c:
            r49 = 0
            goto L_0x126c
        L_0x125f:
            X.2mC r49 = new X.2mC     // Catch:{ 24P -> 0x14fc }
            r54 = r49
            r55 = r9
            r56 = r35
            r57 = r8
            r54.<init>(r55, r56, r57, r58)     // Catch:{ 24P -> 0x14fc }
        L_0x126c:
            int r0 = r36.size()     // Catch:{ 24P -> 0x14fc }
            r54 = 1
            if (r0 != r8) goto L_0x127c
            if (r9 == 0) goto L_0x127c
            r1 = 2
            r0 = r37
            if (r0 != r1) goto L_0x127c
            goto L_0x127f
        L_0x127c:
            r54 = 0
            goto L_0x128b
        L_0x127f:
            X.1VX r3 = r2.A0j     // Catch:{ 24P -> 0x14fc }
            r1 = 3966(0xf7e, float:5.558E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ 24P -> 0x14fc }
            boolean r0 = r3.A0Y(r0, r1)     // Catch:{ 24P -> 0x14fc }
            if (r0 == 0) goto L_0x127c
        L_0x128b:
            X.2mC r48 = new X.2mC     // Catch:{ 24P -> 0x14fc }
            r55 = r48
            r56 = r6
            r57 = r38
            r58 = r37
            r59 = r20
            r55.<init>(r56, r57, r58, r59)     // Catch:{ 24P -> 0x14fc }
            r47 = r2
            r50 = r45
            r51 = r23
            r47.A0G(r48, r49, r50, r51, r53, r54)     // Catch:{ 24P -> 0x14fc }
            if (r53 == 0) goto L_0x12f7
            goto L_0x12e8
        L_0x12a6:
            if (r15 != 0) goto L_0x12f7
            r0 = r82
            X.31A r1 = r0.A0A(r6, r7)     // Catch:{ 24P -> 0x14fc }
            if (r1 != 0) goto L_0x12b2
            r3 = 0
            goto L_0x12b4
        L_0x12b2:
            X.2fO r3 = r1.A0e     // Catch:{ 24P -> 0x14fc }
        L_0x12b4:
            X.2YH r0 = r2.A0x     // Catch:{ 24P -> 0x14fc }
            long r51 = X.C56612sH.A07(r2)     // Catch:{ 24P -> 0x14fc }
            r47 = r0
            r48 = r6
            r49 = r3
            r50 = r76
            X.1mI r11 = r47.A00(r48, r49, r50, r51)     // Catch:{ 24P -> 0x14fc }
            if (r11 == 0) goto L_0x12cf
            X.3Oz r3 = r2.A0k     // Catch:{ 24P -> 0x14fc }
            r0 = 8
            r3.BEz(r11, r0)     // Catch:{ 24P -> 0x14fc }
        L_0x12cf:
            X.2qJ r0 = r2.A0V     // Catch:{ 24P -> 0x14fc }
            r77 = r38
            boolean r3 = android.text.TextUtils.isEmpty(r38)     // Catch:{ 24P -> 0x14fc }
            if (r3 == 0) goto L_0x12ec
            java.lang.String r3 = r1.A07()     // Catch:{ 24P -> 0x14fc }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 24P -> 0x14fc }
            if (r3 != 0) goto L_0x12ec
            java.lang.String r77 = r1.A07()     // Catch:{ 24P -> 0x14fc }
            goto L_0x12ec
        L_0x12e8:
            X.2qJ r0 = r2.A0V     // Catch:{ 24P -> 0x14fc }
            r77 = r38
        L_0x12ec:
            r74 = r0
            r75 = r6
            r78 = r37
            r79 = r23
            r74.A02(r75, r76, r77, r78, r79)     // Catch:{ 24P -> 0x14fc }
        L_0x12f7:
            if (r28 == 0) goto L_0x1315
            X.3Oz r3 = r2.A0k     // Catch:{ 24P -> 0x14fc }
            X.2sd r0 = r2.A17     // Catch:{ 24P -> 0x14fc }
            r51 = 150(0x96, float:2.1E-43)
            r50 = r12
            r47 = r0
            r48 = r12
            r49 = r6
            r52 = r23
            X.1p1 r1 = r47.A06(r48, r49, r50, r51, r52)     // Catch:{ 24P -> 0x14fc }
            r1.A1J(r12)     // Catch:{ 24P -> 0x14fc }
            r0 = 3019(0xbcb, float:4.23E-42)
            r3.BEz(r1, r0)     // Catch:{ 24P -> 0x14fc }
        L_0x1315:
            if (r15 == 0) goto L_0x136f
            boolean r0 = r33.isEmpty()     // Catch:{ 24P -> 0x14fc }
            if (r0 != 0) goto L_0x136f
            java.util.Iterator r13 = X.AnonymousClass001.A0u(r33)     // Catch:{ 24P -> 0x14fc }
        L_0x1321:
            boolean r0 = r13.hasNext()     // Catch:{ 24P -> 0x14fc }
            if (r0 == 0) goto L_0x134a
            java.util.Map$Entry r11 = X.AnonymousClass001.A0w(r13)     // Catch:{ 24P -> 0x14fc }
            java.lang.Object r3 = r11.getKey()     // Catch:{ 24P -> 0x14fc }
            X.2bd r1 = new X.2bd     // Catch:{ 24P -> 0x14fc }
            r1.<init>()     // Catch:{ 24P -> 0x14fc }
            com.whatsapp.jid.UserJid r0 = X.C18320x8.A0P(r11)     // Catch:{ 24P -> 0x14fc }
            r1.A00 = r0     // Catch:{ 24P -> 0x14fc }
            java.lang.String r0 = X.AnonymousClass0x9.A12(r11)     // Catch:{ 24P -> 0x14fc }
            r1.A04 = r0     // Catch:{ 24P -> 0x14fc }
            X.2pI r1 = r1.A00()     // Catch:{ 24P -> 0x14fc }
            r0 = r36
            r0.put(r3, r1)     // Catch:{ 24P -> 0x14fc }
            goto L_0x1321
        L_0x134a:
            r1 = 2
            X.334 r0 = new X.334     // Catch:{ 24P -> 0x14fc }
            r0.<init>((java.lang.String) r12, (int) r1)     // Catch:{ 24P -> 0x14fc }
            if (r14 != 0) goto L_0x1356
            r58 = 0
            if (r22 == 0) goto L_0x1358
        L_0x1356:
            r58 = 1
        L_0x1358:
            r56 = r7
            r57 = r7
            r47 = r2
            r48 = r46
            r49 = r0
            r50 = r12
            r51 = r36
            r52 = r43
            r54 = r8
            r55 = r7
            r47.A01(r48, r49, r50, r51, r52, r54, r55, r56, r57, r58)     // Catch:{ 24P -> 0x14fc }
        L_0x136f:
            com.whatsapp.jid.PhoneUserJid r1 = X.C56972sr.A05(r81)     // Catch:{ 24P -> 0x14fc }
            r0 = r36
            boolean r0 = r0.containsKey(r1)     // Catch:{ 24P -> 0x14fc }
            if (r0 != 0) goto L_0x1387
            X.1fH r1 = r81.A0H()     // Catch:{ 24P -> 0x14fc }
            r0 = r36
            boolean r0 = r0.containsKey(r1)     // Catch:{ 24P -> 0x14fc }
            if (r0 == 0) goto L_0x1448
        L_0x1387:
            if (r15 != 0) goto L_0x1448
            if (r39 != 0) goto L_0x1448
            if (r19 != 0) goto L_0x1448
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r34)     // Catch:{ 24P -> 0x14fc }
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r81)     // Catch:{ 24P -> 0x14fc }
            X.C18260x0.A0o(r0, r1)     // Catch:{ 24P -> 0x14fc }
            if (r18 != 0) goto L_0x140b
            X.1VX r3 = r2.A0j     // Catch:{ 24P -> 0x14fc }
            r1 = 2367(0x93f, float:3.317E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ 24P -> 0x14fc }
            boolean r0 = r3.A0Y(r0, r1)     // Catch:{ 24P -> 0x14fc }
            if (r0 == 0) goto L_0x141a
            r1 = 2
            r0 = r37
            if (r0 == r1) goto L_0x13ae
            r1 = 6
            if (r0 != r1) goto L_0x141a
        L_0x13ae:
            if (r9 == 0) goto L_0x141a
            r0 = r82
            java.lang.String r14 = r0.A0D(r9)     // Catch:{ 24P -> 0x14fc }
            int r3 = r2.A03(r6)     // Catch:{ 24P -> 0x14fc }
            if (r3 == r8) goto L_0x13c0
            r0 = 4
            if (r3 == r0) goto L_0x13e2
            goto L_0x140d
        L_0x13c0:
            X.2sd r13 = r2.A17     // Catch:{ 24P -> 0x14fc }
            X.2z0 r3 = X.C56832sd.A01(r6, r13, r8)     // Catch:{ 24P -> 0x14fc }
            X.1oq r11 = new X.1oq     // Catch:{ 24P -> 0x14fc }
            r0 = r26
            r11.<init>(r3, r0)     // Catch:{ 24P -> 0x14fc }
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ 24P -> 0x14fc }
            X.C52662lq.A00(r9, r14, r0, r8)     // Catch:{ 24P -> 0x14fc }
            java.util.List r1 = r11.A00     // Catch:{ 24P -> 0x14fc }
            r1.clear()     // Catch:{ 24P -> 0x14fc }
            r1.addAll(r0)     // Catch:{ 24P -> 0x14fc }
            r0 = r45
            r13.A0A(r0, r11, r8)     // Catch:{ 24P -> 0x14fc }
            goto L_0x1403
        L_0x13e2:
            X.2sd r13 = r2.A17     // Catch:{ 24P -> 0x14fc }
            X.2z0 r3 = X.C56832sd.A01(r6, r13, r8)     // Catch:{ 24P -> 0x14fc }
            X.1oo r11 = new X.1oo     // Catch:{ 24P -> 0x14fc }
            r0 = r26
            r11.<init>(r3, r0)     // Catch:{ 24P -> 0x14fc }
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()     // Catch:{ 24P -> 0x14fc }
            X.C52662lq.A00(r9, r12, r1, r8)     // Catch:{ 24P -> 0x14fc }
            java.util.List r0 = r11.A00     // Catch:{ 24P -> 0x14fc }
            r0.clear()     // Catch:{ 24P -> 0x14fc }
            r0.addAll(r1)     // Catch:{ 24P -> 0x14fc }
            r0 = r45
            r13.A0A(r0, r11, r8)     // Catch:{ 24P -> 0x14fc }
        L_0x1403:
            X.3Oz r1 = r2.A0k     // Catch:{ 24P -> 0x14fc }
            r0 = 3013(0xbc5, float:4.222E-42)
            r1.BEz(r11, r0)     // Catch:{ 24P -> 0x14fc }
            goto L_0x141a
        L_0x140b:
            r10 = r12
            goto L_0x141a
        L_0x140d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24P -> 0x14fc }
            java.lang.String r0 = "GroupChatManager/displaySubGroupLinkedWithJoinModeDisclaimer Unhandled groupJoinMode "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)     // Catch:{ 24P -> 0x14fc }
            X.C626936e.A0D(r7, r0)     // Catch:{ 24P -> 0x14fc }
        L_0x141a:
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r81)     // Catch:{ 24P -> 0x14fc }
            java.util.List r58 = java.util.Collections.singletonList(r0)     // Catch:{ 24P -> 0x14fc }
            r62 = 0
            r0 = r82
            java.lang.String r56 = r0.A0D(r9)     // Catch:{ 24P -> 0x14fc }
            r47 = r2
            r48 = r12
            r49 = r30
            r50 = r9
            r51 = r6
            r52 = r29
            r53 = r45
            r54 = r10
            r55 = r42
            r57 = r38
            r59 = r37
            r60 = r26
            r64 = r18
            r47.A0D(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r62, r64)     // Catch:{ 24P -> 0x14fc }
            goto L_0x144f
        L_0x1448:
            if (r18 != 0) goto L_0x144f
            X.33S r0 = r2.A11     // Catch:{ 24P -> 0x14fc }
            r0.A01(r10)     // Catch:{ 24P -> 0x14fc }
        L_0x144f:
            if (r25 <= 0) goto L_0x1476
            if (r31 == 0) goto L_0x1476
            if (r15 == 0) goto L_0x1458
            if (r19 != 0) goto L_0x14b2
            goto L_0x148c
        L_0x1458:
            X.3ZH r3 = r5.A0A(r6)     // Catch:{ 24P -> 0x14fc }
            int r1 = r3.A02     // Catch:{ 24P -> 0x14fc }
            r0 = r25
            if (r1 == r0) goto L_0x1467
            r3.A02 = r0     // Catch:{ 24P -> 0x14fc }
            X.C34461vC.A03(r5, r3)     // Catch:{ 24P -> 0x14fc }
        L_0x1467:
            X.2sd r0 = r2.A17     // Catch:{ 24P -> 0x14fc }
            r9 = r0
            r10 = r6
            r11 = r45
            r13 = r25
            r14 = r26
            X.1mI r3 = r9.A03(r10, r11, r12, r13, r14)     // Catch:{ 24P -> 0x14fc }
            goto L_0x14ab
        L_0x1476:
            if (r15 != 0) goto L_0x14b2
            if (r25 <= 0) goto L_0x14b2
            if (r39 != 0) goto L_0x14b2
            if (r19 != 0) goto L_0x14b2
            X.2sd r0 = r2.A17     // Catch:{ 24P -> 0x14fc }
            r9 = r0
            r10 = r6
            r11 = r12
            r13 = r25
            r14 = r26
            X.1mI r3 = r9.A03(r10, r11, r12, r13, r14)     // Catch:{ 24P -> 0x14fc }
            goto L_0x14ab
        L_0x148c:
            X.3ZH r3 = r5.A0A(r6)     // Catch:{ 24P -> 0x14fc }
            int r1 = r3.A02     // Catch:{ 24P -> 0x14fc }
            r0 = r25
            if (r1 == r0) goto L_0x149b
            r3.A02 = r0     // Catch:{ 24P -> 0x14fc }
            X.C34461vC.A03(r5, r3)     // Catch:{ 24P -> 0x14fc }
        L_0x149b:
            X.2sd r0 = r2.A17     // Catch:{ 24P -> 0x14fc }
            com.whatsapp.jid.PhoneUserJid r11 = X.C56972sr.A04(r81)     // Catch:{ 24P -> 0x14fc }
            r9 = r0
            r10 = r6
            r13 = r25
            r14 = r26
            X.1mI r3 = r9.A03(r10, r11, r12, r13, r14)     // Catch:{ 24P -> 0x14fc }
        L_0x14ab:
            r1 = 3017(0xbc9, float:4.228E-42)
            android.os.Handler r0 = X.C66493Lq.A1H     // Catch:{ 24P -> 0x14fc }
            X.C18290x4.A1C(r0, r3, r1)     // Catch:{ 24P -> 0x14fc }
        L_0x14b2:
            X.2c2 r0 = r2.A0f     // Catch:{ 24P -> 0x14fc }
            r0.A00(r6)     // Catch:{ 24P -> 0x14fc }
            X.2sD r3 = r2.A19     // Catch:{ 24P -> 0x14fc }
            r1 = 3
            r9 = r32
            r0 = r29
            r3.A04(r6, r0, r1, r9)     // Catch:{ 24P -> 0x14fc }
            if (r18 != 0) goto L_0x14d0
            X.3ZH r1 = r5.A0A(r6)     // Catch:{ 24P -> 0x14fc }
            int r0 = r1.A03     // Catch:{ 24P -> 0x14fc }
            if (r0 == r7) goto L_0x14d0
            r1.A03 = r7     // Catch:{ 24P -> 0x14fc }
            X.C34461vC.A03(r5, r1)     // Catch:{ 24P -> 0x14fc }
        L_0x14d0:
            X.1hl r0 = r2.A0n     // Catch:{ 24P -> 0x14fc }
            java.util.Iterator r2 = X.C61102zi.A03(r0)     // Catch:{ 24P -> 0x14fc }
        L_0x14d6:
            boolean r0 = r2.hasNext()     // Catch:{ 24P -> 0x14fc }
            if (r0 == 0) goto L_0x14e8
            java.lang.Object r1 = r2.next()     // Catch:{ 24P -> 0x14fc }
            X.2dj r1 = (X.C47732dj) r1     // Catch:{ 24P -> 0x14fc }
            r0 = r46
            r1.A00(r0, r6)     // Catch:{ 24P -> 0x14fc }
            goto L_0x14d6
        L_0x14e8:
            X.2oV r2 = r4.A09     // Catch:{ 24P -> 0x14fc }
            long r20 = r20 / r16
            r0 = r20
            r2.A03(r6, r0)     // Catch:{ 24P -> 0x14fc }
            r0 = r40
            r2.A00(r6, r0)     // Catch:{ 24P -> 0x14fc }
            r0 = r43
            r2.A02(r6, r0)     // Catch:{ 24P -> 0x14fc }
            return r8
        L_0x14fc:
            r1 = move-exception
            java.lang.String r0 = "GroupNotificationHandler/handleCreate/invalid-jid"
            com.whatsapp.util.Log.w(r0, r1)
            X.2qk r2 = r4.A00
            java.lang.String r1 = "GroupNotificationHandler/handleCreate"
            java.lang.String r0 = "invalid-jid-received"
            r2.A0A(r1, r8, r0)
            return r8
        L_0x150c:
            X.2so r9 = r2.A0A
            X.2rM r0 = r9.A0H
            X.2mC r1 = r0.A00(r3)
            java.util.Set r7 = r9.A05(r3)
            java.util.Iterator r6 = r7.iterator()
        L_0x151c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x152f
            X.2mC r0 = X.AnonymousClass0x7.A0O(r6)
            int r0 = r0.A00
            if (r0 != r11) goto L_0x151c
            r6.remove()
            r13 = 1
            goto L_0x151c
        L_0x152f:
            X.2L1 r12 = r9.A0I
            X.2rM r11 = r12.A01
            r6 = 5
            X.4KD r0 = new X.4KD
            r0.<init>(r12, r6)
            java.util.Set r11 = r11.A02(r0, r3)
            X.3Ex r12 = r2.A0F
            X.3ZH r6 = r12.A0A(r3)
            boolean r0 = r6.A0s
            if (r0 == r8) goto L_0x154c
            r6.A0s = r8
            X.C34461vC.A03(r12, r6)
        L_0x154c:
            r2.A0R(r3)
            if (r13 == 0) goto L_0x1580
            if (r1 == 0) goto L_0x1580
            com.whatsapp.jid.GroupJid r0 = r1.A02
            X.1fJ r6 = X.AnonymousClass34R.A03(r0)
            X.C626936e.A06(r6)
            r2.A0R(r6)
            X.3ZH r1 = r12.A0A(r6)
            boolean r0 = r1.A0s
            if (r0 == r8) goto L_0x156c
            r1.A0s = r8
            X.C34461vC.A03(r12, r1)
        L_0x156c:
            X.3Oz r1 = r2.A0k
            X.2sd r0 = r2.A17
            r16 = 17
            r19 = 0
            r12 = r0
            r13 = r6
            r15 = r14
            r17 = r26
            X.1p1 r0 = r12.A07(r13, r14, r15, r16, r17, r19)
            r1.BEz(r0, r5)
        L_0x1580:
            X.4FS r1 = r9.A0N
            r0 = 27
            X.C70323aJ.A00(r1, r9, r7, r3, r0)
            X.C70323aJ.A00(r1, r9, r11, r3, r0)
            java.util.Iterator r11 = r7.iterator()
        L_0x158e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x1b58
            X.2mC r0 = X.AnonymousClass0x7.A0O(r11)
            X.3Oz r7 = r2.A0k
            com.whatsapp.jid.GroupJid r0 = r0.A02
            X.1fJ r1 = X.AnonymousClass34R.A03(r0)
            java.lang.String r0 = r4.A0D(r3)
            X.2lq r9 = new X.2lq
            r9.<init>(r3, r0, r8)
            X.2sd r0 = r2.A17
            X.2z0 r6 = X.C56832sd.A01(r1, r0, r8)
            X.1or r5 = new X.1or
            r0 = r26
            r5.<init>(r6, r0)
            com.whatsapp.jid.GroupJid r1 = r9.A01
            java.lang.String r0 = r9.A02
            X.C30341mI.A00(r1, r5, r0)
            r0 = 3010(0xbc2, float:4.218E-42)
            r7.BEz(r5, r0)
            goto L_0x158e
        L_0x15c3:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x15c8 }
            goto L_0x15cc
        L_0x15c8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x15cd }
        L_0x15cc:
            throw r1     // Catch:{ all -> 0x15cd }
        L_0x15cd:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x15d2 }
            throw r1
        L_0x15d2:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x15d7:
            java.lang.String r12 = "subject"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r12)
            if (r13 == 0) goto L_0x176c
            java.lang.String r6 = r5.A0r(r12, r3)
            java.lang.String r0 = "s_t"
            long r0 = X.AnonymousClass36K.A04(r5, r0)
            java.lang.Class<com.whatsapp.jid.UserJid> r9 = com.whatsapp.jid.UserJid.class
            java.lang.String r2 = "s_o"
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass36K.A0A(r5, r9, r2)
            boolean r9 = X.C627336j.A0L(r2)
            if (r9 == 0) goto L_0x1611
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r12 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r9 = "s_o_pn"
            com.whatsapp.jid.Jid r12 = r5.A0g(r12, r9)
            com.whatsapp.jid.PhoneUserJid r12 = (com.whatsapp.jid.PhoneUserJid) r12
            if (r12 == 0) goto L_0x1611
            X.3Lq r5 = r4.A0B
            r9 = r2
            X.1fH r9 = (X.C27981fH) r9
            X.2mQ r5 = r5.A13
            r5.A00(r9, r12)
        L_0x1611:
            X.1fJ r9 = X.AnonymousClass34R.A00(r25)
            X.2oV r14 = r4.A09
            X.2gc r12 = r14.A00
            java.util.Map r15 = r12.A02
            monitor-enter(r15)
            java.lang.Object r5 = r15.get(r9)     // Catch:{ all -> 0x1769 }
            X.2Nk r5 = (X.C42262Nk) r5     // Catch:{ all -> 0x1769 }
            if (r5 != 0) goto L_0x1628
            X.2Nk r5 = r12.A00(r9)     // Catch:{ all -> 0x1769 }
        L_0x1628:
            long r12 = r5.A01     // Catch:{ all -> 0x1769 }
            monitor-exit(r15)     // Catch:{ all -> 0x1769 }
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x286b
            X.3Lq r5 = r4.A0B
            long r16 = r16 * r0
            X.1fJ r4 = X.AnonymousClass34R.A00(r25)
            X.2ss r12 = r5.A0S
            int r13 = r12.A07(r4)
            r15 = 0
            r12 = 1
            if (r13 == r11) goto L_0x1645
            r12 = 0
            if (r13 != r8) goto L_0x1645
            r15 = 1
        L_0x1645:
            r18 = 0
            if (r12 == 0) goto L_0x164f
            X.2so r3 = r5.A0A
            X.1fJ r3 = r3.A01(r4)
        L_0x164f:
            X.3Ex r11 = r5.A0F
            X.3ZH r13 = r11.A09(r4)
            if (r13 == 0) goto L_0x16e9
            X.5ZU r7 = r5.A0H
            java.lang.String r7 = r7.A0H(r13)
            boolean r13 = r7.equals(r6)
            if (r13 != 0) goto L_0x16e3
            r5.A0U(r4, r3, r6, r12)
            java.lang.String r13 = "groupmgr/onGroupNewSubject/changed"
            com.whatsapp.util.Log.i((java.lang.String) r13)
            X.3ZH r13 = r11.A0A(r4)
            r13.A0P = r6
            X.C34461vC.A03(r11, r13)
            if (r15 == 0) goto L_0x1686
            X.3Wi r3 = r5.A05
            r2 = 24
            X.C69263Wi.A04(r3, r5, r4, r2)
        L_0x167d:
            X.33S r2 = r5.A11
            r2.A01(r10)
        L_0x1682:
            r14.A03(r9, r0)
            return r8
        L_0x1686:
            r11 = 4
            if (r12 == 0) goto L_0x16c7
            X.1VX r15 = r5.A0j
            r13 = 982(0x3d6, float:1.376E-42)
            X.2vE r12 = X.C58422vE.A02
            boolean r12 = r15.A0Y(r12, r13)
            if (r12 == 0) goto L_0x16c7
            X.3Oz r12 = r5.A0k
            X.2sd r5 = r5.A17
            X.2z0 r15 = X.C56832sd.A01(r4, r5, r8)
            X.1ou r13 = new X.1ou
            r4 = r16
            r13.<init>(r15, r4)
            r13.A04 = r10
            r13.A20(r3, r6)
            if (r3 == 0) goto L_0x16c0
            java.util.List r4 = r13.A1z(r11)
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x16bb
            java.lang.String r5 = "FMessageSystemParentGroupNameChanged/setOldParentInfo/old parent info should only be set once"
            r4 = 0
            X.C626936e.A0D(r4, r5)
        L_0x16bb:
            java.util.List r4 = r13.A00
            X.C52662lq.A01(r3, r7, r4, r11)
        L_0x16c0:
            r13.A1J(r2)
            r12.BEz(r13, r11)
            goto L_0x1682
        L_0x16c7:
            X.3Oz r12 = r5.A0k
            X.2sd r3 = r5.A17
            r19 = r3
            r20 = r18
            r21 = r4
            r22 = r10
            r23 = r8
            r24 = r16
            X.1p1 r13 = r19.A06(r20, r21, r22, r23, r24)
            X.1oZ r13 = (X.C31611oZ) r13
            r13.A1y(r6)
            r13.A01 = r7
            goto L_0x16c0
        L_0x16e3:
            java.lang.String r2 = "groupmgr/onGroupNewSubject/did not change"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            goto L_0x167d
        L_0x16e9:
            r5.A0U(r4, r3, r6, r12)
            java.lang.String r3 = "groupmgr/onGroupNewSubject/new group"
            com.whatsapp.util.Log.i((java.lang.String) r3)
            X.2pW r3 = r5.A0r
            int r3 = r3.A00(r4)
            X.33k r12 = new X.33k
            r12.<init>(r4, r3)
            X.3ZH r3 = new X.3ZH
            r3.<init>(r4)
            X.2zN r22 = X.C60912zN.A05
            java.lang.String r24 = "pn"
            r26 = r7
            r29 = r7
            r30 = r7
            r31 = r7
            r32 = r7
            r33 = r7
            r34 = r7
            r35 = r7
            r36 = r7
            r37 = r7
            r38 = r7
            r39 = r7
            r23 = r6
            r25 = r7
            r27 = r16
            r19 = r11
            r20 = r3
            r21 = r18
            r19.A0T(r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            X.2ba r3 = r5.A0a
            X.C626936e.A06(r4)
            X.C162457s7.A0J(r4, r7)
            java.util.Map r3 = r3.A04
            r3.put(r4, r12)
            if (r15 != 0) goto L_0x1763
            X.3Oz r7 = r5.A0k
            X.2sd r3 = r5.A17
            r23 = 11
            r19 = r3
            r20 = r18
            r21 = r4
            r22 = r10
            r24 = r16
            X.1p1 r3 = r19.A06(r20, r21, r22, r23, r24)
            r3.A1Z(r6)
            r3.A1J(r2)
            r7.BEz(r3, r8)
        L_0x1759:
            X.3Lr r5 = r5.A0t
            r3 = 2
            r2 = r18
            r5.A0E(r4, r2, r3)
            goto L_0x1682
        L_0x1763:
            X.33S r2 = r5.A11
            r2.A01(r10)
            goto L_0x1759
        L_0x1769:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x1769 }
            throw r0
        L_0x176c:
            java.lang.String r13 = "invite"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r13)
            if (r13 == 0) goto L_0x17c4
            java.lang.String r0 = "code"
            java.lang.String r6 = r5.A0r(r0, r3)
            X.3Lq r5 = r4.A0B
            X.4uZ r0 = X.C627336j.A02(r25)
            X.C626936e.A06(r0)
            X.1fJ r1 = X.AnonymousClass34R.A03(r0)
            if (r1 == 0) goto L_0x17be
            java.util.Map r0 = r5.A1F
            r0.put(r1, r6)
            X.2Kq r2 = new X.2Kq
            r2.<init>(r1, r6)
            r1 = 6
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r2, r1)
            X.3Oz r4 = r5.A0k
            X.2sd r2 = r5.A17
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SystemMessageFactory/newInviteLinkRevokedMessage/stanzaKey="
            X.C18260x0.A1R(r1, r0, r10)
            r15 = 21
            r13 = r3
            r11 = r2
            r12 = r3
            r14 = r10
            r16 = r26
            X.1p1 r1 = r11.A06(r12, r13, r14, r15, r16)
            com.whatsapp.jid.UserJid r0 = r10.A00()
            r1.A1J(r0)
            r0 = 2
            r4.BEz(r1, r0)
            return r8
        L_0x17be:
            java.lang.String r0 = "GroupChatManager/onGroupNewInviteCode received invite code for non-permanent group jid"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r8
        L_0x17c4:
            java.lang.String r14 = "description"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r14)
            if (r13 == 0) goto L_0x193b
            X.2zN r9 = X.AnonymousClass36J.A05(r2, r2)
            com.whatsapp.jid.UserJid r0 = r9.A02
            r20 = r0
            boolean r0 = X.C627336j.A0L(r20)
            if (r0 == 0) goto L_0x17e9
            com.whatsapp.jid.PhoneUserJid r2 = r9.A01
            if (r2 == 0) goto L_0x17e9
            X.3Lq r0 = r4.A0B
            r1 = r20
            X.1fH r1 = (X.C27981fH) r1
            X.2mQ r0 = r0.A13
            r0.A00(r1, r2)
        L_0x17e9:
            X.3Lq r4 = r4.A0B
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/onGroupNewDescription/"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "/"
            X.C18260x0.A1R(r1, r0, r9)
            X.1fJ r6 = X.AnonymousClass34R.A00(r25)
            X.2ss r0 = r4.A0S
            int r2 = r0.A06(r6)
            X.3Ex r1 = r4.A0F
            X.3ZH r0 = r1.A09(r6)
            if (r2 != r8) goto L_0x18c4
            if (r0 == 0) goto L_0x1d7a
            X.2zN r0 = r0.A0K
            if (r0 == 0) goto L_0x1d7a
            java.lang.String r0 = r0.A03
            java.lang.String r11 = r9.A03
            boolean r0 = android.text.TextUtils.equals(r0, r11)
            if (r0 != 0) goto L_0x18c0
            java.lang.String r0 = "groupmgr/onParentGroupNewDescription/changed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3ZH r0 = r1.A0A(r6)
            r0.A0O(r9)
            X.C34461vC.A03(r1, r0)
            X.1fJ r13 = r4.A06(r6)
            if (r13 == 0) goto L_0x18b9
            X.2rV r0 = r4.A0d
            X.34x r7 = r0.A00(r6)
            X.34x r5 = r0.A00(r13)
            if (r5 == 0) goto L_0x211d
            if (r7 == 0) goto L_0x211d
            boolean r0 = r5 instanceof X.C30341mI
            if (r0 == 0) goto L_0x211d
            r12 = r5
            X.1mI r12 = (X.C30341mI) r12
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r9.A00
            long r0 = r0.toMillis(r2)
            long r14 = r12.A0K
            boolean r19 = X.C107175ap.A05(r14, r0)
            long r14 = r12.A0K
            long r0 = r0 - r14
            long r17 = java.lang.Math.abs(r0)
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MINUTES
            r0 = 15
            long r14 = r14.toMillis(r0)
            r16 = 1
            int r0 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            boolean r15 = X.AnonymousClass0x7.A1P(r0)
            boolean r0 = X.C624134x.A0a(r12)
            if (r0 != 0) goto L_0x187a
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r14 = 1
            if (r0 == 0) goto L_0x187b
        L_0x187a:
            r14 = 0
        L_0x187b:
            int r1 = r12.A00
            r0 = 131(0x83, float:1.84E-43)
            if (r1 != r0) goto L_0x18bd
            X.4uZ r1 = r12.A0n()
            if (r1 == 0) goto L_0x18bd
            r0 = r20
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x18bd
        L_0x188f:
            if (r19 == 0) goto L_0x211d
            if (r15 == 0) goto L_0x211d
            if (r14 == 0) goto L_0x211d
            if (r16 == 0) goto L_0x211d
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r6.toMillis(r2)
            r7.A0K = r0
            r7.A1Z(r11)
            long r0 = r6.toMillis(r2)
            r5.A0K = r0
            r5.A1Z(r11)
            X.3Oz r1 = r4.A0k
            r0 = 3016(0xbc8, float:4.226E-42)
            r1.BEz(r7, r0)
        L_0x18b2:
            r1 = 3015(0xbc7, float:4.225E-42)
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r5, r1)
        L_0x18b9:
            X.33S r0 = r4.A11
            goto L_0x2876
        L_0x18bd:
            r16 = 0
            goto L_0x188f
        L_0x18c0:
            java.lang.String r0 = "groupmgr/onParentGroupNewDescription/did not change"
            goto L_0x1d75
        L_0x18c4:
            if (r0 == 0) goto L_0x213d
            X.2zN r0 = r0.A0K
            java.lang.String r0 = r0.A03
            java.lang.String r12 = r9.A03
            boolean r0 = android.text.TextUtils.equals(r0, r12)
            if (r0 != 0) goto L_0x1d73
            java.lang.String r0 = "groupmgr/onGroupNewDescription/changed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3ZH r0 = r1.A0A(r6)
            r0.A0O(r9)
            X.C34461vC.A03(r1, r0)
            X.2rV r0 = r4.A0d
            X.34x r5 = r0.A00(r6)
            boolean r0 = r5 instanceof X.C30341mI
            if (r0 == 0) goto L_0x1d7e
            r11 = r5
            X.1mI r11 = (X.C30341mI) r11
            long r0 = r11.A0K
            long r2 = r9.A00
            long r2 = r2 * r16
            boolean r17 = X.C107175ap.A05(r0, r2)
            long r0 = r11.A0K
            long r13 = r2 - r0
            long r15 = java.lang.Math.abs(r13)
            r13 = 90000(0x15f90, double:4.4466E-319)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            boolean r14 = X.AnonymousClass0x7.A1P(r0)
            boolean r0 = X.C624134x.A0a(r11)
            if (r0 != 0) goto L_0x1916
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r13 = 1
            if (r0 == 0) goto L_0x1917
        L_0x1916:
            r13 = 0
        L_0x1917:
            int r1 = r11.A00
            r0 = 27
            if (r1 != r0) goto L_0x192c
            X.4uZ r1 = r11.A0n()
            if (r1 == 0) goto L_0x192c
            r0 = r20
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x192d
        L_0x192c:
            r0 = 0
        L_0x192d:
            if (r17 == 0) goto L_0x1d7e
            if (r14 == 0) goto L_0x1d7e
            if (r13 == 0) goto L_0x1d7e
            if (r0 == 0) goto L_0x1d7e
            r5.A0K = r2
            r5.A0y = r12
            goto L_0x18b2
        L_0x193b:
            java.lang.String r13 = "auto_add_disabled"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r13)
            if (r13 == 0) goto L_0x1963
            X.3Lq r7 = r4.A0B
            X.1fJ r6 = X.AnonymousClass34R.A00(r25)
            X.3Ex r2 = r7.A0F
            X.3ZH r0 = r2.A09(r6)
            if (r0 != 0) goto L_0x1958
            java.lang.String r0 = "groupmgr/onGroupAutoAddDisabled/new group"
        L_0x1953:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x2874
        L_0x1958:
            X.2sj r0 = r7.A0b
            boolean r0 = r0.A0C(r6)
            if (r0 != 0) goto L_0x1d8c
            java.lang.String r0 = "groupmgr/onGroupAutoAddDisabled/not participant"
            goto L_0x1953
        L_0x1963:
            java.lang.String r13 = "locked"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r13)
            if (r13 == 0) goto L_0x19db
            X.3Lq r4 = r4.A0B
            java.lang.String r0 = "threshold"
            int r7 = r5.A0b(r0, r7)
            r5 = 1
        L_0x1975:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/onGroupRestrictModeToggled/"
            X.AnonymousClass0x7.A1F(r1, r0, r10)
            r1.append(r5)
            java.lang.String r0 = "/isServerTriggered"
            r1.append(r0)
            boolean r0 = X.AnonymousClass001.A1W(r7)
            X.C18260x0.A1V(r1, r0)
            X.1fJ r2 = X.AnonymousClass34R.A00(r25)
            X.3Ex r9 = r4.A0F
            X.3ZH r0 = r9.A09(r2)
            if (r0 == 0) goto L_0x1d70
            boolean r0 = r0.A14
            if (r0 == r5) goto L_0x1d6d
            java.lang.String r0 = "groupmgr/onGroupRestrictModeToggled/changed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3ZH r1 = r9.A0A(r2)
            boolean r0 = r1.A14
            if (r0 == r5) goto L_0x19af
            r1.A14 = r5
            X.C34461vC.A03(r9, r1)
        L_0x19af:
            X.2sd r0 = r4.A17
            if (r7 <= 0) goto L_0x19c7
            X.2z0 r3 = X.C56832sd.A01(r2, r0, r8)
            X.1oS r2 = new X.1oS
            r0 = r26
            r2.<init>(r3, r7, r0)
        L_0x19be:
            r1 = 3008(0xbc0, float:4.215E-42)
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r2, r1)
            goto L_0x18b9
        L_0x19c7:
            r15 = 30
            if (r5 == 0) goto L_0x19cd
            r15 = 29
        L_0x19cd:
            r11 = r0
            r12 = r3
            r13 = r2
            r14 = r10
            r16 = r26
            X.1p1 r2 = r11.A06(r12, r13, r14, r15, r16)
            r2.A1J(r6)
            goto L_0x19be
        L_0x19db:
            java.lang.String r13 = "unlocked"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r13)
            if (r13 == 0) goto L_0x19e8
            X.3Lq r4 = r4.A0B
            r5 = 0
            goto L_0x1975
        L_0x19e8:
            java.lang.String r13 = "announcement"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r13)
            if (r13 == 0) goto L_0x19f4
            r9 = 1
        L_0x19f1:
            monitor-enter(r4)
            goto L_0x1dbe
        L_0x19f4:
            java.lang.String r13 = "not_announcement"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r13)
            if (r13 == 0) goto L_0x19ff
            r9 = 0
            goto L_0x19f1
        L_0x19ff:
            java.lang.String r13 = "no_frequently_forwarded"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r13)
            if (r13 == 0) goto L_0x1a5b
            X.3Lq r7 = r4.A0B
            r5 = 1
        L_0x1a0b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/onGroupNoFrequentlyForwardedToggled/"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "/"
            X.C18260x0.A1E(r0, r1, r5)
            X.1fJ r4 = X.AnonymousClass34R.A00(r25)
            X.3Ex r2 = r7.A0F
            X.3ZH r0 = r2.A09(r4)
            if (r0 == 0) goto L_0x1eaa
            boolean r0 = r0.A12
            if (r0 == r5) goto L_0x1ea1
            java.lang.String r0 = "groupmgr/onGroupAnnouncementsToggled/changed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3ZH r1 = r2.A0A(r4)
            boolean r0 = r1.A12
            if (r0 == r5) goto L_0x1a3e
            r1.A12 = r5
            X.C34461vC.A03(r2, r1)
        L_0x1a3e:
            X.2sd r0 = r7.A17
            r15 = 54
            if (r5 == 0) goto L_0x1a46
            r15 = 53
        L_0x1a46:
            r11 = r0
            r12 = r3
            r13 = r4
            r14 = r10
            r16 = r26
            X.1p1 r2 = r11.A06(r12, r13, r14, r15, r16)
            r2.A1J(r6)
            r1 = 3016(0xbc8, float:4.226E-42)
        L_0x1a55:
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r2, r1)
            return r8
        L_0x1a5b:
            java.lang.String r13 = "frequently_forwarded_ok"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r13)
            if (r13 == 0) goto L_0x1a67
            X.3Lq r7 = r4.A0B
            r5 = 0
            goto L_0x1a0b
        L_0x1a67:
            java.lang.String r13 = "revoke"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r13)
            if (r13 == 0) goto L_0x1ab1
            java.lang.String r2 = "participant"
            java.util.List r2 = r5.A0s(r2)
            java.util.HashMap r5 = X.AnonymousClass001.A0t()
            java.util.HashMap r6 = X.AnonymousClass001.A0t()
            java.util.Iterator r12 = r2.iterator()
        L_0x1a83:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x1eae
            X.36K r11 = X.C18310x6.A0Y(r12)
            com.whatsapp.jid.Jid r7 = X.AnonymousClass36K.A06(r11)
            if (r7 == 0) goto L_0x1a83
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r3 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r2 = "phone_number"
            com.whatsapp.jid.Jid r3 = r11.A0g(r3, r2)
            boolean r2 = X.C627336j.A0L(r7)
            if (r2 == 0) goto L_0x1aa7
            if (r3 == 0) goto L_0x1aa7
            r6.put(r7, r3)
        L_0x1aa7:
            java.lang.String r2 = "expiration"
            long r2 = r11.A0e(r2, r0)
            X.AnonymousClass0x2.A1J(r7, r5, r2)
            goto L_0x1a83
        L_0x1ab1:
            java.lang.String r13 = "not_ephemeral"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r13)
            if (r13 == 0) goto L_0x1b0a
            X.3Lq r4 = r4.A0B
            r5 = 0
        L_0x1abd:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/onGroupEphemeralChanged/"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "/"
            X.C18260x0.A0y(r0, r1, r5)
            if (r5 >= 0) goto L_0x1ad1
            r5 = 0
        L_0x1ad1:
            X.1fJ r3 = X.AnonymousClass34R.A00(r25)
            X.2Kz r0 = r4.A0m
            X.C162457s7.A0J(r3, r7)
            X.3Ex r0 = r0.A00
            X.3ZH r0 = r0.A09(r3)
            if (r0 == 0) goto L_0x1f1b
            int r0 = r0.A02
            if (r0 == r5) goto L_0x1f18
            java.lang.String r0 = "groupmgr/onGroupEphemeralChanged/changed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Ex r2 = r4.A0F
            X.3ZH r1 = r2.A0A(r3)
            int r0 = r1.A02
            if (r0 == r5) goto L_0x1afa
            r1.A02 = r5
            X.C34461vC.A03(r2, r1)
        L_0x1afa:
            X.2sd r0 = r4.A17
            r1 = r3
            r2 = r6
            r3 = r10
            r4 = r5
            r5 = r26
            X.1mI r2 = r0.A03(r1, r2, r3, r4, r5)
            r1 = 3017(0xbc9, float:4.228E-42)
            goto L_0x1a55
        L_0x1b0a:
            java.lang.String r13 = "ephemeral"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r13)
            if (r13 == 0) goto L_0x1b1b
            java.lang.String r0 = "expiration"
            int r5 = X.AnonymousClass36K.A02(r5, r0)
            X.3Lq r4 = r4.A0B
            goto L_0x1abd
        L_0x1b1b:
            java.lang.String r13 = "expire"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r13)
            if (r13 == 0) goto L_0x1b62
            java.lang.String r2 = "timestamp"
            long r0 = r5.A0e(r2, r0)
            X.3Lq r2 = r4.A0B
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "groupmgr/onGroupExpirationChanged/"
            r4.append(r3)
            r4.append(r10)
            java.lang.String r3 = "/"
            X.C18260x0.A12(r3, r4, r0)
            r5 = 0
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x1b45
            r0 = 0
        L_0x1b45:
            X.4uZ r3 = X.C627336j.A02(r25)
            X.1fJ r4 = X.AnonymousClass34R.A03(r3)
            if (r4 == 0) goto L_0x1b58
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x1b5c
            X.33p r0 = r2.A0O
            r0.A1J(r4)
        L_0x1b58:
            X.33S r0 = r2.A11
            goto L_0x2876
        L_0x1b5c:
            X.33p r3 = r2.A0O
            r3.A1K(r4, r0)
            goto L_0x1b58
        L_0x1b62:
            java.lang.String r13 = "suspended"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r13)
            if (r13 == 0) goto L_0x1b71
            X.3Lq r0 = r4.A0B
            r0.A0b(r10, r8)
            return r8
        L_0x1b71:
            java.lang.String r13 = "unsuspended"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r13)
            if (r13 == 0) goto L_0x1b80
            X.3Lq r0 = r4.A0B
            r0.A0b(r10, r7)
            return r8
        L_0x1b80:
            java.lang.String r13 = "link"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r13)
            if (r13 == 0) goto L_0x1bbf
            X.1fJ r1 = X.AnonymousClass34R.A00(r25)
            java.lang.String r0 = "link_type"
            java.lang.String r2 = r5.A0r(r0, r3)
            java.lang.String r0 = "sub_group"
            boolean r0 = r0.equals(r2)
            r9 = 2
            if (r0 == 0) goto L_0x1c16
            java.util.Set r5 = A00(r5, r9)
            X.3Lq r4 = r4.A0B
            X.2sd r0 = r4.A17
            X.2z0 r2 = X.C56832sd.A01(r1, r0, r8)
            X.1om r3 = new X.1om
            r0 = r26
            r3.<init>(r2, r0)
        L_0x1baf:
            r3.A04 = r10
            r3.A1J(r6)
            r3.A21(r5)
            X.3Oz r1 = r4.A0k
            r0 = 3010(0xbc2, float:4.218E-42)
            r1.BEz(r3, r0)
            return r8
        L_0x1bbf:
            java.lang.String r13 = "unlink"
            boolean r13 = X.AnonymousClass36K.A0W(r5, r13)
            if (r13 == 0) goto L_0x1c79
            X.1fJ r12 = X.AnonymousClass34R.A00(r25)
            java.lang.String r0 = "unlink_type"
            java.lang.String r2 = r5.A0r(r0, r3)
            java.lang.String r0 = "unlink_reason"
            java.lang.String r1 = r5.A0r(r0, r3)
            java.lang.String r0 = "unlink_group"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x1c02
            r9 = 1
        L_0x1be4:
            java.lang.String r0 = "sub_group"
            boolean r1 = r0.equals(r2)
            r0 = 2
            if (r1 == 0) goto L_0x1f7d
            java.util.Set r5 = A00(r5, r0)
            X.3Lq r4 = r4.A0B
            X.2sd r0 = r4.A17
            X.2z0 r2 = X.C56832sd.A01(r12, r0, r8)
            X.1on r3 = new X.1on
            r0 = r26
            r3.<init>(r2, r0)
            goto L_0x1baf
        L_0x1c02:
            java.lang.String r0 = "delete_parent"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x1c0c
            r9 = 2
            goto L_0x1be4
        L_0x1c0c:
            java.lang.String r0 = "integrity_delete_parent"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x1be4
            r9 = 0
            goto L_0x1be4
        L_0x1c16:
            java.lang.String r0 = "parent_group"
            boolean r0 = r0.equals(r2)
            r19 = 1
            if (r0 == 0) goto L_0x1f24
            java.util.Set r5 = A00(r5, r8)
            X.3Lq r2 = r4.A0B
            int r0 = r5.size()
            if (r0 != r8) goto L_0x1b58
            java.util.List r0 = java.util.Collections.singletonList(r1)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r4 = r0.iterator()
        L_0x1c39:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x1c53
            java.lang.Object r1 = r4.next()
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            X.2ss r0 = r2.A0S
            java.lang.String r0 = r0.A0D(r1)
            if (r0 != 0) goto L_0x1c4f
            java.lang.String r0 = ""
        L_0x1c4f:
            X.C52882mC.A00(r1, r0, r3)
            goto L_0x1c39
        L_0x1c53:
            int r0 = r3.size()
            if (r0 != r8) goto L_0x1b58
            java.util.Iterator r0 = r5.iterator()
            X.2mC r13 = X.AnonymousClass0x7.A0O(r0)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r7)
            java.lang.Object r0 = r3.get(r7)
            X.2mC r0 = (X.C52882mC) r0
            r20 = r7
            r11 = r2
            r12 = r0
            r14 = r6
            r15 = r10
            r17 = r26
            r19 = r7
            r11.A0H(r12, r13, r14, r15, r16, r17, r19, r20)
            return r8
        L_0x1c79:
            java.lang.String r9 = "growth_locked"
            boolean r9 = X.AnonymousClass36K.A0W(r5, r9)
            if (r9 == 0) goto L_0x1c9a
            X.36J r0 = X.AnonymousClass36J.A00
            X.2fO r5 = r0.A0B(r2)
            if (r5 == 0) goto L_0x1c96
            X.3Lq r3 = r4.A0B
            X.1fJ r2 = X.AnonymousClass34R.A00(r25)
            r0 = r26
            r3.A0X(r2, r5, r0)
            goto L_0x2874
        L_0x1c96:
            java.lang.String r0 = "GroupNotificationHandler/handleAnnouncement/null growth lock, ignoring"
            goto L_0x1953
        L_0x1c9a:
            java.lang.String r9 = "growth_unlocked"
            boolean r9 = X.AnonymousClass36K.A0W(r5, r9)
            if (r9 == 0) goto L_0x1cb4
            X.3Lq r5 = r4.A0B
            X.1fJ r3 = X.AnonymousClass34R.A00(r25)
            X.2fO r2 = new X.2fO
            r2.<init>(r7, r0)
            r0 = r26
            r5.A0X(r3, r2, r0)
            goto L_0x2874
        L_0x1cb4:
            java.lang.String r0 = "membership_approval_mode"
            boolean r0 = X.AnonymousClass36K.A0W(r5, r0)
            if (r0 == 0) goto L_0x1d61
            X.1fJ r9 = X.AnonymousClass34R.A00(r25)
            java.lang.String r0 = "group_join"
            java.util.List r2 = r5.A0s(r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x2874
            int r1 = r2.size()
            r0 = 1
            if (r1 == r8) goto L_0x1cd4
            r0 = 0
        L_0x1cd4:
            X.C626936e.A0C(r0)
            java.lang.Object r1 = r2.get(r7)
            X.36K r1 = (X.AnonymousClass36K) r1
            java.lang.String r0 = "state"
            java.lang.String r2 = r1.A0q(r0)
            java.lang.String r0 = "triggered"
            java.lang.String r1 = r5.A0r(r0, r3)
            java.lang.String r0 = "server"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x1cf5
            r6 = 0
        L_0x1cf5:
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x1d55
            X.3Lq r11 = r4.A0B
            r7 = 1
        L_0x1d01:
            X.2sj r0 = r11.A0b
            boolean r0 = r0.A0D(r9)
            if (r0 == 0) goto L_0x1d51
            java.lang.String r5 = "admin"
        L_0x1d0b:
            X.3Ex r2 = r11.A0F
            X.3ZH r1 = r2.A0A(r9)
            boolean r0 = r1.A13
            if (r0 == r7) goto L_0x1d1a
            r1.A13 = r7
            X.C34461vC.A03(r2, r1)
        L_0x1d1a:
            if (r7 != 0) goto L_0x1d26
            X.2oj r0 = r11.A0X
            r0.A01(r9)
            X.2lN r0 = r11.A0g
            r0.A00(r9)
        L_0x1d26:
            X.2sd r2 = r11.A17
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SystemMessageFactory/newGroupMembershipApprovalModeChangeSystemMessage/gjid="
            X.C18260x0.A1R(r1, r0, r9)
            r15 = 85
            if (r7 == 0) goto L_0x1d37
            r15 = 84
        L_0x1d37:
            r14 = r3
            r11 = r2
            r12 = r3
            r13 = r9
            r16 = r26
            X.1p1 r2 = r11.A06(r12, r13, r14, r15, r16)
            X.1oT r2 = (X.C31551oT) r2
            r2.A1J(r6)
            r2.A00 = r5
            r1 = 3021(0xbcd, float:4.233E-42)
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r2, r1)
            goto L_0x2874
        L_0x1d51:
            java.lang.String r5 = "regular"
            goto L_0x1d0b
        L_0x1d55:
            java.lang.String r0 = "off"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x205b
            X.3Lq r11 = r4.A0B
            goto L_0x1d01
        L_0x1d61:
            java.lang.String r0 = "membership_approval_request"
            boolean r0 = X.AnonymousClass36K.A0W(r5, r0)
            if (r0 == 0) goto L_0x2066
            java.lang.String r0 = "GroupNotificationHandler/handleGroupMembershipApprovalRequest/this client will process newer notification format in handleCreatedGroupMembershipApprovalRequests , ignoring"
            goto L_0x1953
        L_0x1d6d:
            java.lang.String r0 = "groupmgr/onGroupRestrictModeToggled/did not change"
            goto L_0x1d75
        L_0x1d70:
            java.lang.String r0 = "groupmgr/onGroupRestrictModeToggled/new group"
            goto L_0x1d75
        L_0x1d73:
            java.lang.String r0 = "groupmgr/onGroupNewSubject/did not change"
        L_0x1d75:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x18b9
        L_0x1d7a:
            java.lang.String r0 = "groupmgr/onParentGroupNewDescription/new community"
            goto L_0x213f
        L_0x1d7e:
            X.2sd r0 = r4.A17
            X.1mI r2 = r0.A04(r6, r9, r10, r7)
            r1 = 3006(0xbbe, float:4.212E-42)
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r2, r1)
            return r8
        L_0x1d8c:
            X.3ZH r1 = r2.A0A(r6)
            boolean r0 = r1.A0f
            if (r0 == r8) goto L_0x1d99
            r1.A0f = r8
            X.C34461vC.A03(r2, r1)
        L_0x1d99:
            X.2ss r0 = r7.A0S
            java.lang.String r5 = r0.A0D(r6)
            boolean r0 = r0.A0R(r6)
            if (r0 == 0) goto L_0x2874
            X.3Oz r2 = r7.A0k
            X.2sd r0 = r7.A17
            r15 = 152(0x98, float:2.13E-43)
            r14 = r3
            r11 = r0
            r12 = r3
            r13 = r6
            r16 = r26
            X.1p1 r1 = r11.A06(r12, r13, r14, r15, r16)
            r1.A1Z(r5)
            r0 = 2
            r2.BEz(r1, r0)
            goto L_0x2874
        L_0x1dbe:
            X.1fJ r7 = X.AnonymousClass34R.A00(r25)     // Catch:{ all -> 0x285d }
            java.lang.String r2 = "v_id"
            long r0 = r5.A0e(r2, r0)     // Catch:{ all -> 0x285d }
            X.2oV r5 = r4.A09     // Catch:{ all -> 0x285d }
            X.2gc r12 = r5.A00     // Catch:{ all -> 0x285d }
            java.util.Map r2 = r12.A02     // Catch:{ all -> 0x285d }
            monitor-enter(r2)     // Catch:{ all -> 0x285d }
            java.lang.Object r11 = r2.get(r7)     // Catch:{ all -> 0x1e9e }
            X.2Nk r11 = (X.C42262Nk) r11     // Catch:{ all -> 0x1e9e }
            if (r11 != 0) goto L_0x1ddc
            X.2Nk r11 = r12.A00(r7)     // Catch:{ all -> 0x1e9e }
        L_0x1ddc:
            long r11 = r11.A00     // Catch:{ all -> 0x1e9e }
            monitor-exit(r2)     // Catch:{ all -> 0x1e9e }
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x1e86
            X.3Lq r12 = r4.A0B     // Catch:{ all -> 0x285d }
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x285d }
            java.lang.String r2 = "groupmgr/onGroupAnnouncementsToggled/"
            r11.append(r2)     // Catch:{ all -> 0x285d }
            r11.append(r10)     // Catch:{ all -> 0x285d }
            java.lang.String r2 = "/"
            X.C18260x0.A1E(r2, r11, r9)     // Catch:{ all -> 0x285d }
            X.1fJ r13 = X.AnonymousClass34R.A00(r25)     // Catch:{ all -> 0x285d }
            X.3Ex r14 = r12.A0F     // Catch:{ all -> 0x285d }
            X.3ZH r2 = r14.A09(r13)     // Catch:{ all -> 0x285d }
            if (r2 == 0) goto L_0x1e71
            boolean r2 = r2.A0e     // Catch:{ all -> 0x285d }
            if (r2 == r9) goto L_0x1e77
            java.lang.String r2 = "groupmgr/onGroupAnnouncementsToggled/changed"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x285d }
            X.3ZH r11 = r14.A0A(r13)     // Catch:{ all -> 0x285d }
            boolean r2 = r11.A0e     // Catch:{ all -> 0x285d }
            if (r2 == r9) goto L_0x1e18
            r11.A0e = r9     // Catch:{ all -> 0x285d }
            X.C34461vC.A03(r14, r11)     // Catch:{ all -> 0x285d }
        L_0x1e18:
            X.3Oz r11 = r12.A0k     // Catch:{ all -> 0x285d }
            X.2sd r2 = r12.A17     // Catch:{ all -> 0x285d }
            r18 = 32
            if (r9 == 0) goto L_0x1e22
            r18 = 31
        L_0x1e22:
            r14 = r2
            r15 = r3
            r16 = r13
            r17 = r10
            r19 = r26
            X.1p1 r3 = r14.A06(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x285d }
            r3.A1J(r6)     // Catch:{ all -> 0x285d }
            r2 = 3009(0xbc1, float:4.217E-42)
            r11.BEz(r3, r2)     // Catch:{ all -> 0x285d }
            if (r9 != 0) goto L_0x1e81
            X.2sj r2 = r12.A0b     // Catch:{ all -> 0x285d }
            X.33h r2 = r2.A09     // Catch:{ all -> 0x285d }
            int r10 = r2.A03(r13)     // Catch:{ all -> 0x285d }
            X.2ss r2 = r12.A0S     // Catch:{ all -> 0x285d }
            int r9 = r2.A06(r13)     // Catch:{ all -> 0x285d }
            X.1VX r6 = r12.A0j     // Catch:{ all -> 0x285d }
            r2 = 934(0x3a6, float:1.309E-42)
            X.2vE r3 = X.C58422vE.A02     // Catch:{ all -> 0x285d }
            int r2 = r6.A0O(r3, r2)     // Catch:{ all -> 0x285d }
            if (r10 < r2) goto L_0x1e81
            r2 = 1946(0x79a, float:2.727E-42)
            int r2 = r6.A0O(r3, r2)     // Catch:{ all -> 0x285d }
            if (r10 > r2) goto L_0x1e81
            if (r9 == r8) goto L_0x1e81
            X.35J r2 = r12.A16     // Catch:{ all -> 0x285d }
            X.2z0 r9 = r2.A04(r13, r8)     // Catch:{ all -> 0x285d }
            long r2 = X.C56612sH.A07(r12)     // Catch:{ all -> 0x285d }
            X.1mY r6 = new X.1mY     // Catch:{ all -> 0x285d }
            r6.<init>(r9, r2)     // Catch:{ all -> 0x285d }
            X.3Lv r2 = r12.A0U     // Catch:{ all -> 0x285d }
            r2.A0V(r6)     // Catch:{ all -> 0x285d }
            goto L_0x1e81
        L_0x1e71:
            java.lang.String r2 = "groupmgr/onGroupAnnouncementsToggled/new group"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x285d }
            goto L_0x1e81
        L_0x1e77:
            java.lang.String r2 = "groupmgr/onGroupAnnouncementsToggled/did not change"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x285d }
            X.33S r2 = r12.A11     // Catch:{ all -> 0x285d }
            r2.A01(r10)     // Catch:{ all -> 0x285d }
        L_0x1e81:
            r5.A00(r7, r0)     // Catch:{ all -> 0x285d }
            goto L_0x285b
        L_0x1e86:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x285d }
            java.lang.String r2 = "GroupNotificationHandler/handleAnnouncement/old version, gjid="
            r3.append(r2)     // Catch:{ all -> 0x285d }
            r3.append(r7)     // Catch:{ all -> 0x285d }
            java.lang.String r2 = "; version="
            X.C18270x1.A1B(r2, r3, r0)     // Catch:{ all -> 0x285d }
            X.33S r0 = r4.A0F     // Catch:{ all -> 0x285d }
            r0.A01(r10)     // Catch:{ all -> 0x285d }
            goto L_0x285b
        L_0x1e9e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x1e9e }
            throw r0     // Catch:{ all -> 0x285d }
        L_0x1ea1:
            java.lang.String r0 = "groupmgr/onGroupNoFrequentlyForwardedToggled/did not change"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33S r0 = r7.A11
            goto L_0x2876
        L_0x1eaa:
            java.lang.String r0 = "groupmgr/onGroupNoFrequentlyForwardedToggled/new group"
            goto L_0x213f
        L_0x1eae:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x1ebb
            X.3Lq r0 = r4.A0B
            X.2mQ r0 = r0.A13
            r0.A01(r6)
        L_0x1ebb:
            X.3Lq r4 = r4.A0B
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/onGroupInvitesRevoked/"
            X.C18260x0.A1R(r1, r0, r10)
            X.1fJ r15 = X.AnonymousClass34R.A00(r25)
            com.whatsapp.jid.UserJid r3 = r10.A00()
            X.C626936e.A06(r3)
            X.2sr r1 = r4.A06
            boolean r0 = r1.A0a(r3)
            if (r0 == 0) goto L_0x1eed
            X.2c1 r1 = r4.A0W
            X.4FS r2 = r1.A05
            r16 = 43
            X.3cM r0 = new X.3cM
            r11 = r0
            r12 = r1
            r13 = r5
            r14 = r15
            r15 = r10
            r11.<init>((java.lang.Object) r12, (java.lang.Object) r13, (java.lang.Object) r14, (java.lang.Object) r15, (int) r16)
        L_0x1ee9:
            r2.BkM(r0)
            return r8
        L_0x1eed:
            com.whatsapp.jid.PhoneUserJid r2 = X.C56972sr.A04(r1)
            boolean r0 = r5.containsKey(r2)
            if (r0 == 0) goto L_0x1f0f
            X.2c1 r1 = r4.A0W
            java.lang.Object r0 = X.C18290x4.A0i(r2, r5)
            long r17 = X.C18310x6.A0B(r0)
            X.4FS r2 = r1.A05
            X.3am r0 = new X.3am
            r11 = r0
            r12 = r3
            r13 = r1
            r14 = r10
            r16 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17)
            goto L_0x1ee9
        L_0x1f0f:
            java.lang.String r0 = "GroupChatManager/onGroupInvitesRevoked invalid notification received"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.33S r0 = r4.A11
            goto L_0x2876
        L_0x1f18:
            java.lang.String r0 = "groupmgr/onGroupEphemeralChanged/did not change"
            goto L_0x1f1d
        L_0x1f1b:
            java.lang.String r0 = "groupmgr/onGroupEphemeralChanged/new group"
        L_0x1f1d:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33S r0 = r4.A11
            goto L_0x2876
        L_0x1f24:
            java.lang.String r0 = "sibling_group"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x204e
            java.util.Set r15 = A00(r5, r9)
            int r0 = r15.size()
            if (r0 != r8) goto L_0x1f7a
            X.1VX r7 = r4.A0A
            X.2vE r2 = X.C58422vE.A01
            r0 = 3864(0xf18, float:5.415E-42)
            boolean r0 = r7.A0Y(r2, r0)
            if (r0 == 0) goto L_0x1f7a
            java.lang.String r0 = "group"
            java.util.List r2 = r5.A0s(r0)
            int r0 = r2.size()
            if (r0 != r8) goto L_0x1f7a
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x1f7a
            X.36K r2 = X.C18310x6.A0Y(r2)
            java.lang.String r0 = "breakout"
            java.lang.String r2 = r2.A0r(r0, r3)
            java.lang.String r0 = "true"
            boolean r0 = java.util.Objects.equals(r2, r0)
            if (r0 == 0) goto L_0x1f7a
        L_0x1f6c:
            X.3Lq r0 = r4.A0B
            r11 = r0
            r12 = r1
            r13 = r6
            r14 = r10
            r16 = r26
            r18 = r8
            r11.A0W(r12, r13, r14, r15, r16, r18, r19)
            return r8
        L_0x1f7a:
            r19 = 0
            goto L_0x1f6c
        L_0x1f7d:
            java.lang.String r1 = "parent_group"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x202b
            java.util.Set r2 = A00(r5, r8)
            X.3Lq r13 = r4.A0B
            int r1 = r2.size()
            if (r1 != r8) goto L_0x2027
            if (r9 == r11) goto L_0x2027
            java.util.Iterator r1 = r2.iterator()
            X.2mC r15 = X.AnonymousClass0x7.A0O(r1)
            java.util.List r1 = java.util.Collections.singletonList(r12)
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r1.iterator()
        L_0x1fa8:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x1fc2
            java.lang.Object r2 = r3.next()
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            X.2ss r1 = r13.A0S
            java.lang.String r1 = r1.A0D(r2)
            if (r1 != 0) goto L_0x1fbe
            java.lang.String r1 = ""
        L_0x1fbe:
            X.C52882mC.A00(r2, r1, r5)
            goto L_0x1fa8
        L_0x1fc2:
            X.2so r4 = r13.A0A
            com.whatsapp.jid.GroupJid r11 = r15.A02
            X.1fJ r3 = X.AnonymousClass34R.A03(r11)
            X.4FS r2 = r4.A0N
            r1 = 27
            X.C70323aJ.A00(r2, r4, r5, r3, r1)
            X.2rN r14 = r13.A1B
            boolean r1 = r14.A01()
            r7 = 3010(0xbc2, float:4.218E-42)
            if (r1 == 0) goto L_0x2001
            if (r9 != r0) goto L_0x2001
            java.lang.String r0 = "groupChatManager/unlink due to delete parent group"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Oz r9 = r13.A0k
            X.2sd r1 = r13.A17
            X.5ZU r0 = r13.A0H
            java.lang.String r5 = r0.A0T(r11)
            X.2z0 r4 = X.C56832sd.A01(r12, r1, r8)
            r3 = 87
            X.1oU r2 = new X.1oU
            r0 = r26
            r2.<init>(r4, r3, r0)
            r2.A00 = r5
            r2.A1J(r6)
            r9.BEz(r2, r7)
        L_0x2001:
            boolean r0 = r14.A01()
            if (r0 == 0) goto L_0x2027
            X.2sd r4 = r13.A17
            java.lang.String r5 = r15.A03
            X.2z0 r3 = X.C56832sd.A01(r12, r4, r8)
            X.1od r2 = new X.1od
            r0 = r26
            r2.<init>(r3, r0)
            r2.A04 = r10
            if (r11 == 0) goto L_0x201d
            X.C30341mI.A00(r11, r2, r5)
        L_0x201d:
            r0 = 0
            r4.A0A(r6, r2, r0)
            X.3Oz r0 = r13.A0k
            r0.BEz(r2, r7)
            return r8
        L_0x2027:
            X.33S r0 = r13.A11
            goto L_0x2876
        L_0x202b:
            java.lang.String r1 = "sibling_group"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x2047
            java.util.Set r15 = A00(r5, r0)
            X.3Lq r0 = r4.A0B
            r19 = r7
            r11 = r0
            r13 = r6
            r14 = r10
            r16 = r26
            r18 = r7
            r11.A0W(r12, r13, r14, r15, r16, r18, r19)
            return r8
        L_0x2047:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupNotificationHandler/handleGroupUnlinked/incorrect link type = "
            goto L_0x2054
        L_0x204e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupNotificationHandler/handleGroupLinked/incorrect link type = "
        L_0x2054:
            X.C18260x0.A0r(r0, r2, r1)
            X.33S r0 = r4.A0F
            goto L_0x2876
        L_0x205b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupNotificationHandler/handleGroupMembershipApprovalModeChange/incorrect group_join.state="
            X.24Y r0 = X.AnonymousClass24Y.A02(r0, r2, r1)
            throw r0
        L_0x2066:
            java.lang.String r0 = "revoked_membership_requests"
            boolean r0 = X.AnonymousClass36K.A0W(r5, r0)
            if (r0 == 0) goto L_0x20b2
            X.1fJ r3 = X.AnonymousClass34R.A00(r25)
            X.2qk r0 = r4.A00
            java.util.Map r1 = X.AnonymousClass36J.A06(r5, r0)
            X.3Lq r5 = r4.A0B
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x2086
            X.2mQ r0 = r5.A13
            r0.A02(r1)
        L_0x2086:
            X.2sj r0 = r5.A0b
            boolean r0 = r0.A0D(r3)
            java.util.Iterator r2 = X.C18280x3.A0i(r1)
            if (r0 == 0) goto L_0x20a2
        L_0x2092:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x2874
            com.whatsapp.jid.UserJid r1 = X.C18310x6.A0T(r2)
            X.2oj r0 = r5.A0X
            r0.A02(r3, r1)
            goto L_0x2092
        L_0x20a2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x2874
            com.whatsapp.jid.UserJid r1 = X.C18310x6.A0T(r2)
            X.2lN r0 = r5.A0g
            r0.A01(r3, r1)
            goto L_0x20a2
        L_0x20b2:
            java.lang.String r0 = "member_add_mode"
            boolean r0 = X.AnonymousClass36K.A0W(r5, r0)
            if (r0 == 0) goto L_0x2143
            X.33S r0 = r4.A0F
            r0.A01(r10)
            X.3Lq r7 = r4.A0B
            java.lang.String r1 = r5.A0n()
            java.lang.String r0 = "all_member_add"
            boolean r2 = r0.equals(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/onGroupMemberAddModeToggled/"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "/"
            X.C18260x0.A0y(r0, r1, r2)
            X.1fJ r4 = X.AnonymousClass34R.A00(r25)
            X.3Ex r1 = r7.A0F
            X.3ZH r0 = r1.A09(r4)
            if (r0 == 0) goto L_0x213a
            int r0 = r0.A04
            if (r0 == r2) goto L_0x2137
            java.lang.String r0 = "groupmgr/onGroupMemberAddModeToggled/changed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3ZH r0 = r1.A0A(r4)
            r0.A04 = r2
            X.C34461vC.A03(r1, r0)
            boolean r2 = X.AnonymousClass000.A1U(r2, r8)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SystemMessageFactory/newGroupMemberAddModeModeChangeSystemMessage/gjid="
            X.C18260x0.A1R(r1, r0, r4)
            r14 = 92
            if (r2 == 0) goto L_0x210d
            r14 = 91
        L_0x210d:
            X.1p1 r2 = new X.1p1
            r11 = r2
            r12 = r3
            r13 = r10
            r15 = r26
            r11.<init>((X.C620833k) r12, (X.AnonymousClass39T) r13, (int) r14, (long) r15)
            r2.A1J(r6)
            r1 = 3022(0xbce, float:4.235E-42)
            goto L_0x2131
        L_0x211d:
            X.3Oz r3 = r4.A0k
            X.2sd r2 = r4.A17
            X.1mI r1 = r2.A04(r6, r9, r10, r8)
            r0 = 3015(0xbc7, float:4.225E-42)
            r3.BEz(r1, r0)
            r0 = 0
            X.1mI r2 = r2.A04(r13, r9, r0, r8)
            r1 = 3006(0xbbe, float:4.212E-42)
        L_0x2131:
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r2, r1)
            return r8
        L_0x2137:
            java.lang.String r0 = "groupmgr/onGroupMemberAddModeToggled/did not change"
            goto L_0x213f
        L_0x213a:
            java.lang.String r0 = "groupmgr/onGroupMemberAddModeToggled/new group"
            goto L_0x213f
        L_0x213d:
            java.lang.String r0 = "groupmgr/onGroupNewDescription/new group"
        L_0x213f:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r8
        L_0x2143:
            java.lang.String r0 = "created_membership_requests"
            boolean r0 = X.AnonymousClass36K.A0W(r5, r0)
            if (r0 == 0) goto L_0x230c
            java.lang.String r0 = "notify"
            r23 = 0
            java.lang.String r2 = r2.A0r(r0, r3)
            X.1fJ r9 = X.AnonymousClass34R.A00(r25)
            java.lang.String r0 = "request_method"
            java.lang.String r7 = r5.A0q(r0)
            java.lang.String r12 = X.C31601oY.A01(r7)
            if (r12 == 0) goto L_0x2301
            java.lang.String r0 = "parent_group_jid"
            java.lang.String r0 = r5.A0r(r0, r3)
            X.1fJ r17 = X.AnonymousClass34R.A04(r0)
            X.C626936e.A06(r6)
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.lang.String r11 = "non_admin_add"
            boolean r0 = r11.equals(r12)
            if (r0 == 0) goto L_0x21cb
            java.lang.String r0 = "requested_user"
            java.util.Iterator r14 = X.AnonymousClass36K.A0M(r5, r0)
        L_0x2187:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x21df
            X.36K r3 = X.C18310x6.A0Y(r14)
            com.whatsapp.jid.Jid r13 = X.AnonymousClass36K.A06(r3)
            com.whatsapp.jid.UserJid r13 = (com.whatsapp.jid.UserJid) r13
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r1 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r0 = "phone_number"
            com.whatsapp.jid.Jid r3 = r3.A0g(r1, r0)
            com.whatsapp.jid.PhoneUserJid r3 = (com.whatsapp.jid.PhoneUserJid) r3
            boolean r0 = X.C627336j.A0L(r13)
            if (r0 == 0) goto L_0x21b4
            if (r3 == 0) goto L_0x21b4
            X.3Lq r0 = r4.A0B
            r1 = r13
            X.1fH r1 = (X.C27981fH) r1
            X.2mQ r0 = r0.A13
            r0.A00(r1, r3)
        L_0x21b4:
            X.C626936e.A06(r13)
            X.2n0 r0 = new X.2n0
            r15 = r0
            r16 = r9
            r18 = r13
            r19 = r6
            r20 = r12
            r21 = r26
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r7.add(r0)
            goto L_0x2187
        L_0x21cb:
            X.2n0 r0 = new X.2n0
            r13 = r0
            r14 = r9
            r15 = r17
            r16 = r6
            r17 = r3
            r18 = r12
            r19 = r26
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r7.add(r0)
        L_0x21df:
            X.3Lq r3 = r4.A0B
            java.lang.String r1 = "suppress_sys_msg"
            java.lang.String r0 = "false"
            java.lang.String r0 = r5.A0r(r1, r0)
            boolean r13 = java.lang.Boolean.parseBoolean(r0)
            X.2sj r0 = r3.A0b
            boolean r5 = r0.A0D(r9)
            X.3Ex r12 = r3.A0F
            X.3ZH r0 = r12.A0A(r9)
            boolean r1 = X.AnonymousClass31Y.A02(r0)
            if (r5 != 0) goto L_0x2237
            if (r1 == 0) goto L_0x22fc
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()
            java.util.Iterator r13 = r7.iterator()
        L_0x220a:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x2230
            java.lang.Object r0 = r13.next()
            X.2n0 r0 = (X.C53382n0) r0
            com.whatsapp.jid.UserJid r11 = r0.A03
            X.C626936e.A06(r11)
            com.whatsapp.jid.UserJid r7 = r0.A04
            long r0 = r0.A00
            X.2lz r5 = new X.2lz
            r14 = r5
            r15 = r9
            r16 = r11
            r17 = r7
            r18 = r0
            r14.<init>(r15, r16, r17, r18)
            r12.add(r5)
            goto L_0x220a
        L_0x2230:
            X.2lN r0 = r3.A0g
            r0.A02(r12)
            goto L_0x22fc
        L_0x2237:
            X.2oj r0 = r3.A0X
            r0.A03(r7)
            r5 = 0
            r12.A0V(r9, r5)
            if (r13 != 0) goto L_0x22fc
            if (r1 == 0) goto L_0x2299
            java.lang.Object r0 = r7.get(r5)
            X.2n0 r0 = (X.C53382n0) r0
            java.lang.String r0 = r0.A05
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x2299
            X.2sd r11 = r3.A17
            java.lang.Object r9 = r7.get(r5)
            X.2n0 r9 = (X.C53382n0) r9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SystemMessageFactory/newGroupMembershipApprovalRequestsNonAdminAddSystemMessage/groupjid="
            r1.append(r0)
            X.1fJ r3 = r9.A01
            X.C18260x0.A0o(r3, r1)
            long r0 = r9.A00
            r26 = 120(0x78, float:1.68E-43)
            r25 = r23
            r22 = r11
            r24 = r3
            r27 = r0
            X.1p1 r3 = r22.A06(r23, r24, r25, r26, r27)
            X.1oR r3 = (X.C31531oR) r3
            com.whatsapp.jid.UserJid r0 = r9.A04
            r3.A1J(r0)
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            java.util.Iterator r1 = r7.iterator()
        L_0x2287:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x22dc
            java.lang.Object r0 = r1.next()
            X.2n0 r0 = (X.C53382n0) r0
            com.whatsapp.jid.UserJid r0 = r0.A04
            r11.add(r0)
            goto L_0x2287
        L_0x2299:
            java.util.Iterator r11 = r7.iterator()
        L_0x229d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x22fc
            java.lang.Object r7 = r11.next()
            X.2n0 r7 = (X.C53382n0) r7
            X.2sd r9 = r3.A17
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SystemMessageFactory/newGroupMembershipApprovalRequestSystemMessage/groupjid="
            r1.append(r0)
            X.1fJ r5 = r7.A01
            X.C18260x0.A0o(r5, r1)
            long r0 = r7.A00
            r26 = 83
            r25 = r23
            r22 = r9
            r24 = r5
            r27 = r0
            X.1p1 r5 = r22.A06(r23, r24, r25, r26, r27)
            X.1oY r5 = (X.C31601oY) r5
            com.whatsapp.jid.UserJid r0 = r7.A04
            r5.A1J(r0)
            java.lang.String r0 = r7.A05
            r5.A00 = r0
            r1 = 3020(0xbcc, float:4.232E-42)
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r5, r1)
            goto L_0x229d
        L_0x22dc:
            com.whatsapp.jid.UserJid r1 = r9.A03
            X.C626936e.A06(r1)
            X.C162457s7.A0J(r1, r5)
            r3.A00 = r1
            r3.A01 = r11
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r8]
            r0[r5] = r1
            java.util.List r0 = X.AnonymousClass8UF.A0p(r0)
            r0.addAll(r11)
            r3.A01 = r0
            r1 = 3026(0xbd2, float:4.24E-42)
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r3, r1)
        L_0x22fc:
            r4.A01(r6, r2)
            goto L_0x2874
        L_0x2301:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupNotificationHandler/handleCreatedGroupMembershipApprovalRequests/incorrect membership_approval_request.requestMethod="
            X.24Y r0 = X.AnonymousClass24Y.A02(r0, r7, r1)
            throw r0
        L_0x230c:
            java.lang.String r0 = "allow_non_admin_sub_group_creation"
            boolean r0 = X.AnonymousClass36K.A0W(r5, r0)
            if (r0 == 0) goto L_0x2317
            r2 = 1
        L_0x2315:
            monitor-enter(r4)
            goto L_0x2322
        L_0x2317:
            java.lang.String r0 = "not_allow_non_admin_sub_group_creation"
            boolean r0 = X.AnonymousClass36K.A0W(r5, r0)
            if (r0 == 0) goto L_0x23b5
            r2 = 0
            goto L_0x2315
        L_0x2322:
            X.3Lq r9 = r4.A0B     // Catch:{ all -> 0x285d }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x285d }
            java.lang.String r0 = "groupmgr/onAllowNonAdminSubGroupCreation/"
            r1.append(r0)     // Catch:{ all -> 0x285d }
            r1.append(r10)     // Catch:{ all -> 0x285d }
            java.lang.String r0 = "/"
            X.C18260x0.A1E(r0, r1, r2)     // Catch:{ all -> 0x285d }
            X.4uZ r0 = X.C627336j.A02(r25)     // Catch:{ all -> 0x285d }
            X.1fJ r7 = X.AnonymousClass34R.A03(r0)     // Catch:{ all -> 0x285d }
            if (r7 != 0) goto L_0x234b
            java.lang.String r0 = "groupmgr/onAllowNonAdminSubGroupCreation/parent not group"
        L_0x2341:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x285d }
        L_0x2344:
            X.33S r0 = r4.A0F     // Catch:{ all -> 0x285d }
            r0.A01(r10)     // Catch:{ all -> 0x285d }
            goto L_0x285b
        L_0x234b:
            X.3Ex r5 = r9.A0F     // Catch:{ all -> 0x285d }
            X.3ZH r0 = r5.A09(r7)     // Catch:{ all -> 0x285d }
            if (r0 != 0) goto L_0x2359
            java.lang.String r0 = "groupmgr/onAllowNonAdminSubGroupCreation/new group"
        L_0x2355:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x285d }
            goto L_0x2344
        L_0x2359:
            boolean r0 = r0.A0d     // Catch:{ all -> 0x285d }
            if (r0 != r2) goto L_0x2360
            java.lang.String r0 = "groupmgr/onAllowNonAdminSubGroupCreation/did not change"
            goto L_0x2355
        L_0x2360:
            java.lang.String r0 = "groupmgr/onAllowNonAdminSubGroupCreation/changed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x285d }
            X.3ZH r1 = r5.A0A(r7)     // Catch:{ all -> 0x285d }
            boolean r0 = r1.A0d     // Catch:{ all -> 0x285d }
            if (r0 == r2) goto L_0x2372
            r1.A0d = r2     // Catch:{ all -> 0x285d }
            X.C34461vC.A03(r5, r1)     // Catch:{ all -> 0x285d }
        L_0x2372:
            X.1fJ r1 = r9.A06(r7)     // Catch:{ all -> 0x285d }
            if (r1 != 0) goto L_0x237b
            java.lang.String r0 = "groupmgr/onAllowNonAdminSubGroupCreation/no cag"
            goto L_0x2341
        L_0x237b:
            X.2sj r0 = r9.A0b     // Catch:{ all -> 0x285d }
            boolean r0 = r0.A0C(r1)     // Catch:{ all -> 0x285d }
            if (r0 != 0) goto L_0x2386
            java.lang.String r0 = "groupmgr/onAllowNonAdminSubGroupCreation/not participant"
            goto L_0x2355
        L_0x2386:
            X.3Oz r5 = r9.A0k     // Catch:{ all -> 0x285d }
            X.2sd r0 = r9.A17     // Catch:{ all -> 0x285d }
            r15 = 138(0x8a, float:1.93E-43)
            if (r2 == 0) goto L_0x2390
            r15 = 137(0x89, float:1.92E-43)
        L_0x2390:
            r14 = r3
            r11 = r0
            r12 = r3
            r13 = r1
            r16 = r26
            X.1p1 r1 = r11.A06(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x285d }
            r1.A1J(r6)     // Catch:{ all -> 0x285d }
            java.lang.String r0 = "groupactionhandler/handleCommunityAction/handle allow non admin sub group creation change"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x285d }
            X.3Lv r0 = r5.A01     // Catch:{ all -> 0x285d }
            r0.A0V(r1)     // Catch:{ all -> 0x285d }
            X.2z0 r0 = r1.A1J     // Catch:{ all -> 0x285d }
            X.4uZ r2 = r0.A00     // Catch:{ all -> 0x285d }
            X.3Wi r1 = r5.A00     // Catch:{ all -> 0x285d }
            r0 = 2
            X.C69263Wi.A04(r1, r5, r2, r0)     // Catch:{ all -> 0x285d }
            X.C69263Wi.A04(r1, r5, r7, r0)     // Catch:{ all -> 0x285d }
            goto L_0x2344
        L_0x23b5:
            java.lang.String r0 = "allow_admin_reports"
            boolean r0 = X.AnonymousClass36K.A0W(r5, r0)
            if (r0 == 0) goto L_0x2408
            r7 = 1
        L_0x23be:
            X.1fJ r3 = X.AnonymousClass34R.A00(r25)
            X.3Lq r5 = r4.A0B
            X.2eb r0 = r5.A18
            X.1VX r2 = r0.A00
            r1 = 3695(0xe6f, float:5.178E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x2874
            X.3Ex r2 = r5.A0F
            X.3ZH r1 = r2.A0A(r3)
            boolean r0 = r1.A0q
            if (r0 == r7) goto L_0x23e1
            r1.A0q = r7
            X.C34461vC.A03(r2, r1)
        L_0x23e1:
            X.2sd r2 = r5.A17
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SystemMessageFactory/newReportToAdminStatusChangeSystemMessage/gjid="
            X.C18260x0.A1R(r1, r0, r3)
            X.2z0 r3 = X.C56832sd.A00(r3, r2)
            r2 = 141(0x8d, float:1.98E-43)
            if (r7 == 0) goto L_0x23f6
            r2 = 140(0x8c, float:1.96E-43)
        L_0x23f6:
            r0 = r26
            X.1p1 r2 = X.C31891p1.A02(r3, r2, r0)
            r2.A1J(r6)
            r1 = 3027(0xbd3, float:4.242E-42)
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r2, r1)
            goto L_0x2874
        L_0x2408:
            java.lang.String r0 = "not_allow_admin_reports"
            boolean r0 = X.AnonymousClass36K.A0W(r5, r0)
            if (r0 != 0) goto L_0x23be
            java.lang.String r0 = "reports"
            boolean r0 = X.AnonymousClass36K.A0W(r5, r0)
            if (r0 == 0) goto L_0x2427
            X.33S r0 = r4.A0F
            r0.A01(r10)
            X.4FS r1 = r4.A0I
            r0 = 40
            X.C70353aM.A00(r1, r4, r10, r2, r0)
            return r8
        L_0x2427:
            java.lang.String r1 = "created_sub_group_suggestion"
            boolean r0 = X.AnonymousClass36K.A0W(r5, r1)
            if (r0 == 0) goto L_0x25ac
            r17 = 0
            java.lang.String r0 = "notification"
            X.AnonymousClass36K.A0N(r2, r0)
            java.lang.String r0 = "participant"
            java.lang.String[] r23 = new java.lang.String[]{r0}
            java.lang.Class<com.whatsapp.jid.UserJid> r19 = com.whatsapp.jid.UserJid.class
            java.lang.Long r20 = X.AnonymousClass0x2.A0R()
            java.lang.Long r21 = X.AnonymousClass0x2.A0S()
            r18 = r2
            r22 = r3
            r24 = r7
            X.C626836d.A06(r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r3 = "jid"
            java.lang.String r0 = "sub_group_suggestion"
            java.lang.String[] r33 = new java.lang.String[]{r1, r0, r3}
            java.lang.Class<X.1fJ> r29 = X.C27991fJ.class
            r13 = 0
            r28 = r2
            r30 = r20
            r31 = r21
            r32 = r17
            r34 = r7
            java.lang.Object r11 = X.C626836d.A06(r28, r29, r30, r31, r32, r33, r34)
            X.1fJ r11 = (X.C27991fJ) r11
            java.lang.String r3 = "creator"
            java.lang.String[] r23 = new java.lang.String[]{r1, r0, r3}
            java.lang.Object r5 = X.C626836d.A06(r18, r19, r20, r21, r22, r23, r24)
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.lang.String r3 = "creation"
            java.lang.String[] r23 = new java.lang.String[]{r1, r0, r3}
            java.lang.Class<java.lang.Long> r19 = java.lang.Long.class
            java.lang.Long r20 = X.AnonymousClass0x2.A0T()
            java.lang.Object r9 = X.C626836d.A06(r18, r19, r20, r21, r22, r23, r24)
            java.lang.Number r9 = (java.lang.Number) r9
            java.lang.String r3 = "#elementValue"
            java.lang.String[] r23 = new java.lang.String[]{r1, r0, r12, r3}
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            java.lang.Long r20 = X.AnonymousClass0x2.A0U()
            r15 = 65536(0x10000, double:3.2379E-319)
            java.lang.Long r21 = java.lang.Long.valueOf(r15)
            java.lang.Object r3 = X.C626836d.A06(r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r3 = (java.lang.String) r3
            r12 = 33
            X.4Jp r15 = X.C86304Jp.A00(r12)
            java.lang.String[] r12 = new java.lang.String[r7]
            X.C626836d.A04(r2, r15, r12)
            java.lang.String[] r14 = new java.lang.String[]{r1, r0, r14}
            r12 = 34
            X.4Jp r12 = X.C86304Jp.A00(r12)
            X.C626836d.A03(r2, r12, r14)
            java.lang.String r12 = "is_existing_group"
            java.lang.String[] r14 = new java.lang.String[]{r1, r0, r12}
            r12 = 35
            java.lang.Object r14 = X.C626836d.A08(r2, r14, r12)
            X.1w6 r14 = (X.C34961w6) r14
            java.lang.String r12 = "participant_count"
            java.lang.String[] r15 = new java.lang.String[]{r1, r0, r12}
            r12 = 36
            java.lang.Object r12 = X.C626836d.A08(r2, r15, r12)
            X.6qj r12 = (X.C138626qj) r12
            java.lang.String[] r1 = new java.lang.String[]{r1, r0}
            r0 = 37
            java.util.List r0 = X.C626836d.A0C(r2, r1, r0)
            java.lang.Object r15 = r0.get(r7)
            X.36K r15 = (X.AnonymousClass36K) r15
            java.lang.String r1 = "notify"
            r0 = r17
            java.lang.String r20 = r2.A0r(r1, r0)
            X.1fJ r7 = X.AnonymousClass34R.A00(r25)
            X.2zN r0 = X.AnonymousClass36J.A05(r15, r15)
            java.lang.String r15 = r0.A03
            if (r12 == 0) goto L_0x2504
            java.lang.Object r0 = r12.A00
            int r13 = X.AnonymousClass001.A0K(r0)
        L_0x2504:
            if (r14 == 0) goto L_0x25a8
            java.lang.String r0 = r14.A00
            boolean r38 = java.lang.Boolean.parseBoolean(r0)
        L_0x250c:
            X.3Lq r2 = r4.A0B
            long r34 = r9.longValue()
            long r0 = (long) r13
            X.2nf r9 = new X.2nf
            r32 = r3
            r33 = r15
            r36 = r0
            r31 = r5
            r28 = r9
            r29 = r7
            r30 = r11
            r28.<init>(r29, r30, r31, r32, r33, r34, r36, r38)
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r0 = r2.A0C
            r0.A04(r9, r7)
            X.2sr r1 = r2.A06
            com.whatsapp.jid.UserJid r0 = r10.A00()
            boolean r0 = r1.A0a(r0)
            if (r0 != 0) goto L_0x2578
            X.1VX r0 = r2.A0j
            boolean r0 = X.C56952sp.A0D(r0)
            if (r0 == 0) goto L_0x2578
            X.2sj r14 = r2.A0b
            boolean r0 = r14.A0D(r7)
            if (r0 == 0) goto L_0x2578
            X.3Oz r12 = r2.A0k
            X.2sd r1 = r2.A17
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r13 = "SystemMessageFactory/newSubGroupSuggestionSystemMessage/groupjid="
            X.C18260x0.A1R(r0, r13, r7)
            X.35J r11 = r1.A02
            X.2z0 r15 = r11.A04(r7, r8)
            r9 = 145(0x91, float:2.03E-43)
            r0 = r26
            X.1p1 r0 = X.C31891p1.A02(r15, r9, r0)
            r0.A1J(r5)
            r0.A1Z(r3)
            r9 = 3018(0xbca, float:4.229E-42)
            r12.BEz(r0, r9)
            X.1fJ r1 = r2.A06(r7)
            if (r1 != 0) goto L_0x257f
            java.lang.String r0 = "groupmgr/onSubgroupSuggestion/no cag"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x2578:
            r0 = r20
            r4.A01(r6, r0)
            goto L_0x2874
        L_0x257f:
            boolean r0 = r14.A0C(r1)
            if (r0 != 0) goto L_0x258b
            java.lang.String r0 = "groupmgr/onSubgroupSuggestion/not participant"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x2578
        L_0x258b:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18260x0.A1R(r0, r13, r1)
            X.2z0 r7 = r11.A04(r1, r8)
            r2 = 145(0x91, float:2.03E-43)
            r0 = r26
            X.1p1 r0 = X.C31891p1.A02(r7, r2, r0)
            r0.A1J(r5)
            r0.A1Z(r3)
            r12.BEz(r0, r9)
            goto L_0x2578
        L_0x25a8:
            r38 = 0
            goto L_0x250c
        L_0x25ac:
            java.lang.String r0 = "revoked_sub_group_suggestions"
            boolean r0 = X.AnonymousClass36K.A0W(r5, r0)
            if (r0 == 0) goto L_0x25f3
            java.lang.String r0 = "notify"
            java.lang.String r12 = r2.A0r(r0, r3)
            X.1fJ r11 = X.AnonymousClass34R.A00(r25)
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.lang.String r0 = "sub_group_suggestion"
            java.util.Iterator r14 = X.AnonymousClass36K.A0M(r5, r0)
        L_0x25cb:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x276e
            X.36K r13 = X.C18310x6.A0Y(r14)
            java.lang.Class<X.1fJ> r1 = X.C27991fJ.class
            java.lang.String r0 = "jid"
            com.whatsapp.jid.Jid r5 = r13.A0g(r1, r0)
            X.1fJ r5 = (X.C27991fJ) r5
            java.lang.String r0 = "reason"
            java.lang.String r2 = r13.A0r(r0, r3)
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass36K.A09(r13)
            X.2lC r0 = new X.2lC
            r0.<init>(r11, r5, r1)
            X.AnonymousClass3Z6.A03(r0, r2, r9)
            goto L_0x25cb
        L_0x25f3:
            java.lang.String r0 = "change_number"
            boolean r0 = X.AnonymousClass36K.A0W(r5, r0)
            if (r0 == 0) goto L_0x27ba
            java.lang.String r0 = "notify"
            java.lang.String r20 = r2.A0r(r0, r3)
            X.1fJ r12 = X.AnonymousClass34R.A00(r25)
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            java.lang.String r2 = "jid"
            com.whatsapp.jid.UserJid r14 = X.AnonymousClass36K.A0A(r5, r0, r2)
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.lang.String r0 = "sub_group_suggestion"
            java.util.Iterator r3 = X.AnonymousClass36K.A0M(r5, r0)
        L_0x2619:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x2634
            X.36K r1 = X.C18310x6.A0Y(r3)
            java.lang.Class<X.1fJ> r0 = X.C27991fJ.class
            com.whatsapp.jid.Jid r1 = r1.A0g(r0, r2)
            X.1fJ r1 = (X.C27991fJ) r1
            X.2lC r0 = new X.2lC
            r0.<init>(r12, r1, r6)
            r9.add(r0)
            goto L_0x2619
        L_0x2634:
            X.3Lq r2 = r4.A0B
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/updateSubgroupSuggestionsOnChangeNumber/"
            X.C18260x0.A1P(r1, r0, r12)
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r5 = r2.A0C
            X.C18270x1.A10(r12, r7, r6)
            X.C162457s7.A0J(r14, r11)
            X.1sU r11 = r5.A02
            java.lang.Object r0 = r11.A06(r12)
            boolean r19 = X.AnonymousClass000.A1X(r0)
            X.2is r0 = r5.A06
            X.1RI r0 = r0.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x26db }
            X.4Fq r3 = r0.A0C()     // Catch:{ SQLiteDatabaseCorruptException -> 0x26db }
            X.3Yo r18 = r3.Axl()     // Catch:{ all -> 0x26d4 }
            java.util.Iterator r17 = r9.iterator()     // Catch:{ all -> 0x26cb }
        L_0x2661:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x26cb }
            if (r0 == 0) goto L_0x26c1
            java.lang.Object r13 = r17.next()     // Catch:{ all -> 0x26cb }
            X.2lC r13 = (X.C52262lC) r13     // Catch:{ all -> 0x26cb }
            r0 = 8
            android.content.ContentValues r16 = X.AnonymousClass0x9.A07(r0)     // Catch:{ all -> 0x26cb }
            java.lang.String r1 = "creator_jid"
            r0 = r16
            X.AnonymousClass0x2.A0n(r0, r14, r1)     // Catch:{ all -> 0x26cb }
            com.whatsapp.jid.UserJid r2 = r13.A02     // Catch:{ all -> 0x26cb }
            r1 = 2
            if (r2 == 0) goto L_0x26a4
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x26cb }
            X.2sg r15 = r0.A03     // Catch:{ all -> 0x26cb }
            java.lang.String r23 = "member_suggested_groups_v2"
            java.lang.String r24 = "parent_group_jid = ?  AND group_jid = ?  AND creator_jid = ?"
            java.lang.String[] r0 = X.AnonymousClass0x9.A1a()     // Catch:{ all -> 0x26cb }
            X.C18280x3.A0w(r12, r0, r7)     // Catch:{ all -> 0x26cb }
            X.1fJ r13 = r13.A00     // Catch:{ all -> 0x26cb }
            X.C18280x3.A0w(r13, r0, r8)     // Catch:{ all -> 0x26cb }
            X.C18280x3.A0w(r2, r0, r1)     // Catch:{ all -> 0x26cb }
            java.lang.String r25 = "UPDATE_MEMBER_SUGGESTED_GROUPS_CREATOR"
        L_0x269a:
            r21 = r15
            r22 = r16
            r26 = r0
            r21.A05(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x26cb }
            goto L_0x2661
        L_0x26a4:
            java.lang.String r0 = "updateSubgroupSuggestionCreatorHelper/Deprecated sql UPDATE_MEMBER_SUGGESTED_GROUPS is used, missing creator"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x26cb }
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x26cb }
            X.2sg r15 = r0.A03     // Catch:{ all -> 0x26cb }
            java.lang.String r23 = "member_suggested_groups_v2"
            java.lang.String r24 = "parent_group_jid = ?  AND group_jid = ?"
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch:{ all -> 0x26cb }
            X.C18280x3.A0w(r12, r0, r7)     // Catch:{ all -> 0x26cb }
            X.1fJ r1 = r13.A00     // Catch:{ all -> 0x26cb }
            X.C18280x3.A0w(r1, r0, r8)     // Catch:{ all -> 0x26cb }
            java.lang.String r25 = "UPDATE_MEMBER_SUGGESTED_GROUPS"
            goto L_0x269a
        L_0x26c1:
            r18.A00()     // Catch:{ all -> 0x26cb }
            r18.close()     // Catch:{ all -> 0x26d4 }
            r3.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x26db }
            goto L_0x26df
        L_0x26cb:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x26cd }
        L_0x26cd:
            r1 = move-exception
            r0 = r18
            X.AnonymousClass2A8.A00(r0, r2)     // Catch:{ all -> 0x26d4 }
            throw r1     // Catch:{ all -> 0x26d4 }
        L_0x26d4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x26d6 }
        L_0x26d6:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x26db }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x26db }
        L_0x26db:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x26df:
            java.util.SortedSet r0 = r5.A03(r12)
            if (r19 != 0) goto L_0x2760
            java.util.ArrayList r15 = X.C73783g4.A0c(r0)
            java.util.Iterator r16 = r0.iterator()
        L_0x26ed:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x2753
            java.lang.Object r7 = r16.next()
            X.2nf r7 = (X.C53782nf) r7
            boolean r0 = r9 instanceof java.util.Collection
            if (r0 == 0) goto L_0x2707
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x2707
        L_0x2703:
            r15.add(r7)
            goto L_0x26ed
        L_0x2707:
            java.util.Iterator r2 = r9.iterator()
        L_0x270b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x2703
            java.lang.Object r1 = r2.next()
            X.2lC r1 = (X.C52262lC) r1
            X.1fJ r0 = r1.A00
            X.1fJ r13 = r7.A02
            boolean r0 = X.C162457s7.A0P(r0, r13)
            if (r0 == 0) goto L_0x270b
            com.whatsapp.jid.UserJid r0 = r1.A02
            boolean r0 = X.C162457s7.A0P(r0, r6)
            if (r0 == 0) goto L_0x270b
            X.1fJ r0 = r7.A03
            r22 = r0
            java.lang.String r0 = r7.A06
            r19 = r0
            java.lang.String r0 = r7.A05
            r18 = r0
            long r2 = r7.A00
            long r0 = r7.A01
            boolean r7 = r7.A07
            r17 = r7
            X.2nf r7 = new X.2nf
            r25 = r19
            r26 = r18
            r27 = r2
            r29 = r0
            r31 = r17
            r21 = r7
            r23 = r13
            r24 = r14
            r21.<init>(r22, r23, r24, r25, r26, r27, r29, r31)
            goto L_0x2703
        L_0x2753:
            X.3cj r1 = r5.A05
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>(r1)
            X.C73723fy.A0T(r15, r0)
            r11.A09(r12, r0)
        L_0x2760:
            X.3Wi r2 = r5.A01
            r1 = 13
            X.3a6 r0 = new X.3a6
            r0.<init>(r5, r1, r12)
            r2.A0S(r0)
            goto L_0x2578
        L_0x276e:
            X.3Lq r2 = r4.A0B
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/onRevokedSubgroupSuggestions/"
            X.C18260x0.A1P(r1, r0, r11)
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r3 = r2.A0C
            X.C162457s7.A0J(r11, r7)
            java.util.ArrayList r2 = X.C73783g4.A0c(r9)
            java.util.Iterator r1 = r9.iterator()
        L_0x2786:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x2798
            java.lang.Object r0 = r1.next()
            X.3Z6 r0 = (X.AnonymousClass3Z6) r0
            java.lang.Object r0 = r0.first
            r2.add(r0)
            goto L_0x2786
        L_0x2798:
            X.2is r0 = r3.A06
            r0.A01(r11, r2)
            java.util.SortedSet r1 = r3.A03(r11)
            X.41W r0 = new X.41W
            r0.<init>(r2)
            X.C73743g0.A0X(r1, r0)
            X.3Wi r2 = r3.A01
            r1 = 35
            X.3aJ r0 = new X.3aJ
            r0.<init>(r3, r11, r9, r1)
            r2.A0S(r0)
            r4.A01(r6, r12)
            goto L_0x2874
        L_0x27ba:
            java.lang.String r0 = "group_history"
            boolean r0 = X.AnonymousClass36K.A0W(r5, r0)
            if (r0 == 0) goto L_0x27c5
            r7 = 1
        L_0x27c3:
            monitor-enter(r4)
            goto L_0x27db
        L_0x27c5:
            java.lang.String r0 = "no_group_history"
            boolean r0 = X.AnonymousClass36K.A0W(r5, r0)
            if (r0 != 0) goto L_0x27c3
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "GroupNotificationHandler/handleXmppMessage: unknown tag="
            r0 = r18
            X.C18260x0.A0r(r1, r0, r2)
            goto L_0x2874
        L_0x27db:
            X.3Lq r9 = r4.A0B     // Catch:{ all -> 0x285d }
            X.1VX r2 = r9.A0j     // Catch:{ all -> 0x285d }
            r1 = 5046(0x13b6, float:7.071E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x285d }
            boolean r0 = r2.A0Y(r0, r1)     // Catch:{ all -> 0x285d }
            if (r0 == 0) goto L_0x2809
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x285d }
            java.lang.String r0 = "groupmgr/onGroupHistory/"
            r1.append(r0)     // Catch:{ all -> 0x285d }
            r1.append(r10)     // Catch:{ all -> 0x285d }
            java.lang.String r0 = "/"
            X.C18260x0.A1E(r0, r1, r7)     // Catch:{ all -> 0x285d }
            X.4uZ r0 = X.C627336j.A02(r25)     // Catch:{ all -> 0x285d }
            X.1fJ r5 = X.AnonymousClass34R.A03(r0)     // Catch:{ all -> 0x285d }
            if (r5 != 0) goto L_0x280f
            java.lang.String r0 = "groupmgr/onGroupHistory/not group"
        L_0x2806:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x285d }
        L_0x2809:
            X.33S r0 = r4.A0F     // Catch:{ all -> 0x285d }
            r0.A01(r10)     // Catch:{ all -> 0x285d }
            goto L_0x285b
        L_0x280f:
            X.3Ex r2 = r9.A0F     // Catch:{ all -> 0x285d }
            X.3ZH r0 = r2.A09(r5)     // Catch:{ all -> 0x285d }
            if (r0 != 0) goto L_0x281a
            java.lang.String r0 = "groupmgr/onGroupHistory/new group"
            goto L_0x2806
        L_0x281a:
            boolean r0 = r0.A0i     // Catch:{ all -> 0x285d }
            if (r0 != r7) goto L_0x2821
            java.lang.String r0 = "groupmgr/onGroupHistory/did not change"
            goto L_0x2806
        L_0x2821:
            java.lang.String r0 = "groupmgr/onGroupHistory/changed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x285d }
            X.2sj r0 = r9.A0b     // Catch:{ all -> 0x285d }
            boolean r0 = r0.A0C(r5)     // Catch:{ all -> 0x285d }
            if (r0 != 0) goto L_0x2831
            java.lang.String r0 = "groupmgr/onGroupHistory/not participant"
            goto L_0x2806
        L_0x2831:
            X.3ZH r1 = r2.A0A(r5)     // Catch:{ all -> 0x285d }
            boolean r0 = r1.A0i     // Catch:{ all -> 0x285d }
            if (r0 == r7) goto L_0x283e
            r1.A0i = r7     // Catch:{ all -> 0x285d }
            X.C34461vC.A03(r2, r1)     // Catch:{ all -> 0x285d }
        L_0x283e:
            X.3Oz r2 = r9.A0k     // Catch:{ all -> 0x285d }
            X.2sd r0 = r9.A17     // Catch:{ all -> 0x285d }
            r15 = 151(0x97, float:2.12E-43)
            if (r7 == 0) goto L_0x2848
            r15 = 150(0x96, float:2.1E-43)
        L_0x2848:
            r14 = r3
            r11 = r0
            r12 = r3
            r13 = r5
            r16 = r26
            X.1p1 r1 = r11.A06(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x285d }
            r1.A1J(r6)     // Catch:{ all -> 0x285d }
            r0 = 3019(0xbcb, float:4.23E-42)
            r2.BEz(r1, r0)     // Catch:{ all -> 0x285d }
            goto L_0x2809
        L_0x285b:
            monitor-exit(r4)
            return r8
        L_0x285d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x2860:
            X.3Lr r2 = r4.A0D
            X.21x r0 = X.C373521x.LID_MIGRATION
            java.lang.String r1 = r0.contextString
            r0 = 5
            r2.A0E(r15, r1, r0)
            goto L_0x2874
        L_0x286b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupNotificationHandler/handleSubject/old timestamp, gjid="
            X.C18260x0.A1S(r1, r0, r9)
        L_0x2874:
            X.33S r0 = r4.A0F
        L_0x2876:
            r0.A01(r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67763Qo.BFA(android.os.Message, int):boolean");
    }
}
