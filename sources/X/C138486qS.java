package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;

/* renamed from: X.6qS  reason: invalid class name and case insensitive filesystem */
public abstract class C138486qS extends AnonymousClass6Fm {
    public AnonymousClass1VX A00;
    public C179798jj A01;
    public CallInfo A02;
    public String A03;
    public boolean A04;
    public boolean A05;

    public void A01() {
        Log.i("voip/VoipCallAnswerCallView/hide");
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(125);
        alphaAnimation.setStartOffset((long) 0);
        alphaAnimation.setAnimationListener(new C188998zp(this, 1));
        startAnimation(alphaAnimation);
    }

    public void A02(CallInfo callInfo, String str, boolean z) {
        this.A02 = callInfo;
        this.A03 = str;
        this.A05 = callInfo.isPeerRequestingUpgrade();
        this.A04 = "com.whatsapp.intent.action.SHOW_INCOMING_PENDING_CALL_ON_LOCK_SCREEN".equals(this.A03);
    }

    public void setAnswerCallViewListener(C179798jj r1) {
        this.A01 = r1;
    }

    public C138486qS(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C138486qS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
