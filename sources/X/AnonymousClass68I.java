package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.status.playback.MessageReplyActivity;
import java.util.ArrayList;

/* renamed from: X.68I  reason: invalid class name */
public class AnonymousClass68I extends C166677z5 {
    public Object A00;
    public Object A01;
    public final int A02;

    public static Animation A00(boolean z, boolean z2) {
        AlphaAnimation A0C;
        ScaleAnimation scaleAnimation;
        AnimationSet animationSet = new AnimationSet(true);
        if (z2) {
            A0C = AnonymousClass4L0.A0C(0.0f, 1.0f);
        } else {
            A0C = AnonymousClass4L0.A0C(1.0f, 0.0f);
        }
        A0C.setDuration(100);
        animationSet.addAnimation(A0C);
        if (z2) {
            scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 1.0f, 1.0f, 1, C86634Kw.A00(z), 1, 0.5f);
        } else {
            scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 1.0f, 1, C86634Kw.A00(z ? 1 : 0), 1, 0.5f);
        }
        scaleAnimation.setDuration(100);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setDuration(100);
        return animationSet;
    }

    public AnonymousClass68I(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void afterTextChanged(Editable editable) {
        C103645Nu r1;
        GridLayout gridLayout;
        Editable editable2 = editable;
        switch (this.A02) {
            case 0:
                C162457s7.A0J(editable2, 0);
                AnonymousClass5XZ r3 = (AnonymousClass5XZ) this.A01;
                C107345b9.A07(r3.A02, ((TextView) this.A00).getPaint(), editable2, r3.A09);
                return;
            case 1:
                ((View) this.A01).setEnabled(!C107575bX.A0F(editable2.toString()));
                return;
            case 2:
                AnonymousClass4vO r32 = (AnonymousClass4vO) this.A00;
                C107345b9.A07(r32.getContext(), r32.A01.getPaint(), editable2, r32.A00);
                r32.A01.getWidth();
                r32.A01.getPaint();
                ((C114835ng) this.A01).A01(editable2);
                return;
            case 3:
                String obj = editable2.toString();
                boolean isEmpty = TextUtils.isEmpty(obj);
                MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
                C621033m r12 = messageReplyActivity.A0I;
                C95814uZ A012 = AnonymousClass3ZH.A01((AnonymousClass3ZH) this.A01);
                if (!isEmpty) {
                    r12.A0F(A012, 0);
                } else {
                    r12.A0D(A012);
                }
                AnonymousClass5Y0 r4 = messageReplyActivity.A0C;
                C107635bd.A0F(messageReplyActivity, editable2, messageReplyActivity.A0t.getPaint(), messageReplyActivity.A08, r4, messageReplyActivity.A0y, R.color.f5nameremoved, messageReplyActivity.A1R);
                boolean A0F = C107575bX.A0F(obj);
                messageReplyActivity.A0Y.A0G(A0F);
                if (!A0F) {
                    messageReplyActivity.A77();
                } else if (messageReplyActivity.A1V) {
                    if (AnonymousClass4SG.A43(messageReplyActivity)) {
                        if (messageReplyActivity.A14 == AnonymousClass59M.EMOJI) {
                            gridLayout = messageReplyActivity.A0A;
                        } else {
                            gridLayout = messageReplyActivity.A09;
                        }
                        AnimatorSet A0O = C86664Kz.A0O();
                        ArrayList A0s = AnonymousClass001.A0s();
                        if (gridLayout != null) {
                            for (int i = 0; i < gridLayout.getChildCount(); i++) {
                                ObjectAnimator A0A = C86634Kw.A0A(gridLayout.getChildAt(i), 1.0f);
                                A0A.setDuration(150);
                                A0A.setInterpolator(MessageReplyActivity.A1e);
                                A0s.add(A0A);
                            }
                        }
                        View view = messageReplyActivity.A06;
                        if (view != null) {
                            ObjectAnimator A0A2 = C86634Kw.A0A(view, 1.0f);
                            A0A2.setDuration(150);
                            A0A2.setInterpolator(MessageReplyActivity.A1e);
                            A0s.add(A0A2);
                        }
                        A0O.playTogether(A0s);
                        A0O.start();
                    } else {
                        messageReplyActivity.A08.setVisibility(0);
                    }
                }
                if (messageReplyActivity.A1U != A0F && messageReplyActivity.A1K.BFD()) {
                    messageReplyActivity.A1U = A0F;
                    ImageButton imageButton = messageReplyActivity.A0D;
                    boolean A04 = C620733j.A04(messageReplyActivity.A00);
                    if (A0F) {
                        imageButton.startAnimation(AnonymousClass31N.A00(A04, true, false));
                        messageReplyActivity.A0B.startAnimation(A00(C620733j.A04(messageReplyActivity.A00), true));
                        messageReplyActivity.A0B.setVisibility(0);
                    } else {
                        imageButton.startAnimation(AnonymousClass31N.A00(A04, false, false));
                        messageReplyActivity.A0B.startAnimation(A00(C620733j.A04(messageReplyActivity.A00), false));
                        messageReplyActivity.A0B.setVisibility(8);
                    }
                }
                if (messageReplyActivity.A1B.A01() && (r1 = messageReplyActivity.A1D) != null && messageReplyActivity.A0g.A02) {
                    r1.A00(obj);
                    return;
                }
                return;
            default:
                super.afterTextChanged(editable2);
                return;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (4 - this.A02 != 0) {
            super.onTextChanged(charSequence, i, i2, i3);
        } else {
            ((View) this.A01).setEnabled(AnonymousClass001.A1W(charSequence.length()));
        }
    }
}
