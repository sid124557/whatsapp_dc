package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.community.subgroup.views.CommunityViewGroupsView;
import com.whatsapp.conversationslist.ViewHolder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.4XG  reason: invalid class name */
public class AnonymousClass4XG extends AnonymousClass0R6 implements C186028ud {
    public List A00 = new CopyOnWriteArrayList();
    public final int A01;
    public final C116985rC A02;
    public final C116985rC A03;
    public final C53582nK A04;
    public final AnonymousClass2CJ A05;
    public final AnonymousClass2CK A06;
    public final C69263Wi A07;
    public final C56972sr A08;
    public final C625735q A09;
    public final C56962sq A0A;
    public final C56722sS A0B;
    public final C56942so A0C;
    public final C64653Ej A0D;
    public final C46352bU A0E;
    public final AnonymousClass33U A0F;
    public final AnonymousClass5UX A0G;
    public final C64773Ex A0H;
    public final AnonymousClass5ZU A0I;
    public final C105365Uq A0J;
    public final C53602nM A0K;
    public final C103445Mz A0L;
    public final C1230266t A0M;
    public final C620633i A0N;
    public final C56612sH A0O;
    public final C54292oU A0P;
    public final AnonymousClass33p A0Q;
    public final C620733j A0R;
    public final C56762sW A0S;
    public final C56542sA A0T;
    public final C56982ss A0U;
    public final C46962cU A0V;
    public final C56322rn A0W;
    public final C56152rV A0X;
    public final C620333f A0Y;
    public final AnonymousClass2R8 A0Z;
    public final C59862xc A0a;
    public final AnonymousClass1VX A0b;
    public final AnonymousClass3LP A0c;
    public final C52472lX A0d;
    public final C40532Gt A0e;
    public final C43642Sx A0f;
    public final C106195Xz A0g;
    public final AnonymousClass3LQ A0h;
    public final C1907099n A0i;
    public final AnonymousClass9U4 A0j;
    public final C195219Wq A0k;
    public final C50222hp A0l;
    public final AnonymousClass1R1 A0m;
    public final C56072rN A0n;
    public final C106715a2 A0o;
    public final C187958y5 A0p;
    public final AnonymousClass4FS A0q;
    public final C183538qC A0r;

    public static Object A00(AnonymousClass4XG r0, int i) {
        return ((C104125Pt) r0.A00.get(i)).A02;
    }

    public int A0G() {
        return this.A00.size();
    }

    public void A0K() {
        this.A07.A0S(new C71313bu((Object) this, 28));
    }

