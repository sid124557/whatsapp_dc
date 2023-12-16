package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.ConversationListRowHeaderView;
import com.whatsapp.conversationslist.ViewHolder;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.util.List;

/* renamed from: X.5ZN  reason: invalid class name */
public abstract class AnonymousClass5ZN {
    public C52762m0 A00;
    public final Context A01;
    public final C56972sr A02;
    public final C625735q A03;
    public final C56962sq A04;
    public final C64773Ex A05;
    public final AnonymousClass5ZU A06;
    public final C1230266t A07;
    public final ViewHolder A08;
    public final C620633i A09;
    public final C56612sH A0A;
    public final C54292oU A0B;
    public final C620733j A0C;
    public final C56982ss A0D;
    public final C46962cU A0E;
    public final AnonymousClass1VX A0F;
    public final AnonymousClass3LP A0G;
    public final C52472lX A0H;
    public final C106195Xz A0I;
    public final C1907099n A0J;
    public final AnonymousClass9U4 A0K;
    public final C195219Wq A0L;
    public final C50222hp A0M;
    public final C56072rN A0N;
    public final C107075ae A0O;
    public final C183538qC A0P;

    public static Drawable A03(Context context, AnonymousClass5ZN r4, int i) {
        Drawable A042 = C107335b8.A04(context, i, R.color.f5nameremoved);
        ImageView imageView = r4.A08.A0D;
        imageView.setVisibility(0);
        imageView.setImageDrawable(A042);
        return A042;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:384:0x07cd, code lost:
        if (r0 == false) goto L_0x07cf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x03eb  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x04f5  */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x097f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair A05(X.C624134x r14) {
        /*
            r13 = this;
            boolean r9 = X.C1001059l.A04
            boolean r0 = r14 instanceof X.C30481mW
            r1 = 5
            r8 = 1
            r2 = 0
            r3 = 0
            java.lang.String r7 = ""
            if (r0 == 0) goto L_0x00b7
            boolean r0 = r14 instanceof X.C31931p6
            if (r0 == 0) goto L_0x003c
            r2 = r14
            X.1p6 r2 = (X.C31931p6) r2
            android.content.Context r1 = r13.A01
            java.lang.String r7 = A04(r1, r2)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A08
            android.widget.ImageView r0 = r0.A0D
            android.graphics.drawable.Drawable r3 = A02(r1, r0, r2)
        L_0x0021:
            android.content.Context r4 = r13.A01
            X.5Xz r2 = r13.A0I
            java.util.List r0 = r14.A18
            if (r0 == 0) goto L_0x0037
            android.text.SpannableStringBuilder r7 = X.C18330xA.A00(r7)
            java.util.List r1 = r14.A18
            X.5np r0 = new X.5np
            r0.<init>(r4)
            r2.A06(r7, r0, r1)
        L_0x0037:
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r3, r7)
            return r0
        L_0x003c:
            boolean r0 = X.AnonymousClass353.A04(r14)
            if (r0 == 0) goto L_0x006b
            java.lang.String r1 = X.AnonymousClass353.A01(r14)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x004d
            r7 = r1
        L_0x004d:
            boolean r0 = X.C624134x.A0a(r14)
            if (r0 != 0) goto L_0x0021
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "*"
            r1.append(r0)
            java.lang.String r0 = r14.A13()
            r1.append(r0)
            java.lang.String r0 = "*\n\n"
            java.lang.String r4 = X.AnonymousClass000.A0V(r0, r7, r1)
            goto L_0x0195
        L_0x006b:
            X.34w r4 = r14.A0P
            if (r4 != 0) goto L_0x04f1
            boolean r1 = r14 instanceof X.AnonymousClass1p5
            r0 = r14
            X.1mW r0 = (X.C30481mW) r0
            if (r1 == 0) goto L_0x00b1
            java.lang.String r4 = r0.A1w()
            r0 = r14
            X.1p5 r0 = (X.AnonymousClass1p5) r0
            X.2cm r2 = r0.A00
            X.1VX r1 = r13.A0F
            r0 = 6673(0x1a11, float:9.351E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0195
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x0195
            java.lang.String r1 = r2.A04
            java.lang.String r0 = "AUTHENTICATION"
            boolean r0 = java.util.Objects.equals(r1, r0)
            if (r0 == 0) goto L_0x0195
            X.2sr r0 = r13.A02
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x0195
            android.content.Context r1 = r13.A01
            r0 = 2131234163(0x7f080d73, float:1.8084484E38)
            android.graphics.drawable.Drawable r3 = A03(r1, r13, r0)
            r0 = 2131891558(0x7f121566, float:1.941784E38)
            java.lang.String r4 = X.AnonymousClass0x2.A0X(r1, r7, r8, r0)
            goto L_0x0195
        L_0x00b1:
            java.lang.String r7 = r0.A1w()
            goto L_0x0021
        L_0x00b7:
            boolean r0 = r14 instanceof X.C30341mI
            r4 = 2
            r5 = 8
            if (r0 == 0) goto L_0x0107
            r7 = r14
            X.1mI r7 = (X.C30341mI) r7
            com.whatsapp.conversationslist.ViewHolder r6 = r13.A08
            android.view.View r1 = r6.A08
            int r5 = r7.A00
            r0 = 8
            if (r5 != r4) goto L_0x00cc
            r0 = 0
        L_0x00cc:
            r1.setVisibility(r0)
            android.content.Context r3 = r13.A01
            X.35q r1 = r13.A03
            r0 = 3
            if (r5 != r0) goto L_0x00fc
            r0 = 2131889815(0x7f120e97, float:1.9414304E38)
        L_0x00d9:
            java.lang.String r7 = r3.getString(r0)
        L_0x00dd:
            r0 = 2131231920(0x7f0804b0, float:1.8079935E38)
            android.graphics.drawable.Drawable r3 = X.C107335b8.A01(r3, r0)
            android.widget.ImageView r1 = r6.A0D
            r0 = 163(0xa3, float:2.28E-43)
            if (r5 == r0) goto L_0x00f4
            r0 = 162(0xa2, float:2.27E-43)
            if (r5 == r0) goto L_0x00f4
            r0 = 164(0xa4, float:2.3E-43)
            if (r5 == r0) goto L_0x00f4
            r2 = 8
        L_0x00f4:
            r1.setVisibility(r2)
            r1.setImageDrawable(r3)
            goto L_0x0021
        L_0x00fc:
            if (r5 != r4) goto L_0x0102
            r0 = 2131889816(0x7f120e98, float:1.9414306E38)
            goto L_0x00d9
        L_0x0102:
            java.lang.String r7 = r1.A0O(r7, r2)
            goto L_0x00dd
        L_0x0107:
            boolean r0 = r14 instanceof X.AnonymousClass4DV
            if (r0 == 0) goto L_0x0130
            X.2hp r1 = r13.A0M
            r0 = r14
            X.4DV r0 = (X.AnonymousClass4DV) r0
            X.315 r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x0021
            android.content.Context r0 = r13.A01
            java.lang.String r7 = r1.A0A(r0)
            android.graphics.drawable.Drawable r3 = r1.A03(r0)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A08
            android.widget.ImageView r0 = r0.A0D
            if (r3 != 0) goto L_0x0128
            r2 = 8
        L_0x0128:
            r0.setVisibility(r2)
            r0.setImageDrawable(r3)
            goto L_0x0021
        L_0x0130:
            boolean r0 = r14 instanceof X.AnonymousClass4FG
            if (r0 == 0) goto L_0x0149
            r2 = r14
            X.4FG r2 = (X.AnonymousClass4FG) r2
            int r1 = X.AnonymousClass25Z.A00(r2)
            if (r1 == 0) goto L_0x0143
            android.content.Context r0 = r13.A01
            android.graphics.drawable.Drawable r3 = A03(r0, r13, r1)
        L_0x0143:
            java.lang.String r7 = r2.BBe()
            goto L_0x0021
        L_0x0149:
            boolean r0 = r14 instanceof X.AnonymousClass1n2
            if (r0 == 0) goto L_0x01ad
            boolean r0 = r14 instanceof X.C30771mz
            android.content.Context r1 = r13.A01
            if (r0 == 0) goto L_0x0198
            r0 = 2131233202(0x7f0809b2, float:1.8082535E38)
            if (r9 == 0) goto L_0x015b
            r0 = 2131233203(0x7f0809b3, float:1.8082537E38)
        L_0x015b:
            android.graphics.drawable.Drawable r3 = A03(r1, r13, r0)
            r4 = r14
            X.1mz r4 = (X.C30771mz) r4
            java.lang.String r7 = r4.A09
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x018e
            java.lang.String r1 = r4.A02
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = " "
            if (r0 != 0) goto L_0x017c
            java.lang.StringBuilder r0 = X.C18290x4.A0v(r7)
            java.lang.String r7 = X.AnonymousClass000.A0V(r2, r1, r0)
        L_0x017c:
            java.lang.String r1 = r4.A05
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0021
            java.lang.StringBuilder r0 = X.C18290x4.A0v(r7)
            java.lang.String r7 = X.AnonymousClass000.A0V(r2, r1, r0)
            goto L_0x0021
        L_0x018e:
            r0 = 2131886478(0x7f12018e, float:1.9407536E38)
            java.lang.String r4 = r1.getString(r0)
        L_0x0195:
            r7 = r4
            goto L_0x0021
        L_0x0198:
            r0 = 2131233178(0x7f08099a, float:1.8082486E38)
            if (r9 == 0) goto L_0x01a0
            r0 = 2131233179(0x7f08099b, float:1.8082488E38)
        L_0x01a0:
            android.graphics.drawable.Drawable r3 = A03(r1, r13, r0)
            r0 = r14
            X.1n2 r0 = (X.AnonymousClass1n2) r0
            java.lang.String r7 = X.C106485Ze.A01(r1, r0)
            goto L_0x0021
        L_0x01ad:
            boolean r0 = r14 instanceof X.AnonymousClass1nF
            if (r0 == 0) goto L_0x0230
            r4 = r14
            X.1nF r4 = (X.AnonymousClass1nF) r4
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A08
            android.widget.ImageView r5 = r0.A0D
            r5.setVisibility(r2)
            boolean r0 = X.AnonymousClass31H.A02(r14)
            if (r0 == 0) goto L_0x01d8
            android.content.Context r1 = r13.A01
            r0 = 2131233162(0x7f08098a, float:1.8082454E38)
            if (r9 == 0) goto L_0x01cb
            r0 = 2131233163(0x7f08098b, float:1.8082456E38)
        L_0x01cb:
            android.graphics.drawable.Drawable r3 = X.C107335b8.A01(r1, r0)
            r5.setImageDrawable(r3)
            java.lang.String r7 = X.C615731j.A01(r1, r14)
            goto L_0x0021
        L_0x01d8:
            android.content.Context r2 = r13.A01
            r0 = 2131233165(0x7f08098d, float:1.808246E38)
            if (r9 == 0) goto L_0x01e2
            r0 = 2131233166(0x7f08098e, float:1.8082462E38)
        L_0x01e2:
            android.graphics.drawable.Drawable r3 = X.C107335b8.A01(r2, r0)
            r5.setImageDrawable(r3)
            java.lang.String r1 = X.AnonymousClass353.A01(r14)
            java.lang.String r7 = r4.A01
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x0021
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x020c
            java.lang.String r0 = r4.A1x()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0228
            r0 = 2131888300(0x7f1208ac, float:1.9411231E38)
            java.lang.String r1 = r2.getString(r0)
        L_0x020c:
            int r0 = r4.A00
            if (r0 == 0) goto L_0x022d
            java.lang.StringBuilder r1 = X.C18290x4.A0v(r1)
            java.lang.String r0 = " ("
            r1.append(r0)
            X.33j r0 = r13.A0C
            java.lang.String r0 = X.C107105ah.A01(r0, r4)
            r1.append(r0)
            java.lang.String r7 = X.AnonymousClass000.A0e(r1)
            goto L_0x0021
        L_0x0228:
            java.lang.String r1 = r4.A1x()
            goto L_0x020c
        L_0x022d:
            r7 = r1
            goto L_0x0021
        L_0x0230:
            boolean r0 = r14 instanceof X.C30721mu
            if (r0 == 0) goto L_0x0278
            r3 = r14
            X.1mu r3 = (X.C30721mu) r3
            boolean r0 = r14 instanceof X.C30711mt
            if (r0 == 0) goto L_0x024e
            r2 = r14
            X.1mt r2 = (X.C30711mt) r2
            android.content.Context r1 = r13.A01
            java.lang.String r7 = A04(r1, r2)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A08
            android.widget.ImageView r0 = r0.A0D
            android.graphics.drawable.Drawable r3 = A02(r1, r0, r2)
            goto L_0x0021
        L_0x024e:
            int r0 = r3.A09
            if (r0 != r8) goto L_0x050c
            int r0 = r3.A0B
            if (r0 == 0) goto L_0x026e
            X.33j r0 = r13.A0C
            java.lang.String r7 = X.C107565bW.A0G(r0, r3)
        L_0x025c:
            android.content.Context r0 = r13.A01
            android.graphics.drawable.Drawable r3 = X.AnonymousClass5YN.A00(r0, r3)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A08
            android.widget.ImageView r0 = r0.A0D
            r0.setVisibility(r2)
            r0.setImageDrawable(r3)
            goto L_0x0021
        L_0x026e:
            android.content.Context r1 = r13.A01
            r0 = 2131888317(0x7f1208bd, float:1.9411266E38)
            java.lang.String r7 = r1.getString(r0)
            goto L_0x025c
        L_0x0278:
            boolean r0 = r14 instanceof X.C31971pB
            if (r0 == 0) goto L_0x0293
            r2 = r14
            X.1pB r2 = (X.C31971pB) r2
            android.content.Context r1 = r13.A01
            r0 = 2131233216(0x7f0809c0, float:1.8082563E38)
            if (r9 == 0) goto L_0x0289
            r0 = 2131233217(0x7f0809c1, float:1.8082565E38)
        L_0x0289:
            android.graphics.drawable.Drawable r3 = A03(r1, r13, r0)
            java.lang.String r7 = X.C106485Ze.A02(r1, r2)
            goto L_0x0021
        L_0x0293:
            boolean r0 = r14 instanceof X.C31951p9
            if (r0 == 0) goto L_0x02ae
            android.content.Context r1 = r13.A01
            r0 = 2131233216(0x7f0809c0, float:1.8082563E38)
            if (r9 == 0) goto L_0x02a1
            r0 = 2131233217(0x7f0809c1, float:1.8082565E38)
        L_0x02a1:
            android.graphics.drawable.Drawable r3 = A03(r1, r13, r0)
            r0 = 2131888311(0x7f1208b7, float:1.9411254E38)
            java.lang.String r7 = X.AnonymousClass0x2.A0X(r1, r7, r8, r0)
            goto L_0x0021
        L_0x02ae:
            boolean r0 = r14 instanceof X.C31961pA
            if (r0 == 0) goto L_0x02d3
            r2 = r14
            X.1mV r2 = (X.C30471mV) r2
            android.content.Context r1 = r13.A01
            r0 = 2131233172(0x7f080994, float:1.8082474E38)
            android.graphics.drawable.Drawable r3 = A03(r1, r13, r0)
            boolean r0 = X.C86614Ku.A1Z(r2)
            if (r0 == 0) goto L_0x02cd
            r0 = 2131888301(0x7f1208ad, float:1.9411233E38)
            java.lang.String r7 = r1.getString(r0)
            goto L_0x0021
        L_0x02cd:
            java.lang.String r7 = r2.A1w()
            goto L_0x0021
        L_0x02d3:
            boolean r0 = r14 instanceof X.C30421mQ
            if (r0 == 0) goto L_0x0300
            r1 = r14
            X.1mQ r1 = (X.C30421mQ) r1
            java.lang.String r0 = r1.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x02fd
            android.content.Context r1 = r13.A01
            r0 = 2131888298(0x7f1208aa, float:1.9411227E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x02ed:
            java.lang.String r7 = X.C107575bX.A0C(r0, r2)
        L_0x02f1:
            android.content.Context r2 = r13.A01
            r0 = 2131233162(0x7f08098a, float:1.8082454E38)
            if (r9 == 0) goto L_0x051d
            r0 = 2131233163(0x7f08098b, float:1.8082456E38)
            goto L_0x051d
        L_0x02fd:
            java.lang.String r0 = r1.A00
            goto L_0x02ed
        L_0x0300:
            boolean r0 = r14 instanceof X.C30411mP
            if (r0 == 0) goto L_0x030e
            X.33j r1 = r13.A0C
            r0 = r14
            X.1mP r0 = (X.C30411mP) r0
            java.lang.String r7 = X.C33061sN.A01(r1, r0)
            goto L_0x02f1
        L_0x030e:
            boolean r0 = r14 instanceof X.AnonymousClass1n9
            if (r0 == 0) goto L_0x033f
            java.lang.String r7 = X.AnonymousClass353.A01(r14)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x0330
            r1 = r14
            X.1n9 r1 = (X.AnonymousClass1n9) r1
            java.lang.String r0 = r1.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x033c
            android.content.Context r1 = r13.A01
            r0 = 2131888307(0x7f1208b3, float:1.9411246E38)
            java.lang.String r7 = r1.getString(r0)
        L_0x0330:
            android.content.Context r2 = r13.A01
            r0 = 2131233183(0x7f08099f, float:1.8082496E38)
            if (r9 == 0) goto L_0x051d
            r0 = 2131233184(0x7f0809a0, float:1.8082498E38)
            goto L_0x051d
        L_0x033c:
            java.lang.String r7 = r1.A01
            goto L_0x0330
        L_0x033f:
            boolean r0 = r14 instanceof X.C30801n8
            if (r0 == 0) goto L_0x0363
            r0 = r14
            X.1n8 r0 = (X.C30801n8) r0
            java.lang.String r7 = r0.A03
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x0357
            android.content.Context r1 = r13.A01
            r0 = 2131888306(0x7f1208b2, float:1.9411244E38)
            java.lang.String r7 = r1.getString(r0)
        L_0x0357:
            android.content.Context r2 = r13.A01
            r0 = 2131232348(0x7f08065c, float:1.8080803E38)
            if (r9 == 0) goto L_0x051d
            r0 = 2131232349(0x7f08065d, float:1.8080805E38)
            goto L_0x051d
        L_0x0363:
            boolean r0 = X.C626635z.A09(r14)
            if (r0 == 0) goto L_0x0384
            X.34w r4 = r14.A0P
            if (r4 != 0) goto L_0x04f1
            android.content.Context r1 = r13.A01
            r0 = 2131233175(0x7f080997, float:1.808248E38)
            if (r9 == 0) goto L_0x0377
            r0 = 2131233176(0x7f080998, float:1.8082482E38)
        L_0x0377:
            android.graphics.drawable.Drawable r3 = A03(r1, r13, r0)
            r0 = 2131888299(0x7f1208ab, float:1.941123E38)
            java.lang.String r7 = r1.getString(r0)
            goto L_0x0021
        L_0x0384:
            boolean r0 = r14 instanceof X.C30691mr
            if (r0 == 0) goto L_0x03d3
            r5 = r14
            X.1mr r5 = (X.C30691mr) r5
            int r1 = r5.A1y()
            if (r1 == 0) goto L_0x03cf
            if (r1 == r8) goto L_0x03cb
            r0 = 2131888304(0x7f1208b0, float:1.941124E38)
            if (r1 == r4) goto L_0x039b
            r0 = 2131888303(0x7f1208af, float:1.9411238E38)
        L_0x039b:
            android.content.Context r3 = r13.A01
            java.lang.String r7 = r3.getString(r0)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A08
            android.widget.ImageView r4 = r0.A0D
            r4.setVisibility(r2)
            boolean r0 = r5.A20()
            if (r0 == 0) goto L_0x03c2
            r1 = 2131233192(0x7f0809a8, float:1.8082515E38)
            if (r9 == 0) goto L_0x03b6
            r1 = 2131233193(0x7f0809a9, float:1.8082517E38)
        L_0x03b6:
            r0 = 2131101893(0x7f0608c5, float:1.7816209E38)
            android.graphics.drawable.Drawable r3 = X.C107335b8.A04(r3, r1, r0)
            r4.setImageDrawable(r3)
            goto L_0x0021
        L_0x03c2:
            r1 = 2131233189(0x7f0809a5, float:1.8082508E38)
            if (r9 == 0) goto L_0x03b6
            r1 = 2131233190(0x7f0809a6, float:1.808251E38)
            goto L_0x03b6
        L_0x03cb:
            r0 = 2131888316(0x7f1208bc, float:1.9411264E38)
            goto L_0x039b
        L_0x03cf:
            r0 = 2131888318(0x7f1208be, float:1.9411268E38)
            goto L_0x039b
        L_0x03d3:
            boolean r0 = r14 instanceof X.C30351mJ
            if (r0 == 0) goto L_0x0433
            X.34w r4 = r14.A0P
            if (r4 == 0) goto L_0x0654
            int r0 = r4.A03
            if (r0 == r1) goto L_0x0654
        L_0x03df:
            android.content.Context r5 = r13.A01
            java.lang.CharSequence r4 = X.C195219Wq.A05(r5, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0424
            X.99n r0 = r13.A0J
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x042c
            X.9U4 r1 = r13.A0K
            X.34w r0 = r14.A0P
            java.lang.String r0 = r0.A0G
            X.9SU r1 = r1.A0F(r0)
            if (r1 == 0) goto L_0x042c
            X.34w r0 = r14.A0P
            java.lang.String r0 = r0.A0I
            X.9oC r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x042c
            X.34w r0 = r14.A0P
            int r1 = r1.BDu(r0)
        L_0x040f:
            android.content.res.Resources r0 = r5.getResources()
            int r1 = r0.getColor(r1)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A08
            com.whatsapp.WaTextView r0 = r0.A0T
            r0.setVisibility(r2)
            r0.setTextColor(r1)
            r0.setText(r4)
        L_0x0424:
            X.9Wq r0 = r13.A0L
            java.lang.String r7 = r0.A0d(r14)
            goto L_0x0021
        L_0x042c:
            X.34w r0 = r14.A0P
            int r1 = X.C195219Wq.A01(r0)
            goto L_0x040f
        L_0x0433:
            boolean r0 = r14 instanceof X.C30961nV
            if (r0 == 0) goto L_0x0488
            r0 = r14
            X.1nV r0 = (X.C30961nV) r0
            com.whatsapp.jid.UserJid r1 = r0.A00
            boolean r0 = X.AnonymousClass2z0.A0C(r14)
            if (r0 == 0) goto L_0x0459
            android.content.Context r2 = r13.A01
            r0 = 2131893219(0x7f121be3, float:1.9421208E38)
        L_0x0447:
            java.lang.String r7 = r2.getString(r0)
        L_0x044b:
            r0 = 2131233159(0x7f080987, float:1.8082448E38)
            if (r9 == 0) goto L_0x0453
            r0 = 2131233160(0x7f080988, float:1.808245E38)
        L_0x0453:
            android.graphics.drawable.Drawable r3 = A03(r2, r13, r0)
            goto L_0x0021
        L_0x0459:
            X.2sr r0 = r13.A02
            boolean r0 = r0.A0a(r1)
            if (r0 == 0) goto L_0x0467
            android.content.Context r2 = r13.A01
            r0 = 2131886399(0x7f12013f, float:1.9407376E38)
            goto L_0x0447
        L_0x0467:
            if (r1 != 0) goto L_0x046f
            android.content.Context r2 = r13.A01
            r0 = 2131886397(0x7f12013d, float:1.9407372E38)
            goto L_0x0447
        L_0x046f:
            X.5ZU r3 = r13.A06
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r8]
            r0[r2] = r1
            java.util.ArrayList r1 = X.C162197rQ.newArrayList((java.lang.Object[]) r0)
            r0 = -1
            java.lang.String r1 = r3.A0W(r1, r0)
            android.content.Context r2 = r13.A01
            r0 = 2131886398(0x7f12013e, float:1.9407374E38)
            java.lang.String r7 = X.AnonymousClass0x2.A0X(r2, r1, r8, r0)
            goto L_0x044b
        L_0x0488:
            boolean r0 = r14 instanceof X.C30441mS
            if (r0 == 0) goto L_0x04c8
            X.2z0 r2 = r14.A1J
            X.4uZ r0 = r2.A00
            boolean r1 = r0 instanceof X.C95804uY
            boolean r0 = r2.A02
            android.content.Context r2 = r13.A01
            if (r0 == 0) goto L_0x04bf
            r0 = 2131893220(0x7f121be4, float:1.942121E38)
            if (r1 == 0) goto L_0x04a0
            r0 = 2131893221(0x7f121be5, float:1.9421212E38)
        L_0x04a0:
            java.lang.String r7 = r2.getString(r0)
            X.33j r0 = r13.A0C
            boolean r0 = X.C102805Ki.A00(r0)
            if (r0 == 0) goto L_0x04b6
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r7 = X.AnonymousClass0x2.A0e(r7, r1, r0)
        L_0x04b6:
            r0 = 2131233159(0x7f080987, float:1.8082448E38)
            if (r9 == 0) goto L_0x051d
            r0 = 2131233160(0x7f080988, float:1.808245E38)
            goto L_0x051d
        L_0x04bf:
            r0 = 2131893218(0x7f121be2, float:1.9421206E38)
            if (r1 == 0) goto L_0x04a0
            r0 = 2131893219(0x7f121be3, float:1.9421208E38)
            goto L_0x04a0
        L_0x04c8:
            boolean r0 = r14 instanceof X.C30911nQ
            if (r0 == 0) goto L_0x04d7
            android.content.Context r1 = r13.A01
            r0 = 2131896263(0x7f1227c7, float:1.9427382E38)
            java.lang.String r7 = r1.getString(r0)
            goto L_0x0021
        L_0x04d7:
            boolean r0 = r14 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x0523
            X.34w r4 = r14.A0P
            if (r4 != 0) goto L_0x04f1
            android.content.Context r2 = r13.A01
            r0 = 2131888312(0x7f1208b8, float:1.9411256E38)
            java.lang.String r7 = r2.getString(r0)
            r0 = 2131233210(0x7f0809ba, float:1.8082551E38)
            if (r9 == 0) goto L_0x051d
            r0 = 2131233211(0x7f0809bb, float:1.8082553E38)
            goto L_0x051d
        L_0x04f1:
            int r0 = r4.A03
            if (r0 != r1) goto L_0x03df
            android.content.Context r1 = r13.A01
            r0 = 2131233213(0x7f0809bd, float:1.8082557E38)
            if (r9 == 0) goto L_0x04ff
            r0 = 2131233214(0x7f0809be, float:1.808256E38)
        L_0x04ff:
            android.graphics.drawable.Drawable r3 = A03(r1, r13, r0)
            r0 = 2131888321(0x7f1208c1, float:1.9411274E38)
            java.lang.String r7 = r1.getString(r0)
            goto L_0x0021
        L_0x050c:
            android.content.Context r2 = r13.A01
            r0 = 2131888295(0x7f1208a7, float:1.9411221E38)
            java.lang.String r7 = r2.getString(r0)
            r0 = 2131233155(0x7f080983, float:1.808244E38)
            if (r9 == 0) goto L_0x051d
            r0 = 2131233156(0x7f080984, float:1.8082442E38)
        L_0x051d:
            android.graphics.drawable.Drawable r3 = A03(r2, r13, r0)
            goto L_0x0021
        L_0x0523:
            boolean r0 = r14 instanceof X.C30831nH
            if (r0 == 0) goto L_0x0542
            android.content.Context r2 = r13.A01
            X.2z0 r0 = r14.A1J
            boolean r0 = r0.A02
            r1 = 2131891766(0x7f121636, float:1.9418261E38)
            if (r0 == 0) goto L_0x0535
            r1 = 2131891798(0x7f121656, float:1.9418326E38)
        L_0x0535:
            java.lang.String r7 = r2.getString(r1)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A08
            android.widget.ImageView r0 = r0.A0H
            r0.setVisibility(r5)
            goto L_0x0021
        L_0x0542:
            boolean r0 = r14 instanceof X.AnonymousClass1nG
            if (r0 == 0) goto L_0x0555
            android.content.Context r2 = r13.A01
            X.2z0 r0 = r14.A1J
            boolean r0 = r0.A02
            r1 = 2131891796(0x7f121654, float:1.9418322E38)
            if (r0 == 0) goto L_0x0535
            r1 = 2131891797(0x7f121655, float:1.9418324E38)
            goto L_0x0535
        L_0x0555:
            boolean r0 = r14 instanceof X.C30391mN
            if (r0 == 0) goto L_0x058a
            X.2rN r1 = r13.A0N
            r0 = r14
            X.1mN r0 = (X.C30391mN) r0
            int r0 = r0.A00
            boolean r1 = r1.A03(r0)
            android.content.Context r4 = r13.A01
            r0 = 2131889900(0x7f120eec, float:1.9414477E38)
            if (r1 == 0) goto L_0x056e
            r0 = 2131891638(0x7f1215b6, float:1.9418002E38)
        L_0x056e:
            java.lang.String r7 = r4.getString(r0)
            r0 = 2131233181(0x7f08099d, float:1.8082492E38)
            if (r9 == 0) goto L_0x057a
            r0 = 2131233182(0x7f08099e, float:1.8082494E38)
        L_0x057a:
            android.graphics.drawable.Drawable r3 = X.C107335b8.A01(r4, r0)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A08
            android.widget.ImageView r0 = r0.A0D
            r0.setImageDrawable(r3)
            r0.setVisibility(r2)
            goto L_0x0021
        L_0x058a:
            boolean r0 = r14 instanceof X.C30821nD
            if (r0 == 0) goto L_0x05b6
            X.1VX r3 = r13.A0F
            r0 = 4893(0x131d, float:6.857E-42)
            boolean r0 = r3.A0X(r0)
            if (r0 == 0) goto L_0x05aa
            android.content.Context r4 = r13.A01
            r0 = 2131891516(0x7f12153c, float:1.9417754E38)
            java.lang.String r7 = r4.getString(r0)
        L_0x05a1:
            r0 = 2131233195(0x7f0809ab, float:1.808252E38)
            if (r9 == 0) goto L_0x057a
            r0 = 2131233196(0x7f0809ac, float:1.8082523E38)
            goto L_0x057a
        L_0x05aa:
            r1 = r14
            X.1nD r1 = (X.C30821nD) r1
            android.content.Context r4 = r13.A01
            X.33j r0 = r13.A0C
            java.lang.String r7 = X.C66553Lw.A05(r4, r0, r3, r1)
            goto L_0x05a1
        L_0x05b6:
            boolean r0 = r14 instanceof X.C30311mF
            if (r0 == 0) goto L_0x05dd
            r4 = r14
            X.1mF r4 = (X.C30311mF) r4
            X.35q r2 = r13.A03
            X.2z0 r1 = r4.A1J
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x05da
            X.2sr r0 = r13.A02
            com.whatsapp.jid.PhoneUserJid r1 = X.C56972sr.A04(r0)
        L_0x05cb:
            int r0 = r4.A00
            java.lang.String r7 = r2.A0E(r1, r0, r8)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A08
            android.widget.ImageView r0 = r0.A0H
            r0.setVisibility(r5)
            goto L_0x0021
        L_0x05da:
            X.4uZ r1 = r1.A00
            goto L_0x05cb
        L_0x05dd:
            boolean r0 = r14 instanceof X.AnonymousClass1n3
            if (r0 == 0) goto L_0x05f4
            r2 = r14
            X.1n3 r2 = (X.AnonymousClass1n3) r2
            android.content.Context r1 = r13.A01
            java.lang.String r7 = A04(r1, r2)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A08
            android.widget.ImageView r0 = r0.A0D
            android.graphics.drawable.Drawable r3 = A02(r1, r0, r2)
            goto L_0x0021
        L_0x05f4:
            boolean r0 = r14 instanceof X.C31991pD
            if (r0 == 0) goto L_0x060b
            r2 = r14
            X.1pD r2 = (X.C31991pD) r2
            android.content.Context r1 = r13.A01
            java.lang.String r7 = A04(r1, r2)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A08
            android.widget.ImageView r0 = r0.A0D
            android.graphics.drawable.Drawable r3 = A02(r1, r0, r2)
            goto L_0x0021
        L_0x060b:
            boolean r0 = r14 instanceof X.C30431mR
            if (r0 == 0) goto L_0x066b
            X.9Wq r6 = r13.A0L
            r4 = r14
            X.1mR r4 = (X.C30431mR) r4
            int r1 = r4.A00
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            android.content.Context r5 = r13.A01
            if (r0 == 0) goto L_0x0656
            X.2z0 r0 = r14.A1J
            boolean r1 = r0.A02
            X.4uZ r0 = r0.A00
            X.C626936e.A06(r0)
            X.9Oe r0 = r6.A0I(r5, r0, r1)
            java.lang.String r7 = r0.A00
            int r0 = r4.A00
            java.lang.CharSequence r4 = r6.A0J(r5, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0021
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131102143(0x7f0609bf, float:1.7816716E38)
            int r1 = r1.getColor(r0)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A08
            com.whatsapp.WaTextView r0 = r0.A0T
            r0.setVisibility(r2)
            r0.setTextColor(r1)
            r0.setText(r4)
            goto L_0x0021
        L_0x0654:
            android.content.Context r5 = r13.A01
        L_0x0656:
            r0 = 2131233213(0x7f0809bd, float:1.8082557E38)
            if (r9 == 0) goto L_0x065e
            r0 = 2131233214(0x7f0809be, float:1.808256E38)
        L_0x065e:
            android.graphics.drawable.Drawable r3 = A03(r5, r13, r0)
            r0 = 2131888320(0x7f1208c0, float:1.9411272E38)
            java.lang.String r7 = r5.getString(r0)
            goto L_0x0021
        L_0x066b:
            boolean r0 = r14 instanceof X.C30451mT
            if (r0 == 0) goto L_0x0695
            r0 = r14
            X.1mT r0 = (X.C30451mT) r0
            java.lang.String r7 = r0.A03
            X.1VX r0 = r13.A0F
            boolean r0 = X.C86614Ku.A1Y(r0)
            if (r0 == 0) goto L_0x068c
            r1 = 2131233199(0x7f0809af, float:1.8082529E38)
            if (r9 == 0) goto L_0x0684
            r1 = 2131233200(0x7f0809b0, float:1.808253E38)
        L_0x0684:
            android.content.Context r0 = r13.A01
            android.graphics.drawable.Drawable r3 = A03(r0, r13, r1)
            goto L_0x0021
        L_0x068c:
            r1 = 2131233198(0x7f0809ae, float:1.8082527E38)
            if (r9 == 0) goto L_0x0684
            r1 = 2131233201(0x7f0809b1, float:1.8082533E38)
            goto L_0x0684
        L_0x0695:
            boolean r0 = r14 instanceof X.C30261mA
            if (r0 == 0) goto L_0x06c3
            X.2oU r4 = r13.A0B
            android.content.Context r3 = r4.A00
            r1 = 2131232532(0x7f080714, float:1.8081176E38)
            if (r9 == 0) goto L_0x06a5
            r1 = 2131232533(0x7f080715, float:1.8081178E38)
        L_0x06a5:
            r0 = 2131100180(0x7f060214, float:1.7812734E38)
            android.graphics.drawable.Drawable r3 = X.C107335b8.A04(r3, r1, r0)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A08
            android.widget.ImageView r0 = r0.A0D
            r0.setVisibility(r2)
            r0.setImageDrawable(r3)
            r1 = 2131892639(0x7f12199f, float:1.9420032E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r4)
            java.lang.String r7 = r0.getString(r1)
            goto L_0x0021
        L_0x06c3:
            boolean r0 = r14 instanceof X.C30371mL
            if (r0 == 0) goto L_0x06f1
            X.2oU r4 = r13.A0B
            android.content.Context r3 = r4.A00
            r1 = 2131232532(0x7f080714, float:1.8081176E38)
            if (r9 == 0) goto L_0x06d3
            r1 = 2131232533(0x7f080715, float:1.8081178E38)
        L_0x06d3:
            r0 = 2131100180(0x7f060214, float:1.7812734E38)
            android.graphics.drawable.Drawable r3 = X.C107335b8.A04(r3, r1, r0)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A08
            android.widget.ImageView r0 = r0.A0D
            r0.setVisibility(r2)
            r0.setImageDrawable(r3)
            r1 = 2131892654(0x7f1219ae, float:1.9420062E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r4)
            java.lang.String r7 = r0.getString(r1)
            goto L_0x0021
        L_0x06f1:
            boolean r0 = r14 instanceof X.C30491mX
            if (r0 == 0) goto L_0x0714
            X.2oU r0 = r13.A0B
            android.content.Context r4 = r0.A00
            X.3Ex r5 = r13.A05
            X.5ZU r6 = r13.A06
            X.33j r7 = r13.A0C
            X.2z0 r1 = r14.A1J
            boolean r12 = r1.A02
            r0 = r14
            X.1mX r0 = (X.C30491mX) r0
            long r10 = r0.A01
            X.4uZ r8 = r1.A00
            com.whatsapp.jid.UserJid r9 = r14.A0o()
            java.lang.String r7 = X.AnonymousClass36T.A02(r4, r5, r6, r7, r8, r9, r10, r12)
            goto L_0x0021
        L_0x0714:
            boolean r0 = r14 instanceof X.C30401mO
            if (r0 == 0) goto L_0x09b9
            r6 = r14
            X.1mO r6 = (X.C30401mO) r6
            X.3ZF r0 = r6.A01
            if (r0 == 0) goto L_0x0021
            X.8qC r0 = r13.A0P
            java.lang.Object r5 = r0.get()
            X.34o r5 = (X.C623234o) r5
            X.2oU r4 = r13.A0B
            X.C162457s7.A0J(r4, r2)
            X.3ZF r1 = r6.A01
            if (r1 == 0) goto L_0x0787
            com.whatsapp.jid.GroupJid r0 = r1.A05
            if (r0 == 0) goto L_0x0787
            X.2sr r9 = r5.A00
            X.C626936e.A06(r1)
            boolean r0 = r6.A1w()
            if (r0 == 0) goto L_0x0888
            r1 = 2131887286(0x7f1204b6, float:1.9409175E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r4)
            java.lang.String r7 = r0.getString(r1)
            X.C162457s7.A0H(r7)
        L_0x074d:
            X.1VX r1 = r13.A0F
            boolean r0 = X.AnonymousClass77V.A00
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0780
            r0 = 6120(0x17e8, float:8.576E-42)
            int r0 = r1.A0N(r0)
            if (r0 <= r8) goto L_0x0780
            int r3 = X.C623234o.A00(r6)
            if (r3 == 0) goto L_0x0780
            X.2m0 r1 = r13.A00
            if (r1 != 0) goto L_0x076e
            X.2m0 r1 = new X.2m0
            r1.<init>()
            r13.A00 = r1
        L_0x076e:
            android.content.Context r0 = r13.A01
            X.0AR r3 = r1.A00(r0, r3, r8)
        L_0x0774:
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A08
            android.widget.ImageView r0 = r0.A0D
            r0.setVisibility(r2)
            r0.setImageDrawable(r3)
            goto L_0x0021
        L_0x0780:
            android.content.Context r0 = r4.A00
            android.graphics.drawable.Drawable r3 = r5.A03(r0, r6, r8)
            goto L_0x0774
        L_0x0787:
            boolean r0 = r6.A1v()
            if (r0 == 0) goto L_0x085d
            X.2sr r10 = r5.A00
            X.3ZF r7 = r6.A01
            X.C626936e.A06(r7)
            X.2z0 r1 = r6.A1J
            X.4uZ r12 = r1.A00
            com.whatsapp.jid.UserJid r11 = X.AnonymousClass32Y.A05(r12)
            if (r11 != 0) goto L_0x07b6
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CallingMessageUtil/getAdHocGroupCallLogMessageText: peerjid is null. This is group jid: "
            r9.append(r0)
            boolean r0 = r12 instanceof com.whatsapp.jid.GroupJid
            r9.append(r0)
            java.lang.String r0 = " and callType is "
            r9.append(r0)
            int r0 = r7.A0H
            X.C18270x1.A1F(r9, r0)
        L_0x07b6:
            boolean r0 = r6.A1w()
            if (r0 != 0) goto L_0x094f
            boolean r0 = r6.A1y()
            if (r0 == 0) goto L_0x083d
            boolean r9 = r1.A02
            if (r9 != 0) goto L_0x07de
            boolean r0 = r6.A1z()
            r12 = 2131887305(0x7f1204c9, float:1.9409213E38)
            if (r0 != 0) goto L_0x07f5
        L_0x07cf:
            r1 = 100
            if (r11 == 0) goto L_0x07ec
            int r0 = r7.A04(r11)
            if (r0 != r1) goto L_0x07ec
            r3 = 2131887300(0x7f1204c4, float:1.9409203E38)
            goto L_0x096b
        L_0x07de:
            if (r11 == 0) goto L_0x07cf
            int r1 = r7.A04(r11)
            r0 = 2
            if (r1 != r0) goto L_0x07cf
            r3 = 2131887304(0x7f1204c8, float:1.9409211E38)
            goto L_0x096b
        L_0x07ec:
            int r0 = r7.A03(r10)
            if (r0 != r1) goto L_0x07fa
            r12 = 2131887302(0x7f1204c6, float:1.9409207E38)
        L_0x07f5:
            r1 = 2131887285(0x7f1204b5, float:1.9409173E38)
            goto L_0x08a6
        L_0x07fa:
            int r1 = r7.A03(r10)
            r0 = 5
            if (r1 != r0) goto L_0x0805
            r12 = 2131887301(0x7f1204c5, float:1.9409205E38)
            goto L_0x07f5
        L_0x0805:
            if (r9 != 0) goto L_0x0811
            boolean r0 = r7.A0S(r10)
            if (r0 != 0) goto L_0x0811
            r12 = 2131887303(0x7f1204c7, float:1.940921E38)
            goto L_0x07f5
        L_0x0811:
            r0 = 2131887285(0x7f1204b5, float:1.9409173E38)
            java.lang.String r7 = X.C54292oU.A04(r4, r0)
            int r3 = r7.length()
            android.content.Context r1 = r4.A00
            r0 = 2131099966(0x7f06013e, float:1.78123E38)
            int r1 = X.AnonymousClass0Y8.A04(r1, r0)
            android.text.SpannableString r7 = X.AnonymousClass4L0.A0A(r7)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            r1 = 33
            r7.setSpan(r0, r2, r3, r1)
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r8)
            r7.setSpan(r0, r2, r3, r1)
            goto L_0x074d
        L_0x083d:
            boolean r0 = r6.A1x()
            if (r0 == 0) goto L_0x0858
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0858
            X.C162457s7.A0H(r7)
            boolean r0 = r5.A09(r7)
            r3 = 2131887294(0x7f1204be, float:1.9409191E38)
            if (r0 == 0) goto L_0x096b
            r3 = 2131887306(0x7f1204ca, float:1.9409215E38)
            goto L_0x096b
        L_0x0858:
            r3 = 2131887285(0x7f1204b5, float:1.9409173E38)
            goto L_0x096b
        L_0x085d:
            X.3ZF r7 = r6.A01
            X.C626936e.A06(r7)
            boolean r0 = r6.A1w()
            if (r0 != 0) goto L_0x094f
            boolean r0 = r6.A1z()
            if (r0 == 0) goto L_0x087c
            boolean r0 = r7.A0L
            r12 = 2131887305(0x7f1204c9, float:1.9409213E38)
        L_0x0873:
            r1 = 2131887311(0x7f1204cf, float:1.9409226E38)
            if (r0 == 0) goto L_0x08a6
            r1 = 2131887310(0x7f1204ce, float:1.9409223E38)
            goto L_0x08a6
        L_0x087c:
            boolean r0 = r6.A1y()
            if (r0 == 0) goto L_0x0917
            boolean r0 = r7.A0L
            r12 = 2131887287(0x7f1204b7, float:1.9409177E38)
            goto L_0x0873
        L_0x0888:
            boolean r0 = r6.A1z()
            if (r0 == 0) goto L_0x08bf
            boolean r0 = r6.A20()
            if (r0 == 0) goto L_0x089a
            X.2z0 r0 = r6.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x08bf
        L_0x089a:
            boolean r0 = r6.A20()
            if (r0 == 0) goto L_0x08ac
            r12 = 2131887305(0x7f1204c9, float:1.9409213E38)
            r1 = 2131887291(0x7f1204bb, float:1.9409185E38)
        L_0x08a6:
            java.lang.CharSequence r7 = r5.A04(r4, r3, r12, r1)
            goto L_0x074d
        L_0x08ac:
            boolean r0 = r1.A0L
            r1 = 2131887311(0x7f1204cf, float:1.9409226E38)
            if (r0 == 0) goto L_0x08b6
            r1 = 2131887310(0x7f1204ce, float:1.9409223E38)
        L_0x08b6:
            r0 = 2131887305(0x7f1204c9, float:1.9409213E38)
            java.lang.CharSequence r7 = r5.A04(r4, r3, r0, r1)
            goto L_0x074d
        L_0x08bf:
            boolean r0 = r6.A1y()
            if (r0 == 0) goto L_0x0953
            boolean r0 = r6.A20()
            if (r0 == 0) goto L_0x08e7
            r7 = 2131887291(0x7f1204bb, float:1.9409185E38)
        L_0x08ce:
            int r0 = r1.A03(r9)
            r9 = 5
            if (r0 != r9) goto L_0x08f2
            boolean r1 = r6.A20()
            r0 = 2131887288(0x7f1204b8, float:1.9409179E38)
            if (r1 == 0) goto L_0x08e1
            r0 = 2131887293(0x7f1204bd, float:1.940919E38)
        L_0x08e1:
            java.lang.CharSequence r7 = r5.A04(r4, r3, r0, r7)
            goto L_0x074d
        L_0x08e7:
            boolean r0 = r1.A0L
            r7 = 2131887290(0x7f1204ba, float:1.9409183E38)
            if (r0 == 0) goto L_0x08ce
            r7 = 2131887289(0x7f1204b9, float:1.940918E38)
            goto L_0x08ce
        L_0x08f2:
            r3 = 2131887292(0x7f1204bc, float:1.9409187E38)
            java.util.Iterator r10 = X.AnonymousClass3ZF.A01(r1)
            r1 = 0
        L_0x08fa:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x090d
            java.lang.Object r0 = r10.next()
            X.3ZE r0 = (X.AnonymousClass3ZE) r0
            int r0 = r0.A00
            if (r0 != r9) goto L_0x08fa
            int r1 = r1 + 1
            goto L_0x08fa
        L_0x090d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.CharSequence r7 = r5.A04(r4, r0, r3, r7)
            goto L_0x074d
        L_0x0917:
            boolean r0 = r6.A1x()
            if (r0 == 0) goto L_0x0937
            X.2z0 r0 = r6.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0937
            X.C162457s7.A0H(r7)
            boolean r0 = r5.A09(r7)
            boolean r1 = r7.A0L
            if (r0 != 0) goto L_0x097a
            r3 = 2131887299(0x7f1204c3, float:1.9409201E38)
            if (r1 == 0) goto L_0x096b
            r3 = 2131887298(0x7f1204c2, float:1.94092E38)
            goto L_0x096b
        L_0x0937:
            X.3ZF r0 = r6.A01
            if (r0 == 0) goto L_0x0944
            int r1 = r0.A00
            r0 = 6
            if (r1 != r0) goto L_0x0944
            r3 = 2131887284(0x7f1204b4, float:1.940917E38)
            goto L_0x096b
        L_0x0944:
            boolean r0 = r7.A0L
            r3 = 2131887311(0x7f1204cf, float:1.9409226E38)
            if (r0 == 0) goto L_0x096b
            r3 = 2131887310(0x7f1204ce, float:1.9409223E38)
            goto L_0x096b
        L_0x094f:
            r3 = 2131887286(0x7f1204b6, float:1.9409175E38)
            goto L_0x096b
        L_0x0953:
            X.C162457s7.A0H(r1)
            boolean r0 = r5.A09(r1)
            if (r0 == 0) goto L_0x0983
            X.2z0 r0 = r6.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0983
            boolean r0 = r6.A20()
            if (r0 == 0) goto L_0x0978
            r3 = 2131887309(0x7f1204cd, float:1.9409221E38)
        L_0x096b:
            android.content.res.Resources r0 = X.C54292oU.A00(r4)
            java.lang.String r7 = r0.getString(r3)
            X.C162457s7.A0H(r7)
            goto L_0x074d
        L_0x0978:
            boolean r1 = r1.A0L
        L_0x097a:
            r3 = 2131887308(0x7f1204cc, float:1.940922E38)
            if (r1 == 0) goto L_0x096b
            r3 = 2131887307(0x7f1204cb, float:1.9409217E38)
            goto L_0x096b
        L_0x0983:
            boolean r0 = r6.A1x()
            if (r0 == 0) goto L_0x09a4
            X.2z0 r0 = r6.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x09a4
            boolean r0 = r6.A20()
            if (r0 == 0) goto L_0x0999
            r3 = 2131887297(0x7f1204c1, float:1.9409197E38)
            goto L_0x096b
        L_0x0999:
            boolean r0 = r1.A0L
            r3 = 2131887296(0x7f1204c0, float:1.9409195E38)
            if (r0 == 0) goto L_0x096b
            r3 = 2131887295(0x7f1204bf, float:1.9409193E38)
            goto L_0x096b
        L_0x09a4:
            boolean r0 = r6.A20()
            if (r0 == 0) goto L_0x09ae
            r3 = 2131887291(0x7f1204bb, float:1.9409185E38)
            goto L_0x096b
        L_0x09ae:
            boolean r0 = r1.A0L
            r3 = 2131887290(0x7f1204ba, float:1.9409183E38)
            if (r0 == 0) goto L_0x096b
            r3 = 2131887289(0x7f1204b9, float:1.940918E38)
            goto L_0x096b
        L_0x09b9:
            boolean r0 = r14 instanceof X.C30461mU
            if (r0 == 0) goto L_0x09f2
            r0 = r14
            X.1mU r0 = (X.C30461mU) r0
            java.lang.String r7 = r0.A04
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A08
            android.widget.ImageView r6 = r0.A0D
            r6.setVisibility(r2)
            r0 = 2131233922(0x7f080c82, float:1.8083995E38)
            android.content.Context r5 = r13.A01
            android.graphics.drawable.Drawable r0 = X.C107335b8.A01(r5, r0)
            android.graphics.Bitmap r4 = X.C107335b8.A00(r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131166139(0x7f0703bb, float:1.7946515E38)
            int r2 = X.AnonymousClass4L0.A01(r1, r0)
            android.content.res.Resources r1 = r5.getResources()
            android.graphics.drawable.BitmapDrawable r0 = X.C86654Ky.A0E(r5, r4)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A0A(r1, r0, r2)
            r6.setImageDrawable(r0)
            goto L_0x0021
        L_0x09f2:
            boolean r0 = r14 instanceof X.C30381mM
            if (r0 == 0) goto L_0x0021
            X.2oU r0 = r13.A0B
            r1 = 2131890982(0x7f121326, float:1.9416671E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r0)
            java.lang.String r7 = r0.getString(r1)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A08
            android.widget.ImageView r6 = r0.A0D
            r6.setVisibility(r2)
            r0 = 2131234096(0x7f080d30, float:1.8084348E38)
            android.content.Context r5 = r13.A01
            android.graphics.drawable.Drawable r0 = X.C107335b8.A01(r5, r0)
            android.graphics.Bitmap r4 = X.C107335b8.A00(r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131166139(0x7f0703bb, float:1.7946515E38)
            int r2 = X.AnonymousClass4L0.A01(r1, r0)
            android.content.res.Resources r1 = r5.getResources()
            android.graphics.drawable.BitmapDrawable r0 = X.C86654Ky.A0E(r5, r4)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A0A(r1, r0, r2)
            r6.setImageDrawable(r0)
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZN.A05(X.34x):android.util.Pair");
    }

    public void A06() {
        C52762m0 r0 = this.A00;
        if (r0 != null) {
            r0.A02();
            this.A00 = null;
        }
    }

    public void A07(AnonymousClass5T4 r7) {
        String string;
        AnonymousClass3ZH r5 = r7.A05;
        if (r5 == null) {
            string = null;
        } else {
            C56972sr r4 = r7.A01;
            Context context = r7.A00;
            AnonymousClass5ZU r2 = r7.A02;
            AnonymousClass3ZH r1 = r7.A04;
            C95814uZ r0 = r5.A0H;
            if (r0 == null || r4.A0a(r0)) {
                string = context.getString(R.string.f11nameremoved);
            } else {
                string = r2.A0P(r5, r2.A0A(r1.A0H));
            }
        }
        A0B(string, true);
    }

    public void A08(AnonymousClass659 r15, C182338oF r16, int i, boolean z) {
        View view;
        AnonymousClass593 r0;
        C95814uZ A002;
        int i2 = i;
        if (this instanceof C94114pv) {
            C94114pv r4 = (C94114pv) this;
            C64773Ex r6 = r4.A02;
            C624134x r5 = ((AnonymousClass4zO) r15).A00;
            AnonymousClass3ZH A062 = r6.A06(AnonymousClass2z0.A00(r5));
            AnonymousClass3ZH r1 = null;
            if (A062 == null || ((A002 = C106795aB.A00(r4.A02, A062, r5)) != null && (r1 = r6.A06(A002)) == null)) {
                C620733j r9 = r4.A05;
                ViewHolder viewHolder = r4.A08;
                View view2 = viewHolder.A06;
                Context context = r4.A01;
                C107555bV.A07(view2, r9, context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 0, 0, 0);
                viewHolder.A05.setVisibility(8);
                C94134px.A00(viewHolder.A0Q, viewHolder);
                TextEmojiLabel textEmojiLabel = viewHolder.A0P;
                textEmojiLabel.setVisibility(0);
                AnonymousClass0x2.A0q(context, textEmojiLabel, R.color.f5nameremoved);
                textEmojiLabel.A0A();
                C86634Kw.A1I(textEmojiLabel);
                textEmojiLabel.setPlaceholder(80);
                viewHolder.A0c.A01();
                AnonymousClass4q9 r3 = new AnonymousClass4q9(r4.A02, r6, r5);
                r4.A00 = r3;
                r4.A03.A02(new AnonymousClass91M(r4, 0), r3);
            } else {
                r4.A0C(new C148957Kj(A062, r1, r5));
            }
        } else {
            C94124pw r7 = (C94124pw) this;
            AnonymousClass3ZH r52 = ((C97874zP) r15).A00;
            C95814uZ A0a = C86604Kt.A0a(r52);
            ViewHolder viewHolder2 = r7.A08;
            viewHolder2.A06.setPadding(0, 0, 0, 0);
            C105365Uq r02 = r7.A02;
            ImageView imageView = viewHolder2.A0B;
            r02.A08(imageView, r52);
            if (!(A0a instanceof C28001fK)) {
                imageView.setEnabled(true);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("com.whatsapp.conversationslist.ConversationsFragment");
                AnonymousClass0YZ.A0F(imageView, AnonymousClass000.A0X(C627336j.A07(A0a), A0o));
                C109715f4 r11 = new C109715f4(r7, A0a, i2, 4);
                C109475eg r10 = new C109475eg(r7, 41, A0a);
                C1237169m r12 = new C1237169m(A0a, 8, r7);
                imageView.setOnClickListener(r11);
                imageView.setOnLongClickListener(r12);
                View view3 = viewHolder2.A0H;
                view3.setOnClickListener(r10);
                view3.setOnLongClickListener(r12);
                view = viewHolder2.A05;
                view.setOnClickListener(r11);
                view.setOnLongClickListener(r12);
                if (imageView instanceof WDSProfilePhoto) {
                    AnonymousClass5OF r112 = r7.A00;
                    WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) imageView;
                    boolean z2 = true;
                    if (r112 == null || !r112.A00() || r112.A01 <= 0) {
                        z2 = false;
                    }
                    wDSProfilePhoto.setStatusIndicatorEnabled(z2);
                    if (z2) {
                        if (r112.A01 > 0) {
                            r0 = AnonymousClass593.UNSEEN;
                        } else {
                            r0 = AnonymousClass593.SEEN;
                        }
                        AnonymousClass576.A00(wDSProfilePhoto, r0);
                    }
                }
            } else {
                C109475eg r13 = new C109475eg(r7, 42, A0a);
                imageView.setEnabled(false);
                imageView.setOnClickListener(r13);
                imageView.setOnLongClickListener((View.OnLongClickListener) null);
                View view4 = viewHolder2.A0H;
                view4.setOnClickListener(r13);
                view4.setOnLongClickListener((View.OnLongClickListener) null);
                view = viewHolder2.A05;
                view.setOnClickListener(r13);
                view.setOnLongClickListener((View.OnLongClickListener) null);
            }
            viewHolder2.A0F(false, false);
            view.setVisibility(0);
            TextEmojiLabel textEmojiLabel2 = viewHolder2.A0P;
            textEmojiLabel2.setVisibility(0);
            viewHolder2.A0Q.setVisibility(8);
            viewHolder2.A0E.setVisibility(8);
            ImageView imageView2 = viewHolder2.A0F;
            AnonymousClass1R1 r03 = r7.A05;
            C626936e.A06(A0a);
            imageView2.setVisibility(AnonymousClass001.A08(r03.A0i(A0a) ? 1 : 0));
            viewHolder2.A0J.setVisibility(8);
            ImageView imageView3 = viewHolder2.A0H;
            imageView3.setVisibility(8);
            ImageView imageView4 = viewHolder2.A0D;
            imageView4.setVisibility(8);
            C86624Kv.A14(viewHolder2.A08, imageView3, imageView4, 8);
            viewHolder2.A02.setVisibility(8);
            viewHolder2.A0T.setVisibility(8);
            Context context2 = r7.A01;
            AnonymousClass0x2.A0q(context2, textEmojiLabel2, R.color.f5nameremoved);
            textEmojiLabel2.A0A();
            C105075Tm r102 = viewHolder2.A0c;
            ConversationListRowHeaderView conversationListRowHeaderView = r102.A03;
            conversationListRowHeaderView.A01.setVisibility(0);
            textEmojiLabel2.setPlaceholder(0);
            conversationListRowHeaderView.A01.setTextColor(AnonymousClass0Y8.A04(context2, R.color.f5nameremoved));
            r102.A02(r52, r7.A0O, r7.A03.BBO());
            r102.A05.A0D(r52);
            CharSequence A003 = AnonymousClass5ZU.A00(context2, r7.A04, r52);
            if (A003 != null) {
                conversationListRowHeaderView.A01.setText(A003);
                conversationListRowHeaderView.A01.setContentDescription((CharSequence) null);
            }
            String str = r52.A0X;
            if (str == null) {
                str = "";
            }
            textEmojiLabel2.A0K((List) null, str);
            textEmojiLabel2.setVisibility(0);
        }
        C182338oF r04 = r16;
        if (r16 != null) {
            r04.Bah(i2);
        }
    }

    public void A0A(AnonymousClass3ZH r5, AnonymousClass3ZH r6, C624134x r7, List list, boolean z) {
        String str;
        if (r6 == null || !z) {
            str = null;
        } else {
            C56972sr r3 = this.A02;
            Context context = this.A01;
            AnonymousClass5ZU r1 = this.A06;
            C95814uZ r0 = r6.A0H;
            if (r0 == null || r3.A0a(r0)) {
                str = context.getString(R.string.f11nameremoved);
            } else {
                str = r1.A0P(r6, r1.A0A(r5.A0H));
            }
        }
        A0B(str, true);
    }

    public void A0B(CharSequence charSequence, boolean z) {
        StringBuilder A0o;
        ViewHolder viewHolder = this.A08;
        viewHolder.A0G.setVisibility(8);
        if (TextUtils.isEmpty(charSequence)) {
            viewHolder.A0Q.setVisibility(8);
            return;
        }
        if (z) {
            if (C620733j.A04(this.A0C) == C107555bV.A0C(charSequence)) {
                A0o = C18290x4.A0v(charSequence);
                A0o.append(": ");
            } else {
                A0o = AnonymousClass001.A0o();
                A0o.append(" :");
                A0o.append(charSequence);
            }
            charSequence = A0o.toString();
        }
        TextEmojiLabel textEmojiLabel = viewHolder.A0Q;
        textEmojiLabel.A0K((List) null, charSequence);
        textEmojiLabel.setVisibility(0);
    }

    public AnonymousClass5ZN(Context context, C56972sr r3, C625735q r4, C56962sq r5, C64773Ex r6, AnonymousClass5ZU r7, C1230266t r8, ViewHolder viewHolder, C620633i r10, C56612sH r11, C54292oU r12, C620733j r13, C56982ss r14, C46962cU r15, AnonymousClass1VX r16, AnonymousClass3LP r17, C52472lX r18, C106195Xz r19, C1907099n r20, AnonymousClass9U4 r21, C195219Wq r22, C50222hp r23, C56072rN r24, C107075ae r25, C183538qC r26) {
        this.A08 = viewHolder;
        this.A01 = context;
        this.A0A = r11;
        this.A0F = r16;
        this.A0I = r19;
        this.A02 = r3;
        this.A0B = r12;
        this.A0D = r14;
        this.A0G = r17;
        this.A0L = r22;
        this.A05 = r6;
        this.A0E = r15;
        this.A09 = r10;
        this.A06 = r7;
        this.A0C = r13;
        this.A0N = r24;
        this.A0K = r21;
        this.A0O = r25;
        this.A04 = r5;
        this.A0H = r18;
        this.A0J = r20;
        this.A03 = r4;
        this.A07 = r8;
        this.A0M = r23;
        this.A0P = r26;
    }

    public static Drawable A02(Context context, ImageView imageView, AnonymousClass4DU r5) {
        Drawable drawable = null;
        if (r5.BEM() != 1) {
            drawable = C107335b8.A01(context, R.drawable.msg_status_viewonce_one);
        }
        imageView.setImageDrawable(drawable);
        Drawable A012 = C107335b8.A01(context, R.drawable.msg_status_ephemeral_ring);
        imageView.setBackground(A012);
        imageView.setVisibility(0);
        return A012;
    }

    public static String A04(Context context, AnonymousClass4DU r3) {
        int i;
        int BEM = r3.BEM();
        if (BEM != 0) {
            if (BEM == 1) {
                i = R.string.f11nameremoved;
                return context.getString(i);
            } else if (BEM != 2) {
                throw AnonymousClass001.A0e("unhandled view once state");
            }
        }
        if (r3 instanceof AnonymousClass1n3) {
            i = R.string.f11nameremoved;
        } else if (r3 instanceof C31991pD) {
            i = R.string.f11nameremoved;
        } else {
            boolean z = r3 instanceof C30711mt;
            i = R.string.f11nameremoved;
            if (z) {
                i = R.string.f11nameremoved;
            }
        }
        return context.getString(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v47, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v48, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v57, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v58, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v63, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v64, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r10v4, types: [X.4qJ] */
    /* JADX WARNING: type inference failed for: r10v5, types: [X.4qL] */
    /* JADX WARNING: type inference failed for: r10v6, types: [X.4qK] */
    /* JADX WARNING: type inference failed for: r10v9, types: [X.4qI] */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0535, code lost:
        if (r2 != false) goto L_0x0537;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(X.AnonymousClass3ZH r28, X.AnonymousClass3ZH r29, X.AnonymousClass3ZH r30, X.C624134x r31, X.C41862Lw r32, java.util.List r33, int r34) {
        /*
            r27 = this;
            r17 = r30
            r0 = r27
            X.1VX r1 = r0.A0F
            r22 = r1
            r2 = 2579(0xa13, float:3.614E-42)
            boolean r2 = r1.A0X(r2)
            r24 = r29
            r1 = r31
            if (r2 == 0) goto L_0x01b5
            if (r31 == 0) goto L_0x01b5
            boolean r6 = r1 instanceof X.C30481mW
            if (r6 != 0) goto L_0x002a
            boolean r2 = r1 instanceof X.C30341mI
            if (r2 != 0) goto L_0x002a
            boolean r2 = r1 instanceof X.AnonymousClass1n2
            if (r2 != 0) goto L_0x002a
            boolean r2 = r1 instanceof X.C31971pB
            if (r2 != 0) goto L_0x002a
            boolean r2 = r1 instanceof X.C31961pA
            if (r2 == 0) goto L_0x01b5
        L_0x002a:
            X.2sH r3 = r0.A0A
            android.content.Context r11 = r0.A01
            X.5Xz r4 = r0.A0I
            X.2sr r12 = r0.A02
            X.5ZU r13 = r0.A06
            X.35q r5 = r0.A03
            r2 = 0
            X.C162457s7.A0J(r3, r2)
            X.C18260x0.A0f(r11, r4, r12, r13, r5)
            if (r6 == 0) goto L_0x014f
            r2 = r1
            X.1mW r2 = (X.C30481mW) r2
            X.4qI r10 = new X.4qI
            r14 = r3
            r15 = r24
            r16 = r17
            r17 = r4
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x0050:
            com.whatsapp.conversationslist.ViewHolder r6 = r0.A08
            com.whatsapp.TextEmojiLabel r12 = r6.A0P
            boolean r2 = r10 instanceof X.AnonymousClass4qM
            if (r2 == 0) goto L_0x0129
            r7 = r10
            X.4qM r7 = (X.AnonymousClass4qM) r7
            boolean r2 = r7 instanceof X.C94214qL
            if (r2 == 0) goto L_0x00f0
            android.content.Context r4 = r7.A00
            X.34x r8 = r7.A06
            r2 = r8
            X.1pB r2 = (X.C31971pB) r2
            java.lang.String r5 = X.C106485Ze.A02(r4, r2)
        L_0x006a:
            if (r5 != 0) goto L_0x00d8
            r5 = 0
        L_0x006d:
            X.66t r2 = r0.A07
            java.util.List r15 = r2.BBO()
            X.5ae r13 = r0.A0O
            r4 = 0
            int r7 = r1.A0D
            r2 = 6
            boolean r17 = X.AnonymousClass001.A1X(r7, r2)
            r16 = 150(0x96, float:2.1E-43)
            r14 = r5
            r12.A0H(r13, r14, r15, r16, r17)
            android.graphics.drawable.Drawable r2 = X.C106485Ze.A00(r11, r3, r1)
            android.widget.ImageView r1 = r6.A0H
            r1.setImageDrawable(r2)
            boolean r1 = r10 instanceof X.C94214qL
            if (r1 == 0) goto L_0x00b3
            android.content.Context r3 = r10.A00
            boolean r2 = X.C1001059l.A04
            r1 = 2131233216(0x7f0809c0, float:1.8082563E38)
            if (r2 == 0) goto L_0x009c
            r1 = 2131233217(0x7f0809c1, float:1.8082565E38)
        L_0x009c:
            android.graphics.drawable.Drawable r2 = X.C107335b8.A01(r3, r1)
        L_0x00a0:
            X.C162457s7.A0D(r2)
        L_0x00a3:
            android.widget.ImageView r1 = r6.A0D
            r1.setImageDrawable(r2)
            if (r2 != 0) goto L_0x00ac
            r4 = 8
        L_0x00ac:
            r1.setVisibility(r4)
            r0.A07(r10)
        L_0x00b2:
            return
        L_0x00b3:
            boolean r1 = r10 instanceof X.AnonymousClass4qK
            if (r1 == 0) goto L_0x00c8
            android.content.Context r3 = r10.A00
            boolean r2 = X.C1001059l.A04
            r1 = 2131233178(0x7f08099a, float:1.8082486E38)
            if (r2 == 0) goto L_0x00c3
            r1 = 2131233179(0x7f08099b, float:1.8082488E38)
        L_0x00c3:
            android.graphics.drawable.Drawable r2 = X.C107335b8.A01(r3, r1)
            goto L_0x00a0
        L_0x00c8:
            boolean r1 = r10 instanceof X.C94204qJ
            if (r1 == 0) goto L_0x00d6
            android.content.Context r2 = r10.A00
            r1 = 2131233172(0x7f080994, float:1.8082474E38)
            android.graphics.drawable.Drawable r2 = X.C107335b8.A01(r2, r1)
            goto L_0x00a0
        L_0x00d6:
            r2 = 0
            goto L_0x00a3
        L_0x00d8:
            android.content.Context r9 = r7.A00
            X.5Xz r7 = r7.A00
            java.util.List r2 = r8.A18
            if (r2 == 0) goto L_0x006d
            android.text.SpannableStringBuilder r5 = X.C18330xA.A00(r5)
            java.util.List r4 = r8.A18
            X.5np r2 = new X.5np
            r2.<init>(r9)
            r7.A06(r5, r2, r4)
            goto L_0x006d
        L_0x00f0:
            boolean r2 = r7 instanceof X.AnonymousClass4qK
            if (r2 == 0) goto L_0x0101
            android.content.Context r4 = r7.A00
            X.34x r8 = r7.A06
            r2 = r8
            X.1n2 r2 = (X.AnonymousClass1n2) r2
            java.lang.String r5 = X.C106485Ze.A01(r4, r2)
            goto L_0x006a
        L_0x0101:
            boolean r2 = r7 instanceof X.C94204qJ
            if (r2 == 0) goto L_0x0121
            android.content.Context r5 = r7.A00
            X.34x r8 = r7.A06
            r4 = r8
            X.1mV r4 = (X.C30471mV) r4
            boolean r2 = X.C86614Ku.A1Z(r4)
            if (r2 == 0) goto L_0x011b
            r2 = 2131888301(0x7f1208ad, float:1.9411233E38)
            java.lang.String r5 = r5.getString(r2)
            goto L_0x006a
        L_0x011b:
            java.lang.String r5 = r4.A1w()
            goto L_0x006a
        L_0x0121:
            X.34x r8 = r7.A06
            java.lang.String r5 = r8.A13()
            goto L_0x006a
        L_0x0129:
            r2 = r10
            X.4qH r2 = (X.C94194qH) r2
            android.content.Context r9 = r2.A00
            X.34x r8 = r2.A06
            X.1mI r8 = (X.C30341mI) r8
            X.35q r7 = r2.A00
            int r5 = r8.A00
            r2 = 3
            r4 = 2131889815(0x7f120e97, float:1.9414304E38)
            if (r5 == r2) goto L_0x0149
            r2 = 2
            r4 = 2131889816(0x7f120e98, float:1.9414306E38)
            if (r5 == r2) goto L_0x0149
            r2 = 0
            java.lang.String r5 = r7.A0O(r8, r2)
            goto L_0x006d
        L_0x0149:
            java.lang.String r5 = r9.getString(r4)
            goto L_0x006d
        L_0x014f:
            boolean r2 = r1 instanceof X.C30341mI
            if (r2 == 0) goto L_0x016d
            r2 = r1
            X.1mI r2 = (X.C30341mI) r2
            X.4qH r10 = new X.4qH
            r18 = r10
            r19 = r11
            r20 = r12
            r21 = r5
            r22 = r13
            r23 = r3
            r25 = r17
            r26 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0050
        L_0x016d:
            boolean r2 = r1 instanceof X.AnonymousClass1n2
            if (r2 == 0) goto L_0x0184
            r2 = r1
            X.1n2 r2 = (X.AnonymousClass1n2) r2
            X.4qK r10 = new X.4qK
            r14 = r3
            r15 = r24
            r16 = r17
            r17 = r4
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0050
        L_0x0184:
            boolean r2 = r1 instanceof X.C31971pB
            if (r2 == 0) goto L_0x019b
            r2 = r1
            X.1pB r2 = (X.C31971pB) r2
            X.4qL r10 = new X.4qL
            r14 = r3
            r15 = r24
            r16 = r17
            r17 = r4
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0050
        L_0x019b:
            boolean r2 = r1 instanceof X.C31961pA
            if (r2 == 0) goto L_0x01b2
            r2 = r1
            X.1pA r2 = (X.C31961pA) r2
            X.4qJ r10 = new X.4qJ
            r14 = r3
            r15 = r24
            r16 = r17
            r17 = r4
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0050
        L_0x01b2:
            r10 = 0
            goto L_0x0050
        L_0x01b5:
            com.whatsapp.conversationslist.ViewHolder r8 = r0.A08
            android.view.View r2 = r8.A08
            r12 = 8
            r2.setVisibility(r12)
            android.widget.ImageView r11 = r8.A0H
            r7 = 0
            r11.setVisibility(r7)
            android.widget.ImageView r4 = r8.A0I
            r4.setVisibility(r12)
            android.widget.ImageView r6 = r8.A0D
            r6.setVisibility(r12)
            com.whatsapp.WaTextView r2 = r8.A0T
            r2.setVisibility(r12)
            android.content.Context r10 = r0.A01
            X.C626936e.A06(r10)
            r13 = 0
            r6.setBackground(r13)
            java.lang.String r2 = ""
            r21 = r2
            r9 = 1
            if (r31 == 0) goto L_0x02e9
            boolean r3 = X.C624134x.A0g(r1)
            if (r3 == 0) goto L_0x02e9
            r5 = 5141(0x1415, float:7.204E-42)
            r3 = r22
            boolean r3 = r3.A0X(r5)
            if (r3 == 0) goto L_0x02e9
            r6.setVisibility(r12)
            X.2z0 r3 = r1.A1J
            boolean r3 = r3.A02
            if (r3 == 0) goto L_0x02ba
            r3 = 2131887908(0x7f120724, float:1.9410436E38)
            java.lang.String r5 = r10.getString(r3)
        L_0x0203:
            r14 = r2
            r20 = 0
        L_0x0206:
            r19 = r33
            r15 = r0
            r16 = r24
            r18 = r1
            r15.A0A(r16, r17, r18, r19, r20)
            r3 = r34 & 1
            if (r3 == 0) goto L_0x0225
            r4 = 4659(0x1233, float:6.529E-42)
            r3 = r22
            boolean r3 = r3.A0X(r4)
            if (r3 == 0) goto L_0x0225
            r12 = r5
            r3 = 150(0x96, float:2.1E-43)
            if (r5 != 0) goto L_0x0262
            r12 = 0
        L_0x0224:
            r5 = r12
        L_0x0225:
            com.whatsapp.TextEmojiLabel r15 = r8.A0P
            X.66t r3 = r0.A07
            java.util.List r18 = r3.BBO()
            X.5ae r4 = r0.A0O
            if (r31 == 0) goto L_0x0237
            int r3 = r1.A0D
            r1 = 6
            if (r3 == r1) goto L_0x0237
            r7 = 1
        L_0x0237:
            r19 = 150(0x96, float:2.1E-43)
            r17 = r5
            r20 = r7
            r16 = r4
            r15.A0H(r16, r17, r18, r19, r20)
            X.5Tm r1 = r8.A0c
            com.whatsapp.components.ConversationListRowHeaderView r3 = r1.A03
            com.whatsapp.WaTextView r1 = r3.A01
            r1.setText(r14)
            com.whatsapp.WaTextView r1 = r3.A01
            r1.setContentDescription(r2)
            X.2m0 r1 = r0.A00
            if (r1 == 0) goto L_0x00b2
            android.graphics.drawable.Drawable r1 = r6.getDrawable()
            boolean r1 = r1 instanceof X.AnonymousClass0AR
            if (r1 != 0) goto L_0x00b2
            X.2m0 r0 = r0.A00
            r0.A02()
            return
        L_0x0262:
            android.util.Pair r3 = X.C107635bd.A05(r5, r3, r7)     // Catch:{ all -> 0x02a4 }
            java.lang.Object r11 = r3.first     // Catch:{ all -> 0x02a4 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x02a4 }
            boolean r3 = r11.isEmpty()     // Catch:{ all -> 0x02a4 }
            if (r3 != 0) goto L_0x0224
            android.text.SpannableStringBuilder r12 = android.text.SpannableStringBuilder.valueOf(r5)     // Catch:{ all -> 0x02a4 }
            java.util.Iterator r16 = r11.iterator()     // Catch:{ all -> 0x02a4 }
        L_0x0278:
            boolean r3 = r16.hasNext()     // Catch:{ all -> 0x02a4 }
            if (r3 == 0) goto L_0x0224
            java.lang.Object r13 = r16.next()     // Catch:{ all -> 0x02a4 }
            X.7hD r13 = (X.C156797hD) r13     // Catch:{ all -> 0x02a4 }
            int r15 = r13.A00     // Catch:{ all -> 0x02a4 }
            int r10 = r13.A03     // Catch:{ all -> 0x02a4 }
            int r4 = r15 - r10
            r3 = r21
            r12.replace(r4, r15, r3)     // Catch:{ all -> 0x02a4 }
            int r3 = r13.A00     // Catch:{ all -> 0x02a4 }
            int r3 = r3 - r10
            X.C107635bd.A0O(r11, r3, r10)     // Catch:{ all -> 0x02a4 }
            int r15 = r13.A01     // Catch:{ all -> 0x02a4 }
            int r4 = r10 + r15
            r3 = r21
            r12.replace(r15, r4, r3)     // Catch:{ all -> 0x02a4 }
            int r3 = r13.A01     // Catch:{ all -> 0x02a4 }
            X.C107635bd.A0O(r11, r3, r10)     // Catch:{ all -> 0x02a4 }
            goto L_0x0278
        L_0x02a4:
            r11 = move-exception
            X.2sq r3 = r0.A04
            X.2qk r10 = r3.A03
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "remove rich format "
            java.lang.String r4 = X.AnonymousClass000.A0a(r3, r4, r11)
            java.lang.String r3 = "BaseViewFiller/fillMessage"
            r10.A0A(r3, r9, r4)
            goto L_0x0225
        L_0x02ba:
            if (r30 != 0) goto L_0x02cc
            r3 = 2131887909(0x7f120725, float:1.9410438E38)
            java.lang.String r4 = r10.getString(r3)
        L_0x02c3:
            r3 = 2131887907(0x7f120723, float:1.9410434E38)
            java.lang.String r5 = X.AnonymousClass0x2.A0X(r10, r4, r9, r3)
            goto L_0x0203
        L_0x02cc:
            java.lang.Class<com.whatsapp.jid.GroupJid> r4 = com.whatsapp.jid.GroupJid.class
            r3 = r24
            com.whatsapp.jid.Jid r4 = r3.A0I(r4)
            X.4uZ r4 = (X.C95814uZ) r4
            if (r4 == 0) goto L_0x02e7
            X.5ZU r3 = r0.A06
            int r5 = r3.A09(r4)
        L_0x02de:
            X.5ZU r4 = r0.A06
            r3 = r17
            java.lang.String r4 = r4.A0P(r3, r5)
            goto L_0x02c3
        L_0x02e7:
            r5 = 1
            goto L_0x02de
        L_0x02e9:
            boolean r3 = r24.A0U()
            if (r3 == 0) goto L_0x031e
            X.2lX r5 = r0.A0H
            r3 = r24
            boolean r3 = r5.A01(r3)
            if (r3 == 0) goto L_0x031e
            r5 = 3180(0xc6c, float:4.456E-42)
            r3 = r22
            boolean r3 = r3.A0X(r5)
            if (r3 == 0) goto L_0x031e
            r3 = 2131894179(0x7f121fa3, float:1.9423155E38)
            java.lang.String r5 = r10.getString(r3)
            r3 = 2131233159(0x7f080987, float:1.8082448E38)
            android.graphics.drawable.Drawable r3 = X.C107335b8.A01(r10, r3)
            r6.setVisibility(r7)
            r6.setImageDrawable(r3)
            r14 = r2
            r20 = 1
            r17 = r13
            goto L_0x0206
        L_0x031e:
            X.2sq r5 = r0.A04
            r3 = r24
            X.4uZ r3 = r3.A0H
            boolean r3 = X.C86614Ku.A1X(r5, r3)
            if (r3 == 0) goto L_0x0354
            X.3LP r4 = r0.A0G
            r3 = r24
            boolean r3 = X.C86624Kv.A1X(r3, r4)
            if (r3 == 0) goto L_0x0343
            r3 = 2131895452(0x7f12249c, float:1.9425737E38)
            java.lang.String r5 = X.AnonymousClass1RT.A00(r10, r3)
        L_0x033b:
            r11.setVisibility(r12)
        L_0x033e:
            r14 = r2
            r20 = 1
            goto L_0x0206
        L_0x0343:
            boolean r4 = r24.A0R()
            r3 = 2131886835(0x7f1202f3, float:1.940826E38)
            if (r4 == 0) goto L_0x034f
            r3 = 2131886832(0x7f1202f0, float:1.9408254E38)
        L_0x034f:
            java.lang.String r5 = r10.getString(r3)
            goto L_0x033b
        L_0x0354:
            if (r31 == 0) goto L_0x0556
            android.util.Pair r2 = r0.A05(r1)
            java.lang.Object r5 = r2.second
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r3 = r32
            boolean r2 = X.C106565Zm.A02(r1, r3)
            if (r2 == 0) goto L_0x0540
            X.2m0 r2 = r0.A00
            if (r2 == 0) goto L_0x036d
            r2.A02()
        L_0x036d:
            X.34x r14 = r3.A00
            android.util.Pair r4 = r0.A05(r14)
            r6.setVisibility(r12)
            r11.setVisibility(r12)
            boolean r12 = r24.A0U()
            X.1mH r5 = r3.A01
            X.2z0 r2 = r5.A1J
            boolean r2 = r2.A02
            if (r12 == 0) goto L_0x0535
            if (r2 != 0) goto L_0x0537
            r15 = r28
            if (r28 == 0) goto L_0x0399
            X.5ZU r13 = r0.A06
            r12 = r24
            X.4uZ r12 = r12.A0H
            int r12 = r13.A09(r12)
            java.lang.String r13 = r13.A0P(r15, r12)
        L_0x0399:
            X.C626936e.A06(r3)
            X.2oU r3 = r0.A0B
            com.whatsapp.TextEmojiLabel r12 = r8.A0P
            boolean r15 = r5 instanceof X.C30571mf
            if (r15 == 0) goto L_0x044a
            X.1mf r5 = (X.C30571mf) r5
            android.content.Context r15 = r3.A00
            java.lang.String r2 = r5.A01
            java.lang.String r3 = X.C107165ao.A03(r2)
            r16 = r21
            if (r13 == 0) goto L_0x03be
            java.lang.String r14 = r13.toString()
            java.lang.String r13 = "⁣"
            r2 = r21
            java.lang.String r16 = r14.replaceAll(r13, r2)
        L_0x03be:
            java.lang.Object r13 = r4.first
            android.graphics.drawable.Drawable r13 = (android.graphics.drawable.Drawable) r13
            java.lang.Object r2 = r4.second
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r14 = r21
            if (r2 == 0) goto L_0x03d6
            java.lang.String r14 = r2.toString()
            java.lang.String r4 = "⁣"
            r2 = r21
            java.lang.String r14 = r14.replaceAll(r4, r2)
        L_0x03d6:
            if (r13 == 0) goto L_0x03e2
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "⁣ "
            java.lang.String r14 = X.AnonymousClass000.A0V(r2, r14, r4)
        L_0x03e2:
            X.2z0 r2 = r5.A1J
            boolean r2 = r2.A02
            r5 = 2
            if (r2 == 0) goto L_0x0433
            r4 = 2131892850(0x7f121a72, float:1.942046E38)
        L_0x03ec:
            java.lang.Object[] r2 = X.AnonymousClass4L0.A0V(r3, r14, r5)
        L_0x03f0:
            java.lang.String r4 = r15.getString(r4, r2)
            android.text.SpannableString r5 = X.AnonymousClass4L0.A0A(r4)
            if (r13 == 0) goto L_0x040f
            X.C106565Zm.A00(r13, r12)
            X.4Mw r3 = new X.4Mw
            r3.<init>(r13)
            java.lang.String r2 = "⁣"
            int r12 = r4.indexOf(r2)
        L_0x0408:
            int r4 = r12 + 1
        L_0x040a:
            r2 = 17
            r5.setSpan(r3, r12, r4, r2)
        L_0x040f:
            r13 = 1
        L_0x0410:
            r20 = r13 ^ 1
        L_0x0412:
            X.2sH r4 = r0.A0A
            X.33j r12 = r0.A0C
            long r2 = r1.A0K
            long r2 = r4.A0I(r2)
            java.lang.String r14 = X.C107565bW.A0F(r12, r2, r7)
            long r2 = r1.A0K
            long r2 = r4.A0I(r2)
            java.lang.String r2 = X.C107565bW.A0F(r12, r2, r9)
            if (r13 == 0) goto L_0x055c
            r3 = 8
            r11.setVisibility(r3)
            goto L_0x0206
        L_0x0433:
            boolean r2 = android.text.TextUtils.isEmpty(r16)
            r4 = 2131892849(0x7f121a71, float:1.9420458E38)
            if (r2 != 0) goto L_0x03ec
            r4 = 2131892848(0x7f121a70, float:1.9420456E38)
            java.lang.Object[] r2 = X.AnonymousClass0x9.A1X()
            r2[r7] = r16
            r2[r9] = r3
            r2[r5] = r14
            goto L_0x03f0
        L_0x044a:
            boolean r4 = r14 instanceof X.C30451mT
            if (r4 == 0) goto L_0x04b1
            X.1mT r14 = (X.C30451mT) r14
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            android.content.Context r3 = r3.A00
            r18 = r3
            if (r2 == 0) goto L_0x049b
            android.content.res.Resources r3 = r18.getResources()
            r2 = 2131892659(0x7f1219b3, float:1.9420073E38)
            java.lang.String r13 = r3.getString(r2)
        L_0x0465:
            r4.append(r13)
            java.lang.String r2 = "   "
            r4.append(r2)
            java.lang.String r2 = r14.A03
            java.lang.String r2 = X.AnonymousClass000.A0X(r2, r4)
            android.text.SpannableString r5 = X.AnonymousClass4L0.A0A(r2)
            boolean r2 = X.C86614Ku.A1Y(r22)
            r3 = 2131233198(0x7f0809ae, float:1.8082527E38)
            if (r2 == 0) goto L_0x0483
            r3 = 2131233199(0x7f0809af, float:1.8082529E38)
        L_0x0483:
            r2 = r18
            android.graphics.drawable.Drawable r2 = X.C107335b8.A01(r2, r3)
            X.C106565Zm.A00(r2, r12)
            X.4Mw r3 = new X.4Mw
            r3.<init>(r2)
            int r2 = r13.length()
            int r12 = r2 + 1
            int r4 = r2 + 2
            goto L_0x040a
        L_0x049b:
            android.content.res.Resources r15 = r18.getResources()
            r3 = 2131892660(0x7f1219b4, float:1.9420075E38)
            java.lang.Object[] r2 = new java.lang.Object[r9]
            boolean r16 = android.text.TextUtils.isEmpty(r13)
            if (r16 == 0) goto L_0x04ac
            java.lang.String r13 = r5.A13
        L_0x04ac:
            java.lang.String r13 = X.C18320x8.A0b(r15, r13, r2, r7, r3)
            goto L_0x0465
        L_0x04b1:
            boolean r2 = r14 instanceof X.C30461mU
            if (r2 == 0) goto L_0x04d9
            boolean r2 = r5 instanceof X.C30601mi
            if (r2 == 0) goto L_0x04d9
            X.1mU r14 = (X.C30461mU) r14
            X.1mi r5 = (X.C30601mi) r5
            X.21m r4 = r5.A01
            r2 = 0
            if (r4 == 0) goto L_0x04ca
            X.21m r15 = X.C372421m.NOT_GOING
            if (r4 == r15) goto L_0x04dd
            X.21m r15 = X.C372421m.GOING
            if (r4 == r15) goto L_0x04dd
        L_0x04ca:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "ConversationListUtils/Attempted to show preview for response. Response == null:"
            r5.append(r3)
            if (r4 != 0) goto L_0x04d6
            r2 = 1
        L_0x04d6:
            X.C18260x0.A1U(r5, r2)
        L_0x04d9:
            r5 = 0
            r13 = 0
            goto L_0x0410
        L_0x04dd:
            android.content.Context r3 = r3.A00
            r16 = r21
            if (r13 == 0) goto L_0x04ef
            java.lang.String r15 = r13.toString()
            java.lang.String r13 = "⁣"
            r2 = r21
            java.lang.String r16 = r15.replaceAll(r13, r2)
        L_0x04ef:
            java.lang.String r14 = r14.A04
            X.2z0 r2 = r5.A1J
            boolean r2 = r2.A02
            r5 = 2
            if (r2 == 0) goto L_0x052c
            r15 = 0
        L_0x04f9:
            X.21m r2 = X.C372421m.GOING
            r13 = 1
            if (r4 != r2) goto L_0x04ff
            r13 = 0
        L_0x04ff:
            int[][] r2 = X.C106565Zm.A00
            r2 = r2[r15]
            r4 = r2[r13]
            java.lang.Object[] r2 = X.AnonymousClass0x9.A1X()
            r2[r7] = r16
            java.lang.String r13 = "⁣"
            r2[r9] = r13
            java.lang.String r4 = X.AnonymousClass002.A0F(r3, r14, r2, r5, r4)
            android.text.SpannableString r5 = X.AnonymousClass4L0.A0A(r4)
            r2 = 2131233922(0x7f080c82, float:1.8083995E38)
            android.graphics.drawable.Drawable r2 = X.C107335b8.A01(r3, r2)
            X.C106565Zm.A00(r2, r12)
            X.4Mw r3 = new X.4Mw
            r3.<init>(r2)
            int r12 = r4.indexOf(r13)
            goto L_0x0408
        L_0x052c:
            boolean r2 = android.text.TextUtils.isEmpty(r16)
            int r15 = X.C18280x3.A01(r2)
            goto L_0x04f9
        L_0x0535:
            if (r2 == 0) goto L_0x0399
        L_0x0537:
            r12 = 2131890036(0x7f120f74, float:1.9414752E38)
            java.lang.String r13 = r10.getString(r12)
            goto L_0x0399
        L_0x0540:
            X.34x r2 = r1.A0w()
            if (r2 == 0) goto L_0x0551
            X.2z0 r2 = r2.A1J
            X.4uZ r2 = r2.A00
            boolean r2 = r2 instanceof X.C135166kE
            if (r2 == 0) goto L_0x0551
            r4.setVisibility(r7)
        L_0x0551:
            r13 = 0
            r20 = 1
            goto L_0x0412
        L_0x0556:
            r11.setVisibility(r12)
            r5 = r2
            goto L_0x033e
        L_0x055c:
            android.graphics.drawable.Drawable r3 = X.C106485Ze.A00(r10, r4, r1)
            r11.setImageDrawable(r3)
            goto L_0x0206
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZN.A09(X.3ZH, X.3ZH, X.3ZH, X.34x, X.2Lw, java.util.List, int):void");
    }
}
