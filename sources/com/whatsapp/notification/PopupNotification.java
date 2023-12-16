package com.whatsapp.notification;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass1R1;
import X.AnonymousClass1VX;
import X.AnonymousClass1nE;
import X.AnonymousClass29H;
import X.AnonymousClass2HS;
import X.AnonymousClass2HT;
import X.AnonymousClass2z0;
import X.AnonymousClass314;
import X.AnonymousClass33O;
import X.AnonymousClass33p;
import X.AnonymousClass39M;
import X.AnonymousClass3LP;
import X.AnonymousClass3S3;
import X.AnonymousClass3ZH;
import X.AnonymousClass4CE;
import X.AnonymousClass4FW;
import X.AnonymousClass4L0;
import X.AnonymousClass4SG;
import X.AnonymousClass4VH;
import X.AnonymousClass4ZR;
import X.AnonymousClass57x;
import X.AnonymousClass5CS;
import X.AnonymousClass5DN;
import X.AnonymousClass5IY;
import X.AnonymousClass5QR;
import X.AnonymousClass5RC;
import X.AnonymousClass5S9;
import X.AnonymousClass5ST;
import X.AnonymousClass5TN;
import X.AnonymousClass5UX;
import X.AnonymousClass5UY;
import X.AnonymousClass5V0;
import X.AnonymousClass5V9;
import X.AnonymousClass5Y0;
import X.AnonymousClass5YB;
import X.AnonymousClass5Z4;
import X.AnonymousClass5Z5;
import X.AnonymousClass5ZT;
import X.AnonymousClass5ZU;
import X.AnonymousClass64J;
import X.AnonymousClass681;
import X.AnonymousClass687;
import X.AnonymousClass68H;
import X.AnonymousClass68W;
import X.AnonymousClass68Y;
import X.AnonymousClass694;
import X.AnonymousClass69C;
import X.AnonymousClass6B2;
import X.AnonymousClass6B3;
import X.AnonymousClass6BV;
import X.AnonymousClass6JH;
import X.AnonymousClass75K;
import X.C005205m;
import X.C105365Uq;
import X.C105895Wv;
import X.C106195Xz;
import X.C106405Yw;
import X.C107575bX;
import X.C107635bd;
import X.C108845de;
import X.C109375eW;
import X.C110685gr;
import X.C111095hX;
import X.C113895mA;
import X.C114005mL;
import X.C114015mM;
import X.C116095pj;
import X.C1233167y;
import X.C1235268t;
import X.C124126Bb;
import X.C124166Bf;
import X.C151907Wt;
import X.C181548mw;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C183108pV;
import X.C18310x6;
import X.C18320x8;
import X.C19340zH;
import X.C195219Wq;
import X.C27821ej;
import X.C29241iV;
import X.C29301ib;
import X.C29321id;
import X.C29421in;
import X.C29431io;
import X.C33141sV;
import X.C48202eW;
import X.C50382i5;
import X.C52472lX;
import X.C53202mi;
import X.C53582nK;
import X.C54122oD;
import X.C54232oO;
import X.C54292oU;
import X.C54822pL;
import X.C55602qc;
import X.C55682qk;
import X.C55702qm;
import X.C55732qp;
import X.C56152rV;
import X.C56422rx;
import X.C56602sG;
import X.C56612sH;
import X.C56892sj;
import X.C56962sq;
import X.C56982ss;
import X.C57502tk;
import X.C60152y5;
import X.C60312yL;
import X.C613330g;
import X.C619933b;
import X.C620633i;
import X.C620733j;
import X.C621033m;
import X.C621233o;
import X.C621433s;
import X.C624134x;
import X.C625735q;
import X.C626936e;
import X.C64333Db;
import X.C64773Ex;
import X.C66473Lo;
import X.C66513Ls;
import X.C69183Wa;
import X.C71263bp;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C87684Uw;
import X.C88834as;
import X.C89224c7;
import X.C89654ea;
import X.C91794l6;
import X.C92324mU;
import X.C95814uZ;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.text.InputFilter;
import android.text.method.TextKeyListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.conversation.ConversationEntryActionButton;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class PopupNotification extends C89654ea {
    public float A00;
    public int A01;
    public Sensor A02;
    public SensorEventListener A03;
    public SensorManager A04;
    public PowerManager.WakeLock A05;
    public View.OnClickListener A06;
    public View A07;
    public View A08;
    public View A09;
    public Button A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public C111095hX A0E;
    public C53582nK A0F;
    public AnonymousClass5DN A0G;
    public AnonymousClass4CE A0H;
    public AnonymousClass5Z5 A0I;
    public AnonymousClass5Z4 A0J;
    public C625735q A0K;
    public AnonymousClass64J A0L;
    public AnonymousClass5YB A0M;
    public C50382i5 A0N;
    public C621033m A0O;
    public C56962sq A0P;
    public C29301ib A0Q;
    public AnonymousClass6JH A0R;
    public AnonymousClass5UX A0S;
    public C64773Ex A0T;
    public C29421in A0U;
    public C56422rx A0V;
    public AnonymousClass5ZU A0W;
    public C105365Uq A0X;
    public C114015mM A0Y;
    public C613330g A0Z;
    public AnonymousClass5ST A0a;
    public C54122oD A0b;
    public C92324mU A0c;
    public AnonymousClass314 A0d;
    public AnonymousClass5RC A0e;
    public C113895mA A0f;
    public C114005mL A0g;
    public AnonymousClass4VH A0h;
    public C56612sH A0i;
    public C54292oU A0j;
    public C620733j A0k;
    public C56982ss A0l;
    public C66473Lo A0m;
    public C56892sj A0n;
    public C56152rV A0o;
    public C29431io A0p;
    public AnonymousClass3ZH A0q;
    public AnonymousClass5IY A0r;
    public C27821ej A0s;
    public AnonymousClass5S9 A0t;
    public EmojiSearchProvider A0u;
    public AnonymousClass3LP A0v;
    public C29241iV A0w;
    public C52472lX A0x;
    public C53202mi A0y;
    public C95814uZ A0z;
    public C621233o A10;
    public C106195Xz A11;
    public C619933b A12;
    public AnonymousClass2HT A13;
    public PopupNotificationViewPager A14;
    public C195219Wq A15;
    public C60152y5 A16;
    public C55602qc A17;
    public C48202eW A18;
    public AnonymousClass3S3 A19;
    public C624134x A1A;
    public C57502tk A1B;
    public C151907Wt A1C;
    public C54822pL A1D;
    public C29321id A1E;
    public AnonymousClass1R1 A1F;
    public C55732qp A1G;
    public AnonymousClass33O A1H;
    public C69183Wa A1I;
    public C60312yL A1J;
    public C105895Wv A1K;
    public C33141sV A1L;
    public AnonymousClass5ZT A1M;
    public AnonymousClass5QR A1N;
    public Integer A1O;
    public List A1P;
    public boolean A1Q;
    public boolean A1R;
    public boolean A1S;
    public boolean A1T;
    public final Handler A1U;
    public final Handler A1V;
    public final C54232oO A1W;
    public final C56602sG A1X;
    public final AnonymousClass4FW A1Y;
    public final C55702qm A1Z;
    public final AnonymousClass2HS A1a;
    public final Runnable A1b;
    public final Runnable A1c;
    public final HashSet A1d;
    public final HashSet A1e;
    public final HashSet A1f;

    public final void A6p() {
        AnonymousClass3ZH r5 = this.A0q;
        if (r5 != null) {
            Bitmap A032 = this.A0Z.A03(this, r5, C18310x6.A01(this), C86634Kw.A04(this), true);
            ImageView A0u2 = C86664Kz.A0u(this, R.id.popup_thumb);
            if (A032 == null) {
                AnonymousClass5UX r2 = this.A0S;
                A032 = r2.A03(A0u2.getContext(), r2.A00(this.A0q));
            }
            A0u2.setImageBitmap(A032);
        }
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass57x r0;
        requestWindowFeature(1);
        AnonymousClass001.A0Q(this).setLayoutDirection(3);
        C86634Kw.A13(this, getWindow(), 17170445);
        super.onCreate(bundle);
        boolean A092 = this.A1E.A09();
        int i = R.color.f5nameremoved;
        if (A092) {
            i = R.color.f5nameremoved;
        }
        C18310x6.A0x(this, getWindow(), i);
        SensorManager A0D2 = this.A08.A0D();
        C626936e.A06(A0D2);
        this.A04 = A0D2;
        this.A02 = A0D2.getDefaultSensor(8);
        this.A1R = AnonymousClass29H.A00(this.A0D);
        PowerManager A0J2 = this.A08.A0J();
        if (A0J2 == null) {
            Log.w("popupnotification/create pm=null");
        } else {
            this.A05 = AnonymousClass75K.A00(A0J2, "popupnotification", 268435466);
        }
        setContentView(getLayoutInflater().inflate(R.layout.f8nameremoved, (ViewGroup) null, false));
        this.A14 = (PopupNotificationViewPager) findViewById(R.id.message_view_pager);
        C92324mU r5 = (C92324mU) findViewById(R.id.entry);
        this.A0c = r5;
        r5.setFilters(new InputFilter[]{new AnonymousClass6B3(this, 0)});
        this.A0A = (Button) findViewById(R.id.popup_action_btn);
        this.A0M = this.A0L.Azt(this, C86664Kz.A0z(this, R.id.popup_title));
        this.A0D = C18310x6.A0L(this, R.id.conversation_contact_status);
        this.A0B = C18310x6.A0L(this, R.id.popup_count);
        ImageView A0M2 = C86654Ky.A0M(this, R.id.next_btn);
        C86614Ku.A1B(getResources().getDrawable(R.drawable.selector_media_next), A0M2, this.A0k);
        this.A07 = findViewById(R.id.next_btn_ext);
        ImageView A0M3 = C86654Ky.A0M(this, R.id.prev_btn);
        C86614Ku.A1B(getResources().getDrawable(R.drawable.selector_media_prev), A0M3, this.A0k);
        this.A08 = findViewById(R.id.prev_btn_ext);
        this.A0C = C18310x6.A0L(this, R.id.read_only_chat_info);
        this.A09 = findViewById(R.id.emoji_popup_anchor);
        ConversationEntryActionButton conversationEntryActionButton = (ConversationEntryActionButton) findViewById(R.id.conversation_entry_action_button);
        AnonymousClass5DN r10 = this.A0G;
        AnonymousClass1VX r52 = this.A0D;
        AnonymousClass3ZH r02 = this.A0q;
        if (r02 == null || this.A0y.A01(AnonymousClass3ZH.A01(r02))) {
            r0 = AnonymousClass57x.VOICE_ONLY;
        } else {
            r0 = AnonymousClass57x.NONE;
        }
        AnonymousClass5TN A002 = AnonymousClass5V9.A00(r0, r52);
        C18270x1.A10(r10, 1, A002);
        this.A0h = (AnonymousClass4VH) AnonymousClass4L0.A0F(new C110685gr(r10, A002, (C95814uZ) null, false, false), this).A01(AnonymousClass4VH.class);
        this.A1C = new C151907Wt(this, this.A0h, (C87684Uw) null, this.A0k, AnonymousClass5UY.A01(this, R.id.push_to_record_media_tooltip));
        conversationEntryActionButton.A03(this, new C124126Bb(this, 1), this.A0h);
        AnonymousClass6JH r3 = new AnonymousClass6JH(new AnonymousClass4ZR(this));
        this.A0R = r3;
        this.A14.setAdapter(r3);
        AnonymousClass5CS.A00(this.A14, this, 8);
        this.A14.A0G(new AnonymousClass69C(this, 1));
        C18300x5.A19(findViewById(R.id.popup_ok_btn), this, 45);
        C109375eW r32 = new C109375eW(this, 46);
        this.A06 = r32;
        this.A0A.setOnClickListener(r32);
        C109375eW r33 = new C109375eW(this, 47);
        A0M2.setOnClickListener(r33);
        this.A07.setOnClickListener(r33);
        C109375eW r34 = new C109375eW(this, 48);
        A0M3.setOnClickListener(r34);
        this.A08.setOnClickListener(r34);
        View findViewById = findViewById(R.id.input_layout);
        findViewById.setBackgroundResource(R.drawable.ib_new_round);
        findViewById.setPadding(0, 0, 0, 0);
        View A003 = C005205m.A00(this, R.id.text_entry_layout);
        int max = Math.max(A003.getPaddingLeft(), A003.getPaddingRight());
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) A003.getLayoutParams();
        if (C620733j.A04(this.A0k)) {
            layoutParams.rightMargin = max;
        } else {
            layoutParams.leftMargin = max;
        }
        A003.setLayoutParams(layoutParams);
        C18300x5.A19(this.A0c, this, 49);
        getLayoutInflater().inflate(R.layout.f8nameremoved, C86664Kz.A0m(this, R.id.voice_note_stub), true);
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) findViewById(R.id.root_layout);
        AnonymousClass6BV r35 = new AnonymousClass6BV(this, 1);
        this.A1M = this.A1N.A01(this, keyboardPopupLayout, this.A0h, C86664Kz.A1B(), r35);
        this.A0h.A0G(C107575bX.A0F(this.A0c.getText()));
        this.A0c.addTextChangedListener(new AnonymousClass68H(this, 12));
        this.A0c.setOnEditorActionListener(new AnonymousClass68Y(this, 4));
        AnonymousClass1VX r17 = this.A0D;
        C105895Wv r16 = this.A1K;
        C55682qk r26 = this.A03;
        AnonymousClass5Y0 r15 = this.A0C;
        C27821ej r14 = this.A0s;
        C620633i r13 = this.A08;
        C620733j r11 = this.A0k;
        AnonymousClass5IY r8 = this.A0r;
        EmojiSearchProvider emojiSearchProvider = this.A0u;
        AnonymousClass33p r6 = this.A09;
        C60152y5 r4 = this.A16;
        C105895Wv r25 = r16;
        KeyboardPopupLayout keyboardPopupLayout2 = keyboardPopupLayout;
        C92324mU r152 = this.A0c;
        C620633i r162 = r13;
        C55682qk r132 = r26;
        C89224c7 r102 = new C89224c7(this, (ImageButton) findViewById(R.id.emoji_picker_btn), r132, keyboardPopupLayout2, r152, r162, r6, r11, r8, r14, r15, emojiSearchProvider, r17, r4, r25);
        r102.A0C(this.A0H);
        r102.A0A = new AnonymousClass6B2(this, 0);
        AnonymousClass5Y0 r7 = this.A0C;
        C27821ej r62 = this.A0s;
        AnonymousClass5S9 r103 = new AnonymousClass5S9(this, this.A0k, r102, r62, r7, (EmojiSearchContainer) findViewById(R.id.popup_search_container), this.A16);
        this.A0t = r103;
        AnonymousClass5S9.A00(r103, this, 5);
        if (getIntent().getBooleanExtra("popup_notification_extra_dismiss_notification", false)) {
            this.A12.A0D(false);
            this.A17.A04(true);
        }
        C95814uZ A012 = C106405Yw.A01(getIntent(), "popup_notification_extra_quick_reply_jid");
        C18260x0.A1R(AnonymousClass001.A0o(), "popupnotification/set-quick-reply-jid:", A012);
        this.A0z = A012;
        A6k();
        this.A0p.A06(this.A1Y);
        this.A0U.A06(this.A1X);
        this.A0Q.A06(this.A1W);
        this.A0w.A06(this.A1Z);
        if (this.A0J.A01() > 0) {
            C621433s.A01(this, 115);
        }
        if (this.A0z != null) {
            getWindow().setSoftInputMode(4);
        }
        this.A13.A00 = this.A1a;
    }

    public static /* synthetic */ void A0C(PopupNotification popupNotification) {
        if (!popupNotification.A1P.isEmpty()) {
            popupNotification.A6q(popupNotification.A14.getCurrentItem());
        }
    }

    public void A5r() {
        if (!this.A1Q) {
            this.A1Q = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r1 = A2X.A4Z;
            AnonymousClass4SG.A3X(r1, this, AnonymousClass4SG.A32(r1, this));
            this.A0j = C86614Ku.A0U(r1);
            this.A0i = C86604Kt.A0V(r1);
            this.A0N = (C50382i5) r1.AZG.get();
            this.A1K = (C105895Wv) r1.AHN.get();
            this.A11 = (C106195Xz) r1.AKJ.get();
            this.A0g = (C114005mL) r1.AMg.get();
            this.A0l = C86614Ku.A0X(r1);
            this.A0O = (C621033m) r1.AZL.get();
            this.A0v = r1.Akp();
            this.A0s = C86604Kt.A0X(r1);
            this.A0E = C86634Kw.A0T(r1);
            this.A0Y = C86604Kt.A0S(r1);
            this.A15 = C86644Kx.A0Z(r1);
            this.A0S = C86614Ku.A0Q(r1);
            this.A0T = C86604Kt.A0P(r1);
            this.A0F = (C53582nK) r1.A6W.get();
            this.A1D = (C54822pL) r1.A00.AAD.get();
            this.A1G = (C55732qp) r1.AX0.get();
            this.A0k = C86604Kt.A0W(r1);
            this.A0r = AnonymousClass4SG.A2j(r1);
            this.A0W = C86604Kt.A0R(r1);
            this.A18 = (C48202eW) r1.ANC.get();
            this.A19 = (AnonymousClass3S3) r1.ARB.get();
            this.A1J = (C60312yL) r1.A13.get();
            this.A0P = (C56962sq) r1.A2b.get();
            this.A0a = C86624Kv.A0Q(r1);
            this.A0x = (C52472lX) r1.AXh.get();
            this.A0o = (C56152rV) r1.AIn.get();
            this.A1F = (AnonymousClass1R1) r1.A56.get();
            this.A1B = (C57502tk) r1.A00.A6u.get();
            this.A1L = (C33141sV) r1.AMe.get();
            this.A17 = (C55602qc) r1.ANB.get();
            this.A0y = C86634Kw.A0j(r1);
            this.A0Q = C86634Kw.A0Y(r1);
            this.A0I = (AnonymousClass5Z5) r1.A00.AB0.get();
            this.A0u = AnonymousClass4SG.A2k(r1);
            this.A12 = C86624Kv.A0V(r1);
            this.A1I = (C69183Wa) r1.AYu.get();
            this.A0V = C86644Kx.A0S(r1);
            this.A0d = C86634Kw.A0c(r1);
            this.A10 = (C621233o) r1.AJA.get();
            this.A1H = (AnonymousClass33O) r1.AX1.get();
            this.A0b = (C54122oD) r1.A6t.get();
            this.A1E = (C29321id) r1.AUK.get();
            this.A0n = (C56892sj) r1.AGm.get();
            this.A13 = (AnonymousClass2HT) r1.AR0.get();
            this.A16 = C86614Ku.A0g(r1);
            this.A0J = (AnonymousClass5Z4) r1.AWD.get();
            this.A0K = (C625735q) r1.AYF.get();
            this.A0Z = C86634Kw.A0a(r1);
            this.A0e = (AnonymousClass5RC) r1.A00.A7S.get();
            this.A0f = C86604Kt.A0U(r1);
            this.A0m = C86644Kx.A0U(r1);
            this.A0w = (C29241iV) r1.AGn.get();
            this.A1N = A2X.ADL();
            this.A0L = C86644Kx.A0N(r1);
            this.A0G = (AnonymousClass5DN) A2X.A1I.get();
            this.A0p = C86634Kw.A0g(r1);
            this.A0U = C86604Kt.A0Q(r1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.whatsapp.TextEmojiLabel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.whatsapp.components.button.ThumbnailButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.4n2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.4l6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: android.widget.RelativeLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: android.widget.RelativeLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: android.widget.RelativeLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: android.widget.RelativeLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: android.widget.RelativeLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: com.whatsapp.TextEmojiLabel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: X.4ng} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: X.4nP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: X.4nP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: X.4nP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: X.4nP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: X.4l6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: X.4nP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: X.4l6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: X.4nP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: X.4nP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: X.4nP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: X.4nP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: X.4nP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: X.4nP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: X.4nP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: X.4nP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: X.4nP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: X.4nP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: X.4nP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v49, resolved type: X.4nP} */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x05bd  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0046 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View A6j(X.C624134x r24) {
        /*
            r23 = this;
            r6 = r24
            byte r1 = r6.A1I
            r5 = 0
            r14 = 2
            r4 = 1
            r3 = r23
            if (r1 == 0) goto L_0x0550
            if (r1 == r4) goto L_0x052e
            if (r1 == r14) goto L_0x0503
            r0 = 3
            if (r1 == r0) goto L_0x04b4
            r0 = 4
            if (r1 == r0) goto L_0x0424
            r0 = 5
            if (r1 == r0) goto L_0x033a
            r0 = 7
            if (r1 == r0) goto L_0x0550
            r0 = 9
            if (r1 == r0) goto L_0x029a
            r0 = 20
            if (r1 == r0) goto L_0x027c
            r0 = 37
            if (r1 == r0) goto L_0x052e
            r0 = 23
            if (r1 == r0) goto L_0x052e
            r0 = 24
            if (r1 == r0) goto L_0x0247
            switch(r1) {
                case 13: goto L_0x0107;
                case 14: goto L_0x014f;
                case 15: goto L_0x00c5;
                case 16: goto L_0x019f;
                default: goto L_0x0032;
            }
        L_0x0032:
            switch(r1) {
                case 42: goto L_0x0047;
                case 43: goto L_0x0047;
                case 44: goto L_0x0052;
                default: goto L_0x0035;
            }
        L_0x0035:
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r3)
        L_0x003a:
            boolean r12 = X.C627636p.A0s(r6)
            if (r12 != 0) goto L_0x05bd
            X.34x r0 = r6.A0w()
            if (r0 != 0) goto L_0x05bd
            return r2
        L_0x0047:
            r1 = r6
            X.1mV r1 = (X.C30471mV) r1
            android.view.View$OnClickListener r0 = r3.A06
            X.4ng r2 = new X.4ng
            r2.<init>(r3, r0, r1)
            goto L_0x003a
        L_0x0052:
            r9 = r6
            X.1nD r9 = (X.C30821nD) r9
            android.view.LayoutInflater r1 = r3.getLayoutInflater()
            r0 = 2131624606(0x7f0e029e, float:1.8876396E38)
            r11 = 0
            android.view.View r2 = r1.inflate(r0, r5, r11)
            r0 = 2131434255(0x7f0b1b0f, float:1.8490319E38)
            android.widget.ImageView r8 = X.AnonymousClass0x9.A0F(r2, r0)
            r0 = 2131431521(0x7f0b1061, float:1.8484774E38)
            android.widget.TextView r10 = X.AnonymousClass002.A09(r2, r0)
            r0 = 2131431984(0x7f0b1230, float:1.8485713E38)
            android.widget.TextView r1 = X.AnonymousClass002.A09(r2, r0)
            r0 = 2131431983(0x7f0b122f, float:1.848571E38)
            android.widget.TextView r12 = X.AnonymousClass002.A09(r2, r0)
            X.33j r0 = r3.A0k
            java.lang.String r0 = X.C107315b6.A03(r0, r9)
            r1.setText(r0)
            X.33j r0 = r3.A0k
            java.lang.String r7 = X.C107315b6.A02(r3, r0, r9)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 8
            if (r0 == 0) goto L_0x00be
            r12.setVisibility(r1)
        L_0x0097:
            java.lang.String r0 = r9.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ba
            r10.setVisibility(r11)
            java.lang.String r0 = r9.A06
            r10.setText(r0)
        L_0x00a7:
            X.1sV r7 = r3.A1L
            r1 = 2131232288(0x7f080620, float:1.8080681E38)
            X.5q5 r0 = new X.5q5
            r0.<init>(r8, r7, r1)
            r7.A09(r8, r9, r0)
            android.view.View$OnClickListener r0 = r3.A06
            r2.setOnClickListener(r0)
            goto L_0x003a
        L_0x00ba:
            r10.setVisibility(r1)
            goto L_0x00a7
        L_0x00be:
            r12.setText(r7)
            r12.setVisibility(r11)
            goto L_0x0097
        L_0x00c5:
            com.whatsapp.TextEmojiLabel r2 = new com.whatsapp.TextEmojiLabel
            r2.<init>(r3)
            r0 = 2131432559(0x7f0b146f, float:1.8486879E38)
            r2.setId(r0)
            r0 = 2131893218(0x7f121be2, float:1.9421206E38)
            java.lang.String r8 = r3.getString(r0)
            X.5ST r0 = r3.A0a
            X.AnonymousClass5ST.A00(r3, r2, r0)
            r0 = 17
            r2.setGravity(r0)
            r1 = 2130970371(0x7f040703, float:1.754945E38)
            r0 = 2131102225(0x7f060a11, float:1.7816882E38)
            X.AnonymousClass5Yj.A0B(r3, r2, r1, r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165636(0x7f0701c4, float:1.7945495E38)
            int r7 = r1.getDimensionPixelSize(r0)
            int r1 = X.C18320x8.A00(r3, r0)
            r0 = 0
            r2.setPadding(r7, r0, r1, r0)
            r2.A0J(r8, r5, r0, r4)
            X.1VX r0 = r3.A0D
            X.AnonymousClass0x2.A14(r0, r2)
            goto L_0x003a
        L_0x0107:
            r8 = r6
            X.1mV r8 = (X.C30471mV) r8
            X.4l6 r2 = new X.4l6
            r2.<init>(r3)
            r0 = 2131432556(0x7f0b146c, float:1.8486873E38)
            r2.setId(r0)
            r3.A6r(r2)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131233077(0x7f080935, float:1.8082281E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.A08 = r0
            X.1sV r7 = r3.A1L
            r10 = 0
            r1 = 2131233104(0x7f080950, float:1.8082336E38)
            X.5q5 r0 = new X.5q5
            r0.<init>(r2, r7, r1)
            r7.A0A(r2, r8, r0)
            int r0 = r8.A0B     // Catch:{ IllegalArgumentException -> 0x04fc }
            if (r0 == 0) goto L_0x013f
            X.33j r0 = r3.A0k     // Catch:{ IllegalArgumentException -> 0x04fc }
            java.lang.String r10 = X.C107565bW.A0G(r0, r8)     // Catch:{ IllegalArgumentException -> 0x04fc }
            goto L_0x04ea
        L_0x013f:
            long r0 = r8.A00     // Catch:{ IllegalArgumentException -> 0x04fc }
            r8 = 0
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x04ea
            X.33j r7 = r3.A0k     // Catch:{ IllegalArgumentException -> 0x04fc }
            java.lang.String r10 = X.AnonymousClass35V.A03(r7, r0)     // Catch:{ IllegalArgumentException -> 0x04fc }
            goto L_0x04ea
        L_0x014f:
            r1 = r6
            X.1mP r1 = (X.C30411mP) r1
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r3)
            X.33j r0 = r3.A0k
            java.lang.String r0 = X.C33061sN.A01(r0, r1)
            r8.setText(r0)
            X.5ST r0 = r3.A0a
            X.AnonymousClass5ST.A00(r3, r8, r0)
            r7 = 17
            r8.setGravity(r7)
            r1 = 2130970371(0x7f040703, float:1.754945E38)
            r0 = 2131102225(0x7f060a11, float:1.7816882E38)
            X.AnonymousClass5Yj.A0B(r3, r8, r1, r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131233636(0x7f080b64, float:1.8083415E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r8.setCompoundDrawablesWithIntrinsicBounds(r0, r5, r5, r5)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131166723(0x7f070603, float:1.79477E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r8.setCompoundDrawablePadding(r0)
            r8.setPadding(r0, r0, r0, r0)
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r3)
            r2.setGravity(r7)
            r2.addView(r8)
            goto L_0x003a
        L_0x019f:
            r8 = r6
            X.1n8 r8 = (X.C30801n8) r8
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r3)
            r0 = 17
            r2.setGravity(r0)
            android.view.LayoutInflater r1 = r3.getLayoutInflater()
            r0 = 2131624587(0x7f0e028b, float:1.8876358E38)
            android.view.View r9 = r1.inflate(r0, r2, r4)
            r0 = 2131431057(0x7f0b0e91, float:1.8483832E38)
            android.widget.TextView r1 = X.AnonymousClass002.A09(r9, r0)
            java.lang.String r0 = r8.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r15 = 8
            if (r0 != 0) goto L_0x0243
            java.lang.String r0 = r8.A03
            r1.setText(r0)
        L_0x01cd:
            r0 = 2131431060(0x7f0b0e94, float:1.8483839E38)
            android.view.View r12 = r9.findViewById(r0)
            r0 = 2131431061(0x7f0b0e95, float:1.848384E38)
            android.view.View r11 = r9.findViewById(r0)
            r0 = 2131431062(0x7f0b0e96, float:1.8483843E38)
            android.view.View r7 = r9.findViewById(r0)
            r0 = 2131431065(0x7f0b0e99, float:1.8483849E38)
            android.widget.TextView r10 = X.AnonymousClass002.A09(r9, r0)
            X.2sH r0 = r3.A0i
            long r17 = r0.A0H()
            X.33o r0 = r3.A10
            long r0 = r0.A05(r8)
            r13 = 0
            int r16 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r16 <= 0) goto L_0x022f
            X.C86624Kv.A14(r12, r11, r7, r13)
            android.content.res.Resources r11 = r3.getResources()
            r7 = 2131100211(0x7f060233, float:1.7812797E38)
            X.C18320x8.A11(r11, r10, r7)
            r12 = 2131890515(0x7f121153, float:1.9415724E38)
            java.lang.Object[] r11 = new java.lang.Object[r4]
            X.33j r7 = r3.A0k
            java.lang.String r0 = X.C107145am.A00(r7, r0)
            r11[r13] = r0
            X.AnonymousClass001.A0y(r3, r10, r11, r12)
        L_0x0217:
            r0 = 2131434255(0x7f0b1b0f, float:1.8490319E38)
            android.view.View r7 = r9.findViewById(r0)
            com.whatsapp.components.button.ThumbnailButton r7 = (com.whatsapp.components.button.ThumbnailButton) r7
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131166723(0x7f070603, float:1.79477E38)
            X.C86614Ku.A15(r1, r7, r0)
            X.AnonymousClass4SG.A3j(r7, r3, r8)
            goto L_0x003a
        L_0x022f:
            X.C86624Kv.A14(r12, r11, r7, r15)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131101352(0x7f0606a8, float:1.7815111E38)
            X.C18320x8.A11(r1, r10, r0)
            r0 = 2131890527(0x7f12115f, float:1.9415748E38)
            r10.setText(r0)
            goto L_0x0217
        L_0x0243:
            r1.setVisibility(r15)
            goto L_0x01cd
        L_0x0247:
            r9 = r6
            X.1mN r9 = (X.C30391mN) r9
            android.view.LayoutInflater r1 = r3.getLayoutInflater()
            r0 = 2131624569(0x7f0e0279, float:1.8876321E38)
            android.view.View r2 = X.AnonymousClass001.A0R(r1, r5, r0)
            r0 = 2131430471(0x7f0b0c47, float:1.8482644E38)
            android.widget.TextView r1 = X.AnonymousClass002.A09(r2, r0)
            r0 = 2131427806(0x7f0b01de, float:1.8477239E38)
            android.widget.ImageView r8 = X.AnonymousClass0x9.A0F(r2, r0)
            java.lang.String r0 = r9.A05
            r1.setText(r0)
            X.1sV r7 = r3.A1L
            r1 = 2131231013(0x7f080125, float:1.8078095E38)
            X.5q5 r0 = new X.5q5
            r0.<init>(r8, r7, r1)
            r7.A09(r8, r9, r0)
            android.view.View$OnClickListener r0 = r3.A06
            r2.setOnClickListener(r0)
            goto L_0x003a
        L_0x027c:
            r7 = r6
            X.1nE r7 = (X.AnonymousClass1nE) r7
            android.view.LayoutInflater r1 = r3.getLayoutInflater()
            r0 = 2131624642(0x7f0e02c2, float:1.887647E38)
            android.view.View r2 = X.AnonymousClass001.A0R(r1, r5, r0)
            r0 = 2131432566(0x7f0b1476, float:1.8486893E38)
            android.view.View r0 = r2.findViewById(r0)
            com.whatsapp.stickers.StickerView r0 = (com.whatsapp.stickers.StickerView) r0
            if (r0 == 0) goto L_0x003a
            r3.A6s(r7, r0)
            goto L_0x003a
        L_0x029a:
            r10 = r6
            X.1nF r10 = (X.AnonymousClass1nF) r10
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r3)
            r0 = 2131432555(0x7f0b146b, float:1.848687E38)
            r2.setId(r0)
            r0 = 17
            r2.setGravity(r0)
            android.view.LayoutInflater r1 = r3.getLayoutInflater()
            r0 = 2131624555(0x7f0e026b, float:1.8876293E38)
            android.view.View r7 = r1.inflate(r0, r2, r4)
            r0 = 2131430651(0x7f0b0cfb, float:1.848301E38)
            android.widget.ImageView r11 = X.AnonymousClass0x9.A0F(r7, r0)
            android.widget.TextView r8 = X.C86614Ku.A0I(r7)
            r0 = 2131430719(0x7f0b0d3f, float:1.8483147E38)
            android.widget.TextView r9 = X.AnonymousClass002.A09(r7, r0)
            r0 = 2131428228(0x7f0b0384, float:1.8478095E38)
            android.view.View r12 = r7.findViewById(r0)
            r0 = 2131430118(0x7f0b0ae6, float:1.8481928E38)
            android.widget.TextView r13 = X.AnonymousClass002.A09(r7, r0)
            r0 = 2131428226(0x7f0b0382, float:1.847809E38)
            android.view.View r1 = r7.findViewById(r0)
            r0 = 2131430119(0x7f0b0ae7, float:1.848193E38)
            android.widget.TextView r7 = X.AnonymousClass002.A09(r7, r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass5VP.A00(r3, r10)
            r11.setImageDrawable(r0)
            boolean r0 = X.C86614Ku.A1Z(r10)
            if (r0 == 0) goto L_0x0332
            r0 = 2131894643(0x7f122173, float:1.9424097E38)
            r8.setText(r0)
        L_0x02f9:
            r11 = 0
            r13.setVisibility(r11)
            r1.setVisibility(r11)
            X.33j r8 = r3.A0k
            long r0 = r10.A00
            X.C86634Kw.A1J(r13, r8, r0)
            int r0 = r10.A00
            if (r0 == 0) goto L_0x032e
            r9.setVisibility(r11)
            r12.setVisibility(r11)
            X.33j r0 = r3.A0k
            java.lang.String r0 = X.C107105ah.A01(r0, r10)
            r9.setText(r0)
        L_0x031a:
            java.lang.String r0 = r10.A05
            java.lang.String r0 = X.C106695a0.A02(r0)
            java.lang.String r0 = X.C86664Kz.A1L(r0)
            r7.setText(r0)
            android.view.View$OnClickListener r0 = r3.A06
            r2.setOnClickListener(r0)
            goto L_0x003a
        L_0x032e:
            X.C86624Kv.A12(r9, r12)
            goto L_0x031a
        L_0x0332:
            java.lang.String r0 = r10.A1w()
            r8.setText(r0)
            goto L_0x02f9
        L_0x033a:
            r13 = r6
            X.1n9 r13 = (X.AnonymousClass1n9) r13
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r3)
            r0 = 2131432558(0x7f0b146e, float:1.8486877E38)
            r2.setId(r0)
            r0 = 17
            r2.setGravity(r0)
            android.view.LayoutInflater r1 = r3.getLayoutInflater()
            r0 = 2131624594(0x7f0e0292, float:1.8876372E38)
            android.view.View r12 = r1.inflate(r0, r2, r4)
            r0 = 2131432465(0x7f0b1411, float:1.8486688E38)
            android.widget.TextView r11 = X.AnonymousClass002.A09(r12, r0)
            r0 = 2131432464(0x7f0b1410, float:1.8486686E38)
            android.widget.TextView r10 = X.AnonymousClass002.A09(r12, r0)
            java.lang.String r0 = r13.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r9 = 8
            if (r0 == 0) goto L_0x038e
            r11.setVisibility(r9)
            r10.setVisibility(r9)
        L_0x0376:
            r0 = 2131434255(0x7f0b1b0f, float:1.8490319E38)
            android.view.View r7 = r12.findViewById(r0)
            com.whatsapp.components.button.ThumbnailButton r7 = (com.whatsapp.components.button.ThumbnailButton) r7
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131166723(0x7f070603, float:1.79477E38)
            X.C86614Ku.A15(r1, r7, r0)
            X.AnonymousClass4SG.A3j(r7, r3, r13)
            goto L_0x003a
        L_0x038e:
            r8 = 0
            r11.setVisibility(r8)
            java.lang.String r0 = r13.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0421
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "https://maps.google.com/maps?q="
            r7.append(r0)
            java.lang.String r15 = r13.A1y()
            java.lang.String r1 = "\\s+"
            java.lang.String r0 = "+"
            java.lang.String r0 = r15.replaceAll(r1, r0)
            java.lang.String r0 = android.net.Uri.encode(r0)
            r7.append(r0)
            java.lang.String r0 = "&sll="
            r7.append(r0)
            double r0 = r13.A00
            r7.append(r0)
            java.lang.String r0 = ","
            r7.append(r0)
            double r0 = r13.A01
            r7.append(r0)
            java.lang.String r7 = r7.toString()
        L_0x03ce:
            r11.setAutoLinkMask(r8)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "<a href=\""
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "\">"
            java.lang.StringBuilder r15 = X.C18290x4.A0w(r0, r1)
            java.lang.String r0 = r13.A01
            r15.append(r0)
            java.lang.String r0 = ""
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r15)
            java.lang.String r0 = android.text.Html.escapeHtml(r0)
            r1.append(r0)
            java.lang.String r0 = "</a>"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.C18280x3.A1E(r0, r11)
            java.lang.String r0 = r13.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x041d
            r10.setVisibility(r8)
            java.lang.String r0 = r13.A00
            r10.setText(r0)
        L_0x040e:
            r1 = 9
            X.5ee r0 = new X.5ee
            r0.<init>(r1, r7, r3)
            r11.setOnClickListener(r0)
            r10.setOnClickListener(r0)
            goto L_0x0376
        L_0x041d:
            r10.setVisibility(r9)
            goto L_0x040e
        L_0x0421:
            java.lang.String r7 = r13.A02
            goto L_0x03ce
        L_0x0424:
            r11 = r6
            X.1mQ r11 = (X.C30421mQ) r11
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r3)
            java.lang.String r1 = r11.A00
            r0 = 128(0x80, float:1.794E-43)
            java.lang.String r0 = X.C107575bX.A0C(r1, r0)
            r8.setText(r0)
            X.5ST r0 = r3.A0a
            X.AnonymousClass5ST.A00(r3, r8, r0)
            r7 = 17
            r8.setGravity(r7)
            r1 = 2130970371(0x7f040703, float:1.754945E38)
            r0 = 2131102225(0x7f060a11, float:1.7816882E38)
            X.AnonymousClass5Yj.A0B(r3, r8, r1, r0)
            X.2oU r10 = r3.A0j
            X.3Ex r9 = r3.A0T
            X.33i r2 = r3.A08
            X.33j r1 = r3.A0k
            X.5Y4 r0 = new X.5Y4
            r0.<init>(r9, r2, r10, r1)
            X.2Mn r0 = r0.A03(r11)
            if (r0 == 0) goto L_0x04b2
            X.5a1 r0 = r0.A01
            byte[] r2 = r0.A0B
            if (r2 == 0) goto L_0x04b2
            r1 = 0
            int r0 = r2.length
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeByteArray(r2, r1, r0)
        L_0x0469:
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131233636(0x7f080b64, float:1.8083415E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            if (r9 == 0) goto L_0x04ae
            int r2 = r0.getIntrinsicWidth()
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131168433(0x7f070cb1, float:1.7951168E38)
            float r0 = r1.getDimension(r0)
            android.graphics.Bitmap r0 = X.C107655bf.A0H(r9, r0, r2)
            android.graphics.drawable.BitmapDrawable r0 = X.C86654Ky.A0E(r3, r0)
            r8.setCompoundDrawablesWithIntrinsicBounds(r0, r5, r5, r5)
        L_0x0490:
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131166723(0x7f070603, float:1.79477E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r8.setCompoundDrawablePadding(r0)
            r8.setPadding(r0, r0, r0, r0)
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r3)
            r2.setGravity(r7)
            r2.addView(r8)
            goto L_0x003a
        L_0x04ae:
            r8.setCompoundDrawablesWithIntrinsicBounds(r0, r5, r5, r5)
            goto L_0x0490
        L_0x04b2:
            r9 = r5
            goto L_0x0469
        L_0x04b4:
            r8 = r6
            X.1mV r8 = (X.C30471mV) r8
            X.4l6 r2 = new X.4l6
            r2.<init>(r3)
            r0 = 2131432560(0x7f0b1470, float:1.848688E38)
            r2.setId(r0)
            r3.A6r(r2)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131233079(0x7f080937, float:1.8082285E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.A08 = r0
            X.1sV r7 = r3.A1L
            r10 = 0
            r1 = 2131233104(0x7f080950, float:1.8082336E38)
            X.5q5 r0 = new X.5q5
            r0.<init>(r2, r7, r1)
            r7.A0A(r2, r8, r0)
            int r0 = r8.A0B     // Catch:{ IllegalArgumentException -> 0x04fc }
            if (r0 == 0) goto L_0x04ed
            X.33j r0 = r3.A0k     // Catch:{ IllegalArgumentException -> 0x04fc }
            java.lang.String r10 = X.C107565bW.A0G(r0, r8)     // Catch:{ IllegalArgumentException -> 0x04fc }
        L_0x04ea:
            r2.A0A = r10     // Catch:{ IllegalArgumentException -> 0x04fc }
            goto L_0x04fc
        L_0x04ed:
            long r0 = r8.A00     // Catch:{ IllegalArgumentException -> 0x04fc }
            r8 = 0
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x04ea
            X.33j r7 = r3.A0k     // Catch:{ IllegalArgumentException -> 0x04fc }
            java.lang.String r10 = X.AnonymousClass35V.A03(r7, r0)     // Catch:{ IllegalArgumentException -> 0x04fc }
            goto L_0x04ea
        L_0x04fc:
            android.view.View$OnClickListener r0 = r3.A06
            r2.setOnClickListener(r0)
            goto L_0x003a
        L_0x0503:
            r7 = r6
            X.1mu r7 = (X.C30721mu) r7
            int r0 = r7.A09
            if (r0 != r4) goto L_0x0527
            X.5Uq r1 = r3.A0X
            if (r1 != 0) goto L_0x0518
            X.5mM r1 = r3.A0Y
            java.lang.String r0 = "popup-notification"
            X.5Uq r1 = r1.A06(r3, r0)
            r3.A0X = r1
        L_0x0518:
            X.5mA r0 = r3.A0f
            X.4nP r2 = new X.4nP
            r12 = r3
            r8 = r2
            r9 = r3
            r10 = r1
            r11 = r0
            r13 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x003a
        L_0x0527:
            X.4n2 r2 = new X.4n2
            r2.<init>(r3, r3, r7)
            goto L_0x003a
        L_0x052e:
            com.whatsapp.components.button.ThumbnailButton r2 = new com.whatsapp.components.button.ThumbnailButton
            r2.<init>(r3)
            r0 = 2131432557(0x7f0b146d, float:1.8486875E38)
            r2.setId(r0)
            r3.A6r(r2)
            X.1sV r7 = r3.A1L
            r1 = 2131233098(0x7f08094a, float:1.8082324E38)
            X.5q5 r0 = new X.5q5
            r0.<init>(r2, r7, r1)
            r7.A0A(r2, r6, r0)
            android.view.View$OnClickListener r0 = r3.A06
            r2.setOnClickListener(r0)
            goto L_0x003a
        L_0x0550:
            com.whatsapp.TextEmojiLabel r2 = new com.whatsapp.TextEmojiLabel
            r2.<init>(r3)
            r0 = 2131432561(0x7f0b1471, float:1.8486883E38)
            r2.setId(r0)
            X.34w r0 = r6.A0P
            r7 = 0
            if (r0 == 0) goto L_0x05aa
            X.9Wq r0 = r3.A15
            java.lang.String r8 = r0.A0e(r6, r4)
        L_0x0566:
            boolean r0 = r6.A1m()
            if (r0 == 0) goto L_0x057b
            android.text.SpannableStringBuilder r8 = X.C18330xA.A00(r8)
            X.5Xz r9 = r3.A11
            X.2z0 r0 = r6.A1J
            X.4uZ r1 = r0.A00
            java.util.List r0 = r6.A18
            r9.A05(r3, r8, r1, r0)
        L_0x057b:
            X.5ST r0 = r3.A0a
            X.AnonymousClass5ST.A00(r3, r2, r0)
            r0 = 17
            r2.setGravity(r0)
            r1 = 2130970371(0x7f040703, float:1.754945E38)
            r0 = 2131102225(0x7f060a11, float:1.7816882E38)
            X.AnonymousClass5Yj.A0B(r3, r2, r1, r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165636(0x7f0701c4, float:1.7945495E38)
            int r1 = r1.getDimensionPixelSize(r0)
            int r0 = X.C18320x8.A00(r3, r0)
            r2.setPadding(r1, r7, r0, r7)
            r2.A0J(r8, r5, r7, r4)
            X.1VX r0 = r3.A0D
            X.AnonymousClass0x2.A14(r0, r2)
            goto L_0x003a
        L_0x05aa:
            boolean r0 = r6 instanceof X.C30341mI
            if (r0 == 0) goto L_0x05b8
            X.35q r1 = r3.A0K
            r0 = r6
            X.1mI r0 = (X.C30341mI) r0
            java.lang.String r8 = r1.A0O(r0, r7)
            goto L_0x0566
        L_0x05b8:
            java.lang.String r8 = r6.A13()
            goto L_0x0566
        L_0x05bd:
            android.view.LayoutInflater r1 = r3.getLayoutInflater()
            r0 = 2131625870(0x7f0e078e, float:1.887896E38)
            r9 = 0
            android.view.View r10 = r1.inflate(r0, r5, r9)
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r0 = 2131432815(0x7f0b156f, float:1.8487398E38)
            android.widget.FrameLayout r8 = X.C86664Kz.A0s(r10, r0)
            X.34x r0 = r6.A0w()
            if (r0 == 0) goto L_0x06da
            r8.setVisibility(r9)
            android.graphics.drawable.Drawable r0 = X.C106205Ya.A00(r3)
            r8.setForeground(r0)
            r0 = 2131432827(0x7f0b157b, float:1.8487422E38)
            android.widget.TextView r11 = X.AnonymousClass002.A09(r8, r0)
            r0 = 2131432813(0x7f0b156d, float:1.8487394E38)
            android.widget.TextView r7 = X.AnonymousClass002.A09(r8, r0)
            r0 = 2131432824(0x7f0b1578, float:1.8487416E38)
            android.widget.TextView r5 = X.AnonymousClass002.A09(r8, r0)
            X.5ST r1 = r3.A0a
            android.content.res.Resources r0 = r3.getResources()
            float r0 = r1.A02(r0)
            X.C106905aM.A05(r11, r7, r5, r0)
            X.2pL r0 = r3.A1D
            boolean r0 = r0.A03(r6)
            if (r0 == 0) goto L_0x06af
            X.2pL r0 = r3.A1D
            r0.A00(r8, r6)
        L_0x0611:
            if (r12 == 0) goto L_0x06a7
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131166132(0x7f0703b4, float:1.79465E38)
            int r13 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131166131(0x7f0703b3, float:1.7946499E38)
            int r12 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131166133(0x7f0703b5, float:1.7946503E38)
            int r11 = r1.getDimensionPixelSize(r0)
            r0 = -1
            r8 = -2
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r0, r8)
            r0 = 3
            r7.gravity = r0
            android.content.Context r0 = r3.getApplicationContext()
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r6.<init>(r0)
            r6.setOrientation(r9)
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r1 = X.C58152un.A09
            r5.append(r1)
            r0 = 2131889443(0x7f120d23, float:1.941355E38)
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r1, r5)
            com.whatsapp.TextEmojiLabel r5 = new com.whatsapp.TextEmojiLabel
            r5.<init>(r3)
            r5.setText(r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131102573(0x7f060b6d, float:1.7817588E38)
            X.C18320x8.A11(r1, r5, r0)
            android.graphics.Typeface r0 = r5.getTypeface()
            r5.setTypeface(r0, r14)
            r5.setSingleLine()
            r5.setLines(r4)
            X.5ST r1 = r3.A0a
            android.content.res.Resources r0 = r3.getResources()
            float r0 = r1.A02(r0)
            r5.setTextSize(r0)
            X.C86664Kz.A1S(r5)
            r5.setCompoundDrawablePadding(r12)
            r6.setPadding(r13, r11, r13, r9)
            r6.addView(r5, r8, r8)
            r10.addView(r6, r9, r7)
            X.33j r0 = r3.A0k
            boolean r1 = X.C102805Ki.A00(r0)
            r0 = 2131232246(0x7f0805f6, float:1.8080596E38)
            if (r1 == 0) goto L_0x06ab
            r5.setCompoundDrawablesWithIntrinsicBounds(r9, r9, r0, r9)
        L_0x06a7:
            r10.addView(r2)
            return r10
        L_0x06ab:
            r5.setCompoundDrawablesWithIntrinsicBounds(r0, r9, r9, r9)
            goto L_0x06a7
        L_0x06af:
            X.5mL r15 = r3.A0g
            X.2z0 r0 = r6.A1J
            X.4uZ r7 = r0.A00
            X.34x r19 = r6.A0w()
            X.33O r5 = r3.A1H
            X.5Uq r0 = r3.A0X
            if (r0 != 0) goto L_0x06c9
            X.5mM r1 = r3.A0Y
            java.lang.String r0 = "popup-notification"
            X.5Uq r0 = r1.A06(r3, r0)
            r3.A0X = r0
        L_0x06c9:
            r22 = r9
            r20 = r5
            r21 = r9
            r16 = r8
            r17 = r0
            r18 = r7
            r15.A0H(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0611
        L_0x06da:
            r0 = 8
            r8.setVisibility(r0)
            goto L_0x0611
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.A6j(X.34x):android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (A6t() != false) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A6k() {
        /*
            r13 = this;
            java.lang.String r0 = "popupnotification/initpopup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4 = 0
            r13.A1T = r4
            r0 = 0
            r13.A1O = r0
            com.whatsapp.notification.PopupNotificationViewPager r0 = r13.A14
            int r0 = r0.getCurrentItem()
            r3 = 1
            if (r0 != 0) goto L_0x001b
            boolean r0 = r13.A6t()
            r12 = 1
            if (r0 == 0) goto L_0x001c
        L_0x001b:
            r12 = 0
        L_0x001c:
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            r13.A01 = r4
            X.314 r0 = r13.A0d
            java.util.List r0 = r0.A05()
            java.util.Iterator r11 = r0.iterator()
        L_0x002c:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0090
            X.4uZ r9 = X.C18300x5.A0P(r11)
            X.2ss r0 = r13.A0l
            int r1 = r0.A03(r9)
            if (r1 <= 0) goto L_0x002c
            X.1R1 r0 = r13.A1F
            X.2sa r10 = X.AnonymousClass1R1.A00(r9, r0)
            X.4uZ r0 = r13.A0z
            if (r0 == 0) goto L_0x004e
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0067
        L_0x004e:
            long r7 = r10.A00()
            r5 = 0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = r10.A06()
            int r0 = java.lang.Integer.parseInt(r0)
            if (r0 != 0) goto L_0x0067
            goto L_0x002c
        L_0x0067:
            X.2rV r0 = r13.A0o
            java.util.ArrayList r0 = r0.A03(r9, r1)
            java.util.Iterator r6 = r0.iterator()
        L_0x0071:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0089
            X.34x r5 = X.C18300x5.A0T(r6)
            java.util.HashSet r1 = r13.A1e
            X.2z0 r0 = r5.A1J
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0071
            r2.add(r5)
            goto L_0x0071
        L_0x0089:
            int r0 = r13.A01
            int r0 = r0 + 1
            r13.A01 = r0
            goto L_0x002c
        L_0x0090:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "popupnotification/count:"
            r1.append(r0)
            int r0 = r2.size()
            X.C18260x0.A1G(r1, r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x00aa
            r13.finish()
        L_0x00a9:
            return
        L_0x00aa:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x01a4
            r13.A6l()
        L_0x00b3:
            r0 = 7
            X.AnonymousClass6A6.A00(r2, r0)
            r13.A1P = r2
            X.6JH r0 = r13.A0R
            r0.A05()
            com.whatsapp.notification.PopupNotificationViewPager r1 = r13.A14
            X.6JH r0 = r13.A0R
            r1.setAdapter(r0)
            X.34x r0 = r13.A1A
            if (r0 == 0) goto L_0x019a
            if (r12 == 0) goto L_0x016b
            boolean r0 = r13.A1S
            if (r0 == 0) goto L_0x019a
            com.whatsapp.notification.PopupNotificationViewPager r0 = r13.A14
            r0.A0O(r3, r4, r3)
            r13.A6q(r3)
            java.util.List r0 = r13.A1P
            int r0 = r0.size()
            if (r3 < r0) goto L_0x0168
            java.util.List r0 = r13.A1P
            int r0 = r0.size()
            int r0 = -r0
        L_0x00e6:
            com.whatsapp.notification.PopupNotificationViewPager r2 = r13.A14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2.A01 = r1
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x00fe
            if (r1 == 0) goto L_0x00fe
            int r0 = r1.intValue()
            r2.A0F(r0, r3)
            r0 = 0
            r2.A01 = r0
        L_0x00fe:
            r0 = 2130772025(0x7f010039, float:1.7147157E38)
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r13, r0)
            r5 = 2
            r0 = 2
            if (r12 == 0) goto L_0x010a
            r0 = 1
        L_0x010a:
            int r0 = r0 * 200
            long r0 = (long) r0
            r2.setDuration(r0)
            r2.setFillAfter(r3)
            android.widget.TextView r0 = r13.A0B
            r0.startAnimation(r2)
            java.util.List r0 = r13.A1P
            X.34x r0 = X.C18320x8.A0R(r0, r4)
            X.1R1 r1 = r13.A1F
            X.4uZ r0 = X.AnonymousClass2z0.A00(r0)
            X.2sa r0 = X.AnonymousClass1R1.A00(r0, r1)
            java.lang.String r0 = r0.A06()
            int r1 = java.lang.Integer.parseInt(r0)
            if (r1 == r5) goto L_0x0135
            r0 = 3
            if (r1 != r0) goto L_0x00a9
        L_0x0135:
            android.view.Window r1 = r13.getWindow()
            r0 = 524288(0x80000, float:7.34684E-40)
            r1.addFlags(r0)
            java.lang.String r0 = "popupnotification/wakeupifneeded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1084227584(0x40a00000, float:5.0)
            r13.A00 = r0
            android.os.Handler r3 = r13.A1V
            java.lang.Runnable r2 = r13.A1c
            r3.removeCallbacks(r2)
            r0 = 600(0x258, double:2.964E-321)
            r3.postDelayed(r2, r0)
            android.hardware.SensorEventListener r0 = r13.A03
            if (r0 != 0) goto L_0x00a9
            android.hardware.Sensor r2 = r13.A02
            if (r2 == 0) goto L_0x00a9
            X.6AU r1 = new X.6AU
            r1.<init>(r13, r5)
            r13.A03 = r1
            android.hardware.SensorManager r0 = r13.A04
            r0.registerListener(r1, r2, r4)
            return
        L_0x0168:
            r0 = 0
            goto L_0x00e6
        L_0x016b:
            java.util.List r0 = r13.A1P
            java.util.Iterator r5 = r0.iterator()
            r2 = 0
        L_0x0172:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0187
            X.2z0 r1 = X.C86614Ku.A0h(r5)
            X.34x r0 = r13.A1A
            boolean r0 = X.C86664Kz.A1X(r0, r1)
            if (r0 != 0) goto L_0x0187
            int r2 = r2 + 1
            goto L_0x0172
        L_0x0187:
            java.util.List r0 = r13.A1P
            int r0 = r0.size()
            if (r2 != r0) goto L_0x0190
            r2 = 0
        L_0x0190:
            com.whatsapp.notification.PopupNotificationViewPager r0 = r13.A14
            r0.A0F(r2, r4)
            r13.A6q(r2)
            goto L_0x00fe
        L_0x019a:
            com.whatsapp.notification.PopupNotificationViewPager r0 = r13.A14
            r0.A0F(r4, r4)
            r13.A6q(r4)
            goto L_0x00fe
        L_0x01a4:
            r0 = 2131431672(0x7f0b10f8, float:1.848508E38)
            X.C18280x3.A0r(r13, r0, r4)
            r0 = 2131431670(0x7f0b10f6, float:1.8485076E38)
            X.C18280x3.A0r(r13, r0, r4)
            android.view.View r0 = r13.A07
            r0.setVisibility(r4)
            android.view.View r0 = r13.A08
            r0.setVisibility(r4)
            goto L_0x00b3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.A6k():void");
    }

    public final void A6m() {
        Class<C95814uZ> cls = C95814uZ.class;
        this.A0b.A00((C95814uZ) this.A0q.A0I(cls), 2, true, true);
        InputMethodManager A0Q2 = this.A08.A0Q();
        if (A0Q2 != null && A0Q2.isFullscreenMode()) {
            C86644Kx.A14(this.A0c, A0Q2);
        }
        int currentItem = this.A14.getCurrentItem();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("popupnotification/moveToNextMessageOrExit/ message_pos:");
        A0o2.append(currentItem);
        A0o2.append(" messages.size:");
        C18260x0.A1G(A0o2, this.A1P.size());
        this.A1e.add(C18320x8.A0R(this.A1P, currentItem).A1J);
        if (this.A1P.size() == 1 || (this.A0z != null && this.A01 == 1)) {
            A6n();
            finish();
            return;
        }
        int i = currentItem + 1;
        if (currentItem == AnonymousClass002.A04(this.A1P, 1)) {
            i = currentItem - 1;
        }
        this.A1O = Integer.valueOf(currentItem);
        this.A14.A0F(i, true);
        if (this.A1P.size() == 1) {
            A6l();
        }
        C624134x r0 = this.A1A;
        if (r0 != null) {
            this.A1f.add(r0.A1J);
        }
        AnonymousClass3ZH r02 = this.A0q;
        if (r02 != null) {
            this.A1d.add(r02.A0I(cls));
        }
    }

    public final void A6o() {
        AnonymousClass3ZH r1 = this.A0q;
        if (r1 == null) {
            return;
        }
        if (C86604Kt.A1a(this.A0P, r1)) {
            C621433s.A01(this, 106);
            return;
        }
        String A0o2 = C86604Kt.A0o(this.A0c);
        if (A0o2.length() > 0) {
            if (C107635bd.A0P(this.A08, this.A16, A0o2)) {
                this.A0O.A0C((C66513Ls) null, (C108845de) null, (C624134x) null, A0o2, Collections.singletonList(AnonymousClass4L0.A0M(this.A0q)), (List) null, false, false);
                TextKeyListener.clear(this.A0c.getText());
            } else {
                this.A05.A0H(R.string.f11nameremoved, 1);
            }
            A6m();
            return;
        }
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("popupnotification/sendentry/empty text ");
        C18260x0.A1G(A0o3, this.A1P.size());
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A6q(int r9) {
        /*
            r8 = this;
        L_0x0000:
            java.util.List r0 = r8.A1P
            int r0 = r0.size()
            if (r9 >= 0) goto L_0x000a
            int r9 = r9 + r0
            goto L_0x0000
        L_0x000a:
            int r9 = r9 % r0
            java.util.List r0 = r8.A1P
            X.34x r0 = X.C18320x8.A0R(r0, r9)
            r8.A1A = r0
            X.2z0 r0 = r0.A1J
            X.4uZ r2 = r0.A00
            X.5ZT r3 = r8.A1M
            X.5TQ r0 = r3.A0L
            if (r0 != 0) goto L_0x002a
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r1 = r0 ^ 1
            java.lang.String r0 = "Do not update the ptt receiver once the recording has started"
            X.C626936e.A0F(r1, r0)
            r3.A0E = r2
        L_0x002a:
            X.3Lo r0 = r8.A0m
            X.3ZH r0 = r0.A01(r2)
            r8.A0q = r0
            boolean r0 = r0.A0U()
            r7 = 1
            r6 = 8
            r5 = 0
            if (r0 == 0) goto L_0x0151
            X.2sj r0 = r8.A0n
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            boolean r0 = r0.A0C(r2)
            if (r0 != 0) goto L_0x0117
            android.view.View r0 = r8.A09
            r0.setVisibility(r6)
            android.widget.TextView r0 = r8.A0C
            r0.setVisibility(r5)
            android.widget.TextView r2 = r8.A0C
            X.3ZH r0 = r8.A0q
            boolean r1 = r0.A0j
            r0 = 2131887447(0x7f120557, float:1.9409501E38)
            if (r1 == 0) goto L_0x005e
            r0 = 2131887445(0x7f120555, float:1.9409497E38)
        L_0x005e:
            r2.setText(r0)
        L_0x0061:
            X.2eW r0 = r8.A18
            int r0 = r0.A00
            r2 = 3
            if (r0 == r2) goto L_0x007f
            X.3ZH r0 = r8.A0q
            boolean r0 = r0.A0U()
            if (r0 != 0) goto L_0x007f
            X.3ZH r0 = r8.A0q
            com.whatsapp.jid.Jid r1 = X.AnonymousClass3ZH.A03(r0)
            X.4uZ r1 = (X.C95814uZ) r1
            if (r1 == 0) goto L_0x007f
            X.3S3 r0 = r8.A19
            r0.A06(r1)
        L_0x007f:
            java.util.List r0 = r8.A1P
            int r0 = r0.size()
            if (r0 == r7) goto L_0x008b
            boolean r0 = r8.A1T
            if (r0 == 0) goto L_0x009d
        L_0x008b:
            java.util.HashSet r1 = r8.A1f
            X.34x r0 = r8.A1A
            X.2z0 r0 = r0.A1J
            r1.add(r0)
            java.util.HashSet r1 = r8.A1d
            X.3ZH r0 = r8.A0q
            X.C86624Kv.A1H(r0, r1)
            r8.A1T = r5
        L_0x009d:
            r8.A6p()
            r1 = 2131895042(0x7f122302, float:1.9424906E38)
            X.34x r0 = r8.A1A
            byte r0 = r0.A1I
            if (r0 != r2) goto L_0x00ac
            r1 = 2131895536(0x7f1224f0, float:1.9425908E38)
        L_0x00ac:
            android.widget.Button r0 = r8.A0A
            r0.setText(r1)
            X.5YB r1 = r8.A0M
            X.3ZH r0 = r8.A0q
            r1.A08(r0)
            X.3ZH r0 = r8.A0q
            boolean r0 = r0.A0U()
            if (r0 == 0) goto L_0x00f8
            X.34x r0 = r8.A1A
            X.4uZ r3 = r0.A0n()
            if (r3 == 0) goto L_0x0111
            X.C626936e.A06(r3)
            android.widget.TextView r2 = r8.A0D
            X.5ZU r1 = r8.A0W
            X.3Ex r0 = r8.A0T
            java.lang.String r0 = X.AnonymousClass5ZU.A01(r0, r1, r3)
            r2.setText(r0)
            android.widget.TextView r0 = r8.A0D
            r0.setVisibility(r5)
        L_0x00dd:
            android.widget.TextView r3 = r8.A0B
            r2 = 2131890647(0x7f1211d7, float:1.9415992E38)
            java.lang.Object[] r1 = X.AnonymousClass002.A0M()
            int r0 = r9 + 1
            X.AnonymousClass000.A1P(r1, r0, r5)
            java.util.List r0 = r8.A1P
            int r0 = r0.size()
            X.AnonymousClass000.A1P(r1, r0, r7)
            X.AnonymousClass001.A0y(r8, r3, r1, r2)
            return
        L_0x00f8:
            X.2nK r1 = r8.A0F
            X.3ZH r0 = r8.A0q
            java.lang.String r1 = r1.A00(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0111
            android.widget.TextView r0 = r8.A0D
            r0.setVisibility(r5)
            android.widget.TextView r0 = r8.A0D
            r0.setText(r1)
            goto L_0x00dd
        L_0x0111:
            android.widget.TextView r0 = r8.A0D
            r0.setVisibility(r6)
            goto L_0x00dd
        L_0x0117:
            X.2sj r0 = r8.A0n
            boolean r0 = r0.A0C(r2)
            if (r0 == 0) goto L_0x0151
            X.3ZH r0 = r8.A0q
            boolean r0 = r0.A0e
            if (r0 == 0) goto L_0x0151
            X.2sj r0 = r8.A0n
            boolean r0 = r0.A0D(r2)
            if (r0 != 0) goto L_0x0151
            android.view.View r0 = r8.A09
            r0.setVisibility(r6)
            android.widget.TextView r0 = r8.A0C
            r0.setVisibility(r5)
            android.widget.TextView r3 = r8.A0C
            r2 = 2131889779(0x7f120e73, float:1.9414231E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "000000"
            java.lang.String r0 = X.AnonymousClass002.A0F(r8, r0, r1, r5, r2)
            android.text.Spanned r0 = X.AnonymousClass0x9.A0B(r0)
            java.lang.String r0 = r0.toString()
            r3.setText(r0)
            goto L_0x0061
        L_0x0151:
            X.2lX r1 = r8.A0x
            X.3ZH r0 = r8.A0q
            boolean r0 = r1.A01(r0)
            if (r0 != 0) goto L_0x0191
            X.1VX r3 = r8.A0D
            X.2rx r2 = r8.A0V
            X.3ZH r0 = r8.A0q
            X.4uZ r0 = r0.A0H
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A03(r0)
            X.3LP r0 = r8.A0v
            boolean r0 = X.C57172tD.A00(r2, r3, r0, r1)
            if (r0 != 0) goto L_0x0191
            X.1VX r4 = r8.A0D
            X.3LP r3 = r8.A0v
            X.3Wa r2 = r8.A1I
            X.2rx r1 = r8.A0V
            X.3ZH r0 = r8.A0q
            X.4uZ r0 = r0.A0H
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A05(r0)
            boolean r0 = X.C615431g.A00(r1, r4, r3, r0, r2)
            if (r0 != 0) goto L_0x0191
            android.view.View r0 = r8.A09
            r0.setVisibility(r5)
        L_0x018a:
            android.widget.TextView r0 = r8.A0C
            r0.setVisibility(r6)
            goto L_0x0061
        L_0x0191:
            android.view.View r0 = r8.A09
            r0.setVisibility(r6)
            goto L_0x018a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.A6q(int):void");
    }

    public final void A6s(AnonymousClass1nE r11, StickerView stickerView) {
        AnonymousClass39M A002 = this.A1G.A00(r11);
        StickerView stickerView2 = stickerView;
        if (A002.A09 == null) {
            stickerView.setImageResource(R.drawable.sticker_error_in_conversation);
        }
        int dimensionPixelSize = C18290x4.A0G(stickerView).getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A1H.A05(stickerView2, A002, (C183108pV) null, 1, dimensionPixelSize, dimensionPixelSize, false, false);
    }

    public final boolean A6t() {
        if (C18290x4.A0m(this.A0c).length() > 0 || this.A1M.A0L != null) {
            return true;
        }
        return false;
    }

    public boolean BHW() {
        return false;
    }

    public void BjL() {
    }

    public void Bon(DialogFragment dialogFragment, String str) {
    }

    public void Bot(int i) {
        this.A05.A0H(i, 0);
    }

    public void Bou(String str) {
        this.A05.A0P(str, 0);
    }

    public void Box(Object[] objArr, int i, int i2) {
        this.A05.A0P(getString(i2, objArr), 0);
    }

    public void BpA(int i, int i2) {
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C116095pj r0 = this.A0f.A00;
        if ((r0 == null || !r0.A0S) && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public Dialog onCreateDialog(int i) {
        if (i == 106) {
            C19340zH A002 = AnonymousClass5V0.A00(this);
            Object[] A0L2 = AnonymousClass002.A0L();
            C18290x4.A1K(this.A0W, this.A0q, A0L2);
            C86624Kv.A0i(this, A002, A0L2, R.string.f11nameremoved);
            C1235268t.A03(A002, this, 75, R.string.f11nameremoved);
            C1235268t.A04(A002, this, 76, R.string.f11nameremoved);
            return A002.create();
        } else if (i != 115) {
            return super.onCreateDialog(i);
        } else {
            Log.i("popupnotification/dialog-software-about-to-expire");
            return this.A0I.A02(this, this.A0N);
        }
    }

    public void onNewIntent(Intent intent) {
        Log.i("popupnotification/new-intent");
        super.onNewIntent(intent);
        setIntent(intent);
        C95814uZ A012 = C106405Yw.A01(getIntent(), "popup_notification_extra_quick_reply_jid");
        C18260x0.A1R(AnonymousClass001.A0o(), "popupnotification/set-quick-reply-jid:", A012);
        this.A0z = A012;
        if (intent.getBooleanExtra("popup_notification_extra_dismiss_notification", false)) {
            this.A12.A0D(false);
            this.A17.A04(true);
        }
        A6k();
    }

    public PopupNotification(int i) {
        this.A1Q = false;
        AnonymousClass68W.A00(this, 67);
    }

    public final void A6l() {
        int A042 = C86644Kx.A04(this, R.id.navigation_holder);
        C18280x3.A0r(this, R.id.navigation_divider, A042);
        this.A07.setVisibility(A042);
        this.A08.setVisibility(A042);
    }

    public final void A6n() {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("popupnotification/clearnotifications:");
        HashSet hashSet = this.A1d;
        C18260x0.A1G(A0o2, hashSet.size());
        this.A17.A04(true);
        this.A0z = null;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C95814uZ A0P2 = C18300x5.A0P(it);
            ArrayList A0s2 = AnonymousClass001.A0s();
            int A032 = this.A0l.A03(A0P2);
            HashSet hashSet2 = this.A1f;
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                AnonymousClass2z0 r1 = (AnonymousClass2z0) it2.next();
                C95814uZ r0 = r1.A00;
                if (r0 != null && r0.equals(A0P2)) {
                    A0s2.add(r1);
                }
            }
            StringBuilder A0o3 = AnonymousClass001.A0o();
            C18260x0.A19("popupnotification/msg:", A0o3, A0s2);
            C18260x0.A0y("/", A0o3, A032);
            if (A0s2.size() == A032) {
                this.A0b.A00(A0P2, 2, true, true);
                hashSet2.removeAll(A0s2);
            }
        }
        this.A13.A00 = null;
        this.A12.A07();
    }

    public final void A6r(ThumbnailButton thumbnailButton) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        thumbnailButton.setMinimumHeight(dimensionPixelSize);
        thumbnailButton.setMaxHeight(dimensionPixelSize);
        thumbnailButton.setAdjustViewBounds(true);
        thumbnailButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        C86614Ku.A15(getResources(), thumbnailButton, R.dimen.f6nameremoved);
        thumbnailButton.A02 = getResources().getDimension(R.dimen.f6nameremoved);
        if (thumbnailButton instanceof C91794l6) {
            C91794l6 r4 = (C91794l6) thumbnailButton;
            r4.A00 = ((float) dimensionPixelSize) / 7.0f;
            r4.A04 = 5;
        }
    }

    public void Boo(DialogFragment dialogFragment) {
    }

    public void Bru(String str) {
    }

    public void onBackPressed() {
        A6n();
        super.onBackPressed();
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass33O r0 = this.A1H;
        if (r0 != null) {
            r0.A03();
        }
        C105365Uq r02 = this.A0X;
        if (r02 != null) {
            r02.A00();
            this.A0X = null;
        }
        AnonymousClass5ZT r03 = this.A1M;
        if (r03 != null) {
            r03.A04();
        }
        this.A0z = null;
        this.A1U.removeCallbacks(this.A1b);
        this.A1V.removeCallbacks(this.A1c);
        PowerManager.WakeLock wakeLock = this.A05;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.A05.release();
        }
        SensorEventListener sensorEventListener = this.A03;
        if (sensorEventListener != null) {
            this.A04.unregisterListener(sensorEventListener);
        }
        this.A0f.A06();
        this.A0p.A07(this.A1Y);
        this.A0U.A07(this.A1X);
        this.A0Q.A07(this.A1W);
        this.A0w.A07(this.A1Z);
        this.A13.A00 = null;
    }

    public void onPause() {
        super.onPause();
        this.A1M.A0S(false, false);
        this.A17.A02();
    }

    public void onStart() {
        super.onStart();
        this.A1S = true;
    }

    public void onStop() {
        super.onStop();
        this.A1S = false;
        this.A1M.A0S(false, false);
    }

    public void A6Y(C181548mw r1, int i, int i2, int i3, int i4) {
        C89654ea.A4X(this, i, i2);
    }

    public void Bow(C181548mw r1, Object[] objArr, int i, int i2, int i3) {
        Box(objArr, i, i2);
    }

    public void A6W(C181548mw r1, int i, int i2, int i3) {
        C89654ea.A4X(this, i, i2);
    }

    public PopupNotification() {
        this(0);
        this.A1P = AnonymousClass001.A0s();
        this.A1f = AnonymousClass002.A0K();
        this.A1e = AnonymousClass002.A0K();
        this.A1d = AnonymousClass002.A0K();
        this.A1R = false;
        this.A1a = new AnonymousClass2HS(this);
        this.A1Y = new C124166Bf(this, 16);
        this.A1X = AnonymousClass681.A00(this, 31);
        this.A1W = new C1233167y(this, 14);
        this.A1Z = new AnonymousClass687(this, 14);
        this.A0H = new AnonymousClass694(this, 9);
        this.A00 = 5.0f;
        this.A1U = AnonymousClass000.A0A();
        this.A1b = new C71263bp(this, 4);
        this.A1V = AnonymousClass000.A0A();
        this.A1c = new C71263bp(this, 5);
    }
}
