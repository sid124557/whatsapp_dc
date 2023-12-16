package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.5YA  reason: invalid class name */
public final class AnonymousClass5YA {
    public static final AnonymousClass21S A0K = AnonymousClass21S.A0C;
    public final C111095hX A00;
    public final C69263Wi A01;
    public final C620733j A02;
    public final AnonymousClass4FS A03;
    public final C113925mD A04;
    public final C29161iN A05;
    public final C103345Mn A06;
    public final C183538qC A07;
    public final C183538qC A08;
    public final C183538qC A09;
    public final C183538qC A0A;
    public final C183538qC A0B;
    public final C183538qC A0C;
    public final C183538qC A0D;
    public final C183538qC A0E;
    public final C183538qC A0F;
    public final C183538qC A0G;
    public final C183538qC A0H;
    public final C183538qC A0I;
    public final C183538qC A0J;

    public final void A02(Context context, C1000759i r9, Integer num, Integer num2, String str, boolean z) {
        C105945Xa A002;
        int i;
        int i2;
        AnonymousClass54E r2;
        String str2 = str;
        StringBuilder A0g = C18280x3.A0g(str, 1);
        A0g.append("XFamilyCrosspostManager/handleErrorLinkingWithSnackbarMessage/errorCode: ");
        A0g.append(num);
        A0g.append(", errorSubCode: ");
        A0g.append(num2);
        C18260x0.A1N(A0g, ", exception: ", r9);
        if (r9 != null) {
            if (C162457s7.A0P(r9.getClass(), AnonymousClass57M.class)) {
                A002 = A00(this);
                i = 0;
                i2 = R.string.f11nameremoved;
            }
            A002 = A00(this);
            i = 0;
            i2 = R.string.f11nameremoved;
        } else {
            if (num2 != null) {
                int intValue = num2.intValue();
                if (intValue != 459) {
                    if (intValue == 467 || intValue == 463) {
                        A002 = A00(this);
                        i = 0;
                        i2 = R.string.f11nameremoved;
                    } else if (intValue != 464) {
                        return;
                    }
                }
            } else {
                if (num != null) {
                    int intValue2 = num.intValue();
                    if (intValue2 == -1) {
                        A002 = A00(this);
                        i = 0;
                        i2 = R.string.f11nameremoved;
                    } else if (!(intValue2 == 4 || intValue2 == 17)) {
                        if (intValue2 != 190) {
                            if (!(intValue2 == 341 || intValue2 == 368)) {
                                if (intValue2 != 3463126) {
                                    A002 = A00(this);
                                    i = 0;
                                    i2 = R.string.f11nameremoved;
                                }
                            }
                        }
                    }
                }
                A002 = A00(this);
                i = 0;
                i2 = R.string.f11nameremoved;
            }
            A002 = A00(this);
            i2 = R.string.f11nameremoved;
            i = R.string.f11nameremoved;
            r2 = new AnonymousClass54E(A002, 38, context);
            A002.A01(r2, str2, i2, i, z);
        }
        r2 = null;
        A002.A01(r2, str2, i2, i, z);
    }

    public final void A06(View view, AnonymousClass0O1 r8, C89654ea r9, C108895dj r10, AnonymousClass66O r11) {
        View.OnClickListener r0;
        C162457s7.A0J(view, 0);
        ImageView A0J2 = C86604Kt.A0J(view, R.id.linking_fb_icon);
        TextView A0I2 = AnonymousClass0x2.A0I(view, R.id.default_status_privacy_fb_crossposting_setting_text);
        View A0E2 = C18280x3.A0E(view, R.id.default_status_privacy_fb_crossposting_setting_container);
        boolean A052 = C86654Ky.A0g(this.A0E).A05(A0K);
        Context context = view.getContext();
        if (A052) {
            C86634Kw.A14(context, A0J2, R.color.f5nameremoved);
            C617031x.A01(new C120925zO(view, A0I2, r10), 2);
            r0 = new AnonymousClass54E(r8, 37, AnonymousClass0x9.A08(view.getContext(), ShareToFacebookActivity.class));
        } else {
            C86634Kw.A14(context, A0J2, R.color.f5nameremoved);
            A0I2.setText(R.string.f11nameremoved);
            r0 = new AnonymousClass544(r9, r11, this);
        }
        A0E2.setOnClickListener(r0);
    }

