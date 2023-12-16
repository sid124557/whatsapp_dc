package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass1VX;
import X.AnonymousClass29H;
import X.AnonymousClass2X0;
import X.AnonymousClass33p;
import X.AnonymousClass487;
import X.AnonymousClass4CE;
import X.AnonymousClass4FS;
import X.AnonymousClass52R;
import X.AnonymousClass54F;
import X.AnonymousClass5IY;
import X.AnonymousClass5S9;
import X.AnonymousClass5Y0;
import X.AnonymousClass694;
import X.AnonymousClass698;
import X.AnonymousClass6BC;
import X.AnonymousClass6BG;
import X.C003203q;
import X.C08310eF;
import X.C102805Ki;
import X.C105895Wv;
import X.C106685Zz;
import X.C107345b9;
import X.C111095hX;
import X.C112825kR;
import X.C113995mK;
import X.C114645nN;
import X.C1232467r;
import X.C149027Kq;
import X.C18310x6;
import X.C27821ej;
import X.C48682fI;
import X.C55682qk;
import X.C56072rN;
import X.C56492s4;
import X.C57772uB;
import X.C57782uC;
import X.C60152y5;
import X.C620633i;
import X.C620733j;
import X.C626936e;
import X.C627736r;
import X.C66513Ls;
import X.C69263Wi;
import X.C70203a7;
import X.C71323bv;
import X.C86604Kt;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C89224c7;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.util.List;
import java.util.regex.Pattern;

public class SharedTextPreviewDialogFragment extends Hilt_SharedTextPreviewDialogFragment {
    public View A00;
    public ImageButton A01;
    public C111095hX A02;
    public C55682qk A03;
    public C56492s4 A04;
    public C66513Ls A05;
    public SharedTextPreviewScrollView A06;
    public AnonymousClass33p A07;
    public C89224c7 A08;
    public AnonymousClass487 A09;
    public AnonymousClass5IY A0A;
    public C27821ej A0B;
    public AnonymousClass5Y0 A0C;
    public EmojiSearchProvider A0D;
    public C106685Zz A0E;
    public C48682fI A0F;
    public MentionableEntry A0G;
    public C60152y5 A0H;
    public AnonymousClass2X0 A0I;
    public C113995mK A0J;
    public C56072rN A0K;
    public C105895Wv A0L;
    public AnonymousClass4FS A0M;
    public Runnable A0N = null;
    public String A0O;
    public String A0P;
    public String A0Q;
    public boolean A0R = false;
    public boolean A0S;
    public boolean A0T = false;
    public boolean A0U;
    public boolean A0V = false;
    public boolean A0W = true;
    public final Handler A0X = AnonymousClass000.A0A();
    public final AnonymousClass4CE A0Y = new AnonymousClass694(this, 0);

