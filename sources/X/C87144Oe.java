package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4Oe  reason: invalid class name and case insensitive filesystem */
public class C87144Oe extends BaseAdapter {
    public UserJid A00;
    public final int A01;
    public final /* synthetic */ MessageDetailsActivity A02;

    public C87144Oe(MessageDetailsActivity messageDetailsActivity) {
        this.A02 = messageDetailsActivity;
        this.A01 = messageDetailsActivity.getResources().getInteger(17694721);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x02c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.view.View r36, int r37) {
        /*
            r35 = this;
            r34 = r35
            r0 = r34
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r5 = r0.A02
            java.util.ArrayList r13 = r5.A0b
            r7 = r37
            java.lang.Object r4 = r13.get(r7)
            X.5Rj r4 = (X.C104545Rj) r4
            r0 = 2131433395(0x7f0b17b3, float:1.8488574E38)
            r6 = r36
            android.view.View r2 = r6.findViewById(r0)
            r14 = 1
            r15 = 13
            r1 = 5
            r12 = 0
            r10 = 8
            r9 = 0
            if (r37 == 0) goto L_0x0289
            int r11 = r4.A00()
            int r0 = r37 + -1
            java.lang.Object r0 = r13.get(r0)
            X.5Rj r0 = (X.C104545Rj) r0
            int r0 = r0.A00()
            if (r11 != r0) goto L_0x0289
            X.57a r3 = r4.A02()
            X.57a r0 = X.C995557a.KEEP_IN_CHAT
            if (r0 == r3) goto L_0x0289
            r27 = 0
            r2.setVisibility(r10)
        L_0x0042:
            r0 = 2131429504(0x7f0b0880, float:1.8480683E38)
            android.view.View r2 = r6.findViewById(r0)
            r0 = 2131429057(0x7f0b06c1, float:1.8479776E38)
            android.view.View r26 = r6.findViewById(r0)
            int r0 = X.AnonymousClass0x9.A03(r13, r14)
            if (r7 == r0) goto L_0x027c
            int r0 = r37 + 1
            java.lang.Object r0 = r13.get(r0)
            X.5Rj r0 = (X.C104545Rj) r0
            int r0 = r0.A00()
            if (r11 != r0) goto L_0x027c
            r1 = 2131233361(0x7f080a51, float:1.8082857E38)
            r0 = r26
            r0.setBackgroundResource(r1)
            r2.setVisibility(r9)
        L_0x006f:
            r0 = 2131428994(0x7f0b0682, float:1.8479648E38)
            android.widget.ImageView r13 = X.AnonymousClass0x9.A0F(r6, r0)
            X.64J r1 = r5.A09
            r0 = 2131432618(0x7f0b14aa, float:1.8486999E38)
            X.5YB r12 = X.AnonymousClass5YB.A00(r6, r1, r0)
            r0 = 2131433380(0x7f0b17a4, float:1.8488544E38)
            com.whatsapp.TextEmojiLabel r10 = X.C86644Kx.A0M(r6, r0)
            r0 = 2131432967(0x7f0b1607, float:1.8487706E38)
            android.widget.TextView r2 = X.AnonymousClass002.A09(r6, r0)
            r0 = 2131429282(0x7f0b07a2, float:1.8480232E38)
            android.view.View r25 = r6.findViewById(r0)
            r0 = 2131429291(0x7f0b07ab, float:1.848025E38)
            android.view.View r8 = r6.findViewById(r0)
            r0 = 2131429288(0x7f0b07a8, float:1.8480244E38)
            android.view.View r24 = r6.findViewById(r0)
            r0 = 2131429285(0x7f0b07a5, float:1.8480238E38)
            android.view.View r9 = X.C06560Yg.A02(r6, r0)
            r0 = 2131429281(0x7f0b07a1, float:1.848023E38)
            android.widget.TextView r23 = X.AnonymousClass002.A09(r6, r0)
            r0 = 2131429290(0x7f0b07aa, float:1.8480249E38)
            android.widget.TextView r22 = X.AnonymousClass002.A09(r6, r0)
            r0 = 2131429287(0x7f0b07a7, float:1.8480242E38)
            android.widget.TextView r21 = X.AnonymousClass002.A09(r6, r0)
            r0 = 2131429284(0x7f0b07a4, float:1.8480236E38)
            android.widget.TextView r20 = X.C18300x5.A0G(r6, r0)
            r0 = 2131429283(0x7f0b07a3, float:1.8480234E38)
            android.view.View r19 = r6.findViewById(r0)
            r0 = 2131429292(0x7f0b07ac, float:1.8480253E38)
            android.view.View r18 = r6.findViewById(r0)
            r0 = 2131429289(0x7f0b07a9, float:1.8480247E38)
            android.view.View r17 = r6.findViewById(r0)
            r0 = 2131429286(0x7f0b07a6, float:1.848024E38)
            android.view.View r16 = X.C06560Yg.A02(r6, r0)
            r15 = 8
            r1 = r25
            r0 = r24
            X.C86624Kv.A14(r1, r8, r0, r15)
            r1 = r19
            r0 = r18
            X.C86624Kv.A14(r9, r1, r0, r15)
            r0 = r17
            r0.setVisibility(r15)
            r0 = r16
            r0.setVisibility(r15)
            X.57a r0 = X.C995557a.REMAINING
            if (r0 != r3) goto L_0x012e
            r0 = 0
            r2.setVisibility(r0)
            r13.setVisibility(r15)
            com.whatsapp.TextEmojiLabel r0 = r12.A02
            r0.setVisibility(r15)
            r10.setVisibility(r15)
            X.4om r4 = (X.C93564om) r4
            X.33j r7 = r5.A00
            r5 = 2131755255(0x7f1000f7, float:1.9141384E38)
            int r1 = r4.A00
            long r3 = (long) r1
            java.lang.Object[] r0 = new java.lang.Object[r14]
            X.AnonymousClass000.A1L(r0, r1)
            java.lang.String r0 = r7.A0L(r0, r5, r3)
            r2.setText(r0)
            r2 = 0
            r6.setTag(r2)
        L_0x0128:
            r0 = r26
            r0.setOnClickListener(r2)
            return
        L_0x012e:
            X.3Ex r0 = r5.A0C
            com.whatsapp.jid.UserJid r1 = r4.A01
            X.3ZH r3 = r0.A0A(r1)
            X.5ZU r14 = r5.A0E
            X.34x r0 = r5.A0Q
            X.2z0 r0 = r0.A1J
            X.4uZ r0 = r0.A00
            int r0 = r14.A0A(r0)
            r2.setVisibility(r15)
            r2 = 0
            r13.setVisibility(r2)
            X.5Uq r14 = r5.A0F
            r14.A0A(r13, r3, r2)
            r14 = 0
            com.whatsapp.TextEmojiLabel r13 = r12.A02
            r13.setVisibility(r2)
            if (r27 == 0) goto L_0x0265
            com.whatsapp.jid.PhoneUserJid r2 = X.AnonymousClass4SG.A2m(r5)
            boolean r1 = r1.equals(r2)
            r15 = 0
            if (r1 == 0) goto L_0x0251
            android.content.Context r2 = r12.A00
            r1 = 2131890368(0x7f1210c0, float:1.9415426E38)
            java.lang.String r14 = r2.getString(r1)
        L_0x016a:
            r2 = 0
            r1 = 256(0x100, float:3.59E-43)
            r13.A0J(r14, r15, r1, r2)
            boolean r1 = r12.A0C(r3)
            r12.A06(r1)
        L_0x0177:
            X.5ZU r12 = r5.A0E
            r1 = 1
            X.7HU r1 = r12.A0D(r3, r0, r2, r1)
            X.58i r1 = r1.A00
            java.lang.String r1 = r12.A0G(r1, r3, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x024a
            r10.setVisibility(r2)
            r0 = 0
            r10.A0K(r0, r1)
        L_0x0191:
            X.4uZ r1 = r3.A0H
            r0 = r34
            com.whatsapp.jid.UserJid r0 = r0.A00
            boolean r1 = r1.equals(r0)
            r0 = 5
            if (r1 == 0) goto L_0x020d
            long r0 = r4.A01(r0)
            r11 = 0
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x01b7
            r10 = r23
            X.AnonymousClass4SG.A3A(r10, r5, r0)
            r0 = r25
            r0.setVisibility(r2)
            r0 = r19
            r0.setVisibility(r2)
        L_0x01b7:
            r0 = 13
            long r0 = r4.A01(r0)
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x01ce
            r10 = r22
            X.AnonymousClass4SG.A3A(r10, r5, r0)
            r8.setVisibility(r2)
            r0 = r18
            r0.setVisibility(r2)
        L_0x01ce:
            r0 = 8
            long r0 = r4.A01(r0)
            int r8 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r8 <= 0) goto L_0x01e7
            r8 = r21
            X.AnonymousClass4SG.A3A(r8, r5, r0)
            r0 = r24
            r0.setVisibility(r2)
            r0 = r17
            r0.setVisibility(r2)
        L_0x01e7:
            if (r27 == 0) goto L_0x01fe
            X.4ol r4 = (X.C93554ol) r4
            long r0 = r4.A00
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x01fe
            r4 = r20
            X.AnonymousClass4SG.A3A(r4, r5, r0)
            r9.setVisibility(r2)
            r0 = r16
            r0.setVisibility(r2)
        L_0x01fe:
            X.4uZ r0 = r3.A0H
            r6.setTag(r0)
            r1 = 3
            X.5f4 r2 = new X.5f4
            r0 = r34
            r2.<init>(r0, r6, r7, r1)
            goto L_0x0128
        L_0x020d:
            if (r11 == r0) goto L_0x023e
            r0 = 8
            if (r11 == r0) goto L_0x0232
            r0 = 13
            if (r11 != r0) goto L_0x0223
            long r0 = r4.A01(r0)
            r10 = r22
            X.AnonymousClass4SG.A3A(r10, r5, r0)
        L_0x0220:
            r8.setVisibility(r2)
        L_0x0223:
            if (r27 == 0) goto L_0x01fe
            X.4ol r4 = (X.C93554ol) r4
            long r0 = r4.A00
            r4 = r20
            X.AnonymousClass4SG.A3A(r4, r5, r0)
            r9.setVisibility(r2)
            goto L_0x01fe
        L_0x0232:
            long r0 = r4.A01(r0)
            r8 = r21
            X.AnonymousClass4SG.A3A(r8, r5, r0)
            r8 = r24
            goto L_0x0220
        L_0x023e:
            long r0 = r4.A01(r0)
            r8 = r23
            X.AnonymousClass4SG.A3A(r8, r5, r0)
            r8 = r25
            goto L_0x0220
        L_0x024a:
            r0 = 8
            r10.setVisibility(r0)
            goto L_0x0191
        L_0x0251:
            boolean r2 = r12.A0C(r3)
            X.5ZU r1 = r12.A03
            if (r2 == 0) goto L_0x025f
            java.lang.String r14 = r1.A0S(r3, r14)
            goto L_0x016a
        L_0x025f:
            java.lang.String r14 = r1.A0R(r3, r0, r14)
            goto L_0x016a
        L_0x0265:
            X.5ZU r1 = r12.A03
            X.7HU r29 = r1.A0B(r3, r0)
            r31 = 0
            boolean r33 = r12.A0C(r3)
            r28 = r12
            r30 = r3
            r32 = r0
            r28.A07(r29, r30, r31, r32, r33)
            goto L_0x0177
        L_0x027c:
            r1 = 2131233360(0x7f080a50, float:1.8082855E38)
            r0 = r26
            r0.setBackgroundResource(r1)
            r2.setVisibility(r10)
            goto L_0x006f
        L_0x0289:
            r2.setVisibility(r9)
            r0 = 2131433399(0x7f0b17b7, float:1.8488583E38)
            android.widget.TextView r8 = X.AnonymousClass002.A09(r6, r0)
            r0 = 2131433396(0x7f0b17b4, float:1.8488577E38)
            android.widget.TextView r2 = X.AnonymousClass002.A09(r6, r0)
            int r11 = r4.A00()
            if (r11 == r1) goto L_0x032a
            if (r11 == r10) goto L_0x0319
            if (r11 != r15) goto L_0x02be
            X.34x r0 = r5.A0Q
            byte r0 = r0.A1I
            if (r0 != 0) goto L_0x030c
            r1 = 2131890765(0x7f12124d, float:1.9416231E38)
        L_0x02ad:
            android.content.Context r3 = X.C86654Ky.A0B(r6, r8, r1)
            r1 = 2131233158(0x7f080986, float:1.8082446E38)
            r0 = 2131101894(0x7f0608c6, float:1.781621E38)
        L_0x02b7:
            android.graphics.drawable.Drawable r0 = X.C107335b8.A04(r3, r1, r0)
            r2.setCompoundDrawablesWithIntrinsicBounds(r0, r12, r12, r12)
        L_0x02be:
            X.57a r3 = r4.A02()
            X.57a r0 = X.C995557a.KEEP_IN_CHAT
            r27 = 0
            if (r0 != r3) goto L_0x0042
            r27 = 1
            X.34x r0 = r5.A0Q
            X.1md r0 = r0.A1S
            if (r0 == 0) goto L_0x02e9
            X.3Ex r1 = r5.A0C
            com.whatsapp.jid.UserJid r0 = r0.A0o()
            X.3ZH r15 = r1.A0A(r0)
            X.34x r0 = r5.A0Q
            boolean r0 = X.AnonymousClass2z0.A0D(r0)
            int r1 = X.C18280x3.A01(r0)
            X.5ZU r0 = r5.A0E
            r0.A0R(r15, r1, r9)
        L_0x02e9:
            X.2oU r0 = r5.A0K
            android.content.res.Resources r1 = X.C54292oU.A00(r0)
            r0 = 2131890366(0x7f1210be, float:1.9415422E38)
            java.lang.String r0 = r1.getString(r0)
            r15 = 2131231747(0x7f080403, float:1.8079584E38)
            r1 = 2131101268(0x7f060654, float:1.781494E38)
            r8.setText(r0)
            android.content.Context r0 = r6.getContext()
            android.graphics.drawable.Drawable r0 = X.C107335b8.A04(r0, r15, r1)
            r2.setCompoundDrawablesWithIntrinsicBounds(r0, r12, r12, r12)
            goto L_0x0042
        L_0x030c:
            boolean r0 = X.C627636p.A0I(r0)
            r1 = 2131890769(0x7f121251, float:1.941624E38)
            if (r0 == 0) goto L_0x02ad
            r1 = 2131890770(0x7f121252, float:1.9416241E38)
            goto L_0x02ad
        L_0x0319:
            X.34x r0 = r5.A0Q
            X.5W2 r15 = X.AnonymousClass5W2.A00(r0, r9)
            int r0 = r15.A02
            android.content.Context r3 = X.C86654Ky.A0B(r6, r8, r0)
            int r1 = r15.A01
            int r0 = r15.A00
            goto L_0x02b7
        L_0x032a:
            r0 = 2131890738(0x7f121232, float:1.9416176E38)
            android.content.Context r3 = X.C86654Ky.A0B(r6, r8, r0)
            r1 = 2131233158(0x7f080986, float:1.8082446E38)
            r0 = 2131101895(0x7f0608c7, float:1.7816213E38)
            goto L_0x02b7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87144Oe.A00(android.view.View, int):void");
    }

    public final void A01(View view, int i, boolean z) {
        int i2;
        int width;
        AlphaAnimation A0C;
        int width2;
        int width3;
        MessageDetailsActivity messageDetailsActivity = this.A02;
        int i3 = i;
        C104545Rj r1 = (C104545Rj) messageDetailsActivity.A0b.get(i3);
        View view2 = view;
        View findViewById = view2.findViewById(R.id.date_time_delivered);
        View findViewById2 = view2.findViewById(R.id.date_time_read);
        View findViewById3 = view2.findViewById(R.id.date_time_played);
        View A022 = C06560Yg.A02(view2, R.id.date_time_delivered_label);
        TextView A0G = C18300x5.A0G(view2, R.id.date_time_read_label);
        TextView A0G2 = C18300x5.A0G(view2, R.id.date_time_played_label);
        View findViewById4 = view2.findViewById(R.id.date_time_delivered_group);
        View findViewById5 = view2.findViewById(R.id.date_time_read_group);
        View findViewById6 = view2.findViewById(R.id.date_time_played_group);
        byte b = messageDetailsActivity.A0Q.A1I;
        if (b == 0) {
            i2 = R.string.f11nameremoved;
        } else {
            boolean A0I = C627636p.A0I(b);
            i2 = R.string.f11nameremoved;
            if (A0I) {
                i2 = R.string.f11nameremoved;
            }
        }
        A0G.setText(i2);
        A0G2.setText(AnonymousClass5W2.A00(messageDetailsActivity.A0Q, true).A02);
        ArrayList A0I2 = AnonymousClass002.A0I(6);
        int A002 = r1.A00();
        if (A002 == 5) {
            A0I2.add(A022);
            if (C620733j.A04(messageDetailsActivity.A00)) {
                if (z) {
                    width = findViewById.getWidth() - findViewById4.getWidth();
                } else {
                    width = A022.getWidth();
                }
                TranslateAnimation translateAnimation = new TranslateAnimation((float) width, 0.0f, 0.0f, 0.0f);
                C86614Ku.A1K(translateAnimation, (long) this.A01);
                findViewById.startAnimation(translateAnimation);
            }
        } else if (A002 == 8) {
            A0I2.add(A0G2);
            A0I2.add(findViewById5);
            A0I2.add(A0G);
            A0I2.add(findViewById4);
            A0I2.add(A022);
            if (C620733j.A04(messageDetailsActivity.A00)) {
                if (z) {
                    width2 = findViewById3.getWidth() - findViewById6.getWidth();
                } else {
                    width2 = A0G2.getWidth();
                }
                TranslateAnimation translateAnimation2 = new TranslateAnimation((float) width2, 0.0f, 0.0f, 0.0f);
                C86614Ku.A1K(translateAnimation2, (long) this.A01);
                findViewById3.startAnimation(translateAnimation2);
            }
        } else if (A002 == 13) {
            A0I2.add(A0G);
            A0I2.add(findViewById4);
            A0I2.add(A022);
            if (C620733j.A04(messageDetailsActivity.A00)) {
                if (z) {
                    width3 = findViewById2.getWidth() - findViewById5.getWidth();
                } else {
                    width3 = A0G.getWidth();
                }
                TranslateAnimation translateAnimation3 = new TranslateAnimation((float) width3, 0.0f, 0.0f, 0.0f);
                C86614Ku.A1K(translateAnimation3, (long) this.A01);
                findViewById2.startAnimation(translateAnimation3);
            }
        }
        Iterator it = A0I2.iterator();
        while (it.hasNext()) {
            View A0H = C86654Ky.A0H(it);
            if (z) {
                A0C = AnonymousClass4L0.A0C(0.0f, 1.0f);
            } else {
                A0C = AnonymousClass4L0.A0C(1.0f, 0.0f);
            }
            int i4 = this.A01;
            A0C.setDuration((long) i4);
            A0C.setStartOffset((long) (((float) i4) * 0.0f));
            A0H.startAnimation(A0C);
        }
        View findViewById7 = view2.findViewById(R.id.timestamps);
        int height = findViewById7.getHeight();
        A00(view2, i3);
        C86614Ku.A1F(findViewById7, findViewById7.getWidth(), 1073741824);
        int measuredHeight = findViewById7.getMeasuredHeight();
        C86624Kv.A0w(findViewById7, height);
        AnonymousClass4OE r2 = new AnonymousClass4OE(findViewById7, this, height, measuredHeight);
        r2.setDuration((long) this.A01);
        findViewById7.startAnimation(r2);
    }

    public int getCount() {
        return this.A02.A0b.size();
    }

    public Object getItem(int i) {
        return this.A02.A0b.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = AnonymousClass001.A0R(this.A02.getLayoutInflater(), viewGroup, R.layout.f8nameremoved);
        }
        A00(view, i);
        return view;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
