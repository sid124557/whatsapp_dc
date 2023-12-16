package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.4nt  reason: invalid class name and case insensitive filesystem */
public class C93094nt extends C92934nb {
    public View A00;
    public LinearLayout A01;
    public LottieAnimationView A02;
    public AnonymousClass5J8 A03;
    public C179228io A04;
    public final AnonymousClass4VP A05;
    public final boolean A06 = this.A0O.A0X(4974);

    public void A1i(C624134x r2) {
        C162457s7.A0J(r2, 0);
        super.A1i(r2);
        A27();
        A26();
    }

    public void A1q(C624134x r5, boolean z) {
        C51962kf A0q;
        AnonymousClass677 r0;
        C162457s7.A0J(r5, 0);
        AnonymousClass2z0 A0B = C627636p.A0B(r5);
        C162457s7.A0D(A0B);
        C624134x r02 = this.A0S;
        C162457s7.A0D(r02);
        AnonymousClass2z0 A0B2 = C627636p.A0B(r02);
        C162457s7.A0D(A0B2);
        boolean z2 = !A0B.equals(A0B2);
        if ((z2 || z) && (A0q = r5.A0q()) != null && A0q.A00.ordinal() < 3 && (r0 = this.A0m) != null) {
            r0.Bmp(r5, 0);
        }
        super.A1q(r5, z);
        if (this.A06 && z2 && A29(r5)) {
            A28(0);
        }
        AnonymousClass4VP r03 = this.A05;
        if (r03 != null) {
            r03.A0D(r5);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = i;
        int i5 = i2;
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        LinearLayout linearLayout = this.A01;
        if (linearLayout != null) {
            C107235av.A05(linearLayout, i4, 0, 0, i5, 0);
            ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(linearLayout);
            i3 = linearLayout.getMeasuredHeight() + A0T.topMargin + A0T.bottomMargin;
        } else {
            i3 = 0;
        }
        setMeasuredDimension(measuredWidth, measuredHeight + i3);
    }

    public final void setInlineFeedbackViewModelFactory(C179228io r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final void A27() {
        C624134x r0 = this.A0S;
        C162457s7.A0D(r0);
        if (A29(r0)) {
            ViewGroup viewGroup = this.A08;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                viewGroup.getChildAt(i).setVisibility(8);
            }
            if (this.A02 == null) {
                View A0g = C86664Kz.A0g(C18280x3.A0D(this), R.layout.f8nameremoved);
                C162457s7.A0K(A0g, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
                LottieAnimationView lottieAnimationView = (LottieAnimationView) A0g;
                this.A02 = lottieAnimationView;
                if (lottieAnimationView != null) {
                    lottieAnimationView.setRepeatCount(-1);
                }
                C620733j r02 = this.A0M;
                LottieAnimationView lottieAnimationView2 = this.A02;
                C162457s7.A0K(lottieAnimationView2, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
                boolean A002 = C102805Ki.A00(r02);
                float f = 1.0f;
                if (A002) {
                    f = -1.0f;
                }
                lottieAnimationView2.setSpeed(f);
                viewGroup.addView(this.A02);
            }
            LottieAnimationView lottieAnimationView3 = this.A02;
            if (lottieAnimationView3 != null) {
                lottieAnimationView3.setAnimation((int) R.raw.typing_indicator);
            }
            LottieAnimationView lottieAnimationView4 = this.A02;
            C162457s7.A0K(lottieAnimationView4, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
            C107235av.A06(lottieAnimationView4, C18290x4.A0G(this).getColor(R.color.f5nameremoved));
            LottieAnimationView lottieAnimationView5 = this.A02;
            if (lottieAnimationView5 != null) {
                lottieAnimationView5.A01();
            }
            LottieAnimationView lottieAnimationView6 = this.A02;
            if (lottieAnimationView6 != null) {
                lottieAnimationView6.setVisibility(0);
                return;
            }
            return;
        }
        LottieAnimationView lottieAnimationView7 = this.A02;
        if (lottieAnimationView7 != null) {
            lottieAnimationView7.A00();
            LottieAnimationView lottieAnimationView8 = this.A02;
            if (lottieAnimationView8 != null) {
                lottieAnimationView8.setVisibility(8);
            }
        }
        super.A1i(this.A0S);
    }

    public String getGroupRoleTitle() {
        return null;
    }

    public final AnonymousClass4VP getInlineFeedbackViewModel() {
        return this.A05;
    }

    public final C179228io getInlineFeedbackViewModelFactory() {
        C179228io r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("inlineFeedbackViewModelFactory");
    }

    public AnonymousClass679 getRowCustomizer() {
        AnonymousClass677 r0;
        this.A29.get();
        if (!C155477ey.A00(this.A0S.A1J.A00) && (r0 = this.A0m) != null && r0.getContainerType() == 0) {
            return this.A0K.A04;
        }
        AnonymousClass679 rowCustomizer = super.getRowCustomizer();
        C162457s7.A0D(rowCustomizer);
        return rowCustomizer;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93094nt(Context context, AnonymousClass677 r12, C30481mW r13) {
        super(context, r12, r13);
        C18260x0.A0Q(context, r13);
        if (r12 != null) {
            C06270Wx lastMessageLiveData = r12.getLastMessageLiveData();
            C06270Wx hasOutgoingMessagesLiveData = r12.getHasOutgoingMessagesLiveData();
            if (!(lastMessageLiveData == null || hasOutgoingMessagesLiveData == null)) {
                C183538qC r1 = this.A2A;
                C162457s7.A0C(r1);
                C183538qC r4 = this.A28;
                C162457s7.A0C(r4);
                C95814uZ r2 = r13.A1J.A00;
                C52802m4 r14 = (C52802m4) r1.get();
                if (r14.A00() && r14.A00.A02() && r14.A03.A0X(5246) && ((C1229766o) r4.get()).BH2(r2)) {
                    C64333Db r15 = ((AnonymousClass8G1) getInlineFeedbackViewModelFactory()).A00.A03;
                    AnonymousClass4VP r42 = new AnonymousClass4VP(lastMessageLiveData, hasOutgoingMessagesLiveData, C88734ai.A00(r15.A3A), C88734ai.A00(r15.A3I), C64333Db.A8y(r15));
                    this.A05 = r42;
                    C86604Kt.A1N(r12.getLifecycleOwner(), r42.A02, C1001359q.A00(this, 21), 183);
                    r42.A0D(r13);
                    return;
                }
            }
        }
        this.A05 = null;
    }

    public void A1J() {
        super.A1J();
        LinearLayout linearLayout = this.A01;
        if (linearLayout != null) {
            linearLayout.bringToFront();
        }
    }

    public void A22() {
        super.A22();
        A27();
        A26();
    }

    public final void A25() {
        LinearLayout A0v = C86664Kz.A0v(this, R.id.conversation_row_bot_frame);
        if (A0v == null) {
            View A0R = AnonymousClass001.A0R(C18280x3.A0D(this), this, R.layout.f8nameremoved);
            C162457s7.A0K(A0R, "null cannot be cast to non-null type android.widget.LinearLayout");
            A0v = (LinearLayout) A0R;
            addView(A0v);
        }
        this.A01 = A0v;
    }

    public final void A26() {
        String str;
        Uri parse;
        int i;
        int ordinal;
        View findViewById = findViewById(R.id.search_provider_attribution);
        if (findViewById != null) {
            AnonymousClass5UY r4 = new AnonymousClass5UY(findViewById);
            C53532nF A0r = this.A0S.A0r();
            C371921h r1 = null;
            if (A0r != null) {
                r1 = A0r.A01;
            }
            C53532nF A0r2 = this.A0S.A0r();
            if (A0r2 == null || (str = A0r2.A04) == null || (parse = Uri.parse(str)) == null) {
                r4.A06(8);
                return;
            }
            r4.A06(0);
            Context context = getContext();
            if (r1 == null || (ordinal = r1.ordinal()) == -1) {
                i = R.string.f11nameremoved;
            } else {
                i = R.string.f11nameremoved;
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        i = R.string.f11nameremoved;
                    } else {
                        throw C73153f1.A00();
                    }
                }
            }
            String A0l = C18290x4.A0l(context, i);
            Context context2 = getContext();
            AnonymousClass1VX r11 = this.A0O;
            C69263Wi r8 = this.A0X;
            C107635bd.A0E(context2, parse, this.A0V, r8, (TextEmojiLabel) r4.A04(), this.A0L, r11, A0l, "link-one");
        }
    }

    public final void A28(int i) {
        int max;
        AnonymousClass67A A0b;
        C18260x0.A0w("WordAnimation/animateMessage/oldTextLength/", AnonymousClass001.A0o(), i);
        if (this.A03 == null || i == 0) {
            AnonymousClass1VX r1 = this.A0O;
            C162457s7.A0C(r1);
            this.A03 = new AnonymousClass5J8(this, r1);
        }
        C624134x r0 = this.A0S;
        C162457s7.A0D(r0);
        boolean A29 = A29(r0);
        AnonymousClass5J8 r3 = this.A03;
        if (A29) {
            if (r3 != null) {
                C93094nt r6 = r3.A01;
                int height = r6.getHeight();
                AnonymousClass001.A19(r6, r6.getMeasuredHeight(), 0, View.MeasureSpec.makeMeasureSpec(r6.getMeasuredWidth(), Integer.MIN_VALUE));
                int measuredHeight = r6.getMeasuredHeight();
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("WordAnimation/lineCount/");
                TextEmojiLabel textEmojiLabel = r6.A05;
                C18260x0.A1F(A0o, textEmojiLabel.getLineCount());
                if (measuredHeight > height && (A0b = C86634Kw.A0b(r6)) != null) {
                    boolean A1U = C18280x3.A1U(r6.getTop() - (measuredHeight - height), A0b.getListView().getTop());
                    C18260x0.A1D("WordAnimation/willTopBeVisible/", AnonymousClass001.A0o(), A1U);
                    if (!A1U || textEmojiLabel.getLineCount() > r3.A00) {
                        A0b.B1h();
                        Log.d("WordAnimation/disableScrollToBottom/");
                    } else if (r6.getBottom() <= A0b.getListView().getHeight()) {
                        C86624Kv.A0w(r6, height);
                        r6.requestLayout();
                        ValueAnimator A0Q = C86664Kz.A0Q(C86664Kz.A1a(height), measuredHeight);
                        A0Q.setDuration(150);
                        C86644Kx.A0j(A0Q);
                        C100295Aj.A03(A0Q, r3, 10);
                        A0Q.addListener(new AnonymousClass68Z(r3, 1));
                        r6.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass6BL(A0b, r3));
                        A0Q.start();
                    }
                }
                AnonymousClass5OV r9 = r3.A02;
                Log.d("WordAnimation:onNewChunk");
                Handler handler = r9.A02;
                handler.removeCallbacksAndMessages((Object) null);
                r9.A01 = r9.A00;
                CharSequence text = r9.A04.getText();
                C162457s7.A0D(text);
                r9.A03 = text;
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("WordAnimation/start/startIndex: ");
                C18260x0.A1F(A0o2, r9.A01);
                if (r9.A03.length() <= r9.A01) {
                    Log.d("WordAnimation:skip");
                    return;
                }
                r9.A00 = r9.A03.length();
                int i2 = r9.A01;
                if (i2 != 0) {
                    r9.A00(i2);
                    String obj = r9.A03.toString();
                    int i3 = r9.A01;
                    ArrayList A0r = C18300x5.A0r(obj);
                    int length = obj.length();
                    int i4 = i3;
                    while (i3 < length) {
                        if (C154557dM.A01(obj.charAt(i3))) {
                            if (i4 != i3) {
                                C18270x1.A1K(A0r, i4);
                            }
                            i4 = i3 + 1;
                        }
                        i3++;
                    }
                    if (i4 != length) {
                        C18270x1.A1K(A0r, i4);
                    }
                    C18260x0.A1P(AnonymousClass001.A0o(), "WordAnimation:wordIndices: ", A0r);
                    if (!A0r.isEmpty()) {
                        int size = A0r.size();
                        int A0N = r9.A06.A0N(5150);
                        if (A0N == 0) {
                            max = 50;
                        } else {
                            max = Math.max(16, A0N / size);
                        }
                        C18260x0.A1A("WordAnimation:wordCount:", AnonymousClass001.A0o(), A0r);
                        C18260x0.A0w("WordAnimation:wordInterval: ", AnonymousClass001.A0o(), max);
                        int size2 = A0r.size();
                        long j = 0;
                        for (int i5 = 0; i5 < size2; i5++) {
                            int length2 = r9.A03.length() - 1;
                            if (i5 < C86664Kz.A0M(A0r)) {
                                length2 = C86614Ku.A07(A0r, i5 + 1) - 1;
                            }
                            handler.sendMessageDelayed(Message.obtain(handler, 0, AnonymousClass3Z6.A01(A0r.get(i5), length2)), j);
                            j += (long) max;
                        }
                    }
                }
            }
        } else if (r3 != null) {
            AnonymousClass5OV r12 = r3.A02;
            Log.d("WordAnimation:onLastChunk");
            r12.A02.removeCallbacksAndMessages((Object) null);
        }
    }

    public final boolean A29(C624134x r8) {
        C51962kf A0q = r8.A0q();
        C56612sH r3 = this.A1E;
        AnonymousClass1VX r5 = this.A0O;
        long j = r8.A0K;
        C42602Ou A11 = r8.A11();
        if (A11 != null) {
            j = A11.A00;
        }
        if (r3.A0H() - j > C56952sp.A06(r5, 4736) || A0q == null || A0q.A00.ordinal() >= 3) {
            return false;
        }
        return true;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int right;
        super.onLayout(z, i, i2, i3, i4);
        LinearLayout linearLayout = this.A01;
        if (linearLayout != null) {
            boolean A042 = C620733j.A04(this.A0M);
            int height = getHeight();
            int measuredWidth = linearLayout.getMeasuredWidth();
            int measuredHeight = linearLayout.getMeasuredHeight();
            View view = this.A0l;
            if (A042) {
                right = view.getLeft();
            } else {
                right = view.getRight() - measuredWidth;
            }
            linearLayout.layout(0, height - measuredHeight, measuredWidth, height);
            View view2 = this.A00;
            if (view2 != null) {
                view2.setPadding(right, 0, 0, 0);
            }
        }
    }
}
