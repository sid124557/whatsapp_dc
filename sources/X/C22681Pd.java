package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1Pd  reason: invalid class name and case insensitive filesystem */
public class C22681Pd extends C93314oJ {
    public C1230066r A00;
    public C56762sW A01;
    public AnonymousClass30G A02;
    public C56322rn A03;
    public C55422qK A04;
    public C50562iN A05;
    public AnonymousClass35J A06;
    public C29281iZ A07;
    public C183538qC A08;
    public boolean A09;
    public final TextEmojiLabel A0A;
    public final TextEmojiLabel A0B;
    public final TextEmojiLabel A0C;
    public final WaImageView A0D;
    public final C84904Ee A0E = new AnonymousClass4IE(this, 2);
    public final AnonymousClass5UY A0F;
    public final AnonymousClass5UY A0G;
    public final AnonymousClass5UY A0H;

    public static /* synthetic */ void A00(Context context, C22681Pd r5, C30491mX r6) {
        AnonymousClass2z0 r0 = r6.A1J;
        C95814uZ r1 = r0.A00;
        if (r0.A02 || ((r1 instanceof GroupJid) && r5.A1L.A0D((GroupJid) r1))) {
            SpannableString spannableString = new SpannableString(context.getString(R.string.f11nameremoved));
            spannableString.setSpan(new ForegroundColorSpan(-65536), 0, spannableString.length(), 0);
            C19340zH A002 = AnonymousClass5V0.A00(context);
            A002.A0h(context.getString(R.string.f11nameremoved));
            A002.A0i(true);
            A002.A0W((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
            A002.A00.A0I(new AnonymousClass4I8(r6, 8, r5), spannableString);
            C18280x3.A0q(A002);
        }
    }

    private AnonymousClass3LB getVoipErrorFragmentBridge() {
        return C48062eH.A00(this.A2B);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1 != null) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setupBubbleIcon(X.C30491mX r4) {
        /*
            r3 = this;
            com.whatsapp.WaImageView r2 = r3.A0D
            boolean r0 = r4 instanceof X.AnonymousClass1nW
            if (r0 == 0) goto L_0x000f
            X.1nW r4 = (X.AnonymousClass1nW) r4
            X.1mH r1 = r4.A00
            r0 = 2131234287(0x7f080def, float:1.8084735E38)
            if (r1 == 0) goto L_0x0012
        L_0x000f:
            r0 = 2131234288(0x7f080df0, float:1.8084738E38)
        L_0x0012:
            r2.setImageResource(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22681Pd.setupBubbleIcon(X.1mX):void");
    }

    private void setupCallTypeView(C30491mX r6) {
        boolean A1U = AnonymousClass000.A1U(r6.A00, 2);
        Context context = getContext();
        int i = R.string.f11nameremoved;
        if (A1U) {
            i = R.string.f11nameremoved;
        }
        String string = context.getString(i);
        int i2 = r6.A00;
        int i3 = R.drawable.ic_action_call;
        if (i2 == 2) {
            i3 = R.drawable.ic_action_videocall;
        }
        Drawable A0G2 = C18310x6.A0G(getContext(), i3);
        TextEmojiLabel textEmojiLabel = this.A0B;
        AnonymousClass0x7.A15(C107335b8.A0B(A0G2, textEmojiLabel.getCurrentTextColor()), textEmojiLabel, string);
    }

    /* access modifiers changed from: private */
    public void setupJoinCallViewContent(long j) {
        Resources resources;
        int A052;
        TextView A092 = AnonymousClass002.A09(this.A0G.A04(), R.id.join_call);
        if (A092 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (j < currentTimeMillis - 86400000) {
                A092.setVisibility(0);
                A092.setText(R.string.f11nameremoved);
                resources = getResources();
                A052 = R.color.f5nameremoved;
            } else if (currentTimeMillis < j) {
                A092.setVisibility(8);
                return;
            } else {
                A092.setVisibility(0);
                A092.setText(R.string.f11nameremoved);
                resources = getResources();
                A052 = AnonymousClass0x2.A05(A092);
            }
            C18320x8.A11(resources, A092, A052);
        }
    }

    public void A0v() {
        if (!this.A09) {
            this.A09 = true;
            AnonymousClass0x7.A0I(this).A4f(this);
        }
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, this.A0S);
        super.A1q(r2, z);
        if (z || A1W) {
            A22();
        }
    }

    public void A22() {
        String A042;
        C620733j r4;
        Locale A022;
        int i;
        String A072;
        C95814uZ r0;
        C30491mX r5 = (C30491mX) this.A0S;
        if ((r5 instanceof C30971nX) && (r0 = ((C30971nX) r5).A01) != null) {
            r5.A1J(r0);
        }
        long j = r5.A01;
        if (C107175ap.A00(System.currentTimeMillis(), j) == 1) {
            A072 = C107505bQ.A00(this.A0M);
        } else {
            if (C107175ap.A00(System.currentTimeMillis(), j) == 0) {
                r4 = this.A0M;
                A022 = C620733j.A02(r4);
                i = 272;
            } else {
                if (C107175ap.A00(System.currentTimeMillis(), j) == -1) {
                    r4 = this.A0M;
                    A022 = C620733j.A02(r4);
                    i = 273;
                }
                A042 = C107505bQ.A04(this.A0M, j);
                String A002 = C107145am.A00(this.A0M, r5.A01);
                this.A0A.A0J(r5.A02, (List) null, 32, false);
                TextEmojiLabel textEmojiLabel = this.A0C;
                Context context = getContext();
                Object[] A0M = AnonymousClass002.A0M();
                C18280x3.A19(A042, A002, A0M);
                AnonymousClass001.A0y(context, textEmojiLabel, A0M, R.string.f11nameremoved);
                setupBubbleIcon(r5);
                setupCallTypeView(r5);
                setupActionButtons(getContext(), r5);
            }
            A072 = C107505bQ.A07(A022, r4.A0A(i));
        }
        if (A072 != null) {
            C620733j r7 = this.A0M;
            Object[] A1a = C18310x6.A1a(A072);
            A1a[1] = C107505bQ.A02(r7, j);
            A042 = r7.A0E(R.string.f11nameremoved, A1a);
            String A0022 = C107145am.A00(this.A0M, r5.A01);
            this.A0A.A0J(r5.A02, (List) null, 32, false);
            TextEmojiLabel textEmojiLabel2 = this.A0C;
            Context context2 = getContext();
            Object[] A0M2 = AnonymousClass002.A0M();
            C18280x3.A19(A042, A0022, A0M2);
            AnonymousClass001.A0y(context2, textEmojiLabel2, A0M2, R.string.f11nameremoved);
            setupBubbleIcon(r5);
            setupCallTypeView(r5);
            setupActionButtons(getContext(), r5);
        }
        A042 = C107505bQ.A04(this.A0M, j);
        String A00222 = C107145am.A00(this.A0M, r5.A01);
        this.A0A.A0J(r5.A02, (List) null, 32, false);
        TextEmojiLabel textEmojiLabel22 = this.A0C;
        Context context22 = getContext();
        Object[] A0M22 = AnonymousClass002.A0M();
        C18280x3.A19(A042, A00222, A0M22);
        AnonymousClass001.A0y(context22, textEmojiLabel22, A0M22, R.string.f11nameremoved);
        setupBubbleIcon(r5);
        setupCallTypeView(r5);
        setupActionButtons(getContext(), r5);
    }

    public C30491mX getFMessage() {
        return (C30491mX) this.A0S;
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C30491mX);
        this.A0S = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (((X.AnonymousClass1nW) r9).A00 != null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setupActionButtons(android.content.Context r8, X.C30491mX r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.AnonymousClass1nW
            if (r0 == 0) goto L_0x000c
            r0 = r9
            X.1nW r0 = (X.AnonymousClass1nW) r0
            X.1mH r1 = r0.A00
            r0 = 1
            if (r1 == 0) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            r6 = 0
            r5 = 8
            if (r0 == 0) goto L_0x0061
            X.5UY r2 = r7.A0G
            r2.A06(r6)
            r1 = 24
            X.5eg r0 = new X.5eg
            r0.<init>(r7, r1, r9)
            r2.A07(r0)
            long r0 = r9.A01
            r7.setupJoinCallViewContent(r0)
            X.2z0 r0 = r9.A1J
            X.4uZ r1 = r0.A00
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x003c
            boolean r0 = r1 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x005b
            X.2sj r0 = r7.A1L
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            boolean r0 = r0.A0D(r1)
            if (r0 == 0) goto L_0x005b
        L_0x003c:
            long r3 = r9.A01
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x005b
            X.5UY r2 = r7.A0F
            r2.A06(r6)
            r1 = 36
            X.5f5 r0 = new X.5f5
            r0.<init>((java.lang.Object) r7, (java.lang.Object) r9, (java.lang.Object) r8, (int) r1)
            r2.A07(r0)
        L_0x0055:
            X.5UY r0 = r7.A0H
            r0.A06(r5)
            return
        L_0x005b:
            X.5UY r0 = r7.A0F
            r0.A06(r5)
            goto L_0x0055
        L_0x0061:
            X.5UY r0 = r7.A0G
            r0.A06(r5)
            X.5UY r0 = r7.A0F
            r0.A06(r5)
            X.5UY r2 = r7.A0H
            r2.A06(r6)
            r1 = 25
            X.5eg r0 = new X.5eg
            r0.<init>(r7, r1, r9)
            r2.A07(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22681Pd.setupActionButtons(android.content.Context, X.1mX):void");
    }

    public C22681Pd(Context context, AnonymousClass677 r4, C30491mX r5) {
        super(context, r4, r5);
        A0v();
        setClickable(true);
        setLongClickable(false);
        this.A0B = AnonymousClass0x7.A0K(this, R.id.call_type);
        this.A0A = AnonymousClass0x7.A0K(this, R.id.call_title);
        this.A0C = AnonymousClass0x7.A0K(this, R.id.scheduled_time);
        this.A0D = AnonymousClass0x9.A0L(this, R.id.scheduled_call_bubble_icon);
        this.A0G = AnonymousClass0x2.A0M(this, R.id.action_join_stub);
        this.A0F = AnonymousClass0x2.A0M(this, R.id.action_cancel_stub);
        this.A0H = AnonymousClass0x2.A0M(this, R.id.canceled_stub);
        A1H();
    }

    public void A1H() {
        A22();
        super.A1H();
    }

    public boolean A1v() {
        return false;
    }

    public final void A23(C624134x r6) {
        C30331mH r1;
        Object A0n;
        Activity A022 = C111095hX.A02(getContext());
        if ((A022 instanceof C89654ea) && (r6 instanceof AnonymousClass1nW) && (r1 = ((AnonymousClass1nW) r6).A00) != null) {
            if (C627636p.A0P(this.A0Z, r1)) {
                A0n = C56972sr.A04(this.A0Z);
            } else {
                A0n = r1.A0n();
            }
            Bundle A082 = AnonymousClass002.A08();
            if (A0n != null) {
                A082.putParcelableArrayList("user_jids", AnonymousClass002.A0J(Collections.singletonList(A0n)));
            }
            getVoipErrorFragmentBridge();
            ((C89654ea) A022).Bon(VoipErrorDialogFragment.A00(A082, new C47702dg(), 32), (String) null);
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A07.A06(this.A0E);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A07.A07(this.A0E);
    }
}
