package com.whatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass107;
import X.AnonymousClass1VX;
import X.AnonymousClass3A0;
import X.AnonymousClass4GJ;
import X.AnonymousClass4VH;
import X.AnonymousClass5UY;
import X.AnonymousClass5Yj;
import X.AnonymousClass74J;
import X.AnonymousClass7UX;
import X.AnonymousClass7ZI;
import X.AnonymousClass8JN;
import X.C06560Yg;
import X.C1001059l;
import X.C106025Xi;
import X.C109465ef;
import X.C111685iW;
import X.C115365oY;
import X.C116855qy;
import X.C117085rM;
import X.C1222663s;
import X.C131666dx;
import X.C141536vj;
import X.C147157Da;
import X.C147167Db;
import X.C154187ck;
import X.C15910sA;
import X.C162457s7;
import X.C166847zM;
import X.C166937zV;
import X.C18310x6;
import X.C185508tn;
import X.C185908uR;
import X.C188738zP;
import X.C188768zS;
import X.C188778zT;
import X.C1897692o;
import X.C56612sH;
import X.C620633i;
import X.C620733j;
import X.C64333Db;
import X.C71333bw;
import X.C86604Kt;
import X.C88864av;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.pushtorecordmedia.PushToRecordIconAnimation;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Objects;

