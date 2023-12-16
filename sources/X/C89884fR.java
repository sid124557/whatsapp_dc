package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.bonsai.BonsaiConversationTitleViewModel;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.util.List;

/* renamed from: X.4fR  reason: invalid class name and case insensitive filesystem */
public abstract class C89884fR extends AnonymousClass5c4 implements Application.ActivityLifecycleCallbacks {
    public Configuration A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public ViewGroup A05;
    public ViewGroup A06;
    public ViewStub A07;
    public ViewTreeObserver.OnGlobalLayoutListener A08;
    public ViewTreeObserver.OnGlobalLayoutListener A09;
    public ImageView A0A;
    public ProgressBar A0B;
    public TextView A0C;
    public TextView A0D;
    public Toolbar A0E;
    public TextEmojiLabel A0F;
    public AnonymousClass5YB A0G;
    public AnonymousClass5YB A0H;
    public WaImageView A0I;
    public AnonymousClass55D A0J;
    public AnonymousClass74O A0K;
    public AnonymousClass3ZH A0L;
    public C40532Gt A0M;
    public C43642Sx A0N;
    public C149867Of A0O;
    public AnonymousClass5UY A0P;
    public boolean A0Q;
    public boolean A0R = false;
    public boolean A0S = false;
    public final View.OnClickListener A0T = new C109335eS(this, 40);
    public final C009707r A0U;
    public final C53582nK A0V;
    public final C69263Wi A0W;
    public final C56972sr A0X;
    public final AnonymousClass64J A0Y;
    public final AnonymousClass5MG A0Z;
    public final AnonymousClass4CK A0a = new C107645be(this, 1);
    public final C29291ia A0b;
    public final C54232oO A0c = new C1233167y(this, 5);
    public final C29301ib A0d;
    public final AnonymousClass5UX A0e;
    public final C56602sG A0f = AnonymousClass681.A00(this, 16);
    public final C29421in A0g;
    public final AnonymousClass5ZU A0h;
    public final C613330g A0i;
    public final C620733j A0j;
    public final C50202hn A0k;
    public final C56982ss A0l;
    public final C66473Lo A0m;
    public final AnonymousClass5Y0 A0n;
    public final AnonymousClass1VX A0o;
    public final C55702qm A0p = new AnonymousClass901(this, 3);
    public final C29241iV A0q;
    public final C95814uZ A0r;
    public final C56072rN A0s;
    public final C187958y5 A0t;
    public final AnonymousClass4FS A0u;
    public final Runnable A0v = new C69973Zj(this, 42);
    public final Runnable A0w = new C69973Zj(this, 41);

