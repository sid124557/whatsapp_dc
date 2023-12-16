package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.ConversationListRowHeaderView;
import com.whatsapp.conversationslist.ViewHolder;
import java.util.Collections;

/* renamed from: X.4pv  reason: invalid class name and case insensitive filesystem */
public class C94114pv extends AnonymousClass5ZN {
    public AnonymousClass4q9 A00;
    public final Context A01;
    public final C64773Ex A02;
    public final C103445Mz A03;
    public final C1230266t A04;
    public final C620733j A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C94114pv(android.content.Context r28, X.C56972sr r29, X.C625735q r30, X.C56962sq r31, X.C64773Ex r32, X.AnonymousClass5ZU r33, X.C103445Mz r34, X.C1230266t r35, com.whatsapp.conversationslist.ViewHolder r36, X.C620633i r37, X.C56612sH r38, X.C54292oU r39, X.C620733j r40, X.C56982ss r41, X.C46962cU r42, X.AnonymousClass1VX r43, X.AnonymousClass3LP r44, X.C52472lX r45, X.C106195Xz r46, X.C1907099n r47, X.AnonymousClass9U4 r48, X.C195219Wq r49, X.C50222hp r50, X.C56072rN r51, X.C107075ae r52, X.C183538qC r53) {
        /*
            r27 = this;
            r12 = r39
            r11 = r38
            r10 = r37
            r9 = r36
            r8 = r35
            r7 = r33
            r6 = r32
            r5 = r31
            r4 = r30
            r3 = r29
            r2 = r28
            r1 = r27
            r13 = r40
            r26 = r53
            r25 = r52
            r24 = r51
            r23 = r50
            r22 = r49
            r21 = r48
            r20 = r47
            r19 = r46
            r18 = r45
            r17 = r44
            r16 = r43
            r15 = r42
            r14 = r41
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1.A01 = r2
            r1.A05 = r13
            r0 = r34
            r1.A03 = r0
            r1.A04 = r8
            r1.A02 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94114pv.<init>(android.content.Context, X.2sr, X.35q, X.2sq, X.3Ex, X.5ZU, X.5Mz, X.66t, com.whatsapp.conversationslist.ViewHolder, X.33i, X.2sH, X.2oU, X.33j, X.2ss, X.2cU, X.1VX, X.3LP, X.2lX, X.5Xz, X.99n, X.9U4, X.9Wq, X.2hp, X.2rN, X.5ae, X.8qC):void");
    }

    public final void A0C(C148957Kj r21) {
        C148957Kj r0 = r21;
        C624134x r10 = r0.A02;
        AnonymousClass3ZH r8 = r0.A00;
        AnonymousClass3ZH r9 = r0.A01;
        C620733j r15 = this.A05;
        ViewHolder viewHolder = this.A08;
        View view = viewHolder.A06;
        Context context = this.A01;
        C107555bV.A07(view, r15, context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 0, 0, 0);
        View view2 = viewHolder.A05;
        view2.setVisibility(8);
        viewHolder.A0J.setVisibility(8);
        viewHolder.A0H.setVisibility(8);
        viewHolder.A0D.setVisibility(8);
        viewHolder.A0F.setVisibility(8);
        viewHolder.A0E.setVisibility(8);
        viewHolder.A02.setVisibility(8);
        viewHolder.A0E(false, 0);
        TextEmojiLabel textEmojiLabel = viewHolder.A0P;
        textEmojiLabel.setVisibility(0);
        AnonymousClass0x2.A0q(context, textEmojiLabel, R.color.f5nameremoved);
        textEmojiLabel.A0A();
        textEmojiLabel.setPlaceholder(0);
        C105075Tm r2 = viewHolder.A0c;
        int A042 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        ConversationListRowHeaderView conversationListRowHeaderView = r2.A03;
        conversationListRowHeaderView.A01.setTextColor(A042);
        conversationListRowHeaderView.A01.setVisibility(0);
        ImageView imageView = viewHolder.A0B;
        imageView.setEnabled(false);
        imageView.setOnClickListener((View.OnClickListener) null);
        imageView.setOnLongClickListener((View.OnLongClickListener) null);
        view2.setOnClickListener((View.OnClickListener) null);
        view2.setOnLongClickListener((View.OnLongClickListener) null);
        C109475eg.A00(viewHolder.A0H, this, r10, 47);
        r2.A02(r8, this.A0O, this.A04.BBO());
        r2.A05.A0D(r8);
        A09((AnonymousClass3ZH) null, r8, r9, r10, (C41862Lw) null, Collections.emptyList(), 0);
    }

    public void A06() {
        super.A06();
        C86604Kt.A1R(this.A00);
    }
}