    public static SharedTextPreviewDialogFragment A00(String str, List list, boolean z, boolean z2, boolean z3) {
        SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = new SharedTextPreviewDialogFragment();
        BaseSharedPreviewDialogFragment baseSharedPreviewDialogFragment = new BaseSharedPreviewDialogFragment();
        Bundle A082 = AnonymousClass002.A08();
        C86644Kx.A0r(A082, "jids", list);
        baseSharedPreviewDialogFragment.A0u(A082);
        Bundle A0H2 = baseSharedPreviewDialogFragment.A0H();
        A0H2.putString("message", str);
        A0H2.putBoolean("has_text_from_url", z);
        A0H2.putBoolean("fb_share_wa_redirect", z2);
        A0H2.putBoolean("disable_post_send_intent", z3);
        sharedTextPreviewDialogFragment.A0u(A0H2);
        return sharedTextPreviewDialogFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        if (r0.getVisibility() != 0) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A01(com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r7) {
        /*
            com.whatsapp.mentions.MentionableEntry r0 = r7.A0G
            java.lang.String r0 = X.C18290x4.A0m(r0)
            java.lang.String r6 = r0.trim()
            int r0 = r6.length()
            r4 = 0
            if (r0 != 0) goto L_0x001a
            X.3Wi r1 = r7.A08
            r0 = 2131891194(0x7f1213fa, float:1.9417101E38)
            r1.A0H(r0, r4)
        L_0x0019:
            return
        L_0x001a:
            android.os.Bundle r5 = X.AnonymousClass002.A08()
            java.lang.String r1 = "has_text_from_url"
            boolean r0 = r7.A0S
            r5.putBoolean(r1, r0)
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r7.A0F
            if (r0 == 0) goto L_0x0030
            int r0 = r0.getVisibility()
            r1 = 1
            if (r0 == 0) goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            java.lang.String r0 = "load_preview"
            r5.putBoolean(r0, r1)
            java.lang.String r1 = "fb_share_wa_redirect"
            boolean r0 = r7.A0V
            r5.putBoolean(r1, r0)
            java.lang.String r1 = "disable_post_send_intent"
            boolean r0 = r7.A0R
            r5.putBoolean(r1, r0)
            java.util.List r1 = r7.A0G
            X.2X0 r0 = r7.A0I
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0070
            java.util.Iterator r1 = r1.iterator()
        L_0x0052:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C135166kE
            if (r0 == 0) goto L_0x0052
            X.5mK r3 = r7.A0J
            r0 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = X.C18280x3.A0S()
            r0 = 0
            r3.A0A(r0, r2, r1)
        L_0x0070:
            X.64v r1 = r7.A0B
            java.util.List r0 = r7.A0G
            r1.BlZ(r5, r6, r0)
            r7.A1K()
            boolean r0 = r7.A0V
            if (r0 == 0) goto L_0x0019
            X.03q r0 = r7.A0Q()
            r0.finish()
            X.03q r1 = r7.A0Q()
            r0 = 17432577(0x10a0001, float:2.53466E-38)
            r1.overridePendingTransition(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.SharedTextPreviewDialogFragment.A01(com.whatsapp.contact.picker.SharedTextPreviewDialogFragment):void");
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean z;
        int i;
        String replaceFirst;
        super.A0K(bundle, layoutInflater, viewGroup);
        this.A05.addView(C86604Kt.A0F(C86634Kw.A0K(this), R.layout.f8nameremoved));
        this.A06 = (SharedTextPreviewScrollView) this.A05.findViewById(R.id.subject_layout);
        this.A0G = (MentionableEntry) this.A05.findViewById(R.id.mentionable_entry);
        this.A00 = this.A05.findViewById(R.id.stub);
        C620733j r0 = this.A01;
        MentionableEntry mentionableEntry = this.A0G;
        if (C102805Ki.A00(r0)) {
            C86604Kt.A1D(mentionableEntry, 2, mentionableEntry.getPaddingTop());
        } else {
            C86624Kv.A0y(mentionableEntry, mentionableEntry.getPaddingLeft(), 2);
        }
        this.A0G.addTextChangedListener(new AnonymousClass52R(this));
        this.A0G.setInputType(131073);
        ImageButton imageButton = (ImageButton) this.A05.findViewById(R.id.emoji_btn);
        this.A01 = imageButton;
        C003203q A0Q2 = A0Q();
        C105895Wv r15 = this.A0L;
        C55682qk r12 = this.A03;
        AnonymousClass5Y0 r9 = this.A0C;
        C27821ej r8 = this.A0B;
        C620633i r7 = this.A0C;
        C620733j r6 = this.A01;
        AnonymousClass5IY r5 = this.A0A;
        EmojiSearchProvider emojiSearchProvider = this.A0D;
        AnonymousClass33p r3 = this.A07;
        C60152y5 r2 = this.A0H;
        AnonymousClass1VX r28 = this.A02;
        C620733j r23 = r6;
        AnonymousClass5IY r24 = r5;
        C620633i r21 = r7;
        AnonymousClass33p r22 = r3;
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) this.A00.findViewById(R.id.emoji_edit_text_layout);
        MentionableEntry mentionableEntry2 = this.A0G;
        ImageButton imageButton2 = imageButton;
        C55682qk r18 = r12;
        C89224c7 r152 = new C89224c7(A0Q2, imageButton2, r18, keyboardPopupLayout, mentionableEntry2, r21, r22, r23, r24, r8, r9, emojiSearchProvider, r28, r2, r15);
        this.A08 = r152;
        EmojiSearchContainer emojiSearchContainer = this.A0D;
        C003203q A0Q3 = A0Q();
        AnonymousClass5Y0 r32 = this.A0C;
        AnonymousClass5S9 r122 = new AnonymousClass5S9(A0Q3, this.A01, r152, this.A0B, r32, emojiSearchContainer, this.A0H);
        AnonymousClass5S9.A00(r122, this, 0);
        C89224c7 r25 = this.A08;
        r25.A0C(this.A0Y);
        r25.A0E = new C70203a7(this, 32, r122);
        String A032 = this.A0E.A03(this.A0Q);
        if (A032 == null || (replaceFirst = this.A0Q.replaceFirst(Pattern.quote(A032), "")) == null || !C86664Kz.A1Y(replaceFirst)) {
            z = true;
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("\n\n");
            this.A0Q = AnonymousClass000.A0X(this.A0Q, A0o);
            z = false;
        }
        A1V();
        this.A0G.setText(C107345b9.A05(A0Q(), this.A0C, this.A0Q));
        A1Y(this.A0G.getText(), true);
        this.A0G.requestFocus();
        Window window = this.A03.getWindow();
        C626936e.A06(window);
        window.setSoftInputMode(5);
        MentionableEntry mentionableEntry3 = this.A0G;
        if (z) {
            i = C86624Kv.A03(mentionableEntry3);
        } else {
            i = 0;
        }
        mentionableEntry3.setSelection(i);
        SharedTextPreviewScrollView sharedTextPreviewScrollView = this.A06;
        sharedTextPreviewScrollView.A00 = new C112825kR(this);
        AnonymousClass6BG.A00(sharedTextPreviewScrollView.getViewTreeObserver(), this, 12);
        this.A06.getViewTreeObserver().addOnScrollChangedListener(new AnonymousClass698(this, 1));
        this.A06.setOverScrollMode(2);
        C18310x6.A17(this.A03, this, 38);
        this.A03.setOnKeyListener(new AnonymousClass6BC(this, 1));
        A1W();
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0 != 0) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1W() {
        /*
            r5 = this;
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r5.A0F
            if (r0 == 0) goto L_0x000d
            int r0 = r0.getVisibility()
            r1 = 2131168227(0x7f070be3, float:1.795075E38)
            if (r0 == 0) goto L_0x0010
        L_0x000d:
            r1 = 2131168228(0x7f070be4, float:1.7950752E38)
        L_0x0010:
            X.03q r0 = r5.A0R()
            int r3 = X.C18320x8.A00(r0, r1)
            com.whatsapp.contact.picker.SharedTextPreviewScrollView r0 = r5.A06
            int r0 = r0.getPaddingBottom()
            if (r0 == r3) goto L_0x0035
            com.whatsapp.contact.picker.SharedTextPreviewScrollView r4 = r5.A06
            int r2 = r4.getPaddingLeft()
            com.whatsapp.contact.picker.SharedTextPreviewScrollView r0 = r5.A06
            int r1 = r0.getPaddingTop()
            com.whatsapp.contact.picker.SharedTextPreviewScrollView r0 = r5.A06
            int r0 = r0.getPaddingRight()
            r4.setPadding(r2, r1, r0, r3)
        L_0x0035:
            r0 = 2
            int[] r2 = new int[r0]
            int[] r1 = new int[r0]
            android.view.View r0 = r5.A00
            r0.getLocationOnScreen(r2)
            android.widget.RelativeLayout r0 = r5.A06
            r0.getLocationOnScreen(r1)
            r0 = 1
            r1 = r1[r0]
            r0 = r2[r0]
            int r1 = r1 - r0
            if (r1 >= r3) goto L_0x0051
            r0 = 0
            int r3 = java.lang.Math.max(r0, r1)
        L_0x0051:
            android.widget.ImageButton r0 = r5.A01
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r2.<init>(r0)
            r2.bottomMargin = r3
            r0 = 9
            r2.addRule(r0)
            r1 = 8
            r0 = 2131434075(0x7f0b1a5b, float:1.8489954E38)
            r2.addRule(r1, r0)
            android.widget.ImageButton r0 = r5.A01
            r0.setLayoutParams(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.SharedTextPreviewDialogFragment.A1W():void");
    }

    public final void A1X() {
        ViewGroup viewGroup;
        if (this.A0F != null && (viewGroup = this.A02) != null && viewGroup.getVisibility() == 0 && !this.A0T) {
            this.A0T = true;
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, C86664Kz.A02(this.A02));
            translateAnimation.setDuration(150);
            C1232467r.A00(translateAnimation, this, 2);
            this.A0F.startAnimation(translateAnimation);
        }
    }

    public final void A1Y(Editable editable, boolean z) {
        String A032 = this.A0E.A03(editable.toString());
        this.A0P = A032;
        if (A032 == null || A032.equals(this.A0O)) {
            A1Z((C66513Ls) null);
            return;
        }
        this.A0O = null;
        C66513Ls r0 = this.A05;
        if (r0 == null || !TextUtils.equals(r0.A0Z, A032)) {
            A1Z(C57782uC.A00(A032));
            if (this.A05 == null) {
                Runnable runnable = this.A0N;
                if (runnable != null) {
                    this.A0X.removeCallbacks(runnable);
                    this.A0N = null;
                }
                if (z) {
                    C69263Wi r2 = this.A08;
                    AnonymousClass4FS r7 = this.A0M;
                    C57772uB.A00(r2, new C66513Ls(this.A04, this.A0E, A032), this.A01, this.A02, new C114645nN(this), r7, A032, false);
                    return;
                }
                C71323bv r3 = new C71323bv(29, A032, this);
                this.A0N = r3;
                this.A0X.postDelayed(r3, 700);
            }
        }
    }

    public void A0k(int i, int i2, Intent intent) {
        super.A0k(i, i2, intent);
        if (i == 27 && i2 == -1) {
            C003203q A0Q2 = A0Q();
            if (A0Q2 != null) {
                this.A02.A0A(A0Q(), C627736r.A02(A0Q2));
                A0Q().finish();
            }
            A1K();
        }
    }

    public boolean A1B(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            if (this.A08.isShowing()) {
                this.A08.dismiss();
            }
            C86654Ky.A0J(this).setSoftInputMode(2);
        }
        return super.A1B(menuItem);
    }

    public Dialog A1J(Bundle bundle) {
        Bundle A0H2 = A0H();
        String string = A0H2.getString("message");
        C626936e.A07(string, "null message");
        this.A0Q = string;
        boolean z = A0H2.getBoolean("has_text_from_url");
        C626936e.A07(Boolean.valueOf(z), "null hasTextFromUrl");
        this.A0S = z;
        this.A0V = A0H2.getBoolean("fb_share_wa_redirect");
        this.A0R = A0H2.getBoolean("disable_post_send_intent");
        this.A0U = AnonymousClass29H.A00(this.A02);
        return super.A1J(bundle);
    }

    public final void A1Z(C66513Ls r10) {
        TranslateAnimation translateAnimation;
        View view;
        C149027Kq r0;
        if (A0Q() != null) {
            if (r10 != null) {
                if (!TextUtils.equals(this.A0P, r10.A0Z)) {
                    return;
                }
                if (r10.A0F()) {
                    this.A05 = r10;
                    if (this.A0F == null) {
                        WebPagePreviewView webPagePreviewView = new WebPagePreviewView(A0R());
                        this.A0F = webPagePreviewView;
                        webPagePreviewView.setForeground((Drawable) null);
                        this.A0F.setMinimumHeight(C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved));
                        this.A0F.setImageContentBackgroundResource(0);
                        this.A0F.setImageContentEnabled(false);
                        this.A02.addView(this.A0F);
                        this.A0F.A02();
                        this.A0F.setImageProgressBarVisibility(false);
                        this.A0F.setImageContentMinimumHeight(C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved));
                        this.A0F.setImageCancelClickListener(new AnonymousClass54F(this, 7));
                        C66513Ls r02 = this.A05;
                        if (!(r02 == null || (r0 = r02.A09) == null)) {
                            String str = r0.A01;
                            if ("video/mp4".equals(str) || "image/gif".equals(str)) {
                                this.A0F.setImageContentEnabled(true);
                            }
                        }
                        this.A0F.setImageContentClickListener(new AnonymousClass54F(this, 8));
                    }
                    A1W();
                    if (!(this.A02.getVisibility() == 0 || this.A0F == null || this.A0T)) {
                        this.A0T = true;
                        int[] iArr = {0, 0};
                        this.A0G.getLocationOnScreen(iArr);
                        int A0C2 = C86664Kz.A0C(this.A0G, iArr[1]);
                        int[] iArr2 = {0, 0};
                        this.A00.findViewById(R.id.recipients_container).getLocationOnScreen(iArr2);
                        int i = iArr2[1];
                        int A0A2 = AnonymousClass001.A0A(A0C2, i);
                        int A092 = C86664Kz.A09(C08310eF.A09(this), R.dimen.f6nameremoved, C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved));
                        if (A0A2 > A092 || (i == 0 && A0C2 == 0)) {
                            A1V();
                            translateAnimation = new TranslateAnimation(0.0f, 0.0f, C86664Kz.A02(this.A02), 0.0f);
                            translateAnimation.setDuration(150);
                            translateAnimation.setDuration(150);
                            this.A02.setVisibility(0);
                            this.A01.setVisibility(0);
                            view = this.A0F;
                        } else {
                            translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (-A092));
                            translateAnimation.setDuration(150);
                            C1232467r.A00(translateAnimation, this, 1);
                            view = this.A06;
                        }
                        view.startAnimation(translateAnimation);
                        this.A0T = false;
                    }
                    this.A0G.requestFocus();
                    WebPagePreviewView webPagePreviewView2 = this.A0F;
                    C626936e.A04(webPagePreviewView2);
                    webPagePreviewView2.A0F(r10, (List) null, false, this.A0K.A01());
                    return;
                }
            }
            this.A05 = null;
            A1X();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C003203q A0Q2 = A0Q();
        if (A0Q2 != null) {
            A0Q2.getWindow().setSoftInputMode(3);
        }
        super.onDismiss(dialogInterface);
    }
}
