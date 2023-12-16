package com.whatsapp.payments.ui.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0GH;
import X.AnonymousClass0R8;
import X.AnonymousClass0XL;
import X.AnonymousClass0Y8;
import X.AnonymousClass0Y9;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass10k;
import X.AnonymousClass1S3;
import X.AnonymousClass1VX;
import X.AnonymousClass2QZ;
import X.AnonymousClass2WI;
import X.AnonymousClass33p;
import X.AnonymousClass359;
import X.AnonymousClass36F;
import X.AnonymousClass39M;
import X.AnonymousClass39Q;
import X.AnonymousClass39R;
import X.AnonymousClass3H6;
import X.AnonymousClass4BP;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass4Rn;
import X.AnonymousClass5IY;
import X.AnonymousClass5PB;
import X.AnonymousClass5RE;
import X.AnonymousClass5S9;
import X.AnonymousClass5T2;
import X.AnonymousClass5UX;
import X.AnonymousClass5V0;
import X.AnonymousClass5Y0;
import X.AnonymousClass5Yj;
import X.AnonymousClass6Z3;
import X.AnonymousClass7T2;
import X.AnonymousClass972;
import X.AnonymousClass97B;
import X.AnonymousClass97C;
import X.AnonymousClass99Q;
import X.AnonymousClass9DC;
import X.AnonymousClass9LS;
import X.AnonymousClass9OY;
import X.AnonymousClass9OZ;
import X.AnonymousClass9PQ;
import X.AnonymousClass9QF;
import X.AnonymousClass9QH;
import X.AnonymousClass9RV;
import X.AnonymousClass9dQ;
import X.AnonymousClass9h9;
import X.C001902e;
import X.C009707r;
import X.C05030Rp;
import X.C06560Yg;
import X.C103645Nu;
import X.C105365Uq;
import X.C105895Wv;
import X.C106095Xp;
import X.C107335b8;
import X.C107575bX;
import X.C107695bk;
import X.C111095hX;
import X.C111685iW;
import X.C114015mM;
import X.C115975pX;
import X.C149447Mm;
import X.C154437dA;
import X.C157407iF;
import X.C158737kT;
import X.C159827mW;
import X.C160617ny;
import X.C162157rM;
import X.C162457s7;
import X.C17190ui;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C183538qC;
import X.C184508rw;
import X.C185418tc;
import X.C187908y0;
import X.C1899593h;
import X.C1899693i;
import X.C1907099n;
import X.C193319Oa;
import X.C193339Oc;
import X.C19340zH;
import X.C193599Pg;
import X.C194419Su;
import X.C194589Tn;
import X.C195439Xu;
import X.C195479Xy;
import X.C195949a3;
import X.C196409an;
import X.C197549dU;
import X.C200739io;
import X.C200749ip;
import X.C202199lX;
import X.C202829me;
import X.C203409ne;
import X.C203769oH;
import X.C203779oI;
import X.C203959oa;
import X.C203969ob;
import X.C204229p1;
import X.C204249p3;
import X.C204289p7;
import X.C204359pE;
import X.C204409pJ;
import X.C204679pk;
import X.C204929q9;
import X.C27821ej;
import X.C29361ih;
import X.C49252gE;
import X.C55682qk;
import X.C55922r8;
import X.C56932sn;
import X.C56982ss;
import X.C60152y5;
import X.C620633i;
import X.C620733j;
import X.C620933l;
import X.C624034w;
import X.C626936e;
import X.C627336j;
import X.C63663Ad;
import X.C64333Db;
import X.C69263Wi;
import X.C72343dZ;
import X.C85204Fi;
import X.C86604Kt;
import X.C86614Ku;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C88834as;
import X.C88864av;
import X.C94264qq;
import X.C94294qu;
import X.C94324qx;
import X.C95814uZ;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.gifsearch.GifSearchContainer;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PaymentView extends KeyboardPopupLayout implements View.OnClickListener, AnonymousClass4BP, C187908y0 {
    public int A00;
    public int A01;
    public AutoTransition A02;
    public View A03;
    public Animation A04;
    public FrameLayout A05;
    public ImageView A06;
    public ImageView A07;
    public ImageView A08;
    public LinearLayout A09;
    public LinearLayout A0A;
    public LinearLayout A0B;
    public LinearLayout A0C;
    public LinearLayout A0D;
    public LinearLayout A0E;
    public LinearLayout A0F;
    public TextSwitcher A0G;
    public TextSwitcher A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public TextView A0M;
    public Group A0N;
    public CoordinatorLayout A0O;
    public ShimmerFrameLayout A0P;
    public ShimmerFrameLayout A0Q;
    public AnonymousClass6Z3 A0R;
    public TabLayout A0S;
    public C55682qk A0T;
    public C69263Wi A0U;
    public KeyboardPopupLayout A0V;
    public ThumbnailButton A0W;
    public ThumbnailButton A0X;
    public AnonymousClass5UX A0Y;
    public C105365Uq A0Z;
    public C114015mM A0a;
    public C620633i A0b;
    public AnonymousClass33p A0c;
    public C620733j A0d;
    public AnonymousClass5RE A0e;
    public C56982ss A0f;
    public AnonymousClass36F A0g;
    public C85204Fi A0h;
    public AnonymousClass5IY A0i;
    public C27821ej A0j;
    public AnonymousClass5Y0 A0k;
    public EmojiSearchProvider A0l;
    public AnonymousClass2WI A0m;
    public C94324qx A0n;
    public AnonymousClass1VX A0o;
    public AnonymousClass4FV A0p;
    public AnonymousClass5PB A0q;
    public C106095Xp A0r;
    public C55922r8 A0s;
    public C95814uZ A0t;
    public C620933l A0u;
    public C1907099n A0v;
    public AnonymousClass9RV A0w;
    public C202829me A0x;
    public PaymentAmountInputField A0y;
    public C196409an A0z;
    public C203769oH A10;
    public C203409ne A11;
    public C193319Oa A12;
    public C202199lX A13;
    public C194419Su A14;
    public C60152y5 A15;
    public AnonymousClass39M A16;
    public C29361ih A17;
    public C56932sn A18;
    public C49252gE A19;
    public AnonymousClass10k A1A;
    public C103645Nu A1B;
    public AnonymousClass2QZ A1C;
    public C162157rM A1D;
    public AnonymousClass4FS A1E;
    public C183538qC A1F;
    public Integer A1G;
    public String A1H;
    public String A1I;
    public String A1J;
    public String A1K;
    public String A1L;
    public String A1M;
    public List A1N;
    public boolean A1O;
    public boolean A1P;
    public boolean A1Q;
    public final Runnable A1R;

    private void setInitialTabConfiguration(AnonymousClass9QH r3) {
        int i = 1;
        if (r3.A09.A01 == 0) {
            i = 0;
        }
        this.A00 = i;
        AnonymousClass5T2 A052 = this.A0S.A05(i);
        if (A052 != null) {
            A052.A00();
        }
    }

    public void A02() {
        if (!this.A1O) {
            this.A1O = true;
            C88864av r1 = (C88864av) ((C111685iW) generatedComponent());
            C64333Db r3 = r1.A0K;
            this.A05 = (C105895Wv) r3.AHN.get();
            this.A0o = C64333Db.A4B(r3);
            this.A0r = (C106095Xp) r3.AG6.get();
            this.A0U = C64333Db.A04(r3);
            this.A0T = (C55682qk) r3.A75.get();
            this.A1E = C64333Db.A8y(r3);
            this.A0p = C86604Kt.A0Z(r3);
            this.A0k = (AnonymousClass5Y0) r3.A8o.get();
            this.A0j = (C27821ej) r3.ATV.get();
            this.A0a = C86604Kt.A0S(r3);
            this.A0Y = C86614Ku.A0Q(r3);
            this.A0n = r1.A4K();
            this.A1F = C72343dZ.A00(r3.ASJ);
            this.A0f = (C56982ss) r3.A5B.get();
            this.A0b = C64333Db.A2o(r3);
            this.A17 = (C29361ih) r3.AX3.get();
            C107695bk r2 = r3.A00;
            this.A0s = (C55922r8) r2.A9d.get();
            this.A18 = (C56932sn) r3.AXB.get();
            this.A0u = C1899593h.A0E(r3);
            this.A0d = C64333Db.A2t(r3);
            this.A0i = (AnonymousClass5IY) r2.A41.get();
            this.A0l = (EmojiSearchProvider) r2.A40.get();
            this.A0c = C64333Db.A2s(r3);
            this.A0v = C1899593h.A0H(r3);
            this.A0g = C1899693i.A0A(r3);
            this.A15 = C86614Ku.A0g(r3);
            this.A0w = (AnonymousClass9RV) r3.APO.get();
            C88834as r12 = r1.A0I;
            this.A0m = (AnonymousClass2WI) r12.A05.get();
            this.A0q = r12.ACT();
            this.A1C = (AnonymousClass2QZ) r2.ABQ.get();
            this.A19 = (C49252gE) r2.ABM.get();
            this.A0e = (AnonymousClass5RE) r2.A3H.get();
        }
    }

    public void A04() {
        String str;
        C193339Oc r5;
        String str2;
        C85204Fi r9;
        AnonymousClass39Q r8;
        Editable text = this.A0y.getText();
        C626936e.A06(text);
        String obj = text.toString();
        int i = 1;
        if (this.A00 != 1) {
            this.A0v.A04.A02();
            i = 0;
        }
        C624034w A052 = AnonymousClass36F.A05(this.A0g, this.A1K, this.A1M);
        if (A052 == null || A052.A02 != 18) {
            BigDecimal B3c = this.A0h.B3c(this.A0d, obj);
            C197549dU r10 = (C197549dU) this.A13;
            C193599Pg r11 = r10.A06;
            if (r11 != null) {
                String str3 = r11.A04;
                if (str3 == null || str3.length() == 0) {
                    r9 = r11.A02;
                    r8 = ((AnonymousClass1S3) r9).A01;
                    C162457s7.A0H(r8);
                } else {
                    BigDecimal bigDecimal = new BigDecimal(str3);
                    r9 = r11.A02;
                    r8 = C1899593h.A08(r9, bigDecimal);
                }
                if (B3c == null || r8.A00.compareTo(B3c) > 0) {
                    str = AnonymousClass002.A0F(r11.A00, r9.B3V(r11.A01, r8), new Object[1], 0, R.string.f11nameremoved);
                    r5 = new C193339Oc(2, str);
                } else {
                    r5 = new C193339Oc(0, "");
                }
            } else if (B3c == null || r10.A05.A00.compareTo(B3c) > 0) {
                str = AnonymousClass002.A0F(r10.A01, r10.A03.B3V(r10.A02, r10.A05), AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
                r5 = new C193339Oc(2, str);
            } else {
                r5 = new C193339Oc(0, "");
            }
            if (r5.A00 == 0) {
                Objects.requireNonNull(B3c);
                r5 = r10.A00("", B3c, i, false);
            }
            int i2 = r5.A00;
            if ((i2 == 2 || i2 == 3) && (str2 = r5.A01) != null) {
                this.A0y.A0D();
                this.A10.BSF(str2);
                A0E(str2);
                if (A0H()) {
                    this.A0n.A03();
                }
                this.A14.A01(1);
                return;
            }
            this.A1I = obj;
            C196409an r0 = this.A0z;
            if (r0 != null) {
                this.A1J = r0.A0B.getStringText();
                this.A1N = this.A0z.A0B.getMentions();
            }
            C203769oH r1 = this.A10;
            AnonymousClass39Q A082 = C1899593h.A08(this.A0h, B3c);
            if (i != 0) {
                r1.Ba5(A082, obj);
            } else {
                r1.BbG(A082);
            }
        } else {
            this.A10.BbJ();
        }
    }

    public void A05() {
        if (this.A0N.getVisibility() == 0) {
            this.A08.setTag(R.id.selected_expressive_background_theme, (Object) null);
            this.A08.setImageResource(R.drawable.payment_default_background);
            C202829me r0 = this.A0x;
            if (r0 != null) {
                A0D(((AnonymousClass9QH) r0.Bhf()).A04);
            }
        }
    }

    public void A06() {
        C196409an r2 = this.A0z;
        if (r2 != null) {
            r2.A07.setVisibility(8);
            r2.A0D = null;
            r2.A0F = null;
            r2.A0B.setVisibility(0);
            r2.A06.setVisibility(0);
        }
    }

    public void A07() {
        int i;
        if (this.A00 == 1) {
            this.A0G.setVisibility(0);
            this.A0G.setText(this.A11.B48().getString(R.string.f11nameremoved));
            if (this.A1P) {
                this.A0H.setText(this.A1H);
                A0F(this.A1Q);
            }
            if (this.A11.BIt()) {
                this.A0I.setText(this.A11.BAu());
                this.A0I.setVisibility(0);
                A0B();
            } else {
                A0A();
            }
            C196409an r1 = this.A0z;
            if (r1 != null) {
                r1.A0C.A00(2);
            }
            this.A0y.A03 = 1;
            i = 6;
        } else {
            boolean z = this.A1P;
            TextSwitcher textSwitcher = this.A0G;
            if (z) {
                textSwitcher.setVisibility(8);
                this.A0H.setText(A03(this.A1H, R.string.f11nameremoved));
                A0A();
                this.A0I.setVisibility(8);
                A0F(this.A1Q);
            } else {
                textSwitcher.setVisibility(0);
                this.A0G.setText(this.A11.B48().getString(R.string.f11nameremoved));
                this.A0I.setVisibility(8);
                A08();
            }
            C196409an r0 = this.A0z;
            if (r0 != null) {
                r0.A0C.A00(1);
            }
            this.A0y.A03 = 0;
            i = this.A01;
        }
        FrameLayout frameLayout = this.A05;
        if (i != 0) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            C18270x1.A0l(C620933l.A00(this.A0u), "payment_incentive_tooltip_viewed", true);
        }
        if (this.A0z != null) {
            boolean BIt = this.A11.BIt();
            C196409an r02 = this.A0z;
            if (BIt) {
                r02.A03.setVisibility(8);
                return;
            }
            r02.A03.setVisibility(0);
            if (this.A12.A01) {
                MentionableEntry mentionableEntry = this.A0z.A0B;
                mentionableEntry.addTextChangedListener(new C203959oa(this, 3));
                C162157rM r03 = this.A1D;
                r03.A0B.A07(r03.A09);
                if (!A0H()) {
                    C194419Su r8 = this.A14;
                    C196409an r2 = this.A0z;
                    ImageButton imageButton = r2.A05;
                    GifSearchContainer gifSearchContainer = r2.A0A;
                    EmojiSearchContainer emojiSearchContainer = r2.A08;
                    C626936e.A04(emojiSearchContainer);
                    C203779oI r14 = this.A12.A00;
                    C626936e.A06(r14);
                    C162157rM r11 = this.A1D;
                    C115975pX r12 = new C115975pX(r11);
                    ((AnonymousClass9DC) r14).A0a = r12;
                    AnonymousClass5PB r5 = r8.A0D;
                    Activity activity = r8.A00;
                    r5.A00 = activity;
                    AnonymousClass5RE r22 = r8.A06;
                    r5.A05 = r22.A00();
                    r5.A07 = r22.A01(r8.A0H, r11);
                    r5.A02 = r8.A02;
                    r5.A01 = imageButton;
                    r5.A03 = mentionableEntry;
                    C94264qq A012 = r5.A01();
                    C204229p1 r7 = new C204229p1(mentionableEntry, r8, 1);
                    AnonymousClass4FV r16 = r8.A0C;
                    C55922r8 r15 = r8.A0F;
                    AnonymousClass5Y0 r52 = r8.A09;
                    C27821ej r3 = r8.A08;
                    EmojiSearchContainer emojiSearchContainer2 = emojiSearchContainer;
                    Activity activity2 = activity;
                    C620733j r17 = r8.A05;
                    C94294qu r152 = new C94294qu(activity2, r17, r3, r52, emojiSearchContainer2, r16, A012, gifSearchContainer, r15, r8.A0G);
                    r12.A01(A012, r14);
                    A012.A0C(r7);
                    A012.A0E = new C200749ip(r152, r8);
                    A012.A0J(this);
                    r152.A00 = new C204679pk(r7, 1);
                    r12.A04 = this;
                    r11.A0B.A06(r11.A09);
                    AnonymousClass0x2.A1H(A012, r8.A0J, 3);
                    return;
                }
            } else if (!A0H()) {
                C194419Su r72 = this.A14;
                C196409an r13 = this.A0z;
                MentionableEntry mentionableEntry2 = r13.A0B;
                ImageButton imageButton2 = r13.A05;
                EmojiSearchContainer emojiSearchContainer3 = r13.A08;
                C626936e.A04(emojiSearchContainer3);
                Activity activity3 = r72.A00;
                AnonymousClass1VX r153 = r72.A0B;
                C105895Wv r142 = r72.A0I;
                C55682qk r132 = r72.A01;
                AnonymousClass5Y0 r122 = r72.A09;
                C27821ej r10 = r72.A08;
                C620633i r9 = r72.A03;
                C620733j r82 = r72.A05;
                AnonymousClass5IY r6 = r72.A07;
                EmojiSearchProvider emojiSearchProvider = r72.A0A;
                AnonymousClass33p r18 = r72.A04;
                C60152y5 r53 = r72.A0G;
                C105895Wv r30 = r142;
                AnonymousClass33p r20 = r18;
                C620733j r21 = r82;
                AnonymousClass5IY r222 = r6;
                KeyboardPopupLayout keyboardPopupLayout = r72.A02;
                MentionableEntry mentionableEntry3 = mentionableEntry2;
                C620633i r19 = r9;
                Activity activity4 = activity3;
                ImageButton imageButton3 = imageButton2;
                C55682qk r162 = r132;
                AnonymousClass99Q r133 = new AnonymousClass99Q(activity4, imageButton3, r162, keyboardPopupLayout, mentionableEntry3, r19, r20, r21, r222, r10, r122, emojiSearchContainer3, emojiSearchProvider, r153, r72, r53, r30);
                C204229p1 r23 = new C204229p1(mentionableEntry2, r72, 0);
                AnonymousClass5S9 r134 = new AnonymousClass5S9(activity4, r82, r133, r10, r122, emojiSearchContainer3, r53);
                r134.A00 = new C204679pk(r23, 0);
                r133.A0C(r23);
                r133.A0E = new C200739io(r134, r72);
                AnonymousClass0x2.A1H(r133, r72.A0J, 0);
                return;
            }
            C94324qx r112 = this.A0n;
            Context context = getContext();
            CoordinatorLayout coordinatorLayout = this.A0O;
            C009707r B48 = this.A11.B48();
            C196409an r04 = this.A0z;
            ImageButton imageButton4 = r04.A05;
            MentionableEntry mentionableEntry4 = r04.A0B;
            KeyboardPopupLayout keyboardPopupLayout2 = this.A0V;
            EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = r04.A09;
            C162457s7.A0J(context, 0);
            C162457s7.A0J(coordinatorLayout, 1);
            r112.A0A = mentionableEntry4;
            r112.A02 = context;
            r112.A01 = B48;
            r112.A05 = imageButton4;
            r112.A06 = coordinatorLayout;
            r112.A09 = keyboardPopupLayout2;
            r112.A0B = emojiSearchKeyboardContainer;
            r112.A04 = coordinatorLayout;
            r112.A0G = null;
            C204409pJ.A00(this.A0z.A05, new C195949a3(this), this, 35);
        }
    }

    public void A08() {
        if (this.A1P) {
            this.A0H.setText(A03(this.A1H, R.string.f11nameremoved));
            A0F(this.A1Q);
            this.A0G.setVisibility(8);
            return;
        }
        this.A0G.setVisibility(0);
        this.A0D.setVisibility(8);
        this.A09.setVisibility(8);
        if (this.A11.BIt()) {
            this.A0I.setVisibility(0);
            A0B();
            return;
        }
        A0A();
    }

    public final void A0A() {
        this.A0H.setPadding(0, getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 0, 0);
    }

    public final void A0B() {
        this.A0H.setPadding(getResources().getDimensionPixelSize(R.dimen.f6nameremoved), getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 0, 0);
        this.A0I.setPadding(getResources().getDimensionPixelSize(R.dimen.f6nameremoved), getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 0, 0);
    }

    public void A0C(C185418tc r2, int i, int i2) {
        if (r2 != null) {
            ViewStub viewStub = (ViewStub) findViewById(i);
            if (viewStub != null) {
                AnonymousClass9LS.A00(viewStub, r2);
            } else {
                r2.BfU(findViewById(i2));
            }
        }
    }

    public final void A0D(AnonymousClass9QF r10) {
        AnonymousClass0Y9.A06(this.A0y, r10.A00);
        Pair pair = r10.A01;
        AnonymousClass0Y9.A06(this.A0L, C18280x3.A03(pair));
        TextView textView = this.A0L;
        int[] iArr = (int[]) pair.second;
        textView.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
        Pair pair2 = r10.A02;
        AnonymousClass0Y9.A06(this.A0K, C18280x3.A03(pair2));
        TextView textView2 = this.A0K;
        int[] iArr2 = (int[]) pair2.second;
        textView2.setPadding(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
    }

    public void A0E(CharSequence charSequence) {
        if (this.A0J != null) {
            boolean A1U = C18320x8.A1U(charSequence);
            this.A0J.setVisibility(AnonymousClass001.A08(A1U ? 1 : 0));
            this.A0J.setText(charSequence);
            this.A04.cancel();
            this.A04.reset();
            Handler handler = getHandler();
            if (handler != null) {
                Runnable runnable = this.A1R;
                handler.removeCallbacks(runnable);
                if (A1U) {
                    this.A0J.announceForAccessibility(charSequence);
                    getHandler().postDelayed(runnable, 4000);
                }
            }
        }
    }

    public void A0F(boolean z) {
        this.A1Q = z;
        LinearLayout linearLayout = this.A0D;
        if (z) {
            linearLayout.setVisibility(8);
            this.A09.setVisibility(0);
            return;
        }
        linearLayout.setVisibility(0);
        this.A09.setVisibility(8);
    }

    public boolean A0G() {
        HashMap hashMap = this.A14.A0J;
        Iterator A0u2 = AnonymousClass001.A0u(hashMap);
        while (A0u2.hasNext()) {
            Map.Entry A0w2 = AnonymousClass001.A0w(A0u2);
            PopupWindow popupWindow = (PopupWindow) hashMap.get(A0w2.getKey());
            if (popupWindow.isShowing()) {
                popupWindow.dismiss();
                int A0K2 = AnonymousClass001.A0K(A0w2.getKey());
                if (A0K2 != 0) {
                    if (A0K2 != 1) {
                        if (!(A0K2 == 2 || A0K2 == 3)) {
                            return false;
                        }
                    }
                    return true;
                }
                if (A0H()) {
                    this.A0n.A03();
                }
                this.A14.A01(1);
                return true;
            }
        }
        return false;
    }

    public final boolean A0H() {
        if (!this.A0o.A0X(3792) || !this.A0o.A0X(5372)) {
            return false;
        }
        return true;
    }

    public void Bci(AnonymousClass39M r5, Integer num, int i) {
        C115975pX r1 = ((AnonymousClass9DC) this.A12.A00).A0a;
        if (r1 != null) {
            r1.A04(true);
        }
        C196409an r12 = this.A0z;
        if (r12 == null) {
            return;
        }
        if (r12.A0D != null || C107575bX.A0F(r12.A0B.getStringText())) {
            C196409an r0 = this.A0z;
            if (r0 != null) {
                r0.A00(r5, num);
                return;
            }
            return;
        }
        C19340zH A002 = AnonymousClass5V0.A00(getContext());
        A002.A0U(R.string.f11nameremoved);
        A002.A0T(R.string.f11nameremoved);
        A002.A0Y(new C204289p7(r5, num, this, 0), R.string.f11nameremoved);
        A002.A0W(new C204359pE(6), R.string.f11nameremoved);
        C18280x3.A0q(A002);
    }

    public void Bdv(AnonymousClass5T2 r4) {
        boolean z = true;
        if (this.A00 != r4.A00) {
            if (A0H()) {
                this.A0n.A03();
            }
            this.A14.A01(1);
        }
        TransitionManager.beginDelayedTransition((ViewGroup) findViewById(R.id.send_payment_details), this.A02);
        int i = r4.A00;
        this.A00 = i;
        C203769oH r0 = this.A10;
        if (i != 1) {
            z = false;
        }
        r0.Bdw(z);
        A07();
    }

    public List getMentionedJids() {
        C196409an r0 = this.A0z;
        if (r0 != null) {
            return r0.A0B.getMentions();
        }
        return AnonymousClass001.A0s();
    }

    public String getPaymentAmountString() {
        Editable text = this.A0y.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public AnonymousClass39R getPaymentBackground() {
        if (this.A0N.getVisibility() != 0) {
            return null;
        }
        return (AnonymousClass39R) this.A08.getTag(R.id.selected_expressive_background_theme);
    }

    public String getPaymentNote() {
        C196409an r0 = this.A0z;
        if (r0 != null) {
            return r0.A0B.getStringText();
        }
        return "";
    }

    public View.OnClickListener getSendPaymentClickListener() {
        return C204249p3.A00(this, 153);
    }

    public AnonymousClass39M getStickerIfSelected() {
        C196409an r0 = this.A0z;
        if (r0 != null) {
            return r0.A0D;
        }
        return null;
    }

    public Integer getStickerSendOrigin() {
        C196409an r0 = this.A0z;
        if (r0 != null) {
            return r0.A0F;
        }
        return null;
    }

    public void setAmountInputData(AnonymousClass9OY r26) {
        TextView textView;
        C157407iF r0;
        C157407iF r1;
        C157407iF r2;
        C157407iF r3;
        String str;
        String str2;
        AnonymousClass9OY r02 = r26;
        C85204Fi r22 = r02.A01;
        this.A0h = r22;
        int i = r02.A00;
        this.A0y.A0E = r22;
        AnonymousClass3H6 r23 = (AnonymousClass3H6) r22;
        String str3 = "";
        if (r23.A00 == 0) {
            if (i == 0) {
                C620733j r10 = this.A0d;
                String str4 = r23.A04;
                C160617ny r9 = C160617ny.A02;
                C160617ny A0M2 = AnonymousClass0x7.A0M(r9, str4);
                char c = 1;
                int A002 = C160617ny.A00(A0M2.A00);
                AnonymousClass7T2 A003 = C159827mW.A00(r10, true);
                C158737kT r5 = new C158737kT(A003.A00(), r10.A0O());
                boolean z = A003.A02;
                if (z) {
                    r3 = new C157407iF(r10.A0A(9));
                    r2 = new C157407iF(r10.A0A(11));
                    str2 = r10.A0A(10);
                    r1 = new C157407iF(r10.A0A(6));
                    r0 = new C157407iF(r10.A0A(8));
                    str = r10.A0A(7);
                } else {
                    r0 = C157407iF.A02;
                    r1 = r0;
                    r2 = r0;
                    r3 = r0;
                    str = str3;
                    str2 = str3;
                }
                String A022 = A0M2.A02(r10);
                r5.A03(A002);
                String A012 = r5.A01();
                if (z) {
                    C157407iF r18 = r0;
                    C157407iF r17 = r1;
                    C149447Mm r16 = A003.A01;
                    A012 = C159827mW.A01(r16, r17, r18, r3, r2, str, str2, A022, A012);
                }
                String A023 = A0M2.A02(r10);
                int length = A012.length();
                int length2 = A023.length();
                if (length < length2 || !A012.substring(0, length2).equals(A023)) {
                    c = 2;
                }
                TextView textView2 = this.A0K;
                if (c == 2) {
                    textView2.setText(str3);
                    textView = this.A0L;
                } else {
                    C85204Fi r03 = this.A0h;
                    C620733j r32 = this.A0d;
                    AnonymousClass3H6 r04 = (AnonymousClass3H6) r03;
                    String str5 = r04.A04;
                    String str6 = r04.A05;
                    if (!AnonymousClass359.A00.contains(str5)) {
                        str6 = AnonymousClass0x7.A0M(r9, str5).A02(r32);
                    }
                    textView2.setText(str6);
                    textView = this.A0L;
                }
            } else if (i == 1) {
                this.A0K.setText(r23.A05);
                textView = this.A0L;
                str3 = ((AnonymousClass3H6) this.A0h).A04;
            } else {
                textView = this.A0L;
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append(" ");
                str3 = AnonymousClass000.A0X(r23.A04, A0o2);
            }
            textView.setText(str3);
        }
        this.A0K.setText(str3);
        textView = this.A0L;
        getContext();
        C85204Fi r05 = this.A0h;
        C620733j r24 = this.A0d;
        AnonymousClass3H6 r06 = (AnonymousClass3H6) r05;
        String str7 = r06.A04;
        str3 = r06.A05;
        if (!AnonymousClass359.A00.contains(str7)) {
            str3 = AnonymousClass0x7.A0M(C160617ny.A02, str7).A02(r24);
        }
        textView.setText(str3);
    }

    public void setBankLogo(Bitmap bitmap) {
        if (bitmap != null) {
            this.A0W.setImageBitmap(bitmap);
        } else {
            this.A0W.setImageResource(R.drawable.bank_logo_placeholder);
        }
    }

    public void setPaymentContactContainerVisibility(int i) {
        this.A0A.setVisibility(i);
    }

    public void setPaymentMethodText(String str) {
        this.A0M.setText(A03(str, R.string.f11nameremoved));
    }

    public void setPaymentTabsVisibility(int i) {
        this.A0S.setVisibility(i);
    }

    public PaymentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A1R = new AnonymousClass9h9(this);
        A09();
    }

    public static /* synthetic */ void A01(AnonymousClass0GH r36, PaymentView paymentView) {
        int i;
        LinearLayout linearLayout;
        int ordinal = r36.ordinal();
        PaymentView paymentView2 = paymentView;
        if (ordinal == 0) {
            C202829me r0 = paymentView2.A0x;
            if (r0 != null) {
                AnonymousClass9QH r6 = (AnonymousClass9QH) r0.Bhf();
                paymentView2.A11 = r6.A03;
                paymentView2.A12 = r6.A08;
                C203769oH r5 = r6.A02;
                paymentView2.A10 = r5;
                paymentView2.A0t = r6.A00;
                AnonymousClass9QF r4 = r6.A04;
                AnonymousClass9OY r3 = r4.A04;
                paymentView2.A0h = r3.A01;
                AnonymousClass9OZ r2 = r6.A06;
                paymentView2.A1N = r2.A01;
                paymentView2.A1J = r6.A0C;
                paymentView2.A16 = r6.A0A;
                paymentView2.A1G = r6.A0B;
                String str = r4.A08;
                String str2 = str;
                paymentView2.A1K = str;
                paymentView2.A1M = r6.A0D;
                paymentView2.A1P = r6.A0E;
                paymentView2.A0z = r6.A01;
                C202199lX r1 = r4.A05;
                paymentView2.A13 = r1;
                paymentView2.A1Q = r6.A07.A00;
                if (Build.VERSION.SDK_INT != 26 || !C154437dA.A00(paymentView2.A0o)) {
                    paymentView2.A11.B48().setRequestedOrientation(1);
                }
                paymentView2.A0A.setOnClickListener(paymentView2);
                C56932sn r12 = paymentView2.A18;
                AnonymousClass4FS r11 = paymentView2.A1E;
                C183538qC r10 = paymentView2.A1F;
                C29361ih r15 = paymentView2.A17;
                AnonymousClass33p r14 = paymentView2.A0c;
                C49252gE r9 = paymentView2.A19;
                paymentView2.A1D = new C162157rM(r14, r15, r12, r9, r11, r10);
                if (r9.A01()) {
                    AnonymousClass10k r112 = (AnonymousClass10k) new AnonymousClass0XL((C17190ui) new C63663Ad(paymentView2.A0o, paymentView2.A1C), paymentView2.A11.B48().BEL()).A01(AnonymousClass10k.class);
                    paymentView2.A1A = r112;
                    paymentView2.A1D.A01 = r112;
                    paymentView2.A1B = new C103645Nu(paymentView2.A0U, r112);
                    paymentView2.A0l.A01((Integer) null);
                }
                AnonymousClass1VX r28 = paymentView2.A0o;
                C106095Xp r31 = paymentView2.A0r;
                C105895Wv r35 = paymentView2.A05;
                C55682qk r362 = paymentView2.A0T;
                AnonymousClass4FV r23 = paymentView2.A0p;
                AnonymousClass5Y0 r21 = paymentView2.A0k;
                C27821ej r19 = paymentView2.A0j;
                C620633i r20 = paymentView2.A0b;
                C620733j r22 = paymentView2.A0d;
                AnonymousClass5IY r24 = paymentView2.A0i;
                C55922r8 r18 = paymentView2.A0s;
                EmojiSearchProvider emojiSearchProvider = paymentView2.A0l;
                AnonymousClass33p r152 = paymentView2.A0c;
                C60152y5 r142 = paymentView2.A15;
                AnonymousClass5PB r13 = paymentView2.A0q;
                AnonymousClass10k r122 = paymentView2.A1A;
                paymentView2.A14 = new C194419Su(paymentView2.A11.B48(), r362, paymentView2.A0V, r20, r152, r22, paymentView2.A0e, r24, r19, r21, emojiSearchProvider, r28, r23, r13, r31, r18, r142, r122, r35);
                boolean z = paymentView2.A1P;
                boolean z2 = paymentView2.A1Q;
                if (z) {
                    paymentView2.A07.setOnClickListener(paymentView2);
                    paymentView2.A0D.setOnClickListener(paymentView2);
                    paymentView2.A09.setOnClickListener(paymentView2);
                    i = 0;
                    if (!z2) {
                        linearLayout = paymentView2.A0D;
                    }
                    linearLayout = paymentView2.A09;
                } else {
                    i = 8;
                    paymentView2.A0D.setVisibility(8);
                    linearLayout = paymentView2.A09;
                }
                linearLayout.setVisibility(i);
                C196409an r113 = paymentView2.A0z;
                if (r113 != null) {
                    paymentView2.A0C(r113, R.id.payment_note_entry_stub, R.id.payment_note_entry_inflated);
                    MentionableEntry mentionableEntry = r113.A0B;
                    ViewGroup A0I2 = C86644Kx.A0I(paymentView2, R.id.mention_attach);
                    C95814uZ r102 = paymentView2.A0t;
                    if (C627336j.A0K(r102) && !paymentView2.A0f.A0O(r102)) {
                        mentionableEntry.A0H(A0I2, paymentView2.A0t, false, true, true);
                    }
                    String str3 = paymentView2.A1J;
                    if (str3 != null) {
                        mentionableEntry.setMentionableText(str3, paymentView2.A1N);
                    }
                    C204249p3.A02(mentionableEntry, paymentView2, 155);
                    AnonymousClass39M r103 = paymentView2.A16;
                    if (r103 != null) {
                        r113.A00(r103, paymentView2.A1G);
                    }
                    r113.A00 = new C195479Xy(mentionableEntry, paymentView2);
                    r113.A0C.A00 = C204249p3.A00(paymentView2, 153);
                }
                View findViewById = paymentView2.findViewById(R.id.gift_icon);
                if (findViewById != null) {
                    findViewById.setOnClickListener(paymentView2);
                }
                paymentView2.A01 = 6;
                paymentView2.A05.setVisibility(8);
                paymentView2.A0C(r4.A03, R.id.send_payment_amount_description_container, R.id.send_payment_amount_description_container_inflated);
                Context context = paymentView2.getContext();
                TabLayout tabLayout = paymentView2.A0S;
                int i2 = r6.A09.A00;
                if (i2 != 0) {
                    tabLayout.A07();
                    AnonymousClass5T2 A042 = tabLayout.A04();
                    A042.A01(R.string.f11nameremoved);
                    tabLayout.A0E(A042);
                    AnonymousClass5T2 A043 = tabLayout.A04();
                    A043.A01(R.string.f11nameremoved);
                    tabLayout.A0E(A043);
                    tabLayout.A0D(paymentView2);
                    AnonymousClass0R8 supportActionBar = ((C009707r) C111095hX.A02(context)).getSupportActionBar();
                    if (i2 == 1) {
                        paymentView2.A0V.removeView(tabLayout);
                        tabLayout.setElevation(0.0f);
                        if (supportActionBar != null) {
                            supportActionBar.A0Q(false);
                            supportActionBar.A0O(true);
                            supportActionBar.A0N(true);
                            supportActionBar.A0H(tabLayout, new C001902e(-1, -1));
                        }
                    } else if (supportActionBar != null) {
                        supportActionBar.A08(0.0f);
                    }
                    tabLayout.setVisibility(0);
                    AnonymousClass5T2 A052 = tabLayout.A05(paymentView2.A00);
                    C626936e.A06(A052);
                    A052.A00();
                }
                if (paymentView2.A11.BIL()) {
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    C196409an r92 = paymentView2.A0z;
                    if (r92 != null) {
                        A0s2.add(r92.A0B);
                    }
                    C194419Su r104 = paymentView2.A14;
                    C184508rw r212 = r2.A00;
                    PaymentAmountInputField paymentAmountInputField = paymentView2.A0y;
                    Activity activity = r104.A00;
                    C105895Wv r153 = r104.A0I;
                    C55682qk r143 = r104.A01;
                    C620633i r132 = r104.A03;
                    AnonymousClass33p r123 = r104.A04;
                    C55682qk r17 = r143;
                    AnonymousClass0x2.A1H(new AnonymousClass97B(activity, r17, r104.A02, r132, r123, r212, paymentAmountInputField, r153, A0s2), r104.A0J, 1);
                } else {
                    paymentView2.A14.A00();
                    paymentView2.A0y.setFocusable(false);
                }
                paymentView2.A0y.setSelection(0);
                paymentView2.A0y.setLongClickable(false);
                PaymentAmountInputField paymentAmountInputField2 = paymentView2.A0y;
                paymentAmountInputField2.A0F = new AnonymousClass9dQ(r5, paymentView2);
                paymentAmountInputField2.setAutoScaleTextSize(r4.A0A);
                PaymentAmountInputField paymentAmountInputField3 = paymentView2.A0y;
                boolean z3 = r4.A0C;
                paymentAmountInputField3.A0L = z3;
                paymentAmountInputField3.setAllowDecimal(r4.A09);
                paymentView2.A0y.A0G = r1;
                paymentView2.A0D(r4);
                paymentView2.A0y.A08 = paymentView2.A0F;
                paymentView2.setAmountInputData(r3);
                if (TextUtils.isEmpty(paymentView2.A1I)) {
                    if (!TextUtils.isEmpty(paymentView2.A1L)) {
                        paymentView2.A1I = paymentView2.A1L;
                    } else {
                        String str4 = r4.A06;
                        if (TextUtils.isEmpty(str4)) {
                            str4 = r4.A07;
                            if (TextUtils.isEmpty(str4)) {
                                paymentView2.A1I = "0";
                            }
                        }
                        paymentView2.A1I = str4;
                    }
                }
                if (!TextUtils.isEmpty(paymentView2.A1I)) {
                    String str5 = paymentView2.A1I;
                    if (!"0".equals(str5)) {
                        if (r4.A0B) {
                            if (z3) {
                                str5 = str5.replaceAll(PaymentAmountInputField.A02(paymentView2.A0d), "");
                            }
                            AnonymousClass39Q A0B2 = C1899693i.A0B(paymentView2.A0h, str5);
                            if (A0B2 != null) {
                                paymentView2.A1I = paymentView2.A0h.B3U(paymentView2.A0d, A0B2);
                            }
                        }
                        String A0m2 = C18290x4.A0m(paymentView2.A0y);
                        String str6 = paymentView2.A1I;
                        if (!A0m2.equals(str6)) {
                            paymentView2.A0y.setText(str6);
                        }
                    }
                }
                if (!paymentView2.A11.BIL()) {
                    paymentView2.A14.A00();
                    paymentView2.A0y.setOnClickListener(new C195439Xu(paymentView2, TextUtils.isEmpty(str2)));
                    paymentView2.A0y.setHintTextColor(AnonymousClass0Y8.A04(paymentView2.getContext(), AnonymousClass5Yj.A07(paymentView2)));
                }
                paymentView2.A0y.setHint(paymentView2.A1I);
                if (r4.A07 != null || r4.A06 == null || !paymentView2.A11.BIt()) {
                    View view = paymentView2.A03;
                    if (view == null || view.getId() == -1 || paymentView2.findViewById(paymentView2.A03.getId()) == null) {
                        paymentView2.A0y.getViewTreeObserver().addOnGlobalLayoutListener(new C204929q9(paymentView2, 2));
                    } else {
                        paymentView2.A14.A00();
                        paymentView2.findViewById(paymentView2.A03.getId()).requestFocus();
                        View view2 = paymentView2.A03;
                        if (view2 instanceof WaEditText) {
                            ((WaEditText) view2).A07(true);
                        } else if (view2.onCheckIsTextEditor()) {
                            InputMethodManager A0Q2 = paymentView2.A0b.A0Q();
                            C626936e.A06(A0Q2);
                            A0Q2.showSoftInput(paymentView2.A03, 0);
                        }
                    }
                } else {
                    paymentView2.A11.B48().getWindow().setSoftInputMode(3);
                }
                if (!paymentView2.A0y.hasOnClickListeners()) {
                    C204249p3.A02(paymentView2.A0y, paymentView2, 154);
                }
                paymentView2.setInitialTabConfiguration(r6);
                paymentView2.A07();
                if (!paymentView2.A11.BIt()) {
                    AnonymousClass9PQ r16 = r6.A05;
                    if (r16.A03) {
                        paymentView2.A0N.setVisibility(0);
                        C194419Su r133 = paymentView2.A14;
                        C194589Tn r172 = r16.A02;
                        ImageView imageView = paymentView2.A08;
                        AnonymousClass6Z3 r124 = paymentView2.A0R;
                        PaymentAmountInputField paymentAmountInputField4 = paymentView2.A0y;
                        TextView textView = paymentView2.A0K;
                        TextView textView2 = paymentView2.A0L;
                        TextView A092 = AnonymousClass002.A09(paymentView2, R.id.payments_send_payment_error_text);
                        C196409an r144 = paymentView2.A0z;
                        AnonymousClass39R r8 = r16.A00;
                        Activity activity2 = r133.A00;
                        C105895Wv r62 = r133.A0I;
                        C55682qk r52 = r133.A01;
                        C620633i r32 = r133.A03;
                        AnonymousClass33p r25 = r133.A04;
                        KeyboardPopupLayout keyboardPopupLayout = r133.A02;
                        C620633i r242 = r32;
                        AnonymousClass33p r252 = r25;
                        AnonymousClass6Z3 r213 = r124;
                        C55682qk r222 = r52;
                        TextView textView3 = textView;
                        TextView textView4 = textView2;
                        Activity activity3 = activity2;
                        ImageView imageView2 = imageView;
                        AnonymousClass97C r154 = new AnonymousClass97C(activity3, imageView2, textView3, textView4, A092, r213, r222, keyboardPopupLayout, r242, r252, r16.A01, r172, paymentAmountInputField4, r144, r4, r62);
                        if (r8 != null) {
                            r154.Be0(r8);
                        }
                        AnonymousClass0x2.A1H(r154, r133.A0J, 2);
                    }
                }
            }
        } else if (ordinal == 3) {
            C196409an r02 = paymentView2.A0z;
            if (r02 != null && r02.A0B.hasFocus()) {
                paymentView2.A14.A00();
            }
        } else if (ordinal == 2) {
            C194419Su r110 = paymentView2.A14;
            C184508rw A002 = NumberEntryKeyboard.A00(paymentView2.A0d);
            HashMap hashMap = r110.A0J;
            Integer A0f2 = AnonymousClass001.A0f();
            if (hashMap.containsKey(A0f2)) {
                AnonymousClass4Rn r111 = (AnonymousClass4Rn) hashMap.get(A0f2);
                if (r111 instanceof AnonymousClass97B) {
                    ((AnonymousClass97B) r111).A01.setCustomKey(A002);
                }
            }
            if (paymentView2.A0y != null && !paymentView2.A0d.A0O().equals(paymentView2.A0y.A0D.A0O())) {
                PaymentAmountInputField paymentAmountInputField5 = paymentView2.A0y;
                paymentAmountInputField5.A0D = paymentView2.A0d;
                paymentAmountInputField5.setText((CharSequence) null);
            }
        } else if (ordinal == 5) {
            HashMap hashMap2 = paymentView2.A14.A0J;
            Iterator A0u2 = AnonymousClass001.A0u(hashMap2);
            while (A0u2.hasNext()) {
                PopupWindow popupWindow = (PopupWindow) hashMap2.get(AnonymousClass001.A0w(A0u2).getKey());
                if (popupWindow != null && popupWindow.isShowing()) {
                    popupWindow.dismiss();
                }
                A0u2.remove();
            }
            C162157rM r03 = paymentView2.A1D;
            r03.A0B.A07(r03.A09);
            if (!paymentView2.A11.BIt() && ((AnonymousClass9DC) paymentView2.A12.A00).A0a != null && paymentView2.A0o.A0X(811)) {
                ((AnonymousClass9DC) paymentView2.A12.A00).A0a.A00();
            }
            if (paymentView2.A0H()) {
                paymentView2.A0n.A05();
            }
        }
    }

    public final SpannableStringBuilder A03(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String string = this.A11.B48().getString(i);
        Object[] A0M2 = AnonymousClass002.A0M();
        C18280x3.A19(string, str, A0M2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format("%s %s", A0M2));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.A11.B48().getResources().getColor(R.color.f5nameremoved));
        int length = string.length();
        int i2 = length + 1;
        spannableStringBuilder.setSpan(foregroundColorSpan, 0, i2, 0);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.A11.B48().getResources().getColor(AnonymousClass5Yj.A02(this.A11.B48(), R.attr.f3nameremoved, R.color.f5nameremoved))), i2, length + str.length() + 1, 0);
        return spannableStringBuilder;
    }

    public final void A09() {
        int i;
        LayoutInflater A0D2 = C18280x3.A0D(this);
        if (A0H()) {
            i = R.layout.f8nameremoved;
        } else {
            boolean A002 = C154437dA.A00(this.A0o);
            i = R.layout.f8nameremoved;
            if (A002) {
                i = R.layout.f8nameremoved;
            }
        }
        View A0h2 = C86664Kz.A0h(A0D2, this, i);
        this.A0K = C18300x5.A0G(A0h2, R.id.payment_currency_symbol_prefix);
        this.A0L = C18300x5.A0G(A0h2, R.id.payment_currency_symbol_suffix);
        this.A0H = (TextSwitcher) C06560Yg.A02(A0h2, R.id.contact_name);
        ImageView A0E2 = AnonymousClass0x9.A0E(A0h2, R.id.expand_contact_details_button);
        this.A06 = A0E2;
        A0E2.setColorFilter(getResources().getColor(R.color.f5nameremoved));
        this.A0I = C18300x5.A0G(A0h2, R.id.contact_aux_info);
        this.A0X = (ThumbnailButton) C06560Yg.A02(A0h2, R.id.contact_photo);
        this.A0W = (ThumbnailButton) C06560Yg.A02(A0h2, R.id.bank_logo);
        ImageView A0E3 = AnonymousClass0x9.A0E(A0h2, R.id.expand_details_button);
        this.A07 = A0E3;
        A0E3.setColorFilter(getResources().getColor(R.color.f5nameremoved));
        this.A0G = (TextSwitcher) C06560Yg.A02(A0h2, R.id.payment_contact_label);
        this.A0D = C86654Ky.A0N(A0h2, R.id.payment_method_container);
        this.A0B = C86654Ky.A0N(A0h2, R.id.payment_contact_container_shimmer);
        this.A0E = C86654Ky.A0N(A0h2, R.id.payment_method_container_shimmer);
        this.A0P = (ShimmerFrameLayout) C06560Yg.A02(this.A0B, R.id.payment_method_name_shimmer);
        this.A0Q = (ShimmerFrameLayout) C06560Yg.A02(this.A0E, R.id.payment_method_name_shimmer);
        this.A09 = C86654Ky.A0N(A0h2, R.id.add_payment_method_container);
        this.A05 = C86654Ky.A0L(A0h2, R.id.gift_details);
        this.A0y = (PaymentAmountInputField) C06560Yg.A02(A0h2, R.id.send_payment_amount);
        this.A0M = C18300x5.A0G(A0h2, R.id.bank_account_name);
        this.A0J = C18300x5.A0G(A0h2, R.id.payments_send_payment_error_text);
        this.A0V = (KeyboardPopupLayout) C06560Yg.A02(A0h2, R.id.send_payment_keyboard_popup_layout);
        C06560Yg.A02(A0h2, R.id.send_payment_amount_error_text_container).setOnClickListener(this);
        this.A0F = C86654Ky.A0N(A0h2, R.id.send_payment_amount_container);
        this.A0A = C86654Ky.A0N(A0h2, R.id.payment_contact_container);
        this.A0C = C86654Ky.A0N(A0h2, R.id.send_payment_details);
        TabLayout tabLayout = (TabLayout) C06560Yg.A02(A0h2, R.id.payment_tabs);
        this.A0S = tabLayout;
        tabLayout.setVisibility(8);
        if (A0H()) {
            this.A0O = (CoordinatorLayout) C06560Yg.A02(this, R.id.coordinator);
        }
        int A042 = AnonymousClass0Y8.A04(getContext(), R.color.f5nameremoved);
        C107335b8.A0E(this.A07, A042);
        this.A0Z = this.A0a.A06(getContext(), "payment-view");
        C107335b8.A0E(AnonymousClass0x9.A0E(A0h2, R.id.add_payment_method_logo), A042);
        KeyboardPopupLayout keyboardPopupLayout = this.A0V;
        Objects.requireNonNull(keyboardPopupLayout);
        keyboardPopupLayout.setKeyboardPopupBackgroundColor(AnonymousClass0Y8.A04(getContext(), AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved)));
        AutoTransition autoTransition = new AutoTransition();
        this.A02 = autoTransition;
        autoTransition.setDuration(100);
        this.A0N = (Group) C06560Yg.A02(A0h2, R.id.expressive_payment_widget_group);
        this.A08 = AnonymousClass0x9.A0E(A0h2, R.id.expressive_theme_background);
        AnonymousClass6Z3 r1 = (AnonymousClass6Z3) C06560Yg.A02(A0h2, R.id.expression_theme_selection);
        this.A0R = r1;
        C203969ob.A00(r1, this, 10);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.A04 = alphaAnimation;
        alphaAnimation.setDuration(500);
        this.A04.setAnimationListener(new AnonymousClass972(this));
        PathInterpolator A003 = C05030Rp.A00(0.16f, 1.0f, 0.3f, 1.0f);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), 17432577);
        loadAnimation.setInterpolator(A003);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), 17432576);
        loadAnimation2.setInterpolator(A003);
        loadAnimation2.setDuration((long) getResources().getInteger(17694720));
        this.A0H.setOutAnimation(loadAnimation);
        this.A0H.setInAnimation(loadAnimation2);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.expand_details_button || view.getId() == R.id.payment_method_container) {
            this.A10.BXn();
        } else if (view.getId() == R.id.payment_contact_container) {
            if (this.A00 == 1 || this.A0D.getVisibility() == 0 || !this.A1P) {
                this.A10.BXm();
                return;
            }
            TransitionManager.beginDelayedTransition((ViewGroup) findViewById(R.id.send_payment_details), this.A02);
            A08();
        } else if (view.getId() == R.id.send_payment_amount || view.getId() == R.id.send_payment_note) {
            this.A14.A00();
        } else if (view.getId() == R.id.send_payment_amount_error_text_container) {
            this.A0y.callOnClick();
        } else if (view.getId() == R.id.add_payment_method_container) {
            this.A10.BM9();
        } else if (view.getId() == R.id.gift_icon) {
            this.A10.BU6();
            View findViewById = findViewById(R.id.gift_tool_tip);
            this.A0u.A03().getBoolean("payment_incentive_tooltip_viewed", false);
            findViewById.setVisibility(8);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0Z.A00();
    }

    public void Bdu(AnonymousClass5T2 r1) {
    }

    public void setPaymentAmount(String str) {
        this.A1I = str;
    }

    public PaymentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A02();
        this.A1R = new AnonymousClass9h9(this);
        A09();
    }

    public PaymentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
        this.A1R = new AnonymousClass9h9(this);
        A09();
    }

    public PaymentView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }

    public PaymentView(Context context) {
        super(context);
        A02();
        this.A1R = new AnonymousClass9h9(this);
        A09();
    }
}