    public final boolean A09(C624134x r5) {
        Integer A002;
        C162457s7.A0J(r5, 0);
        C103345Mn r0 = this.A06;
        long j = r5.A1L;
        C54592oy r1 = r0.A00;
        if (!r1.A03(j) || (A002 = r1.A00(j)) == null || 3 != A002.intValue()) {
            return false;
        }
        return true;
    }

    public AnonymousClass5YA(C111095hX r21, C69263Wi r22, C620733j r23, AnonymousClass4FS r24, C113925mD r25, C29161iN r26, C103345Mn r27, C183538qC r28, C183538qC r29, C183538qC r30, C183538qC r31, C183538qC r32, C183538qC r33, C183538qC r34, C183538qC r35, C183538qC r36, C183538qC r37, C183538qC r38, C183538qC r39, C183538qC r40) {
        C620733j r18 = r23;
        AnonymousClass4FS r17 = r24;
        C183538qC r14 = r28;
        C111095hX r19 = r21;
        C69263Wi r0 = r22;
        C18260x0.A0f(r0, r17, r18, r19, r14);
        C183538qC r13 = r29;
        C113925mD r16 = r25;
        C29161iN r15 = r26;
        C18260x0.A0W(r15, r16, r13);
        C183538qC r12 = r30;
        C183538qC r11 = r31;
        C86634Kw.A1S(r12, r11);
        C183538qC r7 = r35;
        C183538qC r6 = r36;
        C183538qC r10 = r32;
        C183538qC r9 = r33;
        C183538qC r8 = r34;
        C18260x0.A0h(r10, r9, r8, r7, r6);
        C183538qC r5 = r37;
        C183538qC r4 = r38;
        AnonymousClass0x2.A1C(r5, r4);
        C183538qC r3 = r39;
        C162457s7.A0J(r3, 19);
        C183538qC r2 = r40;
        C162457s7.A0J(r2, 20);
        this.A01 = r0;
        this.A03 = r17;
        this.A02 = r18;
        this.A00 = r19;
        this.A0E = r14;
        this.A05 = r15;
        this.A04 = r16;
        this.A0D = r13;
        this.A06 = r27;
        this.A09 = r12;
        this.A0G = r11;
        this.A07 = r10;
        this.A0F = r9;
        this.A0A = r8;
        this.A0C = r7;
        this.A0H = r6;
        this.A0B = r5;
        this.A08 = r4;
        this.A0J = r3;
        this.A0I = r2;
    }

