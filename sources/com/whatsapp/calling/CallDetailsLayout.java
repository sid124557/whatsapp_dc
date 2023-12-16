package com.whatsapp.calling;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0Y9;
import X.AnonymousClass0YY;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass36T;
import X.AnonymousClass3Ey;
import X.AnonymousClass3ZH;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.AnonymousClass5UX;
import X.AnonymousClass5UY;
import X.AnonymousClass5YB;
import X.AnonymousClass5ZU;
import X.AnonymousClass64J;
import X.AnonymousClass67L;
import X.C06560Yg;
import X.C105365Uq;
import X.C106905aM;
import X.C107305b5;
import X.C114015mM;
import X.C116855qy;
import X.C150477Qw;
import X.C18300x5;
import X.C184288rY;
import X.C188778zT;
import X.C52412lR;
import X.C56572sD;
import X.C620733j;
import X.C64333Db;
import X.C64773Ex;
import X.C66493Lq;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C88864av;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;
import java.util.List;

public class CallDetailsLayout extends LinearLayout implements AnonymousClass4GJ {
    public int A00;
    public int A01;
    public Typeface A02;
    public FrameLayout A03;
    public TextView A04;
    public TextView A05;
    public AnonymousClass64J A06;
    public AnonymousClass5YB A07;
    public ThumbnailButton A08;
    public AnonymousClass5UX A09;
    public C64773Ex A0A;
    public AnonymousClass5ZU A0B;
    public C184288rY A0C;
    public C105365Uq A0D;
    public C114015mM A0E;
    public C620733j A0F;
    public C52412lR A0G;
    public AnonymousClass1VX A0H;
    public C66493Lq A0I;
    public C56572sD A0J;
    public AnonymousClass5UY A0K;
    public C116855qy A0L;
    public boolean A0M;

