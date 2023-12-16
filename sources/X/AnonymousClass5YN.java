package X;

import android.content.Context;
import com.whatsapp.R;
import java.io.File;

/* renamed from: X.5YN  reason: invalid class name */
public class AnonymousClass5YN {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 == 1) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r2 == r0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable A00(android.content.Context r5, X.C30721mu r6) {
        /*
            X.2z0 r1 = r6.A1J
            X.4uZ r0 = r1.A00
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 == 0) goto L_0x0010
            int r0 = r6.A09
            r4 = 1
            r3 = 2131233155(0x7f080983, float:1.808244E38)
            if (r0 != r4) goto L_0x0014
        L_0x0010:
            r4 = 0
            r3 = 2131233186(0x7f0809a2, float:1.8082502E38)
        L_0x0014:
            boolean r0 = r1.A02
            int r2 = r6.A0D
            if (r0 == 0) goto L_0x0035
            r0 = 8
            r1 = 2131101895(0x7f0608c7, float:1.7816213E38)
        L_0x001f:
            if (r2 != r0) goto L_0x0024
        L_0x0021:
            r1 = 2131101894(0x7f0608c6, float:1.781621E38)
        L_0x0024:
            boolean r0 = X.C1001059l.A04
            if (r0 == 0) goto L_0x0030
            r3 = 2131233187(0x7f0809a3, float:1.8082504E38)
            if (r4 == 0) goto L_0x0030
            r3 = 2131233156(0x7f080984, float:1.8082442E38)
        L_0x0030:
            android.graphics.drawable.Drawable r0 = X.C107335b8.A04(r5, r3, r1)
            return r0
        L_0x0035:
            r0 = 9
            if (r2 == r0) goto L_0x0021
            r0 = 10
            r1 = 2131101896(0x7f0608c8, float:1.7816215E38)
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5YN.A00(android.content.Context, X.1mu):android.graphics.drawable.Drawable");
    }

    public static String A01(Context context, C64773Ex r11, AnonymousClass5ZU r12, C56612sH r13, C620733j r14, C30721mu r15) {
        AnonymousClass3ZH A00;
        int i;
        Object[] objArr;
        int i2;
        int i3;
        String A03;
        String A0B = C107565bW.A0B(r14, (long) Math.max(0, r15.A0B * 1000));
        String A002 = C107145am.A00(r14, r13.A0I(r15.A0K));
        boolean A1U = AnonymousClass000.A1U(r15.A09, 1);
        AnonymousClass2z0 r6 = r15.A1J;
        if (r6.A02) {
            int i4 = r15.A0D;
            if (i4 == 1) {
                i = R.string.f11nameremoved;
                if (A1U) {
                    i = R.string.f11nameremoved;
                }
            } else if (i4 == 5) {
                i = R.string.f11nameremoved;
                if (A1U) {
                    i = R.string.f11nameremoved;
                }
            } else if (i4 == 13) {
                i = R.string.f11nameremoved;
                if (A1U) {
                    i = R.string.f11nameremoved;
                }
            } else if (i4 == 8) {
                i = R.string.f11nameremoved;
            } else {
                i = R.string.f11nameremoved;
                if (A1U) {
                    i = R.string.f11nameremoved;
                }
            }
            objArr = AnonymousClass4L0.A0V(A0B, A002, 2);
        } else {
            C95814uZ r62 = r6.A00;
            if (r62 instanceof C95804uY) {
                A00 = new AnonymousClass3ZH(r62);
            } else {
                A00 = C64773Ex.A00(r11, r15.A0o());
            }
            String A0M = r12.A0M(A00);
            int i5 = r15.A0D;
            if (i5 == 9 || i5 == 10) {
                int i6 = R.string.f11nameremoved;
                if (A1U) {
                    i6 = R.string.f11nameremoved;
                }
                objArr = AnonymousClass0x9.A1X();
            } else {
                File file = r15.A01.A0F;
                if (A1U) {
                    if (file == null) {
                        i3 = R.string.f11nameremoved;
                    } else {
                        i2 = R.string.f11nameremoved;
                        objArr = new Object[3];
                    }
                } else if (file == null) {
                    i3 = R.string.f11nameremoved;
                } else {
                    i2 = R.string.f11nameremoved;
                    objArr = new Object[3];
                }
                Object[] A0V = AnonymousClass4L0.A0V(A0M, A0B, 4);
                A0V[2] = A002;
                long j = r15.A00;
                if (j <= 0) {
                    A03 = "";
                } else {
                    A03 = AnonymousClass35V.A03(r14, j);
                }
                return AnonymousClass002.A0F(context, A03, A0V, 3, i3);
            }
            objArr[0] = A0M;
            objArr[1] = A0B;
            objArr[2] = A002;
        }
        return context.getString(i, objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r4 == 10) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C30721mu r6, com.whatsapp.search.views.itemviews.AudioPlayerView r7, com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r8) {
        /*
            android.content.Context r5 = r8.getContext()
            X.2z0 r3 = r6.A1J
            boolean r2 = r3.A02
            int r4 = r6.A0D
            if (r2 == 0) goto L_0x0048
            r0 = 8
            if (r4 != r0) goto L_0x0041
            X.4uZ r0 = r3.A00
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 != 0) goto L_0x0041
        L_0x0016:
            r1 = 2131102659(0x7f060bc3, float:1.7817762E38)
        L_0x0019:
            r0 = r1
        L_0x001a:
            r8.setIconColorTint(r1)
            int r0 = X.AnonymousClass0Y8.A04(r5, r0)
            r7.setSeekbarColor(r0)
            X.33C r1 = X.C30471mV.A00(r6)
            boolean r0 = r1.A0c
            if (r0 != 0) goto L_0x0040
            boolean r0 = r1.A0R
            if (r0 != 0) goto L_0x0040
            boolean r0 = r6.A1B
            if (r0 == 0) goto L_0x003c
            if (r2 == 0) goto L_0x003c
            X.4uZ r0 = r3.A00
            boolean r0 = r0 instanceof X.AnonymousClass1fS
            if (r0 == 0) goto L_0x0040
        L_0x003c:
            r0 = 0
            r7.setSeekbarColor(r0)
        L_0x0040:
            return
        L_0x0041:
            r1 = 2131102660(0x7f060bc4, float:1.7817764E38)
            r0 = 2131099760(0x7f060070, float:1.7811882E38)
            goto L_0x001a
        L_0x0048:
            r0 = 9
            if (r4 == r0) goto L_0x0016
            r0 = 10
            r1 = 2131102658(0x7f060bc2, float:1.781776E38)
            if (r4 != r0) goto L_0x0019
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5YN.A02(X.1mu, com.whatsapp.search.views.itemviews.AudioPlayerView, com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView):void");
    }
}