public class ConversationEntryActionButton extends RelativeLayout implements AnonymousClass4GJ {
    public int A00;
    public long A01;
    public AnonymousClass7UX A02;
    public AnonymousClass4VH A03;
    public C620633i A04;
    public C56612sH A05;
    public C620733j A06;
    public AnonymousClass1VX A07;
    public AnonymousClass3A0 A08;
    public PushToRecordIconAnimation A09;
    public C116855qy A0A;
    public Integer A0B;
    public boolean A0C;
    public final WaImageButton A0D;
    public final WaImageButton A0E;
    public final WaImageButton A0F;
    public final AnonymousClass5UY A0G;

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006b, code lost:
        if (r2 == r1) goto L_0x0139;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A02(com.whatsapp.conversation.ConversationEntryActionButton r14, X.C106025Xi r15, X.C106025Xi[] r16) {
        /*
            r6 = 0
            r3 = r16[r6]
            r16[r6] = r15
            r9 = 0
            if (r3 == 0) goto L_0x00f5
            int r1 = r3.A00()
            int r0 = r3.A00
            if (r1 == 0) goto L_0x00f5
            r1 = 1
            if (r0 == 0) goto L_0x0016
            if (r0 != r1) goto L_0x0154
            r1 = 2
        L_0x0016:
            int r0 = r15.A00()
            int r5 = r15.A00
            r8 = 0
            if (r0 == 0) goto L_0x0025
            r8 = 1
            if (r5 == 0) goto L_0x0025
            if (r5 != r8) goto L_0x014c
            r8 = 2
        L_0x0025:
            r4 = 1
            r7 = r14
            if (r8 == r1) goto L_0x005f
            if (r1 == 0) goto L_0x00f1
            if (r1 == r4) goto L_0x00ed
            com.whatsapp.WaImageButton r0 = r14.A0D
        L_0x002f:
            if (r8 == 0) goto L_0x00e9
            if (r8 == r4) goto L_0x00e5
            com.whatsapp.WaImageButton r1 = r14.A0D
        L_0x0035:
            A01(r0, r6)
            A01(r1, r4)
            r0 = 8
            r1.sendAccessibilityEvent(r0)
            com.whatsapp.pushtorecordmedia.PushToRecordIconAnimation r0 = r14.A09
            if (r0 == 0) goto L_0x005f
            if (r8 == 0) goto L_0x0047
            r9 = 1
        L_0x0047:
            A01(r0, r9)
            if (r8 == 0) goto L_0x005f
            r0 = 1
            if (r8 == r4) goto L_0x0050
            r0 = 2
        L_0x0050:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x005f
            com.whatsapp.pushtorecordmedia.PushToRecordIconAnimation r1 = r14.A09
            int r0 = r0.intValue()
            r1.Bgt(r0)
        L_0x005f:
            boolean r2 = r15.A06
            if (r3 == 0) goto L_0x006d
            boolean r1 = r3.A06
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x006d
            if (r2 == r1) goto L_0x0139
        L_0x006d:
            if (r2 == 0) goto L_0x00f8
            X.7UX r11 = r14.getOrCreateRecorderModeMenu()
            X.66R r0 = r11.A09
            java.lang.Object r0 = r0.getValue()
            X.7Ka r0 = (X.C148867Ka) r0
            android.view.ViewGroup r1 = r0.A01
            X.66R r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r1.addView(r0)
            r9 = 0
            X.33j r2 = r11.A07
            boolean r0 = r2.A0U()
            boolean r16 = X.AnonymousClass000.A1S(r0)
            X.0bC r10 = r11.A00
            if (r10 != 0) goto L_0x0129
            android.content.Context r1 = r11.A04
            java.util.List r0 = r11.A08
            X.6F9 r8 = new X.6F9
            r8.<init>(r1, r2, r0)
            android.content.res.Resources r2 = r1.getResources()
            r0 = 2131165978(0x7f07031a, float:1.7946188E38)
            int r3 = r2.getDimensionPixelSize(r0)
            android.content.res.Resources r2 = r1.getResources()
            r0 = 2131165977(0x7f070319, float:1.7946186E38)
            int r15 = r2.getDimensionPixelSize(r0)
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r1)
            int r14 = r0.widthPixels
            r13 = 0
            r0 = 2132083142(0x7f1501c6, float:1.9806418E38)
            X.0bC r10 = new X.0bC
            r10.<init>(r1, r13, r6, r0)
            android.view.View r0 = r11.A06
            r10.A07 = r0
            r10.Ble(r8)
            int r12 = r8.getCount()
            r2 = 0
            r1 = 0
        L_0x00d2:
            if (r2 >= r12) goto L_0x0104
            android.view.View r0 = r8.getView(r2, r13, r13)
            r0.measure(r6, r6)
            int r0 = r0.getMeasuredWidth()
            if (r0 <= r1) goto L_0x00e2
            r1 = r0
        L_0x00e2:
            int r2 = r2 + 1
            goto L_0x00d2
        L_0x00e5:
            com.whatsapp.WaImageButton r1 = r14.A0F
            goto L_0x0035
        L_0x00e9:
            com.whatsapp.WaImageButton r1 = r14.A0E
            goto L_0x0035
        L_0x00ed:
            com.whatsapp.WaImageButton r0 = r14.A0F
            goto L_0x002f
        L_0x00f1:
            com.whatsapp.WaImageButton r0 = r14.A0E
            goto L_0x002f
        L_0x00f5:
            r1 = 0
            goto L_0x0016
        L_0x00f8:
            X.7UX r0 = r14.A02
            if (r0 == 0) goto L_0x0139
            X.0bC r0 = r0.A00
            if (r0 == 0) goto L_0x0139
            r0.dismiss()
            goto L_0x0139
        L_0x0104:
            int r0 = X.AnonymousClass6C9.A0B(r15, r1, r14)
            r10.A03 = r0
            X.91Z r0 = new X.91Z
            r0.<init>(r11, r4)
            android.widget.PopupWindow r1 = r10.A0B
            r1.setOnDismissListener(r0)
            X.7zk r0 = new X.7zk
            r0.<init>(r10, r11)
            r10.A08 = r0
            r10.Bnk(r3)
            r10.A0G = r6
            r1.setFocusable(r6)
            r10.A0F = r4
            r11.A00 = r10
            r11.A03 = r8
        L_0x0129:
            if (r16 != 0) goto L_0x0134
            android.view.View r0 = r11.A06
            int r9 = r0.getWidth()
            int r0 = r10.A03
            int r9 = r9 - r0
        L_0x0134:
            r10.A01 = r9
            r10.Bod()
        L_0x0139:
            X.7UX r2 = r7.A02
            if (r2 == 0) goto L_0x0148
            if (r5 != r4) goto L_0x0149
            r0 = 2
        L_0x0141:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A00(r0)
        L_0x0148:
            return
        L_0x0149:
            r0 = 1
            goto L_0x0141
        L_0x014c:
            java.lang.String r1 = "Invalid recorder mode"
            java.lang.Error r0 = new java.lang.Error
            r0.<init>(r1)
            throw r0
        L_0x0154:
            java.lang.String r1 = "Invalid recorder mode"
            java.lang.Error r0 = new java.lang.Error
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationEntryActionButton.A02(com.whatsapp.conversation.ConversationEntryActionButton, X.5Xi, X.5Xi[]):void");
    }

    private PushToRecordIconAnimation getIconAnimationView() {
        C185508tn r0;
        if (!this.A03.A01.A07) {
            return null;
        }
        AnonymousClass5UY r3 = this.A0G;
        if (r3.A01 == null) {
            PushToRecordIconAnimation pushToRecordIconAnimation = (PushToRecordIconAnimation) r3.A04();
            boolean z = this.A03.A01.A0A;
            if (pushToRecordIconAnimation.A00 == null) {
                if (z) {
                    r0 = new AnonymousClass8JN(pushToRecordIconAnimation);
                } else {
                    r0 = new C115365oY(pushToRecordIconAnimation);
                }
                pushToRecordIconAnimation.A00 = r0;
            } else {
                throw AnonymousClass001.A0e("PushToRecordIconAnimation already initialized");
            }
        }
        return (PushToRecordIconAnimation) r3.A04();
    }

    private AnonymousClass7UX getOrCreateRecorderModeMenu() {
        AnonymousClass7UX r3 = this.A02;
        if (r3 != null) {
            return r3;
        }
        if (this.A03.A01.A00 != 2) {
            Log.e("conversation/ConversationEntryActionButton/getOrCreateRecorderModeMenu called unexpectedly");
        }
        ArrayList A0s = AnonymousClass001.A0s();
        if (this.A03.A01.A0C) {
            A0s.add(new AnonymousClass7ZI(C141536vj.TITLE, (Integer) null, R.string.f11nameremoved, 0));
        }
        C141536vj r2 = C141536vj.OPTION;
        A0s.add(new AnonymousClass7ZI(r2, Integer.valueOf(R.drawable.input_camera_white), R.string.f11nameremoved, 2));
        A0s.add(new AnonymousClass7ZI(r2, Integer.valueOf(R.drawable.input_mic_white), R.string.f11nameremoved, 1));
        AnonymousClass7UX r32 = new AnonymousClass7UX(getContext(), this, this.A06, A0s);
        this.A02 = r32;
        r32.A01 = new C147157Da(this);
        r32.A02 = new C147167Db(this);
        return r32;
    }

    /* access modifiers changed from: private */
    public long getShortTapTimeoutMs() {
        return (long) Math.min(Math.max(this.A07.A0N(5348), 50), 500);
    }

    public void A03(C15910sA r14, C185908uR r15, AnonymousClass4VH r16) {
        Integer valueOf;
        AnonymousClass4VH r1 = r16;
        this.A03 = r1;
        PushToRecordIconAnimation iconAnimationView = getIconAnimationView();
        this.A09 = iconAnimationView;
        C166937zV r5 = null;
        if (iconAnimationView != null) {
            iconAnimationView.setTint(AnonymousClass0Y8.A04(getContext(), AnonymousClass5Yj.A02(this.A09.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved)));
            this.A0D.setImageDrawable((Drawable) null);
            this.A0F.setImageDrawable((Drawable) null);
            PushToRecordIconAnimation pushToRecordIconAnimation = this.A09;
            AnonymousClass107 r2 = r1.A05;
            int A002 = ((C106025Xi) r2.A07()).A00();
            int i = ((C106025Xi) r2.A07()).A00;
            int i2 = 0;
            if (A002 != 0) {
                i2 = 1;
                if (i != 0) {
                    if (i == 1) {
                        i2 = 2;
                    } else {
                        throw new Error("Invalid recorder mode");
                    }
                }
            }
            pushToRecordIconAnimation.BJU(i2);
        }
        WaImageButton waImageButton = this.A0F;
        waImageButton.setLongClickable(true);
        C06560Yg.A0O(waImageButton, new C188768zS(r1, 1, this));
        WaImageButton waImageButton2 = this.A0D;
        C06560Yg.A0O(waImageButton2, new C188778zT(this, 16));
        r1.A05.A0B(r14, new C1897692o(new C106025Xi[]{null}, 2, this));
        float A003 = C86604Kt.A00(getContext());
        AnonymousClass1VX r11 = this.A07;
        C162457s7.A0J(r11, 1);
        int A0N = r11.A0N(5363);
        if (A0N < 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(C1222663s.A01(((float) A0N) * A003));
        }
        this.A0B = valueOf;
        boolean z = false;
        this.A00 = Math.max(0, r11.A0N(5384));
        WaImageButton waImageButton3 = this.A0E;
        waImageButton3.setImageDrawable(new C131666dx(C18310x6.A0G(getContext(), R.drawable.input_send), this.A06));
        waImageButton3.setOutlineProvider(new C188738zP(this, 3));
        C71333bw r3 = new C71333bw(this, 0, r1);
        if (r11.A0X(3582)) {
            waImageButton3.setOnTouchListener(this.A08);
        }
        waImageButton3.setOnClickListener(new C109465ef(this, 45, r15));
        if (r11.A0N(5363) >= 0) {
            z = true;
        }
        C154187ck r22 = new C154187ck(r15, 2, this);
        Objects.requireNonNull(r15);
        C166937zV r0 = new C166937zV(r22, this, r3, new C117085rM(r15, 1));
        waImageButton.setOnTouchListener(r0);
        if (!z) {
            r0 = null;
        }
        waImageButton.setOnLongClickListener(r0);
        waImageButton.setOnKeyListener(new C166847zM(r15, this));
        C166937zV r02 = new C166937zV(new C154187ck(r15, 3, this), this, r3, new C117085rM(r15, 2));
        waImageButton2.setOnTouchListener(r02);
        waImageButton2.setLongClickable(z);
        if (z) {
            r5 = r02;
        }
        waImageButton2.setOnLongClickListener(r5);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0A;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public ConversationEntryActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0C) {
            this.A0C = true;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            this.A05 = (C56612sH) r1.ASO.get();
            this.A07 = C86604Kt.A0Y(r1);
            this.A06 = C64333Db.A2t(r1);
            this.A04 = (C620633i) r1.AYG.get();
            this.A08 = (AnonymousClass3A0) r1.AUQ.get();
        }
        this.A0B = null;
        this.A00 = 0;
        this.A01 = 0;
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this);
        this.A0E = (WaImageButton) C06560Yg.A02(this, R.id.send);
        WaImageButton waImageButton = (WaImageButton) C06560Yg.A02(this, R.id.voice_note_btn);
        this.A0F = waImageButton;
        boolean z = C1001059l.A04;
        waImageButton.setImageResource(z ? R.drawable.input_mic_white_filled_wds : R.drawable.input_mic_white);
        WaImageButton waImageButton2 = (WaImageButton) C06560Yg.A02(this, R.id.push_to_video_button);
        this.A0D = waImageButton2;
        waImageButton2.setImageResource(z ? R.drawable.input_camera_white_filled_wds : R.drawable.input_camera_white);
        this.A0G = AnonymousClass0x2.A0M(this, R.id.conversation_entry_action_button_push_to_record_icon_animation_stub);
    }

    public static void A01(View view, boolean z) {
        int i = 0;
        if (z != AnonymousClass000.A1T(view.getVisibility())) {
            view.setEnabled(z);
            view.startAnimation(AnonymousClass74J.A00(!z));
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public ConversationEntryActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ConversationEntryActionButton(Context context) {
        this(context, (AttributeSet) null);
    }
}
