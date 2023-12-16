package com.whatsapp.textstatus;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass33p;
import X.AnonymousClass4CE;
import X.AnonymousClass4SG;
import X.AnonymousClass4WZ;
import X.AnonymousClass52T;
import X.AnonymousClass5IY;
import X.AnonymousClass5S9;
import X.AnonymousClass5UY;
import X.AnonymousClass5Y0;
import X.AnonymousClass64I;
import X.AnonymousClass68W;
import X.AnonymousClass694;
import X.AnonymousClass6AQ;
import X.AnonymousClass6C1;
import X.C100795Ch;
import X.C101905Gs;
import X.C101915Gt;
import X.C105895Wv;
import X.C107145am;
import X.C107695bk;
import X.C109675f0;
import X.C117635sF;
import X.C148127Ha;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C27821ej;
import X.C52892mD;
import X.C54982pb;
import X.C55682qk;
import X.C60152y5;
import X.C620633i;
import X.C620733j;
import X.C64333Db;
import X.C69883Yw;
import X.C70363aN;
import X.C71373c0;
import X.C71573cK;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86654Ky;
import X.C89224c7;
import X.C89644eZ;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class AddTextStatusActivity extends C89644eZ implements AnonymousClass64I {
    public int A00;
    public WaEditText A01;
    public WaImageButton A02;
    public WaTextView A03;
    public WaTextView A04;
    public C620733j A05;
    public C89224c7 A06;
    public AnonymousClass5IY A07;
    public C27821ej A08;
    public EmojiSearchProvider A09;
    public C54982pb A0A;
    public C60152y5 A0B;
    public AnonymousClass4WZ A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public String[] A0G;
    public final TextWatcher A0H;
    public final AnonymousClass4CE A0I;
    public final C101905Gs A0J;
    public final C101915Gt A0K;
    public final List A0L;

    public void Bbh(int i, int i2) {
        if (i == 1) {
            WaTextView waTextView = this.A04;
            if (waTextView == null) {
                throw C18270x1.A0S("timerValueView");
            }
            String[] strArr = this.A0G;
            if (strArr == null) {
                throw C18270x1.A0S("durationOptions");
            }
            waTextView.setText(strArr[i2]);
            this.A00 = i2;
        }
    }

    public void A5r() {
        if (!this.A0E) {
            this.A0E = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A08 = C86604Kt.A0X(A2Y);
            this.A0A = (C54982pb) A2Y.AN9.get();
            this.A05 = C64333Db.A2t(A2Y);
            this.A07 = C107695bk.A1m(r1);
            this.A09 = C107695bk.A1n(r1);
            this.A0B = C64333Db.A74(A2Y);
        }
    }

    public final void A74() {
        WaTextView waTextView = this.A03;
        if (waTextView != null) {
            C86634Kw.A1I(waTextView);
        }
        C18270x1.A0p(this.A03);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        this.A01 = (WaEditText) C18290x4.A0N(this, R.id.add_text_status_entry_field);
        setTitle(R.string.f11nameremoved);
        Toolbar toolbar = (Toolbar) C18290x4.A0L(this, R.id.emoji_edit_text_toolbar);
        toolbar.setTitle((int) R.string.f11nameremoved);
        setSupportActionBar(toolbar);
        AnonymousClass1Hf.A2E(this);
        WaEditText waEditText = this.A01;
        if (waEditText == null) {
            throw C18270x1.A0S("textEntry");
        }
        AnonymousClass5Y0 r9 = this.A0C;
        C620633i r6 = this.A08;
        C620733j r7 = this.A00;
        C60152y5 r10 = this.A0B;
        if (r10 != null) {
            waEditText.addTextChangedListener(new AnonymousClass52T(waEditText, C18310x6.A0L(this, R.id.counter_tv), r6, r7, this.A0B, r9, r10, 60, 50, false));
            View findViewById = findViewById(R.id.suggestions_list);
            C69883Yw r4 = new C69883Yw();
            findViewById.setVisibility(8);
            this.A04.BkP(new C70363aN(this, r4, findViewById, 20));
            Resources resources = getResources();
            Object[] objArr = new Object[1];
            AnonymousClass000.A1P(objArr, 24, 0);
            String quantityString = resources.getQuantityString(R.plurals.f9nameremoved, 24, objArr);
            C162457s7.A0D(quantityString);
            Resources resources2 = getResources();
            Object[] objArr2 = new Object[1];
            AnonymousClass000.A1P(objArr2, 3, 0);
            String quantityString2 = resources2.getQuantityString(R.plurals.f9nameremoved, 3, objArr2);
            C162457s7.A0D(quantityString2);
            Resources resources3 = getResources();
            Object[] objArr3 = new Object[1];
            AnonymousClass000.A1P(objArr3, 1, 0);
            String quantityString3 = resources3.getQuantityString(R.plurals.f9nameremoved, 1, objArr3);
            C162457s7.A0D(quantityString3);
            String A0Y = AnonymousClass0x2.A0Y(getResources(), 2, 0, R.plurals.f9nameremoved);
            C162457s7.A0D(A0Y);
            this.A0G = new String[]{quantityString, quantityString2, quantityString3, A0Y};
            findViewById(R.id.timer_container).setOnClickListener(new C109675f0((Object) this, 28));
            WaTextView waTextView = (WaTextView) C18290x4.A0N(this, R.id.timer_value);
            this.A04 = waTextView;
            if (waTextView == null) {
                throw C18270x1.A0S("timerValueView");
            }
            String[] strArr = this.A0G;
            if (strArr == null) {
                throw C18270x1.A0S("durationOptions");
            }
            waTextView.setText(strArr[0]);
            this.A02 = (WaImageButton) C18290x4.A0N(this, R.id.add_text_status_emoji_btn);
            AnonymousClass1VX r15 = this.A0D;
            C105895Wv r14 = this.A0B;
            C55682qk r13 = this.A03;
            AnonymousClass5Y0 r12 = this.A0C;
            C27821ej r11 = this.A08;
            if (r11 != null) {
                C620633i r102 = this.A08;
                C620733j r92 = this.A00;
                AnonymousClass5IY r8 = this.A07;
                if (r8 != null) {
                    EmojiSearchProvider emojiSearchProvider = this.A09;
                    if (emojiSearchProvider != null) {
                        AnonymousClass33p r62 = this.A09;
                        C60152y5 r5 = this.A0B;
                        if (r5 != null) {
                            View view = this.A00;
                            C162457s7.A0K(view, "null cannot be cast to non-null type com.whatsapp.KeyboardPopupLayout");
                            KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) view;
                            WaImageButton waImageButton = this.A02;
                            if (waImageButton == null) {
                                throw C18270x1.A0S("emojiButton");
                            }
                            WaEditText waEditText2 = this.A01;
                            if (waEditText2 == null) {
                                throw C18270x1.A0S("textEntry");
                            }
                            C89224c7 r17 = new C89224c7(this, waImageButton, r13, keyboardPopupLayout, waEditText2, r102, r62, r92, r8, r11, r12, emojiSearchProvider, r15, r5, r14);
                            this.A06 = r17;
                            r17.A09 = new C148127Ha(true, false);
                            EmojiSearchContainer emojiSearchContainer = (EmojiSearchContainer) findViewById(R.id.emoji_search_container);
                            C89224c7 r72 = this.A06;
                            if (r72 == null) {
                                throw C18270x1.A0S("emojiPopup");
                            }
                            AnonymousClass5Y0 r52 = this.A0C;
                            C27821ej r3 = this.A08;
                            if (r3 != null) {
                                C620733j r1 = this.A00;
                                C60152y5 r0 = this.A0B;
                                if (r0 != null) {
                                    AnonymousClass5S9 r73 = new AnonymousClass5S9(this, r1, r72, r3, r52, emojiSearchContainer, r0);
                                    r73.A00 = new AnonymousClass6AQ(r73, 1, this);
                                    C89224c7 r32 = this.A06;
                                    if (r32 == null) {
                                        throw C18270x1.A0S("emojiPopup");
                                    }
                                    r32.A0C(this.A0I);
                                    r32.A0E = new C71573cK(r73, 38, this);
                                    C18280x3.A0o(findViewById(R.id.done_btn), this, 29);
                                    C18280x3.A0o(findViewById(R.id.add_text_status_clear_btn), this, 27);
                                    C54982pb r02 = this.A0A;
                                    if (r02 != null) {
                                        C52892mD A002 = r02.A00();
                                        if (A002 != null) {
                                            String str = A002.A03;
                                            if (str != null) {
                                                WaEditText waEditText3 = this.A01;
                                                if (waEditText3 == null) {
                                                    throw C18270x1.A0S("textEntry");
                                                }
                                                waEditText3.setText(str);
                                                WaEditText waEditText4 = this.A01;
                                                if (waEditText4 == null) {
                                                    throw C18270x1.A0S("textEntry");
                                                }
                                                C86654Ky.A1D(waEditText4, str);
                                            }
                                            String str2 = A002.A02;
                                            if (str2 != null) {
                                                this.A04.BkP(new C71373c0(14, str2, this));
                                            }
                                            long j = A002.A00;
                                            if (j != -1) {
                                                long millis = A002.A01 + TimeUnit.SECONDS.toMillis(j);
                                                AnonymousClass5UY A1p = AnonymousClass1Ha.A1p(this, R.id.expiration);
                                                TextView textView = (TextView) AnonymousClass5UY.A00(A1p, 0);
                                                Object[] A0M = AnonymousClass002.A0M();
                                                C620733j r16 = this.A05;
                                                if (r16 != null) {
                                                    A0M[0] = C86614Ku.A0v(r16, 170, millis);
                                                    C620733j r03 = this.A05;
                                                    if (r03 != null) {
                                                        A0M[1] = C107145am.A00(r03, millis);
                                                        AnonymousClass001.A0y(this, textView, A0M, R.string.f11nameremoved);
                                                        this.A03 = (WaTextView) A1p.A04();
                                                        WaTextView waTextView2 = this.A04;
                                                        if (waTextView2 == null) {
                                                            throw C18270x1.A0S("timerValueView");
                                                        }
                                                        String[] strArr2 = this.A0G;
                                                        if (strArr2 == null) {
                                                            throw C18270x1.A0S("durationOptions");
                                                        }
                                                        long[] jArr = C100795Ch.A00;
                                                        int length = jArr.length;
                                                        int i = 0;
                                                        while (true) {
                                                            if (i < length) {
                                                                if (j == jArr[i]) {
                                                                    break;
                                                                }
                                                                i++;
                                                            } else {
                                                                i = -1;
                                                                break;
                                                            }
                                                        }
                                                        waTextView2.setText(strArr2[i]);
                                                    } else {
                                                        throw C18270x1.A0S("whatsappLocale");
                                                    }
                                                } else {
                                                    throw C18270x1.A0S("whatsappLocale");
                                                }
                                            }
                                        }
                                        WaEditText waEditText5 = this.A01;
                                        if (waEditText5 == null) {
                                            throw C18270x1.A0S("textEntry");
                                        }
                                        waEditText5.addTextChangedListener(this.A0H);
                                        return;
                                    }
                                    throw C18270x1.A0S("myEvolvedAbout");
                                }
                                throw C18270x1.A0S("sharedPreferencesFactory");
                            }
                            throw C18270x1.A0S("recentEmojis");
                        }
                        throw C18270x1.A0S("sharedPreferencesFactory");
                    }
                    throw C18270x1.A0S("emojiSearchProvider");
                }
                throw C18270x1.A0S("emojiTrayLogger");
            }
            throw C18270x1.A0S("recentEmojis");
        }
        throw C18270x1.A0S("sharedPreferencesFactory");
    }

    public AddTextStatusActivity(int i) {
        this.A0E = false;
        AnonymousClass68W.A00(this, 112);
    }

    public void onStop() {
        super.onStop();
        C89224c7 r0 = this.A06;
        if (r0 == null) {
            throw C18270x1.A0S("emojiPopup");
        }
        if (r0.isShowing()) {
            C89224c7 r02 = this.A06;
            if (r02 == null) {
                throw C18270x1.A0S("emojiPopup");
            }
            r02.dismiss();
        }
        WaEditText waEditText = this.A01;
        if (waEditText == null) {
            throw C18270x1.A0S("textEntry");
        }
        waEditText.removeTextChangedListener(this.A0H);
        this.A04.BkM(new C117635sF(this, 41));
    }

    public AddTextStatusActivity() {
        this(0);
        this.A0L = AnonymousClass001.A0s();
        this.A0I = new AnonymousClass694(this, 14);
        this.A0K = new C101915Gt(this);
        this.A0J = new C101905Gs(this);
        this.A0H = new AnonymousClass6C1(this, 2);
    }
}