    public int B85(int i) {
        while (i >= 0) {
            if (BHh(i)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: X.5Re} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: X.5Rf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: X.5Re} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: X.5Re} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BNf(X.C05570Ua r20, int r21) {
        /*
            r19 = this;
            r12 = r20
            boolean r0 = r12 instanceof X.C197512k
            if (r0 == 0) goto L_0x0019
            r0 = r12
            X.12k r0 = (X.C197512k) r0
            android.view.View r2 = r0.A00
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131166392(0x7f0704b8, float:1.7947028E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.C86644Kx.A0z(r2, r0)
        L_0x0019:
            boolean r0 = r12 instanceof X.AnonymousClass4Y8
            r2 = r19
            r1 = r21
            if (r0 == 0) goto L_0x0039
            r3 = r12
            X.4Y8 r3 = (X.AnonymousClass4Y8) r3
            java.lang.Object r0 = A00(r2, r1)
            int r4 = X.AnonymousClass001.A0K(r0)
            r0 = 2
            com.whatsapp.WaTextView r3 = r3.A00
            if (r4 != r0) goto L_0x051d
            if (r3 == 0) goto L_0x0039
            r0 = 2131893859(0x7f121e63, float:1.9422506E38)
        L_0x0036:
            r3.setText(r0)
        L_0x0039:
            boolean r0 = r12 instanceof X.AnonymousClass4Y7
            if (r0 == 0) goto L_0x0051
            r0 = r12
            X.4Y7 r0 = (X.AnonymousClass4Y7) r0
            java.lang.Object r5 = A00(r2, r1)
            com.whatsapp.jid.GroupJid r5 = (com.whatsapp.jid.GroupJid) r5
            X.0yy r4 = r0.A00
            r4.A08 = r5
            X.4FS r3 = r4.A0B
            r0 = 17
            X.C70193a6.A01(r3, r4, r5, r0)
        L_0x0051:
            boolean r0 = r12 instanceof X.AnonymousClass4Y9
            if (r0 == 0) goto L_0x006a
            r0 = r12
            X.4Y9 r0 = (X.AnonymousClass4Y9) r0
            java.lang.Object r4 = A00(r2, r1)
            X.2jm r4 = (X.C51412jm) r4
            X.4Qq r3 = r0.A00
            com.whatsapp.jid.GroupJid r0 = r4.A00
            r3.A00 = r0
            android.view.View r3 = r3.A03
            r0 = 0
            X.C18310x6.A17(r3, r4, r0)
        L_0x006a:
            boolean r0 = r12 instanceof X.C197312i
            if (r0 == 0) goto L_0x013a
            X.12i r12 = (X.C197312i) r12
            java.lang.Object r15 = A00(r2, r1)
            X.2lD r15 = (X.C52272lD) r15
            int r6 = r2.A01
            X.2mC r3 = r15.A00
            com.whatsapp.jid.GroupJid r5 = r3.A02
            android.view.View r4 = r12.A0H
            android.content.Context r14 = r4.getContext()
            X.5YB r1 = r12.A05
            java.lang.String r0 = r3.A03
            com.whatsapp.TextEmojiLabel r2 = r1.A02
            r2.setText(r0)
            r1 = 2130969995(0x7f04058b, float:1.7548688E38)
            r0 = 2131101335(0x7f060697, float:1.7815077E38)
            X.AnonymousClass5Yj.A0B(r14, r2, r1, r0)
            r8 = 6
            if (r6 != r8) goto L_0x009c
            com.whatsapp.TextEmojiLabel r0 = r12.A02
            X.C106905aM.A04(r0)
        L_0x009c:
            X.3Ex r0 = r12.A08
            X.3ZH r2 = r0.A0A(r5)
            int r1 = r3.A00
            r0 = 3
            r7 = 0
            r3 = 8
            if (r1 != r0) goto L_0x00f9
            boolean r0 = X.C1001059l.A03
            r10 = 2131231003(0x7f08011b, float:1.8078075E38)
            if (r0 == 0) goto L_0x00b4
            r10 = 2131231004(0x7f08011c, float:1.8078077E38)
        L_0x00b4:
            android.widget.ImageView r9 = r12.A00
            X.2xc r8 = r12.A0C
            android.content.res.Resources r3 = r9.getResources()
            android.content.res.Resources$Theme r2 = X.C86614Ku.A0C(r9)
            r0 = 1
            X.6B0 r1 = new X.6B0
            r1.<init>(r0)
            X.1VX r0 = r8.A00
            android.graphics.drawable.Drawable r0 = X.C59862xc.A00(r2, r3, r1, r0, r10)
            r9.setImageDrawable(r0)
            com.whatsapp.TextEmojiLabel r1 = r12.A04
            r1.setVisibility(r7)
            android.widget.ImageView r0 = r12.A01
            r0.setVisibility(r7)
            r0 = 2131887952(0x7f120750, float:1.9410526E38)
            r1.setText(r0)
        L_0x00df:
            com.whatsapp.TextEmojiLabel r1 = r12.A03
            boolean r0 = r15.A02
            if (r0 != 0) goto L_0x00e7
            r7 = 8
        L_0x00e7:
            r1.setVisibility(r7)
            X.39l r13 = new X.39l
            r16 = r12
            r17 = r5
            r18 = r6
            r13.<init>(r14, r15, r16, r17, r18)
            r4.setOnClickListener(r13)
        L_0x00f8:
            return
        L_0x00f9:
            if (r1 != r8) goto L_0x0132
            boolean r0 = r2.A0g
            if (r0 != 0) goto L_0x0132
            X.1VX r1 = r12.A0D
            r0 = 5021(0x139d, float:7.036E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0132
            android.widget.ImageView r10 = r12.A00
            X.2xc r11 = r12.A0C
            android.content.res.Resources r9 = r10.getResources()
            android.content.res.Resources$Theme r8 = X.C86614Ku.A0C(r10)
            r0 = 1
            X.6B0 r2 = new X.6B0
            r2.<init>(r0)
            r1 = 2131231017(0x7f080129, float:1.8078103E38)
            X.1VX r0 = r11.A00
            android.graphics.drawable.Drawable r0 = X.C59862xc.A00(r8, r9, r2, r0, r1)
            r10.setImageDrawable(r0)
        L_0x0127:
            com.whatsapp.TextEmojiLabel r0 = r12.A04
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r12.A01
            r0.setVisibility(r3)
            goto L_0x00df
        L_0x0132:
            X.5Uq r1 = r12.A09
            android.widget.ImageView r0 = r12.A00
            r1.A08(r0, r2)
            goto L_0x0127
        L_0x013a:
            boolean r0 = r12 instanceof X.AnonymousClass4YD
            if (r0 == 0) goto L_0x017c
            X.4YD r12 = (X.AnonymousClass4YD) r12
            java.lang.Object r5 = A00(r2, r1)
            X.5Rf r5 = (X.C104505Rf) r5
            X.C18260x0.A0O(r12, r5)
            android.widget.ImageView r4 = r12.A00
            android.content.Context r3 = r4.getContext()
            boolean r2 = r5.A01
            r1 = 2131232106(0x7f08056a, float:1.8080312E38)
            if (r2 == 0) goto L_0x0159
            r1 = 2131232108(0x7f08056c, float:1.8080316E38)
        L_0x0159:
            r0 = 2131101268(0x7f060654, float:1.781494E38)
            X.C107335b8.A0C(r3, r4, r1, r0)
            com.whatsapp.TextEmojiLabel r1 = r12.A01
            r0 = 2131894148(0x7f121f84, float:1.9423093E38)
            if (r2 == 0) goto L_0x0169
            r0 = 2131894131(0x7f121f73, float:1.9423058E38)
        L_0x0169:
            r1.setText(r0)
            X.C106905aM.A04(r1)
            android.view.View r3 = r12.A0H
            r0 = 44
        L_0x0173:
            X.5eR r2 = new X.5eR
            r2.<init>(r5, r0)
        L_0x0178:
            r3.setOnClickListener(r2)
            return
        L_0x017c:
            boolean r0 = r12 instanceof X.AnonymousClass4YB
            if (r0 == 0) goto L_0x01a2
            X.4YB r12 = (X.AnonymousClass4YB) r12
            java.lang.Object r5 = A00(r2, r1)
            X.5Re r5 = (X.C104495Re) r5
            android.widget.TextView r4 = r12.A00
            android.content.res.Resources r3 = r4.getResources()
            r2 = 2131755340(0x7f10014c, float:1.9141557E38)
            int r1 = r5.A00
            java.lang.Object[] r0 = X.AnonymousClass002.A0L()
            X.AnonymousClass000.A1L(r0, r1)
            X.C86614Ku.A16(r3, r4, r0, r2, r1)
            android.view.View r3 = r12.A0H
            r0 = 47
            goto L_0x0173
        L_0x01a2:
            boolean r0 = r12 instanceof X.C197812n
            if (r0 == 0) goto L_0x01bc
            X.12n r12 = (X.C197812n) r12
            java.lang.Object r0 = A00(r2, r1)
            int r1 = X.AnonymousClass001.A0K(r0)
            X.0ys r0 = r12.A00
            java.lang.String r1 = X.C86624Kv.A0b(r0, r1)
            com.whatsapp.WaTextView r0 = r0.A01
            r0.setText(r1)
            return
        L_0x01bc:
            boolean r0 = r12 instanceof X.AnonymousClass4Y1
            if (r0 == 0) goto L_0x01ce
            java.lang.Object r1 = A00(r2, r1)
            android.view.View r3 = r12.A0H
            r0 = 34
            X.543 r2 = new X.543
            r2.<init>(r1, r0, r12)
            goto L_0x0178
        L_0x01ce:
            boolean r0 = r12 instanceof X.C88134Xl
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r12 instanceof X.C88374Ym
            if (r0 == 0) goto L_0x02bc
            X.4Ym r12 = (X.C88374Ym) r12
            java.lang.Object r5 = A00(r2, r1)
            X.5St r5 = (X.C104895St) r5
            X.33p r0 = r12.A09
            X.8qC r4 = r0.A01
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r4)
            java.lang.String r0 = "previous_last_seen_community_activity"
            r2 = 0
            long r9 = r1.getLong(r0, r2)
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r4)
            java.lang.String r0 = "last_seen_community_activity"
            long r7 = r1.getLong(r0, r2)
            X.31A r3 = r5.A00
            java.lang.String r6 = r3.A07()
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0227
            X.2qk r4 = r12.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Missing group subject for jid:"
            r1.append(r0)
            X.4uZ r0 = r3.A05()
            r1.append(r0)
            java.lang.String r0 = ". type:"
            r1.append(r0)
            int r0 = r3.A02
            java.lang.String r2 = X.AnonymousClass000.A0h(r1, r0)
            r1 = 1
            java.lang.String r0 = "ParentViewHolder/bind"
            r4.A0A(r0, r1, r2)
        L_0x0227:
            com.whatsapp.TextEmojiLabel r1 = r12.A03
            r0 = 0
            r1.A0K(r0, r6)
            X.3Ex r1 = r12.A07
            X.4uZ r0 = r3.A05()
            X.3ZH r2 = r1.A07(r0)
            if (r2 == 0) goto L_0x0254
            boolean r0 = r2.A0U()
            if (r0 == 0) goto L_0x024d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ParentViewHolder/displayContact"
            r1.append(r0)
            X.4uZ r0 = r2.A0H
            X.C18260x0.A0o(r0, r1)
        L_0x024d:
            X.5Uq r1 = r12.A08
            android.widget.ImageView r0 = r12.A01
            r1.A08(r0, r2)
        L_0x0254:
            boolean r6 = r5.A05
            android.widget.ImageView r1 = r12.A01
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L_0x025e
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x025e:
            r1.setAlpha(r0)
            long r2 = r3.A0I
            r4 = 0
            r1 = 8
            if (r6 == 0) goto L_0x02a3
            com.whatsapp.WaTextView r0 = r12.A04
            r0.setVisibility(r1)
            com.whatsapp.WaTextView r0 = r12.A05
            r0.setVisibility(r4)
        L_0x0272:
            android.view.View r1 = r12.A0H
            r0 = 46
            X.AnonymousClass0x2.A0z(r1, r5, r0)
            r0 = 5
            X.AnonymousClass692.A00(r1, r5, r0)
            boolean r3 = r5.A04
            boolean r0 = r12.A00
            if (r3 == r0) goto L_0x00f8
            r2 = 1
            r12.A00 = r3
            if (r3 == 0) goto L_0x0298
            int r0 = X.AnonymousClass5Yj.A05(r1)
            r1.setBackgroundResource(r0)
            com.whatsapp.components.SelectionCheckView r1 = r12.A06
            r1.setVisibility(r4)
        L_0x0294:
            r1.A06(r3, r2)
            return
        L_0x0298:
            r1.setBackgroundResource(r4)
            com.whatsapp.components.SelectionCheckView r1 = r12.A06
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0294
        L_0x02a3:
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x02b6
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x02b6
            com.whatsapp.WaTextView r0 = r12.A04
            r0.setVisibility(r4)
        L_0x02b0:
            com.whatsapp.WaTextView r0 = r12.A05
            r0.setVisibility(r1)
            goto L_0x0272
        L_0x02b6:
            com.whatsapp.WaTextView r0 = r12.A04
            r0.setVisibility(r1)
            goto L_0x02b0
        L_0x02bc:
            boolean r0 = r12 instanceof X.C196612b
            if (r0 == 0) goto L_0x02db
            java.lang.Object r0 = A00(r2, r1)
            X.31A r0 = (X.AnonymousClass31A) r0
            X.4uZ r0 = r0.A05()
            X.1fJ r1 = X.AnonymousClass34R.A01(r0)
            if (r1 == 0) goto L_0x00f8
            android.view.View r3 = r12.A0H
            r0 = 19
            X.5ef r2 = new X.5ef
            r2.<init>(r12, r0, r1)
            goto L_0x0178
        L_0x02db:
            boolean r0 = r12 instanceof com.whatsapp.conversationslist.ViewHolder
            if (r0 == 0) goto L_0x02f5
            com.whatsapp.conversationslist.ViewHolder r12 = (com.whatsapp.conversationslist.ViewHolder) r12
            java.lang.Object r13 = A00(r2, r1)
            X.4zQ r13 = (X.C97884zQ) r13
            int r0 = r2.A01
            r14 = 0
            r18 = 0
            r15 = r14
            r17 = r1
            r16 = r0
            r12.A0D(r13, r14, r15, r16, r17, r18)
            return
        L_0x02f5:
            boolean r0 = r12 instanceof X.AnonymousClass4Y2
            if (r0 == 0) goto L_0x0387
            X.4Y2 r12 = (X.AnonymousClass4Y2) r12
            java.lang.Object r5 = A00(r2, r1)
            X.1fJ r5 = (X.C27991fJ) r5
            X.4Rd r4 = r12.A00
            r4.A0A = r5
            X.3Ex r0 = r4.A05
            X.3ZH r3 = r0.A0A(r5)
            X.2lX r2 = r4.A09
            boolean r7 = r2.A00(r3)
            r6 = 0
            r1 = 8
            android.view.View r0 = r4.A0F
            if (r7 == 0) goto L_0x0379
            r0.setVisibility(r6)
            android.view.View r0 = r4.A0J
            r0.setVisibility(r1)
            android.view.View r0 = r4.A0G
            r0.setVisibility(r6)
        L_0x0325:
            X.1fJ r0 = r4.A0A
            if (r0 == 0) goto L_0x0336
            boolean r0 = r2.A00(r3)
            android.view.View r1 = r4.A0H
            int r0 = X.C86614Ku.A01(r0)
            r1.setVisibility(r0)
        L_0x0336:
            X.2sj r6 = r4.A07
            boolean r0 = r6.A0H(r5)
            if (r0 == 0) goto L_0x0374
            boolean r0 = r2.A00(r3)
            if (r0 != 0) goto L_0x0374
            android.view.View r1 = r4.A0E
            r0 = 0
        L_0x0347:
            r1.setVisibility(r0)
            X.1VX r1 = r4.A08
            r0 = 3829(0xef5, float:5.366E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x036f
            X.2Vj r0 = r4.A02
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x036f
            boolean r0 = r6.A0D(r5)
            if (r0 == 0) goto L_0x036f
            boolean r0 = r2.A00(r3)
            if (r0 != 0) goto L_0x036f
            X.5UY r1 = r4.A0L
            r0 = 0
        L_0x036b:
            r1.A06(r0)
            return
        L_0x036f:
            X.5UY r1 = r4.A0L
            r0 = 8
            goto L_0x036b
        L_0x0374:
            android.view.View r1 = r4.A0E
            r0 = 8
            goto L_0x0347
        L_0x0379:
            r0.setVisibility(r1)
            android.view.View r0 = r4.A0J
            r0.setVisibility(r6)
            android.view.View r0 = r4.A0G
            r0.setVisibility(r1)
            goto L_0x0325
        L_0x0387:
            boolean r0 = r12 instanceof X.AnonymousClass4Y3
            if (r0 == 0) goto L_0x047f
            X.4Y3 r12 = (X.AnonymousClass4Y3) r12
            java.lang.Object r5 = A00(r2, r1)
            X.2jl r5 = (X.C51402jl) r5
            X.4R3 r6 = r12.A00
            X.34x r2 = r5.A00
            com.whatsapp.TextEmojiLabel r4 = r6.A04
            X.2sr r0 = r6.A00
            boolean r0 = X.C627636p.A0S(r0, r2)
            if (r0 == 0) goto L_0x0476
            X.35q r1 = r6.A01
            boolean r0 = r2 instanceof X.C31581oW
            if (r0 == 0) goto L_0x0435
            X.1oW r2 = (X.C31581oW) r2
            int r3 = r2.A00
            java.util.Set r0 = r2.A03
        L_0x03ad:
            r11 = 3
            java.util.List r7 = X.C625735q.A03(r0, r11)
            android.util.Pair r12 = X.C625735q.A01(r7, r3)
            int r2 = X.C18280x3.A03(r12)
            r10 = 0
            r9 = 1
            if (r2 == r9) goto L_0x0422
            r8 = 2
            if (r2 == r8) goto L_0x0410
            if (r2 == r11) goto L_0x03fb
            r0 = 4
            if (r2 == r0) goto L_0x03e1
            android.content.res.Resources r1 = X.C625735q.A00(r1)
            int[] r0 = X.C625735q.A0S
            r0 = r0[r10]
            java.lang.String r1 = X.AnonymousClass0x2.A0Y(r1, r3, r10, r0)
        L_0x03d2:
            r0 = 0
            r4.A0K(r0, r1)
            r1 = 35
            X.543 r0 = new X.543
            r0.<init>(r5, r1, r6)
            r6.setOnClickListener(r0)
            return
        L_0x03e1:
            android.content.res.Resources r9 = X.C625735q.A00(r1)
            int[] r0 = X.C625735q.A0S
            r3 = r0[r11]
            int r2 = X.C18290x4.A03(r12)
            java.lang.Object[] r1 = new java.lang.Object[r11]
            X.C18290x4.A1T(r7, r1)
            java.lang.Object r0 = r12.second
            r1[r8] = r0
            java.lang.String r1 = r9.getQuantityString(r3, r2, r1)
            goto L_0x03d2
        L_0x03fb:
            android.content.res.Resources r2 = X.C625735q.A00(r1)
            int[] r0 = X.C625735q.A0S
            r1 = r0[r11]
            java.lang.Object[] r0 = new java.lang.Object[r11]
            X.C18290x4.A1T(r7, r0)
            X.AnonymousClass000.A1P(r0, r9, r8)
            java.lang.String r1 = r2.getQuantityString(r1, r9, r0)
            goto L_0x03d2
        L_0x0410:
            android.content.res.Resources r2 = X.C625735q.A00(r1)
            int[] r0 = X.C625735q.A0S
            r1 = r0[r8]
            java.lang.Object[] r0 = new java.lang.Object[r8]
            X.C18290x4.A1T(r7, r0)
            java.lang.String r1 = r2.getString(r1, r0)
            goto L_0x03d2
        L_0x0422:
            android.content.res.Resources r3 = X.C625735q.A00(r1)
            int[] r0 = X.C625735q.A0S
            r2 = r0[r9]
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.Object r0 = r7.get(r10)
            java.lang.String r1 = X.C18320x8.A0b(r3, r0, r1, r10, r2)
            goto L_0x03d2
        L_0x0435:
            boolean r0 = r2 instanceof X.C31841ow
            if (r0 == 0) goto L_0x0449
            X.1ow r2 = (X.C31841ow) r2
            java.util.HashSet r0 = r2.A20()
            int r3 = r0.size()
            java.util.HashSet r0 = r2.A20()
            goto L_0x03ad
        L_0x0449:
            boolean r0 = X.C627636p.A0n(r2)
            if (r0 == 0) goto L_0x0473
            java.lang.String r3 = r2.A13()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x046a
            android.content.res.Resources r2 = X.C625735q.A00(r1)
            r1 = 2131894146(0x7f121f82, float:1.9423089E38)
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r3)
            java.lang.String r1 = r2.getString(r1, r0)
            goto L_0x03d2
        L_0x046a:
            X.1mI r2 = (X.C30341mI) r2
            r0 = 0
            java.lang.String r1 = r1.A0O(r2, r0)
            goto L_0x03d2
        L_0x0473:
            r1 = 0
            goto L_0x03d2
        L_0x0476:
            java.lang.String r1 = "CommunityActivityView/unexpected community activity"
            r0 = 0
            X.C626936e.A0D(r0, r1)
            r1 = 0
            goto L_0x03d2
        L_0x047f:
            boolean r0 = r12 instanceof X.AnonymousClass4Y4
            if (r0 == 0) goto L_0x04af
            X.4Y4 r12 = (X.AnonymousClass4Y4) r12
            java.lang.Object r0 = A00(r2, r1)
            X.1fJ r0 = (X.C27991fJ) r0
            r4 = 0
            X.C162457s7.A0J(r0, r4)
            X.4R9 r3 = r12.A00
            r3.A02 = r0
            X.1VX r1 = r3.getAbProps$community_consumerBeta()
            r0 = 3829(0xef5, float:5.366E-42)
            boolean r0 = r1.A0X(r0)
            X.5UY r2 = r3.A08
            if (r0 == 0) goto L_0x0524
            r2.A06(r4)
            r1 = 49
            X.5eR r0 = new X.5eR
            r0.<init>(r3, r1)
            r2.A07(r0)
            return
        L_0x04af:
            boolean r0 = r12 instanceof X.AnonymousClass4Y6
            if (r0 == 0) goto L_0x04c4
            X.4Y6 r12 = (X.AnonymousClass4Y6) r12
            java.lang.Object r1 = A00(r2, r1)
            X.1fJ r1 = (X.C27991fJ) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            com.whatsapp.community.subgroup.views.CommunityViewGroupsView r0 = r12.A00
            r0.A02 = r1
            return
        L_0x04c4:
            boolean r0 = r12 instanceof X.AnonymousClass4Y5
            if (r0 == 0) goto L_0x04da
            X.4Y5 r12 = (X.AnonymousClass4Y5) r12
            java.lang.Object r1 = A00(r2, r1)
            X.1fJ r1 = (X.C27991fJ) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            X.4Rg r0 = r12.A00
            r0.A00(r1)
            return
        L_0x04da:
            boolean r0 = r12 instanceof X.AnonymousClass4YA
            if (r0 == 0) goto L_0x00f8
            X.4YA r12 = (X.AnonymousClass4YA) r12
            java.lang.Object r6 = A00(r2, r1)
            X.5SR r6 = (X.AnonymousClass5SR) r6
            r5 = 0
            X.C162457s7.A0J(r6, r5)
            X.4Qr r4 = r12.A00
            r0 = 1
            X.C18310x6.A17(r4, r6, r0)
            X.20T r0 = r6.A01
            int r0 = r0.ordinal()
            r1 = 2131890658(0x7f1211e2, float:1.9416014E38)
            r3 = 2131755186(0x7f1000b2, float:1.9141244E38)
            if (r0 == r5) goto L_0x0504
            r1 = 2131890665(0x7f1211e9, float:1.9416028E38)
            r3 = 2131755188(0x7f1000b4, float:1.9141248E38)
        L_0x0504:
            com.whatsapp.WaTextView r0 = r4.A02
            if (r0 == 0) goto L_0x050b
            r0.setText(r1)
        L_0x050b:
            com.whatsapp.TextEmojiLabel r2 = r4.A00
            if (r2 == 0) goto L_0x00f8
            android.content.res.Resources r1 = r4.getResources()
            int r0 = r6.A00
            java.lang.String r0 = X.AnonymousClass0x2.A0Y(r1, r0, r5, r3)
            r2.setText(r0)
            return
        L_0x051d:
            if (r3 == 0) goto L_0x0039
            r0 = 2131888898(0x7f120b02, float:1.9412444E38)
            goto L_0x0036
        L_0x0524:
            r0 = 8
            r2.A06(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XG.BNf(X.0Ua, int):void");
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        LayoutInflater A0D2 = C18280x3.A0D(viewGroup2);
        switch (i) {
            case 1:
                return new AnonymousClass4Y7(new C19200yy(C86664Kz.A0S(viewGroup2)));
            case 2:
                return new AnonymousClass4Y9(new C87384Qq(C86664Kz.A0S(viewGroup2)));
            case 3:
                return new C197812n(new C19170ys(C86664Kz.A0S(viewGroup2)));
            case 4:
                C107075ae r59 = C107075ae.A00;
                Context A0S2 = C86664Kz.A0S(viewGroup2);
                C54292oU r36 = this.A0P;
                C56612sH r35 = this.A0O;
                AnonymousClass1VX r47 = this.A0b;
                C69263Wi r67 = this.A07;
                C106195Xz r52 = this.A0g;
                C56972sr r66 = this.A08;
                AnonymousClass4FS r60 = this.A0q;
                C56722sS r65 = this.A0B;
                C56982ss r41 = this.A0U;
                AnonymousClass3LP r48 = this.A0c;
                C195219Wq r55 = this.A0k;
                AnonymousClass5UX r64 = this.A0G;
                C64773Ex r63 = this.A0H;
                C53582nK r62 = this.A04;
                C46962cU r42 = this.A0V;
                C620633i r29 = this.A0N;
                AnonymousClass5ZU r28 = this.A0I;
                C620733j r27 = this.A0R;
                C56072rN r26 = this.A0n;
                AnonymousClass9U4 r24 = this.A0j;
                C56962sq r25 = this.A0A;
                C56152rV r23 = this.A0X;
                C116985rC r22 = this.A03;
                C52472lX r21 = this.A0d;
                C56762sW r20 = this.A0S;
                AnonymousClass1R1 r19 = this.A0m;
                C620333f r15 = this.A0Y;
                AnonymousClass2R8 r14 = this.A0Z;
                AnonymousClass33p r13 = this.A0Q;
                C56942so r12 = this.A0C;
                C56322rn r11 = this.A0W;
                C1907099n r10 = this.A0i;
                C625735q r8 = this.A09;
                View A0R2 = AnonymousClass001.A0R(C18280x3.A0D(viewGroup2), viewGroup2, R.layout.f8nameremoved);
                C105365Uq r7 = this.A0J;
                C103445Mz r6 = this.A0L;
                C116985rC r5 = this.A02;
                C1230266t r4 = this.A0M;
                C50222hp r3 = this.A0l;
                C43642Sx r2 = this.A0f;
                return new ViewHolder(A0S2, A0R2, r22, r5, r62, r67, r66, r8, r25, r65, r12, r64, r63, r28, r7, r6, r4, r29, r35, r36, r13, r27, r20, this.A0T, r41, r42, r11, r23, r15, r14, r47, r48, r21, this.A0e, r2, r52, r10, r24, r55, r3, r19, r26, r59, r60, this.A0r);
            case 5:
                AnonymousClass2CK r210 = this.A06;
                View inflate = A0D2.inflate(R.layout.f8nameremoved, viewGroup2, false);
                C105365Uq r82 = this.A0J;
                C64333Db r1 = r210.A00.A03;
                AnonymousClass1VX A4B = C64333Db.A4B(r1);
                AnonymousClass4FS A8y = C64333Db.A8y(r1);
                C56982ss A39 = C64333Db.A39(r1);
                C64773Ex A26 = C64333Db.A26(r1);
                C56942so A1k = C64333Db.A1k(r1);
                C56892sj A3G = C64333Db.A3G(r1);
                return new C197312i(inflate, C86614Ku.A0N(r1), A1k, C86654Ky.A0X(r1), A26, r82, A39, A3G, (C59862xc) r1.APF.get(), A4B, A8y);
            case 6:
                return new AnonymousClass4YB(A0D2.inflate(R.layout.f8nameremoved, viewGroup2, false));
            case 7:
                return new C88134Xl(A0D2.inflate(R.layout.f8nameremoved, viewGroup2, false), this.A0D, this.A0a);
            case 8:
                AnonymousClass2CJ r211 = this.A05;
                View inflate2 = A0D2.inflate(R.layout.f8nameremoved, viewGroup2, false);
                C105365Uq r68 = this.A0J;
                C64333Db r0 = r211.A00.A03;
                return new C88374Ym(inflate2, C64333Db.A01(r0), C64333Db.A26(r0), r68, C64333Db.A2s(r0));
            case 9:
                return new C196612b(A0D2.inflate(R.layout.f8nameremoved, viewGroup2, false), this.A0D, this.A0R, this.A0b);
            case 10:
                C106715a2 r102 = this.A0o;
                C620633i r83 = this.A0N;
                return new C197512k(C86604Kt.A0D(viewGroup2).inflate(R.layout.f8nameremoved, viewGroup2, false), this.A0D, this.A0K, r83, this.A0R, this.A0b, r102);
            case 11:
                return new AnonymousClass4Y2(new AnonymousClass4Rd(C86664Kz.A0S(viewGroup2)));
            case 12:
                return new AnonymousClass4Y1(C86604Kt.A0D(viewGroup2).inflate(R.layout.f8nameremoved, viewGroup2, false), this.A0D);
            case 13:
                return new AnonymousClass4Y3(new AnonymousClass4R3(C86664Kz.A0S(viewGroup2)));
            case 14:
                return C197812n.A00(viewGroup2);
            case 15:
                return new AnonymousClass4Y4(new AnonymousClass4R9(C86614Ku.A0B(viewGroup2)));
            case 16:
                View inflate3 = C86604Kt.A0D(viewGroup2).inflate(R.layout.f8nameremoved, viewGroup2, false);
                C162457s7.A0K(inflate3, "null cannot be cast to non-null type com.whatsapp.community.subgroup.views.CommunityViewGroupsView");
                return new AnonymousClass4Y6((CommunityViewGroupsView) inflate3);
            case 17:
                return new AnonymousClass4Y5(new AnonymousClass4Rg(C86614Ku.A0B(viewGroup2)));
            case 18:
                View inflate4 = C86604Kt.A0D(viewGroup2).inflate(R.layout.f8nameremoved, viewGroup2, false);
                C162457s7.A0H(inflate4);
                return new AnonymousClass4Y8(inflate4);
            case 19:
                return new AnonymousClass4YA(new C87394Qr(C86614Ku.A0B(viewGroup2)));
            case 20:
                return new AnonymousClass4YD(A0D2.inflate(R.layout.f8nameremoved, viewGroup2, false));
            default:
                return new C95344tU(new View(viewGroup2.getContext()));
        }
    }

    public boolean BoH() {
        return true;
    }

    public int getItemViewType(int i) {
        if (i < 0) {
            return -1;
        }
        List list = this.A00;
        if (i < list.size()) {
            return ((C104125Pt) list.get(i)).A00;
        }
        return -1;
    }

    public long A0B(int i) {
        Object[] A0M2 = AnonymousClass002.A0M();
        List list = this.A00;
        AnonymousClass000.A1L(A0M2, ((C104125Pt) list.get(i)).A00);
        return (long) C18310x6.A08(((C104125Pt) list.get(i)).A02, A0M2, 1);
    }

    public void A0L(C95814uZ r5) {
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        while (true) {
            List list = this.A00;
            if (i < list.size()) {
                if (r5.equals(((C104125Pt) list.get(i)).A01)) {
                    C18270x1.A1K(A0s, i);
                }
                i++;
            } else {
                this.A07.BkS(new C70193a6(this, 16, A0s));
                return;
            }
        }
    }

    public void A0M(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        while (true) {
            List list2 = this.A00;
            if (i < list2.size()) {
                if (list.contains(((C104125Pt) list2.get(i)).A01)) {
                    C18270x1.A1K(A0s, i);
                }
                i++;
            } else {
                this.A07.BkS(new C70193a6(this, 16, A0s));
                return;
            }
        }
    }

    public void A0N(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.addAll(list);
        List list2 = this.A00;
        C18280x3.A0s(new C87744Vq(list2, A0s), this, A0s, list2);
    }

    public boolean BHh(int i) {
        if (getItemViewType(i) == 3 || getItemViewType(i) == 14) {
            return true;
        }
        return false;
    }

    public AnonymousClass4XG(C116985rC r4, C116985rC r5, C53582nK r6, AnonymousClass2CJ r7, AnonymousClass2CK r8, C69263Wi r9, C56972sr r10, C625735q r11, C56962sq r12, C56722sS r13, C56942so r14, C64653Ej r15, C46352bU r16, AnonymousClass33U r17, AnonymousClass5UX r18, C64773Ex r19, AnonymousClass5ZU r20, C105365Uq r21, C53602nM r22, C1230266t r23, C620633i r24, C56612sH r25, C54292oU r26, AnonymousClass33p r27, C620733j r28, C56762sW r29, C56542sA r30, C56982ss r31, C46962cU r32, C56322rn r33, C56152rV r34, C620333f r35, AnonymousClass2R8 r36, C59862xc r37, AnonymousClass1VX r38, AnonymousClass3LP r39, C52472lX r40, C40532Gt r41, C43642Sx r42, C106195Xz r43, AnonymousClass3LQ r44, C1907099n r45, AnonymousClass9U4 r46, C195219Wq r47, C50222hp r48, AnonymousClass1R1 r49, C56072rN r50, C106715a2 r51, C187958y5 r52, AnonymousClass4FS r53, C183538qC r54, int i) {
        this.A0D = r15;
        this.A0O = r25;
        this.A0b = r38;
        this.A07 = r9;
        this.A0g = r43;
        this.A0o = r51;
        this.A08 = r10;
        this.A0P = r26;
        AnonymousClass4FS r0 = r53;
        this.A0q = r0;
        this.A0B = r13;
        this.A0U = r31;
        this.A0c = r39;
        this.A0k = r47;
        this.A0p = r52;
        this.A0G = r18;
        this.A04 = r6;
        this.A0H = r19;
        this.A0V = r32;
        this.A0N = r24;
        this.A0R = r28;
        this.A0I = r20;
        this.A0n = r50;
        this.A0j = r46;
        this.A0A = r12;
        this.A0X = r34;
        this.A0h = r44;
        this.A03 = r4;
        this.A0d = r40;
        this.A0S = r29;
        this.A0m = r49;
        this.A0J = r21;
        this.A0a = r37;
        this.A0Y = r35;
        this.A0Z = r36;
        this.A0Q = r27;
        this.A0C = r14;
        this.A0F = r17;
        this.A0E = r16;
        this.A0W = r33;
        this.A0K = r22;
        this.A0i = r45;
        this.A05 = r7;
        this.A09 = r11;
        this.A02 = r5;
        this.A0M = r23;
        this.A06 = r8;
        this.A0L = new C103445Mz(new C72173dI(r0, true));
        this.A01 = i;
        this.A0l = r48;
        this.A0f = r42;
        this.A0e = r41;
        this.A0r = r54;
        this.A0T = r30;
        A0E(true);
    }
}
