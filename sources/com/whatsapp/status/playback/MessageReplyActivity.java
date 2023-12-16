package com.whatsapp.status.playback;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0Y8;
import X.AnonymousClass10k;
import X.AnonymousClass2PX;
import X.AnonymousClass2QZ;
import X.AnonymousClass33O;
import X.AnonymousClass39M;
import X.AnonymousClass3ZH;
import X.AnonymousClass4CE;
import X.AnonymousClass4FV;
import X.AnonymousClass4SG;
import X.AnonymousClass4SQ;
import X.AnonymousClass4VH;
import X.AnonymousClass4d6;
import X.AnonymousClass59M;
import X.AnonymousClass5DN;
import X.AnonymousClass5MZ;
import X.AnonymousClass5PB;
import X.AnonymousClass5PV;
import X.AnonymousClass5QR;
import X.AnonymousClass5R3;
import X.AnonymousClass5RE;
import X.AnonymousClass5ST;
import X.AnonymousClass5Ul;
import X.AnonymousClass5V0;
import X.AnonymousClass5XF;
import X.AnonymousClass5XO;
import X.AnonymousClass5ZR;
import X.AnonymousClass5ZT;
import X.AnonymousClass5ZU;
import X.AnonymousClass5b0;
import X.AnonymousClass694;
import X.AnonymousClass69T;
import X.AnonymousClass8s7;
import X.AnonymousClass9Tp;
import X.C05030Rp;
import X.C102965Ky;
import X.C102975Kz;
import X.C103645Nu;
import X.C105035Th;
import X.C105215Ua;
import X.C105365Uq;
import X.C105895Wv;
import X.C106095Xp;
import X.C107005aX;
import X.C108845de;
import X.C109505ej;
import X.C113895mA;
import X.C113995mK;
import X.C114005mL;
import X.C114015mM;
import X.C115975pX;
import X.C1235268t;
import X.C1235568w;
import X.C124296Bs;
import X.C135166kE;
import X.C151907Wt;
import X.C162157rM;
import X.C162457s7;
import X.C166097y8;
import X.C166177yG;
import X.C18270x1;
import X.C18300x5;
import X.C18310x6;
import X.C183538qC;
import X.C185428td;
import X.C187958y5;
import X.C19340zH;
import X.C194079Rm;
import X.C27821ej;
import X.C28071fd;
import X.C29361ih;
import X.C33141sV;
import X.C44772Xk;
import X.C48682fI;
import X.C49252gE;
import X.C49632gq;
import X.C49652gs;
import X.C49932hK;
import X.C50482iF;
import X.C52412lR;
import X.C53202mi;
import X.C53412n3;
import X.C54822pL;
import X.C55832qz;
import X.C55862r2;
import X.C55922r8;
import X.C55972rD;
import X.C56512s6;
import X.C56932sn;
import X.C56962sq;
import X.C56982ss;
import X.C57572tr;
import X.C58982w8;
import X.C60152y5;
import X.C620433g;
import X.C621033m;
import X.C621433s;
import X.C624134x;
import X.C627736r;
import X.C635139n;
import X.C64773Ex;
import X.C66513Ls;
import X.C71293bs;
import X.C71573cK;
import X.C71583cL;
import X.C84454Ck;
import X.C85014Ep;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86664Kz;
import X.C89894fS;
import X.C94264qq;
import X.C94274qr;
import X.C94294qu;
import X.C95814uZ;
import X.C97084xb;
import X.C989053r;
import X.C992054v;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import com.whatsapp.status.playback.avatar.AvatarReactionRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MessageReplyActivity extends AnonymousClass4d6 implements C185428td, C84454Ck, AnonymousClass8s7 {
    public static final Interpolator A1e = C05030Rp.A00(0.32f, 0.0f, 0.67f, 0.0f);
    public static final Interpolator A1f = C05030Rp.A00(0.33f, 1.0f, 0.68f, 1.0f);
    public static final HashMap A1g = AnonymousClass001.A0t();
    public static final HashMap A1h = AnonymousClass001.A0t();
    public AnimatorSet A00;
    public Bitmap A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public ViewGroup A07;
    public FrameLayout A08;
    public GridLayout A09;
    public GridLayout A0A;
    public ImageButton A0B;
    public ImageButton A0C;
    public ImageButton A0D;
    public MaterialButton A0E;
    public MaterialButtonToggleGroup A0F;
    public AnonymousClass5DN A0G;
    public AnonymousClass5Ul A0H;
    public C621033m A0I;
    public C105035Th A0J;
    public C620433g A0K;
    public AnonymousClass5XF A0L;
    public C50482iF A0M;
    public AnonymousClass2PX A0N;
    public C56962sq A0O;
    public C44772Xk A0P;
    public C64773Ex A0Q;
    public AnonymousClass5ZU A0R;
    public C105365Uq A0S;
    public C114015mM A0T;
    public C89894fS A0U;
    public AnonymousClass5ST A0V;
    public C113895mA A0W;
    public C114005mL A0X;
    public AnonymousClass4VH A0Y;
    public C56512s6 A0Z;
    public AnonymousClass5ZR A0a;
    public C53412n3 A0b;
    public AnonymousClass5RE A0c;
    public C56982ss A0d;
    public C52412lR A0e;
    public C27821ej A0f;
    public EmojiSearchProvider A0g;
    public AnonymousClass4FV A0h;
    public AnonymousClass5MZ A0i;
    public AnonymousClass5PB A0j;
    public C94264qq A0k;
    public C94294qu A0l;
    public C106095Xp A0m;
    public C55922r8 A0n;
    public C53202mi A0o;
    public C95814uZ A0p;
    public C28071fd A0q;
    public C55972rD A0r;
    public C48682fI A0s;
    public MentionableEntry A0t;
    public AnonymousClass9Tp A0u;
    public C194079Rm A0v;
    public C49632gq A0w;
    public C115975pX A0x;
    public C60152y5 A0y;
    public C49652gs A0z;
    public C55862r2 A10;
    public C624134x A11;
    public C151907Wt A12;
    public C54822pL A13;
    public AnonymousClass59M A14 = null;
    public AvatarReactionRepository A15;
    public C97084xb A16;
    public AnonymousClass33O A17;
    public C29361ih A18;
    public C56932sn A19;
    public C49932hK A1A;
    public C49252gE A1B;
    public AnonymousClass10k A1C;
    public C103645Nu A1D;
    public AnonymousClass2QZ A1E;
    public C162157rM A1F;
    public C55832qz A1G;
    public AnonymousClass5XO A1H;
    public C989053r A1I;
    public C33141sV A1J;
    public C187958y5 A1K;
    public C992054v A1L;
    public C105215Ua A1M;
    public AnonymousClass5ZT A1N;
    public AnonymousClass5QR A1O;
    public C183538qC A1P;
    public boolean A1Q;
    public boolean A1R = false;
    public boolean A1S;
    public boolean A1T = false;
    public boolean A1U = true;
    public boolean A1V;
    public boolean A1W;
    public final AnonymousClass4CE A1X = new AnonymousClass694(this, 13);
    public final C85014Ep A1Y = new AnonymousClass5b0(this, 3);
    public final AnonymousClass5PV A1Z = new AnonymousClass5PV(this);
    public final Set A1a = AnonymousClass002.A0K();
    public final Set A1b = AnonymousClass002.A0K();
    public final Set A1c = AnonymousClass002.A0K();
    public final int[] A1d = C86664Kz.A1Z();

    public static /* synthetic */ void A0C(Resources resources, View view, ViewGroup viewGroup, ImageView imageView, WaTextView waTextView, MessageReplyActivity messageReplyActivity, int[] iArr, boolean z) {
        MessageReplyActivity messageReplyActivity2 = messageReplyActivity;
        C60152y5 r0 = messageReplyActivity.A0y;
        if (z) {
            C107005aX.A02(r0, iArr);
        } else {
            C107005aX.A03(r0, iArr);
        }
        messageReplyActivity2.A7A(resources, view, viewGroup, imageView, waTextView, (int[]) iArr.clone());
    }

    public final void A79(int i) {
        int i2;
        C102965Ky r0;
        C58982w8 r1;
        if (this instanceof StatusReplyActivity) {
            StatusReplyActivity statusReplyActivity = (StatusReplyActivity) this;
            C113995mK r2 = statusReplyActivity.A02;
            C624134x r4 = statusReplyActivity.A11;
            switch (i) {
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 4;
                    break;
                case 5:
                    i2 = 5;
                    break;
                case 6:
                    i2 = 6;
                    break;
                case 7:
                    i2 = 7;
                    break;
                case 8:
                    i2 = 8;
                    break;
                case 9:
                    i2 = 9;
                    break;
                case 10:
                    i2 = 10;
                    break;
                case 11:
                    i2 = 11;
                    break;
                case 12:
                    i2 = 12;
                    break;
                case 13:
                    i2 = 13;
                    break;
                case 14:
                    i2 = 14;
                    break;
                case 15:
                    i2 = 15;
                    break;
                case 16:
                    i2 = 16;
                    break;
                default:
                    i2 = 17;
                    break;
            }
            C162457s7.A0J(r4, 0);
            C102975Kz r12 = r2.A00;
            if (r12 != null) {
                r12.A02++;
            }
            AnonymousClass5R3 r02 = r2.A01;
            if (!(r02 == null || (r0 = (C102965Ky) r02.A0D.get(C57572tr.A00(r4))) == null || (r1 = (C58982w8) r0.A08.get(r4.A1J)) == null)) {
                r1.A00++;
            }
            r2.A0E.BkM(new C71583cL((Object) r2, 1, (Object) r4, i2, 13));
        }
        if (this.A1V) {
            String string = getString(R.string.f11nameremoved);
            View A0H2 = C18310x6.A0H(getLayoutInflater(), R.layout.f8nameremoved);
            C18300x5.A0G(A0H2, R.id.toast_text).setText(string);
            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(87, 0, 0);
            toast.setDuration(1);
            toast.setView(A0H2);
            toast.show();
        } else {
            this.A05.A0H(R.string.f11nameremoved, 0);
        }
        A1h.remove(this.A11.A1J);
        A1g.remove(this.A11.A1J);
        A76();
    }

    public final void A7A(Resources resources, View view, ViewGroup viewGroup, ImageView imageView, WaTextView waTextView, int[] iArr) {
        int[] iArr2 = iArr;
        ImageView imageView2 = imageView;
        imageView2.setImageDrawable(this.A0C.A04(resources, new C94274qr(iArr2), 1.0f, -1));
        View view2 = view;
        C86614Ku.A1H(view2, this, 13);
        view2.setOnClickListener(new C109505ej(new C635139n(this, viewGroup, view2, waTextView, iArr2, 4), this.A06));
    }

    public void A7C(C166177yG r15) {
        if (C86614Ku.A1X(this.A0O, this.A0p)) {
            C621433s.A01(this, 106);
            return;
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        C95814uZ r4 = this.A0p;
        A0s2.add(r4);
        C166097y8 r1 = r15.A01;
        int i = r1.A01;
        if (i <= 0) {
            i = r15.A02.A01;
        }
        int i2 = r1.A00;
        if (i2 <= 0) {
            i2 = r15.A02.A00;
        }
        String str = r15.A02.A02;
        String str2 = r1.A02;
        String str3 = r15.A03.A02;
        int i3 = r15.A00;
        int i4 = 22;
        if (r4 instanceof C135166kE) {
            i4 = 24;
        }
        startActivityForResult(C627736r.A16(this, str, str2, str3, A0s2, i3, i4, false, false).putExtra("jid", this.A0p.getRawString()).putExtra("media_width", i).putExtra("media_height", i2).putExtra("mentions", AnonymousClass4SQ.A00(this.A0t)).putExtra("caption", this.A0t.getStringText()).putExtra("usage_quote", true), 25);
    }

    public static /* synthetic */ void A0L(MessageReplyActivity messageReplyActivity, AnonymousClass39M r4) {
        AnonymousClass3ZH A072 = messageReplyActivity.A0Q.A07(messageReplyActivity.A0p);
        if (A072 != null && A072.A0R()) {
            C71293bs.A00(messageReplyActivity.A04, messageReplyActivity, 45);
        }
        messageReplyActivity.A04.BkP(new C71573cK(messageReplyActivity, 6, r4));
    }

    public void A75() {
        if (this instanceof StatusReplyActivity) {
            StatusReplyActivity statusReplyActivity = (StatusReplyActivity) this;
            C113995mK r2 = statusReplyActivity.A02;
            C624134x r4 = statusReplyActivity.A11;
            C162457s7.A0J(r4, 0);
            r2.A0E.BkM(new C71583cL((Object) r2, 2, (Object) r4, 1, 13));
        }
    }

    public final void A76() {
        this.A02.setVisibility(8);
        MentionableEntry mentionableEntry = this.A0t;
        if (mentionableEntry != null && C105895Wv.A00(mentionableEntry)) {
            this.A0B.A02(this.A0t);
        }
        finish();
    }

    public final void A78() {
        A1h.put(this.A11.A1J, this.A0t.getStringText());
        A1g.put(this.A11.A1J, AnonymousClass4SQ.A00(this.A0t));
    }

    public final void A7B(Bitmap bitmap) {
        MaterialButton materialButton;
        this.A01 = bitmap;
        Context context = this.A08.getContext();
        Resources resources = context.getResources();
        if (this.A01 == null || (materialButton = this.A0E) == null) {
            MaterialButton materialButton2 = this.A0E;
            if (materialButton2 != null) {
                materialButton2.setIconTint(AnonymousClass0Y8.A07(context, R.drawable.expression_tab_icon_color_selector));
                this.A0E.setIconResource(R.drawable.ic_avatar_tray_normal);
                return;
            }
            return;
        }
        materialButton.setIconTint((ColorStateList) null);
        this.A0E.setIcon(new BitmapDrawable(resources, this.A01));
        if (this.A14 != AnonymousClass59M.AVATAR) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            this.A0E.A07.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            return;
        }
        this.A0E.A07.clearColorFilter();
    }

    public final void A7D(String str, int i) {
        AnonymousClass3ZH A072 = this.A0Q.A07(this.A0p);
        if (A072 != null && A072.A0R()) {
            C71293bs.A00(this.A04, this, 45);
        }
        setResult(-1);
        String str2 = str;
        this.A0I.A0C((C66513Ls) null, (C108845de) null, this.A11, str2, Collections.singletonList(this.A0p), this.A0t.getMentions(), false, false);
        A79(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        if (r2.codePointCount(0, r2.length()) <= 65536) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7E(boolean r6) {
        /*
            r5 = this;
            X.2sq r1 = r5.A0O
            X.4uZ r0 = r5.A0p
            boolean r0 = X.C86614Ku.A1X(r1, r0)
            if (r0 == 0) goto L_0x0010
            r3 = 106(0x6a, float:1.49E-43)
        L_0x000c:
            X.C621433s.A01(r5, r3)
            return
        L_0x0010:
            X.5ZT r2 = r5.A1N
            r4 = 0
            r3 = 1
            if (r2 == 0) goto L_0x0033
            X.5TQ r0 = r2.A0L
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r1 = 4
            if (r0 == 0) goto L_0x0026
            r2.A0S(r3, r4)
        L_0x0022:
            r5.A79(r1)
            return
        L_0x0026:
            java.io.File r0 = r2.A0M
            if (r0 == 0) goto L_0x0033
            r2.A0P(r4)
            X.5ZT r0 = r5.A1N
            r0.A0N(r3)
            goto L_0x0022
        L_0x0033:
            com.whatsapp.mentions.MentionableEntry r0 = r5.A0t
            java.lang.String r0 = r0.getStringText()
            java.lang.String r2 = r0.trim()
            X.33i r1 = r5.A08
            X.2y5 r0 = r5.A0y
            boolean r0 = X.C107635bd.A0P(r1, r0, r2)
            if (r0 != 0) goto L_0x0050
            X.3Wi r1 = r5.A05
            r0 = 2131887446(0x7f120556, float:1.94095E38)
            r1.A0H(r0, r3)
            return
        L_0x0050:
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r6 == 0) goto L_0x005d
            java.lang.String r2 = X.C107575bX.A0C(r2, r1)
        L_0x0058:
            r0 = 2
            r5.A7D(r2, r0)
            return
        L_0x005d:
            int r0 = r2.length()
            int r0 = r2.codePointCount(r4, r0)
            r3 = 17
            if (r0 > r1) goto L_0x000c
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.MessageReplyActivity.A7E(boolean):void");
    }

    public boolean A7F() {
        if (this.A0t.getText() == null || TextUtils.getTrimmedLength(this.A0t.getText()) == 0) {
            return true;
        }
        return false;
    }

    public void AxT() {
    }

    public void BY7(PickerSearchDialogFragment pickerSearchDialogFragment) {
        this.A0x.A02(pickerSearchDialogFragment);
    }

    public void BZd() {
        this.A0U.A01();
    }

    public void Bdx() {
        this.A0U.A00();
    }

    public void Bjx() {
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A0l.A02()) {
            View view = this.A03;
            int[] iArr = this.A1d;
            view.getLocationOnScreen(iArr);
            if (motionEvent.getRawY() >= ((float) iArr[1])) {
                if (motionEvent.getRawY() < ((float) C86664Kz.A0C(this.A03, iArr[1]))) {
                    if (motionEvent.getAction() == 0) {
                        this.A1W = true;
                    } else if (motionEvent.getAction() == 1) {
                        if (this.A1W) {
                            this.A0l.A01(true);
                            this.A03.requestFocus();
                        }
                        this.A1W = false;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C624134x getQuotedMessage() {
        return this.A11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a4, code lost:
        if (r9.A0F != null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a6, code lost:
        r1 = r3.getIntExtra("provider", 0);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ae, code lost:
        if (r1 == 1) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b0, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b1, code lost:
        if (r1 == 2) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b3, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b4, code lost:
        r9.A05 = r0;
        r2.A0I.A08(new X.AnonymousClass30M(java.util.Collections.singletonList(r2.A0r.A04(r8, r9, (X.C108845de) null, r2.A0p, r2.A11, r3.getStringExtra("caption"), (java.lang.String) null, X.C624435a.A03(r3.getStringExtra("mentions")), (java.util.List) null, (byte) 13, 0, 0, false)), 1), r6, false, false);
        r2.A0l.A01(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f0, code lost:
        A79(14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0126, code lost:
        if (r8 == null) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r22, int r23, android.content.Intent r24) {
        /*
            r21 = this;
            r2 = r21
            r7 = r22
            r5 = r23
            r3 = r24
            super.onActivityResult(r7, r5, r3)
            java.util.Set r0 = r2.A1a
            java.util.Iterator r1 = r0.iterator()
        L_0x0011:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r1.next()
            X.64L r0 = (X.AnonymousClass64L) r0
            boolean r0 = r0.BM3(r3, r7, r5)
            if (r0 == 0) goto L_0x0011
        L_0x0023:
            return
        L_0x0024:
            r4 = 8
            r6 = -1
            if (r7 == r4) goto L_0x005c
            r1 = 9
            if (r7 == r1) goto L_0x0057
            r0 = 22
            if (r7 == r0) goto L_0x0052
            r0 = 25
            if (r7 == r0) goto L_0x0071
            r0 = 77
            if (r7 == r0) goto L_0x006b
            r0 = 802(0x322, float:1.124E-42)
            if (r7 == r0) goto L_0x0061
            r0 = 806(0x326, float:1.13E-42)
            if (r7 == r0) goto L_0x004d
            r0 = 858(0x35a, float:1.202E-42)
            if (r7 != r0) goto L_0x0023
            if (r5 != r6) goto L_0x0023
            r0 = 16
        L_0x0049:
            r2.A79(r0)
            return
        L_0x004d:
            if (r5 != r6) goto L_0x0023
            r0 = 12
            goto L_0x0049
        L_0x0052:
            if (r5 != r6) goto L_0x0023
            r0 = 13
            goto L_0x0049
        L_0x0057:
            if (r5 != r6) goto L_0x0023
            r0 = 11
            goto L_0x0049
        L_0x005c:
            if (r5 != r6) goto L_0x0023
            r0 = 10
            goto L_0x0049
        L_0x0061:
            if (r5 == r6) goto L_0x0067
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r5 != r0) goto L_0x0023
        L_0x0067:
            r2.A79(r4)
            return
        L_0x006b:
            if (r5 != r6) goto L_0x0023
            r2.A79(r1)
            return
        L_0x0071:
            if (r5 != r6) goto L_0x0023
            java.lang.String r0 = "file_path"
            java.lang.String r5 = r3.getStringExtra(r0)
            java.lang.String r0 = "media_url"
            java.lang.String r1 = r3.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x008b
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00f5
        L_0x008b:
            X.33C r9 = new X.33C
            r9.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r4 = 0
            if (r0 != 0) goto L_0x00fb
            java.io.File r0 = X.AnonymousClass002.A0B(r5)
            r9.A0F = r0
            byte[] r6 = X.C107085af.A04(r0)
            r8 = r4
        L_0x00a2:
            java.io.File r0 = r9.A0F
            if (r0 == 0) goto L_0x00f0
        L_0x00a6:
            java.lang.String r0 = "provider"
            r5 = 0
            int r1 = r3.getIntExtra(r0, r5)
            r0 = 1
            if (r1 == r0) goto L_0x00b4
            r0 = 2
            if (r1 == r0) goto L_0x00b4
            r0 = 0
        L_0x00b4:
            r9.A05 = r0
            X.33m r4 = r2.A0I
            X.2rD r7 = r2.A0r
            X.4uZ r11 = r2.A0p
            java.lang.String r0 = "caption"
            java.lang.String r13 = r3.getStringExtra(r0)
            X.34x r12 = r2.A11
            r10 = 0
            java.lang.String r0 = "mentions"
            java.lang.String r0 = r3.getStringExtra(r0)
            java.util.List r15 = X.C624435a.A03(r0)
            r17 = 13
            r16 = r10
            r20 = r5
            r18 = r5
            r14 = r10
            r19 = r5
            X.1mV r0 = r7.A04(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r3 = 1
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.30M r0 = new X.30M
            r0.<init>(r1, r3)
            r4.A08(r0, r6, r5, r5)
            X.4qu r0 = r2.A0l
            r0.A01(r5)
        L_0x00f0:
            r0 = 14
            r2.A79(r0)
        L_0x00f5:
            X.4qq r0 = r2.A0k
            r0.dismiss()
            return
        L_0x00fb:
            android.net.Uri r8 = android.net.Uri.parse(r1)
            java.lang.String r0 = "media_width"
            int r0 = r3.getIntExtra(r0, r6)
            r9.A08 = r0
            java.lang.String r0 = "media_height"
            int r0 = r3.getIntExtra(r0, r6)
            r9.A06 = r0
            java.lang.String r0 = "preview_media_url"
            java.lang.String r1 = r3.getStringExtra(r0)
            if (r1 == 0) goto L_0x0125
            X.5Xp r0 = r2.A0m
            X.8rj r0 = X.C106095Xp.A00(r0)
            X.2OC r0 = r0.B3u(r1)
            if (r0 == 0) goto L_0x0125
            byte[] r4 = r0.A02
        L_0x0125:
            r6 = r4
            if (r8 != 0) goto L_0x00a6
            goto L_0x00a2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.MessageReplyActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002c, code lost:
        if (r0.A0D.A0X(1455) == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x02f3, code lost:
        if (r0.A1K.BFD() == false) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0082, code lost:
        if (r0.A0D.A0Y(r6, 6004) == false) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r67) {
        /*
            r66 = this;
            r0 = r66
            r65 = r67
            r1 = r65
            super.onCreate(r1)
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "isStatusReply"
            r1 = 0
            boolean r4 = r3.getBooleanExtra(r2, r1)
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "isMediaViewReply"
            boolean r2 = r3.getBooleanExtra(r2, r1)
            r0.A1S = r2
            r2 = 1
            if (r4 == 0) goto L_0x002e
            X.1VX r4 = r0.A0D
            r3 = 1455(0x5af, float:2.039E-42)
            boolean r4 = r4.A0X(r3)
            r3 = 1
            if (r4 != 0) goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            r0.A1V = r3
            boolean r3 = X.AnonymousClass4SG.A43(r0)
            r0.A1Q = r3
            X.2sn r7 = r0.A19
            X.4FS r9 = r0.A04
            X.8qC r10 = r0.A1P
            X.1ih r6 = r0.A18
            X.33p r5 = r0.A09
            X.2gE r8 = r0.A1B
            X.7rM r4 = new X.7rM
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.A1F = r4
            X.5pX r3 = new X.5pX
            r3.<init>(r4)
            r0.A0x = r3
            X.0XL r4 = X.AnonymousClass0x9.A0H(r0)
            java.lang.Class<com.whatsapp.community.ConversationCommunityViewModel> r3 = com.whatsapp.community.ConversationCommunityViewModel.class
            X.0Ty r16 = r4.A01(r3)
            r3 = r16
            com.whatsapp.community.ConversationCommunityViewModel r3 = (com.whatsapp.community.ConversationCommunityViewModel) r3
            r16 = r3
            X.0XL r4 = X.AnonymousClass0x9.A0H(r0)
            java.lang.Class<X.94j> r3 = X.C1901794j.class
            X.0Ty r3 = r4.A01(r3)
            X.94j r3 = (X.C1901794j) r3
            X.1VX r5 = r0.A0D
            X.2vE r6 = X.C58422vE.A01
            r4 = 4093(0xffd, float:5.736E-42)
            boolean r4 = r5.A0Y(r6, r4)
            if (r4 == 0) goto L_0x0084
            X.1VX r5 = r0.A0D
            r4 = 6004(0x1774, float:8.413E-42)
            boolean r5 = r5.A0Y(r6, r4)
            r4 = 1
            if (r5 != 0) goto L_0x0085
        L_0x0084:
            r4 = 0
        L_0x0085:
            r0.A1R = r4
            r4 = 2131625449(0x7f0e05e9, float:1.8878106E38)
            r0.setContentView((int) r4)
            android.content.Intent r4 = r0.getIntent()
            X.2z0 r5 = X.C107395bF.A02(r4)
            X.2qz r4 = r0.A1G     // Catch:{ all -> 0x077f }
            X.34x r6 = r4.A05(r5)     // Catch:{ all -> 0x077f }
            r0.A11 = r6
            if (r6 == 0) goto L_0x076a
            boolean r4 = r6 instanceof X.C30341mI
            if (r4 != 0) goto L_0x076a
            X.2z0 r4 = r6.A1J
            X.4uZ r5 = r4.A00
            boolean r4 = r5 instanceof X.C135166kE
            r0.A1T = r4
            if (r4 == 0) goto L_0x0751
            X.4uZ r5 = r6.A0n()
            X.C626936e.A06(r5)
        L_0x00b4:
            r0.A0p = r5
            r4 = 2131431148(0x7f0b0eec, float:1.8484017E38)
            android.view.ViewGroup r4 = X.C86664Kz.A0k(r0, r4)
            r0.A07 = r4
            boolean r4 = r0.A1S
            if (r4 == 0) goto L_0x00ee
            int r5 = android.graphics.Color.argb(r1, r1, r1, r1)
            r4 = 2131102854(0x7f060c86, float:1.7818158E38)
            int r7 = X.AnonymousClass0Y8.A04(r0, r4)
            int[] r4 = X.C86664Kz.A1a(r5)
            r4[r2] = r7
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofArgb(r4)
            r4 = 300(0x12c, double:1.48E-321)
            r6.setDuration(r4)
            r4 = 18
            X.C100295Aj.A03(r6, r0, r4)
            r5 = 3
            X.67F r4 = new X.67F
            r4.<init>(r0, r7, r5)
            r6.addListener(r4)
            r6.start()
        L_0x00ee:
            r4 = 2131431144(0x7f0b0ee8, float:1.8484009E38)
            android.view.View r4 = X.C005205m.A00(r0, r4)
            r0.A05 = r4
            r4 = 2131428130(0x7f0b0322, float:1.8477896E38)
            android.view.View r4 = X.C005205m.A00(r0, r4)
            r0.A02 = r4
            r4 = 2131429108(0x7f0b06f4, float:1.847988E38)
            android.view.View r4 = X.C005205m.A00(r0, r4)
            r0.A04 = r4
            boolean r4 = r0.A1Q
            if (r4 == 0) goto L_0x0739
            r4 = 2131433930(0x7f0b19ca, float:1.848966E38)
            android.view.View r4 = X.C005205m.A00(r0, r4)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r0.A08 = r4
            r4 = 2131432882(0x7f0b15b2, float:1.8487534E38)
            android.view.View r4 = X.C005205m.A00(r0, r4)
            com.google.android.material.button.MaterialButtonToggleGroup r4 = (com.google.android.material.button.MaterialButtonToggleGroup) r4
            r0.A0F = r4
            r4 = 2131433932(0x7f0b19cc, float:1.8489664E38)
            android.view.View r4 = X.C005205m.A00(r0, r4)
            r0.A06 = r4
            android.widget.FrameLayout r5 = r0.A08
            r4 = 2131427817(0x7f0b01e9, float:1.847726E38)
            android.view.View r4 = X.C06560Yg.A02(r5, r4)
            android.widget.GridLayout r4 = (android.widget.GridLayout) r4
            r0.A09 = r4
            android.widget.FrameLayout r5 = r0.A08
            r4 = 2131431704(0x7f0b1118, float:1.8485145E38)
            android.view.View r4 = X.C06560Yg.A02(r5, r4)
            android.widget.GridLayout r4 = (android.widget.GridLayout) r4
            r0.A0A = r4
            android.widget.FrameLayout r5 = r0.A08
            r4 = 2131427852(0x7f0b020c, float:1.8477332E38)
            android.view.View r4 = X.C06560Yg.A02(r5, r4)
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            r0.A0E = r4
        L_0x0153:
            r4 = 2131429655(0x7f0b0917, float:1.8480989E38)
            android.view.View r4 = r0.findViewById(r4)
            r0.A03 = r4
            r4 = 2131429105(0x7f0b06f1, float:1.8479873E38)
            android.view.View r8 = r0.findViewById(r4)
            com.whatsapp.conversation.ConversationEntryActionButton r8 = (com.whatsapp.conversation.ConversationEntryActionButton) r8
            X.5DN r7 = r0.A0G
            X.1VX r6 = r0.A0D
            X.2mi r5 = r0.A0o
            X.4uZ r4 = r0.A0p
            boolean r4 = r5.A01(r4)
            if (r4 == 0) goto L_0x0735
            X.57x r4 = X.AnonymousClass57x.VOICE_ONLY
        L_0x0175:
            X.5TN r4 = X.AnonymousClass5V9.A00(r4, r6)
            r5 = 0
            X.C18270x1.A10(r7, r2, r4)
            X.5gr r9 = new X.5gr
            r14 = r1
            r10 = r7
            r11 = r4
            r12 = r5
            r13 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            X.0XL r6 = X.AnonymousClass4L0.A0F(r9, r0)
            java.lang.Class<X.4VH> r4 = X.AnonymousClass4VH.class
            X.0Ty r4 = r6.A01(r4)
            X.4VH r4 = (X.AnonymousClass4VH) r4
            r0.A0Y = r4
            X.33j r7 = r0.A00
            r4 = 2131432768(0x7f0b1540, float:1.8487303E38)
            X.5UY r14 = X.AnonymousClass5UY.A01(r0, r4)
            X.4VH r6 = r0.A0Y
            X.7Wt r4 = new X.7Wt
            r9 = r4
            r10 = r0
            r11 = r6
            r13 = r7
            r9.<init>(r10, r11, r12, r13, r14)
            r0.A12 = r4
            X.4VH r6 = r0.A0Y
            r7 = 2
            X.6Bb r4 = new X.6Bb
            r4.<init>(r0, r7)
            r8.A03(r0, r4, r6)
            r4 = 2131428485(0x7f0b0485, float:1.8478616E38)
            android.view.View r6 = X.C005205m.A00(r0, r4)
            android.widget.ImageButton r6 = (android.widget.ImageButton) r6
            r0.A0B = r6
            boolean r4 = X.C1001059l.A04
            if (r4 == 0) goto L_0x01c8
            r6.setPadding(r1, r1, r1, r1)
        L_0x01c8:
            android.widget.ImageButton r6 = r0.A0B
            X.8y5 r4 = r0.A1K
            boolean r4 = r4.BFD()
            r9 = 8
            int r4 = X.AnonymousClass001.A08(r4)
            r6.setVisibility(r4)
            android.widget.ImageButton r6 = r0.A0B
            r4 = 3
            X.C18280x3.A0o(r6, r0, r4)
            X.1VX r4 = r0.A0D
            com.whatsapp.WaImageButton r6 = X.AnonymousClass5V8.A01(r0, r4)
            r0.A0C = r6
            r4 = 7
            X.C989753y.A00(r6, r0, r4)
            android.view.LayoutInflater r8 = r0.getLayoutInflater()
            r6 = 2131626295(0x7f0e0937, float:1.8879822E38)
            r4 = 2131434783(0x7f0b1d1f, float:1.849139E38)
            android.view.ViewGroup r4 = X.C86664Kz.A0m(r0, r4)
            r8.inflate(r6, r4, r2)
            X.6BV r10 = new X.6BV
            r10.<init>(r0, r7)
            X.5QR r8 = r0.A1O
            android.view.View r6 = r0.A05
            X.C626936e.A04(r6)
            X.36r r21 = X.C86664Kz.A1B()
            X.4VH r4 = r0.A0Y
            r17 = r8
            r18 = r6
            r19 = r0
            r20 = r4
            r22 = r10
            X.5ZT r10 = r17.A00(r18, r19, r20, r21, r22)
            r0.A1N = r10
            X.4uZ r8 = r0.A0p
            X.5TQ r4 = r10.A0L
            boolean r4 = X.AnonymousClass000.A1W(r4)
            r6 = r4 ^ 1
            java.lang.String r4 = "Do not update the ptt receiver once the recording has started"
            X.C626936e.A0F(r6, r4)
            r10.A0E = r8
            X.34x r4 = r0.A11
            r10.A0G = r4
            r4 = 2131429844(0x7f0b09d4, float:1.8481372E38)
            android.view.View r8 = X.C005205m.A00(r0, r4)
            com.whatsapp.mentions.MentionableEntry r8 = (com.whatsapp.mentions.MentionableEntry) r8
            r0.A0t = r8
            android.text.InputFilter[] r6 = new android.text.InputFilter[r2]
            X.6B3 r4 = new X.6B3
            r4.<init>(r0, r2)
            r6[r1] = r4
            r8.setFilters(r6)
            X.5WS r8 = new X.5WS
            r8.<init>()
            com.whatsapp.mentions.MentionableEntry r6 = r0.A0t
            X.68u r4 = new X.68u
            r4.<init>(r8, r2, r0)
            r6.A0F = r4
            r4 = 2131430743(0x7f0b0d57, float:1.8483196E38)
            android.view.View r10 = r0.findViewById(r4)
            r4 = 2131231690(0x7f0803ca, float:1.8079468E38)
            r10.setBackgroundResource(r4)
            r10.setPadding(r1, r1, r1, r1)
            com.whatsapp.mentions.MentionableEntry r6 = r0.A0t
            X.4uZ r4 = r0.A0p
            boolean r4 = r6.A0K(r4)
            if (r4 == 0) goto L_0x0293
            com.whatsapp.mentions.MentionableEntry r6 = r0.A0t
            r6.A05 = r10
            X.69b r4 = new X.69b
            r4.<init>(r10, r2)
            r6.A0C = r4
            r4 = 2131431361(0x7f0b0fc1, float:1.848445E38)
            android.view.ViewGroup r18 = X.C86664Kz.A0k(r0, r4)
            X.4uZ r4 = r0.A0p
            r21 = r1
            r19 = r4
            r20 = r1
            r22 = r2
            r17 = r6
            r17.A0H(r18, r19, r20, r21, r22)
        L_0x0293:
            java.util.HashMap r6 = A1h
            X.34x r4 = r0.A11
            X.2z0 r4 = r4.A1J
            java.lang.String r12 = X.C18320x8.A0e(r4, r6)
            boolean r4 = android.text.TextUtils.isEmpty(r12)
            if (r4 != 0) goto L_0x02dd
            r0.A77()
            java.util.HashMap r6 = A1g
            X.34x r4 = r0.A11
            X.2z0 r4 = r4.A1J
            java.lang.String r4 = X.C18320x8.A0e(r4, r6)
            java.util.List r6 = X.C624435a.A03(r4)
            com.whatsapp.mentions.MentionableEntry r4 = r0.A0t
            r4.setMentionableText(r12, r6)
            X.5Y0 r11 = r0.A0C
            X.33i r8 = r0.A08
            X.2y5 r6 = r0.A0y
            com.whatsapp.mentions.MentionableEntry r4 = r0.A0t
            android.text.Editable r18 = r4.getEditableText()
            com.whatsapp.mentions.MentionableEntry r4 = r0.A0t
            android.text.TextPaint r19 = r4.getPaint()
            r23 = 2131102273(0x7f060a41, float:1.781698E38)
            boolean r4 = r0.A1R
            r24 = r4
            r17 = r0
            r20 = r8
            r21 = r11
            r22 = r6
            X.C107635bd.A0F(r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x02dd:
            boolean r6 = X.C107575bX.A0F(r12)
            r0.A1U = r6
            X.4VH r4 = r0.A0Y
            r4.A0G(r6)
            android.widget.ImageButton r8 = r0.A0B
            if (r6 == 0) goto L_0x02f5
            X.8y5 r4 = r0.A1K
            boolean r6 = r4.BFD()
            r4 = 0
            if (r6 != 0) goto L_0x02f7
        L_0x02f5:
            r4 = 8
        L_0x02f7:
            r8.setVisibility(r4)
            r4 = 2131434216(0x7f0b1ae8, float:1.849024E38)
            android.view.View r11 = X.C005205m.A00(r0, r4)
            int r6 = r11.getPaddingLeft()
            int r4 = r11.getPaddingRight()
            int r8 = java.lang.Math.max(r6, r4)
            android.view.ViewGroup$LayoutParams r6 = r11.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r6 = (android.widget.RelativeLayout.LayoutParams) r6
            X.33j r4 = r0.A00
            boolean r4 = X.C620733j.A04(r4)
            if (r4 == 0) goto L_0x0731
            r6.rightMargin = r8
        L_0x031d:
            r11.setLayoutParams(r6)
            X.3Ex r6 = r0.A0Q
            X.4uZ r4 = r0.A0p
            X.3ZH r4 = r6.A0A(r4)
            r11 = 3
            X.68I r6 = new X.68I
            r6.<init>(r4, r11, r0)
            com.whatsapp.mentions.MentionableEntry r4 = r0.A0t
            r4.addTextChangedListener(r6)
            boolean r4 = r0.A1R
            if (r4 == 0) goto L_0x0343
            com.whatsapp.mentions.MentionableEntry r8 = r0.A0t
            X.33j r6 = r0.A00
            X.52O r4 = new X.52O
            r4.<init>(r8, r6)
            r8.addTextChangedListener(r4)
        L_0x0343:
            com.whatsapp.mentions.MentionableEntry r8 = r0.A0t
            X.5kX r4 = new X.5kX
            r4.<init>(r0)
            r8.A01 = r4
            r6 = 6
            X.68Y r4 = new X.68Y
            r4.<init>(r0, r6)
            r8.setOnEditorActionListener(r4)
            r4 = 2131429572(0x7f0b08c4, float:1.848082E38)
            android.view.View r8 = X.C005205m.A00(r0, r4)
            r4 = 4
            X.C18280x3.A0o(r8, r0, r4)
            X.1VX r4 = r0.A0D
            android.widget.ImageButton r8 = X.AnonymousClass5V8.A00(r0, r4)
            X.2gE r4 = r0.A1B
            boolean r4 = r4.A01()
            if (r4 == 0) goto L_0x0397
            X.1VX r13 = r0.A0D
            X.2QZ r12 = r0.A1E
            X.3Ad r4 = new X.3Ad
            r4.<init>(r13, r12)
            X.0XL r12 = X.AnonymousClass4L0.A0F(r4, r0)
            java.lang.Class<X.10k> r4 = X.AnonymousClass10k.class
            X.0Ty r13 = r12.A01(r4)
            X.10k r13 = (X.AnonymousClass10k) r13
            r0.A1C = r13
            X.7rM r4 = r0.A1F
            r4.A01 = r13
            X.3Wi r12 = r0.A05
            X.5Nu r4 = new X.5Nu
            r4.<init>(r12, r13)
            r0.A1D = r4
            com.whatsapp.emoji.search.EmojiSearchProvider r4 = r0.A0g
            r4.A01(r5)
        L_0x0397:
            X.5PB r14 = r0.A0j
            r14.A00 = r0
            android.view.ViewGroup r12 = r0.A07
            com.whatsapp.KeyboardPopupLayout r12 = (com.whatsapp.KeyboardPopupLayout) r12
            com.whatsapp.mentions.MentionableEntry r4 = r0.A0t
            r14.A02 = r12
            r14.A01 = r8
            r14.A03 = r4
            X.5RE r13 = r0.A0c
            X.AnonymousClass5PB.A00(r13, r14)
            X.10k r12 = r0.A1C
            X.7rM r4 = r0.A1F
            X.5RA r4 = r13.A01(r12, r4)
            r14.A07 = r4
            X.4qq r12 = r14.A01()
            r0.A0k = r12
            X.5pX r4 = r0.A0x
            r4.A01(r12, r0)
            X.4qq r12 = r0.A0k
            X.4CE r4 = r0.A1X
            r12.A0C(r4)
            X.6B2 r4 = new X.6B2
            r4.<init>(r0, r2)
            r12.A0A = r4
            X.4FV r4 = r0.A0h
            r23 = r4
            X.2r8 r4 = r0.A0n
            r19 = r4
            r4 = 2131430353(0x7f0b0bd1, float:1.8482405E38)
            android.view.View r13 = r0.findViewById(r4)
            com.whatsapp.gifsearch.GifSearchContainer r13 = (com.whatsapp.gifsearch.GifSearchContainer) r13
            r4 = 2131429717(0x7f0b0955, float:1.8481115E38)
            android.view.View r12 = r0.findViewById(r4)
            com.whatsapp.emoji.search.EmojiSearchContainer r12 = (com.whatsapp.emoji.search.EmojiSearchContainer) r12
            X.4qq r4 = r0.A0k
            r18 = r4
            X.5Y0 r4 = r0.A0C
            r21 = r4
            X.1ej r4 = r0.A0f
            r17 = r4
            X.33j r15 = r0.A00
            X.2y5 r4 = r0.A0y
            X.4qu r14 = new X.4qu
            r24 = r18
            r25 = r13
            r26 = r19
            r27 = r4
            r18 = r0
            r19 = r15
            r20 = r17
            r22 = r12
            r17 = r14
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0.A0l = r14
            r4 = 9
            X.AnonymousClass5S9.A00(r14, r0, r4)
            X.5mr r4 = new X.5mr
            r4.<init>(r0)
            r14.A00 = r4
            X.4qq r13 = r0.A0k
            r12 = 4
            X.5aY r4 = new X.5aY
            r4.<init>(r0, r12)
            r13.A0J(r4)
            X.5pX r14 = r0.A0x
            X.5mu r4 = new X.5mu
            r4.<init>(r0)
            r14.A01 = r4
            r13 = 5
            X.5aY r4 = new X.5aY
            r4.<init>(r0, r13)
            r14.A04 = r4
            X.7rM r4 = r0.A1F
            X.1ih r13 = r4.A0B
            X.2sh r4 = r4.A09
            r13.A06(r4)
            boolean r13 = r0.A1V
            android.widget.FrameLayout r4 = r0.A08
            if (r13 != 0) goto L_0x0671
            r4.setVisibility(r9)
            android.view.LayoutInflater r9 = r0.getLayoutInflater()
            r4 = 2131625869(0x7f0e078d, float:1.8878958E38)
            android.view.View r13 = r9.inflate(r4, r5, r1)
            r4 = 2131432815(0x7f0b156f, float:1.8487398E38)
            android.widget.FrameLayout r9 = X.C86664Kz.A0s(r13, r4)
            android.graphics.drawable.Drawable r4 = X.C106205Ya.A00(r0)
            r9.setForeground(r4)
            r4 = 2131432817(0x7f0b1571, float:1.8487402E38)
            android.view.ViewGroup r4 = X.C86664Kz.A0k(r0, r4)
            r4.setVisibility(r1)
            r4.addView(r13)
            r4 = 2131432827(0x7f0b157b, float:1.8487422E38)
            android.widget.TextView r12 = X.AnonymousClass002.A09(r13, r4)
            r4 = 2131432813(0x7f0b156d, float:1.8487394E38)
            android.widget.TextView r11 = X.AnonymousClass002.A09(r13, r4)
            r4 = 2131432824(0x7f0b1578, float:1.8487416E38)
            android.widget.TextView r10 = X.AnonymousClass002.A09(r13, r4)
            X.5ST r5 = r0.A0V
            android.content.res.Resources r4 = r0.getResources()
            float r4 = r5.A02(r4)
            X.C106905aM.A05(r12, r11, r10, r4)
            X.2pL r5 = r0.A13
            X.34x r4 = r0.A11
            boolean r4 = r5.A03(r4)
            if (r4 == 0) goto L_0x0646
            X.2pL r5 = r0.A13
            X.34x r4 = r0.A11
            r5.A00(r9, r4)
        L_0x04a5:
            boolean r4 = r0.A1V
            if (r4 == 0) goto L_0x0610
            android.view.View r4 = r0.A04
            r5 = 0
            r4.setAlpha(r5)
            android.widget.FrameLayout r4 = r0.A08
            r4.setAlpha(r5)
            android.animation.AnimatorSet r4 = X.C86664Kz.A0O()
            r0.A00 = r4
            android.widget.FrameLayout r9 = r0.A08
            android.util.Property r5 = android.view.View.ALPHA
            float[] r4 = new float[r2]
            r12 = 1065353216(0x3f800000, float:1.0)
            r4[r1] = r12
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r9, r5, r4)
            r4 = 150(0x96, double:7.4E-322)
            r11.setDuration(r4)
            android.view.animation.Interpolator r10 = A1e
            r11.setInterpolator(r10)
            android.view.View r9 = r0.A04
            android.animation.ObjectAnimator r9 = X.C86634Kw.A0A(r9, r12)
            r9.setDuration(r4)
            r9.setInterpolator(r10)
            android.animation.AnimatorSet r4 = r0.A00
            android.animation.Animator[] r1 = X.C86664Kz.A1b(r9, r11, r7, r1)
            r4.playTogether(r1)
            X.5Ua r4 = r0.A1M
            X.4uZ r1 = r0.A0p
            X.5Ir r1 = r4.A00(r1)
            if (r1 == 0) goto L_0x0603
            r0.A7H(r2)
        L_0x04f4:
            com.whatsapp.status.playback.MessageReplyActivity$9 r2 = new com.whatsapp.status.playback.MessageReplyActivity$9
            r2.<init>()
            android.view.View r1 = r0.A02
            X.C86634Kw.A1C(r1, r2)
            r1 = 11
            X.C1232167o.A00(r2, r0, r1)
            android.view.View r1 = r0.A02
            X.C989753y.A00(r1, r0, r6)
            X.2sq r2 = r0.A0O
            X.4uZ r1 = r0.A0p
            boolean r1 = X.C86614Ku.A1X(r2, r1)
            if (r1 == 0) goto L_0x0517
            r1 = 106(0x6a, float:1.49E-43)
            X.C621433s.A01(r0, r1)
        L_0x0517:
            X.5Ag r35 = new X.5Ag
            r35.<init>()
            X.1VX r1 = r0.A0D
            r43 = r1
            X.3Wi r1 = r0.A05
            r64 = r1
            X.5Wv r1 = r0.A0B
            r56 = r1
            X.2sr r1 = r0.A01
            r63 = r1
            X.2qk r1 = r0.A03
            r62 = r1
            X.5Ul r1 = r0.A0H
            r61 = r1
            X.3Dh r1 = r0.A04
            r60 = r1
            X.4FV r1 = r0.A0h
            r44 = r1
            X.2iF r1 = r0.A0M
            r29 = r1
            X.33m r1 = r0.A0I
            r25 = r1
            X.5XF r1 = r0.A0L
            r28 = r1
            X.2fI r1 = r0.A0s
            r48 = r1
            X.2zf r1 = r0.A07
            r42 = r1
            X.1fd r1 = r0.A0q
            r47 = r1
            X.2PX r1 = r0.A0N
            r30 = r1
            X.53r r1 = r0.A1I
            r58 = r1
            X.33i r1 = r0.A08
            r39 = r1
            X.2sq r1 = r0.A0O
            r31 = r1
            X.2gq r1 = r0.A0w
            r24 = r1
            X.2s6 r1 = r0.A0Z
            r23 = r1
            X.2Xk r1 = r0.A0P
            r22 = r1
            X.5ZR r1 = r0.A0a
            r21 = r1
            X.33p r1 = r0.A09
            r20 = r1
            X.5XO r1 = r0.A1H
            r19 = r1
            X.5Th r1 = r0.A0J
            r18 = r1
            X.33g r15 = r0.A0K
            X.1id r14 = r0.A0A
            X.2y5 r13 = r0.A0y
            X.5mA r12 = r0.A0W
            X.4Ep r11 = r0.A1Y
            X.4uZ r10 = r0.A0p
            android.view.ViewGroup r9 = r0.A07
            com.whatsapp.KeyboardPopupLayout r9 = (com.whatsapp.KeyboardPopupLayout) r9
            com.whatsapp.mentions.MentionableEntry r7 = r0.A0t
            X.9Rm r6 = r0.A0v
            X.9Tp r5 = r0.A0u
            X.5MZ r4 = r0.A0i
            X.4fS r2 = new X.4fS
            r1 = 0
            r34 = r0
            r17 = r0
            r26 = r18
            r27 = r15
            r32 = r16
            r33 = r22
            r36 = r12
            r37 = r11
            r38 = r23
            r40 = r21
            r41 = r20
            r45 = r4
            r46 = r10
            r49 = r7
            r50 = r5
            r51 = r3
            r52 = r6
            r53 = r24
            r54 = r13
            r55 = r14
            r57 = r19
            r59 = r1
            r16 = r2
            r18 = r62
            r19 = r0
            r20 = r60
            r21 = r64
            r22 = r9
            r23 = r63
            r24 = r61
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            r0.A0U = r2
            java.util.Set r4 = r0.A1b
            r4.add(r2)
            java.util.Set r3 = r0.A1a
            X.4fS r2 = r0.A0U
            r3.add(r2)
            java.util.Set r3 = r0.A1c
            X.4fS r2 = r0.A0U
            r3.add(r2)
            java.util.Iterator r4 = r4.iterator()
        L_0x05f3:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0758
            android.app.Application$ActivityLifecycleCallbacks r3 = X.C86664Kz.A0R(r4)
            r2 = r65
            r3.onActivityCreated(r0, r2)
            goto L_0x05f3
        L_0x0603:
            android.view.ViewGroup r1 = r0.A07
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            r1 = 31
            X.AnonymousClass6BG.A00(r2, r0, r1)
            goto L_0x04f4
        L_0x0610:
            r19 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.TranslateAnimation r7 = new android.view.animation.TranslateAnimation
            r20 = r2
            r22 = r2
            r24 = r2
            r25 = r19
            r18 = r2
            r21 = r19
            r17 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            r4 = 200(0xc8, double:9.9E-322)
            r7.setDuration(r4)
            r4 = 300(0x12c, double:1.48E-321)
            r7.setStartOffset(r4)
            r7.setFillBefore(r2)
            r7.setFillAfter(r2)
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>()
            r7.setInterpolator(r1)
            android.view.View r1 = r0.A04
            r1.startAnimation(r7)
            goto L_0x04f4
        L_0x0646:
            X.5mL r12 = r0.A0X
            X.4uZ r11 = r0.A0p
            X.34x r10 = r0.A11
            X.33O r9 = r0.A17
            X.5Uq r4 = r0.A0S
            if (r4 != 0) goto L_0x065c
            X.5mM r5 = r0.A0T
            java.lang.String r4 = "message-reply-activity"
            X.5Uq r4 = r5.A06(r0, r4)
            r0.A0S = r4
        L_0x065c:
            r24 = r1
            r22 = r9
            r23 = r1
            r18 = r13
            r19 = r4
            r20 = r11
            r21 = r10
            r17 = r12
            r17.A0H(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x04a5
        L_0x0671:
            r4.setVisibility(r1)
            boolean r4 = X.AnonymousClass4SG.A43(r0)
            if (r4 == 0) goto L_0x06f8
            X.2gs r4 = r0.A0z
            boolean r4 = r4.A01()
            if (r4 == 0) goto L_0x072b
            com.google.android.material.button.MaterialButtonToggleGroup r9 = r0.A0F
            if (r9 == 0) goto L_0x0710
            android.view.View r4 = r0.A06
            if (r4 == 0) goto L_0x0710
            r9.setVisibility(r1)
            android.view.View r4 = r0.A06
            r4.setVisibility(r1)
            X.4xb r4 = r0.A16
            X.5PV r14 = r0.A1Z
            r4.A06(r14)
            com.google.android.material.button.MaterialButtonToggleGroup r4 = r0.A0F
            if (r4 == 0) goto L_0x06a7
            X.69I r9 = new X.69I
            r9.<init>(r0, r2)
            java.util.LinkedHashSet r4 = r4.A08
            r4.add(r9)
        L_0x06a7:
            X.33p r4 = r0.A09
            java.lang.String r12 = "AVATAR"
            android.content.SharedPreferences r9 = X.AnonymousClass0x2.A0F(r4)
            java.lang.String r4 = "status_reactions_type_selected_tab"
            java.lang.String r4 = r9.getString(r4, r12)
            X.59M r13 = X.AnonymousClass59M.valueOf(r4)
            X.59M r12 = X.AnonymousClass59M.EMOJI
            com.google.android.material.button.MaterialButtonToggleGroup r9 = r0.A0F
            r4 = 2131427852(0x7f0b020c, float:1.8477332E38)
            if (r13 != r12) goto L_0x06c5
            r4 = 2131429739(0x7f0b096b, float:1.848116E38)
        L_0x06c5:
            r9.A02(r4, r2)
            com.whatsapp.status.playback.avatar.AvatarReactionRepository r13 = r0.A15
            java.lang.ref.WeakReference r12 = X.AnonymousClass0x9.A14(r14)
            java.io.File r9 = r13.A00
            if (r9 == 0) goto L_0x06dd
            java.lang.Object r4 = r12.get()
            X.5PV r4 = (X.AnonymousClass5PV) r4
            if (r4 == 0) goto L_0x06dd
            r4.A00(r9)
        L_0x06dd:
            java.io.File r4 = r13.A00
            if (r4 != 0) goto L_0x06f8
            X.3gB r9 = r13.A05
            X.46U r4 = new X.46U
            r4.<init>(r5)
            X.4Gl r4 = X.C616031m.A00(r9, r4)
            X.4C6 r9 = X.AnonymousClass349.A02(r4)
            com.whatsapp.status.playback.avatar.AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1 r4 = new com.whatsapp.status.playback.avatar.AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1
            r4.<init>(r13, r12, r5)
            X.C616131n.A02(r5, r4, r9, r5, r11)
        L_0x06f8:
            r4 = 2131231693(0x7f0803cd, float:1.8079474E38)
            r10.setBackgroundResource(r4)
            boolean r4 = r0.A7F()
            if (r4 == 0) goto L_0x0709
            android.widget.FrameLayout r4 = r0.A08
            r4.setVisibility(r1)
        L_0x0709:
            android.widget.FrameLayout r4 = r0.A08
            r0.setStatusReactionsEmojiLayout(r4)
            goto L_0x04a5
        L_0x0710:
            X.2r2 r9 = r0.A10
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "hasAvatar="
            r5.append(r4)
            X.2gs r4 = r0.A0z
            boolean r4 = r4.A01()
            java.lang.String r5 = X.C18300x5.A0m(r5, r4)
            java.lang.String r4 = "failed_to_setup_avatar_reactions_empty_toggle_type_views"
            r9.A02(r12, r4, r5)
            goto L_0x06f8
        L_0x072b:
            android.widget.GridLayout r4 = r0.A0A
            r4.setVisibility(r1)
            goto L_0x06f8
        L_0x0731:
            r6.leftMargin = r8
            goto L_0x031d
        L_0x0735:
            X.57x r4 = X.AnonymousClass57x.NONE
            goto L_0x0175
        L_0x0739:
            r4 = 2131433929(0x7f0b19c9, float:1.8489658E38)
            android.view.View r5 = X.C005205m.A00(r0, r4)
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            r0.A08 = r5
            r4 = 2131429700(0x7f0b0944, float:1.848108E38)
            android.view.View r4 = X.C06560Yg.A02(r5, r4)
            android.widget.GridLayout r4 = (android.widget.GridLayout) r4
            r0.A0A = r4
            goto L_0x0153
        L_0x0751:
            java.lang.String r4 = "chatJid must not be null"
            X.C626936e.A07(r5, r4)
            goto L_0x00b4
        L_0x0758:
            X.1VX r2 = r0.A0D
            X.C162457s7.A0J(r2, r1)
            r1 = 4268(0x10ac, float:5.981E-42)
            boolean r1 = r2.A0X(r1)
            if (r1 != 0) goto L_0x0767
            android.widget.ImageButton r8 = r0.A0C
        L_0x0767:
            r0.A0D = r8
            return
        L_0x076a:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "messagereply/message-deleted/"
            X.C18260x0.A1R(r3, r2, r5)
            X.3Wi r3 = r0.A05
            r2 = 2131893972(0x7f121ed4, float:1.9422736E38)
            r3.A0H(r2, r1)
            r0.finish()
            return
        L_0x077f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.MessageReplyActivity.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        C19340zH r3;
        if (i == 17) {
            r3 = AnonymousClass5V0.A00(this);
            Object[] objArr = new Object[1];
            AnonymousClass000.A1P(objArr, 65536, 0);
            C86624Kv.A0i(this, r3, objArr, R.string.f11nameremoved);
            C1235268t.A03(r3, this, 124, R.string.f11nameremoved);
            C1235268t.A04(r3, this, 125, R.string.f11nameremoved);
        } else if (i != 106) {
            return super.onCreateDialog(i);
        } else {
            AnonymousClass3ZH A0A2 = this.A0Q.A0A(this.A0p);
            r3 = AnonymousClass5V0.A00(this);
            Object[] objArr2 = new Object[1];
            C18300x5.A1E(this.A0R, A0A2, objArr2, 0);
            C86624Kv.A0i(this, r3, objArr2, R.string.f11nameremoved);
            r3.A0Y(new AnonymousClass69T(this, 20, A0A2), R.string.f11nameremoved);
            C1235268t.A04(r3, this, 123, R.string.f11nameremoved);
            r3.A0V(new C1235568w(this, 13));
        }
        return r3.create();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Iterator it = this.A1c.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final AnimatorSet A74(View view, View view2, ViewGroup viewGroup) {
        AnimatorSet A0O2 = C86664Kz.A0O();
        AnimatorSet A0O3 = C86664Kz.A0O();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{1.5f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{1.5f});
        ofFloat.setDuration(500);
        ofFloat2.setDuration(500);
        Interpolator interpolator = A1f;
        ofFloat.setInterpolator(interpolator);
        ofFloat2.setInterpolator(interpolator);
        Animator[] animatorArr = new Animator[2];
        animatorArr[0] = ofFloat;
        AnimatorSet A092 = C86644Kx.A09(A0O3, ofFloat2, animatorArr, 1);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{0.0f});
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{0.0f});
        ObjectAnimator A0A2 = C86634Kw.A0A(view, 0.0f);
        ofFloat3.setDuration(200);
        ofFloat4.setDuration(200);
        A0A2.setDuration(200);
        Interpolator interpolator2 = A1e;
        ofFloat3.setInterpolator(interpolator2);
        ofFloat4.setInterpolator(interpolator2);
        A0A2.setInterpolator(interpolator2);
        AnimatorSet A093 = C86644Kx.A09(A092, A0A2, C86664Kz.A1b(ofFloat3, ofFloat4, 3, 0), 2);
        ArrayList A0s2 = AnonymousClass001.A0s();
        int i = 0;
        while (true) {
            ViewGroup viewGroup2 = viewGroup;
            if (i >= viewGroup2.getChildCount()) {
                break;
            }
            if (viewGroup2.getChildAt(i).getId() != view.getId()) {
                ObjectAnimator A0A3 = C86634Kw.A0A(viewGroup2.getChildAt(i), 0.0f);
                A0A3.setDuration(250);
                A0A3.setInterpolator(interpolator);
                A0s2.add(A0A3);
            }
            i++;
        }
        View view3 = view2;
        if (view2 != null) {
            ObjectAnimator A0A4 = C86634Kw.A0A(view3, 0.0f);
            A0A4.setDuration(250);
            A0A4.setInterpolator(interpolator);
            A0s2.add(A0A4);
        }
        A093.playTogether(A0s2);
        A0O2.playTogether(C86664Kz.A1b(A0O3, A093, 2, 0));
        A0O2.playSequentially(C86664Kz.A1b(A0O3, A092, 2, 0));
        return A0O2;
    }

    public final void A77() {
        GridLayout gridLayout;
        if (AnonymousClass4SG.A43(this)) {
            if (this.A14 == AnonymousClass59M.EMOJI) {
                gridLayout = this.A0A;
            } else {
                gridLayout = this.A09;
            }
            AnimatorSet A0O2 = C86664Kz.A0O();
            ArrayList A0s2 = AnonymousClass001.A0s();
            if (gridLayout != null) {
                for (int i = 0; i < gridLayout.getChildCount(); i++) {
                    ObjectAnimator A0A2 = C86634Kw.A0A(gridLayout.getChildAt(i), 0.0f);
                    A0A2.setDuration(150);
                    A0A2.setInterpolator(A1f);
                    A0s2.add(A0A2);
                }
            }
            View view = this.A06;
            if (view != null) {
                ObjectAnimator A0A3 = C86634Kw.A0A(view, 0.0f);
                A0A3.setDuration(150);
                A0A3.setInterpolator(A1f);
                A0s2.add(A0A3);
            }
            A0O2.playTogether(A0s2);
            A0O2.start();
            return;
        }
        this.A08.setVisibility(8);
    }

    public final boolean A7G(Configuration configuration) {
        if (AnonymousClass4SG.A43(this) || configuration.orientation != 2 || this.A0e.A02()) {
            return false;
        }
        return true;
    }

    public final boolean A7H(boolean z) {
        if (!AnonymousClass4SG.A43(this) || !z) {
            Rect A0N2 = AnonymousClass001.A0N();
            this.A07.getWindowVisibleDisplayFrame(A0N2);
            DisplayMetrics A0B2 = AnonymousClass000.A0B(this);
            int height = this.A07.getRootView().getHeight() - (A0N2.bottom - A0N2.top);
            if (((int) (((float) height) / A0B2.density)) <= 100 && !z) {
                return false;
            }
            int dimensionPixelSize = (A0B2.heightPixels - height) + getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            ViewGroup.LayoutParams layoutParams = this.A08.getLayoutParams();
            layoutParams.height = dimensionPixelSize;
            this.A08.setLayoutParams(layoutParams);
        }
        this.A00.start();
        return true;
    }

    public void AxU(int i) {
        A79(i);
    }

    public void Bom(DialogFragment dialogFragment) {
        Boo(dialogFragment);
        getWindow().setSoftInputMode(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (A7F() == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigurationChanged(android.content.res.Configuration r5) {
        /*
            r4 = this;
            super.onConfigurationChanged(r5)
            boolean r0 = r4.A1V
            if (r0 == 0) goto L_0x0027
            android.widget.FrameLayout r3 = r4.A08
            r2 = 0
            if (r3 == 0) goto L_0x001e
            boolean r0 = r4.A7G(r5)
            if (r0 != 0) goto L_0x0019
            boolean r1 = r4.A7F()
            r0 = 0
            if (r1 != 0) goto L_0x001b
        L_0x0019:
            r0 = 8
        L_0x001b:
            r3.setVisibility(r0)
        L_0x001e:
            boolean r0 = r4.A7G(r5)
            if (r0 != 0) goto L_0x0027
            r4.A7H(r2)
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.MessageReplyActivity.onConfigurationChanged(android.content.res.Configuration):void");
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0x.A00();
        AnonymousClass5ZT r0 = this.A1N;
        if (r0 != null) {
            r0.A04();
            this.A1N = null;
        }
        C94264qq r02 = this.A0k;
        if (r02 != null) {
            r02.A0F();
        }
        AnonymousClass33O r03 = this.A17;
        if (r03 != null) {
            r03.A03();
        }
        C105365Uq r04 = this.A0S;
        if (r04 != null) {
            r04.A00();
            this.A0S = null;
        }
        C992054v r1 = this.A1L;
        if (r1 != null) {
            r1.A0D(true);
            this.A1L = null;
        }
        Set set = this.A1b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C86664Kz.A0R(it).onActivityDestroyed(this);
        }
        set.clear();
        this.A1a.clear();
        this.A1c.clear();
        C162157rM r05 = this.A1F;
        r05.A0B.A07(r05.A09);
        this.A16.A07(this.A1Z);
    }

    public void onPause() {
        super.onPause();
        AnonymousClass5ZT r1 = this.A1N;
        if (r1 != null && r1.A0L != null) {
            r1.A05();
        }
    }

    public void onResume() {
        super.onResume();
        Iterator it = this.A1b.iterator();
        while (it.hasNext()) {
            C86664Kz.A0R(it).onActivityResumed(this);
        }
    }

    public void onStart() {
        super.onStart();
        Window window = getWindow();
        int i = 4;
        if (this.A0k.isShowing()) {
            i = 2;
        }
        window.setSoftInputMode(i | 1);
        if (!this.A0k.isShowing() && (C86604Kt.A02(this) != 2 || !AnonymousClass4SG.A43(this))) {
            this.A0t.A07(true);
        }
        C992054v r1 = this.A1L;
        if (r1 != null) {
            r1.A0D(true);
            this.A1L = null;
        }
        C124296Bs r4 = new C124296Bs(this, 1);
        C992054v r12 = new C992054v(this.A0p, this.A1G, r4, this.A1M);
        this.A1L = r12;
        C18270x1.A0w(r12, this.A04);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00af, code lost:
        if (r5 != false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r14.A1Q != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setStatusReactionsEmojiLayout(android.view.View r25) {
        /*
            r24 = this;
            r0 = 2131433931(0x7f0b19cb, float:1.8489662E38)
            r2 = r25
            com.whatsapp.WaTextView r11 = X.C86644Kx.A0O(r2, r0)
            r15 = 0
            r14 = r24
            if (r11 == 0) goto L_0x0025
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r14)
            java.lang.String r0 = "status_reactions_nux_shown_count"
            int r1 = r1.getInt(r0, r15)
            r0 = 2
            if (r1 > r0) goto L_0x0020
            boolean r1 = r14.A1Q
            r0 = 0
            if (r1 == 0) goto L_0x0022
        L_0x0020:
            r0 = 8
        L_0x0022:
            r11.setVisibility(r0)
        L_0x0025:
            X.1VX r1 = r14.A0D
            r0 = 1852(0x73c, float:2.595E-42)
            java.lang.String r0 = r1.A0Q(r0)
            boolean r10 = r14.A1Q
            java.util.List r9 = X.C106595Zp.A00(r0)
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            int r0 = r9.size()
            java.util.List r7 = X.C105535Vj.A01
            int r6 = X.C86654Ky.A06(r7, r0)
            r5 = 0
        L_0x0042:
            if (r5 >= r6) goto L_0x0077
            if (r10 == 0) goto L_0x0075
            java.util.List r0 = X.C105535Vj.A02
        L_0x0048:
            java.lang.Object r1 = X.C86654Ky.A0k(r0, r5)
            java.lang.Number r1 = (java.lang.Number) r1
            if (r10 == 0) goto L_0x0073
            java.util.List r0 = X.C105535Vj.A02
        L_0x0052:
            java.lang.Object r0 = r0.get(r5)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r1.intValue()
            int r3 = r0.intValue()
            int r1 = X.AnonymousClass000.A09(r9, r5)
            X.5IZ r0 = new X.5IZ
            r0.<init>(r4, r3, r1)
            r8.add(r0)
            int r5 = r5 + 1
            goto L_0x0042
        L_0x0073:
            r0 = r7
            goto L_0x0052
        L_0x0075:
            r0 = r7
            goto L_0x0048
        L_0x0077:
            java.util.Iterator r6 = r8.iterator()
        L_0x007b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0134
            java.lang.Object r1 = r6.next()
            X.5IZ r1 = (X.AnonymousClass5IZ) r1
            int r0 = r1.A00
            android.view.View r13 = X.C06560Yg.A02(r2, r0)
            com.whatsapp.emoji.EmojiContainerView r13 = (com.whatsapp.emoji.EmojiContainerView) r13
            int r0 = r1.A02
            android.widget.ImageView r10 = X.AnonymousClass0x9.A0E(r2, r0)
            android.content.res.Resources r9 = X.C18290x4.A0G(r2)
            r3 = 1
            int[] r0 = new int[r3]
            int r4 = r1.A01
            r0[r15] = r4
            boolean r5 = X.C107425bI.A02(r0)
            int[] r0 = new int[r3]
            r0[r15] = r4
            boolean r1 = X.C107425bI.A03(r0)
            if (r1 != 0) goto L_0x00b1
            r0 = 0
            if (r5 == 0) goto L_0x00b2
        L_0x00b1:
            r0 = 1
        L_0x00b2:
            r13.A04 = r0
            if (r5 == 0) goto L_0x00f9
            X.2y5 r1 = r14.A0y
            int[] r0 = new int[r3]
            r0[r15] = r4
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            int[] r0 = X.C107005aX.A04(r1, r0)
            X.5Zv r12 = new X.5Zv
            r12.<init>((int[]) r0)
            X.690 r8 = new X.690
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
        L_0x00d0:
            r13.setOnLongClickListener(r8)
        L_0x00d3:
            java.lang.String r0 = r12.toString()
            r10.setContentDescription(r0)
            r13.setClickable(r3)
            android.widget.GridLayout r1 = r14.A0A
            int[] r0 = r12.A00
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            r16 = r14
            r17 = r9
            r18 = r13
            r19 = r1
            r20 = r10
            r21 = r11
            r22 = r0
            r16.A7A(r17, r18, r19, r20, r21, r22)
            goto L_0x007b
        L_0x00f9:
            if (r1 == 0) goto L_0x0126
            X.2y5 r1 = r14.A0y
            int[] r0 = new int[r3]
            r0[r15] = r4
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            int[] r0 = X.C107005aX.A05(r1, r0)
            X.5Zv r12 = new X.5Zv
            r12.<init>((int[]) r0)
            X.690 r8 = new X.690
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r20 = r12
            r21 = r13
            r22 = r14
            r23 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x00d0
        L_0x0126:
            int[] r0 = new int[r3]
            r0[r15] = r4
            X.5Zv r12 = new X.5Zv
            r12.<init>((int[]) r0)
            r0 = 0
            r13.setOnLongClickListener(r0)
            goto L_0x00d3
        L_0x0134:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.MessageReplyActivity.setStatusReactionsEmojiLayout(android.view.View):void");
    }
}
