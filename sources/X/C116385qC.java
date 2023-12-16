package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;

/* renamed from: X.5qC  reason: invalid class name and case insensitive filesystem */
public class C116385qC implements C185528tp {
    public final /* synthetic */ AnonymousClass4o3 A00;

    public C116385qC(AnonymousClass4o3 r1) {
        this.A00 = r1;
    }

    public void A00() {
        AnonymousClass4o3 r4 = this.A00;
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = r4.A09;
        C86664Kz.A1R(conversationRowImage$RowImageView);
        C86624Kv.A0l(r4.getResources(), conversationRowImage$RowImageView, R.color.f5nameremoved);
        C107335b8.A0C(r4.getContext(), conversationRowImage$RowImageView, R.drawable.camera, R.color.f5nameremoved);
        r4.A0H = false;
    }

    public int BD5() {
        return AnonymousClass5Y3.A01(this.A00.A09.A09);
    }

    public void BTR() {
        this.A00.A27();
    }

    public void Bof(Bitmap bitmap, View view, C624134x r32) {
        TransitionDrawable transitionDrawable;
        TransitionDrawable transitionDrawable2;
        C624134x r2 = r32;
        C116385qC r1 = this;
        Bitmap bitmap2 = bitmap;
        if (r1 instanceof AnonymousClass4nE) {
            r1 = (AnonymousClass4nE) r1;
            if (bitmap != null && (r2 instanceof C30471mV)) {
                r1.A01((C30471mV) r2);
                AnonymousClass683 r12 = (AnonymousClass683) r1;
                if (r12.A01 != 0) {
                    AnonymousClass4o3 r14 = (AnonymousClass4o3) r12.A00;
                    FrameLayout frameLayout = r14.A04;
                    if (frameLayout != null && frameLayout.getVisibility() != 0) {
                        AnonymousClass5UY r0 = r14.A0E;
                        AnonymousClass5UY r19 = r0;
                        if (r0 != null) {
                            ConversationRowImage$RowImageView conversationRowImage$RowImageView = r14.A09;
                            Resources resources = r14.getResources();
                            C162457s7.A0J(conversationRowImage$RowImageView, 0);
                            C162457s7.A0J(resources, 2);
                            Drawable drawable = conversationRowImage$RowImageView.getDrawable();
                            if (drawable == null) {
                                transitionDrawable2 = null;
                            } else {
                                transitionDrawable2 = new TransitionDrawable(new Drawable[]{drawable, new BitmapDrawable(resources, bitmap2)});
                                transitionDrawable2.setCrossFadeEnabled(false);
                            }
                            ConstraintLayout constraintLayout = r14.A06;
                            AnonymousClass5UY r28 = r14.A0C;
                            View A04 = r28.A04();
                            AnonymousClass5UY r27 = r14.A0F;
                            View A042 = r27.A04();
                            C162457s7.A0J(constraintLayout, 0);
                            int A05 = C18300x5.A05(frameLayout, A04, 1);
                            C162457s7.A0J(A042, 3);
                            AnimatorSet A0O = C86664Kz.A0O();
                            AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
                            Animator[] animatorArr = new Animator[3];
                            Property property = View.SCALE_X;
                            C162457s7.A0F(property);
                            float[] A1b = C86654Ky.A1b(0.5f);
                            A1b[1] = 1.0f;
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(constraintLayout, property, A1b);
                            ofFloat.setInterpolator(accelerateInterpolator);
                            ofFloat.setDuration(250);
                            animatorArr[0] = ofFloat;
                            Property property2 = View.SCALE_Y;
                            C162457s7.A0F(property2);
                            float[] A1b2 = C86654Ky.A1b(0.5f);
                            A1b2[1] = 1.0f;
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(constraintLayout, property2, A1b2);
                            ofFloat2.setInterpolator(accelerateInterpolator);
                            ofFloat2.setDuration(250);
                            animatorArr[1] = ofFloat2;
                            Property property3 = View.ALPHA;
                            C162457s7.A0F(property3);
                            float[] A1b3 = C86654Ky.A1b(0.0f);
                            A1b3[1] = 1.0f;
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(constraintLayout, property3, A1b3);
                            ofFloat3.setInterpolator(accelerateInterpolator);
                            ofFloat3.setDuration(250);
                            A0O.playTogether(AnonymousClass0x9.A19(ofFloat3, animatorArr, A05));
                            A0O.addListener(new AnonymousClass67M(frameLayout, A042, A04, constraintLayout, 1));
                            r14.A01 = A0O;
                            View view2 = r14.A02;
                            View A043 = r19.A04();
                            AnimatorSet animatorSet = r14.A01;
                            AnimatorSet animatorSet2 = animatorSet;
                            C626936e.A06(animatorSet2);
                            C162457s7.A0J(view2, 0);
                            C162457s7.A0J(A043, 1);
                            C162457s7.A0J(animatorSet, 3);
                            AnimatorSet A0O2 = C86664Kz.A0O();
                            AccelerateInterpolator accelerateInterpolator2 = new AccelerateInterpolator();
                            Animator[] animatorArr2 = new Animator[6];
                            Property property4 = View.SCALE_X;
                            C162457s7.A0F(property4);
                            float[] A1b4 = C86654Ky.A1b(1.0f);
                            A1b4[1] = 0.2f;
                            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, property4, A1b4);
                            ofFloat4.setInterpolator(accelerateInterpolator2);
                            ofFloat4.setDuration(250);
                            animatorArr2[0] = ofFloat4;
                            Property property5 = View.SCALE_Y;
                            C162457s7.A0F(property5);
                            float[] A1b5 = C86654Ky.A1b(1.0f);
                            A1b5[1] = 0.2f;
                            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, property5, A1b5);
                            ofFloat5.setInterpolator(accelerateInterpolator2);
                            ofFloat5.setDuration(250);
                            animatorArr2[1] = ofFloat5;
                            Property property6 = View.SCALE_X;
                            C162457s7.A0F(property6);
                            float[] A1b6 = C86654Ky.A1b(1.0f);
                            A1b6[1] = 0.5f;
                            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(A043, property6, A1b6);
                            ofFloat6.setInterpolator(accelerateInterpolator2);
                            ofFloat6.setDuration(250);
                            animatorArr2[2] = ofFloat6;
                            float[] A1b7 = C86654Ky.A1b(1.0f);
                            A1b7[1] = 0.5f;
                            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(A043, property5, A1b7);
                            ofFloat7.setInterpolator(accelerateInterpolator2);
                            ofFloat7.setDuration(250);
                            animatorArr2[3] = ofFloat7;
                            float[] A1b8 = C86654Ky.A1b(1.0f);
                            A1b8[1] = 0.0f;
                            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(view2, property3, A1b8);
                            ofFloat8.setInterpolator(accelerateInterpolator2);
                            ofFloat8.setDuration(250);
                            animatorArr2[4] = ofFloat8;
                            float[] A1b9 = C86654Ky.A1b(1.0f);
                            A1b9[1] = 0.0f;
                            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(A043, property3, A1b9);
                            ofFloat9.setInterpolator(accelerateInterpolator2);
                            ofFloat9.setDuration(250);
                            A0O2.playTogether(AnonymousClass0x9.A19(ofFloat9, animatorArr2, 5));
                            A0O2.addListener(new AnonymousClass67J(animatorSet2, transitionDrawable2, frameLayout, view2, A043, 0));
                            r14.A00 = A0O2;
                            r14.setImageDrawable(bitmap2, transitionDrawable2);
                            r14.A00.start();
                            r14.A1L();
                            C109665ez r13 = r14.A08;
                            frameLayout.setOnClickListener(r13);
                            r28.A07(r13);
                            r27.A07(r13);
                            conversationRowImage$RowImageView.setOnClickListener(r14.A0B);
                            C18300x5.A13(r14.getContext(), conversationRowImage$RowImageView, R.string.f11nameremoved);
                            return;
                        }
                        return;
                    }
                    return;
                }
                AnonymousClass4o3 r6 = (AnonymousClass4o3) r12.A00;
                AnonymousClass5UY r02 = r6.A0E;
                AnonymousClass5UY r192 = r02;
                if (r02 != null) {
                    ConversationRowImage$RowImageView conversationRowImage$RowImageView2 = r6.A09;
                    Resources resources2 = r6.getResources();
                    C162457s7.A0J(conversationRowImage$RowImageView2, 0);
                    C162457s7.A0J(resources2, 2);
                    Drawable drawable2 = conversationRowImage$RowImageView2.getDrawable();
                    if (drawable2 == null) {
                        transitionDrawable = null;
                    } else {
                        transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, new BitmapDrawable(resources2, bitmap2)});
                        transitionDrawable.setCrossFadeEnabled(false);
                    }
                    ConstraintLayout constraintLayout2 = r6.A06;
                    FrameLayout frameLayout2 = r6.A04;
                    C626936e.A04(frameLayout2);
                    View A044 = r6.A0F.A04();
                    View A045 = r6.A0C.A04();
                    WaTextView waTextView = r6.A08;
                    C162457s7.A0J(constraintLayout2, 0);
                    int A052 = C18300x5.A05(frameLayout2, A044, 1);
                    C18270x1.A11(A045, 3, waTextView);
                    AnimatorSet A0O3 = C86664Kz.A0O();
                    AccelerateInterpolator accelerateInterpolator3 = new AccelerateInterpolator();
                    Animator[] animatorArr3 = new Animator[3];
                    Property property7 = View.SCALE_X;
                    C162457s7.A0F(property7);
                    float[] A1b10 = C86654Ky.A1b(0.5f);
                    A1b10[1] = 1.0f;
                    ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(constraintLayout2, property7, A1b10);
                    ofFloat10.setInterpolator(accelerateInterpolator3);
                    ofFloat10.setDuration(250);
                    animatorArr3[0] = ofFloat10;
                    Property property8 = View.SCALE_Y;
                    C162457s7.A0F(property8);
                    float[] A1b11 = C86654Ky.A1b(0.5f);
                    A1b11[1] = 1.0f;
                    ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(constraintLayout2, property8, A1b11);
                    ofFloat11.setInterpolator(accelerateInterpolator3);
                    ofFloat11.setDuration(250);
                    animatorArr3[1] = ofFloat11;
                    Property property9 = View.ALPHA;
                    C162457s7.A0F(property9);
                    float[] A1b12 = C86654Ky.A1b(0.0f);
                    A1b12[1] = 1.0f;
                    ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(constraintLayout2, property9, A1b12);
                    ofFloat12.setInterpolator(accelerateInterpolator3);
                    ofFloat12.setDuration(250);
                    A0O3.playTogether(AnonymousClass0x9.A19(ofFloat12, animatorArr3, A052));
                    A0O3.addListener(new AnonymousClass67J(frameLayout2, A044, constraintLayout2, A045, waTextView, A052));
                    View view3 = r6.A02;
                    View A046 = r192.A04();
                    char A1Y = AnonymousClass0x2.A1Y(view3, A046);
                    AnimatorSet A0O4 = C86664Kz.A0O();
                    AccelerateInterpolator accelerateInterpolator4 = new AccelerateInterpolator();
                    Animator[] animatorArr4 = new Animator[6];
                    Property property10 = View.SCALE_X;
                    C162457s7.A0F(property10);
                    float[] A1b13 = C86654Ky.A1b(1.0f);
                    A1b13[1] = 0.2f;
                    ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(view3, property10, A1b13);
                    ofFloat13.setInterpolator(accelerateInterpolator4);
                    ofFloat13.setDuration(250);
                    animatorArr4[0] = ofFloat13;
                    float[] A1b14 = C86654Ky.A1b(1.0f);
                    A1b14[1] = 0.5f;
                    ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(A046, property10, A1b14);
                    ofFloat14.setInterpolator(accelerateInterpolator4);
                    ofFloat14.setDuration(250);
                    animatorArr4[A1Y] = ofFloat14;
                    Property property11 = View.SCALE_Y;
                    C162457s7.A0F(property11);
                    float[] A1b15 = C86654Ky.A1b(1.0f);
                    A1b15[1] = 0.2f;
                    ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(view3, property11, A1b15);
                    ofFloat15.setInterpolator(accelerateInterpolator4);
                    ofFloat15.setDuration(250);
                    animatorArr4[2] = ofFloat15;
                    float[] A1b16 = C86654Ky.A1b(1.0f);
                    A1b16[1] = 0.5f;
                    ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(A046, property11, A1b16);
                    ofFloat16.setInterpolator(accelerateInterpolator4);
                    ofFloat16.setDuration(250);
                    animatorArr4[3] = ofFloat16;
                    Property property12 = View.ALPHA;
                    C162457s7.A0F(property12);
                    float[] A1b17 = C86654Ky.A1b(1.0f);
                    A1b17[1] = 0.0f;
                    ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(view3, property12, A1b17);
                    ofFloat17.setInterpolator(accelerateInterpolator4);
                    ofFloat17.setDuration(250);
                    animatorArr4[4] = ofFloat17;
                    float[] A1b18 = C86654Ky.A1b(1.0f);
                    A1b18[1] = 0.0f;
                    ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(A046, property12, A1b18);
                    ofFloat18.setInterpolator(accelerateInterpolator4);
                    ofFloat18.setDuration(250);
                    A0O4.playTogether(AnonymousClass0x9.A19(ofFloat18, animatorArr4, 5));
                    A0O4.addListener(new AnonymousClass67M(A0O3, transitionDrawable, view3, A046, 0));
                    r6.setImageDrawable(bitmap2, transitionDrawable);
                    A0O4.start();
                    return;
                }
                return;
            }
        } else if (bitmap != null && (r2 instanceof C30471mV)) {
            r1.A01((C30471mV) r2);
            r1.A00.A09.setImageBitmap(bitmap2);
            return;
        }
        r1.A00();
    }

    public void Bp1(View view) {
        AnonymousClass4o3 r1 = this.A00;
        r1.A0H = false;
        r1.A09.setBackgroundColor(-7829368);
    }

    public void A01(C30471mV r6) {
        int i;
        ImageView.ScaleType scaleType;
        AnonymousClass33C A002 = C30471mV.A00(r6);
        int i2 = A002.A08;
        if (i2 != 0 && (i = A002.A06) != 0) {
            AnonymousClass4o3 r0 = this.A00;
            boolean z = r0 instanceof AnonymousClass4o2;
            ConversationRowImage$RowImageView conversationRowImage$RowImageView = r0.A09;
            conversationRowImage$RowImageView.A04(i2, i);
            if (r0.A0W || z) {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            } else {
                scaleType = ImageView.ScaleType.MATRIX;
            }
            conversationRowImage$RowImageView.setScaleType(scaleType);
        }
    }
}