    public static BonsaiConversationTitleViewModel A00(C92134m9 r0) {
        return (BonsaiConversationTitleViewModel) r0.A03.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0084, code lost:
        if (r2.A0K.A0D(r2.A0P) != false) goto L_0x00d6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.C92164mC
            if (r0 == 0) goto L_0x000e
            r0 = r10
            X.4mC r0 = (X.C92164mC) r0
            r0.A0D()
            r0.A0F()
        L_0x000d:
            return
        L_0x000e:
            boolean r0 = r10 instanceof X.C92124m8
            if (r0 == 0) goto L_0x0027
            r3 = r10
            X.4m8 r3 = (X.C92124m8) r3
            X.2hS r0 = r3.A00
            java.lang.String r2 = r0.A01
            if (r2 == 0) goto L_0x000d
            com.whatsapp.TextEmojiLabel r1 = r3.A0F
            r0 = 0
            r1.A0K(r0, r2)
            com.whatsapp.TextEmojiLabel r0 = r3.A0F
            X.C86664Kz.A1S(r0)
            return
        L_0x0027:
            boolean r0 = r10 instanceof X.C92154mB
            if (r0 == 0) goto L_0x013e
            r2 = r10
            X.4mB r2 = (X.C92154mB) r2
            X.2nK r9 = r2.A0V
            X.3ZH r0 = r2.A0L
            java.lang.String r1 = r9.A01(r0)
            X.3ZH r8 = r2.A0L
            boolean r7 = r8.A0j
            if (r7 != 0) goto L_0x004a
            if (r1 == 0) goto L_0x004a
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            r0.setText(r1)
            com.whatsapp.TextEmojiLabel r3 = r2.A0F
            r0 = 0
        L_0x0046:
            r3.setVisibility(r0)
            return
        L_0x004a:
            X.74O r0 = r2.A0K
            if (r0 == 0) goto L_0x000d
            long r5 = java.lang.System.currentTimeMillis()
            r3 = 5000(0x1388, double:2.4703E-320)
            long r0 = r2.A01
            long r5 = r5 - r0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x006d
            java.lang.String r1 = r9.A01(r8)
            X.3ZH r3 = r2.A0L
            boolean r0 = r3.A0j
            if (r0 != 0) goto L_0x00c7
            if (r1 == 0) goto L_0x00cd
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            r0.setText(r1)
            return
        L_0x006d:
            if (r7 != 0) goto L_0x00c7
            X.2rN r3 = r2.A0Q
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x0087
            int r1 = r2.A00
            r0 = 3
            if (r1 != r0) goto L_0x0087
            X.2sj r1 = r2.A0K
            X.1fJ r0 = r2.A0P
            boolean r0 = r1.A0D(r0)
            if (r0 == 0) goto L_0x0101
            goto L_0x00d6
        L_0x0087:
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x00b0
            int r1 = r2.A00
            r0 = 2
            if (r1 == r0) goto L_0x0095
            r0 = 6
            if (r1 != r0) goto L_0x00b0
        L_0x0095:
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            X.C86634Kw.A1I(r0)
            X.2so r3 = r2.A0D
            X.1fJ r1 = r2.A0P
            int r0 = r2.A00
            boolean r0 = r3.A0K(r1, r0)
            if (r0 == 0) goto L_0x000d
            r1 = 3
            X.6A8 r0 = new X.6A8
            r0.<init>(r2, r1)
            r2.A0D(r0)
            return
        L_0x00b0:
            X.3ZH r0 = r2.A0L
            boolean r0 = r0.A0e
            if (r0 == 0) goto L_0x00c1
            X.2sj r1 = r2.A0K
            X.1fJ r0 = r2.A0P
            boolean r0 = r1.A0D(r0)
            if (r0 == 0) goto L_0x00c1
            goto L_0x00d6
        L_0x00c1:
            com.whatsapp.TextEmojiLabel r1 = r2.A0F
            r0 = 2131894304(0x7f122020, float:1.942341E38)
            goto L_0x00db
        L_0x00c7:
            com.whatsapp.TextEmojiLabel r1 = r2.A0F
            r0 = 2131895578(0x7f12251a, float:1.9425993E38)
            goto L_0x00db
        L_0x00cd:
            boolean r0 = r3.A0e
            r1 = 3
            if (r0 == 0) goto L_0x00df
            int r0 = r2.A00
            if (r0 == r1) goto L_0x00df
        L_0x00d6:
            com.whatsapp.TextEmojiLabel r1 = r2.A0F
            r0 = 2131891402(0x7f1214ca, float:1.9417523E38)
        L_0x00db:
            r1.setText(r0)
            return
        L_0x00df:
            X.2hS r4 = r2.A0H
            java.lang.String r0 = r4.A01
            if (r0 == 0) goto L_0x000d
            int r0 = r2.A00
            if (r0 != r1) goto L_0x0107
            X.2lX r0 = r2.A0O
            boolean r0 = r0.A00(r3)
            r1 = 1
            if (r0 != 0) goto L_0x0107
            X.3Lq r0 = r2.A0L
            int r0 = r0.A02(r3)
            if (r0 == r1) goto L_0x0107
            X.2sj r1 = r2.A0K
            X.1fJ r0 = r2.A0P
            r1.A0D(r0)
        L_0x0101:
            com.whatsapp.TextEmojiLabel r1 = r2.A0F
            r0 = 2131887936(0x7f120740, float:1.9410493E38)
            goto L_0x00db
        L_0x0107:
            X.2lX r1 = r2.A0O
            X.3ZH r0 = r2.A0L
            boolean r0 = r1.A01(r0)
            if (r0 != 0) goto L_0x000d
            X.3ZH r3 = r2.A0L
            boolean r0 = r1.A00(r3)
            r1 = 1
            if (r0 != 0) goto L_0x000d
            X.3Lq r0 = r2.A0L
            int r0 = r0.A02(r3)
            if (r0 == r1) goto L_0x000d
            X.1VX r1 = r2.A0o
            X.3ZH r0 = r2.A0L
            boolean r0 = X.AnonymousClass5YT.A00(r0, r1)
            com.whatsapp.TextEmojiLabel r3 = r2.A0F
            if (r0 == 0) goto L_0x0132
            r0 = 8
            goto L_0x0046
        L_0x0132:
            java.lang.String r1 = r4.A01
            r0 = 0
            r3.A0K(r0, r1)
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            X.C86664Kz.A1S(r0)
            return
        L_0x013e:
            r10.A05()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89884fR.A02():void");
    }

    public final void A04() {
        if (this.A0N == null || this.A0O == null || this.A0M == null) {
            C64333Db A012 = C389229y.A01(this.A0U);
            this.A0N = A012.Any();
            this.A0O = (C149867Of) A012.AcK.A00.A6c.get();
            this.A0M = (C40532Gt) A012.AIJ.get();
        }
    }