    public static C105945Xa A00(AnonymousClass5YA r0) {
        return (C105945Xa) r0.A0C.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
        if (r11 == 2) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(android.view.View r10, int r11, boolean r12, boolean r13) {
        /*
            r9 = this;
            java.lang.String r3 = "status_fragment"
            r0 = 0
            X.C162457s7.A0J(r10, r0)
            if (r12 == 0) goto L_0x00e1
            android.content.Context r2 = X.C18290x4.A0F(r10)
            java.lang.Integer r1 = X.C18290x4.A0a()
            X.5qu r0 = new X.5qu
            r0.<init>(r2, r9, r1, r3)
            X.5qt r2 = new X.5qt
            r2.<init>(r9, r0)
            X.8qC r0 = r9.A09
            java.lang.Object r4 = r0.get()
            X.5Kp r4 = (X.C102875Kp) r4
            r6 = 1
            r5 = 2
            r3 = 4
            r0 = r10
            X.5f8 r1 = new X.5f8
            r1.<init>((X.C102875Kp) r4, (X.AnonymousClass66Q) r2)
            if (r11 == r3) goto L_0x0034
            r0 = 2131429226(0x7f0b076a, float:1.8480119E38)
            android.view.View r0 = X.C18280x3.A0E(r10, r0)
        L_0x0034:
            r0.setOnClickListener(r1)
            if (r11 == r5) goto L_0x0047
            r0 = 2131433936(0x7f0b19d0, float:1.8489672E38)
            android.view.View r1 = X.C18280x3.A0E(r10, r0)
            r0 = 27
            X.C18320x8.A14(r1, r4, r0)
            if (r11 != r5) goto L_0x0053
        L_0x0047:
            r0 = 2131428787(0x7f0b05b3, float:1.8479228E38)
            android.view.View r1 = X.C18280x3.A0E(r10, r0)
            r0 = 26
            X.C18320x8.A14(r1, r4, r0)
        L_0x0053:
            r7 = 5
            if (r11 != r7) goto L_0x0075
            r0 = 2131427711(0x7f0b017f, float:1.8477046E38)
            android.view.View r1 = X.C18280x3.A0E(r10, r0)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
            X.C162457s7.A0K(r2, r0)
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            android.content.Context r1 = r1.getContext()
            r0 = 1107296256(0x42000000, float:32.0)
            int r0 = X.AnonymousClass5YI.A04(r1, r0)
            r2.setMarginStart(r0)
        L_0x0075:
            X.57R r2 = r4.A04
            r8 = 0
            java.lang.String r1 = "SEE_F_ICON"
            r0 = 927610551(0x374a36b7, float:1.20528775E-5)
            r2.A03(r0, r8, r1)
            X.2rK r1 = r4.A03
            X.21S r0 = X.AnonymousClass21S.A08
            X.C111135hb.A00(r1, r0, r2)
            X.5mK r0 = r4.A02
            X.5Kz r0 = r0.A00
            if (r0 == 0) goto L_0x00de
            long r0 = r0.A05
        L_0x008f:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "status_session_id"
            r2.A06(r0, r1)
            if (r11 == 0) goto L_0x014f
            if (r11 == r6) goto L_0x00a3
            if (r11 == r5) goto L_0x00a3
            if (r11 == r3) goto L_0x00a3
            if (r11 == r7) goto L_0x00a3
        L_0x00a2:
            return
        L_0x00a3:
            java.lang.ref.WeakReference r0 = X.C102875Kp.A09
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r0 = r0.get()
            if (r0 != r10) goto L_0x00b8
        L_0x00ad:
            r3 = 0
            int r2 = X.C102875Kp.A08
            r0 = 36
            X.67L r1 = new X.67L
            r1.<init>(r10, r0)
            goto L_0x0123
        L_0x00b8:
            java.lang.ref.WeakReference r0 = X.AnonymousClass0x9.A14(r10)
            X.C102875Kp.A09 = r0
            int r3 = r10.getVisibility()
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            int r2 = r0.height
            int r1 = X.C86604Kt.A03(r10)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            X.C86604Kt.A1C(r10, r1, r0)
            int r0 = r10.getMeasuredHeight()
            X.C102875Kp.A08 = r0
            r10.setVisibility(r3)
            X.C86624Kv.A0w(r10, r2)
            goto L_0x00ad
        L_0x00de:
            r0 = 0
            goto L_0x008f
        L_0x00e1:
            X.8qC r0 = r9.A09
            java.lang.Object r4 = r0.get()
            X.5Kp r4 = (X.C102875Kp) r4
            if (r11 == 0) goto L_0x0171
            r0 = 1
            if (r11 == r0) goto L_0x00f8
            r0 = 2
            if (r11 == r0) goto L_0x00f8
            r0 = 4
            if (r11 == r0) goto L_0x00f8
            r0 = 5
            if (r11 == r0) goto L_0x00f8
            return
        L_0x00f8:
            int r1 = r10.getVisibility()
            r0 = 8
            if (r1 != r0) goto L_0x0116
            android.animation.ValueAnimator r0 = r4.A00
            if (r0 == 0) goto L_0x0107
            r0.removeAllListeners()
        L_0x0107:
            android.animation.ValueAnimator r0 = r4.A00
            if (r0 == 0) goto L_0x010e
            r0.removeAllUpdateListeners()
        L_0x010e:
            android.animation.ValueAnimator r0 = r4.A00
            if (r0 == 0) goto L_0x00a2
            r0.cancel()
            return
        L_0x0116:
            int r3 = r10.getHeight()
            r2 = 0
            r0 = 35
            X.67L r1 = new X.67L
            r1.<init>(r10, r0)
            r13 = 0
        L_0x0123:
            android.animation.ValueAnimator r0 = r4.A00
            if (r0 == 0) goto L_0x012a
            r0.removeAllListeners()
        L_0x012a:
            android.animation.ValueAnimator r0 = r4.A00
            if (r0 == 0) goto L_0x0131
            r0.removeAllUpdateListeners()
        L_0x0131:
            android.animation.ValueAnimator r0 = r4.A00
            if (r0 == 0) goto L_0x0138
            r0.cancel()
        L_0x0138:
            android.animation.ValueAnimator r2 = X.C86604Kt.A06(r3, r2)
            r4.A00 = r2
            if (r2 == 0) goto L_0x00a2
            X.C86604Kt.A0v(r1, r2)
            r0 = 4
            long r0 = X.C86654Ky.A07(r2, r10, r0, r13)
            r2.setStartDelay(r0)
            r2.start()
            return
        L_0x014f:
            X.C86624Kv.A0s(r10)
            android.view.ViewPropertyAnimator r2 = X.C86624Kv.A0B(r10)
            r0 = 600(0x258, double:2.964E-321)
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r0)
            r0 = 1400(0x578, double:6.917E-321)
            android.view.ViewPropertyAnimator r2 = r2.setStartDelay(r0)
            r1 = 34
            X.67L r0 = new X.67L
            r0.<init>(r10, r1)
            android.view.ViewPropertyAnimator r0 = r2.setListener(r0)
            r0.start()
            return
        L_0x0171:
            X.C86624Kv.A0s(r10)
            r0 = 8
            r10.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5YA.A04(android.view.View, int, boolean, boolean):void");
    }

    public final void A05(View view, int i, boolean z, boolean z2) {
        long j;
        C162457s7.A0J(view, 0);
        if (z) {
            C116805qt r6 = new C116805qt(this, new C116815qu(C18290x4.A0F(view), this, 4, "status_fragment"));
            C104365Qr r4 = (C104365Qr) this.A0A.get();
            if (view.getVisibility() == 0 && view.getHeight() == C104365Qr.A09) {
                r4.A00();
                return;
            }
            AnonymousClass57S r2 = r4.A04;
            r2.A03(927608564, (String) null, "SEE_UPSELL_BANNER");
            C111135hb.A00(r4.A02, AnonymousClass21S.A09, r2);
            C102975Kz r0 = r4.A01.A00;
            if (r0 != null) {
                j = r0.A05;
            } else {
                j = 0;
            }
            r2.A06("status_session_id", Long.valueOf(j));
            View A0E2 = C18280x3.A0E(view, R.id.close);
            C109755f8 r22 = new C109755f8(r4, (AnonymousClass66Q) r6);
            C109405eZ r02 = new C109405eZ(r4, 28);
            view.setOnClickListener(r22);
            A0E2.setOnClickListener(r02);
            if (i == 0) {
                TextView A0I2 = AnonymousClass0x2.A0I(view, R.id.text1);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String A0a = C86624Kv.A0a(view.getResources(), R.string.f11nameremoved);
                int color = view.getResources().getColor(R.color.f5nameremoved);
                SpannableStringBuilder A002 = C18330xA.A00(A0a);
                A002.setSpan(new ForegroundColorSpan(color), 0, A002.length(), 0);
                SpannableStringBuilder append = spannableStringBuilder.append(A002).append(" ");
                String A0a2 = C86624Kv.A0a(view.getResources(), R.string.f11nameremoved);
                int color2 = view.getResources().getColor(R.color.f5nameremoved);
                SpannableStringBuilder A003 = C18330xA.A00(A0a2);
                A003.setSpan(new ForegroundColorSpan(color2), 0, A003.length(), 0);
                A003.setSpan(new StyleSpan(1), 0, A003.length(), 0);
                SpannableStringBuilder append2 = append.append(A003);
                C162457s7.A0D(append2);
                A0I2.setText(append2);
            }
            WeakReference weakReference = C104365Qr.A0A;
            if (weakReference == null || weakReference.get() != view) {
                C104365Qr.A0A = AnonymousClass0x9.A14(view);
                int visibility = view.getVisibility();
                int i2 = view.getLayoutParams().height;
                C86604Kt.A1C(view, C86604Kt.A03(view), Integer.MIN_VALUE);
                C104365Qr.A09 = view.getMeasuredHeight();
                view.setVisibility(visibility);
                C86624Kv.A0w(view, i2);
            }
            C69873Yv r23 = new C69873Yv();
            r23.element = true;
            int i3 = C104365Qr.A09;
            AnonymousClass4L8 r03 = new AnonymousClass4L8(view, r4, r23);
            r4.A00();
            ValueAnimator A062 = C86604Kt.A06(0, i3);
            r4.A00 = A062;
            if (A062 != null) {
                C86604Kt.A0v(r03, A062);
                A062.setStartDelay(C86654Ky.A07(A062, view, 5, 1));
                A062.start();
                return;
            }
            return;
        }
        C104365Qr r3 = (C104365Qr) this.A0A.get();
        if (!z2) {
            r3.A00();
            view.setVisibility(8);
        } else if (view.getVisibility() == 8) {
            r3.A00();
        } else {
            int height = view.getHeight();
            AnonymousClass67L r04 = new AnonymousClass67L(view, 37);
            r3.A00();
            ValueAnimator A063 = C86604Kt.A06(height, 0);
            r3.A00 = A063;
            if (A063 != null) {
                C86604Kt.A0v(r04, A063);
                A063.setStartDelay(C86654Ky.A07(A063, view, 5, 0));
                A063.start();
            }
        }
        r3.A04.A04("SEE_UPSELL_BANNER_DISAPPEAR");
    }

    public final boolean A07() {
        AnonymousClass5O0 r5 = (AnonymousClass5O0) this.A0F.get();
        C183538qC r4 = r5.A03;
        C56042rK A0g = C86654Ky.A0g(r4);
        C18260x0.A1N(AnonymousClass001.A0o(), "FbAccountManager/hasSystemUnlinkedUser called by ", AnonymousClass21S.A0S);
        if (!C18280x3.A1W(A0g.A01.A03.A01(), "pref_xfamily_fb_account_has_system_unlinked")) {
            Context context = r5.A00.A00;
            C162457s7.A0D(context);
            if (C57672u1.A00(context) || C86654Ky.A0g(r4).A05(AnonymousClass21S.A0B)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean A08(C624134x r6) {
        Integer A002;
        C103345Mn r0 = this.A06;
        long j = r6.A1L;
        C54592oy r1 = r0.A00;
        if (!r1.A03(j)) {
            return false;
        }
        Integer A003 = r1.A00(j);
        if ((A003 == null || 1 != A003.intValue()) && ((A002 = r1.A00(j)) == null || 7 != A002.intValue())) {
            return false;
        }
        return true;
    }

    public static void A01(AnonymousClass5YA r1, C183538qC r2) {
        ((C111135hb) r2.get()).A06("is_account_linked", Boolean.valueOf(((C56042rK) r1.A0E.get()).A05(A0K)));
    }

    public final void A03(Context context, Integer num, String str, int i) {
        C105945Xa A002;
        boolean z;
        C109665ez r1;
        int i2;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyCrosspostManager/handleErrorWithSnackbarMessage/errorCode: ");
        A0o.append(i);
        C18260x0.A1N(A0o, ", errorSubCode: ", num);
        String str2 = str;
        if (i == -4) {
            A002 = A00(this);
            z = false;
            C162457s7.A0J(str, 0);
            r1 = null;
            i2 = R.string.f11nameremoved;
        } else if (i == -3) {
            A002 = A00(this);
            z = false;
            C162457s7.A0J(str, 0);
            r1 = null;
            i2 = R.string.f11nameremoved;
        } else if (i == -2) {
            A002 = A00(this);
            z = false;
            C162457s7.A0J(str, 0);
            r1 = null;
            i2 = R.string.f11nameremoved;
        } else if (i == 190) {
            if (num != null && num.intValue() == 452) {
                C105945Xa A003 = A00(this);
                C162457s7.A0J(str, 0);
                A003.A01((C109665ez) null, str2, R.string.f11nameremoved, 0, false);
            }
            C86654Ky.A0g(this.A0E).A03(A0K, true);
            return;
        } else if (i == 3463044) {
            A002 = A00(this);
            z = false;
            C162457s7.A0J(str, 0);
            r1 = null;
            i2 = R.string.f11nameremoved;
        } else if (i != 3463126) {
            A002 = A00(this);
            z = false;
            C162457s7.A0J(str, 0);
            r1 = null;
            i2 = R.string.f11nameremoved;
        } else {
            C105945Xa A004 = A00(this);
            C162457s7.A0J(str, 1);
            A004.A01(new AnonymousClass54E(A004, 39, context), str, R.string.f11nameremoved, R.string.f11nameremoved, false);
            return;
        }
        A002.A01(r1, str2, i2, z ? 1 : 0, z);
    }
}