    public final void A02(CallState callState, boolean z) {
        boolean z2;
        TextView textView;
        String str;
        int i = 0;
        if (z) {
            textView = this.A05;
            A00(textView, Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.f6nameremoved)), Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.f6nameremoved)));
            z2 = false;
        } else {
            z2 = true;
            if (!(Voip.A09(callState) || callState == CallState.CALLING || callState == CallState.PRE_ACCEPT_RECEIVED || this.A00 == 1)) {
                z2 = false;
            }
            textView = this.A05;
            A00(textView, Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.f6nameremoved)), Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.f6nameremoved)));
        }
        ThumbnailButton thumbnailButton = this.A08;
        if (thumbnailButton.getVisibility() == 0) {
            if (!z2) {
                Log.i("voip/CallDetailsLayout/animateAvatarLayout");
                if (callState == CallState.NONE) {
                    str = "voip/CallDetailsLayout/animateAvatarLayout return directly, no call is going on";
                } else {
                    int i2 = this.A00;
                    if (i2 == 1) {
                        str = AnonymousClass000.A0Y("voip/CallDetailsLayout/animateAvatarLayout return directly, avatarAnimationState: ", AnonymousClass001.A0o(), i2);
                    } else if (thumbnailButton.getVisibility() == 8) {
                        str = "voip/CallDetailsLayout/animateAvatarLayout return directly, peerAvatarLayout.getVisibility() == View.GONE ";
                    } else {
                        if (thumbnailButton.getHeight() == 0) {
                            C86604Kt.A19(thumbnailButton);
                        }
                        this.A00 = 1;
                        ObjectAnimator[] objectAnimatorArr = new ObjectAnimator[3];
                        if (!z) {
                            C86624Kv.A0A(thumbnailButton).setDuration(200).setListener(new AnonymousClass67L(this, 6)).start();
                        } else {
                            int measuredHeight = thumbnailButton.getMeasuredHeight();
                            ScaleAnimation A0Q = C86634Kw.A0Q(1.0f, 0.0f);
                            A0Q.setInterpolator(new DecelerateInterpolator());
                            A0Q.setDuration(125);
                            thumbnailButton.startAnimation(A0Q);
                            float f = (float) (-measuredHeight);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(thumbnailButton, "translationY", new float[]{f});
                            C86614Ku.A0y(ofFloat);
                            ofFloat.setDuration(125);
                            objectAnimatorArr[0] = ofFloat;
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, "translationY", new float[]{f});
                            C86614Ku.A0y(ofFloat2);
                            ofFloat2.setDuration(125);
                            objectAnimatorArr[1] = ofFloat2;
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.A04, "translationY", new float[]{f});
                            C86614Ku.A0y(ofFloat3);
                            ofFloat3.setDuration(125);
                            objectAnimatorArr[2] = ofFloat3;
                            AnimatorSet A0O = C86664Kz.A0O();
                            A0O.playTogether(objectAnimatorArr);
                            A0O.start();
                            C86614Ku.A0z(A0O, this, 8);
                        }
                    }
                }
                Log.i(str);
            }
            thumbnailButton.setVisibility(i);
        } else {
            if (!z2) {
                i = 8;
            }
            thumbnailButton.setVisibility(i);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        if (z2) {
            dimensionPixelSize = C86664Kz.A09(getResources(), R.dimen.f6nameremoved, C86654Ky.A02(getResources(), R.dimen.f6nameremoved, dimensionPixelSize));
        }
        A00(this, Integer.valueOf(dimensionPixelSize), (Integer) null);
    }

    public void A03(CallState callState, boolean z, boolean z2) {
        if (!z2 && callState != CallState.ACTIVE && callState != CallState.CONNECTED_LONELY && callState != CallState.ACCEPT_SENT) {
            A02(callState, z);
            setAlpha(1.0f);
            setVisibility(0);
            setBackgroundColor(0);
        } else if (this.A00 != 1) {
            setVisibility(8);
            this.A08.setVisibility(8);
        }
    }

    public final void setCallDetailsDescription(List list, CallInfo callInfo) {
        String str;
        String str2;
        setFocusable(true);
        AnonymousClass0YY.A06(this.A08, 1);
        boolean isAudioChat = callInfo.isAudioChat();
        GroupJid groupJid = callInfo.groupJid;
        C64773Ex r8 = this.A0A;
        AnonymousClass5ZU r7 = this.A0B;
        AnonymousClass3ZH A012 = AnonymousClass36T.A01(r8, this.A0I, groupJid, this.A0J, isAudioChat);
        if (A012 != null) {
            str = C18300x5.A0h(r7, A012);
        } else {
            str = null;
        }
        String str3 = str;
        if (str == null) {
            Context context = getContext();
            C150477Qw A042 = C107305b5.A04(r8, r7, list, 3, false);
            if (A042 == null) {
                str = null;
            } else {
                str = C86634Kw.A0y(context, A042);
            }
        }
        if (Voip.A09(callInfo.callState)) {
            Context context2 = getContext();
            boolean z = callInfo.videoEnabled;
            int i = R.string.f11nameremoved;
            if (z) {
                i = R.string.f11nameremoved;
            }
            str2 = context2.getString(i);
            AnonymousClass0YY.A06(this.A04, 2);
            if (str3 != null) {
                TextView textView = this.A05;
                Context context3 = getContext();
                Object[] A1X = AnonymousClass0x9.A1X();
                A1X[0] = str2;
                A1X[1] = C18300x5.A0h(r7, C64773Ex.A00(r8, callInfo.getPeerJid()));
                A1X[2] = str;
                C86624Kv.A0h(context3, textView, A1X, R.string.f11nameremoved);
                return;
            }
        } else if (!callInfo.isGroupCall || (!callInfo.isInLonelyState() && callInfo.callState != CallState.CALLING)) {
            Context context4 = getContext();
            boolean z2 = callInfo.videoEnabled;
            int i2 = R.string.f11nameremoved;
            if (z2) {
                i2 = R.string.f11nameremoved;
            }
            str2 = context4.getString(i2);
            TextView textView2 = this.A04;
            AnonymousClass0YY.A06(textView2, 1);
            textView2.setFocusable(true);
        } else {
            TextView textView3 = this.A05;
            Context context5 = getContext();
            boolean z3 = callInfo.videoEnabled;
            int i3 = R.string.f11nameremoved;
            if (z3) {
                i3 = R.string.f11nameremoved;
            }
            textView3.setContentDescription(AnonymousClass0x2.A0X(context5, str, 1, i3));
            AnonymousClass0YY.A06(this.A04, 2);
            return;
        }
        C86624Kv.A0h(getContext(), this.A05, AnonymousClass4L0.A0V(str2, str, 2), R.string.f11nameremoved);
    }

    public void A01(CallInfo callInfo) {
        AnonymousClass3ZH A0A2;
        ThumbnailButton thumbnailButton = this.A08;
        if (thumbnailButton.getVisibility() != 8) {
            if (callInfo.isGroupCall) {
                boolean isAudioChat = callInfo.isAudioChat();
                GroupJid groupJid = callInfo.groupJid;
                A0A2 = AnonymousClass36T.A01(this.A0A, this.A0I, groupJid, this.A0J, isAudioChat);
                if (A0A2 == null) {
                    return;
                }
            } else {
                UserJid peerJid = callInfo.getPeerJid();
                if (peerJid != null) {
                    A0A2 = this.A0A.A0A(peerJid);
                } else {
                    return;
                }
            }
            this.A0D.A05(thumbnailButton, this.A0C, A0A2, true);
        }
    }

    public void A04(String str, String str2) {
        TextView textView = this.A04;
        textView.setVisibility(C86644Kx.A08(str));
        textView.setText(str);
        textView.setContentDescription(str2);
    }

    public boolean A05(CallInfo callInfo) {
        if (callInfo.isGroupCall) {
            if (callInfo.videoEnabled) {
                return true;
            }
            boolean isAudioChat = callInfo.isAudioChat();
            GroupJid groupJid = callInfo.groupJid;
            if (AnonymousClass36T.A01(this.A0A, this.A0I, groupJid, this.A0J, isAudioChat) == null) {
                return true;
            }
        }
        if (Voip.A09(callInfo.callState) || !callInfo.videoEnabled) {
            return false;
        }
        return true;
    }

    public void clearAnimation() {
        ThumbnailButton thumbnailButton = this.A08;
        thumbnailButton.clearAnimation();
        thumbnailButton.setTranslationY(0.0f);
        thumbnailButton.setAlpha(1.0f);
        TextView textView = this.A04;
        textView.clearAnimation();
        textView.setTranslationY(0.0f);
        TextView textView2 = this.A05;
        textView2.clearAnimation();
        textView2.setTranslationY(0.0f);
        thumbnailButton.setScaleX(1.0f);
        thumbnailButton.setScaleY(1.0f);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0L;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0L = r0;
        }
        return r0.generatedComponent();
    }

    public String getNameViewContentDescription() {
        TextView textView = this.A05;
        if (textView.getContentDescription() != null) {
            return textView.getContentDescription().toString();
        }
        return null;
    }

    public CallDetailsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0M) {
            this.A0M = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A0H = C64333Db.A4B(A002);
            this.A0J = (C56572sD) A002.AWF.get();
            this.A0A = C64333Db.A26(A002);
            this.A0B = C64333Db.A28(A002);
            this.A0F = C64333Db.A2t(A002);
            this.A0I = C64333Db.A5A(A002);
            this.A0G = A002.AkL();
            this.A09 = C86614Ku.A0R(A002);
            this.A0E = C64333Db.A29(A002);
            this.A06 = C86614Ku.A0N(A002);
        }
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        this.A05 = AnonymousClass002.A09(this, R.id.name);
        this.A03 = C86654Ky.A0L(this, R.id.push_name_container);
        this.A07 = AnonymousClass5YB.A00(this, this.A06, R.id.name);
        this.A04 = AnonymousClass002.A09(this, R.id.call_status);
        this.A01 = getResources().getColor(R.color.f5nameremoved);
        this.A02 = C106905aM.A01();
        C06560Yg.A0O(this.A04, new C188778zT(this, 14));
        if (this.A0H.A0X(4095)) {
            AnonymousClass0Y9.A06(this.A05, R.style.f12nameremoved);
            AnonymousClass0Y9.A06(this.A04, R.style.f12nameremoved);
        }
        ThumbnailButton A16 = C86664Kz.A16(this, R.id.contact_photo);
        this.A08 = A16;
        A16.A02 = -1.0f;
        this.A0C = new AnonymousClass3Ey(this.A09);
        this.A0K = AnonymousClass0x2.A0M(this, R.id.call_details_additional_info_stub);
        this.A0D = this.A0E.A07("peer-avatar-photo", 0.0f, getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
    }

    public static final void A00(View view, Integer num, Integer num2) {
        int intValue;
        int intValue2;
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(view);
        if (num == null) {
            intValue = A0T.topMargin;
        } else {
            intValue = num.intValue();
        }
        Integer valueOf = Integer.valueOf(intValue);
        if (num2 == null) {
            intValue2 = A0T.bottomMargin;
        } else {
            intValue2 = num2.intValue();
        }
        Integer valueOf2 = Integer.valueOf(intValue2);
        int i = A0T.topMargin;
        int intValue3 = valueOf.intValue();
        if (i != intValue3 || A0T.bottomMargin != valueOf2.intValue()) {
            A0T.topMargin = intValue3;
            A0T.bottomMargin = valueOf2.intValue();
            view.setLayoutParams(A0T);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0D.A00();
    }

    public CallDetailsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CallDetailsLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
