package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.5RG  reason: invalid class name */
public class AnonymousClass5RG {
    public boolean A00;
    public final Context A01;
    public final LayoutInflater A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final ViewGroup A06;
    public final ImageView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final RecyclerView A0B;
    public final TextEmojiLabel A0C;
    public final TextEmojiLabel A0D;
    public final WaTextView A0E;
    public final C64773Ex A0F;
    public final AnonymousClass5ZU A0G;
    public final C105365Uq A0H;
    public final C56612sH A0I;
    public final C620733j A0J;
    public final C56982ss A0K;
    public final AnonymousClass1VX A0L;
    public final C87894Wn A0M;
    public final C56072rN A0N;
    public final WDSButton A0O;
    public final WDSButton A0P;

    public void A00(Bitmap bitmap) {
        if (bitmap == null) {
            Log.e("GroupInviteInfoViewController/decode-photo-bytes-returns-null");
            return;
        }
        AlphaAnimation A0G2 = C86604Kt.A0G();
        A0G2.setDuration(100);
        C1232367q.A00(A0G2, bitmap, this, 6);
        this.A07.startAnimation(A0G2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010f, code lost:
        if (r4 != 6) goto L_0x0111;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass5L8 r20, long r21) {
        /*
            r19 = this;
            r10 = r20
            com.whatsapp.jid.UserJid r1 = r10.A06
            r3 = 0
            r6 = r19
            if (r1 == 0) goto L_0x0132
            X.3Ex r0 = r6.A0F
            X.3ZH r11 = r0.A0A(r1)
        L_0x000f:
            com.whatsapp.TextEmojiLabel r1 = r6.A0D
            java.lang.String r0 = r10.A09
            r1.A0K(r3, r0)
            r8 = 1
            r7 = 8
            r5 = 0
            if (r11 == 0) goto L_0x012b
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x012b
            android.widget.TextView r9 = r6.A08
            r9.setVisibility(r5)
            X.2rN r1 = r6.A0N
            int r0 = r10.A02
            boolean r0 = r1.A03(r0)
            r4 = 2131890331(0x7f12109b, float:1.941535E38)
            if (r0 == 0) goto L_0x0035
            r4 = 2131890335(0x7f12109f, float:1.9415359E38)
        L_0x0035:
            android.content.Context r2 = r6.A01
            java.lang.Object[] r1 = new java.lang.Object[r8]
            X.5ZU r0 = r6.A0G
            java.lang.String r0 = r0.A0M(r11)
            r1[r5] = r0
            X.AnonymousClass001.A0y(r2, r9, r1, r4)
        L_0x0044:
            X.2zN r0 = r10.A07
            if (r0 != 0) goto L_0x0127
            r2 = r3
        L_0x0049:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            com.whatsapp.TextEmojiLabel r0 = r6.A0C
            if (r1 != 0) goto L_0x0122
            r0.A0K(r3, r2)
            r0.setVisibility(r5)
        L_0x0057:
            java.util.List r11 = r10.A0A
            boolean r0 = r11.isEmpty()
            r2 = r0 ^ 1
            android.widget.TextView r4 = r6.A0A
            int r0 = X.AnonymousClass001.A08(r2)
            r4.setVisibility(r0)
            android.view.ViewGroup r1 = r6.A06
            int r0 = X.C86614Ku.A01(r2)
            r1.setVisibility(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r6.A0B
            int r0 = X.AnonymousClass001.A08(r2)
            r1.setVisibility(r0)
            X.33j r14 = r6.A0J
            r13 = 2131755256(0x7f1000f8, float:1.9141386E38)
            int r9 = r10.A03
            long r0 = (long) r9
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            r2[r5] = r12
            java.lang.String r2 = r14.A0L(r2, r13, r0)
            r4.setText(r2)
            android.widget.TextView r4 = r6.A09
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r2[r5] = r12
            java.lang.String r0 = r14.A0L(r2, r13, r0)
            r4.setText(r0)
            X.4Wn r0 = r6.A0M
            r0.A01 = r11
            r0.A05()
            r0.A00 = r9
            r0.A05()
            int r4 = r10.A02
            if (r4 == r8) goto L_0x00f1
            r0 = 2
            if (r4 == r0) goto L_0x00f1
            r0 = 6
            if (r4 == r0) goto L_0x00f1
            r0 = 3
            if (r4 == r0) goto L_0x00f1
            X.2sH r0 = r6.A0I
            long r17 = r0.A0H()
            r15 = r21
            long r3 = r21 - r17
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            com.whatsapp.WaTextView r1 = r6.A0E
            if (r0 <= 0) goto L_0x00ed
            android.content.Context r13 = r6.A01
            java.lang.String r0 = X.C107565bW.A04(r13, r14, r15, r17)
            r1.setText(r0)
            r1.setVisibility(r5)
        L_0x00d5:
            android.view.View r0 = r6.A03
            float r2 = X.C86664Kz.A02(r0)
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            X.5fS r0 = new X.5fS
            r0.<init>(r6, r2)
            r1.addOnGlobalLayoutListener(r0)
            android.view.View r0 = r6.A05
            r0.setVisibility(r5)
            return
        L_0x00ed:
            r1.setVisibility(r7)
            goto L_0x00d5
        L_0x00f1:
            com.whatsapp.WaTextView r2 = r6.A0E
            r2.setVisibility(r5)
            X.1VX r1 = r6.A0L
            r0 = 5021(0x139d, float:7.036E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x011e
            r1 = 2131890325(0x7f121095, float:1.9415339E38)
            if (r4 == r8) goto L_0x0114
            r0 = 2
            if (r4 == r0) goto L_0x0111
            r0 = 3
            if (r4 == r0) goto L_0x0111
            r0 = 6
            r1 = 2131890328(0x7f121098, float:1.9415345E38)
            if (r4 == r0) goto L_0x0114
        L_0x0111:
            r1 = 2131890345(0x7f1210a9, float:1.941538E38)
        L_0x0114:
            r2.setText(r1)
            r2.setCompoundDrawables(r3, r3, r3, r3)
            r2.A0A()
            goto L_0x00d5
        L_0x011e:
            r1 = 2131890346(0x7f1210aa, float:1.9415381E38)
            goto L_0x0114
        L_0x0122:
            r0.setVisibility(r7)
            goto L_0x0057
        L_0x0127:
            java.lang.String r2 = r0.A03
            goto L_0x0049
        L_0x012b:
            android.widget.TextView r0 = r6.A08
            r0.setVisibility(r7)
            goto L_0x0044
        L_0x0132:
            r11 = r3
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5RG.A01(X.5L8, long):void");
    }

    public AnonymousClass5RG(Context context, ViewGroup viewGroup, C64773Ex r6, AnonymousClass5ZU r7, C105365Uq r8, C56612sH r9, C620733j r10, C56982ss r11, AnonymousClass1VX r12, C56072rN r13) {
        this.A01 = context;
        this.A0I = r9;
        this.A0L = r12;
        this.A0K = r11;
        this.A02 = LayoutInflater.from(context);
        this.A0F = r6;
        this.A0G = r7;
        this.A0J = r10;
        this.A0N = r13;
        this.A0H = r8;
        this.A08 = AnonymousClass002.A09(viewGroup, R.id.group_creator);
        this.A0D = C86644Kx.A0M(viewGroup, R.id.group_name);
        this.A0C = C86644Kx.A0M(viewGroup, R.id.group_description_preview);
        this.A06 = C86644Kx.A0J(viewGroup, R.id.participants_no_known_contacts);
        this.A0A = AnonymousClass002.A09(viewGroup, R.id.participants_header);
        this.A09 = AnonymousClass002.A09(viewGroup, R.id.participant_count);
        this.A07 = AnonymousClass0x9.A0F(viewGroup, R.id.group_photo);
        this.A0E = C86644Kx.A0O(viewGroup, R.id.invite_expiration_time);
        this.A05 = viewGroup.findViewById(R.id.group_photo_container);
        this.A04 = viewGroup.findViewById(R.id.group_info);
        this.A03 = viewGroup.findViewById(R.id.background);
        this.A0O = C86654Ky.A0f(viewGroup, R.id.invite_accept);
        this.A0P = C86654Ky.A0f(viewGroup, R.id.invite_ignore);
        RecyclerView A0w = C86664Kz.A0w(viewGroup, R.id.group_participants);
        this.A0B = A0w;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.A1X(0);
        A0w.setLayoutManager(linearLayoutManager);
        C87894Wn r0 = new C87894Wn(this);
        this.A0M = r0;
        A0w.setAdapter(r0);
    }
}