    public final void A05() {
        if (this.A0h.A0d(this.A0L) || this.A0L.A0F == null) {
            this.A0H.A06(this.A0L.A0V() ? 1 : 0);
        }
    }

    public void A06(View.OnClickListener onClickListener) {
        this.A06.setOnClickListener(onClickListener);
        View view = this.A03;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public boolean A07() {
        int i;
        if (!(this instanceof C92164mC)) {
            AnonymousClass5ZU r3 = this.A0h;
            boolean A0c2 = r3.A0c(this.A0L);
            AnonymousClass3ZH r1 = this.A0L;
            if (r1.A0F == null || (!A0c2 ? !r1.A0P() : !r1.A0R() || !((i = r1.A08) == 2 || i == 3)) || r3.A0d(this.A0L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void A09() {
        TextView textView;
        AnonymousClass3ZH A012 = this.A0m.A01(this.A0r);
        this.A0L = A012;
        if (!C56972sr.A08(this.A0X, A012) || !C86644Kx.A1Z(this.A0o)) {
            this.A0H.A08(this.A0L);
        } else {
            this.A0H.A09(this.A0L, (C107075ae) null, (List) null, 1.0f);
        }
        WaImageView waImageView = this.A0I;
        if (((waImageView != null && waImageView.getVisibility() == 0) || (this.A0R && (((WDSProfilePhoto) this.A0A).A04 instanceof C139986sy))) && (textView = this.A0D) != null && !C86664Kz.A1V(textView)) {
            Context context = this.A0D.getContext();
            TextView textView2 = this.A0D;
            C86624Kv.A0h(context, textView2, new Object[]{textView2.getText()}, R.string.f11nameremoved);
        }
        AnonymousClass55D r0 = this.A0J;
        if (r0 != null) {
            r0.A0D(true);
        }
        A0B(this.A0L);
        A02();
    }

    public void A0A(Activity activity) {
        C009707r r3 = this.A0U;
        this.A05 = A08(C86634Kw.A0R(r3).A02());
        A03();
        this.A03 = this.A05.findViewById(R.id.contact_photo_view);
        ImageView A0F2 = AnonymousClass0x9.A0F(this.A05, R.id.conversation_contact_photo);
        this.A0A = A0F2;
        if (A0F2 != null && this.A0R) {
            C107295b4.A02(A0F2);
        }
        this.A0I = C86664Kz.A11(this.A05, R.id.ephemeral_status);
        this.A06 = C86644Kx.A0J(this.A05, R.id.conversation_contact);
        this.A0D = C18300x5.A0G(this.A05, R.id.conversation_contact_name);
        AnonymousClass64J r4 = this.A0Y;
        AnonymousClass5YB A002 = AnonymousClass5YB.A00(this.A06, r4, R.id.conversation_contact_name);
        this.A0H = A002;
        TextEmojiLabel textEmojiLabel = A002.A02;
        C69263Wi r5 = this.A0W;
        this.A09 = new C109975fU(textEmojiLabel, r5, this.A0w);
        this.A0H.A02.getViewTreeObserver().addOnGlobalLayoutListener(this.A09);
        View findViewById = this.A06.findViewById(R.id.conversation_contact_status_holder);
        this.A04 = findViewById;
        if (findViewById != null) {
            this.A08 = new C109965fT(findViewById, r5, this.A0v);
            this.A04.getViewTreeObserver().addOnGlobalLayoutListener(this.A08);
            this.A0G = AnonymousClass5YB.A00(this.A04, r4, R.id.business_name);
        }
        this.A02 = this.A06.findViewById(R.id.business_holder);
        this.A0F = C86644Kx.A0M(this.A06, R.id.conversation_contact_status);
        this.A0C = AnonymousClass002.A09(this.A06, R.id.business_separator);
        View findViewById2 = this.A05.findViewById(R.id.conversation_interop_profile_photo);
        if (findViewById2 != null) {
            this.A0P = new AnonymousClass5UY(findViewById2);
        }
        this.A06.setClickable(true);
        this.A07 = C86664Kz.A0n(this.A05, R.id.change_photo_progress_stub);
        Toolbar toolbar = this.A0E;
        if (toolbar != null) {
            toolbar.addView(this.A05);
        } else {
            C86634Kw.A0R(r3).A0O(true);
            if (!(this instanceof C92134m9) || this.A00.orientation == 2) {
                C86634Kw.A0R(r3).A0G(this.A05);
            } else {
                C86634Kw.A0R(r3).A0H(this.A05, new C001902e(-1, -2, 1));
            }
        }
        if (C1001059l.A07) {
            AnonymousClass5YB r0 = this.A0H;
            if (r0 != null) {
                AnonymousClass0Y9.A06(r0.A02, R.style.f12nameremoved);
            }
            AnonymousClass0Y9.A06(this.A0F, R.style.f12nameremoved);
            AnonymousClass5YB r02 = this.A0G;
            if (r02 != null) {
                AnonymousClass0Y9.A06(r02.A02, R.style.f12nameremoved);
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
        AnonymousClass55D r1 = this.A0J;
        if (r1 != null) {
            r1.A0D(true);
            this.A0J = null;
        }
        this.A0g.A07(this.A0f);
        this.A0d.A07(this.A0c);
        this.A0b.A07(this.A0a);
        this.A0q.A07(this.A0p);
    }

    public C89884fR(C009707r r4, C53582nK r5, C69263Wi r6, C56972sr r7, AnonymousClass64J r8, AnonymousClass5MG r9, C29291ia r10, C29301ib r11, AnonymousClass5UX r12, C29421in r13, AnonymousClass5ZU r14, C613330g r15, C620733j r16, C50202hn r17, C56982ss r18, C66473Lo r19, AnonymousClass3ZH r20, AnonymousClass5Y0 r21, AnonymousClass1VX r22, C29241iV r23, C95814uZ r24, C56072rN r25, C187958y5 r26, AnonymousClass4FS r27) {
        this.A0U = r4;
        this.A0o = r22;
        this.A0W = r6;
        this.A0X = r7;
        this.A0u = r27;
        this.A0l = r18;
        this.A0n = r21;
        this.A0e = r12;
        this.A0V = r5;
        this.A0t = r26;
        this.A0h = r14;
        this.A0j = r16;
        this.A0s = r25;
        this.A0Z = r9;
        this.A0g = r13;
        this.A0d = r11;
        this.A0b = r10;
        this.A0i = r15;
        this.A0m = r19;
        this.A0q = r23;
        this.A0Y = r8;
        this.A0r = r24;
        this.A0L = r20;
        this.A0k = r17;
    }

    public void A03() {
        int i = R.id.back;
        if (this.A0R) {
            i = R.id.whatsapp_toolbar_home;
        }
        View findViewById = this.A05.findViewById(i);
        this.A01 = findViewById;
        if (findViewById != null) {
            C107295b4.A02(findViewById);
            if (Build.VERSION.SDK_INT > 21) {
                int paddingLeft = this.A01.getPaddingLeft();
                int paddingRight = this.A01.getPaddingRight();
                View view = this.A01;
                C620733j r2 = this.A0j;
                view.setBackground(AnonymousClass0x7.A0J(C86634Kw.A0R(this.A0U).A02(), r2, R.drawable.conversation_navigate_up_background));
                C107555bV.A05(this.A01, r2, paddingLeft, paddingRight);
            }
            this.A01.setOnClickListener(this.A0T);
        }
    }

    public ViewGroup A08(Context context) {
        int i = R.layout.f8nameremoved;
        boolean A042 = C106545Zk.A04(this.A0o, C58422vE.A01, 6218);
        this.A0R = A042;
        if (A042) {
            i = R.layout.f8nameremoved;
        }
        return (ViewGroup) C86604Kt.A0F(LayoutInflater.from(context), i);
    }

    public void A0B(AnonymousClass3ZH r9) {
        A04();
        AnonymousClass3ZH r6 = r9;
        if (r9 != null) {
            this.A0A.setVisibility(0);
            AnonymousClass5UY r0 = this.A0P;
            if (r0 != null) {
                r0.A06(8);
            }
            AnonymousClass5UX r3 = this.A0e;
            C56072rN r7 = this.A0s;
            AnonymousClass55D r1 = new AnonymousClass55D(this.A0A, r3, this.A0i, new AnonymousClass7DZ(this), r6, r7);
            this.A0J = r1;
            AnonymousClass0x7.A1B(r1, this.A0u);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.A00 = AnonymousClass001.A0M(activity);
        this.A0L = this.A0m.A01(this.A0r);
        A0A(activity);
        this.A0g.A06(this.A0f);
        this.A0d.A06(this.A0c);
        this.A0b.A06(this.A0a);
        this.A0q.A06(this.A0p);
    }

    public void onActivityResumed(Activity activity) {
        A09();
        this.A0F.setSelected(true);
    }

    public void onActivityStopped(Activity activity) {
        TextEmojiLabel textEmojiLabel;
        super.onActivityStopped(activity);
        AnonymousClass5YB r0 = this.A0H;
        if (!(r0 == null || (textEmojiLabel = r0.A02) == null)) {
            textEmojiLabel.getViewTreeObserver().removeOnGlobalLayoutListener(this.A09);
        }
        View view = this.A04;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.A08);
        }
    }
}
