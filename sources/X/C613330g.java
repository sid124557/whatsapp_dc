package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: X.30g  reason: invalid class name and case insensitive filesystem */
public class C613330g {
    public final C56972sr A00;
    public final C56942so A01;
    public final AnonymousClass2TH A02;
    public final C56332ro A03;
    public final C55052pi A04;
    public final AnonymousClass5ZR A05;
    public final C56452s0 A06;
    public final AnonymousClass4FS A07;

    public Bitmap A01(Context context, AnonymousClass3ZH r10, float f, int i) {
        return A02(context, r10, f, i, 604800000, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r2 != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap A03(android.content.Context r12, X.AnonymousClass3ZH r13, float r14, int r15, boolean r16) {
        /*
            r11 = this;
            r3 = r11
            r5 = r13
            r6 = r14
            r7 = r15
            if (r16 == 0) goto L_0x001b
            X.2ro r0 = r11.A03
            java.lang.String r1 = r13.A0M(r14, r15)
            X.30B r0 = r0.A02
            X.1sU r0 = r0.A01()
            java.lang.Object r2 = r0.A06(r1)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x001b
        L_0x001a:
            return r2
        L_0x001b:
            r8 = 604800000(0x240c8400, double:2.988109026E-315)
            r10 = 1
            r4 = r12
            android.graphics.Bitmap r2 = r3.A02(r4, r5, r6, r7, r8, r10)
            if (r16 == 0) goto L_0x001a
            if (r2 == 0) goto L_0x001a
            X.2ro r0 = r11.A03
            java.lang.String r1 = r13.A0M(r14, r15)
            X.30B r0 = r0.A02
            X.1sU r0 = r0.A01()
            r0.A09(r1, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C613330g.A03(android.content.Context, X.3ZH, float, int, boolean):android.graphics.Bitmap");
    }

    public final void A06(C15790rw r7, AnonymousClass3ZH r8, AnonymousClass2T0 r9, Runnable runnable, boolean z) {
        Object A062;
        C33131sU A012;
        if (!(r8 == null || r8.A0K() == null)) {
            String A0K = r8.A0K();
            if (r9.A00 != null) {
                this.A04.A03(r9);
                A062 = A00(new C626035t(r9, 2));
                if (A062 != null) {
                    A012 = this.A03.A02.A01();
                }
                r7.AwB(A062);
                return;
            } else if (r9.A01 == -1) {
                Log.e("contactPhotosBitmapManager/handleProfilePhoto/group-removed-photo");
                this.A04.A02(r9.A03);
            } else {
                C56332ro r1 = this.A03;
                AnonymousClass30B r3 = r1.A02;
                A062 = r3.A01().A06(A0K);
                if (A062 == null) {
                    File A013 = r1.A01(r8);
                    if (A013 != null && (A062 = A00(new C626035t(A013, 3))) != null) {
                        A012 = r3.A01();
                    } else if (z) {
                        runnable.run();
                        return;
                    }
                }
                r7.AwB(A062);
                return;
            }
            A012.A09(A0K, A062);
            r7.AwB(A062);
            return;
        }
        r7.AwB((Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: X.2Ls} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: X.1fJ} */
    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (X.C95804uY.A00(r12) != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        if (r3.A10 == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c9, code lost:
        if (r8 == 6) goto L_0x00cb;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap A02(android.content.Context r16, X.AnonymousClass3ZH r17, float r18, int r19, long r20, boolean r22) {
        /*
            r15 = this;
            r3 = r17
            X.4uZ r12 = X.AnonymousClass3ZH.A01(r3)
            r6 = r19
            float r4 = (float) r6
            r2 = 0
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r16)     // Catch:{ OutOfMemoryError -> 0x0144 }
            float r1 = r0.density     // Catch:{ OutOfMemoryError -> 0x0144 }
            r0 = 1119879168(0x42c00000, float:96.0)
            float r1 = r1 * r0
            r5 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            boolean r4 = X.AnonymousClass001.A1U(r0)
            r10 = r15
            if (r22 == 0) goto L_0x00dc
            if (r12 == 0) goto L_0x00dc
            boolean r0 = r3.A0U()     // Catch:{ OutOfMemoryError -> 0x0144 }
            if (r0 == 0) goto L_0x002b
            X.4uZ r0 = r3.A0H     // Catch:{ OutOfMemoryError -> 0x0144 }
            boolean r0 = r0 instanceof X.C28001fK     // Catch:{ OutOfMemoryError -> 0x0144 }
            if (r0 == 0) goto L_0x004f
        L_0x002b:
            boolean r7 = r12 instanceof X.C95804uY     // Catch:{ OutOfMemoryError -> 0x0144 }
            if (r7 == 0) goto L_0x0036
            boolean r1 = X.C95804uY.A00(r12)     // Catch:{ OutOfMemoryError -> 0x0144 }
            r0 = 1
            if (r1 == 0) goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r0 != 0) goto L_0x004f
            boolean r0 = r3.A0U()     // Catch:{ OutOfMemoryError -> 0x0144 }
            if (r0 != 0) goto L_0x00dc
            if (r7 != 0) goto L_0x00dc
            X.4uZ r0 = r3.A0H     // Catch:{ OutOfMemoryError -> 0x0144 }
            boolean r0 = r0 instanceof X.AnonymousClass1fS     // Catch:{ OutOfMemoryError -> 0x0144 }
            if (r0 != 0) goto L_0x00dc
            boolean r0 = r12 instanceof X.C135216kJ     // Catch:{ OutOfMemoryError -> 0x0144 }
            if (r0 != 0) goto L_0x00dc
            boolean r0 = r3.A10     // Catch:{ OutOfMemoryError -> 0x0144 }
            if (r0 == 0) goto L_0x00dc
        L_0x004f:
            if (r4 == 0) goto L_0x0054
            int r13 = r3.A05     // Catch:{ OutOfMemoryError -> 0x0144 }
            goto L_0x0056
        L_0x0054:
            int r13 = r3.A06     // Catch:{ OutOfMemoryError -> 0x0144 }
        L_0x0056:
            X.2sr r0 = r15.A00     // Catch:{ OutOfMemoryError -> 0x0144 }
            boolean r0 = X.C56972sr.A08(r0, r3)     // Catch:{ OutOfMemoryError -> 0x0144 }
            if (r0 != 0) goto L_0x009e
            boolean r0 = r3 instanceof X.AnonymousClass1RS     // Catch:{ OutOfMemoryError -> 0x0144 }
            if (r0 != 0) goto L_0x009e
            X.4uZ r0 = r3.A0H     // Catch:{ OutOfMemoryError -> 0x0144 }
            boolean r0 = r0 instanceof X.C95804uY     // Catch:{ OutOfMemoryError -> 0x0144 }
            if (r0 != 0) goto L_0x009e
            long r0 = r3.A0C     // Catch:{ OutOfMemoryError -> 0x0144 }
            long r0 = r0 + r20
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ OutOfMemoryError -> 0x0144 }
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x009e
        L_0x0074:
            X.2so r9 = r15.A01     // Catch:{ OutOfMemoryError -> 0x0144 }
            X.4uZ r8 = r3.A0H     // Catch:{ OutOfMemoryError -> 0x0144 }
            boolean r0 = r8 instanceof X.C27991fJ     // Catch:{ OutOfMemoryError -> 0x0144 }
            r7 = 0
            if (r0 == 0) goto L_0x00a2
            com.whatsapp.jid.GroupJid r8 = (com.whatsapp.jid.GroupJid) r8     // Catch:{ OutOfMemoryError -> 0x0144 }
            X.2ss r0 = r9.A06     // Catch:{ OutOfMemoryError -> 0x0144 }
            int r1 = r0.A06(r8)     // Catch:{ OutOfMemoryError -> 0x0144 }
            boolean r0 = X.C57192tF.A00(r1)     // Catch:{ OutOfMemoryError -> 0x0144 }
            if (r0 == 0) goto L_0x0098
            X.2rM r0 = r9.A0H     // Catch:{ OutOfMemoryError -> 0x0144 }
            r0.A04()     // Catch:{ OutOfMemoryError -> 0x0144 }
            java.util.Map r0 = r0.A03     // Catch:{ OutOfMemoryError -> 0x0144 }
            java.lang.Object r7 = r0.get(r8)     // Catch:{ OutOfMemoryError -> 0x0144 }
            X.1fJ r7 = (X.C27991fJ) r7     // Catch:{ OutOfMemoryError -> 0x0144 }
        L_0x0098:
            X.2Ls r0 = new X.2Ls     // Catch:{ OutOfMemoryError -> 0x0144 }
            r0.<init>(r7, r1)     // Catch:{ OutOfMemoryError -> 0x0144 }
            goto L_0x00a1
        L_0x009e:
            if (r13 == 0) goto L_0x0074
            goto L_0x00dc
        L_0x00a1:
            r7 = r0
        L_0x00a2:
            r14 = 1
            r11 = 2
            if (r4 == 0) goto L_0x00a7
            r11 = 1
        L_0x00a7:
            if (r7 != 0) goto L_0x00ab
            r8 = 0
            goto L_0x00ad
        L_0x00ab:
            int r8 = r7.A00     // Catch:{ OutOfMemoryError -> 0x0144 }
        L_0x00ad:
            boolean r0 = r3.A0U()     // Catch:{ OutOfMemoryError -> 0x0144 }
            if (r0 == 0) goto L_0x00c4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ OutOfMemoryError -> 0x0144 }
            java.lang.String r0 = "ContactPhotosBitmapManager/getGroupProfilePictureFromServerIfNeeded/fetching group image from server/groupType = "
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x0144 }
            r1.append(r8)     // Catch:{ OutOfMemoryError -> 0x0144 }
            java.lang.String r0 = " group jid = "
            X.C18260x0.A1R(r1, r0, r12)     // Catch:{ OutOfMemoryError -> 0x0144 }
        L_0x00c4:
            r0 = 2
            if (r8 == r0) goto L_0x00cb
            r1 = 6
            r0 = 0
            if (r8 != r1) goto L_0x00cc
        L_0x00cb:
            r0 = 1
        L_0x00cc:
            if (r0 == 0) goto L_0x00e1
            if (r7 == 0) goto L_0x00e1
            X.1fJ r7 = r7.A01     // Catch:{ OutOfMemoryError -> 0x0144 }
            if (r7 == 0) goto L_0x00e1
            X.2s0 r1 = r15.A06     // Catch:{ OutOfMemoryError -> 0x0144 }
            r0 = r12
            X.1fJ r0 = (X.C27991fJ) r0     // Catch:{ OutOfMemoryError -> 0x0144 }
            r1.A02(r7, r0, r13, r11)     // Catch:{ OutOfMemoryError -> 0x0144 }
        L_0x00dc:
            boolean r0 = r3.A0g     // Catch:{ OutOfMemoryError -> 0x0144 }
            if (r0 == 0) goto L_0x0143
            goto L_0x00f4
        L_0x00e1:
            if (r8 != r14) goto L_0x00e9
            X.2s0 r0 = r15.A06     // Catch:{ OutOfMemoryError -> 0x0144 }
            r0.A02(r12, r2, r13, r11)     // Catch:{ OutOfMemoryError -> 0x0144 }
            goto L_0x00dc
        L_0x00e9:
            X.4FS r0 = r15.A07     // Catch:{ OutOfMemoryError -> 0x0144 }
            X.3cL r9 = new X.3cL     // Catch:{ OutOfMemoryError -> 0x0144 }
            r9.<init>((java.lang.Object) r10, (int) r11, (java.lang.Object) r12, (int) r13, (int) r14)     // Catch:{ OutOfMemoryError -> 0x0144 }
            r0.BkM(r9)     // Catch:{ OutOfMemoryError -> 0x0144 }
            goto L_0x00dc
        L_0x00f4:
            java.io.InputStream r7 = r15.A04(r3, r4)     // Catch:{ IOException -> 0x0143 }
            if (r7 != 0) goto L_0x0102
            java.lang.String r0 = "contactPhotosBitmapManager/getphotofast/no-photo"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0137 }
            r3.A0g = r5     // Catch:{ all -> 0x0137 }
            return r2
        L_0x0102:
            r0 = r18
            android.graphics.Bitmap r5 = X.C114015mM.A01(r7, r0, r6)     // Catch:{ all -> 0x0137 }
            if (r5 != 0) goto L_0x0133
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = "contactPhotosBitmapManager/getphotofast/"
            r1.append(r0)     // Catch:{ all -> 0x0137 }
            r1.append(r12)     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = " decodeStream returns null"
            X.C18260x0.A1K(r1, r0)     // Catch:{ all -> 0x0137 }
            X.4uZ r0 = r3.A0H     // Catch:{ all -> 0x0137 }
            boolean r0 = r0 instanceof X.C95804uY     // Catch:{ all -> 0x0137 }
            if (r0 == 0) goto L_0x0133
            r0 = -1
            if (r4 == 0) goto L_0x0127
            r3.A05 = r0     // Catch:{ all -> 0x0137 }
            goto L_0x0129
        L_0x0127:
            r3.A06 = r0     // Catch:{ all -> 0x0137 }
        L_0x0129:
            X.2pi r0 = r15.A04     // Catch:{ all -> 0x0137 }
            X.2ro r0 = r0.A06     // Catch:{ all -> 0x0137 }
            r0.A04(r3)     // Catch:{ all -> 0x0137 }
            r0.A03(r3)     // Catch:{ all -> 0x0137 }
        L_0x0133:
            r7.close()     // Catch:{ IOException -> 0x0143 }
            return r5
        L_0x0137:
            r1 = move-exception
            if (r7 == 0) goto L_0x0142
            r7.close()     // Catch:{ all -> 0x013e }
            goto L_0x0142
        L_0x013e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0143 }
        L_0x0142:
            throw r1     // Catch:{ IOException -> 0x0143 }
        L_0x0143:
            return r2
        L_0x0144:
            r1 = move-exception
            java.lang.String r0 = "contactPhotosBitmapManager/getphotofast/out-of-memory "
            com.whatsapp.util.Log.e(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C613330g.A02(android.content.Context, X.3ZH, float, int, long, boolean):android.graphics.Bitmap");
    }

    public InputStream A04(AnonymousClass3ZH r6, boolean z) {
        File A012;
        if (!r6.A0g) {
            return null;
        }
        C56332ro r1 = this.A03;
        if (z) {
            A012 = r1.A00(r6);
            if (A012 == null || !A012.exists()) {
                A012 = r1.A01(r6);
                if (r6.A05 > 0 && this.A05.A0I(Environment.getExternalStorageState())) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    AnonymousClass3ZH.A0C(r6, "contactPhotosBitmapManager/getphotostream/", A0o);
                    A0o.append(" full file missing id:");
                    C18270x1.A1F(A0o, r6.A05);
                    r6.A05 = 0;
                }
            }
        } else {
            A012 = r1.A01(r6);
            if (A012 == null || !A012.exists()) {
                A012 = r1.A00(r6);
                if (r6.A06 > 0) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    AnonymousClass3ZH.A0C(r6, "contactPhotosBitmapManager/getphotostream/", A0o2);
                    A0o2.append(" thumb file missing id:");
                    C18270x1.A1F(A0o2, r6.A06);
                    r6.A06 = 0;
                }
            }
        }
        if (A012 == null || !A012.exists()) {
            return null;
        }
        try {
            return AnonymousClass0x9.A0g(A012);
        } catch (FileNotFoundException e) {
            StringBuilder A0o3 = AnonymousClass001.A0o();
            AnonymousClass3ZH.A0C(r6, "contactPhotosBitmapManager/getphotostream/", A0o3);
            C18260x0.A15(" photo file not found", A0o3, e);
            return null;
        }
    }

    public final void A05(C15790rw r20, AnonymousClass3ZH r21, GroupJid groupJid, C27991fJ r23, String str) {
        AnonymousClass2TH r4 = this.A02;
        C15790rw r6 = r20;
        GroupJid groupJid2 = groupJid;
        C27991fJ r10 = r23;
        String str2 = str;
        AnonymousClass3AO r5 = new AnonymousClass3AO(r6, this, r21, groupJid2, r10, str2);
        C85994Ik r3 = new C85994Ik(r6, 0);
        AnonymousClass31C r2 = r4.A06;
        C86474Kg r0 = new C86474Kg(r5, r3, r4, 1);
        String A032 = r2.A03();
        r2.A0D(new AnonymousClass3T2(r0, groupJid2, r10, "image", str2), AnonymousClass27I.A00(r10, groupJid2, A032, "blob", "image", str2, (String) null), A032, 300, 32000);
    }

    public final void A07(C15790rw r23, AnonymousClass3ZH r24, String str, String str2) {
        GroupJid groupJid;
        AnonymousClass2TH r2 = this.A02;
        AnonymousClass3ZH r12 = r24;
        if (r24 != null) {
            groupJid = (GroupJid) r12.A0I(GroupJid.class);
        } else {
            groupJid = null;
        }
        C15790rw r10 = r23;
        String str3 = str;
        String str4 = str2;
        AnonymousClass3AN r9 = new AnonymousClass3AN(r10, this, r12, str3, str4);
        C85994Ik r1 = new C85994Ik(r10, 1);
        AnonymousClass31C r15 = r2.A06;
        C86474Kg r102 = new C86474Kg(r9, r1, r2, 0);
        String A032 = r15.A03();
        r15.A0D(new AnonymousClass3T2(r102, groupJid, (GroupJid) null, "preview", str3), AnonymousClass27I.A00((GroupJid) null, groupJid, A032, "blob", "preview", str3, str4), A032, 300, 32000);
    }

    public C613330g(C56972sr r1, C56942so r2, AnonymousClass2TH r3, C56332ro r4, C55052pi r5, AnonymousClass5ZR r6, C56452s0 r7, AnonymousClass4FS r8) {
        this.A00 = r1;
        this.A07 = r8;
        this.A03 = r4;
        this.A04 = r5;
        this.A06 = r7;
        this.A05 = r6;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static final Bitmap A00(C15810ry r1) {
        try {
            return (Bitmap) r1.get();
        } catch (OutOfMemoryError e) {
            Log.e("contactPhotosBitmapManager/decode-bitmap/out-of-memory ", e);
            return null;
        }
    }
}
